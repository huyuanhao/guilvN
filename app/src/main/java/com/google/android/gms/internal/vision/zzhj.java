package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;
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

public final class zzhj<T> implements zzhw<T> {
    public static final int[] zzzb = new int[0];
    public static final Unsafe zzzc = zziu.zzhj();
    public final int[] zzzd;
    public final Object[] zzze;
    public final int zzzf;
    public final int zzzg;
    public final zzhf zzzh;
    public final boolean zzzi;
    public final boolean zzzj;
    public final boolean zzzk;
    public final boolean zzzl;
    public final int[] zzzm;
    public final int zzzn;
    public final int zzzo;
    public final zzhn zzzp;
    public final zzgp zzzq;
    public final zzio<?, ?> zzzr;
    public final zzfl<?> zzzs;
    public final zzha zzzt;

    public zzhj(int[] iArr, Object[] objArr, int i, int i2, zzhf zzhf, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzhn zzhn, zzgp zzgp, zzio<?, ?> zzio, zzfl<?> zzfl, zzha zzha) {
        this.zzzd = iArr;
        this.zzze = objArr;
        this.zzzf = i;
        this.zzzg = i2;
        this.zzzj = zzhf instanceof zzfy;
        this.zzzk = z;
        this.zzzi = zzfl != null && zzfl.zze(zzhf);
        this.zzzl = false;
        this.zzzm = iArr2;
        this.zzzn = i3;
        this.zzzo = i4;
        this.zzzp = zzhn;
        this.zzzq = zzgp;
        this.zzzr = zzio;
        this.zzzs = zzfl;
        this.zzzh = zzhf;
        this.zzzt = zzha;
    }

