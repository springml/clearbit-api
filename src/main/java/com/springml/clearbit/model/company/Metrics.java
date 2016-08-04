
package com.springml.clearbit.model.company;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Metrics {

    private long alexaUsRank;
    private long alexaGlobalRank;
    private long employees;
    private String employeesRange;
    private long marketCap;
    private long raised;
    private long annualRevenue;

    /**
     * 
     * @return
     *     The alexaUsRank
     */
    public long getAlexaUsRank() {
        return alexaUsRank;
    }

    /**
     * 
     * @param alexaUsRank
     *     The alexaUsRank
     */
    public void setAlexaUsRank(long alexaUsRank) {
        this.alexaUsRank = alexaUsRank;
    }

    /**
     * 
     * @return
     *     The alexaGlobalRank
     */
    public long getAlexaGlobalRank() {
        return alexaGlobalRank;
    }

    /**
     * 
     * @param alexaGlobalRank
     *     The alexaGlobalRank
     */
    public void setAlexaGlobalRank(long alexaGlobalRank) {
        this.alexaGlobalRank = alexaGlobalRank;
    }

    /**
     * 
     * @return
     *     The employees
     */
    public long getEmployees() {
        return employees;
    }

    /**
     * 
     * @param employees
     *     The employees
     */
    public void setEmployees(long employees) {
        this.employees = employees;
    }

    /**
     * 
     * @return
     *     The employeesRange
     */
    public String getEmployeesRange() {
        return employeesRange;
    }

    /**
     * 
     * @param employeesRange
     *     The employeesRange
     */
    public void setEmployeesRange(String employeesRange) {
        this.employeesRange = employeesRange;
    }

    /**
     * 
     * @return
     *     The marketCap
     */
    public long getMarketCap() {
        return marketCap;
    }

    /**
     * 
     * @param marketCap
     *     The marketCap
     */
    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    /**
     * 
     * @return
     *     The raised
     */
    public long getRaised() {
        return raised;
    }

    /**
     * 
     * @param raised
     *     The raised
     */
    public void setRaised(long raised) {
        this.raised = raised;
    }

    /**
     * 
     * @return
     *     The annualRevenue
     */
    public long getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * 
     * @param annualRevenue
     *     The annualRevenue
     */
    public void setAnnualRevenue(long annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
