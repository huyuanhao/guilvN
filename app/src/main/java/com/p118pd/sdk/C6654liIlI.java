package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* renamed from: com.pd.sdk.liIlI  reason: case insensitive filesystem */
public class C6654liIlI {
    public C6456l1ilL OooO00o(LlLI1 llLI1, AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        try {
            return new C6456l1ilL(llLI1, AbstractC6122iIlLiL.OooO00o(algorithmParameters.getEncoded()));
        } catch (IOException e) {
            throw new InvalidAlgorithmParameterException("unable to encode parameters object: " + e.getMessage());
        }
    }

    public C6456l1ilL OooO00o(LlLI1 llLI1, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter spec passed.");
        } else if (algorithmParameterSpec.equals(OAEPParameterSpec.DEFAULT)) {
            return new C6456l1ilL(llLI1, new C6496lIIlil(C6496lIIlil.OooO0Oo, C6496lIIlil.OooO0o0, C6496lIIlil.OooO0o));
        } else {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            PSource pSource = oAEPParameterSpec.getPSource();
            if (oAEPParameterSpec.getMGFAlgorithm().equals(OAEPParameterSpec.DEFAULT.getMGFAlgorithm())) {
                return new C6456l1ilL(llLI1, new C6496lIIlil(new C6056i1I().OooO00o(oAEPParameterSpec.getDigestAlgorithm()), new C6456l1ilL(AbstractC5711LiLli.Oooo000, new C6056i1I().OooO00o(((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())), new C6456l1ilL(AbstractC5711LiLli.Oooo00O, new C6487lIIiIlL(((PSource.PSpecified) pSource).getValue()))));
            }
            throw new InvalidAlgorithmParameterException("only " + OAEPParameterSpec.DEFAULT.getMGFAlgorithm() + " mask generator supported.");
        }
    }
}
