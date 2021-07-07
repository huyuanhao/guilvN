package com.jinhui365.template.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.jinhui365.p088rn.MyReactActivity;
import com.jinhui365.util.dialog.AlertDialog;
import com.p118pd.sdk.C8687oo0o;
import s.h.e.l.l.C;

public class MainActivity extends MyReactActivity {
    public static MainActivity OooO00o = null;
    public static final String o0OO00O = "APP_VERSIONCODE_KEY";
    public static final String o0OOO0o = "__scheme_page_params";
    public static final String o0Oo0oo = "APP_VERSION";
    public static final String o0ooOOo = "MainActivity";
    public static final String o0ooOoO = "__scheme_page_url";

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlertDialog f14982OooO00o;
    public boolean OooO0O0 = false;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        public void onClick(View view) {
            MainActivity.this.f14982OooO00o.m15121OooO00o();
            C8687oo0o.OooO00o((Context) MainActivity.this);
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            MainActivity.this.f14982OooO00o.m15121OooO00o();
        }
    }

    static {
        C.i(50331736);
    }

    public static native MainActivity OooO00o();

    @Override // com.jinhui365.p088rn.MyReactActivity, com.jinhui365.p088rn.MyReactActivity, com.jinhui365.p088rn.XNRNReactActivity
    /* renamed from: OooO00o  reason: collision with other method in class */
    public native void m15118OooO00o();

    public native void OooO00o(Intent intent);

    public native void OooO00o(Intent intent, boolean z);

    @Override // com.jinhui365.p088rn.MyReactActivity
    public native void OooO00o(Bundle bundle);

    @Override // com.jinhui365.p088rn.XNRNReactActivity
    public native void OooO0O0();

    public native void OooO0O0(Intent intent);

    public native void OooO0O0(Intent intent, boolean z);

    @Override // com.jinhui365.p088rn.MyReactActivity
    public native void OooO0O0(Bundle bundle);

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity, com.jinhui365.p088rn.MyReactActivity, com.jinhui365.p088rn.XNRNReactActivity
    public native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.FragmentActivity, com.jinhui365.p088rn.MyReactActivity, com.jinhui365.p088rn.XNRNReactActivity
    public native void onDestroy();

    @Override // androidx.fragment.app.FragmentActivity, com.jinhui365.p088rn.MyReactActivity, com.jinhui365.p088rn.XNRNReactActivity
    public native void onNewIntent(Intent intent);
}
