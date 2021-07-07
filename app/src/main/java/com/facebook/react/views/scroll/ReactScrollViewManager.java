package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.views.scroll.ReactScrollViewCommandHelper;
import com.facebook.yoga.YogaConstants;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = ReactScrollViewManager.REACT_CLASS)
public class ReactScrollViewManager extends ViewGroupManager<ReactScrollView> implements ReactScrollViewCommandHelper.ScrollCommandHandler<ReactScrollView> {
    public static final String REACT_CLASS = "RCTScrollView";
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    @Nullable
    public FpsListener mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.m946of("registrationName", "onScroll")).put(ScrollEventType.getJSEventName(ScrollEventType.BEGIN_DRAG), MapBuilder.m946of("registrationName", "onScrollBeginDrag")).put(ScrollEventType.getJSEventName(ScrollEventType.END_DRAG), MapBuilder.m946of("registrationName", "onScrollEndDrag")).put(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_BEGIN), MapBuilder.m946of("registrationName", "onMomentumScrollBegin")).put(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_END), MapBuilder.m946of("registrationName", "onMomentumScrollEnd")).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return ReactScrollViewCommandHelper.getCommandsMap();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public void setBorderColor(ReactScrollView reactScrollView, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        reactScrollView.setBorderColor(SPACING_TYPES[i], intValue, f);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(ReactScrollView reactScrollView, int i, float f) {
        if (!YogaConstants.isUndefined(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            reactScrollView.setBorderRadius(f);
        } else {
            reactScrollView.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactScrollView reactScrollView, @Nullable String str) {
        reactScrollView.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public void setBorderWidth(ReactScrollView reactScrollView, int i, float f) {
        if (!YogaConstants.isUndefined(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        reactScrollView.setBorderWidth(SPACING_TYPES[i], f);
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(ReactScrollView reactScrollView, int i) {
        reactScrollView.setEndFillColor(i);
    }

    @ReactProp(name = "decelerationRate")
    public void setDecelerationRate(ReactScrollView reactScrollView, float f) {
        reactScrollView.setDecelerationRate(f);
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(ReactScrollView reactScrollView, boolean z) {
        ViewCompat.OooO0o(reactScrollView, z);
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(ReactScrollView reactScrollView, String str) {
        reactScrollView.setOverScrollMode(ReactScrollViewHelper.parseOverScrollMode(str));
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(ReactScrollView reactScrollView, @Nullable String str) {
        reactScrollView.setOverflow(str);
    }

    @ReactProp(name = "pagingEnabled")
    public void setPagingEnabled(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setPagingEnabled(z);
    }

    @ReactProp(name = "persistentScrollbar")
    public void setPersistentScrollbar(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setScrollbarFadingEnabled(!z);
    }

    @ReactProp(name = ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)
    public void setRemoveClippedSubviews(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setRemoveClippedSubviews(z);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setScrollEnabled(z);
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(ReactScrollView reactScrollView, @Nullable String str) {
        reactScrollView.setScrollPerfTag(str);
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setSendMomentumEvents(z);
    }

    @ReactProp(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setVerticalScrollBarEnabled(z);
    }

    @ReactProp(name = "snapToEnd")
    public void setSnapToEnd(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setSnapToEnd(z);
    }

    @ReactProp(name = "snapToInterval")
    public void setSnapToInterval(ReactScrollView reactScrollView, float f) {
        reactScrollView.setSnapInterval((int) (f * DisplayMetricsHolder.getScreenDisplayMetrics().density));
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(ReactScrollView reactScrollView, @Nullable ReadableArray readableArray) {
        DisplayMetrics screenDisplayMetrics = DisplayMetricsHolder.getScreenDisplayMetrics();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            double d = readableArray.getDouble(i);
            double d2 = (double) screenDisplayMetrics.density;
            Double.isNaN(d2);
            arrayList.add(Integer.valueOf((int) (d * d2)));
        }
        reactScrollView.setSnapOffsets(arrayList);
    }

    @ReactProp(name = "snapToStart")
    public void setSnapToStart(ReactScrollView reactScrollView, boolean z) {
        reactScrollView.setSnapToStart(z);
    }

    public ReactScrollViewManager(@Nullable FpsListener fpsListener) {
        this.mFpsListener = null;
        this.mFpsListener = fpsListener;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactScrollView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactScrollView(themedReactContext, this.mFpsListener);
    }

    public void flashScrollIndicators(ReactScrollView reactScrollView) {
        reactScrollView.flashScrollIndicators();
    }

    public void receiveCommand(ReactScrollView reactScrollView, int i, @Nullable ReadableArray readableArray) {
        ReactScrollViewCommandHelper.receiveCommand(this, reactScrollView, i, readableArray);
    }

    public void scrollTo(ReactScrollView reactScrollView, ReactScrollViewCommandHelper.ScrollToCommandData scrollToCommandData) {
        if (scrollToCommandData.mAnimated) {
            reactScrollView.smoothScrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        } else {
            reactScrollView.scrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        }
    }

    public void scrollToEnd(ReactScrollView reactScrollView, ReactScrollViewCommandHelper.ScrollToEndCommandData scrollToEndCommandData) {
        int height = reactScrollView.getChildAt(0).getHeight() + reactScrollView.getPaddingBottom();
        if (scrollToEndCommandData.mAnimated) {
            reactScrollView.smoothScrollTo(reactScrollView.getScrollX(), height);
        } else {
            reactScrollView.scrollTo(reactScrollView.getScrollX(), height);
        }
    }
}
