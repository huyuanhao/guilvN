package com.p118pd.sdk;

import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.p118pd.sdk.AbstractC97441iIIL;
import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: com.pd.sdk.丨l丨丨lL1L  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9738llL1L {
    public static AbstractC97441iIIL[] OooO0O0 = new AbstractC97441iIIL[0];
    public IIiLIli OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC97441iIIL f23369OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Hashtable f23370OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23371OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC97441iIIL[] f23372OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC97441iIIL f23373OooO0O0;

    /* renamed from: com.pd.sdk.丨l丨丨lL1L$OooO00o */
    public class OooO00o implements iLLLIil {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ boolean f23374OooO00o;

        public OooO00o(boolean z) {
            this.f23374OooO00o = z;
        }

        @Override // com.p118pd.sdk.iLLLIil
        public AbstractC6375iL1 OooO00o(AbstractC6375iL1 r2) {
            C6622lLlL1 r22 = r2 instanceof C6622lLlL1 ? (C6622lLlL1) r2 : null;
            if (r22 == null) {
                r22 = new C6622lLlL1();
            }
            if (r22.m17709OooO0O0()) {
                return r22;
            }
            if (!r22.m17708OooO00o()) {
                if (!AbstractC9738llL1L.this.OooO0oO()) {
                    r22.OooO0O0();
                    return r22;
                }
                r22.OooO00o();
            }
            if (this.f23374OooO00o && !r22.m17710OooO0OO()) {
                if (!AbstractC9738llL1L.this.OooO0oo()) {
                    r22.OooO0O0();
                    return r22;
                }
                r22.OooO0OO();
            }
            return r22;
        }
    }

    /* renamed from: com.pd.sdk.丨l丨丨lL1L$OooO0O0 */
    public static abstract class OooO0O0 extends AbstractC9738llL1L {
        public OooO0O0(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3) {
            super(r1, r2, r3);
        }

        public OooO0O0(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4) {
            super(r1, r2, r3, r4);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public OooO0O0 OooO00o() {
            AbstractC9738llL1L OooO00o;
            if (m21814OooO0OO()) {
                return this;
            }
            IIiLIli OooO00o2 = m21800OooO00o();
            int OooO00o3 = OooO00o2.m15387OooO00o();
            AbstractC97441iIIL r2 = ((AbstractC9738llL1L) this).f23369OooO00o;
            if (OooO00o3 != 0) {
                if (OooO00o3 != 1) {
                    if (OooO00o3 != 5) {
                        if (OooO00o3 != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                AbstractC97441iIIL r1 = this.f23373OooO0O0;
                AbstractC97441iIIL r4 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                OooO00o = OooO00o2.OooO00o(r2.OooO0o0(), r1.OooO0o0(), new AbstractC97441iIIL[]{r4.OooO0o0()}, ((AbstractC9738llL1L) this).f23371OooO00o);
                return (OooO0O0) OooO00o;
            }
            OooO00o = OooO00o2.OooO00o(r2.OooO0o0(), this.f23373OooO0O0.OooO0o0(), ((AbstractC9738llL1L) this).f23371OooO00o);
            return (OooO0O0) OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public OooO0O0 OooO00o(int i) {
            AbstractC9738llL1L OooO00o;
            if (m21814OooO0OO()) {
                return this;
            }
            IIiLIli OooO00o2 = m21800OooO00o();
            int OooO00o3 = OooO00o2.m15387OooO00o();
            AbstractC97441iIIL r2 = ((AbstractC9738llL1L) this).f23369OooO00o;
            if (OooO00o3 != 0) {
                if (OooO00o3 != 1) {
                    if (OooO00o3 != 5) {
                        if (OooO00o3 != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                AbstractC97441iIIL r1 = this.f23373OooO0O0;
                AbstractC97441iIIL r4 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                OooO00o = OooO00o2.OooO00o(r2.OooO00o(i), r1.OooO00o(i), new AbstractC97441iIIL[]{r4.OooO00o(i)}, ((AbstractC9738llL1L) this).f23371OooO00o);
                return (OooO0O0) OooO00o;
            }
            OooO00o = OooO00o2.OooO00o(r2.OooO00o(i), this.f23373OooO0O0.OooO00o(i), ((AbstractC9738llL1L) this).f23371OooO00o);
            return (OooO0O0) OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r2) {
            return r2.m21814OooO0OO() ? this : OooO00o(r2.OooO0OO());
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0O0(AbstractC97441iIIL r6) {
            if (m21814OooO0OO()) {
                return this;
            }
            int OooO00o = OooO00o();
            if (OooO00o == 5) {
                AbstractC97441iIIL OooO0OO = m21813OooO0OO();
                AbstractC97441iIIL OooO0Oo = m21815OooO0Oo();
                return m21800OooO00o().OooO00o(OooO0OO, OooO0Oo.OooO00o(OooO0OO).OooO0O0(r6).OooO00o(OooO0OO.OooO0OO(r6)), m21809OooO00o(), ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o != 6) {
                return AbstractC9738llL1L.super.OooO0O0(r6);
            } else {
                AbstractC97441iIIL OooO0OO2 = m21813OooO0OO();
                AbstractC97441iIIL OooO0Oo2 = m21815OooO0Oo();
                AbstractC97441iIIL r2 = m21809OooO00o()[0];
                AbstractC97441iIIL OooO0OO3 = OooO0OO2.OooO0OO(r6.OooO0o0());
                AbstractC97441iIIL OooO00o2 = OooO0Oo2.OooO00o(OooO0OO2).OooO00o(OooO0OO3);
                AbstractC97441iIIL OooO0OO4 = r2.OooO0OO(r6);
                return m21800OooO00o().OooO00o(OooO0OO3, OooO00o2, new AbstractC97441iIIL[]{OooO0OO4}, ((AbstractC9738llL1L) this).f23371OooO00o);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0OO(AbstractC97441iIIL r5) {
            if (m21814OooO0OO()) {
                return this;
            }
            int OooO00o = OooO00o();
            if (OooO00o != 5 && OooO00o != 6) {
                return AbstractC9738llL1L.super.OooO0OO(r5);
            }
            AbstractC97441iIIL OooO0OO = m21813OooO0OO();
            return m21800OooO00o().OooO00o(OooO0OO, m21815OooO0Oo().OooO00o(OooO0OO).OooO0OO(r5).OooO00o(OooO0OO), m21809OooO00o(), ((AbstractC9738llL1L) this).f23371OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public boolean OooO0oO() {
            AbstractC97441iIIL r2;
            AbstractC97441iIIL r0;
            IIiLIli OooO00o = m21800OooO00o();
            AbstractC97441iIIL r1 = ((AbstractC9738llL1L) this).f23369OooO00o;
            AbstractC97441iIIL OooO00o2 = OooO00o.m15394OooO00o();
            AbstractC97441iIIL OooO0O0 = OooO00o.m15400OooO0O0();
            int OooO00o3 = OooO00o.m15387OooO00o();
            if (OooO00o3 == 6) {
                AbstractC97441iIIL r02 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                boolean OooO00o4 = r02.m21860OooO00o();
                if (r1.m21863OooO0O0()) {
                    AbstractC97441iIIL OooO0o0 = this.f23373OooO0O0.OooO0o0();
                    if (!OooO00o4) {
                        OooO0O0 = OooO0O0.OooO0OO(r02.OooO0o0());
                    }
                    return OooO0o0.equals(OooO0O0);
                }
                AbstractC97441iIIL r5 = this.f23373OooO0O0;
                AbstractC97441iIIL OooO0o02 = r1.OooO0o0();
                if (OooO00o4) {
                    r0 = r5.OooO0o0().OooO00o(r5).OooO00o(OooO00o2);
                    r2 = OooO0o02.OooO0o0().OooO00o(OooO0O0);
                } else {
                    AbstractC97441iIIL OooO0o03 = r02.OooO0o0();
                    AbstractC97441iIIL OooO0o04 = OooO0o03.OooO0o0();
                    r0 = r5.OooO00o(r02).OooO0O0(r5, OooO00o2, OooO0o03);
                    r2 = OooO0o02.OooO0O0(OooO0O0, OooO0o04);
                }
                return r0.OooO0OO(OooO0o02).equals(r2);
            }
            AbstractC97441iIIL r52 = this.f23373OooO0O0;
            AbstractC97441iIIL OooO0OO = r52.OooO00o(r1).OooO0OO(r52);
            if (OooO00o3 != 0) {
                if (OooO00o3 == 1) {
                    AbstractC97441iIIL r03 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                    if (!r03.m21860OooO00o()) {
                        AbstractC97441iIIL OooO0OO2 = r03.OooO0OO(r03.OooO0o0());
                        OooO0OO = OooO0OO.OooO0OO(r03);
                        OooO00o2 = OooO00o2.OooO0OO(r03);
                        OooO0O0 = OooO0O0.OooO0OO(OooO0OO2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return OooO0OO.equals(r1.OooO00o(OooO00o2).OooO0OO(r1.OooO0o0()).OooO00o(OooO0O0));
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public boolean OooO0oo() {
            BigInteger OooO00o = ((AbstractC9738llL1L) this).OooO00o.m15395OooO00o();
            if (AbstractC5490IlLL.OooO0OO.equals(OooO00o)) {
                return ((AbstractC97441iIIL.OooO00o) OooO0Oo().m21802OooO00o().OooO00o(((AbstractC9738llL1L) this).OooO00o.m15394OooO00o())).OooO0OO() == 0;
            }
            if (!AbstractC5490IlLL.OooO0o0.equals(OooO00o)) {
                return AbstractC9738llL1L.super.OooO0oo();
            }
            AbstractC9738llL1L OooO0Oo = OooO0Oo();
            AbstractC97441iIIL OooO00o2 = OooO0Oo.m21802OooO00o();
            IIiLIli r4 = ((AbstractC9738llL1L) this).OooO00o;
            AbstractC97441iIIL OooO00o3 = ((IIiLIli.OooO0O0) r4).OooO00o(OooO00o2.OooO00o(r4.m15394OooO00o()));
            if (OooO00o3 == null) {
                return false;
            }
            AbstractC97441iIIL OooO00o4 = OooO00o2.OooO0OO(OooO00o3).OooO00o(OooO0Oo.m21810OooO0O0()).OooO00o(((AbstractC9738llL1L) this).OooO00o.m15394OooO00o());
            return ((AbstractC97441iIIL.OooO00o) OooO00o4).OooO0OO() == 0 || ((AbstractC97441iIIL.OooO00o) OooO00o4.OooO00o(OooO00o2)).OooO0OO() == 0;
        }
    }

    /* renamed from: com.pd.sdk.丨l丨丨lL1L$OooO0OO */
    public static abstract class OooO0OO extends AbstractC9738llL1L {
        public OooO0OO(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3) {
            super(r1, r2, r3);
        }

        public OooO0OO(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4) {
            super(r1, r2, r3, r4);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public boolean OooO00o() {
            return m21810OooO0O0().m21864OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r2) {
            return r2.m21814OooO0OO() ? this : OooO00o(r2.OooO0OO());
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public boolean OooO0oO() {
            AbstractC97441iIIL r0 = ((AbstractC9738llL1L) this).f23369OooO00o;
            AbstractC97441iIIL r1 = this.f23373OooO0O0;
            AbstractC97441iIIL OooO00o = ((AbstractC9738llL1L) this).OooO00o.m15394OooO00o();
            AbstractC97441iIIL OooO0O0 = ((AbstractC9738llL1L) this).OooO00o.m15400OooO0O0();
            AbstractC97441iIIL OooO0o0 = r1.OooO0o0();
            int OooO00o2 = OooO00o();
            if (OooO00o2 != 0) {
                if (OooO00o2 == 1) {
                    AbstractC97441iIIL r4 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                    if (!r4.m21860OooO00o()) {
                        AbstractC97441iIIL OooO0o02 = r4.OooO0o0();
                        AbstractC97441iIIL OooO0OO = r4.OooO0OO(OooO0o02);
                        OooO0o0 = OooO0o0.OooO0OO(r4);
                        OooO00o = OooO00o.OooO0OO(OooO0o02);
                        OooO0O0 = OooO0O0.OooO0OO(OooO0OO);
                    }
                } else if (OooO00o2 == 2 || OooO00o2 == 3 || OooO00o2 == 4) {
                    AbstractC97441iIIL r42 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                    if (!r42.m21860OooO00o()) {
                        AbstractC97441iIIL OooO0o03 = r42.OooO0o0();
                        AbstractC97441iIIL OooO0o04 = OooO0o03.OooO0o0();
                        AbstractC97441iIIL OooO0OO2 = OooO0o03.OooO0OO(OooO0o04);
                        OooO00o = OooO00o.OooO0OO(OooO0o04);
                        OooO0O0 = OooO0O0.OooO0OO(OooO0OO2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return OooO0o0.equals(r0.OooO0o0().OooO00o(OooO00o).OooO0OO(r0).OooO00o(OooO0O0));
        }
    }

    /* renamed from: com.pd.sdk.丨l丨丨lL1L$OooO0Oo  reason: case insensitive filesystem */
    public static class C9739OooO0Oo extends OooO0O0 {
        public C9739OooO0Oo(IIiLIli r4, AbstractC97441iIIL r5, AbstractC97441iIIL r6, boolean z) {
            super(r4, r5, r6);
            if ((r5 == null) == (r6 != null ? false : true)) {
                if (r5 != null) {
                    AbstractC97441iIIL.OooO0OO.OooO00o(((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0);
                    if (r4 != null) {
                        AbstractC97441iIIL.OooO0OO.OooO00o(((AbstractC9738llL1L) this).f23369OooO00o, ((AbstractC9738llL1L) this).OooO00o.m15394OooO00o());
                    }
                }
                ((AbstractC9738llL1L) this).f23371OooO00o = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        public C9739OooO0Oo(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
            super(r1, r2, r3, r4);
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0O0
        public AbstractC9738llL1L OooO00o() {
            return new C9739OooO0Oo(null, m21802OooO00o(), m21810OooO0O0(), false);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO00o(AbstractC9738llL1L r18) {
            AbstractC97441iIIL r12;
            AbstractC97441iIIL r11;
            AbstractC97441iIIL r14;
            AbstractC97441iIIL r5;
            AbstractC97441iIIL r2;
            AbstractC97441iIIL r1;
            if (m21814OooO0OO()) {
                return r18;
            }
            if (r18.m21814OooO0OO()) {
                return this;
            }
            IIiLIli OooO00o = m21800OooO00o();
            int OooO00o2 = OooO00o.m15387OooO00o();
            AbstractC97441iIIL r3 = ((AbstractC9738llL1L) this).f23369OooO00o;
            AbstractC97441iIIL r52 = r18.f23369OooO00o;
            if (OooO00o2 == 0) {
                AbstractC97441iIIL r22 = this.f23373OooO0O0;
                AbstractC97441iIIL r13 = r18.f23373OooO0O0;
                AbstractC97441iIIL OooO00o3 = r3.OooO00o(r52);
                AbstractC97441iIIL OooO00o4 = r22.OooO00o(r13);
                if (OooO00o3.m21863OooO0O0()) {
                    return OooO00o4.m21863OooO0O0() ? OooO0o() : OooO00o.m15393OooO00o();
                }
                AbstractC97441iIIL OooO0O0 = OooO00o4.OooO0O0(OooO00o3);
                AbstractC97441iIIL OooO00o5 = OooO0O0.OooO0o0().OooO00o(OooO0O0).OooO00o(OooO00o3).OooO00o(OooO00o.m15394OooO00o());
                return new C9739OooO0Oo(OooO00o, OooO00o5, OooO0O0.OooO0OO(r3.OooO00o(OooO00o5)).OooO00o(OooO00o5).OooO00o(r22), ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o2 == 1) {
                AbstractC97441iIIL r23 = this.f23373OooO0O0;
                AbstractC97441iIIL r8 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                AbstractC97441iIIL r9 = r18.f23373OooO0O0;
                AbstractC97441iIIL r15 = r18.f23372OooO00o[0];
                boolean OooO00o6 = r15.m21860OooO00o();
                AbstractC97441iIIL OooO00o7 = r8.OooO0OO(r9).OooO00o(OooO00o6 ? r23 : r23.OooO0OO(r15));
                AbstractC97441iIIL OooO00o8 = r8.OooO0OO(r52).OooO00o(OooO00o6 ? r3 : r3.OooO0OO(r15));
                if (OooO00o8.m21863OooO0O0()) {
                    return OooO00o7.m21863OooO0O0() ? OooO0o() : OooO00o.m15393OooO00o();
                }
                AbstractC97441iIIL OooO0o0 = OooO00o8.OooO0o0();
                AbstractC97441iIIL OooO0OO = OooO0o0.OooO0OO(OooO00o8);
                if (!OooO00o6) {
                    r8 = r8.OooO0OO(r15);
                }
                AbstractC97441iIIL OooO00o9 = OooO00o7.OooO00o(OooO00o8);
                AbstractC97441iIIL OooO00o10 = OooO00o9.OooO0O0(OooO00o7, OooO0o0, OooO00o.m15394OooO00o()).OooO0OO(r8).OooO00o(OooO0OO);
                AbstractC97441iIIL OooO0OO2 = OooO00o8.OooO0OO(OooO00o10);
                if (!OooO00o6) {
                    OooO0o0 = OooO0o0.OooO0OO(r15);
                }
                return new C9739OooO0Oo(OooO00o, OooO0OO2, OooO00o7.OooO0O0(r3, OooO00o8, r23).OooO0O0(OooO0o0, OooO00o9, OooO00o10), new AbstractC97441iIIL[]{OooO0OO.OooO0OO(r8)}, ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o2 != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            } else if (r3.m21863OooO0O0()) {
                return r52.m21863OooO0O0() ? OooO00o.m15393OooO00o() : r18.OooO00o((AbstractC9738llL1L) this);
            } else {
                AbstractC97441iIIL r24 = this.f23373OooO0O0;
                AbstractC97441iIIL r82 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                AbstractC97441iIIL r92 = r18.f23373OooO0O0;
                AbstractC97441iIIL r16 = r18.f23372OooO00o[0];
                boolean OooO00o11 = r82.m21860OooO00o();
                if (!OooO00o11) {
                    r11 = r52.OooO0OO(r82);
                    r12 = r92.OooO0OO(r82);
                } else {
                    r11 = r52;
                    r12 = r92;
                }
                boolean OooO00o12 = r16.m21860OooO00o();
                if (!OooO00o12) {
                    r3 = r3.OooO0OO(r16);
                    r14 = r24.OooO0OO(r16);
                } else {
                    r14 = r24;
                }
                AbstractC97441iIIL OooO00o13 = r14.OooO00o(r12);
                AbstractC97441iIIL OooO00o14 = r3.OooO00o(r11);
                if (OooO00o14.m21863OooO0O0()) {
                    return OooO00o13.m21863OooO0O0() ? OooO0o() : OooO00o.m15393OooO00o();
                }
                if (r52.m21863OooO0O0()) {
                    AbstractC9738llL1L OooO0Oo = OooO0Oo();
                    AbstractC97441iIIL OooO0o02 = OooO0Oo.m21819OooO0o0();
                    AbstractC97441iIIL OooO0o = OooO0Oo.m21817OooO0o();
                    AbstractC97441iIIL OooO0O02 = OooO0o.OooO00o(r92).OooO0O0(OooO0o02);
                    r5 = OooO0O02.OooO0o0().OooO00o(OooO0O02).OooO00o(OooO0o02).OooO00o(OooO00o.m15394OooO00o());
                    if (r5.m21863OooO0O0()) {
                        return new C9739OooO0Oo(OooO00o, r5, OooO00o.m15400OooO0O0().OooO0Oo(), ((AbstractC9738llL1L) this).f23371OooO00o);
                    }
                    r1 = OooO0O02.OooO0OO(OooO0o02.OooO00o(r5)).OooO00o(r5).OooO00o(OooO0o).OooO0O0(r5).OooO00o(r5);
                    r2 = OooO00o.OooO00o(AbstractC5490IlLL.OooO0O0);
                } else {
                    AbstractC97441iIIL OooO0o03 = OooO00o14.OooO0o0();
                    AbstractC97441iIIL OooO0OO3 = OooO00o13.OooO0OO(r3);
                    AbstractC97441iIIL OooO0OO4 = OooO00o13.OooO0OO(r11);
                    AbstractC97441iIIL OooO0OO5 = OooO0OO3.OooO0OO(OooO0OO4);
                    if (OooO0OO5.m21863OooO0O0()) {
                        return new C9739OooO0Oo(OooO00o, OooO0OO5, OooO00o.m15400OooO0O0().OooO0Oo(), ((AbstractC9738llL1L) this).f23371OooO00o);
                    }
                    AbstractC97441iIIL OooO0OO6 = OooO00o13.OooO0OO(OooO0o03);
                    AbstractC97441iIIL OooO0OO7 = !OooO00o12 ? OooO0OO6.OooO0OO(r16) : OooO0OO6;
                    AbstractC97441iIIL OooO0O03 = OooO0OO4.OooO00o(OooO0o03).OooO0O0(OooO0OO7, r24.OooO00o(r82));
                    if (!OooO00o11) {
                        OooO0OO7 = OooO0OO7.OooO0OO(r82);
                    }
                    r5 = OooO0OO5;
                    r2 = OooO0OO7;
                    r1 = OooO0O03;
                }
                return new C9739OooO0Oo(OooO00o, r5, r1, new AbstractC97441iIIL[]{r2}, ((AbstractC9738llL1L) this).f23371OooO00o);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m21821OooO00o() {
            AbstractC97441iIIL OooO0OO = m21813OooO0OO();
            if (OooO0OO.m21863OooO0O0()) {
                return false;
            }
            AbstractC97441iIIL OooO0Oo = m21815OooO0Oo();
            int OooO00o = OooO00o();
            return (OooO00o == 5 || OooO00o == 6) ? OooO0Oo.m21864OooO0OO() != OooO0OO.m21864OooO0OO() : OooO0Oo.OooO0O0(OooO0OO).m21864OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0OO() {
            if (m21814OooO0OO()) {
                return this;
            }
            AbstractC97441iIIL r3 = ((AbstractC9738llL1L) this).f23369OooO00o;
            if (r3.m21863OooO0O0()) {
                return this;
            }
            int OooO00o = OooO00o();
            if (OooO00o == 0) {
                return new C9739OooO0Oo(((AbstractC9738llL1L) this).OooO00o, r3, this.f23373OooO0O0.OooO00o(r3), ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o == 1) {
                AbstractC97441iIIL r0 = this.f23373OooO0O0;
                AbstractC97441iIIL r4 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                return new C9739OooO0Oo(((AbstractC9738llL1L) this).OooO00o, r3, r0.OooO00o(r3), new AbstractC97441iIIL[]{r4}, ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o == 5) {
                return new C9739OooO0Oo(((AbstractC9738llL1L) this).OooO00o, r3, this.f23373OooO0O0.m21857OooO00o(), ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o == 6) {
                AbstractC97441iIIL r02 = this.f23373OooO0O0;
                AbstractC97441iIIL r42 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                return new C9739OooO0Oo(((AbstractC9738llL1L) this).OooO00o, r3, r02.OooO00o(r42), new AbstractC97441iIIL[]{r42}, ((AbstractC9738llL1L) this).f23371OooO00o);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0OO(AbstractC9738llL1L r10) {
            if (m21814OooO0OO()) {
                return r10;
            }
            if (r10.m21814OooO0OO()) {
                return OooO0o();
            }
            IIiLIli OooO00o = m21800OooO00o();
            AbstractC97441iIIL r0 = ((AbstractC9738llL1L) this).f23369OooO00o;
            if (r0.m21863OooO0O0()) {
                return r10;
            }
            if (OooO00o.m15387OooO00o() != 6) {
                return OooO0o().OooO00o(r10);
            }
            AbstractC97441iIIL r2 = r10.f23369OooO00o;
            AbstractC97441iIIL r3 = r10.f23372OooO00o[0];
            if (r2.m21863OooO0O0() || !r3.m21860OooO00o()) {
                return OooO0o().OooO00o(r10);
            }
            AbstractC97441iIIL r32 = this.f23373OooO0O0;
            AbstractC97441iIIL r5 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
            AbstractC97441iIIL r6 = r10.f23373OooO0O0;
            AbstractC97441iIIL OooO0o0 = r0.OooO0o0();
            AbstractC97441iIIL OooO0o02 = r32.OooO0o0();
            AbstractC97441iIIL OooO0o03 = r5.OooO0o0();
            AbstractC97441iIIL OooO00o2 = OooO00o.m15394OooO00o().OooO0OO(OooO0o03).OooO00o(OooO0o02).OooO00o(r32.OooO0OO(r5));
            AbstractC97441iIIL OooO00o3 = r6.m21857OooO00o();
            AbstractC97441iIIL OooO0O0 = OooO00o.m15394OooO00o().OooO00o(OooO00o3).OooO0OO(OooO0o03).OooO00o(OooO0o02).OooO0O0(OooO00o2, OooO0o0, OooO0o03);
            AbstractC97441iIIL OooO0OO = r2.OooO0OO(OooO0o03);
            AbstractC97441iIIL OooO0o04 = OooO0OO.OooO00o(OooO00o2).OooO0o0();
            if (OooO0o04.m21863OooO0O0()) {
                return OooO0O0.m21863OooO0O0() ? r10.OooO0o() : OooO00o.m15393OooO00o();
            }
            if (OooO0O0.m21863OooO0O0()) {
                return new C9739OooO0Oo(OooO00o, OooO0O0, OooO00o.m15400OooO0O0().OooO0Oo(), ((AbstractC9738llL1L) this).f23371OooO00o);
            }
            AbstractC97441iIIL OooO0OO2 = OooO0O0.OooO0o0().OooO0OO(OooO0OO);
            AbstractC97441iIIL OooO0OO3 = OooO0O0.OooO0OO(OooO0o04).OooO0OO(OooO0o03);
            return new C9739OooO0Oo(OooO00o, OooO0OO2, OooO0O0.OooO00o(OooO0o04).OooO0o0().OooO0O0(OooO00o2, OooO00o3, OooO0OO3), new AbstractC97441iIIL[]{OooO0OO3}, ((AbstractC9738llL1L) this).f23371OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0o() {
            AbstractC97441iIIL r1;
            if (m21814OooO0OO()) {
                return this;
            }
            IIiLIli OooO00o = m21800OooO00o();
            AbstractC97441iIIL r12 = ((AbstractC9738llL1L) this).f23369OooO00o;
            if (r12.m21863OooO0O0()) {
                return OooO00o.m15393OooO00o();
            }
            int OooO00o2 = OooO00o.m15387OooO00o();
            if (OooO00o2 == 0) {
                AbstractC97441iIIL OooO00o3 = this.f23373OooO0O0.OooO0O0(r12).OooO00o(r12);
                AbstractC97441iIIL OooO00o4 = OooO00o3.OooO0o0().OooO00o(OooO00o3).OooO00o(OooO00o.m15394OooO00o());
                return new C9739OooO0Oo(OooO00o, OooO00o4, r12.OooO0O0(OooO00o4, OooO00o3.m21857OooO00o()), ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o2 == 1) {
                AbstractC97441iIIL r2 = this.f23373OooO0O0;
                AbstractC97441iIIL r3 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                boolean OooO00o5 = r3.m21860OooO00o();
                AbstractC97441iIIL OooO0OO = OooO00o5 ? r12 : r12.OooO0OO(r3);
                if (!OooO00o5) {
                    r2 = r2.OooO0OO(r3);
                }
                AbstractC97441iIIL OooO0o0 = r12.OooO0o0();
                AbstractC97441iIIL OooO00o6 = OooO0o0.OooO00o(r2);
                AbstractC97441iIIL OooO0o02 = OooO0OO.OooO0o0();
                AbstractC97441iIIL OooO00o7 = OooO00o6.OooO00o(OooO0OO);
                AbstractC97441iIIL OooO0O0 = OooO00o7.OooO0O0(OooO00o6, OooO0o02, OooO00o.m15394OooO00o());
                return new C9739OooO0Oo(OooO00o, OooO0OO.OooO0OO(OooO0O0), OooO0o0.OooO0o0().OooO0O0(OooO0OO, OooO0O0, OooO00o7), new AbstractC97441iIIL[]{OooO0OO.OooO0OO(OooO0o02)}, ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o2 == 6) {
                AbstractC97441iIIL r22 = this.f23373OooO0O0;
                AbstractC97441iIIL r6 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                boolean OooO00o8 = r6.m21860OooO00o();
                AbstractC97441iIIL OooO0OO2 = OooO00o8 ? r22 : r22.OooO0OO(r6);
                AbstractC97441iIIL OooO0o03 = OooO00o8 ? r6 : r6.OooO0o0();
                AbstractC97441iIIL OooO00o9 = OooO00o.m15394OooO00o();
                AbstractC97441iIIL OooO0OO3 = OooO00o8 ? OooO00o9 : OooO00o9.OooO0OO(OooO0o03);
                AbstractC97441iIIL OooO00o10 = r22.OooO0o0().OooO00o(OooO0OO2).OooO00o(OooO0OO3);
                if (OooO00o10.m21863OooO0O0()) {
                    return new C9739OooO0Oo(OooO00o, OooO00o10, OooO00o.m15400OooO0O0().OooO0Oo(), ((AbstractC9738llL1L) this).f23371OooO00o);
                }
                AbstractC97441iIIL OooO0o04 = OooO00o10.OooO0o0();
                AbstractC97441iIIL OooO0OO4 = OooO00o8 ? OooO00o10 : OooO00o10.OooO0OO(OooO0o03);
                AbstractC97441iIIL OooO0O02 = OooO00o.m15400OooO0O0();
                if (OooO0O02.OooO00o() < (OooO00o.OooO0O0() >> 1)) {
                    AbstractC97441iIIL OooO0o05 = r22.OooO00o(r12).OooO0o0();
                    r1 = OooO0o05.OooO00o(OooO00o10).OooO00o(OooO0o03).OooO0OO(OooO0o05).OooO00o(OooO0O02.m21860OooO00o() ? OooO0OO3.OooO00o(OooO0o03).OooO0o0() : OooO0OO3.OooO0O0(OooO0O02, OooO0o03.OooO0o0())).OooO00o(OooO0o04);
                    if (!OooO00o9.m21863OooO0O0()) {
                        if (!OooO00o9.m21860OooO00o()) {
                            r1 = r1.OooO00o(OooO00o9.m21857OooO00o().OooO0OO(OooO0OO4));
                        }
                        return new C9739OooO0Oo(OooO00o, OooO0o04, r1, new AbstractC97441iIIL[]{OooO0OO4}, ((AbstractC9738llL1L) this).f23371OooO00o);
                    }
                } else {
                    if (!OooO00o8) {
                        r12 = r12.OooO0OO(r6);
                    }
                    r1 = r12.OooO0O0(OooO00o10, OooO0OO2).OooO00o(OooO0o04);
                }
                r1 = r1.OooO00o(OooO0OO4);
                return new C9739OooO0Oo(OooO00o, OooO0o04, r1, new AbstractC97441iIIL[]{OooO0OO4}, ((AbstractC9738llL1L) this).f23371OooO00o);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        /* renamed from: OooO0o  reason: collision with other method in class */
        public AbstractC97441iIIL m21822OooO0o() {
            int OooO00o = OooO00o();
            if (OooO00o != 5 && OooO00o != 6) {
                return this.f23373OooO0O0;
            }
            AbstractC97441iIIL r1 = ((AbstractC9738llL1L) this).f23369OooO00o;
            AbstractC97441iIIL r3 = this.f23373OooO0O0;
            if (m21814OooO0OO() || r1.m21863OooO0O0()) {
                return r3;
            }
            AbstractC97441iIIL OooO0OO = r3.OooO00o(r1).OooO0OO(r1);
            if (6 != OooO00o) {
                return OooO0OO;
            }
            AbstractC97441iIIL r0 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
            return !r0.m21860OooO00o() ? OooO0OO.OooO0O0(r0) : OooO0OO;
        }
    }

    /* renamed from: com.pd.sdk.丨l丨丨lL1L$OooO0o0  reason: case insensitive filesystem */
    public static class C9740OooO0o0 extends OooO0OO {
        public C9740OooO0o0(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
            super(r2, r3, r4);
            if ((r3 == null) == (r4 != null ? false : true)) {
                ((AbstractC9738llL1L) this).f23371OooO00o = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        public C9740OooO0o0(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
            super(r1, r2, r3, r4);
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public C9740OooO0o0 OooO00o(boolean z) {
            AbstractC97441iIIL r1 = ((AbstractC9738llL1L) this).f23369OooO00o;
            AbstractC97441iIIL r2 = this.f23373OooO0O0;
            AbstractC97441iIIL r3 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
            AbstractC97441iIIL OooO0oO = OooO0oO();
            AbstractC97441iIIL OooO00o = OooO0OO(r1.OooO0o0()).OooO00o(OooO0oO);
            AbstractC97441iIIL OooO0Oo = OooO0Oo(r2);
            AbstractC97441iIIL OooO0OO = OooO0Oo.OooO0OO(r2);
            AbstractC97441iIIL OooO0Oo2 = OooO0Oo(r1.OooO0OO(OooO0OO));
            AbstractC97441iIIL OooO0Oo3 = OooO00o.OooO0o0().OooO0Oo(OooO0Oo(OooO0Oo2));
            AbstractC97441iIIL OooO0Oo4 = OooO0Oo(OooO0OO.OooO0o0());
            AbstractC97441iIIL OooO0Oo5 = OooO00o.OooO0OO(OooO0Oo2.OooO0Oo(OooO0Oo3)).OooO0Oo(OooO0Oo4);
            AbstractC97441iIIL OooO0Oo6 = z ? OooO0Oo(OooO0Oo4.OooO0OO(OooO0oO)) : null;
            if (!r3.m21860OooO00o()) {
                OooO0Oo = OooO0Oo.OooO0OO(r3);
            }
            return new C9740OooO0o0(m21800OooO00o(), OooO0Oo3, OooO0Oo5, new AbstractC97441iIIL[]{OooO0Oo, OooO0Oo6}, ((AbstractC9738llL1L) this).f23371OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
        public AbstractC9738llL1L OooO00o() {
            return new C9740OooO0o0(null, m21802OooO00o(), m21810OooO0O0(), false);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO00o(int i) {
            AbstractC97441iIIL r6;
            if (i < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            } else if (i == 0 || m21814OooO0OO()) {
                return this;
            } else {
                if (i == 1) {
                    return OooO0o();
                }
                IIiLIli OooO00o = m21800OooO00o();
                AbstractC97441iIIL r4 = this.f23373OooO0O0;
                if (r4.m21863OooO0O0()) {
                    return OooO00o.m15393OooO00o();
                }
                int OooO00o2 = OooO00o.m15387OooO00o();
                AbstractC97441iIIL OooO00o3 = OooO00o.m15394OooO00o();
                AbstractC97441iIIL r7 = ((AbstractC9738llL1L) this).f23369OooO00o;
                AbstractC97441iIIL[] r8 = ((AbstractC9738llL1L) this).f23372OooO00o;
                AbstractC97441iIIL OooO00o4 = r8.length < 1 ? OooO00o.OooO00o(AbstractC5490IlLL.OooO0O0) : r8[0];
                if (!OooO00o4.m21860OooO00o() && OooO00o2 != 0) {
                    if (OooO00o2 == 1) {
                        r6 = OooO00o4.OooO0o0();
                        r7 = r7.OooO0OO(OooO00o4);
                        r4 = r4.OooO0OO(r6);
                    } else if (OooO00o2 == 2) {
                        r6 = null;
                    } else if (OooO00o2 == 4) {
                        OooO00o3 = OooO0oO();
                    } else {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    OooO00o3 = OooO00o(OooO00o4, r6);
                }
                int i2 = 0;
                AbstractC97441iIIL r62 = r4;
                AbstractC97441iIIL r42 = r7;
                AbstractC97441iIIL r72 = OooO00o3;
                while (i2 < i) {
                    if (r62.m21863OooO0O0()) {
                        return OooO00o.m15393OooO00o();
                    }
                    AbstractC97441iIIL OooO0OO = OooO0OO(r42.OooO0o0());
                    AbstractC97441iIIL OooO0Oo = OooO0Oo(r62);
                    AbstractC97441iIIL OooO0OO2 = OooO0Oo.OooO0OO(r62);
                    AbstractC97441iIIL OooO0Oo2 = OooO0Oo(r42.OooO0OO(OooO0OO2));
                    AbstractC97441iIIL OooO0Oo3 = OooO0Oo(OooO0OO2.OooO0o0());
                    if (!r72.m21863OooO0O0()) {
                        OooO0OO = OooO0OO.OooO00o(r72);
                        r72 = OooO0Oo(OooO0Oo3.OooO0OO(r72));
                    }
                    AbstractC97441iIIL OooO0Oo4 = OooO0OO.OooO0o0().OooO0Oo(OooO0Oo(OooO0Oo2));
                    r62 = OooO0OO.OooO0OO(OooO0Oo2.OooO0Oo(OooO0Oo4)).OooO0Oo(OooO0Oo3);
                    OooO00o4 = OooO00o4.m21860OooO00o() ? OooO0Oo : OooO0Oo.OooO0OO(OooO00o4);
                    i2++;
                    r42 = OooO0Oo4;
                }
                if (OooO00o2 == 0) {
                    AbstractC97441iIIL OooO0O0 = OooO00o4.m21862OooO0O0();
                    AbstractC97441iIIL OooO0o0 = OooO0O0.OooO0o0();
                    return new C9740OooO0o0(OooO00o, r42.OooO0OO(OooO0o0), r62.OooO0OO(OooO0o0.OooO0OO(OooO0O0)), ((AbstractC9738llL1L) this).f23371OooO00o);
                } else if (OooO00o2 == 1) {
                    return new C9740OooO0o0(OooO00o, r42.OooO0OO(OooO00o4), r62, new AbstractC97441iIIL[]{OooO00o4.OooO0OO(OooO00o4.OooO0o0())}, ((AbstractC9738llL1L) this).f23371OooO00o);
                } else if (OooO00o2 == 2) {
                    return new C9740OooO0o0(OooO00o, r42, r62, new AbstractC97441iIIL[]{OooO00o4}, ((AbstractC9738llL1L) this).f23371OooO00o);
                } else if (OooO00o2 == 4) {
                    return new C9740OooO0o0(OooO00o, r42, r62, new AbstractC97441iIIL[]{OooO00o4, r72}, ((AbstractC9738llL1L) this).f23371OooO00o);
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
            if (r1 == r6) goto L_0x0125;
         */
        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p118pd.sdk.AbstractC9738llL1L OooO00o(com.p118pd.sdk.AbstractC9738llL1L r17) {
            /*
            // Method dump skipped, instructions count: 543
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractC9738llL1L.C9740OooO0o0.OooO00o(com.pd.sdk.丨l丨丨lL1L):com.pd.sdk.丨l丨丨lL1L");
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC97441iIIL m21823OooO00o(int i) {
            return (i == 1 && 4 == OooO00o()) ? OooO0oO() : AbstractC9738llL1L.super.m21803OooO00o(i);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r1) {
            return OooO0O0(OooO0Oo(r1));
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r4, AbstractC97441iIIL r5) {
            AbstractC97441iIIL OooO00o = m21800OooO00o().m15394OooO00o();
            if (OooO00o.m21863OooO0O0() || r4.m21860OooO00o()) {
                return OooO00o;
            }
            if (r5 == null) {
                r5 = r4.OooO0o0();
            }
            AbstractC97441iIIL OooO0o0 = r5.OooO0o0();
            AbstractC97441iIIL OooO0OO = OooO00o.OooO0OO();
            return OooO0OO.OooO00o() < OooO00o.OooO00o() ? OooO0o0.OooO0OO(OooO0OO).OooO0OO() : OooO0o0.OooO0OO(OooO00o);
        }

        public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
            return r1.OooO00o(r2).OooO0o0().OooO0Oo(r3).OooO0Oo(r4);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r1) {
            return OooO0Oo(OooO0Oo(r1));
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0OO() {
            if (m21814OooO0OO()) {
                return this;
            }
            IIiLIli OooO00o = m21800OooO00o();
            return OooO00o.m15387OooO00o() != 0 ? new C9740OooO0o0(OooO00o, ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23372OooO00o, ((AbstractC9738llL1L) this).f23371OooO00o) : new C9740OooO0o0(OooO00o, ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23371OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0OO(AbstractC9738llL1L r9) {
            if (this == r9) {
                return OooO0o0();
            }
            if (m21814OooO0OO()) {
                return r9;
            }
            if (r9.m21814OooO0OO()) {
                return OooO0o();
            }
            AbstractC97441iIIL r0 = this.f23373OooO0O0;
            if (r0.m21863OooO0O0()) {
                return r9;
            }
            IIiLIli OooO00o = m21800OooO00o();
            int OooO00o2 = OooO00o.m15387OooO00o();
            if (OooO00o2 != 0) {
                return OooO00o2 != 4 ? OooO0o().OooO00o(r9) : OooO00o(false).OooO00o(r9);
            }
            AbstractC97441iIIL r2 = ((AbstractC9738llL1L) this).f23369OooO00o;
            AbstractC97441iIIL r3 = r9.f23369OooO00o;
            AbstractC97441iIIL r92 = r9.f23373OooO0O0;
            AbstractC97441iIIL OooO0Oo = r3.OooO0Oo(r2);
            AbstractC97441iIIL OooO0Oo2 = r92.OooO0Oo(r0);
            if (OooO0Oo.m21863OooO0O0()) {
                return OooO0Oo2.m21863OooO0O0() ? OooO0o0() : this;
            }
            AbstractC97441iIIL OooO0o0 = OooO0Oo.OooO0o0();
            AbstractC97441iIIL OooO0Oo3 = OooO0o0.OooO0OO(OooO0Oo(r2).OooO00o(r3)).OooO0Oo(OooO0Oo2.OooO0o0());
            if (OooO0Oo3.m21863OooO0O0()) {
                return OooO00o.m15393OooO00o();
            }
            AbstractC97441iIIL OooO0O0 = OooO0Oo3.OooO0OO(OooO0Oo).m21862OooO0O0();
            AbstractC97441iIIL OooO0OO = OooO0Oo3.OooO0OO(OooO0O0).OooO0OO(OooO0Oo2);
            AbstractC97441iIIL OooO0Oo4 = OooO0Oo(r0).OooO0OO(OooO0o0).OooO0OO(OooO0Oo).OooO0OO(OooO0O0).OooO0Oo(OooO0OO);
            AbstractC97441iIIL OooO00o3 = OooO0Oo4.OooO0Oo(OooO0OO).OooO0OO(OooO0OO.OooO00o(OooO0Oo4)).OooO00o(r3);
            return new C9740OooO0o0(OooO00o, OooO00o3, r2.OooO0Oo(OooO00o3).OooO0OO(OooO0Oo4).OooO0Oo(r0), ((AbstractC9738llL1L) this).f23371OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r2) {
            return OooO0Oo(r2).OooO00o(r2);
        }

        public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r1) {
            return r1.OooO00o(r1);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0o() {
            AbstractC97441iIIL r9;
            AbstractC97441iIIL r3;
            if (m21814OooO0OO()) {
                return this;
            }
            IIiLIli OooO00o = m21800OooO00o();
            AbstractC97441iIIL r0 = this.f23373OooO0O0;
            if (r0.m21863OooO0O0()) {
                return OooO00o.m15393OooO00o();
            }
            int OooO00o2 = OooO00o.m15387OooO00o();
            AbstractC97441iIIL r32 = ((AbstractC9738llL1L) this).f23369OooO00o;
            if (OooO00o2 == 0) {
                AbstractC97441iIIL OooO0O0 = OooO0OO(r32.OooO0o0()).OooO00o(m21800OooO00o().m15394OooO00o()).OooO0O0(OooO0Oo(r0));
                AbstractC97441iIIL OooO0Oo = OooO0O0.OooO0o0().OooO0Oo(OooO0Oo(r32));
                return new C9740OooO0o0(OooO00o, OooO0Oo, OooO0O0.OooO0OO(r32.OooO0Oo(OooO0Oo)).OooO0Oo(r0), ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o2 == 1) {
                AbstractC97441iIIL r1 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                boolean OooO00o3 = r1.m21860OooO00o();
                AbstractC97441iIIL OooO00o4 = OooO00o.m15394OooO00o();
                if (!OooO00o4.m21863OooO0O0() && !OooO00o3) {
                    OooO00o4 = OooO00o4.OooO0OO(r1.OooO0o0());
                }
                AbstractC97441iIIL OooO00o5 = OooO00o4.OooO00o(OooO0OO(r32.OooO0o0()));
                AbstractC97441iIIL OooO0OO = OooO00o3 ? r0 : r0.OooO0OO(r1);
                AbstractC97441iIIL OooO0o0 = OooO00o3 ? r0.OooO0o0() : OooO0OO.OooO0OO(r0);
                AbstractC97441iIIL OooO0O02 = OooO0O0(r32.OooO0OO(OooO0o0));
                AbstractC97441iIIL OooO0Oo2 = OooO00o5.OooO0o0().OooO0Oo(OooO0Oo(OooO0O02));
                AbstractC97441iIIL OooO0Oo3 = OooO0Oo(OooO0OO);
                AbstractC97441iIIL OooO0OO2 = OooO0Oo2.OooO0OO(OooO0Oo3);
                AbstractC97441iIIL OooO0Oo4 = OooO0Oo(OooO0o0);
                return new C9740OooO0o0(OooO00o, OooO0OO2, OooO0O02.OooO0Oo(OooO0Oo2).OooO0OO(OooO00o5).OooO0Oo(OooO0Oo(OooO0Oo4.OooO0o0())), new AbstractC97441iIIL[]{OooO0Oo(OooO00o3 ? OooO0Oo(OooO0Oo4) : OooO0Oo3.OooO0o0()).OooO0OO(OooO0OO)}, ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o2 == 2) {
                AbstractC97441iIIL r12 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
                boolean OooO00o6 = r12.m21860OooO00o();
                AbstractC97441iIIL OooO0o02 = r0.OooO0o0();
                AbstractC97441iIIL OooO0o03 = OooO0o02.OooO0o0();
                AbstractC97441iIIL OooO00o7 = OooO00o.m15394OooO00o();
                AbstractC97441iIIL OooO0OO3 = OooO00o7.OooO0OO();
                if (OooO0OO3.m21859OooO00o().equals(BigInteger.valueOf(3))) {
                    AbstractC97441iIIL OooO0o04 = OooO00o6 ? r12 : r12.OooO0o0();
                    r9 = OooO0OO(r32.OooO00o(OooO0o04).OooO0OO(r32.OooO0Oo(OooO0o04)));
                    r3 = OooO0o02.OooO0OO(r32);
                } else {
                    AbstractC97441iIIL OooO0OO4 = OooO0OO(r32.OooO0o0());
                    if (!OooO00o6) {
                        if (!OooO00o7.m21863OooO0O0()) {
                            AbstractC97441iIIL OooO0o05 = r12.OooO0o0().OooO0o0();
                            if (OooO0OO3.OooO00o() < OooO00o7.OooO00o()) {
                                r9 = OooO0OO4.OooO0Oo(OooO0o05.OooO0OO(OooO0OO3));
                            } else {
                                OooO00o7 = OooO0o05.OooO0OO(OooO00o7);
                            }
                        } else {
                            r9 = OooO0OO4;
                        }
                        r3 = r32.OooO0OO(OooO0o02);
                    }
                    r9 = OooO0OO4.OooO00o(OooO00o7);
                    r3 = r32.OooO0OO(OooO0o02);
                }
                AbstractC97441iIIL OooO0O03 = OooO0O0(r3);
                AbstractC97441iIIL OooO0Oo5 = r9.OooO0o0().OooO0Oo(OooO0Oo(OooO0O03));
                AbstractC97441iIIL OooO0Oo6 = OooO0O03.OooO0Oo(OooO0Oo5).OooO0OO(r9).OooO0Oo(OooO00o(OooO0o03));
                AbstractC97441iIIL OooO0Oo7 = OooO0Oo(r0);
                if (!OooO00o6) {
                    OooO0Oo7 = OooO0Oo7.OooO0OO(r12);
                }
                return new C9740OooO0o0(OooO00o, OooO0Oo5, OooO0Oo6, new AbstractC97441iIIL[]{OooO0Oo7}, ((AbstractC9738llL1L) this).f23371OooO00o);
            } else if (OooO00o2 == 4) {
                return OooO00o(true);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
        public AbstractC9738llL1L OooO0o0() {
            if (m21814OooO0OO()) {
                return this;
            }
            AbstractC97441iIIL r0 = this.f23373OooO0O0;
            if (r0.m21863OooO0O0()) {
                return this;
            }
            IIiLIli OooO00o = m21800OooO00o();
            int OooO00o2 = OooO00o.m15387OooO00o();
            if (OooO00o2 != 0) {
                return OooO00o2 != 4 ? OooO0o().OooO00o((AbstractC9738llL1L) this) : OooO00o(false).OooO00o((AbstractC9738llL1L) this);
            }
            AbstractC97441iIIL r2 = ((AbstractC9738llL1L) this).f23369OooO00o;
            AbstractC97441iIIL OooO0Oo = OooO0Oo(r0);
            AbstractC97441iIIL OooO0o0 = OooO0Oo.OooO0o0();
            AbstractC97441iIIL OooO00o3 = OooO0OO(r2.OooO0o0()).OooO00o(m21800OooO00o().m15394OooO00o());
            AbstractC97441iIIL OooO0Oo2 = OooO0OO(r2).OooO0OO(OooO0o0).OooO0Oo(OooO00o3.OooO0o0());
            if (OooO0Oo2.m21863OooO0O0()) {
                return m21800OooO00o().m15393OooO00o();
            }
            AbstractC97441iIIL OooO0O0 = OooO0Oo2.OooO0OO(OooO0Oo).m21862OooO0O0();
            AbstractC97441iIIL OooO0OO = OooO0Oo2.OooO0OO(OooO0O0).OooO0OO(OooO00o3);
            AbstractC97441iIIL OooO0Oo3 = OooO0o0.OooO0o0().OooO0OO(OooO0O0).OooO0Oo(OooO0OO);
            AbstractC97441iIIL OooO00o4 = OooO0Oo3.OooO0Oo(OooO0OO).OooO0OO(OooO0OO.OooO00o(OooO0Oo3)).OooO00o(r2);
            return new C9740OooO0o0(OooO00o, OooO00o4, r2.OooO0Oo(OooO00o4).OooO0OO(OooO0Oo3).OooO0Oo(r0), ((AbstractC9738llL1L) this).f23371OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
        public AbstractC97441iIIL OooO0oO() {
            AbstractC97441iIIL[] r0 = ((AbstractC9738llL1L) this).f23372OooO00o;
            AbstractC97441iIIL r2 = r0[1];
            if (r2 != null) {
                return r2;
            }
            AbstractC97441iIIL OooO00o = OooO00o(r0[0], (AbstractC97441iIIL) null);
            r0[1] = OooO00o;
            return OooO00o;
        }
    }

    public AbstractC9738llL1L(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, OooO00o(r2));
    }

    public AbstractC9738llL1L(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, AbstractC97441iIIL[] r5) {
        this.f23370OooO00o = null;
        this.OooO00o = r2;
        this.f23369OooO00o = r3;
        this.f23373OooO0O0 = r4;
        this.f23372OooO00o = r5;
    }

    public static AbstractC97441iIIL[] OooO00o(IIiLIli r6) {
        int OooO00o2 = r6 == null ? 0 : r6.m15387OooO00o();
        if (OooO00o2 == 0 || OooO00o2 == 5) {
            return OooO0O0;
        }
        AbstractC97441iIIL OooO00o3 = r6.OooO00o(AbstractC5490IlLL.OooO0O0);
        if (!(OooO00o2 == 1 || OooO00o2 == 2)) {
            if (OooO00o2 == 3) {
                return new AbstractC97441iIIL[]{OooO00o3, OooO00o3, OooO00o3};
            } else if (OooO00o2 == 4) {
                return new AbstractC97441iIIL[]{OooO00o3, r6.m15394OooO00o()};
            } else if (OooO00o2 != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new AbstractC97441iIIL[]{OooO00o3};
    }

    public int OooO00o() {
        IIiLIli r0 = this.OooO00o;
        if (r0 == null) {
            return 0;
        }
        return r0.m15387OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public IIiLIli m21800OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC9738llL1L m21801OooO00o();

    public AbstractC9738llL1L OooO00o(int i) {
        if (i >= 0) {
            AbstractC9738llL1L r0 = this;
            while (true) {
                i--;
                if (i < 0) {
                    return r0;
                }
                r0 = r0.OooO0o();
            }
        } else {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
    }

    public abstract AbstractC9738llL1L OooO00o(AbstractC9738llL1L v);

    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r3) {
        int OooO00o2 = OooO00o();
        if (OooO00o2 != 1) {
            if (OooO00o2 == 2 || OooO00o2 == 3 || OooO00o2 == 4) {
                AbstractC97441iIIL OooO0o0 = r3.OooO0o0();
                return OooO00o(OooO0o0, OooO0o0.OooO0OO(r3));
            } else if (OooO00o2 != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return OooO00o(r3, r3);
    }

    public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        return m21800OooO00o().OooO00o(m21813OooO0OO().OooO0OO(r3), m21815OooO0Oo().OooO0OO(r4), this.f23371OooO00o);
    }

    public AbstractC9738llL1L OooO00o(BigInteger bigInteger) {
        return m21800OooO00o().m15399OooO0O0().OooO00o(this, bigInteger);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC97441iIIL m21802OooO00o() {
        m21804OooO00o();
        return m21819OooO0o0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC97441iIIL m21803OooO00o(int i) {
        if (i >= 0) {
            AbstractC97441iIIL[] r0 = this.f23372OooO00o;
            if (i < r0.length) {
                return r0[i];
            }
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21804OooO00o() {
        if (!m21816OooO0Oo()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m21805OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21806OooO00o(AbstractC9738llL1L r9) {
        AbstractC9738llL1L r1;
        if (r9 == null) {
            return false;
        }
        IIiLIli OooO00o2 = m21800OooO00o();
        IIiLIli OooO00o3 = r9.m21800OooO00o();
        boolean z = OooO00o2 == null;
        boolean z2 = OooO00o3 == null;
        boolean OooO0OO2 = m21814OooO0OO();
        boolean OooO0OO3 = r9.m21814OooO0OO();
        if (!OooO0OO2 && !OooO0OO3) {
            if (!z || !z2) {
                if (z) {
                    r9 = r9.OooO0Oo();
                } else {
                    if (z2) {
                        r1 = OooO0Oo();
                    } else if (!OooO00o2.OooO00o(OooO00o3)) {
                        return false;
                    } else {
                        AbstractC9738llL1L[] r2 = {this, OooO00o2.OooO00o(r9)};
                        OooO00o2.OooO0O0(r2);
                        r1 = r2[0];
                        r9 = r2[1];
                    }
                    return r1.m21819OooO0o0().equals(r9.m21819OooO0o0()) && r1.m21817OooO0o().equals(r9.m21817OooO0o());
                }
            }
            r1 = this;
            if (r1.m21819OooO0o0().equals(r9.m21819OooO0o0())) {
                return false;
            }
        } else if (!OooO0OO2 || !OooO0OO3) {
            return false;
        } else {
            return z || z2 || OooO00o2.OooO00o(OooO00o3);
        }
    }

    public boolean OooO00o(boolean z) {
        if (m21814OooO0OO()) {
            return true;
        }
        return !((C6622lLlL1) m21800OooO00o().OooO00o(this, C6622lLlL1.OooO00o, new OooO00o(z))).m17709OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21807OooO00o() {
        return m21808OooO00o(this.f23371OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21808OooO00o(boolean z) {
        if (m21814OooO0OO()) {
            return new byte[1];
        }
        AbstractC9738llL1L OooO0Oo = OooO0Oo();
        byte[] OooO00o2 = OooO0Oo.m21819OooO0o0().m21861OooO00o();
        if (z) {
            byte[] bArr = new byte[(OooO00o2.length + 1)];
            bArr[0] = (byte) (OooO0Oo.m21805OooO00o() ? 3 : 2);
            System.arraycopy(OooO00o2, 0, bArr, 1, OooO00o2.length);
            return bArr;
        }
        byte[] OooO00o3 = OooO0Oo.m21817OooO0o().m21861OooO00o();
        byte[] bArr2 = new byte[(OooO00o2.length + OooO00o3.length + 1)];
        bArr2[0] = 4;
        System.arraycopy(OooO00o2, 0, bArr2, 1, OooO00o2.length);
        System.arraycopy(OooO00o3, 0, bArr2, OooO00o2.length + 1, OooO00o3.length);
        return bArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final AbstractC97441iIIL[] m21809OooO00o() {
        return this.f23372OooO00o;
    }

    public final AbstractC9738llL1L OooO0O0() {
        return OooO0Oo().m21801OooO00o();
    }

    public abstract AbstractC9738llL1L OooO0O0(AbstractC9738llL1L v);

    public AbstractC9738llL1L OooO0O0(AbstractC97441iIIL r5) {
        return m21814OooO0OO() ? this : m21800OooO00o().OooO00o(m21813OooO0OO().OooO0OO(r5), m21815OooO0Oo(), m21809OooO00o(), this.f23371OooO00o);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m21810OooO0O0() {
        m21804OooO00o();
        return m21817OooO0o();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21811OooO0O0() {
        return this.f23371OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL[] m21812OooO0O0() {
        AbstractC97441iIIL[] r0 = this.f23372OooO00o;
        int length = r0.length;
        if (length == 0) {
            return OooO0O0;
        }
        AbstractC97441iIIL[] r2 = new AbstractC97441iIIL[length];
        System.arraycopy(r0, 0, r2, 0, length);
        return r2;
    }

    public abstract AbstractC9738llL1L OooO0OO();

    public AbstractC9738llL1L OooO0OO(AbstractC9738llL1L r2) {
        return OooO0o().OooO00o(r2);
    }

    public AbstractC9738llL1L OooO0OO(AbstractC97441iIIL r5) {
        return m21814OooO0OO() ? this : m21800OooO00o().OooO00o(m21813OooO0OO(), m21815OooO0Oo().OooO0OO(r5), m21809OooO00o(), this.f23371OooO00o);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public final AbstractC97441iIIL m21813OooO0OO() {
        return this.f23369OooO00o;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21814OooO0OO() {
        if (!(this.f23369OooO00o == null || this.f23373OooO0O0 == null)) {
            AbstractC97441iIIL[] r0 = this.f23372OooO00o;
            if (r0.length <= 0 || !r0[0].m21863OooO0O0()) {
                return false;
            }
        }
        return true;
    }

    public AbstractC9738llL1L OooO0Oo() {
        int OooO00o2;
        if (m21814OooO0OO() || (OooO00o2 = OooO00o()) == 0 || OooO00o2 == 5) {
            return this;
        }
        AbstractC97441iIIL OooO00o3 = m21803OooO00o(0);
        return OooO00o3.m21860OooO00o() ? this : OooO00o(OooO00o3.m21862OooO0O0());
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public final AbstractC97441iIIL m21815OooO0Oo() {
        return this.f23373OooO0O0;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m21816OooO0Oo() {
        int OooO00o2 = OooO00o();
        return OooO00o2 == 0 || OooO00o2 == 5 || m21814OooO0OO() || this.f23372OooO00o[0].m21860OooO00o();
    }

    public abstract AbstractC9738llL1L OooO0o();

    /* renamed from: OooO0o  reason: collision with other method in class */
    public AbstractC97441iIIL m21817OooO0o() {
        return this.f23373OooO0O0;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m21818OooO0o() {
        return OooO00o(false);
    }

    public AbstractC9738llL1L OooO0o0() {
        return OooO0OO(this);
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public AbstractC97441iIIL m21819OooO0o0() {
        return this.f23369OooO00o;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m21820OooO0o0() {
        return OooO00o(true);
    }

    public abstract boolean OooO0oO();

    public boolean OooO0oo() {
        BigInteger OooO0O02;
        return AbstractC5490IlLL.OooO0O0.equals(this.OooO00o.m15395OooO00o()) || (OooO0O02 = this.OooO00o.m15401OooO0O0()) == null || Lii1I.OooO00o(this, OooO0O02).m21814OooO0OO();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9738llL1L)) {
            return false;
        }
        return m21806OooO00o((AbstractC9738llL1L) obj);
    }

    public int hashCode() {
        IIiLIli OooO00o2 = m21800OooO00o();
        int hashCode = OooO00o2 == null ? 0 : OooO00o2.hashCode() ^ -1;
        if (m21814OooO0OO()) {
            return hashCode;
        }
        AbstractC9738llL1L OooO0Oo = OooO0Oo();
        return (hashCode ^ (OooO0Oo.m21819OooO0o0().hashCode() * 17)) ^ (OooO0Oo.m21817OooO0o().hashCode() * 257);
    }

    public String toString() {
        if (m21814OooO0OO()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(m21813OooO0OO());
        stringBuffer.append(AbstractC1299b.COMMA);
        stringBuffer.append(m21815OooO0Oo());
        for (int i = 0; i < this.f23372OooO00o.length; i++) {
            stringBuffer.append(AbstractC1299b.COMMA);
            stringBuffer.append(this.f23372OooO00o[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }
}
