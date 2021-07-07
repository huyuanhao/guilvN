package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.iILii  reason: case insensitive filesystem */
public class C6097iILii {
    public I1Iili1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f17530OooO00o;

    public C6097iILii(InputStream inputStream) throws CMSException {
        this.f17530OooO00o = inputStream;
        try {
            AbstractC9685lL r3 = (AbstractC9685lL) new C9727l(inputStream).m21778OooO00o();
            if (r3 != null) {
                this.OooO00o = new I1Iili1(r3);
                return;
            }
            throw new CMSException("No content found.");
        } catch (IOException e) {
            throw new CMSException("IOException reading content.", e);
        } catch (ClassCastException e2) {
            throw new CMSException("Unexpected object reading content.", e2);
        }
    }

    public void OooO00o() throws IOException {
        this.f17530OooO00o.close();
    }
}
