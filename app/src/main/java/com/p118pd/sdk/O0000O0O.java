package com.p118pd.sdk;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.O0000O0O */
public final class O0000O0O {
    public static final int OooO00o = 1;

    @SinceKotlin(version = "1.3")
    @JvmName(name = "getStackTraceElement")
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final StackTraceElement m16499OooO00o(@NotNull BaseContinuationImpl baseContinuationImpl) {
        int i;
        o0O0OO00.OooO0o(baseContinuationImpl, "receiver$0");
        DebugMetadata OooO00o2 = m16500OooO00o(baseContinuationImpl);
        if (OooO00o2 == null) {
            return null;
        }
        OooO00o(1, OooO00o2.mo43390v());
        int OooO00o3 = OooO00o(baseContinuationImpl);
        if (OooO00o3 < 0) {
            i = -1;
        } else {
            i = OooO00o2.mo43386l()[OooO00o3];
        }
        return new StackTraceElement(OooO00o2.mo43383c(), OooO00o2.mo43387m(), OooO00o2.mo43384f(), i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final DebugMetadata m16500OooO00o(@NotNull BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    public static final int OooO00o(@NotNull BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            o0O0OO00.OooO00o((Object) declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final void OooO00o(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "getSpilledVariableFieldMapping")
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final String[] m16501OooO00o(@NotNull BaseContinuationImpl baseContinuationImpl) {
        o0O0OO00.OooO0o(baseContinuationImpl, "receiver$0");
        DebugMetadata OooO00o2 = m16500OooO00o(baseContinuationImpl);
        if (OooO00o2 == null) {
            return null;
        }
        OooO00o(1, OooO00o2.mo43390v());
        ArrayList arrayList = new ArrayList();
        int OooO00o3 = OooO00o(baseContinuationImpl);
        int[] i = OooO00o2.mo43385i();
        int length = i.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i[i2] == OooO00o3) {
                arrayList.add(OooO00o2.mo43389s()[i2]);
                arrayList.add(OooO00o2.mo43388n()[i2]);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
