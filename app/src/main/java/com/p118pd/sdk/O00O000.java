package com.p118pd.sdk;

import java.lang.annotation.Annotation;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "JvmClassMappingKt")
/* renamed from: com.pd.sdk.O00O000 */
public final class O00O000 {
    @JvmName(name = "getJavaClass")
    @NotNull
    public static final <T> Class<T> OooO00o(@NotNull KClass<T> oo00oooo) {
        o0O0OO00.OooO0o(oo00oooo, "receiver$0");
        Class<T> cls = (Class<T>) ((O0O00oo) oo00oooo).OooO00o();
        if (cls != null) {
            return cls;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    @NotNull
    public static final <T> Class<T> OooO0O0(@NotNull KClass<T> oo00oooo) {
        o0O0OO00.OooO0o(oo00oooo, "receiver$0");
        Class<T> cls = (Class<T>) ((O0O00oo) oo00oooo).OooO00o();
        if (cls.isPrimitive()) {
            String name = cls.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            cls = (Class<T>) Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            cls = (Class<T>) Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            cls = (Class<T>) Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            cls = (Class<T>) Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            cls = (Class<T>) Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            cls = (Class<T>) Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            cls = (Class<T>) Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            cls = (Class<T>) Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            cls = (Class<T>) Short.class;
                            break;
                        }
                        break;
                }
            }
            if (cls != null) {
                return cls;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (cls != null) {
            return cls;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }

    @Nullable
    public static final <T> Class<T> OooO0OO(@NotNull KClass<T> oo00oooo) {
        o0O0OO00.OooO0o(oo00oooo, "receiver$0");
        Class<T> cls = (Class<T>) ((O0O00oo) oo00oooo).OooO00o();
        if (!cls.isPrimitive()) {
            String name = cls.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -2056817302:
                        if (name.equals("java.lang.Integer")) {
                            return Integer.TYPE;
                        }
                        break;
                    case -527879800:
                        if (name.equals("java.lang.Float")) {
                            return Float.TYPE;
                        }
                        break;
                    case -515992664:
                        if (name.equals("java.lang.Short")) {
                            return Short.TYPE;
                        }
                        break;
                    case 155276373:
                        if (name.equals("java.lang.Character")) {
                            return Character.TYPE;
                        }
                        break;
                    case 344809556:
                        if (name.equals("java.lang.Boolean")) {
                            return Boolean.TYPE;
                        }
                        break;
                    case 398507100:
                        if (name.equals("java.lang.Byte")) {
                            return Byte.TYPE;
                        }
                        break;
                    case 398795216:
                        if (name.equals("java.lang.Long")) {
                            return Long.TYPE;
                        }
                        break;
                    case 399092968:
                        if (name.equals("java.lang.Void")) {
                            return Void.TYPE;
                        }
                        break;
                    case 761287205:
                        if (name.equals("java.lang.Double")) {
                            return Double.TYPE;
                        }
                        break;
                }
            }
            return null;
        } else if (cls != null) {
            return cls;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }

    @JvmName(name = "getRuntimeClassOfKClassInstance")
    @NotNull
    public static final <T> Class<KClass<T>> OooO0Oo(@NotNull KClass<T> oo00oooo) {
        o0O0OO00.OooO0o(oo00oooo, "receiver$0");
        Class<KClass<T>> cls = (Class<KClass<T>>) oo00oooo.getClass();
        if (cls != null) {
            return cls;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T>>");
    }

    @JvmName(name = "getKotlinClass")
    @NotNull
    public static final <T> KClass<T> OooO00o(@NotNull Class<T> cls) {
        o0O0OO00.OooO0o(cls, "receiver$0");
        return O0OO00.OooO0O0(cls);
    }

    @NotNull
    public static final <T> Class<T> OooO00o(@NotNull T t) {
        o0O0OO00.OooO0o(t, "receiver$0");
        Class<T> cls = (Class<T>) t.getClass();
        if (cls != null) {
            return cls;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    public static final <T> boolean OooO00o(@NotNull Object[] objArr) {
        o0O0OO00.OooO00o(4, "T");
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }

    @NotNull
    public static final <T extends Annotation> KClass<? extends T> OooO00o(@NotNull T t) {
        o0O0OO00.OooO0o(t, "receiver$0");
        Class<? extends Annotation> annotationType = t.annotationType();
        o0O0OO00.OooO00o((Object) annotationType, "(this as java.lang.annot…otation).annotationType()");
        KClass<? extends T> OooO00o = OooO00o((Class) annotationType);
        if (OooO00o != null) {
            return OooO00o;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
    }
}
