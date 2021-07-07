package com.alibaba.sdk.android.utils.crashdefend;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.utils.C0330c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.b */
public class C0333b {

    /* renamed from: b */
    public static C0333b f743b;

    /* renamed from: a */
    public Context f744a;

    /* renamed from: a */
    public C0330c f745a;

    /* renamed from: a */
    public C0332a f746a = new C0332a();

    /* renamed from: a */
    public C0335c f747a;

    /* renamed from: a */
    public final List<C0335c> f748a = new ArrayList();

    /* renamed from: a */
    public final int[] f749a = new int[5];

    /* renamed from: b */
    public ExecutorService f750b = null;

    /* renamed from: e */
    public Map<String, String> f751e = new HashMap();

    /* renamed from: com.alibaba.sdk.android.utils.crashdefend.b$a */
    public class RunnableC0334a implements Runnable {

        /* renamed from: a */
        public C0336d f752a;

        public RunnableC0334a(C0336d dVar) {
            this.f752a = dVar;
        }

        public void run() {
            do {
                try {
                    Thread.sleep(1000);
                    C0336d dVar = this.f752a;
                    dVar.f764d--;
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    e.getMessage();
                    return;
                }
            } while (this.f752a.f764d > 0);
            if (this.f752a.f764d <= 0) {
                C0333b.this.m622b(this.f752a.f763b);
                C0337e.m627a(C0333b.this.f744a, C0333b.this.f746a, (List<C0335c>) C0333b.this.f748a);
            }
        }
    }

