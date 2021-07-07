package com.p118pd.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.pd.sdk.oO0O0OOo  reason: case insensitive filesystem */
public class C7845oO0O0OOo implements AbstractC7650o0oOoOoO<Uri, Drawable> {
    public static final int OooO00o = 2;
    public static final int OooO0O0 = 0;
    public static final int OooO0OO = 1;
    public static final int OooO0Oo = 1;
    public static final int OooO0o0 = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f20903OooO00o;

    public C7845oO0O0OOo(Context context) {
        this.f20903OooO00o = context.getApplicationContext();
    }

    public boolean OooO00o(@NonNull Uri uri, @NonNull C7648o0oOoOo o0ooooo) {
        return uri.getScheme().equals("android.resource");
    }

    @Nullable
    public AbstractC7700o0oo0oo0<Drawable> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        int OooO00o2 = OooO00o(uri);
        String authority = uri.getAuthority();
        return oO00O0oO.OooO00o(oO00O0o0.OooO00o(this.f20903OooO00o, authority.equals(this.f20903OooO00o.getPackageName()) ? this.f20903OooO00o : OooO00o(uri, authority), OooO00o2));
    }

    @NonNull
    private Context OooO00o(Uri uri, String str) {
        try {
            return this.f20903OooO00o.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    @DrawableRes
    private int OooO00o(Uri uri) {
        Integer num;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String authority = uri.getAuthority();
            String str = pathSegments.get(1);
            num = Integer.valueOf(this.f20903OooO00o.getResources().getIdentifier(str, pathSegments.get(0), authority));
        } else {
            if (pathSegments.size() == 1) {
                try {
                    num = Integer.valueOf(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            num = null;
        }
        if (num == null) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
        } else if (num.intValue() != 0) {
            return num.intValue();
        } else {
            throw new IllegalArgumentException("Failed to obtain resource id for: " + uri);
        }
    }
}
