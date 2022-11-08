package config;

import java.util.Properties;

public class ConfigurationProperties {

    //StatyStatic field to keeping properties
    private static Properties properties;

    //Private constructor to keeping only one instance ConfigurationProperties class
    //Singleton Pattern
    private ConfigurationProperties() {
    }

    //Method using to loading properties object to static Properties object type available for all threads
    public static void setProperties(Properties properties) {
        ConfigurationProperties.properties = properties;
    }

    //Method return all loaded properties' data if they are not null
    public static Properties getProperties() {
        if (properties == null) {
            throw new IllegalStateException("Please set properties using setProperties() before calling getProperties()");
        }
        return properties;
    }
}
