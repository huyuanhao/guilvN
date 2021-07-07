package com.p118pd.sdk;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmField;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O000O000 */
public final class O000O000 {
    @JvmField
    @NotNull
    public static final O000O00 OooO00o;

    static {
        O000O00 o000o00;
        Object newInstance;
        Object newInstance2;
        int OooO00o2 = OooO00o();
        if (OooO00o2 >= 65544) {
            try {
                Object newInstance3 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                o0O0OO00.OooO00o(newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance3 != null) {
                    try {
                        o000o00 = (O000O00) newInstance3;
                        OooO00o = o000o00;
                    } catch (ClassCastException e) {
                        ClassLoader classLoader = newInstance3.getClass().getClassLoader();
                        ClassLoader classLoader2 = O000O00.class.getClassLoader();
                        Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                        o0O0OO00.OooO00o((Object) initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw initCause;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
            } catch (ClassNotFoundException unused) {
                try {
                    newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    o0O0OO00.OooO00o(newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance2 != null) {
                        o000o00 = (O000O00) newInstance2;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } catch (ClassCastException e2) {
                ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader4 = O000O00.class.getClassLoader();
                Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                o0O0OO00.OooO00o((Object) initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause2;
            }
        }
        if (OooO00o2 >= 65543) {
            try {
                Object newInstance4 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                o0O0OO00.OooO00o(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance4 != null) {
                    try {
                        o000o00 = (O000O00) newInstance4;
                        OooO00o = o000o00;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = O000O00.class.getClassLoader();
                        Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                        o0O0OO00.OooO00o((Object) initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw initCause3;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
            } catch (ClassNotFoundException unused3) {
                try {
                    newInstance = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    o0O0OO00.OooO00o(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance != null) {
                        o000o00 = (O000O00) newInstance;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            } catch (ClassCastException e4) {
                ClassLoader classLoader7 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader8 = O000O00.class.getClassLoader();
                Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                o0O0OO00.OooO00o((Object) initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause4;
            }
        }
        o000o00 = new O000O00();
        OooO00o = o000o00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    public static final <T> T OooO00o(Object obj) {
        try {
            o0O0OO00.OooO00o(1, "T");
            return obj;
        } catch (ClassCastException e) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            o0O0OO00.OooO00o(4, "T");
            ClassLoader classLoader2 = Object.class.getClassLoader();
            Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
            o0O0OO00.OooO00o((Object) initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
            throw initCause;
        }
    }

    public static final int OooO00o() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int OooO00o2 = StringsKt__StringsKt.OooO00o((CharSequence) property, '.', 0, false, 6, (Object) null);
        if (OooO00o2 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = OooO00o2 + 1;
            int OooO00o3 = StringsKt__StringsKt.OooO00o((CharSequence) property, '.', i, false, 4, (Object) null);
            if (OooO00o3 < 0) {
                OooO00o3 = property.length();
            }
            if (property != null) {
                String substring = property.substring(0, OooO00o2);
                o0O0OO00.OooO00o((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (property != null) {
                    String substring2 = property.substring(i, OooO00o3);
                    o0O0OO00.OooO00o((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    try {
                        return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                    } catch (NumberFormatException unused2) {
                        return 65542;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    @SinceKotlin(version = "1.2")
    @PublishedApi
    public static final boolean OooO00o(int i, int i2, int i3) {
        return KotlinVersion.f22702OooO00o.m21209OooO00o(i, i2, i3);
    }
}
