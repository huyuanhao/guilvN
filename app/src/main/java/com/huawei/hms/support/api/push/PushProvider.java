package com.huawei.hms.support.api.push;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.huawei.hms.support.log.C1202a;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import s.h.e.l.l.C;

public class PushProvider extends ContentProvider {
    static {
        C.i(16777250);
    }

    public native int delete(Uri uri, String str, String[] strArr);

    public native String getType(Uri uri);

    public native Uri insert(Uri uri, ContentValues contentValues);

    public native boolean onCreate();

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        C1202a.m1318b("PushSelfShowLog", "use sdk PushProvider openFile");
        if ("xml".equals(getType(uri))) {
            if (Build.VERSION.SDK_INT >= 24) {
                File file = new File(((Context) Objects.requireNonNull(getContext())).createDeviceProtectedStorageContext().getDataDir() + "/shared_prefs/push_notify_flag.xml");
                if (file.exists()) {
                    return ParcelFileDescriptor.open(file, CommonNetImpl.FLAG_AUTH);
                }
                File file2 = new File(getContext().getDataDir() + "/shared_prefs/push_notify_flag.xml");
                if (file2.exists()) {
                    return ParcelFileDescriptor.open(file2, CommonNetImpl.FLAG_AUTH);
                }
            } else {
                String str2 = getContext().getFilesDir() + "";
                if (!TextUtils.isEmpty(str2)) {
                    File file3 = new File(str2.substring(0, str2.length() - 6) + "/shared_prefs/push_notify_flag.xml");
                    if (file3.exists()) {
                        return ParcelFileDescriptor.open(file3, CommonNetImpl.FLAG_AUTH);
                    }
                }
            }
            throw new FileNotFoundException(uri.getPath());
        }
        C1202a.m1319c("PushSelfShowLog", "Incorrect file uri");
        throw new FileNotFoundException(uri.getPath());
    }

    public native Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    public native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);
}
