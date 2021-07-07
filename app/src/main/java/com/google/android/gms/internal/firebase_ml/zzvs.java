package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C6140iIil;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class zzvs<T> implements zzwe<T> {
    public static final int[] zzbqv = new int[0];
    public static final Unsafe zzbqw = zzxc.zztl();
    public final int[] zzbqx;
    public final Object[] zzbqy;
    public final int zzbqz;
    public final int zzbra;
    public final zzvo zzbrb;
    public final boolean zzbrc;
    public final boolean zzbrd;
    public final boolean zzbre;
    public final boolean zzbrf;
    public final int[] zzbrg;
    public final int zzbrh;
    public final int zzbri;
    public final zzvw zzbrj;
    public final zzuy zzbrk;
    public final zzww<?, ?> zzbrl;
    public final zztt<?> zzbrm;
    public final zzvj zzbrn;

    public zzvs(int[] iArr, Object[] objArr, int i, int i2, zzvo zzvo, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzvw zzvw, zzuy zzuy, zzww<?, ?> zzww, zztt<?> zztt, zzvj zzvj) {
        this.zzbqx = iArr;
        this.zzbqy = objArr;
        this.zzbqz = i;
        this.zzbra = i2;
        this.zzbrd = zzvo instanceof zzue;
        this.zzbre = z;
        this.zzbrc = zztt != null && zztt.zze(zzvo);
        this.zzbrf = false;
        this.zzbrg = iArr2;
        this.zzbrh = i3;
        this.zzbri = i4;
        this.zzbrj = zzvw;
        this.zzbrk = zzuy;
        this.zzbrl = zzww;
        this.zzbrm = zztt;
        this.zzbrb = zzvo;
        this.zzbrn = zzvj;
    }

    public static <T> zzvs<T> zza(Class<T> cls, zzvm zzvm, zzvw zzvw, zzuy zzuy, zzww<?, ?> zzww, zztt<?> zztt, zzvj zzvj) {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        zzwd zzwd;
        int i11;
        Class<?> cls2;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        Field field;
        int i17;
        char charAt;
        int i18;
        Field field2;
        Field field3;
        int i19;
        char charAt2;
        int i20;
        char charAt3;
        int i21;
        char charAt4;
        int i22;
        int i23;
        char charAt5;
        int i24;
        char charAt6;
        int i25;
        char charAt7;
        int i26;
        char charAt8;
        int i27;
        char charAt9;
        int i28;
        char charAt10;
        int i29;
        char charAt11;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        char charAt14;
        if (zzvm instanceof zzwd) {
            zzwd zzwd2 = (zzwd) zzvm;
            int i32 = 0;
            boolean z2 = zzwd2.zzsh() == zzue.zzf.zzbox;
            String zzsq = zzwd2.zzsq();
            int length = zzsq.length();
            int charAt15 = zzsq.charAt(0);
            if (charAt15 >= 55296) {
                int i33 = charAt15 & 8191;
                int i34 = 1;
                int i35 = 13;
                while (true) {
                    i = i34 + 1;
                    charAt14 = zzsq.charAt(i34);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i33 |= (charAt14 & 8191) << i35;
                    i35 += 13;
                    i34 = i;
                }
                charAt15 = i33 | (charAt14 << i35);
            } else {
                i = 1;
            }
            int i36 = i + 1;
            int charAt16 = zzsq.charAt(i);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i31 = i36 + 1;
                    charAt13 = zzsq.charAt(i36);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i37 |= (charAt13 & 8191) << i38;
                    i38 += 13;
                    i36 = i31;
                }
                charAt16 = i37 | (charAt13 << i38);
                i36 = i31;
            }
            if (charAt16 == 0) {
                iArr = zzbqv;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                i2 = 0;
            } else {
                int i39 = i36 + 1;
                int charAt17 = zzsq.charAt(i36);
                if (charAt17 >= 55296) {
                    int i40 = charAt17 & 8191;
                    int i41 = 13;
                    while (true) {
                        i30 = i39 + 1;
                        charAt12 = zzsq.charAt(i39);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i40 |= (charAt12 & 8191) << i41;
                        i41 += 13;
                        i39 = i30;
                    }
                    charAt17 = i40 | (charAt12 << i41);
                    i39 = i30;
                }
                int i42 = i39 + 1;
                int charAt18 = zzsq.charAt(i39);
                if (charAt18 >= 55296) {
                    int i43 = charAt18 & 8191;
                    int i44 = 13;
                    while (true) {
                        i29 = i42 + 1;
                        charAt11 = zzsq.charAt(i42);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i43 |= (charAt11 & 8191) << i44;
                        i44 += 13;
                        i42 = i29;
                    }
                    charAt18 = i43 | (charAt11 << i44);
                    i42 = i29;
                }
                int i45 = i42 + 1;
                i5 = zzsq.charAt(i42);
                if (i5 >= 55296) {
                    int i46 = i5 & 8191;
                    int i47 = 13;
                    while (true) {
                        i28 = i45 + 1;
                        charAt10 = zzsq.charAt(i45);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i46 |= (charAt10 & 8191) << i47;
                        i47 += 13;
                        i45 = i28;
                    }
                    i5 = i46 | (charAt10 << i47);
                    i45 = i28;
                }
                int i48 = i45 + 1;
                int charAt19 = zzsq.charAt(i45);
                if (charAt19 >= 55296) {
                    int i49 = charAt19 & 8191;
                    int i50 = 13;
                    while (true) {
                        i27 = i48 + 1;
                        charAt9 = zzsq.charAt(i48);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i49 |= (charAt9 & 8191) << i50;
                        i50 += 13;
                        i48 = i27;
                    }
                    charAt19 = i49 | (charAt9 << i50);
                    i48 = i27;
                }
                int i51 = i48 + 1;
                i3 = zzsq.charAt(i48);
                if (i3 >= 55296) {
                    int i52 = i3 & 8191;
                    int i53 = 13;
                    while (true) {
                        i26 = i51 + 1;
                        charAt8 = zzsq.charAt(i51);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i52 |= (charAt8 & 8191) << i53;
                        i53 += 13;
                        i51 = i26;
                    }
                    i3 = i52 | (charAt8 << i53);
                    i51 = i26;
                }
                int i54 = i51 + 1;
                int charAt20 = zzsq.charAt(i51);
                if (charAt20 >= 55296) {
                    int i55 = charAt20 & 8191;
                    int i56 = 13;
                    while (true) {
                        i25 = i54 + 1;
                        charAt7 = zzsq.charAt(i54);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i55 |= (charAt7 & 8191) << i56;
                        i56 += 13;
                        i54 = i25;
                    }
                    charAt20 = i55 | (charAt7 << i56);
                    i54 = i25;
                }
                int i57 = i54 + 1;
                int charAt21 = zzsq.charAt(i54);
                if (charAt21 >= 55296) {
                    int i58 = charAt21 & 8191;
                    int i59 = i57;
                    int i60 = 13;
                    while (true) {
                        i24 = i59 + 1;
                        charAt6 = zzsq.charAt(i59);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i58 |= (charAt6 & 8191) << i60;
                        i60 += 13;
                        i59 = i24;
                    }
                    charAt21 = i58 | (charAt6 << i60);
                    i22 = i24;
                } else {
                    i22 = i57;
                }
                int i61 = i22 + 1;
                int charAt22 = zzsq.charAt(i22);
                if (charAt22 >= 55296) {
                    int i62 = charAt22 & 8191;
                    int i63 = i61;
                    int i64 = 13;
                    while (true) {
                        i23 = i63 + 1;
                        charAt5 = zzsq.charAt(i63);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i62 |= (charAt5 & 8191) << i64;
                        i64 += 13;
                        i63 = i23;
                    }
                    charAt22 = i62 | (charAt5 << i64);
                    i61 = i23;
                }
                int i65 = (charAt17 << 1) + charAt18;
                i6 = charAt19;
                i4 = i65;
                i2 = charAt22;
                i32 = charAt17;
                i36 = i61;
                iArr = new int[(charAt22 + charAt20 + charAt21)];
                i7 = charAt20;
            }
            Unsafe unsafe = zzbqw;
            Object[] zzsr = zzwd2.zzsr();
            Class<?> cls3 = zzwd2.zzsj().getClass();
            int[] iArr2 = new int[(i3 * 3)];
            Object[] objArr = new Object[(i3 << 1)];
            int i66 = i2 + i7;
            int i67 = i2;
            int i68 = i36;
            int i69 = i66;
            int i70 = 0;
            int i71 = 0;
            while (i68 < length) {
                int i72 = i68 + 1;
                int charAt23 = zzsq.charAt(i68);
                if (charAt23 >= 55296) {
                    int i73 = charAt23 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i21 = i74 + 1;
                        charAt4 = zzsq.charAt(i74);
                        i8 = i2;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i73 |= (charAt4 & 8191) << i75;
                        i75 += 13;
                        i74 = i21;
                        i2 = i8;
                    }
                    charAt23 = i73 | (charAt4 << i75);
                    i9 = i21;
                } else {
                    i8 = i2;
                    i9 = i72;
                }
                int i76 = i9 + 1;
                int charAt24 = zzsq.charAt(i9);
                if (charAt24 >= 55296) {
                    int i77 = charAt24 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i20 = i78 + 1;
                        charAt3 = zzsq.charAt(i78);
                        z = z2;
                        if (charAt3 < 55296) {
                            break;
                        }
                        i77 |= (charAt3 & 8191) << i79;
                        i79 += 13;
                        i78 = i20;
                        z2 = z;
                    }
                    charAt24 = i77 | (charAt3 << i79);
                    i10 = i20;
                } else {
                    z = z2;
                    i10 = i76;
                }
                int i80 = charAt24 & 255;
                if ((charAt24 & 1024) != 0) {
                    iArr[i70] = i71;
                    i70++;
                }
                if (i80 >= 51) {
                    int i81 = i10 + 1;
                    int charAt25 = zzsq.charAt(i10);
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i82 = charAt25 & 8191;
                        int i83 = 13;
                        while (true) {
                            i19 = i81 + 1;
                            charAt2 = zzsq.charAt(i81);
                            if (charAt2 < c) {
                                break;
                            }
                            i82 |= (charAt2 & 8191) << i83;
                            i83 += 13;
                            i81 = i19;
                            c = 55296;
                        }
                        charAt25 = i82 | (charAt2 << i83);
                        i81 = i19;
                    }
                    int i84 = i80 - 51;
                    if (i84 == 9 || i84 == 17) {
                        objArr[((i71 / 3) << 1) + 1] = zzsr[i4];
                        i4++;
                    } else if (i84 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i71 / 3) << 1) + 1] = zzsr[i4];
                        i4++;
                    }
                    int i85 = charAt25 << 1;
                    Object obj = zzsr[i85];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = zza(cls3, (String) obj);
                        zzsr[i85] = field2;
                    }
                    zzwd = zzwd2;
                    i14 = (int) unsafe.objectFieldOffset(field2);
                    int i86 = i85 + 1;
                    Object obj2 = zzsr[i86];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = zza(cls3, (String) obj2);
                        zzsr[i86] = field3;
                    }
                    cls2 = cls3;
                    i11 = i4;
                    i10 = i81;
                    str = zzsq;
                    i12 = 0;
                    i13 = (int) unsafe.objectFieldOffset(field3);
                    i15 = i32;
                } else {
                    zzwd = zzwd2;
                    int i87 = i4 + 1;
                    Field zza = zza(cls3, (String) zzsr[i4]);
                    if (i80 == 9 || i80 == 17) {
                        i16 = 1;
                        objArr[((i71 / 3) << 1) + 1] = zza.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            i16 = 1;
                            i18 = i87 + 1;
                            objArr[((i71 / 3) << 1) + 1] = zzsr[i87];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            i16 = 1;
                            if ((charAt15 & 1) == 1) {
                                i18 = i87 + 1;
                                objArr[((i71 / 3) << 1) + 1] = zzsr[i87];
                            }
                        } else {
                            if (i80 == 50) {
                                int i88 = i67 + 1;
                                iArr[i67] = i71;
                                int i89 = (i71 / 3) << 1;
                                int i90 = i87 + 1;
                                objArr[i89] = zzsr[i87];
                                if ((charAt24 & 2048) != 0) {
                                    i87 = i90 + 1;
                                    objArr[i89 + 1] = zzsr[i90];
                                    i67 = i88;
                                } else {
                                    i87 = i90;
                                    i16 = 1;
                                    i67 = i88;
                                }
                            }
                            i16 = 1;
                        }
                        i87 = i18;
                    }
                    i14 = (int) unsafe.objectFieldOffset(zza);
                    if ((charAt15 & 1) != i16 || i80 > 17) {
                        i11 = i87;
                        i15 = i32;
                        cls2 = cls3;
                        str = zzsq;
                        i13 = 0;
                        i12 = 0;
                    } else {
                        int i91 = i10 + 1;
                        str = zzsq;
                        int charAt26 = str.charAt(i10);
                        if (charAt26 >= 55296) {
                            int i92 = charAt26 & 8191;
                            int i93 = 13;
                            while (true) {
                                i17 = i91 + 1;
                                charAt = str.charAt(i91);
                                if (charAt < 55296) {
                                    break;
                                }
                                i92 |= (charAt & 8191) << i93;
                                i93 += 13;
                                i91 = i17;
                            }
                            charAt26 = i92 | (charAt << i93);
                            i91 = i17;
                        }
                        int i94 = (i32 << 1) + (charAt26 / 32);
                        Object obj3 = zzsr[i94];
                        i11 = i87;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = zza(cls3, (String) obj3);
                            zzsr[i94] = field;
                        }
                        i15 = i32;
                        cls2 = cls3;
                        i13 = (int) unsafe.objectFieldOffset(field);
                        i12 = charAt26 % 32;
                        i10 = i91;
                    }
                    if (i80 >= 18 && i80 <= 49) {
                        iArr[i69] = i14;
                        i69++;
                    }
                }
                int i95 = i71 + 1;
                iArr2[i71] = charAt23;
                int i96 = i95 + 1;
                iArr2[i95] = i14 | ((charAt24 & 256) != 0 ? CommonNetImpl.FLAG_AUTH : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i80 << 20);
                i71 = i96 + 1;
                iArr2[i96] = (i12 << 20) | i13;
                i32 = i15;
                zzsq = str;
                i68 = i10;
                cls3 = cls2;
                i6 = i6;
                length = length;
                i2 = i8;
                z2 = z;
                i5 = i5;
                i4 = i11;
                zzwd2 = zzwd;
            }
            return new zzvs<>(iArr2, objArr, i5, i6, zzwd2.zzsj(), z2, false, iArr, i2, i66, zzvw, zzuy, zzww, zztt, zzvj);
        }
        ((zzwr) zzvm).zzsh();
        int i97 = zzue.zzf.zzbox;
        throw new NoSuchMethodError();
    }

    public static zzwx zzab(Object obj) {
        zzue zzue = (zzue) obj;
        zzwx zzwx = zzue.zzboh;
        if (zzwx != zzwx.zztg()) {
            return zzwx;
        }
        zzwx zzth = zzwx.zzth();
        zzue.zzboh = zzth;
        return zzth;
    }

    private final void zzb(T t, T t2, int i) {
        int zzdl = zzdl(i);
        int i2 = this.zzbqx[i];
        long j = (long) (zzdl & 1048575);
        if (zza(t2, i2, i)) {
            Object zzp = zzxc.zzp(t, j);
            Object zzp2 = zzxc.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzxc.zza(t, j, zzug.zze(zzp, zzp2));
                zzb(t, i2, i);
            } else if (zzp2 != null) {
                zzxc.zza(t, j, zzp2);
                zzb(t, i2, i);
            }
        }
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private final zzwe zzdi(int i) {
        int i2 = (i / 3) << 1;
        zzwe zzwe = (zzwe) this.zzbqy[i2];
        if (zzwe != null) {
            return zzwe;
        }
        zzwe<T> zzk = zzwb.zzso().zzk((Class) this.zzbqy[i2 + 1]);
        this.zzbqy[i2] = zzk;
        return zzk;
    }

    private final Object zzdj(int i) {
        return this.zzbqy[(i / 3) << 1];
    }

    private final zzuj zzdk(int i) {
        return (zzuj) this.zzbqy[((i / 3) << 1) + 1];
    }

    private final int zzdl(int i) {
        return this.zzbqx[i + 1];
    }

    private final int zzdm(int i) {
        return this.zzbqx[i + 2];
    }

    private final int zzdn(int i) {
        if (i < this.zzbqz || i > this.zzbra) {
            return -1;
        }
        return zzv(i, 0);
    }

    public static <E> List<E> zze(Object obj, long j) {
        return (List) zzxc.zzp(obj, j);
    }

    public static <T> double zzf(T t, long j) {
        return ((Double) zzxc.zzp(t, j)).doubleValue();
    }

    public static <T> int zzh(T t, long j) {
        return ((Integer) zzxc.zzp(t, j)).intValue();
    }

    public static <T> long zzi(T t, long j) {
        return ((Long) zzxc.zzp(t, j)).longValue();
    }

    public static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzxc.zzp(t, j)).booleanValue();
    }

    private final int zzu(int i, int i2) {
        if (i < this.zzbqz || i > this.zzbra) {
            return -1;
        }
        return zzv(i, i2);
    }

    private final int zzv(int i, int i2) {
        int length = (this.zzbqx.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzbqx[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzwg.zzh(com.google.android.gms.internal.firebase_ml.zzxc.zzp(r10, r6), com.google.android.gms.internal.firebase_ml.zzxc.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzl(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzk(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzl(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzk(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzk(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzk(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzwg.zzh(com.google.android.gms.internal.firebase_ml.zzxc.zzp(r10, r6), com.google.android.gms.internal.firebase_ml.zzxc.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzwg.zzh(com.google.android.gms.internal.firebase_ml.zzxc.zzp(r10, r6), com.google.android.gms.internal.firebase_ml.zzxc.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzwg.zzh(com.google.android.gms.internal.firebase_ml.zzxc.zzp(r10, r6), com.google.android.gms.internal.firebase_ml.zzxc.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzm(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzm(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzk(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzl(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzk(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzl(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzxc.zzl(r10, r6) == com.google.android.gms.internal.firebase_ml.zzxc.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.firebase_ml.zzxc.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.firebase_ml.zzxc.zzn(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.firebase_ml.zzxc.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.firebase_ml.zzxc.zzo(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzwg.zzh(com.google.android.gms.internal.firebase_ml.zzxc.zzp(r10, r6), com.google.android.gms.internal.firebase_ml.zzxc.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(T r10, T r11) {
        /*
        // Method dump skipped, instructions count: 640
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvs.equals(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final int hashCode(T t) {
        int i;
        int i2;
        int length = this.zzbqx.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzdl = zzdl(i4);
            int i5 = this.zzbqx[i4];
            long j = (long) (1048575 & zzdl);
            int i6 = 37;
            switch ((zzdl & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    i = zzug.zzz(Double.doubleToLongBits(zzxc.zzo(t, j)));
                    i3 = i2 + i;
                    break;
                case 1:
                    i2 = i3 * 53;
                    i = Float.floatToIntBits(zzxc.zzn(t, j));
                    i3 = i2 + i;
                    break;
                case 2:
                    i2 = i3 * 53;
                    i = zzug.zzz(zzxc.zzl(t, j));
                    i3 = i2 + i;
                    break;
                case 3:
                    i2 = i3 * 53;
                    i = zzug.zzz(zzxc.zzl(t, j));
                    i3 = i2 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    i = zzxc.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 5:
                    i2 = i3 * 53;
                    i = zzug.zzz(zzxc.zzl(t, j));
                    i3 = i2 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    i = zzxc.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    i = zzug.zzaj(zzxc.zzm(t, j));
                    i3 = i2 + i;
                    break;
                case 8:
                    i2 = i3 * 53;
                    i = ((String) zzxc.zzp(t, j)).hashCode();
                    i3 = i2 + i;
                    break;
                case 9:
                    Object zzp = zzxc.zzp(t, j);
                    if (zzp != null) {
                        i6 = zzp.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    i = zzxc.zzp(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    i = zzxc.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 12:
                    i2 = i3 * 53;
                    i = zzxc.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 13:
                    i2 = i3 * 53;
                    i = zzxc.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 14:
                    i2 = i3 * 53;
                    i = zzug.zzz(zzxc.zzl(t, j));
                    i3 = i2 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    i = zzxc.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 16:
                    i2 = i3 * 53;
                    i = zzug.zzz(zzxc.zzl(t, j));
                    i3 = i2 + i;
                    break;
                case 17:
                    Object zzp2 = zzxc.zzp(t, j);
                    if (zzp2 != null) {
                        i6 = zzp2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    i = zzxc.zzp(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 50:
                    i2 = i3 * 53;
                    i = zzxc.zzp(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 51:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzug.zzz(Double.doubleToLongBits(zzf(t, j)));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = Float.floatToIntBits(zzg(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzug.zzz(zzi(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzug.zzz(zzi(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzh(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzug.zzz(zzi(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzh(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzug.zzaj(zzj(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = ((String) zzxc.zzp(t, j)).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzxc.zzp(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzxc.zzp(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzh(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzh(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzh(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzug.zzz(zzi(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzh(t, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzug.zzz(zzi(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzxc.zzp(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.zzbrl.zzae(t).hashCode();
        return this.zzbrc ? (hashCode * 53) + this.zzbrm.zzo(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final T newInstance() {
        return (T) this.zzbrj.newInstance(this.zzbrb);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final int zzaa(T t) {
        int i;
        int i2;
        long j;
        int i3;
        int zzc;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzb;
        int i9;
        int i10;
        int i11;
        int i12 = 267386880;
        int i13 = 1;
        if (this.zzbre) {
            Unsafe unsafe = zzbqw;
            int i14 = 0;
            int i15 = 0;
            while (i14 < this.zzbqx.length) {
                int zzdl = zzdl(i14);
                int i16 = (zzdl & i12) >>> 20;
                int i17 = this.zzbqx[i14];
                long j2 = (long) (zzdl & 1048575);
                int i18 = (i16 < zztz.DOUBLE_LIST_PACKED.mo12532id() || i16 > zztz.SINT64_LIST_PACKED.mo12532id()) ? 0 : this.zzbqx[i14 + 2] & 1048575;
                switch (i16) {
                    case 0:
                        if (zza(t, i14)) {
                            zzb = zztl.zzb(i17, (double) AbstractC8352oOoOOoO0.OooO0O0);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 1:
                        if (zza(t, i14)) {
                            zzb = zztl.zzb(i17, 0.0f);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 2:
                        if (zza(t, i14)) {
                            zzb = zztl.zzd(i17, zzxc.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 3:
                        if (zza(t, i14)) {
                            zzb = zztl.zze(i17, zzxc.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 4:
                        if (zza(t, i14)) {
                            zzb = zztl.zzl(i17, zzxc.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 5:
                        if (zza(t, i14)) {
                            zzb = zztl.zzg(i17, 0L);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 6:
                        if (zza(t, i14)) {
                            zzb = zztl.zzo(i17, 0);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 7:
                        if (zza(t, i14)) {
                            zzb = zztl.zzc(i17, true);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 8:
                        if (zza(t, i14)) {
                            Object zzp = zzxc.zzp(t, j2);
                            if (zzp instanceof zzsw) {
                                zzb = zztl.zzc(i17, (zzsw) zzp);
                                break;
                            } else {
                                zzb = zztl.zzc(i17, (String) zzp);
                                break;
                            }
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 9:
                        if (zza(t, i14)) {
                            zzb = zzwg.zzc(i17, zzxc.zzp(t, j2), zzdi(i14));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 10:
                        if (zza(t, i14)) {
                            zzb = zztl.zzc(i17, (zzsw) zzxc.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 11:
                        if (zza(t, i14)) {
                            zzb = zztl.zzm(i17, zzxc.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 12:
                        if (zza(t, i14)) {
                            zzb = zztl.zzq(i17, zzxc.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 13:
                        if (zza(t, i14)) {
                            zzb = zztl.zzp(i17, 0);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 14:
                        if (zza(t, i14)) {
                            zzb = zztl.zzh(i17, 0L);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 15:
                        if (zza(t, i14)) {
                            zzb = zztl.zzn(i17, zzxc.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 16:
                        if (zza(t, i14)) {
                            zzb = zztl.zzf(i17, zzxc.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 17:
                        if (zza(t, i14)) {
                            zzb = zztl.zzc(i17, (zzvo) zzxc.zzp(t, j2), zzdi(i14));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 18:
                        zzb = zzwg.zzw(i17, zze(t, j2), false);
                        break;
                    case 19:
                        zzb = zzwg.zzv(i17, zze(t, j2), false);
                        break;
                    case 20:
                        zzb = zzwg.zzo(i17, zze(t, j2), false);
                        break;
                    case 21:
                        zzb = zzwg.zzp(i17, zze(t, j2), false);
                        break;
                    case 22:
                        zzb = zzwg.zzs(i17, zze(t, j2), false);
                        break;
                    case 23:
                        zzb = zzwg.zzw(i17, zze(t, j2), false);
                        break;
                    case 24:
                        zzb = zzwg.zzv(i17, zze(t, j2), false);
                        break;
                    case 25:
                        zzb = zzwg.zzx(i17, zze(t, j2), false);
                        break;
                    case 26:
                        zzb = zzwg.zzc(i17, zze(t, j2));
                        break;
                    case 27:
                        zzb = zzwg.zzc(i17, (List<?>) zze(t, j2), zzdi(i14));
                        break;
                    case 28:
                        zzb = zzwg.zzd(i17, zze(t, j2));
                        break;
                    case 29:
                        zzb = zzwg.zzt(i17, zze(t, j2), false);
                        break;
                    case 30:
                        zzb = zzwg.zzr(i17, zze(t, j2), false);
                        break;
                    case 31:
                        zzb = zzwg.zzv(i17, zze(t, j2), false);
                        break;
                    case 32:
                        zzb = zzwg.zzw(i17, zze(t, j2), false);
                        break;
                    case 33:
                        zzb = zzwg.zzu(i17, zze(t, j2), false);
                        break;
                    case 34:
                        zzb = zzwg.zzq(i17, zze(t, j2), false);
                        break;
                    case 35:
                        i10 = zzwg.zzq((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 36:
                        i10 = zzwg.zzp((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 37:
                        i10 = zzwg.zzi((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 38:
                        i10 = zzwg.zzj((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 39:
                        i10 = zzwg.zzm((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 40:
                        i10 = zzwg.zzq((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 41:
                        i10 = zzwg.zzp((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 42:
                        i10 = zzwg.zzr((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 43:
                        i10 = zzwg.zzn((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 44:
                        i10 = zzwg.zzl((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 45:
                        i10 = zzwg.zzp((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 46:
                        i10 = zzwg.zzq((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 47:
                        i10 = zzwg.zzo((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 48:
                        i10 = zzwg.zzk((List) unsafe.getObject(t, j2));
                        if (i10 > 0) {
                            if (this.zzbrf) {
                                unsafe.putInt(t, (long) i18, i10);
                            }
                            i11 = zztl.zzcu(i17);
                            i9 = zztl.zzcw(i10);
                            zzb = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 49:
                        zzb = zzwg.zzd(i17, zze(t, j2), zzdi(i14));
                        break;
                    case 50:
                        zzb = this.zzbrn.zzd(i17, zzxc.zzp(t, j2), zzdj(i14));
                        break;
                    case 51:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzb(i17, (double) AbstractC8352oOoOOoO0.OooO0O0);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 52:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzb(i17, 0.0f);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 53:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzd(i17, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 54:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zze(i17, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 55:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzl(i17, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 56:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzg(i17, 0L);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 57:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzo(i17, 0);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 58:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzc(i17, true);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 59:
                        if (zza(t, i17, i14)) {
                            Object zzp2 = zzxc.zzp(t, j2);
                            if (zzp2 instanceof zzsw) {
                                zzb = zztl.zzc(i17, (zzsw) zzp2);
                                break;
                            } else {
                                zzb = zztl.zzc(i17, (String) zzp2);
                                break;
                            }
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 60:
                        if (zza(t, i17, i14)) {
                            zzb = zzwg.zzc(i17, zzxc.zzp(t, j2), zzdi(i14));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 61:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzc(i17, (zzsw) zzxc.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 62:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzm(i17, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 63:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzq(i17, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 64:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzp(i17, 0);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 65:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzh(i17, 0L);
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 66:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzn(i17, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 67:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzf(i17, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    case 68:
                        if (zza(t, i17, i14)) {
                            zzb = zztl.zzc(i17, (zzvo) zzxc.zzp(t, j2), zzdi(i14));
                            break;
                        } else {
                            continue;
                            i14 += 3;
                            i12 = 267386880;
                        }
                    default:
                        i14 += 3;
                        i12 = 267386880;
                }
                i15 += zzb;
                i14 += 3;
                i12 = 267386880;
            }
            return i15 + zza((zzww) this.zzbrl, (Object) t);
        }
        Unsafe unsafe2 = zzbqw;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i20 < this.zzbqx.length) {
            int zzdl2 = zzdl(i20);
            int[] iArr = this.zzbqx;
            int i23 = iArr[i20];
            int i24 = (zzdl2 & 267386880) >>> 20;
            if (i24 <= 17) {
                int i25 = iArr[i20 + 2];
                int i26 = i25 & 1048575;
                i = i13 << (i25 >>> 20);
                if (i26 != i19) {
                    i22 = unsafe2.getInt(t, (long) i26);
                    i19 = i26;
                }
                i2 = i25;
            } else {
                i2 = (!this.zzbrf || i24 < zztz.DOUBLE_LIST_PACKED.mo12532id() || i24 > zztz.SINT64_LIST_PACKED.mo12532id()) ? 0 : this.zzbqx[i20 + 2] & 1048575;
                i = 0;
            }
            long j3 = (long) (zzdl2 & 1048575);
            switch (i24) {
                case 0:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i21 += zztl.zzb(i23, (double) AbstractC8352oOoOOoO0.OooO0O0);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i21 += zztl.zzb(i23, 0.0f);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i3 = zztl.zzd(i23, unsafe2.getLong(t, j3));
                        i21 += i3;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i3 = zztl.zze(i23, unsafe2.getLong(t, j3));
                        i21 += i3;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i3 = zztl.zzl(i23, unsafe2.getInt(t, j3));
                        i21 += i3;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i22 & i) != 0) {
                        i3 = zztl.zzg(i23, 0L);
                        i21 += i3;
                    }
                    break;
                case 6:
                    if ((i22 & i) != 0) {
                        i21 += zztl.zzo(i23, 0);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 7:
                    if ((i22 & i) != 0) {
                        i21 += zztl.zzc(i23, true);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 8:
                    if ((i22 & i) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzsw) {
                            zzc = zztl.zzc(i23, (zzsw) object);
                        } else {
                            zzc = zztl.zzc(i23, (String) object);
                        }
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i22 & i) != 0) {
                        zzc = zzwg.zzc(i23, unsafe2.getObject(t, j3), zzdi(i20));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i22 & i) != 0) {
                        zzc = zztl.zzc(i23, (zzsw) unsafe2.getObject(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i22 & i) != 0) {
                        zzc = zztl.zzm(i23, unsafe2.getInt(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i22 & i) != 0) {
                        zzc = zztl.zzq(i23, unsafe2.getInt(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i22 & i) != 0) {
                        i4 = zztl.zzp(i23, 0);
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i22 & i) != 0) {
                        zzc = zztl.zzh(i23, 0L);
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i22 & i) != 0) {
                        zzc = zztl.zzn(i23, unsafe2.getInt(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i22 & i) != 0) {
                        zzc = zztl.zzf(i23, unsafe2.getLong(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i22 & i) != 0) {
                        zzc = zztl.zzc(i23, (zzvo) unsafe2.getObject(t, j3), zzdi(i20));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 18:
                    zzc = zzwg.zzw(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += zzc;
                    j = 0;
                    break;
                case 19:
                    i5 = zzwg.zzv(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 20:
                    i5 = zzwg.zzo(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 21:
                    i5 = zzwg.zzp(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 22:
                    i5 = zzwg.zzs(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 23:
                    i5 = zzwg.zzw(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 24:
                    i5 = zzwg.zzv(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 25:
                    i5 = zzwg.zzx(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 26:
                    zzc = zzwg.zzc(i23, (List) unsafe2.getObject(t, j3));
                    i21 += zzc;
                    j = 0;
                    break;
                case 27:
                    zzc = zzwg.zzc(i23, (List<?>) ((List) unsafe2.getObject(t, j3)), zzdi(i20));
                    i21 += zzc;
                    j = 0;
                    break;
                case 28:
                    zzc = zzwg.zzd(i23, (List) unsafe2.getObject(t, j3));
                    i21 += zzc;
                    j = 0;
                    break;
                case 29:
                    zzc = zzwg.zzt(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += zzc;
                    j = 0;
                    break;
                case 30:
                    i5 = zzwg.zzr(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 31:
                    i5 = zzwg.zzv(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 32:
                    i5 = zzwg.zzw(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 33:
                    i5 = zzwg.zzu(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 34:
                    i5 = zzwg.zzq(i23, (List) unsafe2.getObject(t, j3), false);
                    i21 += i5;
                    j = 0;
                    break;
                case 35:
                    i8 = zzwg.zzq((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 36:
                    i8 = zzwg.zzp((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 37:
                    i8 = zzwg.zzi((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 38:
                    i8 = zzwg.zzj((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 39:
                    i8 = zzwg.zzm((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 40:
                    i8 = zzwg.zzq((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 41:
                    i8 = zzwg.zzp((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 42:
                    i8 = zzwg.zzr((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 43:
                    i8 = zzwg.zzn((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 44:
                    i8 = zzwg.zzl((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 45:
                    i8 = zzwg.zzp((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 46:
                    i8 = zzwg.zzq((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 47:
                    i8 = zzwg.zzo((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 48:
                    i8 = zzwg.zzk((List) unsafe2.getObject(t, j3));
                    if (i8 > 0) {
                        if (this.zzbrf) {
                            unsafe2.putInt(t, (long) i2, i8);
                        }
                        i7 = zztl.zzcu(i23);
                        i6 = zztl.zzcw(i8);
                        i4 = i7 + i6 + i8;
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 49:
                    zzc = zzwg.zzd(i23, (List) unsafe2.getObject(t, j3), zzdi(i20));
                    i21 += zzc;
                    j = 0;
                    break;
                case 50:
                    zzc = this.zzbrn.zzd(i23, unsafe2.getObject(t, j3), zzdj(i20));
                    i21 += zzc;
                    j = 0;
                    break;
                case 51:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzb(i23, (double) AbstractC8352oOoOOoO0.OooO0O0);
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza(t, i23, i20)) {
                        i4 = zztl.zzb(i23, 0.0f);
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzd(i23, zzi(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zze(i23, zzi(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzl(i23, zzh(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzg(i23, 0L);
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza(t, i23, i20)) {
                        i4 = zztl.zzo(i23, 0);
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza(t, i23, i20)) {
                        i4 = zztl.zzc(i23, true);
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza(t, i23, i20)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzsw) {
                            zzc = zztl.zzc(i23, (zzsw) object2);
                        } else {
                            zzc = zztl.zzc(i23, (String) object2);
                        }
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza(t, i23, i20)) {
                        zzc = zzwg.zzc(i23, unsafe2.getObject(t, j3), zzdi(i20));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzc(i23, (zzsw) unsafe2.getObject(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzm(i23, zzh(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzq(i23, zzh(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza(t, i23, i20)) {
                        i4 = zztl.zzp(i23, 0);
                        i21 += i4;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzh(i23, 0L);
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzn(i23, zzh(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzf(i23, zzi(t, j3));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza(t, i23, i20)) {
                        zzc = zztl.zzc(i23, (zzvo) unsafe2.getObject(t, j3), zzdi(i20));
                        i21 += zzc;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i20 += 3;
            i13 = 1;
        }
        int i27 = 0;
        int zza = i21 + zza((zzww) this.zzbrl, (Object) t);
        if (!this.zzbrc) {
            return zza;
        }
        zztw<?> zzo = this.zzbrm.zzo(t);
        for (int i28 = 0; i28 < zzo.zzblk.zzsx(); i28++) {
            Map.Entry<FieldDescriptorType, Object> zzdp = zzo.zzblk.zzdp(i28);
            i27 += zztw.zzb((zzty<?>) zzdp.getKey(), zzdp.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : zzo.zzblk.zzsy()) {
            i27 += zztw.zzb((zzty<?>) entry.getKey(), entry.getValue());
        }
        return zza + i27;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.firebase_ml.zzwe] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.firebase_ml.zzwe] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzac(T r14) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvs.zzac(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final void zzg(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzbqx.length; i += 3) {
                int zzdl = zzdl(i);
                long j = (long) (1048575 & zzdl);
                int i2 = this.zzbqx[i];
                switch ((zzdl & 267386880) >>> 20) {
                    case 0:
                        if (zza(t2, i)) {
                            zzxc.zza(t, j, zzxc.zzo(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzn(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzl(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzl(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzl(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zza(t2, i)) {
                            zzxc.zza(t, j, zzxc.zzm(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zza(t2, i)) {
                            zzxc.zza(t, j, zzxc.zzp(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        zza(t, t2, i);
                        break;
                    case 10:
                        if (zza(t2, i)) {
                            zzxc.zza(t, j, zzxc.zzp(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzl(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zza(t2, i)) {
                            zzxc.zza((Object) t, j, zzxc.zzl(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        zza(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.zzbrk.zza(t, t2, j);
                        break;
                    case 50:
                        zzwg.zza(this.zzbrn, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (zza(t2, i2, i)) {
                            zzxc.zza(t, j, zzxc.zzp(t2, j));
                            zzb(t, i2, i);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        zzb(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (zza(t2, i2, i)) {
                            zzxc.zza(t, j, zzxc.zzp(t2, j));
                            zzb(t, i2, i);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        zzb(t, t2, i);
                        break;
                }
            }
            if (!this.zzbre) {
                zzwg.zza(this.zzbrl, t, t2);
                if (this.zzbrc) {
                    zzwg.zza(this.zzbrm, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final void zzq(T t) {
        int i;
        int i2 = this.zzbrh;
        while (true) {
            i = this.zzbri;
            if (i2 >= i) {
                break;
            }
            long zzdl = (long) (zzdl(this.zzbrg[i2]) & 1048575);
            Object zzp = zzxc.zzp(t, zzdl);
            if (zzp != null) {
                zzxc.zza(t, zzdl, this.zzbrn.zzx(zzp));
            }
            i2++;
        }
        int length = this.zzbrg.length;
        while (i < length) {
            this.zzbrk.zzb(t, (long) this.zzbrg[i]);
            i++;
        }
        this.zzbrl.zzq(t);
        if (this.zzbrc) {
            this.zzbrm.zzq(t);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r19, com.google.android.gms.internal.firebase_ml.zzxr r20) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1344
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvs.zzb(java.lang.Object, com.google.android.gms.internal.firebase_ml.zzxr):void");
    }

    public static <T> float zzg(T t, long j) {
        return ((Float) zzxc.zzp(t, j)).floatValue();
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

    private final void zza(T t, T t2, int i) {
        long zzdl = (long) (zzdl(i) & 1048575);
        if (zza(t2, i)) {
            Object zzp = zzxc.zzp(t, zzdl);
            Object zzp2 = zzxc.zzp(t2, zzdl);
            if (zzp != null && zzp2 != null) {
                zzxc.zza(t, zzdl, zzug.zze(zzp, zzp2));
                zzb(t, i);
            } else if (zzp2 != null) {
                zzxc.zza(t, zzdl, zzp2);
                zzb(t, i);
            }
        }
    }

    public static <UT, UB> int zza(zzww<UT, UB> zzww, T t) {
        return zzww.zzaa(zzww.zzae(t));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2a  */
    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r14, com.google.android.gms.internal.firebase_ml.zzxr r15) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 2916
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvs.zza(java.lang.Object, com.google.android.gms.internal.firebase_ml.zzxr):void");
    }

    private final void zzb(T t, int i) {
        if (!this.zzbre) {
            int zzdm = zzdm(i);
            long j = (long) (zzdm & 1048575);
            zzxc.zza((Object) t, j, zzxc.zzk(t, j) | (1 << (zzdm >>> 20)));
        }
    }

    private final void zzb(T t, int i, int i2) {
        zzxc.zza((Object) t, (long) (zzdm(i2) & 1048575), i);
    }

    private final <K, V> void zza(zzxr zzxr, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzxr.zza(i, this.zzbrn.zzz(zzdj(i2)), this.zzbrn.zzv(obj));
        }
    }

    public static <UT, UB> void zza(zzww<UT, UB> zzww, T t, zzxr zzxr) throws IOException {
        zzww.zza(zzww.zzae(t), zzxr);
    }

    public static int zza(byte[] bArr, int i, int i2, zzxl zzxl, Class<?> cls, zzst zzst) throws IOException {
        switch (zzvt.zzblp[zzxl.ordinal()]) {
            case 1:
                int zzb = zzss.zzb(bArr, i, zzst);
                zzst.zzbki = Boolean.valueOf(zzst.zzbkh != 0);
                return zzb;
            case 2:
                return zzss.zze(bArr, i, zzst);
            case 3:
                zzst.zzbki = Double.valueOf(zzss.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzst.zzbki = Integer.valueOf(zzss.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzst.zzbki = Long.valueOf(zzss.zzb(bArr, i));
                return i + 8;
            case 8:
                zzst.zzbki = Float.valueOf(zzss.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzss.zza(bArr, i, zzst);
                zzst.zzbki = Integer.valueOf(zzst.zzbkg);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzss.zzb(bArr, i, zzst);
                zzst.zzbki = Long.valueOf(zzst.zzbkh);
                return zzb2;
            case 14:
                return zzss.zza(zzwb.zzso().zzk(cls), bArr, i, i2, zzst);
            case 15:
                int zza2 = zzss.zza(bArr, i, zzst);
                zzst.zzbki = Integer.valueOf(zzti.zzcp(zzst.zzbkg));
                return zza2;
            case 16:
                int zzb3 = zzss.zzb(bArr, i, zzst);
                zzst.zzbki = Long.valueOf(zzti.zzp(zzst.zzbkh));
                return zzb3;
            case 17:
                return zzss.zzd(bArr, i, zzst);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.firebase_ml.zzst r30) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvs.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.firebase_ml.zzst):int");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x003e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x003e */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzst zzst) throws IOException {
        Unsafe unsafe = zzbqw;
        Object zzdj = zzdj(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzbrn.zzw(object)) {
            Object zzy = this.zzbrn.zzy(zzdj);
            this.zzbrn.zzf(zzy, object);
            unsafe.putObject(t, j, zzy);
            object = zzy;
        }
        zzvh<?, ?> zzz = this.zzbrn.zzz(zzdj);
        Map<?, ?> zzu = this.zzbrn.zzu(object);
        int zza = zzss.zza(bArr, i, zzst);
        int i4 = zzst.zzbkg;
        if (i4 < 0 || i4 > i2 - zza) {
            throw zzuo.zzrm();
        }
        int i5 = i4 + zza;
        C6140iIil.OooO0O0 oooO0O0 = (K) zzz.zzbqp;
        C6140iIil.OooO0O0 oooO0O02 = (V) zzz.zzbqr;
        while (zza < i5) {
            int i6 = zza + 1;
            byte b = bArr[zza];
            int i7 = b;
            if (b < 0) {
                i6 = zzss.zza(b, bArr, i6, zzst);
                i7 = zzst.zzbkg;
            }
            int i8 = (i7 == 1 ? 1 : 0) >>> 3;
            int i9 = (i7 == 1 ? 1 : 0) & 7;
            if (i8 != 1) {
                if (i8 == 2 && i9 == zzz.zzbqq.zztq()) {
                    zza = zza(bArr, i6, i2, zzz.zzbqq, zzz.zzbqr.getClass(), zzst);
                    oooO0O02 = (V) zzst.zzbki;
                }
            } else if (i9 == zzz.zzbqo.zztq()) {
                zza = zza(bArr, i6, i2, zzz.zzbqo, (Class<?>) null, zzst);
                oooO0O0 = (K) zzst.zzbki;
            }
            zza = zzss.zza(i7, bArr, i6, i2, zzst);
        }
        if (zza == i5) {
            zzu.put(oooO0O0, oooO0O02);
            return i5;
        }
        throw zzuo.zzrq();
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzst zzst) throws IOException {
        int i9;
        Unsafe unsafe = zzbqw;
        long j2 = (long) (this.zzbqx[i8 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzss.zzc(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzss.zzd(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    i9 = zzss.zzb(bArr, i, zzst);
                    unsafe.putObject(t, j, Long.valueOf(zzst.zzbkh));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    i9 = zzss.zza(bArr, i, zzst);
                    unsafe.putObject(t, j, Integer.valueOf(zzst.zzbkg));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzss.zzb(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzss.zza(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    i9 = zzss.zzb(bArr, i, zzst);
                    unsafe.putObject(t, j, Boolean.valueOf(zzst.zzbkh != 0));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = zzss.zza(bArr, i, zzst);
                    int i10 = zzst.zzbkg;
                    if (i10 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) == 0 || zzxe.zzf(bArr, zza, zza + i10)) {
                        unsafe.putObject(t, j, new String(bArr, zza, i10, zzug.UTF_8));
                        zza += i10;
                    } else {
                        throw zzuo.zzrr();
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza2 = zzss.zza(zzdi(i8), bArr, i, i2, zzst);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzst.zzbki);
                    } else {
                        unsafe.putObject(t, j, zzug.zze(object, zzst.zzbki));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    i9 = zzss.zze(bArr, i, zzst);
                    unsafe.putObject(t, j, zzst.zzbki);
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza3 = zzss.zza(bArr, i, zzst);
                    int i11 = zzst.zzbkg;
                    zzuj zzdk = zzdk(i8);
                    if (zzdk == null || zzdk.zze(i11)) {
                        unsafe.putObject(t, j, Integer.valueOf(i11));
                        i9 = zza3;
                        unsafe.putInt(t, j2, i4);
                        return i9;
                    }
                    zzab(t).zzb(i3, Long.valueOf((long) i11));
                    return zza3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    i9 = zzss.zza(bArr, i, zzst);
                    unsafe.putObject(t, j, Integer.valueOf(zzti.zzcp(zzst.zzbkg)));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    i9 = zzss.zzb(bArr, i, zzst);
                    unsafe.putObject(t, j, Long.valueOf(zzti.zzp(zzst.zzbkh)));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    i9 = zzss.zza(zzdi(i8), bArr, i, i2, (i3 & -8) | 4, zzst);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzst.zzbki);
                    } else {
                        unsafe.putObject(t, j, zzug.zze(object2, zzst.zzbki));
                    }
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x036a, code lost:
        if (r0 == r4) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03b3, code lost:
        if (r0 == r15) goto L_0x03dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.firebase_ml.zzst r36) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvs.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase_ml.zzst):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e2, code lost:
        if (r0 == r8) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020f, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022e, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.firebase_ml.zzst r32) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 662
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzvs.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase_ml.zzst):void");
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzuj zzuj, UB ub, zzww<UT, UB> zzww) {
        zzvh<?, ?> zzz = this.zzbrn.zzz(zzdj(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzuj.zze(next.getValue().intValue())) {
                if (ub == null) {
                    ub = zzww.zztf();
                }
                zzte zzcn = zzsw.zzcn(zzvg.zza(zzz, next.getKey(), next.getValue()));
                try {
                    zzvg.zza(zzcn.zzqc(), zzz, next.getKey(), next.getValue());
                    zzww.zza(ub, i2, zzcn.zzqb());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.internal.firebase_ml.zzwe */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zza(Object obj, int i, zzwe zzwe) {
        return zzwe.zzac(zzxc.zzp(obj, (long) (i & 1048575)));
    }

    public static void zza(int i, Object obj, zzxr zzxr) throws IOException {
        if (obj instanceof String) {
            zzxr.zzb(i, (String) obj);
        } else {
            zzxr.zza(i, (zzsw) obj);
        }
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzbre) {
            return zza(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzbre) {
            int zzdl = zzdl(i);
            long j = (long) (zzdl & 1048575);
            switch ((zzdl & 267386880) >>> 20) {
                case 0:
                    return zzxc.zzo(t, j) != AbstractC8352oOoOOoO0.OooO0O0;
                case 1:
                    return zzxc.zzn(t, j) != 0.0f;
                case 2:
                    return zzxc.zzl(t, j) != 0;
                case 3:
                    return zzxc.zzl(t, j) != 0;
                case 4:
                    return zzxc.zzk(t, j) != 0;
                case 5:
                    return zzxc.zzl(t, j) != 0;
                case 6:
                    return zzxc.zzk(t, j) != 0;
                case 7:
                    return zzxc.zzm(t, j);
                case 8:
                    Object zzp = zzxc.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    }
                    if (zzp instanceof zzsw) {
                        return !zzsw.zzbkl.equals(zzp);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzxc.zzp(t, j) != null;
                case 10:
                    return !zzsw.zzbkl.equals(zzxc.zzp(t, j));
                case 11:
                    return zzxc.zzk(t, j) != 0;
                case 12:
                    return zzxc.zzk(t, j) != 0;
                case 13:
                    return zzxc.zzk(t, j) != 0;
                case 14:
                    return zzxc.zzl(t, j) != 0;
                case 15:
                    return zzxc.zzk(t, j) != 0;
                case 16:
                    return zzxc.zzl(t, j) != 0;
                case 17:
                    return zzxc.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int zzdm = zzdm(i);
            return (zzxc.zzk(t, (long) (zzdm & 1048575)) & (1 << (zzdm >>> 20))) != 0;
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzxc.zzk(t, (long) (zzdm(i2) & 1048575)) == i;
    }
}
