package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.UiThreadUtil;
import com.jinhui365.hotsources.bean.HotSourceVO;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.io.File;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0OOoOO  reason: case insensitive filesystem */
public class C8647oo0OOoOO {
    public static C8647oo0OOoOO OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21776OooO00o = "rn-file-path";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21777OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Activity f21778OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8626oo0OO000 f21779OooO00o = new OooO00o(C8653oo0Oo0.OooO0oO);

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8624oo0OO0 f21780OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9096ooo0000O f21781OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f21782OooO00o;
    public int OooO0O0 = 0;

    /* renamed from: com.pd.sdk.oo0OOoOO$OooO0O0 */
    public class OooO0O0 implements AbstractC9096ooo0000O {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.AbstractC9096ooo0000O
        public void OooO00o(boolean z, String str) {
            if (z) {
                LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
                sharedInstance.recordInfo(OooO0O0.class.getName() + ": onUnZip=Success===" + str);
                C8655oo0Oo000.OooO00o(str);
                C8647oo0OOoOO.this.OooO0O0();
                return;
            }
            LogCollectorManager sharedInstance2 = LogCollectorManager.sharedInstance();
            sharedInstance2.recordInfo(OooO0O0.class.getName() + ": retryDOWNRN==" + str);
            C8647oo0OOoOO.this.OooO0Oo();
        }
    }

    /* renamed from: com.pd.sdk.oo0OOoOO$OooO0OO */
    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public void run() {
            C8655oo0Oo000.m20279OooO00o();
            C8647oo0OOoOO.this.OooO0OO();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0Oo() {
        int i = this.OooO0O0;
        if (i < this.f21777OooO00o) {
            this.OooO0O0 = i + 1;
            C8653oo0Oo0.OooO00o(this.f21778OooO00o).OooO00o(C8653oo0Oo0.OooO0oO, 1);
            return;
        }
        C8655oo0Oo000.OooO00o(new File(C8655oo0Oo000.OooO0Oo()));
        C8655oo0Oo000.OooO00o(new File(C8686oo0OoooO.OooO00o().OooO00o(f21776OooO00o, "")));
        m20270OooO00o();
    }

    /* renamed from: com.pd.sdk.oo0OOoOO$OooO00o */
    public class OooO00o extends AbstractC8626oo0OO000 {
        public OooO00o(String str) {
            super(str);
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void OooO00o(String str) {
            super.OooO00o(str);
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordInfo(OooO00o.class.getName() + ":==" + str + ";onDefaultInit");
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void OooO0O0(String str, String str2, HotSourceVO hotSourceVO) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordInfo(OooO00o.class.getName() + ":==" + str + ";onSuccess");
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void onFailure(String str, String str2) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordInfo(OooO00o.class.getName() + ":==" + str + ";onFailure;" + str2);
            if (C8653oo0Oo0.OooO0oO.equals(str)) {
                C8647oo0OOoOO.this.OooO0Oo();
            }
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void OooO00o(String str, String str2, HotSourceVO hotSourceVO) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordInfo(OooO00o.class.getName() + ":==" + str + ";onCacheVOSuccess");
            if (C8653oo0Oo0.OooO0oO.equals(str)) {
                File file = new File(C9095ooo00000.OooO0O0(C8647oo0OOoOO.this.f21778OooO00o, hotSourceVO));
                if (C8655oo0Oo000.m20281OooO00o((!hotSourceVO.getUserInfo().isEmpty() || !hotSourceVO.getUserInfo().containsKey("version")) ? "" : hotSourceVO.getUserInfo().get("version")) && file.exists()) {
                    C8655oo0Oo000.OooO00o(C9095ooo00000.OooO0O0(C8647oo0OOoOO.this.f21778OooO00o, hotSourceVO));
                    C8647oo0OOoOO.this.OooO0O0();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void OooO00o(String str, int i) {
            super.OooO00o(str, i);
            if (C8647oo0OOoOO.this.f21780OooO00o != null) {
                AbstractC8624oo0OO0 oo0oo0 = C8647oo0OOoOO.this.f21780OooO00o;
                if (i >= 100) {
                    i = 99;
                }
                oo0oo0.OooO00o(i);
            }
        }

        @Override // com.p118pd.sdk.AbstractC8677oo0Ooo, com.p118pd.sdk.AbstractC8626oo0OO000
        public void OooO00o(HotSourceVO hotSourceVO, String str) {
            super.OooO00o(hotSourceVO, str);
            C8653oo0Oo0.OooO00o(C8647oo0OOoOO.this.f21778OooO00o).OooO0OO(hotSourceVO, str);
            C8686oo0OoooO.OooO00o().m20298OooO00o(C8647oo0OOoOO.f21776OooO00o, str);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0OO() {
        try {
            C8659oo0Oo0OO.OooO00o(this.f21778OooO00o, C8646oo0OOoO.OooO00o);
        } catch (Exception e) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordWarn(C8647oo0OOoOO.class.getName() + ":  " + e.getLocalizedMessage());
        }
        AbstractC8624oo0OO0 oo0oo0 = this.f21780OooO00o;
        if (oo0oo0 != null) {
            oo0oo0.OooO00o(100);
            this.f21780OooO00o.OooO00o();
        }
    }

    public void OooO0O0(Activity activity, AbstractC8624oo0OO0 oo0oo0) {
        this.f21780OooO00o = oo0oo0;
        this.f21778OooO00o = activity;
        m20270OooO00o();
    }

    public static C8647oo0OOoOO OooO00o() {
        if (OooO00o == null) {
            synchronized (C8647oo0OOoOO.class) {
                if (OooO00o == null) {
                    OooO00o = new C8647oo0OOoOO();
                }
            }
        }
        return OooO00o;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0O0() {
        OooO00o(this.f21778OooO00o);
        m20270OooO00o();
    }

    public void OooO00o(Activity activity, AbstractC8624oo0OO0 oo0oo0) {
        OooO00o(activity, null, oo0oo0);
    }

    public void OooO00o(Activity activity, Map<String, String> map, AbstractC8624oo0OO0 oo0oo0) {
        this.f21780OooO00o = oo0oo0;
        this.f21778OooO00o = activity;
        this.f21782OooO00o = map;
        C8653oo0Oo0 OooO00o2 = C8653oo0Oo0.OooO00o(activity);
        OooO00o2.OooO00o(this.f21779OooO00o);
        OooO00o2.OooO00o(C8653oo0Oo0.OooO0oO, this.f21781OooO00o);
        OooO00o2.OooO00o(C8653oo0Oo0.OooO0oO, 1);
    }

    public void OooO00o(Context context) {
        C8653oo0Oo0 OooO00o2 = C8653oo0Oo0.OooO00o(context);
        OooO00o2.OooO0O0(this.f21779OooO00o);
        OooO00o2.OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20270OooO00o() {
        UiThreadUtil.runOnUiThread(new OooO0OO());
    }
}
