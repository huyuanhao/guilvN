package com.qiyukf.nim.uikit.common.media.p147b;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import com.qiyukf.basesdk.p119a.C1709a;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.qiyukf.nim.uikit.common.media.b.a */
public final class C1892a {
    /* renamed from: a */
    public static Cursor m3637a(Context context) {
        String[] strArr = {C3848l.f10389g, "image_id", "_data"};
        try {
            return context.getContentResolver().query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, strArr, null, null, "_id DESC");
        } catch (Exception e) {
            C1709a.m3015b("MediaDAO", "getAllMediaThumbnails exception", e);
            return null;
        }
    }

    /* renamed from: b */
    public static Cursor m3638b(Context context) {
        try {
            return context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, null, null, "date_modified DESC");
        } catch (Exception e) {
            C1709a.m3015b("MediaDAO", "getAllMediaPhotos exception", e);
            return null;
        }
    }
}
