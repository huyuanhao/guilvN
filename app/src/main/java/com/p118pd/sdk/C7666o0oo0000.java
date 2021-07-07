package com.p118pd.sdk;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.o0oo0000  reason: case insensitive filesystem */
public class C7666o0oo0000 extends AbstractC7656o0oOooO<ParcelFileDescriptor> {
    public C7666o0oo0000(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.p118pd.sdk.AbstractC7656o0oOooO
    public ParcelFileDescriptor OooO00o(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    public void OooO00o(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7656o0oOooO, com.p118pd.sdk.AbstractC7656o0oOooO
    @NonNull
    public Class<ParcelFileDescriptor> OooO00o() {
        return ParcelFileDescriptor.class;
    }
}
