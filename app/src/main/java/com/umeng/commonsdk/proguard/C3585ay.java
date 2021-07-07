package com.umeng.commonsdk.proguard;

import java.util.BitSet;

/* renamed from: com.umeng.commonsdk.proguard.ay */
public final class C3585ay extends C3571am {

    /* renamed from: com.umeng.commonsdk.proguard.ay$a */
    public static class C3586a implements AbstractC3581au {
        @Override // com.umeng.commonsdk.proguard.AbstractC3581au
        /* renamed from: a */
        public AbstractC3579as mo38950a(AbstractC3597bg bgVar) {
            return new C3585ay(bgVar);
        }
    }

    public C3585ay(AbstractC3597bg bgVar) {
        super(bgVar);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3579as
    /* renamed from: D */
    public Class<? extends AbstractC3591ba> mo38959D() {
        return AbstractC3594bd.class;
    }

    /* renamed from: a */
    public void mo38961a(BitSet bitSet, int i) throws C3636z {
        for (byte b : m9434b(bitSet, i)) {
            mo38908a(b);
        }
    }

    /* renamed from: b */
    public BitSet mo38962b(int i) throws C3636z {
        double d = (double) i;
        Double.isNaN(d);
        int ceil = (int) Math.ceil(d / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i2 = 0; i2 < ceil; i2++) {
            bArr[i2] = mo38944u();
        }
        return m9433a(bArr);
    }

    /* renamed from: a */
    public static BitSet m9433a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i = 0; i < bArr.length * 8; i++) {
            if ((bArr[(bArr.length - (i / 8)) - 1] & (1 << (i % 8))) > 0) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /* renamed from: b */
    public static byte[] m9434b(BitSet bitSet, int i) {
        double d = (double) i;
        Double.isNaN(d);
        int ceil = (int) Math.ceil(d / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i2 = 0; i2 < bitSet.length(); i2++) {
            if (bitSet.get(i2)) {
                int i3 = (ceil - (i2 / 8)) - 1;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        return bArr;
    }
}
