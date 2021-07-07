package com.p118pd.sdk;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.pd.sdk.o0oOoo  reason: case insensitive filesystem */
public final class C7652o0oOoo extends AbstractC7670o0oo00OO<AssetFileDescriptor> {
    public C7652o0oOoo(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.p118pd.sdk.AbstractC7670o0oo00OO
    public AssetFileDescriptor OooO00o(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    public void OooO00o(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7670o0oo00OO, com.p118pd.sdk.AbstractC7670o0oo00OO
    @NonNull
    public Class<AssetFileDescriptor> OooO00o() {
        return AssetFileDescriptor.class;
    }
}
