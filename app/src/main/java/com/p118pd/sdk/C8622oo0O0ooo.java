package com.p118pd.sdk;

import android.content.Context;
import com.jinhui365.auth.C1402R;
import com.megvii.meglive_sdk.listener.DetectCallback;
import com.megvii.meglive_sdk.listener.PreCallback;
import com.megvii.meglive_sdk.manager.MegLiveManager;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oo0O0ooo  reason: case insensitive filesystem */
public class C8622oo0O0ooo implements PreCallback, DetectCallback {
    public static final String OooO00o = "https://api.megvii.com";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21741OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MegLiveManager f21742OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8670oo0OoOO0 f21743OooO00o;

    public C8622oo0O0ooo(Context context, AbstractC8670oo0OoOO0 oo0oooo0) {
        this.f21741OooO00o = context;
        this.f21743OooO00o = oo0oooo0;
        MegLiveManager instance = MegLiveManager.getInstance();
        this.f21742OooO00o = instance;
        instance.setManifestPack(context, context.getResources().getString(C1402R.string.package_name));
    }

    private void OooO0O0(String str, int i) {
        AbstractC8670oo0OoOO0 oo0oooo0 = this.f21743OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.onPreFail(str, i);
        }
        OooO00o();
    }

    public void OooO00o(String str, String str2) {
        if (str2 == null || str2.equals("")) {
            MegLiveManager megLiveManager = this.f21742OooO00o;
            if (megLiveManager != null) {
                megLiveManager.preDetect(this.f21741OooO00o, str, "zh", OooO00o, this);
                return;
            }
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("advanced_option", str2);
        MegLiveManager megLiveManager2 = this.f21742OooO00o;
        if (megLiveManager2 != null) {
            megLiveManager2.preDetect(this.f21741OooO00o, str, "zh", OooO00o, hashMap, this);
        }
    }

    @Override // com.megvii.meglive_sdk.listener.DetectCallback
    public void onDetectFinish(String str, int i, String str2, String str3) {
        if (i == 1000) {
            OooO0O0(str, str3);
        } else {
            OooO00o(str2, i);
        }
    }

    @Override // com.megvii.meglive_sdk.listener.PreCallback
    public void onPreFinish(String str, int i, String str2) {
        MegLiveManager megLiveManager;
        AbstractC8670oo0OoOO0 oo0oooo0 = this.f21743OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.onPreFinish();
        }
        if (i != 1000 || (megLiveManager = this.f21742OooO00o) == null) {
            OooO0O0(str2, i);
            return;
        }
        megLiveManager.setVerticalDetectionType(0);
        this.f21742OooO00o.startDetect(this);
    }

    @Override // com.megvii.meglive_sdk.listener.PreCallback
    public void onPreStart() {
        AbstractC8670oo0OoOO0 oo0oooo0 = this.f21743OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.onPreStart();
        }
    }

    private void OooO0O0(String str, String str2) {
        AbstractC8670oo0OoOO0 oo0oooo0 = this.f21743OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.success(str, str2);
        }
        OooO00o();
    }

    public C8622oo0O0ooo(Context context, String str, AbstractC8670oo0OoOO0 oo0oooo0) {
        this.f21741OooO00o = context;
        this.f21743OooO00o = oo0oooo0;
        MegLiveManager instance = MegLiveManager.getInstance();
        this.f21742OooO00o = instance;
        instance.setManifestPack(context, str);
    }

    private void OooO00o(String str, int i) {
        AbstractC8670oo0OoOO0 oo0oooo0 = this.f21743OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.onFail(str, i);
        }
        OooO00o();
    }

    private void OooO00o() {
        this.f21741OooO00o = null;
        this.f21742OooO00o = null;
    }
}
