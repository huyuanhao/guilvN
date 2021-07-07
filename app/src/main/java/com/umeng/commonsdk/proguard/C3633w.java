package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.C3571am;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.commonsdk.proguard.w */
public class C3633w {

    /* renamed from: a */
    public final AbstractC3579as f9458a;

    /* renamed from: b */
    public final C3596bf f9459b;

    public C3633w() {
        this(new C3571am.C3572a());
    }

    /* renamed from: j */
    private C3574an m9639j(byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        this.f9459b.mo38972a(bArr);
        int length = aaVarArr.length + 1;
        AbstractC3553aa[] aaVarArr2 = new AbstractC3553aa[length];
        int i = 0;
        aaVarArr2[0] = aaVar;
        int i2 = 0;
        while (i2 < aaVarArr.length) {
            int i3 = i2 + 1;
            aaVarArr2[i3] = aaVarArr[i2];
            i2 = i3;
        }
        this.f9458a.mo38933j();
        C3574an anVar = null;
        while (i < length) {
            anVar = this.f9458a.mo38935l();
            if (anVar.f9230b == 0 || anVar.f9231c > aaVarArr2[i].mo38866a()) {
                return null;
            }
            if (anVar.f9231c != aaVarArr2[i].mo38866a()) {
                C3582av.m9431a(this.f9458a, anVar.f9230b);
                this.f9458a.mo38936m();
            } else {
                i++;
                if (i < length) {
                    this.f9458a.mo38933j();
                }
            }
        }
        return anVar;
    }

    /* renamed from: a */
    public void mo39073a(AbstractC3628t tVar, byte[] bArr) throws C3636z {
        try {
            this.f9459b.mo38972a(bArr);
            tVar.read(this.f9458a);
        } finally {
            this.f9459b.mo38974e();
            this.f9458a.mo38951B();
        }
    }

    /* renamed from: b */
    public Byte mo39075b(byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        return (Byte) m9638a((byte) 3, bArr, aaVar, aaVarArr);
    }

    /* renamed from: c */
    public Double mo39076c(byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        return (Double) m9638a((byte) 4, bArr, aaVar, aaVarArr);
    }

    /* renamed from: d */
    public Short mo39077d(byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        return (Short) m9638a((byte) 6, bArr, aaVar, aaVarArr);
    }

    /* renamed from: e */
    public Integer mo39078e(byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        return (Integer) m9638a((byte) 8, bArr, aaVar, aaVarArr);
    }

    /* renamed from: f */
    public Long mo39079f(byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        return (Long) m9638a((byte) 10, bArr, aaVar, aaVarArr);
    }

    /* renamed from: g */
    public String mo39080g(byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        return (String) m9638a((byte) 11, bArr, aaVar, aaVarArr);
    }

    /* renamed from: h */
    public ByteBuffer mo39081h(byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        return (ByteBuffer) m9638a((byte) 100, bArr, aaVar, aaVarArr);
    }

    /* renamed from: i */
    public Short mo39082i(byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        Short sh;
        try {
            if (m9639j(bArr, aaVar, aaVarArr) != null) {
                this.f9458a.mo38933j();
                sh = Short.valueOf(this.f9458a.mo38935l().f9231c);
            } else {
                sh = null;
            }
            this.f9459b.mo38974e();
            this.f9458a.mo38951B();
            return sh;
        } catch (Exception e) {
            throw new C3636z(e);
        } catch (Throwable th) {
            this.f9459b.mo38974e();
            this.f9458a.mo38951B();
            throw th;
        }
    }

