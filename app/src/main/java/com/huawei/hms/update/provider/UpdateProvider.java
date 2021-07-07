package com.huawei.hms.update.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.FileNotFoundException;
import s.h.e.l.l.C;

public class UpdateProvider extends ContentProvider {
    public static final String AUTHORITIES_SUFFIX = ".hms.update.provider";

    /* renamed from: a */
    public static final String[] f1411a = {"_display_name", "_size"};

    /* renamed from: b */
    public static C1266a f1412b = new C1266a();

    static {
        C.i(16777251);
    }

    /* renamed from: a */
    public static int m1512a(String str) {
        if ("r".equals(str)) {
            return CommonNetImpl.FLAG_AUTH;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public static native File getLocalFile(Context context, String str);

    public static native Uri getUriForFile(Context context, String str, File file);

    public native void attachInfo(Context context, ProviderInfo providerInfo);

    public native int delete(Uri uri, String str, String[] strArr);

    public native String getType(Uri uri);

    public native Uri insert(Uri uri, ContentValues contentValues);

    public native boolean onCreate();

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(f1412b.mo15827a(uri), m1512a(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a = f1412b.mo15827a(uri);
        if (strArr == null) {
            strArr = f1411a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(a.length());
            }
            i2 = i;
        }
        String[] a2 = m1514a(strArr3, i2);
        Object[] a3 = m1513a(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(a2, 1);
        matrixCursor.addRow(a3);
        return matrixCursor;
    }

    public native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);

    /* renamed from: a */
    public static String[] m1514a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: a */
    public static Object[] m1513a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }
}
