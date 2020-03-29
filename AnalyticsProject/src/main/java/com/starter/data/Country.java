package com.starter.data;

/**
 * Created by Shivani Shinde on 28-03-2020.
 */
public class Country {
    private String country;
    private String newConfirmed;
    private String totalConfirmed;
    private String newDeaths;
    private String totalDeaths;
    private String newRecovery;
    private String totalRecovery;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNewConfirmed() {
        return newConfirmed;
    }

    public void setNewConfirmed(String newConfirmed) {
        this.newConfirmed = newConfirmed;
    }

    public String getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(String totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public String getNewRecovery() {
        return newRecovery;
    }

    public void setNewRecovery(String newRecovery) {
        this.newRecovery = newRecovery;
    }

    public String getTotalRecovery() {
        return totalRecovery;
    }

    public void setTotalRecovery(String totalRecovery) {
        this.totalRecovery = totalRecovery;
    }
}