    public C3633w(AbstractC3581au auVar) {
        C3596bf bfVar = new C3596bf();
        this.f9459b = bfVar;
        this.f9458a = auVar.mo38950a(bfVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        throw new com.umeng.commonsdk.proguard.C3636z("JVM DOES NOT SUPPORT ENCODING: " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r1.f9458a.mo38951B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39072a(com.umeng.commonsdk.proguard.AbstractC3628t r2, java.lang.String r3, java.lang.String r4) throws com.umeng.commonsdk.proguard.C3636z {
        /*
            r1 = this;
            byte[] r3 = r3.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x000f }
            r1.mo39073a(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x000f }
            com.umeng.commonsdk.proguard.as r2 = r1.f9458a
            r2.mo38951B()
            return
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            com.umeng.commonsdk.proguard.z r2 = new com.umeng.commonsdk.proguard.z     // Catch:{ all -> 0x000d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x000d }
            r3.<init>()     // Catch:{ all -> 0x000d }
            java.lang.String r0 = "JVM DOES NOT SUPPORT ENCODING: "
            r3.append(r0)     // Catch:{ all -> 0x000d }
            r3.append(r4)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x000d }
            r2.<init>(r3)     // Catch:{ all -> 0x000d }
            throw r2     // Catch:{ all -> 0x000d }
        L_0x0026:
            com.umeng.commonsdk.proguard.as r3 = r1.f9458a
            r3.mo38951B()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.proguard.C3633w.mo39072a(com.umeng.commonsdk.proguard.t, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo39074a(AbstractC3628t tVar, byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        try {
            if (m9639j(bArr, aaVar, aaVarArr) != null) {
                tVar.read(this.f9458a);
            }
            this.f9459b.mo38974e();
            this.f9458a.mo38951B();
        } catch (Exception e) {
            throw new C3636z(e);
        } catch (Throwable th) {
            this.f9459b.mo38974e();
            this.f9458a.mo38951B();
            throw th;
        }
    }

    /* renamed from: a */
    public Boolean mo39070a(byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        return (Boolean) m9638a((byte) 2, bArr, aaVar, aaVarArr);
    }

    /* renamed from: a */
    private Object m9638a(byte b, byte[] bArr, AbstractC3553aa aaVar, AbstractC3553aa... aaVarArr) throws C3636z {
        Object obj;
        try {
            C3574an j = m9639j(bArr, aaVar, aaVarArr);
            if (j != null) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 4) {
                            if (b != 6) {
                                if (b != 8) {
                                    if (b != 100) {
                                        if (b != 10) {
                                            if (b == 11) {
                                                if (j.f9230b == 11) {
                                                    obj = this.f9458a.mo38949z();
                                                    this.f9459b.mo38974e();
                                                    this.f9458a.mo38951B();
                                                    return obj;
                                                }
                                            }
                                        } else if (j.f9230b == 10) {
                                            obj = Long.valueOf(this.f9458a.mo38947x());
                                            this.f9459b.mo38974e();
                                            this.f9458a.mo38951B();
                                            return obj;
                                        }
                                    } else if (j.f9230b == 11) {
                                        obj = this.f9458a.mo38906A();
                                        this.f9459b.mo38974e();
                                        this.f9458a.mo38951B();
                                        return obj;
                                    }
                                } else if (j.f9230b == 8) {
                                    obj = Integer.valueOf(this.f9458a.mo38946w());
                                    this.f9459b.mo38974e();
                                    this.f9458a.mo38951B();
                                    return obj;
                                }
                            } else if (j.f9230b == 6) {
                                obj = Short.valueOf(this.f9458a.mo38945v());
                                this.f9459b.mo38974e();
                                this.f9458a.mo38951B();
                                return obj;
                            }
                        } else if (j.f9230b == 4) {
                            obj = Double.valueOf(this.f9458a.mo38948y());
                            this.f9459b.mo38974e();
                            this.f9458a.mo38951B();
                            return obj;
                        }
                    } else if (j.f9230b == 3) {
                        obj = Byte.valueOf(this.f9458a.mo38944u());
                        this.f9459b.mo38974e();
                        this.f9458a.mo38951B();
                        return obj;
                    }
                } else if (j.f9230b == 2) {
                    obj = Boolean.valueOf(this.f9458a.mo38943t());
                    this.f9459b.mo38974e();
                    this.f9458a.mo38951B();
                    return obj;
                }
            }
            obj = null;
            this.f9459b.mo38974e();
            this.f9458a.mo38951B();
            return obj;
        } catch (Exception e) {
            throw new C3636z(e);
        } catch (Throwable th) {
            this.f9459b.mo38974e();
            this.f9458a.mo38951B();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo39071a(AbstractC3628t tVar, String str) throws C3636z {
        mo39073a(tVar, str.getBytes());
    }
}
