package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C4417fd;
import com.xiaomi.push.C4498hs;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.C4688t;
import com.xiaomi.push.EnumC4423fi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.h.e.l.l.C;

public class PushMessageHandler extends BaseService {

    /* renamed from: a */
    public static List<MiPushClient.MiPushClientCallback> f11210a = new ArrayList();

    /* renamed from: a */
    public static ThreadPoolExecutor f11211a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: com.xiaomi.mipush.sdk.PushMessageHandler$a */
    public interface AbstractC4180a extends Serializable {
    }

    static {
        C.i(16777281);
    }

    /* renamed from: a */
    public static void mo41277a() {
        synchronized (f11210a) {
            f11210a.clear();
        }
    }

    /* renamed from: a */
    public static void m11384a(long j, String str, String str2) {
        synchronized (f11210a) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f11210a) {
                miPushClientCallback.onInitializeResult(j, str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m11385a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e) {
            AbstractC4163b.m11301a(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m11386a(Context context, Intent intent) {
        AbstractC4163b.m11305c("addjob PushMessageHandler " + intent);
        if (intent != null) {
            m11397c(context, intent);
            m11385a(context);
        }
    }

    /* renamed from: a */
    public static void m11387a(Context context, Intent intent, ResolveInfo resolveInfo) {
        try {
            MessageHandleService.addJob(context.getApplicationContext(), new MessageHandleService.C4177a(intent, (PushMessageReceiver) C4688t.m14219a(context, resolveInfo.activityInfo.name).newInstance()));
            MessageHandleService.m11359a(context, new Intent(context.getApplicationContext(), MessageHandleService.class));
        } catch (Throwable th) {
            AbstractC4163b.m11303a(th);
        }
    }

    /* renamed from: a */
    public static void m11388a(Context context, MiPushMessage miPushMessage) {
        synchronized (f11210a) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f11210a) {
                if (m11393a(miPushMessage.getCategory(), miPushClientCallback.getCategory())) {
                    miPushClientCallback.onReceiveMessage(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                    miPushClientCallback.onReceiveMessage(miPushMessage);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m11389a(Context context, AbstractC4180a aVar) {
        if (aVar instanceof MiPushMessage) {
            m11388a(context, (MiPushMessage) aVar);
        } else if (aVar instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) aVar;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (EnumC4423fi.COMMAND_REGISTER.f11840a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                m11384a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            } else if (EnumC4423fi.COMMAND_SET_ALIAS.f11840a.equals(command) || EnumC4423fi.COMMAND_UNSET_ALIAS.f11840a.equals(command) || EnumC4423fi.COMMAND_SET_ACCEPT_TIME.f11840a.equals(command)) {
                m11391a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
            } else if (EnumC4423fi.COMMAND_SUBSCRIBE_TOPIC.f11840a.equals(command)) {
                List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                    str = commandArguments2.get(0);
                }
                m11390a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            } else if (EnumC4423fi.COMMAND_UNSUBSCRIBE_TOPIC.f11840a.equals(command)) {
                List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                    str = commandArguments3.get(0);
                }
                m11395b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            }
        }
    }

    /* renamed from: a */
    public static void m11390a(Context context, String str, long j, String str2, String str3) {
        synchronized (f11210a) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f11210a) {
                if (m11393a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onSubscribeResult(j, str2, str3);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m11391a(Context context, String str, String str2, long j, String str3, List<String> list) {
        synchronized (f11210a) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f11210a) {
                if (m11393a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onCommandResult(str2, j, str3, list);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m11392a(MiPushClient.MiPushClientCallback miPushClientCallback) {
        synchronized (f11210a) {
            if (!f11210a.contains(miPushClientCallback)) {
                f11210a.add(miPushClientCallback);
            }
        }
    }

    /* renamed from: a */
    public static boolean m11393a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    /* renamed from: b */
    public static void m11394b(Context context, Intent intent) {
        try {
            ResolveInfo resolveInfo = null;
            if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                C4227n.m11580a(context, intent, null);
            } else if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                C4498hs hsVar = new C4498hs();
                C4531iy.m13589a(hsVar, intent.getByteArrayExtra("mipush_payload"));
                AbstractC4163b.m11305c("PushMessageHandler.onHandleIntent " + hsVar.mo42029d());
                MiTinyDataClient.upload(context, hsVar);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                if (m11396b()) {
                    AbstractC4163b.m11306d("receive a message before application calling initialize");
                    return;
                }
                AbstractC4180a a = C4201at.m11422a(context).mo41392a(intent);
                if (a != null) {
                    m11389a(context, a);
                }
            } else if ("com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                Logger.uploadLogFile(context, false);
            } else {
                Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                intent2.setPackage(context.getPackageName());
                intent2.putExtras(intent);
                try {
                    List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                    if (queryBroadcastReceivers != null) {
                        Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ResolveInfo next = it.next();
                            if (next.activityInfo != null && next.activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(C4688t.m14219a(context, next.activityInfo.name))) {
                                resolveInfo = next;
                                break;
                            }
                        }
                    }
                    if (resolveInfo != null) {
                        m11387a(context, intent2, resolveInfo);
                        return;
                    }
                    AbstractC4163b.m11306d("cannot find the receiver to handler this message, check your manifest");
                    C4417fd.m12519a(context).mo41810a(context.getPackageName(), intent, "cannot find the receiver to handler this message, check your manifest");
                } catch (Exception e) {
                    AbstractC4163b.m11303a(e);
                    C4417fd.m12519a(context).mo41811a(context.getPackageName(), intent, e);
                }
            }
        } catch (Throwable th) {
            AbstractC4163b.m11303a(th);
            C4417fd.m12519a(context).mo41811a(context.getPackageName(), intent, th);
        }
    }

    /* renamed from: b */
    public static void m11395b(Context context, String str, long j, String str2, String str3) {
        synchronized (f11210a) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f11210a) {
                if (m11393a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onUnsubscribeResult(j, str2, str3);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m11396b() {
        return f11210a.isEmpty();
    }

    /* renamed from: c */
    public static void m11397c(Context context, Intent intent) {
        if (intent != null && !f11211a.isShutdown()) {
            f11211a.execute(new RunnableC4200as(context, intent));
        }
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* renamed from: a */
    public boolean m11398a() {
        ThreadPoolExecutor threadPoolExecutor = f11211a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f11211a.getQueue().size() <= 0) ? false : true;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    public native IBinder onBind(Intent intent);

    @Override // com.xiaomi.mipush.sdk.BaseService
    public native void onStart(Intent intent, int i);
}
