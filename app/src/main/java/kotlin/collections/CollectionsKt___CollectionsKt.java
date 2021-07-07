package kotlin.collections;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.BaseViewManager;
import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.AbstractC9214oooo00Oo;
import com.p118pd.sdk.C8314oOo0o0oo;
import com.p118pd.sdk.C9163oooOOO0O;
import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.C9188oooOoOoo;
import com.p118pd.sdk.C9201oooOooOo;
import com.p118pd.sdk.C9202oooOooo;
import com.p118pd.sdk.C9207oooo00;
import com.p118pd.sdk.C9209oooo0000;
import com.p118pd.sdk.C9210oooo000O;
import com.p118pd.sdk.C9219oooo0O0;
import com.p118pd.sdk.C9221oooo0O0O;
import com.p118pd.sdk.C9232oooo0o00;
import com.p118pd.sdk.C9233oooo0o0o;
import com.p118pd.sdk.C9237oooo0oo;
import com.p118pd.sdk.C9239oooo0ooO;
import com.p118pd.sdk.C9250ooooO0oO;
import com.p118pd.sdk.O000O000;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.O00Oo00O;
import com.p118pd.sdk.O0O0O0;
import com.p118pd.sdk.o0O0OO00;
import com.p118pd.sdk.oO00O000;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt___SequencesKt;

public class CollectionsKt___CollectionsKt extends C9207oooo00 {

    public static final class OooO00o implements AbstractC7873oO0OOo00<T> {
        public final /* synthetic */ Iterable OooO00o;

        public OooO00o(Iterable iterable) {
            this.OooO00o = iterable;
        }

        @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
        public Iterator<T> iterator() {
            return this.OooO00o.iterator();
        }
    }

    public static final class OooO0O0 implements AbstractC9214oooo00Oo<T, K> {
        public final /* synthetic */ O00O0OOO OooO00o;

        /* renamed from: OooO00o */
        public final /* synthetic */ Iterable f23862OooO00o;

        public OooO0O0(Iterable<? extends T> iterable, O00O0OOO o00o0ooo) {
            this.f23862OooO00o = iterable;
            this.OooO00o = o00o0ooo;
        }

        @Override // com.p118pd.sdk.AbstractC9214oooo00Oo
        public Iterator<T> OooO00o() {
            return this.f23862OooO00o.iterator();
        }

        @Override // com.p118pd.sdk.AbstractC9214oooo00Oo
        public K OooO00o(T t) {
            return (K) this.OooO00o.invoke(t);
        }
    }

