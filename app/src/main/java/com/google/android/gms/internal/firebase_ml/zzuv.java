package com.google.android.gms.internal.firebase_ml;

public class zzuv {
    public static final zztr zzbkc = zztr.zzql();
    public zzsw zzbpy;
    public volatile zzvo zzbpz;
    public volatile zzsw zzbqa;

    private final zzvo zzh(zzvo zzvo) {
        if (this.zzbpz == null) {
            synchronized (this) {
                if (this.zzbpz == null) {
                    try {
                        this.zzbpz = zzvo;
                        this.zzbqa = zzsw.zzbkl;
                    } catch (zzuo unused) {
                        this.zzbpz = zzvo;
                        this.zzbqa = zzsw.zzbkl;
                    }
                }
            }
        }
        return this.zzbpz;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuv)) {
            return false;
        }
        zzuv zzuv = (zzuv) obj;
        zzvo zzvo = this.zzbpz;
        zzvo zzvo2 = zzuv.zzbpz;
        if (zzvo == null && zzvo2 == null) {
            return zzpp().equals(zzuv.zzpp());
        }
        if (zzvo != null && zzvo2 != null) {
            return zzvo.equals(zzvo2);
        }
        if (zzvo != null) {
            return zzvo.equals(zzuv.zzh(zzvo.zzre()));
        }
        return zzh(zzvo2.zzre()).equals(zzvo2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzvo zzi(zzvo zzvo) {
        zzvo zzvo2 = this.zzbpz;
        this.zzbpy = null;
        this.zzbqa = null;
        this.zzbpz = zzvo;
        return zzvo2;
    }

    public final zzsw zzpp() {
        if (this.zzbqa != null) {
            return this.zzbqa;
        }
        synchronized (this) {
            if (this.zzbqa != null) {
                return this.zzbqa;
            }
            if (this.zzbpz == null) {
                this.zzbqa = zzsw.zzbkl;
            } else {
                this.zzbqa = this.zzbpz.zzpp();
            }
            return this.zzbqa;
        }
    }

    public final int zzqy() {
        if (this.zzbqa != null) {
            return this.zzbqa.size();
        }
        if (this.zzbpz != null) {
            return this.zzbpz.zzqy();
        }
        return 0;
    }
}
