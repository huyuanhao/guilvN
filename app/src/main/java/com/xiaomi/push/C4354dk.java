package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.p118pd.sdk.C7482o0OoO0OO;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4256al;
import com.xiaomi.push.service.C4635bb;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.dk */
public class C4354dk {

    /* renamed from: a */
    public static volatile C4354dk f11594a;

    /* renamed from: a */
    public Context f11595a;

    /* renamed from: a */
    public final ConcurrentLinkedQueue<C4356b> f11596a;

    /* renamed from: com.xiaomi.push.dk$a */
    public class C4355a extends C4356b {
        public C4355a() {
            super();
        }

        @Override // com.xiaomi.push.C4354dk.C4356b, com.xiaomi.push.C4354dk.C4356b, com.xiaomi.push.C4256al.AbstractC4258b
        /* renamed from: b */
        public void mo41488b() {
            C4354dk.this.m12095b();
        }
    }

    /* renamed from: com.xiaomi.push.dk$b */
    public class C4356b extends C4256al.AbstractC4258b {

        /* renamed from: a */
        public long f11598a = System.currentTimeMillis();

        public C4356b() {
        }

        @Override // com.xiaomi.push.C4256al.AbstractC4258b
        /* renamed from: a */
        public boolean mo41487a() {
            return true;
        }

        @Override // com.xiaomi.push.C4256al.AbstractC4258b
        /* renamed from: b */
        public void mo41488b() {
        }

        @Override // com.xiaomi.push.C4256al.AbstractC4258b
        /* renamed from: b */
        public final boolean m12103b() {
            return System.currentTimeMillis() - this.f11598a > 172800000;
        }
    }

    /* renamed from: com.xiaomi.push.dk$c */
    public class C4357c extends C4356b {

        /* renamed from: a */
        public int f11600a;

        /* renamed from: a */
        public File f11602a;

        /* renamed from: a */
        public String f11603a;

        /* renamed from: a */
        public boolean f11604a;

        /* renamed from: b */
        public String f11605b;

        /* renamed from: b */
        public boolean f11606b;

        public C4357c(String str, String str2, File file, boolean z) {
            super();
            this.f11603a = str;
            this.f11605b = str2;
            this.f11602a = file;
            this.f11606b = z;
        }

        @Override // com.xiaomi.push.C4256al.AbstractC4258b
        /* renamed from: c */
        private boolean mo41489c() {
            int i;
            int i2 = 0;
            SharedPreferences sharedPreferences = C4354dk.this.f11595a.getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                currentTimeMillis = jSONObject.getLong("time");
                i = jSONObject.getInt("times");
            } catch (JSONException unused) {
                i = 0;
            }
            if (System.currentTimeMillis() - currentTimeMillis >= 86400000) {
                currentTimeMillis = System.currentTimeMillis();
            } else if (i > 10) {
                return false;
            } else {
                i2 = i;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", currentTimeMillis);
                jSONObject2.put("times", i2 + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e) {
                AbstractC4163b.m11305c("JSONException on put " + e.getMessage());
            }
            return true;
        }

        @Override // com.xiaomi.push.C4354dk.C4356b, com.xiaomi.push.C4256al.AbstractC4258b
        /* renamed from: a */
        public boolean mo41487a() {
            return C4274az.m11737d(C4354dk.this.f11595a) || (this.f11606b && C4274az.m11735b(C4354dk.this.f11595a));
        }

        @Override // com.xiaomi.push.C4354dk.C4356b, com.xiaomi.push.C4354dk.C4356b, com.xiaomi.push.C4256al.AbstractC4258b
        /* renamed from: b */
        public void mo41488b() {
            try {
                if (mo41489c()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", C4635bb.m14028a());
                    hashMap.put("token", this.f11605b);
                    hashMap.put(C7482o0OoO0OO.OooOO0O, C4274az.m11726a(C4354dk.this.f11595a));
                    C4274az.m11730a(this.f11603a, hashMap, this.f11602a, "file");
                }
                this.f11604a = true;
            } catch (IOException unused) {
            }
        }

        @Override // com.xiaomi.push.C4256al.AbstractC4258b
        /* renamed from: c */
        public void m12107c() {
            if (!this.f11604a) {
                int i = this.f11600a + 1;
                this.f11600a = i;
                if (i < 3) {
                    C4354dk.this.f11596a.add(this);
                }
            }
            if (this.f11604a || this.f11600a >= 3) {
                this.f11602a.delete();
            }
            C4354dk.this.m12092a((C4354dk) ((long) ((1 << this.f11600a) * 1000)));
        }
    }

    public C4354dk(Context context) {
        ConcurrentLinkedQueue<C4356b> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f11596a = concurrentLinkedQueue;
        this.f11595a = context;
        concurrentLinkedQueue.add(new C4355a());
        m12096b(0);
    }

    /* renamed from: a */
    public static C4354dk m12090a(Context context) {
        if (f11594a == null) {
            synchronized (C4354dk.class) {
                if (f11594a == null) {
                    f11594a = new C4354dk(context);
                }
            }
        }
        f11594a.f11595a = context;
        return f11594a;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m12092a(long j) {
        C4356b peek = this.f11596a.peek();
        if (peek != null && peek.mo41487a()) {
            m12096b(j);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m12095b() {
        if (!C4243aa.m11623b() && !C4243aa.m11622a()) {
            try {
                File file = new File(this.f11595a.getExternalFilesDir(null) + "/.logcache");
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        file2.delete();
                    }
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: b */
    private void m12096b(long j) {
        if (!this.f11596a.isEmpty()) {
            C4471gx.m12836a(new C4359dm(this), j);
        }
    }

    /* renamed from: c */
    private void m12097c() {
        while (!this.f11596a.isEmpty()) {
            C4356b peek = this.f11596a.peek();
            if (peek != null) {
                if (peek.m12103b() || this.f11596a.size() > 6) {
                    AbstractC4163b.m11305c("remove Expired task");
                    this.f11596a.remove(peek);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo41665a() {
        m12097c();
        m12092a(0);
    }

    /* renamed from: a */
    public void mo41666a(String str, String str2, Date date, Date date2, int i, boolean z) {
        this.f11596a.add(new C4358dl(this, i, date, date2, str, str2, z));
        m12096b(0);
    }
}
