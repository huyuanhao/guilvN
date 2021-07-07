package com.google.android.gms.internal.firebase_ml;

import anet.channel.util.HttpConstant;
import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.C8318oOo0oooo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class zzez extends zzhm {
    public static final zzif zzto = new zzig("=&-_.!~*'()@:$,;/?:", false);
    public String fragment;
    public int port;
    public String zztp;
    public String zztq;
    public String zztr;
    public List<String> zzts;

    public zzez() {
        this.port = -1;
    }

    public static void zza(Set<Map.Entry<String, Object>> set, StringBuilder sb) {
        boolean z = true;
        for (Map.Entry<String, Object> entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String zzav = zzie.zzav(entry.getKey());
                if (value instanceof Collection) {
                    for (Object obj : (Collection) value) {
                        z = zza(z, sb, zzav, obj);
                    }
                } else {
                    z = zza(z, sb, zzav, value);
                }
            }
        }
    }

    public static List<String> zzw(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i = 0;
        while (z) {
            int indexOf = str.indexOf(47, i);
            boolean z2 = indexOf != -1;
            if (z2) {
                str2 = str.substring(i, indexOf);
            } else {
                str2 = str.substring(i);
            }
            arrayList.add(zzie.zzar(str2));
            i = indexOf + 1;
            z = z2;
        }
        return arrayList;
    }

    public static URL zzx(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.util.AbstractMap, com.google.android.gms.internal.firebase_ml.zzhm, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzez zzez = (zzez) super.clone();
        if (this.zzts != null) {
            zzez.zzts = new ArrayList(this.zzts);
        }
        return zzez;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof zzez)) {
            return false;
        }
        return zzew().equals(((zzez) obj).zzew());
    }

    public final int hashCode() {
        return zzew().hashCode();
    }

    public final String toString() {
        return zzew();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzez) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhm
    public final /* synthetic */ zzhm zzeh() {
        return (zzez) clone();
    }

    public final String zzew() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) zzks.checkNotNull(this.zztp));
        sb.append(HttpConstant.SCHEME_SPLIT);
        String str = this.zztr;
        if (str != null) {
            sb.append(zzie.zzau(str));
            sb.append('@');
        }
        sb.append((String) zzks.checkNotNull(this.zztq));
        int i = this.port;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        String valueOf = String.valueOf(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        List<String> list = this.zzts;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = this.zzts.get(i2);
                if (i2 != 0) {
                    sb2.append('/');
                }
                if (str2.length() != 0) {
                    sb2.append(zzie.zzas(str2));
                }
            }
        }
        zza(entrySet(), sb2);
        String str3 = this.fragment;
        if (str3 != null) {
            sb2.append('#');
            sb2.append(zzto.zzaw(str3));
        }
        String valueOf2 = String.valueOf(sb2.toString());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final URL zzu(String str) {
        try {
            return new URL(zzx(zzew()), str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void zzv(String str) {
        this.zzts = zzw(null);
    }

    public zzez(String str) {
        this(zzx(str));
    }

    public zzez(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    public static boolean zza(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            z = false;
            sb.append('?');
        } else {
            sb.append(C8318oOo0oooo.OooO0OO);
        }
        sb.append(str);
        String zzav = zzie.zzav(obj.toString());
        if (zzav.length() != 0) {
            sb.append(C7490o0OoOO0o.OooO00o);
            sb.append(zzav);
        }
        return z;
    }

    public zzez(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        this.port = -1;
        this.zztp = str.toLowerCase(Locale.US);
        this.zztq = str2;
        this.port = i;
        this.zzts = zzw(str3);
        String str7 = null;
        this.fragment = str4 != null ? zzie.zzar(str4) : null;
        if (str5 != null) {
            zzfu.zze(str5, this);
        }
        this.zztr = str6 != null ? zzie.zzar(str6) : str7;
    }
}
