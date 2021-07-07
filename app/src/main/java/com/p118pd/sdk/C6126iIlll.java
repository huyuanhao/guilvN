package com.p118pd.sdk;

import com.p118pd.sdk.C6561lL1lL;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.iIlll  reason: case insensitive filesystem */
public class C6126iIlll extends C6097iILii {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IiLl11i f17597OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6065i1lL f17598OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f17599OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6741ll1l f17600OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9731lL1 f17601OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17602OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17603OooO00o;
    public C9731lL1 OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17604OooO0O0;

    /* renamed from: com.pd.sdk.iIlll$OooO00o */
    public class OooO00o implements AbstractC6646liI11LlI {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC6646liI11LlI
        public I11L OooO00o() {
            try {
                return C6126iIlll.this.OooO00o();
            } catch (IOException unused) {
                throw new IllegalStateException("can't parse authenticated attributes!");
            }
        }
    }

    public C6126iIlll(InputStream inputStream) throws CMSException, IOException {
        this(inputStream, (AbstractC6290ii) null);
    }

    public C6126iIlll(InputStream inputStream, AbstractC6290ii r6) throws CMSException, IOException {
        super(inputStream);
        this.f17602OooO00o = true;
        C6741ll1l ll1l = new C6741ll1l((AbstractC9685lL) ((C6097iILii) this).OooO00o.OooO00o(16));
        this.f17600OooO00o = ll1l;
        C1ILLL1 OooO00o2 = ll1l.m17832OooO00o();
        if (OooO00o2 != null) {
            this.f17598OooO00o = new C6065i1lL(OooO00o2);
        }
        I11L OooO00o3 = I11L.OooO00o((Object) this.f17600OooO00o.m17834OooO0O0().OooO0O0());
        this.f17599OooO00o = this.f17600OooO00o.m17833OooO0O0();
        C6456l1ilL OooO00o4 = this.f17600OooO00o.m17828OooO00o();
        if (OooO00o4 == null) {
            this.f17597OooO00o = C6561lL1lL.OooO00o(OooO00o3, this.f17599OooO00o, new C6561lL1lL.OooO00o(this.f17599OooO00o, new L11LI(((AbstractC6541lIlii) this.f17600OooO00o.OooO0O0().OooO00o(4)).OooO00o())));
        } else if (r6 != null) {
            try {
                this.f17597OooO00o = C6561lL1lL.OooO00o(OooO00o3, this.f17599OooO00o, new C6561lL1lL.OooO0O0(r6.OooO00o(OooO00o4), new L11LI(((AbstractC6541lIlii) this.f17600OooO00o.OooO0O0().OooO00o(4)).OooO00o())), new OooO00o());
            } catch (OperatorCreationException e) {
                throw new CMSException("unable to create digest calculator: " + e.getMessage(), e);
            }
        } else {
            throw new CMSException("a digest calculator provider is required if authenticated attributes are present");
        }
    }

    public C6126iIlll(byte[] bArr) throws CMSException, IOException {
        this(new ByteArrayInputStream(bArr));
    }

    public C6126iIlll(byte[] bArr, AbstractC6290ii r3) throws CMSException, IOException {
        this(new ByteArrayInputStream(bArr), r3);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @Override // com.p118pd.sdk.C6097iILii
    private I11L OooO00o() throws IOException {
        if (this.f17601OooO00o == null && this.f17602OooO00o) {
            AbstractC6796llliI OooO00o2 = this.f17600OooO00o.m17830OooO00o();
            if (OooO00o2 != null) {
                this.OooO00o = (I11L) OooO00o2.OooO0O0();
            }
            this.f17602OooO00o = false;
        }
        return this.OooO00o;
    }

    private byte[] OooO00o(AbstractC6854lLi1LL r1) throws IOException {
        if (r1 != null) {
            return r1.OooO0O0().getEncoded();
        }
        return null;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public IiLl11i m17021OooO00o() {
        return this.f17597OooO00o;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6065i1lL m17022OooO00o() {
        return this.f17598OooO00o;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17023OooO00o() {
        return this.f17599OooO00o;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9731lL1 m17024OooO00o() throws IOException {
        I11L OooO00o2;
        if (this.f17601OooO00o == null && this.f17602OooO00o && (OooO00o2 = OooO00o()) != null) {
            this.f17601OooO00o = new C9731lL1(OooO00o2);
        }
        return this.f17601OooO00o;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17025OooO00o() {
        return this.f17599OooO00o.OooO00o().toString();
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17026OooO00o() {
        C9731lL1 r0 = this.f17601OooO00o;
        if (r0 != null) {
            return AbstractC6804llL1ii.OooO00o(r0.m21787OooO00o(AbstractC6651liIi.OooO0O0).OooO00o().OooO00o(0)).m17938OooO00o();
        }
        return null;
    }

    public C9731lL1 OooO0O0() throws IOException {
        if (this.OooO0O0 == null && this.f17604OooO0O0) {
            AbstractC6796llliI OooO0OO = this.f17600OooO00o.OooO0OO();
            this.f17604OooO0O0 = false;
            if (OooO0OO != null) {
                iILLL1 r1 = new iILLL1();
                while (true) {
                    AbstractC6854lLi1LL OooO00o2 = OooO0OO.OooO00o();
                    if (OooO00o2 == null) {
                        break;
                    }
                    r1.OooO00o(((AbstractC9685lL) OooO00o2).OooO0O0());
                }
                this.OooO0O0 = new C9731lL1(new i1I1I1l(r1));
            }
        }
        return this.OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m17027OooO0O0() throws IOException {
        if (this.f17603OooO00o == null) {
            m17024OooO00o();
            this.f17603OooO00o = this.f17600OooO00o.m17831OooO00o().m17938OooO00o();
        }
        return C9586iIILl.m21630OooO00o(this.f17603OooO00o);
    }

    public byte[] OooO0OO() {
        try {
            return OooO00o(this.f17599OooO00o.m17587OooO0O0());
        } catch (Exception e) {
            throw new RuntimeException("exception getting encryption parameters " + e);
        }
    }
}
