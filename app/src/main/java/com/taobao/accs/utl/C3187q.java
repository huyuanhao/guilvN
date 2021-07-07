package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;

/* renamed from: com.taobao.accs.utl.q */
public class C3187q {
    public static final int MAX_FAIL_TIMES = 3;

    /* renamed from: a */
    public static void m7682a() {
        try {
            int c = m7684c();
            if (c > 0) {
                SharedPreferences.Editor edit = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0).edit();
                edit.clear();
                edit.apply();
                ALog.m7600i("LoadSoFailUtil", "loadSoSuccess", "fail times", Integer.valueOf(c));
            }
        } catch (Throwable th) {
            ALog.m7598e("LoadSoFailUtil", "loadSoSuccess", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m7683b() {
        try {
            Context context = GlobalClientInfo.getContext();
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0);
            int i = sharedPreferences.getInt(Constants.SP_KEY_LOAD_SO_TIMES, 0) + 1;
            if (i > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(Constants.SP_KEY_LOAD_SO_TIMES, i);
                edit.apply();
            }
            ALog.m7599e("LoadSoFailUtil", "loadSoFail", "times", Integer.valueOf(i));
            if (Build.VERSION.SDK_INT == 15) {
                UtilityImpl.killService(context);
            }
        } catch (Throwable th) {
            ALog.m7598e("LoadSoFailUtil", "loadSoFail", th, new Object[0]);
        }
    }

    /* renamed from: c */
    public static int m7684c() {
        int i;
        Throwable th;
        try {
            i = GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_LOAD_SO_FILE_NAME, 0).getInt(Constants.SP_KEY_LOAD_SO_TIMES, 0);
            try {
                ALog.m7600i("LoadSoFailUtil", "getSoFailTimes", "times", Integer.valueOf(i));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            i = 0;
            ALog.m7598e("LoadSoFailUtil", "getSoFailTimes", th, new Object[0]);
            return i;
        }
        return i;
    }
}
