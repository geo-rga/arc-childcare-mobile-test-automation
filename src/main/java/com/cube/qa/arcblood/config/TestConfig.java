package com.cube.qa.arcblood.config;
// TODO: The package names and files paths should ideally be universal so we can easily set up other projects. e.g. "arcblood" is specific to this context
public class TestConfig {
    private String platform;
    private String buildPath;
    private String udid;
    private boolean fullReset;
    private String env;
    private boolean isSimulator;
    private String deviceName;
    private String platformVersion;

    public TestConfig(String platform, String buildPath, String udid, boolean fullReset, String env, boolean isSimulator, String deviceName, String platformVersion) {
        this.platform = platform;
        this.buildPath = buildPath;
        this.udid = udid;
        this.fullReset = fullReset;
        this.env = env;
        this.isSimulator = isSimulator;
        this.deviceName = deviceName;
        this.platformVersion = platformVersion;
    }

    public String getPlatform() { return platform; }
    public String getBuildPath() { return buildPath; }
    public String getUdid() { return udid; }
    public boolean isFullReset() { return fullReset; }
    public String getEnv() { return env; }
    public boolean isSimulator() { return isSimulator; }
    public String getDeviceName() { return deviceName; }
    public String getPlatformVersion() { return platformVersion; }
}
