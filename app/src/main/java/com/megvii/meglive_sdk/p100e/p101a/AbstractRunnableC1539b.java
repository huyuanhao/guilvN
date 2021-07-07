package com.megvii.meglive_sdk.p100e.p101a;

import android.media.MediaCodec;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.megvii.meglive_sdk.e.a.b */
public abstract class AbstractRunnableC1539b implements Runnable {

    /* renamed from: a */
    public final Object f2435a = new Object();

    /* renamed from: b */
    public volatile boolean f2436b;

    /* renamed from: c */
    public volatile boolean f2437c;

    /* renamed from: d */
    public boolean f2438d;

    /* renamed from: e */
    public boolean f2439e;

    /* renamed from: f */
    public int f2440f;

    /* renamed from: g */
    public MediaCodec f2441g;

    /* renamed from: h */
    public int f2442h;

    /* renamed from: i */
    public int f2443i;

    /* renamed from: j */
    public int f2444j;

    /* renamed from: k */
    public final WeakReference<C1541c> f2445k;

    /* renamed from: l */
    public final AbstractC1540a f2446l;

    /* renamed from: m */
    public ArrayBlockingQueue<byte[]> f2447m = new ArrayBlockingQueue<>(10);

    /* renamed from: n */
    public int f2448n;

    /* renamed from: o */
    public MediaCodec.BufferInfo f2449o;

    /* renamed from: p */
    public long f2450p = 0;

    /* renamed from: com.megvii.meglive_sdk.e.a.b$a */
    public interface AbstractC1540a {
        /* renamed from: a */
        void mo17111a(AbstractRunnableC1539b bVar);
    }

    public AbstractRunnableC1539b(C1541c cVar, AbstractC1540a aVar) {
        if (aVar == null) {
            throw new NullPointerException("MediaEncoderListener is null");
        } else if (cVar != null) {
            this.f2445k = new WeakReference<>(cVar);
            if (this instanceof C1542d) {
                if (cVar.f2454c == null) {
                    cVar.f2454c = this;
                } else {
                    throw new IllegalArgumentException("Video encoder already added.");
                }
            } else if (!(this instanceof C1533a)) {
                throw new IllegalArgumentException("unsupported encoder");
            } else if (cVar.f2455d == null) {
                cVar.f2455d = this;
            } else {
                throw new IllegalArgumentException("Video encoder already added.");
            }
            cVar.f2453b = (cVar.f2454c != null ? 1 : 0) + (cVar.f2455d == null ? 0 : 1);
            this.f2446l = aVar;
            synchronized (this.f2435a) {
                this.f2449o = new MediaCodec.BufferInfo();
                new Thread(this, getClass().getSimpleName()).start();
                try {
                    this.f2435a.wait();
                } catch (InterruptedException unused) {
                }
            }
        } else {
            throw new NullPointerException("MediaMuxerWrapper is null");
        }
    }

