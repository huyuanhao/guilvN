package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.p292io.pem.PemGenerationException;

/* renamed from: com.pd.sdk.ILL1LlLl */
public class ILL1LlLl implements LliILl1 {
    public static final LlLI1 OooO = AbstractC5711LiLli.o000o0oO;

    /* renamed from: OooO  reason: collision with other field name */
    public static final C6456l1ilL f15579OooO = new C6456l1ilL(AbstractC5905LllI.OooOOo0, C6452l1Lll.OooO00o);
    public static final LlLI1 OooO00o = AbstractC5905LllI.OooOo0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C6456l1ilL f15580OooO00o = new C6456l1ilL(AbstractC5711LiLli.Oooooo, C6452l1Lll.OooO00o);
    public static final LlLI1 OooO0O0 = AbstractC5905LllI.OooOoo;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final C6456l1ilL f15581OooO0O0 = new C6456l1ilL(AbstractC5711LiLli.OoooooO, C6452l1Lll.OooO00o);
    public static final LlLI1 OooO0OO = AbstractC5905LllI.Oooo0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final C6456l1ilL f15582OooO0OO = new C6456l1ilL(AbstractC5711LiLli.Ooooooo, C6452l1Lll.OooO00o);
    public static final LlLI1 OooO0Oo = AbstractC5711LiLli.OoooOoo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final C6456l1ilL f15583OooO0Oo = new C6456l1ilL(AbstractC5711LiLli.o0OoOo0, C6452l1Lll.OooO00o);
    public static final LlLI1 OooO0o = AbstractC5711LiLli.o000o0Oo;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final C6456l1ilL f15584OooO0o = new C6456l1ilL(AbstractC5331ILi.OooO0OO, C6452l1Lll.OooO00o);
    public static final LlLI1 OooO0o0 = AbstractC5711LiLli.o000o0OO;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final C6456l1ilL f15585OooO0o0 = new C6456l1ilL(AbstractC5711LiLli.ooOO, C6452l1Lll.OooO00o);
    public static final LlLI1 OooO0oO = AbstractC5711LiLli.o000o0o0;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final C6456l1ilL f15586OooO0oO = new C6456l1ilL(AbstractC5905LllI.OooOOOO, C6452l1Lll.OooO00o);
    public static final LlLI1 OooO0oo = AbstractC5711LiLli.o000o0o;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final C6456l1ilL f15587OooO0oo = new C6456l1ilL(AbstractC5905LllI.OooOOOo, C6452l1Lll.OooO00o);
    public static final LlLI1 OooOO0 = AbstractC5711LiLli.o000o0oo;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final C6456l1ilL f15588OooOO0 = new C6456l1ilL(AbstractC5905LllI.OooOOo, C6452l1Lll.OooO00o);

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5464IlilIi f15589OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5650LIL f15590OooO00o;

    public ILL1LlLl(C5464IlilIi r1, AbstractC5650LIL r2) {
        this.f15589OooO00o = r1;
        this.f15590OooO00o = r2;
    }

    private C11L1L OooO00o(C5464IlilIi r3, AbstractC5650LIL r4) throws PemGenerationException {
        try {
            byte[] encoded = r3.getEncoded();
            if (r4 == null) {
                return new C11L1L("PRIVATE KEY", encoded);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream OooO00o2 = r4.OooO00o(byteArrayOutputStream);
            OooO00o2.write(r3.getEncoded());
            OooO00o2.close();
            return new C11L1L("ENCRYPTED PRIVATE KEY", new C6845lLIL(r4.m16163OooO00o(), byteArrayOutputStream.toByteArray()).getEncoded());
        } catch (IOException e) {
            throw new PemGenerationException("unable to process encoded key data: " + e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.LliILl1
    public C11L1L OooO00o() throws PemGenerationException {
        AbstractC5650LIL r0 = this.f15590OooO00o;
        return r0 != null ? OooO00o(this.f15589OooO00o, r0) : OooO00o(this.f15589OooO00o, null);
    }
}
