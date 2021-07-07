package com.facebook.react.views.toolbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.toolbar.events.ToolbarClickEvent;
import java.util.Map;
import javax.annotation.Nullable;

public class ReactToolbarManager extends ViewGroupManager<ReactToolbar> {
    public static final int COMMAND_DISMISS_POPUP_MENUS = 1;
    public static final String REACT_CLASS = "ToolbarAndroid";

    public static int[] getDefaultColors(Context context) {
        TypedArray typedArray;
        TypedArray typedArray2;
        TypedArray typedArray3;
        Throwable th;
        Resources.Theme theme = context.getTheme();
        TypedArray typedArray4 = null;
        try {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{getIdentifier(context, "toolbarStyle")});
            try {
                typedArray = theme.obtainStyledAttributes(obtainStyledAttributes.getResourceId(0, 0), new int[]{getIdentifier(context, "titleTextAppearance"), getIdentifier(context, "subtitleTextAppearance")});
            } catch (Throwable th2) {
                th = th2;
                typedArray = null;
                typedArray3 = null;
                typedArray2 = typedArray3;
                typedArray4 = obtainStyledAttributes;
                recycleQuietly(typedArray4);
                recycleQuietly(typedArray);
                recycleQuietly(typedArray2);
                recycleQuietly(typedArray3);
                throw th;
            }
            try {
                int resourceId = typedArray.getResourceId(0, 0);
                int resourceId2 = typedArray.getResourceId(1, 0);
                typedArray2 = theme.obtainStyledAttributes(resourceId, new int[]{16842904});
                try {
                    typedArray4 = theme.obtainStyledAttributes(resourceId2, new int[]{16842904});
                    int[] iArr = {typedArray2.getColor(0, -16777216), typedArray4.getColor(0, -16777216)};
                    recycleQuietly(obtainStyledAttributes);
                    recycleQuietly(typedArray);
                    recycleQuietly(typedArray2);
                    recycleQuietly(typedArray4);
                    return iArr;
                } catch (Throwable th3) {
                    th = th3;
                    typedArray3 = typedArray4;
                    typedArray4 = obtainStyledAttributes;
                    recycleQuietly(typedArray4);
                    recycleQuietly(typedArray);
                    recycleQuietly(typedArray2);
                    recycleQuietly(typedArray3);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                typedArray3 = null;
                typedArray2 = typedArray3;
                typedArray4 = obtainStyledAttributes;
                recycleQuietly(typedArray4);
                recycleQuietly(typedArray);
                recycleQuietly(typedArray2);
                recycleQuietly(typedArray3);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            typedArray = null;
            typedArray3 = null;
            typedArray2 = null;
            recycleQuietly(typedArray4);
            recycleQuietly(typedArray);
            recycleQuietly(typedArray2);
            recycleQuietly(typedArray3);
            throw th;
        }
    }

    private int[] getDefaultContentInsets(Context context) {
        Throwable th;
        TypedArray typedArray;
        Resources.Theme theme = context.getTheme();
        TypedArray typedArray2 = null;
        try {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{getIdentifier(context, "toolbarStyle")});
            try {
                typedArray2 = theme.obtainStyledAttributes(obtainStyledAttributes.getResourceId(0, 0), new int[]{getIdentifier(context, "contentInsetStart"), getIdentifier(context, "contentInsetEnd")});
                int[] iArr = {typedArray2.getDimensionPixelSize(0, 0), typedArray2.getDimensionPixelSize(1, 0)};
                recycleQuietly(obtainStyledAttributes);
                recycleQuietly(typedArray2);
                return iArr;
            } catch (Throwable th2) {
                th = th2;
                typedArray = typedArray2;
                typedArray2 = obtainStyledAttributes;
                recycleQuietly(typedArray2);
                recycleQuietly(typedArray);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
            recycleQuietly(typedArray2);
            recycleQuietly(typedArray);
            throw th;
        }
    }

    public static int getIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    public static void recycleQuietly(@Nullable TypedArray typedArray) {
        if (typedArray != null) {
            typedArray.recycle();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m946of("dismissPopupMenus", 1);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.m946of("ShowAsAction", MapBuilder.m948of(ReactScrollViewHelper.OVER_SCROLL_NEVER, 0, ReactScrollViewHelper.OVER_SCROLL_ALWAYS, 2, "ifRoom", 1));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @ReactProp(name = "nativeActions")
    public void setActions(ReactToolbar reactToolbar, @Nullable ReadableArray readableArray) {
        reactToolbar.setActions(readableArray);
    }

    @ReactProp(defaultFloat = Float.NaN, name = "contentInsetEnd")
    public void setContentInsetEnd(ReactToolbar reactToolbar, float f) {
        int i;
        if (Float.isNaN(f)) {
            i = getDefaultContentInsets(reactToolbar.getContext())[1];
        } else {
            i = Math.round(PixelUtil.toPixelFromDIP(f));
        }
        reactToolbar.setContentInsetsRelative(reactToolbar.getContentInsetStart(), i);
    }

    @ReactProp(defaultFloat = Float.NaN, name = "contentInsetStart")
    public void setContentInsetStart(ReactToolbar reactToolbar, float f) {
        int i;
        if (Float.isNaN(f)) {
            i = getDefaultContentInsets(reactToolbar.getContext())[0];
        } else {
            i = Math.round(PixelUtil.toPixelFromDIP(f));
        }
        reactToolbar.setContentInsetsRelative(i, reactToolbar.getContentInsetEnd());
    }

    @ReactProp(name = "logo")
    public void setLogo(ReactToolbar reactToolbar, @Nullable ReadableMap readableMap) {
        reactToolbar.setLogoSource(readableMap);
    }

    @ReactProp(name = "navIcon")
    public void setNavIcon(ReactToolbar reactToolbar, @Nullable ReadableMap readableMap) {
        reactToolbar.setNavIconSource(readableMap);
    }

    @ReactProp(name = "overflowIcon")
    public void setOverflowIcon(ReactToolbar reactToolbar, @Nullable ReadableMap readableMap) {
        reactToolbar.setOverflowIconSource(readableMap);
    }

    @ReactProp(name = "rtl")
    public void setRtl(ReactToolbar reactToolbar, boolean z) {
        ViewCompat.OooO((View) reactToolbar, z ? 1 : 0);
    }

    @ReactProp(name = "subtitle")
    public void setSubtitle(ReactToolbar reactToolbar, @Nullable String str) {
        reactToolbar.setSubtitle(str);
    }

    @ReactProp(customType = "Color", name = "subtitleColor")
    public void setSubtitleColor(ReactToolbar reactToolbar, @Nullable Integer num) {
        int[] defaultColors = getDefaultColors(reactToolbar.getContext());
        if (num != null) {
            reactToolbar.setSubtitleTextColor(num.intValue());
        } else {
            reactToolbar.setSubtitleTextColor(defaultColors[1]);
        }
    }

    @ReactProp(name = "title")
    public void setTitle(ReactToolbar reactToolbar, @Nullable String str) {
        reactToolbar.setTitle(str);
    }

    @ReactProp(customType = "Color", name = "titleColor")
    public void setTitleColor(ReactToolbar reactToolbar, @Nullable Integer num) {
        int[] defaultColors = getDefaultColors(reactToolbar.getContext());
        if (num != null) {
            reactToolbar.setTitleTextColor(num.intValue());
        } else {
            reactToolbar.setTitleTextColor(defaultColors[0]);
        }
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, final ReactToolbar reactToolbar) {
        final EventDispatcher eventDispatcher = ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        reactToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            /* class com.facebook.react.views.toolbar.ReactToolbarManager.View$OnClickListenerC08901 */

            public void onClick(View view) {
                eventDispatcher.dispatchEvent(new ToolbarClickEvent(reactToolbar.getId(), -1));
            }
        });
        reactToolbar.setOnMenuItemClickListener(new Toolbar.OooO0o() {
            /* class com.facebook.react.views.toolbar.ReactToolbarManager.C08912 */

            @Override // androidx.appcompat.widget.Toolbar.OooO0o
            public boolean onMenuItemClick(MenuItem menuItem) {
                eventDispatcher.dispatchEvent(new ToolbarClickEvent(reactToolbar.getId(), menuItem.getOrder()));
                return true;
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactToolbar createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactToolbar(themedReactContext);
    }

    public void receiveCommand(ReactToolbar reactToolbar, int i, @Nullable ReadableArray readableArray) {
        if (i == 1) {
            reactToolbar.dismissPopupMenus();
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), ReactToolbarManager.class.getSimpleName()));
        }
    }
}
