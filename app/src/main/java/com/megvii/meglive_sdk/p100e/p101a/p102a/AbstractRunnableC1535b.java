package com.megvii.meglive_sdk.p100e.p101a.p102a;

import android.media.MediaCodec;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.megvii.meglive_sdk.e.a.a.b */
public abstract class AbstractRunnableC1535b implements Runnable {

    /* renamed from: a */
    public final Object f2408a = new Object();

    /* renamed from: b */
    public volatile boolean f2409b;

    /* renamed from: c */
    public volatile boolean f2410c;

    /* renamed from: d */
    public boolean f2411d;

    /* renamed from: e */
    public boolean f2412e;

    /* renamed from: f */
    public int f2413f;

    /* renamed from: g */
    public MediaCodec f2414g;

    /* renamed from: h */
    public int f2415h;

    /* renamed from: i */
    public int f2416i;

    /* renamed from: j */
    public int f2417j;

    /* renamed from: k */
    public final WeakReference<C1537c> f2418k;

    /* renamed from: l */
    public final AbstractC1536a f2419l;

    /* renamed from: m */
    public ArrayBlockingQueue<byte[]> f2420m = new ArrayBlockingQueue<>(10);

    /* renamed from: n */
    public int f2421n;

    /* renamed from: o */
    public MediaCodec.BufferInfo f2422o;

    /* renamed from: p */
    public long f2423p = 0;

    /* renamed from: com.megvii.meglive_sdk.e.a.a.b$a */
    public interface AbstractC1536a {
        /* renamed from: a */
        void mo17072a(AbstractRunnableC1535b bVar);

        /* renamed from: b */
        void mo17073b(AbstractRunnableC1535b bVar);

        /* renamed from: c */
        void mo17074c(AbstractRunnableC1535b bVar);
    }

    public AbstractRunnableC1535b(C1537c cVar, AbstractC1536a aVar) {
        if (aVar == null) {
            throw new NullPointerException("MediaEncoderListener is null");
        } else if (cVar != null) {
            this.f2418k = new WeakReference<>(cVar);
            if (this instanceof C1538d) {
                if (cVar.f2427c == null) {
                    cVar.f2427c = this;
                } else {
                    throw new IllegalArgumentException("Video encoder already added.");
                }
            } else if (!(this instanceof C1534a)) {
                throw new IllegalArgumentException("unsupported encoder");
            } else if (cVar.f2428d == null) {
                cVar.f2428d = this;
            } else {
                throw new IllegalArgumentException("Video encoder already added.");
            }
            cVar.f2426b = (cVar.f2427c != null ? 1 : 0) + (cVar.f2428d == null ? 0 : 1);
            this.f2419l = aVar;
            synchronized (this.f2408a) {
                this.f2422o = new MediaCodec.BufferInfo();
                new Thread(this, getClass().getSimpleName()).start();
                try {
                    this.f2408a.wait();
                } catch (InterruptedException unused) {
                }
            }
        } else {
            throw new NullPointerException("MediaMuxerColorWrapper is null");
        }
    }

