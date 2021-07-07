package com.p118pd.sdk;

import android.graphics.Typeface;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.ReactFontManager;

/* renamed from: com.pd.sdk.oOoOo  reason: case insensitive filesystem */
public class C8359oOoOo {
    public static Typeface OooO00o(AbstractC8194oOOo0OoO oooo0ooo, ReadableMap readableMap) {
        String string = readableMap.getString("fontFamily");
        int i = 0;
        boolean equals = C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "fontStyle") ? "italic".equals(readableMap.getString("fontStyle")) : false;
        boolean equals2 = C8368oOoOo0o0.OooO00o(readableMap, ReadableType.String, "fontWeight") ? "bold".equals(readableMap.getString("fontWeight")) : false;
        if (equals && equals2) {
            i = 3;
        } else if (equals) {
            i = 2;
        } else if (equals2) {
            i = 1;
        }
        return ReactFontManager.getInstance().getTypeface(string, i, oooo0ooo.getContext().getAssets());
    }
}
