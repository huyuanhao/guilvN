package com.p118pd.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: com.pd.sdk.o00o0OO0  reason: case insensitive filesystem */
public class C7160o00o0OO0 {
    public static final int OooO00o = 512;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19557OooO00o = "DocumentFile";

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m18579OooO00o(Context context, Uri uri) {
        return OooO00o(context, uri, "_display_name", (String) null);
    }

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static String m18581OooO0O0(Context context, Uri uri) {
        return OooO00o(context, uri, "mime_type", (String) null);
    }

    @Nullable
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static String m18583OooO0OO(Context context, Uri uri) {
        String OooO0O0 = m18581OooO0O0(context, uri);
        if ("vnd.android.document/directory".equals(OooO0O0)) {
            return null;
        }
        return OooO0O0;
    }

    public static boolean OooO0Oo(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m18581OooO0O0(context, uri));
    }

    public static boolean OooO0o(Context context, Uri uri) {
        if (DocumentsContract.isDocumentUri(context, uri) && (OooO00o(context, uri) & 512) != 0) {
            return true;
        }
        return false;
    }

    public static boolean OooO0o0(Context context, Uri uri) {
        String OooO0O0 = m18581OooO0O0(context, uri);
        return !"vnd.android.document/directory".equals(OooO0O0) && !TextUtils.isEmpty(OooO0O0);
    }

    public static long OooO00o(Context context, Uri uri) {
        return OooO00o(context, uri, "flags", 0L);
    }

    public static long OooO0O0(Context context, Uri uri) {
        return OooO00o(context, uri, "last_modified", 0L);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18580OooO00o(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m18581OooO0O0(context, uri));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m18582OooO0O0(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String OooO0O0 = m18581OooO0O0(context, uri);
        int OooO00o2 = OooO00o(context, uri, "flags", 0);
        if (TextUtils.isEmpty(OooO0O0)) {
            return false;
        }
        if ((OooO00o2 & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(OooO0O0) && (OooO00o2 & 8) != 0) {
            return true;
        }
        if (TextUtils.isEmpty(OooO0O0) || (OooO00o2 & 2) == 0) {
            return false;
        }
        return true;
    }

    public static long OooO0OO(Context context, Uri uri) {
        return OooO00o(context, uri, "_size", 0L);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m18584OooO0OO(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = true;
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
            if (cursor.getCount() <= 0) {
                z = false;
            }
            return z;
        } catch (Exception e) {
            String str = "Failed query: " + e;
            return false;
        } finally {
            OooO00o(cursor);
        }
    }

    @Nullable
    public static String OooO00o(Context context, Uri uri, String str, @Nullable String str2) {
        AutoCloseable autoCloseable = null;
        try {
            autoCloseable = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            if (autoCloseable.moveToFirst() && !autoCloseable.isNull(0)) {
                return autoCloseable.getString(0);
            }
            OooO00o(autoCloseable);
            return str2;
        } catch (Exception e) {
            String str3 = "Failed query: " + e;
            return str2;
        } finally {
            OooO00o(autoCloseable);
        }
    }

    public static int OooO00o(Context context, Uri uri, String str, int i) {
        return (int) OooO00o(context, uri, str, (long) i);
    }

    public static long OooO00o(Context context, Uri uri, String str, long j) {
        AutoCloseable autoCloseable = null;
        try {
            autoCloseable = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            if (autoCloseable.moveToFirst() && !autoCloseable.isNull(0)) {
                return autoCloseable.getLong(0);
            }
            OooO00o(autoCloseable);
            return j;
        } catch (Exception e) {
            String str2 = "Failed query: " + e;
            return j;
        } finally {
            OooO00o(autoCloseable);
        }
    }

    public static void OooO00o(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
