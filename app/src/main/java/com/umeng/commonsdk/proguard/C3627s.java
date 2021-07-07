package com.umeng.commonsdk.proguard;

/* renamed from: com.umeng.commonsdk.proguard.s */
public class C3627s extends C3636z {

    /* renamed from: a */
    public static final int f9444a = 0;

    /* renamed from: b */
    public static final int f9445b = 1;

    /* renamed from: c */
    public static final int f9446c = 2;

    /* renamed from: d */
    public static final int f9447d = 3;

    /* renamed from: e */
    public static final int f9448e = 4;

    /* renamed from: f */
    public static final int f9449f = 5;

    /* renamed from: g */
    public static final int f9450g = 6;

    /* renamed from: h */
    public static final int f9451h = 7;

    /* renamed from: j */
    public static final C3584ax f9452j = new C3584ax("TApplicationException");

    /* renamed from: k */
    public static final C3574an f9453k = new C3574an("message", (byte) 11, 1);

    /* renamed from: l */
    public static final C3574an f9454l = new C3574an("type", (byte) 8, 2);

    /* renamed from: m */
    public static final long f9455m = 1;

    /* renamed from: i */
    public int f9456i = 0;

    public C3627s() {
    }

    /* renamed from: a */
    public int mo39065a() {
        return this.f9456i;
    }

    /* renamed from: b */
    public void mo39066b(AbstractC3579as asVar) throws C3636z {
        asVar.mo38917a(f9452j);
        if (getMessage() != null) {
            asVar.mo38912a(f9453k);
            asVar.mo38918a(getMessage());
            asVar.mo38924c();
        }
        asVar.mo38912a(f9454l);
        asVar.mo38910a(this.f9456i);
        asVar.mo38924c();
        asVar.mo38926d();
        asVar.mo38923b();
    }

    /* renamed from: a */
    public static C3627s m9612a(AbstractC3579as asVar) throws C3636z {
        asVar.mo38933j();
        String str = null;
        int i = 0;
        while (true) {
            C3574an l = asVar.mo38935l();
            byte b = l.f9230b;
            if (b == 0) {
                asVar.mo38934k();
                return new C3627s(i, str);
            }
            short s = l.f9231c;
            if (s != 1) {
                if (s != 2) {
                    C3582av.m9431a(asVar, b);
                } else if (b == 8) {
                    i = asVar.mo38946w();
                } else {
                    C3582av.m9431a(asVar, b);
                }
            } else if (b == 11) {
                str = asVar.mo38949z();
            } else {
                C3582av.m9431a(asVar, b);
            }
            asVar.mo38936m();
        }
    }

    public C3627s(int i) {
        this.f9456i = i;
    }

    public C3627s(int i, String str) {
        super(str);
        this.f9456i = i;
    }

    public C3627s(String str) {
        super(str);
    }
}
