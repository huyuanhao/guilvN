package com.baidu.idl.facesdk;

import android.content.Context;
import android.text.TextUtils;

public class BDFaceUtils {
    public static boolean hasModel(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                if (context.getAssets().open(str) != null) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
