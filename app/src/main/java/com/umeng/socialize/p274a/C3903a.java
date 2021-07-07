package com.umeng.socialize.p274a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.SocializeException;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareConfig;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.HandlerRequestCode;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UmengErrorCode;
import com.umeng.socialize.common.QueuedWork;
import com.umeng.socialize.handler.UMMoreHandler;
import com.umeng.socialize.handler.UMSSOHandler;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMVideo;
import com.umeng.socialize.media.UMWeb;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.media.UMusic;
import com.umeng.socialize.net.analytics.SocialAnalytics;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.net.dplus.DplusApi;
import com.umeng.socialize.net.dplus.cache.DplusCacheApi;
import com.umeng.socialize.net.utils.SocializeNetUtils;
import com.umeng.socialize.p275b.p277b.C3914a;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import com.umeng.socialize.utils.UrlUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.umeng.socialize.a.a */
public final class C3903a {

    /* renamed from: b */
    public static final String f10658b = "umeng_share_platform";

    /* renamed from: c */
    public static final String f10659c = "share_action";

    /* renamed from: a */
    public SHARE_MEDIA f10660a;

    /* renamed from: d */
    public String f10661d = "7.0.2";

    /* renamed from: e */
    public final Map<SHARE_MEDIA, UMSSOHandler> f10662e = new HashMap();

    /* renamed from: f */
    public final List<Pair<SHARE_MEDIA, String>> f10663f;

    /* renamed from: g */
    public C3912a f10664g;

    /* renamed from: h */
    public Context f10665h;

    /* renamed from: i */
    public SparseArray<UMAuthListener> f10666i;

    /* renamed from: j */
    public SparseArray<UMShareListener> f10667j;

    /* renamed from: k */
    public SparseArray<UMAuthListener> f10668k;

