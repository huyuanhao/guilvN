package com.p118pd.sdk;

import android.app.Application;
import android.text.TextUtils;
import com.calendarevents.RNCalendarEventsPackage;
import com.dylanvann.fastimage.FastImageViewPackage;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.learnium.RNDeviceInfo.C1439RNDeviceInfo;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.rssignaturecapture.RSSignatureCapturePackage;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p284io.realm.react.RealmReactPackage;

/* renamed from: com.pd.sdk.oo0Oo00O  reason: case insensitive filesystem */
public abstract class AbstractC8656oo0Oo00O extends ReactNativeHost {
    public static List<C8657oo0Oo00o> OooO0O0 = new ArrayList();
    public List<ReactPackage> OooO00o;

    public AbstractC8656oo0Oo00O(Application application) {
        super(application);
    }

    public ReactInstanceManager OooO00o() {
        ReactInstanceManager createReactInstanceManager = super.createReactInstanceManager();
        createReactInstanceManager.createReactContextInBackground();
        return createReactInstanceManager;
    }

    public abstract void OooO00o(List<ReactPackage> list);

    @Override // com.facebook.react.ReactNativeHost
    public ReactInstanceManager createReactInstanceManager() {
        return super.createReactInstanceManager();
    }

    @Override // com.facebook.react.ReactNativeHost
    @Nullable
    public String getJSBundleFile() {
        if (getUseDeveloperSupport()) {
            return super.getJSBundleFile();
        }
        return C8655oo0Oo000.OooO00o();
    }

    @Override // com.facebook.react.ReactNativeHost
    public String getJSMainModuleName() {
        if (TextUtils.isEmpty(C8646oo0OOoO.OooO0O0)) {
            return super.getJSMainModuleName();
        }
        return C8646oo0OOoO.OooO0O0;
    }

    @Override // com.facebook.react.ReactNativeHost
    public List<ReactPackage> getPackages() {
        this.OooO00o = new ArrayList();
        C8657oo0Oo00o oo0oo00o = new C8657oo0Oo00o();
        OooO0O0.add(oo0oo00o);
        this.OooO00o.add(new C8650oo0OOoo0());
        this.OooO00o.add(oo0oo00o);
        this.OooO00o.add(new FastImageViewPackage());
        this.OooO00o.add(new C1439RNDeviceInfo());
        this.OooO00o.add(new RNCWebViewPackage());
        this.OooO00o.add(new C7404o0OOOo0());
        this.OooO00o.add(new C9083ooOooOO0());
        this.OooO00o.add(new C8373oOoOoO00());
        this.OooO00o.add(new C8896ooOO00o());
        if (!C8646oo0OOoO.f21775OooO0OO) {
            this.OooO00o.add(new C8613oo0O0o00());
            this.OooO00o.add(new C8662oo0Oo0o0());
            this.OooO00o.add(new RSSignatureCapturePackage());
            this.OooO00o.add(new Li111());
            this.OooO00o.add(new C8768oo0ooOO0());
            this.OooO00o.add(new C8902ooOO0O0o());
            this.OooO00o.add(new C8595oo0O00o());
            this.OooO00o.add(new ILLil());
            this.OooO00o.add(new C9134oooO0Oo0());
            this.OooO00o.add(new RNCalendarEventsPackage());
            this.OooO00o.add(new C8886ooO0ooO());
            this.OooO00o.add(new RealmReactPackage());
        }
        OooO00o(this.OooO00o);
        return this.OooO00o;
    }

    @Override // com.facebook.react.ReactNativeHost
    public boolean getUseDeveloperSupport() {
        return C8646oo0OOoO.f21773OooO00o;
    }
}
