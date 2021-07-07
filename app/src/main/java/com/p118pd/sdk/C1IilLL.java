package com.p118pd.sdk;

import anet.channel.entity.EventType;
import com.taobao.accs.flowcontrol.FlowControl;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.math.BigInteger;
import java.util.Random;

/* renamed from: com.pd.sdk.丨1Iil丨LL  reason: invalid class name */
public class C1IilLL {
    public static Random OooO00o = new Random();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final short[] f22756OooO00o = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean[] f22757OooO00o = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public static final int[] OooO0O0 = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, CommonNetImpl.FLAG_SHARE_JUMP, 67108864, 134217728, CommonNetImpl.FLAG_AUTH, 536870912, 1073741824, Integer.MIN_VALUE, 0};
    public static final int[] OooO0OO = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, EventType.ALL, 8191, 16383, 32767, 65535, 131071, i111I.OooO0OO, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, iIiLL1I.OooO0OO, iIiLL1I.OooO0Oo, 134217727, AbstractC6160iLIi.OooO0O0, 536870911, 1073741823, Integer.MAX_VALUE, -1};

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f22758OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f22759OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f22760OooO0O0;

    public C1IilLL(int i) {
        i = i < 1 ? 1 : i;
        int i2 = ((i - 1) >> 5) + 1;
        this.f22760OooO0O0 = i2;
        this.f22759OooO00o = new int[i2];
        this.f22758OooO00o = i;
    }

    public C1IilLL(int i, String str) {
        i = i < 1 ? 1 : i;
        int i2 = ((i - 1) >> 5) + 1;
        this.f22760OooO0O0 = i2;
        this.f22759OooO00o = new int[i2];
        this.f22758OooO00o = i;
        if (str.equalsIgnoreCase("ZERO")) {
            OooO0Oo();
        } else if (str.equalsIgnoreCase("ONE")) {
            m21286OooO0O0();
        } else if (str.equalsIgnoreCase("RANDOM")) {
            OooO0o();
        } else if (str.equalsIgnoreCase("X")) {
            m21290OooO0OO();
        } else if (str.equalsIgnoreCase(FlowControl.SERVICE_ALL)) {
            m21276OooO00o();
        } else {
            throw new IllegalArgumentException("Error: GF2Polynomial was called using " + str + " as value!");
        }
    }

    public C1IilLL(int i, BigInteger bigInteger) {
        i = i < 1 ? 1 : i;
        int i2 = ((i - 1) >> 5) + 1;
        this.f22760OooO0O0 = i2;
        this.f22759OooO00o = new int[i2];
        this.f22758OooO00o = i;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        int length2 = byteArray.length & 3;
        int length3 = ((byteArray.length - 1) >> 2) + 1;
        for (int i3 = 0; i3 < length2; i3++) {
            int[] iArr = this.f22759OooO00o;
            int i4 = length3 - 1;
            iArr[i4] = iArr[i4] | ((byteArray[i3] & 255) << (((length2 - 1) - i3) << 3));
        }
        for (int i5 = 0; i5 <= ((byteArray.length - 4) >> 2); i5++) {
            int length4 = (byteArray.length - 1) - (i5 << 2);
            int[] iArr2 = this.f22759OooO00o;
            iArr2[i5] = byteArray[length4] & 255;
            iArr2[i5] = iArr2[i5] | ((byteArray[length4 - 1] << 8) & 65280);
            iArr2[i5] = iArr2[i5] | ((byteArray[length4 - 2] << 16) & C7265o0O000oo.OooOo0O);
            iArr2[i5] = ((byteArray[length4 - 3] << 24) & -16777216) | iArr2[i5];
        }
        int i6 = this.f22758OooO00o;
        if ((i6 & 31) != 0) {
            int[] iArr3 = this.f22759OooO00o;
            int i7 = this.f22760OooO0O0 - 1;
            iArr3[i7] = OooO0OO[i6 & 31] & iArr3[i7];
        }
        OooO0oO();
    }

    public C1IilLL(int i, Random random) {
        i = i < 1 ? 1 : i;
        int i2 = ((i - 1) >> 5) + 1;
        this.f22760OooO0O0 = i2;
        this.f22759OooO00o = new int[i2];
        this.f22758OooO00o = i;
        OooO00o(random);
    }

    public C1IilLL(int i, byte[] bArr) {
        int i2;
        i = i < 1 ? 1 : i;
        int i3 = ((i - 1) >> 5) + 1;
        this.f22760OooO0O0 = i3;
        this.f22759OooO00o = new int[i3];
        this.f22758OooO00o = i;
        int min = Math.min(((bArr.length - 1) >> 2) + 1, i3);
        int i4 = 0;
        while (true) {
            i2 = min - 1;
            if (i4 >= i2) {
                break;
            }
            int length = (bArr.length - (i4 << 2)) - 1;
            int[] iArr = this.f22759OooO00o;
            iArr[i4] = bArr[length] & 255;
            iArr[i4] = (65280 & (bArr[length - 1] << 8)) | iArr[i4];
            iArr[i4] = (16711680 & (bArr[length - 2] << 16)) | iArr[i4];
            iArr[i4] = ((bArr[length - 3] << 24) & -16777216) | iArr[i4];
            i4++;
        }
        int length2 = (bArr.length - (i2 << 2)) - 1;
        int[] iArr2 = this.f22759OooO00o;
        iArr2[i2] = bArr[length2] & 255;
        if (length2 > 0) {
            iArr2[i2] = (65280 & (bArr[length2 - 1] << 8)) | iArr2[i2];
        }
        if (length2 > 1) {
            int[] iArr3 = this.f22759OooO00o;
            iArr3[i2] = iArr3[i2] | (16711680 & (bArr[length2 - 2] << 16));
        }
        if (length2 > 2) {
            int[] iArr4 = this.f22759OooO00o;
            iArr4[i2] = ((bArr[length2 - 3] << 24) & -16777216) | iArr4[i2];
        }
        OooOOO0();
        OooO0oO();
    }

    public C1IilLL(int i, int[] iArr) {
        i = i < 1 ? 1 : i;
        int i2 = ((i - 1) >> 5) + 1;
        this.f22760OooO0O0 = i2;
        this.f22759OooO00o = new int[i2];
        this.f22758OooO00o = i;
        System.arraycopy(iArr, 0, this.f22759OooO00o, 0, Math.min(i2, iArr.length));
        OooOOO0();
    }

    public C1IilLL(C1IilLL r2) {
        this.f22758OooO00o = r2.f22758OooO00o;
        this.f22760OooO0O0 = r2.f22760OooO0O0;
        this.f22759OooO00o = lllILI.m17914OooO00o(r2.f22759OooO00o);
    }

    private C1IilLL OooO(C1IilLL r8) {
        C1IilLL r0 = new C1IilLL(this.f22758OooO00o << 1);
        int i = this.f22758OooO00o;
        if (i <= 32) {
            r0.f22759OooO00o = OooO00o(this.f22759OooO00o[0], r8.f22759OooO00o[0]);
            return r0;
        } else if (i <= 64) {
            r0.f22759OooO00o = OooO0Oo(this.f22759OooO00o, r8.f22759OooO00o);
            return r0;
        } else if (i <= 128) {
            r0.f22759OooO00o = OooO00o(this.f22759OooO00o, r8.f22759OooO00o);
            return r0;
        } else if (i <= 256) {
            r0.f22759OooO00o = OooO0O0(this.f22759OooO00o, r8.f22759OooO00o);
            return r0;
        } else if (i <= 512) {
            r0.f22759OooO00o = OooO0OO(this.f22759OooO00o, r8.f22759OooO00o);
            return r0;
        } else {
            int i2 = OooO0O0[C6356i1IiI1.OooO0Oo(i - 1)];
            int i3 = ((i2 - 1) >> 5) + 1;
            C1IilLL OooO0O02 = OooO0O0(i3);
            C1IilLL OooO0OO2 = OooO0OO(i3);
            C1IilLL OooO0O03 = r8.OooO0O0(i3);
            C1IilLL OooO0OO3 = r8.OooO0OO(i3);
            C1IilLL OooO = OooO0OO2.OooO(OooO0OO3);
            C1IilLL OooO2 = OooO0O02.OooO(OooO0O03);
            OooO0O02.m21279OooO00o(OooO0OO2);
            OooO0O03.m21279OooO00o(OooO0OO3);
            C1IilLL OooO3 = OooO0O02.OooO(OooO0O03);
            r0.OooO00o(OooO, i2 << 1);
            r0.OooO00o(OooO, i2);
            r0.OooO00o(OooO3, i2);
            r0.OooO00o(OooO2, i2);
            r0.m21279OooO00o(OooO2);
            return r0;
        }
    }

    public static int[] OooO00o(int i, int i2) {
        int[] iArr = new int[2];
        if (!(i == 0 || i2 == 0)) {
            long j = ((long) i2) & 4294967295L;
            long j2 = 0;
            for (int i3 = 1; i3 <= 32; i3++) {
                if ((OooO0O0[i3 - 1] & i) != 0) {
                    j2 ^= j;
                }
                j <<= 1;
            }
            iArr[1] = (int) (j2 >>> 32);
            iArr[0] = (int) (j2 & 4294967295L);
        }
        return iArr;
    }

    public static int[] OooO00o(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[2];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(2, iArr.length));
        int[] iArr5 = new int[2];
        if (iArr.length > 2) {
            System.arraycopy(iArr, 2, iArr5, 0, Math.min(2, iArr.length - 2));
        }
        int[] iArr6 = new int[2];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(2, iArr2.length));
        int[] iArr7 = new int[2];
        if (iArr2.length > 2) {
            System.arraycopy(iArr2, 2, iArr7, 0, Math.min(2, iArr2.length - 2));
        }
        if (iArr5[1] != 0 || iArr7[1] != 0) {
            int[] OooO0Oo = OooO0Oo(iArr5, iArr7);
            iArr3[7] = iArr3[7] ^ OooO0Oo[3];
            iArr3[6] = iArr3[6] ^ OooO0Oo[2];
            iArr3[5] = iArr3[5] ^ (OooO0Oo[1] ^ OooO0Oo[3]);
            iArr3[4] = iArr3[4] ^ (OooO0Oo[0] ^ OooO0Oo[2]);
            iArr3[3] = iArr3[3] ^ OooO0Oo[1];
            iArr3[2] = OooO0Oo[0] ^ iArr3[2];
        } else if (!(iArr5[0] == 0 && iArr7[0] == 0)) {
            int[] OooO00o2 = OooO00o(iArr5[0], iArr7[0]);
            iArr3[5] = iArr3[5] ^ OooO00o2[1];
            iArr3[4] = iArr3[4] ^ OooO00o2[0];
            iArr3[3] = iArr3[3] ^ OooO00o2[1];
            iArr3[2] = OooO00o2[0] ^ iArr3[2];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        if (iArr5[1] == 0 && iArr7[1] == 0) {
            int[] OooO00o3 = OooO00o(iArr5[0], iArr7[0]);
            iArr3[3] = iArr3[3] ^ OooO00o3[1];
            iArr3[2] = OooO00o3[0] ^ iArr3[2];
        } else {
            int[] OooO0Oo2 = OooO0Oo(iArr5, iArr7);
            iArr3[5] = iArr3[5] ^ OooO0Oo2[3];
            iArr3[4] = iArr3[4] ^ OooO0Oo2[2];
            iArr3[3] = iArr3[3] ^ OooO0Oo2[1];
            iArr3[2] = OooO0Oo2[0] ^ iArr3[2];
        }
        if (iArr4[1] == 0 && iArr6[1] == 0) {
            int[] OooO00o4 = OooO00o(iArr4[0], iArr6[0]);
            iArr3[3] = iArr3[3] ^ OooO00o4[1];
            iArr3[2] = iArr3[2] ^ OooO00o4[0];
            iArr3[1] = iArr3[1] ^ OooO00o4[1];
            iArr3[0] = OooO00o4[0] ^ iArr3[0];
        } else {
            int[] OooO0Oo3 = OooO0Oo(iArr4, iArr6);
            iArr3[5] = iArr3[5] ^ OooO0Oo3[3];
            iArr3[4] = iArr3[4] ^ OooO0Oo3[2];
            iArr3[3] = iArr3[3] ^ (OooO0Oo3[1] ^ OooO0Oo3[3]);
            iArr3[2] = iArr3[2] ^ (OooO0Oo3[0] ^ OooO0Oo3[2]);
            iArr3[1] = iArr3[1] ^ OooO0Oo3[1];
            iArr3[0] = OooO0Oo3[0] ^ iArr3[0];
        }
        return iArr3;
    }

    private C1IilLL OooO0O0(int i) {
        C1IilLL r0 = new C1IilLL(i << 5);
        System.arraycopy(this.f22759OooO00o, 0, r0.f22759OooO00o, 0, Math.min(i, this.f22760OooO0O0));
        return r0;
    }

    public static int[] OooO0O0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[4];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(4, iArr.length));
        int[] iArr5 = new int[4];
        if (iArr.length > 4) {
            System.arraycopy(iArr, 4, iArr5, 0, Math.min(4, iArr.length - 4));
        }
        int[] iArr6 = new int[4];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(4, iArr2.length));
        int[] iArr7 = new int[4];
        if (iArr2.length > 4) {
            System.arraycopy(iArr2, 4, iArr7, 0, Math.min(4, iArr2.length - 4));
        }
        if (iArr5[3] != 0 || iArr5[2] != 0 || iArr7[3] != 0 || iArr7[2] != 0) {
            int[] OooO00o2 = OooO00o(iArr5, iArr7);
            iArr3[15] = iArr3[15] ^ OooO00o2[7];
            iArr3[14] = iArr3[14] ^ OooO00o2[6];
            iArr3[13] = iArr3[13] ^ OooO00o2[5];
            iArr3[12] = iArr3[12] ^ OooO00o2[4];
            iArr3[11] = iArr3[11] ^ (OooO00o2[3] ^ OooO00o2[7]);
            iArr3[10] = iArr3[10] ^ (OooO00o2[2] ^ OooO00o2[6]);
            iArr3[9] = iArr3[9] ^ (OooO00o2[1] ^ OooO00o2[5]);
            iArr3[8] = iArr3[8] ^ (OooO00o2[0] ^ OooO00o2[4]);
            iArr3[7] = iArr3[7] ^ OooO00o2[3];
            iArr3[6] = iArr3[6] ^ OooO00o2[2];
            iArr3[5] = iArr3[5] ^ OooO00o2[1];
            iArr3[4] = OooO00o2[0] ^ iArr3[4];
        } else if (iArr5[1] != 0 || iArr7[1] != 0) {
            int[] OooO0Oo = OooO0Oo(iArr5, iArr7);
            iArr3[11] = iArr3[11] ^ OooO0Oo[3];
            iArr3[10] = iArr3[10] ^ OooO0Oo[2];
            iArr3[9] = iArr3[9] ^ OooO0Oo[1];
            iArr3[8] = iArr3[8] ^ OooO0Oo[0];
            iArr3[7] = iArr3[7] ^ OooO0Oo[3];
            iArr3[6] = iArr3[6] ^ OooO0Oo[2];
            iArr3[5] = iArr3[5] ^ OooO0Oo[1];
            iArr3[4] = OooO0Oo[0] ^ iArr3[4];
        } else if (!(iArr5[0] == 0 && iArr7[0] == 0)) {
            int[] OooO00o3 = OooO00o(iArr5[0], iArr7[0]);
            iArr3[9] = iArr3[9] ^ OooO00o3[1];
            iArr3[8] = iArr3[8] ^ OooO00o3[0];
            iArr3[5] = iArr3[5] ^ OooO00o3[1];
            iArr3[4] = OooO00o3[0] ^ iArr3[4];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[3] = iArr5[3] ^ iArr4[3];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[3] = iArr7[3] ^ iArr6[3];
        int[] OooO00o4 = OooO00o(iArr5, iArr7);
        iArr3[11] = iArr3[11] ^ OooO00o4[7];
        iArr3[10] = iArr3[10] ^ OooO00o4[6];
        iArr3[9] = iArr3[9] ^ OooO00o4[5];
        iArr3[8] = iArr3[8] ^ OooO00o4[4];
        iArr3[7] = iArr3[7] ^ OooO00o4[3];
        iArr3[6] = iArr3[6] ^ OooO00o4[2];
        iArr3[5] = iArr3[5] ^ OooO00o4[1];
        iArr3[4] = OooO00o4[0] ^ iArr3[4];
        int[] OooO00o5 = OooO00o(iArr4, iArr6);
        iArr3[11] = iArr3[11] ^ OooO00o5[7];
        iArr3[10] = iArr3[10] ^ OooO00o5[6];
        iArr3[9] = iArr3[9] ^ OooO00o5[5];
        iArr3[8] = iArr3[8] ^ OooO00o5[4];
        iArr3[7] = iArr3[7] ^ (OooO00o5[3] ^ OooO00o5[7]);
        iArr3[6] = iArr3[6] ^ (OooO00o5[2] ^ OooO00o5[6]);
        iArr3[5] = iArr3[5] ^ (OooO00o5[1] ^ OooO00o5[5]);
        iArr3[4] = iArr3[4] ^ (OooO00o5[0] ^ OooO00o5[4]);
        iArr3[3] = iArr3[3] ^ OooO00o5[3];
        iArr3[2] = iArr3[2] ^ OooO00o5[2];
        iArr3[1] = iArr3[1] ^ OooO00o5[1];
        iArr3[0] = OooO00o5[0] ^ iArr3[0];
        return iArr3;
    }

    private C1IilLL OooO0OO(int i) {
        int min = Math.min(i, this.f22760OooO0O0 - i);
        C1IilLL r1 = new C1IilLL(min << 5);
        if (this.f22760OooO0O0 >= i) {
            System.arraycopy(this.f22759OooO00o, i, r1.f22759OooO00o, 0, min);
        }
        return r1;
    }

    public static int[] OooO0OO(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[32];
        int[] iArr4 = new int[8];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(8, iArr.length));
        int[] iArr5 = new int[8];
        if (iArr.length > 8) {
            System.arraycopy(iArr, 8, iArr5, 0, Math.min(8, iArr.length - 8));
        }
        int[] iArr6 = new int[8];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(8, iArr2.length));
        int[] iArr7 = new int[8];
        if (iArr2.length > 8) {
            System.arraycopy(iArr2, 8, iArr7, 0, Math.min(8, iArr2.length - 8));
        }
        int[] OooO0O02 = OooO0O0(iArr5, iArr7);
        iArr3[31] = iArr3[31] ^ OooO0O02[15];
        iArr3[30] = iArr3[30] ^ OooO0O02[14];
        iArr3[29] = iArr3[29] ^ OooO0O02[13];
        iArr3[28] = iArr3[28] ^ OooO0O02[12];
        iArr3[27] = iArr3[27] ^ OooO0O02[11];
        iArr3[26] = iArr3[26] ^ OooO0O02[10];
        iArr3[25] = iArr3[25] ^ OooO0O02[9];
        iArr3[24] = iArr3[24] ^ OooO0O02[8];
        iArr3[23] = iArr3[23] ^ (OooO0O02[7] ^ OooO0O02[15]);
        iArr3[22] = iArr3[22] ^ (OooO0O02[6] ^ OooO0O02[14]);
        iArr3[21] = iArr3[21] ^ (OooO0O02[5] ^ OooO0O02[13]);
        iArr3[20] = iArr3[20] ^ (OooO0O02[4] ^ OooO0O02[12]);
        iArr3[19] = iArr3[19] ^ (OooO0O02[3] ^ OooO0O02[11]);
        iArr3[18] = iArr3[18] ^ (OooO0O02[2] ^ OooO0O02[10]);
        iArr3[17] = iArr3[17] ^ (OooO0O02[1] ^ OooO0O02[9]);
        iArr3[16] = iArr3[16] ^ (OooO0O02[0] ^ OooO0O02[8]);
        iArr3[15] = iArr3[15] ^ OooO0O02[7];
        iArr3[14] = iArr3[14] ^ OooO0O02[6];
        iArr3[13] = iArr3[13] ^ OooO0O02[5];
        iArr3[12] = iArr3[12] ^ OooO0O02[4];
        iArr3[11] = iArr3[11] ^ OooO0O02[3];
        iArr3[10] = iArr3[10] ^ OooO0O02[2];
        iArr3[9] = iArr3[9] ^ OooO0O02[1];
        iArr3[8] = iArr3[8] ^ OooO0O02[0];
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[3] = iArr5[3] ^ iArr4[3];
        iArr5[4] = iArr5[4] ^ iArr4[4];
        iArr5[5] = iArr5[5] ^ iArr4[5];
        iArr5[6] = iArr5[6] ^ iArr4[6];
        iArr5[7] = iArr5[7] ^ iArr4[7];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[3] = iArr7[3] ^ iArr6[3];
        iArr7[4] = iArr7[4] ^ iArr6[4];
        iArr7[5] = iArr7[5] ^ iArr6[5];
        iArr7[6] = iArr7[6] ^ iArr6[6];
        iArr7[7] = iArr7[7] ^ iArr6[7];
        int[] OooO0O03 = OooO0O0(iArr5, iArr7);
        iArr3[23] = iArr3[23] ^ OooO0O03[15];
        iArr3[22] = iArr3[22] ^ OooO0O03[14];
        iArr3[21] = iArr3[21] ^ OooO0O03[13];
        iArr3[20] = iArr3[20] ^ OooO0O03[12];
        iArr3[19] = iArr3[19] ^ OooO0O03[11];
        iArr3[18] = iArr3[18] ^ OooO0O03[10];
        iArr3[17] = iArr3[17] ^ OooO0O03[9];
        iArr3[16] = iArr3[16] ^ OooO0O03[8];
        iArr3[15] = iArr3[15] ^ OooO0O03[7];
        iArr3[14] = iArr3[14] ^ OooO0O03[6];
        iArr3[13] = iArr3[13] ^ OooO0O03[5];
        iArr3[12] = iArr3[12] ^ OooO0O03[4];
        iArr3[11] = iArr3[11] ^ OooO0O03[3];
        iArr3[10] = iArr3[10] ^ OooO0O03[2];
        iArr3[9] = iArr3[9] ^ OooO0O03[1];
        iArr3[8] = OooO0O03[0] ^ iArr3[8];
        int[] OooO0O04 = OooO0O0(iArr4, iArr6);
        iArr3[23] = iArr3[23] ^ OooO0O04[15];
        iArr3[22] = iArr3[22] ^ OooO0O04[14];
        iArr3[21] = iArr3[21] ^ OooO0O04[13];
        iArr3[20] = iArr3[20] ^ OooO0O04[12];
        iArr3[19] = iArr3[19] ^ OooO0O04[11];
        iArr3[18] = iArr3[18] ^ OooO0O04[10];
        iArr3[17] = iArr3[17] ^ OooO0O04[9];
        iArr3[16] = iArr3[16] ^ OooO0O04[8];
        iArr3[15] = iArr3[15] ^ (OooO0O04[7] ^ OooO0O04[15]);
        iArr3[14] = iArr3[14] ^ (OooO0O04[6] ^ OooO0O04[14]);
        iArr3[13] = iArr3[13] ^ (OooO0O04[5] ^ OooO0O04[13]);
        iArr3[12] = iArr3[12] ^ (OooO0O04[4] ^ OooO0O04[12]);
        iArr3[11] = iArr3[11] ^ (OooO0O04[3] ^ OooO0O04[11]);
        iArr3[10] = iArr3[10] ^ (OooO0O04[2] ^ OooO0O04[10]);
        iArr3[9] = iArr3[9] ^ (OooO0O04[1] ^ OooO0O04[9]);
        iArr3[8] = iArr3[8] ^ (OooO0O04[0] ^ OooO0O04[8]);
        iArr3[7] = iArr3[7] ^ OooO0O04[7];
        iArr3[6] = iArr3[6] ^ OooO0O04[6];
        iArr3[5] = iArr3[5] ^ OooO0O04[5];
        iArr3[4] = iArr3[4] ^ OooO0O04[4];
        iArr3[3] = iArr3[3] ^ OooO0O04[3];
        iArr3[2] = iArr3[2] ^ OooO0O04[2];
        iArr3[1] = iArr3[1] ^ OooO0O04[1];
        iArr3[0] = OooO0O04[0] ^ iArr3[0];
        return iArr3;
    }

    public static int[] OooO0Oo(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[4];
        int i = iArr[0];
        int i2 = iArr.length > 1 ? iArr[1] : 0;
        int i3 = iArr2[0];
        int i4 = iArr2.length > 1 ? iArr2[1] : 0;
        if (!(i2 == 0 && i4 == 0)) {
            int[] OooO00o2 = OooO00o(i2, i4);
            iArr3[3] = iArr3[3] ^ OooO00o2[1];
            iArr3[2] = iArr3[2] ^ (OooO00o2[0] ^ OooO00o2[1]);
            iArr3[1] = OooO00o2[0] ^ iArr3[1];
        }
        int[] OooO00o3 = OooO00o(i2 ^ i, i4 ^ i3);
        iArr3[2] = iArr3[2] ^ OooO00o3[1];
        iArr3[1] = OooO00o3[0] ^ iArr3[1];
        int[] OooO00o4 = OooO00o(i, i3);
        iArr3[2] = iArr3[2] ^ OooO00o4[1];
        iArr3[1] = iArr3[1] ^ (OooO00o4[0] ^ OooO00o4[1]);
        iArr3[0] = OooO00o4[0] ^ iArr3[0];
        return iArr3;
    }

    private void OooO0o0(int i) {
        int i2 = this.f22760OooO0O0;
        int[] iArr = this.f22759OooO00o;
        if (i2 <= iArr.length) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                int[] iArr2 = this.f22759OooO00o;
                iArr2[i3] = iArr2[i3 - i];
            }
            for (int i4 = 0; i4 < i; i4++) {
                this.f22759OooO00o[i4] = 0;
            }
            return;
        }
        int[] iArr3 = new int[i2];
        System.arraycopy(iArr, 0, iArr3, i, i2 - i);
        this.f22759OooO00o = null;
        this.f22759OooO00o = iArr3;
    }

    private void OooOOO0() {
        int i = this.f22758OooO00o;
        if ((i & 31) != 0) {
            int[] iArr = this.f22759OooO00o;
            int i2 = this.f22760OooO0O0 - 1;
            iArr[i2] = OooO0OO[i & 31] & iArr[i2];
        }
    }

    public void OooO() {
        int i = this.f22758OooO00o;
        int i2 = i & 31;
        this.f22758OooO00o = i + 1;
        int i3 = this.f22760OooO0O0;
        if (i2 == 0) {
            int i4 = i3 + 1;
            this.f22760OooO0O0 = i4;
            int[] iArr = this.f22759OooO00o;
            if (i4 > iArr.length) {
                int[] iArr2 = new int[i4];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                this.f22759OooO00o = null;
                this.f22759OooO00o = iArr2;
            }
            for (int i5 = this.f22760OooO0O0 - 1; i5 >= 1; i5--) {
                int[] iArr3 = this.f22759OooO00o;
                int i6 = i5 - 1;
                iArr3[i5] = iArr3[i5] | (iArr3[i6] >>> 31);
                iArr3[i6] = iArr3[i6] << 1;
            }
            return;
        }
        for (int i7 = i3 - 1; i7 >= 1; i7--) {
            int[] iArr4 = this.f22759OooO00o;
            iArr4[i7] = iArr4[i7] << 1;
            iArr4[i7] = iArr4[i7] | (iArr4[i7 - 1] >>> 31);
        }
        int[] iArr5 = this.f22759OooO00o;
        iArr5[0] = iArr5[0] << 1;
    }

    public int OooO00o() {
        return this.f22758OooO00o;
    }

    public int OooO00o(int i) {
        if (i < 0) {
            throw new RuntimeException();
        } else if (i > this.f22758OooO00o - 1) {
            return 0;
        } else {
            return (OooO0O0[i & 31] & this.f22759OooO00o[i >>> 5]) != 0 ? 1 : 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1IilLL m21272OooO00o() {
        C1IilLL r0 = new C1IilLL(this);
        r0.OooO0o0();
        return r0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1IilLL m21273OooO00o(int i) {
        C1IilLL r0 = new C1IilLL(this.f22758OooO00o + i, this.f22759OooO00o);
        if (i >= 32) {
            r0.OooO0o0(i >>> 5);
        }
        int i2 = i & 31;
        if (i2 != 0) {
            for (int i3 = r0.f22760OooO0O0 - 1; i3 >= 1; i3--) {
                int[] iArr = r0.f22759OooO00o;
                iArr[i3] = iArr[i3] << i2;
                iArr[i3] = iArr[i3] | (iArr[i3 - 1] >>> (32 - i2));
            }
            int[] iArr2 = r0.f22759OooO00o;
            iArr2[0] = iArr2[0] << i2;
        }
        return r0;
    }

    public C1IilLL OooO00o(C1IilLL r1) {
        return OooO0oo(r1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21274OooO00o(int i) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String[] strArr = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String str = new String();
        if (i == 16) {
            for (int i2 = this.f22760OooO0O0 - 1; i2 >= 0; i2--) {
                str = ((((((((str + cArr[(this.f22759OooO00o[i2] >>> 28) & 15]) + cArr[(this.f22759OooO00o[i2] >>> 24) & 15]) + cArr[(this.f22759OooO00o[i2] >>> 20) & 15]) + cArr[(this.f22759OooO00o[i2] >>> 16) & 15]) + cArr[(this.f22759OooO00o[i2] >>> 12) & 15]) + cArr[(this.f22759OooO00o[i2] >>> 8) & 15]) + cArr[(this.f22759OooO00o[i2] >>> 4) & 15]) + cArr[this.f22759OooO00o[i2] & 15]) + " ";
            }
        } else {
            for (int i3 = this.f22760OooO0O0 - 1; i3 >= 0; i3--) {
                str = ((((((((str + strArr[(this.f22759OooO00o[i3] >>> 28) & 15]) + strArr[(this.f22759OooO00o[i3] >>> 24) & 15]) + strArr[(this.f22759OooO00o[i3] >>> 20) & 15]) + strArr[(this.f22759OooO00o[i3] >>> 16) & 15]) + strArr[(this.f22759OooO00o[i3] >>> 12) & 15]) + strArr[(this.f22759OooO00o[i3] >>> 8) & 15]) + strArr[(this.f22759OooO00o[i3] >>> 4) & 15]) + strArr[this.f22759OooO00o[i3] & 15]) + " ";
            }
        }
        return str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21275OooO00o() {
        return (this.f22758OooO00o == 0 || m21293OooO0OO()) ? new BigInteger(0, new byte[0]) : new BigInteger(1, m21283OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21276OooO00o() {
        for (int i = 0; i < this.f22760OooO0O0; i++) {
            this.f22759OooO00o[i] = -1;
        }
        OooOOO0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21277OooO00o(int i) {
        if (this.f22758OooO00o < i) {
            this.f22758OooO00o = i;
            int i2 = ((i - 1) >>> 5) + 1;
            int i3 = this.f22760OooO0O0;
            if (i3 < i2) {
                int[] iArr = this.f22759OooO00o;
                if (iArr.length >= i2) {
                    while (i3 < i2) {
                        this.f22759OooO00o[i3] = 0;
                        i3++;
                    }
                    this.f22760OooO0O0 = i2;
                    return;
                }
                int[] iArr2 = new int[i2];
                System.arraycopy(iArr, 0, iArr2, 0, i3);
                this.f22760OooO0O0 = i2;
                this.f22759OooO00o = null;
                this.f22759OooO00o = iArr2;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21278OooO00o(int i, int i2) {
        int i3 = i >>> 5;
        int i4 = i & 31;
        int i5 = 32 - i4;
        int i6 = i - i2;
        int i7 = i6 >>> 5;
        int i8 = 32 - (i6 & 31);
        int i9 = ((i << 1) - 2) >>> 5;
        while (i9 > i3) {
            int[] iArr = this.f22759OooO00o;
            long j = 4294967295L & ((long) iArr[i9]);
            int i10 = i9 - i3;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] ^ ((int) (j << i5));
            iArr[i10] = (int) (((long) iArr[i10]) ^ (j >>> (32 - i5)));
            int i12 = i9 - i7;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] ^ ((int) (j << i8));
            iArr[i12] = (int) ((j >>> (32 - i8)) ^ ((long) iArr[i12]));
            iArr[i9] = 0;
            i9--;
            i3 = i3;
        }
        int[] iArr2 = this.f22759OooO00o;
        long j2 = (4294967295 << i4) & ((long) iArr2[i3]) & 4294967295L;
        iArr2[0] = (int) (((long) iArr2[0]) ^ (j2 >>> (32 - i5)));
        int i14 = i3 - i7;
        int i15 = i14 - 1;
        if (i15 >= 0) {
            iArr2[i15] = iArr2[i15] ^ ((int) (j2 << i8));
        }
        int[] iArr3 = this.f22759OooO00o;
        iArr3[i14] = (int) ((j2 >>> (32 - i8)) ^ ((long) iArr3[i14]));
        iArr3[i3] = iArr3[i3] & OooO0OO[i4];
        this.f22760OooO0O0 = ((i - 1) >>> 5) + 1;
        this.f22758OooO00o = i;
    }

    public void OooO00o(int i, int[] iArr) {
        C1IilLL r0 = this;
        int i2 = i >>> 5;
        int i3 = i & 31;
        int i4 = 32 - i3;
        int i5 = (i - iArr[0]) >>> 5;
        int i6 = 32 - ((i - iArr[0]) & 31);
        int i7 = (i - iArr[1]) >>> 5;
        int i8 = 32 - ((i - iArr[1]) & 31);
        int i9 = (i - iArr[2]) >>> 5;
        int i10 = 32 - ((i - iArr[2]) & 31);
        int i11 = ((i << 1) - 2) >>> 5;
        while (i11 > i2) {
            int[] iArr2 = r0.f22759OooO00o;
            long j = ((long) iArr2[i11]) & 4294967295L;
            int i12 = i11 - i2;
            int i13 = i12 - 1;
            iArr2[i13] = iArr2[i13] ^ ((int) (j << i4));
            iArr2[i12] = (int) (((long) iArr2[i12]) ^ (j >>> (32 - i4)));
            int i14 = i11 - i5;
            int i15 = i14 - 1;
            iArr2[i15] = iArr2[i15] ^ ((int) (j << i6));
            iArr2[i14] = (int) (((long) iArr2[i14]) ^ (j >>> (32 - i6)));
            int i16 = i11 - i7;
            int i17 = i16 - 1;
            iArr2[i17] = iArr2[i17] ^ ((int) (j << i8));
            iArr2[i16] = (int) (((long) iArr2[i16]) ^ (j >>> (32 - i8)));
            int i18 = i11 - i9;
            int i19 = i18 - 1;
            iArr2[i19] = iArr2[i19] ^ ((int) (j << i10));
            iArr2[i18] = (int) ((j >>> (32 - i10)) ^ ((long) iArr2[i18]));
            iArr2[i11] = 0;
            i11--;
            r0 = this;
            i2 = i2;
            i3 = i3;
        }
        int[] iArr3 = r0.f22759OooO00o;
        long j2 = ((long) iArr3[i2]) & 4294967295L & (4294967295 << i3);
        iArr3[0] = (int) ((j2 >>> (32 - i4)) ^ ((long) iArr3[0]));
        int i20 = i2 - i5;
        int i21 = i20 - 1;
        if (i21 >= 0) {
            iArr3[i21] = iArr3[i21] ^ ((int) (j2 << i6));
        }
        int[] iArr4 = this.f22759OooO00o;
        iArr4[i20] = (int) (((long) iArr4[i20]) ^ (j2 >>> (32 - i6)));
        int i22 = i2 - i7;
        int i23 = i22 - 1;
        if (i23 >= 0) {
            iArr4[i23] = iArr4[i23] ^ ((int) (j2 << i8));
        }
        int[] iArr5 = this.f22759OooO00o;
        iArr5[i22] = (int) (((long) iArr5[i22]) ^ (j2 >>> (32 - i8)));
        int i24 = i2 - i9;
        int i25 = i24 - 1;
        if (i25 >= 0) {
            iArr5[i25] = iArr5[i25] ^ ((int) (j2 << i10));
        }
        int[] iArr6 = this.f22759OooO00o;
        iArr6[i24] = (int) ((j2 >>> (32 - i10)) ^ ((long) iArr6[i24]));
        iArr6[i2] = iArr6[i2] & OooO0OO[i3];
        this.f22760OooO0O0 = ((i - 1) >>> 5) + 1;
        this.f22758OooO00o = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21279OooO00o(C1IilLL r2) {
        m21277OooO00o(r2.f22758OooO00o);
        m21292OooO0OO(r2);
    }

    public void OooO00o(C1IilLL r9, int i) {
        int i2;
        if (i == 0) {
            m21279OooO00o(r9);
            return;
        }
        m21277OooO00o(r9.f22758OooO00o + i);
        int i3 = i >>> 5;
        for (int i4 = r9.f22760OooO0O0 - 1; i4 >= 0; i4--) {
            int i5 = i4 + i3;
            int i6 = i5 + 1;
            if (i6 < this.f22760OooO0O0 && (i2 = i & 31) != 0) {
                int[] iArr = this.f22759OooO00o;
                iArr[i6] = (r9.f22759OooO00o[i4] >>> (32 - i2)) ^ iArr[i6];
            }
            int[] iArr2 = this.f22759OooO00o;
            iArr2[i5] = iArr2[i5] ^ (r9.f22759OooO00o[i4] << (i & 31));
        }
    }

    public void OooO00o(Random random) {
        for (int i = 0; i < this.f22760OooO0O0; i++) {
            this.f22759OooO00o[i] = random.nextInt();
        }
        OooOOO0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21280OooO00o() {
        if (m21293OooO0OO()) {
            return false;
        }
        C1IilLL r0 = new C1IilLL(this);
        r0.OooO0oO();
        int i = r0.f22758OooO00o;
        int i2 = i - 1;
        C1IilLL r4 = new C1IilLL(i, "X");
        for (int i3 = 1; i3 <= (i2 >> 1); i3++) {
            r4.OooOO0o();
            r4 = r4.OooO0o(r0);
            C1IilLL OooO00o2 = r4.OooO00o(new C1IilLL(32, "X"));
            if (OooO00o2.m21293OooO0OO() || !r0.OooO0O0(OooO00o2).m21289OooO0O0()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21281OooO00o(int i) {
        if (i < 0) {
            throw new RuntimeException();
        } else if (i > this.f22758OooO00o - 1) {
            return false;
        } else {
            return (OooO0O0[i & 31] & this.f22759OooO00o[i >>> 5]) != 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21282OooO00o(C1IilLL r6) throws RuntimeException {
        if (this.f22758OooO00o == r6.f22758OooO00o) {
            boolean z = false;
            for (int i = 0; i < this.f22760OooO0O0; i++) {
                int i2 = this.f22759OooO00o[i] & r6.f22759OooO00o[i];
                boolean[] zArr = f22757OooO00o;
                z = (((z ^ zArr[i2 & 255]) ^ zArr[(i2 >>> 8) & 255]) ^ zArr[(i2 >>> 16) & 255]) ^ zArr[(i2 >>> 24) & 255];
            }
            return z;
        }
        throw new RuntimeException();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21283OooO00o() {
        int i = ((this.f22758OooO00o - 1) >> 3) + 1;
        int i2 = i & 3;
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < (i >> 2); i3++) {
            int i4 = (i - (i3 << 2)) - 1;
            int[] iArr = this.f22759OooO00o;
            bArr[i4] = (byte) (255 & iArr[i3]);
            bArr[i4 - 1] = (byte) ((iArr[i3] & 65280) >>> 8);
            bArr[i4 - 2] = (byte) ((iArr[i3] & C7265o0O000oo.OooOo0O) >>> 16);
            bArr[i4 - 3] = (byte) ((iArr[i3] & -16777216) >>> 24);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i2 - i5) - 1) << 3;
            bArr[i5] = (byte) ((this.f22759OooO00o[this.f22760OooO0O0 - 1] & (255 << i6)) >>> i6);
        }
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m21284OooO00o() {
        int i = this.f22760OooO0O0;
        int[] iArr = new int[i];
        System.arraycopy(this.f22759OooO00o, 0, iArr, 0, i);
        return iArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1IilLL[] m21285OooO00o(C1IilLL r8) throws RuntimeException {
        C1IilLL[] r0 = new C1IilLL[2];
        C1IilLL r1 = new C1IilLL(this.f22758OooO00o);
        C1IilLL r2 = new C1IilLL(this);
        C1IilLL r3 = new C1IilLL(r8);
        if (!r3.m21293OooO0OO()) {
            r2.OooO0oO();
            r3.OooO0oO();
            int i = r2.f22758OooO00o;
            int i2 = r3.f22758OooO00o;
            if (i < i2) {
                r0[0] = new C1IilLL(0);
                r0[1] = r2;
                return r0;
            }
            int i3 = i - i2;
            r1.m21277OooO00o(i3 + 1);
            while (i3 >= 0) {
                r2.m21288OooO0O0(r3.m21273OooO00o(i3));
                r2.OooO0oO();
                r1.OooO0Oo(i3);
                i3 = r2.f22758OooO00o - r3.f22758OooO00o;
            }
            r0[0] = r1;
            r0[1] = r2;
            return r0;
        }
        throw new RuntimeException();
    }

    public C1IilLL OooO0O0() {
        C1IilLL r0 = new C1IilLL(this.f22758OooO00o + 1, this.f22759OooO00o);
        for (int i = r0.f22760OooO0O0 - 1; i >= 1; i--) {
            int[] iArr = r0.f22759OooO00o;
            iArr[i] = iArr[i] << 1;
            iArr[i] = iArr[i] | (iArr[i - 1] >>> 31);
        }
        int[] iArr2 = r0.f22759OooO00o;
        iArr2[0] = iArr2[0] << 1;
        return r0;
    }

    public C1IilLL OooO0O0(C1IilLL r4) throws RuntimeException {
        if (m21293OooO0OO() && r4.m21293OooO0OO()) {
            throw new ArithmeticException("Both operands of gcd equal zero.");
        } else if (m21293OooO0OO()) {
            return new C1IilLL(r4);
        } else {
            if (r4.m21293OooO0OO()) {
                return new C1IilLL(this);
            }
            C1IilLL r0 = new C1IilLL(this);
            C1IilLL r1 = new C1IilLL(r4);
            C1IilLL r42 = r0;
            C1IilLL r02 = r1;
            while (!r02.m21293OooO0OO()) {
                r02 = r42.OooO0o(r02);
                r42 = r02;
            }
            return r42;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m21286OooO0O0() {
        for (int i = 1; i < this.f22760OooO0O0; i++) {
            this.f22759OooO00o[i] = 0;
        }
        this.f22759OooO00o[0] = 1;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m21287OooO0O0(int i) throws RuntimeException {
        if (i < 0) {
            throw new RuntimeException();
        } else if (i <= this.f22758OooO00o - 1) {
            int[] iArr = this.f22759OooO00o;
            int i2 = i >>> 5;
            iArr[i2] = (OooO0O0[i & 31] ^ -1) & iArr[i2];
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m21288OooO0O0(C1IilLL r2) {
        m21277OooO00o(r2.f22758OooO00o);
        m21292OooO0OO(r2);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21289OooO0O0() {
        for (int i = 1; i < this.f22760OooO0O0; i++) {
            if (this.f22759OooO00o[i] != 0) {
                return false;
            }
        }
        return this.f22759OooO00o[0] == 1;
    }

    public C1IilLL OooO0OO() {
        int i;
        C1IilLL r0 = new C1IilLL(this.f22758OooO00o - 1);
        int i2 = 0;
        System.arraycopy(this.f22759OooO00o, 0, r0.f22759OooO00o, 0, r0.f22760OooO0O0);
        while (true) {
            i = r0.f22760OooO0O0;
            if (i2 > i - 2) {
                break;
            }
            int[] iArr = r0.f22759OooO00o;
            iArr[i2] = iArr[i2] >>> 1;
            int i3 = i2 + 1;
            iArr[i2] = iArr[i2] | (iArr[i3] << 31);
            i2 = i3;
        }
        int[] iArr2 = r0.f22759OooO00o;
        int i4 = i - 1;
        iArr2[i4] = iArr2[i4] >>> 1;
        if (i < this.f22760OooO0O0) {
            int i5 = i - 1;
            iArr2[i5] = (this.f22759OooO00o[i] << 31) | iArr2[i5];
        }
        return r0;
    }

    public C1IilLL OooO0OO(C1IilLL r3) {
        int max = Math.max(this.f22758OooO00o, r3.f22758OooO00o);
        m21277OooO00o(max);
        r3.m21277OooO00o(max);
        return OooO(r3);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m21290OooO0OO() {
        for (int i = 1; i < this.f22760OooO0O0; i++) {
            this.f22759OooO00o[i] = 0;
        }
        this.f22759OooO00o[0] = 2;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m21291OooO0OO(int i) throws RuntimeException {
        if (i < 0 || i > this.f22758OooO00o - 1) {
            throw new RuntimeException();
        }
        int[] iArr = this.f22759OooO00o;
        int i2 = i >>> 5;
        iArr[i2] = OooO0O0[i & 31] | iArr[i2];
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m21292OooO0OO(C1IilLL r5) {
        for (int i = 0; i < Math.min(this.f22760OooO0O0, r5.f22760OooO0O0); i++) {
            int[] iArr = this.f22759OooO00o;
            iArr[i] = iArr[i] ^ r5.f22759OooO00o[i];
        }
        OooOOO0();
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21293OooO0OO() {
        if (this.f22758OooO00o == 0) {
            return true;
        }
        for (int i = 0; i < this.f22760OooO0O0; i++) {
            if (this.f22759OooO00o[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public C1IilLL OooO0Oo(C1IilLL r9) {
        C1IilLL r0 = new C1IilLL(Math.max(this.f22758OooO00o, r9.f22758OooO00o) << 1);
        C1IilLL[] r1 = new C1IilLL[32];
        r1[0] = new C1IilLL(this);
        for (int i = 1; i <= 31; i++) {
            r1[i] = r1[i - 1].OooO0O0();
        }
        for (int i2 = 0; i2 < r9.f22760OooO0O0; i2++) {
            for (int i3 = 0; i3 <= 31; i3++) {
                if ((r9.f22759OooO00o[i2] & OooO0O0[i3]) != 0) {
                    r0.m21292OooO0OO(r1[i3]);
                }
            }
            for (int i4 = 0; i4 <= 31; i4++) {
                r1[i4].OooO0oo();
            }
        }
        return r0;
    }

    public void OooO0Oo() {
        for (int i = 0; i < this.f22760OooO0O0; i++) {
            this.f22759OooO00o[i] = 0;
        }
    }

    public void OooO0Oo(int i) throws RuntimeException {
        if (i < 0 || i > this.f22758OooO00o - 1) {
            throw new RuntimeException();
        }
        int[] iArr = this.f22759OooO00o;
        int i2 = i >>> 5;
        iArr[i2] = OooO0O0[i & 31] ^ iArr[i2];
    }

    public C1IilLL OooO0o(C1IilLL r4) throws RuntimeException {
        C1IilLL r0 = new C1IilLL(this);
        C1IilLL r1 = new C1IilLL(r4);
        if (!r1.m21293OooO0OO()) {
            r0.OooO0oO();
            r1.OooO0oO();
            int i = r0.f22758OooO00o;
            int i2 = r1.f22758OooO00o;
            if (i < i2) {
                return r0;
            }
            while (true) {
                int i3 = i - i2;
                if (i3 < 0) {
                    return r0;
                }
                r0.m21288OooO0O0(r1.m21273OooO00o(i3));
                r0.OooO0oO();
                i = r0.f22758OooO00o;
                i2 = r1.f22758OooO00o;
            }
        } else {
            throw new RuntimeException();
        }
    }

    public void OooO0o() {
        for (int i = 0; i < this.f22760OooO0O0; i++) {
            this.f22759OooO00o[i] = OooO00o.nextInt();
        }
        OooOOO0();
    }

    public C1IilLL OooO0o0(C1IilLL r5) throws RuntimeException {
        C1IilLL r0 = new C1IilLL(this.f22758OooO00o);
        C1IilLL r1 = new C1IilLL(this);
        C1IilLL r2 = new C1IilLL(r5);
        if (!r2.m21293OooO0OO()) {
            r1.OooO0oO();
            r2.OooO0oO();
            int i = r1.f22758OooO00o;
            int i2 = r2.f22758OooO00o;
            if (i < i2) {
                return new C1IilLL(0);
            }
            int i3 = i - i2;
            r0.m21277OooO00o(i3 + 1);
            while (i3 >= 0) {
                r1.m21288OooO0O0(r2.m21273OooO00o(i3));
                r1.OooO0oO();
                r0.OooO0Oo(i3);
                i3 = r1.f22758OooO00o - r2.f22758OooO00o;
            }
            return r0;
        }
        throw new RuntimeException();
    }

    public void OooO0o0() {
        OooO0Oo(0);
    }

    public C1IilLL OooO0oO(C1IilLL r1) {
        return OooO0oo(r1);
    }

    public void OooO0oO() {
        int i = this.f22760OooO0O0;
        while (true) {
            i--;
            if (this.f22759OooO00o[i] != 0 || i <= 0) {
                int i2 = this.f22759OooO00o[i];
                int i3 = 0;
            }
        }
        int i22 = this.f22759OooO00o[i];
        int i32 = 0;
        while (i22 != 0) {
            i22 >>>= 1;
            i32++;
        }
        this.f22758OooO00o = (i << 5) + i32;
        this.f22760OooO0O0 = i + 1;
    }

    public C1IilLL OooO0oo(C1IilLL r7) {
        C1IilLL r1;
        int min = Math.min(this.f22760OooO0O0, r7.f22760OooO0O0);
        int i = 0;
        if (this.f22758OooO00o >= r7.f22758OooO00o) {
            r1 = new C1IilLL(this);
            while (i < min) {
                int[] iArr = r1.f22759OooO00o;
                iArr[i] = iArr[i] ^ r7.f22759OooO00o[i];
                i++;
            }
        } else {
            r1 = new C1IilLL(r7);
            while (i < min) {
                int[] iArr2 = r1.f22759OooO00o;
                iArr2[i] = iArr2[i] ^ this.f22759OooO00o[i];
                i++;
            }
        }
        r1.OooOOO0();
        return r1;
    }

    public void OooO0oo() {
        int i = this.f22760OooO0O0 + 1;
        this.f22760OooO0O0 = i;
        this.f22758OooO00o += 32;
        int[] iArr = this.f22759OooO00o;
        if (i <= iArr.length) {
            for (int i2 = i - 1; i2 >= 1; i2--) {
                int[] iArr2 = this.f22759OooO00o;
                iArr2[i2] = iArr2[i2 - 1];
            }
            this.f22759OooO00o[0] = 0;
            return;
        }
        int[] iArr3 = new int[i];
        System.arraycopy(iArr, 0, iArr3, 1, i - 1);
        this.f22759OooO00o = null;
        this.f22759OooO00o = iArr3;
    }

    public void OooOO0() {
        int i;
        int i2 = this.f22758OooO00o - 1;
        this.f22758OooO00o = i2;
        this.f22760OooO0O0 = ((i2 - 1) >>> 5) + 1;
        int i3 = 0;
        while (true) {
            i = this.f22760OooO0O0;
            if (i3 > i - 2) {
                break;
            }
            int[] iArr = this.f22759OooO00o;
            iArr[i3] = iArr[i3] >>> 1;
            int i4 = i3 + 1;
            iArr[i3] = iArr[i3] | (iArr[i4] << 31);
            i3 = i4;
        }
        int[] iArr2 = this.f22759OooO00o;
        int i5 = i - 1;
        iArr2[i5] = iArr2[i5] >>> 1;
        if ((this.f22758OooO00o & 31) == 0) {
            int i6 = i - 1;
            iArr2[i6] = (iArr2[i] << 31) | iArr2[i6];
        }
    }

    public void OooOO0O() {
        if (!m21293OooO0OO()) {
            int i = this.f22760OooO0O0;
            int i2 = i << 1;
            int[] iArr = new int[i2];
            for (int i3 = i - 1; i3 >= 0; i3--) {
                int i4 = this.f22759OooO00o[i3];
                int i5 = 1;
                for (int i6 = 0; i6 < 16; i6++) {
                    if ((i4 & 1) != 0) {
                        int i7 = i3 << 1;
                        iArr[i7] = iArr[i7] | i5;
                    }
                    if ((65536 & i4) != 0) {
                        int i8 = (i3 << 1) + 1;
                        iArr[i8] = iArr[i8] | i5;
                    }
                    i5 <<= 2;
                    i4 >>>= 1;
                }
            }
            this.f22759OooO00o = null;
            this.f22759OooO00o = iArr;
            this.f22760OooO0O0 = i2;
            this.f22758OooO00o = (this.f22758OooO00o << 1) - 1;
        }
    }

    public void OooOO0o() {
        int i;
        int i2;
        if (!m21293OooO0OO()) {
            int length = this.f22759OooO00o.length;
            int i3 = this.f22760OooO0O0;
            if (length >= (i3 << 1)) {
                for (int i4 = i3 - 1; i4 >= 0; i4--) {
                    int[] iArr = this.f22759OooO00o;
                    int i5 = i4 << 1;
                    short[] sArr = f22756OooO00o;
                    iArr[i5 + 1] = sArr[(iArr[i4] & C7265o0O000oo.OooOo0O) >>> 16] | (sArr[(iArr[i4] & -16777216) >>> 24] << 16);
                    iArr[i5] = sArr[iArr[i4] & 255] | (sArr[(iArr[i4] & 65280) >>> 8] << 16);
                }
                i = this.f22760OooO0O0 << 1;
            } else {
                int[] iArr2 = new int[(i3 << 1)];
                int i6 = 0;
                while (true) {
                    i2 = this.f22760OooO0O0;
                    if (i6 >= i2) {
                        break;
                    }
                    int i7 = i6 << 1;
                    short[] sArr2 = f22756OooO00o;
                    int[] iArr3 = this.f22759OooO00o;
                    iArr2[i7] = sArr2[iArr3[i6] & 255] | (sArr2[(iArr3[i6] & 65280) >>> 8] << 16);
                    iArr2[i7 + 1] = (sArr2[(iArr3[i6] & -16777216) >>> 24] << 16) | sArr2[(iArr3[i6] & C7265o0O000oo.OooOo0O) >>> 16];
                    i6++;
                }
                this.f22759OooO00o = null;
                this.f22759OooO00o = iArr2;
                i = i2 << 1;
            }
            this.f22760OooO0O0 = i;
            this.f22758OooO00o = (this.f22758OooO00o << 1) - 1;
        }
    }

    public Object clone() {
        return new C1IilLL(this);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1IilLL)) {
            return false;
        }
        C1IilLL r5 = (C1IilLL) obj;
        if (this.f22758OooO00o != r5.f22758OooO00o) {
            return false;
        }
        for (int i = 0; i < this.f22760OooO0O0; i++) {
            if (this.f22759OooO00o[i] != r5.f22759OooO00o[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f22758OooO00o + this.f22759OooO00o.hashCode();
    }
}
