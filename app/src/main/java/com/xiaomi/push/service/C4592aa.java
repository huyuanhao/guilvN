package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.umeng.message.entity.UMessage;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.push.C4278ba;
import com.xiaomi.push.C4442g;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.C4563l;
import com.xiaomi.push.C4688t;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.service.C4602ag;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.android.agoo.xiaomi.MiPushRegistar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.service.aa */
public class C4592aa {

    /* renamed from: a */
    public static long f13134a;

    /* renamed from: a */
    public static final LinkedList<Pair<Integer, C4517ik>> f13135a = new LinkedList<>();

    /* renamed from: a */
    public static ExecutorService f13136a = Executors.newCachedThreadPool();

    /* renamed from: com.xiaomi.push.service.aa$a */
    public static class CallableC4593a implements Callable<Bitmap> {

        /* renamed from: a */
        public Context f13137a;

        /* renamed from: a */
        public String f13138a;

        /* renamed from: a */
        public boolean f13139a;

        public CallableC4593a(String str, Context context, boolean z) {
            this.f13137a = context;
            this.f13138a = str;
            this.f13139a = z;
        }

        /* renamed from: a */
        public Bitmap call() {
            Bitmap bitmap = null;
            if (!TextUtils.isEmpty(this.f13138a)) {
                if (this.f13138a.startsWith("http")) {
                    C4602ag.C4604b a = C4602ag.m13915a(this.f13137a, this.f13138a, this.f13139a);
                    if (a != null) {
                        return a.f13161a;
                    }
                } else {
                    bitmap = C4602ag.m13913a(this.f13137a, this.f13138a);
                    if (bitmap != null) {
                        return bitmap;
                    }
                }
                AbstractC4163b.m11301a("Failed get online picture/icon resource");
                return bitmap;
            }
            AbstractC4163b.m11301a("Failed get online picture/icon resource cause picUrl is empty");
            return null;
        }
    }

    /* renamed from: com.xiaomi.push.service.aa$b */
    public static class C4594b {

        /* renamed from: a */
        public long f13140a = 0;

        /* renamed from: a */
        public Notification f13141a;
    }

    /* renamed from: com.xiaomi.push.service.aa$c */
    public static class C4595c {

        /* renamed from: a */
        public long f13142a = 0;

        /* renamed from: a */
        public String f13143a;
    }

    /* renamed from: com.xiaomi.push.service.aa$d */
    public static class C4596d {

        /* renamed from: a */
        public StatusBarNotification f13144a = null;

        /* renamed from: a */
        public HashMap<String, Integer> f13145a = new HashMap<>();

        /* renamed from: a */
        public boolean f13146a = false;

        /* renamed from: b */
        public HashMap<String, HashSet<Integer>> f13147b = new HashMap<>();
    }

    /* renamed from: a */
    public static int m13855a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static int m13856a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m13857a(String str, String str2) {
        return (((str + str2).hashCode() / 10) * 10) + 32768;
    }

