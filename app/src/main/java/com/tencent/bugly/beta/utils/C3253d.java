package com.tencent.bugly.beta.utils;

/* renamed from: com.tencent.bugly.beta.utils.d */
public class C3253d {

    /* renamed from: a */
    public C3248a f7557a = null;

    /* renamed from: b */
    public String f7558b = null;

    /* renamed from: c */
    public long f7559c = 0;

    /* renamed from: d */
    public long f7560d = 0;

    public C3253d(String str, long j, long j2) {
        this.f7558b = str;
        this.f7559c = j;
        this.f7560d = j2;
    }

    /* renamed from: b */
    private boolean m7888b() {
        return (this.f7559c == 0 || this.f7560d == 0) ? false : true;
    }

    /* renamed from: c */
    private synchronized boolean m7889c() {
        if (!m7888b()) {
            return false;
        }
        if (this.f7557a == null) {
            try {
                this.f7557a = new C3248a(this.f7558b);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void mo38081a() {
        if (this.f7557a != null) {
            this.f7557a.mo38047a();
            this.f7557a = null;
        }
    }

    /* renamed from: b */
    private synchronized String m7887b(long j) {
        if (this.f7557a == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            this.f7557a.mo38050b(this.f7559c);
            this.f7557a.mo38050b(j);
            while (true) {
                byte b = this.f7557a.mo38049b();
                if (b == 0) {
                    break;
                }
                stringBuffer.append((char) b);
            }
            this.f7557a.mo38047a();
            this.f7557a = new C3248a(this.f7558b);
        } catch (Exception e) {
            this.f7557a = null;
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public synchronized String mo38080a(long j) {
        if (j >= 0) {
            if (j < this.f7560d) {
                if (this.f7557a == null && !m7889c()) {
                    return null;
                }
                return m7887b(j);
            }
        }
        return null;
    }
}
