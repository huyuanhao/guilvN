package com.qiyukf.nimlib.sdk.media.record;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.C2364R;
import java.io.File;

public class AudioRecorder {
    public static final int DEFAULT_MAX_AUDIO_RECORD_TIME_SECOND = 60;
    public static final String TAG = "AudioRecordManager";
    public File audioFile;
    public AudioManager audioManager;
    public boolean cancelRecord = false;

    /* renamed from: cb */
    public IAudioRecordCallback f4718cb;
    public Context context;
    public MediaRecorder.OnErrorListener errorListener = new MediaRecorder.OnErrorListener() {
        /* class com.qiyukf.nimlib.sdk.media.record.AudioRecorder.C23613 */

        public void onError(MediaRecorder mediaRecorder, int i, int i2) {
            AudioRecorder.this.mUiHandler.removeCallbacks(AudioRecorder.this.recordingUpdateUI);
            AudioRecorder.this.handleEndRecord(false, 0);
        }
    };
    public MediaRecorder.OnInfoListener infoListener = new MediaRecorder.OnInfoListener() {
        /* class com.qiyukf.nimlib.sdk.media.record.AudioRecorder.C23602 */

        public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
            if (i == 800) {
                AudioRecorder.this.recordTime = 0;
                AudioRecorder audioRecorder = AudioRecorder.this;
                audioRecorder.handleReachedMaxRecordTime(audioRecorder.maxDuration * 1000);
            }
        }
    };
    public Handler mUiHandler = new Handler(Looper.getMainLooper());
    public int maxDuration;
    public MediaRecorder mediaRecorder;
    public long recordTime = 0;
    public RecordType recordType;
    public Runnable recordingUpdateUI = new Runnable() {
        /* class com.qiyukf.nimlib.sdk.media.record.AudioRecorder.RunnableC23624 */

        public void run() {
            if (AudioRecorder.this.mediaRecorder != null && AudioRecorder.this.f4718cb != null) {
                AudioRecorder.this.f4718cb.onUpdateAmplitude(AudioRecorder.this.mediaRecorder.getMaxAmplitude());
                AudioRecorder.this.mUiHandler.postDelayed(this, 100);
            }
        }
    };
    public File tempFile;

    public AudioRecorder(Context context2, RecordType recordType2, int i, IAudioRecordCallback iAudioRecordCallback) {
        this.context = context2.getApplicationContext();
        setRecordType(recordType2);
        if (i <= 0) {
            this.maxDuration = 60;
        } else {
            this.maxDuration = i;
        }
        this.f4718cb = iAudioRecordCallback;
        this.audioManager = (AudioManager) context2.getSystemService("audio");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void handleReachedMaxRecordTime(int i) {
        this.f4718cb.onRecordReachedMaxTime(i);
        this.mUiHandler.removeCallbacks(this.recordingUpdateUI);
        stop();
        C1806a.m3414c(this.tempFile.getAbsolutePath());
    }

    private void setRecordType(RecordType recordType2) {
        RecordType recordType3;
        if (Build.VERSION.SDK_INT >= 10 || recordType2 == (recordType3 = RecordType.AMR)) {
            this.recordType = recordType2;
        } else {
            this.recordType = recordType3;
        }
    }

    private void stop() {
        final MediaRecorder mediaRecorder2 = this.mediaRecorder;
        this.mediaRecorder = null;
        C1805a.m3403a().mo34073c().post(new Runnable() {
            /* class com.qiyukf.nimlib.sdk.media.record.AudioRecorder.RunnableC23635 */

            public void run() {
                try {
                    mediaRecorder2.setOnErrorListener(null);
                    mediaRecorder2.setOnInfoListener(null);
                    mediaRecorder2.setPreviewDisplay(null);
                    mediaRecorder2.stop();
                } catch (Exception e) {
                    C1709a.m3016c("AudioRecorder:", "stop is error" + e);
                }
            }
        });
    }

    public void completeRecord(boolean z) {
        if (isRecording()) {
            this.cancelRecord = z;
            this.audioManager.abandonAudioFocus(null);
            if (this.mediaRecorder != null) {
                this.mUiHandler.removeCallbacks(this.recordingUpdateUI);
                stop();
                handleEndRecord(true, (int) (System.currentTimeMillis() - this.recordTime));
            }
            this.recordTime = 0;
            C1806a.m3414c(this.tempFile.getAbsolutePath());
        }
    }

    public void handleEndRecord(boolean z, final int i) {
        if (this.cancelRecord) {
            this.f4718cb.onRecordCancel();
        } else if (!z) {
            this.f4718cb.onRecordFail();
        } else {
            this.mUiHandler.postDelayed(new Runnable() {
                /* class com.qiyukf.nimlib.sdk.media.record.AudioRecorder.RunnableC23591 */

                public void run() {
                    C1806a.m3408a(AudioRecorder.this.tempFile.getAbsolutePath(), AudioRecorder.this.audioFile.getAbsolutePath());
                    if (AudioRecorder.this.audioFile == null || !AudioRecorder.this.audioFile.exists() || AudioRecorder.this.audioFile.length() <= 0 || i < 400) {
                        AudioRecorder.this.f4718cb.onRecordFail();
                    } else {
                        AudioRecorder.this.f4718cb.onRecordSuccess(AudioRecorder.this.audioFile, (long) i, AudioRecorder.this.recordType);
                    }
                }
            }, 500);
        }
    }

    public boolean isRecording() {
        return this.recordTime > 0;
    }

    public boolean startRecord() {
        this.audioManager.requestAudioFocus(null, 0, 2);
        if (isRecording()) {
            C1709a.m3011a("AudioRecorder", "AudioRecordManager startRecord false, as current state is isRecording");
            return false;
        } else if (!C2349d.m5128a(EnumC2347c.TYPE_AUDIO)) {
            C1709a.m3011a("AudioRecorder", "AudioRecordManager startRecord false, as has no enough space to write");
            C1865f.m3559b(C2364R.string.ysf_picker_image_sdcard_not_enough_error);
            return false;
        } else {
            int outputFormat = this.recordType.getOutputFormat();
            String a = C2349d.m5123a(C1853d.m3514a() + outputFormat, EnumC2347c.TYPE_AUDIO);
            String a2 = C2349d.m5123a(C1853d.m3514a() + outputFormat, EnumC2347c.TYPE_AUDIO);
            if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a2)) {
                C1709a.m3011a("AudioRecorder", "AudioRecordManager startRecord false, as outputFilePath is empty");
                return false;
            }
            this.audioFile = new File(a2 + this.recordType.getFileSuffix());
            this.tempFile = new File(a);
            this.cancelRecord = false;
            try {
                MediaRecorder mediaRecorder2 = new MediaRecorder();
                this.mediaRecorder = mediaRecorder2;
                mediaRecorder2.setOnInfoListener(this.infoListener);
                this.mediaRecorder.setOnErrorListener(this.errorListener);
                this.mediaRecorder.setAudioSource(1);
                this.mediaRecorder.setOutputFormat(this.recordType.getOutputFormat());
                this.mediaRecorder.setAudioEncoder(this.recordType.getAudioEncoder());
                this.mediaRecorder.setOutputFile(this.tempFile.getPath());
                this.mediaRecorder.setMaxDuration(this.maxDuration * 1000);
                if (!this.cancelRecord) {
                    this.f4718cb.onRecordReady();
                    this.mediaRecorder.prepare();
                    this.mediaRecorder.start();
                    this.recordTime = System.currentTimeMillis();
                    this.f4718cb.onRecordStart(this.tempFile, this.recordType);
                    this.mUiHandler.post(this.recordingUpdateUI);
                }
            } catch (Exception e) {
                C1865f.m3557a("请授予语音权限");
                C1709a.m3016c("AudioRecorder:", "startRecord is error" + e);
            }
            return isRecording();
        }
    }
}
