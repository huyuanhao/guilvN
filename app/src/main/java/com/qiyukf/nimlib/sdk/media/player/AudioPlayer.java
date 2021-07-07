package com.qiyukf.nimlib.sdk.media.player;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.p118pd.sdk.C7383o0OOO0O;
import com.qiyukf.basesdk.p119a.C1709a;
import java.io.File;

public final class AudioPlayer {
    public static final String TAG = "AudioPlayer";
    public static final int WHAT_COUNT_PLAY = 0;
    public static final int WHAT_DECODE_FAILED = 2;
    public static final int WHAT_DECODE_SUCCEED = 1;
    public AudioManager audioManager;
    public int audioStreamType;
    public String mAudioFile;
    public boolean mCanPlay;
    public Handler mHandler;
    public long mIntervalTime;
    public OnPlayListener mListener;
    public MediaPlayer mPlayer;
    public AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;

    public AudioPlayer(Context context) {
        this(context, null, null);
    }

    public AudioPlayer(Context context, String str, OnPlayListener onPlayListener) {
        this.mIntervalTime = 500;
        this.mCanPlay = false;
        this.audioStreamType = 0;
        this.mHandler = new Handler() {
            /* class com.qiyukf.nimlib.sdk.media.player.AudioPlayer.HandlerC23542 */

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    if (AudioPlayer.this.mListener != null) {
                        AudioPlayer.this.mListener.onPlaying((long) AudioPlayer.this.mPlayer.getCurrentPosition());
                    }
                    sendEmptyMessageDelayed(0, AudioPlayer.this.mIntervalTime);
                } else if (i == 1) {
                    AudioPlayer.this.startInner();
                } else if (i == 2) {
                    C1709a.m3016c(AudioPlayer.TAG, "convert() error: " + AudioPlayer.this.mAudioFile);
                }
            }
        };
        this.onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
            /* class com.qiyukf.nimlib.sdk.media.player.AudioPlayer.C23586 */

            public void onAudioFocusChange(int i) {
                C1709a.m3014b(C7383o0OOO0O.OooOOO0, "onAudioFocusChange:" + i);
                if (i != -3) {
                    if (i == -2) {
                        AudioPlayer.this.stop();
                    } else if (i == -1) {
                        AudioPlayer.this.stop();
                    } else if (i == 1 && AudioPlayer.this.isPlaying()) {
                        AudioPlayer.this.mPlayer.setVolume(1.0f, 1.0f);
                    }
                } else if (AudioPlayer.this.isPlaying()) {
                    AudioPlayer.this.mPlayer.setVolume(0.1f, 0.1f);
                }
            }
        };
        this.audioManager = (AudioManager) context.getSystemService("audio");
        this.mAudioFile = str;
        this.mListener = onPlayListener;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean convert() {
        return true;
    }

    private void deleteOnExit() {
        File file = new File(this.mAudioFile);
        if (file.exists()) {
            file.deleteOnExit();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void endPlay() {
        this.audioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mPlayer.release();
            this.mPlayer = null;
            this.mHandler.removeMessages(0);
        }
    }

    private boolean needConvert() {
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void startInner() {
        AudioManager audioManager2;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mPlayer = mediaPlayer;
        boolean z = false;
        mediaPlayer.setLooping(false);
        this.mPlayer.setAudioStreamType(this.audioStreamType);
        if (this.audioStreamType == 3) {
            audioManager2 = this.audioManager;
            z = true;
        } else {
            audioManager2 = this.audioManager;
        }
        audioManager2.setSpeakerphoneOn(z);
        this.audioManager.requestAudioFocus(this.onAudioFocusChangeListener, this.audioStreamType, 2);
        this.mPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            /* class com.qiyukf.nimlib.sdk.media.player.AudioPlayer.C23553 */

            public void onPrepared(MediaPlayer mediaPlayer) {
                C1709a.m3018d(AudioPlayer.TAG, "player:onPrepared");
                AudioPlayer.this.mHandler.sendEmptyMessage(0);
                if (AudioPlayer.this.mListener != null) {
                    AudioPlayer.this.mListener.onPrepared();
                }
            }
        });
        this.mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            /* class com.qiyukf.nimlib.sdk.media.player.AudioPlayer.C23564 */

            public void onCompletion(MediaPlayer mediaPlayer) {
                C1709a.m3018d(AudioPlayer.TAG, "player:onCompletion");
                AudioPlayer.this.endPlay();
                if (AudioPlayer.this.mListener != null) {
                    AudioPlayer.this.mListener.onCompletion();
                }
            }
        });
        this.mPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            /* class com.qiyukf.nimlib.sdk.media.player.AudioPlayer.C23575 */

            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                C1709a.m3016c(AudioPlayer.TAG, "player:onOnError");
                AudioPlayer.this.endPlay();
                if (AudioPlayer.this.mListener != null) {
                    AudioPlayer.this.mListener.onError(String.format("OnErrorListener what:%d extra:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                }
                return true;
            }
        });
        try {
            if (this.mAudioFile != null) {
                this.mPlayer.setDataSource(this.mAudioFile);
                this.mPlayer.prepare();
                this.mPlayer.start();
                C1709a.m3018d(TAG, "player:start ok---->" + this.mAudioFile);
            } else if (this.mListener != null) {
                this.mListener.onError("no datasource");
            }
        } catch (Exception e) {
            e.printStackTrace();
            C1709a.m3016c(TAG, "player:onOnError Exception\n" + e.toString());
            endPlay();
            OnPlayListener onPlayListener = this.mListener;
            if (onPlayListener != null) {
                onPlayListener.onError("Exception\n" + e.toString());
            }
        }
    }

    private void startPlay() {
        C1709a.m3018d(TAG, "start() called");
        endPlay();
        if (!this.mCanPlay) {
            Thread thread = new Thread(new Runnable() {
                /* class com.qiyukf.nimlib.sdk.media.player.AudioPlayer.RunnableC23531 */

                public void run() {
                    if (AudioPlayer.this.mHandler != null) {
                        AudioPlayer.this.mHandler.sendEmptyMessage(AudioPlayer.this.convert() ? 1 : 2);
                    }
                }
            });
            thread.setPriority(10);
            thread.start();
            return;
        }
        startInner();
    }

    public final long getCurrentPosition() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            return (long) mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public final long getDuration() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            return (long) mediaPlayer.getDuration();
        }
        return 0;
    }

    public final OnPlayListener getOnPlayListener() {
        return this.mListener;
    }

    public final boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mPlayer;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    public final void seekTo(int i) {
        this.mPlayer.seekTo(i);
    }

    public final void setDataSource(String str) {
        if (!TextUtils.equals(str, this.mAudioFile)) {
            this.mAudioFile = str;
            this.mCanPlay = !needConvert();
        }
    }

    public final void setOnPlayListener(OnPlayListener onPlayListener) {
        this.mListener = onPlayListener;
    }

    public final void start(int i) {
        this.audioStreamType = i;
        startPlay();
    }

    public final void stop() {
        if (this.mPlayer != null) {
            endPlay();
            OnPlayListener onPlayListener = this.mListener;
            if (onPlayListener != null) {
                onPlayListener.onInterrupt();
            }
        }
    }
}
