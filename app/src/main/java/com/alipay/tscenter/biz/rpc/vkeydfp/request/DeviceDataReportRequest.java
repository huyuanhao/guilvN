package com.alipay.tscenter.biz.rpc.vkeydfp.request;

import java.io.Serializable;
import java.util.Map;

public class DeviceDataReportRequest implements Serializable {
    public String apdid;
    public Map<String, String> dataMap;
    public String lastTime;

    /* renamed from: os */
    public String f943os;
    public String priApdid;
    public String pubApdid;
    public String token;
    public String umidToken;
    public String version;
}