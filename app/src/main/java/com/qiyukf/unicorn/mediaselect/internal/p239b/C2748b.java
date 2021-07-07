package com.qiyukf.unicorn.mediaselect.internal.p239b;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.p118pd.sdk.C7213o00oo;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2739a;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.b.b */
public final class C2748b extends C7213o00oo {

    /* renamed from: a */
    public static final Uri f5702a = MediaStore.Files.getContentUri("external");

    /* renamed from: b */
    public static final String[] f5703b = {C3848l.f10389g, "_display_name", "mime_type", "_size", "duration"};

    /* renamed from: c */
    public static final String[] f5704c = {"1", "3"};

    /* renamed from: d */
    public final boolean f5705d;

    public C2748b(Context context, String str, String[] strArr, boolean z) {
        super(context, f5702a, f5703b, str, strArr, "datetaken DESC");
        this.f5705d = z;
    }

    /* renamed from: a */
    public static C7213o00oo m6348a(Context context, C2739a aVar, boolean z) {
        String[] strArr;
        String str = "media_type=? AND _size>0";
        if (!aVar.mo36507e()) {
            if (C2745e.m6339a().mo36520e()) {
                strArr = m6350a(1, aVar.mo36501a());
            } else {
                boolean f = C2745e.m6339a().mo36521f();
                String a = aVar.mo36501a();
                if (f) {
                    strArr = m6350a(3, a);
                } else {
                    str = "(media_type=? OR media_type=?) AND  bucket_id=? AND _size>0";
                    strArr = new String[]{"1", "3", a};
                    z = false;
                }
            }
            str = "media_type=? AND  bucket_id=? AND _size>0";
            z = false;
        } else if (C2745e.m6339a().mo36520e()) {
            strArr = m6349a(1);
        } else if (C2745e.m6339a().mo36521f()) {
            strArr = m6349a(3);
        } else {
            strArr = f5704c;
            str = "(media_type=? OR media_type=?) AND _size>0";
        }
        return new C2748b(context, str, strArr, z);
    }

    /* renamed from: a */
    public static String[] m6349a(int i) {
        return new String[]{String.valueOf(i)};
    }

    /* renamed from: a */
    public static String[] m6350a(int i, String str) {
        return new String[]{String.valueOf(i), str};
    }

    @Override // com.p118pd.sdk.C7213o00oo, com.p118pd.sdk.C7213o00oo, com.p118pd.sdk.AbstractC7324o0O0o
    public final Cursor loadInBackground() {
        Cursor loadInBackground = super.loadInBackground();
        if (!this.f5705d || !getContext().getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            return loadInBackground;
        }
        MatrixCursor matrixCursor = new MatrixCursor(f5703b);
        matrixCursor.addRow(new Object[]{-1L, "Capture", "", 0, 0});
        return new MergeCursor(new Cursor[]{matrixCursor, loadInBackground});
    }

    @Override // com.p118pd.sdk.C7226o00ooO00
    public final void onContentChanged() {
    }
}
