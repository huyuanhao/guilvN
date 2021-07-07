package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

public final class zad extends DialogRedirect {
    public final /* synthetic */ Fragment val$fragment;
    public final /* synthetic */ int val$requestCode;
    public final /* synthetic */ Intent zaog;

    public zad(Intent intent, Fragment fragment, int i) {
        this.zaog = intent;
        this.val$fragment = fragment;
        this.val$requestCode = i;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    public final void redirect() {
        Intent intent = this.zaog;
        if (intent != null) {
            this.val$fragment.startActivityForResult(intent, this.val$requestCode);
        }
    }
}
