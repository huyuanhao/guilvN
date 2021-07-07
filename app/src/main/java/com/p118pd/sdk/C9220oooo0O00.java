package com.p118pd.sdk;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0O00  reason: case insensitive filesystem */
public class C9220oooo0O00 extends C9206oooo0 {
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> OooO00o(@NotNull AbstractC9214oooo00Oo<T, ? extends K> oooo00oo, @NotNull O00Oo0O<? super K, ? super R, ? super T, ? super Boolean, ? extends R> o00Oo0O) {
        o0O0OO00.OooO0o(oooo00oo, "receiver$0");
        o0O0OO00.OooO0o(o00Oo0O, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> OooO00o = oooo00oo.OooO00o();
        while (OooO00o.hasNext()) {
            T next = OooO00o.next();
            Object obj = (Object) oooo00oo.OooO00o(next);
            Object obj2 = (Object) linkedHashMap.get(obj);
            linkedHashMap.put(obj, o00Oo0O.invoke(obj, obj2, next, Boolean.valueOf(obj2 == 0 && !linkedHashMap.containsKey(obj))));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: M extends java.util.Map<? super K, R> */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M OooO00o(@NotNull AbstractC9214oooo00Oo<T, ? extends K> oooo00oo, @NotNull M m, @NotNull O00Oo0O<? super K, ? super R, ? super T, ? super Boolean, ? extends R> o00Oo0O) {
        o0O0OO00.OooO0o(oooo00oo, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00Oo0O, "operation");
        Iterator<T> OooO00o = oooo00oo.OooO00o();
        while (OooO00o.hasNext()) {
            T next = OooO00o.next();
            Object obj = (Object) oooo00oo.OooO00o(next);
            Object obj2 = (Object) m.get(obj);
            m.put(obj, o00Oo0O.invoke(obj, obj2, next, Boolean.valueOf(obj2 == 0 && !m.containsKey(obj))));
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: M extends java.util.Map<? super K, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, M extends Map<? super K, Integer>> M OooO00o(@NotNull AbstractC9214oooo00Oo<T, ? extends K> oooo00oo, @NotNull M m) {
        o0O0OO00.OooO0o(oooo00oo, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        Iterator<T> OooO00o = oooo00oo.OooO00o();
        while (OooO00o.hasNext()) {
            Object OooO00o2 = oooo00oo.OooO00o(OooO00o.next());
            Object obj = m.get(OooO00o2);
            if (obj == null && !m.containsKey(OooO00o2)) {
                obj = 0;
            }
            m.put(OooO00o2, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> OooO00o(@NotNull AbstractC9214oooo00Oo<T, ? extends K> oooo00oo, @NotNull O00Oo000<? super K, ? super T, ? extends R> o00Oo000, @NotNull O00Oo00O<? super K, ? super R, ? super T, ? extends R> o00Oo00O) {
        o0O0OO00.OooO0o(oooo00oo, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "initialValueSelector");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> OooO00o = oooo00oo.OooO00o();
        while (OooO00o.hasNext()) {
            T next = OooO00o.next();
            Object obj = (Object) oooo00oo.OooO00o(next);
            Object obj2 = (Object) linkedHashMap.get(obj);
            if (obj2 == null && !linkedHashMap.containsKey(obj)) {
                obj2 = (Object) o00Oo000.invoke(obj, next);
            }
            linkedHashMap.put(obj, o00Oo00O.invoke(obj, obj2, next));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: M extends java.util.Map<? super K, R> */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M OooO00o(@NotNull AbstractC9214oooo00Oo<T, ? extends K> oooo00oo, @NotNull M m, @NotNull O00Oo000<? super K, ? super T, ? extends R> o00Oo000, @NotNull O00Oo00O<? super K, ? super R, ? super T, ? extends R> o00Oo00O) {
        o0O0OO00.OooO0o(oooo00oo, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00Oo000, "initialValueSelector");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        Iterator<T> OooO00o = oooo00oo.OooO00o();
        while (OooO00o.hasNext()) {
            T next = OooO00o.next();
            Object obj = (Object) oooo00oo.OooO00o(next);
            Object obj2 = (Object) m.get(obj);
            if (obj2 == null && !m.containsKey(obj)) {
                obj2 = (Object) o00Oo000.invoke(obj, next);
            }
            m.put(obj, o00Oo00O.invoke(obj, obj2, next));
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> OooO00o(@NotNull AbstractC9214oooo00Oo<T, ? extends K> oooo00oo, R r, @NotNull O00Oo000<? super R, ? super T, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(oooo00oo, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> OooO00o = oooo00oo.OooO00o();
        while (OooO00o.hasNext()) {
            T next = OooO00o.next();
            Object OooO00o2 = oooo00oo.OooO00o(next);
            R r2 = (Object) linkedHashMap.get(OooO00o2);
            if (r2 == null && !linkedHashMap.containsKey(OooO00o2)) {
                r2 = r;
            }
            linkedHashMap.put(OooO00o2, o00Oo000.invoke(r2, next));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: M extends java.util.Map<? super K, R> */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M OooO00o(@NotNull AbstractC9214oooo00Oo<T, ? extends K> oooo00oo, @NotNull M m, R r, @NotNull O00Oo000<? super R, ? super T, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(oooo00oo, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00Oo000, "operation");
        Iterator<T> OooO00o = oooo00oo.OooO00o();
        while (OooO00o.hasNext()) {
            T next = OooO00o.next();
            Object OooO00o2 = oooo00oo.OooO00o(next);
            R r2 = (Object) m.get(OooO00o2);
            if (r2 == null && !m.containsKey(OooO00o2)) {
                r2 = r;
            }
            m.put(OooO00o2, o00Oo000.invoke(r2, next));
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.pd.sdk.oooo00Oo<T extends S, ? extends K> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S, T extends S, K> Map<K, S> OooO00o(@NotNull AbstractC9214oooo00Oo<T, ? extends K> oooo00oo, @NotNull O00Oo00O<? super K, ? super S, ? super T, ? extends S> o00Oo00O) {
        o0O0OO00.OooO0o(oooo00oo, "receiver$0");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator OooO00o = oooo00oo.OooO00o();
        while (OooO00o.hasNext()) {
            Object obj = (Object) OooO00o.next();
            Object obj2 = (Object) oooo00oo.OooO00o(obj);
            Object obj3 = (Object) linkedHashMap.get(obj2);
            if (!(obj3 == 0 && !linkedHashMap.containsKey(obj2))) {
                obj = (Object) o00Oo00O.invoke(obj2, obj3, obj);
            }
            linkedHashMap.put(obj2, obj);
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.pd.sdk.oooo00Oo<T extends S, ? extends K> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: M extends java.util.Map<? super K, S> */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <S, T extends S, K, M extends Map<? super K, S>> M OooO00o(@NotNull AbstractC9214oooo00Oo<T, ? extends K> oooo00oo, @NotNull M m, @NotNull O00Oo00O<? super K, ? super S, ? super T, ? extends S> o00Oo00O) {
        o0O0OO00.OooO0o(oooo00oo, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        Iterator OooO00o = oooo00oo.OooO00o();
        while (OooO00o.hasNext()) {
            Object obj = (Object) OooO00o.next();
            Object obj2 = (Object) oooo00oo.OooO00o(obj);
            Object obj3 = (Object) m.get(obj2);
            if (!(obj3 == 0 && !m.containsKey(obj2))) {
                obj = (Object) o00Oo00O.invoke(obj2, obj3, obj);
            }
            m.put(obj2, obj);
        }
        return m;
    }
}
