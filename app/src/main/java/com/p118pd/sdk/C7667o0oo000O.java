package com.p118pd.sdk;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.pd.sdk.o0oo000O  reason: case insensitive filesystem */
public class C7667o0oo000O extends AbstractC7670o0oo00OO<ParcelFileDescriptor> {
    public C7667o0oo000O(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.p118pd.sdk.AbstractC7670o0oo00OO
    public ParcelFileDescriptor OooO00o(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    public void OooO00o(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7670o0oo00OO, com.p118pd.sdk.AbstractC7670o0oo00OO
    @NonNull
    public Class<ParcelFileDescriptor> OooO00o() {
        return ParcelFileDescriptor.class;
    }
}
