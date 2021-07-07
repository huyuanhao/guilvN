package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.p118pd.sdk.C6972o0000oOO;
import s.h.e.l.l.C;

public class zaae extends zal {
    public GoogleApiManager zabm;
    public final C6972o0000oOO<zai<?>> zafo = new C6972o0000oOO<>();

    static {
        C.i(12);
    }

    public zaae(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public static void zaa(Activity activity, GoogleApiManager googleApiManager, zai<?> zai) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        zaae zaae = (zaae) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
        if (zaae == null) {
            zaae = new zaae(fragment);
        }
        zaae.zabm = googleApiManager;
        Preconditions.checkNotNull(zai, "ApiKey cannot be null");
        zaae.zafo.add(zai);
        googleApiManager.zaa(zaae);
    }

    private final native void zaak();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public native void onResume();

    @Override // com.google.android.gms.common.api.internal.zal, com.google.android.gms.common.api.internal.LifecycleCallback
    public native void onStart();

    @Override // com.google.android.gms.common.api.internal.zal, com.google.android.gms.common.api.internal.LifecycleCallback
    public native void onStop();

    @Override // com.google.android.gms.common.api.internal.zal
    public final native void zaa(ConnectionResult connectionResult, int i);

    public final C6972o0000oOO<zai<?>> zaaj() {
        return this.zafo;
    }

    @Override // com.google.android.gms.common.api.internal.zal
    public final native void zao();
}
