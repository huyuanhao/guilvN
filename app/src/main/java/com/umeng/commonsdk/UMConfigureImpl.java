package com.umeng.commonsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.C3516a;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.internal.C3523a;
import com.umeng.commonsdk.internal.C3528d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C3529a;
import com.umeng.commonsdk.internal.utils.C3532b;
import com.umeng.commonsdk.internal.utils.C3535c;
import com.umeng.commonsdk.internal.utils.C3546j;
import com.umeng.commonsdk.internal.utils.C3550l;
import com.umeng.commonsdk.proguard.C3588b;
import com.umeng.commonsdk.stateless.C3640a;
import com.umeng.commonsdk.stateless.C3653f;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.AbstractC3743a;
import com.umeng.commonsdk.utils.C3745b;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class UMConfigureImpl {

    /* renamed from: a */
    public static boolean f8854a = false;

    /* renamed from: b */
    public static boolean f8855b = false;

    /* renamed from: c */
    public static String f8856c = "delayed_transmission_flag_new";

    /* renamed from: d */
    public static CopyOnWriteArrayList<onMessageSendListener> f8857d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public static int f8858e = 0;

    /* renamed from: f */
    public static boolean f8859f = false;

    /* renamed from: g */
    public static final int f8860g = 1000;

    /* renamed from: c */
    public static synchronized void m8974c(final Context context) {
        synchronized (UMConfigureImpl.class) {
            if (context != null) {
                try {
                    new Thread(new Runnable() {
                        /* class com.umeng.commonsdk.UMConfigureImpl.RunnableC34882 */

                        public void run() {
                            try {
                                C3528d.m9085c(context);
                            } catch (Throwable th) {
                                ULog.m9826e(UMModuleRegister.INNER, "e is " + th);
                            }
                            try {
                                C3528d.m9088e(context);
                            } catch (Throwable unused) {
                            }
                        }
                    }).start();
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
            m8977f(context);
        }
        return;
    }

    /* renamed from: d */
    public static void m8975d(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f8856c, 0);
            if (sharedPreferences != null && sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean(f8856c, true);
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static boolean m8976e(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f8856c, 0);
            if (sharedPreferences == null || sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(f8856c, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static synchronized void m8977f(final Context context) {
        synchronized (UMConfigureImpl.class) {
            try {
                if (FieldManager.allow(C3745b.f9844ag) && context != null && !f8855b) {
                    String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                    String packageName = context.getPackageName();
                    if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                        new Thread(new Runnable() {
                            /* class com.umeng.commonsdk.UMConfigureImpl.RunnableC34893 */

                            public void run() {
                                try {
                                    JSONArray b = C3588b.m9440b(context);
                                    if (b != null && b.length() > 0) {
                                        C3653f.m9764a(context, context.getFilesDir() + C8932ooOOO0o.OooO0OO + C3640a.f9476e + C8932ooOOO0o.OooO0OO + Base64.encodeToString(C3523a.f9038o.getBytes(), 0), 10);
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("lbs", b);
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(SocializeProtocolConstants.PROTOCOL_KEY_REQUEST_TYPE, jSONObject);
                                        UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                                        uMSLEnvelopeBuild.buildSLEnvelope(context, uMSLEnvelopeBuild.buildSLBaseHeader(context), jSONObject2, C3523a.f9038o);
                                    }
                                } catch (Exception e) {
                                    UMCrashManager.reportCrash(context, e);
                                }
                            }
                        }).start();
                    }
                    f8855b = true;
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
        return;
    }

    /* renamed from: g */
    public static synchronized void m8978g(final Context context) {
        synchronized (UMConfigureImpl.class) {
            if (context != null) {
                try {
                    if (!f8854a) {
                        new Thread(new Runnable() {
                            /* class com.umeng.commonsdk.UMConfigureImpl.RunnableC34904 */

                            public void run() {
                                try {
                                    String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                    String packageName = context.getPackageName();
                                    if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                                        try {
                                            if (FieldManager.allow(C3745b.f9840ac)) {
                                                C3588b.m9439a(context);
                                            }
                                        } catch (Throwable th) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th);
                                        }
                                        try {
                                            if (FieldManager.allow(C3745b.f9816F) && !C3535c.m9148a(context).mo38855a()) {
                                                C3535c.m9148a(context).mo38856b();
                                            }
                                        } catch (Throwable th2) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th2);
                                        }
                                        try {
                                            C3550l.m9221b(context);
                                        } catch (Throwable th3) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th3);
                                        }
                                        try {
                                            if (FieldManager.allow(C3745b.f9830T)) {
                                                C3529a.m9116d(context);
                                            }
                                        } catch (Throwable th4) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th4);
                                        }
                                        try {
                                            if (FieldManager.allow(C3745b.f9827Q)) {
                                                C3546j.m9194b(context);
                                            }
                                        } catch (Throwable th5) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th5);
                                        }
                                        try {
                                            if (!C3532b.m9140a(context).mo38851a() && FieldManager.allow(C3745b.f9836Z)) {
                                                C3532b.m9140a(context).mo38852b();
                                            }
                                        } catch (Throwable unused) {
                                            ULog.m9826e(UMModuleRegister.INNER, "get station is null ");
                                        }
                                    }
                                } catch (Throwable th6) {
                                    UMCrashManager.reportCrash(context, th6);
                                }
                            }
                        }).start();
                        f8854a = true;
                    }
                } catch (Throwable th) {
                    ULog.m9826e(UMModuleRegister.INNER, "e is " + th.getMessage());
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
        return;
    }

    /* renamed from: h */
    public static synchronized void m8979h(final Context context) {
        synchronized (UMConfigureImpl.class) {
            if (context != null) {
                try {
                    new Thread(new Runnable() {
                        /* class com.umeng.commonsdk.UMConfigureImpl.RunnableC34915 */

                        public void run() {
                            try {
                                String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                String packageName = context.getPackageName();
                                if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                                    try {
                                        C3528d.m9082b(context);
                                    } catch (Throwable th) {
                                        ULog.m9826e(UMModuleRegister.INNER, "e is " + th);
                                    }
                                    try {
                                        C3528d.m9087d(context);
                                    } catch (Throwable unused) {
                                    }
                                }
                            } catch (Throwable th2) {
                                UMCrashManager.reportCrash(context, th2);
                            }
                        }
                    }).start();
                    f8854a = true;
                } catch (Throwable th) {
                    ULog.m9826e(UMModuleRegister.INNER, "e is " + th.getMessage());
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
        return;
    }

    /* renamed from: i */
    public static synchronized void m8980i(final Context context) {
        synchronized (UMConfigureImpl.class) {
            if (context != null) {
                try {
                    if (!f8854a) {
                        new Thread(new Runnable() {
                            /* class com.umeng.commonsdk.UMConfigureImpl.RunnableC34926 */

                            public void run() {
                                try {
                                    String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                    String packageName = context.getPackageName();
                                    if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                                        try {
                                            if (FieldManager.allow(C3745b.f9840ac)) {
                                                C3588b.m9439a(context);
                                            }
                                        } catch (Throwable th) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th);
                                        }
                                        try {
                                            if (FieldManager.allow(C3745b.f9816F) && !C3535c.m9148a(context).mo38855a()) {
                                                C3535c.m9148a(context).mo38856b();
                                            }
                                        } catch (Throwable th2) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th2);
                                        }
                                        try {
                                            C3550l.m9221b(context);
                                        } catch (Throwable th3) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th3);
                                        }
                                        try {
                                            if (FieldManager.allow(C3745b.f9830T)) {
                                                C3529a.m9116d(context);
                                            }
                                        } catch (Throwable th4) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th4);
                                        }
                                        try {
                                            if (FieldManager.allow(C3745b.f9827Q)) {
                                                C3546j.m9194b(context);
                                            }
                                        } catch (Throwable th5) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th5);
                                        }
                                        try {
                                            C3528d.m9082b(context);
                                        } catch (Throwable th6) {
                                            ULog.m9826e(UMModuleRegister.INNER, "e is " + th6);
                                        }
                                        try {
                                            C3528d.m9087d(context);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                } catch (Throwable th7) {
                                    UMCrashManager.reportCrash(context, th7);
                                }
                            }
                        }).start();
                        try {
                            if (!C3532b.m9140a(context).mo38851a() && FieldManager.allow(C3745b.f9836Z)) {
                                C3532b.m9140a(context).mo38852b();
                            }
                        } catch (Throwable unused) {
                            ULog.m9826e(UMModuleRegister.INNER, "get station is null ");
                        }
                        f8854a = true;
                    }
                } catch (Throwable th) {
                    ULog.m9826e(UMModuleRegister.INNER, "e is " + th.getMessage());
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
        return;
    }

    public static void init(final Context context) {
        if (context != null) {
            m8978g(context);
            try {
                if (f8858e < 1) {
                    C3516a.m9025a(true);
                    m8979h(context);
                    m8977f(context);
                } else if (!m8976e(context)) {
                    C3516a.m9025a(false);
                    m8975d(context);
                    new AbstractC3743a(1000, 100) {
                        /* class com.umeng.commonsdk.UMConfigureImpl.C34871 */

                        @Override // com.umeng.commonsdk.utils.AbstractC3743a
                        /* renamed from: a */
                        public void mo38830a(long j) {
                            if (UMConfigureImpl.f8858e == 0) {
                                UMConfigureImpl.m8972b(context);
                                boolean unused = UMConfigureImpl.f8859f = true;
                                mo39469b();
                            }
                        }

                        @Override // com.umeng.commonsdk.utils.AbstractC3743a
                        /* renamed from: a */
                        public void mo38829a() {
                            if (!UMConfigureImpl.f8859f) {
                                UMConfigureImpl.m8972b(context);
                            }
                        }
                    }.mo39470c();
                } else {
                    C3516a.m9025a(true);
                    m8979h(context);
                    m8977f(context);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void registerInterruptFlag() {
        /*
            java.lang.Class<com.umeng.commonsdk.UMConfigureImpl> r0 = com.umeng.commonsdk.UMConfigureImpl.class
            monitor-enter(r0)
            int r1 = com.umeng.commonsdk.UMConfigureImpl.f8858e     // Catch:{ Exception -> 0x000d, all -> 0x000a }
            int r1 = r1 + 1
            com.umeng.commonsdk.UMConfigureImpl.f8858e = r1     // Catch:{ Exception -> 0x000d, all -> 0x000a }
            goto L_0x000d
        L_0x000a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x000d:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.UMConfigureImpl.registerInterruptFlag():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void registerMessageSendListener(com.umeng.commonsdk.utils.onMessageSendListener r2) {
        /*
            java.lang.Class<com.umeng.commonsdk.UMConfigureImpl> r0 = com.umeng.commonsdk.UMConfigureImpl.class
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r1 = com.umeng.commonsdk.UMConfigureImpl.f8857d     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r1 == 0) goto L_0x000c
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r1 = com.umeng.commonsdk.UMConfigureImpl.f8857d     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1.add(r2)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
        L_0x000c:
            boolean r2 = com.umeng.commonsdk.framework.C3516a.m9030b()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r2 == 0) goto L_0x0037
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r2 = com.umeng.commonsdk.UMConfigureImpl.f8857d     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r2 == 0) goto L_0x0037
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r2 = com.umeng.commonsdk.UMConfigureImpl.f8857d     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r2 <= 0) goto L_0x0037
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r2 = com.umeng.commonsdk.UMConfigureImpl.f8857d     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
        L_0x0024:
            boolean r1 = r2.hasNext()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            com.umeng.commonsdk.utils.onMessageSendListener r1 = (com.umeng.commonsdk.utils.onMessageSendListener) r1     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1.onMessageSend()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            goto L_0x0024
        L_0x0034:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L_0x0037:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.UMConfigureImpl.registerMessageSendListener(com.umeng.commonsdk.utils.onMessageSendListener):void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void removeInterruptFlag() {
        /*
            java.lang.Class<com.umeng.commonsdk.UMConfigureImpl> r0 = com.umeng.commonsdk.UMConfigureImpl.class
            monitor-enter(r0)
            int r1 = com.umeng.commonsdk.UMConfigureImpl.f8858e     // Catch:{ Exception -> 0x000d, all -> 0x000a }
            int r1 = r1 + -1
            com.umeng.commonsdk.UMConfigureImpl.f8858e = r1     // Catch:{ Exception -> 0x000d, all -> 0x000a }
            goto L_0x000d
        L_0x000a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x000d:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.UMConfigureImpl.removeInterruptFlag():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void removeMessageSendListener(com.umeng.commonsdk.utils.onMessageSendListener r2) {
        /*
            java.lang.Class<com.umeng.commonsdk.UMConfigureImpl> r0 = com.umeng.commonsdk.UMConfigureImpl.class
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r1 = com.umeng.commonsdk.UMConfigureImpl.f8857d     // Catch:{ Exception -> 0x0010, all -> 0x000d }
            if (r1 == 0) goto L_0x0010
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r1 = com.umeng.commonsdk.UMConfigureImpl.f8857d     // Catch:{ Exception -> 0x0010, all -> 0x000d }
            r1.remove(r2)     // Catch:{ Exception -> 0x0010, all -> 0x000d }
            goto L_0x0010
        L_0x000d:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L_0x0010:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.UMConfigureImpl.removeMessageSendListener(com.umeng.commonsdk.utils.onMessageSendListener):void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m8972b(android.content.Context r2) {
        /*
            java.lang.Class<com.umeng.commonsdk.UMConfigureImpl> r0 = com.umeng.commonsdk.UMConfigureImpl.class
            monitor-enter(r0)
            r1 = 1
            com.umeng.commonsdk.framework.C3516a.m9025a(r1)     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            m8974c(r2)     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r2 = com.umeng.commonsdk.UMConfigureImpl.f8857d     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            if (r2 == 0) goto L_0x002f
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r2 = com.umeng.commonsdk.UMConfigureImpl.f8857d     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            int r2 = r2.size()     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            if (r2 <= 0) goto L_0x002f
            java.util.concurrent.CopyOnWriteArrayList<com.umeng.commonsdk.utils.onMessageSendListener> r2 = com.umeng.commonsdk.UMConfigureImpl.f8857d     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x002f, all -> 0x002c }
        L_0x001c:
            boolean r1 = r2.hasNext()     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            com.umeng.commonsdk.utils.onMessageSendListener r1 = (com.umeng.commonsdk.utils.onMessageSendListener) r1     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            r1.onMessageSend()     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            goto L_0x001c
        L_0x002c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L_0x002f:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.UMConfigureImpl.m8972b(android.content.Context):void");
    }
}
