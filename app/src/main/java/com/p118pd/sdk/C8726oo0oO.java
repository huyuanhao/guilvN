package com.p118pd.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.jinhui365.hotsources.bean.HotSourceVO;
import com.jinhui365.template.TemplateApplication;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.rxhui.android_log_sdk.LogLevel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0oO  reason: case insensitive filesystem */
public class C8726oo0oO extends AbstractC8626oo0OO000 {
    public static final String OooO0o0 = "APP_VERSIONCODE_KEY";
    public int OooO00o = 99;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f21899OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8653oo0Oo0 f21900OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8728oo0oO000 f21901OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, Integer> f21902OooO00o = new HashMap();
    public String OooO0O0 = "template_hotSource";
    public String OooO0OO = "react_native_url";
    public String OooO0Oo = "last_has_rn_source";

    public C8726oo0oO(C8653oo0Oo0 oo0oo0, Handler handler, String str, AbstractC8728oo0oO000 oo0oo000) {
        super(str);
        this.f21899OooO00o = handler;
        this.f21900OooO00o = oo0oo0;
        this.f21901OooO00o = oo0oo000;
    }

    @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
    public void OooO00o(List<HotSourceVO> list) {
        boolean z = false;
        boolean z2 = false;
        for (HotSourceVO hotSourceVO : list) {
            if (hotSourceVO.getCategory().equals(C8653oo0Oo0.OooO0oO)) {
                z2 = true;
            }
            if (hotSourceVO.getCategory().equals(C8653oo0Oo0.OooOO0)) {
                C8706oo0o0OO0.OooO00o().OooO0O0(C9041ooOoOO0.OooO00o(C9041ooOoOO0.OooO00o(hotSourceVO), String.class, Object.class));
                Map<String, String> userInfo = hotSourceVO.getUserInfo();
                if (userInfo != null) {
                    if (userInfo.containsKey("logLevel")) {
                        try {
                            LogCollectorManager.sharedInstance().setUploadLevel(LogLevel.valueOf(userInfo.get("logLevel")));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (userInfo.containsKey("maxMumDatabaseSize")) {
                        C8897ooOO00o0.OooO00o().OooO00o(C8741oo0oOo0.m20357OooO00o(userInfo.get("maxMumDatabaseSize")));
                    }
                }
                z = true;
            }
        }
        if (!z) {
            C8706oo0o0OO0.OooO00o().OooO0O0(new HashMap());
        }
        if (C8643oo0OOo00.m20265OooO00o((Context) TemplateApplication.OooO00o(), this.OooO0O0, this.OooO0Oo, (Boolean) false) != z2) {
            C8659oo0Oo0OO.m20291OooO00o();
        }
        if (!z2) {
            OooO0O0(C8653oo0Oo0.OooO0oO, 100);
            C8655oo0Oo000.OooO00o(new File(C8655oo0Oo000.OooO0Oo()));
            C8640oo0OOOoo.OooO00o(new File(C8643oo0OOo00.OooO00o((Context) TemplateApplication.OooO00o(), this.OooO0O0, this.OooO0OO, "")));
            this.f21899OooO00o.sendEmptyMessage(1001);
        }
        C8643oo0OOo00.OooO00o((Context) TemplateApplication.OooO00o(), this.OooO0O0, this.OooO0Oo, Boolean.valueOf(z2));
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "获取到有效的资源热更");
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "onShowSourceList");
        hashMap.put("hasReactNative", z2 + "");
        hashMap.put("hasAppConfig", z + "");
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        this.f21901OooO00o.OooO00o(list);
    }

