package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.netease.nis.captcha.Captcha;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.C4417fd;
import com.xiaomi.push.EnumC4423fi;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.h.e.l.l.C;

public class MessageHandleService extends BaseService {

    /* renamed from: a */
    public static ConcurrentLinkedQueue<C4177a> f11195a = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public static ExecutorService f11196a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: com.xiaomi.mipush.sdk.MessageHandleService$a */
    public static class C4177a {

        /* renamed from: a */
        public Intent f11197a;

        /* renamed from: a */
        public PushMessageReceiver f11198a;

        public C4177a(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f11198a = pushMessageReceiver;
            this.f11197a = intent;
        }

        /* renamed from: a */
        public Intent mo41284a() {
            return this.f11197a;
        }

        /* renamed from: a */
        public PushMessageReceiver m11364a() {
            return this.f11198a;
        }
    }

    static {
        C.i(16777280);
    }

    /* renamed from: a */
    public static void m11359a(Context context, Intent intent) {
        if (intent != null) {
            m11360b(context);
        }
    }

    public static void addJob(Context context, C4177a aVar) {
        if (aVar != null) {
            f11195a.add(aVar);
            m11360b(context);
            startService(context);
        }
    }

    /* renamed from: b */
    public static void m11360b(Context context) {
        if (!f11196a.isShutdown()) {
            f11196a.execute(new RunnableC4183ab(context));
        }
    }

    /* renamed from: c */
    public static void m11361c(Context context) {
        C4417fd a;
        String packageName;
        int i;
        String str;
        String[] stringArrayExtra;
        try {
            C4177a poll = f11195a.poll();
            if (poll != null) {
                PushMessageReceiver a2 = poll.m11364a();
                Intent a3 = poll.mo41284a();
                int intExtra = a3.getIntExtra(PushMessageHelper.MESSAGE_TYPE, 1);
                if (intExtra == 1) {
                    PushMessageHandler.AbstractC4180a a4 = C4201at.m11422a(context).mo41392a(a3);
                    int intExtra2 = a3.getIntExtra("eventMessageType", -1);
                    if (a4 == null) {
                        return;
                    }
                    if (a4 instanceof MiPushMessage) {
                        MiPushMessage miPushMessage = (MiPushMessage) a4;
                        if (!miPushMessage.isArrivedMessage()) {
                            a2.onReceiveMessage(context, miPushMessage);
                        }
                        if (miPushMessage.getPassThrough() == 1) {
                            C4417fd.m12519a(context.getApplicationContext()).mo41809a(context.getPackageName(), a3, Captcha.WEB_VIEW_HTTPS_ERROR, "call passThrough callBack");
                            AbstractC4163b.m11301a("begin execute onReceivePassThroughMessage from " + miPushMessage.getMessageId());
                            a2.onReceivePassThroughMessage(context, miPushMessage);
                            return;
                        } else if (miPushMessage.isNotified()) {
                            if (intExtra2 == 1000) {
                                a = C4417fd.m12519a(context.getApplicationContext());
                                packageName = context.getPackageName();
                                i = 1007;
                                str = "call notification callBack";
                            } else {
                                a = C4417fd.m12519a(context.getApplicationContext());
                                packageName = context.getPackageName();
                                i = 3007;
                                str = "call business callBack";
                            }
                            a.mo41809a(packageName, a3, i, str);
                            AbstractC4163b.m11301a("begin execute onNotificationMessageClicked from　" + miPushMessage.getMessageId());
                            a2.onNotificationMessageClicked(context, miPushMessage);
                            return;
                        } else {
                            a2.onNotificationMessageArrived(context, miPushMessage);
                            return;
                        }
                    } else if (a4 instanceof MiPushCommandMessage) {
                        MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) a4;
                        AbstractC4163b.m11301a("begin execute onCommandResult, command=" + miPushCommandMessage.getCommand() + ", resultCode=" + miPushCommandMessage.getResultCode() + ", reason=" + miPushCommandMessage.getReason());
                        a2.onCommandResult(context, miPushCommandMessage);
                        if (TextUtils.equals(miPushCommandMessage.getCommand(), EnumC4423fi.COMMAND_REGISTER.f11840a)) {
                            a2.onReceiveRegisterResult(context, miPushCommandMessage);
                            if (miPushCommandMessage.getResultCode() != 0) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (intExtra == 3) {
                    MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) a3.getSerializableExtra(PushMessageHelper.KEY_COMMAND);
                    AbstractC4163b.m11301a("(Local) begin execute onCommandResult, command=" + miPushCommandMessage2.getCommand() + ", resultCode=" + miPushCommandMessage2.getResultCode() + ", reason=" + miPushCommandMessage2.getReason());
                    a2.onCommandResult(context, miPushCommandMessage2);
                    if (TextUtils.equals(miPushCommandMessage2.getCommand(), EnumC4423fi.COMMAND_REGISTER.f11840a)) {
                        a2.onReceiveRegisterResult(context, miPushCommandMessage2);
                        if (miPushCommandMessage2.getResultCode() != 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (intExtra == 5 && PushMessageHelper.ERROR_TYPE_NEED_PERMISSION.equals(a3.getStringExtra(PushMessageHelper.ERROR_TYPE)) && (stringArrayExtra = a3.getStringArrayExtra(PushMessageHelper.ERROR_MESSAGE)) != null) {
                    AbstractC4163b.m11301a("begin execute onRequirePermissions, lack of necessary permissions");
                    a2.onRequirePermissions(context, stringArrayExtra);
                    return;
                } else {
                    return;
                }
                C4220h.m11566b(context);
            }
        } catch (RuntimeException e) {
            AbstractC4163b.m11303a(e);
        }
    }

    public static native void startService(Context context);

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* renamed from: a */
    public boolean mo41277a() {
        ConcurrentLinkedQueue<C4177a> concurrentLinkedQueue = f11195a;
        return concurrentLinkedQueue != null && concurrentLinkedQueue.size() > 0;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    public native IBinder onBind(Intent intent);

    @Override // com.xiaomi.mipush.sdk.BaseService
    public native void onStart(Intent intent, int i);
}
