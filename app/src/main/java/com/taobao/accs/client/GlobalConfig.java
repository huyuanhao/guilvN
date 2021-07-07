package com.taobao.accs.client;

import android.content.Context;
import com.taobao.accs.ChannelService;
import com.taobao.accs.IProcessName;
import com.taobao.accs.client.AccsConfig;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3190t;

public class GlobalConfig {
    public static boolean enableCookie = true;
    public static AccsConfig.ACCS_GROUP mGroup = AccsConfig.ACCS_GROUP.TAOBAO;

    public static void setChannelProcessName(String str) {
        C3103a.f6875e = str;
    }

    public static void setChannelReuse(boolean z, AccsConfig.ACCS_GROUP accs_group) {
        GlobalClientInfo.f6861d = z;
        mGroup = accs_group;
    }

    public static void setControlFrameMaxRetry(int i) {
        Message.CONTROL_MAX_RETRY_TIMES = i;
    }

    public static void setCurrProcessNameImpl(IProcessName iProcessName) {
        C3103a.f6876f = iProcessName;
    }

    public static void setEnableForground(Context context, boolean z) {
        int i = 0;
        ALog.m7600i("GlobalConfig", "setEnableForground", "enable", Boolean.valueOf(z));
        if (z) {
            i = 21;
        }
        C3190t.m7694a(context, ChannelService.SUPPORT_FOREGROUND_VERSION_KEY, i);
    }

    public static void setMainProcessName(String str) {
        C3103a.f6874d = str;
    }
}
