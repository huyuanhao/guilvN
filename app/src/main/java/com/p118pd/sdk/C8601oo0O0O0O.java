package com.p118pd.sdk;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.imagepicker.ImagePickerModule;
import com.p118pd.sdk.OooO0OO;
import java.lang.ref.WeakReference;

/* renamed from: com.pd.sdk.oo0O0O0O  reason: case insensitive filesystem */
public class C8601oo0O0O0O {

    /* renamed from: com.pd.sdk.oo0O0O0O$OooO00o */
    public static class OooO00o implements DialogInterface.OnClickListener {
        public final /* synthetic */ OooO0OO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WeakReference f21715OooO00o;

        public OooO00o(OooO0OO oooO0OO, WeakReference weakReference) {
            this.OooO00o = oooO0OO;
            this.f21715OooO00o = weakReference;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.OooO00o.OooO0O0(this.f21715OooO00o, dialogInterface);
        }
    }

    /* renamed from: com.pd.sdk.oo0O0O0O$OooO0O0 */
    public static class OooO0O0 implements DialogInterface.OnClickListener {
        public final /* synthetic */ OooO0OO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WeakReference f21716OooO00o;

        public OooO0O0(OooO0OO oooO0OO, WeakReference weakReference) {
            this.OooO00o = oooO0OO;
            this.f21716OooO00o = weakReference;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.OooO00o.OooO00o(this.f21716OooO00o, dialogInterface);
        }
    }

    /* renamed from: com.pd.sdk.oo0O0O0O$OooO0OO */
    public interface OooO0OO {
        void OooO00o(WeakReference<ImagePickerModule> weakReference, DialogInterface dialogInterface);

        void OooO0O0(WeakReference<ImagePickerModule> weakReference, DialogInterface dialogInterface);
    }

    @Nullable
    public static OooO0OO OooO00o(@NonNull ImagePickerModule imagePickerModule, @NonNull ReadableMap readableMap, @NonNull OooO0OO oooO0OO) {
        if (imagePickerModule.getContext() == null || !readableMap.hasKey("permissionDenied")) {
            return null;
        }
        ReadableMap map = readableMap.getMap("permissionDenied");
        if (((ReadableNativeMap) map).toHashMap().size() == 0) {
            return null;
        }
        String string = map.getString("title");
        String string2 = map.getString("text");
        String string3 = map.getString("reTryTitle");
        String string4 = map.getString("okTitle");
        WeakReference weakReference = new WeakReference(imagePickerModule);
        Activity activity = imagePickerModule.getActivity();
        if (activity == null) {
            return null;
        }
        OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o(activity, imagePickerModule.getDialogThemeId());
        oooO00o.OooO0O0(string).OooO00o(string2).OooO00o(false).OooO00o(string4, new OooO0O0(oooO0OO, weakReference)).OooO0OO(string3, new OooO00o(oooO0OO, weakReference));
        return oooO00o.m16670OooO00o();
    }
}
