package com.taobao.accs.init;

import android.content.Context;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

public class Launcher_InitAccs implements Serializable {
    public static final Map<String, String> SERVICES;
    public static String defaultAppkey = "21646297";
    public static IAppReceiver mAppReceiver = new C3128d();
    public static String mAppkey;
    public static Context mContext;
    public static boolean mForceBindUser;
    public static boolean mIsInited;
    public static String mSid;
    public static String mTtid;
    public static String mUserId;

    /* renamed from: com.taobao.accs.init.Launcher_InitAccs$a */
    public static class C3124a implements ILoginInfo {
        @Override // com.taobao.accs.ILoginInfo
        public boolean getCommentUsed() {
            return false;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getEcode() {
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getHeadPicLink() {
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getNick() {
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getSid() {
            return Launcher_InitAccs.mSid;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getSsoToken() {
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getUserId() {
            return Launcher_InitAccs.mUserId;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        SERVICES = hashMap;
        hashMap.put("im", "com.taobao.tao.amp.remote.AccsReceiverCallback");
        SERVICES.put("powermsg", "com.taobao.appfrmbundle.mkt.AccsReceiverService");
        SERVICES.put("pmmonitor", "com.taobao.appfrmbundle.mkt.AccsReceiverService");
        SERVICES.put("cloudsync", "com.taobao.datasync.network.accs.AccsCloudSyncService");
        SERVICES.put("acds", "com.taobao.acds.compact.AccsACDSService");
        SERVICES.put("agooSend", "org.android.agoo.accs.AgooService");
        SERVICES.put(AgooConstants.AGOO_SERVICE_AGOOACK, "org.android.agoo.accs.AgooService");
        SERVICES.put("agooTokenReport", "org.android.agoo.accs.AgooService");
        SERVICES.put("AliLive", "com.taobao.playbudyy.gameplugin.danmu.DanmuCallbackService");
        SERVICES.put("orange", "com.taobao.orange.accssupport.OrangeAccsService");
        SERVICES.put("tsla", "com.taobao.android.festival.accs.HomepageAccsMassService");
        SERVICES.put("taobaoWaimaiAccsService", "com.taobao.takeout.order.detail.service.TakeoutOrderDetailACCSService");
        SERVICES.put("login", "com.taobao.android.sso.v2.service.LoginAccsService");
        SERVICES.put("ranger_abtest", "com.taobao.ranger3.RangerACCSService");
        SERVICES.put("accs_poplayer", "com.taobao.tbpoplayer.AccsPopLayerService");
        SERVICES.put("dm_abtest", "com.tmall.wireless.ant.accs.AntAccsService");
        SERVICES.put("family", "com.taobao.family.FamilyAccsService");
        SERVICES.put("taobao-dingtalk", "com.laiwang.protocol.android.LwpAccsService");
        SERVICES.put("amp-sync", "com.taobao.message.init.accs.AccsReceiverCallback");
        SERVICES.put("friend_invite_msg", "com.taobao.message.init.accs.TaoFriendAccsReceiverCallback");
        SERVICES.put("slider", "com.taobao.slide.accs.SlideAccsService");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(android.app.Application r11, java.util.HashMap<java.lang.String, java.lang.Object> r12) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.init.Launcher_InitAccs.init(android.app.Application, java.util.HashMap):void");
    }
}
