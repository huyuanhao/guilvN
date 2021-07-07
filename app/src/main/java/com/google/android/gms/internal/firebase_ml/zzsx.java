package com.google.android.gms.internal.firebase_ml;

import java.util.NoSuchElementException;

public final class zzsx extends zzsz {
    public final int limit = this.zzbko.size();
    public int position = 0;
    public final /* synthetic */ zzsw zzbko;

    public zzsx(zzsw zzsw) {
        this.zzbko = zzsw;
    }

    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zztd
    public final byte nextByte() {
        int i = this.position;
        if (i < this.limit) {
            this.position = i + 1;
            return this.zzbko.zzcm(i);
        }
        throw new NoSuchElementException();
    }
}
