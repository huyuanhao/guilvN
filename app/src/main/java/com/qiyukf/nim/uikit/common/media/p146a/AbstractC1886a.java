package com.qiyukf.nim.uikit.common.media.p146a;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.sdk.media.player.AudioPlayer;
import com.qiyukf.nimlib.sdk.media.player.OnPlayListener;
import com.qiyukf.unicorn.C2364R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.common.media.a.a */
public abstract class AbstractC1886a<T> {

    /* renamed from: a */
    public boolean f3477a = true;

    /* renamed from: b */
    public final List<AbstractC1889a> f3478b = new ArrayList();

    /* renamed from: c */
    public Context f3479c;

    /* renamed from: d */
    public AudioPlayer f3480d;

    /* renamed from: e */
    public AbstractC1891b f3481e;

    /* renamed from: f */
    public boolean f3482f = false;

    /* renamed from: g */
    public long f3483g;

    /* renamed from: h */
    public Handler f3484h = new Handler();

    /* renamed from: i */
    public Runnable f3485i = new Runnable() {
        /* class com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a.RunnableC18882 */

        public final void run() {
            AbstractC1886a aVar = AbstractC1886a.this;
            AudioPlayer audioPlayer = aVar.f3480d;
            if (audioPlayer == null) {
                C1709a.m3011a("AudioRecorder", "playRunnable run when currentAudioPlayer == null");
            } else {
                audioPlayer.start(aVar.f3491o);
            }
        }
    };

    /* renamed from: j */
    public int f3486j;

    /* renamed from: k */
    public MediaPlayer f3487k = null;

    /* renamed from: l */
    public boolean f3488l = false;

    /* renamed from: m */
    public AbstractC1886a<T>.C1890b f3489m = null;

    /* renamed from: n */
    public int f3490n;

    /* renamed from: o */
    public int f3491o;

    /* renamed from: com.qiyukf.nim.uikit.common.media.a.a$a */
    public interface AbstractC1889a {
        /* renamed from: a */
        void mo34202a(AbstractC1891b bVar);

        /* renamed from: b */
        void mo34203b(AbstractC1891b bVar);
    }

    /* renamed from: com.qiyukf.nim.uikit.common.media.a.a$b */
    public class C1890b implements OnPlayListener {

        /* renamed from: a */
        public AudioPlayer f3494a;

        /* renamed from: b */
        public AbstractC1891b f3495b;

        public C1890b(AudioPlayer audioPlayer, AbstractC1891b bVar) {
            this.f3494a = audioPlayer;
            this.f3495b = bVar;
        }

        /* renamed from: a */
        public final boolean mo34204a() {
            return AbstractC1886a.this.f3480d == this.f3494a;
        }

        @Override // com.qiyukf.nimlib.sdk.media.player.OnPlayListener
        public void onCompletion() {
            if (mo34204a()) {
                AbstractC1886a.this.mo34194c();
                AbstractC1886a aVar = AbstractC1886a.this;
                aVar.mo34193b(aVar.f3481e);
                AbstractC1886a.this.mo34187a();
            }
        }

        @Override // com.qiyukf.nimlib.sdk.media.player.OnPlayListener
        public void onError(String str) {
            if (mo34204a()) {
                AbstractC1886a.this.mo34194c();
                AbstractC1886a aVar = AbstractC1886a.this;
                aVar.mo34193b(aVar.f3481e);
            }
        }

        @Override // com.qiyukf.nimlib.sdk.media.player.OnPlayListener
        public void onInterrupt() {
            if (mo34204a()) {
                AbstractC1886a.this.mo34194c();
                AbstractC1886a aVar = AbstractC1886a.this;
                aVar.mo34193b(aVar.f3481e);
            }
        }

        @Override // com.qiyukf.nimlib.sdk.media.player.OnPlayListener
        public void onPlaying(long j) {
            if (mo34204a()) {
                AbstractC1886a.this.mo34199h();
            }
        }

        @Override // com.qiyukf.nimlib.sdk.media.player.OnPlayListener
        public void onPrepared() {
            if (mo34204a()) {
                AbstractC1886a.this.f3486j = 2;
                AbstractC1886a aVar = AbstractC1886a.this;
                if (aVar.f3482f) {
                    aVar.f3482f = false;
                    this.f3494a.seekTo((int) aVar.f3483g);
                }
            }
        }
    }

