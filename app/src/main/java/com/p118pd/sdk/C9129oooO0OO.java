package com.p118pd.sdk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.View$OnTouchListenerC9328I11l1li;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.yongchun.library.C4695R;
import com.yongchun.library.view.ImagePreviewActivity;
import exocr.idcard.CameraManager;
import java.io.File;

/* renamed from: com.pd.sdk.oooO0OO  reason: case insensitive filesystem */
public class C9129oooO0OO extends Fragment {
    public static final String o0ooOOo = "path";

    /* renamed from: com.pd.sdk.oooO0OO$OooO00o */
    public class OooO00o implements View$OnTouchListenerC9328I11l1li.AbstractC9332OooO0oo {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.View$OnTouchListenerC9328I11l1li.AbstractC9332OooO0oo
        public void OooO00o(View view, float f, float f2) {
            ((ImagePreviewActivity) C9129oooO0OO.this.getActivity()).OooO0Oo();
        }
    }

    public static C9129oooO0OO OooO00o(String str) {
        C9129oooO0OO oooo0oo = new C9129oooO0OO();
        Bundle bundle = new Bundle();
        bundle.putString("path", str);
        oooo0oo.setArguments(bundle);
        return oooo0oo;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C4695R.layout.fragment_image_preview, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(C4695R.C4698id.preview_image);
        View$OnTouchListenerC9328I11l1li r0 = new View$OnTouchListenerC9328I11l1li(imageView);
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.PAGE, "ImagePreviewFragment:onCreateView");
        ComponentCallbacks2C7604o0o0Oo0o.m19230OooO00o(viewGroup.getContext()).asBitmap().load(new File(getArguments().getString("path"))).preload(CameraManager.OooO0O0, 800);
        ComponentCallbacks2C7604o0o0Oo0o.m19230OooO00o(viewGroup.getContext()).asBitmap().load(new File(getArguments().getString("path"))).into(imageView);
        r0.OooO0O0();
        r0.setOnViewTapListener(new OooO00o());
        return inflate;
    }
}
