package config;

import driver.manager.BrowserType;

public class AppProperties {
    //Method return app.url property initializing getProperty on object returned by getProperties from
    // ConfigurationProperties class
    public static String getAllUrl() {
        return ConfigurationProperties.getProperties().getProperty("app.url");
    }

    public static BrowserType getBrowserType() {
        return BrowserType.valueOf(ConfigurationProperties.getProperties().getProperty("local.browser"));
    }

}