    @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
    public void OooO0O0(String str, String str2, HotSourceVO hotSourceVO) {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "获取资源热更成功");
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "onSuccess");
        hashMap.put("category", str);
        hashMap.put("path", str2);
        hashMap.put("url", hotSourceVO.getUrl());
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        OooO00o(str2, hotSourceVO);
        this.f21901OooO00o.OooO0O0(str, str2, hotSourceVO);
        OooO0O0(str, 100);
    }

    @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
    public void onFailure(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "没有有效的可使用资源");
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "onFailure");
        hashMap.put("category", str);
        hashMap.put("errorMSg", str2);
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        int OooO00o2 = C8643oo0OOo00.OooO00o((Context) TemplateApplication.OooO00o(), C8653oo0Oo0.f21789OooO0O0, "APP_VERSIONCODE_KEY", -1);
        if (str.equals("all")) {
            List list = null;
            if (OooO00o2 == C8742oo0oOo00.OooO0O0((Context) TemplateApplication.OooO00o())) {
                list = (List) C9041ooOoOO0.m20701OooO0O0(C8643oo0OOo00.OooO00o((Context) TemplateApplication.OooO00o(), C8653oo0Oo0.f21789OooO0O0, str, ""), (Class<?>) HotSourceVO.class);
            }
            ArrayList<HotSourceVO> arrayList = new ArrayList();
            if (C9044ooOoOO0O.OooO0O0(list)) {
                for (int i = 0; i < list.size(); i++) {
                    HotSourceVO hotSourceVO = (HotSourceVO) list.get(i);
                    if (this.f21900OooO00o.m20272OooO00o(hotSourceVO) || this.f21900OooO00o.OooO0O0(hotSourceVO)) {
                        arrayList.add(hotSourceVO);
                    }
                }
            }
            OooO00o(arrayList);
            for (HotSourceVO hotSourceVO2 : arrayList) {
                this.f21900OooO00o.OooO0O0(hotSourceVO2, false);
            }
            return;
        }
        OooO0O0(str, 100);
        if (str.equals(C8653oo0Oo0.OooO0oO)) {
            this.f21899OooO00o.sendEmptyMessage(1001);
        } else {
            this.f21901OooO00o.onFailure(str, str2);
        }
    }

    public C8726oo0oO(String str) {
        super(str);
    }

    public void OooO0O0(String str, int i) {
        if (i >= 0) {
            this.f21902OooO00o.put(str, Integer.valueOf(i));
            this.OooO00o = C8724oo0o0ooO.OooO00o(this.f21902OooO00o);
            Message message = new Message();
            message.what = 1002;
            message.arg1 = this.OooO00o;
            this.f21899OooO00o.sendMessage(message);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
    public void OooO00o(String str, String str2, HotSourceVO hotSourceVO) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "onCacheVOSuccess");
        hashMap.put("desc", "获取资源热更缓存成功");
        hashMap.put("category", str);
        hashMap.put("path", str2);
        hashMap.put("url", hotSourceVO.getUrl());
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        OooO00o(str2, hotSourceVO);
        this.f21901OooO00o.OooO00o(str, str2, hotSourceVO);
        OooO0O0(str, 100);
    }

    @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
    public void OooO00o(String str, int i) {
        if (i >= 0) {
            if (i == 100) {
                i = 99;
            }
            OooO0O0(str, i);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
    public void OooO00o(HotSourceVO hotSourceVO, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "资源热更下载完成");
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "onDownLoadFinish");
        hashMap.put("category", hotSourceVO.getCategory());
        hashMap.put("url", hotSourceVO.getUrl());
        hashMap.put("downloadInfoPath", str);
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        if (C8653oo0Oo0.OooO0oO.equals(hotSourceVO.getCategory())) {
            this.f21900OooO00o.OooO0OO(hotSourceVO, str);
            C8643oo0OOo00.m20264OooO00o((Context) TemplateApplication.OooO00o(), this.OooO0O0, this.OooO0OO, str);
            return;
        }
        this.f21901OooO00o.OooO00o(hotSourceVO, str);
    }

    public void OooO00o(String str, HotSourceVO hotSourceVO) {
        if (hotSourceVO == null) {
            return;
        }
        if (hotSourceVO.getCategory().equals(C8653oo0Oo0.OooO0oO)) {
            if (C8655oo0Oo000.m20281OooO00o((hotSourceVO.getUserInfo().isEmpty() || !hotSourceVO.getUserInfo().containsKey("version")) ? "" : hotSourceVO.getUserInfo().get("version"))) {
                C8655oo0Oo000.OooO00o(C9095ooo00000.OooO0O0(TemplateApplication.OooO00o(), hotSourceVO));
                this.f21899OooO00o.sendEmptyMessage(1001);
            }
        } else if (hotSourceVO.getCategory().equals(C8653oo0Oo0.OooO0o0)) {
            C8631oo0OO0Oo.OooO00o().OooO00o(str);
        } else if (hotSourceVO.getCategory().equals(C8653oo0Oo0.OooO0oo)) {
            C8644oo0OOo0O.OooO00o().OooO00o(str);
        }
    }
}
