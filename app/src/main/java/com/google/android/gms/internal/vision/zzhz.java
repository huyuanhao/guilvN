package com.google.android.gms.internal.vision;

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

public class zzhz<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public final int zzaae;
    public List<zzig> zzaaf;
    public Map<K, V> zzaag;
    public volatile zzii zzaah;
    public Map<K, V> zzaai;
    public volatile zzic zzaaj;
    public boolean zztn;

    public zzhz(int i) {
        this.zzaae = i;
        this.zzaaf = Collections.emptyList();
        this.zzaag = Collections.emptyMap();
        this.zzaai = Collections.emptyMap();
    }

    public static <FieldDescriptorType extends zzfr<FieldDescriptorType>> zzhz<FieldDescriptorType, Object> zzbo(int i) {
        return new zzia(i);
    }

    /* access modifiers changed from: private */
    public final V zzbq(int i) {
        zzgx();
        V v = (V) this.zzaaf.remove(i).getValue();
        if (!this.zzaag.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzgy().entrySet().iterator();
            this.zzaaf.add(new zzig(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* access modifiers changed from: private */
    public final void zzgx() {
        if (this.zztn) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzgy() {
        zzgx();
        if (this.zzaag.isEmpty() && !(this.zzaag instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzaag = treeMap;
            this.zzaai = treeMap.descendingMap();
        }
        return (SortedMap) this.zzaag;
    }

    public void clear() {
        zzgx();
        if (!this.zzaaf.isEmpty()) {
            this.zzaaf.clear();
        }
        if (!this.zzaag.isEmpty()) {
            this.zzaag.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.vision.zzhz<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzaag.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzaah == null) {
            this.zzaah = new zzii(this, null);
        }
        return this.zzaah;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhz)) {
            return super.equals(obj);
        }
        zzhz zzhz = (zzhz) obj;
        int size = size();
        if (size != zzhz.size()) {
            return false;
        }
        int zzgu = zzgu();
        if (zzgu != zzhz.zzgu()) {
            return entrySet().equals(zzhz.entrySet());
        }
        for (int i = 0; i < zzgu; i++) {
            if (!zzbp(i).equals(zzhz.zzbp(i))) {
                return false;
            }
        }
        if (zzgu != size) {
            return this.zzaag.equals(zzhz.zzaag);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.vision.zzhz<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        return zza >= 0 ? (V) this.zzaaf.get(zza).getValue() : this.zzaag.get(comparable);
    }

    public int hashCode() {
        int zzgu = zzgu();
        int i = 0;
        for (int i2 = 0; i2 < zzgu; i2++) {
            i += this.zzaaf.get(i2).hashCode();
        }
        return this.zzaag.size() > 0 ? i + this.zzaag.hashCode() : i;
    }

    public final boolean isImmutable() {
        return this.zztn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.vision.zzhz<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzgx();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return (V) zzbq(zza);
        }
        if (this.zzaag.isEmpty()) {
            return null;
        }
        return this.zzaag.remove(comparable);
    }

    public int size() {
        return this.zzaaf.size() + this.zzaag.size();
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzgx();
        int zza = zza(k);
        if (zza >= 0) {
            return (V) this.zzaaf.get(zza).setValue(v);
        }
        zzgx();
        if (this.zzaaf.isEmpty() && !(this.zzaaf instanceof ArrayList)) {
            this.zzaaf = new ArrayList(this.zzaae);
        }
        int i = -(zza + 1);
        if (i >= this.zzaae) {
            return zzgy().put(k, v);
        }
        int size = this.zzaaf.size();
        int i2 = this.zzaae;
        if (size == i2) {
            zzig remove = this.zzaaf.remove(i2 - 1);
            zzgy().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.zzaaf.add(i, new zzig(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> zzbp(int i) {
        return this.zzaaf.get(i);
    }

    public void zzci() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.zztn) {
            if (this.zzaag.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zzaag);
            }
            this.zzaag = map;
            if (this.zzaai.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zzaai);
            }
            this.zzaai = map2;
            this.zztn = true;
        }
    }

    public final int zzgu() {
        return this.zzaaf.size();
    }

    public final Iterable<Map.Entry<K, V>> zzgv() {
        if (this.zzaag.isEmpty()) {
            return zzid.zzha();
        }
        return this.zzaag.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzgw() {
        if (this.zzaaj == null) {
            this.zzaaj = new zzic(this, null);
        }
        return this.zzaaj;
    }

    public /* synthetic */ zzhz(int i, zzia zzia) {
        this(i);
    }

    private final int zza(K k) {
        int size = this.zzaaf.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzaaf.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.zzaaf.get(i2).getKey());
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
