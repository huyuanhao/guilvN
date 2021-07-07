package com.xiaomi.push.service;

import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4282bc;

/* renamed from: com.xiaomi.push.service.av */
public class C4628av {

    /* renamed from: a */
    public static int f13254a = 8;

    /* renamed from: a */
    public byte[] f13255a = new byte[256];

    /* renamed from: b */
    public int f13256b = 0;

    /* renamed from: c */
    public int f13257c = 0;

    /* renamed from: d */
    public int f13258d = -666;

    /* renamed from: a */
    public static int m13999a(byte b) {
        return b >= 0 ? b : b + 256;
    }

    /* renamed from: a */
    private void mo42689a() {
        this.f13257c = 0;
        this.f13256b = 0;
    }

    /* renamed from: a */
    private void m14001a(int i, byte[] bArr, boolean z) {
        int length = bArr.length;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f13255a[i2] = (byte) i2;
        }
        this.f13257c = 0;
        this.f13256b = 0;
        while (true) {
            int i3 = this.f13256b;
            if (i3 >= i) {
                break;
            }
            int a = ((this.f13257c + m13999a(this.f13255a[i3])) + m13999a(bArr[this.f13256b % length])) % 256;
            this.f13257c = a;
            m14003a(this.f13255a, this.f13256b, a);
            this.f13256b++;
        }
        if (i != 256) {
            this.f13258d = ((this.f13257c + m13999a(this.f13255a[i])) + m13999a(bArr[i % length])) % 256;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("S_");
            int i4 = i - 1;
            sb.append(i4);
            sb.append(Constants.COLON_SEPARATOR);
            for (int i5 = 0; i5 <= i; i5++) {
                sb.append(" ");
                sb.append(m13999a(this.f13255a[i5]));
            }
            sb.append("   j_");
            sb.append(i4);
            sb.append(C8932ooOOO0o.OooO0Oo);
            sb.append(this.f13257c);
            sb.append("   j_");
            sb.append(i);
            sb.append(C8932ooOOO0o.OooO0Oo);
            sb.append(this.f13258d);
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i4);
            sb.append("]=");
            sb.append(m13999a(this.f13255a[this.f13257c]));
            sb.append("   S_");
            sb.append(i4);
            sb.append("[j_");
            sb.append(i);
            sb.append("]=");
            sb.append(m13999a(this.f13255a[this.f13258d]));
            if (this.f13255a[1] != 0) {
                sb.append("   S[1]!=0");
            }
            AbstractC4163b.m11301a(sb.toString());
        }
    }

    /* renamed from: a */
    private void m14002a(byte[] bArr) {
        m14001a(256, bArr, false);
    }

    /* renamed from: a */
    public static void m14003a(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    /* renamed from: a */
    public static byte[] m14004a(String str, String str2) {
        byte[] a = C4282bc.m11788a(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[(a.length + 1 + bytes.length)];
        for (int i = 0; i < a.length; i++) {
            bArr[i] = a[i];
        }
        bArr[a.length] = 95;
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[a.length + 1 + i2] = bytes[i2];
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m14005a(byte[] bArr, String str) {
        return m14006a(bArr, C4282bc.m11788a(str));
    }

    /* renamed from: a */
    public static byte[] m14006a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        C4628av avVar = new C4628av();
        avVar.m14002a(bArr);
        avVar.mo42689a();
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr2[i] ^ avVar.m14008a());
        }
        return bArr3;
    }

    /* renamed from: a */
    public static byte[] m14007a(byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
        byte[] bArr3;
        int i3;
        if (i < 0 || i > bArr2.length || i + i2 > bArr2.length) {
            throw new IllegalArgumentException("start = " + i + " len = " + i2);
        }
        if (!z) {
            bArr3 = new byte[i2];
            i3 = 0;
        } else {
            bArr3 = bArr2;
            i3 = i;
        }
        C4628av avVar = new C4628av();
        avVar.m14002a(bArr);
        avVar.mo42689a();
        for (int i4 = 0; i4 < i2; i4++) {
            bArr3[i3 + i4] = (byte) (bArr2[i + i4] ^ avVar.m14008a());
        }
        return bArr3;
    }

    /* renamed from: a */
    public byte m14008a() {
        int i = (this.f13256b + 1) % 256;
        this.f13256b = i;
        int a = (this.f13257c + m13999a(this.f13255a[i])) % 256;
        this.f13257c = a;
        m14003a(this.f13255a, this.f13256b, a);
        byte[] bArr = this.f13255a;
        return bArr[(m13999a(bArr[this.f13256b]) + m13999a(this.f13255a[this.f13257c])) % 256];
    }
}
