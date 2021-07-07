package com.megvii.meglive_sdk.p100e.p105c;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.os.Environment;
import android.view.Surface;
import com.megvii.meglive_sdk.p096b.C1515b;
import com.megvii.meglive_sdk.p106f.C1585z;
import com.p118pd.sdk.C7997oO0ooOO0;
import exocr.idcard.CameraManager;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.megvii.meglive_sdk.e.c.a */
public final class C1550a {

    /* renamed from: e */
    public static final SimpleDateFormat f2533e = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);

    /* renamed from: a */
    public C1552b f2534a;

    /* renamed from: b */
    public C1551a f2535b;

    /* renamed from: c */
    public String f2536c;

    /* renamed from: d */
    public int f2537d = 12000;

    /* renamed from: f */
    public File f2538f;

    /* renamed from: g */
    public Context f2539g;

    /* renamed from: h */
    public MediaMuxer f2540h;

    /* renamed from: i */
    public int f2541i = -1;

    /* renamed from: j */
    public int f2542j = -1;

    /* renamed from: com.megvii.meglive_sdk.e.c.a$a */
    public class C1551a {

        /* renamed from: a */
        public boolean f2543a;

        /* renamed from: b */
        public boolean f2544b;

        /* renamed from: c */
        public MediaCodec f2545c;
    }

    /* renamed from: com.megvii.meglive_sdk.e.c.a$b */
    public class C1552b {

        /* renamed from: a */
        public MediaCodec f2546a;

        /* renamed from: b */
        public int f2547b = CameraManager.OooO0O0;

        /* renamed from: c */
        public int f2548c = C7997oO0ooOO0.OooOoO;

        /* renamed from: d */
        public int f2549d = 12;

        /* renamed from: e */
        public long f2550e = 0;

        /* renamed from: f */
        public ArrayBlockingQueue<byte[]> f2551f = new ArrayBlockingQueue<>(10);

        /* renamed from: g */
        public boolean f2552g = true;

        /* renamed from: com.megvii.meglive_sdk.e.c.a$b$OooO00o */
        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            public final void run() {
                while (true) {
                    C1552b bVar = C1552b.this;
                    if (!bVar.f2552g) {
                        return;
                    }
                    if (bVar.f2551f.size() > 0) {
                        byte[] poll = C1552b.this.f2551f.poll();
                        C1552b bVar2 = C1552b.this;
                        int i = bVar2.f2547b;
                        int i2 = bVar2.f2548c;
                        int i3 = ((i * i2) * 3) / 2;
                        byte[] bArr = new byte[i3];
                        if (poll != null) {
                            int i4 = i * i2;
                            System.arraycopy(poll, 0, bArr, 0, i4);
                            for (int i5 = i4; i5 < (i4 / 2) + i4; i5 += 2) {
                                int i6 = i5 + 1;
                                bArr[i5] = poll[i6];
                                bArr[i6] = poll[i5];
                            }
                        }
                        try {
                            ByteBuffer[] inputBuffers = C1552b.this.f2546a.getInputBuffers();
                            int dequeueInputBuffer = C1552b.this.f2546a.dequeueInputBuffer(-1);
                            if (dequeueInputBuffer >= 0) {
                                C1552b bVar3 = C1552b.this;
                                ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                                byteBuffer.clear();
                                byteBuffer.put(bArr);
                                C1552b.this.f2546a.queueInputBuffer(dequeueInputBuffer, 0, i3, ((C1552b.this.f2550e * 1000000) / ((long) bVar3.f2549d)) + 132, 0);
                                C1552b.this.f2550e++;
                            }
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            int dequeueOutputBuffer = C1552b.this.f2546a.dequeueOutputBuffer(bufferInfo, (long) C1550a.this.f2537d);
                            if (dequeueOutputBuffer == -2) {
                                C1550a.this.m2612a((C1550a) C1552b.this.f2546a.getOutputFormat());
                            } else {
                                ByteBuffer[] outputBuffers = C1552b.this.f2546a.getOutputBuffers();
                                while (dequeueOutputBuffer >= 0) {
                                    ByteBuffer byteBuffer2 = outputBuffers[dequeueOutputBuffer];
                                    if ((bufferInfo.flags & 2) != 0) {
                                        bufferInfo.size = 0;
                                    }
                                    if (bufferInfo.size != 0) {
                                        byteBuffer2.position(bufferInfo.offset);
                                        byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                                        C1550a.this.m2615a((C1550a) byteBuffer2, (ByteBuffer) bufferInfo);
                                    }
                                    C1552b.this.f2546a.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    dequeueOutputBuffer = C1552b.this.f2546a.dequeueOutputBuffer(bufferInfo, (long) C1550a.this.f2537d);
                                }
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            }
        }

        public C1552b() {
            this.f2549d = ((Integer) C1585z.m2695b(C1550a.this.f2539g, C1515b.f2112b, 10)).intValue();
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", CameraManager.OooO0O0, C7997oO0ooOO0.OooOoO);
            createVideoFormat.setInteger("color-format", 21);
            double d = (double) this.f2549d;
            Double.isNaN(d);
            double d2 = (double) this.f2547b;
            Double.isNaN(d2);
            double d3 = d * 0.25d * d2;
            double d4 = (double) this.f2548c;
            Double.isNaN(d4);
            createVideoFormat.setInteger("bitrate", (int) (d3 * d4));
            createVideoFormat.setInteger("frame-rate", this.f2549d);
            createVideoFormat.setInteger("i-frame-interval", 10);
            try {
                this.f2546a = MediaCodec.createEncoderByType("video/avc");
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f2546a.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f2546a.start();
            this.f2552g = true;
            this.f2550e = 0;
            new Thread(new OooO00o()).start();
        }
    }

    public C1550a(Context context) {
        try {
            this.f2539g = context;
            try {
                String str = Environment.DIRECTORY_MOVIES;
                File externalFilesDir = context.getExternalFilesDir("megviiVideo");
                this.f2538f = externalFilesDir;
                if (externalFilesDir.exists()) {
                    this.f2538f.delete();
                }
                this.f2538f.mkdirs();
                this.f2536c = (this.f2538f.canWrite() ? new File(this.f2538f, "meglive_fmp_vedio".concat(".mp4")) : null).toString();
                this.f2540h = new MediaMuxer(this.f2536c, 0);
            } catch (NullPointerException unused) {
                throw new RuntimeException("This app has no permission of writing external storage");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private synchronized void m2612a(MediaFormat mediaFormat) {
        int addTrack = this.f2540h.addTrack(mediaFormat);
        this.f2541i = addTrack;
        if (this.f2534a == null || this.f2535b == null || !(addTrack == -1 || this.f2542j == -1)) {
            this.f2540h.start();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private synchronized void m2615a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f2540h.writeSampleData(this.f2541i, byteBuffer, bufferInfo);
    }

    /* renamed from: a */
    public static boolean m2616a() {
        String[] supportedTypes;
        if (Build.VERSION.SDK_INT >= 18) {
            for (int codecCount = MediaCodecList.getCodecCount() - 1; codecCount >= 0; codecCount--) {
                for (String str : MediaCodecList.getCodecInfoAt(codecCount).getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
