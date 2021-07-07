package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C4251ai;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* renamed from: com.xiaomi.push.ef */
public abstract class AbstractC4379ef extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public int f11644a;

    /* renamed from: a */
    public Context f11645a;

    public AbstractC4379ef(Context context, int i) {
        this.f11644a = i;
        this.f11645a = context;
    }

    /* renamed from: a */
    public static void m12164a(Context context, C4502hw hwVar) {
        AbstractC4364dr a = C4365ds.mo41674a().m12121a();
        String a2 = a == null ? "" : a.mo41461a();
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(hwVar.mo42049a())) {
            m12165a(context, hwVar, a2);
        }
    }

    /* renamed from: a */
    public static void m12165a(Context context, C4502hw hwVar, String str) {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        RandomAccessFile randomAccessFile;
        IOException e;
        FileLock lock;
        byte[] b = C4369dw.m12132b(str, C4531iy.m13590a(hwVar));
        if (b != null && b.length != 0) {
            synchronized (C4370dx.f11635a) {
                FileLock fileLock = null;
                try {
                    File file = new File(context.getExternalFilesDir(null), "push_cdata.lock");
                    C4693y.m14241a(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        lock = randomAccessFile.getChannel().lock();
                    } catch (IOException e2) {
                        e = e2;
                        bufferedOutputStream = null;
                        try {
                            e.printStackTrace();
                            try {
                                fileLock.release();
                            } catch (IOException unused) {
                            }
                            C4693y.m14236a(bufferedOutputStream);
                            C4693y.m14236a(randomAccessFile);
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException unused2) {
                                }
                            }
                            C4693y.m14236a(bufferedOutputStream);
                            C4693y.m14236a(randomAccessFile);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream = null;
                        fileLock.release();
                        C4693y.m14236a(bufferedOutputStream);
                        C4693y.m14236a(randomAccessFile);
                        throw th;
                    }
                    try {
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(context.getExternalFilesDir(null), "push_cdata.data"), true));
                        try {
                            bufferedOutputStream.write(C4245ac.m11631a(b.length));
                            bufferedOutputStream.write(b);
                            bufferedOutputStream.flush();
                            if (lock != null) {
                                if (lock.isValid()) {
                                    try {
                                        lock.release();
                                    } catch (IOException unused3) {
                                    }
                                }
                            }
                            C4693y.m14236a(bufferedOutputStream);
                        } catch (IOException e3) {
                            e = e3;
                            fileLock = lock;
                            e.printStackTrace();
                            if (fileLock != null && fileLock.isValid()) {
                                fileLock.release();
                            }
                            C4693y.m14236a(bufferedOutputStream);
                            C4693y.m14236a(randomAccessFile);
                        } catch (Throwable th4) {
                            th = th4;
                            fileLock = lock;
                            fileLock.release();
                            C4693y.m14236a(bufferedOutputStream);
                            C4693y.m14236a(randomAccessFile);
                            throw th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedOutputStream = null;
                        fileLock = lock;
                        e.printStackTrace();
                        fileLock.release();
                        C4693y.m14236a(bufferedOutputStream);
                        C4693y.m14236a(randomAccessFile);
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedOutputStream = null;
                        fileLock = lock;
                        fileLock.release();
                        C4693y.m14236a(bufferedOutputStream);
                        C4693y.m14236a(randomAccessFile);
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    bufferedOutputStream = null;
                    randomAccessFile = null;
                    e.printStackTrace();
                    fileLock.release();
                    C4693y.m14236a(bufferedOutputStream);
                    C4693y.m14236a(randomAccessFile);
                } catch (Throwable th6) {
                    th = th6;
                    bufferedOutputStream = null;
                    randomAccessFile = null;
                    fileLock.release();
                    C4693y.m14236a(bufferedOutputStream);
                    C4693y.m14236a(randomAccessFile);
                    throw th;
                }
                C4693y.m14236a(randomAccessFile);
            }
        }
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public abstract EnumC4496hq mo41384a();

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public abstract String m12167a();

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public boolean m12168a() {
        return C4249ag.m11635a(this.f11645a, String.valueOf(mo41384a()), (long) this.f11644a);
    }

    /* renamed from: b */
    public boolean mo41687b() {
        return true;
    }

    public void run() {
        if (m12168a()) {
            AbstractC4364dr a = C4365ds.mo41674a().m12121a();
            String a2 = a == null ? "" : a.mo41461a();
            if (!TextUtils.isEmpty(a2) && mo41687b()) {
                String a3 = m12167a();
                if (!TextUtils.isEmpty(a3)) {
                    C4502hw hwVar = new C4502hw();
                    hwVar.mo42048a(a3);
                    hwVar.mo42046a(System.currentTimeMillis());
                    hwVar.mo42047a(mo41384a());
                    m12165a(this.f11645a, hwVar, a2);
                }
            }
        }
    }
}
