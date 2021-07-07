package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.umeng.commonsdk.proguard.C3617o;
import s.h.e.l.l.C;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    @VisibleForTesting
    public int zabp = 0;

    static {
        C.i(50331723);
    }

    public static native PendingIntent zaa(Context context, PendingIntent pendingIntent, int i);

    public static native Intent zaa(Context context, PendingIntent pendingIntent, int i, boolean z);

    public native void onActivityResult(int i, int i2, Intent intent);

    public native void onCancel(DialogInterface dialogInterface);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zabp = bundle.getInt(C3617o.f9396y);
        }
        if (this.zabp != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.zabp = 1;
                } catch (IntentSender.SendIntentException unused) {
                    finish();
                }
            } else {
                GoogleApiAvailability.getInstance().showErrorDialogFragment(this, num.intValue(), 2, this);
                this.zabp = 1;
            }
        }
    }

    public native void onSaveInstanceState(Bundle bundle);
}
