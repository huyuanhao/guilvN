package com.p118pd.sdk;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p000v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.umeng.message.entity.UMessage;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.o000OOo0  reason: case insensitive filesystem */
public final class C6996o000OOo0 {
    public static final int OooO = 4;
    public static final int OooO00o = 19;
    @GuardedBy("sLock")

    /* renamed from: OooO00o  reason: collision with other field name */
    public static ServiceConnectionC6997OooO0Oo f19218OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f19219OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19220OooO00o = "NotifManCompat";
    @GuardedBy("sEnabledNotificationListenersLock")

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Set<String> f19221OooO00o = new HashSet();
    public static final int OooO0O0 = 1000;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Object f19222OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f19223OooO0O0 = "checkOpNoThrow";
    public static final int OooO0OO = 6;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f19224OooO0OO = "OP_POST_NOTIFICATION";
    public static final int OooO0Oo = -1000;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f19225OooO0Oo = "android.support.useSideChannel";
    public static final int OooO0o = 1;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f19226OooO0o = "enabled_notification_listeners";
    public static final int OooO0o0 = 0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f19227OooO0o0 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    public static final int OooO0oO = 2;
    @GuardedBy("sEnabledNotificationListenersLock")

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static String f19228OooO0oO = null;
    public static final int OooO0oo = 3;
    public static final int OooOO0 = 5;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final NotificationManager f19229OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f19230OooO00o;

    /* renamed from: com.pd.sdk.o000OOo0$OooO0O0 */
    public static class OooO0O0 implements AbstractC6998OooO0o0 {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Notification f19233OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f19234OooO00o;
        public final String OooO0O0;

        public OooO0O0(String str, int i, String str2, Notification notification) {
            this.f19234OooO00o = str;
            this.OooO00o = i;
            this.OooO0O0 = str2;
            this.f19233OooO00o = notification;
        }

