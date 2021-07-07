package com.p118pd.sdk;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.markers.KMutableMap;

/* renamed from: com.pd.sdk.o0OO00oO  reason: case insensitive filesystem */
public class C7367o0OO00oO {
    public static <T extends Throwable> T OooO00o(T t) {
        return (T) o0O0OO00.OooO00o((Throwable) t, C7367o0OO00oO.class.getName());
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static Iterator m18898OooO0O0(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e) {
            throw OooO00o(e);
        }
    }

    public static boolean OooO0OO(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof O0OO0o) || (obj instanceof AbstractC7613o0oO0O0O));
    }

    public static boolean OooO0Oo(Object obj) {
        return (obj instanceof List) && (!(obj instanceof O0OO0o) || (obj instanceof O0OO0OO));
    }

    public static boolean OooO0o(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof O0OO0o) || (obj instanceof KMutableMap));
    }

    public static boolean OooO0o0(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof O0OO0o) || (obj instanceof AbstractC7615o0oO0Oo0));
    }

    public static boolean OooO0oO(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof O0OO0o) || (obj instanceof KMutableMap.OooO00o));
    }

    public static boolean OooO0oo(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof O0OO0o) || (obj instanceof O0OOO));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18894OooO00o(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        OooO00o(name + " cannot be cast to " + str);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static ListIterator m18900OooO0O0(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e) {
            throw OooO00o(e);
        }
    }

    public static void OooO00o(String str) {
        throw OooO00o(new ClassCastException(str));
    }

    public static ClassCastException OooO00o(ClassCastException classCastException) {
        throw ((ClassCastException) OooO00o((Throwable) classCastException));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m18904OooO0O0(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof O0OO0o) || (obj instanceof o0OO0O00));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Iterator m18882OooO00o(Object obj) {
        if ((obj instanceof O0OO0o) && !(obj instanceof AbstractC7613o0oO0O0O)) {
            m18894OooO00o(obj, "kotlin.collections.MutableIterator");
        }
        return m18898OooO0O0(obj);
    }

    public static Iterable OooO0O0(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw OooO00o(e);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static Collection m18897OooO0O0(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw OooO00o(e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Iterator m18883OooO00o(Object obj, String str) {
        if ((obj instanceof O0OO0o) && !(obj instanceof AbstractC7613o0oO0O0O)) {
            OooO00o(str);
        }
        return m18898OooO0O0(obj);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static List m18899OooO0O0(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw OooO00o(e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ListIterator m18886OooO00o(Object obj) {
        if ((obj instanceof O0OO0o) && !(obj instanceof AbstractC7615o0oO0Oo0)) {
            m18894OooO00o(obj, "kotlin.collections.MutableListIterator");
        }
        return m18900OooO0O0(obj);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static Set m18903OooO0O0(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw OooO00o(e);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static Map m18902OooO0O0(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw OooO00o(e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ListIterator m18887OooO00o(Object obj, String str) {
        if ((obj instanceof O0OO0o) && !(obj instanceof AbstractC7615o0oO0Oo0)) {
            OooO00o(str);
        }
        return m18900OooO0O0(obj);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static Map.Entry m18901OooO0O0(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw OooO00o(e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Iterable m18879OooO00o(Object obj) {
        if ((obj instanceof O0OO0o) && !(obj instanceof o0OO0O00)) {
            m18894OooO00o(obj, "kotlin.collections.MutableIterable");
        }
        return OooO0O0(obj);
    }

    public static Iterable OooO00o(Object obj, String str) {
        if ((obj instanceof O0OO0o) && !(obj instanceof o0OO0O00)) {
            OooO00o(str);
        }
        return OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18895OooO00o(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof O0OO0o) || (obj instanceof O0OO0O0));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Collection m18880OooO00o(Object obj) {
        if ((obj instanceof O0OO0o) && !(obj instanceof O0OO0O0)) {
            m18894OooO00o(obj, "kotlin.collections.MutableCollection");
        }
        return m18897OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Collection m18881OooO00o(Object obj, String str) {
        if ((obj instanceof O0OO0o) && !(obj instanceof O0OO0O0)) {
            OooO00o(str);
        }
        return m18897OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static List m18884OooO00o(Object obj) {
        if ((obj instanceof O0OO0o) && !(obj instanceof O0OO0OO)) {
            m18894OooO00o(obj, "kotlin.collections.MutableList");
        }
        return m18899OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static List m18885OooO00o(Object obj, String str) {
        if ((obj instanceof O0OO0o) && !(obj instanceof O0OO0OO)) {
            OooO00o(str);
        }
        return m18899OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Set m18892OooO00o(Object obj) {
        if ((obj instanceof O0OO0o) && !(obj instanceof O0OOO)) {
            m18894OooO00o(obj, "kotlin.collections.MutableSet");
        }
        return m18903OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Set m18893OooO00o(Object obj, String str) {
        if ((obj instanceof O0OO0o) && !(obj instanceof O0OOO)) {
            OooO00o(str);
        }
        return m18903OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map m18890OooO00o(Object obj) {
        if ((obj instanceof O0OO0o) && !(obj instanceof KMutableMap)) {
            m18894OooO00o(obj, "kotlin.collections.MutableMap");
        }
        return m18902OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map m18891OooO00o(Object obj, String str) {
        if ((obj instanceof O0OO0o) && !(obj instanceof KMutableMap)) {
            OooO00o(str);
        }
        return m18902OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map.Entry m18888OooO00o(Object obj) {
        if ((obj instanceof O0OO0o) && !(obj instanceof KMutableMap.OooO00o)) {
            m18894OooO00o(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return m18901OooO0O0(obj);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Map.Entry m18889OooO00o(Object obj, String str) {
        if ((obj instanceof O0OO0o) && !(obj instanceof KMutableMap.OooO00o)) {
            OooO00o(str);
        }
        return m18901OooO0O0(obj);
    }

    public static int OooO00o(Object obj) {
        if (obj instanceof o0O0O0O0) {
            return ((o0O0O0O0) obj).getArity();
        }
        if (obj instanceof O00O0000) {
            return 0;
        }
        if (obj instanceof O00O0OOO) {
            return 1;
        }
        if (obj instanceof O00Oo000) {
            return 2;
        }
        if (obj instanceof O00Oo00O) {
            return 3;
        }
        if (obj instanceof O00Oo0O) {
            return 4;
        }
        if (obj instanceof O00Oo0O0) {
            return 5;
        }
        if (obj instanceof O00oo0oO) {
            return 6;
        }
        if (obj instanceof O00OOO) {
            return 7;
        }
        if (obj instanceof O00OOO0) {
            return 8;
        }
        if (obj instanceof O00OoO00) {
            return 9;
        }
        if (obj instanceof O00O000O) {
            return 10;
        }
        if (obj instanceof O00O00O) {
            return 11;
        }
        if (obj instanceof O00O00O0) {
            return 12;
        }
        if (obj instanceof O00O00OO) {
            return 13;
        }
        if (obj instanceof O00O0O) {
            return 14;
        }
        if (obj instanceof O00O0O0) {
            return 15;
        }
        if (obj instanceof O00O0O00) {
            return 16;
        }
        if (obj instanceof O00O0O0O) {
            return 17;
        }
        if (obj instanceof O00O0oO) {
            return 18;
        }
        if (obj instanceof O00O0OO0) {
            return 19;
        }
        if (obj instanceof O00OO) {
            return 20;
        }
        if (obj instanceof O00OO0) {
            return 21;
        }
        return obj instanceof O00OO00 ? 22 : -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18896OooO00o(Object obj, int i) {
        return (obj instanceof AbstractC9139oooO0o0O) && OooO00o(obj) == i;
    }

    public static Object OooO00o(Object obj, int i) {
        if (obj != null && !m18896OooO00o(obj, i)) {
            m18894OooO00o(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static Object OooO00o(Object obj, int i, String str) {
        if (obj != null && !m18896OooO00o(obj, i)) {
            OooO00o(str);
        }
        return obj;
    }
}
