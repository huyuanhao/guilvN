package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.l1LLi  reason: case insensitive filesystem */
public class C6450l1LLi {
    public static final int OooO00o = 32;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f18273OooO00o = false;
    public static final int OooO0O0 = 1024;
    public static final int OooO0OO = 1824;
    public static final int OooO0Oo = 2048;

    public static void OooO00o(SecureRandom secureRandom, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[1024];
        byte[] bArr4 = new byte[32];
        OooO00o(sArr, bArr4, bArr3);
        short[] sArr2 = new short[1024];
        OooO00o(sArr2, bArr4);
        byte[] bArr5 = new byte[32];
        secureRandom.nextBytes(bArr5);
        short[] sArr3 = new short[1024];
        C5535IiLlI.OooO00o(sArr3, bArr5, (byte) 0);
        C5535IiLlI.OooO0O0(sArr3);
        short[] sArr4 = new short[1024];
        C5535IiLlI.OooO00o(sArr4, bArr5, (byte) 1);
        C5535IiLlI.OooO0O0(sArr4);
        short[] sArr5 = new short[1024];
        C5535IiLlI.OooO0O0(sArr2, sArr3, sArr5);
        C5535IiLlI.OooO00o(sArr5, sArr4, sArr5);
        short[] sArr6 = new short[1024];
        C5535IiLlI.OooO0O0(sArr, sArr3, sArr6);
        C5535IiLlI.OooO00o(sArr6);
        short[] sArr7 = new short[1024];
        C5535IiLlI.OooO00o(sArr7, bArr5, (byte) 2);
        C5535IiLlI.OooO00o(sArr6, sArr7, sArr6);
        short[] sArr8 = new short[1024];
        C6279iillli.OooO00o(sArr8, sArr6, bArr5, (byte) 3);
        OooO00o(bArr2, sArr5, sArr8);
        C6279iillli.OooO00o(bArr, sArr6, sArr8);
        OooO00o(bArr);
    }

    public static void OooO00o(SecureRandom secureRandom, byte[] bArr, short[] sArr) {
        byte[] bArr2 = new byte[32];
        secureRandom.nextBytes(bArr2);
        OooO00o(bArr2);
        short[] sArr2 = new short[1024];
        OooO00o(sArr2, bArr2);
        byte[] bArr3 = new byte[32];
        secureRandom.nextBytes(bArr3);
        C5535IiLlI.OooO00o(sArr, bArr3, (byte) 0);
        C5535IiLlI.OooO0O0(sArr);
        short[] sArr3 = new short[1024];
        C5535IiLlI.OooO00o(sArr3, bArr3, (byte) 1);
        C5535IiLlI.OooO0O0(sArr3);
        short[] sArr4 = new short[1024];
        C5535IiLlI.OooO0O0(sArr2, sArr, sArr4);
        short[] sArr5 = new short[1024];
        C5535IiLlI.OooO00o(sArr4, sArr3, sArr5);
        OooO00o(bArr, sArr5, bArr2);
    }

    public static void OooO00o(byte[] bArr) {
        C6249iiLi iili = new C6249iiLi(256);
        iili.update(bArr, 0, 32);
        iili.OooO00o(bArr, 0);
    }

    public static void OooO00o(byte[] bArr, short[] sArr, byte[] bArr2) {
        C5535IiLlI.OooO00o(bArr, sArr);
        System.arraycopy(bArr2, 0, bArr, 1792, 32);
    }

    public static void OooO00o(byte[] bArr, short[] sArr, short[] sArr2) {
        C5535IiLlI.OooO00o(bArr, sArr);
        for (int i = 0; i < 256; i++) {
            int i2 = i * 4;
            bArr[i + 1792] = (byte) ((sArr2[i2 + 3] << 6) | sArr2[i2] | (sArr2[i2 + 1] << 2) | (sArr2[i2 + 2] << 4));
        }
    }

    public static void OooO00o(short[] sArr, byte[] bArr) {
        C5535IiLlI.OooO0O0(sArr, bArr);
    }

    public static void OooO00o(short[] sArr, byte[] bArr, byte[] bArr2) {
        C5535IiLlI.OooO00o(sArr, bArr2);
        System.arraycopy(bArr2, 1792, bArr, 0, 32);
    }

    public static void OooO00o(short[] sArr, short[] sArr2, byte[] bArr) {
        C5535IiLlI.OooO00o(sArr, bArr);
        for (int i = 0; i < 256; i++) {
            int i2 = i * 4;
            int i3 = bArr[i + 1792] & 255;
            sArr2[i2 + 0] = (short) (i3 & 3);
            sArr2[i2 + 1] = (short) ((i3 >>> 2) & 3);
            sArr2[i2 + 2] = (short) ((i3 >>> 4) & 3);
            sArr2[i2 + 3] = (short) (i3 >>> 6);
        }
    }

    public static void OooO0O0(byte[] bArr, short[] sArr, byte[] bArr2) {
        short[] sArr2 = new short[1024];
        short[] sArr3 = new short[1024];
        OooO00o(sArr2, sArr3, bArr2);
        short[] sArr4 = new short[1024];
        C5535IiLlI.OooO0O0(sArr, sArr2, sArr4);
        C5535IiLlI.OooO00o(sArr4);
        C6279iillli.OooO00o(bArr, sArr4, sArr3);
        OooO00o(bArr);
    }
}
