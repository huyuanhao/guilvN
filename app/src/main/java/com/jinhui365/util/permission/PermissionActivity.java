package com.jinhui365.util.permission;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p118pd.sdk.C6981o000O00O;

@Keep
@TargetApi(23)
public final class PermissionActivity extends Activity {
    public static OooO00o OooO00o = null;
    public static final String o0ooOOo = "KEY_INPUT_PERMISSIONS";

    public interface OooO00o {
        void OooO00o(@NonNull String[] strArr, @NonNull int[] iArr);
    }

    public static void OooO00o(OooO00o oooO00o) {
        OooO00o = oooO00o;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags = 1024;
        getWindow().setAttributes(attributes);
        getWindow().clearFlags(512);
        String[] stringArrayExtra = getIntent().getStringArrayExtra(o0ooOOo);
        if (OooO00o == null || stringArrayExtra == null) {
            finish();
        } else {
            C6981o000O00O.OooO00o(this, stringArrayExtra, 1);
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        OooO00o oooO00o = OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(strArr, iArr);
        }
        OooO00o = null;
        finish();
    }
}
