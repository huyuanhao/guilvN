package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4246ad;
import com.xiaomi.push.C4282bc;
import com.xiaomi.push.EnumC4499ht;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.push.service.ah */
public class C4605ah {

    /* renamed from: a */
    public static volatile C4605ah f13162a;

    /* renamed from: a */
    public SharedPreferences f13163a;

    /* renamed from: a */
    public HashSet<AbstractRunnableC4606a> f13164a = new HashSet<>();

    /* renamed from: com.xiaomi.push.service.ah$a */
    public static abstract class AbstractRunnableC4606a implements Runnable {

        /* renamed from: a */
        public int f13165a;

        /* renamed from: a */
        public String f13166a;

        public AbstractRunnableC4606a(int i, String str) {
            this.f13165a = i;
            this.f13166a = str;
        }

        /* renamed from: a */
        public abstract void mo41381a();

        public boolean equals(Object obj) {
            return (obj instanceof AbstractRunnableC4606a) && this.f13165a == ((AbstractRunnableC4606a) obj).f13165a;
        }

        public int hashCode() {
            return this.f13165a;
        }

        public final void run() {
            mo41381a();
        }
    }

    public C4605ah(Context context) {
        this.f13163a = context.getSharedPreferences("mipush_oc", 0);
    }

    /* renamed from: a */
    public static C4605ah m13919a(Context context) {
        if (f13162a == null) {
            synchronized (C4605ah.class) {
                if (f13162a == null) {
                    f13162a = new C4605ah(context);
                }
            }
        }
        return f13162a;
    }

    /* renamed from: a */
    private String m13920a(int i) {
        return "normal_oc_" + i;
    }

    /* renamed from: a */
    private void m13921a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            if (str.equals(m13920a(EnumC4499ht.AppIsInstalledList.mo42043a()))) {
                str2 = C4282bc.m11787a(str2);
            }
            editor.putString(str, str2);
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: b */
    private String m13922b(int i) {
        return "custom_oc_" + i;
    }

    /* renamed from: a */
    public int mo42656a(int i, int i2) {
        String b = m13922b(i);
        if (this.f13163a.contains(b)) {
            return this.f13163a.getInt(b, 0);
        }
        String a = m13920a(i);
        return this.f13163a.contains(a) ? this.f13163a.getInt(a, 0) : i2;
    }

    /* renamed from: a */
    public String mo42657a(int i, String str) {
        String b = m13922b(i);
        if (this.f13163a.contains(b)) {
            return this.f13163a.getString(b, null);
        }
        String a = m13920a(i);
        return this.f13163a.contains(a) ? this.f13163a.getString(a, null) : str;
    }

    /* renamed from: a */
    public synchronized void mo42658a() {
        this.f13164a.clear();
    }

    /* renamed from: a */
    public synchronized void mo42659a(AbstractRunnableC4606a aVar) {
        if (!this.f13164a.contains(aVar)) {
            this.f13164a.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo42660a(List<Pair<Integer, Object>> list) {
        if (!C4246ad.m11632a(list)) {
            SharedPreferences.Editor edit = this.f13163a.edit();
            for (Pair<Integer, Object> pair : list) {
                Object obj = pair.first;
                if (!(obj == null || pair.second == null)) {
                    m13921a(edit, pair, m13920a(((Integer) obj).intValue()));
                }
            }
            edit.commit();
        }
    }

    /* renamed from: a */
    public boolean mo42661a(int i, boolean z) {
        String b = m13922b(i);
        if (this.f13163a.contains(b)) {
            return this.f13163a.getBoolean(b, false);
        }
        String a = m13920a(i);
        return this.f13163a.contains(a) ? this.f13163a.getBoolean(a, false) : z;
    }

    /* renamed from: b */
    public void mo42662b() {
        AbstractC4163b.m11305c("OC_Callback : receive new oc data");
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f13164a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractRunnableC4606a aVar = (AbstractRunnableC4606a) it.next();
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }

    /* renamed from: b */
    public void mo42663b(List<Pair<Integer, Object>> list) {
        if (!C4246ad.m11632a(list)) {
            SharedPreferences.Editor edit = this.f13163a.edit();
            for (Pair<Integer, Object> pair : list) {
                Object obj = pair.first;
                if (obj != null) {
                    String b = m13922b(((Integer) obj).intValue());
                    if (pair.second == null) {
                        edit.remove(b);
                    } else {
                        m13921a(edit, pair, b);
                    }
                }
            }
            edit.commit();
        }
    }
}
