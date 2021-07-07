package com.google.android.gms.internal.firebase_ml;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class zzwh<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public boolean zzbll;
    public final int zzbry;
    public List<zzwo> zzbrz;
    public Map<K, V> zzbsa;
    public volatile zzwq zzbsb;
    public Map<K, V> zzbsc;
    public volatile zzwk zzbsd;

    public zzwh(int i) {
        this.zzbry = i;
        this.zzbrz = Collections.emptyList();
        this.zzbsa = Collections.emptyMap();
        this.zzbsc = Collections.emptyMap();
    }

    public static <FieldDescriptorType extends zzty<FieldDescriptorType>> zzwh<FieldDescriptorType, Object> zzdo(int i) {
        return new zzwi(i);
    }

    /* access modifiers changed from: private */
    public final V zzdq(int i) {
        zzta();
        V v = (V) this.zzbrz.remove(i).getValue();
        if (!this.zzbsa.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zztb().entrySet().iterator();
            this.zzbrz.add(new zzwo(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* access modifiers changed from: private */
    public final void zzta() {
        if (this.zzbll) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zztb() {
        zzta();
        if (this.zzbsa.isEmpty() && !(this.zzbsa instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzbsa = treeMap;
            this.zzbsc = treeMap.descendingMap();
        }
        return (SortedMap) this.zzbsa;
    }

    public void clear() {
        zzta();
        if (!this.zzbrz.isEmpty()) {
            this.zzbrz.clear();
        }
        if (!this.zzbsa.isEmpty()) {
            this.zzbsa.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.firebase_ml.zzwh<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzbsa.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzbsb == null) {
            this.zzbsb = new zzwq(this, null);
        }
        return this.zzbsb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwh)) {
            return super.equals(obj);
        }
        zzwh zzwh = (zzwh) obj;
        int size = size();
        if (size != zzwh.size()) {
            return false;
        }
        int zzsx = zzsx();
        if (zzsx != zzwh.zzsx()) {
            return entrySet().equals(zzwh.entrySet());
        }
        for (int i = 0; i < zzsx; i++) {
            if (!zzdp(i).equals(zzwh.zzdp(i))) {
                return false;
            }
        }
        if (zzsx != size) {
            return this.zzbsa.equals(zzwh.zzbsa);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.firebase_ml.zzwh<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        return zza >= 0 ? (V) this.zzbrz.get(zza).getValue() : this.zzbsa.get(comparable);
    }

    public int hashCode() {
        int zzsx = zzsx();
        int i = 0;
        for (int i2 = 0; i2 < zzsx; i2++) {
            i += this.zzbrz.get(i2).hashCode();
        }
        return this.zzbsa.size() > 0 ? i + this.zzbsa.hashCode() : i;
    }

    public final boolean isImmutable() {
        return this.zzbll;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.firebase_ml.zzwh<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzta();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return (V) zzdq(zza);
        }
        if (this.zzbsa.isEmpty()) {
            return null;
        }
        return this.zzbsa.remove(comparable);
    }

    public int size() {
        return this.zzbrz.size() + this.zzbsa.size();
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzta();
        int zza = zza(k);
        if (zza >= 0) {
            return (V) this.zzbrz.get(zza).setValue(v);
        }
        zzta();
        if (this.zzbrz.isEmpty() && !(this.zzbrz instanceof ArrayList)) {
            this.zzbrz = new ArrayList(this.zzbry);
        }
        int i = -(zza + 1);
        if (i >= this.zzbry) {
            return zztb().put(k, v);
        }
        int size = this.zzbrz.size();
        int i2 = this.zzbry;
        if (size == i2) {
            zzwo remove = this.zzbrz.remove(i2 - 1);
            zztb().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.zzbrz.add(i, new zzwo(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> zzdp(int i) {
        return this.zzbrz.get(i);
    }

    public void zzpt() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.zzbll) {
            if (this.zzbsa.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zzbsa);
            }
            this.zzbsa = map;
            if (this.zzbsc.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zzbsc);
            }
            this.zzbsc = map2;
            this.zzbll = true;
        }
    }

    public final int zzsx() {
        return this.zzbrz.size();
    }

    public final Iterable<Map.Entry<K, V>> zzsy() {
        if (this.zzbsa.isEmpty()) {
            return zzwl.zztd();
        }
        return this.zzbsa.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzsz() {
        if (this.zzbsd == null) {
            this.zzbsd = new zzwk(this, null);
        }
        return this.zzbsd;
    }

    public /* synthetic */ zzwh(int i, zzwi zzwi) {
        this(i);
    }

    private final int zza(K k) {
        int size = this.zzbrz.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzbrz.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzbrz.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }
}
