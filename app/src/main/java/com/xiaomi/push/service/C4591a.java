package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4693y;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* renamed from: com.xiaomi.push.service.a */
public class C4591a {

    /* renamed from: a */
    public static volatile C4591a f13124a;

    /* renamed from: a */
    public Context f13125a;

    /* renamed from: a */
    public final Object f13126a = new Object();

    /* renamed from: a */
    public final String f13127a = "mipush_region";

    /* renamed from: b */
    public final Object f13128b = new Object();

    /* renamed from: b */
    public final String f13129b = "mipush_country_code";

    /* renamed from: c */
    public final String f13130c = "mipush_region.lock";

    /* renamed from: d */
    public final String f13131d = "mipush_country_code.lock";

    /* renamed from: e */
    public volatile String f13132e;

    /* renamed from: f */
    public volatile String f13133f;

    public C4591a(Context context) {
        this.f13125a = context;
    }

    /* renamed from: a */
    public static C4591a m13848a(Context context) {
        if (f13124a == null) {
            synchronized (C4591a.class) {
                if (f13124a == null) {
                    f13124a = new C4591a(context);
                }
            }
        }
        return f13124a;
    }

    /* renamed from: a */
    private String m13849a(Context context, String str, String str2, Object obj) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        Exception e;
        FileLock fileLock;
        File file = new File(context.getFilesDir(), str);
        FileLock fileLock2 = null;
        if (!file.exists()) {
            AbstractC4163b.m11301a("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                File file2 = new File(context.getFilesDir(), str2);
                C4693y.m14241a(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                } catch (Exception e2) {
                    e = e2;
                    fileLock = null;
                    try {
                        AbstractC4163b.m11303a(e);
                        try {
                            fileLock.release();
                        } catch (IOException e3) {
                            AbstractC4163b.m11303a(e3);
                        }
                        C4693y.m14236a(randomAccessFile);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileLock2 = fileLock;
                        try {
                            fileLock2.release();
                        } catch (IOException e4) {
                            AbstractC4163b.m11303a(e4);
                        }
                        C4693y.m14236a(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileLock2.release();
                    C4693y.m14236a(randomAccessFile);
                    throw th;
                }
                try {
                    String a = C4693y.m14235a(file);
                    if (fileLock != null) {
                        if (fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e5) {
                                AbstractC4163b.m11303a(e5);
                            }
                        }
                    }
                    C4693y.m14236a(randomAccessFile);
                    return a;
                } catch (Exception e6) {
                    e = e6;
                    AbstractC4163b.m11303a(e);
                    fileLock.release();
                    C4693y.m14236a(randomAccessFile);
                    return null;
                }
            } catch (Exception e7) {
                e = e7;
                randomAccessFile = null;
                fileLock = null;
                AbstractC4163b.m11303a(e);
                if (fileLock != null && fileLock.isValid()) {
                    fileLock.release();
                }
                C4693y.m14236a(randomAccessFile);
                return null;
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
                if (fileLock2 != null && fileLock2.isValid()) {
                    fileLock2.release();
                }
                C4693y.m14236a(randomAccessFile);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m13850a(Context context, String str, String str2, String str3, Object obj) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        Exception e;
        synchronized (obj) {
            FileLock fileLock = null;
            try {
                File file = new File(context.getFilesDir(), str3);
                C4693y.m14241a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    C4693y.m14239a(new File(context.getFilesDir(), str2), str);
                    if (fileLock != null) {
                        if (fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e2) {
                                AbstractC4163b.m11303a(e2);
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    try {
                        AbstractC4163b.m11303a(e);
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e4) {
                                AbstractC4163b.m11303a(e4);
                            }
                        }
                        C4693y.m14236a(randomAccessFile);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            fileLock.release();
                        } catch (IOException e5) {
                            AbstractC4163b.m11303a(e5);
                        }
                        C4693y.m14236a(randomAccessFile);
                        throw th;
                    }
                }
            } catch (Exception e6) {
                e = e6;
                randomAccessFile = null;
                AbstractC4163b.m11303a(e);
                fileLock.release();
                C4693y.m14236a(randomAccessFile);
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
                if (fileLock != null && fileLock.isValid()) {
                    fileLock.release();
                }
                C4693y.m14236a(randomAccessFile);
                throw th;
            }
            C4693y.m14236a(randomAccessFile);
        }
    }

    /* renamed from: a */
    public String mo42647a() {
        if (TextUtils.isEmpty(this.f13132e)) {
            this.f13132e = m13849a(this.f13125a, "mipush_region", "mipush_region.lock", this.f13126a);
        }
        return this.f13132e;
    }

    /* renamed from: a */
    public void mo42648a(String str) {
        if (!TextUtils.equals(str, this.f13132e)) {
            this.f13132e = str;
            m13850a(this.f13125a, this.f13132e, "mipush_region", "mipush_region.lock", this.f13126a);
        }
    }

    /* renamed from: b */
    public String mo42649b() {
        if (TextUtils.isEmpty(this.f13133f)) {
            this.f13133f = m13849a(this.f13125a, "mipush_country_code", "mipush_country_code.lock", this.f13128b);
        }
        return this.f13133f;
    }

    /* renamed from: b */
    public void mo42650b(String str) {
        if (!TextUtils.equals(str, this.f13133f)) {
            this.f13133f = str;
            m13850a(this.f13125a, this.f13133f, "mipush_country_code", "mipush_country_code.lock", this.f13128b);
        }
    }
}
