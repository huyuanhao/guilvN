package com.megvii.meglive_sdk.p100e.p101a;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.megvii.meglive_sdk.p100e.p101a.AbstractRunnableC1539b;
import com.megvii.meglive_sdk.p100e.p103b.RunnableC1549e;

/* renamed from: com.megvii.meglive_sdk.e.a.d */
public final class C1542d extends AbstractRunnableC1539b {

    /* renamed from: n */
    public static int[] f2459n = {2130708361};

    /* renamed from: o */
    public RunnableC1549e f2460o = RunnableC1549e.m2606a("MediaVideoEncoder");

    /* renamed from: p */
    public Surface f2461p;

    public C1542d(C1541c cVar, AbstractRunnableC1539b.AbstractC1540a aVar, int i, int i2) {
        super(cVar, aVar);
        this.f2443i = i;
        this.f2444j = i2;
    }

    @Override // com.megvii.meglive_sdk.p100e.p101a.AbstractRunnableC1539b
    /* renamed from: a */
    public final void mo17125a() {
        MediaCodecInfo mediaCodecInfo;
        String[] supportedTypes;
        this.f2440f = -1;
        this.f2438d = false;
        this.f2439e = false;
        int codecCount = MediaCodecList.getCodecCount();
        int i = 0;
        loop0:
        while (true) {
            if (i >= codecCount) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc") && m2591a(mediaCodecInfo, "video/avc") > 0) {
                        break loop0;
                    }
                }
                continue;
            }
            i++;
        }
        if (mediaCodecInfo != null) {
            this.f2442h = m2591a(mediaCodecInfo, "video/avc");
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f2443i, this.f2444j);
            createVideoFormat.setInteger("color-format", this.f2442h);
            createVideoFormat.setInteger("bitrate", ((int) ((((float) this.f2443i) * 13.333334f) * ((float) this.f2444j))) / 2);
            createVideoFormat.setInteger("frame-rate", 25);
            createVideoFormat.setInteger("i-frame-interval", 10);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
            this.f2441g = createEncoderByType;
            createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f2441g.start();
        }
    }

    @Override // com.megvii.meglive_sdk.p100e.p101a.AbstractRunnableC1539b
    /* renamed from: c */
    public final void mo17127c() {
        Surface surface = this.f2461p;
        if (surface != null) {
            surface.release();
            this.f2461p = null;
        }
        RunnableC1549e eVar = this.f2460o;
        if (eVar != null) {
            eVar.mo17173b();
            this.f2460o = null;
        }
        super.mo17127c();
    }

    @Override // com.megvii.meglive_sdk.p100e.p101a.AbstractRunnableC1539b
    /* renamed from: e */
    public final boolean mo17146e() {
        boolean e = super.mo17146e();
        if (e) {
            this.f2460o.mo17172a();
        }
        return e;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static int m2591a(MediaCodecInfo mediaCodecInfo, String str) {
        int i;
        try {
            Thread.currentThread().setPriority(10);
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Thread.currentThread().setPriority(5);
            int i2 = 0;
            while (true) {
                int[] iArr = capabilitiesForType.colorFormats;
                if (i2 >= iArr.length) {
                    return 0;
                }
                i = iArr[i2];
                if (i == 19 || i == 21 || i == 2130706688) {
                    return i;
                }
                i2++;
            }
            return i;
        } catch (Throwable th) {
            Thread.currentThread().setPriority(5);
            throw th;
        }
    }
}
