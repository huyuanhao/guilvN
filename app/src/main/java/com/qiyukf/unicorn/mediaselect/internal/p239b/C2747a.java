package com.qiyukf.unicorn.mediaselect.internal.p239b;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.SparseArray;
import com.facebook.react.modules.camera.CameraRollManager;
import com.p118pd.sdk.C7213o00oo;
import com.p118pd.sdk.C8412oOoo0OoO;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2739a;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.b.a */
public final class C2747a extends C7213o00oo {

    /* renamed from: a */
    public static final Uri f5697a = MediaStore.Files.getContentUri("external");

    /* renamed from: b */
    public static final String[] f5698b = {C3848l.f10389g, "bucket_id", "bucket_display_name", "_data", C8412oOoo0OoO.OooO0O0};

    /* renamed from: c */
    public static final String[] f5699c = {C3848l.f10389g, "bucket_id", "bucket_display_name", "_data", "COUNT() AS count"};

    /* renamed from: d */
    public static final String[] f5700d = {C3848l.f10389g, "bucket_id", "bucket_display_name", "_data"};

    /* renamed from: e */
    public static final String[] f5701e = {"1", "3"};

    public C2747a(Context context, String[] strArr, String str, String[] strArr2) {
        super(context, f5697a, strArr, str, strArr2, "datetaken DESC");
    }

    /* renamed from: a */
    public static C7213o00oo m6346a(Context context) {
        String[] strArr;
        String[] strArr2;
        String str = "media_type=? AND _size>0";
        if (Build.VERSION.SDK_INT >= 29) {
            strArr2 = f5700d;
            if (C2745e.m6339a().mo36520e()) {
                strArr = m6347a(1);
            } else if (C2745e.m6339a().mo36521f()) {
                strArr = m6347a(3);
            } else {
                strArr = f5701e;
                str = "(media_type=? OR media_type=?) AND _size>0";
            }
        } else {
            strArr2 = f5699c;
            if (C2745e.m6339a().mo36520e()) {
                strArr = m6347a(1);
            } else if (C2745e.m6339a().mo36521f()) {
                strArr = m6347a(3);
            } else {
                strArr = f5701e;
                str = "(media_type=? OR media_type=?) AND _size>0) GROUP BY (bucket_id";
            }
            str = "media_type=? AND _size>0) GROUP BY (bucket_id";
        }
        return new C2747a(context, strArr2, str, strArr);
    }

    /* renamed from: a */
    public static String[] m6347a(int i) {
        return new String[]{String.valueOf(i)};
    }

    @Override // com.p118pd.sdk.C7213o00oo, com.p118pd.sdk.C7213o00oo, com.p118pd.sdk.AbstractC7324o0O0o
    public final Cursor loadInBackground() {
        Cursor loadInBackground = super.loadInBackground();
        MatrixCursor matrixCursor = new MatrixCursor(f5698b);
        String str = "";
        if (Build.VERSION.SDK_INT < 29) {
            int i = 0;
            if (loadInBackground != null) {
                while (loadInBackground.moveToNext()) {
                    i += loadInBackground.getInt(loadInBackground.getColumnIndex(C8412oOoo0OoO.OooO0O0));
                }
                if (loadInBackground.moveToFirst()) {
                    str = loadInBackground.getString(loadInBackground.getColumnIndex("_data"));
                }
            }
            String str2 = C2739a.f5658a;
            matrixCursor.addRow(new String[]{str2, str2, CameraRollManager.ASSET_TYPE_ALL, str, String.valueOf(i)});
            return new MergeCursor(new Cursor[]{matrixCursor, loadInBackground});
        } else if (loadInBackground == null) {
            return matrixCursor;
        } else {
            SparseArray sparseArray = new SparseArray();
            while (loadInBackground.moveToNext()) {
                int i2 = loadInBackground.getInt(loadInBackground.getColumnIndex("bucket_id"));
                String string = loadInBackground.getString(loadInBackground.getColumnIndex("bucket_display_name"));
                C2739a aVar = (C2739a) sparseArray.get(i2);
                if (aVar == null) {
                    C2739a aVar2 = new C2739a(String.valueOf(i2), str, string, 0);
                    sparseArray.append(i2, aVar2);
                    aVar = aVar2;
                }
                aVar.mo36505d();
            }
            int i3 = 0;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (int) (((long) i3) + ((C2739a) sparseArray.valueAt(i4)).mo36504c());
            }
            if (loadInBackground.moveToFirst()) {
                String string2 = loadInBackground.getString(loadInBackground.getColumnIndex("_data"));
                String str3 = C2739a.f5658a;
                matrixCursor.addRow(new String[]{str3, str3, CameraRollManager.ASSET_TYPE_ALL, string2, String.valueOf(i3)});
            }
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                C2739a aVar3 = (C2739a) sparseArray.valueAt(i5);
                aVar3.mo36504c();
                matrixCursor.addRow(new String[]{aVar3.mo36501a(), aVar3.mo36501a(), aVar3.mo36502a(getContext()), aVar3.mo36503b(), String.valueOf(aVar3.mo36504c())});
            }
            return matrixCursor;
        }
    }

    @Override // com.p118pd.sdk.C7226o00ooO00
    public final void onContentChanged() {
    }
}
