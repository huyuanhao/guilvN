package com.dylanvann.fastimage;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.p118pd.sdk.AbstractC7828oO00oO0o;
import com.p118pd.sdk.AbstractC7833oO00oOo0;
import com.p118pd.sdk.C8144oOOOo0o;
import com.p118pd.sdk.oO0OOO0O;

public class FastImageRequestListener implements oO0OOO0O<Bitmap> {
    public static final String REACT_ON_ERROR_EVENT = "onFastImageError";
    public static final String REACT_ON_LOAD_END_EVENT = "onFastImageLoadEnd";
    public static final String REACT_ON_LOAD_EVENT = "onFastImageLoad";
    public String key;

    public FastImageRequestListener(String str) {
        this.key = str;
    }

    public static WritableMap mapFromResource(Bitmap bitmap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", bitmap.getWidth());
        writableNativeMap.putInt("height", bitmap.getHeight());
        return writableNativeMap;
    }

    @Override // com.p118pd.sdk.oO0OOO0O
    public boolean onLoadFailed(@Nullable GlideException glideException, Object obj, AbstractC7833oO00oOo0<Bitmap> oo00ooo0, boolean z) {
        FastImageOkHttpProgressGlideModule.forget(this.key);
        if (!(oo00ooo0 instanceof AbstractC7828oO00oO0o)) {
            return false;
        }
        C8144oOOOo0o ooooo0o = (C8144oOOOo0o) ((AbstractC7828oO00oO0o) oo00ooo0).m19545OooO00o();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) ooooo0o.getContext()).getJSModule(RCTEventEmitter.class);
        int id = ooooo0o.getId();
        rCTEventEmitter.receiveEvent(id, "onFastImageError", new WritableNativeMap());
        rCTEventEmitter.receiveEvent(id, "onFastImageLoadEnd", new WritableNativeMap());
        return false;
    }

    public boolean onResourceReady(Bitmap bitmap, Object obj, AbstractC7833oO00oOo0<Bitmap> oo00ooo0, DataSource dataSource, boolean z) {
        if (!(oo00ooo0 instanceof AbstractC7828oO00oO0o)) {
            return false;
        }
        C8144oOOOo0o ooooo0o = (C8144oOOOo0o) ((AbstractC7828oO00oO0o) oo00ooo0).m19545OooO00o();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) ooooo0o.getContext()).getJSModule(RCTEventEmitter.class);
        int id = ooooo0o.getId();
        rCTEventEmitter.receiveEvent(id, "onFastImageLoad", mapFromResource(bitmap));
        rCTEventEmitter.receiveEvent(id, "onFastImageLoadEnd", new WritableNativeMap());
        return false;
    }
}
