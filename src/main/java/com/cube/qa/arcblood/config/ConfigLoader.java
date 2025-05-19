package com.cube.qa.arcblood.config;

public class ConfigLoader {
    public static TestConfig load(String platformFromXml, String buildFromXml, String udidFromXml, String fullResetFromXml, String envFromXml) {
        String platform = System.getProperty("platform", platformFromXml);
        String buildPath = System.getProperty("build", buildFromXml);
        String udid = System.getProperty("udid", udidFromXml);
        boolean fullReset = Boolean.parseBoolean(System.getProperty("fullReset", fullResetFromXml));
        String env = System.getProperty("env", envFromXml);

        return new TestConfig(platform, buildPath, udid, fullReset, env);
    }
}