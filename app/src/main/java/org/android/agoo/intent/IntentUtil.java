package org.android.agoo.intent;

import android.content.Context;
import android.content.Intent;
import com.taobao.accs.utl.ALog;

public final class IntentUtil {
    public static final String AGOO_COMMAND = "command";
    public static final String INTENT_FROM_AGOO_COMMAND = ".intent.action.COMMAND";
    public static final String INTENT_FROM_STARTACTIVITY_COMMAND = ".intent.action.startActivity.COMMAND";
    public static final String INTENT_FROM_THIRDPUSH_COMMAND = ".intent.thirdPush.action.COMMAND";
    public static final String TAG = "IntentUtil";

    public static final Intent createActivityIntent(Context context, String str, Intent intent) {
        Throwable th;
        Intent intent2 = null;
        try {
            Intent intent3 = new Intent();
            try {
                intent3.setAction(context.getPackageName() + INTENT_FROM_STARTACTIVITY_COMMAND);
                intent3.setPackage(context.getPackageName());
                intent3.setClassName(context, "com.taobao.agoo.AgooStartActivityService");
                intent3.putExtra("command", str);
                intent3.putExtras(intent.getExtras());
                return intent3;
            } catch (Throwable th2) {
                th = th2;
                intent2 = intent3;
            }
        } catch (Throwable th3) {
            th = th3;
            ALog.m7602w(TAG, "createComandIntent", th, new Object[0]);
            return intent2;
        }
    }

    public static final Intent createComandIntent(Context context, String str) {
        Throwable th;
        Intent intent = null;
        try {
            Intent intent2 = new Intent();
            try {
                intent2.setAction(context.getPackageName() + INTENT_FROM_AGOO_COMMAND);
                intent2.setPackage(context.getPackageName());
                intent2.putExtra("command", str);
                return intent2;
            } catch (Throwable th2) {
                th = th2;
                intent = intent2;
            }
        } catch (Throwable th3) {
            th = th3;
            ALog.m7598e(TAG, "createComandIntent", th, new Object[0]);
            return intent;
        }
    }

    public static final Intent createThirdpushComandIntent(Context context, String str) {
        Throwable th;
        Intent intent = null;
        try {
            Intent intent2 = new Intent();
            try {
                intent2.setAction(getThirdPushCommand(context));
                intent2.setPackage(context.getPackageName());
                intent2.putExtra("command", str);
                return intent2;
            } catch (Throwable th2) {
                th = th2;
                intent = intent2;
            }
        } catch (Throwable th3) {
            th = th3;
            ALog.m7602w(TAG, "createComandIntent", th, new Object[0]);
            return intent;
        }
    }

    public static final String getAgooCommand(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName() + INTENT_FROM_AGOO_COMMAND;
        } catch (Throwable th) {
            ALog.m7602w(TAG, "getAgooCommand", th, new Object[0]);
            return null;
        }
    }

    public static final String getThirdPushCommand(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName() + INTENT_FROM_THIRDPUSH_COMMAND;
        } catch (Throwable th) {
            ALog.m7602w(TAG, "getAgooCommand", th, new Object[0]);
            return null;
        }
    }
}
