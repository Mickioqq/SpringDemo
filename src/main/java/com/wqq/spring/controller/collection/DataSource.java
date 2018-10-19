package com.wqq.spring.controller.collection;

import java.util.Properties;

public class DataSource {
    private Properties properties;

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
