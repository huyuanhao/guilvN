package com.p118pd.sdk;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: com.pd.sdk.OoooooO  reason: case insensitive filesystem */
public class C5997OoooooO {
    public static InputConnection OooO00o(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof AbstractC6956o0000OOO) {
                    editorInfo.hintText = ((AbstractC6956o0000OOO) parent).OooO00o();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }
}
