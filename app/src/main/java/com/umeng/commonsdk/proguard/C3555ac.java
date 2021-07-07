package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.C3571am;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.umeng.commonsdk.proguard.ac */
public class C3555ac {

    /* renamed from: a */
    public final ByteArrayOutputStream f9161a;

    /* renamed from: b */
    public final C3595be f9162b;

    /* renamed from: c */
    public AbstractC3579as f9163c;

    public C3555ac() {
        this(new C3571am.C3572a());
    }

    /* renamed from: a */
    public byte[] mo38869a(AbstractC3628t tVar) throws C3636z {
        this.f9161a.reset();
        tVar.write(this.f9163c);
        return this.f9161a.toByteArray();
    }

    /* renamed from: b */
    public String mo38870b(AbstractC3628t tVar) throws C3636z {
        return new String(mo38869a(tVar));
    }

    public C3555ac(AbstractC3581au auVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f9161a = byteArrayOutputStream;
        C3595be beVar = new C3595be(byteArrayOutputStream);
        this.f9162b = beVar;
        this.f9163c = auVar.mo38950a(beVar);
    }

    /* renamed from: a */
    public String mo38868a(AbstractC3628t tVar, String str) throws C3636z {
        try {
            return new String(mo38869a(tVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new C3636z("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }
}
