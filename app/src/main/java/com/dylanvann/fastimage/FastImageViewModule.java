package com.dylanvann.fastimage;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.p118pd.sdk.C7658o0oOooOO;
import com.p118pd.sdk.ComponentCallbacks2C7604o0o0Oo0o;

public class FastImageViewModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "FastImageView";

    public class OooO00o implements Runnable {
        public final /* synthetic */ Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableArray f14884OooO00o;

        public OooO00o(ReadableArray readableArray, Activity activity) {
            this.f14884OooO00o = readableArray;
            this.OooO00o = activity;
        }

        public void run() {
            Object obj;
            for (int i = 0; i < this.f14884OooO00o.size(); i++) {
                ReadableMap map = this.f14884OooO00o.getMap(i);
                FastImageSource OooO00o2 = FastImageViewConverter.OooO00o(this.OooO00o, map);
                C7658o0oOooOO OooO00o3 = ComponentCallbacks2C7604o0o0Oo0o.m19230OooO00o(this.OooO00o.getApplicationContext());
                if (OooO00o2.isBase64Resource()) {
                    obj = OooO00o2.getSource();
                } else {
                    obj = OooO00o2.isResource() ? OooO00o2.getUri() : OooO00o2.getGlideUrl();
                }
                OooO00o3.load(obj).apply(FastImageViewConverter.OooO00o(this.OooO00o, OooO00o2, map)).preload();
            }
        }
    }

    public FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FastImageView";
    }

    @ReactMethod
    public void preload(ReadableArray readableArray) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new OooO00o(readableArray, currentActivity));
        }
    }
}