    public static final <T> T OooO(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(list.size() - 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Iterable<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public static final <T> Iterable<T> m22712OooO00o(Iterable<? extends T> iterable) {
        return iterable;
    }

    public static final <T> T OooO00o(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        return (T) list.get(0);
    }

    public static final <T> T OooO0O0(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        return (T) list.get(1);
    }

    public static final <T> T OooO0OO(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        return (T) list.get(2);
    }

    public static final <T> T OooO0Oo(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        return (T) list.get(3);
    }

    public static final <T> T OooO0o(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        if (!list.isEmpty()) {
            return (T) list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T OooO0o0(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        return (T) list.get(4);
    }

    public static final <T> T OooO0oO(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(0);
    }

    public static final <T> T OooO0oo(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        if (!list.isEmpty()) {
            return (T) list.get(CollectionsKt__CollectionsKt.OooO00o((List) list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T OooOO0(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return (T) list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static final <T> T OooOO0O(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        if (list.size() == 1) {
            return (T) list.get(0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T OooO(java.lang.Iterable<? extends T> r4, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r5) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r4, r0)
            java.lang.String r0 = "predicate"
            com.p118pd.sdk.o0O0OO00.OooO0o(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = 0
        L_0x0010:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0034
            java.lang.Object r2 = r4.next()
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0010
            if (r1 != 0) goto L_0x002c
            r0 = 1
            r0 = r2
            r1 = 1
            goto L_0x0010
        L_0x002c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Collection contains more than one matching element."
            r4.<init>(r5)
            throw r4
        L_0x0034:
            if (r1 == 0) goto L_0x0037
            return r0
        L_0x0037:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Collection contains no element matching the predicate."
            r4.<init>(r5)
            goto L_0x0040
        L_0x003f:
            throw r4
        L_0x0040:
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.OooO(java.lang.Iterable, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    /* renamed from: OooO00o */
    public static final <T> boolean m22735OooO00o(Iterable<? extends T> iterable, T t) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return OooO00o(iterable, t) >= 0;
    }

    public static final <T> T OooO0O0(List<? extends T> list, int i) {
        return (T) list.get(i);
    }

    public static final <T> T OooO0OO(List<? extends T> list, int i) {
        return (T) OooO0Oo((List) list, i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: OooO0Oo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m22773OooO0Oo(java.lang.Iterable<? extends T> r2, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r3) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r2, r0)
            java.lang.String r0 = "predicate"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x000e
            return r0
        L_0x0025:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m22773OooO0Oo(java.lang.Iterable, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T OooO0o0(java.lang.Iterable<? extends T> r4, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r5) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r4, r0)
            java.lang.String r0 = "predicate"
            com.p118pd.sdk.o0O0OO00.OooO0o(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = 0
        L_0x0010:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x002a
            java.lang.Object r2 = r4.next()
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0010
            r0 = 1
            r0 = r2
            r1 = 1
            goto L_0x0010
        L_0x002a:
            if (r1 == 0) goto L_0x002d
            return r0
        L_0x002d:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Collection contains no element matching the predicate."
            r4.<init>(r5)
            goto L_0x0036
        L_0x0035:
            throw r4
        L_0x0036:
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.OooO0o0(java.lang.Iterable, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    /* renamed from: OooO0oO */
    public static final <T extends Comparable<? super T>> List<T> m22787OooO0oO(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return OooO(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                Comparable[] comparableArr = (Comparable[]) array;
                if (comparableArr != null) {
                    C9188oooOoOoo.m21019OooO00o((Object[]) comparableArr);
                    return C9188oooOoOoo.OooO00o((Object[]) comparableArr);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> OooOO0 = OooOO0(iterable);
            C9209oooo0000.OooO0O0((List) OooOO0);
            return OooOO0;
        }
    }

    public static final <T> List<Pair<T, T>> OooOO0O(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList.add(C9163oooOOO0O.OooO00o(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T> T OooO0O0(Iterable<? extends T> iterable, int i) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof List) {
            return (T) OooO0Oo((List) iterable, i);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: OooO0OO */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m22765OooO0OO(java.lang.Iterable<? extends T> r2, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r3) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r2, r0)
            java.lang.String r0 = "predicate"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x000e
            return r0
        L_0x0025:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r3 = "Collection contains no element matching the predicate."
            r2.<init>(r3)
            goto L_0x002e
        L_0x002d:
            throw r2
        L_0x002e:
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m22765OooO0OO(java.lang.Iterable, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    public static final <T> T OooO0Oo(List<? extends T> list, int i) {
        o0O0OO00.OooO0o(list, "receiver$0");
        if (i < 0 || i > CollectionsKt__CollectionsKt.OooO00o((List) list)) {
            return null;
        }
        return (T) list.get(i);
    }

    /* renamed from: OooO0Oo */
    public static final <T> T m22772OooO0Oo(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (T) it.next();
        while (it.hasNext()) {
            t = (T) it.next();
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T OooO0o(java.lang.Iterable<? extends T> r3, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r4) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            java.lang.String r0 = "predicate"
            com.p118pd.sdk.o0O0OO00.OooO0o(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L_0x000f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x000f
            r0 = r1
            goto L_0x000f
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.OooO0o(java.lang.Iterable, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    /* renamed from: OooO0oo */
    public static final <T, R extends Comparable<? super R>> List<T> m22789OooO0oo(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        return m22724OooO00o((Iterable) iterable, (Comparator) new C9250ooooO0oO.OooO0O0(o00o0ooo));
    }

    public static final <T> T OooO00o(Iterable<? extends T> iterable, int i) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        return iterable instanceof List ? (T) ((List) iterable).get(i) : (T) OooO00o((Iterable) iterable, i, (O00O0OOO) new CollectionsKt___CollectionsKt$elementAt$1(i));
    }

    public static final <T> int OooO0OO(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        int i = -1;
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (i2 < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            if (o00o0ooo.invoke(obj).booleanValue()) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: OooO0o0 */
    public static final <T> T m22782OooO0o0(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof List) {
            return (T) OooOO0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t = (T) it.next();
            if (!it.hasNext()) {
                return t;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T extends Comparable<? super T>> List<T> OooO0oo(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        return m22724OooO00o((Iterable) iterable, C9250ooooO0oO.OooO0Oo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T OooOO0(java.lang.Iterable<? extends T> r5, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r6) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r5, r0)
            java.lang.String r0 = "predicate"
            com.p118pd.sdk.o0O0OO00.OooO0o(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L_0x0011:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r5.next()
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x002a
            return r0
        L_0x002a:
            r1 = 1
            r2 = r3
            goto L_0x0011
        L_0x002d:
            if (r1 != 0) goto L_0x0030
            return r0
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.OooOO0(java.lang.Iterable, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    /* renamed from: OooO */
    public static final <T, R extends Comparable<? super R>> List<T> m22702OooO(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        return m22724OooO00o((Iterable) iterable, (Comparator) new C9250ooooO0oO.C9251OooO0Oo(o00o0ooo));
    }

    /* renamed from: OooO0o */
    public static final <T> T m22779OooO0o(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (T) it.next();
        if (it.hasNext()) {
            return null;
        }
        return t;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0020 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: ? super T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Comparable */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Comparable */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: ? super T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: ? super T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R extends Comparable<? super R>> T OooO0oo(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (Object) it.next();
        Comparable comparable = (Comparable) o00o0ooo.invoke(obj);
        while (it.hasNext()) {
            Object obj2 = (Object) it.next();
            Comparable comparable2 = (Comparable) o00o0ooo.invoke(obj2);
            if (comparable.compareTo(comparable2) > 0) {
                obj = (T) obj2;
                comparable = comparable2;
            }
        }
        return obj;
    }

    public static final <T> List<T> OooO(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.m22697OooO00o(OooOO0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        if (size != 1) {
            return m22725OooO00o(collection);
        }
        return C9201oooOooOo.OooO00o(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: OooOO0 */
    public static final <T> List<T> m22790OooOO0(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (!o00o0ooo.invoke(obj).booleanValue()) {
                break;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final <T> T OooO00o(Iterable<? extends T> iterable, int i, O00O0OOO<? super Integer, ? extends T> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i < 0 || i > CollectionsKt__CollectionsKt.OooO00o(list)) ? (T) o00o0ooo.invoke(Integer.valueOf(i)) : (T) list.get(i);
        } else if (i < 0) {
            return (T) o00o0ooo.invoke(Integer.valueOf(i));
        } else {
            int i2 = 0;
            for (T t : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return t;
                }
                i2 = i3;
            }
            return (T) o00o0ooo.invoke(Integer.valueOf(i));
        }
    }

    /* renamed from: OooO0O0 */
    public static final <T> T m22749OooO0O0(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (T) it.next();
    }

    /* renamed from: OooO0OO */
    public static final <T> T m22764OooO0OO(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof List) {
            return (T) OooO0oo((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t = (T) it.next();
            while (it.hasNext()) {
                t = (T) it.next();
            }
            return t;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: OooO0oO */
    public static final <T, R> List<R> m22788OooO0oO(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object invoke = o00o0ooo.invoke((Object) it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    /* renamed from: OooO0Oo */
    public static final <R> List<R> m22774OooO0Oo(Iterable<?> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            o0O0OO00.OooO00o(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: OooO0o */
    public static final <T> List<T> m22780OooO0o(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return OooO(iterable);
        }
        List<T> OooOO0 = OooOO0(iterable);
        C9207oooo00.OooO0OO((List) OooOO0);
        return OooOO0;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0020 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: ? super T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Comparable */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Comparable */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: ? super T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: ? super T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R extends Comparable<? super R>> T OooO0oO(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (Object) it.next();
        Comparable comparable = (Comparable) o00o0ooo.invoke(obj);
        while (it.hasNext()) {
            Object obj2 = (Object) it.next();
            Comparable comparable2 = (Comparable) o00o0ooo.invoke(obj2);
            if (comparable.compareTo(comparable2) < 0) {
                obj = (T) obj2;
                comparable = comparable2;
            }
        }
        return obj;
    }

    public static final <T> List<T> OooOO0(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            return m22725OooO00o((Collection) iterable);
        }
        return (List) OooO0OO((Iterable) iterable, (Collection) new ArrayList());
    }

    /* renamed from: OooO0Oo */
    public static final <T> List<T> m22775OooO0Oo(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (!o00o0ooo.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: OooO0o0 */
    public static final <T> List<T> m22783OooO0o0(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        return (List) OooO0O0((Iterable) iterable, (Collection) new ArrayList());
    }

    /* renamed from: OooO0o0 */
    public static final <T, R> List<R> m22784OooO0o0(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends Iterable<? extends R>> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C9210oooo000O.m21074OooO00o((Collection) arrayList, (Iterable) o00o0ooo.invoke((Object) it.next()));
        }
        return arrayList;
    }

    public static final <T> T OooO0O0(List<? extends T> list, int i, O00O0OOO<? super Integer, ? extends T> o00o0ooo) {
        return (i < 0 || i > CollectionsKt__CollectionsKt.OooO00o(list)) ? (T) o00o0ooo.invoke(Integer.valueOf(i)) : (T) list.get(i);
    }

    /* renamed from: OooO0Oo */
    public static final <T extends Comparable<? super T>> void m22777OooO0Oo(List<T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        C9209oooo0000.OooO0O0(list, C9250ooooO0oO.OooO0Oo());
    }

    /* renamed from: OooO0o */
    public static final <T, R> List<R> m22781OooO0o(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList(C9202oooOooo.OooO00o(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(o00o0ooo.invoke((Object) it.next()));
        }
        return arrayList;
    }

    public static final <T> T OooO00o(List<? extends T> list, int i, O00O0OOO<? super Integer, ? extends T> o00o0ooo) {
        return (i < 0 || i > CollectionsKt__CollectionsKt.OooO00o(list)) ? (T) o00o0ooo.invoke(Integer.valueOf(i)) : (T) list.get(i);
    }

    public static final <T> int OooO0O0(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (i < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            if (o00o0ooo.invoke(obj).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T OooO0OO(java.util.List<? extends T> r2, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r3) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r2, r0)
            java.lang.String r0 = "predicate"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
        L_0x0012:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r2.previous()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0012
            return r0
        L_0x0029:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.OooO0OO(java.util.List, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO0Oo */
    public static final <T, K> Map<K, List<T>> m22776OooO0Oo(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            Object invoke = o00o0ooo.invoke(obj);
            Object obj2 = linkedHashMap.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(invoke, obj2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    /* renamed from: OooO00o */
    public static final <T> T m22714OooO00o(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof List) {
            return (T) OooO0o((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final double OooO0o(Iterable<Short> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        int i = 0;
        for (Short sh : iterable) {
            double shortValue = (double) sh.shortValue();
            Double.isNaN(shortValue);
            d += shortValue;
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22699OooO00o();
            }
        }
        if (i == 0) {
            return O0O0O0.f16953OooO00o.OooO0Oo();
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        return d / d2;
    }

    public static final <T, R, C extends Collection<? super R>> C OooO0o0(Iterable<? extends T> iterable, C c, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(o00o0ooo.invoke((Object) it.next()));
        }
        return c;
    }

    public static final <T> int OooO0O0(List<? extends T> list, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (o00o0ooo.invoke((Object) listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: OooO0OO */
    public static final <T> List<T> m22767OooO0OO(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (o00o0ooo.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: OooO0o0 */
    public static final <T> boolean m22786OooO0o0(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (o00o0ooo.invoke((Object) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final double OooO0oO(Iterable<Double> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        for (Double d2 : iterable) {
            d += d2.doubleValue();
        }
        return d;
    }

    public static final <T> int OooO00o(Iterable<? extends T> iterable, T t) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22701OooO0O0();
            }
            if (o0O0OO00.OooO00o((Object) t, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> List<T> OooO0OO(Iterable<? extends T> iterable, int i) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return OooO(iterable);
                }
                if (i == 1) {
                    return C9201oooOooOo.OooO00o(m22714OooO00o((Iterable) iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object obj : iterable) {
                int i3 = i2 + 1;
                if (i2 == i) {
                    break;
                }
                arrayList.add(obj);
                i2 = i3;
            }
            return CollectionsKt__CollectionsKt.m22697OooO00o((List) arrayList);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO0o0 */
    public static final <T> List<T> m22785OooO0o0(List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: OooO0O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m22751OooO0O0(java.util.List<? extends T> r2, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r3) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r2, r0)
            java.lang.String r0 = "predicate"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
        L_0x0012:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r2.previous()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0012
            return r0
        L_0x0029:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r3 = "List contains no element matching the predicate."
            r2.<init>(r3)
            goto L_0x0032
        L_0x0031:
            throw r2
        L_0x0032:
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m22751OooO0O0(java.util.List, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super K, java.util.List<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, M extends Map<? super K, List<T>>> M OooO0Oo(Iterable<? extends T> iterable, M m, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            Object invoke = o00o0ooo.invoke(obj);
            Object obj2 = m.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                m.put(invoke, obj2);
            }
            ((List) obj2).add(obj);
        }
        return m;
    }

    public static final double OooO0o0(Iterable<Long> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        int i = 0;
        for (Long l : iterable) {
            double longValue = (double) l.longValue();
            Double.isNaN(longValue);
            d += longValue;
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22699OooO00o();
            }
        }
        if (i == 0) {
            return O0O0O0.f16953OooO00o.OooO0Oo();
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        return d / d2;
    }

    public static final <T> int OooO00o(List<? extends T> list, T t) {
        o0O0OO00.OooO0o(list, "receiver$0");
        return list.indexOf(t);
    }

    public static final <T> int OooO00o(List<? extends T> list, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o00o0ooo.invoke((Object) it.next()).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int OooO0O0(Iterable<? extends T> iterable, T t) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t);
        }
        int i = -1;
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m22701OooO0O0();
            }
            if (o0O0OO00.OooO00o((Object) t, obj)) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: OooO00o */
    public static final <T> T m22716OooO00o(Collection<? extends T> collection) {
        return (T) OooO00o((Collection) collection, (Random) Random.f16961OooO00o);
    }

    public static final <T> T OooO00o(Collection<? extends T> collection, Random oo) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(oo, "random");
        if (!collection.isEmpty()) {
            return (T) OooO00o((Iterable) collection, oo.OooO0O0(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO0OO */
    public static final <K, V> Map<K, V> m22768OooO0OO(Iterable<? extends K> iterable, O00O0OOO<? super K, ? extends V> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(oO00O000.OooO00o(C9232oooo0o00.OooO00o(C9202oooOooo.OooO00o(iterable, 10)), 16));
        Iterator<? extends K> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            linkedHashMap.put(obj, o00o0ooo.invoke(obj));
        }
        return linkedHashMap;
    }

    /* renamed from: OooO0Oo */
    public static final <T> boolean m22778OooO0Oo(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (o00o0ooo.invoke((Object) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> int OooO0O0(List<? extends T> list, T t) {
        o0O0OO00.OooO0o(list, "receiver$0");
        return list.lastIndexOf(t);
    }

    public static final <T> List<T> OooO00o(List<? extends T> list, int i) {
        o0O0OO00.OooO0o(list, "receiver$0");
        if (i >= 0) {
            return OooO0OO((Iterable) list, oO00O000.OooO00o(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: OooO0O0 */
    public static final <T> List<T> m22752OooO0O0(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        o0O0OO00.OooO0o(iterable, "receiver$0");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return OooO(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return CollectionsKt__CollectionsKt.m22696OooO00o();
                }
                if (size == 1) {
                    return C9201oooOooOo.OooO00o(m22764OooO0OO((Iterable) iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object obj : iterable) {
                int i3 = i2 + 1;
                if (i2 >= i) {
                    arrayList.add(obj);
                }
                i2 = i3;
            }
            return CollectionsKt__CollectionsKt.m22697OooO00o((List) arrayList);
        }
    }

    public static final <T> int OooO0Oo(Iterable<? extends T> iterable, O00O0OOO<? super T, Integer> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += o00o0ooo.invoke((Object) it.next()).intValue();
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super K, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M OooO0OO(Iterable<? extends K> iterable, M m, O00O0OOO<? super K, ? extends V> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "valueSelector");
        Iterator<? extends K> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            m.put(obj, o00o0ooo.invoke(obj));
        }
        return m;
    }

    /* renamed from: OooO00o */
    public static final <T> List<T> m22726OooO00o(List<? extends T> list, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!o00o0ooo.invoke((Object) listIterator.previous()).booleanValue()) {
                    return OooO0OO((Iterable) list, listIterator.nextIndex() + 1);
                }
            }
        }
        return CollectionsKt__CollectionsKt.m22696OooO00o();
    }

    public static final <T> List<T> OooO0Oo(Iterable<? extends T> iterable, T t) {
        return OooO0OO((Iterable) iterable, (Object) t);
    }

    public static final <T, C extends Collection<? super T>> C OooO0OO(Iterable<? extends T> iterable, C c) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static final <T, R> List<R> OooO0Oo(Iterable<? extends T> iterable, O00Oo000<? super T, ? super T, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        ArrayList arrayList = new ArrayList();
        Object obj = (Object) it.next();
        while (it.hasNext()) {
            Object obj2 = (Object) it.next();
            arrayList.add(o00Oo000.invoke(obj, obj2));
            obj = (Object) obj2;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C OooO0OO(Iterable<? extends T> iterable, C c, O00O0OOO<? super T, ? extends Iterable<? extends R>> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C9210oooo000O.m21074OooO00o((Collection) c, (Iterable) o00o0ooo.invoke((Object) it.next()));
        }
        return c;
    }

    /* renamed from: OooO00o */
    public static final <T> List<T> m22722OooO00o(Iterable<? extends T> iterable, O00Oo000<? super Integer, ? super T, Boolean> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            if (o00Oo000.invoke(Integer.valueOf(i), obj).booleanValue()) {
                arrayList.add(obj);
            }
            i = i2;
        }
        return arrayList;
    }

    public static final <T, R> List<R> OooO0OO(Iterable<? extends T> iterable, O00Oo000<? super Integer, ? super T, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            Object invoke = o00Oo000.invoke(Integer.valueOf(i), obj);
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i = i2;
        }
        return arrayList;
    }

    public static final double OooO0Oo(Iterable<Integer> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        int i = 0;
        for (Integer num : iterable) {
            double intValue = (double) num.intValue();
            Double.isNaN(intValue);
            d += intValue;
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22699OooO00o();
            }
        }
        if (i == 0) {
            return O0O0O0.f16953OooO00o.OooO0Oo();
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        return d / d2;
    }

    public static final <R, C extends Collection<? super R>> C OooO00o(Iterable<?> iterable, C c) {
        for (Object obj : iterable) {
            o0O0OO00.OooO00o(3, "R");
            if (obj instanceof Object) {
                c.add(obj);
            }
        }
        return c;
    }

    public static final <T, R, C extends Collection<? super R>> C OooO0OO(Iterable<? extends T> iterable, C c, O00Oo000<? super Integer, ? super T, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            c.add(o00Oo000.invoke(Integer.valueOf(i), obj));
            i = i2;
        }
        return c;
    }

    public static final <T, C extends Collection<? super T>> C OooO00o(Iterable<? extends T> iterable, C c, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (!o00o0ooo.invoke(obj).booleanValue()) {
                c.add(obj);
            }
        }
        return c;
    }

    public static final <T> List<T> OooO00o(List<? extends T> list, IntRange oo000o0o) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(oo000o0o, "indices");
        if (oo000o0o.isEmpty()) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        return OooO((Iterable) list.subList(oo000o0o.OooO00o().intValue(), oo000o0o.OooO0O0().intValue() + 1));
    }

    /* renamed from: OooO0OO */
    public static final <T> Iterable<C9219oooo0O0<T>> m22763OooO0OO(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        return new C9221oooo0O0O(new CollectionsKt___CollectionsKt$withIndex$1(iterable));
    }

    /* renamed from: OooO0OO */
    public static final <T> List<T> m22766OooO0OO(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        return OooO(m22728OooO00o((Iterable) iterable));
    }

    /* renamed from: OooO0Oo */
    public static final int m22771OooO0Oo(Iterable<Short> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        int i = 0;
        for (Short sh : iterable) {
            i += sh.shortValue();
        }
        return i;
    }

    public static final <T> List<T> OooO00o(List<? extends T> list, Iterable<Integer> iterable) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(iterable, "indices");
        int OooO00o2 = C9202oooOooo.OooO00o(iterable, 10);
        if (OooO00o2 == 0) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        ArrayList arrayList = new ArrayList(OooO00o2);
        for (Integer num : iterable) {
            arrayList.add(list.get(num.intValue()));
        }
        return arrayList;
    }

    /* renamed from: OooO0OO */
    public static final <T> Set<T> m22769OooO0OO(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(iterable2, DispatchConstants.OTHER);
        Set<T> OooO00o2 = m22728OooO00o((Iterable) iterable);
        C9210oooo000O.m21074OooO00o((Collection) OooO00o2, (Iterable) iterable2);
        return OooO00o2;
    }

    public static final <T, R, C extends Collection<? super R>> C OooO0Oo(Iterable<? extends T> iterable, C c, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object invoke = o00o0ooo.invoke((Object) it.next());
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }

    /* renamed from: OooO0O0 */
    public static final <T> List<T> m22753OooO0O0(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (z) {
                arrayList.add(obj);
            } else if (!o00o0ooo.invoke(obj).booleanValue()) {
                arrayList.add(obj);
                z = true;
            }
        }
        return arrayList;
    }

    /* renamed from: OooO0OO */
    public static final <T> boolean m22770OooO0OO(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!o00o0ooo.invoke((Object) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> List<T> OooO0OO(Iterable<? extends T> iterable, T t) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            return OooO00o((Collection) iterable, (Object) t);
        }
        ArrayList arrayList = new ArrayList();
        C9210oooo000O.m21074OooO00o((Collection) arrayList, (Iterable) iterable);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: OooO00o */
    public static final <T, R extends Comparable<? super R>> void m22733OooO00o(List<T> list, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        if (list.size() > 1) {
            C9209oooo0000.OooO0O0(list, new C9250ooooO0oO.OooO0O0(o00o0ooo));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: java.util.Collection */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public static final <T> List<T> m22724OooO00o(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return OooO(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                C9188oooOoOoo.m21021OooO00o(array, (Comparator) comparator);
                return C9188oooOoOoo.OooO00o(array);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> OooOO0 = OooOO0(iterable);
            C9209oooo0000.OooO0O0(OooOO0, comparator);
            return OooOO0;
        }
    }

    public static final <C extends Collection<? super T>, T> C OooO0O0(Iterable<? extends T> iterable, C c) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                c.add(obj);
            }
        }
        return c;
    }

    public static final <T, C extends Collection<? super T>> C OooO0O0(Iterable<? extends T> iterable, C c, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (o00o0ooo.invoke(obj).booleanValue()) {
                c.add(obj);
            }
        }
        return c;
    }

    public static final double OooO0OO(Iterable<Float> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        int i = 0;
        for (Float f : iterable) {
            double floatValue = (double) f.floatValue();
            Double.isNaN(floatValue);
            d += floatValue;
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22699OooO00o();
            }
        }
        if (i == 0) {
            return O0O0O0.f16953OooO00o.OooO0Oo();
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: OooO0O0 */
    public static final <T> List<T> m22755OooO0O0(List<? extends T> list, int i) {
        o0O0OO00.OooO0o(list, "receiver$0");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        } else {
            int size = list.size();
            if (i >= size) {
                return OooO((Iterable) list);
            }
            if (i == 1) {
                return C9201oooOooOo.OooO00o(OooO0oo((List) list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: OooO00o */
    public static final boolean[] m22743OooO00o(Collection<Boolean> collection) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (Boolean bool : collection) {
            zArr[i] = bool.booleanValue();
            i++;
        }
        return zArr;
    }

    /* renamed from: OooO0OO */
    public static final int m22762OooO0OO(Iterable<Integer> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        int i = 0;
        for (Integer num : iterable) {
            i += num.intValue();
        }
        return i;
    }

    public static final <T, R> List<Pair<T, R>> OooO0OO(Iterable<? extends T> iterable, R[] rArr) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(rArr, DispatchConstants.OTHER);
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C9202oooOooo.OooO00o(iterable, 10), length));
        int i = 0;
        for (Object obj : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(C9163oooOOO0O.OooO00o(obj, rArr[i]));
            i++;
        }
        return arrayList;
    }

    /* renamed from: OooO00o */
    public static final byte[] m22736OooO00o(Collection<Byte> collection) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Byte b : collection) {
            bArr[i] = b.byteValue();
            i++;
        }
        return bArr;
    }

    /* renamed from: OooO00o */
    public static final char[] m22737OooO00o(Collection<Character> collection) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        char[] cArr = new char[collection.size()];
        int i = 0;
        for (Character ch : collection) {
            cArr[i] = ch.charValue();
            i++;
        }
        return cArr;
    }

    public static final <T, R> List<Pair<T, R>> OooO0OO(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(iterable2, DispatchConstants.OTHER);
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C9202oooOooo.OooO00o(iterable, 10), C9202oooOooo.OooO00o(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C9163oooOOO0O.OooO00o(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: OooO0O0 */
    public static final <T> List<T> m22756OooO0O0(List<? extends T> list, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.m22696OooO00o();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!o00o0ooo.invoke((Object) listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return CollectionsKt__CollectionsKt.m22696OooO00o();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return OooO((Iterable) list);
    }

    /* renamed from: OooO00o */
    public static final double[] m22738OooO00o(Collection<Double> collection) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Double d : collection) {
            dArr[i] = d.doubleValue();
            i++;
        }
        return dArr;
    }

    /* renamed from: OooO00o */
    public static final float[] m22739OooO00o(Collection<Float> collection) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Float f : collection) {
            fArr[i] = f.floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: OooO00o */
    public static final int[] m22740OooO00o(Collection<Integer> collection) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: OooO00o */
    public static final long[] m22741OooO00o(Collection<Long> collection) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long l : collection) {
            jArr[i] = l.longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: OooO0O0 */
    public static final <T, R extends Comparable<? super R>> void m22760OooO0O0(List<T> list, O00O0OOO<? super T, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        if (list.size() > 1) {
            C9209oooo0000.OooO0O0(list, new C9250ooooO0oO.C9251OooO0Oo(o00o0ooo));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO0O0 */
    public static final <T, K> Map<K, T> m22757OooO0O0(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(oO00O000.OooO00o(C9232oooo0o00.OooO00o(C9202oooOooo.OooO00o(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            linkedHashMap.put(o00o0ooo.invoke(obj), obj);
        }
        return linkedHashMap;
    }

    /* renamed from: OooO00o */
    public static final short[] m22742OooO00o(Collection<Short> collection) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        short[] sArr = new short[collection.size()];
        int i = 0;
        for (Short sh : collection) {
            sArr[i] = sh.shortValue();
            i++;
        }
        return sArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public static final <T, K, V> Map<K, V> m22727OooO00o(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends Pair<? extends K, ? extends V>> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        LinkedHashMap linkedHashMap = new LinkedHashMap(oO00O000.OooO00o(C9232oooo0o00.OooO00o(C9202oooOooo.OooO00o(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) o00o0ooo.invoke((Object) it.next());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super K, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M OooO0O0(Iterable<? extends T> iterable, M m, O00O0OOO<? super T, ? extends Pair<? extends K, ? extends V>> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) o00o0ooo.invoke((Object) it.next());
            m.put(pair.getFirst(), pair.getSecond());
        }
        return m;
    }

    /* renamed from: OooO0O0 */
    public static final <T> Set<T> m22758OooO0O0(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (!(iterable instanceof Collection)) {
            return C9239oooo0ooO.OooO00o((Set) OooO0OO((Iterable) iterable, (Collection) new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C9239oooo0ooO.m21126OooO00o();
        }
        if (size != 1) {
            return (Set) OooO0OO((Iterable) iterable, (Collection) new LinkedHashSet(C9232oooo0o00.OooO00o(collection.size())));
        }
        return C9237oooo0oo.OooO00o(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> OooO00o(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends K> o00o0ooo, O00O0OOO<? super T, ? extends V> o00o0ooo2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        o0O0OO00.OooO0o(o00o0ooo2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(oO00O000.OooO00o(C9232oooo0o00.OooO00o(C9202oooOooo.OooO00o(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            linkedHashMap.put(o00o0ooo.invoke(obj), o00o0ooo2.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super K, ? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, M extends Map<? super K, ? super T>> M OooO00o(Iterable<? extends T> iterable, M m, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            m.put(o00o0ooo.invoke(obj), obj);
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, List<V>> OooO0O0(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends K> o00o0ooo, O00O0OOO<? super T, ? extends V> o00o0ooo2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        o0O0OO00.OooO0o(o00o0ooo2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            Object invoke = o00o0ooo.invoke(obj);
            Object obj2 = linkedHashMap.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(invoke, obj2);
            }
            ((List) obj2).add(o00o0ooo2.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super K, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M OooO00o(Iterable<? extends T> iterable, M m, O00O0OOO<? super T, ? extends K> o00o0ooo, O00O0OOO<? super T, ? extends V> o00o0ooo2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        o0O0OO00.OooO0o(o00o0ooo2, "valueTransform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            m.put(o00o0ooo.invoke(obj), o00o0ooo2.invoke(obj));
        }
        return m;
    }

    /* renamed from: OooO00o */
    public static final <T> HashSet<T> m22718OooO00o(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        return (HashSet) OooO0OO((Iterable) iterable, (Collection) new HashSet(C9232oooo0o00.OooO00o(C9202oooOooo.OooO00o(iterable, 12))));
    }

    /* renamed from: OooO00o */
    public static final <T> List<T> m22725OooO00o(Collection<? extends T> collection) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        return new ArrayList(collection);
    }

    /* renamed from: OooO00o */
    public static final <T, K> AbstractC9214oooo00Oo<T, K> m22708OooO00o(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        return new OooO0O0(iterable, o00o0ooo);
    }

    /* renamed from: OooO00o */
    public static final <T, K> List<T> m22721OooO00o(Iterable<? extends T> iterable, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (hashSet.add(o00o0ooo.invoke(obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super K, java.util.List<V>> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M OooO0O0(Iterable<? extends T> iterable, M m, O00O0OOO<? super T, ? extends K> o00o0ooo, O00O0OOO<? super T, ? extends V> o00o0ooo2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(m, "destination");
        o0O0OO00.OooO0o(o00o0ooo, "keySelector");
        o0O0OO00.OooO0o(o00o0ooo2, "valueTransform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            Object invoke = o00o0ooo.invoke(obj);
            Object obj2 = m.get(invoke);
            if (obj2 == null) {
                obj2 = new ArrayList();
                m.put(invoke, obj2);
            }
            ((List) obj2).add(o00o0ooo2.invoke(obj));
        }
        return m;
    }

    /* renamed from: OooO00o */
    public static final <T> Set<T> m22729OooO00o(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(iterable2, DispatchConstants.OTHER);
        Set<T> OooO00o2 = m22728OooO00o((Iterable) iterable);
        C9210oooo000O.OooO0OO(OooO00o2, iterable2);
        return OooO00o2;
    }

    /* renamed from: OooO00o */
    public static final <T> Set<T> m22728OooO00o(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) OooO0OO((Iterable) iterable, (Collection) new LinkedHashSet());
    }

    public static final <T, R> List<R> OooO0O0(Iterable<? extends T> iterable, O00Oo000<? super Integer, ? super T, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        ArrayList arrayList = new ArrayList(C9202oooOooo.OooO00o(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            arrayList.add(o00Oo000.invoke(Integer.valueOf(i), obj));
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: OooO00o */
    public static final <T> boolean m22734OooO00o(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            return !((Collection) iterable).isEmpty();
        }
        return iterable.iterator().hasNext();
    }

    /* renamed from: OooO0O0 */
    public static final <T> Set<T> m22759OooO0O0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(iterable2, DispatchConstants.OTHER);
        Set<T> OooO00o2 = m22728OooO00o((Iterable) iterable);
        C9210oooo000O.m21078OooO0O0((Collection) OooO00o2, (Iterable) iterable2);
        return OooO00o2;
    }

    /* renamed from: OooO00o */
    public static final <T> int m22704OooO00o(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22699OooO00o();
            }
        }
        return i;
    }

    /* renamed from: OooO0O0 */
    public static final Double m22746OooO0O0(Iterable<Double> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        if (Double.isNaN(doubleValue)) {
            return Double.valueOf(doubleValue);
        }
        while (it.hasNext()) {
            double doubleValue2 = it.next().doubleValue();
            if (Double.isNaN(doubleValue2)) {
                return Double.valueOf(doubleValue2);
            }
            if (doubleValue > doubleValue2) {
                doubleValue = doubleValue2;
            }
        }
        return Double.valueOf(doubleValue);
    }

    public static final <T> int OooO00o(Collection<? extends T> collection) {
        return collection.size();
    }

    /* renamed from: OooO00o */
    public static final <T> int m22705OooO00o(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o00o0ooo.invoke((Object) it.next()).booleanValue() && (i = i + 1) < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22699OooO00o();
                } else {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i;
    }

    public static final <T, R> R OooO00o(Iterable<? extends T> iterable, R r, O00Oo000<? super R, ? super T, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = (R) o00Oo000.invoke(r, (Object) it.next());
        }
        return r;
    }

    public static final <T, R> R OooO00o(Iterable<? extends T> iterable, R r, O00Oo00O<? super Integer, ? super R, ? super T, ? extends R> o00Oo00O) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            r = (R) o00Oo00O.invoke(Integer.valueOf(i), r, obj);
            i = i2;
        }
        return r;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x0027 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: ? super R */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R OooO00o(List<? extends T> list, R r, O00Oo000<? super T, ? super R, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            r = r;
            while (listIterator.hasPrevious()) {
                r = (Object) o00Oo000.invoke((Object) listIterator.previous(), r);
            }
        }
        return r;
    }

    /* renamed from: OooO0O0 */
    public static final Float m22747OooO0O0(Iterable<Float> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        if (Float.isNaN(floatValue)) {
            return Float.valueOf(floatValue);
        }
        while (it.hasNext()) {
            float floatValue2 = it.next().floatValue();
            if (Float.isNaN(floatValue2)) {
                return Float.valueOf(floatValue2);
            }
            if (floatValue > floatValue2) {
                floatValue = floatValue2;
            }
        }
        return Float.valueOf(floatValue);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x002f */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: ? super R */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R OooO00o(List<? extends T> list, R r, O00Oo00O<? super Integer, ? super T, ? super R, ? extends R> o00Oo00O) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            r = r;
            while (listIterator.hasPrevious()) {
                r = (Object) o00Oo00O.invoke(Integer.valueOf(listIterator.previousIndex()), (Object) listIterator.previous(), r);
            }
        }
        return r;
    }

    /* renamed from: OooO00o */
    public static final <T> void m22731OooO00o(Iterable<? extends T> iterable, O00O0OOO<? super T, C9174oooOOooO> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            o00o0ooo.invoke((Object) it.next());
        }
    }

    /* renamed from: OooO00o */
    public static final <T> void m22732OooO00o(Iterable<? extends T> iterable, O00Oo000<? super Integer, ? super T, C9174oooOOooO> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "action");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            o00Oo000.invoke(Integer.valueOf(i), obj);
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: OooO0O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.lang.Comparable<? super T>> T m22745OooO0O0(java.lang.Iterable<? extends T> r3) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0011
            r3 = 0
            return r3
        L_0x0011:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L_0x0017:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L_0x0017
            r0 = r1
            goto L_0x0017
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m22745OooO0O0(java.lang.Iterable):java.lang.Comparable");
    }

    /* renamed from: OooO00o */
    public static final Double m22710OooO00o(Iterable<Double> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        if (Double.isNaN(doubleValue)) {
            return Double.valueOf(doubleValue);
        }
        while (it.hasNext()) {
            double doubleValue2 = it.next().doubleValue();
            if (Double.isNaN(doubleValue2)) {
                return Double.valueOf(doubleValue2);
            }
            if (doubleValue < doubleValue2) {
                doubleValue = doubleValue2;
            }
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T OooO0O0(java.lang.Iterable<? extends T> r3, java.util.Comparator<? super T> r4) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            java.lang.String r0 = "comparator"
            com.p118pd.sdk.o0O0OO00.OooO0o(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0016
            r3 = 0
            return r3
        L_0x0016:
            java.lang.Object r0 = r3.next()
        L_0x001a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 <= 0) goto L_0x001a
            r0 = r1
            goto L_0x001a
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.OooO0O0(java.lang.Iterable, java.util.Comparator):java.lang.Object");
    }

    /* renamed from: OooO00o */
    public static final Float m22711OooO00o(Iterable<Float> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        if (Float.isNaN(floatValue)) {
            return Float.valueOf(floatValue);
        }
        while (it.hasNext()) {
            float floatValue2 = it.next().floatValue();
            if (Float.isNaN(floatValue2)) {
                return Float.valueOf(floatValue2);
            }
            if (floatValue < floatValue2) {
                floatValue = floatValue2;
            }
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: OooO0O0 */
    public static final <T> boolean m22761OooO0O0(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Iterable<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO0O0 */
    public static final <T> Iterable<T> m22748OooO0O0(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    /* renamed from: OooO0O0 */
    public static final <T> List<T> m22754OooO0O0(Iterable<? extends T> iterable, T t) {
        return m22723OooO00o((Iterable) iterable, (Object) t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: OooO00o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.lang.Comparable<? super T>> T m22709OooO00o(java.lang.Iterable<? extends T> r3) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0011
            r3 = 0
            return r3
        L_0x0011:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L_0x0017:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L_0x0017
            r0 = r1
            goto L_0x0017
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m22709OooO00o(java.lang.Iterable):java.lang.Comparable");
    }

    public static final <T> List<T> OooO0O0(Iterable<? extends T> iterable, T[] tArr) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(tArr, "elements");
        if (iterable instanceof Collection) {
            return OooO00o((Collection) iterable, (Object[]) tArr);
        }
        ArrayList arrayList = new ArrayList();
        C9210oooo000O.m21074OooO00o((Collection) arrayList, (Iterable) iterable);
        C9210oooo000O.m21076OooO00o((Collection) arrayList, (Object[]) tArr);
        return arrayList;
    }

    public static final <T> List<T> OooO0O0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(iterable2, "elements");
        if (iterable instanceof Collection) {
            return OooO00o((Collection) iterable, (Iterable) iterable2);
        }
        ArrayList arrayList = new ArrayList();
        C9210oooo000O.m21074OooO00o((Collection) arrayList, (Iterable) iterable);
        C9210oooo000O.m21074OooO00o((Collection) arrayList, (Iterable) iterable2);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T OooO00o(java.lang.Iterable<? extends T> r3, java.util.Comparator<? super T> r4) {
        /*
            java.lang.String r0 = "receiver$0"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            java.lang.String r0 = "comparator"
            com.p118pd.sdk.o0O0OO00.OooO0o(r4, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0016
            r3 = 0
            return r3
        L_0x0016:
            java.lang.Object r0 = r3.next()
        L_0x001a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r3.next()
            int r2 = r4.compare(r0, r1)
            if (r2 >= 0) goto L_0x001a
            r0 = r1
            goto L_0x001a
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.OooO00o(java.lang.Iterable, java.util.Comparator):java.lang.Object");
    }

    public static final <T> List<T> OooO0O0(Iterable<? extends T> iterable, AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, "elements");
        ArrayList arrayList = new ArrayList();
        C9210oooo000O.m21074OooO00o((Collection) arrayList, (Iterable) iterable);
        C9210oooo000O.m21073OooO00o((Collection) arrayList, (AbstractC7873oO0OOo00) oo0ooo00);
        return arrayList;
    }

    public static final <T> List<T> OooO0O0(Collection<? extends T> collection, T t) {
        return OooO00o((Collection) collection, (Object) t);
    }

    /* renamed from: OooO00o */
    public static final <T, C extends Iterable<? extends T>> C m22713OooO00o(C c, O00O0OOO<? super T, C9174oooOOooO> o00o0ooo) {
        o0O0OO00.OooO0o(c, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "action");
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            o00o0ooo.invoke(it.next());
        }
        return c;
    }

    public static final double OooO0O0(Iterable<Double> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        int i = 0;
        for (Double d2 : iterable) {
            d += d2.doubleValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22699OooO00o();
            }
        }
        if (i == 0) {
            return O0O0O0.f16953OooO00o.OooO0Oo();
        }
        double d3 = (double) i;
        Double.isNaN(d3);
        return d / d3;
    }

    public static final <S, T extends S> S OooO00o(Iterable<? extends T> iterable, O00Oo000<? super S, ? super T, ? extends S> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S s = (S) it.next();
            while (it.hasNext()) {
                s = (S) o00Oo000.invoke(s, (Object) it.next());
            }
            return s;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* renamed from: OooO0O0 */
    public static final int m22744OooO0O0(Iterable<Byte> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        int i = 0;
        for (Byte b : iterable) {
            i += b.byteValue();
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: OooO0O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m22750OooO0O0(java.lang.Iterable<? extends T> r3, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r4) {
        /*
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L_0x0005:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r3.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0005
            r0 = r1
            goto L_0x0005
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m22750OooO0O0(java.lang.Iterable, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    public static final <T, R, C extends Collection<? super R>> C OooO0O0(Iterable<? extends T> iterable, C c, O00Oo000<? super Integer, ? super T, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            Object invoke = o00Oo000.invoke(Integer.valueOf(i), obj);
            if (invoke != null) {
                c.add(invoke);
            }
            i = i2;
        }
        return c;
    }

    public static final <S, T extends S> S OooO00o(Iterable<? extends T> iterable, O00Oo00O<? super Integer, ? super S, ? super T, ? extends S> o00Oo00O) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            S s = (S) it.next();
            int i = 1;
            while (it.hasNext()) {
                int i2 = i + 1;
                if (i < 0) {
                    if (O000O000.OooO00o(1, 3, 0)) {
                        CollectionsKt__CollectionsKt.m22701OooO0O0();
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                s = (S) o00Oo00O.invoke(Integer.valueOf(i), s, (Object) it.next());
                i = i2;
            }
            return s;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static final <S, T extends S> S OooO00o(List<? extends T> list, O00Oo000<? super T, ? super S, ? extends S> o00Oo000) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00Oo000, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (listIterator.hasPrevious()) {
            S s = (S) listIterator.previous();
            while (listIterator.hasPrevious()) {
                s = (S) o00Oo000.invoke((Object) listIterator.previous(), s);
            }
            return s;
        }
        throw new UnsupportedOperationException("Empty list can't be reduced.");
    }

    public static final <S, T extends S> S OooO00o(List<? extends T> list, O00Oo00O<? super Integer, ? super T, ? super S, ? extends S> o00Oo00O) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00Oo00O, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (listIterator.hasPrevious()) {
            S s = (S) listIterator.previous();
            while (listIterator.hasPrevious()) {
                s = (S) o00Oo00O.invoke(Integer.valueOf(listIterator.previousIndex()), (Object) listIterator.previous(), s);
            }
            return s;
        }
        throw new UnsupportedOperationException("Empty list can't be reduced.");
    }

    public static final <T> double OooO00o(Iterable<? extends T> iterable, O00O0OOO<? super T, Double> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        while (it.hasNext()) {
            d += o00o0ooo.invoke((Object) it.next()).doubleValue();
        }
        return d;
    }

    /* renamed from: OooO00o */
    public static final <T> List<List<T>> m22719OooO00o(Iterable<? extends T> iterable, int i) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        return OooO00o((Iterable) iterable, i, i, true);
    }

    /* renamed from: OooO00o */
    public static final <T, R> List<R> m22720OooO00o(Iterable<? extends T> iterable, int i, O00O0OOO<? super List<? extends T>, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        return OooO00o((Iterable) iterable, i, i, true, (O00O0OOO) o00o0ooo);
    }

    /* renamed from: OooO00o */
    public static final <T> List<T> m22723OooO00o(Iterable<? extends T> iterable, T t) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        ArrayList arrayList = new ArrayList(C9202oooOooo.OooO00o(iterable, 10));
        boolean z = false;
        for (Object obj : iterable) {
            boolean z2 = true;
            if (!z && o0O0OO00.OooO00o(obj, (Object) t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> OooO00o(Iterable<? extends T> iterable, T[] tArr) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(tArr, "elements");
        if (tArr.length == 0) {
            return OooO(iterable);
        }
        HashSet OooO00o2 = ArraysKt___ArraysKt.m22195OooO00o((Object[]) tArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!OooO00o2.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> OooO00o(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(iterable2, "elements");
        Collection OooO00o2 = C9202oooOooo.OooO00o(iterable2, iterable);
        if (OooO00o2.isEmpty()) {
            return OooO(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!OooO00o2.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> OooO00o(Iterable<? extends T> iterable, AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, "elements");
        HashSet OooO00o2 = SequencesKt___SequencesKt.m22840OooO00o((AbstractC7873oO0OOo00) oo0ooo00);
        if (OooO00o2.isEmpty()) {
            return OooO(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!OooO00o2.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: OooO00o */
    public static final <T> Pair<List<T>, List<T>> m22730OooO00o(Iterable<? extends T> iterable, O00O0OOO<? super T, Boolean> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (o00o0ooo.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <T> List<T> OooO00o(Collection<? extends T> collection, T t) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> List<T> OooO00o(Collection<? extends T> collection, T[] tArr) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(tArr, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + tArr.length);
        arrayList.addAll(collection);
        C9210oooo000O.m21076OooO00o((Collection) arrayList, (Object[]) tArr);
        return arrayList;
    }

    public static final <T> List<T> OooO00o(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C9210oooo000O.m21074OooO00o((Collection) arrayList2, (Iterable) iterable);
        return arrayList2;
    }

    public static final <T> List<T> OooO00o(Collection<? extends T> collection, AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        o0O0OO00.OooO0o(oo0ooo00, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        C9210oooo000O.m21073OooO00o((Collection) arrayList, (AbstractC7873oO0OOo00) oo0ooo00);
        return arrayList;
    }

    public static /* synthetic */ List OooO00o(Iterable iterable, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return OooO00o(iterable, i, i2, z);
    }

    public static final <T> List<List<T>> OooO00o(Iterable<? extends T> iterable, int i, int i2, boolean z) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        SlidingWindowKt.OooO00o(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator OooO00o2 = SlidingWindowKt.OooO00o((Iterator) iterable.iterator(), i, i2, z, false);
            while (OooO00o2.hasNext()) {
                arrayList.add((List) OooO00o2.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList(((size + i2) - 1) / i2);
        int i3 = 0;
        while (i3 < size) {
            int OooO0O02 = oO00O000.OooO0O0(i, size - i3);
            if (OooO0O02 < i && !z) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(OooO0O02);
            for (int i4 = 0; i4 < OooO0O02; i4++) {
                arrayList3.add(list.get(i4 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static /* synthetic */ List OooO00o(Iterable iterable, int i, int i2, boolean z, O00O0OOO o00o0ooo, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return OooO00o(iterable, i, i2, z, o00o0ooo);
    }

    public static final <T, R> List<R> OooO00o(Iterable<? extends T> iterable, int i, int i2, boolean z, O00O0OOO<? super List<? extends T>, ? extends R> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        SlidingWindowKt.OooO00o(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator OooO00o2 = SlidingWindowKt.OooO00o((Iterator) iterable.iterator(), i, i2, z, true);
            while (OooO00o2.hasNext()) {
                arrayList.add(o00o0ooo.invoke((List) OooO00o2.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList(((size + i2) - 1) / i2);
        C9233oooo0o0o oooo0o0o = new C9233oooo0o0o(list);
        int i3 = 0;
        while (i3 < size) {
            oooo0o0o.OooO00o(i3, oO00O000.OooO0O0(i3 + i, size));
            if (!z && oooo0o0o.size() < i) {
                break;
            }
            arrayList2.add(o00o0ooo.invoke(oooo0o0o));
            i3 += i2;
        }
        return arrayList2;
    }

    public static final <T, R, V> List<V> OooO00o(Iterable<? extends T> iterable, R[] rArr, O00Oo000<? super T, ? super R, ? extends V> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(rArr, DispatchConstants.OTHER);
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C9202oooOooo.OooO00o(iterable, 10), length));
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (i >= length) {
                break;
            }
            arrayList.add(o00Oo000.invoke(obj, rArr[i]));
            i++;
        }
        return arrayList;
    }

    public static final <T, R, V> List<V> OooO00o(Iterable<? extends T> iterable, Iterable<? extends R> iterable2, O00Oo000<? super T, ? super R, ? extends V> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(iterable2, DispatchConstants.OTHER);
        o0O0OO00.OooO0o(o00Oo000, BaseViewManager.PROP_TRANSFORM);
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C9202oooOooo.OooO00o(iterable, 10), C9202oooOooo.OooO00o(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(o00Oo000.invoke((Object) it.next(), (Object) it2.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ Appendable OooO00o(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, O00O0OOO o00o0ooo, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return OooO00o(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : o00o0ooo);
    }

    public static final <T, A extends Appendable> A OooO00o(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, O00O0OOO<? super T, ? extends CharSequence> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(a, "buffer");
        o0O0OO00.OooO0o(charSequence, "separator");
        o0O0OO00.OooO0o(charSequence2, "prefix");
        o0O0OO00.OooO0o(charSequence3, "postfix");
        o0O0OO00.OooO0o(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C8314oOo0o0oo.OooO00o(a, obj, o00o0ooo);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String OooO00o(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, O00O0OOO o00o0ooo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            o00o0ooo = null;
        }
        return OooO00o(iterable, charSequence, charSequence6, charSequence5, i3, charSequence4, o00o0ooo);
    }

    public static final <T> String OooO00o(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, O00O0OOO<? super T, ? extends CharSequence> o00o0ooo) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(charSequence, "separator");
        o0O0OO00.OooO0o(charSequence2, "prefix");
        o0O0OO00.OooO0o(charSequence3, "postfix");
        o0O0OO00.OooO0o(charSequence4, "truncated");
        String sb = ((StringBuilder) OooO00o(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, o00o0ooo)).toString();
        o0O0OO00.OooO00o((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: OooO00o */
    public static final <T> AbstractC7873oO0OOo00<T> m22707OooO00o(Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        return new OooO00o(iterable);
    }

    public static final double OooO00o(Iterable<Byte> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        double d = AbstractC8352oOoOOoO0.OooO0O0;
        int i = 0;
        for (Byte b : iterable) {
            double byteValue = (double) b.byteValue();
            Double.isNaN(byteValue);
            d += byteValue;
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m22699OooO00o();
            }
        }
        if (i == 0) {
            return O0O0O0.f16953OooO00o.OooO0Oo();
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: OooO00o */
    public static final long m22706OooO00o(Iterable<Long> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        long j = 0;
        for (Long l : iterable) {
            j += l.longValue();
        }
        return j;
    }

    /* renamed from: OooO00o */
    public static final float m22703OooO00o(Iterable<Float> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        float f = 0.0f;
        for (Float f2 : iterable) {
            f += f2.floatValue();
        }
        return f;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: OooO00o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m22715OooO00o(java.lang.Iterable<? extends T> r2, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r3) {
        /*
            java.util.Iterator r2 = r2.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0004
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m22715OooO00o(java.lang.Iterable, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: OooO00o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m22717OooO00o(java.util.List<? extends T> r2, com.p118pd.sdk.O00O0OOO<? super T, java.lang.Boolean> r3) {
        /*
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
        L_0x0008:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r2.previous()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0008
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m22717OooO00o(java.util.List, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    public static final <T, C extends Collection<? super T>> C OooO00o(Iterable<? extends T> iterable, C c, O00Oo000<? super Integer, ? super T, Boolean> o00Oo000) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(o00Oo000, "predicate");
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            int i2 = i + 1;
            if (i < 0) {
                if (O000O000.OooO00o(1, 3, 0)) {
                    CollectionsKt__CollectionsKt.m22701OooO0O0();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            if (o00Oo000.invoke(Integer.valueOf(i), obj).booleanValue()) {
                c.add(obj);
            }
            i = i2;
        }
        return c;
    }
}
