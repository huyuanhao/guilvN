package com.p118pd.sdk;

import android.app.Application;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0Oo00  reason: case insensitive filesystem */
public class C8654oo0Oo00 {
    public static C8654oo0Oo00 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Application f21797OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8656oo0Oo00O f21798OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8671oo0OoOOO f21799OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8672oo0OoOOo f21800OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<ReactPackage> f21801OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, AbstractC8648oo0OOoOo> f21802OooO00o = new HashMap();
    public List<String> OooO0O0 = new ArrayList();

    /* renamed from: com.pd.sdk.oo0Oo00$OooO00o */
    public class OooO00o extends AbstractC8656oo0Oo00O {
        public OooO00o(Application application) {
            super(application);
        }

        @Override // com.p118pd.sdk.AbstractC8656oo0Oo00O
        public void OooO00o(List<ReactPackage> list) {
            list.addAll(C8654oo0Oo00.this.f21801OooO00o);
        }
    }

    public C8654oo0Oo00 OooO0O0(boolean z) {
        C8646oo0OOoO.f21773OooO00o = z;
        return this;
    }

    public C8654oo0Oo00 OooO0OO(boolean z) {
        C8646oo0OOoO.f21774OooO0O0 = z;
        return this;
    }

    public C8654oo0Oo00 OooO0Oo(String str) {
        C8646oo0OOoO.OooO00o = str;
        return this;
    }

    public C8654oo0Oo00 OooO0o0(String str) {
        C8646oo0OOoO.OooO0OO = str;
        return this;
    }

    public static C8654oo0Oo00 OooO00o() {
        if (OooO00o == null) {
            synchronized (C8654oo0Oo00.class) {
                if (OooO00o == null) {
                    OooO00o = new C8654oo0Oo00();
                }
            }
        }
        return OooO00o;
    }

    public C8654oo0Oo00 OooO0O0(String str) {
        C8646oo0OOoO.OooO0Oo = str;
        return this;
    }

    public C8654oo0Oo00 OooO0OO(String str) {
        C8646oo0OOoO.OooO0O0 = str;
        return this;
    }

    public void OooO0O0(Bundle bundle) {
        for (int i = 0; i < AbstractC8656oo0Oo00O.OooO0O0.size(); i++) {
            AbstractC8656oo0Oo00O.OooO0O0.get(i).OooO0O0(bundle);
        }
    }

    public void OooO0O0(WritableMap writableMap) {
        for (int i = 0; i < AbstractC8656oo0Oo00O.OooO0O0.size(); i++) {
            AbstractC8656oo0Oo00O.OooO0O0.get(i).OooO0O0(writableMap);
        }
    }

    public void OooO00o(Application application) {
        this.f21797OooO00o = application;
        C8686oo0OoooO.OooO00o().OooO00o(application);
        if (!C8646oo0OOoO.f21774OooO0O0) {
            PreferenceManager.getDefaultSharedPreferences(application).edit().putString(PackagerConnectionSettings.PREFS_DEBUG_SERVER_HOST_KEY, C8646oo0OOoO.OooO0Oo).commit();
        }
        this.f21798OooO00o = new OooO00o(application);
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "Native初始化RN开始");
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
    }

    public C8654oo0Oo00 OooO00o(boolean z) {
        C8646oo0OOoO.f21775OooO0OO = z;
        return this;
    }

    public C8654oo0Oo00 OooO00o(ReactPackage reactPackage) {
        this.f21801OooO00o.add(reactPackage);
        return this;
    }

    public C8654oo0Oo00 OooO00o(AbstractC8648oo0OOoOo oo0ooooo) {
        if (oo0ooooo != null) {
            this.f21802OooO00o.put(oo0ooooo.getClass().getSuperclass().getSimpleName(), oo0ooooo);
        }
        return this;
    }

    public AbstractC8648oo0OOoOo OooO00o(String str) {
        if (this.f21802OooO00o.containsKey(str)) {
            return this.f21802OooO00o.get(str);
        }
        return null;
    }

    public C8654oo0Oo00 OooO00o(AbstractC8672oo0OoOOo oo0ooooo) {
        this.f21800OooO00o = oo0ooooo;
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8672oo0OoOOo m20276OooO00o() {
        return this.f21800OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8654oo0Oo00 m20274OooO00o(String str) {
        if (str.startsWith("http://")) {
            str = str.replace("http://", "");
        }
        if (str.startsWith("https://")) {
            str = str.replace("https://", "");
        }
        if (str.contains(Constants.COLON_SEPARATOR)) {
            str = str.substring(0, str.lastIndexOf(Constants.COLON_SEPARATOR));
        }
        this.OooO0O0.add(str);
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<String> m20277OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20278OooO00o(String str) {
        if (this.OooO0O0 != null) {
            for (int i = 0; i < this.OooO0O0.size(); i++) {
                if (str.contains(this.OooO0O0.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public C8654oo0Oo00 OooO00o(AbstractC8671oo0OoOOO oo0ooooo) {
        this.f21799OooO00o = oo0ooooo;
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8671oo0OoOOO m20275OooO00o() {
        return this.f21799OooO00o;
    }

    public void OooO00o(String str, WritableMap writableMap) {
        for (int i = 0; i < AbstractC8656oo0Oo00O.OooO0O0.size(); i++) {
            AbstractC8656oo0Oo00O.OooO0O0.get(i).OooO00o(str, writableMap);
        }
    }

    public void OooO00o(WritableMap writableMap) {
        for (int i = 0; i < AbstractC8656oo0Oo00O.OooO0O0.size(); i++) {
            AbstractC8656oo0Oo00O.OooO0O0.get(i).OooO00o(writableMap);
        }
    }

    public void OooO00o(Bundle bundle) {
        for (int i = 0; i < AbstractC8656oo0Oo00O.OooO0O0.size(); i++) {
            AbstractC8656oo0Oo00O.OooO0O0.get(i).OooO00o(bundle);
        }
    }
}