    public C3903a(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f10663f = arrayList;
        arrayList.add(new Pair(SHARE_MEDIA.LAIWANG, "com.umeng.socialize.handler.UMLWHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.LAIWANG_DYNAMIC, "com.umeng.socialize.handler.UMLWHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.SINA, "com.umeng.socialize.handler.SinaSimplyHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.PINTEREST, "com.umeng.socialize.handler.UMPinterestHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.QZONE, "com.umeng.qq.handler.UmengQZoneHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.QQ, "com.umeng.qq.handler.UmengQQHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.RENREN, "com.umeng.socialize.handler.RenrenSsoHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.TENCENT, "com.umeng.socialize.handler.TencentWBSsoHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.WEIXIN, "com.umeng.weixin.handler.UmengWXHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.WEIXIN_CIRCLE, "com.umeng.weixin.handler.UmengWXHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.WEIXIN_FAVORITE, "com.umeng.weixin.handler.UmengWXHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.YIXIN, "com.umeng.socialize.handler.UMYXHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.YIXIN_CIRCLE, "com.umeng.socialize.handler.UMYXHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.EMAIL, "com.umeng.socialize.handler.EmailHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.EVERNOTE, "com.umeng.socialize.handler.UMEvernoteHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.FACEBOOK, "com.umeng.socialize.handler.UMFacebookHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.FACEBOOK_MESSAGER, "com.umeng.socialize.handler.UMFacebookHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.FLICKR, "com.umeng.socialize.handler.UMFlickrHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.FOURSQUARE, "com.umeng.socialize.handler.UMFourSquareHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.GOOGLEPLUS, "com.umeng.socialize.handler.UMGooglePlusHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.INSTAGRAM, "com.umeng.socialize.handler.UMInstagramHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.KAKAO, "com.umeng.socialize.handler.UMKakaoHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.LINE, "com.umeng.socialize.handler.UMLineHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.LINKEDIN, "com.umeng.socialize.handler.UMLinkedInHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.POCKET, "com.umeng.socialize.handler.UMPocketHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.WHATSAPP, "com.umeng.socialize.handler.UMWhatsAppHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.YNOTE, "com.umeng.socialize.handler.UMYNoteHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.SMS, "com.umeng.socialize.handler.SmsHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.DOUBAN, "com.umeng.socialize.handler.DoubanHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.TUMBLR, "com.umeng.socialize.handler.UMTumblrHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.TWITTER, "com.umeng.socialize.handler.TwitterHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.ALIPAY, "com.umeng.socialize.handler.AlipayHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.MORE, "com.umeng.socialize.handler.UMMoreHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.DINGTALK, "com.umeng.socialize.handler.UMDingSSoHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.VKONTAKTE, "com.umeng.socialize.handler.UMVKHandler"));
        arrayList.add(new Pair(SHARE_MEDIA.DROPBOX, "com.umeng.socialize.handler.UMDropBoxHandler"));
        this.f10664g = new C3912a(this.f10662e);
        this.f10665h = null;
        this.f10666i = new SparseArray<>();
        this.f10667j = new SparseArray<>();
        this.f10668k = new SparseArray<>();
        this.f10665h = context;
        m10736b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private synchronized UMShareListener m10743e(int i) {
        UMShareListener uMShareListener;
        uMShareListener = this.f10667j.get(i, null);
        if (uMShareListener != null) {
            this.f10667j.remove(i);
        }
        return uMShareListener;
    }

    /* renamed from: d */
    public boolean mo40255d(Activity activity, SHARE_MEDIA share_media) {
        if (!this.f10664g.mo40260a(activity, share_media)) {
            return false;
        }
        this.f10662e.get(share_media).onCreate(activity, PlatformConfig.getPlatform(share_media));
        return this.f10662e.get(share_media).isAuthorize();
    }

    /* renamed from: b */
    private void m10738b(Context context) {
        String appkey = SocializeUtils.getAppkey(context);
        if (TextUtils.isEmpty(appkey)) {
            throw new SocializeException(UmengText.errorWithUrl(UmengText.CHECK.APPKEY_NOT_FOUND, UrlUtil.ALL_NO_APPKEY));
        } else if (SocializeNetUtils.isConSpeCharacters(appkey)) {
            throw new SocializeException(UmengText.errorWithUrl(UmengText.CHECK.APPKEY_NOT_FOUND, UrlUtil.ALL_ERROR_APPKEY));
        } else if (SocializeNetUtils.isSelfAppkey(appkey)) {
            throw new SocializeException(UmengText.errorWithUrl(UmengText.CHECK.APPKEY_NOT_FOUND, UrlUtil.ALL_ERROR_APPKEY));
        }
    }

    /* renamed from: c */
    public String mo40253c(Activity activity, SHARE_MEDIA share_media) {
        if (!this.f10664g.mo40260a(activity, share_media)) {
            return "";
        }
        this.f10662e.get(share_media).onCreate(activity, PlatformConfig.getPlatform(share_media));
        return this.f10662e.get(share_media).getSDKVersion();
    }

    /* renamed from: a */
    public void mo40247a(Context context) {
        this.f10665h = context.getApplicationContext();
    }

    /* renamed from: a */
    private UMSSOHandler m10727a(String str) {
        UMSSOHandler uMSSOHandler;
        try {
            uMSSOHandler = (UMSSOHandler) Class.forName(str).newInstance();
        } catch (Exception unused) {
            uMSSOHandler = null;
        }
        if (uMSSOHandler == null) {
            if (str.contains("SinaSimplyHandler")) {
                Config.isUmengSina = false;
                return m10727a("com.umeng.socialize.handler.SinaSsoHandler");
            } else if (str.contains("UmengQQHandler")) {
                Config.isUmengQQ = false;
                return m10727a("com.umeng.socialize.handler.UMQQSsoHandler");
            } else if (str.contains("UmengQZoneHandler")) {
                Config.isUmengQQ = false;
                return m10727a("com.umeng.socialize.handler.QZoneSsoHandler");
            } else if (str.contains("UmengWXHandler")) {
                Config.isUmengWx = false;
                return m10727a("com.umeng.socialize.handler.UMWXHandler");
            }
        }
        return uMSSOHandler;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private synchronized UMAuthListener m10742d(int i) {
        UMAuthListener uMAuthListener;
        uMAuthListener = this.f10668k.get(i, null);
        if (uMAuthListener != null) {
            this.f10668k.remove(i);
        }
        return uMAuthListener;
    }

    /* renamed from: com.umeng.socialize.a.a$a */
    public static class C3912a {

        /* renamed from: a */
        public Map<SHARE_MEDIA, UMSSOHandler> f10692a;

        public C3912a(Map<SHARE_MEDIA, UMSSOHandler> map) {
            this.f10692a = map;
        }

        /* renamed from: a */
        private boolean m10760a(Context context) {
            return context != null;
        }

        /* renamed from: a */
        public boolean mo40260a(Context context, SHARE_MEDIA share_media) {
            if (!m10760a(context) || !m10761a(share_media)) {
                return false;
            }
            if (this.f10692a.get(share_media).isSupportAuth()) {
                return true;
            }
            SLog.m10856E(share_media.toString() + UmengText.AUTH.NOT_SUPPORT_PLATFROM);
            return false;
        }

        /* renamed from: a */
        public boolean mo40261a(ShareAction shareAction) {
            SHARE_MEDIA platform = shareAction.getPlatform();
            if (platform == null) {
                return false;
            }
            if ((platform == SHARE_MEDIA.SINA || platform == SHARE_MEDIA.QQ || platform == SHARE_MEDIA.WEIXIN) && !PlatformConfig.configs.get(platform).isConfigured()) {
                SLog.m10856E(UmengText.CHECK.noKey(platform));
                return false;
            } else if (!m10761a(platform)) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: a */
        private boolean m10761a(SHARE_MEDIA share_media) {
            PlatformConfig.configs.get(share_media);
            if (this.f10692a.get(share_media) != null) {
                return true;
            }
            SLog.mutlE(UmengText.CHECK.noJar(share_media), UrlUtil.ALL_NO_JAR);
            return false;
        }
    }

    /* renamed from: c */
    public void mo40254c(Activity activity, final SHARE_MEDIA share_media, final UMAuthListener uMAuthListener) {
        if (this.f10664g.mo40260a(activity, share_media)) {
            UMSSOHandler uMSSOHandler = this.f10662e.get(share_media);
            uMSSOHandler.onCreate(activity, PlatformConfig.getPlatform(share_media));
            String valueOf = String.valueOf(System.currentTimeMillis());
            if (ContextUtil.getContext() != null) {
                SocialAnalytics.authstart(ContextUtil.getContext(), share_media, uMSSOHandler.getSDKVersion(), uMSSOHandler.isInstall(), valueOf);
            }
            int ordinal = share_media.ordinal();
            m10730a(ordinal, uMAuthListener);
            UMAuthListener a = m10724a(ordinal, valueOf, uMSSOHandler.isInstall());
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.p274a.C3903a.RunnableC39074 */

                public void run() {
                    uMAuthListener.onStart(share_media);
                }
            });
            uMSSOHandler.authorize(a);
            this.f10660a = share_media;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private void m10736b() {
        UMSSOHandler uMSSOHandler;
        for (Pair<SHARE_MEDIA, String> pair : this.f10663f) {
            Object obj = pair.first;
            if (obj == SHARE_MEDIA.WEIXIN_CIRCLE || obj == SHARE_MEDIA.WEIXIN_FAVORITE) {
                uMSSOHandler = this.f10662e.get(SHARE_MEDIA.WEIXIN);
            } else if (obj == SHARE_MEDIA.FACEBOOK_MESSAGER) {
                uMSSOHandler = this.f10662e.get(SHARE_MEDIA.FACEBOOK);
            } else if (obj == SHARE_MEDIA.YIXIN_CIRCLE) {
                uMSSOHandler = this.f10662e.get(SHARE_MEDIA.YIXIN);
            } else if (obj == SHARE_MEDIA.LAIWANG_DYNAMIC) {
                uMSSOHandler = this.f10662e.get(SHARE_MEDIA.LAIWANG);
            } else if (obj == SHARE_MEDIA.TENCENT) {
                uMSSOHandler = m10727a((String) pair.second);
            } else if (obj == SHARE_MEDIA.MORE) {
                uMSSOHandler = new UMMoreHandler();
            } else if (obj == SHARE_MEDIA.SINA) {
                if (Config.isUmengSina.booleanValue()) {
                    uMSSOHandler = m10727a((String) pair.second);
                } else {
                    uMSSOHandler = m10727a("com.umeng.socialize.handler.SinaSsoHandler");
                }
            } else if (obj == SHARE_MEDIA.WEIXIN) {
                if (Config.isUmengWx.booleanValue()) {
                    uMSSOHandler = m10727a((String) pair.second);
                } else {
                    uMSSOHandler = m10727a("com.umeng.socialize.handler.UMWXHandler");
                }
            } else if (obj == SHARE_MEDIA.QQ) {
                if (Config.isUmengQQ.booleanValue()) {
                    uMSSOHandler = m10727a((String) pair.second);
                } else {
                    uMSSOHandler = m10727a("com.umeng.socialize.handler.UMQQSsoHandler");
                }
            } else if (obj != SHARE_MEDIA.QZONE) {
                uMSSOHandler = m10727a((String) pair.second);
            } else if (Config.isUmengQQ.booleanValue()) {
                uMSSOHandler = m10727a((String) pair.second);
            } else {
                uMSSOHandler = m10727a("com.umeng.socialize.handler.QZoneSsoHandler");
            }
            this.f10662e.put(pair.first, uMSSOHandler);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private synchronized UMAuthListener m10739c(int i) {
        UMAuthListener uMAuthListener;
        this.f10660a = null;
        uMAuthListener = this.f10666i.get(i, null);
        if (uMAuthListener != null) {
            this.f10666i.remove(i);
        }
        return uMAuthListener;
    }

    /* renamed from: a */
    public UMSSOHandler mo40240a(SHARE_MEDIA share_media) {
        UMSSOHandler uMSSOHandler = this.f10662e.get(share_media);
        if (uMSSOHandler != null) {
            uMSSOHandler.onCreate(this.f10665h, PlatformConfig.getPlatform(share_media));
        }
        return uMSSOHandler;
    }

    /* renamed from: c */
    private synchronized void m10741c() {
        this.f10666i.clear();
        this.f10667j.clear();
        this.f10668k.clear();
    }

    /* renamed from: a */
    public void mo40242a(int i, int i2, Intent intent) {
        UMSSOHandler a = m10726a(i);
        if (a != null) {
            a.onActivityResult(i, i2, intent);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo40243a(Activity activity, int i, UMAuthListener uMAuthListener) {
        UMSSOHandler a = m10726a(i);
        if (a == null) {
            return;
        }
        if (i == 10103 || i == 11101) {
            a.onCreate(activity, PlatformConfig.getPlatform(m10735b(i)));
            m10733a(SHARE_MEDIA.QQ, uMAuthListener, a, String.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    private UMSSOHandler m10726a(int i) {
        int i2 = HandlerRequestCode.REQUEST_QQ_SHARE;
        if (!(i == 10103 || i == 11101)) {
            i2 = i;
        }
        if (i == 64207 || i == 64206 || i == 64208) {
            i2 = HandlerRequestCode.FACEBOOK_REQUEST_AUTH_CODE;
        }
        int i3 = HandlerRequestCode.SINA_REQUEST_CODE;
        if (i == 32973 || i == 765) {
            i2 = HandlerRequestCode.SINA_REQUEST_CODE;
        }
        if (i != 5650) {
            i3 = i2;
        }
        for (UMSSOHandler uMSSOHandler : this.f10662e.values()) {
            if (uMSSOHandler != null && i3 == uMSSOHandler.getRequestCode()) {
                return uMSSOHandler;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo40246a(Activity activity, SHARE_MEDIA share_media, UMAuthListener uMAuthListener) {
        if (this.f10664g.mo40260a(activity, share_media)) {
            if (uMAuthListener == null) {
                uMAuthListener = new UMAuthListener() {
                    /* class com.umeng.socialize.p274a.C3903a.C39041 */

                    @Override // com.umeng.socialize.UMAuthListener
                    public void onCancel(SHARE_MEDIA share_media, int i) {
                    }

                    @Override // com.umeng.socialize.UMAuthListener
                    public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                    }

                    @Override // com.umeng.socialize.UMAuthListener
                    public void onError(SHARE_MEDIA share_media, int i, Throwable th) {
                    }

                    @Override // com.umeng.socialize.UMAuthListener
                    public void onStart(SHARE_MEDIA share_media) {
                    }
                };
            }
            this.f10662e.get(share_media).onCreate(activity, PlatformConfig.getPlatform(share_media));
            this.f10662e.get(share_media).deleteAuth(uMAuthListener);
        }
    }

    /* renamed from: a */
    public boolean mo40250a(Activity activity, SHARE_MEDIA share_media) {
        this.f10662e.get(share_media).onCreate(activity, PlatformConfig.getPlatform(share_media));
        return this.f10662e.get(share_media).isInstall();
    }

    /* renamed from: a */
    private UMAuthListener m10724a(final int i, final String str, final boolean z) {
        return new UMAuthListener() {
            /* class com.umeng.socialize.p274a.C3903a.C39085 */

            @Override // com.umeng.socialize.UMAuthListener
            public void onCancel(SHARE_MEDIA share_media, int i) {
                UMAuthListener c = C3903a.this.m10739c(i);
                if (c != null) {
                    c.onCancel(share_media, i);
                }
                if (ContextUtil.getContext() != null) {
                    SocialAnalytics.authendt(ContextUtil.getContext(), share_media, "cancel", z, "", str, null);
                }
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                UMAuthListener c = C3903a.this.m10739c(i);
                if (c != null) {
                    c.onComplete(share_media, i, map);
                }
                if (ContextUtil.getContext() != null) {
                    SocialAnalytics.authendt(ContextUtil.getContext(), share_media, "success", z, "", str, C3903a.this.m10729a((C3903a) share_media, (SHARE_MEDIA) map));
                }
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onError(SHARE_MEDIA share_media, int i, Throwable th) {
                UMAuthListener c = C3903a.this.m10739c(i);
                if (c != null) {
                    c.onError(share_media, i, th);
                }
                if (th != null) {
                    SLog.m10856E(th.getMessage());
                    SLog.runtimePrint(th.getMessage());
                } else {
                    SLog.m10856E("null");
                    SLog.runtimePrint("null");
                }
                if (ContextUtil.getContext() != null && th != null) {
                    SocialAnalytics.authendt(ContextUtil.getContext(), share_media, "fail", z, th.getMessage(), str, null);
                }
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onStart(SHARE_MEDIA share_media) {
                UMAuthListener c = C3903a.this.m10739c(i);
                if (c != null) {
                    c.onStart(share_media);
                }
            }
        };
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private Map<String, String> m10729a(SHARE_MEDIA share_media, Map<String, String> map) {
        String str;
        String str2 = "";
        if (PlatformConfig.getPlatform(share_media) != null) {
            str2 = PlatformConfig.getPlatform(share_media).getAppid();
            str = PlatformConfig.getPlatform(share_media).getAppSecret();
        } else {
            str = str2;
        }
        map.put(CommonNetImpl.AID, str2);
        map.put(CommonNetImpl.f10813AS, str);
        return map;
    }

    /* renamed from: b */
    private SHARE_MEDIA m10735b(int i) {
        if (i == 10103 || i == 11101) {
            return SHARE_MEDIA.QQ;
        }
        if (i == 32973 || i == 765) {
            return SHARE_MEDIA.SINA;
        }
        return SHARE_MEDIA.QQ;
    }

    /* renamed from: a */
    private void m10732a(ShareAction shareAction) {
        ShareContent shareContent = shareAction.getShareContent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(UmengText.SHARE.INFO);
        arrayList.add(UmengText.SHARE.SHAREPLAT + shareAction.getPlatform().toString());
        arrayList.add(UmengText.SHARE.SHARESTYLE + shareAction.getShareContent().getShareType());
        arrayList.add(UmengText.SHARE.SHARETEXT + shareContent.mText);
        UMediaObject uMediaObject = shareContent.mMedia;
        if (uMediaObject != null) {
            if (uMediaObject instanceof UMImage) {
                UMImage uMImage = (UMImage) uMediaObject;
                if (uMImage.isUrlMedia()) {
                    arrayList.add(UmengText.SHARE.URLIMAGE + uMImage.asUrlImage());
                } else {
                    byte[] asBinImage = uMImage.asBinImage();
                    StringBuilder sb = new StringBuilder();
                    sb.append(UmengText.SHARE.LOCALIMAGE);
                    sb.append(asBinImage == null ? 0 : asBinImage.length);
                    arrayList.add(sb.toString());
                }
                if (uMImage.getThumbImage() != null) {
                    UMImage thumbImage = uMImage.getThumbImage();
                    if (thumbImage.isUrlMedia()) {
                        arrayList.add(UmengText.SHARE.URLTHUMB + thumbImage.asUrlImage());
                    } else {
                        arrayList.add(UmengText.SHARE.LOCALTHUMB + thumbImage.asBinImage().length);
                    }
                }
            }
            UMediaObject uMediaObject2 = shareContent.mMedia;
            if (uMediaObject2 instanceof UMVideo) {
                UMVideo uMVideo = (UMVideo) uMediaObject2;
                arrayList.add(UmengText.SHARE.VIDEOURL + uMVideo.toUrl());
                arrayList.add(UmengText.SHARE.VIDEOTITLE + uMVideo.getTitle());
                arrayList.add(UmengText.SHARE.VIDEODES + uMVideo.getDescription());
                if (uMVideo.getThumbImage() != null) {
                    if (uMVideo.getThumbImage().isUrlMedia()) {
                        arrayList.add(UmengText.SHARE.URLTHUMB + uMVideo.getThumbImage().asUrlImage());
                    } else {
                        arrayList.add(UmengText.SHARE.LOCALTHUMB + uMVideo.getThumbImage().asBinImage().length);
                    }
                }
            }
            UMediaObject uMediaObject3 = shareContent.mMedia;
            if (uMediaObject3 instanceof UMusic) {
                UMusic uMusic = (UMusic) uMediaObject3;
                arrayList.add(UmengText.SHARE.MUSICURL + uMusic.toUrl() + "   " + uMusic.getmTargetUrl());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(UmengText.SHARE.MUSICTITLE);
                sb2.append(uMusic.getTitle());
                arrayList.add(sb2.toString());
                arrayList.add(UmengText.SHARE.MUSICDES + uMusic.getDescription());
                if (uMusic.getThumbImage() != null) {
                    if (uMusic.getThumbImage().isUrlMedia()) {
                        arrayList.add(UmengText.SHARE.URLTHUMB + uMusic.getThumbImage().asUrlImage());
                    } else {
                        arrayList.add(UmengText.SHARE.LOCALTHUMB + uMusic.getThumbImage().asBinImage().length);
                    }
                }
            }
            UMediaObject uMediaObject4 = shareContent.mMedia;
            if (uMediaObject4 instanceof UMWeb) {
                UMWeb uMWeb = (UMWeb) uMediaObject4;
                arrayList.add(UmengText.SHARE.URLURL + uMWeb.toUrl());
                arrayList.add(UmengText.SHARE.URLTITLE + uMWeb.getTitle());
                arrayList.add(UmengText.SHARE.URLDES + uMWeb.getDescription());
                if (uMWeb.getThumbImage() != null) {
                    if (uMWeb.getThumbImage().isUrlMedia()) {
                        arrayList.add(UmengText.SHARE.URLTHUMB + uMWeb.getThumbImage().asUrlImage());
                    } else {
                        arrayList.add(UmengText.SHARE.LOCALTHUMB + uMWeb.getThumbImage().asBinImage().length);
                    }
                }
            }
        }
        if (shareContent.file != null) {
            arrayList.add(UmengText.SHARE.FILENAME + shareContent.file.getName());
        }
        SLog.mutlI((String[]) arrayList.toArray(new String[1]));
    }

    /* renamed from: b */
    public void mo40251b(Activity activity, final SHARE_MEDIA share_media, final UMAuthListener uMAuthListener) {
        if (this.f10664g.mo40260a(activity, share_media)) {
            UMSSOHandler uMSSOHandler = this.f10662e.get(share_media);
            uMSSOHandler.onCreate(activity, PlatformConfig.getPlatform(share_media));
            final String valueOf = String.valueOf(System.currentTimeMillis());
            if (ContextUtil.getContext() != null) {
                SocialAnalytics.getInfostart(ContextUtil.getContext(), share_media, valueOf);
            }
            final int ordinal = share_media.ordinal();
            m10737b(ordinal, uMAuthListener);
            C39052 r2 = new UMAuthListener() {
                /* class com.umeng.socialize.p274a.C3903a.C39052 */

                @Override // com.umeng.socialize.UMAuthListener
                public void onCancel(SHARE_MEDIA share_media, int i) {
                    UMAuthListener d = C3903a.this.m10742d(ordinal);
                    if (d != null) {
                        d.onCancel(share_media, i);
                    }
                    if (ContextUtil.getContext() != null) {
                        SocialAnalytics.getInfoendt(ContextUtil.getContext(), share_media, "cancel", "", valueOf, null);
                    }
                }

                @Override // com.umeng.socialize.UMAuthListener
                public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                    UMAuthListener d = C3903a.this.m10742d(ordinal);
                    if (d != null) {
                        d.onComplete(share_media, i, map);
                    }
                    if (ContextUtil.getContext() != null) {
                        SocialAnalytics.getInfoendt(ContextUtil.getContext(), share_media, "success", "", valueOf, map);
                    }
                }

                @Override // com.umeng.socialize.UMAuthListener
                public void onError(SHARE_MEDIA share_media, int i, Throwable th) {
                    UMAuthListener d = C3903a.this.m10742d(ordinal);
                    if (d != null) {
                        d.onError(share_media, i, th);
                    }
                    if (th != null) {
                        SLog.m10856E(th.getMessage());
                        SLog.m10856E(UmengText.SOLVE + UrlUtil.ALL_AUTHFAIL);
                        SLog.runtimePrint(th.getMessage());
                    } else {
                        SLog.m10856E(UmengText.SOLVE + UrlUtil.ALL_AUTHFAIL);
                    }
                    if (ContextUtil.getContext() != null && th != null) {
                        SocialAnalytics.getInfoendt(ContextUtil.getContext(), share_media, "fail", th.getMessage(), valueOf, null);
                    }
                }

                @Override // com.umeng.socialize.UMAuthListener
                public void onStart(SHARE_MEDIA share_media) {
                    UMAuthListener d = C3903a.this.m10742d(ordinal);
                    if (d != null) {
                        d.onStart(share_media);
                    }
                }
            };
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.p274a.C3903a.RunnableC39063 */

                public void run() {
                    uMAuthListener.onStart(share_media);
                }
            });
            uMSSOHandler.getPlatformInfo(r2);
        }
    }

    /* renamed from: b */
    public boolean mo40252b(Activity activity, SHARE_MEDIA share_media) {
        if (!this.f10664g.mo40260a(activity, share_media)) {
            return false;
        }
        this.f10662e.get(share_media).onCreate(activity, PlatformConfig.getPlatform(share_media));
        return this.f10662e.get(share_media).isSupport();
    }

    /* renamed from: b */
    private synchronized void m10737b(int i, UMAuthListener uMAuthListener) {
        this.f10668k.put(i, uMAuthListener);
    }

    /* renamed from: a */
    public void mo40245a(Activity activity, final ShareAction shareAction, final UMShareListener uMShareListener) {
        m10738b(activity);
        WeakReference weakReference = new WeakReference(activity);
        if (this.f10664g.mo40261a(shareAction)) {
            if (SLog.isDebug()) {
                SLog.m10856E(UmengText.SHARE.VERSION + this.f10661d);
                m10732a(shareAction);
            }
            SHARE_MEDIA platform = shareAction.getPlatform();
            UMSSOHandler uMSSOHandler = this.f10662e.get(platform);
            uMSSOHandler.onCreate((Context) weakReference.get(), PlatformConfig.getPlatform(platform));
            if (!platform.toString().equals("TENCENT") && !platform.toString().equals("RENREN") && !platform.toString().equals("DOUBAN")) {
                if (platform.toString().equals("WEIXIN")) {
                    SocialAnalytics.log((Context) weakReference.get(), "wxsession", shareAction.getShareContent().mText, shareAction.getShareContent().mMedia);
                } else if (platform.toString().equals("WEIXIN_CIRCLE")) {
                    SocialAnalytics.log((Context) weakReference.get(), "wxtimeline", shareAction.getShareContent().mText, shareAction.getShareContent().mMedia);
                } else if (platform.toString().equals("WEIXIN_FAVORITE")) {
                    SocialAnalytics.log((Context) weakReference.get(), "wxfavorite", shareAction.getShareContent().mText, shareAction.getShareContent().mMedia);
                } else {
                    SocialAnalytics.log((Context) weakReference.get(), platform.toString().toLowerCase(), shareAction.getShareContent().mText, shareAction.getShareContent().mMedia);
                }
            }
            final String valueOf = String.valueOf(System.currentTimeMillis());
            if (ContextUtil.getContext() != null) {
                DplusApi.uploadShare(ContextUtil.getContext(), shareAction.getShareContent(), uMSSOHandler.isInstall(), platform, valueOf, shareAction.getShareContent().mMedia instanceof UMImage ? ((UMImage) shareAction.getShareContent().mMedia).isHasWaterMark() : false);
            }
            final int ordinal = platform.ordinal();
            m10731a(ordinal, uMShareListener);
            final C39096 r1 = new UMShareListener() {
                /* class com.umeng.socialize.p274a.C3903a.C39096 */

                @Override // com.umeng.socialize.UMShareListener
                public void onCancel(SHARE_MEDIA share_media) {
                    if (ContextUtil.getContext() != null) {
                        SocialAnalytics.shareend(ContextUtil.getContext(), share_media, "cancel", "", valueOf);
                    }
                    UMShareListener e = C3903a.this.m10743e(ordinal);
                    if (e != null) {
                        e.onCancel(share_media);
                    }
                }

                @Override // com.umeng.socialize.UMShareListener
                public void onError(SHARE_MEDIA share_media, Throwable th) {
                    if (!(ContextUtil.getContext() == null || th == null)) {
                        SocialAnalytics.shareend(ContextUtil.getContext(), share_media, "fail", th.getMessage(), valueOf);
                    }
                    UMShareListener e = C3903a.this.m10743e(ordinal);
                    if (e != null) {
                        e.onError(share_media, th);
                    }
                    if (th != null) {
                        SLog.m10856E(th.getMessage());
                        SLog.m10856E(UmengText.SOLVE + UrlUtil.ALL_SHAREFAIL);
                        SLog.runtimePrint(th.getMessage());
                        return;
                    }
                    SLog.m10856E("null");
                    SLog.m10856E(UmengText.SOLVE + UrlUtil.ALL_SHAREFAIL);
                    SLog.runtimePrint("null");
                }

                @Override // com.umeng.socialize.UMShareListener
                public void onResult(SHARE_MEDIA share_media) {
                    if (ContextUtil.getContext() != null) {
                        SocialAnalytics.shareend(ContextUtil.getContext(), share_media, "success", "", valueOf);
                    }
                    UMShareListener e = C3903a.this.m10743e(ordinal);
                    if (e != null) {
                        e.onResult(share_media);
                    }
                }

                @Override // com.umeng.socialize.UMShareListener
                public void onStart(SHARE_MEDIA share_media) {
                    UMShareListener e = C3903a.this.m10743e(ordinal);
                    if (e != null) {
                        e.onStart(share_media);
                    }
                }
            };
            if (!shareAction.getUrlValid()) {
                QueuedWork.runInMain(new Runnable() {
                    /* class com.umeng.socialize.p274a.C3903a.RunnableC39107 */

                    public void run() {
                        UMShareListener uMShareListener = r1;
                        SHARE_MEDIA platform = shareAction.getPlatform();
                        uMShareListener.onError(platform, new Throwable(UmengErrorCode.ShareFailed.getMessage() + UmengText.SHARE.WEB_HTTP));
                    }
                });
                return;
            }
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.p274a.C3903a.RunnableC39118 */

                public void run() {
                    UMShareListener uMShareListener = uMShareListener;
                    if (uMShareListener != null) {
                        uMShareListener.onStart(shareAction.getPlatform());
                    }
                }
            });
            try {
                uMSSOHandler.share(shareAction.getShareContent(), r1);
            } catch (Throwable th) {
                SLog.error(th);
            }
        }
    }

    /* renamed from: a */
    private synchronized void m10730a(int i, UMAuthListener uMAuthListener) {
        this.f10666i.put(i, uMAuthListener);
    }

    /* renamed from: a */
    private synchronized void m10731a(int i, UMShareListener uMShareListener) {
        this.f10667j.put(i, uMShareListener);
    }

    /* renamed from: a */
    private void m10733a(SHARE_MEDIA share_media, UMAuthListener uMAuthListener, UMSSOHandler uMSSOHandler, String str) {
        if (!uMSSOHandler.isHasAuthListener()) {
            int ordinal = share_media.ordinal();
            m10730a(ordinal, uMAuthListener);
            uMSSOHandler.setAuthListener(m10724a(ordinal, str, uMSSOHandler.isInstall()));
        }
    }

    /* renamed from: a */
    public void mo40241a() {
        m10741c();
        C3914a.m10784b();
        UMSSOHandler uMSSOHandler = this.f10662e.get(SHARE_MEDIA.SINA);
        if (uMSSOHandler != null) {
            uMSSOHandler.release();
        }
        UMSSOHandler uMSSOHandler2 = this.f10662e.get(SHARE_MEDIA.MORE);
        if (uMSSOHandler2 != null) {
            uMSSOHandler2.release();
        }
        UMSSOHandler uMSSOHandler3 = this.f10662e.get(SHARE_MEDIA.DINGTALK);
        if (uMSSOHandler3 != null) {
            uMSSOHandler3.release();
        }
        UMSSOHandler uMSSOHandler4 = this.f10662e.get(SHARE_MEDIA.WEIXIN);
        if (uMSSOHandler4 != null) {
            uMSSOHandler4.release();
        }
        UMSSOHandler uMSSOHandler5 = this.f10662e.get(SHARE_MEDIA.QQ);
        if (uMSSOHandler5 != null) {
            uMSSOHandler5.release();
        }
        this.f10660a = null;
        DplusCacheApi.getInstance().closeDBConnection(ContextUtil.getContext());
    }

    /* renamed from: a */
    public void mo40248a(Bundle bundle) {
        int i;
        String str;
        SHARE_MEDIA share_media = this.f10660a;
        if (share_media == null || !(share_media == SHARE_MEDIA.WEIXIN || share_media == SHARE_MEDIA.QQ || share_media == SHARE_MEDIA.SINA)) {
            str = "";
            i = -1;
        } else {
            str = this.f10660a.toString();
            i = 0;
        }
        bundle.putString(f10658b, str);
        bundle.putInt(f10659c, i);
        this.f10660a = null;
    }

    /* renamed from: a */
    public void mo40244a(Activity activity, Bundle bundle, UMAuthListener uMAuthListener) {
        SHARE_MEDIA convertToEmun;
        UMSSOHandler uMSSOHandler;
        if (bundle != null && uMAuthListener != null) {
            String string = bundle.getString(f10658b, null);
            if (bundle.getInt(f10659c, -1) == 0 && !TextUtils.isEmpty(string) && (convertToEmun = SHARE_MEDIA.convertToEmun(string)) != null) {
                if (convertToEmun == SHARE_MEDIA.QQ) {
                    uMSSOHandler = this.f10662e.get(convertToEmun);
                    uMSSOHandler.onCreate(activity, PlatformConfig.getPlatform(convertToEmun));
                } else {
                    uMSSOHandler = mo40240a(convertToEmun);
                }
                if (uMSSOHandler != null) {
                    m10733a(convertToEmun, uMAuthListener, uMSSOHandler, String.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo40249a(UMShareConfig uMShareConfig) {
        Map<SHARE_MEDIA, UMSSOHandler> map = this.f10662e;
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<SHARE_MEDIA, UMSSOHandler> entry : this.f10662e.entrySet()) {
                UMSSOHandler value = entry.getValue();
                if (value != null) {
                    value.setShareConfig(uMShareConfig);
                }
            }
        }
    }
}
