package com.megvii.meglive_sdk.p100e.p101a.p102a;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Process;
import android.view.Surface;
import com.megvii.meglive_sdk.p100e.p101a.p102a.AbstractRunnableC1535b;
import java.nio.ByteBuffer;

/* renamed from: com.megvii.meglive_sdk.e.a.a.a */
public final class C1534a extends AbstractRunnableC1535b {

    /* renamed from: o */
    public static final int[] f2406o = {1, 0, 5, 7, 6};

    /* renamed from: n */
    public OooO00o f2407n = null;

    /* renamed from: com.megvii.meglive_sdk.e.a.a.a$OooO00o */
    public class OooO00o extends Thread {
        public OooO00o() {
        }

        public final void run() {
            Process.setThreadPriority(-19);
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
                int i = 25600;
                if (25600 < minBufferSize) {
                    i = ((minBufferSize / 1024) + 1) * 1024 * 2;
                }
                AudioRecord audioRecord = null;
                for (int i2 : C1534a.f2406o) {
                    try {
                        AudioRecord audioRecord2 = new AudioRecord(i2, 44100, 16, 2, i);
                        if (audioRecord2.getState() != 1) {
                            audioRecord2 = null;
                        }
                        audioRecord = audioRecord2;
                    } catch (Exception unused) {
                        audioRecord = null;
                    }
                    if (audioRecord != null) {
                        break;
                    }
                }
                if (audioRecord != null) {
                    try {
                        if (C1534a.this.f2409b) {
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
                            audioRecord.startRecording();
                            while (C1534a.this.f2409b && !C1534a.this.f2410c && !C1534a.this.f2411d) {
                                try {
                                    allocateDirect.clear();
                                    int read = audioRecord.read(allocateDirect, 1024);
                                    if (read > 0) {
                                        allocateDirect.position(read);
                                        allocateDirect.flip();
                                        C1534a.this.mo17133a(allocateDirect, read, C1534a.this.mo17137g());
                                        C1534a.this.mo17135e();
                                    }
                                } finally {
                                    audioRecord.stop();
                                }
                            }
                            C1534a.this.mo17135e();
                        }
                    } finally {
                        audioRecord.release();
                    }
                }
            } catch (Exception unused2) {
            }
        }

        public /* synthetic */ OooO00o(C1534a aVar, byte b) {
            this();
        }
    }

    public C1534a(C1537c cVar, AbstractRunnableC1535b.AbstractC1536a aVar) {
        super(cVar, aVar);
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
                    if (str.equalsIgnoreCase("audio/mp4a-latm")) {
                        break loop0;
                    }
                }
                continue;
            }
            i++;
        }
        if (mediaCodecInfo != null) {
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 1);
            createAudioFormat.setInteger("aac-profile", 2);
            createAudioFormat.setInteger("channel-mask", 16);
            createAudioFormat.setInteger("bitrate", 64000);
            createAudioFormat.setInteger("channel-count", 1);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.f2414g = createEncoderByType;
            createEncoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
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
    /* renamed from: b */
    public final void mo17130b() {
        super.mo17130b();
        if (this.f2407n == null) {
            OooO00o oooO00o = new OooO00o(this, (byte) 0);
            this.f2407n = oooO00o;
            oooO00o.start();
        }
    }

    @Override // com.megvii.meglive_sdk.p100e.p101a.p102a.AbstractRunnableC1535b
    /* renamed from: c */
    public final void mo17131c() {
        this.f2407n = null;
        super.mo17131c();
    }
}
