package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzsn;
import com.google.android.gms.internal.firebase_ml.zzso;

public abstract class zzso<MessageType extends zzsn<MessageType, BuilderType>, BuilderType extends zzso<MessageType, BuilderType>> implements zzvp {
    public abstract BuilderType zza(MessageType messagetype);

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.firebase_ml.zzso<MessageType extends com.google.android.gms.internal.firebase_ml.zzsn<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.firebase_ml.zzso<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.firebase_ml.zzvp
    public final /* synthetic */ zzvp zza(zzvo zzvo) {
        if (zzre().getClass().isInstance(zzvo)) {
            return zza((zzsn) zzvo);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: zzpr */
    public abstract BuilderType clone();
}
