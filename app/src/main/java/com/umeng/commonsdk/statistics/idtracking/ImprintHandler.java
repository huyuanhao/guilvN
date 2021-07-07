package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.C3555ac;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.AbstractC3701d;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.statistics.proto.C3729d;
import com.umeng.commonsdk.statistics.proto.C3736e;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class ImprintHandler implements FileLockCallback {

    /* renamed from: a */
    public static final String f9603a = "ImprintHandler";

    /* renamed from: b */
    public static Object f9604b = new Object();

    /* renamed from: c */
    public static final String f9605c = ".imprint";

    /* renamed from: d */
    public static final byte[] f9606d = "pbl0".getBytes();

    /* renamed from: f */
    public static Map<String, ArrayList<UMImprintChangeCallback>> f9607f = new HashMap();

    /* renamed from: g */
    public static Object f9608g = new Object();

    /* renamed from: j */
    public static ImprintHandler f9609j = null;

    /* renamed from: k */
    public static Context f9610k = null;

    /* renamed from: l */
    public static FileLockUtil f9611l = null;

    /* renamed from: m */
    public static final int f9612m = 0;

    /* renamed from: n */
    public static final int f9613n = 1;

    /* renamed from: o */
    public static Map<String, UMImprintPreProcessCallback> f9614o = new HashMap();

    /* renamed from: p */
    public static Object f9615p = new Object();

    /* renamed from: e */
    public AbstractC3701d f9616e;

    /* renamed from: h */
    public C3671a f9617h = new C3671a();

    /* renamed from: i */
    public C3729d f9618i = null;

    public ImprintHandler(Context context) {
        f9610k = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m9881a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (f9608g) {
            try {
                int i = 0;
                if (f9607f.containsKey(str)) {
                    ArrayList<UMImprintChangeCallback> arrayList = f9607f.get(str);
                    int size = arrayList.size();
                    ULog.m9829i("--->>> addCallback: before add: callbacks size is: " + size);
                    while (i < size) {
                        if (uMImprintChangeCallback == arrayList.get(i)) {
                            ULog.m9829i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i++;
                    }
                    arrayList.add(uMImprintChangeCallback);
                    ULog.m9829i("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
                } else {
                    ArrayList<UMImprintChangeCallback> arrayList2 = new ArrayList<>();
                    int size2 = arrayList2.size();
                    ULog.m9829i("--->>> addCallback: before add: callbacks size is: " + size2);
                    while (i < size2) {
                        if (uMImprintChangeCallback == arrayList2.get(i)) {
                            ULog.m9829i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i++;
                    }
                    arrayList2.add(uMImprintChangeCallback);
                    ULog.m9829i("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                    f9607f.put(str, arrayList2);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f9610k, th);
            }
        }
    }

    /* renamed from: b */
    public static void m9883b(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            synchronized (f9608g) {
                try {
                    if (f9607f.containsKey(str)) {
                        ArrayList<UMImprintChangeCallback> arrayList = f9607f.get(str);
                        if (uMImprintChangeCallback != null && arrayList.size() > 0) {
                            int size = arrayList.size();
                            ULog.m9829i("--->>> removeCallback: before remove: callbacks size is: " + size);
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                } else if (uMImprintChangeCallback == arrayList.get(i)) {
                                    ULog.m9829i("--->>> removeCallback: remove index " + i);
                                    arrayList.remove(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            ULog.m9829i("--->>> removeCallback: after remove: callbacks size is: " + arrayList.size());
                            if (arrayList.size() == 0) {
                                ULog.m9829i("--->>> removeCallback: remove key from map: key = " + str);
                                f9607f.remove(str);
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(f9610k, th);
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m9884c(C3729d dVar) {
        if (!dVar.mo39426i().equals(mo39221a(dVar))) {
            return false;
        }
        for (C3736e eVar : dVar.mo39419c().values()) {
            byte[] reverseHexString = DataHelper.reverseHexString(eVar.mo39451h());
            byte[] a = mo39225a(eVar);
            int i = 0;
            while (true) {
                if (i < 4) {
                    if (reverseHexString[i] != a[i]) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    private C3729d m9885d(C3729d dVar) {
        ArrayList<UMImprintChangeCallback> arrayList;
        boolean z;
        ArrayList<UMImprintChangeCallback> arrayList2;
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        Map<String, C3736e> c = dVar.mo39419c();
        ArrayList<String> arrayList3 = new ArrayList(c.size() / 2);
        Iterator<Map.Entry<String, C3736e>> it = c.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry<String, C3736e> next = it.next();
                if (!next.getValue().mo39447d()) {
                    arrayList3.add(next.getKey());
                } else {
                    String key = next.getKey();
                    String str = next.getValue().f9790a;
                    synchronized (f9615p) {
                        z = !TextUtils.isEmpty(key) && f9614o.containsKey(key) && (uMImprintPreProcessCallback = f9614o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str);
                    }
                    if (z) {
                        arrayList3.add(key);
                    }
                    synchronized (f9608g) {
                        if (!TextUtils.isEmpty(key) && f9607f.containsKey(key) && (arrayList2 = f9607f.get(key)) != null) {
                            for (int i = 0; i < arrayList2.size(); i++) {
                                arrayList2.get(i).onImprintValueChanged(key, str);
                            }
                        }
                    }
                }
            } else {
                for (String str2 : arrayList3) {
                    synchronized (f9608g) {
                        if (!TextUtils.isEmpty(str2) && f9607f.containsKey(str2) && (arrayList = f9607f.get(str2)) != null) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                arrayList.get(i2).onImprintValueChanged(str2, null);
                            }
                        }
                    }
                    c.remove(str2);
                }
                return dVar;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[SYNTHETIC, Splitter:B:21:0x0038] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9886e() {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9610k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".imprint"
            r0.<init>(r1, r2)
            java.lang.Object r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9604b
            monitor-enter(r1)
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0018
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            return
        L_0x0018:
            r0 = 0
            android.content.Context r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9610k     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            java.lang.String r3 = ".imprint"
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            byte[] r0 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r2)     // Catch:{ Exception -> 0x0029 }
        L_0x0025:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)
            goto L_0x0036
        L_0x0029:
            r3 = move-exception
            goto L_0x0032
        L_0x002b:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L_0x0054
        L_0x0030:
            r3 = move-exception
            r2 = r0
        L_0x0032:
            r3.printStackTrace()     // Catch:{ all -> 0x0053 }
            goto L_0x0025
        L_0x0036:
            if (r0 == 0) goto L_0x0051
            com.umeng.commonsdk.statistics.proto.d r2 = new com.umeng.commonsdk.statistics.proto.d     // Catch:{ Exception -> 0x004d }
            r2.<init>()     // Catch:{ Exception -> 0x004d }
            com.umeng.commonsdk.proguard.w r3 = new com.umeng.commonsdk.proguard.w     // Catch:{ Exception -> 0x004d }
            r3.<init>()     // Catch:{ Exception -> 0x004d }
            r3.mo39073a(r2, r0)     // Catch:{ Exception -> 0x004d }
            r5.f9618i = r2     // Catch:{ Exception -> 0x004d }
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r0 = r5.f9617h     // Catch:{ Exception -> 0x004d }
            r0.mo39234a(r2)     // Catch:{ Exception -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0051:
            monitor-exit(r1)
            return
        L_0x0053:
            r0 = move-exception
        L_0x0054:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r2)
            throw r0
        L_0x0058:
            r0 = move-exception
            monitor-exit(r1)
            goto L_0x005c
        L_0x005b:
            throw r0
        L_0x005c:
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.m9886e():void");
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        ImprintHandler imprintHandler;
        synchronized (ImprintHandler.class) {
            if (f9609j == null) {
                f9609j = new ImprintHandler(context);
                FileLockUtil fileLockUtil = new FileLockUtil();
                f9611l = fileLockUtil;
                if (fileLockUtil != null) {
                    f9611l.doFileOperateion(new File(f9610k.getFilesDir(), f9605c), f9609j, 0);
                }
            }
            imprintHandler = f9609j;
        }
        return imprintHandler;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(File file, int i) {
        if (i == 0) {
            f9609j.m9886e();
        } else if (i == 1) {
            f9609j.m9880a(file);
        }
        return true;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str) {
        return false;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            m9881a(str, uMImprintChangeCallback);
        }
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintPreProcessCallback != null) {
            synchronized (f9615p) {
                try {
                    if (!f9614o.containsKey(str)) {
                        f9614o.put(str, uMImprintPreProcessCallback);
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> registPreProcessCallback: key : " + str + " regist success.");
                    } else {
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> key : " + str + " PreProcesser has registed!");
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(f9610k, th);
                }
            }
        }
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (!TextUtils.isEmpty(str) && uMImprintChangeCallback != null) {
            m9883b(str, uMImprintChangeCallback);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a */
    public static class C3671a {

        /* renamed from: a */
        public Map<String, String> f9619a = new HashMap();

        public C3671a() {
        }

        /* renamed from: b */
        private synchronized void m9896b(C3729d dVar) {
            C3736e eVar;
            if (dVar != null) {
                try {
                    if (dVar.mo39422e()) {
                        Map<String, C3736e> c = dVar.mo39419c();
                        for (String str : c.keySet()) {
                            if (!TextUtils.isEmpty(str) && (eVar = c.get(str)) != null) {
                                String b = eVar.mo39443b();
                                if (!TextUtils.isEmpty(b)) {
                                    this.f9619a.put(str, b);
                                    if (AnalyticsConstants.UM_DEBUG) {
                                        Log.i(ImprintHandler.f9603a, "imKey is " + str + ", imValue is " + b);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: a */
        public synchronized void mo39235a(String str) {
            if (this.f9619a != null && this.f9619a.size() > 0 && !TextUtils.isEmpty(str) && this.f9619a.containsKey(str)) {
                this.f9619a.remove(str);
            }
        }

        public C3671a(C3729d dVar) {
            mo39234a(dVar);
        }

        /* renamed from: a */
        public void mo39234a(C3729d dVar) {
            if (dVar != null) {
                m9896b(dVar);
            }
        }

        /* renamed from: a */
        public synchronized String mo39233a(String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f9619a.size() > 0) {
                    String str3 = this.f9619a.get(str);
                    if (!TextUtils.isEmpty(str3)) {
                        return str3;
                    }
                    return str2;
                }
            }
            return str2;
        }
    }

    /* renamed from: c */
    public C3671a mo39228c() {
        return this.f9617h;
    }

    /* renamed from: b */
    public void mo39227b(C3729d dVar) {
        C3729d dVar2;
        boolean z;
        if (dVar == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m9787d("Imprint is null");
            }
        } else if (m9884c(dVar)) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.m9787d("Imprint is ok");
            }
            HashMap hashMap = new HashMap();
            synchronized (this) {
                C3729d dVar3 = this.f9618i;
                String str = null;
                String i = dVar3 == null ? null : dVar3.mo39426i();
                if (dVar3 == null) {
                    dVar2 = m9885d(dVar);
                } else {
                    dVar2 = m9879a(dVar3, dVar, hashMap);
                }
                this.f9618i = dVar2;
                if (dVar2 != null) {
                    str = dVar2.mo39426i();
                }
                z = !m9882a(i, str);
            }
            C3729d dVar4 = this.f9618i;
            if (dVar4 != null) {
                boolean z2 = AnalyticsConstants.UM_DEBUG;
                if (z) {
                    this.f9617h.mo39234a(dVar4);
                    AbstractC3701d dVar5 = this.f9616e;
                    if (dVar5 != null) {
                        dVar5.onImprintChanged(this.f9617h);
                    }
                }
            }
            if (hashMap.size() > 0) {
                synchronized (f9608g) {
                    for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && f9607f.containsKey(key)) {
                            ULog.m9829i("--->>> target imprint key is: " + key + "; value is: " + value);
                            ArrayList<UMImprintChangeCallback> arrayList = f9607f.get(key);
                            if (arrayList != null) {
                                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                    arrayList.get(i2).onImprintValueChanged(key, value);
                                }
                            }
                        }
                    }
                }
            }
        } else if (AnalyticsConstants.UM_DEBUG) {
            MLog.m9793e("Imprint is not valid");
        }
    }

    /* renamed from: a */
    public void mo39223a(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (f9615p) {
                try {
                    if (f9614o.containsKey(str)) {
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: unregist [" + str + "] success.");
                        f9607f.remove(str);
                    } else {
                        UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: can't find [" + str + "], pls regist first.");
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(f9610k, th);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo39222a(AbstractC3701d dVar) {
        this.f9616e = dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9610k, r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39229d() {
        /*
            r4 = this;
            com.umeng.commonsdk.statistics.proto.d r0 = r4.f9618i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.umeng.commonsdk.utils.FileLockUtil r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9611l
            if (r0 == 0) goto L_0x0032
            java.io.File r0 = new java.io.File
            android.content.Context r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9610k
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".imprint"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x002a
            r0.createNewFile()     // Catch:{ IOException -> 0x0020 }
            goto L_0x002a
        L_0x0020:
            r0.createNewFile()     // Catch:{ IOException -> 0x0024 }
            goto L_0x002a
        L_0x0024:
            r1 = move-exception
            android.content.Context r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9610k
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r1)
        L_0x002a:
            com.umeng.commonsdk.utils.FileLockUtil r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9611l
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.f9609j
            r3 = 1
            r1.doFileOperateion(r0, r2, r3)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.ImprintHandler.mo39229d():void");
    }

    /* renamed from: a */
    public String mo39221a(C3729d dVar) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(dVar.mo39419c()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((C3736e) entry.getValue()).mo39447d()) {
                sb.append(((C3736e) entry.getValue()).mo39443b());
            }
            sb.append(((C3736e) entry.getValue()).mo39448e());
            sb.append(((C3736e) entry.getValue()).mo39451h());
        }
        sb.append(dVar.f9772b);
        return HelperUtils.MD5(sb.toString()).toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public byte[] mo39225a(C3736e eVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(null);
        allocate.putLong(eVar.mo39448e());
        byte[] array = allocate.array();
        byte[] bArr = f9606d;
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr2[i] = (byte) (array[i] ^ bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: a */
    public byte[] mo39224a() {
        try {
            synchronized (this) {
                if (this.f9618i == null) {
                    return null;
                }
                return new C3555ac().mo38869a(this.f9618i);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9610k, th);
            return null;
        }
    }

    /* renamed from: b */
    public synchronized C3729d mo39226b() {
        return this.f9618i;
    }

    /* renamed from: a */
    private boolean m9882a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    private C3729d m9879a(C3729d dVar, C3729d dVar2, Map<String, String> map) {
        ArrayList<UMImprintChangeCallback> arrayList;
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        if (dVar2 == null) {
            return dVar;
        }
        Map<String, C3736e> c = dVar.mo39419c();
        for (Map.Entry<String, C3736e> entry : dVar2.mo39419c().entrySet()) {
            int i = 0;
            if (entry.getValue().mo39447d()) {
                String key = entry.getKey();
                String str = entry.getValue().f9790a;
                synchronized (f9615p) {
                    if (!TextUtils.isEmpty(key) && f9614o.containsKey(key) && (uMImprintPreProcessCallback = f9614o.get(key)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(key, str)) {
                        i = 1;
                    }
                }
                if (i == 0) {
                    c.put(entry.getKey(), entry.getValue());
                    synchronized (f9608g) {
                        if (!TextUtils.isEmpty(key) && f9607f.containsKey(key) && f9607f.get(key) != null) {
                            map.put(key, str);
                        }
                    }
                } else {
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> merge: [" + key + "] should be ignored.");
                }
            } else {
                String key2 = entry.getKey();
                synchronized (f9608g) {
                    if (!TextUtils.isEmpty(key2) && f9607f.containsKey(key2) && (arrayList = f9607f.get(key2)) != null) {
                        while (i < arrayList.size()) {
                            arrayList.get(i).onImprintValueChanged(key2, null);
                            i++;
                        }
                    }
                }
                c.remove(key2);
                this.f9617h.mo39235a(key2);
            }
        }
        dVar.mo39411a(dVar2.mo39423f());
        dVar.mo39412a(mo39221a(dVar));
        return dVar;
    }

    /* renamed from: a */
    private void m9880a(File file) {
        if (this.f9618i != null) {
            try {
                synchronized (f9604b) {
                    byte[] a = new C3555ac().mo38869a(this.f9618i);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(a);
                        fileOutputStream.flush();
                    } finally {
                        HelperUtils.safeClose(fileOutputStream);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
