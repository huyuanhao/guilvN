package com.google.android.gms.internal.firebase_ml;

public enum zzxl {
    DOUBLE(zzxq.DOUBLE, 1),
    FLOAT(zzxq.FLOAT, 5),
    INT64(zzxq.zzbuk, 0),
    UINT64(zzxq.zzbuk, 0),
    INT32(zzxq.INT, 0),
    FIXED64(zzxq.zzbuk, 1),
    FIXED32(zzxq.INT, 5),
    BOOL(zzxq.BOOLEAN, 0),
    STRING(zzxq.STRING, 2) {
    },
    GROUP(zzxq.MESSAGE, 3) {
    },
    MESSAGE(zzxq.MESSAGE, 2) {
    },
    BYTES(zzxq.BYTE_STRING, 2) {
    },
    UINT32(zzxq.INT, 0),
    ENUM(zzxq.ENUM, 0),
    SFIXED32(zzxq.INT, 5),
    SFIXED64(zzxq.zzbuk, 1),
    SINT32(zzxq.INT, 0),
    SINT64(zzxq.zzbuk, 0);
    
    public final zzxq zzbug;
    public final int zzbuh;

    /* access modifiers changed from: public */
    zzxl(zzxq zzxq, int i) {
        this.zzbug = zzxq;
        this.zzbuh = i;
    }

    public final zzxq zztp() {
        return this.zzbug;
    }

    public final int zztq() {
        return this.zzbuh;
    }

    /* access modifiers changed from: public */
    /* synthetic */ zzxl(zzxq zzxq, int i, zzxk zzxk) {
        this(zzxq, i);
    }
}
