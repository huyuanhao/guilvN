package com.google.android.gms.internal.vision;

import java.lang.reflect.Type;

public enum zzfs {
    DOUBLE(0, zzfu.SCALAR, zzgh.DOUBLE),
    FLOAT(1, zzfu.SCALAR, zzgh.FLOAT),
    INT64(2, zzfu.SCALAR, zzgh.zzxt),
    UINT64(3, zzfu.SCALAR, zzgh.zzxt),
    INT32(4, zzfu.SCALAR, zzgh.INT),
    FIXED64(5, zzfu.SCALAR, zzgh.zzxt),
    FIXED32(6, zzfu.SCALAR, zzgh.INT),
    BOOL(7, zzfu.SCALAR, zzgh.BOOLEAN),
    STRING(8, zzfu.SCALAR, zzgh.STRING),
    MESSAGE(9, zzfu.SCALAR, zzgh.MESSAGE),
    BYTES(10, zzfu.SCALAR, zzgh.BYTE_STRING),
    UINT32(11, zzfu.SCALAR, zzgh.INT),
    ENUM(12, zzfu.SCALAR, zzgh.ENUM),
    SFIXED32(13, zzfu.SCALAR, zzgh.INT),
    SFIXED64(14, zzfu.SCALAR, zzgh.zzxt),
    SINT32(15, zzfu.SCALAR, zzgh.INT),
    SINT64(16, zzfu.SCALAR, zzgh.zzxt),
    GROUP(17, zzfu.SCALAR, zzgh.MESSAGE),
    DOUBLE_LIST(18, zzfu.VECTOR, zzgh.DOUBLE),
    FLOAT_LIST(19, zzfu.VECTOR, zzgh.FLOAT),
    INT64_LIST(20, zzfu.VECTOR, zzgh.zzxt),
    UINT64_LIST(21, zzfu.VECTOR, zzgh.zzxt),
    INT32_LIST(22, zzfu.VECTOR, zzgh.INT),
    FIXED64_LIST(23, zzfu.VECTOR, zzgh.zzxt),
    FIXED32_LIST(24, zzfu.VECTOR, zzgh.INT),
    BOOL_LIST(25, zzfu.VECTOR, zzgh.BOOLEAN),
    STRING_LIST(26, zzfu.VECTOR, zzgh.STRING),
    MESSAGE_LIST(27, zzfu.VECTOR, zzgh.MESSAGE),
    BYTES_LIST(28, zzfu.VECTOR, zzgh.BYTE_STRING),
    UINT32_LIST(29, zzfu.VECTOR, zzgh.INT),
    ENUM_LIST(30, zzfu.VECTOR, zzgh.ENUM),
    SFIXED32_LIST(31, zzfu.VECTOR, zzgh.INT),
    SFIXED64_LIST(32, zzfu.VECTOR, zzgh.zzxt),
    SINT32_LIST(33, zzfu.VECTOR, zzgh.INT),
    SINT64_LIST(34, zzfu.VECTOR, zzgh.zzxt),
    DOUBLE_LIST_PACKED(35, zzfu.PACKED_VECTOR, zzgh.DOUBLE),
    FLOAT_LIST_PACKED(36, zzfu.PACKED_VECTOR, zzgh.FLOAT),
    INT64_LIST_PACKED(37, zzfu.PACKED_VECTOR, zzgh.zzxt),
    UINT64_LIST_PACKED(38, zzfu.PACKED_VECTOR, zzgh.zzxt),
    INT32_LIST_PACKED(39, zzfu.PACKED_VECTOR, zzgh.INT),
    FIXED64_LIST_PACKED(40, zzfu.PACKED_VECTOR, zzgh.zzxt),
    FIXED32_LIST_PACKED(41, zzfu.PACKED_VECTOR, zzgh.INT),
    BOOL_LIST_PACKED(42, zzfu.PACKED_VECTOR, zzgh.BOOLEAN),
    UINT32_LIST_PACKED(43, zzfu.PACKED_VECTOR, zzgh.INT),
    ENUM_LIST_PACKED(44, zzfu.PACKED_VECTOR, zzgh.ENUM),
    SFIXED32_LIST_PACKED(45, zzfu.PACKED_VECTOR, zzgh.INT),
    SFIXED64_LIST_PACKED(46, zzfu.PACKED_VECTOR, zzgh.zzxt),
    SINT32_LIST_PACKED(47, zzfu.PACKED_VECTOR, zzgh.INT),
    SINT64_LIST_PACKED(48, zzfu.PACKED_VECTOR, zzgh.zzxt),
    GROUP_LIST(49, zzfu.VECTOR, zzgh.MESSAGE),
    MAP(50, zzfu.MAP, zzgh.VOID);
    
    public static final zzfs[] zzvu;
    public static final Type[] zzvv = new Type[0];

    /* renamed from: id */
    public final int f1001id;
    public final zzgh zzvq;
    public final zzfu zzvr;
    public final Class<?> zzvs;
    public final boolean zzvt;

    /* access modifiers changed from: public */
    static {
        zzfs[] values = values();
        zzvu = new zzfs[values.length];
        for (zzfs zzfs : values) {
            zzvu[zzfs.f1001id] = zzfs;
        }
    }

    /* access modifiers changed from: public */
    zzfs(int i, zzfu zzfu, zzgh zzgh) {
        int i2;
        this.f1001id = i;
        this.zzvr = zzfu;
        this.zzvq = zzgh;
        int i3 = zzft.zzvx[zzfu.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.zzvs = zzgh.zzfq();
        } else if (i3 != 2) {
            this.zzvs = null;
        } else {
            this.zzvs = zzgh.zzfq();
        }
        this.zzvt = (zzfu != zzfu.SCALAR || (i2 = zzft.zzvy[zzgh.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    /* renamed from: id */
    public final int mo13060id() {
        return this.f1001id;
    }
}
