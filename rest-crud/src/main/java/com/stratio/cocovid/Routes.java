package com.stratio.cocovid;

import com.stratio.cocovid.pojo.DefaultResponse;
import com.stratio.cocovid.pojo.apprisk.AppRisk;
import com.stratio.cocovid.pojo.apprisk.AppriskResponse;
import com.stratio.cocovid.pojo.coordinates.Coordinates;
import com.stratio.cocovid.pojo.coordinates.CoordinatesResponse;
import com.stratio.cocovid.pojo.deviceId.DeviceId;
import com.stratio.cocovid.pojo.registerForward.RegisterForward;
import com.stratio.cocovid.pojo.registerInstitution.RegisterInstitution;
import com.stratio.cocovid.pojo.registermedical.RegisterMedical;
import com.stratio.cocovid.pojo.testresultManualForward.ManualTestResult;
import com.stratio.cocovid.pojo.testresultmendix.TestResultMendix;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.sql.DataSource;

@ApplicationScoped
public class Routes extends RouteBuilder {

    @Inject
    private Configuration config;

    @Inject
    DataSource postgres;

    DefaultResponse defaultResponse = new DefaultResponse(0);

    @Override
    public void configure() throws Exception {

        getContext().getRegistry().bind("postgres", postgres);

        restConfiguration()
            .component("netty-http")
            .host("0.0.0.0")
            .port(config.httpPort)
            .contextPath("/")
            .bindingMode(RestBindingMode.json)
            .enableCORS(true)
        ;


        onException(Exception.class)
            .handled(true)
            .setHeader(Exchange.HTTP_RESPONSE_CODE).constant(400)
            .setBody().simple("[\"Invalid Request\"]")
            .log(LoggingLevel.ERROR,"${exception.message}")
        ;

        onException(org.postgresql.util.PSQLException.class)
            .continued(true)
            .log(LoggingLevel.ERROR,"${exception.message}")
        ;

        rest("/registerforward")
            .post().type(RegisterForward.class).route()
                .setHeader("uId").simple("${body.getuId}")

                .transform().constant("INSERT INTO public.\"user\"(uid) VALUES (:?uId)")
                .to("jdbc:postgres?useHeadersAsParameters=true")

                .setBody().constant(defaultResponse)
        ;

        rest("/apprisk")
            .post().type(AppRisk.class).route()
                .log("${body}")
                .setBody().constant(new AppriskResponse(true))
        ;

        rest("/coordinates")
            .post().type(Coordinates.class).route()
                .log("${body}")
                .setBody().constant(new CoordinatesResponse(true))
        ;


        rest("/deviceid")
                .post().type(DeviceId.class).route()
                .setHeader("uId").simple("${body.getuId}")
                .setHeader("dId").simple("${body.getdId}")

                .transform().constant("INSERT INTO user_device(uid, did) VALUES (:?uId, :?dId)")
                .to("jdbc:postgres?useHeadersAsParameters=true")

                .transform().constant(defaultResponse)
        ;

        rest("/testresultmanualforward")
            .post().type(ManualTestResult.class).route()
                .setHeader("uId").simple("${body.getuId}")
                .setHeader("infected").simple("${body.getInfected}")

                .transform().constant("INSERT INTO test_result(uid, infected) VALUES (:?uId, :?infected)")
                .to("jdbc:postgres?useHeadersAsParameters=true")

                .transform().constant(defaultResponse)
            .endRest()
        ;

        rest("/testresultmendix")
            .post().type(TestResultMendix.class).route()
                .setHeader("uId").simple("${body.getuId}")
                .setHeader("mId").simple("${body.getmId}")
                .setHeader("infected").simple("${body.getInfected}")

                .transform().constant("INSERT INTO test_result(uid, mid, infected) VALUES (:?uId, :?mId, :?infected)")
                .to("jdbc:postgres?useHeadersAsParameters=true")

                .transform().constant(defaultResponse)
        ;

        rest("/registerInstitution")
            .post().type(RegisterInstitution.class).route()
                .setHeader("iId").simple("${body.getiId}")
                .setHeader("longitude").simple("${body.getLongitude}")
                .setHeader("latitude").simple("${body.getLatitude}")

                .log("${headers}")

                .transform().constant("INSERT INTO institution (\"iId\",\"iGPS\") VALUES(:?iId, ST_SetSRID(ST_MakePoint(:?longitude, :?latitude), 4326));")

                .to("jdbc:postgres?useHeadersAsParameters=true")

                .transform().constant(defaultResponse)
        ;

        rest("/registermedical")
            .post().type(RegisterMedical.class).route()
                .setHeader("iId").simple("${body.getiId}")
                .setHeader("mId").simple("${body.getmId}")

                .transform().constant("INSERT INTO medical(\"iId\", \"mId\") VALUES (:?iId, :?mId)")

                .to("jdbc:postgres?useHeadersAsParameters=true")

                .transform().constant(defaultResponse)
        ;

    }
}
