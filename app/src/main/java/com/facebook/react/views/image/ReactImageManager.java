package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import android.view.View;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.YogaConstants;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = ReactImageManager.REACT_CLASS)
public class ReactImageManager extends SimpleViewManager<ReactImageView> {
    public static final String REACT_CLASS = "RCTImageView";
    @Nullable
    public final Object mCallerContext;
    @Nullable
    public AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    @Nullable
    public GlobalImageLoadListener mGlobalImageLoadListener;

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this(abstractDraweeControllerBuilder, null, obj);
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        }
        return this.mDraweeControllerBuilder;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m949of(ImageLoadEvent.eventNameForType(4), MapBuilder.m946of("registrationName", "onLoadStart"), ImageLoadEvent.eventNameForType(2), MapBuilder.m946of("registrationName", "onLoad"), ImageLoadEvent.eventNameForType(1), MapBuilder.m946of("registrationName", "onError"), ImageLoadEvent.eventNameForType(3), MapBuilder.m946of("registrationName", "onLoadEnd"));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "blurRadius")
    public void setBlurRadius(ReactImageView reactImageView, float f) {
        reactImageView.setBlurRadius(f);
    }

    @ReactProp(customType = "Color", name = ViewProps.BORDER_COLOR)
    public void setBorderColor(ReactImageView reactImageView, @Nullable Integer num) {
        if (num == null) {
            reactImageView.setBorderColor(0);
        } else {
            reactImageView.setBorderColor(num.intValue());
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(ReactImageView reactImageView, int i, float f) {
        if (!YogaConstants.isUndefined(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            reactImageView.setBorderRadius(f);
        } else {
            reactImageView.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = ViewProps.BORDER_WIDTH)
    public void setBorderWidth(ReactImageView reactImageView, float f) {
        reactImageView.setBorderWidth(f);
    }

    @ReactProp(name = "defaultSrc")
    public void setDefaultSource(ReactImageView reactImageView, @Nullable String str) {
        reactImageView.setDefaultSource(str);
    }

    @ReactProp(name = "fadeDuration")
    public void setFadeDuration(ReactImageView reactImageView, int i) {
        reactImageView.setFadeDuration(i);
    }

    @ReactProp(name = "headers")
    public void setHeaders(ReactImageView reactImageView, ReadableMap readableMap) {
        reactImageView.setHeaders(readableMap);
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(ReactImageView reactImageView, boolean z) {
        reactImageView.setShouldNotifyLoadEvents(z);
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(ReactImageView reactImageView, @Nullable String str) {
        reactImageView.setLoadingIndicatorSource(str);
    }

    @ReactProp(customType = "Color", name = "overlayColor")
    public void setOverlayColor(ReactImageView reactImageView, @Nullable Integer num) {
        if (num == null) {
            reactImageView.setOverlayColor(0);
        } else {
            reactImageView.setOverlayColor(num.intValue());
        }
    }

    @ReactProp(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(ReactImageView reactImageView, boolean z) {
        reactImageView.setProgressiveRenderingEnabled(z);
    }

    @ReactProp(name = ViewProps.RESIZE_METHOD)
    public void setResizeMethod(ReactImageView reactImageView, @Nullable String str) {
        if (str == null || "auto".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.AUTO);
        } else if ("resize".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.RESIZE);
        } else if ("scale".equals(str)) {
            reactImageView.setResizeMethod(ImageResizeMethod.SCALE);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid resize method: '" + str + "'");
        }
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(ReactImageView reactImageView, @Nullable String str) {
        reactImageView.setScaleType(ImageResizeMode.toScaleType(str));
        reactImageView.setTileMode(ImageResizeMode.toTileMode(str));
    }

    @ReactProp(name = "src")
    public void setSource(ReactImageView reactImageView, @Nullable ReadableArray readableArray) {
        reactImageView.setSource(readableArray);
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(ReactImageView reactImageView, @Nullable Integer num) {
        if (num == null) {
            reactImageView.clearColorFilter();
        } else {
            reactImageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactImageView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactImageView(themedReactContext, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, getCallerContext());
    }

    public void onAfterUpdateTransaction(ReactImageView reactImageView) {
        super.onAfterUpdateTransaction((View) reactImageView);
        reactImageView.maybeUpdateView();
    }

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
    }
}
