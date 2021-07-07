package com.megvii.meglive_sdk.p100e.p101a;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Environment;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.megvii.meglive_sdk.e.a.c */
public final class C1541c {

    /* renamed from: e */
    public static final SimpleDateFormat f2451e = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);

    /* renamed from: a */
    public String f2452a;

    /* renamed from: b */
    public int f2453b;

    /* renamed from: c */
    public AbstractRunnableC1539b f2454c;

    /* renamed from: d */
    public AbstractRunnableC1539b f2455d;

    /* renamed from: f */
    public final MediaMuxer f2456f;

    /* renamed from: g */
    public int f2457g;

    /* renamed from: h */
    public boolean f2458h;

    public C1541c(Context context) {
        try {
            String str = Environment.DIRECTORY_MOVIES;
            File file = new File(context.getFilesDir(), "megviiVideo");
            if (file.exists()) {
                file.delete();
            }
            file.mkdirs();
            this.f2452a = (file.canWrite() ? new File(file, "meglive_fmp_vedio".concat(".mp4")) : null).toString();
            this.f2456f = new MediaMuxer(this.f2452a, 0);
            this.f2457g = 0;
            this.f2453b = 0;
            this.f2458h = false;
        } catch (NullPointerException unused) {
            throw new RuntimeException("This app has no permission of writing external storage");
        }
    }

    /* renamed from: a */
    public final void mo17151a() {
        AbstractRunnableC1539b bVar = this.f2454c;
        if (bVar != null) {
            bVar.mo17147f();
        }
        this.f2454c = null;
        AbstractRunnableC1539b bVar2 = this.f2455d;
        if (bVar2 != null) {
            bVar2.mo17147f();
        }
        this.f2455d = null;
    }

    /* renamed from: b */
    public final synchronized boolean mo17153b() {
        return this.f2458h;
    }

    /* renamed from: c */
    public final synchronized boolean mo17154c() {
        int i = this.f2457g + 1;
        this.f2457g = i;
        if (this.f2453b > 0 && i == this.f2453b) {
            this.f2456f.start();
            this.f2458h = true;
            notifyAll();
        }
        return this.f2458h;
    }

    /* renamed from: d */
    public final synchronized void mo17155d() {
        try {
            int i = this.f2457g - 1;
            this.f2457g = i;
            if (this.f2453b > 0 && i <= 0) {
                this.f2456f.stop();
                this.f2456f.release();
                this.f2458h = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized int mo17150a(MediaFormat mediaFormat) {
        if (!this.f2458h) {
        } else {
            throw new IllegalStateException("muxer already started");
        }
        return this.f2456f.addTrack(mediaFormat);
    }

    /* renamed from: a */
    public final synchronized void mo17152a(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f2457g > 0) {
            this.f2456f.writeSampleData(i, byteBuffer, bufferInfo);
        }
    }
}
