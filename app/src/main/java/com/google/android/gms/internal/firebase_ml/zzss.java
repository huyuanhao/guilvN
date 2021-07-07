package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C8026oOO00oOo;
import com.p118pd.sdk.O0O00O;
import com.umeng.commonsdk.proguard.C3587az;
import java.io.IOException;

public final class zzss {
    public static int zza(byte[] bArr, int i, zzst zzst) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza(b, bArr, i2, zzst);
        }
        zzst.zzbkg = b;
        return i2;
    }

    public static int zzb(byte[] bArr, int i, zzst zzst) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzst.zzbkh = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & O0O00O.OooO0O0)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & O0O00O.OooO0O0)) << i4;
            b = b2;
            i3 = i5;
        }
        zzst.zzbkh = j2;
        return i3;
    }

    public static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    public static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    public static int zze(byte[] bArr, int i, zzst zzst) throws zzuo {
        int zza = zza(bArr, i, zzst);
        int i2 = zzst.zzbkg;
        if (i2 < 0) {
            throw zzuo.zzrn();
        } else if (i2 > bArr.length - zza) {
            throw zzuo.zzrm();
        } else if (i2 == 0) {
            zzst.zzbki = zzsw.zzbkl;
            return zza;
        } else {
            zzst.zzbki = zzsw.zzc(bArr, zza, i2);
            return zza + i2;
        }
    }

    public static int zzc(byte[] bArr, int i, zzst zzst) throws zzuo {
        int zza = zza(bArr, i, zzst);
        int i2 = zzst.zzbkg;
        if (i2 < 0) {
            throw zzuo.zzrn();
        } else if (i2 == 0) {
            zzst.zzbki = "";
            return zza;
        } else {
            zzst.zzbki = new String(bArr, zza, i2, zzug.UTF_8);
            return zza + i2;
        }
    }

    public static int zzd(byte[] bArr, int i, zzst zzst) throws zzuo {
        int zza = zza(bArr, i, zzst);
        int i2 = zzst.zzbkg;
        if (i2 < 0) {
            throw zzuo.zzrn();
        } else if (i2 == 0) {
            zzst.zzbki = "";
            return zza;
        } else {
            zzst.zzbki = zzxe.zzh(bArr, zza, i2);
            return zza + i2;
        }
    }

    public static int zza(int i, byte[] bArr, int i2, zzst zzst) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzst.zzbkg = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & O0O00O.OooO0O0) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzst.zzbkg = i5 | (b2 << C3587az.f9268l);
            return i6;
        }
        int i7 = i5 | ((b2 & O0O00O.OooO0O0) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzst.zzbkg = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & O0O00O.OooO0O0) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzst.zzbkg = i9 | (b4 << C8026oOO00oOo.OooO00o);
            return i10;
        }
        int i11 = i9 | ((b4 & O0O00O.OooO0O0) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzst.zzbkg = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static long zzb(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zza(zzwe zzwe, byte[] bArr, int i, int i2, zzst zzst) throws IOException {
        int i3 = i + 1;
        byte b = bArr[i];
        byte b2 = b;
        if (b < 0) {
            i3 = zza(b, bArr, i3, zzst);
            b2 = zzst.zzbkg;
        }
        if (b2 < 0 || b2 > i2 - i3) {
            throw zzuo.zzrm();
        }
        Object newInstance = zzwe.newInstance();
        int i4 = (b2 == 1 ? 1 : 0) + i3;
        zzwe.zza(newInstance, bArr, i3, i4, zzst);
        zzwe.zzq(newInstance);
        zzst.zzbki = newInstance;
        return i4;
    }

    public static int zza(zzwe zzwe, byte[] bArr, int i, int i2, int i3, zzst zzst) throws IOException {
        zzvs zzvs = (zzvs) zzwe;
        Object newInstance = zzvs.newInstance();
        int zza = zzvs.zza(newInstance, bArr, i, i2, i3, zzst);
        zzvs.zzq(newInstance);
        zzst.zzbki = newInstance;
        return zza;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzun<?> zzun, zzst zzst) {
        zzuf zzuf = (zzuf) zzun;
        int zza = zza(bArr, i2, zzst);
        zzuf.zzdh(zzst.zzbkg);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzst);
            if (i != zzst.zzbkg) {
                break;
            }
            zza = zza(bArr, zza2, zzst);
            zzuf.zzdh(zzst.zzbkg);
        }
        return zza;
    }

    public static int zza(byte[] bArr, int i, zzun<?> zzun, zzst zzst) throws IOException {
        zzuf zzuf = (zzuf) zzun;
        int zza = zza(bArr, i, zzst);
        int i2 = zzst.zzbkg + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzst);
            zzuf.zzdh(zzst.zzbkg);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzuo.zzrm();
    }

    public static int zza(zzwe<?> zzwe, int i, byte[] bArr, int i2, int i3, zzun<?> zzun, zzst zzst) throws IOException {
        int zza = zza(zzwe, bArr, i2, i3, zzst);
        zzun.add(zzst.zzbki);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzst);
            if (i != zzst.zzbkg) {
                break;
            }
            zza = zza(zzwe, bArr, zza2, i3, zzst);
            zzun.add(zzst.zzbki);
        }
        return zza;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzwx zzwx, zzst zzst) throws zzuo {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzst);
                zzwx.zzb(i, Long.valueOf(zzst.zzbkh));
                return zzb;
            } else if (i4 == 1) {
                zzwx.zzb(i, Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzst);
                int i5 = zzst.zzbkg;
                if (i5 < 0) {
                    throw zzuo.zzrn();
                } else if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzwx.zzb(i, zzsw.zzbkl);
                    } else {
                        zzwx.zzb(i, zzsw.zzc(bArr, zza, i5));
                    }
                    return zza + i5;
                } else {
                    throw zzuo.zzrm();
                }
            } else if (i4 == 3) {
                zzwx zzth = zzwx.zzth();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzst);
                    int i8 = zzst.zzbkg;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zza2;
                        break;
                    }
                    int zza3 = zza(i7, bArr, zza2, i3, zzth, zzst);
                    i7 = i8;
                    i2 = zza3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzuo.zzrq();
                }
                zzwx.zzb(i, zzth);
                return i2;
            } else if (i4 == 5) {
                zzwx.zzb(i, Integer.valueOf(zza(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzuo.zzro();
            }
        } else {
            throw zzuo.zzro();
        }
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzst zzst) throws zzuo {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzb(bArr, i2, zzst);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zza(bArr, i2, zzst) + zzst.zzbkg;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = zza(bArr, i2, zzst);
                    i6 = zzst.zzbkg;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = zza(i6, bArr, i2, i3, zzst);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzuo.zzrq();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzuo.zzro();
            }
        } else {
            throw zzuo.zzro();
        }
    }
}
