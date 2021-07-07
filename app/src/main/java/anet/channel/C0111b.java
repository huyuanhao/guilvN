package anet.channel;

import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.b */
public class C0111b {

    /* renamed from: a */
    public Map<String, Integer> f109a = new HashMap();

    /* renamed from: b */
    public Map<String, SessionInfo> f110b = new ConcurrentHashMap();

    /* renamed from: a */
    public void mo3413a(SessionInfo sessionInfo) {
        if (sessionInfo == null) {
            throw new NullPointerException("info is null");
        } else if (!TextUtils.isEmpty(sessionInfo.host)) {
            this.f110b.put(sessionInfo.host, sessionInfo);
        } else {
            throw new IllegalArgumentException("host cannot be null or empty");
        }
    }

    /* renamed from: b */
    public SessionInfo mo3415b(String str) {
        return this.f110b.get(str);
    }

    /* renamed from: c */
    public int mo3416c(String str) {
        Integer num;
        synchronized (this.f109a) {
            num = this.f109a.get(str);
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public SessionInfo mo3411a(String str) {
        return this.f110b.remove(str);
    }

    /* renamed from: a */
    public Collection<SessionInfo> mo3412a() {
        return this.f110b.values();
    }

    /* renamed from: a */
    public void mo3414a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f109a) {
                this.f109a.put(str, Integer.valueOf(i));
            }
            return;
        }
        throw new IllegalArgumentException("host cannot be null or empty");
    }
}
