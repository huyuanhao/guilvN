package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.support.p000v4.media.session.PlaybackStateCompat;
import com.taobao.agoo.p265a.p266a.AbstractC3199b;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.info.C3270b;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.p269mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.tencent.bugly.proguard.al */
public class RunnableC3318al implements Runnable {

    /* renamed from: a */
    public int f8026a;

    /* renamed from: b */
    public int f8027b;

    /* renamed from: c */
    public int f8028c;

    /* renamed from: d */
    public long f8029d;

    /* renamed from: e */
    public long f8030e;

    /* renamed from: f */
    public boolean f8031f;

    /* renamed from: g */
    public final Context f8032g;

    /* renamed from: h */
    public final int f8033h;

    /* renamed from: i */
    public final byte[] f8034i;

    /* renamed from: j */
    public final C3269a f8035j;

    /* renamed from: k */
    public final C3272a f8036k;

    /* renamed from: l */
    public final C3312ai f8037l;

    /* renamed from: m */
    public final C3314ak f8038m;

    /* renamed from: n */
    public final int f8039n;

    /* renamed from: o */
    public final AbstractC3313aj f8040o;

    /* renamed from: p */
    public final AbstractC3313aj f8041p;

    /* renamed from: q */
    public String f8042q;

    /* renamed from: r */
    public final String f8043r;

    /* renamed from: s */
    public final Map<String, String> f8044s;

    /* renamed from: t */
    public boolean f8045t;

    public RunnableC3318al(Context context, int i, int i2, byte[] bArr, String str, String str2, AbstractC3313aj ajVar, boolean z, boolean z2) {
        this(context, i, i2, bArr, str, str2, ajVar, z, 2, 30000, z2, null);
    }

    /* renamed from: a */
    public void mo38391a() {
        this.f8038m.mo38377a(this.f8039n, System.currentTimeMillis());
        AbstractC3313aj ajVar = this.f8040o;
        if (ajVar != null) {
            ajVar.mo38038a(this.f8033h);
        }
        AbstractC3313aj ajVar2 = this.f8041p;
        if (ajVar2 != null) {
            ajVar2.mo38038a(this.f8033h);
        }
    }