    /* renamed from: d */
    private void m2575d() {
        if (this.f2441g != null) {
            if (this.f2447m.size() > 0) {
                byte[] poll = this.f2447m.poll();
                int i = this.f2443i;
                int i2 = this.f2444j;
                byte[] bArr = new byte[(((i * i2) * 3) / 2)];
                int i3 = this.f2442h;
                if (i3 == 21 || i3 == 2130706688) {
                    bArr = m2573a(poll, this.f2443i, this.f2444j);
                } else if (i3 == 19) {
                    bArr = m2574b(poll, i, i2);
                } else {
                    C1571m.m2657c("mfx", "This color format is not yet supported, passing the NV21 frame directly to the encoder and hoping for the best!");
                }
                try {
                    ByteBuffer[] inputBuffers = this.f2441g.getInputBuffers();
                    int dequeueInputBuffer = this.f2441g.dequeueInputBuffer(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
                    if (dequeueInputBuffer >= 0) {
                        ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                        byteBuffer.clear();
                        byteBuffer.put(bArr);
                        this.f2441g.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, mo17148g(), 0);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            ByteBuffer[] outputBuffers = this.f2441g.getOutputBuffers();
            C1541c cVar = this.f2445k.get();
            if (cVar != null) {
                int i4 = 0;
                while (this.f2436b) {
                    int dequeueOutputBuffer = this.f2441g.dequeueOutputBuffer(this.f2449o, TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
                    if (dequeueOutputBuffer == -1) {
                        if (!this.f2438d && (i4 = i4 + 1) > 5) {
                            return;
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        outputBuffers = this.f2441g.getOutputBuffers();
                    } else if (dequeueOutputBuffer == -2) {
                        if (!this.f2439e) {
                            this.f2440f = cVar.mo17150a(this.f2441g.getOutputFormat());
                            this.f2439e = true;
                            if (!cVar.mo17154c()) {
                                synchronized (cVar) {
                                    while (!cVar.mo17153b()) {
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
                            MediaCodec.BufferInfo bufferInfo = this.f2449o;
                            if ((bufferInfo.flags & 2) != 0) {
                                bufferInfo.size = 0;
                            }
                            MediaCodec.BufferInfo bufferInfo2 = this.f2449o;
                            if (bufferInfo2.size != 0) {
                                if (this.f2439e) {
                                    bufferInfo2.presentationTimeUs = mo17148g();
                                    cVar.mo17152a(this.f2440f, byteBuffer2, this.f2449o);
                                    this.f2450p = this.f2449o.presentationTimeUs;
                                    i4 = 0;
                                } else {
                                    throw new RuntimeException("drain:muxer hasn't started");
                                }
                            }
                            this.f2441g.releaseOutputBuffer(dequeueOutputBuffer, false);
                            if ((this.f2449o.flags & 4) != 0) {
                                this.f2436b = false;
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
    public abstract void mo17125a();

    /* renamed from: a */
    public final boolean mo17145a(byte[] bArr) {
        synchronized (this.f2435a) {
            if (this.f2436b) {
                if (!this.f2437c) {
                    if (this.f2447m.size() >= 10) {
                        this.f2447m.poll();
                    }
                    this.f2447m.add(bArr);
                    this.f2448n++;
                    this.f2435a.notifyAll();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public void mo17126b() {
        synchronized (this.f2435a) {
            this.f2436b = true;
            this.f2437c = false;
            this.f2435a.notifyAll();
        }
    }

    /* renamed from: c */
    public void mo17127c() {
        this.f2436b = false;
        MediaCodec mediaCodec = this.f2441g;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                this.f2441g.release();
                this.f2441g = null;
            } catch (Exception unused) {
            }
        }
        if (this.f2439e) {
            WeakReference<C1541c> weakReference = this.f2445k;
            C1541c cVar = weakReference != null ? weakReference.get() : null;
            if (cVar != null) {
                try {
                    cVar.mo17155d();
                } catch (Exception unused2) {
                }
            }
        }
        this.f2449o = null;
        this.f2446l.mo17111a(this);
    }

    /* renamed from: e */
    public boolean mo17146e() {
        synchronized (this.f2435a) {
            if (this.f2436b) {
                if (!this.f2437c) {
                    this.f2448n++;
                    this.f2435a.notifyAll();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public final void mo17147f() {
        synchronized (this.f2435a) {
            if (this.f2436b) {
                if (!this.f2437c) {
                    this.f2437c = true;
                    this.f2435a.notifyAll();
                }
            }
        }
    }

    /* renamed from: g */
    public final long mo17148g() {
        long nanoTime = System.nanoTime() / 1000;
        long j = this.f2450p;
        return nanoTime < j ? nanoTime + (j - nanoTime) : nanoTime;
    }

    public void run() {
        boolean z;
        boolean z2;
        synchronized (this.f2435a) {
            this.f2437c = false;
            this.f2448n = 0;
            this.f2435a.notify();
        }
        while (true) {
            synchronized (this.f2435a) {
                z = this.f2437c;
                z2 = this.f2448n > 0;
                if (z2) {
                    this.f2448n--;
                }
            }
            if (z) {
                m2575d();
                mo17144a((ByteBuffer) null, 0, mo17148g());
                m2575d();
                mo17127c();
                break;
            } else if (z2) {
                m2575d();
            } else {
                synchronized (this.f2435a) {
                    try {
                        this.f2435a.wait();
                        try {
                        } finally {
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        synchronized (this.f2435a) {
            this.f2437c = true;
            this.f2436b = false;
        }
    }

    /* renamed from: b */
    public static byte[] m2574b(byte[] bArr, int i, int i2) {
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
    public final void mo17144a(ByteBuffer byteBuffer, int i, long j) {
        MediaCodec mediaCodec;
        if (this.f2436b && (mediaCodec = this.f2441g) != null) {
            ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
            while (this.f2436b) {
                int dequeueInputBuffer = this.f2441g.dequeueInputBuffer(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer2 = inputBuffers[dequeueInputBuffer];
                    byteBuffer2.clear();
                    if (byteBuffer != null) {
                        byteBuffer2.put(byteBuffer);
                    }
                    if (i <= 0) {
                        this.f2438d = true;
                        this.f2441g.queueInputBuffer(dequeueInputBuffer, 0, 0, j, 4);
                        return;
                    }
                    this.f2441g.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static byte[] m2573a(byte[] bArr, int i, int i2) {
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
