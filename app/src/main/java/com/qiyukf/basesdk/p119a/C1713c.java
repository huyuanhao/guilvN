package com.qiyukf.basesdk.p119a;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.Calendar;

/* renamed from: com.qiyukf.basesdk.a.c */
public final class C1713c {

    /* renamed from: a */
    public String f3088a;

    /* renamed from: b */
    public String f3089b;

    /* renamed from: c */
    public boolean f3090c;

    /* renamed from: d */
    public Handler f3091d;

    /* renamed from: e */
    public Calendar f3092e;

    /* renamed from: f */
    public MappedByteBuffer f3093f;

    /* renamed from: g */
    public long f3094g;

    /* renamed from: h */
    public long f3095h;

    /* renamed from: com.qiyukf.basesdk.a.c$a */
    public static abstract class AbstractRunnableC1716a implements Runnable {
        public AbstractRunnableC1716a() {
        }

        public /* synthetic */ AbstractRunnableC1716a(byte b) {
            this();
        }

        /* renamed from: a */
        public abstract void mo33868a();

        public final void run() {
            try {
                mo33868a();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public C1713c(String str, String str2, final boolean z) {
        mo33865a(str);
        this.f3089b = str2;
        this.f3090c = z;
        HandlerThread handlerThread = new HandlerThread("Log-Writer");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f3091d = handler;
        handler.post(new AbstractRunnableC1716a() {
            /* class com.qiyukf.basesdk.p119a.C1713c.C17141 */

            @Override // com.qiyukf.basesdk.p119a.C1713c.AbstractRunnableC1716a
            /* renamed from: a */
            public final void mo33868a() {
                if (z) {
                    C1710b.m3029a(C1713c.this.m3046c());
                    C1710b.m3032b(C1713c.this.m3046c());
                }
                C1713c.this.f3092e = C1710b.m3024a();
                C1713c cVar = C1713c.this;
                File file = new File(cVar.m3039a((C1713c) cVar.f3092e));
                if (!file.exists()) {
                    C1713c.m3047c(C1713c.this);
                    return;
                }
                C1713c.this.f3094g = C1710b.m3021a(file);
                C1713c.this.f3095h = (long) ((int) file.length());
                C1713c cVar2 = C1713c.this;
                cVar2.f3093f = C1710b.m3023a(file, cVar2.f3094g, C1713c.this.f3095h - C1713c.this.f3094g);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private String m3039a(Calendar calendar) {
        m3049d();
        return this.f3088a + m3040a(false) + C1710b.f3083a.format(calendar.getTime());
    }

    /* renamed from: a */
    private String m3040a(boolean z) {
        return z ? this.f3089b : this.f3090c ? "tmp_c_" : "tmp_u_";
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private String m3046c() {
        m3049d();
        return this.f3088a + m3040a(true);
    }

    /* renamed from: c */
    public static /* synthetic */ void m3047c(C1713c cVar) {
        MappedByteBuffer mappedByteBuffer = cVar.f3093f;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.force();
            cVar.f3093f = null;
        }
        File file = new File(cVar.m3039a(cVar.f3092e));
        cVar.f3094g = 0;
        cVar.f3095h = 65536;
        cVar.f3093f = C1710b.m3023a(file, 0, 65536);
    }

    /* renamed from: d */
    private void m3049d() {
        File file = new File(this.f3088a);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m3053h(C1713c cVar) {
        MappedByteBuffer mappedByteBuffer = cVar.f3093f;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.force();
            cVar.f3093f = null;
        }
        File file = new File(cVar.m3039a(cVar.f3092e));
        long j = cVar.f3095h + 65536;
        cVar.f3095h = j;
        long j2 = cVar.f3094g;
        MappedByteBuffer a = C1710b.m3023a(file, j2, j - j2);
        cVar.f3093f = a;
        return a != null;
    }

    /* renamed from: a */
    public final String mo33864a() {
        return this.f3088a;
    }

    /* renamed from: a */
    public final void mo33865a(String str) {
        if (!str.endsWith(C8932ooOOO0o.OooO0OO)) {
            str = str + C8932ooOOO0o.OooO0OO;
        }
        this.f3088a = str;
    }

    /* renamed from: a */
    public final void mo33866a(final String str, final long j, final String str2, final Throwable th) {
        this.f3091d.post(new AbstractRunnableC1716a() {
            /* class com.qiyukf.basesdk.p119a.C1713c.C17152 */

            @Override // com.qiyukf.basesdk.p119a.C1713c.AbstractRunnableC1716a
            /* renamed from: a */
            public final void mo33868a() {
                if (C1713c.this.f3093f != null) {
                    String a = C1710b.m3022a(str, j, str2, th);
                    if (!TextUtils.isEmpty(a)) {
                        if (System.currentTimeMillis() - C1713c.this.f3092e.getTimeInMillis() >= 86400000) {
                            if (C1713c.this.f3090c) {
                                C1710b.m3032b(C1713c.this.m3046c());
                            }
                            C1713c.this.f3092e = C1710b.m3024a();
                            C1713c.m3047c(C1713c.this);
                        }
                        C1713c cVar = C1713c.this;
                        if (!new File(cVar.m3039a((C1713c) cVar.f3092e)).exists()) {
                            C1713c.m3047c(C1713c.this);
                        }
                        byte[] bytes = a.getBytes();
                        if (C1713c.this.f3094g + ((long) bytes.length) <= C1713c.this.f3095h || C1713c.m3053h(C1713c.this)) {
                            C1713c.this.f3093f.put(bytes);
                            C1713c.this.f3094g += (long) bytes.length;
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final String mo33867b() {
        try {
            C1710b.m3034c(m3046c());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return m3046c();
    }
}
