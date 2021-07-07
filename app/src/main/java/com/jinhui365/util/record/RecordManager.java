package com.jinhui365.util.record;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Handler;
import androidx.annotation.Keep;
import com.jinhui365.util.fileUtil.DiskFileUtil;
import java.io.File;

@Keep
public class RecordManager {
    public static int OooO00o = 180;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Context f15012OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static MediaPlayer.OnCompletionListener f15013OooO00o = new C5121OooO0Oo();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static MediaPlayer f15014OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static MediaRecorder.OnErrorListener f15015OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static MediaRecorder.OnInfoListener f15016OooO00o = new OooO0OO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static MediaRecorder f15017OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Handler f15018OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AbstractC5122OooO0o0 f15019OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Runnable f15020OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f15021OooO00o = "RecordManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f15022OooO00o = false;
    public static int OooO0O0 = 10;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static String f15023OooO0O0 = "file.mp3";
    public static int OooO0OO = 3;
    public static int OooO0Oo;

    public static class OooO00o implements Runnable {
        public void run() {
            if (RecordManager.OooO0Oo < 1 || new File(RecordManager.OooO00o()).exists()) {
                if (RecordManager.f15019OooO00o != null) {
                    RecordManager.f15019OooO00o.OooO00o(RecordManager.OooO0Oo);
                }
                RecordManager.OooO0O0();
                if (RecordManager.f15018OooO00o != null) {
                    RecordManager.f15018OooO00o.postDelayed(RecordManager.f15020OooO00o, 1000);
                    return;
                }
                return;
            }
            RecordManager.OooO0O0("Permission");
        }
    }

    public static class OooO0O0 implements MediaRecorder.OnErrorListener {
        public void onError(MediaRecorder mediaRecorder, int i, int i2) {
            RecordManager.OooO0O0("MediaRecorder  onError");
        }
    }

