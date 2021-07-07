package com.qiyukf.unicorn.mediaselect;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.qiyukf.unicorn.mediaselect.b */
public enum EnumC2731b {
    JPEG("image/jpeg", m6305a(BitmapUtils.IMAGE_KEY_SUFFIX, "jpeg")),
    PNG("image/png", m6305a("png")),
    GIF("image/gif", m6305a("gif")),
    BMP("image/x-ms-bmp", m6305a("bmp")),
    f5640e("image/webp", m6305a("webp")),
    MPEG("video/mpeg", m6305a("mpeg", "mpg")),
    MP4("video/mp4", m6305a("mp4", "m4v")),
    QUICKTIME("video/quicktime", m6305a("mov")),
    THREEGPP("video/3gpp", m6305a("3gp", "3gpp")),
    THREEGPP2("video/3gpp2", m6305a("3g2", "3gpp2")),
    MKV("video/x-matroska", m6305a("mkv")),
    WEBM("video/webm", m6305a("webm")),
    TS("video/mp2ts", m6305a("ts")),
    AVI("video/avi", m6305a("avi"));
    

    /* renamed from: o */
    public final String f5651o;

    /* renamed from: p */
    public final Set<String> f5652p;

    /* access modifiers changed from: public */
    EnumC2731b(String str, Set set) {
        this.f5651o = str;
        this.f5652p = set;
    }

    /* renamed from: a */
    public static Set<EnumC2731b> m6304a() {
        return EnumSet.allOf(EnumC2731b.class);
    }

    /* renamed from: a */
    public static Set<String> m6305a(String... strArr) {
        return new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: a */
    public static boolean m6306a(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(SocializeProtocolConstants.IMAGE);
    }

    /* renamed from: b */
    public static Set<EnumC2731b> m6307b() {
        return EnumSet.of(JPEG, PNG, GIF, BMP, f5640e);
    }

    /* renamed from: b */
    public static boolean m6308b(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video");
    }

    /* renamed from: c */
    public static Set<EnumC2731b> m6309c() {
        return EnumSet.of(MPEG, MP4, QUICKTIME, THREEGPP, THREEGPP2, MKV, WEBM, TS, AVI);
    }

    /* renamed from: c */
    public static boolean m6310c(String str) {
        if (str == null) {
            return false;
        }
        return str.equals(GIF.toString());
    }

    /* renamed from: a */
    public final boolean mo36484a(ContentResolver contentResolver, Uri uri) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri == null) {
            return false;
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
        String str = null;
        boolean z = false;
        for (String str2 : this.f5652p) {
            if (str2.equals(extensionFromMimeType)) {
                return true;
            }
            if (!z) {
                str = C2756c.m6387a(contentResolver, uri);
                if (!TextUtils.isEmpty(str)) {
                    str = str.toLowerCase(Locale.US);
                }
                z = true;
            }
            if (str != null && str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f5651o;
    }
}
