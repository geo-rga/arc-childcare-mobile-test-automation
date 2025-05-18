package com.cube.qa.arcblood.config;
// TODO: The package names and files paths should ideally be universal so we can easily set up other projects. e.g. "arcblood" is specific to this context
public class TestConfig {
    private String platform;
    private String buildPath;
    private String udid;
    private boolean fullReset;

    public TestConfig(String platform, String buildPath, String udid, boolean fullReset) {
        this.platform = platform;
        this.buildPath = buildPath;
        this.udid = udid;
        this.fullReset = fullReset;
    }

    public String getPlatform() { return platform; }
    public String getBuildPath() { return buildPath; }
    public String getUdid() { return udid; }
    public boolean isFullReset() { return fullReset; }
}
