package com.megvii.meglive_sdk.p100e.p101a.p102a;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Environment;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.megvii.meglive_sdk.e.a.a.c */
public final class C1537c {

    /* renamed from: e */
    public static final SimpleDateFormat f2424e = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);

    /* renamed from: a */
    public String f2425a;

    /* renamed from: b */
    public int f2426b;

    /* renamed from: c */
    public AbstractRunnableC1535b f2427c;

    /* renamed from: d */
    public AbstractRunnableC1535b f2428d;

    /* renamed from: f */
    public final MediaMuxer f2429f;

    /* renamed from: g */
    public int f2430g;

    /* renamed from: h */
    public boolean f2431h;

    public C1537c(Context context) {
        try {
            String str = Environment.DIRECTORY_MOVIES;
            File externalFilesDir = context.getExternalFilesDir("megviiVideo");
            if (externalFilesDir.exists()) {
                externalFilesDir.delete();
            }
            externalFilesDir.mkdirs();
            this.f2425a = (externalFilesDir.canWrite() ? new File(externalFilesDir, "meglive_flash_vedio".concat(".mp4")) : null).toString();
            this.f2429f = new MediaMuxer(this.f2425a, 0);
            this.f2430g = 0;
            this.f2426b = 0;
            this.f2431h = false;
        } catch (NullPointerException unused) {
            throw new RuntimeException("This app has no permission of writing external storage");
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo17141a() {
        return this.f2431h;
    }

    /* renamed from: b */
    public final synchronized boolean mo17142b() {
        int i = this.f2430g + 1;
        this.f2430g = i;
        if (this.f2426b > 0 && i == this.f2426b) {
            this.f2429f.start();
            this.f2431h = true;
            notifyAll();
        }
        return this.f2431h;
    }

    /* renamed from: c */
    public final synchronized void mo17143c() {
        try {
            int i = this.f2430g - 1;
            this.f2430g = i;
            if (this.f2426b > 0 && i <= 0) {
                this.f2429f.stop();
                this.f2429f.release();
                this.f2431h = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized int mo17139a(MediaFormat mediaFormat) {
        if (!this.f2431h) {
        } else {
            throw new IllegalStateException("muxer already started");
        }
        return this.f2429f.addTrack(mediaFormat);
    }

    /* renamed from: a */
    public final synchronized void mo17140a(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f2430g > 0) {
            this.f2429f.writeSampleData(i, byteBuffer, bufferInfo);
        }
    }
}
