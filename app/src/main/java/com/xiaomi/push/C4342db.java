package com.xiaomi.push;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C8412oOoo0OoO;
import com.p118pd.sdk.C9040ooOoOO;
import com.umeng.commonsdk.statistics.idtracking.C3692t;
import com.umeng.socialize.handler.UMSSOHandler;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C4591a;
import com.xiaomi.push.service.module.PushChannelRegion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.db */
public class C4342db {

    /* renamed from: a */
    public static Context f11561a;

    /* renamed from: a */
    public static AbstractC4343a f11562a;

    /* renamed from: a */
    public static C4342db f11563a;

    /* renamed from: a */
    public static boolean f11564a = false;

    /* renamed from: b */
    public static Map<String, C4337cx> f11565b = new HashMap();

    /* renamed from: c */
    public static String f11566c;

    /* renamed from: d */
    public static String f11567d;

    /* renamed from: a */
    public long f11568a;

    /* renamed from: a */
    public AbstractC4341da f11569a;

    /* renamed from: a */
    public AbstractC4344b f11570a;

    /* renamed from: a */
    public String f11571a;

    /* renamed from: a */
    public Map<String, C4338cy> f11572a;

    /* renamed from: b */
    public final long f11573b;

    /* renamed from: b */
    public String f11574b;

    /* renamed from: c */
    public long f11575c;

    /* renamed from: com.xiaomi.push.db$a */
    public interface AbstractC4343a {
        /* renamed from: a */
        C4342db mo41651a(Context context, AbstractC4341da daVar, AbstractC4344b bVar, String str);
    }

    /* renamed from: com.xiaomi.push.db$b */
    public interface AbstractC4344b {
        /* renamed from: a */
        String mo41652a(String str);
    }

    public C4342db(Context context, AbstractC4341da daVar, AbstractC4344b bVar, String str) {
        this(context, daVar, bVar, str, null, null);
    }

    public C4342db(Context context, AbstractC4341da daVar, AbstractC4344b bVar, String str, String str2, String str3) {
        this.f11572a = new HashMap();
        this.f11571a = "0";
        this.f11568a = 0;
        this.f11573b = 15;
        this.f11575c = 0;
        this.f11574b = "isp_prov_city_country_ip";
        this.f11570a = bVar;
        this.f11569a = daVar == null ? new C4345dc(this) : daVar;
        this.f11571a = str;
        f11566c = str2 == null ? context.getPackageName() : str2;
        f11567d = str3 == null ? m12035f() : str3;
    }

    /* renamed from: a */
    public static synchronized C4342db mo41642a() {
        C4342db dbVar;
        synchronized (C4342db.class) {
            if (f11563a != null) {
                dbVar = f11563a;
            } else {
                throw new IllegalStateException("the host manager is not initialized yet.");
            }
        }
        return dbVar;
    }

