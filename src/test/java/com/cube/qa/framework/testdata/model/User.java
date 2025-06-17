package com.cube.qa.framework.testdata.model;

public class User {
    public String username;
    public String password;
    public boolean hasDonations;
    public Eligibility eligibility = new Eligibility();
    public HealthCharts healthCharts;
}
