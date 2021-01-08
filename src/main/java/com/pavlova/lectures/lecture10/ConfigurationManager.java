package com.pavlova.lectures.lecture10;

import lombok.ToString;

@ToString
public final class ConfigurationManager {
    private static final String DB_URL = "db_url";
    private static final String DB_PORT = "db_port";
    private static final ConfigurationManager INSTANCE = new ConfigurationManager();

    private ConfigurationManager() {
    }

    public ConfigurationManager getINSTANCE() {
        return INSTANCE;
    }

    public String getDbPOrt() {
        return getValueOrDefault(DB_PORT, "3306");
    }

    public String getUrl() {
        return getValueOrDefault(DB_URL, "localhost");
    }

    private String getValueOrDefault(String value, String defaultValue) {
        return System.getenv(value) == null ? defaultValue : System.getenv(value);
    }

}
