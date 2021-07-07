package com.facebook.react.views.swiperefresh;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.p118pd.sdk.C7290o0O0O0o;
import com.p118pd.sdk.C7546o0o000O0;
import com.p118pd.sdk.C8775oo0ooo0;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = SwipeRefreshLayoutManager.REACT_CLASS)
public class SwipeRefreshLayoutManager extends ViewGroupManager<ReactSwipeRefreshLayout> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("topRefresh", MapBuilder.m946of("registrationName", C7546o0o000O0.oo0o0Oo)).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.m946of("SIZE", MapBuilder.m947of(C8775oo0ooo0.f21953OooO00o, 1, "LARGE", 0));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(customType = "ColorArray", name = "colors")
    public void setColors(ReactSwipeRefreshLayout reactSwipeRefreshLayout, @Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            int[] iArr = new int[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                iArr[i] = readableArray.getInt(i);
            }
            reactSwipeRefreshLayout.setColorSchemeColors(iArr);
            return;
        }
        reactSwipeRefreshLayout.setColorSchemeColors(new int[0]);
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactSwipeRefreshLayout reactSwipeRefreshLayout, boolean z) {
        reactSwipeRefreshLayout.setEnabled(z);
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "progressBackgroundColor")
    public void setProgressBackgroundColor(ReactSwipeRefreshLayout reactSwipeRefreshLayout, int i) {
        reactSwipeRefreshLayout.setProgressBackgroundColorSchemeColor(i);
    }

    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(ReactSwipeRefreshLayout reactSwipeRefreshLayout, float f) {
        reactSwipeRefreshLayout.setProgressViewOffset(f);
    }

    @ReactProp(name = "refreshing")
    public void setRefreshing(ReactSwipeRefreshLayout reactSwipeRefreshLayout, boolean z) {
        reactSwipeRefreshLayout.setRefreshing(z);
    }

    @ReactProp(defaultInt = 1, name = FileAttachment.KEY_SIZE)
    public void setSize(ReactSwipeRefreshLayout reactSwipeRefreshLayout, int i) {
        reactSwipeRefreshLayout.setSize(i);
    }

    public void addEventEmitters(final ThemedReactContext themedReactContext, final ReactSwipeRefreshLayout reactSwipeRefreshLayout) {
        reactSwipeRefreshLayout.setOnRefreshListener(new C7290o0O0O0o.OooOO0() {
            /* class com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager.C08771 */

            @Override // com.p118pd.sdk.C7290o0O0O0o.OooOO0
            public void onRefresh() {
                ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new RefreshEvent(reactSwipeRefreshLayout.getId()));
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactSwipeRefreshLayout createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactSwipeRefreshLayout(themedReactContext);
    }
}
