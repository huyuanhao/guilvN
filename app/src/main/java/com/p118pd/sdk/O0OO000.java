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

/* renamed from: com.pd.sdk.O0OO000 */
public class O0OO000 {
    public static final String OooO00o = "kotlin.jvm.functions.";

    public KFunction OooO00o(FunctionReference functionReference) {
        return functionReference;
    }

    public KMutableProperty2 OooO00o(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public KProperty2 OooO00o(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public KProperty1 OooO00o(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public KClass OooO00o(Class cls) {
        return new o0O00OO0(cls);
    }

    public KMutableProperty0 OooO00o(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public KMutableProperty1 OooO00o(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public KProperty0 OooO00o(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public KClass OooO0O0(Class cls) {
        return new o0O00OO0(cls);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public KClass m16519OooO00o(Class cls, String str) {
        return new o0O00OO0(cls);
    }

    public KClass OooO0O0(Class cls, String str) {
        return new o0O00OO0(cls);
    }

    public OO0O0 OooO00o(Class cls, String str) {
        return new O0OO(cls, str);
    }

    @SinceKotlin(version = "1.1")
    public String OooO00o(Lambda lambda) {
        return OooO00o((o0O0O0O0) lambda);
    }

    @SinceKotlin(version = "1.3")
    public String OooO00o(o0O0O0O0 o0o0o0o0) {
        String obj = o0o0o0o0.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(OooO00o) ? obj.substring(21) : obj;
    }
}
