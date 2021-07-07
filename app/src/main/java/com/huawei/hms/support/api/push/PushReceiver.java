package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.p037c.AbstractC1139h;
import com.huawei.hms.support.api.push.p041a.C1172a;
import com.huawei.hms.support.api.push.p046b.AbstractC1187a;
import com.huawei.hms.support.api.push.p046b.p047a.AbstractC1192b;
import com.huawei.hms.support.api.push.p046b.p047a.C1188a;
import com.huawei.hms.support.api.push.p046b.p047a.C1193c;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.C1191c;
import com.huawei.hms.support.log.C1202a;
import com.umeng.message.MsgConstant;
import com.xiaomi.mipush.sdk.MiPushMessage;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.RejectedExecutionException;

public abstract class PushReceiver extends BroadcastReceiver {

    public interface BOUND_KEY {
        public static final String deviceTokenKey = "deviceToken";
        public static final String pushMsgKey = "pushMsg";
        public static final String pushNotifyId = "pushNotifyId";
    }

    public enum Event {
        NOTIFICATION_OPENED,
        NOTIFICATION_CLICK_BTN
    }

    /* renamed from: com.huawei.hms.support.api.push.PushReceiver$a */
    public class RunnableC1166a implements Runnable {

        /* renamed from: b */
        public Context f1214b;

        /* renamed from: c */
        public Intent f1215c;

        public void run() {
            try {
                if (this.f1215c.hasExtra("clickBtn")) {
                    String stringExtra = this.f1215c.getStringExtra("clickBtn");
                    int intExtra = this.f1215c.getIntExtra(MiPushMessage.KEY_NOTIFY_ID, 0);
                    Bundle bundle = new Bundle();
                    bundle.putString(BOUND_KEY.pushMsgKey, stringExtra);
                    bundle.putInt(BOUND_KEY.pushNotifyId, intExtra);
                    PushReceiver.this.onEvent(this.f1214b, Event.NOTIFICATION_CLICK_BTN, bundle);
                }
            } catch (RejectedExecutionException unused) {
                C1202a.m1320d("PushReceiver", "execute task error");
            } catch (Exception unused2) {
                C1202a.m1320d("PushReceiver", "handleNotificationBtnOnclickEvent error");
            }
        }

        public RunnableC1166a(Context context, Intent intent) {
            this.f1214b = context;
            this.f1215c = intent;
        }
    }

    /* renamed from: com.huawei.hms.support.api.push.PushReceiver$b */
    public class RunnableC1167b implements Runnable {

        /* renamed from: b */
        public Context f1217b;

        /* renamed from: c */
        public Intent f1218c;

        public void run() {
            try {
                if (this.f1218c.hasExtra("click")) {
                    String stringExtra = this.f1218c.getStringExtra("click");
                    Bundle bundle = new Bundle();
                    bundle.putString(BOUND_KEY.pushMsgKey, stringExtra);
                    PushReceiver.this.onEvent(this.f1217b, Event.NOTIFICATION_OPENED, bundle);
                }
            } catch (RejectedExecutionException unused) {
                C1202a.m1320d("PushReceiver", "execute task error");
            } catch (Exception unused2) {
                C1202a.m1320d("PushReceiver", "handle click event error");
            }
        }

        public RunnableC1167b(Context context, Intent intent) {
            this.f1217b = context;
            this.f1218c = intent;
        }
    }

    /* renamed from: com.huawei.hms.support.api.push.PushReceiver$c */
    public class RunnableC1168c implements Runnable {

        /* renamed from: b */
        public Context f1220b;

        /* renamed from: c */
        public Intent f1221c;

        public void run() {
            try {
                PushReceiver.this.onPushState(this.f1220b, this.f1221c.getBooleanExtra("push_state", false));
            } catch (RejectedExecutionException unused) {
                C1202a.m1320d("PushReceiver", "execute task error");
            } catch (Exception unused2) {
                C1202a.m1320d("PushReceiver", "handlePushStateEvent error");
            }
        }

        public RunnableC1168c(Context context, Intent intent) {
            this.f1220b = context;
            this.f1221c = intent;
        }
    }

    /* renamed from: com.huawei.hms.support.api.push.PushReceiver$d */
    public class RunnableC1169d implements Runnable {

        /* renamed from: b */
        public Context f1223b;

        /* renamed from: c */
        public Intent f1224c;

