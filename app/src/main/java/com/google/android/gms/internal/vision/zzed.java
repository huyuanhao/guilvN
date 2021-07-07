package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzec;
import com.google.android.gms.internal.vision.zzed;

public abstract class zzed<MessageType extends zzec<MessageType, BuilderType>, BuilderType extends zzed<MessageType, BuilderType>> implements zzhg {
    public abstract BuilderType zza(MessageType messagetype);

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.vision.zzed<MessageType extends com.google.android.gms.internal.vision.zzec<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.vision.zzed<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzhg
    public final /* synthetic */ zzhg zza(zzhf zzhf) {
        if (zzfb().getClass().isInstance(zzhf)) {
            return zza((zzec) zzhf);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: zzcg */
    public abstract BuilderType clone();
}
