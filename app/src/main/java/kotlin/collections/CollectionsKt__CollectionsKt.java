package kotlin.collections;

import com.p118pd.sdk.C9183oooOoOO;
import com.p118pd.sdk.C9188oooOoOoo;
import com.p118pd.sdk.C9201oooOooOo;
import com.p118pd.sdk.C9250ooooO0oO;
import com.p118pd.sdk.O00O0000;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\b\u001a@\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\b\u001a\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u0007H\b\u001a5\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0012\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007\u001a\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007H\b\u001a+\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\u001c\u001a%\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010 \u001a3\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020\u001e2\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00070\u0018\"\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010\u001c\u001a\u0015\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u0007H\b\u001a+\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\u001c\u001a%\u0010\"\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0002\b&\u001a\b\u0010'\u001a\u00020#H\u0001\u001a\b\u0010(\u001a\u00020#H\u0001\u001a%\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018H\u0000¢\u0006\u0002\u0010*\u001aS\u0010+\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010\u001f\u001a\u0002H\u00072\u001a\u0010,\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00070-j\n\u0012\u0006\b\u0000\u0012\u0002H\u0007`.2\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u0006¢\u0006\u0002\u0010/\u001a>\u0010+\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u00062\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000e\u001aE\u0010+\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u000701*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\b2\b\u0010\u001f\u001a\u0004\u0018\u0001H\u00072\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u0006¢\u0006\u0002\u00102\u001ad\u00103\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u00104*\b\u0012\u0004\u0012\u0002H401*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\u00105\u001a\u0004\u0018\u0001H42\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u00062\u0016\b\u0004\u00106\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H40\u000eH\b¢\u0006\u0002\u00107\u001a,\u00108\u001a\u000209\"\t\b\u0000\u0010\u0007¢\u0006\u0002\b:*\b\u0012\u0004\u0012\u0002H\u00070\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002H\b\u001a8\u0010;\u001a\u0002H<\"\u0010\b\u0000\u0010=*\u0006\u0012\u0002\b\u00030\u0002*\u0002H<\"\u0004\b\u0001\u0010<*\u0002H=2\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H<0?H\b¢\u0006\u0002\u0010@\u001a\u0019\u0010A\u001a\u000209\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0002H\b\u001a,\u0010B\u001a\u000209\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\u001e\u0010C\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\bH\u0000\u001a!\u0010D\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\b\u001a!\u0010D\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\bH\b\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006E"}, mo43195d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "", "T", "", "getLastIndex", "(Ljava/util/List;)I", "List", FileAttachment.KEY_SIZE, "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "MutableList", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "elements", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "emptyList", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "listOfNotNull", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "rangeCheck", "", "fromIndex", "toIndex", "rangeCheck$CollectionsKt__CollectionsKt", "throwCountOverflow", "throwIndexOverflow", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "binarySearch", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "comparison", "", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "binarySearchBy", "K", "key", "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "containsAll", "", "Lkotlin/internal/OnlyInputTypes;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "optimizeReadOnlyList", "orEmpty", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__CollectionsKt extends C9201oooOooOo {
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Collection<T> m22695OooO00o(@NotNull T[] tArr) {
        o0O0OO00.OooO0o(tArr, "receiver$0");
        return new C9183oooOoOO(tArr, false);
    }

    @InlineOnly
    public static final <T> List<T> OooO0O0() {
        return m22696OooO00o();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <T> List<T> OooO0OO() {
        return new ArrayList();
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> List<T> m22696OooO00o() {
        return EmptyList.INSTANCE;
    }

    @NotNull
    public static final <T> List<T> OooO0O0(@Nullable T t) {
        return t != null ? C9201oooOooOo.OooO00o((Object) t) : m22696OooO00o();
    }

    @NotNull
    public static final <T> List<T> OooO0OO(@NotNull T... tArr) {
        o0O0OO00.OooO0o(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C9183oooOoOO(tArr, true));
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> List<T> m22698OooO00o(@NotNull T... tArr) {
        o0O0OO00.OooO0o(tArr, "elements");
        return tArr.length > 0 ? C9188oooOoOoo.OooO00o((Object[]) tArr) : m22696OooO00o();
    }

    @NotNull
    public static final <T> List<T> OooO0O0(@NotNull T... tArr) {
        o0O0OO00.OooO0o(tArr, "elements");
        return ArraysKt___ArraysKt.m22602OooO0Oo((Object[]) tArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <T> ArrayList<T> OooO00o() {
        return new ArrayList<>();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <T> List<T> OooO0O0(int i, O00O0OOO<? super Integer, ? extends T> o00o0ooo) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(o00o0ooo.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> ArrayList<T> OooO00o(@NotNull T... tArr) {
        o0O0OO00.OooO0o(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C9183oooOoOO(tArr, true));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final <T> List<T> OooO00o(int i, O00O0OOO<? super Integer, ? extends T> o00o0ooo) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(o00o0ooo.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <T> boolean OooO0O0(@Nullable Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @NotNull
    public static final IntRange OooO00o(@NotNull Collection<?> collection) {
        o0O0OO00.OooO0o(collection, "receiver$0");
        return new IntRange(0, collection.size() - 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    public static final <T> List<T> OooO0O0(@Nullable List<? extends T> list) {
        return list != 0 ? list : m22696OooO00o();
    }

    public static final <T> int OooO00o(@NotNull List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        return list.size() - 1;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final void m22701OooO0O0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> boolean m22700OooO00o(@NotNull Collection<? extends T> collection) {
        return !collection.isEmpty();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Collection<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Collection<T> m22694OooO00o(@Nullable Collection<? extends T> collection) {
        return collection != 0 ? collection : m22696OooO00o();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: C extends java.util.Collection<?> & R */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <C extends Collection<?> & R, R> R OooO00o(C c, O00O0000<? extends R> o00o0000) {
        return c.isEmpty() ? (R) o00o0000.invoke() : c;
    }

    @InlineOnly
    public static final <T> boolean OooO00o(@NotNull Collection<? extends T> collection, Collection<? extends T> collection2) {
        return collection.containsAll(collection2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> List<T> m22697OooO00o(@NotNull List<? extends T> list) {
        o0O0OO00.OooO0o(list, "receiver$0");
        int size = list.size();
        if (size == 0) {
            return m22696OooO00o();
        }
        if (size != 1) {
            return list;
        }
        return C9201oooOooOo.OooO00o(list.get(0));
    }

    public static /* synthetic */ int OooO00o(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return OooO00o(list, comparable, i, i2);
    }

    public static final <T extends Comparable<? super T>> int OooO00o(@NotNull List<? extends T> list, @Nullable T t, int i, int i2) {
        o0O0OO00.OooO0o(list, "receiver$0");
        OooO00o(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int OooO00o = C9250ooooO0oO.OooO00o((Comparable) list.get(i4), t);
            if (OooO00o < 0) {
                i = i4 + 1;
            } else if (OooO00o <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int OooO00o(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return OooO00o(list, obj, comparator, i, i2);
    }

    public static final <T> int OooO00o(@NotNull List<? extends T> list, T t, @NotNull Comparator<? super T> comparator, int i, int i2) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(comparator, "comparator");
        OooO00o(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compare = comparator.compare((Object) list.get(i4), t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int OooO00o(List list, Comparable comparable, int i, int i2, O00O0OOO o00o0ooo, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        return OooO00o(list, i, i2, new CollectionsKt__CollectionsKt$binarySearchBy$1(o00o0ooo, comparable));
    }

    public static final <T, K extends Comparable<? super K>> int OooO00o(@NotNull List<? extends T> list, @Nullable K k, int i, int i2, @NotNull O00O0OOO<? super T, ? extends K> o00o0ooo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "selector");
        return OooO00o(list, i, i2, new CollectionsKt__CollectionsKt$binarySearchBy$1(o00o0ooo, k));
    }

    public static /* synthetic */ int OooO00o(List list, int i, int i2, O00O0OOO o00o0ooo, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return OooO00o(list, i, i2, o00o0ooo);
    }

    public static final <T> int OooO00o(@NotNull List<? extends T> list, int i, int i2, @NotNull O00O0OOO<? super T, Integer> o00o0ooo) {
        o0O0OO00.OooO0o(list, "receiver$0");
        o0O0OO00.OooO0o(o00o0ooo, "comparison");
        OooO00o(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = o00o0ooo.invoke((Object) list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else if (intValue <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void OooO00o(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final void m22699OooO00o() {
        throw new ArithmeticException("Count overflow has happened.");
    }
}
