package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.O0OO0o;
import com.p118pd.sdk.O0o0o;
import com.p118pd.sdk.o0O0OO00;
import com.p118pd.sdk.oOO0OO0O;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u0000 )*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001)B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0018\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\rH\u0016J#\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002J\u001c\u0010&\u001a\u00020'2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\bR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, mo43195d2 = {"Lkotlin/collections/AbstractMap;", "K", ExifInterface.o000oo0o, "", "()V", "_keys", "", "_values", "", oOO0OO0O.OooO0oo, "getKeys", "()Ljava/util/Set;", FileAttachment.KEY_SIZE, "", "getSize", "()I", "values", "getValues", "()Ljava/util/Collection;", "containsEntry", "", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", DispatchConstants.OTHER, "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "isEmpty", "toString", "", "o", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public abstract class AbstractMap<K, V> implements Map<K, V>, O0OO0o {
    public static final OooO00o OooO00o = new OooO00o(null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Collection<? extends V> f23859OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Set<? extends K> f23860OooO00o;

    public static final class OooO00o {
        public OooO00o() {
        }

        public final int OooO00o(@NotNull Map.Entry<?, ?> entry) {
            o0O0OO00.OooO0o(entry, "e");
            Object key = entry.getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = entry.getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final String m22114OooO00o(@NotNull Map.Entry<?, ?> entry) {
            o0O0OO00.OooO0o(entry, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append(C7490o0OoOO0o.OooO00o);
            sb.append(entry.getValue());
            return sb.toString();
        }

        public final boolean OooO00o(@NotNull Map.Entry<?, ?> entry, @Nullable Object obj) {
            o0O0OO00.OooO0o(entry, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (!o0O0OO00.OooO00o(entry.getKey(), entry2.getKey()) || !o0O0OO00.OooO00o(entry.getValue(), entry2.getValue())) {
                return false;
            }
            return true;
        }
    }

    @Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, mo43195d2 = {"kotlin/collections/AbstractMap$keys$1", "Lkotlin/collections/AbstractSet;", FileAttachment.KEY_SIZE, "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
    public static final class OooO0O0 extends AbstractSet<K> {
        public final /* synthetic */ AbstractMap OooO00o;

        public static final class OooO00o implements Iterator<K>, O0OO0o {
            public final /* synthetic */ Iterator OooO00o;

            public OooO00o(Iterator it) {
                this.OooO00o = it;
            }

            public boolean hasNext() {
                return this.OooO00o.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((Map.Entry) this.OooO00o.next()).getKey();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO0O0(AbstractMap abstractMap) {
            this.OooO00o = abstractMap;
        }

        @Override // kotlin.collections.AbstractCollection
        public int OooO00o() {
            return this.OooO00o.size();
        }

        @Override // kotlin.collections.AbstractCollection
        public boolean contains(Object obj) {
            return this.OooO00o.containsKey(obj);
        }

        @Override // java.util.Collection, java.util.Set, kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.lang.Iterable
        @NotNull
        public Iterator<K> iterator() {
            return new OooO00o(this.OooO00o.entrySet().iterator());
        }
    }

    @Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, mo43195d2 = {"kotlin/collections/AbstractMap$values$1", "Lkotlin/collections/AbstractCollection;", FileAttachment.KEY_SIZE, "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
    public static final class OooO0OO extends AbstractCollection<V> {
        public final /* synthetic */ AbstractMap OooO00o;

        public static final class OooO00o implements Iterator<V>, O0OO0o {
            public final /* synthetic */ Iterator OooO00o;

            public OooO00o(Iterator it) {
                this.OooO00o = it;
            }

            public boolean hasNext() {
                return this.OooO00o.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return (V) ((Map.Entry) this.OooO00o.next()).getValue();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO0OO(AbstractMap abstractMap) {
            this.OooO00o = abstractMap;
        }

        @Override // kotlin.collections.AbstractCollection
        public int OooO00o() {
            return this.OooO00o.size();
        }

        @Override // kotlin.collections.AbstractCollection
        public boolean contains(Object obj) {
            return this.OooO00o.containsValue(obj);
        }

        @Override // java.util.Collection, kotlin.collections.AbstractCollection, java.lang.Iterable
        @NotNull
        public Iterator<V> iterator() {
            return new OooO00o(this.OooO00o.entrySet().iterator());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract Set m22112OooO00o();

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Set<? extends K>, java.util.Set<K> */
    @NotNull
    public Set<K> OooO0O0() {
        if (this.f23860OooO00o == null) {
            this.f23860OooO00o = new OooO0O0(this);
        }
        Set set = (Set<? extends K>) this.f23860OooO00o;
        if (set == null) {
            o0O0OO00.OooO0o0();
        }
        return set;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        return m22110OooO00o(obj) != null;
    }

    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (o0O0OO00.OooO00o(it.next().getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m22112OooO00o();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (!m22113OooO00o((Map.Entry<?, ?>) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        Map.Entry<K, V> OooO00o2 = m22110OooO00o(obj);
        if (OooO00o2 != null) {
            return OooO00o2.getValue();
        }
        return null;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return OooO0O0();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return OooO00o();
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.OooO00o(entrySet(), ", ", "{", C7522o0Ooo0o.OooO0Oo, 0, null, new AbstractMap$toString$1(this), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m22111OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m22113OooO00o(@Nullable Map.Entry<?, ?> entry) {
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        V v = get(key);
        if (!o0O0OO00.OooO00o(value, (Object) v)) {
            return false;
        }
        if (v != null || containsKey(key)) {
            return true;
        }
        return false;
    }

    public int OooO00o() {
        return entrySet().size();
    }

    /* access modifiers changed from: private */
    public final String OooO00o(Map.Entry<? extends K, ? extends V> entry) {
        return OooO00o(entry.getKey()) + C8932ooOOO0o.OooO0Oo + OooO00o(entry.getValue());
    }

    private final String OooO00o(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.Collection<? extends V>, java.util.Collection<V> */
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection<V> m22111OooO00o() {
        if (this.f23859OooO00o == null) {
            this.f23859OooO00o = new OooO0OO(this);
        }
        Collection collection = (Collection<? extends V>) this.f23859OooO00o;
        if (collection == null) {
            o0O0OO00.OooO0o0();
        }
        return collection;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private final Map.Entry<K, V> m22110OooO00o(K k) {
        T t;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (o0O0OO00.OooO00o(t.getKey(), (Object) k)) {
                break;
            }
        }
        return t;
    }
}