    /* renamed from: a */
    public static String m12029a() {
        NetworkInfo activeNetworkInfo;
        Context context = f11561a;
        if (context == null) {
            return "unknown";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                WifiManager wifiManager = (WifiManager) f11561a.getSystemService("wifi");
                if (!(wifiManager == null || wifiManager.getConnectionInfo() == null)) {
                    return "WIFI-" + wifiManager.getConnectionInfo().getSSID();
                }
                return "unknown";
            }
            return activeNetworkInfo.getTypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getSubtypeName();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String mo41639a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                byte b = bytes[i];
                int i2 = b & 240;
                if (i2 != 240) {
                    bytes[i] = (byte) (((b & 15) ^ ((byte) (((b >> 4) + length) & 15))) | i2);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: a */
    private ArrayList<C4337cx> m12031a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        m12053d();
        synchronized (this.f11572a) {
            m12043a();
            for (String str : this.f11572a.keySet()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        boolean isEmpty = f11565b.isEmpty();
        synchronized (f11565b) {
            for (Object obj : f11565b.values().toArray()) {
                C4337cx cxVar = (C4337cx) obj;
                if (!cxVar.mo41628b()) {
                    f11565b.remove(cxVar.f11548b);
                    isEmpty = true;
                }
            }
        }
        if (!arrayList.contains(mo41645b())) {
            arrayList.add(mo41645b());
        }
        ArrayList<C4337cx> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(null);
        }
        try {
            String str2 = C4274az.m11737d(f11561a) ? "wifi" : C9040ooOoOO.OooO0Oo;
            String a = mo41641a(arrayList, str2, this.f11571a, isEmpty);
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject3 = new JSONObject(a);
                AbstractC4163b.m11304b(a);
                if ("OK".equalsIgnoreCase(jSONObject3.getString(ExifInterface.o000oOoo))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("R");
                    String string = jSONObject4.getString(UMSSOHandler.PROVINCE);
                    String string2 = jSONObject4.getString(UMSSOHandler.CITY);
                    String string3 = jSONObject4.getString("isp");
                    String string4 = jSONObject4.getString("ip");
                    String string5 = jSONObject4.getString("country");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str2);
                    AbstractC4163b.m11305c("get bucket: ip = " + string4 + " net = " + string3 + " hosts = " + jSONObject5.toString());
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        String str3 = arrayList.get(i2);
                        JSONArray optJSONArray = jSONObject5.optJSONArray(str3);
                        if (optJSONArray == null) {
                            AbstractC4163b.m11301a("no bucket found for " + str3);
                            jSONObject = jSONObject5;
                        } else {
                            C4337cx cxVar2 = new C4337cx(str3);
                            int i3 = 0;
                            while (i3 < optJSONArray.length()) {
                                String string6 = optJSONArray.getString(i3);
                                if (!TextUtils.isEmpty(string6)) {
                                    jSONObject2 = jSONObject5;
                                    cxVar2.mo41618a(new C4350dg(string6, optJSONArray.length() - i3));
                                } else {
                                    jSONObject2 = jSONObject5;
                                }
                                i3++;
                                jSONObject5 = jSONObject2;
                            }
                            jSONObject = jSONObject5;
                            arrayList2.set(i2, cxVar2);
                            cxVar2.f11553g = string5;
                            cxVar2.f11549c = string;
                            cxVar2.f11551e = string3;
                            cxVar2.f11552f = string4;
                            cxVar2.f11550d = string2;
                            if (jSONObject4.has("stat-percent")) {
                                cxVar2.mo41616a(jSONObject4.getDouble("stat-percent"));
                            }
                            if (jSONObject4.has("stat-domain")) {
                                cxVar2.mo41625b(jSONObject4.getString("stat-domain"));
                            }
                            if (jSONObject4.has("ttl")) {
                                cxVar2.mo41617a(((long) jSONObject4.getInt("ttl")) * 1000);
                            }
                            m12041a(cxVar2.mo41613a());
                        }
                        i2++;
                        jSONObject5 = jSONObject;
                    }
                    JSONObject optJSONObject = jSONObject4.optJSONObject("reserved");
                    if (optJSONObject != null) {
                        long j = 604800000;
                        if (jSONObject4.has("reserved-ttl")) {
                            j = ((long) jSONObject4.getInt("reserved-ttl")) * 1000;
                        }
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                AbstractC4163b.m11301a("no bucket found for " + next);
                            } else {
                                C4337cx cxVar3 = new C4337cx(next);
                                cxVar3.mo41617a(j);
                                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                                    String string7 = optJSONArray2.getString(i4);
                                    if (!TextUtils.isEmpty(string7)) {
                                        cxVar3.mo41618a(new C4350dg(string7, optJSONArray2.length() - i4));
                                    }
                                }
                                synchronized (f11565b) {
                                    if (this.f11569a.mo41638a(next)) {
                                        f11565b.put(next, cxVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            AbstractC4163b.m11301a("failed to get bucket " + e.getMessage());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C4337cx cxVar4 = arrayList2.get(i5);
            if (cxVar4 != null) {
                mo41643a(arrayList.get(i5), cxVar4);
            }
        }
        m12050c();
        return arrayList2;
    }

    /* renamed from: a */
    public static synchronized void m12032a(Context context, AbstractC4341da daVar, AbstractC4344b bVar, String str, String str2, String str3) {
        synchronized (C4342db.class) {
            Context applicationContext = context.getApplicationContext();
            f11561a = applicationContext;
            if (applicationContext == null) {
                f11561a = context;
            }
            if (f11563a == null) {
                if (f11562a == null) {
                    f11563a = new C4342db(context, daVar, bVar, str, str2, str3);
                } else {
                    f11563a = f11562a.mo41651a(context, daVar, bVar, str);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m12033a(AbstractC4343a aVar) {
        synchronized (C4342db.class) {
            f11562a = aVar;
            f11563a = null;
        }
    }

    /* renamed from: a */
    public static void m12034a(String str, String str2) {
        C4337cx cxVar = f11565b.get(str);
        synchronized (f11565b) {
            if (cxVar == null) {
                C4337cx cxVar2 = new C4337cx(str);
                cxVar2.mo41617a(604800000L);
                cxVar2.m11995a(str2);
                f11565b.put(str, cxVar2);
            } else {
                cxVar.m11995a(str2);
            }
        }
    }

    /* renamed from: f */
    private String m12035f() {
        try {
            PackageInfo packageInfo = f11561a.getPackageManager().getPackageInfo(f11561a.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    /* renamed from: a */
    public C4337cx m12036a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return mo41640a(new URL(str).getHost(), true);
        }
        throw new IllegalArgumentException("the url is empty");
    }

    /* renamed from: a */
    public C4337cx mo41640a(String str, boolean z) {
        C4337cx d;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        } else if (!this.f11569a.mo41638a(str)) {
            return null;
        } else {
            C4337cx c = mo41646c(str);
            return (c == null || !c.mo41628b()) ? (!z || !C4274az.m11735b(f11561a) || (d = mo41648d(str)) == null) ? new C4346dd(this, str, c) : d : c;
        }
    }

    /* renamed from: a */
    public String mo41641a(ArrayList<String> arrayList, String str, String str2, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<AbstractC4273ay> arrayList3 = new ArrayList();
        arrayList3.add(new C4271aw("type", str));
        if (str.equals(C9040ooOoOO.OooO0Oo)) {
            arrayList3.add(new C4271aw("conpt", mo41639a(C4274az.m11726a(f11561a))));
        }
        if (z) {
            arrayList3.add(new C4271aw("reserved", "1"));
        }
        arrayList3.add(new C4271aw(C3692t.f9678a, str2));
        arrayList3.add(new C4271aw(C8412oOoo0OoO.OooO0OO, C4285bf.m11802a(arrayList, Constants.ACCEPT_TIME_SEPARATOR_SP)));
        arrayList3.add(new C4271aw("countrycode", C4591a.m13848a(f11561a).mo42649b()));
        C4337cx c = mo41646c(mo41645b());
        String format = String.format(Locale.US, "http://%1$s/gslb/?ver=4.0", mo41645b());
        if (c == null) {
            arrayList2.add(format);
            synchronized (f11565b) {
                C4337cx cxVar = f11565b.get("resolver.msg.xiaomi.net");
                if (cxVar != null) {
                    Iterator<String> it = cxVar.mo41615a(true).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "http://%1$s/gslb/?ver=4.0", it.next()));
                    }
                }
            }
        } else {
            arrayList2 = c.mo41614a(format);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e = null;
        while (it2.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it2.next()).buildUpon();
            for (AbstractC4273ay ayVar : arrayList3) {
                buildUpon.appendQueryParameter(ayVar.mo41499a(), ayVar.mo41500b());
            }
            try {
                return this.f11570a == null ? C4274az.m11727a(f11561a, new URL(buildUpon.toString())) : this.f11570a.mo41652a(buildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        AbstractC4163b.m11301a("network exception: " + e.getMessage());
        throw e;
    }

    /* renamed from: a */
    public JSONObject m12039a() {
        JSONObject jSONObject;
        synchronized (this.f11572a) {
            jSONObject = new JSONObject();
            jSONObject.put("ver", 2);
            JSONArray jSONArray = new JSONArray();
            for (C4338cy cyVar : this.f11572a.values()) {
                jSONArray.put(cyVar.m12012a());
            }
            jSONObject.put("data", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (C4337cx cxVar : f11565b.values()) {
                jSONArray2.put(cxVar.m11991a());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void m12040a() {
        synchronized (this.f11572a) {
            this.f11572a.clear();
        }
    }

    /* renamed from: a */
    public void m12041a(String str) {
        this.f11574b = str;
    }

    /* renamed from: a */
    public void mo41643a(String str, C4337cx cxVar) {
        if (TextUtils.isEmpty(str) || cxVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + cxVar);
        } else if (this.f11569a.mo41638a(str)) {
            synchronized (this.f11572a) {
                m12043a();
                if (this.f11572a.containsKey(str)) {
                    this.f11572a.get(str).mo41633a(cxVar);
                } else {
                    C4338cy cyVar = new C4338cy(str);
                    cyVar.mo41633a(cxVar);
                    this.f11572a.put(str, cyVar);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m12043a() {
        synchronized (this.f11572a) {
            if (f11564a) {
                return true;
            }
            f11564a = true;
            this.f11572a.clear();
            try {
                String d = mo41649d();
                if (!TextUtils.isEmpty(d)) {
                    m12047b(d);
                    AbstractC4163b.m11304b("loading the new hosts succeed");
                    return true;
                }
            } catch (Throwable th) {
                AbstractC4163b.m11301a("load bucket failure: " + th.getMessage());
            }
            return false;
        }
    }

    /* renamed from: b */
    public C4337cx mo41644b(String str) {
        return mo41640a(str, true);
    }

    /* renamed from: b */
    public String mo41645b() {
        String a = C4591a.m13848a(f11561a).mo42647a();
        return (TextUtils.isEmpty(a) || PushChannelRegion.China.name().equals(a)) ? "resolver.msg.xiaomi.net" : "resolver.msg.global.xiaomi.net";
    }

    /* renamed from: b */
    public void m12046b() {
        ArrayList<String> arrayList;
        synchronized (this.f11572a) {
            m12043a();
            arrayList = new ArrayList<>(this.f11572a.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C4338cy cyVar = this.f11572a.get(arrayList.get(size));
                if (!(cyVar == null || cyVar.mo41631a() == null)) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<C4337cx> a = m12031a(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (a.get(i) != null) {
                mo41643a(arrayList.get(i), a.get(i));
            }
        }
    }

    /* renamed from: b */
    public void m12047b(String str) {
        synchronized (this.f11572a) {
            this.f11572a.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("ver") == 2) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C4338cy a = new C4338cy().mo41632a(optJSONArray.getJSONObject(i));
                    this.f11572a.put(a.m12010a(), a);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("reserved");
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    C4337cx a2 = new C4337cx("").mo41612a(optJSONArray2.getJSONObject(i2));
                    f11565b.put(a2.f11548b, a2);
                }
            } else {
                throw new JSONException("Bad version");
            }
        }
    }

    /* renamed from: c */
    public C4337cx mo41646c(String str) {
        C4338cy cyVar;
        C4337cx a;
        synchronized (this.f11572a) {
            m12043a();
            cyVar = this.f11572a.get(str);
        }
        if (cyVar == null || (a = cyVar.mo41631a()) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: c */
    public String mo41647c() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f11572a) {
            for (Map.Entry<String, C4338cy> entry : this.f11572a.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":\n");
                sb.append(entry.getValue().toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public void m12050c() {
        synchronized (this.f11572a) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(f11561a.openFileOutput(mo41650e(), 0)));
                String jSONObject = m12039a().toString();
                if (!TextUtils.isEmpty(jSONObject)) {
                    bufferedWriter.write(jSONObject);
                }
                bufferedWriter.close();
            } catch (Exception e) {
                AbstractC4163b.m11301a("persist bucket failure: " + e.getMessage());
            }
        }
    }

    /* renamed from: d */
    public C4337cx mo41648d(String str) {
        if (System.currentTimeMillis() - this.f11575c <= this.f11568a * 60 * 1000) {
            return null;
        }
        this.f11575c = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        C4337cx cxVar = m12031a(arrayList).get(0);
        if (cxVar != null) {
            this.f11568a = 0;
            return cxVar;
        }
        long j = this.f11568a;
        if (j >= 15) {
            return null;
        }
        this.f11568a = j + 1;
        return null;
    }

    /* renamed from: d */
    public String mo41649d() {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            File file = new File(f11561a.getFilesDir(), mo41650e());
            if (file.isFile()) {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            String sb2 = sb.toString();
                            C4693y.m14236a(bufferedReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        AbstractC4163b.m11301a("load host exception " + th.getMessage());
                        return null;
                    } finally {
                        C4693y.m14236a(bufferedReader);
                    }
                }
            } else {
                C4693y.m14236a((Closeable) null);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            AbstractC4163b.m11301a("load host exception " + th.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public void m12053d() {
        synchronized (this.f11572a) {
            for (C4338cy cyVar : this.f11572a.values()) {
                cyVar.mo41634a(true);
            }
            while (true) {
                for (boolean z = false; !z; z = true) {
                    for (String str : this.f11572a.keySet()) {
                        if (this.f11572a.get(str).m12011a().isEmpty()) {
                            this.f11572a.remove(str);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public String mo41650e() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) f11561a.getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return "com.xiaomi";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == Process.myPid()) {
                return runningAppProcessInfo.processName;
            }
        }
        return "com.xiaomi";
    }
}
