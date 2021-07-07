package com.taobao.accs.antibrush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C3116g;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class AntiBrush {
    public static final String ANTI_ATTACK_ACTION = "mtopsdk.mtop.antiattack.checkcode.validate.activity_action";
    public static final String ANTI_ATTACK_RESULT_ACTION = "mtopsdk.extra.antiattack.result.notify.action";
    public static final int STATUS_BRUSH = 419;
    public static final String TAG = "AntiBrush";
    public static String mHost;
    public static volatile boolean mIsInCheckCodeActivity;
    public static ScheduledFuture<?> mTimeoutTask;
    public BroadcastReceiver mAntiAttackReceiver = null;
    public Context mContext;

    public static class AntiReceiver extends BroadcastReceiver {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        public void onReceive(Context context, Intent intent) {
            int i = 0;
            try {
                String stringExtra = intent.getStringExtra("Result");
                ALog.m7599e(AntiBrush.TAG, "anti onReceive result: " + stringExtra, new Object[i]);
                i = stringExtra.equalsIgnoreCase("success");
            } catch (Exception e) {
                ALog.m7598e(AntiBrush.TAG, "anti onReceive", e, new Object[i]);
            } finally {
                AntiBrush.onResult(GlobalClientInfo.getContext(), i);
            }
        }
    }

    public AntiBrush(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void handleantiBrush(String str) {
        if (mIsInCheckCodeActivity) {
            ALog.m7599e(TAG, "handleantiBrush return", "mIsInCheckCodeActivity", Boolean.valueOf(mIsInCheckCodeActivity));
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(ANTI_ATTACK_ACTION);
            intent.setPackage(this.mContext.getPackageName());
            intent.setFlags(CommonNetImpl.FLAG_AUTH);
            intent.putExtra("Location", str);
            ALog.m7599e(TAG, "handleAntiBrush:", new Object[0]);
            this.mContext.startActivity(intent);
            mIsInCheckCodeActivity = true;
            if (this.mAntiAttackReceiver == null) {
                this.mAntiAttackReceiver = new AntiReceiver();
            }
            this.mContext.registerReceiver(this.mAntiAttackReceiver, new IntentFilter(ANTI_ATTACK_RESULT_ACTION));
        } catch (Throwable th) {
            ALog.m7598e(TAG, "handleantiBrush", th, new Object[0]);
        }
    }

    public static void onResult(Context context, boolean z) {
        mIsInCheckCodeActivity = false;
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", 104);
        intent.putExtra(Constants.KEY_ANTI_BRUSH_RET, z);
        C3116g.m7381a(context, intent);
        ScheduledFuture<?> scheduledFuture = mTimeoutTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            mTimeoutTask = null;
        }
        String str = mHost;
        if (str != null) {
            UtilityImpl.m7624b(context, C3087b.m7227a(str));
        }
    }

    public boolean checkAntiBrush(URL url, Map<Integer, String> map) {
        Throwable th;
        boolean z = true;
        if (map != null) {
            try {
                if (UtilityImpl.m7642j(this.mContext)) {
                    String str = map.get(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_STATUS.ordinal()));
                    if ((TextUtils.isEmpty(str) ? 0 : Integer.valueOf(str).intValue()) == 419) {
                        String str2 = map.get(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_LOCATION.ordinal()));
                        if (!TextUtils.isEmpty(str2)) {
                            ALog.m7599e(TAG, "start anti bursh location:" + str2, new Object[0]);
                            handleantiBrush(str2);
                            String str3 = null;
                            if (mTimeoutTask != null) {
                                mTimeoutTask.cancel(true);
                                mTimeoutTask = null;
                            }
                            mTimeoutTask = ThreadPoolExecutorFactory.schedule(new RunnableC3086a(this), 60000, TimeUnit.MILLISECONDS);
                            if (url != null) {
                                str3 = url.getHost();
                            }
                            mHost = str3;
                            if (!TextUtils.isEmpty(GlobalClientInfo.f6860c) && TextUtils.isEmpty(C3087b.m7227a(mHost))) {
                                ALog.m7599e(TAG, "cookie invalid, clear", new Object[0]);
                                UtilityImpl.m7649q(this.mContext);
                            }
                            return z;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
                ALog.m7598e(TAG, "checkAntiBrush error", th, new Object[0]);
                return z;
            }
        }
        z = false;
        try {
            ALog.m7599e(TAG, "cookie invalid, clear", new Object[0]);
            UtilityImpl.m7649q(this.mContext);
        } catch (Throwable th3) {
            th = th3;
            ALog.m7598e(TAG, "checkAntiBrush error", th, new Object[0]);
            return z;
        }
        return z;
    }
}
