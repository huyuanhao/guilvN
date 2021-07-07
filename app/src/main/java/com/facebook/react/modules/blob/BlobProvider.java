package com.facebook.react.modules.blob;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.facebook.react.ReactApplication;
import java.io.FileNotFoundException;
import java.io.IOException;
import s.h.e.l.l.C;

public final class BlobProvider extends ContentProvider {
    static {
        C.i(8);
    }

    public native int delete(Uri uri, String str, String[] strArr);

    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public native boolean onCreate();

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (str.equals("r")) {
            Context applicationContext = getContext().getApplicationContext();
            BlobModule blobModule = applicationContext instanceof ReactApplication ? (BlobModule) ((ReactApplication) applicationContext).getReactNativeHost().getReactInstanceManager().getCurrentReactContext().getNativeModule(BlobModule.class) : null;
            if (blobModule != null) {
                byte[] resolve = blobModule.resolve(uri);
                if (resolve != null) {
                    try {
                        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                        autoCloseOutputStream.write(resolve);
                        autoCloseOutputStream.close();
                        return parcelFileDescriptor;
                    } catch (IOException unused) {
                        return null;
                    }
                } else {
                    throw new FileNotFoundException("Cannot open " + uri.toString() + ", blob not found.");
                }
            } else {
                throw new RuntimeException("No blob module associated with BlobProvider");
            }
        } else {
            throw new FileNotFoundException("Cannot open " + uri.toString() + " in mode '" + str + "'");
        }
    }

    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);
}
