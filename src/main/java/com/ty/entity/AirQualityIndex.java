package com.ty.entity;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author YangJinChuan
 * @since 2020-04-01
 */
public class AirQualityIndex  {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer districtId;
    private Date monitorTime;
    private Integer pm10;
    private Integer pm25;
    private String monitoringStation;
    private Date lastModifyTime;
    private District district;

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public Integer getPm10() {
        return pm10;
    }

    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    public Integer getPm25() {
        return pm25;
    }

    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    public String getMonitoringStation() {
        return monitoringStation;
    }

    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }


    @Override
    public String toString() {
        return "AirQualityIndex{" +
        ", id=" + id +
        ", districtId=" + districtId +
        ", monitorTime=" + monitorTime +
        ", pm10=" + pm10 +
        ", pm25=" + pm25 +
        ", monitoringStation=" + monitoringStation +
        ", lastModifyTime=" + lastModifyTime +
        "}";
    }
}
