package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import com.p118pd.sdk.C7265o0O000oo;
import com.umeng.message.proguard.C3848l;
import com.vivo.push.C4121p;
import com.vivo.push.PushClient;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.util.C4146p;
import com.xiaomi.mipush.sdk.Constants;

public class PushServiceReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static HandlerThread f11068a;

    /* renamed from: b */
    public static Handler f11069b;

    /* renamed from: c */
    public static RunnableC4126a f11070c = new RunnableC4126a();

    /* renamed from: com.vivo.push.sdk.PushServiceReceiver$a */
    public static class RunnableC4126a implements Runnable {

        /* renamed from: a */
        public Context f11071a;

        /* renamed from: b */
        public String f11072b;

        /* renamed from: a */
        public static /* synthetic */ void m11142a(RunnableC4126a aVar, Context context, String str) {
            aVar.f11071a = context.getApplicationContext();
            aVar.f11072b = str;
        }

        public final void run() {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f11071a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (!(activeNetworkInfo != null ? activeNetworkInfo.isConnectedOrConnecting() : false)) {
                C4146p.m11216d("PushServiceReceiver", this.f11071a.getPackageName() + ": 无网络  by " + this.f11072b);
                Context context = this.f11071a;
                C4146p.m11208a(context, "触发静态广播:无网络(" + this.f11072b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f11071a.getPackageName() + C3848l.f10402t);
                return;
            }
            C4146p.m11216d("PushServiceReceiver", this.f11071a.getPackageName() + ": 执行开始出发动作: " + this.f11072b);
            Context context2 = this.f11071a;
            C4146p.m11208a(context2, "触发静态广播(" + this.f11072b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f11071a.getPackageName() + C3848l.f10402t);
            C4121p.m11080a().mo41093a(this.f11071a);
            if (!ClientConfigManagerImpl.getInstance(this.f11071a).isCancleBroadcastReceiver()) {
                PushClient.getInstance(this.f11071a).initialize();
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || "android.intent.action.ACTION_POWER_CONNECTED".equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            if (f11068a == null) {
                HandlerThread handlerThread = new HandlerThread("PushServiceReceiver");
                f11068a = handlerThread;
                handlerThread.start();
                f11069b = new Handler(f11068a.getLooper());
            }
            C4146p.m11216d("PushServiceReceiver", context.getPackageName() + ": start PushSerevice for by " + action + "  ; handler : " + f11069b);
            RunnableC4126a.m11142a(f11070c, context, action);
            f11069b.removeCallbacks(f11070c);
            f11069b.postDelayed(f11070c, C7265o0O000oo.OooO0o.OooO00o);
        }
    }
}
