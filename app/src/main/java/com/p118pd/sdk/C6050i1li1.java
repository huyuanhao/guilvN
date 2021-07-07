package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.i1li丨1  reason: invalid class name and case insensitive filesystem */
public class C6050i1li1 implements AbstractC6290ii {
    public AbstractC9677lI1li OooO00o = C5725Liill.OooO00o;

    /* renamed from: com.pd.sdk.i1li丨1$OooO00o */
    public class OooO00o implements I111LIL {
        public final /* synthetic */ OooO0O0 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f17448OooO00o;

        public OooO00o(C6456l1ilL r2, OooO0O0 oooO0O0) {
            this.f17448OooO00o = r2;
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
        public C6456l1ilL OooO00o() {
            return this.f17448OooO00o;
        }

        @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m16912OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m16913OooO00o() {
            return this.OooO00o.OooO0O0();
        }
    }

    /* renamed from: com.pd.sdk.i1li丨1$OooO0O0 */
    public class OooO0O0 extends OutputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC6436l11LI f17449OooO00o;

        public OooO0O0(AbstractC6436l11LI r2) {
            this.f17449OooO00o = r2;
        }

        public byte[] OooO0O0() {
            byte[] bArr = new byte[this.f17449OooO00o.OooO0O0()];
            this.f17449OooO00o.OooO00o(bArr, 0);
            return bArr;
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f17449OooO00o.update((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f17449OooO00o.update(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f17449OooO00o.update(bArr, i, i2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6290ii
    public I111LIL OooO00o(C6456l1ilL r3) throws OperatorCreationException {
        return new OooO00o(r3, new OooO0O0(this.OooO00o.OooO00o(r3)));
    }
}
