package com.umeng.socialize;

import android.text.TextUtils;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class PlatformConfig {
    public static Map<SHARE_MEDIA, Platform> configs;

    public static class APPIDPlatform implements Platform {
        public String appId = null;
        public String appkey = null;
        public String fileProvider = null;

        /* renamed from: p */
        public SHARE_MEDIA f10615p;
        public String redirectUrl = null;

        public APPIDPlatform(SHARE_MEDIA share_media) {
            this.f10615p = share_media;
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public String getAppSecret() {
            return this.appkey;
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public String getAppid() {
            return this.appId;
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public SHARE_MEDIA getName() {
            return this.f10615p;
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public boolean isConfigured() {
            return !TextUtils.isEmpty(this.appId) && !TextUtils.isEmpty(this.appkey);
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public void parse(JSONObject jSONObject) {
        }
    }

    public static class CustomPlatform implements Platform {
        public static final String Name = "g+";
        public String appId = null;
        public String appkey = null;

        /* renamed from: p */
        public SHARE_MEDIA f10616p;

        public CustomPlatform(SHARE_MEDIA share_media) {
            this.f10616p = share_media;
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public String getAppSecret() {
            return this.appkey;
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public String getAppid() {
            return this.appId;
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public SHARE_MEDIA getName() {
            return this.f10616p;
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public boolean isConfigured() {
            return true;
        }

        @Override // com.umeng.socialize.PlatformConfig.Platform
        public void parse(JSONObject jSONObject) {
        }
    }

    public interface Platform {
        String getAppSecret();

        String getAppid();

        SHARE_MEDIA getName();

        boolean isConfigured();

        void parse(JSONObject jSONObject);
    }

    static {
        HashMap hashMap = new HashMap();
        configs = hashMap;
        SHARE_MEDIA share_media = SHARE_MEDIA.QQ;
        hashMap.put(share_media, new APPIDPlatform(share_media));
        Map<SHARE_MEDIA, Platform> map = configs;
        SHARE_MEDIA share_media2 = SHARE_MEDIA.QZONE;
        map.put(share_media2, new APPIDPlatform(share_media2));
        Map<SHARE_MEDIA, Platform> map2 = configs;
        SHARE_MEDIA share_media3 = SHARE_MEDIA.WEIXIN;
        map2.put(share_media3, new APPIDPlatform(share_media3));
        configs.put(SHARE_MEDIA.VKONTAKTE, new APPIDPlatform(SHARE_MEDIA.WEIXIN));
        Map<SHARE_MEDIA, Platform> map3 = configs;
        SHARE_MEDIA share_media4 = SHARE_MEDIA.WEIXIN_CIRCLE;
        map3.put(share_media4, new APPIDPlatform(share_media4));
        Map<SHARE_MEDIA, Platform> map4 = configs;
        SHARE_MEDIA share_media5 = SHARE_MEDIA.WEIXIN_FAVORITE;
        map4.put(share_media5, new APPIDPlatform(share_media5));
        Map<SHARE_MEDIA, Platform> map5 = configs;
        SHARE_MEDIA share_media6 = SHARE_MEDIA.FACEBOOK_MESSAGER;
        map5.put(share_media6, new CustomPlatform(share_media6));
        Map<SHARE_MEDIA, Platform> map6 = configs;
        SHARE_MEDIA share_media7 = SHARE_MEDIA.DOUBAN;
        map6.put(share_media7, new CustomPlatform(share_media7));
        Map<SHARE_MEDIA, Platform> map7 = configs;
        SHARE_MEDIA share_media8 = SHARE_MEDIA.LAIWANG;
        map7.put(share_media8, new APPIDPlatform(share_media8));
        Map<SHARE_MEDIA, Platform> map8 = configs;
        SHARE_MEDIA share_media9 = SHARE_MEDIA.LAIWANG_DYNAMIC;
        map8.put(share_media9, new APPIDPlatform(share_media9));
        Map<SHARE_MEDIA, Platform> map9 = configs;
        SHARE_MEDIA share_media10 = SHARE_MEDIA.YIXIN;
        map9.put(share_media10, new APPIDPlatform(share_media10));
        Map<SHARE_MEDIA, Platform> map10 = configs;
        SHARE_MEDIA share_media11 = SHARE_MEDIA.YIXIN_CIRCLE;
        map10.put(share_media11, new APPIDPlatform(share_media11));
        Map<SHARE_MEDIA, Platform> map11 = configs;
        SHARE_MEDIA share_media12 = SHARE_MEDIA.SINA;
        map11.put(share_media12, new APPIDPlatform(share_media12));
        Map<SHARE_MEDIA, Platform> map12 = configs;
        SHARE_MEDIA share_media13 = SHARE_MEDIA.TENCENT;
        map12.put(share_media13, new CustomPlatform(share_media13));
        Map<SHARE_MEDIA, Platform> map13 = configs;
        SHARE_MEDIA share_media14 = SHARE_MEDIA.ALIPAY;
        map13.put(share_media14, new APPIDPlatform(share_media14));
        Map<SHARE_MEDIA, Platform> map14 = configs;
        SHARE_MEDIA share_media15 = SHARE_MEDIA.RENREN;
        map14.put(share_media15, new CustomPlatform(share_media15));
        Map<SHARE_MEDIA, Platform> map15 = configs;
        SHARE_MEDIA share_media16 = SHARE_MEDIA.DROPBOX;
        map15.put(share_media16, new APPIDPlatform(share_media16));
        Map<SHARE_MEDIA, Platform> map16 = configs;
        SHARE_MEDIA share_media17 = SHARE_MEDIA.GOOGLEPLUS;
        map16.put(share_media17, new CustomPlatform(share_media17));
        Map<SHARE_MEDIA, Platform> map17 = configs;
        SHARE_MEDIA share_media18 = SHARE_MEDIA.FACEBOOK;
        map17.put(share_media18, new CustomPlatform(share_media18));
        Map<SHARE_MEDIA, Platform> map18 = configs;
        SHARE_MEDIA share_media19 = SHARE_MEDIA.TWITTER;
        map18.put(share_media19, new APPIDPlatform(share_media19));
        Map<SHARE_MEDIA, Platform> map19 = configs;
        SHARE_MEDIA share_media20 = SHARE_MEDIA.TUMBLR;
        map19.put(share_media20, new CustomPlatform(share_media20));
        Map<SHARE_MEDIA, Platform> map20 = configs;
        SHARE_MEDIA share_media21 = SHARE_MEDIA.PINTEREST;
        map20.put(share_media21, new APPIDPlatform(share_media21));
        Map<SHARE_MEDIA, Platform> map21 = configs;
        SHARE_MEDIA share_media22 = SHARE_MEDIA.POCKET;
        map21.put(share_media22, new CustomPlatform(share_media22));
        Map<SHARE_MEDIA, Platform> map22 = configs;
        SHARE_MEDIA share_media23 = SHARE_MEDIA.WHATSAPP;
        map22.put(share_media23, new CustomPlatform(share_media23));
        Map<SHARE_MEDIA, Platform> map23 = configs;
        SHARE_MEDIA share_media24 = SHARE_MEDIA.EMAIL;
        map23.put(share_media24, new CustomPlatform(share_media24));
        Map<SHARE_MEDIA, Platform> map24 = configs;
        SHARE_MEDIA share_media25 = SHARE_MEDIA.SMS;
        map24.put(share_media25, new CustomPlatform(share_media25));
        Map<SHARE_MEDIA, Platform> map25 = configs;
        SHARE_MEDIA share_media26 = SHARE_MEDIA.LINKEDIN;
        map25.put(share_media26, new CustomPlatform(share_media26));
        Map<SHARE_MEDIA, Platform> map26 = configs;
        SHARE_MEDIA share_media27 = SHARE_MEDIA.LINE;
        map26.put(share_media27, new CustomPlatform(share_media27));
        Map<SHARE_MEDIA, Platform> map27 = configs;
        SHARE_MEDIA share_media28 = SHARE_MEDIA.FLICKR;
        map27.put(share_media28, new CustomPlatform(share_media28));
        Map<SHARE_MEDIA, Platform> map28 = configs;
        SHARE_MEDIA share_media29 = SHARE_MEDIA.EVERNOTE;
        map28.put(share_media29, new CustomPlatform(share_media29));
        Map<SHARE_MEDIA, Platform> map29 = configs;
        SHARE_MEDIA share_media30 = SHARE_MEDIA.FOURSQUARE;
        map29.put(share_media30, new CustomPlatform(share_media30));
        Map<SHARE_MEDIA, Platform> map30 = configs;
        SHARE_MEDIA share_media31 = SHARE_MEDIA.YNOTE;
        map30.put(share_media31, new CustomPlatform(share_media31));
        Map<SHARE_MEDIA, Platform> map31 = configs;
        SHARE_MEDIA share_media32 = SHARE_MEDIA.KAKAO;
        map31.put(share_media32, new APPIDPlatform(share_media32));
        Map<SHARE_MEDIA, Platform> map32 = configs;
        SHARE_MEDIA share_media33 = SHARE_MEDIA.INSTAGRAM;
        map32.put(share_media33, new CustomPlatform(share_media33));
        Map<SHARE_MEDIA, Platform> map33 = configs;
        SHARE_MEDIA share_media34 = SHARE_MEDIA.MORE;
        map33.put(share_media34, new CustomPlatform(share_media34));
        configs.put(SHARE_MEDIA.DINGTALK, new APPIDPlatform(SHARE_MEDIA.MORE));
    }

    public static Platform getPlatform(SHARE_MEDIA share_media) {
        return configs.get(share_media);
    }

    public static void setAlipay(String str) {
        ((APPIDPlatform) configs.get(SHARE_MEDIA.ALIPAY)).appId = str.replace(" ", "");
    }

    public static void setDing(String str) {
        ((APPIDPlatform) configs.get(SHARE_MEDIA.DINGTALK)).appId = str.replace(" ", "");
    }

    public static void setDropbox(String str, String str2) {
        APPIDPlatform aPPIDPlatform = (APPIDPlatform) configs.get(SHARE_MEDIA.DROPBOX);
        aPPIDPlatform.appId = str.replace(" ", "");
        aPPIDPlatform.appkey = str2.replace(" ", "");
    }

    public static void setKakao(String str) {
        ((APPIDPlatform) configs.get(SHARE_MEDIA.KAKAO)).appId = str.replace(" ", "");
    }

    public static void setLaiwang(String str, String str2) {
        APPIDPlatform aPPIDPlatform = (APPIDPlatform) configs.get(SHARE_MEDIA.LAIWANG);
        aPPIDPlatform.appId = str.replace(" ", "");
        aPPIDPlatform.appkey = str2.replace(" ", "");
        APPIDPlatform aPPIDPlatform2 = (APPIDPlatform) configs.get(SHARE_MEDIA.LAIWANG_DYNAMIC);
        aPPIDPlatform2.appId = str.replace(" ", "");
        aPPIDPlatform2.appkey = str2.replace(" ", "");
    }

    public static void setPinterest(String str) {
        ((APPIDPlatform) configs.get(SHARE_MEDIA.PINTEREST)).appId = str.replace(" ", "");
    }

    public static void setQQFileProvider(String str) {
        ((APPIDPlatform) configs.get(SHARE_MEDIA.QZONE)).fileProvider = str.replace(" ", "");
        ((APPIDPlatform) configs.get(SHARE_MEDIA.QQ)).fileProvider = str.replace(" ", "");
    }

    public static void setQQZone(String str, String str2) {
        APPIDPlatform aPPIDPlatform = (APPIDPlatform) configs.get(SHARE_MEDIA.QZONE);
        aPPIDPlatform.appId = str.replace(" ", "");
        aPPIDPlatform.appkey = str2.replace(" ", "");
        APPIDPlatform aPPIDPlatform2 = (APPIDPlatform) configs.get(SHARE_MEDIA.QQ);
        aPPIDPlatform2.appId = str.replace(" ", "");
        aPPIDPlatform2.appkey = str2.replace(" ", "");
    }

    public static void setSinaWeibo(String str, String str2, String str3) {
        APPIDPlatform aPPIDPlatform = (APPIDPlatform) configs.get(SHARE_MEDIA.SINA);
        aPPIDPlatform.appId = str.replace(" ", "");
        aPPIDPlatform.appkey = str2.replace(" ", "");
        aPPIDPlatform.redirectUrl = str3;
    }

    public static void setTwitter(String str, String str2) {
        APPIDPlatform aPPIDPlatform = (APPIDPlatform) configs.get(SHARE_MEDIA.TWITTER);
        aPPIDPlatform.appId = str.replace(" ", "");
        aPPIDPlatform.appkey = str2.replace(" ", "");
    }

    public static void setVKontakte(String str, String str2) {
        APPIDPlatform aPPIDPlatform = (APPIDPlatform) configs.get(SHARE_MEDIA.VKONTAKTE);
        aPPIDPlatform.appId = str.replace(" ", "");
        aPPIDPlatform.appkey = str2.replace(" ", "");
    }

    public static void setWeixin(String str, String str2) {
        APPIDPlatform aPPIDPlatform = (APPIDPlatform) configs.get(SHARE_MEDIA.WEIXIN);
        aPPIDPlatform.appId = str.replace(" ", "");
        aPPIDPlatform.appkey = str2.replace(" ", "");
        APPIDPlatform aPPIDPlatform2 = (APPIDPlatform) configs.get(SHARE_MEDIA.WEIXIN_CIRCLE);
        aPPIDPlatform2.appId = str.replace(" ", "");
        aPPIDPlatform2.appkey = str2.replace(" ", "");
        APPIDPlatform aPPIDPlatform3 = (APPIDPlatform) configs.get(SHARE_MEDIA.WEIXIN_FAVORITE);
        aPPIDPlatform3.appId = str.replace(" ", "");
        aPPIDPlatform3.appkey = str2.replace(" ", "");
    }

    public static void setYixin(String str) {
        ((APPIDPlatform) configs.get(SHARE_MEDIA.YIXIN)).appId = str.replace(" ", "");
        ((APPIDPlatform) configs.get(SHARE_MEDIA.YIXIN_CIRCLE)).appId = str.replace(" ", "");
    }
}
