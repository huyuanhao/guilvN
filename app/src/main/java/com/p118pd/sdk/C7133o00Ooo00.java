package com.p118pd.sdk;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00Ooo00  reason: case insensitive filesystem */
public final class C7133o00Ooo00 {
    public static final int OooO00o = 16777216;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19479OooO00o = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f19480OooO00o = new String[0];
    public static final int OooO0O0 = Integer.MIN_VALUE;

    public static void OooO00o(@NonNull EditorInfo editorInfo, @Nullable String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(f19479OooO00o, strArr);
    }

    @NonNull
    public static String[] OooO00o(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f19480OooO00o;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f19480OooO00o;
        }
        String[] stringArray = bundle.getStringArray(f19479OooO00o);
        return stringArray != null ? stringArray : f19480OooO00o;
    }
}
