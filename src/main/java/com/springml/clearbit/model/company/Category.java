
package com.springml.clearbit.model.company;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Category {

    private String sector;
    private String industryGroup;
    private String industry;
    private String subIndustry;

    /**
     * 
     * @return
     *     The sector
     */
    public String getSector() {
        return sector;
    }

    /**
     * 
     * @param sector
     *     The sector
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     * 
     * @return
     *     The industryGroup
     */
    public String getIndustryGroup() {
        return industryGroup;
    }

    /**
     * 
     * @param industryGroup
     *     The industryGroup
     */
    public void setIndustryGroup(String industryGroup) {
        this.industryGroup = industryGroup;
    }

    /**
     * 
     * @return
     *     The industry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 
     * @param industry
     *     The industry
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 
     * @return
     *     The subIndustry
     */
    public String getSubIndustry() {
        return subIndustry;
    }

    /**
     * 
     * @param subIndustry
     *     The subIndustry
     */
    public void setSubIndustry(String subIndustry) {
        this.subIndustry = subIndustry;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