    public C0333b(Context context, C0330c cVar) {
        this.f744a = context;
        this.f745a = cVar;
        this.f750b = new C0338f().mo4087a();
        for (int i = 0; i < 5; i++) {
            this.f749a[i] = (i * 5) + 5;
        }
        this.f751e.put("sdkId", "utils");
        this.f751e.put("sdkVersion", "1.1.4");
        try {
            m615a();
            m621b();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* renamed from: b */
    private void m621b() {
        this.f747a = null;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f748a) {
            for (C0335c cVar : this.f748a) {
                if (cVar.crashCount >= cVar.f754a) {
                    arrayList.add(cVar);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0335c cVar2 = (C0335c) it.next();
                if (cVar2.f761c < 5) {
                    if (cVar2.f755a < this.f746a.f742a - ((long) this.f749a[cVar2.f761c])) {
                        this.f747a = cVar2;
                        break;
                    }
                } else {
                    Log.i("UtilsSDK", "SDK " + cVar2.f757a + " has been closed");
                }
            }
            if (this.f747a == null) {
                Log.i("UtilsSDK", "NO SDK restore");
            } else {
                this.f747a.f761c++;
                Log.i("UtilsSDK", this.f747a.f757a + " will restore --- startSerialNumber:" + this.f747a.f755a + "   crashCount:" + this.f747a.crashCount);
            }
        }
    }

    /* renamed from: d */
    public void mo4084d(String str, String str2) {
    }

    /* renamed from: a */
    public static synchronized C0333b m612a(Context context, C0330c cVar) {
        C0333b bVar;
        synchronized (C0333b.class) {
            if (f743b == null) {
                f743b = new C0333b(context, cVar);
            }
            bVar = f743b;
        }
        return bVar;
    }

    /* renamed from: a */
    private void m615a() {
        if (C0337e.m629a(this.f744a, this.f746a, this.f748a)) {
            this.f746a.f742a++;
            return;
        }
        this.f746a.f742a = 1;
    }

    /* renamed from: a */
    public boolean m624a(C0335c cVar, SDKMessageCallback sDKMessageCallback) {
        if (!(cVar == null || sDKMessageCallback == null)) {
            try {
                if (!TextUtils.isEmpty(cVar.f760b)) {
                    if (!TextUtils.isEmpty(cVar.f757a)) {
                        C0335c a = mo4083a(cVar, sDKMessageCallback);
                        if (a == null) {
                            return false;
                        }
                        boolean a2 = m620a(a);
                        if (a.crashCount == a.f754a) {
                            m619a(a.f757a, a.f760b, a.crashCount, a.f754a);
                        }
                        a.crashCount++;
                        C0337e.m627a(this.f744a, this.f746a, this.f748a);
                        if (a2) {
                            m617a(a);
                            Log.i("UtilsSDK", "START:" + a.f757a + " --- limit:" + a.f754a + "  count:" + (a.crashCount - 1) + "  restore:" + a.f761c + "  startSerialNumber:" + a.f755a + "  registerSerialNumber:" + a.f759b);
                        } else {
                            sDKMessageCallback.crashDefendMessage(a.f754a, a.crashCount - 1);
                            Log.i("UtilsSDK", "STOP:" + a.f757a + " --- limit:" + a.f754a + "  count:" + (a.crashCount - 1) + "  restore:" + a.f761c + "  startSerialNumber:" + a.f755a + "  registerSerialNumber:" + a.f759b);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m622b(C0335c cVar) {
        if (cVar != null) {
            int i = cVar.f761c;
            if (i > 0) {
                m623b(cVar.f757a, cVar.f760b, i, 5);
            }
            cVar.crashCount = 0;
            cVar.f761c = 0;
        }
    }

    /* renamed from: b */
    private void m623b(String str, String str2, int i, int i2) {
        if (this.f745a != null) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.f751e);
            hashMap.put("crashSdkId", str);
            hashMap.put("crashSdkVer", str2);
            hashMap.put("recoverCount", String.valueOf(i));
            hashMap.put("recoverThreshold", String.valueOf(i2));
            this.f745a.sendCustomHit("utils_biz_recover", 0, hashMap);
        }
    }

    /* renamed from: a */
    private C0335c mo4083a(C0335c cVar, SDKMessageCallback sDKMessageCallback) {
        synchronized (this.f748a) {
            C0335c cVar2 = null;
            if (this.f748a != null && this.f748a.size() > 0) {
                Iterator<C0335c> it = this.f748a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0335c next = it.next();
                    if (next != null && next.f757a.equals(cVar.f757a)) {
                        if (!next.f760b.equals(cVar.f760b)) {
                            next.f760b = cVar.f760b;
                            next.f754a = cVar.f754a;
                            next.f758b = cVar.f758b;
                            next.crashCount = 0;
                            next.f761c = 0;
                        }
                        if (next.f762d) {
                            Log.i("UtilsSDK", "SDK " + cVar.f757a + " has been registered");
                            return null;
                        }
                        next.f762d = true;
                        next.f756a = sDKMessageCallback;
                        next.f759b = this.f746a.f742a;
                        cVar2 = next;
                    }
                }
            }
            if (cVar2 == null) {
                cVar2 = (C0335c) cVar.clone();
                cVar2.f762d = true;
                cVar2.f756a = sDKMessageCallback;
                cVar2.crashCount = 0;
                cVar2.f759b = this.f746a.f742a;
                this.f748a.add(cVar2);
            }
            return cVar2;
        }
    }

    /* renamed from: a */
    private boolean m620a(C0335c cVar) {
        if (cVar.crashCount < cVar.f754a) {
            cVar.f755a = cVar.f759b;
            return true;
        }
        C0335c cVar2 = this.f747a;
        if (cVar2 == null || !cVar2.f757a.equals(cVar.f757a)) {
            return false;
        }
        cVar.crashCount = cVar.f754a - 1;
        cVar.f755a = cVar.f759b;
        return true;
    }

    /* renamed from: a */
    private void m617a(C0335c cVar) {
        if (cVar != null) {
            C0336d dVar = new C0336d();
            dVar.f763b = cVar;
            dVar.f764d = cVar.f758b;
            m618a(dVar);
            SDKMessageCallback sDKMessageCallback = cVar.f756a;
            if (sDKMessageCallback != null) {
                sDKMessageCallback.crashDefendMessage(cVar.f754a, cVar.crashCount - 1);
            }
        }
    }

    /* renamed from: a */
    private void m618a(C0336d dVar) {
        if (dVar != null && dVar.f763b != null) {
            this.f750b.execute(new RunnableC0334a(dVar));
        }
    }

    /* renamed from: a */
    private void m619a(String str, String str2, int i, int i2) {
        if (this.f745a != null) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.f751e);
            hashMap.put("crashSdkId", str);
            hashMap.put("crashSdkVer", str2);
            hashMap.put("curCrashCount", String.valueOf(i));
            hashMap.put("crashThreshold", String.valueOf(i2));
            this.f745a.sendCustomHit("utils_biz_crash", 0, hashMap);
        }
    }
}
