package com.oblador.vectoricons;

import android.graphics.Typeface;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.HashMap;
import java.util.Map;

public class VectorIconsModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "RNVectorIconsModule";
    public static final Map<String, Typeface> sTypefaceCache = new HashMap();

    public VectorIconsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x014c A[SYNTHETIC, Splitter:B:24:0x014c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0169 A[SYNTHETIC, Splitter:B:33:0x0169] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getImageForFont(java.lang.String r9, java.lang.String r10, java.lang.Integer r11, java.lang.Integer r12, com.facebook.react.bridge.Callback r13) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oblador.vectoricons.VectorIconsModule.getImageForFont(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, com.facebook.react.bridge.Callback):void");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