        public void run() {
            if (new C1191c(this.f1223b, "push_switch").mo15697a("normal_msg_enable")) {
                C1202a.m1318b("PushReceiver", this.f1223b.getPackageName() + " disable pass by push message, abandon it");
                PushReceiver.this.m1158a(this.f1223b, this.f1224c, "1");
                return;
            }
            C1202a.m1318b("PushReceiver", this.f1223b.getPackageName() + " receive pass by push message");
            PushReceiver.this.m1158a(this.f1223b, this.f1224c, "0");
            try {
                byte[] byteArrayExtra = this.f1224c.getByteArrayExtra("msg_data");
                byte[] byteArrayExtra2 = this.f1224c.getByteArrayExtra(MsgConstant.KEY_DEVICE_TOKEN);
                if (byteArrayExtra != null) {
                    if (byteArrayExtra2 != null) {
                        String str = new String(byteArrayExtra2, "UTF-8");
                        Bundle bundle = new Bundle();
                        bundle.putString(BOUND_KEY.deviceTokenKey, str);
                        bundle.putByteArray(BOUND_KEY.pushMsgKey, byteArrayExtra);
                        PushReceiver.this.onPushMsg(this.f1223b, byteArrayExtra, bundle);
                        return;
                    }
                }
                C1202a.m1319c("PushReceiver", "PushReceiver receive a message, but message is empty.");
            } catch (UnsupportedEncodingException unused) {
                C1202a.m1320d("PushReceiver", "encode token error");
            } catch (RejectedExecutionException unused2) {
                C1202a.m1320d("PushReceiver", "execute task error");
            } catch (Exception unused3) {
                C1202a.m1320d("PushReceiver", "handle push message error");
            }
        }

        public RunnableC1169d(Context context, Intent intent) {
            this.f1223b = context;
            this.f1224c = intent;
        }
    }

    /* renamed from: com.huawei.hms.support.api.push.PushReceiver$e */
    public class RunnableC1170e implements Runnable {

        /* renamed from: b */
        public Context f1226b;

        /* renamed from: c */
        public Intent f1227c;

        public void run() {
            try {
                byte[] byteArrayExtra = this.f1227c.getByteArrayExtra(MsgConstant.KEY_DEVICE_TOKEN);
                String stringExtra = this.f1227c.getStringExtra("extra_notify_key");
                if (byteArrayExtra == null) {
                    C1202a.m1318b("PushReceiver", "get a deviceToken, but it is null");
                    return;
                }
                C1202a.m1318b("PushReceiver", "receive a push token: " + this.f1226b.getPackageName());
                C1191c cVar = new C1191c(this.f1226b, "push_client_self_info");
                cVar.mo15695a("reqTokenTime", Long.valueOf(System.currentTimeMillis()));
                String str = new String(byteArrayExtra, "UTF-8");
                String a = AbstractC1192b.m1284a(this.f1226b, "push_client_self_info");
                String b = cVar.mo15700b("push_notify_key");
                if (!TextUtils.isEmpty(stringExtra) && !stringExtra.equals(b)) {
                    C1202a.m1318b("PushReceiver", "notifyKey changed, refresh it");
                    cVar.mo15699a("push_notify_key", stringExtra);
                }
                if (!str.equals(a)) {
                    C1202a.m1318b("PushReceiver", "receive a token, refresh the local token");
                    cVar.mo15702d("token_info");
                    AbstractC1192b.m1285a(this.f1226b, "push_client_self_info", str);
                }
                Bundle bundle = new Bundle();
                bundle.putString(BOUND_KEY.deviceTokenKey, str);
                bundle.putByteArray(BOUND_KEY.pushMsgKey, null);
                if (this.f1227c.getExtras() != null) {
                    bundle.putAll(this.f1227c.getExtras());
                }
                PushReceiver.this.onToken(this.f1226b, str, bundle);
            } catch (UnsupportedEncodingException unused) {
                C1202a.m1320d("PushReceiver", "encode token error");
            } catch (RejectedExecutionException unused2) {
                C1202a.m1320d("PushReceiver", "execute task error");
            } catch (Exception unused3) {
                C1202a.m1320d("PushReceiver", "handle push token error");
            }
        }

        public RunnableC1170e(Context context, Intent intent) {
            this.f1226b = context;
            this.f1227c = intent;
        }
    }

