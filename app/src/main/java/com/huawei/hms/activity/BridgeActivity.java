package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.huawei.hms.p035a.C1107a;
import com.huawei.hms.support.log.C1202a;
import java.lang.reflect.InvocationTargetException;
import s.h.e.l.l.C;

public class BridgeActivity extends Activity {
    public static final String EXTRA_DELEGATE_CLASS_NAME = "intent.extra.DELEGATE_CLASS_OBJECT";
    public static final String EXTRA_DELEGATE_UPDATE_INFO = "intent.extra.update.info";
    public static final String EXTRA_INTENT = "intent.extra.intent";
    public static final String EXTRA_IS_FULLSCREEN = "intent.extra.isfullscreen";
    public static final String EXTRA_RESULT = "intent.extra.RESULT";

    /* renamed from: a */
    public AbstractC1109a f1095a;

    static {
        C.i(50331727);
    }

    /* renamed from: a */
    public static void m993a(Window window, boolean z) {
        try {
            window.getClass().getMethod("setHwFloating", Boolean.TYPE).invoke(window, Boolean.valueOf(z));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            C1202a.m1320d("BridgeActivity", "In setHwFloating, Failed to call Window.setHwFloating()." + e.getMessage());
        }
    }

    /* renamed from: b */
    private boolean m994b() {
        Intent intent = getIntent();
        if (intent == null) {
            C1202a.m1320d("BridgeActivity", "In initialize, Must not pass in a null intent.");
            return false;
        }
        if (intent.getBooleanExtra(EXTRA_IS_FULLSCREEN, false)) {
            getWindow().setFlags(1024, 1024);
        }
        String stringExtra = intent.getStringExtra(EXTRA_DELEGATE_CLASS_NAME);
        if (stringExtra == null) {
            C1202a.m1320d("BridgeActivity", "In initialize, Must not pass in a null or non class object.");
            return false;
        }
        try {
            AbstractC1109a aVar = (AbstractC1109a) Class.forName(stringExtra).asSubclass(AbstractC1109a.class).newInstance();
            this.f1095a = aVar;
            aVar.onBridgeActivityCreate(this);
            return true;
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            C1202a.m1320d("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance." + e.getMessage());
            return false;
        }
    }

    public static native Intent getIntentStartBridgeActivity(Activity activity, String str);

    public native void finish();

    public native void onActivityResult(int i, int i2, Intent intent);

    public native void onConfigurationChanged(Configuration configuration);

    public native void onCreate(Bundle bundle);

    public native void onDestroy();

    public native boolean onKeyUp(int i, KeyEvent keyEvent);

    /* renamed from: a */
    private void m992a() {
        requestWindowFeature(1);
        if (C1107a.C1108a.f1094a >= 9) {
            Window window = getWindow();
            window.addFlags(67108864);
            m993a(window, true);
        }
    }
}
