package com.vivo.push.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.vivo.push.AbstractC4028aa;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4149s;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.vivo.push.sdk.a */
public final class C4127a extends AbstractC4028aa {

    /* renamed from: c */
    public static C4127a f11073c;

    /* renamed from: f */
    public static final List<Integer> f11074f = Arrays.asList(3);

    /* renamed from: d */
    public Handler f11075d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public String f11076e;

    /* renamed from: a */
    public static synchronized C4127a m11143a() {
        C4127a aVar;
        synchronized (C4127a.class) {
            if (f11073c == null) {
                f11073c = new C4127a();
            }
            aVar = f11073c;
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo41157b() {
        this.f11076e = null;
    }

    @Override // com.vivo.push.AbstractC4028aa
    /* renamed from: b */
    public final void mo40891b(Message message) {
        Intent intent = (Intent) message.obj;
        if (intent == null || this.f10893a == null) {
            C4146p.m11216d("CommandWorker", " handleMessage error: intent : " + intent + ", mContext: " + this.f10893a);
            return;
        }
        int intExtra = intent.getIntExtra("command", -1);
        if (intExtra < 0) {
            intExtra = intent.getIntExtra(AbstractC7726o0ooOOoo.OooOOo0, -1);
        }
        String packageName = this.f10893a.getPackageName();
        if (!f11074f.contains(Integer.valueOf(intExtra)) || !C4149s.m11227b(this.f10893a, packageName) || C4149s.m11230d(this.f10893a)) {
            String action = intent.getAction();
            if (TextUtils.isEmpty(this.f11076e)) {
                String a = m11144a(this.f10893a, packageName, action);
                this.f11076e = a;
                if (TextUtils.isEmpty(a)) {
                    C4146p.m11216d("CommandWorker", " reflectReceiver error: receiver for: " + action + " not found, package: " + packageName);
                    intent.setPackage(packageName);
                    this.f10893a.sendBroadcast(intent);
                    return;
                }
            }
            try {
                Class<?> cls = Class.forName(this.f11076e);
                Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                Method method = cls.getMethod("onReceive", Context.class, Intent.class);
                intent.setClassName(packageName, this.f11076e);
                this.f11075d.post(new RunnableC4128b(this, method, newInstance, new Object[]{this.f10893a.getApplicationContext(), intent}));
            } catch (Exception e) {
                C4146p.m11212b("CommandWorker", "reflect e: ", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo41156a(Intent intent) {
        if (intent == null || this.f10893a == null) {
            C4146p.m11216d("CommandWorker", " sendMessage error: intent : " + intent + ", mContext: " + this.f10893a);
            return;
        }
        Message obtain = Message.obtain();
        obtain.obj = intent;
        mo40890a(obtain);
    }

    /* renamed from: a */
    public static String m11144a(Context context, String str, String str2) {
        List<ResolveInfo> queryBroadcastReceivers;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 64)) == null || queryBroadcastReceivers.size() <= 0) {
                return null;
            }
            return queryBroadcastReceivers.get(0).activityInfo.name;
        } catch (Exception e) {
            C4146p.m11204a("CommandWorker", "error  " + e.getMessage());
            return null;
        }
    }
}
