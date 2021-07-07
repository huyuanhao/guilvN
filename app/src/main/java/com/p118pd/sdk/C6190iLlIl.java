package com.p118pd.sdk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.XMSSNode;

/* renamed from: com.pd.sdk.iLlIl  reason: case insensitive filesystem */
public class C6190iLlIl implements AbstractC6433il1 {
    public final I1LLIII OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9341I1iilI1 f17776OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<XMSSNode> f17777OooO00o;

    /* renamed from: com.pd.sdk.iLlIl$OooO00o */
    public static class OooO00o {
        public I1LLIII OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9341I1iilI1 f17778OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<XMSSNode> f17779OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f17780OooO00o = null;

        public OooO00o(C9341I1iilI1 r2) {
            this.f17778OooO00o = r2;
        }

        public OooO00o OooO00o(I1LLIII r1) {
            this.OooO00o = r1;
            return this;
        }

        public OooO00o OooO00o(List<XMSSNode> list) {
            this.f17779OooO00o = list;
            return this;
        }

        public OooO00o OooO00o(byte[] bArr) {
            this.f17780OooO00o = C5532IiIllL.OooO00o(bArr);
            return this;
        }

        public C6190iLlIl OooO00o() {
            return new C6190iLlIl(this);
        }
    }

    public C6190iLlIl(OooO00o oooO00o) {
        List<XMSSNode> list;
        C9341I1iilI1 r0 = oooO00o.f17778OooO00o;
        this.f17776OooO00o = r0;
        if (r0 != null) {
            int OooO00o2 = r0.OooO00o();
            int OooO0O0 = this.f17776OooO00o.m21385OooO00o().m15837OooO00o().OooO0O0();
            int OooO0O02 = this.f17776OooO00o.OooO0O0();
            byte[] bArr = oooO00o.f17780OooO00o;
            if (bArr != null) {
                if (bArr.length == (OooO0O0 * OooO00o2) + (OooO0O02 * OooO00o2)) {
                    byte[][] bArr2 = new byte[OooO0O0][];
                    int i = 0;
                    for (int i2 = 0; i2 < OooO0O0; i2++) {
                        bArr2[i2] = C5532IiIllL.m15807OooO00o(bArr, i, OooO00o2);
                        i += OooO00o2;
                    }
                    this.OooO00o = new I1LLIII(this.f17776OooO00o.m21385OooO00o().m15837OooO00o(), bArr2);
                    list = new ArrayList<>();
                    for (int i3 = 0; i3 < OooO0O02; i3++) {
                        list.add(new XMSSNode(i3, C5532IiIllL.m15807OooO00o(bArr, i, OooO00o2)));
                        i += OooO00o2;
                    }
                } else {
                    throw new IllegalArgumentException("signature has wrong size");
                }
            } else {
                I1LLIII r3 = oooO00o.OooO00o;
                if (r3 == null) {
                    C6578lLILi OooO00o3 = this.f17776OooO00o.m21385OooO00o().m15837OooO00o();
                    int[] iArr = new int[2];
                    iArr[1] = OooO00o2;
                    iArr[0] = OooO0O0;
                    r3 = new I1LLIII(OooO00o3, (byte[][]) Array.newInstance(byte.class, iArr));
                }
                this.OooO00o = r3;
                list = oooO00o.f17779OooO00o;
                if (list == null) {
                    list = new ArrayList<>();
                } else if (list.size() != OooO0O02) {
                    throw new IllegalArgumentException("size of authPath needs to be equal to height of tree");
                }
            }
            this.f17777OooO00o = list;
            return;
        }
        throw new NullPointerException("params == null");
    }

    @Override // com.p118pd.sdk.AbstractC6433il1
    public I1LLIII OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9341I1iilI1 m17157OooO00o() {
        return this.f17776OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<XMSSNode> m17158OooO00o() {
        return this.f17777OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6433il1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17159OooO00o() {
        byte[][] OooO00o2;
        int OooO00o3 = this.f17776OooO00o.OooO00o();
        byte[] bArr = new byte[((this.f17776OooO00o.m21385OooO00o().m15837OooO00o().OooO0O0() * OooO00o3) + (this.f17776OooO00o.OooO0O0() * OooO00o3))];
        int i = 0;
        for (byte[] bArr2 : this.OooO00o.OooO00o()) {
            C5532IiIllL.OooO00o(bArr, bArr2, i);
            i += OooO00o3;
        }
        for (int i2 = 0; i2 < this.f17777OooO00o.size(); i2++) {
            C5532IiIllL.OooO00o(bArr, this.f17777OooO00o.get(i2).getValue(), i);
            i += OooO00o3;
        }
        return bArr;
    }
}
