package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;

public final class zzed {
    public final int flags;
    public final Object[] zzmj;
    public final int zzmk;
    public final int zzml;
    public final int zzmm;
    public final int[] zzms;
    public final zzee zznh;
    public Class<?> zzni;
    public final int zznj;
    public final int zznk;
    public final int zznl;
    public final int zznm;
    public final int zznn;
    public final int zzno;
    public int zznp;
    public int zznq;
    public int zznr = Integer.MAX_VALUE;
    public int zzns = Integer.MIN_VALUE;
    public int zznt = 0;
    public int zznu = 0;
    public int zznv = 0;
    public int zznw = 0;
    public int zznx = 0;
    public int zzny;
    public int zznz;
    public int zzoa;
    public int zzob;
    public int zzoc;
    public Field zzod;
    public Object zzoe;
    public Object zzof;
    public Object zzog;

    public zzed(Class<?> cls, String str, Object[] objArr) {
        this.zzni = cls;
        zzee zzee = new zzee(str);
        this.zznh = zzee;
        this.zzmj = objArr;
        this.flags = zzee.next();
        int next = this.zznh.next();
        this.zznj = next;
        int[] iArr = null;
        if (next == 0) {
            this.zznk = 0;
            this.zznl = 0;
            this.zzmk = 0;
            this.zzml = 0;
            this.zznm = 0;
            this.zznn = 0;
            this.zzmm = 0;
            this.zzno = 0;
            this.zzms = null;
            return;
        }
        this.zznk = this.zznh.next();
        this.zznl = this.zznh.next();
        this.zzmk = this.zznh.next();
        this.zzml = this.zznh.next();
        this.zznn = this.zznh.next();
        this.zzmm = this.zznh.next();
        this.zznm = this.zznh.next();
        this.zzno = this.zznh.next();
        int next2 = this.zznh.next();
        this.zzms = next2 != 0 ? new int[next2] : iArr;
        this.zznp = (this.zznk << 1) + this.zznl;
    }

    public static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final Object zzcw() {
        Object[] objArr = this.zzmj;
        int i = this.zznp;
        this.zznp = i + 1;
        return objArr[i];
    }

    private final boolean zzcz() {
        return (this.flags & 1) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ca, code lost:
        if (zzcz() != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0158, code lost:
        if (r1 != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015f, code lost:
        if (zzcz() != false) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean next() {
        /*
        // Method dump skipped, instructions count: 364
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzed.next():boolean");
    }

    public final int zzcx() {
        return this.zzny;
    }

    public final int zzcy() {
        return this.zzoa;
    }

    public final boolean zzda() {
        return this.zzoa > zzcb.MAP.mo11414id();
    }

    public final Field zzdb() {
        int i = this.zzob << 1;
        Object obj = this.zzmj[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field zza = zza(this.zzni, (String) obj);
        this.zzmj[i] = zza;
        return zza;
    }

    public final Field zzdc() {
        int i = (this.zzob << 1) + 1;
        Object obj = this.zzmj[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field zza = zza(this.zzni, (String) obj);
        this.zzmj[i] = zza;
        return zza;
    }

    public final Field zzdd() {
        return this.zzod;
    }

    public final boolean zzde() {
        return zzcz() && this.zzoa <= zzcb.GROUP.mo11414id();
    }

    public final Field zzdf() {
        int i = (this.zznk << 1) + (this.zzoc / 32);
        Object obj = this.zzmj[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field zza = zza(this.zzni, (String) obj);
        this.zzmj[i] = zza;
        return zza;
    }

    public final int zzdg() {
        return this.zzoc % 32;
    }

    public final boolean zzdh() {
        return (this.zznz & 256) != 0;
    }

    public final boolean zzdi() {
        return (this.zznz & 512) != 0;
    }

    public final Object zzdj() {
        return this.zzoe;
    }

    public final Object zzdk() {
        return this.zzof;
    }

    public final Object zzdl() {
        return this.zzog;
    }
}
