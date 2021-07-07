package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4498hs;
import com.xiaomi.push.C4693y;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* renamed from: com.xiaomi.push.service.bh */
public final class RunnableC4643bh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f13300a;

    /* renamed from: a */
    public final /* synthetic */ C4498hs f13301a;

    public RunnableC4643bh(Context context, C4498hs hsVar) {
        this.f13300a = context;
        this.f13301a = hsVar;
    }

    public void run() {
        RandomAccessFile randomAccessFile;
        Throwable th;
        Exception e;
        synchronized (C4642bg.f13299a) {
            FileLock fileLock = null;
            try {
                File file = new File(this.f13300a.getFilesDir(), "tiny_data.lock");
                C4693y.m14241a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    C4642bg.m14063c(this.f13300a, this.f13301a);
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
}
