package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.ll丨ii  reason: invalid class name and case insensitive filesystem */
public class C6807llii extends C5521ILiLi {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6296il1il1 f18853OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18854OooO00o;

    /* renamed from: com.pd.sdk.ll丨ii$OooO00o */
    public class OooO00o extends OutputStream {
        public AbstractC6296il1il1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public I111LIL f18856OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C4984 f18857OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OutputStream f18858OooO00o;
        public C4984 OooO0O0;
        public C4984 OooO0OO;
        public LlLI1 o00OoOOo;

        public OooO00o(AbstractC6296il1il1 il1il1, I111LIL r3, LlLI1 llLI1, OutputStream outputStream, C4984 r6, C4984 r7, C4984 r8) {
            this.OooO00o = il1il1;
            this.f18856OooO00o = r3;
            this.o00OoOOo = llLI1;
            this.f18858OooO00o = outputStream;
            this.f18857OooO00o = r6;
            this.OooO0O0 = r7;
            this.OooO0OO = r8;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Map map;
            this.f18858OooO00o.close();
            this.OooO0OO.OooO0O0();
            I111LIL r0 = this.f18856OooO00o;
            if (r0 != null) {
                map = Collections.unmodifiableMap(C6807llii.this.OooO00o(this.o00OoOOo, r0.OooO00o(), this.OooO00o.m17321OooO00o(), this.f18856OooO00o.m21371OooO00o()));
                C6807llii r2 = C6807llii.this;
                if (((C5521ILiLi) r2).OooO0O0 == null) {
                    ((C5521ILiLi) r2).OooO0O0 = new C5813LliL();
                }
                i1I1I1l r22 = new i1I1I1l(((C5521ILiLi) C6807llii.this).OooO0O0.OooO00o(map).m21785OooO00o());
                OutputStream OooO00o2 = this.OooO00o.m17322OooO00o();
                OooO00o2.write(r22.OooO00o(AbstractC5533IiL.OooO00o));
                OooO00o2.close();
                this.OooO0O0.OooO00o(new ILI1Ll(false, 2, r22));
            } else {
                map = Collections.unmodifiableMap(new HashMap());
            }
            this.OooO0O0.OooO00o(new C6487lIIiIlL(this.OooO00o.m17323OooO00o()));
            if (C6807llii.this.OooO0OO != null) {
                this.OooO0O0.OooO00o(new ILI1Ll(false, 3, new C5781LlIl(C6807llii.this.OooO0OO.OooO00o(map).m21785OooO00o())));
            }
            this.OooO0O0.OooO0O0();
            this.f18857OooO00o.OooO0O0();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f18858OooO00o.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f18858OooO00o.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f18858OooO00o.write(bArr, i, i2);
        }
    }

    public OutputStream OooO00o(LlLI1 llLI1, OutputStream outputStream, AbstractC6296il1il1 il1il1) throws CMSException {
        return OooO00o(llLI1, outputStream, il1il1, (I111LIL) null);
    }

    public OutputStream OooO00o(LlLI1 llLI1, OutputStream outputStream, AbstractC6296il1il1 il1il1, I111LIL r13) throws CMSException {
        this.f18853OooO00o = il1il1;
        try {
            iILLL1 r0 = new iILLL1();
            for (AbstractC5760Lil r2 : ((C1L1l) this).f22782OooO0O0) {
                r0.OooO00o(r2.OooO00o(il1il1.OooO00o()));
            }
            C4984 r6 = new C4984(outputStream);
            r6.OooO00o(AbstractC6252iiLl.OooO0oO);
            C4984 r7 = new C4984(r6.OooO00o(), 0, true);
            r7.OooO00o(new C6513lIiI((long) C9709lilI.OooO00o(((C1L1l) this).f22779OooO00o)));
            if (((C1L1l) this).f22779OooO00o != null) {
                r7.OooO00o(new ILI1Ll(false, 0, ((C1L1l) this).f22779OooO00o));
            }
            if (this.f18854OooO00o) {
                r7.OooO00o().write(new C5781LlIl(r0).getEncoded());
            } else {
                r7.OooO00o().write(new i1I1I1l(r0).getEncoded());
            }
            r7.OooO00o().write(il1il1.m17321OooO00o().getEncoded());
            if (r13 != null) {
                r7.OooO00o(new ILI1Ll(false, 1, r13.OooO00o()));
            }
            C4984 r8 = new C4984(r7.OooO00o());
            r8.OooO00o(llLI1);
            OutputStream OooO00o2 = C5799LllI.OooO00o(r8.OooO00o(), 0, false, this.OooO00o);
            return new OooO00o(il1il1, r13, llLI1, r13 != null ? new C5741LilILl(OooO00o2, r13.m21370OooO00o()) : new C5741LilILl(OooO00o2, il1il1.m17322OooO00o()), r6, r7, r8);
        } catch (IOException e) {
            throw new CMSException("exception decoding algorithm parameters.", e);
        }
    }

    public OutputStream OooO00o(OutputStream outputStream, AbstractC6296il1il1 il1il1) throws CMSException {
        return OooO00o(AbstractC6252iiLl.OooO00o, outputStream, il1il1);
    }

    public OutputStream OooO00o(OutputStream outputStream, AbstractC6296il1il1 il1il1, I111LIL r4) throws CMSException {
        return OooO00o(AbstractC6252iiLl.OooO00o, outputStream, il1il1, r4);
    }

    public void OooO00o(int i) {
        this.OooO00o = i;
    }

    public void OooO00o(boolean z) {
        this.f18854OooO00o = z;
    }
}