    /* renamed from: b */
    private void m1160b(Context context, Intent intent) {
        try {
            if (intent.hasExtra(MsgConstant.KEY_DEVICE_TOKEN)) {
                C1193c.m1287a().execute(new RunnableC1170e(context, intent));
            } else {
                C1202a.m1318b("PushReceiver", "This message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            C1202a.m1320d("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
        } catch (Exception unused2) {
            C1202a.m1320d("PushReceiver", "handlePushTokenEvent execute task error");
        }
    }

    /* renamed from: c */
    private void m1161c(Context context, Intent intent) {
        try {
            if (intent.hasExtra("msg_data")) {
                C1193c.m1287a().execute(new RunnableC1169d(context, intent));
            } else {
                C1202a.m1318b("PushReceiver", "This push message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            C1202a.m1320d("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
        } catch (Exception unused2) {
            C1202a.m1320d("PushReceiver", "handlePushMessageEvent execute task error");
        }
    }

    /* renamed from: d */
    private void m1162d(Context context, Intent intent) {
        if (intent.hasExtra("click")) {
            C1193c.m1287a().execute(new RunnableC1167b(context, intent));
        } else if (intent.hasExtra("clickBtn")) {
            C1193c.m1287a().execute(new RunnableC1166a(context, intent));
        }
    }

    public void onEvent(Context context, Event event, Bundle bundle) {
    }

    public void onPushMsg(Context context, byte[] bArr, String str) {
    }

    public boolean onPushMsg(Context context, byte[] bArr, Bundle bundle) {
        onPushMsg(context, bArr, bundle != null ? bundle.getString(BOUND_KEY.deviceTokenKey) : "");
        return true;
    }

    public void onPushState(Context context, boolean z) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && context != null) {
            C1202a.m1318b("PushReceiver", "push receive broadcast message, Intent:" + intent.getAction() + " pkgName:" + context.getPackageName());
            try {
                intent.getStringExtra("TestIntent");
                String action = intent.getAction();
                if (AbstractC1139h.m1081a() == null) {
                    AbstractC1139h.m1083a(context.getApplicationContext());
                }
                if ("com.huawei.android.push.intent.REGISTRATION".equals(action)) {
                    m1160b(context, intent);
                } else if ("com.huawei.android.push.intent.RECEIVE".equals(action) || "com.huawei.android.push.intent.PASSBY_MESSAGE".equals(action)) {
                    m1161c(context, intent);
                } else if ("com.huawei.android.push.intent.CLICK".equals(action)) {
                    m1162d(context, intent);
                } else if ("com.huawei.intent.action.PUSH_STATE".equals(action)) {
                    C1193c.m1287a().execute(new RunnableC1168c(context, intent));
                } else if ("com.huawei.intent.action.PUSH_DELAY_NOTIFY".equals(action)) {
                    m1157a(context, intent);
                } else {
                    C1202a.m1318b("PushReceiver", "message can't be recognised:" + intent.toUri(0));
                }
            } catch (Exception unused) {
                C1202a.m1320d("PushReceiver", "intent has some error");
            }
        }
    }

    public void onToken(Context context, String str) {
    }

    public void onToken(Context context, String str, Bundle bundle) {
        onToken(context, str);
    }

    /* renamed from: a */
    public static void m1157a(Context context, Intent intent) {
        if (intent.hasExtra("selfshow_info")) {
            if (!C1188a.m1267a(context)) {
                C1202a.m1318b("PushReceiver", context.getPackageName() + " disable display notification.");
            }
            new C1172a().mo15660a(context, intent);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m1158a(Context context, Intent intent, String str) {
        if (context != null && intent != null) {
            C1202a.m1318b("PushReceiver", "send response to frameworkPush that app receive the passby message");
            String str2 = null;
            try {
                str2 = intent.getStringExtra("msgIdStr");
            } catch (Exception unused) {
                C1202a.m1320d("PushReceiver", "responseToFrameworkPush error");
            }
            if (!TextUtils.isEmpty(str2) && AbstractC1187a.m1263a(context)) {
                Intent intent2 = new Intent("com.huawei.android.push.intent.MSG_RESPONSE");
                intent2.putExtra("msgIdStr", str2);
                intent2.putExtra("resultCode", str);
                intent2.setPackage("android");
                intent2.setFlags(32);
                context.sendBroadcast(intent2);
            }
        }
    }
}
