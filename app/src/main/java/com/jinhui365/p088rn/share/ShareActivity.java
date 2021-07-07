package com.jinhui365.p088rn.share;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.jinhui365.util.util.gson.GsonUtil;
import com.p118pd.sdk.C8683oo0OooOo;
import com.p118pd.sdk.C8686oo0OoooO;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import s.h.e.l.l.C;

/* renamed from: com.jinhui365.rn.share.ShareActivity */
public class ShareActivity extends FragmentActivity {
    public static final String o0ooOOo = "uMeng_share_info";
    public ShareVO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8683oo0OooOo f14977OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public UMShareListener f14978OooO00o = new OooO0O0();

    /* renamed from: com.jinhui365.rn.share.ShareActivity$OooO00o */
    public class OooO00o implements C8683oo0OooOo.OooO0OO {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.C8683oo0OooOo.OooO0OO
        public void OooO00o(SHARE_MEDIA share_media) {
            ShareActivity.this.f14977OooO00o.OooO00o(ShareActivity.this.OooO00o, ShareActivity.this.f14978OooO00o);
        }

        @Override // com.p118pd.sdk.C8683oo0OooOo.OooO0OO
        public void onDismiss() {
            if (!ShareActivity.this.isFinishing()) {
                ShareActivity.this.finish();
            }
        }
    }

    /* renamed from: com.jinhui365.rn.share.ShareActivity$OooO0O0 */
    public class OooO0O0 implements UMShareListener {
        public OooO0O0() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            Toast.makeText(ShareActivity.this, "分享成功", 1).show();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    static {
        C.i(50331735);
    }

    public static native void OooO00o(Activity activity);

    public native void finish();

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C8683oo0OooOo oo0ooooo = new C8683oo0OooOo();
        this.f14977OooO00o = oo0ooooo;
        oo0ooooo.show(getSupportFragmentManager(), "shareDialog");
        this.f14977OooO00o.OooO00o(new OooO00o());
        this.OooO00o = (ShareVO) GsonUtil.jsonToBean(C8686oo0OoooO.OooO00o().OooO00o(o0ooOOo, ""), ShareVO.class);
    }
}
