package com.megvii.meglive_sdk.p100e.p101a;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Process;
import android.view.Surface;
import com.megvii.meglive_sdk.p100e.p101a.AbstractRunnableC1539b;
import java.nio.ByteBuffer;

/* renamed from: com.megvii.meglive_sdk.e.a.a */
public final class C1533a extends AbstractRunnableC1539b {

    /* renamed from: o */
    public static final int[] f2404o = {1, 0, 5, 7, 6};

    /* renamed from: n */
    public OooO00o f2405n = null;

    /* renamed from: com.megvii.meglive_sdk.e.a.a$OooO00o */
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
                for (int i2 : C1533a.f2404o) {
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
                        if (C1533a.this.f2436b) {
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
                            audioRecord.startRecording();
                            while (C1533a.this.f2436b && !C1533a.this.f2437c && !C1533a.this.f2438d) {
                                try {
                                    allocateDirect.clear();
                                    int read = audioRecord.read(allocateDirect, 1024);
                                    if (read > 0) {
                                        allocateDirect.position(read);
                                        allocateDirect.flip();
                                        C1533a.this.mo17144a(allocateDirect, read, C1533a.this.mo17148g());
                                        C1533a.this.mo17146e();
                                    }
                                } finally {
                                    audioRecord.stop();
                                }
                            }
                            C1533a.this.mo17146e();
                        }
                    } finally {
                        audioRecord.release();
                    }
                }
            } catch (Exception unused2) {
            }
        }

        public /* synthetic */ OooO00o(C1533a aVar, byte b) {
            this();
        }
    }

    public C1533a(C1541c cVar, AbstractRunnableC1539b.AbstractC1540a aVar) {
        super(cVar, aVar);
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
            this.f2441g = createEncoderByType;
            createEncoderByType.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f2441g.start();
        }
    }

    @Override // com.megvii.meglive_sdk.p100e.p101a.AbstractRunnableC1539b
    /* renamed from: b */
    public final void mo17126b() {
        super.mo17126b();
        if (this.f2405n == null) {
            OooO00o oooO00o = new OooO00o(this, (byte) 0);
            this.f2405n = oooO00o;
            oooO00o.start();
        }
    }

    @Override // com.megvii.meglive_sdk.p100e.p101a.AbstractRunnableC1539b
    /* renamed from: c */
    public final void mo17127c() {
        this.f2405n = null;
        super.mo17127c();
    }
}
