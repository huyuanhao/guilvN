package com.p118pd.sdk;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.o0o0O0O0  reason: case insensitive filesystem */
public class C7583o0o0O0O0 {
    public static DataReportRequest OooO00o(C7602o0o0Oo00 o0o0oo00) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (o0o0oo00 == null) {
            return null;
        }
        dataReportRequest.f941os = o0o0oo00.OooO00o;
        dataReportRequest.rpcVersion = o0o0oo00.OooO;
        dataReportRequest.bizType = "1";
        HashMap hashMap = new HashMap();
        dataReportRequest.bizData = hashMap;
        hashMap.put("apdid", o0o0oo00.OooO0O0);
        dataReportRequest.bizData.put("apdidToken", o0o0oo00.OooO0OO);
        dataReportRequest.bizData.put("umidToken", o0o0oo00.OooO0Oo);
        dataReportRequest.bizData.put("dynamicKey", o0o0oo00.OooO0o0);
        dataReportRequest.deviceData = o0o0oo00.f20431OooO00o;
        return dataReportRequest;
    }

    public static C7582o0o0O0O OooO00o(DataReportResult dataReportResult) {
        C7582o0o0O0O o0o0o0o = new C7582o0o0O0O();
        if (dataReportResult == null) {
            return null;
        }
        ((C7577o0o0O0) o0o0o0o).f20414OooO00o = dataReportResult.success;
        ((C7577o0o0O0) o0o0o0o).OooO00o = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            o0o0o0o.f20421OooO0O0 = map.get("apdid");
            o0o0o0o.f20422OooO0OO = map.get("apdidToken");
            o0o0o0o.OooO0o = map.get("dynamicKey");
            o0o0o0o.OooO0oO = map.get("timeInterval");
            o0o0o0o.OooO0oo = map.get("webrtcUrl");
            o0o0o0o.OooO = "";
            String str = map.get("drmSwitch");
            if (C7559o0o00OOo.m19212OooO0O0(str)) {
                if (str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.charAt(0));
                    o0o0o0o.OooO0Oo = sb.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(2));
                    o0o0o0o.OooO0o0 = sb2.toString();
                }
            }
            if (map.containsKey("apse_degrade")) {
                o0o0o0o.OooOO0 = map.get("apse_degrade");
            }
        }
        return o0o0o0o;
    }
}
