package com.tencent.p269mm.opensdk.channel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p269mm.opensdk.channel.p270a.C3376b;
import com.tencent.p269mm.opensdk.constants.Build;
import com.tencent.p269mm.opensdk.constants.ConstantsAPI;
import com.tencent.p269mm.opensdk.utils.C3392d;
import com.tencent.p269mm.opensdk.utils.Log;
import com.umeng.socialize.net.dplus.CommonNetImpl;

/* renamed from: com.tencent.mm.opensdk.channel.MMessageActV2 */
public class MMessageActV2 {
    public static final String DEFAULT_ENTRY_CLASS_NAME = ".wxapi.WXEntryActivity";
    public static final String MM_ENTRY_PACKAGE_NAME = "com.tencent.mm";
    public static final String MM_MSG_ENTRY_CLASS_NAME = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
    public static final String TAG = "MicroMsg.SDK.MMessageAct";

    /* renamed from: com.tencent.mm.opensdk.channel.MMessageActV2$Args */
    public static class Args {
        public static final int INVALID_FLAGS = -1;
        public Bundle bundle;
        public String content;
        public int flags = -1;
        public String targetClassName;
        public String targetPkgName;
        public String token;

        public String toString() {
            return "targetPkgName:" + this.targetPkgName + ", targetClassName:" + this.targetClassName + ", content:" + this.content + ", flags:" + this.flags + ", bundle:" + this.bundle;
        }
    }

    public static boolean send(Context context, Args args) {
        String str;
        if (context == null || args == null) {
            str = "send fail, invalid argument";
        } else if (C3392d.m8661b(args.targetPkgName)) {
            str = "send fail, invalid targetPkgName, targetPkgName = " + args.targetPkgName;
        } else {
            if (C3392d.m8661b(args.targetClassName)) {
                args.targetClassName = args.targetPkgName + DEFAULT_ENTRY_CLASS_NAME;
            }
            Log.m8650d(TAG, "send, targetPkgName = " + args.targetPkgName + ", targetClassName = " + args.targetClassName);
            Intent intent = new Intent();
            intent.setClassName(args.targetPkgName, args.targetClassName);
            Bundle bundle = args.bundle;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
            intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
            intent.putExtra(ConstantsAPI.CONTENT, args.content);
            intent.putExtra(ConstantsAPI.CHECK_SUM, C3376b.m8637a(args.content, Build.SDK_INT, packageName));
            intent.putExtra(ConstantsAPI.TOKEN, args.token);
            int i = args.flags;
            if (i == -1) {
                intent.addFlags(CommonNetImpl.FLAG_AUTH).addFlags(134217728);
            } else {
                intent.setFlags(i);
            }
            try {
                context.startActivity(intent);
                Log.m8650d(TAG, "send mm message, intent=" + intent);
                return true;
            } catch (Exception e) {
                str = "send fail, ex = " + e.getMessage();
            }
        }
        Log.m8651e(TAG, str);
        return false;
    }
}
