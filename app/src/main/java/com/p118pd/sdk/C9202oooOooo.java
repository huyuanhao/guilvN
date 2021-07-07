package com.p118pd.sdk;

import com.taobao.accs.AccsClientConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000:\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a \u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a,\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a\u001d\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0002¢\u0006\u0002\b\u0013\u001a@\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u00100\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0016*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00160\u00150\u0001¨\u0006\u0017"}, mo43195d2 = {"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", AccsClientConfig.DEFAULT_CONFIGTAG, "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "convertToSetForSetOperation", "", "convertToSetForSetOperationWith", "source", "flatten", "", "safeToConvertToSet", "", "safeToConvertToSet$CollectionsKt__IterablesKt", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/collections/CollectionsKt")
/* renamed from: com.pd.sdk.oooOooo  reason: case insensitive filesystem */
public class C9202oooOooo extends CollectionsKt__CollectionsKt {

    /* renamed from: com.pd.sdk.oooOooo$OooO00o */
    public static final class OooO00o implements Iterable<T>, O0OO0o {
        public final /* synthetic */ O00O0000 OooO00o;

        public OooO00o(O00O0000 o00o0000) {
            this.OooO00o = o00o0000;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return (Iterator) this.OooO00o.invoke();
        }
    }

    @InlineOnly
    public static final <T> Iterable<T> OooO00o(O00O0000<? extends Iterator<? extends T>> o00o0000) {
        return new OooO00o(o00o0000);
    }

    public static final <T> boolean OooO0OO(@NotNull Collection<? extends T> collection) {
        return collection.size() > 2 && (collection instanceof ArrayList);
    }

    @PublishedApi
    @Nullable
    public static final <T> Integer OooO00o(@NotNull Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @PublishedApi
    public static final <T> int OooO00o(@NotNull Iterable<? extends T> iterable, int i) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    @NotNull
    public static final <T> Collection<T> OooO00o(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        o0O0OO00.OooO0o(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return CollectionsKt___CollectionsKt.m22718OooO00o((Iterable) iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        if (OooO0OO(collection)) {
            return CollectionsKt___CollectionsKt.m22718OooO00o((Iterable) iterable);
        }
        return collection;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> Collection<T> m21070OooO00o(@NotNull Iterable<? extends T> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return CollectionsKt___CollectionsKt.m22718OooO00o((Iterable) iterable);
        }
        Collection<T> collection = (Collection) iterable;
        if (OooO0OO(collection)) {
            return CollectionsKt___CollectionsKt.m22718OooO00o((Iterable) iterable);
        }
        return collection;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T> List<T> m21071OooO00o(@NotNull Iterable<? extends Iterable<? extends T>> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            C9210oooo000O.m21074OooO00o((Collection) arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T, R> Pair<List<T>, List<R>> m21072OooO00o(@NotNull Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        o0O0OO00.OooO0o(iterable, "receiver$0");
        int OooO00o2 = OooO00o(iterable, 10);
        ArrayList arrayList = new ArrayList(OooO00o2);
        ArrayList arrayList2 = new ArrayList(OooO00o2);
        Iterator<? extends Pair<? extends T, ? extends R>> it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return C9163oooOOO0O.OooO00o(arrayList, arrayList2);
    }
}
