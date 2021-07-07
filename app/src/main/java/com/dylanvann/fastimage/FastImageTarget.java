package com.dylanvann.fastimage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.p118pd.sdk.AbstractC7831oO00oOOo;
import com.p118pd.sdk.AbstractC7837oO00ooOo;

public class FastImageTarget extends AbstractC7831oO00oOOo<Bitmap> {
    public static final String REACT_ON_ERROR_EVENT = "onFastImageError";
    public static final String REACT_ON_LOAD_END_EVENT = "onFastImageLoadEnd";
    public static final String REACT_ON_LOAD_EVENT = "onFastImageLoad";
    public String key;
    public ImageView view;

    public FastImageTarget(ImageView imageView, String str) {
        this.view = imageView;
        this.key = str;
    }

    public static WritableMap mapFromResource(Bitmap bitmap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", bitmap.getWidth());
        writableNativeMap.putInt("height", bitmap.getHeight());
        return writableNativeMap;
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0, com.p118pd.sdk.AbstractC7826oO00oO00
    public void onLoadFailed(@Nullable Drawable drawable) {
        super.onLoadFailed(drawable);
        FastImageOkHttpProgressGlideModule.forget(this.key);
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) this.view.getContext()).getJSModule(RCTEventEmitter.class);
        int id = this.view.getId();
        rCTEventEmitter.receiveEvent(id, "onFastImageError", new WritableNativeMap());
        rCTEventEmitter.receiveEvent(id, "onFastImageLoadEnd", new WritableNativeMap());
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable AbstractC7837oO00ooOo oo00oooo) {
        onResourceReady((Bitmap) obj, (AbstractC7837oO00ooOo<? super Bitmap>) oo00oooo);
    }

    public void onResourceReady(@NonNull Bitmap bitmap, @Nullable AbstractC7837oO00ooOo<? super Bitmap> oo00oooo) {
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) this.view.getContext()).getJSModule(RCTEventEmitter.class);
        int id = this.view.getId();
        rCTEventEmitter.receiveEvent(id, "onFastImageLoad", mapFromResource(bitmap));
        rCTEventEmitter.receiveEvent(id, "onFastImageLoadEnd", new WritableNativeMap());
        this.view.setImageBitmap(bitmap);
    }
}
