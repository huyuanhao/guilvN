package com.huawei.updatesdk.fileprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.FileNotFoundException;
import s.h.e.l.l.C;

public class UpdateSdkFileProvider extends ContentProvider {
    public static final String AUTHORITIES_SUFFIX = ".updateSdk.fileProvider";
    public static final String[] COLUMNS = {"_display_name", "_size"};
    public static final String TAG = "UpdateSdkFileProvider";
    public static AbstractC1271a mWStrategy;
    public String authority;

    static {
        C.i(16777252);
    }

    public static native File buildPath(File file, String... strArr);

    public static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public static synchronized AbstractC1271a createWiseDistPathStrategy(Context context, String str) {
        AbstractC1271a aVar;
        synchronized (UpdateSdkFileProvider.class) {
            if (mWStrategy == null) {
                mWStrategy = new C1272b(str);
                if (context.getFilesDir() != null) {
                    mWStrategy.mo15877a("updatesdkapk", buildPath(context.getFilesDir(), C8932ooOOO0o.OooO0OO));
                }
            }
            aVar = mWStrategy;
        }
        return aVar;
    }

    public static native Uri getUriForFile(Context context, String str, File file);

    public native void attachInfo(Context context, ProviderInfo providerInfo);

    public native int delete(Uri uri, String str, String[] strArr);

    public native String getType(Uri uri);

    public native Uri insert(Uri uri, ContentValues contentValues);

    public native boolean onCreate();

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (uri == null || uri.getAuthority() == null || !uri.getAuthority().equals(this.authority)) {
            return null;
        }
        File a = mWStrategy.mo15876a(uri);
        if (a.getName().endsWith("apk")) {
            return ParcelFileDescriptor.open(a, CommonNetImpl.FLAG_AUTH);
        }
        C1278a.m1584d(TAG, "can not open this file.");
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File a = mWStrategy.mo15876a(uri);
        if (strArr == null) {
            strArr = COLUMNS;
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
        String[] copyOf = copyOf(strArr3, i2);
        Object[] copyOf2 = copyOf(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    public native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);
}
