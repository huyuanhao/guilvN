package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import com.baidu.idl.face.platform.FaceConfig;
import com.baidu.idl.face.platform.FaceSDKManager;
import com.jinhui365.faceid.FaceDetectExpActivity;
import com.jinhui365.util.permission.OnBasePermissionGrantedListener;
import com.jinhui365.util.permission.PermissionManager;
import com.jinhui365.view.bankcard.BankScanActivity;
import com.jinhui365.view.idcard.IDCardScanActivity;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0O0Ooo  reason: case insensitive filesystem */
public class C8610oo0O0Ooo {
    public static C8610oo0O0Ooo OooO00o = null;
    public static final String OooO0O0 = "custom";

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8614oo0O0o0O f21723OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21724OooO00o = "";

    /* renamed from: com.pd.sdk.oo0O0Ooo$OooO00o */
    public class OooO00o extends OnBasePermissionGrantedListener {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Activity f21725OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC8740oo0oOo f21727OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, Activity activity, int i, AbstractC8740oo0oOo oo0ooo) {
            super(context);
            this.f21725OooO00o = activity;
            this.OooO00o = i;
            this.f21727OooO00o = oo0ooo;
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
        public void onGranted() {
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, " Authentication:AuthManager:idCardOCR,获取相关权限成功");
            Activity activity = this.f21725OooO00o;
            boolean z = true;
            if (1 != this.OooO00o) {
                z = false;
            }
            IDCardScanActivity.OooO00o(activity, z, this.f21727OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.oo0O0Ooo$OooO0O0 */
    public class OooO0O0 extends OnBasePermissionGrantedListener {
        public final /* synthetic */ Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC8744oo0oOo0o f21729OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, Activity activity, AbstractC8744oo0oOo0o oo0ooo0o) {
            super(context);
            this.OooO00o = activity;
            this.f21729OooO00o = oo0ooo0o;
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
        public void onGranted() {
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, " AuthenticationAuthManager:bankCardOCR,获取相关权限成功");
            BankScanActivity.OooO00o(this.OooO00o, this.f21729OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.oo0O0Ooo$OooO0OO */
    public class OooO0OO extends OnBasePermissionGrantedListener {
        public final /* synthetic */ Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC8670oo0OoOO0 f21731OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ HashMap f21732OooO00o;
        public final /* synthetic */ HashMap OooO0O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context, HashMap hashMap, Activity activity, HashMap hashMap2, AbstractC8670oo0OoOO0 oo0oooo0) {
            super(context);
            this.f21732OooO00o = hashMap;
            this.OooO00o = activity;
            this.OooO0O0 = hashMap2;
            this.f21731OooO00o = oo0oooo0;
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
        public void onGranted() {
            if (this.f21732OooO00o.isEmpty() || !this.f21732OooO00o.containsKey("livingFirm") || !this.f21732OooO00o.get("livingFirm").equals("custom")) {
                if (this.f21732OooO00o.isEmpty() || !this.f21732OooO00o.containsKey("livingFirm") || !this.f21732OooO00o.get("livingFirm").equals(FaceDetectExpActivity.o0ooOOo)) {
                    C8610oo0O0Ooo.this.f21724OooO00o = "";
                    if (!this.OooO0O0.isEmpty() && this.OooO0O0.containsKey("token")) {
                        C8610oo0O0Ooo.this.f21724OooO00o = (String) this.OooO0O0.get("token");
                    }
                    if (C8741oo0oOo0.OooO0Oo(C8610oo0O0Ooo.this.f21724OooO00o)) {
                        new C8622oo0O0ooo(this.OooO00o, this.f21731OooO00o).OooO00o(C8610oo0O0Ooo.this.f21724OooO00o, C8608oo0O0Oo0.OooO00o);
                        return;
                    }
                    return;
                }
                if (this.f21732OooO00o.containsKey("isSound") && this.f21732OooO00o.get("isSound").equals("0")) {
                    C8610oo0O0Ooo.this.OooO0O0(false);
                }
                C8610oo0O0Ooo.this.OooO00o(false);
                FaceDetectExpActivity.OooO00o(this.OooO00o, this.f21731OooO00o);
            } else if (C8610oo0O0Ooo.this.f21723OooO00o != null) {
                C8610oo0O0Ooo.this.f21723OooO00o.OooO00o(this.OooO00o, this.OooO0O0, this.f21732OooO00o, this.f21731OooO00o);
            }
        }
    }

    public void OooO0O0(boolean z) {
        FaceConfig faceConfig = FaceSDKManager.getInstance().getFaceConfig();
        if (faceConfig != null) {
            faceConfig.setSound(z);
            FaceSDKManager.getInstance().setFaceConfig(faceConfig);
        }
    }

    public static C8610oo0O0Ooo OooO00o() {
        if (OooO00o == null) {
            synchronized (C8610oo0O0Ooo.class) {
                if (OooO00o == null) {
                    OooO00o = new C8610oo0O0Ooo();
                }
            }
        }
        return OooO00o;
    }

    public void OooO00o(AbstractC8614oo0O0o0O oo0o0o0o) {
        this.f21723OooO00o = oo0o0o0o;
    }

    public void OooO00o(Activity activity, int i, HashMap<String, Object> hashMap, AbstractC8740oo0oOo oo0ooo) {
        PermissionManager.OooO00o(activity).OooO00o(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, new OooO00o(activity, activity, i, oo0ooo));
    }

    public void OooO00o(Activity activity, HashMap<String, Object> hashMap, AbstractC8744oo0oOo0o oo0ooo0o) {
        PermissionManager.OooO00o(activity).OooO00o(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, new OooO0O0(activity, activity, oo0ooo0o));
    }

    public void OooO00o(Activity activity, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, AbstractC8670oo0OoOO0 oo0oooo0) {
        PermissionManager.OooO00o(activity).OooO00o(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, new OooO0OO(activity, hashMap2, activity, hashMap, oo0oooo0));
    }

    public void OooO00o(Context context, Map<String, Object> map, Map map2) {
        boolean booleanValue = ((Boolean) map.get("isOnlyCollect")).booleanValue();
        FaceSDKManager.getInstance().initialize(context, (String) map.get("licenseID"), (String) map.get("licenseFileName"), booleanValue);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20245OooO00o() {
        return FaceSDKManager.getInstance().getAuthorityStatus();
    }

    public void OooO00o(boolean z) {
        FaceSDKManager.getInstance().setmIsOnlyCollect(z);
    }

    public void OooO00o(Map map) {
        FaceSDKManager.getInstance().release();
    }
}
