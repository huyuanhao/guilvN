package com.facebook.react.views.viewpager;

import android.view.View;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = ReactViewPagerManager.REACT_CLASS)
public class ReactViewPagerManager extends ViewGroupManager<ReactViewPager> {
    public static final int COMMAND_SET_PAGE = 1;
    public static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    public static final String REACT_CLASS = "AndroidViewPager";

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m947of("setPage", 1, "setPageWithoutAnimation", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m948of(PageScrollEvent.EVENT_NAME, MapBuilder.m946of("registrationName", "onPageScroll"), PageScrollStateChangedEvent.EVENT_NAME, MapBuilder.m946of("registrationName", "onPageScrollStateChanged"), PageSelectedEvent.EVENT_NAME, MapBuilder.m946of("registrationName", "onPageSelected"));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @ReactProp(defaultFloat = 0.0f, name = "pageMargin")
    public void setPageMargin(ReactViewPager reactViewPager, float f) {
        reactViewPager.setPageMargin((int) PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(defaultBoolean = false, name = "peekEnabled")
    public void setPeekEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setClipToPadding(!z);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setScrollEnabled(z);
    }

    public void addView(ReactViewPager reactViewPager, View view, int i) {
        reactViewPager.addViewToAdapter(view, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactViewPager createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactViewPager(themedReactContext);
    }

    public View getChildAt(ReactViewPager reactViewPager, int i) {
        return reactViewPager.getViewFromAdapter(i);
    }

    public int getChildCount(ReactViewPager reactViewPager) {
        return reactViewPager.getViewCountInAdapter();
    }

    public void receiveCommand(ReactViewPager reactViewPager, int i, @Nullable ReadableArray readableArray) {
        Assertions.assertNotNull(reactViewPager);
        Assertions.assertNotNull(readableArray);
        if (i == 1) {
            reactViewPager.setCurrentItemFromJs(readableArray.getInt(0), true);
        } else if (i == 2) {
            reactViewPager.setCurrentItemFromJs(readableArray.getInt(0), false);
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), ReactViewPagerManager.class.getSimpleName()));
        }
    }

    public void removeViewAt(ReactViewPager reactViewPager, int i) {
        reactViewPager.removeViewFromAdapter(i);
    }
}
