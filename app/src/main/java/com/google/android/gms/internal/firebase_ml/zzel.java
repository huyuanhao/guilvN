package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C8932ooOOO0o;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class zzel {
    public static final Logger logger = Logger.getLogger(zzel.class.getName());
    public final zzfi zzsl;
    public final zzeq zzsm;
    public final String zzsn;
    public final String zzso;
    public final String zzsp;
    public final String zzsq;
    public final zzhu zzsr;
    public final boolean zzss;
    public final boolean zzst;

    public static abstract class zza {
        public zzeq zzsm;
        public String zzsn;
        public String zzso;
        public String zzsp;
        public String zzsq;
        public final zzhu zzsr;
        public final zzfo zzsu;
        public zzfj zzsv;

        public zza(zzfo zzfo, String str, String str2, zzhu zzhu, zzfj zzfj) {
            this.zzsu = (zzfo) zzks.checkNotNull(zzfo);
            this.zzsr = zzhu;
            zzk(str);
            zzl(str2);
            this.zzsv = zzfj;
        }

        public zza zza(zzeq zzeq) {
            this.zzsm = zzeq;
            return this;
        }

        public zza zzk(String str) {
            this.zzsn = zzel.zzi(str);
            return this;
        }

        public zza zzl(String str) {
            this.zzso = zzel.zzj(str);
            return this;
        }

        public zza zzm(String str) {
            this.zzsp = str;
            return this;
        }

        public zza zzn(String str) {
            this.zzsq = str;
            return this;
        }
    }

    public zzel(zza zza2) {
        zzfi zzfi;
        this.zzsm = zza2.zzsm;
        this.zzsn = zzi(zza2.zzsn);
        this.zzso = zzj(zza2.zzso);
        this.zzsp = zza2.zzsp;
        if (zzla.zzbb(zza2.zzsq)) {
            logger.logp(Level.WARNING, "com.google.api.client.googleapis.services.AbstractGoogleClient", "<init>", "Application name is not set. Call Builder#setApplicationName.");
        }
        this.zzsq = zza2.zzsq;
        zzfj zzfj = zza2.zzsv;
        if (zzfj == null) {
            zzfi = zza2.zzsu.zza(null);
        } else {
            zzfi = zza2.zzsu.zza(zzfj);
        }
        this.zzsl = zzfi;
        this.zzsr = zza2.zzsr;
        this.zzss = false;
        this.zzst = false;
    }

    public static String zzi(String str) {
        zzks.checkNotNull(str, "root URL cannot be null.");
        return !str.endsWith(C8932ooOOO0o.OooO0OO) ? String.valueOf(str).concat(C8932ooOOO0o.OooO0OO) : str;
    }

    public static String zzj(String str) {
        zzks.checkNotNull(str, "service path cannot be null");
        if (str.length() == 1) {
            zzks.checkArgument(C8932ooOOO0o.OooO0OO.equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith(C8932ooOOO0o.OooO0OO)) {
                str = String.valueOf(str).concat(C8932ooOOO0o.OooO0OO);
            }
            return str.startsWith(C8932ooOOO0o.OooO0OO) ? str.substring(1) : str;
        }
    }

    public void zza(zzem<?> zzem) throws IOException {
        zzeq zzeq = this.zzsm;
        if (zzeq != null) {
            zzeq.zza(zzem);
        }
    }

    public final String zzej() {
        String valueOf = String.valueOf(this.zzsn);
        String valueOf2 = String.valueOf(this.zzso);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final String zzek() {
        return this.zzsq;
    }

    public final zzfi zzel() {
        return this.zzsl;
    }

    public zzhu zzem() {
        return this.zzsr;
    }
}
