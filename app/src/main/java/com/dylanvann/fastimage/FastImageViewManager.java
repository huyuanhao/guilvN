package com.dylanvann.fastimage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.p118pd.sdk.C7658o0oOooOO;
import com.p118pd.sdk.C7764o0ooooo0;
import com.p118pd.sdk.C8144oOOOo0o;
import com.p118pd.sdk.ComponentCallbacks2C7604o0o0Oo0o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class FastImageViewManager extends SimpleViewManager<C8144oOOOo0o> implements FastImageProgressListener {
    public static final String REACT_CLASS = "FastImageView";
    public static final String REACT_ON_LOAD_START_EVENT = "onFastImageLoadStart";
    public static final String REACT_ON_PROGRESS_EVENT = "onFastImageProgress";
    public static final Map<String, List<C8144oOOOo0o>> VIEWS_FOR_URLS = new WeakHashMap();
    @Nullable
    public C7658o0oOooOO requestManager = null;

    public static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ThemedReactContext)) {
            return null;
        }
        Context baseContext = ((ThemedReactContext) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (!(baseContext instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
        if (baseContext2 instanceof Activity) {
            return (Activity) baseContext2;
        }
        return null;
    }

    public static boolean isActivityDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (activity.isDestroyed() || activity.isFinishing()) {
                return true;
            }
            return false;
        } else if (activity.isDestroyed() || activity.isFinishing() || activity.isChangingConfigurations()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isValidContextForGlide(Context context) {
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext == null) {
            return false;
        }
        return !isActivityDestroyed(activityFromContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put(REACT_ON_LOAD_START_EVENT, MapBuilder.m946of("registrationName", REACT_ON_LOAD_START_EVENT)).put(REACT_ON_PROGRESS_EVENT, MapBuilder.m946of("registrationName", REACT_ON_PROGRESS_EVENT)).put("onFastImageLoad", MapBuilder.m946of("registrationName", "onFastImageLoad")).put("onFastImageError", MapBuilder.m946of("registrationName", "onFastImageError")).put("onFastImageLoadEnd", MapBuilder.m946of("registrationName", "onFastImageLoadEnd")).build();
    }

    @Override // com.dylanvann.fastimage.FastImageProgressListener
    public float getGranularityPercentage() {
        return 0.5f;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "FastImageView";
    }

    @Override // com.dylanvann.fastimage.FastImageProgressListener
    public void onProgress(String str, long j, long j2) {
        List<C8144oOOOo0o> list = VIEWS_FOR_URLS.get(str);
        if (list != null) {
            for (C8144oOOOo0o ooooo0o : list) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("loaded", (int) j);
                writableNativeMap.putInt("total", (int) j2);
                ((RCTEventEmitter) ((ThemedReactContext) ooooo0o.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(ooooo0o.getId(), REACT_ON_PROGRESS_EVENT, writableNativeMap);
            }
        }
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(C8144oOOOo0o ooooo0o, String str) {
        ooooo0o.setScaleType(FastImageViewConverter.OooO00o(str));
    }

    @ReactProp(name = "source")
    public void setSrc(C8144oOOOo0o ooooo0o, @Nullable ReadableMap readableMap) {
        if (readableMap == null || !readableMap.hasKey("uri") || isNullOrEmpty(readableMap.getString("uri"))) {
            C7658o0oOooOO o0oooooo = this.requestManager;
            if (o0oooooo != null) {
                o0oooooo.clear(ooooo0o);
            }
            C7764o0ooooo0 o0ooooo0 = ooooo0o.OooO00o;
            if (o0ooooo0 != null) {
                FastImageOkHttpProgressGlideModule.forget(o0ooooo0.m19411OooO0O0());
            }
            ooooo0o.setImageDrawable(null);
            return;
        }
        FastImageSource OooO00o = FastImageViewConverter.OooO00o(ooooo0o.getContext(), readableMap);
        C7764o0ooooo0 glideUrl = OooO00o.getGlideUrl();
        ooooo0o.OooO00o = glideUrl;
        C7658o0oOooOO o0oooooo2 = this.requestManager;
        if (o0oooooo2 != null) {
            o0oooooo2.clear(ooooo0o);
        }
        String OooO0O0 = glideUrl.m19411OooO0O0();
        FastImageOkHttpProgressGlideModule.expect(OooO0O0, this);
        List<C8144oOOOo0o> list = VIEWS_FOR_URLS.get(OooO0O0);
        if (list != null && !list.contains(ooooo0o)) {
            list.add(ooooo0o);
        } else if (list == null) {
            VIEWS_FOR_URLS.put(OooO0O0, new ArrayList(Collections.singletonList(ooooo0o)));
        }
        ThemedReactContext themedReactContext = (ThemedReactContext) ooooo0o.getContext();
        ((RCTEventEmitter) themedReactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(ooooo0o.getId(), REACT_ON_LOAD_START_EVENT, new WritableNativeMap());
        C7658o0oOooOO o0oooooo3 = this.requestManager;
        if (o0oooooo3 != null) {
            o0oooooo3.asBitmap().load(OooO00o.getSourceForLoad()).apply(FastImageViewConverter.OooO00o(themedReactContext, OooO00o, readableMap)).listener(new FastImageRequestListener(OooO0O0)).into(new FastImageTarget(ooooo0o, OooO0O0));
        }
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(C8144oOOOo0o ooooo0o, @Nullable Integer num) {
        if (num == null) {
            ooooo0o.clearColorFilter();
        } else {
            ooooo0o.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8144oOOOo0o createViewInstance(ThemedReactContext themedReactContext) {
        if (isValidContextForGlide(themedReactContext)) {
            this.requestManager = ComponentCallbacks2C7604o0o0Oo0o.m19230OooO00o((Context) themedReactContext);
        }
        return new C8144oOOOo0o(themedReactContext);
    }

    public void onDropViewInstance(C8144oOOOo0o ooooo0o) {
        C7658o0oOooOO o0oooooo = this.requestManager;
        if (o0oooooo != null) {
            o0oooooo.clear(ooooo0o);
        }
        C7764o0ooooo0 o0ooooo0 = ooooo0o.OooO00o;
        if (o0ooooo0 != null) {
            String o0ooooo02 = o0ooooo0.toString();
            FastImageOkHttpProgressGlideModule.forget(o0ooooo02);
            List<C8144oOOOo0o> list = VIEWS_FOR_URLS.get(o0ooooo02);
            if (list != null) {
                list.remove(ooooo0o);
                if (list.size() == 0) {
                    VIEWS_FOR_URLS.remove(o0ooooo02);
                }
            }
        }
        super.onDropViewInstance((View) ooooo0o);
    }
}
