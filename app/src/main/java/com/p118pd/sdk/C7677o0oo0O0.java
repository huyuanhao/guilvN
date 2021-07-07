package com.p118pd.sdk;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.pd.sdk.o0oo0O0  reason: case insensitive filesystem */
public class C7677o0oo0O0 {
    public static final String OooO00o = "ThumbStreamOpener";
    public static final C7672o0oo00o OooO0O0 = new C7672o0oo00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ContentResolver f20559OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7672o0oo00o f20560OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7665o0oo0 f20561OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7707o0ooO00O f20562OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<ImageHeaderParser> f20563OooO00o;

    public C7677o0oo0O0(List<ImageHeaderParser> list, AbstractC7665o0oo0 o0oo0, AbstractC7707o0ooO00O o0ooo00o, ContentResolver contentResolver) {
        this(list, OooO0O0, o0oo0, o0ooo00o, contentResolver);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19308OooO00o(Uri uri) {
        InputStream inputStream = null;
        try {
            inputStream = this.f20559OooO00o.openInputStream(uri);
            int OooO00o2 = C7645o0oOoOO0.OooO00o(this.f20563OooO00o, inputStream, this.f20562OooO00o);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return OooO00o2;
        } catch (IOException | NullPointerException unused2) {
            if (Log.isLoggable(OooO00o, 3)) {
                String str = "Failed to open uri: " + uri;
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public C7677o0oo0O0(List<ImageHeaderParser> list, C7672o0oo00o o0oo00o, AbstractC7665o0oo0 o0oo0, AbstractC7707o0ooO00O o0ooo00o, ContentResolver contentResolver) {
        this.f20560OooO00o = o0oo00o;
        this.f20561OooO00o = o0oo0;
        this.f20562OooO00o = o0ooo00o;
        this.f20559OooO00o = contentResolver;
        this.f20563OooO00o = list;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m19309OooO00o(Uri uri) throws FileNotFoundException {
        String OooO00o2 = OooO00o(uri);
        if (TextUtils.isEmpty(OooO00o2)) {
            return null;
        }
        File OooO00o3 = this.f20560OooO00o.OooO00o(OooO00o2);
        if (!OooO00o(OooO00o3)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(OooO00o3);
        try {
            return this.f20559OooO00o.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    @Nullable
    private String OooO00o(@NonNull Uri uri) {
        Cursor OooO00o2 = this.f20561OooO00o.OooO00o(uri);
        if (OooO00o2 != null) {
            try {
                if (OooO00o2.moveToFirst()) {
                    return OooO00o2.getString(0);
                }
            } finally {
                if (OooO00o2 != null) {
                    OooO00o2.close();
                }
            }
        }
        if (OooO00o2 != null) {
            OooO00o2.close();
        }
        return null;
    }

    private boolean OooO00o(File file) {
        return this.f20560OooO00o.m19304OooO00o(file) && 0 < this.f20560OooO00o.OooO00o(file);
    }
}
