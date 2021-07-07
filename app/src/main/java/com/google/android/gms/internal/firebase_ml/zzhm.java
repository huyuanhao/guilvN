package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class zzhm extends AbstractMap<String, Object> implements Cloneable {
    public final zzhd zztx;
    public Map<String, Object> zzzr;

    public final class zza implements Iterator<Map.Entry<String, Object>> {
        public boolean zzzs;
        public final Iterator<Map.Entry<String, Object>> zzzt;
        public final Iterator<Map.Entry<String, Object>> zzzu;

        public zza(zzhm zzhm, zzhj zzhj) {
            this.zzzt = (zzhi) zzhj.iterator();
            this.zzzu = zzhm.zzzr.entrySet().iterator();
        }

        public final boolean hasNext() {
            return this.zzzt.hasNext() || this.zzzu.hasNext();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ Map.Entry<String, Object> next() {
            if (!this.zzzs) {
                if (this.zzzt.hasNext()) {
                    return this.zzzt.next();
                }
                this.zzzs = true;
            }
            return this.zzzu.next();
        }

        public final void remove() {
            if (this.zzzs) {
                this.zzzu.remove();
            }
            this.zzzt.remove();
        }
    }

    public final class zzb extends AbstractSet<Map.Entry<String, Object>> {
        public final zzhj zzzv;

        public zzb() {
            this.zzzv = (zzhj) new zzhg(zzhm.this, zzhm.this.zztx.zzhc()).entrySet();
        }

        public final void clear() {
            zzhm.this.zzzr.clear();
            this.zzzv.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<String, Object>> iterator() {
            return new zza(zzhm.this, this.zzzv);
        }

        public final int size() {
            return zzhm.this.zzzr.size() + this.zzzv.size();
        }
    }

    public enum zzc {
        IGNORE_CASE
    }

    public zzhm() {
        this(EnumSet.noneOf(zzc.class));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return new zzb();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        zzhl zzao = this.zztx.zzao(str);
        if (zzao != null) {
            return zzao.zzh(this);
        }
        if (this.zztx.zzhc()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.zzzr.get(str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map<? extends java.lang.String, ?>] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        for (Map.Entry<? extends String, ? extends Object> entry : map.entrySet()) {
            zzb((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.zztx.zzao(str) == null) {
            if (this.zztx.zzhc()) {
                str = str.toLowerCase(Locale.US);
            }
            return this.zzzr.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public zzhm zzb(String str, Object obj) {
        zzhl zzao = this.zztx.zzao(str);
        if (zzao != null) {
            zzao.zzb(this, obj);
        } else {
            if (this.zztx.zzhc()) {
                str = str.toLowerCase(Locale.US);
            }
            this.zzzr.put(str, obj);
        }
        return this;
    }

    /* renamed from: zzeh */
    public zzhm clone() {
        try {
            zzhm zzhm = (zzhm) super.clone();
            zzhf.zza(this, zzhm);
            zzhm.zzzr = (Map) zzhf.clone(this.zzzr);
            return zzhm;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: zzf */
    public final Object put(String str, Object obj) {
        zzhl zzao = this.zztx.zzao(str);
        if (zzao != null) {
            Object zzh = zzao.zzh(this);
            zzao.zzb(this, obj);
            return zzh;
        }
        if (this.zztx.zzhc()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.zzzr.put(str, obj);
    }

    public final zzhd zzhi() {
        return this.zztx;
    }

    public zzhm(EnumSet<zzc> enumSet) {
        this.zzzr = new zzgx();
        this.zztx = zzhd.zza(getClass(), enumSet.contains(zzc.IGNORE_CASE));
    }
}
