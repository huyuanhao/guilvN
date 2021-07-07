package com.megvii.meglive_sdk.p100e.p101a.p102a;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.megvii.meglive_sdk.p100e.p101a.p102a.AbstractRunnableC1535b;
import com.megvii.meglive_sdk.p100e.p103b.RunnableC1549e;

/* renamed from: com.megvii.meglive_sdk.e.a.a.d */
public final class C1538d extends AbstractRunnableC1535b {

    /* renamed from: n */
    public static int[] f2432n = {2130708361};

    /* renamed from: o */
    public RunnableC1549e f2433o = RunnableC1549e.m2606a("MediaVideoColorEncoder");

    /* renamed from: p */
    public Surface f2434p;

    public C1538d(C1537c cVar, AbstractRunnableC1535b.AbstractC1536a aVar, int i, int i2) {
        super(cVar, aVar);
        this.f2416i = i;
        this.f2417j = i2;
    }

    @Override // com.megvii.meglive_sdk.p100e.p101a.p102a.AbstractRunnableC1535b
    /* renamed from: a */
    public final void mo17129a() {
        MediaCodecInfo mediaCodecInfo;
        String[] supportedTypes;
        this.f2413f = -1;
        this.f2411d = false;
        this.f2412e = false;
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
                    if (str.equalsIgnoreCase("video/avc") && m2569a(mediaCodecInfo, "video/avc") > 0) {
                        break loop0;
                    }
                }
                continue;
            }
            i++;
        }
        if (mediaCodecInfo != null) {
            this.f2415h = m2569a(mediaCodecInfo, "video/avc");
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f2416i, this.f2417j);
            createVideoFormat.setInteger("color-format", this.f2415h);
            createVideoFormat.setInteger("bitrate", ((int) ((((float) this.f2416i) * 13.333334f) * ((float) this.f2417j))) / 2);
            createVideoFormat.setInteger("frame-rate", 25);
            createVideoFormat.setInteger("i-frame-interval", 10);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
            this.f2414g = createEncoderByType;
            createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f2414g.start();
            AbstractRunnableC1535b.AbstractC1536a aVar = this.f2419l;
            if (aVar != null) {
                try {
                    aVar.mo17072a(this);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.megvii.meglive_sdk.p100e.p101a.p102a.AbstractRunnableC1535b
    /* renamed from: c */
    public final void mo17131c() {
        Surface surface = this.f2434p;
        if (surface != null) {
            surface.release();
            this.f2434p = null;
        }
        RunnableC1549e eVar = this.f2433o;
        if (eVar != null) {
            eVar.mo17173b();
            this.f2433o = null;
        }
        super.mo17131c();
    }

    @Override // com.megvii.meglive_sdk.p100e.p101a.p102a.AbstractRunnableC1535b
    /* renamed from: e */
    public final boolean mo17135e() {
        boolean e = super.mo17135e();
        if (e) {
            this.f2433o.mo17172a();
        }
        return e;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static int m2569a(MediaCodecInfo mediaCodecInfo, String str) {
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
