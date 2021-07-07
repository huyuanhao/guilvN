package com.learnium.RNDeviceInfo.netInfo;

import com.google.android.gms.actions.SearchIntents;
import com.google.gson.annotations.SerializedName;
import com.jinhui365.util.util.gson.GsonUtil;

public class NetInfo {
    @SerializedName("regionName")
    public String area;

    /* renamed from: as */
    public String f1903as;
    public String city;
    public String country;
    public String countryCode;
    @SerializedName(SearchIntents.EXTRA_QUERY)
    public String ipAddress;
    public String isp;
    public String lat;
    public String lon;

    /* renamed from: org  reason: collision with root package name */
    public String f24201org;
    public String region;
    public String status;
    public String timezone;
    public String zip;

    public static NetInfo getNetInfo(String str) {
        return (NetInfo) GsonUtil.jsonToBean(str, NetInfo.class);
    }

    public String getArea() {
        return this.area;
    }

    public String getAs() {
        return this.f1903as;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public String getIsp() {
        return this.isp;
    }

    public String getLat() {
        return this.lat;
    }

    public String getLon() {
        return this.lon;
    }

    public String getOrg() {
        return this.f24201org;
    }

    public String getRegion() {
        return this.region;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public String getZip() {
        return this.zip;
    }

    public void setArea(String str) {
        this.area = str;
    }

    public void setAs(String str) {
        this.f1903as = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public void setIsp(String str) {
        this.isp = str;
    }

    public void setLat(String str) {
        this.lat = str;
    }

    public void setLon(String str) {
        this.lon = str;
    }

    public void setOrg(String str) {
        this.f24201org = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setZip(String str) {
        this.zip = str;
    }
}