    public AbstractC1886a(Context context) {
        this.f3479c = context;
        this.f3488l = true;
    }

    /* renamed from: a */
    private void m3614a(int i) {
        if (this.f3480d.isPlaying()) {
            this.f3483g = this.f3480d.getCurrentPosition();
            this.f3482f = true;
            this.f3491o = i;
            this.f3480d.start(i);
            return;
        }
        this.f3491o = this.f3490n;
    }

    /* renamed from: a */
    public final void mo34187a() {
        if (this.f3488l) {
            MediaPlayer create = MediaPlayer.create(this.f3479c, C2364R.raw.ysf_audio_end_tip);
            this.f3487k = create;
            create.setLooping(false);
            this.f3487k.setAudioStreamType(3);
            this.f3487k.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                /* class com.qiyukf.nim.uikit.common.media.p146a.AbstractC1886a.C18871 */

                public final void onCompletion(MediaPlayer mediaPlayer) {
                    AbstractC1886a.this.f3487k.release();
                    AbstractC1886a.this.f3487k = null;
                }
            });
            this.f3487k.start();
        }
    }

    /* renamed from: a */
    public final void mo34188a(AbstractC1889a aVar) {
        synchronized (this.f3478b) {
            this.f3478b.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo34189a(AbstractC1891b bVar) {
        AbstractC1886a<T>.C1890b bVar2 = new C1890b(this.f3480d, bVar);
        this.f3489m = bVar2;
        this.f3480d.setOnPlayListener(bVar2);
    }

    /* renamed from: a */
    public final boolean mo34190a(AbstractC1891b bVar, int i, boolean z, long j) {
        String b = bVar.mo34212b();
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        if (mo34195d()) {
            mo34196e();
            if (this.f3481e.mo34211a(bVar)) {
                return false;
            }
        }
        this.f3486j = 0;
        this.f3481e = bVar;
        AudioPlayer audioPlayer = new AudioPlayer(this.f3479c);
        this.f3480d = audioPlayer;
        audioPlayer.setDataSource(b);
        mo34189a(this.f3481e);
        if (z) {
            this.f3490n = i;
        }
        this.f3491o = i;
        this.f3484h.postDelayed(this.f3485i, j);
        this.f3486j = 1;
        AbstractC1891b bVar2 = this.f3481e;
        synchronized (this.f3478b) {
            for (AbstractC1889a aVar : this.f3478b) {
                aVar.mo34202a(bVar2);
            }
        }
        return true;
    }

    /* renamed from: b */
    public final int mo34191b() {
        return this.f3491o;
    }

    /* renamed from: b */
    public final void mo34192b(AbstractC1889a aVar) {
        synchronized (this.f3478b) {
            this.f3478b.remove(aVar);
        }
    }

    /* renamed from: b */
    public final void mo34193b(AbstractC1891b bVar) {
        synchronized (this.f3478b) {
            for (AbstractC1889a aVar : this.f3478b) {
                aVar.mo34203b(bVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo34194c() {
        this.f3480d.setOnPlayListener(null);
        this.f3480d = null;
        this.f3486j = 0;
    }

    /* renamed from: d */
    public final boolean mo34195d() {
        if (this.f3480d == null) {
            return false;
        }
        int i = this.f3486j;
        return i == 2 || i == 1;
    }

    /* renamed from: e */
    public void mo34196e() {
        int i = this.f3486j;
        if (i == 2) {
            this.f3480d.stop();
        } else if (i == 1) {
            this.f3484h.removeCallbacks(this.f3485i);
            mo34194c();
            mo34193b(this.f3481e);
        }
    }

    /* renamed from: f */
    public final boolean mo34197f() {
        if (!mo34195d() || this.f3491o == 0) {
            return false;
        }
        m3614a(0);
        return true;
    }

    /* renamed from: g */
    public final boolean mo34198g() {
        int i;
        if (!mo34195d() || (i = this.f3490n) == this.f3491o) {
            return false;
        }
        m3614a(i);
        return true;
    }

    /* renamed from: h */
    public final void mo34199h() {
        synchronized (this.f3478b) {
            Iterator<AbstractC1889a> it = this.f3478b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