    public void run() {
        byte[] a;
        Map<String, String> map;
        long j;
        int i = 0;
        try {
            this.f8028c = 0;
            this.f8029d = 0;
            this.f8030e = 0;
            byte[] bArr = this.f8034i;
            if (C3270b.m8040f(this.f8032g) == null) {
                mo38394a(null, false, 0, "network is not available", 0);
                return;
            }
            if (bArr != null) {
                if (bArr.length != 0) {
                    long a2 = this.f8038m.mo38373a(this.f8045t);
                    if (((long) bArr.length) + a2 >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                        C3321an.m8357e("[Upload] Upload too much data, try next time: %d/%d", Long.valueOf(a2), Long.valueOf((long) PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE));
                        mo38394a(null, false, 0, "over net consume: " + 2048L + "K", 0);
                        return;
                    }
                    C3321an.m8355c("[Upload] Run upload task with cmd: %d", Integer.valueOf(this.f8033h));
                    if (!(this.f8032g == null || this.f8035j == null || this.f8036k == null)) {
                        if (this.f8037l != null) {
                            StrategyBean c = this.f8036k.mo38194c();
                            if (c == null) {
                                mo38394a(null, false, 0, "illegal local strategy", 0);
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("prodId", this.f8035j.mo38161f());
                            hashMap.put("bundleId", this.f8035j.f7680d);
                            hashMap.put("appVer", this.f8035j.f7692p);
                            if (this.f8044s != null) {
                                hashMap.putAll(this.f8044s);
                            }
                            if (this.f8031f) {
                                hashMap.put(AbstractC3199b.JSON_CMD, Integer.toString(this.f8033h));
                                hashMap.put(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY, Byte.toString((byte) 1));
                                this.f8035j.getClass();
                                hashMap.put("sdkVer", "2.6.5");
                                hashMap.put("strategylastUpdateTime", Long.toString(c.f7723p));
                                if (!this.f8038m.mo38382a(hashMap)) {
                                    mo38394a(null, false, 0, "failed to add security info to HTTP headers", 0);
                                    return;
                                }
                                byte[] a3 = C3325ap.m8409a(bArr, 2);
                                if (a3 == null) {
                                    mo38394a(null, false, 0, "failed to zip request body", 0);
                                    return;
                                }
                                bArr = this.f8038m.mo38383a(a3);
                                if (bArr == null) {
                                    mo38394a(null, false, 0, "failed to encrypt request body", 0);
                                    return;
                                }
                            }
                            mo38391a();
                            String str = this.f8042q;
                            int i2 = 0;
                            int i3 = -1;
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                if (i4 < this.f8026a) {
                                    if (i5 > 1) {
                                        C3321an.m8356d("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i5));
                                        C3325ap.m8417b((long) this.f8027b);
                                        if (i5 == this.f8026a) {
                                            C3321an.m8356d("[Upload] Use the back-up url at the last time: %s", this.f8043r);
                                            str = this.f8043r;
                                        }
                                    }
                                    C3321an.m8355c("[Upload] Send %d bytes", Integer.valueOf(bArr.length));
                                    if (this.f8031f) {
                                        str = m8332a(str);
                                    }
                                    C3321an.m8355c("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", str, Integer.valueOf(this.f8033h), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                                    a = this.f8037l.mo38370a(str, bArr, this, hashMap);
                                    if (a == null) {
                                        mo38392a(1, "Failed to upload for no response!");
                                    } else {
                                        map = this.f8037l.f7994b;
                                        if (!this.f8031f) {
                                            break;
                                        } else if (!m8333a(map)) {
                                            C3321an.m8355c("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                                            mo38392a(1, "[Upload] Failed to upload for no status header.");
                                            if (map != null) {
                                                for (Map.Entry<String, String> entry : map.entrySet()) {
                                                    C3321an.m8355c(String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
                                                }
                                            }
                                            C3321an.m8355c("[Upload] Failed to upload for no status header.", new Object[0]);
                                        } else {
                                            try {
                                                int parseInt = Integer.parseInt(map.get("status"));
                                                try {
                                                    C3321an.m8355c("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(parseInt), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                                                    if (parseInt == 0) {
                                                        i3 = parseInt;
                                                    } else if (parseInt == 2) {
                                                        if (this.f8029d + this.f8030e > 0) {
                                                            this.f8038m.mo38381a(this.f8038m.mo38373a(this.f8045t) + this.f8029d + this.f8030e, this.f8045t);
                                                        }
                                                        this.f8038m.mo38380a(parseInt, (C3341be) null);
                                                        C3321an.m8349a("[Upload] Session ID is invalid, will try again immediately (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                                                        this.f8038m.mo38374a(this.f8039n, this.f8033h, this.f8034i, this.f8042q, this.f8043r, this.f8040o, this.f8026a, this.f8027b, true, this.f8044s);
                                                        return;
                                                    } else {
                                                        mo38394a(null, false, 1, "status of server is " + parseInt, parseInt);
                                                        return;
                                                    }
                                                } catch (Throwable unused) {
                                                    j = 0;
                                                    i3 = parseInt;
                                                }
                                            } catch (Throwable unused2) {
                                                j = 0;
                                                mo38392a(1, "[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i3));
                                                i4 = i5;
                                                i2 = 1;
                                            }
                                        }
                                    }
                                    i4 = i5;
                                    i2 = 1;
                                } else {
                                    mo38394a(null, false, i2, "failed after many attempts", 0);
                                    return;
                                }
                            }
                            C3321an.m8355c("[Upload] Received %d bytes", Integer.valueOf(a.length));
                            if (this.f8031f) {
                                if (a.length == 0) {
                                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                                        C3321an.m8355c("[Upload] HTTP headers from server: key = %s, value = %s", entry2.getKey(), entry2.getValue());
                                    }
                                    mo38394a(null, false, 1, "response data from server is empty", 0);
                                    return;
                                }
                                byte[] b = this.f8038m.mo38387b(a);
                                if (b == null) {
                                    mo38394a(null, false, 1, "failed to decrypt response from server", 0);
                                    return;
                                }
                                a = C3325ap.m8423b(b, 2);
                                if (a == null) {
                                    mo38394a(null, false, 1, "failed unzip(Gzip) response from server", 0);
                                    return;
                                }
                            }
                            C3341be a4 = C3311ah.m8282a(a, c, this.f8031f);
                            if (a4 == null) {
                                mo38394a(null, false, 1, "failed to decode response package", 0);
                                return;
                            }
                            if (this.f8031f) {
                                this.f8038m.mo38380a(i3, a4);
                            }
                            Object[] objArr = new Object[2];
                            objArr[0] = Integer.valueOf(a4.f8151b);
                            if (a4.f8152c != null) {
                                i = a4.f8152c.length;
                            }
                            objArr[1] = Integer.valueOf(i);
                            C3321an.m8355c("[Upload] Response cmd is: %d, length of sBuffer is: %d", objArr);
                            if (!mo38396a(a4, this.f8035j, this.f8036k)) {
                                mo38394a(a4, false, 2, "failed to process response package", 0);
                                return;
                            } else {
                                mo38394a(a4, true, 2, "successfully uploaded", 0);
                                return;
                            }
                        }
                    }
                    mo38394a(null, false, 0, "illegal access error", 0);
                    return;
                }
            }
            mo38394a(null, false, 0, "request package is empty!", 0);
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
        }
    }

    public RunnableC3318al(Context context, int i, int i2, byte[] bArr, String str, String str2, AbstractC3313aj ajVar, boolean z, int i3, int i4, boolean z2, Map<String, String> map) {
        this.f8026a = 2;
        this.f8027b = 30000;
        this.f8042q = null;
        this.f8028c = 0;
        this.f8029d = 0;
        this.f8030e = 0;
        this.f8031f = true;
        this.f8045t = false;
        this.f8032g = context;
        this.f8035j = C3269a.m7965a(context);
        this.f8034i = bArr;
        this.f8036k = C3272a.m8069a();
        this.f8037l = C3312ai.m8288a(context);
        C3314ak a = C3314ak.m8297a();
        this.f8038m = a;
        this.f8039n = i;
        this.f8042q = str;
        this.f8043r = str2;
        this.f8040o = ajVar;
        this.f8041p = a.f7996a;
        this.f8031f = z;
        this.f8033h = i2;
        if (i3 > 0) {
            this.f8026a = i3;
        }
        if (i4 > 0) {
            this.f8027b = i4;
        }
        this.f8045t = z2;
        this.f8044s = map;
    }

    /* renamed from: a */
    public void mo38392a(int i, String str) {
        C3321an.m8357e("[Upload] Failed to upload(%d): %s", Integer.valueOf(i), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38394a(com.tencent.bugly.proguard.C3341be r14, boolean r15, int r16, java.lang.String r17, int r18) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.RunnableC3318al.mo38394a(com.tencent.bugly.proguard.be, boolean, int, java.lang.String, int):void");
    }

    /* renamed from: a */
    public boolean mo38396a(C3341be beVar, C3269a aVar, C3272a aVar2) {
        if (beVar == null) {
            C3321an.m8356d("resp == null!", new Object[0]);
            return false;
        }
        byte b = beVar.f8150a;
        if (b != 0) {
            C3321an.m8357e("resp result error %d", Byte.valueOf(b));
            return false;
        }
        try {
            if (!C3325ap.m8404a(beVar.f8153d) && !C3269a.m7966b().mo38166i().equals(beVar.f8153d)) {
                C3307ae.m8249a().mo38348a(C3272a.f7733a, "gateway", beVar.f8153d.getBytes("UTF-8"), (AbstractC3306ad) null, true);
                aVar.mo38158d(beVar.f8153d);
            }
            if (!C3325ap.m8404a(beVar.f8156g) && !C3269a.m7966b().mo38167j().equals(beVar.f8156g)) {
                C3307ae.m8249a().mo38348a(C3272a.f7733a, "device", beVar.f8156g.getBytes("UTF-8"), (AbstractC3306ad) null, true);
                aVar.mo38160e(beVar.f8156g);
            }
        } catch (Throwable th) {
            C3321an.m8350a(th);
        }
        aVar.f7691o = beVar.f8154e;
        int i = beVar.f8151b;
        if (i == 510) {
            byte[] bArr = beVar.f8152c;
            if (bArr == null) {
                C3321an.m8357e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i));
                return false;
            }
            C3343bg bgVar = (C3343bg) C3311ah.m8285a(bArr, C3343bg.class);
            if (bgVar == null) {
                C3321an.m8357e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(beVar.f8151b));
                return false;
            }
            aVar2.mo38192a(bgVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo38395a(String str, long j, String str2) {
        this.f8028c++;
        this.f8029d += j;
    }

    /* renamed from: a */
    public void mo38393a(long j) {
        this.f8030e += j;
    }

    /* renamed from: a */
    public static String m8332a(String str) {
        if (C3325ap.m8404a(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", str, UUID.randomUUID().toString());
        } catch (Throwable th) {
            C3321an.m8350a(th);
            return str;
        }
    }

    /* renamed from: a */
    public static boolean m8333a(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            C3321an.m8356d("[Upload] Headers is empty.", new Object[0]);
            return false;
        } else if (!map.containsKey("status")) {
            C3321an.m8356d("[Upload] Headers does not contain %s", "status");
            return false;
        } else if (!map.containsKey("Bugly-Version")) {
            C3321an.m8356d("[Upload] Headers does not contain %s", "Bugly-Version");
            return false;
        } else {
            String str = map.get("Bugly-Version");
            if (!str.contains("bugly")) {
                C3321an.m8356d("[Upload] Bugly version is not valid: %s", str);
                return false;
            }
            C3321an.m8355c("[Upload] Bugly version from headers is: %s", str);
            return true;
        }
    }
}
