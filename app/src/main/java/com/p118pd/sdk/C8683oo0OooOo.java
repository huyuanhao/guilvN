package com.p118pd.sdk;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.jinhui365.p088rn.C1418R;
import com.jinhui365.p088rn.share.ShareVO;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.oo0OooOo  reason: case insensitive filesystem */
public class C8683oo0OooOo extends DialogInterface$OnCancelListenerC7165o00o0OoO {
    public OooO0OO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SHARE_MEDIA f21837OooO00o;

    /* renamed from: com.pd.sdk.oo0OooOo$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        public void onClick(View view) {
            C8683oo0OooOo.this.f21837OooO00o = SHARE_MEDIA.WEIXIN;
            if (C8683oo0OooOo.this.OooO00o != null) {
                C8683oo0OooOo.this.OooO00o.OooO00o(SHARE_MEDIA.WEIXIN);
                C8683oo0OooOo.this.OooO00o.onDismiss();
            }
        }
    }

    /* renamed from: com.pd.sdk.oo0OooOo$OooO0O0 */
    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            C8683oo0OooOo.this.f21837OooO00o = SHARE_MEDIA.WEIXIN_CIRCLE;
            if (C8683oo0OooOo.this.OooO00o != null) {
                C8683oo0OooOo.this.OooO00o.OooO00o(SHARE_MEDIA.WEIXIN_CIRCLE);
                C8683oo0OooOo.this.OooO00o.onDismiss();
            }
        }
    }

    /* renamed from: com.pd.sdk.oo0OooOo$OooO0OO */
    public interface OooO0OO {
        void OooO00o(SHARE_MEDIA share_media);

        void onDismiss();
    }

    static {
        C.i(16777262);
    }

    public static native C8683oo0OooOo OooO00o();

    public native void OooO00o(ShareVO shareVO);

    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(C1418R.layout.dialog_share, (ViewGroup) null);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(true);
        Window window = create.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        window.setAttributes(attributes);
        inflate.findViewById(C1418R.C1421id.ll_wxhy).setOnClickListener(new OooO00o());
        inflate.findViewById(C1418R.C1421id.ll_pyq).setOnClickListener(new OooO0O0());
        return create;
    }

    @Override // androidx.fragment.app.Fragment
    public native void onDestroy();

    @Override // com.p118pd.sdk.DialogInterface$OnCancelListenerC7165o00o0OoO, androidx.fragment.app.Fragment
    public native void onStart();

    public void OooO00o(ShareVO shareVO, UMShareListener uMShareListener) {
        if (shareVO == null) {
            shareVO = new ShareVO();
        }
        if (C8741oo0oOo0.OooO0OO(shareVO.getShareImage())) {
            C8685oo0Oooo0.OooO00o().OooO00o(getActivity(), this.f21837OooO00o, shareVO, uMShareListener);
        } else {
            C8685oo0Oooo0.OooO00o().OooO00o(getActivity(), this.f21837OooO00o, shareVO.getShareImage(), shareVO.getThumbImage(), uMShareListener);
        }
    }

    public void OooO00o(OooO0OO oooO0OO) {
        this.OooO00o = oooO0OO;
    }
}
