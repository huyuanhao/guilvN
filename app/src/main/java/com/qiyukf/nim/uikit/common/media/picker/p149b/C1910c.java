package com.qiyukf.nim.uikit.common.media.picker.p149b;

import android.text.TextUtils;
import android.util.SparseArray;
import com.qiyukf.basesdk.p119a.C1709a;
import java.io.File;

/* renamed from: com.qiyukf.nim.uikit.common.media.picker.b.c */
public final class C1910c {

    /* renamed from: a */
    public static SparseArray<String> f3582a = new SparseArray<>();

    /* renamed from: a */
    public static String m3665a(int i, String str) {
        SparseArray<String> sparseArray = f3582a;
        if (sparseArray != null && sparseArray.indexOfKey(i) >= 0) {
            try {
                String str2 = f3582a.get(i);
                if (!TextUtils.isEmpty(str2) && new File(str2.substring(7)).exists()) {
                    return str2;
                }
            } catch (Exception e) {
                C1709a.m3015b("getThumbnailWithImageID is error", "thumbFilePath :" + f3582a.get(i), e);
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m3666a() {
        f3582a.clear();
    }

    /* renamed from: a */
    public static void m3667a(Integer num, String str) {
        f3582a.put(num.intValue(), str);
    }
}