        @Override // com.p118pd.sdk.C6996o000OOo0.AbstractC6998OooO0o0
        public void OooO00o(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f19234OooO00o, this.OooO00o, this.OooO0O0, this.f19233OooO00o);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f19234OooO00o + ", id:" + this.OooO00o + ", tag:" + this.OooO0O0 + "]";
        }
    }

    /* renamed from: com.pd.sdk.o000OOo0$OooO0OO */
    public static class OooO0OO {
        public final ComponentName OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final IBinder f19235OooO00o;

        public OooO0OO(ComponentName componentName, IBinder iBinder) {
            this.OooO00o = componentName;
            this.f19235OooO00o = iBinder;
        }
    }

    /* renamed from: com.pd.sdk.o000OOo0$OooO0Oo  reason: case insensitive filesystem */
    public static class ServiceConnectionC6997OooO0Oo implements Handler.Callback, ServiceConnection {
        public static final int OooO00o = 0;
        public static final int OooO0O0 = 1;
        public static final int OooO0OO = 2;
        public static final int OooO0Oo = 3;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Context f19236OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Handler f19237OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final HandlerThread f19238OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Map<ComponentName, OooO00o> f19239OooO00o = new HashMap();

        /* renamed from: OooO00o  reason: collision with other field name */
        public Set<String> f19240OooO00o = new HashSet();

        /* renamed from: com.pd.sdk.o000OOo0$OooO0Oo$OooO00o */
        public static class OooO00o {
            public int OooO00o = 0;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final ComponentName f19241OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public INotificationSideChannel f19242OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public ArrayDeque<AbstractC6998OooO0o0> f19243OooO00o = new ArrayDeque<>();

            /* renamed from: OooO00o  reason: collision with other field name */
            public boolean f19244OooO00o = false;

            public OooO00o(ComponentName componentName) {
                this.f19241OooO00o = componentName;
            }
        }

        public ServiceConnectionC6997OooO0Oo(Context context) {
            this.f19236OooO00o = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f19238OooO00o = handlerThread;
            handlerThread.start();
            this.f19237OooO00o = new Handler(this.f19238OooO00o.getLooper(), this);
        }

        private void OooO0O0(AbstractC6998OooO0o0 oooO0o0) {
            OooO00o();
            for (OooO00o oooO00o : this.f19239OooO00o.values()) {
                oooO00o.f19243OooO00o.add(oooO0o0);
                OooO0O0(oooO00o);
            }
        }

        private void OooO0OO(OooO00o oooO00o) {
            if (!this.f19237OooO00o.hasMessages(3, oooO00o.f19241OooO00o)) {
                int i = oooO00o.OooO00o + 1;
                oooO00o.OooO00o = i;
                if (i > 6) {
                    String str = "Giving up on delivering " + oooO00o.f19243OooO00o.size() + " tasks to " + oooO00o.f19241OooO00o + " after " + oooO00o.OooO00o + " retries";
                    oooO00o.f19243OooO00o.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable(C6996o000OOo0.f19220OooO00o, 3)) {
                    String str2 = "Scheduling retry for " + i2 + " ms";
                }
                this.f19237OooO00o.sendMessageDelayed(this.f19237OooO00o.obtainMessage(3, oooO00o.f19241OooO00o), (long) i2);
            }
        }

        public void OooO00o(AbstractC6998OooO0o0 oooO0o0) {
            this.f19237OooO00o.obtainMessage(0, oooO0o0).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                OooO0O0((AbstractC6998OooO0o0) message.obj);
                return true;
            } else if (i == 1) {
                OooO0OO oooO0OO = (OooO0OO) message.obj;
                OooO00o(oooO0OO.OooO00o, oooO0OO.f19235OooO00o);
                return true;
            } else if (i == 2) {
                OooO0O0((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                OooO00o((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(C6996o000OOo0.f19220OooO00o, 3)) {
                String str = "Connected to service " + componentName;
            }
            this.f19237OooO00o.obtainMessage(1, new OooO0OO(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(C6996o000OOo0.f19220OooO00o, 3)) {
                String str = "Disconnected from service " + componentName;
            }
            this.f19237OooO00o.obtainMessage(2, componentName).sendToTarget();
        }

        private void OooO00o(ComponentName componentName, IBinder iBinder) {
            OooO00o oooO00o = this.f19239OooO00o.get(componentName);
            if (oooO00o != null) {
                oooO00o.f19242OooO00o = INotificationSideChannel.Stub.asInterface(iBinder);
                oooO00o.OooO00o = 0;
                OooO0O0(oooO00o);
            }
        }

        private void OooO0O0(ComponentName componentName) {
            OooO00o oooO00o = this.f19239OooO00o.get(componentName);
            if (oooO00o != null) {
                OooO00o(oooO00o);
            }
        }

        private void OooO00o(ComponentName componentName) {
            OooO00o oooO00o = this.f19239OooO00o.get(componentName);
            if (oooO00o != null) {
                OooO0O0(oooO00o);
            }
        }

        private void OooO0O0(OooO00o oooO00o) {
            if (Log.isLoggable(C6996o000OOo0.f19220OooO00o, 3)) {
                String str = "Processing component " + oooO00o.f19241OooO00o + ", " + oooO00o.f19243OooO00o.size() + " queued tasks";
            }
            if (!oooO00o.f19243OooO00o.isEmpty()) {
                if (!m18217OooO00o(oooO00o) || oooO00o.f19242OooO00o == null) {
                    OooO0OO(oooO00o);
                    return;
                }
                while (true) {
                    AbstractC6998OooO0o0 peek = oooO00o.f19243OooO00o.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(C6996o000OOo0.f19220OooO00o, 3)) {
                            String str2 = "Sending task " + peek;
                        }
                        peek.OooO00o(oooO00o.f19242OooO00o);
                        oooO00o.f19243OooO00o.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(C6996o000OOo0.f19220OooO00o, 3)) {
                            String str3 = "Remote service has died: " + oooO00o.f19241OooO00o;
                        }
                    } catch (RemoteException unused2) {
                        String str4 = "RemoteException communicating with " + oooO00o.f19241OooO00o;
                    }
                }
                if (!oooO00o.f19243OooO00o.isEmpty()) {
                    OooO0OO(oooO00o);
                }
            }
        }

        private void OooO00o() {
            Set<String> OooO00o2 = C6996o000OOo0.m18214OooO00o(this.f19236OooO00o);
            if (!OooO00o2.equals(this.f19240OooO00o)) {
                this.f19240OooO00o = OooO00o2;
                List<ResolveInfo> queryIntentServices = this.f19236OooO00o.getPackageManager().queryIntentServices(new Intent().setAction(C6996o000OOo0.f19227OooO0o0), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (OooO00o2.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            String str = "Permission present on component " + componentName + ", not adding listener record.";
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f19239OooO00o.containsKey(componentName2)) {
                        if (Log.isLoggable(C6996o000OOo0.f19220OooO00o, 3)) {
                            String str2 = "Adding listener record for " + componentName2;
                        }
                        this.f19239OooO00o.put(componentName2, new OooO00o(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, OooO00o>> it = this.f19239OooO00o.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<ComponentName, OooO00o> next = it.next();
                    if (!hashSet.contains(next.getKey())) {
                        if (Log.isLoggable(C6996o000OOo0.f19220OooO00o, 3)) {
                            String str3 = "Removing listener record for " + next.getKey();
                        }
                        OooO00o(next.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private boolean m18217OooO00o(OooO00o oooO00o) {
            if (oooO00o.f19244OooO00o) {
                return true;
            }
            boolean bindService = this.f19236OooO00o.bindService(new Intent(C6996o000OOo0.f19227OooO0o0).setComponent(oooO00o.f19241OooO00o), this, 33);
            oooO00o.f19244OooO00o = bindService;
            if (bindService) {
                oooO00o.OooO00o = 0;
            } else {
                String str = "Unable to bind to listener " + oooO00o.f19241OooO00o;
                this.f19236OooO00o.unbindService(this);
            }
            return oooO00o.f19244OooO00o;
        }

        private void OooO00o(OooO00o oooO00o) {
            if (oooO00o.f19244OooO00o) {
                this.f19236OooO00o.unbindService(this);
                oooO00o.f19244OooO00o = false;
            }
            oooO00o.f19242OooO00o = null;
        }
    }

    /* renamed from: com.pd.sdk.o000OOo0$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC6998OooO0o0 {
        void OooO00o(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    public C6996o000OOo0(Context context) {
        this.f19230OooO00o = context;
        this.f19229OooO00o = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
    }

    @NonNull
    public static C6996o000OOo0 OooO00o(@NonNull Context context) {
        return new C6996o000OOo0(context);
    }

    public void OooO00o(int i) {
        OooO00o((String) null, i);
    }

    public void OooO00o(@Nullable String str, int i) {
        this.f19229OooO00o.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            OooO00o(new OooO00o(this.f19230OooO00o.getPackageName(), i, str));
        }
    }

    /* renamed from: com.pd.sdk.o000OOo0$OooO00o */
    public static class OooO00o implements AbstractC6998OooO0o0 {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f19231OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f19232OooO00o;
        public final String OooO0O0;

        public OooO00o(String str) {
            this.f19231OooO00o = str;
            this.OooO00o = 0;
            this.OooO0O0 = null;
            this.f19232OooO00o = true;
        }

        @Override // com.p118pd.sdk.C6996o000OOo0.AbstractC6998OooO0o0
        public void OooO00o(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.f19232OooO00o) {
                iNotificationSideChannel.cancelAll(this.f19231OooO00o);
            } else {
                iNotificationSideChannel.cancel(this.f19231OooO00o, this.OooO00o, this.OooO0O0);
            }
        }

        public String toString() {
            return "CancelTask[" + "packageName:" + this.f19231OooO00o + ", id:" + this.OooO00o + ", tag:" + this.OooO0O0 + ", all:" + this.f19232OooO00o + "]";
        }

        public OooO00o(String str, int i, String str2) {
            this.f19231OooO00o = str;
            this.OooO00o = i;
            this.OooO0O0 = str2;
            this.f19232OooO00o = false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18215OooO00o() {
        this.f19229OooO00o.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            OooO00o(new OooO00o(this.f19230OooO00o.getPackageName()));
        }
    }

    public void OooO00o(int i, @NonNull Notification notification) {
        OooO00o(null, i, notification);
    }

    public void OooO00o(@Nullable String str, int i, @NonNull Notification notification) {
        if (OooO00o(notification)) {
            OooO00o(new OooO0O0(this.f19230OooO00o.getPackageName(), i, str, notification));
            this.f19229OooO00o.cancel(str, i);
            return;
        }
        this.f19229OooO00o.notify(str, i, notification);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18216OooO00o() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f19229OooO00o.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f19230OooO00o.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f19230OooO00o.getApplicationInfo();
        String packageName = this.f19230OooO00o.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            if (((Integer) cls.getMethod(f19223OooO0O0, Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField(f19224OooO0OO).get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public int OooO00o() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f19229OooO00o.getImportance();
        }
        return -1000;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Set<String> m18214OooO00o(@NonNull Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f19219OooO00o) {
            if (string != null) {
                if (!string.equals(f19228OooO0oO)) {
                    String[] split = string.split(Constants.COLON_SEPARATOR, -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f19221OooO00o = hashSet;
                    f19228OooO0oO = string;
                }
            }
            set = f19221OooO00o;
        }
        return set;
    }

    public static boolean OooO00o(Notification notification) {
        Bundle OooO00o2 = NotificationCompat.m14477OooO00o(notification);
        return OooO00o2 != null && OooO00o2.getBoolean("android.support.useSideChannel");
    }

    private void OooO00o(AbstractC6998OooO0o0 oooO0o0) {
        synchronized (f19222OooO0O0) {
            if (f19218OooO00o == null) {
                f19218OooO00o = new ServiceConnectionC6997OooO0Oo(this.f19230OooO00o.getApplicationContext());
            }
            f19218OooO00o.OooO00o(oooO0o0);
        }
    }
}
