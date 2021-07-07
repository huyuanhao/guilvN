package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

/* renamed from: com.megvii.meglive_sdk.f.n */
public final class C1572n {

    /* renamed from: a */
    public MediaPlayer f2609a = new MediaPlayer();

    /* renamed from: b */
    public Context f2610b;

    /* renamed from: com.megvii.meglive_sdk.f.n$OooO00o */
    public class OooO00o implements MediaPlayer.OnPreparedListener {
        public OooO00o() {
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            C1572n.this.f2609a.start();
        }
    }

    public C1572n(Context context) {
        this.f2610b = context;
    }

    /* renamed from: a */
    public final void mo17190a() {
        try {
            this.f2610b = null;
            if (this.f2609a != null) {
                this.f2609a.reset();
                this.f2609a.release();
                this.f2609a = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo17192b() {
        try {
            if (this.f2609a != null) {
                this.f2609a.reset();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo17191a(int i) {
        MediaPlayer mediaPlayer = this.f2609a;
        if (mediaPlayer != null && i > 0) {
            try {
                mediaPlayer.reset();
                AssetFileDescriptor openRawResourceFd = this.f2610b.getResources().openRawResourceFd(i);
                this.f2609a.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                this.f2609a.setOnPreparedListener(new OooO00o());
                this.f2609a.prepareAsync();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
