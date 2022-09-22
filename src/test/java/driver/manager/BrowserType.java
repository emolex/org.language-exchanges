package driver.manager;

public enum BrowserType {

    CHROME("chrome"),
    FIREFOX("firefox"),
    IE("ie"),
    EDGE("edge");


    private final String browser;

    BrowserType(String browser) {
        this.browser = browser;
    }
}
