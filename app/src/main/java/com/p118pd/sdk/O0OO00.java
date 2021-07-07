package com.p118pd.sdk;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;

/* renamed from: com.pd.sdk.O0OO00 */
public class O0OO00 {
    public static final O0OO000 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f16956OooO00o = " (Kotlin reflection is not available)";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final KClass[] f16957OooO00o = new KClass[0];

    static {
        O0OO000 o0oo000 = null;
        try {
            o0oo000 = (O0OO000) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (o0oo000 == null) {
            o0oo000 = new O0OO000();
        }
        OooO00o = o0oo000;
    }

    public static KClass OooO00o(Class cls) {
        return OooO00o.OooO00o(cls);
    }

    public static KClass OooO0O0(Class cls) {
        return OooO00o.OooO0O0(cls);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static KClass m16518OooO00o(Class cls, String str) {
        return OooO00o.m16519OooO00o(cls, str);
    }

    public static KClass OooO0O0(Class cls, String str) {
        return OooO00o.OooO0O0(cls, str);
    }

    public static OO0O0 OooO00o(Class cls, String str) {
        return OooO00o.OooO00o(cls, str);
    }

    public static KClass[] OooO00o(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f16957OooO00o;
        }
        KClass[] oo00ooooArr = new KClass[length];
        for (int i = 0; i < length; i++) {
            oo00ooooArr[i] = OooO0O0(clsArr[i]);
        }
        return oo00ooooArr;
    }

    @SinceKotlin(version = "1.1")
    public static String OooO00o(Lambda lambda) {
        return OooO00o.OooO00o(lambda);
    }

    @SinceKotlin(version = "1.3")
    public static String OooO00o(o0O0O0O0 o0o0o0o0) {
        return OooO00o.OooO00o(o0o0o0o0);
    }

    public static KFunction OooO00o(FunctionReference functionReference) {
        return OooO00o.OooO00o(functionReference);
    }

    public static KProperty0 OooO00o(PropertyReference0 propertyReference0) {
        return OooO00o.OooO00o(propertyReference0);
    }

    public static KMutableProperty0 OooO00o(MutablePropertyReference0 mutablePropertyReference0) {
        return OooO00o.OooO00o(mutablePropertyReference0);
    }

    public static KProperty1 OooO00o(PropertyReference1 propertyReference1) {
        return OooO00o.OooO00o(propertyReference1);
    }

    public static KMutableProperty1 OooO00o(MutablePropertyReference1 mutablePropertyReference1) {
        return OooO00o.OooO00o(mutablePropertyReference1);
    }

    public static KProperty2 OooO00o(PropertyReference2 propertyReference2) {
        return OooO00o.OooO00o(propertyReference2);
    }

    public static KMutableProperty2 OooO00o(MutablePropertyReference2 mutablePropertyReference2) {
        return OooO00o.OooO00o(mutablePropertyReference2);
    }
}
