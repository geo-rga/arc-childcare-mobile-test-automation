package com.cube.qa.arcblood.config;

public class ConfigLoader {
    public static TestConfig load(String platformFromXml, String buildFromXml, String udidFromXml,
                                  String fullResetFromXml, String envFromXml, String isSimulatorFromXml, String deviceNameFromXml, String platformVersionFromXml) {

        String platform = System.getProperty("platform", platformFromXml);
        String buildPath = System.getProperty("build", buildFromXml);
        String udid = System.getProperty("udid", udidFromXml);
        boolean fullReset = Boolean.parseBoolean(System.getProperty("fullReset", fullResetFromXml));
        String env = System.getProperty("env", envFromXml);
        boolean isSimulator = Boolean.parseBoolean(System.getProperty("isSimulator", isSimulatorFromXml));
        String deviceName = System.getProperty("deviceName", deviceNameFromXml);
        String platformVersion = System.getProperty("platformVersion", platformVersionFromXml);

        return new TestConfig(platform, buildPath, udid, fullReset, env, isSimulator, deviceName, platformVersion);
    }

}