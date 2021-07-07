package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Type;

public enum zztz {
    DOUBLE(0, zzub.SCALAR, zzuq.DOUBLE),
    FLOAT(1, zzub.SCALAR, zzuq.FLOAT),
    INT64(2, zzub.SCALAR, zzuq.zzbpk),
    UINT64(3, zzub.SCALAR, zzuq.zzbpk),
    INT32(4, zzub.SCALAR, zzuq.INT),
    FIXED64(5, zzub.SCALAR, zzuq.zzbpk),
    FIXED32(6, zzub.SCALAR, zzuq.INT),
    BOOL(7, zzub.SCALAR, zzuq.BOOLEAN),
    STRING(8, zzub.SCALAR, zzuq.STRING),
    MESSAGE(9, zzub.SCALAR, zzuq.MESSAGE),
    BYTES(10, zzub.SCALAR, zzuq.BYTE_STRING),
    UINT32(11, zzub.SCALAR, zzuq.INT),
    ENUM(12, zzub.SCALAR, zzuq.ENUM),
    SFIXED32(13, zzub.SCALAR, zzuq.INT),
    SFIXED64(14, zzub.SCALAR, zzuq.zzbpk),
    SINT32(15, zzub.SCALAR, zzuq.INT),
    SINT64(16, zzub.SCALAR, zzuq.zzbpk),
    GROUP(17, zzub.SCALAR, zzuq.MESSAGE),
    DOUBLE_LIST(18, zzub.VECTOR, zzuq.DOUBLE),
    FLOAT_LIST(19, zzub.VECTOR, zzuq.FLOAT),
    INT64_LIST(20, zzub.VECTOR, zzuq.zzbpk),
    UINT64_LIST(21, zzub.VECTOR, zzuq.zzbpk),
    INT32_LIST(22, zzub.VECTOR, zzuq.INT),
    FIXED64_LIST(23, zzub.VECTOR, zzuq.zzbpk),
    FIXED32_LIST(24, zzub.VECTOR, zzuq.INT),
    BOOL_LIST(25, zzub.VECTOR, zzuq.BOOLEAN),
    STRING_LIST(26, zzub.VECTOR, zzuq.STRING),
    MESSAGE_LIST(27, zzub.VECTOR, zzuq.MESSAGE),
    BYTES_LIST(28, zzub.VECTOR, zzuq.BYTE_STRING),
    UINT32_LIST(29, zzub.VECTOR, zzuq.INT),
    ENUM_LIST(30, zzub.VECTOR, zzuq.ENUM),
    SFIXED32_LIST(31, zzub.VECTOR, zzuq.INT),
    SFIXED64_LIST(32, zzub.VECTOR, zzuq.zzbpk),
    SINT32_LIST(33, zzub.VECTOR, zzuq.INT),
    SINT64_LIST(34, zzub.VECTOR, zzuq.zzbpk),
    DOUBLE_LIST_PACKED(35, zzub.PACKED_VECTOR, zzuq.DOUBLE),
    FLOAT_LIST_PACKED(36, zzub.PACKED_VECTOR, zzuq.FLOAT),
    INT64_LIST_PACKED(37, zzub.PACKED_VECTOR, zzuq.zzbpk),
    UINT64_LIST_PACKED(38, zzub.PACKED_VECTOR, zzuq.zzbpk),
    INT32_LIST_PACKED(39, zzub.PACKED_VECTOR, zzuq.INT),
    FIXED64_LIST_PACKED(40, zzub.PACKED_VECTOR, zzuq.zzbpk),
    FIXED32_LIST_PACKED(41, zzub.PACKED_VECTOR, zzuq.INT),
    BOOL_LIST_PACKED(42, zzub.PACKED_VECTOR, zzuq.BOOLEAN),
    UINT32_LIST_PACKED(43, zzub.PACKED_VECTOR, zzuq.INT),
    ENUM_LIST_PACKED(44, zzub.PACKED_VECTOR, zzuq.ENUM),
    SFIXED32_LIST_PACKED(45, zzub.PACKED_VECTOR, zzuq.INT),
    SFIXED64_LIST_PACKED(46, zzub.PACKED_VECTOR, zzuq.zzbpk),
    SINT32_LIST_PACKED(47, zzub.PACKED_VECTOR, zzuq.INT),
    SINT64_LIST_PACKED(48, zzub.PACKED_VECTOR, zzuq.zzbpk),
    GROUP_LIST(49, zzub.VECTOR, zzuq.MESSAGE),
    MAP(50, zzub.MAP, zzuq.VOID);
    
    public static final zztz[] zzbnt;
    public static final Type[] zzbnu = new Type[0];

    /* renamed from: id */
    public final int f1000id;
    public final zzuq zzbnp;
    public final zzub zzbnq;
    public final Class<?> zzbnr;
    public final boolean zzbns;

    /* access modifiers changed from: public */
    static {
        zztz[] values = values();
        zzbnt = new zztz[values.length];
        for (zztz zztz : values) {
            zzbnt[zztz.f1000id] = zztz;
        }
    }

    /* access modifiers changed from: public */
    zztz(int i, zzub zzub, zzuq zzuq) {
        int i2;
        this.f1000id = i;
        this.zzbnq = zzub;
        this.zzbnp = zzuq;
        int i3 = zzua.zzbnw[zzub.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.zzbnr = zzuq.zzrs();
        } else if (i3 != 2) {
            this.zzbnr = null;
        } else {
            this.zzbnr = zzuq.zzrs();
        }
        this.zzbns = (zzub != zzub.SCALAR || (i2 = zzua.zzbnx[zzuq.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    /* renamed from: id */
    public final int mo12532id() {
        return this.f1000id;
    }
}