    public static <T> zzhj<T> zza(Class<T> cls, zzhd zzhd, zzhn zzhn, zzgp zzgp, zzio<?, ?> zzio, zzfl<?> zzfl, zzha zzha) {
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
        zzhu zzhu;
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
        if (zzhd instanceof zzhu) {
            zzhu zzhu2 = (zzhu) zzhd;
            int i32 = 0;
            boolean z2 = zzhu2.zzge() == zzfy.zzg.zzxg;
            String zzgn = zzhu2.zzgn();
            int length = zzgn.length();
            int charAt15 = zzgn.charAt(0);
            if (charAt15 >= 55296) {
                int i33 = charAt15 & 8191;
                int i34 = 1;
                int i35 = 13;
                while (true) {
                    i = i34 + 1;
                    charAt14 = zzgn.charAt(i34);
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
            int charAt16 = zzgn.charAt(i);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i31 = i36 + 1;
                    charAt13 = zzgn.charAt(i36);
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
                iArr = zzzb;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                i2 = 0;
            } else {
                int i39 = i36 + 1;
                int charAt17 = zzgn.charAt(i36);
                if (charAt17 >= 55296) {
                    int i40 = charAt17 & 8191;
                    int i41 = 13;
                    while (true) {
                        i30 = i39 + 1;
                        charAt12 = zzgn.charAt(i39);
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
                int charAt18 = zzgn.charAt(i39);
                if (charAt18 >= 55296) {
                    int i43 = charAt18 & 8191;
                    int i44 = 13;
                    while (true) {
                        i29 = i42 + 1;
                        charAt11 = zzgn.charAt(i42);
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
                i5 = zzgn.charAt(i42);
                if (i5 >= 55296) {
                    int i46 = i5 & 8191;
                    int i47 = 13;
                    while (true) {
                        i28 = i45 + 1;
                        charAt10 = zzgn.charAt(i45);
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
                int charAt19 = zzgn.charAt(i45);
                if (charAt19 >= 55296) {
                    int i49 = charAt19 & 8191;
                    int i50 = 13;
                    while (true) {
                        i27 = i48 + 1;
                        charAt9 = zzgn.charAt(i48);
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
                i3 = zzgn.charAt(i48);
                if (i3 >= 55296) {
                    int i52 = i3 & 8191;
                    int i53 = 13;
                    while (true) {
                        i26 = i51 + 1;
                        charAt8 = zzgn.charAt(i51);
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
                int charAt20 = zzgn.charAt(i51);
                if (charAt20 >= 55296) {
                    int i55 = charAt20 & 8191;
                    int i56 = 13;
                    while (true) {
                        i25 = i54 + 1;
                        charAt7 = zzgn.charAt(i54);
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
                int charAt21 = zzgn.charAt(i54);
                if (charAt21 >= 55296) {
                    int i58 = charAt21 & 8191;
                    int i59 = i57;
                    int i60 = 13;
                    while (true) {
                        i24 = i59 + 1;
                        charAt6 = zzgn.charAt(i59);
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
                int charAt22 = zzgn.charAt(i22);
                if (charAt22 >= 55296) {
                    int i62 = charAt22 & 8191;
                    int i63 = i61;
                    int i64 = 13;
                    while (true) {
                        i23 = i63 + 1;
                        charAt5 = zzgn.charAt(i63);
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
            Unsafe unsafe = zzzc;
            Object[] zzgo = zzhu2.zzgo();
            Class<?> cls3 = zzhu2.zzgg().getClass();
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
                int charAt23 = zzgn.charAt(i68);
                if (charAt23 >= 55296) {
                    int i73 = charAt23 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i21 = i74 + 1;
                        charAt4 = zzgn.charAt(i74);
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
                int charAt24 = zzgn.charAt(i9);
                if (charAt24 >= 55296) {
                    int i77 = charAt24 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i20 = i78 + 1;
                        charAt3 = zzgn.charAt(i78);
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
                    int charAt25 = zzgn.charAt(i10);
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i82 = charAt25 & 8191;
                        int i83 = 13;
                        while (true) {
                            i19 = i81 + 1;
                            charAt2 = zzgn.charAt(i81);
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
                        objArr[((i71 / 3) << 1) + 1] = zzgo[i4];
                        i4++;
                    } else if (i84 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i71 / 3) << 1) + 1] = zzgo[i4];
                        i4++;
                    }
                    int i85 = charAt25 << 1;
                    Object obj = zzgo[i85];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = zza(cls3, (String) obj);
                        zzgo[i85] = field2;
                    }
                    zzhu = zzhu2;
                    i14 = (int) unsafe.objectFieldOffset(field2);
                    int i86 = i85 + 1;
                    Object obj2 = zzgo[i86];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = zza(cls3, (String) obj2);
                        zzgo[i86] = field3;
                    }
                    cls2 = cls3;
                    i11 = i4;
                    i10 = i81;
                    str = zzgn;
                    i12 = 0;
                    i13 = (int) unsafe.objectFieldOffset(field3);
                    i15 = i32;
                } else {
                    zzhu = zzhu2;
                    int i87 = i4 + 1;
                    Field zza = zza(cls3, (String) zzgo[i4]);
                    if (i80 == 9 || i80 == 17) {
                        i16 = 1;
                        objArr[((i71 / 3) << 1) + 1] = zza.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            i16 = 1;
                            i18 = i87 + 1;
                            objArr[((i71 / 3) << 1) + 1] = zzgo[i87];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            i16 = 1;
                            if ((charAt15 & 1) == 1) {
                                i18 = i87 + 1;
                                objArr[((i71 / 3) << 1) + 1] = zzgo[i87];
                            }
                        } else {
                            if (i80 == 50) {
                                int i88 = i67 + 1;
                                iArr[i67] = i71;
                                int i89 = (i71 / 3) << 1;
                                int i90 = i87 + 1;
                                objArr[i89] = zzgo[i87];
                                if ((charAt24 & 2048) != 0) {
                                    i87 = i90 + 1;
                                    objArr[i89 + 1] = zzgo[i90];
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
                        str = zzgn;
                        i13 = 0;
                        i12 = 0;
                    } else {
                        int i91 = i10 + 1;
                        str = zzgn;
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
                        Object obj3 = zzgo[i94];
                        i11 = i87;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = zza(cls3, (String) obj3);
                            zzgo[i94] = field;
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
                zzgn = str;
                i68 = i10;
                cls3 = cls2;
                i6 = i6;
                length = length;
                i2 = i8;
                z2 = z;
                i5 = i5;
                i4 = i11;
                zzhu2 = zzhu;
            }
            return new zzhj<>(iArr2, objArr, i5, i6, zzhu2.zzgg(), z2, false, iArr, i2, i66, zzhn, zzgp, zzio, zzfl, zzha);
        }
        ((zzij) zzhd).zzge();
        throw new NoSuchMethodError();
    }

    private final void zzb(T t, T t2, int i) {
        int zzbk = zzbk(i);
        int i2 = this.zzzd[i];
        long j = (long) (zzbk & 1048575);
        if (zza(t2, i2, i)) {
            Object zzp = zziu.zzp(t, j);
            Object zzp2 = zziu.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zziu.zza(t, j, zzga.zza(zzp, zzp2));
                zzb(t, i2, i);
            } else if (zzp2 != null) {
                zziu.zza(t, j, zzp2);
                zzb(t, i2, i);
            }
        }
    }

    private final zzhw zzbh(int i) {
        int i2 = (i / 3) << 1;
        zzhw zzhw = (zzhw) this.zzze[i2];
        if (zzhw != null) {
            return zzhw;
        }
        zzhw<T> zzf = zzhs.zzgl().zzf((Class) this.zzze[i2 + 1]);
        this.zzze[i2] = zzf;
        return zzf;
    }

    private final Object zzbi(int i) {
        return this.zzze[(i / 3) << 1];
    }

    private final zzgd zzbj(int i) {
        return (zzgd) this.zzze[((i / 3) << 1) + 1];
    }

    private final int zzbk(int i) {
        return this.zzzd[i + 1];
    }

    private final int zzbl(int i) {
        return this.zzzd[i + 2];
    }

    public static boolean zzbm(int i) {
        return (i & 536870912) != 0;
    }

    private final int zzbn(int i) {
        if (i < this.zzzf || i > this.zzzg) {
            return -1;
        }
        return zzs(i, 0);
    }

    public static <E> List<E> zze(Object obj, long j) {
        return (List) zziu.zzp(obj, j);
    }

    public static <T> double zzf(T t, long j) {
        return ((Double) zziu.zzp(t, j)).doubleValue();
    }

    public static <T> float zzg(T t, long j) {
        return ((Float) zziu.zzp(t, j)).floatValue();
    }

    public static <T> int zzh(T t, long j) {
        return ((Integer) zziu.zzp(t, j)).intValue();
    }

    public static <T> long zzi(T t, long j) {
        return ((Long) zziu.zzp(t, j)).longValue();
    }

    public static <T> boolean zzj(T t, long j) {
        return ((Boolean) zziu.zzp(t, j)).booleanValue();
    }

    public static zzip zzq(Object obj) {
        zzfy zzfy = (zzfy) obj;
        zzip zzip = zzfy.zzwj;
        if (zzip != zzip.zzhe()) {
            return zzip;
        }
        zzip zzhf = zzip.zzhf();
        zzfy.zzwj = zzhf;
        return zzhf;
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzzd.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzzd[i4];
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
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzm(r10, r6) == com.google.android.gms.internal.vision.zziu.zzm(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzk(r10, r6) == com.google.android.gms.internal.vision.zziu.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.vision.zziu.zzl(r10, r6) == com.google.android.gms.internal.vision.zziu.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zziu.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zziu.zzn(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zziu.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zziu.zzo(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.vision.zzhy.zzd(com.google.android.gms.internal.vision.zziu.zzp(r10, r6), com.google.android.gms.internal.vision.zziu.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    @Override // com.google.android.gms.internal.vision.zzhw
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(T r10, T r11) {
        /*
        // Method dump skipped, instructions count: 640
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.equals(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final int hashCode(T t) {
        int i;
        int i2;
        int length = this.zzzd.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzbk = zzbk(i4);
            int i5 = this.zzzd[i4];
            long j = (long) (1048575 & zzbk);
            int i6 = 37;
            switch ((zzbk & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    i = zzga.zzo(Double.doubleToLongBits(zziu.zzo(t, j)));
                    i3 = i2 + i;
                    break;
                case 1:
                    i2 = i3 * 53;
                    i = Float.floatToIntBits(zziu.zzn(t, j));
                    i3 = i2 + i;
                    break;
                case 2:
                    i2 = i3 * 53;
                    i = zzga.zzo(zziu.zzl(t, j));
                    i3 = i2 + i;
                    break;
                case 3:
                    i2 = i3 * 53;
                    i = zzga.zzo(zziu.zzl(t, j));
                    i3 = i2 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    i = zziu.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 5:
                    i2 = i3 * 53;
                    i = zzga.zzo(zziu.zzl(t, j));
                    i3 = i2 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    i = zziu.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    i = zzga.zzj(zziu.zzm(t, j));
                    i3 = i2 + i;
                    break;
                case 8:
                    i2 = i3 * 53;
                    i = ((String) zziu.zzp(t, j)).hashCode();
                    i3 = i2 + i;
                    break;
                case 9:
                    Object zzp = zziu.zzp(t, j);
                    if (zzp != null) {
                        i6 = zzp.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    i = zziu.zzp(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    i = zziu.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 12:
                    i2 = i3 * 53;
                    i = zziu.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 13:
                    i2 = i3 * 53;
                    i = zziu.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 14:
                    i2 = i3 * 53;
                    i = zzga.zzo(zziu.zzl(t, j));
                    i3 = i2 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    i = zziu.zzk(t, j);
                    i3 = i2 + i;
                    break;
                case 16:
                    i2 = i3 * 53;
                    i = zzga.zzo(zziu.zzl(t, j));
                    i3 = i2 + i;
                    break;
                case 17:
                    Object zzp2 = zziu.zzp(t, j);
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
                    i = zziu.zzp(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 50:
                    i2 = i3 * 53;
                    i = zziu.zzp(t, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 51:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzga.zzo(Double.doubleToLongBits(zzf(t, j)));
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
                        i = zzga.zzo(zzi(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzga.zzo(zzi(t, j));
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
                        i = zzga.zzo(zzi(t, j));
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
                        i = zzga.zzj(zzj(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = ((String) zziu.zzp(t, j)).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zziu.zzp(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zziu.zzp(t, j).hashCode();
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
                        i = zzga.zzo(zzi(t, j));
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
                        i = zzga.zzo(zzi(t, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza(t, i5, i4)) {
                        i2 = i3 * 53;
                        i = zziu.zzp(t, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.zzzr.zzt(t).hashCode();
        return this.zzzi ? (hashCode * 53) + this.zzzs.zzc(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final T newInstance() {
        return (T) this.zzzp.newInstance(this.zzzh);
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final void zzc(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzzd.length; i += 3) {
                int zzbk = zzbk(i);
                long j = (long) (1048575 & zzbk);
                int i2 = this.zzzd[i];
                switch ((zzbk & 267386880) >>> 20) {
                    case 0:
                        if (zza(t2, i)) {
                            zziu.zza(t, j, zziu.zzo(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zza(t2, i)) {
                            zziu.zza((Object) t, j, zziu.zzn(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zza(t2, i)) {
                            zziu.zza((Object) t, j, zziu.zzl(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zza(t2, i)) {
                            zziu.zza((Object) t, j, zziu.zzl(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zza(t2, i)) {
                            zziu.zzb(t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zza(t2, i)) {
                            zziu.zza((Object) t, j, zziu.zzl(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zza(t2, i)) {
                            zziu.zzb(t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zza(t2, i)) {
                            zziu.zza(t, j, zziu.zzm(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zza(t2, i)) {
                            zziu.zza(t, j, zziu.zzp(t2, j));
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
                            zziu.zza(t, j, zziu.zzp(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zza(t2, i)) {
                            zziu.zzb(t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zza(t2, i)) {
                            zziu.zzb(t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zza(t2, i)) {
                            zziu.zzb(t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zza(t2, i)) {
                            zziu.zza((Object) t, j, zziu.zzl(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zza(t2, i)) {
                            zziu.zzb(t, j, zziu.zzk(t2, j));
                            zzb(t, i);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zza(t2, i)) {
                            zziu.zza((Object) t, j, zziu.zzl(t2, j));
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
                        this.zzzq.zza(t, t2, j);
                        break;
                    case 50:
                        zzhy.zza(this.zzzt, t, t2, j);
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
                            zziu.zza(t, j, zziu.zzp(t2, j));
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
                            zziu.zza(t, j, zziu.zzp(t2, j));
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
            if (!this.zzzk) {
                zzhy.zza(this.zzzr, t, t2);
                if (this.zzzi) {
                    zzhy.zza(this.zzzs, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.zzhw
    public final int zzp(T t) {
        int i;
        int i2;
        long j;
        int i3;
        int zzc;
        int i4;
        int i5;
        int i6;
        int i7;
        int zzb;
        int i8;
        int i9;
        int i10;
        int i11 = 267386880;
        if (this.zzzk) {
            Unsafe unsafe = zzzc;
            int i12 = 0;
            int i13 = 0;
            while (i12 < this.zzzd.length) {
                int zzbk = zzbk(i12);
                int i14 = (zzbk & i11) >>> 20;
                int i15 = this.zzzd[i12];
                long j2 = (long) (zzbk & 1048575);
                int i16 = (i14 < zzfs.DOUBLE_LIST_PACKED.mo13060id() || i14 > zzfs.SINT64_LIST_PACKED.mo13060id()) ? 0 : this.zzzd[i12 + 2] & 1048575;
                switch (i14) {
                    case 0:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzb(i15, (double) AbstractC8352oOoOOoO0.OooO0O0);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 1:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzb(i15, 0.0f);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 2:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzd(i15, zziu.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 3:
                        if (zza(t, i12)) {
                            zzb = zzfe.zze(i15, zziu.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 4:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzi(i15, zziu.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 5:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzg(i15, 0L);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 6:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzl(i15, 0);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 7:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzc(i15, true);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 8:
                        if (zza(t, i12)) {
                            Object zzp = zziu.zzp(t, j2);
                            if (zzp instanceof zzeo) {
                                zzb = zzfe.zzc(i15, (zzeo) zzp);
                                break;
                            } else {
                                zzb = zzfe.zzb(i15, (String) zzp);
                                break;
                            }
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 9:
                        if (zza(t, i12)) {
                            zzb = zzhy.zzc(i15, zziu.zzp(t, j2), zzbh(i12));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 10:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzc(i15, (zzeo) zziu.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 11:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzj(i15, zziu.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 12:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzn(i15, zziu.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 13:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzm(i15, 0);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 14:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzh(i15, 0L);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 15:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzk(i15, zziu.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 16:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzf(i15, zziu.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 17:
                        if (zza(t, i12)) {
                            zzb = zzfe.zzc(i15, (zzhf) zziu.zzp(t, j2), zzbh(i12));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 18:
                        zzb = zzhy.zzw(i15, zze(t, j2), false);
                        break;
                    case 19:
                        zzb = zzhy.zzv(i15, zze(t, j2), false);
                        break;
                    case 20:
                        zzb = zzhy.zzo(i15, zze(t, j2), false);
                        break;
                    case 21:
                        zzb = zzhy.zzp(i15, zze(t, j2), false);
                        break;
                    case 22:
                        zzb = zzhy.zzs(i15, zze(t, j2), false);
                        break;
                    case 23:
                        zzb = zzhy.zzw(i15, zze(t, j2), false);
                        break;
                    case 24:
                        zzb = zzhy.zzv(i15, zze(t, j2), false);
                        break;
                    case 25:
                        zzb = zzhy.zzx(i15, zze(t, j2), false);
                        break;
                    case 26:
                        zzb = zzhy.zzc(i15, zze(t, j2));
                        break;
                    case 27:
                        zzb = zzhy.zzc(i15, (List<?>) zze(t, j2), zzbh(i12));
                        break;
                    case 28:
                        zzb = zzhy.zzd(i15, zze(t, j2));
                        break;
                    case 29:
                        zzb = zzhy.zzt(i15, zze(t, j2), false);
                        break;
                    case 30:
                        zzb = zzhy.zzr(i15, zze(t, j2), false);
                        break;
                    case 31:
                        zzb = zzhy.zzv(i15, zze(t, j2), false);
                        break;
                    case 32:
                        zzb = zzhy.zzw(i15, zze(t, j2), false);
                        break;
                    case 33:
                        zzb = zzhy.zzu(i15, zze(t, j2), false);
                        break;
                    case 34:
                        zzb = zzhy.zzq(i15, zze(t, j2), false);
                        break;
                    case 35:
                        i9 = zzhy.zzy((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 36:
                        i9 = zzhy.zzx((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 37:
                        i9 = zzhy.zzq((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 38:
                        i9 = zzhy.zzr((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 39:
                        i9 = zzhy.zzu((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 40:
                        i9 = zzhy.zzy((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 41:
                        i9 = zzhy.zzx((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 42:
                        i9 = zzhy.zzz((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 43:
                        i9 = zzhy.zzv((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 44:
                        i9 = zzhy.zzt((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 45:
                        i9 = zzhy.zzx((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 46:
                        i9 = zzhy.zzy((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 47:
                        i9 = zzhy.zzw((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 48:
                        i9 = zzhy.zzs((List) unsafe.getObject(t, j2));
                        if (i9 > 0) {
                            if (this.zzzl) {
                                unsafe.putInt(t, (long) i16, i9);
                            }
                            i10 = zzfe.zzav(i15);
                            i8 = zzfe.zzax(i9);
                            zzb = i10 + i8 + i9;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 49:
                        zzb = zzhy.zzd(i15, zze(t, j2), zzbh(i12));
                        break;
                    case 50:
                        zzb = this.zzzt.zzb(i15, zziu.zzp(t, j2), zzbi(i12));
                        break;
                    case 51:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzb(i15, (double) AbstractC8352oOoOOoO0.OooO0O0);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 52:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzb(i15, 0.0f);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 53:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzd(i15, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 54:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zze(i15, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 55:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzi(i15, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 56:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzg(i15, 0L);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 57:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzl(i15, 0);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 58:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzc(i15, true);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 59:
                        if (zza(t, i15, i12)) {
                            Object zzp2 = zziu.zzp(t, j2);
                            if (zzp2 instanceof zzeo) {
                                zzb = zzfe.zzc(i15, (zzeo) zzp2);
                                break;
                            } else {
                                zzb = zzfe.zzb(i15, (String) zzp2);
                                break;
                            }
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 60:
                        if (zza(t, i15, i12)) {
                            zzb = zzhy.zzc(i15, zziu.zzp(t, j2), zzbh(i12));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 61:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzc(i15, (zzeo) zziu.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 62:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzj(i15, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 63:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzn(i15, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 64:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzm(i15, 0);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 65:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzh(i15, 0L);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 66:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzk(i15, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 67:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzf(i15, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    case 68:
                        if (zza(t, i15, i12)) {
                            zzb = zzfe.zzc(i15, (zzhf) zziu.zzp(t, j2), zzbh(i12));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i11 = 267386880;
                        }
                    default:
                        i12 += 3;
                        i11 = 267386880;
                }
                i13 += zzb;
                i12 += 3;
                i11 = 267386880;
            }
            return i13 + zza((zzio) this.zzzr, (Object) t);
        }
        Unsafe unsafe2 = zzzc;
        int i17 = -1;
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < this.zzzd.length; i20 += 3) {
            int zzbk2 = zzbk(i20);
            int[] iArr = this.zzzd;
            int i21 = iArr[i20];
            int i22 = (zzbk2 & 267386880) >>> 20;
            if (i22 <= 17) {
                int i23 = iArr[i20 + 2];
                int i24 = i23 & 1048575;
                i = 1 << (i23 >>> 20);
                if (i24 != i17) {
                    i19 = unsafe2.getInt(t, (long) i24);
                    i17 = i24;
                }
                i2 = i23;
            } else {
                i2 = (!this.zzzl || i22 < zzfs.DOUBLE_LIST_PACKED.mo13060id() || i22 > zzfs.SINT64_LIST_PACKED.mo13060id()) ? 0 : this.zzzd[i20 + 2] & 1048575;
                i = 0;
            }
            long j3 = (long) (zzbk2 & 1048575);
            switch (i22) {
                case 0:
                    j = 0;
                    if ((i19 & i) != 0) {
                        i18 += zzfe.zzb(i21, (double) AbstractC8352oOoOOoO0.OooO0O0);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i19 & i) != 0) {
                        i18 += zzfe.zzb(i21, 0.0f);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i19 & i) != 0) {
                        i3 = zzfe.zzd(i21, unsafe2.getLong(t, j3));
                        i18 += i3;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i19 & i) != 0) {
                        i3 = zzfe.zze(i21, unsafe2.getLong(t, j3));
                        i18 += i3;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i19 & i) != 0) {
                        i3 = zzfe.zzi(i21, unsafe2.getInt(t, j3));
                        i18 += i3;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i19 & i) != 0) {
                        i3 = zzfe.zzg(i21, 0L);
                        i18 += i3;
                    }
                    break;
                case 6:
                    if ((i19 & i) != 0) {
                        i18 += zzfe.zzl(i21, 0);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 7:
                    if ((i19 & i) != 0) {
                        zzc = zzfe.zzc(i21, true);
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 8:
                    if ((i19 & i) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzeo) {
                            zzc = zzfe.zzc(i21, (zzeo) object);
                        } else {
                            zzc = zzfe.zzb(i21, (String) object);
                        }
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i19 & i) != 0) {
                        zzc = zzhy.zzc(i21, unsafe2.getObject(t, j3), zzbh(i20));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i19 & i) != 0) {
                        zzc = zzfe.zzc(i21, (zzeo) unsafe2.getObject(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i19 & i) != 0) {
                        zzc = zzfe.zzj(i21, unsafe2.getInt(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i19 & i) != 0) {
                        zzc = zzfe.zzn(i21, unsafe2.getInt(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i19 & i) != 0) {
                        i4 = zzfe.zzm(i21, 0);
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i19 & i) != 0) {
                        zzc = zzfe.zzh(i21, 0L);
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i19 & i) != 0) {
                        zzc = zzfe.zzk(i21, unsafe2.getInt(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i19 & i) != 0) {
                        zzc = zzfe.zzf(i21, unsafe2.getLong(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i19 & i) != 0) {
                        zzc = zzfe.zzc(i21, (zzhf) unsafe2.getObject(t, j3), zzbh(i20));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 18:
                    zzc = zzhy.zzw(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 19:
                    zzc = zzhy.zzv(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 20:
                    zzc = zzhy.zzo(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 21:
                    zzc = zzhy.zzp(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 22:
                    zzc = zzhy.zzs(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 23:
                    zzc = zzhy.zzw(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 24:
                    zzc = zzhy.zzv(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 25:
                    zzc = zzhy.zzx(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 26:
                    zzc = zzhy.zzc(i21, (List) unsafe2.getObject(t, j3));
                    i18 += zzc;
                    j = 0;
                    break;
                case 27:
                    zzc = zzhy.zzc(i21, (List<?>) ((List) unsafe2.getObject(t, j3)), zzbh(i20));
                    i18 += zzc;
                    j = 0;
                    break;
                case 28:
                    zzc = zzhy.zzd(i21, (List) unsafe2.getObject(t, j3));
                    i18 += zzc;
                    j = 0;
                    break;
                case 29:
                    zzc = zzhy.zzt(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 30:
                    zzc = zzhy.zzr(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 31:
                    zzc = zzhy.zzv(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 32:
                    zzc = zzhy.zzw(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 33:
                    zzc = zzhy.zzu(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 34:
                    zzc = zzhy.zzq(i21, (List) unsafe2.getObject(t, j3), false);
                    i18 += zzc;
                    j = 0;
                    break;
                case 35:
                    i7 = zzhy.zzy((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 36:
                    i7 = zzhy.zzx((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 37:
                    i7 = zzhy.zzq((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 38:
                    i7 = zzhy.zzr((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 39:
                    i7 = zzhy.zzu((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 40:
                    i7 = zzhy.zzy((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 41:
                    i7 = zzhy.zzx((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 42:
                    i7 = zzhy.zzz((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 43:
                    i7 = zzhy.zzv((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 44:
                    i7 = zzhy.zzt((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 45:
                    i7 = zzhy.zzx((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 46:
                    i7 = zzhy.zzy((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 47:
                    i7 = zzhy.zzw((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 48:
                    i7 = zzhy.zzs((List) unsafe2.getObject(t, j3));
                    if (i7 > 0) {
                        if (this.zzzl) {
                            unsafe2.putInt(t, (long) i2, i7);
                        }
                        i6 = zzfe.zzav(i21);
                        i5 = zzfe.zzax(i7);
                        i4 = i6 + i5 + i7;
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 49:
                    zzc = zzhy.zzd(i21, (List) unsafe2.getObject(t, j3), zzbh(i20));
                    i18 += zzc;
                    j = 0;
                    break;
                case 50:
                    zzc = this.zzzt.zzb(i21, unsafe2.getObject(t, j3), zzbi(i20));
                    i18 += zzc;
                    j = 0;
                    break;
                case 51:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzb(i21, (double) AbstractC8352oOoOOoO0.OooO0O0);
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza(t, i21, i20)) {
                        i4 = zzfe.zzb(i21, 0.0f);
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzd(i21, zzi(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zze(i21, zzi(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzi(i21, zzh(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzg(i21, 0L);
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza(t, i21, i20)) {
                        i4 = zzfe.zzl(i21, 0);
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzc(i21, true);
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza(t, i21, i20)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzeo) {
                            zzc = zzfe.zzc(i21, (zzeo) object2);
                        } else {
                            zzc = zzfe.zzb(i21, (String) object2);
                        }
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza(t, i21, i20)) {
                        zzc = zzhy.zzc(i21, unsafe2.getObject(t, j3), zzbh(i20));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzc(i21, (zzeo) unsafe2.getObject(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzj(i21, zzh(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzn(i21, zzh(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza(t, i21, i20)) {
                        i4 = zzfe.zzm(i21, 0);
                        i18 += i4;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzh(i21, 0L);
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzk(i21, zzh(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzf(i21, zzi(t, j3));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza(t, i21, i20)) {
                        zzc = zzfe.zzc(i21, (zzhf) unsafe2.getObject(t, j3), zzbh(i20));
                        i18 += zzc;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
        }
        int zza = i18 + zza((zzio) this.zzzr, (Object) t);
        return this.zzzi ? zza + this.zzzs.zzc(t).zzeq() : zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.vision.zzhw] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.vision.zzhw] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.vision.zzhw
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzr(T r14) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zzr(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.vision.zzhw
    public final void zze(T t) {
        int i;
        int i2 = this.zzzn;
        while (true) {
            i = this.zzzo;
            if (i2 >= i) {
                break;
            }
            long zzbk = (long) (zzbk(this.zzzm[i2]) & 1048575);
            Object zzp = zziu.zzp(t, zzbk);
            if (zzp != null) {
                zziu.zza(t, zzbk, this.zzzt.zzm(zzp));
            }
            i2++;
        }
        int length = this.zzzm.length;
        while (i < length) {
            this.zzzq.zzb(t, (long) this.zzzm[i]);
            i++;
        }
        this.zzzr.zze(t);
        if (this.zzzi) {
            this.zzzs.zze((Object) t);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r19, com.google.android.gms.internal.vision.zzjj r20) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1342
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zzb(java.lang.Object, com.google.android.gms.internal.vision.zzjj):void");
    }

    private final int zzr(int i, int i2) {
        if (i < this.zzzf || i > this.zzzg) {
            return -1;
        }
        return zzs(i, i2);
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
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
        long zzbk = (long) (zzbk(i) & 1048575);
        if (zza(t2, i)) {
            Object zzp = zziu.zzp(t, zzbk);
            Object zzp2 = zziu.zzp(t2, zzbk);
            if (zzp != null && zzp2 != null) {
                zziu.zza(t, zzbk, zzga.zza(zzp, zzp2));
                zzb(t, i);
            } else if (zzp2 != null) {
                zziu.zza(t, zzbk, zzp2);
                zzb(t, i);
            }
        }
    }

    public static <UT, UB> int zza(zzio<UT, UB> zzio, T t) {
        return zzio.zzp(zzio.zzt(t));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a26  */
    @Override // com.google.android.gms.internal.vision.zzhw
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r14, com.google.android.gms.internal.vision.zzjj r15) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 2912
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, com.google.android.gms.internal.vision.zzjj):void");
    }

    private final void zzb(T t, int i) {
        if (!this.zzzk) {
            int zzbl = zzbl(i);
            long j = (long) (zzbl & 1048575);
            zziu.zzb(t, j, zziu.zzk(t, j) | (1 << (zzbl >>> 20)));
        }
    }

    private final void zzb(T t, int i, int i2) {
        zziu.zzb(t, (long) (zzbl(i2) & 1048575), i);
    }

    private final <K, V> void zza(zzjj zzjj, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzjj.zza(i, this.zzzt.zzo(zzbi(i2)), this.zzzt.zzk(obj));
        }
    }

    public static <UT, UB> void zza(zzio<UT, UB> zzio, T t, zzjj zzjj) throws IOException {
        zzio.zza(zzio.zzt(t), zzjj);
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.google.android.gms.internal.vision.zzhw
    public final void zza(T r13, com.google.android.gms.internal.vision.zzhv r14, com.google.android.gms.internal.vision.zzfk r15) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1646
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, com.google.android.gms.internal.vision.zzhv, com.google.android.gms.internal.vision.zzfk):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.gms.internal.vision.zzhw */
    /* JADX WARN: Multi-variable type inference failed */
    public static int zza(zzhw zzhw, byte[] bArr, int i, int i2, zzei zzei) throws IOException {
        int i3 = i + 1;
        byte b = bArr[i];
        byte b2 = b;
        if (b < 0) {
            i3 = zzeh.zza(b, bArr, i3, zzei);
            b2 = zzei.zzro;
        }
        if (b2 < 0 || b2 > i2 - i3) {
            throw zzgf.zzfh();
        }
        Object newInstance = zzhw.newInstance();
        int i4 = (b2 == 1 ? 1 : 0) + i3;
        zzhw.zza(newInstance, bArr, i3, i4, zzei);
        zzhw.zze(newInstance);
        zzei.zzrq = newInstance;
        return i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: com.google.android.gms.internal.vision.zzhj */
    /* JADX WARN: Multi-variable type inference failed */
    public static int zza(zzhw zzhw, byte[] bArr, int i, int i2, int i3, zzei zzei) throws IOException {
        zzhj zzhj = (zzhj) zzhw;
        Object newInstance = zzhj.newInstance();
        int zza = zzhj.zza(newInstance, bArr, i, i2, i3, zzei);
        zzhj.zze(newInstance);
        zzei.zzrq = newInstance;
        return zza;
    }

    public static int zza(zzhw<?> zzhw, int i, byte[] bArr, int i2, int i3, zzge<?> zzge, zzei zzei) throws IOException {
        int zza = zza((zzhw) zzhw, bArr, i2, i3, zzei);
        zzge.add(zzei.zzrq);
        while (zza < i3) {
            int zza2 = zzeh.zza(bArr, zza, zzei);
            if (i != zzei.zzro) {
                break;
            }
            zza = zza((zzhw) zzhw, bArr, zza2, i3, zzei);
            zzge.add(zzei.zzrq);
        }
        return zza;
    }

    public static int zza(byte[] bArr, int i, int i2, zzjd zzjd, Class<?> cls, zzei zzei) throws IOException {
        switch (zzhk.zzrr[zzjd.ordinal()]) {
            case 1:
                int zzb = zzeh.zzb(bArr, i, zzei);
                zzei.zzrq = Boolean.valueOf(zzei.zzrp != 0);
                return zzb;
            case 2:
                return zzeh.zze(bArr, i, zzei);
            case 3:
                zzei.zzrq = Double.valueOf(zzeh.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzei.zzrq = Integer.valueOf(zzeh.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzei.zzrq = Long.valueOf(zzeh.zzb(bArr, i));
                return i + 8;
            case 8:
                zzei.zzrq = Float.valueOf(zzeh.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzeh.zza(bArr, i, zzei);
                zzei.zzrq = Integer.valueOf(zzei.zzro);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzeh.zzb(bArr, i, zzei);
                zzei.zzrq = Long.valueOf(zzei.zzrp);
                return zzb2;
            case 14:
                return zza((zzhw) zzhs.zzgl().zzf(cls), bArr, i, i2, zzei);
            case 15:
                int zza2 = zzeh.zza(bArr, i, zzei);
                zzei.zzrq = Integer.valueOf(zzez.zzaq(zzei.zzro));
                return zza2;
            case 16:
                int zzb3 = zzeh.zzb(bArr, i, zzei);
                zzei.zzrq = Long.valueOf(zzez.zzd(zzei.zzrp));
                return zzb3;
            case 17:
                return zzeh.zzd(bArr, i, zzei);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzei zzei) throws IOException {
        return zzeh.zza(i, bArr, i2, i3, zzq(obj), zzei);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.vision.zzei r30) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.vision.zzei):int");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x003e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x003e */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzei zzei) throws IOException {
        Unsafe unsafe = zzzc;
        Object zzbi = zzbi(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzzt.zzl(object)) {
            Object zzn = this.zzzt.zzn(zzbi);
            this.zzzt.zzb(zzn, object);
            unsafe.putObject(t, j, zzn);
            object = zzn;
        }
        zzgy<?, ?> zzo = this.zzzt.zzo(zzbi);
        Map<?, ?> zzj = this.zzzt.zzj(object);
        int zza = zzeh.zza(bArr, i, zzei);
        int i4 = zzei.zzro;
        if (i4 < 0 || i4 > i2 - zza) {
            throw zzgf.zzfh();
        }
        int i5 = i4 + zza;
        C6140iIil.OooO0O0 oooO0O0 = (K) zzo.zzyw;
        C6140iIil.OooO0O0 oooO0O02 = (V) zzo.zzgq;
        while (zza < i5) {
            int i6 = zza + 1;
            byte b = bArr[zza];
            int i7 = b;
            if (b < 0) {
                i6 = zzeh.zza(b, bArr, i6, zzei);
                i7 = zzei.zzro;
            }
            int i8 = (i7 == 1 ? 1 : 0) >>> 3;
            int i9 = (i7 == 1 ? 1 : 0) & 7;
            if (i8 != 1) {
                if (i8 == 2 && i9 == zzo.zzyx.zzhp()) {
                    zza = zza(bArr, i6, i2, zzo.zzyx, zzo.zzgq.getClass(), zzei);
                    oooO0O02 = (V) zzei.zzrq;
                }
            } else if (i9 == zzo.zzyv.zzhp()) {
                zza = zza(bArr, i6, i2, zzo.zzyv, (Class<?>) null, zzei);
                oooO0O0 = (K) zzei.zzrq;
            }
            zza = zzeh.zza(i7, bArr, i6, i2, zzei);
        }
        if (zza == i5) {
            zzj.put(oooO0O0, oooO0O02);
            return i5;
        }
        throw zzgf.zzfo();
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzei zzei) throws IOException {
        int i9;
        Unsafe unsafe = zzzc;
        long j2 = (long) (this.zzzd[i8 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzeh.zzc(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzeh.zzd(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    i9 = zzeh.zzb(bArr, i, zzei);
                    unsafe.putObject(t, j, Long.valueOf(zzei.zzrp));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    i9 = zzeh.zza(bArr, i, zzei);
                    unsafe.putObject(t, j, Integer.valueOf(zzei.zzro));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzeh.zzb(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzeh.zza(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    i9 = zzeh.zzb(bArr, i, zzei);
                    unsafe.putObject(t, j, Boolean.valueOf(zzei.zzrp != 0));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = zzeh.zza(bArr, i, zzei);
                    int i10 = zzei.zzro;
                    if (i10 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) == 0 || zziw.zzg(bArr, zza, zza + i10)) {
                        unsafe.putObject(t, j, new String(bArr, zza, i10, zzga.UTF_8));
                        zza += i10;
                    } else {
                        throw zzgf.zzfp();
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza2 = zza(zzbh(i8), bArr, i, i2, zzei);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzei.zzrq);
                    } else {
                        unsafe.putObject(t, j, zzga.zza(object, zzei.zzrq));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    i9 = zzeh.zze(bArr, i, zzei);
                    unsafe.putObject(t, j, zzei.zzrq);
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza3 = zzeh.zza(bArr, i, zzei);
                    int i11 = zzei.zzro;
                    zzgd zzbj = zzbj(i8);
                    if (zzbj == null || zzbj.zzh(i11)) {
                        unsafe.putObject(t, j, Integer.valueOf(i11));
                        i9 = zza3;
                        unsafe.putInt(t, j2, i4);
                        return i9;
                    }
                    zzq(t).zzb(i3, Long.valueOf((long) i11));
                    return zza3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    i9 = zzeh.zza(bArr, i, zzei);
                    unsafe.putObject(t, j, Integer.valueOf(zzez.zzaq(zzei.zzro)));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    i9 = zzeh.zzb(bArr, i, zzei);
                    unsafe.putObject(t, j, Long.valueOf(zzez.zzd(zzei.zzrp)));
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    i9 = zza(zzbh(i8), bArr, i, i2, (i3 & -8) | 4, zzei);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzei.zzrq);
                    } else {
                        unsafe.putObject(t, j, zzga.zza(object2, zzei.zzrq));
                    }
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0342, code lost:
        if (r0 == r4) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x038b, code lost:
        if (r0 == r15) goto L_0x03b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.vision.zzei r33) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.zzei):int");
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
    @Override // com.google.android.gms.internal.vision.zzhw
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.vision.zzei r32) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 660
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzhj.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.zzei):void");
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzio<UT, UB> zzio) {
        zzgd zzbj;
        int i2 = this.zzzd[i];
        Object zzp = zziu.zzp(obj, (long) (zzbk(i) & 1048575));
        return (zzp == null || (zzbj = zzbj(i)) == null) ? ub : (UB) zza(i, i2, (Map<K, V>) this.zzzt.zzj(zzp), zzbj, ub, zzio);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzgd zzgd, UB ub, zzio<UT, UB> zzio) {
        zzgy<?, ?> zzo = this.zzzt.zzo(zzbi(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzgd.zzh(next.getValue().intValue())) {
                if (ub == null) {
                    ub = zzio.zzhd();
                }
                zzev zzaj = zzeo.zzaj(zzgx.zza(zzo, next.getKey(), next.getValue()));
                try {
                    zzgx.zza(zzaj.zzdp(), zzo, next.getKey(), next.getValue());
                    zzio.zza(ub, i2, zzaj.zzdo());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.internal.vision.zzhw */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zza(Object obj, int i, zzhw zzhw) {
        return zzhw.zzr(zziu.zzp(obj, (long) (i & 1048575)));
    }

    public static void zza(int i, Object obj, zzjj zzjj) throws IOException {
        if (obj instanceof String) {
            zzjj.zza(i, (String) obj);
        } else {
            zzjj.zza(i, (zzeo) obj);
        }
    }

    private final void zza(Object obj, int i, zzhv zzhv) throws IOException {
        if (zzbm(i)) {
            zziu.zza(obj, (long) (i & 1048575), zzhv.zzcv());
        } else if (this.zzzj) {
            zziu.zza(obj, (long) (i & 1048575), zzhv.readString());
        } else {
            zziu.zza(obj, (long) (i & 1048575), zzhv.zzcw());
        }
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzzk) {
            return zza(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzzk) {
            int zzbk = zzbk(i);
            long j = (long) (zzbk & 1048575);
            switch ((zzbk & 267386880) >>> 20) {
                case 0:
                    return zziu.zzo(t, j) != AbstractC8352oOoOOoO0.OooO0O0;
                case 1:
                    return zziu.zzn(t, j) != 0.0f;
                case 2:
                    return zziu.zzl(t, j) != 0;
                case 3:
                    return zziu.zzl(t, j) != 0;
                case 4:
                    return zziu.zzk(t, j) != 0;
                case 5:
                    return zziu.zzl(t, j) != 0;
                case 6:
                    return zziu.zzk(t, j) != 0;
                case 7:
                    return zziu.zzm(t, j);
                case 8:
                    Object zzp = zziu.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    }
                    if (zzp instanceof zzeo) {
                        return !zzeo.zzrx.equals(zzp);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zziu.zzp(t, j) != null;
                case 10:
                    return !zzeo.zzrx.equals(zziu.zzp(t, j));
                case 11:
                    return zziu.zzk(t, j) != 0;
                case 12:
                    return zziu.zzk(t, j) != 0;
                case 13:
                    return zziu.zzk(t, j) != 0;
                case 14:
                    return zziu.zzl(t, j) != 0;
                case 15:
                    return zziu.zzk(t, j) != 0;
                case 16:
                    return zziu.zzl(t, j) != 0;
                case 17:
                    return zziu.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int zzbl = zzbl(i);
            return (zziu.zzk(t, (long) (zzbl & 1048575)) & (1 << (zzbl >>> 20))) != 0;
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zziu.zzk(t, (long) (zzbl(i2) & 1048575)) == i;
    }
}