    /* renamed from: a */
    public static int m13858a(Map<String, String> map) {
        String str = map == null ? null : map.get(C7486o0OoO0oO.f20312OooO0Oo);
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public static Notification.Builder m13859a(Notification.Builder builder, Context context, String str, Map<String, String> map) {
        PendingIntent a = m13864a(context, str, 1, map);
        if (a != null && !TextUtils.isEmpty(map.get("notification_style_button_left_name"))) {
            builder.addAction(0, map.get("notification_style_button_left_name"), a);
        }
        PendingIntent a2 = m13864a(context, str, 2, map);
        if (a2 != null && !TextUtils.isEmpty(map.get("notification_style_button_mid_name"))) {
            builder.addAction(0, map.get("notification_style_button_mid_name"), a2);
        }
        PendingIntent a3 = m13864a(context, str, 3, map);
        if (a3 != null && !TextUtils.isEmpty(map.get("notification_style_button_right_name"))) {
            builder.addAction(0, map.get("notification_style_button_right_name"), a3);
        }
        return builder;
    }

    @TargetApi(16)
    /* renamed from: a */
    public static Notification.Builder m13860a(Context context, Map<String, String> map, Notification.Builder builder, String str) {
        if ("2".equals(map.get("notification_style_type"))) {
            Bitmap a = map == null ? null : m13868a(context, map.get("notification_bigPic_uri"), false);
            if (a == null) {
                AbstractC4163b.m11301a("can not get big picture.");
                return builder;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(builder);
            bigPictureStyle.bigPicture(a);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            builder.setStyle(bigPictureStyle);
        } else if ("1".equals(map.get("notification_style_type"))) {
            builder.setStyle(new Notification.BigTextStyle().bigText(str));
        }
        return builder;
    }

    /* renamed from: a */
    public static Notification m13861a(Notification notification) {
        Object a = C4278ba.m11771a(notification, "extraNotification");
        if (a != null) {
            C4278ba.m11772a(a, "setCustomizedIcon", true);
        }
        return notification;
    }

    /* renamed from: a */
    public static Notification m13862a(Notification notification, String str) {
        try {
            Field declaredField = Notification.class.getDeclaredField("extraNotification");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(notification);
            Method declaredMethod = obj.getClass().getDeclaredMethod("setTargetPkg", CharSequence.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj, str);
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
        return notification;
    }

    /* renamed from: a */
    public static PendingIntent m13863a(Context context, C4517ik ikVar, C4508ib ibVar, byte[] bArr, int i) {
        ComponentName componentName;
        Intent intent;
        int i2 = m13899c(ikVar) ? 1000 : m13887a(ikVar) ? 3000 : -1;
        String a = ibVar != null ? ibVar.m13097a() : "";
        if (ibVar == null || TextUtils.isEmpty(ibVar.f12541e)) {
            if (m13887a(ikVar)) {
                intent = new Intent();
                componentName = new ComponentName(MiPushRegistar.PACKAGE_XIAOMI, "com.xiaomi.mipush.sdk.PushMessageHandler");
            } else {
                intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                componentName = new ComponentName(ikVar.f12694b, "com.xiaomi.mipush.sdk.PushMessageHandler");
            }
            intent.setComponent(componentName);
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i));
            intent.addCategory(String.valueOf(a));
            intent.putExtra(MiPushMessage.KEY_MESSAGE_ID, a);
            intent.putExtra("eventMessageType", i2);
            if (!C4660f.m14096b(context, ikVar.f12694b, "com.xiaomi.mipush.MESSAGE_CLICKED")) {
                return PendingIntent.getService(context, 0, intent, 134217728);
            }
            Intent intent2 = new Intent();
            intent2.setAction("com.xiaomi.mipush.MESSAGE_CLICKED");
            intent2.setClassName(ikVar.f12694b, "com.xiaomi.mipush.sdk.BridgeActivity");
            intent2.addFlags(276824064);
            intent2.putExtra("mipush_serviceIntent", intent);
            intent2.addCategory(String.valueOf(i));
            intent2.addCategory(String.valueOf(a));
            return PendingIntent.getActivity(context, 0, intent2, 134217728);
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setData(Uri.parse(ibVar.f12541e));
        intent3.addFlags(CommonNetImpl.FLAG_AUTH);
        intent3.putExtra(MiPushMessage.KEY_MESSAGE_ID, a);
        intent3.putExtra("eventMessageType", i2);
        return PendingIntent.getActivity(context, 0, intent3, 134217728);
    }

    /* renamed from: a */
    public static PendingIntent m13864a(Context context, String str, int i, Map<String, String> map) {
        Intent a;
        if (map == null || (a = m13866a(context, str, i, map)) == null) {
            return null;
        }
        return PendingIntent.getActivity(context, 0, a, 0);
    }

    /* renamed from: a */
    public static Intent m13865a(Context context, Intent intent) {
        try {
            if (context.getPackageManager().getPackageInfo("com.android.browser", 4) != null) {
                intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
            }
            return intent;
        } catch (PackageManager.NameNotFoundException e) {
            AbstractC4163b.m11303a(e);
            return intent;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0140  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m13866a(android.content.Context r6, java.lang.String r7, int r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4592aa.m13866a(android.content.Context, java.lang.String, int, java.util.Map):android.content.Intent");
    }

    /* renamed from: a */
    public static Bitmap m13867a(Context context, int i) {
        return m13869a(context.getResources().getDrawable(i));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static Bitmap m13868a(Context context, String str, boolean z) {
        Future submit = f13136a.submit(new CallableC4593a(str, context, z));
        try {
            Bitmap bitmap = (Bitmap) submit.get(180, TimeUnit.SECONDS);
            if (bitmap != null) {
                return bitmap;
            }
            submit.cancel(true);
            return bitmap;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AbstractC4163b.m11303a(e);
            submit.cancel(true);
            return null;
        } catch (Throwable th) {
            submit.cancel(true);
            throw th;
        }
    }

    /* renamed from: a */
    public static Bitmap m13869a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int i = 1;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            i = intrinsicHeight;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public static RemoteViews m13870a(Context context, C4517ik ikVar, byte[] bArr) {
        C4508ib a = ikVar.m13270a();
        String a2 = m13875a(ikVar);
        Map<String, String> a3 = a.m13098a();
        if (a3 == null) {
            return null;
        }
        String str = a3.get("layout_name");
        String str2 = a3.get("layout_value");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(a2);
                int identifier = resourcesForApplication.getIdentifier(str, "layout", a2);
                if (identifier == 0) {
                    return null;
                }
                RemoteViews remoteViews = new RemoteViews(a2, identifier);
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has("text")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String string = jSONObject2.getString(next);
                            int identifier2 = resourcesForApplication.getIdentifier(next, "id", a2);
                            if (identifier2 > 0) {
                                remoteViews.setTextViewText(identifier2, string);
                            }
                        }
                    }
                    if (jSONObject.has(SocializeProtocolConstants.IMAGE)) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject(SocializeProtocolConstants.IMAGE);
                        Iterator<String> keys2 = jSONObject3.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            String string2 = jSONObject3.getString(next2);
                            int identifier3 = resourcesForApplication.getIdentifier(next2, "id", a2);
                            int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", a2);
                            if (identifier3 > 0) {
                                remoteViews.setImageViewResource(identifier3, identifier4);
                            }
                        }
                    }
                    if (jSONObject.has("time")) {
                        JSONObject jSONObject4 = jSONObject.getJSONObject("time");
                        Iterator<String> keys3 = jSONObject4.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            String string3 = jSONObject4.getString(next3);
                            if (string3.length() == 0) {
                                string3 = "yy-MM-dd hh:mm";
                            }
                            int identifier5 = resourcesForApplication.getIdentifier(next3, "id", a2);
                            if (identifier5 > 0) {
                                remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                            }
                        }
                    }
                    return remoteViews;
                } catch (JSONException e) {
                    AbstractC4163b.m11303a(e);
                    return null;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                AbstractC4163b.m11303a(e2);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0117 A[SYNTHETIC, Splitter:B:45:0x0117] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f2  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.push.service.C4592aa.C4594b m13871a(android.content.Context r21, com.xiaomi.push.C4517ik r22, byte[] r23, android.widget.RemoteViews r24, android.app.PendingIntent r25) {
        /*
        // Method dump skipped, instructions count: 1229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4592aa.m13871a(android.content.Context, com.xiaomi.push.ik, byte[], android.widget.RemoteViews, android.app.PendingIntent):com.xiaomi.push.service.aa$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x011a, code lost:
        if (r5 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x011e, code lost:
        if (r5 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0122, code lost:
        if (r5 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0126, code lost:
        if (r5 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0128, code lost:
        com.xiaomi.push.C4417fd.m12519a(r19.getApplicationContext()).mo41815a(r20.mo42282b(), m13893b(r20), r5.m13097a(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013f, code lost:
        com.xiaomi.channel.commonutils.logger.AbstractC4163b.m11303a(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.push.service.C4592aa.C4595c m13872a(android.content.Context r19, com.xiaomi.push.C4517ik r20, byte[] r21) {
        /*
        // Method dump skipped, instructions count: 811
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4592aa.m13872a(android.content.Context, com.xiaomi.push.ik, byte[]):com.xiaomi.push.service.aa$c");
    }

    /* renamed from: a */
    public static C4596d m13873a(NotificationManager notificationManager, String str, String str2) {
        StatusBarNotification[] activeNotifications;
        Object a;
        C4596d dVar = new C4596d();
        if (notificationManager != null && Build.VERSION.SDK_INT >= 23 && !TextUtils.isEmpty(str) && (activeNotifications = notificationManager.getActiveNotifications()) != null && activeNotifications.length > 0) {
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification != null) {
                    String packageName = statusBarNotification.getPackageName();
                    String group = statusBarNotification.getNotification() != null ? statusBarNotification.getNotification().getGroup() : "";
                    if (!TextUtils.isEmpty(group)) {
                        String str3 = packageName + group;
                        HashSet<Integer> hashSet = null;
                        if (!str2.equals(str3) || (a = C4278ba.m11772a(statusBarNotification.getNotification(), "isGroupSummary", (Object[]) null)) == null || !(a instanceof Boolean) || !((Boolean) Boolean.class.cast(a)).booleanValue()) {
                            dVar.f13145a.put(str3, Integer.valueOf((dVar.f13145a.containsKey(str3) ? dVar.f13145a.get(str3).intValue() : 0) + 1));
                            if (dVar.f13147b.containsKey(str3)) {
                                hashSet = dVar.f13147b.get(str3);
                            }
                            if (hashSet == null) {
                                hashSet = new HashSet<>();
                                dVar.f13147b.put(str3, hashSet);
                            }
                            hashSet.add(Integer.valueOf(statusBarNotification.getId()));
                        } else {
                            dVar.f13146a = true;
                            dVar.f13144a = statusBarNotification;
                        }
                    }
                }
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public static String m13874a(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? C4442g.m12703b(context, str) : map.get("channel_name");
    }

    /* renamed from: a */
    public static String m13875a(C4517ik ikVar) {
        C4508ib a;
        if (!(!MiPushRegistar.PACKAGE_XIAOMI.equals(ikVar.f12694b) || (a = ikVar.m13270a()) == null || a.m13098a() == null)) {
            String str = a.m13098a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return ikVar.f12694b;
    }

    /* renamed from: a */
    public static void m13876a(Notification notification, int i) {
        Object a = C4278ba.m11771a(notification, "extraNotification");
        if (a != null) {
            C4278ba.m11772a(a, "setMessageCount", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static void m13877a(NotificationManager notificationManager, String str, String str2) {
        int a = m13857a(str, str2);
        AbstractC4163b.m11304b("GROUPSUMMARY  : cancelGroupSummarytargetPackageName = " + str + " id = " + a);
        notificationManager.cancel(a);
    }

    @TargetApi(23)
    /* renamed from: a */
    public static void m13878a(Context context, Notification notification, int i, String str) {
        HashSet<Integer> hashSet;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
        String str2 = context.getPackageName() + notification.getGroup();
        C4596d a = m13873a(notificationManager, notification.getGroup(), str2);
        boolean z = false;
        int intValue = a.f13145a.containsKey(str2) ? a.f13145a.get(str2).intValue() : 0;
        if (a.f13147b.containsKey(str2) && (hashSet = a.f13147b.get(str2)) != null && hashSet.contains(Integer.valueOf(i))) {
            z = true;
        }
        if (intValue > 1 || (intValue == 1 && !z)) {
            if (!a.f13146a) {
                m13881a(context, str, notification, notificationManager);
                return;
            }
            StatusBarNotification statusBarNotification = a.f13144a;
            if (statusBarNotification != null && statusBarNotification.getNotification() != null) {
                Notification notification2 = a.f13144a.getNotification();
                notification2.when = System.currentTimeMillis();
                notificationManager.notify(a.f13144a.getId(), notification2);
            }
        } else if (intValue < 1 && a.f13146a) {
            m13877a(notificationManager, str, notification.getGroup());
        }
    }

    /* renamed from: a */
    public static void m13879a(Context context, String str) {
        m13880a(context, str, -1);
    }

    /* renamed from: a */
    public static void m13880a(Context context, String str, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
        int hashCode = ((str.hashCode() / 10) * 10) + i;
        LinkedList linkedList = new LinkedList();
        if (i >= 0) {
            notificationManager.cancel(hashCode);
        }
        synchronized (f13135a) {
            Iterator<Pair<Integer, C4517ik>> it = f13135a.iterator();
            while (it.hasNext()) {
                Pair<Integer, C4517ik> next = it.next();
                C4517ik ikVar = (C4517ik) next.second;
                if (ikVar != null) {
                    String a = m13875a(ikVar);
                    if (i >= 0) {
                        if (hashCode == ((Integer) next.first).intValue()) {
                            if (!TextUtils.equals(a, str)) {
                            }
                        }
                    } else if (i == -1 && TextUtils.equals(a, str)) {
                        notificationManager.cancel(((Integer) next.first).intValue());
                    }
                    linkedList.add(next);
                }
            }
            if (f13135a != null) {
                f13135a.removeAll(linkedList);
                m13883a(context, linkedList);
            }
        }
    }

    @TargetApi(23)
    /* renamed from: a */
    public static void m13881a(Context context, String str, Notification notification, NotificationManager notificationManager) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                String group = notification.getGroup();
                Notification notification2 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (C4278ba.m11772a(notificationManager, "getNotificationChannel", "groupSummary") == null) {
                        C4278ba.m11772a(notificationManager, "createNotificationChannel", C4688t.m14219a(context, "android.app.NotificationChannel").getConstructor(String.class, CharSequence.class, Integer.TYPE).newInstance("groupSummary", "group_summary", 3));
                    }
                    if (!TextUtils.isEmpty(group)) {
                        Notification.Builder builder = new Notification.Builder(context);
                        builder.setContentTitle("GroupSummary").setContentText("GroupSummary").setLargeIcon(notification.getLargeIcon()).setSmallIcon(notification.getSmallIcon()).setAutoCancel(true).setGroup(group).setGroupSummary(true);
                        C4278ba.m11772a(builder, "setChannelId", "groupSummary");
                        notification2 = builder.build();
                    }
                } else if (!TextUtils.isEmpty(group)) {
                    Notification.Builder builder2 = new Notification.Builder(context);
                    builder2.setContentTitle("GroupSummary").setContentText("GroupSummary").setLargeIcon(notification.getLargeIcon()).setSmallIcon(notification.getSmallIcon()).setPriority(0).setDefaults(-1).setAutoCancel(true).setGroup(group).setGroupSummary(true);
                    notification2 = builder2.build();
                }
                if (notification2 != null && !C4563l.m13730c() && MiPushRegistar.PACKAGE_XIAOMI.equals(context.getPackageName())) {
                    m13862a(notification2, str);
                    if (notification2.extras != null) {
                        notification2.extras.putString("target_package", str);
                    }
                }
                int a = m13857a(str, group);
                if (notification2 != null) {
                    notificationManager.notify(a, notification2);
                    AbstractC4163b.m11304b("GROUPSUMMARY  : showGroupSummary targetPackageName = " + str + " id = " + a);
                }
            }
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }

    /* renamed from: a */
    public static void m13882a(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
            LinkedList linkedList = new LinkedList();
            synchronized (f13135a) {
                Iterator<Pair<Integer, C4517ik>> it = f13135a.iterator();
                while (it.hasNext()) {
                    Pair<Integer, C4517ik> next = it.next();
                    C4517ik ikVar = (C4517ik) next.second;
                    if (ikVar != null) {
                        String a = m13875a(ikVar);
                        C4508ib a2 = ikVar.m13270a();
                        if (a2 != null) {
                            if (TextUtils.equals(a, str)) {
                                String c = a2.m13117c();
                                String d = a2.mo42131d();
                                if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(d) && m13888a(str2, c) && m13888a(str3, d)) {
                                    notificationManager.cancel(((Integer) next.first).intValue());
                                    linkedList.add(next);
                                }
                            }
                        }
                    }
                }
                if (f13135a != null) {
                    f13135a.removeAll(linkedList);
                    m13883a(context, linkedList);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m13883a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList != null && linkedList.size() > 0) {
            C4641bf.m14056a(context, "category_clear_notification", "clear_notification", (long) linkedList.size(), "");
        }
    }

    /* renamed from: a */
    public static void m13884a(Object obj, Map<String, String> map) {
        if (map != null && !TextUtils.isEmpty(map.get("channel_description"))) {
            C4278ba.m11772a(obj, "setDescription", map.get("channel_description"));
        }
    }

    /* renamed from: a */
    public static boolean m13885a(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && Arrays.asList(runningAppProcessInfo.pkgList).contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m13886a(C4508ib ibVar) {
        if (ibVar == null) {
            return false;
        }
        String a = ibVar.m13097a();
        return !TextUtils.isEmpty(a) && a.length() == 22 && "satuigmo".indexOf(a.charAt(0)) >= 0;
    }

    /* renamed from: a */
    public static boolean m13887a(C4517ik ikVar) {
        C4508ib a = ikVar.m13270a();
        return m13886a(a) && a.mo42143l();
    }

    /* renamed from: a */
    public static boolean m13888a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* renamed from: a */
    public static boolean m13889a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004e, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0072;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] m13890a(android.content.Context r3, com.xiaomi.push.C4508ib r4) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4592aa.m13890a(android.content.Context, com.xiaomi.push.ib):java.lang.String[]");
    }

    /* renamed from: b */
    public static int m13891b(Context context, String str) {
        int a = m13856a(context, str, "mipush_notification");
        int a2 = m13856a(context, str, "mipush_small_notification");
        if (a <= 0) {
            a = a2 > 0 ? a2 : context.getApplicationInfo().icon;
        }
        return (a != 0 || Build.VERSION.SDK_INT < 9) ? a : context.getApplicationInfo().logo;
    }

    /* renamed from: b */
    public static int m13892b(Map<String, String> map) {
        if (map == null) {
            return 3;
        }
        String str = map.get("channel_importance");
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        try {
            AbstractC4163b.m11305c("importance=" + 3);
            return Integer.parseInt(str);
        } catch (Exception e) {
            AbstractC4163b.m11306d("parsing channel importance error: " + e);
            return 3;
        }
    }

    /* renamed from: b */
    public static String m13893b(C4517ik ikVar) {
        return m13887a(ikVar) ? "E100002" : m13899c(ikVar) ? "E100000" : m13897b(ikVar) ? "E100001" : m13900d(ikVar) ? "E100003" : "";
    }

    /* renamed from: b */
    public static void m13894b(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    /* renamed from: b */
    public static void m13895b(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    /* renamed from: b */
    public static boolean m13896b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    /* renamed from: b */
    public static boolean m13897b(C4517ik ikVar) {
        C4508ib a = ikVar.m13270a();
        return m13886a(a) && a.f12534b == 1 && !m13887a(ikVar);
    }

    /* renamed from: c */
    public static int m13898c(Map<String, String> map) {
        if (map == null) {
            return 0;
        }
        String str = map.get("notification_priority");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            AbstractC4163b.m11305c("priority=" + str);
            return Integer.parseInt(str);
        } catch (Exception e) {
            AbstractC4163b.m11306d("parsing notification priority error: " + e);
            return 0;
        }
    }

    /* renamed from: c */
    public static boolean m13899c(C4517ik ikVar) {
        C4508ib a = ikVar.m13270a();
        return m13886a(a) && a.f12534b == 0 && !m13887a(ikVar);
    }

    /* renamed from: d */
    public static boolean m13900d(C4517ik ikVar) {
        return ikVar.mo42273a() == EnumC4494ho.Registration;
    }

    /* renamed from: e */
    public static boolean m13901e(C4517ik ikVar) {
        return m13887a(ikVar) || m13899c(ikVar) || m13897b(ikVar);
    }
}
