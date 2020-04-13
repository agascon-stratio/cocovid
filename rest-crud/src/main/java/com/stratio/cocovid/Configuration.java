package com.stratio.cocovid;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "com.stratio.config")
public class Configuration {
    public Integer httpPort;
}
