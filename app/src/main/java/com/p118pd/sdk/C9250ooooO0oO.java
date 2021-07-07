package com.p118pd.sdk;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001aY\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\t\u001aW\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001a;\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001aW\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001a-\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u000f\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0010\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0011\u001a>\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b¢\u0006\u0002\u0010\u0013\u001aY\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0014\u001aZ\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022 \u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001a&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a-\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\b\u001a@\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a-\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\b\u001a@\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a0\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\u001aO\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0004\u001aO\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001ak\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001aO\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001ak\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001am\u0010!\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u000328\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000e0#H\b\u001aO\u0010&\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0004¨\u0006'"}, mo43195d2 = {"compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thenDescending", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/comparisons/ComparisonsKt")
/* renamed from: com.pd.sdk.ooooO0oO  reason: case insensitive filesystem */
public class C9250ooooO0oO {

    /* renamed from: com.pd.sdk.ooooO0oO$OooO */
    public static final class OooO<T> implements Comparator<T> {
        public final /* synthetic */ O00O0OOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Comparator f22639OooO00o;

        public OooO(Comparator comparator, O00O0OOO o00o0ooo) {
            this.f22639OooO00o = comparator;
            this.OooO00o = o00o0ooo;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f22639OooO00o.compare(t, t2);
            return compare != 0 ? compare : C9250ooooO0oO.OooO00o((Comparable) this.OooO00o.invoke(t), (Comparable) this.OooO00o.invoke(t2));
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooO00o */
    public static final class OooO00o<T> implements Comparator<T> {
        public final /* synthetic */ O00O0OOO[] OooO00o;

        public OooO00o(O00O0OOO[] o00o0oooArr) {
            this.OooO00o = o00o0oooArr;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C9250ooooO0oO.OooO0OO(t, t2, this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooO0O0 */
    public static final class OooO0O0<T> implements Comparator<T> {
        public final /* synthetic */ O00O0OOO OooO00o;

        public OooO0O0(O00O0OOO o00o0ooo) {
            this.OooO00o = o00o0ooo;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C9250ooooO0oO.OooO00o((Comparable) this.OooO00o.invoke(t), (Comparable) this.OooO00o.invoke(t2));
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooO0OO */
    public static final class OooO0OO<T> implements Comparator<T> {
        public final /* synthetic */ O00O0OOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Comparator f22640OooO00o;

        public OooO0OO(Comparator comparator, O00O0OOO o00o0ooo) {
            this.f22640OooO00o = comparator;
            this.OooO00o = o00o0ooo;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Comparator */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return this.f22640OooO00o.compare(this.OooO00o.invoke(t), this.OooO00o.invoke(t2));
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooO0Oo  reason: case insensitive filesystem */
    public static final class C9251OooO0Oo<T> implements Comparator<T> {
        public final /* synthetic */ O00O0OOO OooO00o;

        public C9251OooO0Oo(O00O0OOO o00o0ooo) {
            this.OooO00o = o00o0ooo;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C9250ooooO0oO.OooO00o((Comparable) this.OooO00o.invoke(t2), (Comparable) this.OooO00o.invoke(t));
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooO0o */
    public static final class OooO0o<T> implements Comparator<T> {
        public final /* synthetic */ Comparator OooO00o;

        public OooO0o(Comparator comparator) {
            this.OooO00o = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(@Nullable T t, @Nullable T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return -1;
            }
            if (t2 == null) {
                return 1;
            }
            return this.OooO00o.compare(t, t2);
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooO0o0  reason: case insensitive filesystem */
    public static final class C9252OooO0o0<T> implements Comparator<T> {
        public final /* synthetic */ O00O0OOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Comparator f22641OooO00o;

        public C9252OooO0o0(Comparator comparator, O00O0OOO o00o0ooo) {
            this.f22641OooO00o = comparator;
            this.OooO00o = o00o0ooo;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Comparator */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return this.f22641OooO00o.compare(this.OooO00o.invoke(t2), this.OooO00o.invoke(t));
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooO0oO  reason: case insensitive filesystem */
    public static final class C9253OooO0oO<T> implements Comparator<T> {
        public final /* synthetic */ Comparator OooO00o;

        public C9253OooO0oO(Comparator comparator) {
            this.OooO00o = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(@Nullable T t, @Nullable T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return 1;
            }
            if (t2 == null) {
                return -1;
            }
            return this.OooO00o.compare(t, t2);
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooO0oo  reason: case insensitive filesystem */
    public static final class C9254OooO0oo<T> implements Comparator<T> {
        public final /* synthetic */ Comparator OooO00o;
        public final /* synthetic */ Comparator OooO0O0;

        public C9254OooO0oo(Comparator comparator, Comparator comparator2) {
            this.OooO00o = comparator;
            this.OooO0O0 = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.OooO00o.compare(t, t2);
            return compare != 0 ? compare : this.OooO0O0.compare(t, t2);
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooOO0 */
    public static final class OooOO0<T> implements Comparator<T> {
        public final /* synthetic */ O00O0OOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Comparator f22642OooO00o;
        public final /* synthetic */ Comparator OooO0O0;

        public OooOO0(Comparator comparator, Comparator comparator2, O00O0OOO o00o0ooo) {
            this.f22642OooO00o = comparator;
            this.OooO0O0 = comparator2;
            this.OooO00o = o00o0ooo;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.Comparator */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f22642OooO00o.compare(t, t2);
            return compare != 0 ? compare : this.OooO0O0.compare(this.OooO00o.invoke(t), this.OooO00o.invoke(t2));
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooOO0O */
    public static final class OooOO0O<T> implements Comparator<T> {
        public final /* synthetic */ O00O0OOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Comparator f22643OooO00o;

        public OooOO0O(Comparator comparator, O00O0OOO o00o0ooo) {
            this.f22643OooO00o = comparator;
            this.OooO00o = o00o0ooo;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f22643OooO00o.compare(t, t2);
            return compare != 0 ? compare : C9250ooooO0oO.OooO00o((Comparable) this.OooO00o.invoke(t2), (Comparable) this.OooO00o.invoke(t));
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooOO0o  reason: case insensitive filesystem */
    public static final class C9255OooOO0o<T> implements Comparator<T> {
        public final /* synthetic */ O00O0OOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Comparator f22644OooO00o;
        public final /* synthetic */ Comparator OooO0O0;

        public C9255OooOO0o(Comparator comparator, Comparator comparator2, O00O0OOO o00o0ooo) {
            this.f22644OooO00o = comparator;
            this.OooO0O0 = comparator2;
            this.OooO00o = o00o0ooo;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.Comparator */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f22644OooO00o.compare(t, t2);
            return compare != 0 ? compare : this.OooO0O0.compare(this.OooO00o.invoke(t2), this.OooO00o.invoke(t));
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooOOO */
    public static final class OooOOO<T> implements Comparator<T> {
        public final /* synthetic */ Comparator OooO00o;
        public final /* synthetic */ Comparator OooO0O0;

        public OooOOO(Comparator comparator, Comparator comparator2) {
            this.OooO00o = comparator;
            this.OooO0O0 = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.OooO00o.compare(t, t2);
            return compare != 0 ? compare : this.OooO0O0.compare(t2, t);
        }
    }

    /* renamed from: com.pd.sdk.ooooO0oO$OooOOO0 */
    public static final class OooOOO0<T> implements Comparator<T> {
        public final /* synthetic */ O00Oo000 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Comparator f22645OooO00o;

        public OooOOO0(Comparator comparator, O00Oo000 o00Oo000) {
            this.f22645OooO00o = comparator;
            this.OooO00o = o00Oo000;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f22645OooO00o.compare(t, t2);
            return compare != 0 ? compare : ((Number) this.OooO00o.invoke(t, t2)).intValue();
        }
    }

    public static final <T> int OooO0O0(T t, T t2, @NotNull O00O0OOO<? super T, ? extends Comparable<?>>... o00o0oooArr) {
        o0O0OO00.OooO0o(o00o0oooArr, "selectors");
        if (o00o0oooArr.length > 0) {
            return OooO0OO(t, t2, o00o0oooArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final <T> int OooO0OO(T t, T t2, O00O0OOO<? super T, ? extends Comparable<?>>[] o00o0oooArr) {
        for (O00O0OOO<? super T, ? extends Comparable<?>> o00o0ooo : o00o0oooArr) {
            int OooO00o2 = OooO00o((Comparable) o00o0ooo.invoke(t), (Comparable) o00o0ooo.invoke(t2));
            if (OooO00o2 != 0) {
                return OooO00o2;
            }
        }
        return 0;
    }

    @InlineOnly
    public static final <T> Comparator<T> OooO0Oo(@NotNull Comparator<T> comparator, O00O0OOO<? super T, ? extends Comparable<?>> o00o0ooo) {
        return new OooOO0O(comparator, o00o0ooo);
    }

    @InlineOnly
    public static final <T> int OooO00o(T t, T t2, O00O0OOO<? super T, ? extends Comparable<?>> o00o0ooo) {
        return OooO00o((Comparable) o00o0ooo.invoke(t), (Comparable) o00o0ooo.invoke(t2));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> OooO0Oo() {
        C9275ooooOoo0 ooooooo0 = C9275ooooOoo0.OooO00o;
        if (ooooooo0 != null) {
            return ooooooo0;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    }

    @InlineOnly
    public static final <T, K> int OooO00o(T t, T t2, Comparator<? super K> comparator, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        return comparator.compare((Object) o00o0ooo.invoke(t), (Object) o00o0ooo.invoke(t2));
    }

    public static final <T extends Comparable<?>> int OooO00o(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    @InlineOnly
    public static final <T> Comparator<T> OooO0O0(O00O0OOO<? super T, ? extends Comparable<?>> o00o0ooo) {
        return new C9251OooO0Oo(o00o0ooo);
    }

    @NotNull
    public static final <T> Comparator<T> OooO00o(@NotNull O00O0OOO<? super T, ? extends Comparable<?>>... o00o0oooArr) {
        o0O0OO00.OooO0o(o00o0oooArr, "selectors");
        if (o00o0oooArr.length > 0) {
            return new OooO00o(o00o0oooArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @InlineOnly
    public static final <T, K> Comparator<T> OooO0O0(Comparator<? super K> comparator, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        return new C9252OooO0o0(comparator, o00o0ooo);
    }

    @InlineOnly
    public static final <T> Comparator<T> OooO0OO(@NotNull Comparator<T> comparator, O00O0OOO<? super T, ? extends Comparable<?>> o00o0ooo) {
        return new OooO(comparator, o00o0ooo);
    }

    @InlineOnly
    public static final <T, K> Comparator<T> OooO0O0(@NotNull Comparator<T> comparator, Comparator<? super K> comparator2, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        return new C9255OooOO0o(comparator, comparator2, o00o0ooo);
    }

    @InlineOnly
    public static final <T extends Comparable<? super T>> Comparator<T> OooO0OO() {
        return OooO0O0(OooO00o());
    }

    @NotNull
    public static final <T> Comparator<T> OooO0O0(@NotNull Comparator<T> comparator, @NotNull Comparator<? super T> comparator2) {
        o0O0OO00.OooO0o(comparator, "receiver$0");
        o0O0OO00.OooO0o(comparator2, "comparator");
        return new OooOOO(comparator, comparator2);
    }

    @NotNull
    public static final <T> Comparator<T> OooO0OO(@NotNull Comparator<T> comparator) {
        o0O0OO00.OooO0o(comparator, "receiver$0");
        if (comparator instanceof C9262ooooOOO0) {
            return ((C9262ooooOOO0) comparator).OooO00o();
        }
        if (o0O0OO00.OooO00o(comparator, C9257ooooOO.OooO00o)) {
            C9275ooooOoo0 ooooooo0 = C9275ooooOoo0.OooO00o;
            if (ooooooo0 != null) {
                return ooooooo0;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        } else if (!o0O0OO00.OooO00o(comparator, C9275ooooOoo0.OooO00o)) {
            return new C9262ooooOOO0(comparator);
        } else {
            C9257ooooOO oooooo = C9257ooooOO.OooO00o;
            if (oooooo != null) {
                return oooooo;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        }
    }

    @InlineOnly
    public static final <T> Comparator<T> OooO00o(O00O0OOO<? super T, ? extends Comparable<?>> o00o0ooo) {
        return new OooO0O0(o00o0ooo);
    }

    @InlineOnly
    public static final <T extends Comparable<? super T>> Comparator<T> OooO0O0() {
        return OooO00o(OooO00o());
    }

    @InlineOnly
    public static final <T, K> Comparator<T> OooO00o(Comparator<? super K> comparator, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        return new OooO0OO(comparator, o00o0ooo);
    }

    @NotNull
    public static final <T> Comparator<T> OooO0O0(@NotNull Comparator<? super T> comparator) {
        o0O0OO00.OooO0o(comparator, "comparator");
        return new C9253OooO0oO(comparator);
    }

    @InlineOnly
    public static final <T, K> Comparator<T> OooO00o(@NotNull Comparator<T> comparator, Comparator<? super K> comparator2, O00O0OOO<? super T, ? extends K> o00o0ooo) {
        return new OooOO0(comparator, comparator2, o00o0ooo);
    }

    @InlineOnly
    public static final <T> Comparator<T> OooO00o(@NotNull Comparator<T> comparator, O00Oo000<? super T, ? super T, Integer> o00Oo000) {
        return new OooOOO0(comparator, o00Oo000);
    }

    @NotNull
    public static final <T> Comparator<T> OooO00o(@NotNull Comparator<T> comparator, @NotNull Comparator<? super T> comparator2) {
        o0O0OO00.OooO0o(comparator, "receiver$0");
        o0O0OO00.OooO0o(comparator2, "comparator");
        return new C9254OooO0oo(comparator, comparator2);
    }

    @NotNull
    public static final <T> Comparator<T> OooO00o(@NotNull Comparator<? super T> comparator) {
        o0O0OO00.OooO0o(comparator, "comparator");
        return new OooO0o(comparator);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> OooO00o() {
        C9257ooooOO oooooo = C9257ooooOO.OooO00o;
        if (oooooo != null) {
            return oooooo;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    }
}
