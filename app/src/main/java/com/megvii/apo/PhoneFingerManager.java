package com.megvii.apo;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.megvii.apo.p092a.C1466a;
import com.megvii.apo.p093b.C1469a;
import com.megvii.apo.p094c.AbstractC1475c;
import com.megvii.apo.p094c.C1472a;
import com.megvii.apo.p094c.C1473b;
import com.megvii.apo.p094c.C1476d;
import com.megvii.apo.util.C1491a;
import com.megvii.apo.util.C1492b;
import com.megvii.apo.util.C1493c;
import com.megvii.apo.util.C1494d;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1496f;
import com.megvii.apo.util.C1498h;
import com.megvii.apo.util.C1499i;
import com.megvii.apo.util.C1500j;
import com.megvii.apo.util.C1501k;
import com.megvii.apo.util.DeltaEncode;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class PhoneFingerManager {
    public static final int ALL_FILE = 1;
    public static final int DYNAMIC_FILE = 2;
    public static final int PERIOD_FILE = 3;
    public static final long PER_HOUR_MILLISECOND = 3600000;
    public static final int REPORT_PERIOD = 3;
    public static volatile PhoneFingerManager mManager;
    public Handler handler;
    public Handler handler1;
    public volatile boolean isDeltaEnd = false;
    public volatile Map<String, Object> mCache;
    public Context mContext;
    public CopyOnWriteArrayList<C1472a> mDatas;
    public C1481h mDeviceParams;
    public C1484k mFingerParams;
    public C1469a mHttpUtil;
    public String mKey;
    public CopyOnWriteArrayList<AbstractC1486m> mList;
    public C1480g mOtherParams;
    public C1487n mPublicParams;
    public C1498h mReport;
    public C1499i mSaveFile;
    public C1490q mTopLevelParams;
    public C1482i params1;
    public C1465a params2;
    public C1488o params3;
    public C1477d params4;
    public C1485l params5;
    public AbstractC1486m params6;
    public AbstractC1486m params7;
    public AbstractC1486m params8;
    public AbstractC1486m params9;

    public class OooO00o implements Runnable {
        public final /* synthetic */ String o0ooOOo;
        public final /* synthetic */ String o0ooOoO;

        public OooO00o(String str, String str2) {
            this.o0ooOOo = str;
            this.o0ooOoO = str2;
        }

        public final void run() {
            try {
                String str = new String(C1491a.m2250a(Base64.decode(this.o0ooOOo, 0), this.o0ooOoO.getBytes()));
                C1495e.m2257a("config :".concat(str));
                PhoneFingerManager.this.m2165pf(str);
                PhoneFingerManager.this.initDeltaDatas();
                PhoneFingerManager.this.setDeltaEnd(false);
                C1495e.m2257a("config :ServerConfig.SWITCH_00 = " + C1500j.f2048c);
                int i = C1500j.f2048c;
                if (i == 1) {
                    PhoneFingerManager.this.m2166sf();
                } else if (i == 2) {
                    PhoneFingerManager.this.writeAllItems();
                }
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    public class OooO0O0 implements AbstractC1475c {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC1486m f15074OooO00o;

        public OooO0O0(AbstractC1486m mVar) {
            this.f15074OooO00o = mVar;
        }

        @Override // com.megvii.apo.p094c.AbstractC1475c
        /* renamed from: a */
        public final void mo16946a() {
            try {
                HashMap hashMap = new HashMap();
                if (!(this.f15074OooO00o instanceof C1490q)) {
                    PhoneFingerManager.this.mPublicParams.mo16948a(hashMap);
                }
                this.f15074OooO00o.mo16948a(hashMap);
                String jSONObject = new JSONObject(hashMap).toString();
                C1495e.m2257a(this.f15074OooO00o.getClass().toString() + "====" + jSONObject);
                C1499i iVar = PhoneFingerManager.this.mSaveFile;
                String jSONObject2 = new JSONObject(hashMap).toString();
                C1495e.m2257a("d : ".concat(String.valueOf(jSONObject2)));
                C1495e.m2257a("saveAllFile():  before en");
                String a = DeltaEncode.m2246a(jSONObject2);
                C1495e.m2257a("saveAllFile():  after en");
                if (a == null) {
                    C1495e.m2257a("saveAllFile(): encode == null");
                } else {
                    File file = iVar.f2025a;
                    try {
                        File file2 = new File(file, iVar.mo16966a());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(a.getBytes());
                        fileOutputStream.close();
                    } catch (IOException e) {
                        C1495e.m2258a(e);
                    }
                }
                PhoneFingerManager.this.reportLogsNew();
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public final void run() {
            try {
                PhoneFingerManager.this.getCheckSum();
                PhoneFingerManager.this.getConfigInfo2();
                if (C1500j.f2048c != 0) {
                    PhoneFingerManager.this.m2166sf();
                }
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    public PhoneFingerManager(Context context) {
        this.mContext = context;
        this.mHttpUtil = new C1469a(context);
        ifi();
        this.mSaveFile = new C1499i(this.mContext, this);
        this.mReport = new C1498h(this.mContext);
        HandlerThread handlerThread = new HandlerThread(CommonNetImpl.f10816PF);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("pf1");
        handlerThread2.start();
        this.handler1 = new Handler(handlerThread2.getLooper());
        this.mPublicParams = new C1487n(this.mContext);
        this.mFingerParams = new C1484k(this.mContext);
        this.mTopLevelParams = new C1490q(this.mContext);
        this.mDeviceParams = new C1481h(this.mContext);
        this.mOtherParams = new C1480g(this.mContext);
        this.params1 = new C1482i(this.mContext);
        this.params2 = new C1465a(this.mContext);
        this.params3 = new C1488o(this.mContext);
        this.params4 = new C1477d(this.mContext);
        this.params5 = new C1485l(this.mContext);
        this.params6 = new C1467b(this.mContext);
        this.params7 = new C1489p(this.mContext);
        this.params8 = new C1479f(this.mContext);
        this.params9 = new C1478e(this.mContext);
        CopyOnWriteArrayList<AbstractC1486m> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.mList = copyOnWriteArrayList;
        copyOnWriteArrayList.add(this.mTopLevelParams);
        this.mList.add(this.mDeviceParams);
        this.mList.add(this.mOtherParams);
        this.mList.add(this.params1);
        this.mList.add(this.params2);
        this.mList.add(this.params3);
        this.mList.add(this.params4);
        this.mList.add(this.params5);
        this.mList.add(this.params6);
        this.mList.add(this.params7);
        this.mList.add(this.params8);
        this.mList.add(this.params9);
        initDeltaDatas();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void getCheckSum() {
        try {
            HashMap hashMap = new HashMap();
            String str = (String) C1501k.m2275b(this.mContext, "p_z_d", "");
            if (TextUtils.isEmpty(str)) {
                str = C1492b.m2251a();
                C1501k.m2274a(this.mContext, "p_z_d", str);
            }
            hashMap.put("z", str);
            String a = this.mHttpUtil.mo16950a("http://10.104.4.50:8089/v1/xid_checksum", new JSONObject(hashMap).toString(), null, null);
            if (a != null) {
                try {
                    String string = new JSONObject(a).getString(C1493c.m2253a("R+HJ5ln39sXPQWCvNQcc2A=="));
                    C1501k.m2274a(this.mContext, "x_c_s", string);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(this.mContext.getExternalFilesDir("xid"), "xid"));
                        fileOutputStream.write(string.getBytes());
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        C1495e.m2258a(th);
                    }
                    try {
                        Settings.System.putString(this.mContext.getContentResolver(), "x_c_s", string);
                    } catch (Throwable th2) {
                        C1495e.m2258a(th2);
                    }
                } catch (Throwable th3) {
                    C1495e.m2258a(th3);
                }
            }
        } catch (Throwable th4) {
            C1495e.m2258a(th4);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void getConfigInfo2() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(C1493c.m2253a("CyDQwnhz5hJhpiFQYplpLA=="), this.mContext.getPackageName());
            hashMap.put(C1493c.m2253a("eTvIhLA9xKC3hdE6/Fhj7w=="), Build.BRAND);
            hashMap.put(C1493c.m2253a("3FeMK1fC6PivLlSzaUaWhg=="), Integer.valueOf(Build.VERSION.SDK_INT));
            JSONObject jSONObject = new JSONObject(hashMap);
            C1495e.m2257a("getConfigInfo2():  before en   111");
            String a = DeltaEncode.m2246a(jSONObject.toString());
            C1495e.m2257a("getConfigInfo2():  after en    111");
            String a2 = C1491a.m2249a();
            HashMap hashMap2 = new HashMap();
            C1495e.m2257a("getConfigInfo2():  before en   222");
            hashMap2.put("7833", DeltaEncode.m2246a(a2));
            C1495e.m2257a("getConfigInfo2():  after en    222");
            String a3 = this.mHttpUtil.mo16950a("http://10.104.4.50:8089/v1_1/get_configuration", a, hashMap2, a2);
            if (a3 != null) {
                C1495e.m2257a("ServerConfig.CONFIG_REPORT_1 == http://10.104.4.50:8089/v1_1/get_configuration");
                C1495e.m2257a("responseString == ".concat(String.valueOf(a3)));
                m2165pf(a3);
            }
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }

    private String getCurTime() {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.CHINA).format(new Date(System.currentTimeMillis()));
    }

    public static PhoneFingerManager getInstance(Context context) {
        PhoneFingerManager phoneFingerManager;
        if (mManager != null) {
            return mManager;
        }
        synchronized (PhoneFingerManager.class) {
            if (mManager == null) {
                mManager = new PhoneFingerManager(context);
            }
            phoneFingerManager = mManager;
        }
        return phoneFingerManager;
    }

    private void ifi() {
        try {
            File file = new File(this.mContext.getFilesDir(), "a");
            File file2 = new File(this.mContext.getFilesDir(), "d");
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!file2.exists()) {
                file2.mkdirs();
            }
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void initDeltaDatas() {
        this.mCache = null;
        this.mCache = new HashMap();
        CopyOnWriteArrayList<C1472a> copyOnWriteArrayList = this.mDatas;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            this.mDatas.clear();
        }
        this.mDatas = new CopyOnWriteArrayList<>();
        for (int i = 0; i < this.mList.size(); i++) {
            this.mDatas.add(new C1472a());
        }
    }

    private boolean isNetMatch(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                try {
                    if (C1496f.m2260b(this.mContext)) {
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    C1495e.m2258a(th);
                    return false;
                }
            } else if (C1496f.m2261c(this.mContext)) {
                return true;
            } else {
                return false;
            }
        } else if (C1496f.m2260b(this.mContext) || C1496f.m2261c(this.mContext)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: pf */
    private void m2165pf(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(C1493c.m2253a("dmea3YF4ZgH1FtwC2bX2Tw=="));
            JSONObject jSONObject2 = jSONObject.getJSONObject("c000");
            C1500j.f2048c = jSONObject2.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2049d = jSONObject2.getInt("93");
            if (jSONObject2.has("46")) {
                C1500j.f2050e = jSONObject2.getInt("46");
            }
            if (jSONObject2.has("47")) {
                C1500j.f2051f = jSONObject2.getInt("47");
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("c001");
            C1500j.f2052g = jSONObject3.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2053h = jSONObject3.getInt("93");
            C1500j.f2054i = jSONObject3.getInt("45");
            JSONObject jSONObject4 = jSONObject.getJSONObject("c002");
            C1500j.f2055j = jSONObject4.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2056k = jSONObject4.getInt("93");
            C1500j.f2057l = jSONObject4.getInt("45");
            JSONObject jSONObject5 = jSONObject.getJSONObject("c003");
            C1500j.f2058m = jSONObject5.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2059n = jSONObject5.getInt("93");
            C1500j.f2060o = jSONObject5.getInt("45");
            JSONObject jSONObject6 = jSONObject.getJSONObject("c004");
            C1500j.f2061p = jSONObject6.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2062q = jSONObject6.getInt("93");
            C1500j.f2063r = jSONObject6.getInt("45");
            JSONObject jSONObject7 = jSONObject.getJSONObject("c005");
            C1500j.f2064s = jSONObject7.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2065t = jSONObject7.getInt("93");
            C1500j.f2066u = jSONObject7.getInt("45");
            JSONObject jSONObject8 = jSONObject.getJSONObject("c006");
            C1500j.f2067v = jSONObject8.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2068w = jSONObject8.getInt("93");
            C1500j.f2069x = jSONObject8.getInt("45");
            JSONObject jSONObject9 = jSONObject.getJSONObject("c007");
            C1500j.f2070y = jSONObject9.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2071z = jSONObject9.getInt("93");
            C1500j.f2030A = jSONObject9.getInt("45");
            JSONObject jSONObject10 = jSONObject.getJSONObject("c008");
            C1500j.f2031B = jSONObject10.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2032C = jSONObject10.getInt("93");
            C1500j.f2033D = jSONObject10.getInt("45");
            JSONObject jSONObject11 = jSONObject.getJSONObject("c009");
            C1500j.f2034E = jSONObject11.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2035F = jSONObject11.getInt("93");
            C1500j.f2036G = jSONObject11.getInt("45");
            JSONObject jSONObject12 = jSONObject.getJSONObject("c010");
            C1500j.f2037H = jSONObject12.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2038I = jSONObject12.getInt("93");
            C1500j.f2039J = jSONObject12.getInt("45");
            JSONObject jSONObject13 = jSONObject.getJSONObject("c011");
            C1500j.f2040K = jSONObject13.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2041L = jSONObject13.getInt("93");
            C1500j.f2042M = jSONObject13.getInt("45");
            JSONObject jSONObject14 = jSONObject.getJSONObject("c012");
            C1500j.f2043N = jSONObject14.getInt(AgooConstants.REPORT_MESSAGE_NULL);
            C1500j.f2044O = jSONObject14.getInt("93");
            C1500j.f2045P = jSONObject14.getInt("45");
            C1501k.m2274a(this.mContext, "i_s", Integer.valueOf(C1500j.f2050e));
            this.mTopLevelParams.mo16960a(new C1466a(C1500j.f2052g, (long) C1500j.f2053h, C1500j.f2054i));
            this.mDeviceParams.mo16960a(new C1466a(C1500j.f2055j, (long) C1500j.f2056k, C1500j.f2057l));
            this.mOtherParams.mo16960a(new C1466a(C1500j.f2058m, (long) C1500j.f2059n, C1500j.f2060o));
            this.params1.mo16960a(new C1466a(C1500j.f2061p, (long) C1500j.f2062q, C1500j.f2063r));
            this.params2.mo16960a(new C1466a(C1500j.f2064s, (long) C1500j.f2065t, C1500j.f2066u));
            this.params3.mo16960a(new C1466a(C1500j.f2067v, (long) C1500j.f2068w, C1500j.f2069x));
            this.params4.mo16960a(new C1466a(C1500j.f2070y, (long) C1500j.f2071z, C1500j.f2030A));
            this.params5.mo16960a(new C1466a(C1500j.f2031B, (long) C1500j.f2032C, C1500j.f2033D));
            this.params6.mo16960a(new C1466a(C1500j.f2034E, (long) C1500j.f2035F, C1500j.f2036G));
            this.params7.mo16960a(new C1466a(C1500j.f2037H, (long) C1500j.f2038I, C1500j.f2039J));
            this.params8.mo16960a(new C1466a(C1500j.f2040K, (long) C1500j.f2041L, C1500j.f2042M));
            this.params9.mo16960a(new C1466a(C1500j.f2043N, (long) C1500j.f2044O, C1500j.f2045P));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void reportLogsNew() {
        C1495e.m2257a("reportLogsNew: ");
        this.mReport.mo16965a(3);
    }

    private void reportLogsOld() {
        C1495e.m2257a("reportLogsOld: ");
        this.mReport.mo16965a(1);
        this.mReport.mo16965a(2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: sf */
    private void m2166sf() {
        try {
            reportLogsOld();
            C1473b bVar = C1473b.C1474a.f1979a;
            long j = 0;
            if (((long) C1500j.f2049d) != 0) {
                j = 1;
            }
            bVar.f1975d = j;
            Iterator<AbstractC1486m> it = this.mList.iterator();
            while (it.hasNext()) {
                AbstractC1486m next = it.next();
                C1466a a = next.mo16959a();
                if (!(a == null || a.f1934a == 0 || !isNetMatch(a.f1936c))) {
                    bVar.mo16955a(new C1476d(next.mo16959a().f1935b, new OooO0O0(next)));
                }
            }
            bVar.f1976e.post(bVar.f1977f);
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void writeAllItems() {
        try {
            Iterator<AbstractC1486m> it = this.mList.iterator();
            while (it.hasNext()) {
                writeItemToCache(it.next());
            }
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }

    private void writeItemToCache(AbstractC1486m mVar) {
        if (!isDeltaEnd()) {
            try {
                if (isNetMatch(mVar.mo16959a().f1936c) && mVar.mo16959a().f1934a != 0) {
                    C1472a aVar = this.mDatas.get(this.mList.indexOf(mVar));
                    HashMap hashMap = new HashMap();
                    mVar.mo16948a(hashMap);
                    aVar.f1970a = hashMap;
                    aVar.f1971b = true;
                    C1495e.m2257a(mVar.getClass().getName() + " 数据采集完成  :" + getCurTime());
                }
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    /* renamed from: cf */
    public synchronized void mo16936cf(String str, String str2) {
        this.handler.post(new OooO00o(str2, str));
    }

    public void getApplistlevelTest() {
        HashMap hashMap = new HashMap();
        this.params6.mo16948a(hashMap);
        C1495e.m2257a(new JSONObject(hashMap).toString());
    }

    /* renamed from: ii */
    public String mo16938ii() {
        HashMap hashMap = new HashMap();
        hashMap.put(C1493c.m2253a("CyDQwnhz5hJhpiFQYplpLA=="), this.mContext.getPackageName());
        hashMap.put(C1493c.m2253a("eTvIhLA9xKC3hdE6/Fhj7w=="), Build.BRAND);
        hashMap.put(C1493c.m2253a("3FeMK1fC6PivLlSzaUaWhg=="), Integer.valueOf(Build.VERSION.SDK_INT));
        JSONObject jSONObject = new JSONObject(hashMap);
        if (TextUtils.isEmpty(C1494d.m2256b())) {
            C1494d.m2254a(C1492b.m2251a());
        }
        C1495e.m2257a("ii():  before en");
        String a = DeltaEncode.m2246a(jSONObject.toString());
        C1495e.m2257a("ii():  after en");
        return a;
    }

    public void init() {
        this.handler1.post(new OooO0OO());
    }

    public void init301() {
        try {
            Object b = C1501k.m2275b(this.mContext, "i_s", 0);
            if (b != null && ((Integer) b).intValue() != 0) {
                init();
            }
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }

    public boolean isDeltaEnd() {
        return this.isDeltaEnd;
    }

    /* renamed from: kk */
    public String mo16942kk() {
        String a = C1491a.m2249a();
        this.mKey = a;
        return a;
    }

    public void setDeltaEnd(boolean z) {
        this.isDeltaEnd = z;
    }

    /* renamed from: xx */
    public String mo16944xx() {
        String str;
        try {
            Iterator<C1472a> it = this.mDatas.iterator();
            while (it.hasNext()) {
                C1472a next = it.next();
                if (next.f1971b) {
                    this.mCache.putAll(next.f1970a);
                }
            }
            if (this.mCache != null) {
                if (!this.mCache.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(this.mCache);
                    C1495e.m2257a("数据已拿走     :" + getCurTime());
                    C1495e.m2257a("数据  ：" + jSONObject.toString());
                    if (C1500j.f2048c == 2) {
                        str = jSONObject.toString();
                    } else {
                        str = "";
                    }
                    setDeltaEnd(true);
                    return str;
                }
            }
            return "";
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return "";
        }
    }
}
