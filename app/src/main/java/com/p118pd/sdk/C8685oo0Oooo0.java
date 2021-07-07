package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.Toast;
import com.jinhui365.p088rn.C1418R;
import com.jinhui365.p088rn.share.ShareVO;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;

/* renamed from: com.pd.sdk.oo0Oooo0  reason: case insensitive filesystem */
public class C8685oo0Oooo0 {
    public UMShareListener OooO00o;

    /* renamed from: com.pd.sdk.oo0Oooo0$OooO00o */
    public class OooO00o implements UMShareListener {
        public OooO00o() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordInfo("onCancel == " + share_media);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordInfo("onError == " + share_media);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordInfo("onresult == " + share_media);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            sharedInstance.recordInfo("onstart == " + share_media);
        }
    }

    /* renamed from: com.pd.sdk.oo0Oooo0$OooO0O0 */
    public static /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] OooO00o;

        static {
            int[] iArr = new int[SHARE_MEDIA.values().length];
            OooO00o = iArr;
            try {
                iArr[SHARE_MEDIA.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.pd.sdk.oo0Oooo0$OooO0OO */
    public static class OooO0OO {
        public static final C8685oo0Oooo0 OooO00o = new C8685oo0Oooo0(null);
    }

    public /* synthetic */ C8685oo0Oooo0(OooO00o oooO00o) {
        this();
    }

    public static C8685oo0Oooo0 OooO00o() {
        return OooO0OO.OooO00o;
    }

    public C8685oo0Oooo0() {
        this.OooO00o = new OooO00o();
    }

    public void OooO00o(Activity activity, SHARE_MEDIA share_media, ShareVO shareVO, UMShareListener uMShareListener) {
        if (activity != null) {
            if (!UMShareAPI.get(activity).isInstall(activity, share_media)) {
                Toast.makeText(activity, "客户端未安装", 0).show();
            }
            ShareAction shareAction = new ShareAction(activity);
            if (OooO0O0.OooO00o[share_media.ordinal()] != 1) {
                shareAction.setPlatform(share_media).withMedia(OooO00o(activity, shareVO)).setCallback(uMShareListener).share();
            } else {
                shareAction.setPlatform(share_media).setShareContent(OooO00o(shareVO)).setCallback(uMShareListener).share();
            }
        }
    }

    public void OooO00o(Activity activity, SHARE_MEDIA share_media, ShareVO shareVO) {
        if (C8741oo0oOo0.OooO0OO(shareVO.getShareImage())) {
            OooO00o(activity, share_media, shareVO, this.OooO00o);
        } else {
            OooO00o(activity, share_media, shareVO.getShareImage(), shareVO.getThumbImage(), this.OooO00o);
        }
    }

    private ShareContent OooO00o(ShareVO shareVO) {
        ShareContent shareContent = new ShareContent();
        shareContent.mText = shareVO.getText();
        return shareContent;
    }

    private UMWeb OooO00o(Context context, ShareVO shareVO) {
        UMImage uMImage;
        UMImage uMImage2;
        UMWeb uMWeb = new UMWeb(shareVO.getLink());
        uMWeb.setTitle(shareVO.getTitle());
        uMWeb.setDescription(shareVO.getText());
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), C1418R.mipmap.ic_share);
        if (C8741oo0oOo0.OooO0OO(shareVO.getIcon())) {
            uMImage = new UMImage(context, decodeResource);
        } else {
            if (shareVO.getIcon().startsWith("http")) {
                uMImage2 = new UMImage(context, shareVO.getIcon());
            } else {
                uMImage2 = new UMImage(context, Base64.decode(shareVO.getIcon(), 0));
            }
            uMImage = uMImage2;
        }
        uMWeb.setThumb(uMImage);
        return uMWeb;
    }

    public void OooO00o(Activity activity, SHARE_MEDIA share_media, String str, String str2) {
        OooO00o(activity, share_media, str, str2, null);
    }

    public void OooO00o(Activity activity, SHARE_MEDIA share_media, String str, String str2, UMShareListener uMShareListener) {
        UMImage uMImage;
        UMImage uMImage2;
        if (activity != null) {
            if (!UMShareAPI.get(activity).isInstall(activity, share_media)) {
                Toast.makeText(activity, "客户端未安装", 1).show();
            }
            if (str.startsWith("http")) {
                uMImage = new UMImage(activity, str);
            } else {
                uMImage = new UMImage(activity, Base64.decode(str, 0));
            }
            if (str2.startsWith("http")) {
                uMImage2 = new UMImage(activity, str2);
            } else {
                uMImage2 = new UMImage(activity, Base64.decode(str2, 0));
            }
            uMImage.setThumb(uMImage2);
            new ShareAction(activity).setPlatform(share_media).withMedia(uMImage).setCallback(uMShareListener).share();
        }
    }
}
