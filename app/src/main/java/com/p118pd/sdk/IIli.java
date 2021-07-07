package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSRuntimeException;

/* renamed from: com.pd.sdk.IIli */
public class IIli extends C5200IILli {
    public final AbstractC6854lLi1LL OooO00o;

    public IIli(LlLI1 llLI1, AbstractC6854lLi1LL r2) throws IOException {
        super(llLI1);
        this.OooO00o = r2;
    }

    private InputStream OooO00o(AbstractC6854lLi1LL r5) throws IOException {
        byte[] OooO00o2 = r5.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o);
        int i = 1;
        while ((OooO00o2[i] & 255) > 127) {
            i++;
        }
        int i2 = i + 1;
        return new ByteArrayInputStream(OooO00o2, i2, OooO00o2.length - i2);
    }

    @Override // com.p118pd.sdk.C5200IILli, com.p118pd.sdk.C5200IILli, com.p118pd.sdk.C5200IILli
    public AbstractC6854lLi1LL OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C5200IILli, com.p118pd.sdk.C5200IILli, com.p118pd.sdk.C5200IILli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m15412OooO00o() {
        try {
            return OooO00o(this.OooO00o);
        } catch (IOException e) {
            throw new CMSRuntimeException("unable to convert content to stream: " + e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.C5200IILli, com.p118pd.sdk.C5200IILli, com.p118pd.sdk.C5200IILli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15413OooO00o() throws IOException {
        OooO00o(this.OooO00o);
    }
}
