package com.google.android.gms.common;

import java.util.concurrent.Callable;

public final class zzo extends zzm {
    public final Callable<String> zzaf;

    public zzo(Callable<String> callable) {
        super(false, null, null);
        this.zzaf = callable;
    }

    @Override // com.google.android.gms.common.zzm
    public final String getErrorMessage() {
        try {
            return this.zzaf.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
