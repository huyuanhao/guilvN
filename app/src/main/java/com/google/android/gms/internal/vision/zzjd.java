package com.google.android.gms.internal.vision;

public enum zzjd {
    DOUBLE(zzji.DOUBLE, 1),
    FLOAT(zzji.FLOAT, 5),
    INT64(zzji.zzacq, 0),
    UINT64(zzji.zzacq, 0),
    INT32(zzji.INT, 0),
    FIXED64(zzji.zzacq, 1),
    FIXED32(zzji.INT, 5),
    BOOL(zzji.BOOLEAN, 0),
    STRING(zzji.STRING, 2) {
    },
    GROUP(zzji.MESSAGE, 3) {
    },
    MESSAGE(zzji.MESSAGE, 2) {
    },
    BYTES(zzji.BYTE_STRING, 2) {
    },
    UINT32(zzji.INT, 0),
    ENUM(zzji.ENUM, 0),
    SFIXED32(zzji.INT, 5),
    SFIXED64(zzji.zzacq, 1),
    SINT32(zzji.INT, 0),
    SINT64(zzji.zzacq, 0);
    
    public final zzji zzacm;
    public final int zzacn;

    /* access modifiers changed from: public */
    zzjd(zzji zzji, int i) {
        this.zzacm = zzji;
        this.zzacn = i;
    }

    public final zzji zzho() {
        return this.zzacm;
    }

    public final int zzhp() {
        return this.zzacn;
    }

    /* access modifiers changed from: public */
    /* synthetic */ zzjd(zzji zzji, int i, zzjc zzjc) {
        this(zzji, i);
    }
}