    public static class OooO0OO implements MediaRecorder.OnInfoListener {
        public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
            RecordManager.OooO0O0("MediaRecorder  onInfo");
        }
    }

    /* renamed from: com.jinhui365.util.record.RecordManager$OooO0Oo  reason: case insensitive filesystem */
    public static class C5121OooO0Oo implements MediaPlayer.OnCompletionListener {
        public void onCompletion(MediaPlayer mediaPlayer) {
            int unused = RecordManager.OooO0Oo = 0;
            RecordManager.OooO0o();
            if (RecordManager.f15019OooO00o != null) {
                RecordManager.f15019OooO00o.OooO0oO();
            }
        }
    }

    /* renamed from: com.jinhui365.util.record.RecordManager$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC5122OooO0o0 {
        void OooO00o();

        void OooO00o(int i);

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo();

        void OooO0o();

        void OooO0o0();

        void OooO0oO();

        void OooO0oo();
    }

    public static void OooO() {
        f15018OooO00o = new Handler();
        f15020OooO00o.run();
    }

    public static void OooO0OO(String str) {
        f15023OooO0O0 = str;
    }

    public static void OooO0Oo() {
        OooO0o();
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            f15014OooO00o = mediaPlayer;
            mediaPlayer.setOnCompletionListener(f15013OooO00o);
            f15014OooO00o.setDataSource(OooO00o());
            f15014OooO00o.prepare();
            f15014OooO00o.seekTo(OooO0Oo * 1000);
            f15014OooO00o.start();
            if (f15019OooO00o != null) {
                f15019OooO00o.OooO00o();
            }
            OooO();
        } catch (Exception unused) {
            OooO0o();
            OooO0Oo = 0;
            AbstractC5122OooO0o0 oooO0o0 = f15019OooO00o;
            if (oooO0o0 != null) {
                oooO0o0.OooO0o0();
            }
        }
    }

    public static void OooO0o() {
        MediaPlayer mediaPlayer = f15014OooO00o;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            f15014OooO00o = null;
        }
        OooO0o0();
    }

    public static void OooO0o0() {
        Handler handler = f15018OooO00o;
        if (handler != null) {
            handler.removeCallbacks(f15020OooO00o);
            f15018OooO00o = null;
        }
    }

    public static void OooO0oO() {
        OooO0Oo = 0;
        f15022OooO00o = false;
        MediaRecorder mediaRecorder = f15017OooO00o;
        if (mediaRecorder != null) {
            mediaRecorder.release();
            f15017OooO00o = null;
        }
        OooO0o0();
    }

    public static void OooO0oo() {
        f15019OooO00o = null;
    }

    public static void OooOO0() {
        OooO0Oo = 0;
        MediaPlayer mediaPlayer = f15014OooO00o;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Exception e) {
                e.printStackTrace();
                OooO0Oo = 0;
                AbstractC5122OooO0o0 oooO0o0 = f15019OooO00o;
                if (oooO0o0 != null) {
                    oooO0o0.OooO0o0();
                }
            }
        }
        OooO0o();
    }

    public static void OooOO0O() {
        MediaRecorder mediaRecorder = f15017OooO00o;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
                if (f15019OooO00o != null) {
                    f15019OooO00o.OooO0Oo();
                }
                OooO0oO();
            } catch (Exception e) {
                OooO0O0(e.getLocalizedMessage());
            }
        }
    }

    public static void OooO0O0(int i) {
        OooO0OO = i;
    }

    public static void OooO0OO(int i) {
        OooO0O0 = i;
    }

    public static void OooO0O0() {
        File file = new File(OooO00o());
        if (file.exists()) {
            file.delete();
        }
        f15012OooO00o = null;
    }

    public static void OooO0OO() {
        MediaPlayer mediaPlayer = f15014OooO00o;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (Exception e) {
                e.printStackTrace();
                OooO0Oo = 0;
                AbstractC5122OooO0o0 oooO0o0 = f15019OooO00o;
                if (oooO0o0 != null) {
                    oooO0o0.OooO0o0();
                }
            }
        }
        OooO0o0();
    }

    public static void OooO0O0(String str) {
        OooO0oO();
        if (f15019OooO00o == null) {
            return;
        }
        if (str.contains("Permission")) {
            f15019OooO00o.OooO0O0();
        } else {
            f15019OooO00o.OooO0oo();
        }
    }

    public static void OooO00o(int i) {
        OooO00o = i;
    }

    public static String OooO00o() {
        return DiskFileUtil.OooO0o(f15012OooO00o, "jinhui").getAbsolutePath() + File.separator + f15023OooO0O0;
    }

    public static void OooO00o(Context context) {
        f15012OooO00o = context;
        OooO0O0();
        OooO0oO();
        f15012OooO00o = context;
        try {
            MediaRecorder mediaRecorder = new MediaRecorder();
            f15017OooO00o = mediaRecorder;
            mediaRecorder.setAudioSource(1);
            f15017OooO00o.setOutputFormat(2);
            f15017OooO00o.setAudioEncoder(3);
            f15017OooO00o.setAudioChannels(1);
            f15017OooO00o.setAudioSamplingRate(44100);
            f15017OooO00o.setAudioEncodingBitRate(96000);
            f15017OooO00o.setOutputFile(OooO00o());
            f15017OooO00o.setOnErrorListener(f15015OooO00o);
            f15017OooO00o.setOnInfoListener(f15016OooO00o);
            f15017OooO00o.prepare();
            MediaRecorder mediaRecorder2 = f15017OooO00o;
            if (mediaRecorder2 != null) {
                mediaRecorder2.start();
                f15022OooO00o = true;
                AbstractC5122OooO0o0 oooO0o0 = f15019OooO00o;
                if (oooO0o0 != null) {
                    oooO0o0.OooO0OO();
                }
                OooO();
            }
        } catch (Exception e) {
            OooO0O0(e.getLocalizedMessage());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15122OooO00o() {
        MediaPlayer mediaPlayer = f15014OooO00o;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    public static void OooO00o(AbstractC5122OooO0o0 oooO0o0) {
        f15019OooO00o = oooO0o0;
    }
}
