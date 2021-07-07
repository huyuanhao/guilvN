package com.p118pd.sdk;

import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.util.p292io.pem.PemGenerationException;

/* renamed from: com.pd.sdk.丨l1  reason: invalid class name and case insensitive filesystem */
public class C9655l1 extends il1LiLLI {
    public C9655l1(Writer writer) {
        super(writer);
    }

    @Override // com.p118pd.sdk.il1LiLLI
    public void OooO00o(LliILl1 lliILl1) throws IOException {
        super.OooO00o(lliILl1);
    }

    public void OooO00o(Object obj) throws IOException {
        OooO00o(obj, null);
    }

    public void OooO00o(Object obj, AbstractC93101ii r3) throws IOException {
        try {
            super.OooO00o((LliILl1) new C9698li11(obj, r3));
        } catch (PemGenerationException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }
}
