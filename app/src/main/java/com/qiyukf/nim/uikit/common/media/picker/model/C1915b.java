package com.qiyukf.nim.uikit.common.media.picker.model;

import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.common.media.picker.model.b */
public final class C1915b {
    /* renamed from: a */
    public static Intent m3689a(List<PhotoInfo> list, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("photo_list", new ArrayList(list));
        intent.putExtra("is_original", z);
        return intent;
    }

    /* renamed from: a */
    public static List<PhotoInfo> m3690a(Intent intent) {
        return m3691a(intent.getSerializableExtra("photo_list"));
    }

    /* renamed from: a */
    public static List<PhotoInfo> m3691a(Serializable serializable) {
        if (serializable == null || !(serializable instanceof List)) {
            return null;
        }
        return (List) serializable;
    }

    /* renamed from: b */
    public static List<PhotoInfo> m3692b(Intent intent) {
        return m3691a(intent.getSerializableExtra("selected_photo_list"));
    }
}
