package com.p118pd.sdk;

import android.app.Activity;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.imagepicker.C1401R;
import com.imagepicker.ImagePickerModule;
import com.p118pd.sdk.OooO0OO;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.pd.sdk.oo0O0OOo  reason: case insensitive filesystem */
public class C8606oo0O0OOo {

    /* renamed from: com.pd.sdk.oo0O0OOo$OooO00o */
    public static class OooO00o implements DialogInterface.OnClickListener {
        public final /* synthetic */ AbstractC8607OooO0Oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WeakReference f21719OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ List f21720OooO00o;

        public OooO00o(List list, AbstractC8607OooO0Oo oooO0Oo, WeakReference weakReference) {
            this.f21720OooO00o = list;
            this.OooO00o = oooO0Oo;
            this.f21719OooO00o = weakReference;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.content.DialogInterface r4, int r5) {
            /*
            // Method dump skipped, instructions count: 123
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8606oo0O0OOo.OooO00o.onClick(android.content.DialogInterface, int):void");
        }
    }

    /* renamed from: com.pd.sdk.oo0O0OOo$OooO0O0 */
    public static class OooO0O0 implements DialogInterface.OnClickListener {
        public final /* synthetic */ AbstractC8607OooO0Oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WeakReference f21721OooO00o;

        public OooO0O0(AbstractC8607OooO0Oo oooO0Oo, WeakReference weakReference) {
            this.OooO00o = oooO0Oo;
            this.f21721OooO00o = weakReference;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.OooO00o.OooO0OO((ImagePickerModule) this.f21721OooO00o.get());
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pd.sdk.oo0O0OOo$OooO0OO */
    public static class OooO0OO implements DialogInterface.OnCancelListener {
        public final /* synthetic */ AbstractC8607OooO0Oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ WeakReference f21722OooO00o;

        public OooO0OO(AbstractC8607OooO0Oo oooO0Oo, WeakReference weakReference) {
            this.OooO00o = oooO0Oo;
            this.f21722OooO00o = weakReference;
        }

        public void onCancel(@NonNull DialogInterface dialogInterface) {
            this.OooO00o.OooO0OO((ImagePickerModule) this.f21722OooO00o.get());
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pd.sdk.oo0O0OOo$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC8607OooO0Oo {
        void OooO00o(@Nullable ImagePickerModule imagePickerModule);

        void OooO00o(@Nullable ImagePickerModule imagePickerModule, String str);

        void OooO0O0(@Nullable ImagePickerModule imagePickerModule);

        void OooO0OO(@Nullable ImagePickerModule imagePickerModule);
    }

    @NonNull
    public static OooO0OO OooO00o(@Nullable ImagePickerModule imagePickerModule, @NonNull ReadableMap readableMap, @Nullable AbstractC8607OooO0Oo oooO0Oo) {
        Activity activity = imagePickerModule.getActivity();
        if (activity == null) {
            return null;
        }
        WeakReference weakReference = new WeakReference(imagePickerModule);
        C8599oo0O0O OooO00o2 = C8599oo0O0O.OooO00o(readableMap);
        List<String> OooO0O02 = OooO00o2.OooO0O0();
        List<String> OooO00o3 = OooO00o2.OooO00o();
        ArrayAdapter arrayAdapter = new ArrayAdapter(activity, C1401R.layout.list_item, OooO0O02);
        OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o(activity, imagePickerModule.getDialogThemeId());
        if (C8603oo0O0OO.OooO00o(readableMap, "title")) {
            oooO00o.OooO0O0(readableMap.getString("title"));
        }
        oooO00o.OooO00o(arrayAdapter, new OooO00o(OooO00o3, oooO0Oo, weakReference));
        oooO00o.OooO00o(OooO00o2.OooO0OO.OooO00o, new OooO0O0(oooO0Oo, weakReference));
        OooO0OO OooO00o4 = oooO00o.m16670OooO00o();
        OooO00o4.setOnCancelListener(new OooO0OO(oooO0Oo, weakReference));
        return OooO00o4;
    }
}
