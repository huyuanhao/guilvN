package com.google.firebase.iid;

import com.p118pd.sdk.C7491o0OoOOO;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public final class zza {
    public static KeyPair zzb() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(C7491o0OoOOO.OooO00o);
            instance.initialize(2048);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
