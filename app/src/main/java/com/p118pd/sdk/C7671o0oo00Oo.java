package com.p118pd.sdk;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0oo00Oo  reason: case insensitive filesystem */
public class C7671o0oo00Oo extends AbstractC7656o0oOooO<InputStream> {
    public C7671o0oo00Oo(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.p118pd.sdk.AbstractC7656o0oOooO
    public InputStream OooO00o(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    public void OooO00o(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7656o0oOooO, com.p118pd.sdk.AbstractC7656o0oOooO
    @NonNull
    public Class<InputStream> OooO00o() {
        return InputStream.class;
    }
}