    /* renamed from: d */
    private void m2552d() {
        if (this.f2414g != null) {
            if (this.f2420m.size() > 0) {
                byte[] poll = this.f2420m.poll();
                int i = this.f2416i;
                int i2 = this.f2417j;
                byte[] bArr = new byte[(((i * i2) * 3) / 2)];
                int i3 = this.f2415h;
                if (i3 == 21 || i3 == 2130706688) {
                    bArr = m2550a(poll, this.f2416i, this.f2417j);
                } else if (i3 == 19) {
                    bArr = m2551b(poll, i, i2);
                } else {
                    C1571m.m2657c("mfx", "This color format is not yet supported, passing the NV21 frame directly to the encoder and hoping for the best!");
                }
                try {
                    ByteBuffer[] inputBuffers = this.f2414g.getInputBuffers();
                    int dequeueInputBuffer = this.f2414g.dequeueInputBuffer(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
                    if (dequeueInputBuffer >= 0) {
                        ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                        byteBuffer.clear();
                        byteBuffer.put(bArr);
                        this.f2414g.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, mo17137g(), 0);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            ByteBuffer[] outputBuffers = this.f2414g.getOutputBuffers();
            C1537c cVar = this.f2418k.get();
            if (cVar != null) {
                int i4 = 0;
                while (this.f2409b) {
                    int dequeueOutputBuffer = this.f2414g.dequeueOutputBuffer(this.f2422o, TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
                    if (dequeueOutputBuffer == -1) {
                        if (!this.f2411d && (i4 = i4 + 1) > 5) {
                            return;
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        outputBuffers = this.f2414g.getOutputBuffers();
                    } else if (dequeueOutputBuffer == -2) {
                        if (!this.f2412e) {
                            this.f2413f = cVar.mo17139a(this.f2414g.getOutputFormat());
                            this.f2412e = true;
                            if (!cVar.mo17142b()) {
                                synchronized (cVar) {
                                    while (!cVar.mo17141a()) {
                                        try {
                                            cVar.wait(100);
                                        } catch (InterruptedException unused) {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            throw new RuntimeException("format changed twice");
                        }
                    } else if (dequeueOutputBuffer < 0) {
                        continue;
                    } else {
                        ByteBuffer byteBuffer2 = outputBuffers[dequeueOutputBuffer];
                        if (byteBuffer2 != null) {
                            MediaCodec.BufferInfo bufferInfo = this.f2422o;
                            if ((bufferInfo.flags & 2) != 0) {
                                bufferInfo.size = 0;
                            }
                            MediaCodec.BufferInfo bufferInfo2 = this.f2422o;
                            if (bufferInfo2.size != 0) {
                                if (this.f2412e) {
                                    bufferInfo2.presentationTimeUs = mo17137g();
                                    cVar.mo17140a(this.f2413f, byteBuffer2, this.f2422o);
                                    this.f2423p = this.f2422o.presentationTimeUs;
                                    i4 = 0;
                                } else {
                                    throw new RuntimeException("drain:muxer hasn't started");
                                }
                            }
                            this.f2414g.releaseOutputBuffer(dequeueOutputBuffer, false);
                            if ((this.f2422o.flags & 4) != 0) {
                                this.f2409b = false;
                                return;
                            }
                        } else {
                            throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public abstract void mo17129a();

    /* renamed from: a */
    public final boolean mo17134a(byte[] bArr) {
        synchronized (this.f2408a) {
            if (this.f2409b) {
                if (!this.f2410c) {
                    if (this.f2420m.size() >= 10) {
                        this.f2420m.poll();
                    }
                    this.f2420m.add(bArr);
                    this.f2421n++;
                    this.f2408a.notifyAll();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public void mo17130b() {
        synchronized (this.f2408a) {
            this.f2409b = true;
            this.f2410c = false;
            this.f2408a.notifyAll();
        }
    }

    /* renamed from: c */
    public void mo17131c() {
        try {
            this.f2419l.mo17073b(this);
        } catch (Exception unused) {
        }
        this.f2409b = false;
        MediaCodec mediaCodec = this.f2414g;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                this.f2414g.release();
                this.f2414g = null;
            } catch (Exception unused2) {
            }
        }
        if (this.f2412e) {
            WeakReference<C1537c> weakReference = this.f2418k;
            C1537c cVar = weakReference != null ? weakReference.get() : null;
            if (cVar != null) {
                try {
                    cVar.mo17143c();
                } catch (Exception unused3) {
                }
            }
        }
        this.f2422o = null;
        this.f2419l.mo17074c(this);
    }

    /* renamed from: e */
    public boolean mo17135e() {
        synchronized (this.f2408a) {
            if (this.f2409b) {
                if (!this.f2410c) {
                    this.f2421n++;
                    this.f2408a.notifyAll();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public final void mo17136f() {
        synchronized (this.f2408a) {
            if (this.f2409b) {
                if (!this.f2410c) {
                    this.f2410c = true;
                    this.f2408a.notifyAll();
                }
            }
        }
    }

    /* renamed from: g */
    public final long mo17137g() {
        long nanoTime = System.nanoTime() / 1000;
        long j = this.f2423p;
        return nanoTime < j ? nanoTime + (j - nanoTime) : nanoTime;
    }

    public void run() {
        boolean z;
        boolean z2;
        synchronized (this.f2408a) {
            this.f2410c = false;
            this.f2421n = 0;
            this.f2408a.notify();
        }
        while (true) {
            synchronized (this.f2408a) {
                z = this.f2410c;
                z2 = this.f2421n > 0;
                if (z2) {
                    this.f2421n--;
                }
            }
            if (z) {
                m2552d();
                mo17133a((ByteBuffer) null, 0, mo17137g());
                m2552d();
                mo17131c();
                break;
            } else if (z2) {
                m2552d();
            } else {
                synchronized (this.f2408a) {
                    try {
                        this.f2408a.wait();
                        try {
                        } finally {
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        synchronized (this.f2408a) {
            this.f2410c = true;
            this.f2409b = false;
        }
    }

    /* renamed from: b */
    public static byte[] m2551b(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = i3 / 4;
        double d = (double) i3;
        Double.isNaN(d);
        byte[] bArr2 = new byte[((int) (d * 1.5d))];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = (i5 * 2) + i3;
            byte b = bArr[i6];
            byte b2 = bArr[i6 + 1];
            int i7 = i3 + i5;
            bArr2[i7 + i4] = b;
            bArr2[i7] = b2;
        }
        return bArr2;
    }

    /* renamed from: a */
    public final void mo17133a(ByteBuffer byteBuffer, int i, long j) {
        MediaCodec mediaCodec;
        if (this.f2409b && (mediaCodec = this.f2414g) != null) {
            ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
            while (this.f2409b) {
                int dequeueInputBuffer = this.f2414g.dequeueInputBuffer(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer2 = inputBuffers[dequeueInputBuffer];
                    byteBuffer2.clear();
                    if (byteBuffer != null) {
                        byteBuffer2.put(byteBuffer);
                    }
                    if (i <= 0) {
                        this.f2411d = true;
                        this.f2414g.queueInputBuffer(dequeueInputBuffer, 0, 0, j, 4);
                        return;
                    }
                    this.f2414g.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static byte[] m2550a(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = i3 / 4;
        double d = (double) i3;
        Double.isNaN(d);
        byte[] bArr2 = new byte[((int) (d * 1.5d))];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = (i5 * 2) + i3;
            byte b = bArr[i6];
            int i7 = i6 + 1;
            bArr2[i6] = bArr[i7];
            bArr2[i7] = b;
        }
        return bArr2;
    }
}
