package com.jinhui365.util.video;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;
import androidx.annotation.Keep;
import com.baidu.idl.face.platform.p025ui.utils.CameraUtils;
import com.jinhui365.util.fileUtil.DiskFileUtil;
import com.p118pd.sdk.C8734oo0oOOO;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Keep
public class VideoUtil implements Camera.PreviewCallback {
    public static Handler OooO00o = null;
    public static final float OooO0Oo = 0.33f;
    public static final float OooO0o = 0.2f;
    public static final float OooO0o0 = 0.1f;
    public static String o0ooOoO = "video.mp4";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f15024OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f15025OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Camera f15026OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MediaPlayer f15027OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MediaRecorder f15028OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SurfaceHolder.Callback f15029OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SurfaceView f15030OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5123OooO0Oo f15031OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f15032OooO00o = new OooO0OO();
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f15033OooO0Oo = false;
    public int o00oO0O = 60;
    public int o0OOO0o;
    public int o0ooOO0 = 10;
    public int o0ooOOo = 0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public final String f15034o0ooOOo = CameraUtils.TAG;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public int f15035o0ooOoO;

    public class OooO00o implements SurfaceHolder.Callback {
        public OooO00o() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (!VideoUtil.this.f15033OooO0Oo) {
                VideoUtil.this.OooO00o((VideoUtil) surfaceHolder);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                if (VideoUtil.this.f15033OooO0Oo) {
                    VideoUtil.this.OooO0oo();
                    return;
                }
                VideoUtil.this.f15026OooO00o = Camera.open(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            VideoUtil.this.OooO0OO();
        }
    }

    public class OooO0O0 implements MediaPlayer.OnCompletionListener {
        public OooO0O0() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            if (VideoUtil.this.f15031OooO00o != null) {
                VideoUtil.this.f15031OooO00o.OooO0oO();
            }
            VideoUtil.this.o0ooOOo = 0;
            VideoUtil.this.OooO();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public void run() {
            if (VideoUtil.this.o0ooOOo < 1 || new File(VideoUtil.this.m15123OooO00o()).exists()) {
                if (VideoUtil.this.f15031OooO00o != null) {
                    VideoUtil.this.f15031OooO00o.OooO00o(VideoUtil.this.o0ooOOo);
                }
                VideoUtil.OooO0O0(VideoUtil.this);
                if (VideoUtil.this.o0ooOOo > VideoUtil.this.o00oO0O) {
                    VideoUtil.this.OooO0oO();
                } else if (VideoUtil.OooO00o != null) {
                    VideoUtil.OooO00o.postDelayed(VideoUtil.this.f15032OooO00o, 1000);
                }
            } else {
                VideoUtil.this.OooO0O0((VideoUtil) "Permission");
            }
        }
    }

    /* renamed from: com.jinhui365.util.video.VideoUtil$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC5123OooO0Oo {
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

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO() {
        Handler handler = OooO00o;
        if (handler != null) {
            handler.removeCallbacks(this.f15032OooO00o);
            OooO00o = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0oo() {
        if (this.f15027OooO00o == null) {
            this.f15027OooO00o = new MediaPlayer();
        }
        this.f15027OooO00o.reset();
        MediaPlayer create = MediaPlayer.create(this.f15024OooO00o, Uri.parse(m15123OooO00o()));
        this.f15027OooO00o = create;
        create.setAudioStreamType(3);
        this.f15027OooO00o.setDisplay(this.f15030OooO00o.getHolder());
        this.f15027OooO00o.setOnCompletionListener(new OooO0O0());
        this.f15027OooO00o.start();
        this.f15027OooO00o.pause();
    }

    private void OooOO0() {
        OooO00o = new Handler();
        this.f15032OooO00o.run();
    }

    public void OooO00o(byte[] bArr, Rect rect, Rect rect2) {
    }

    public void OooO0Oo() {
        this.f15031OooO00o = null;
    }

    public void OooO0o() {
        if (this.f15026OooO00o == null) {
            Toast.makeText(this.f15024OooO00o, "摄像头权限未开启", 0).show();
            return;
        }
        File file = new File(m15123OooO00o());
        if (file.exists()) {
            file.delete();
        }
        try {
            this.f15026OooO00o.unlock();
            MediaRecorder mediaRecorder = new MediaRecorder();
            this.f15028OooO00o = mediaRecorder;
            mediaRecorder.setCamera(this.f15026OooO00o);
            this.f15028OooO00o.setAudioSource(5);
            this.f15028OooO00o.setVideoSource(1);
            this.f15028OooO00o.setOutputFormat(2);
            this.f15028OooO00o.setAudioEncoder(3);
            this.f15028OooO00o.setVideoEncoder(2);
            this.f15028OooO00o.setVideoEncodingBitRate(1048576);
            this.f15028OooO00o.setVideoSize(1280, 720);
            this.f15028OooO00o.setVideoFrameRate(30);
            this.f15028OooO00o.setOutputFile(m15123OooO00o());
            this.f15028OooO00o.setPreviewDisplay(this.f15030OooO00o.getHolder().getSurface());
            this.f15028OooO00o.setOrientationHint(270);
            this.f15028OooO00o.prepare();
            MediaRecorder mediaRecorder2 = this.f15028OooO00o;
            if (mediaRecorder2 != null) {
                mediaRecorder2.start();
                this.OooO0O0 = true;
                AbstractC5123OooO0Oo oooO0Oo = this.f15031OooO00o;
                if (oooO0Oo != null) {
                    oooO0Oo.OooO0OO();
                }
                OooOO0();
            }
        } catch (IOException e) {
            OooO0O0(e.getLocalizedMessage());
        }
    }

    public void OooO0o0() {
        OooO0OO();
        this.f15026OooO00o = Camera.open(1);
        OooO00o(this.f15030OooO00o.getHolder());
    }

    public void OooO0oO() {
        MediaRecorder mediaRecorder = this.f15028OooO00o;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
                this.f15028OooO00o.reset();
                if (this.o0ooOOo <= this.o0ooOO0) {
                    if (this.f15031OooO00o != null) {
                        this.f15031OooO00o.OooO0o();
                        return;
                    }
                } else if (this.f15031OooO00o != null) {
                    this.f15031OooO00o.OooO0Oo();
                }
                OooO0OO();
                OooO0oo();
            } catch (Exception e) {
                OooO0O0(e.getLocalizedMessage());
            }
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Context context = this.f15024OooO00o;
        if (context != null) {
            OooO00o(bArr, this.f15025OooO00o, OooO00o((int) C8734oo0oOOO.OooO0o0(context), this.o0OOO0o, this.f15035o0ooOoO));
        }
    }

    public void OooO0OO() {
        this.o0ooOOo = 0;
        this.OooO0O0 = false;
        MediaRecorder mediaRecorder = this.f15028OooO00o;
        if (!(mediaRecorder == null || this.f15026OooO00o == null)) {
            mediaRecorder.release();
            this.f15026OooO00o.stopPreview();
            if (this.OooO0OO) {
                this.f15026OooO00o.setPreviewCallback(null);
            }
            this.f15026OooO00o.release();
            this.f15028OooO00o = null;
            this.f15026OooO00o = null;
        }
        MediaPlayer mediaPlayer = this.f15027OooO00o;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f15027OooO00o.reset();
            this.f15027OooO00o.release();
            this.f15027OooO00o = null;
        }
        OooO();
    }

    public void OooO0O0(int i) {
        this.o0ooOO0 = i;
    }

    public void OooO0O0() {
        try {
            this.f15027OooO00o.start();
            if (this.f15031OooO00o != null) {
                this.f15031OooO00o.OooO00o();
            }
            OooOO0();
        } catch (Exception unused) {
            AbstractC5123OooO0Oo oooO0Oo = this.f15031OooO00o;
            if (oooO0Oo != null) {
                oooO0Oo.OooO0o0();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0O0(String str) {
        OooO0OO();
        if (this.f15031OooO00o == null) {
            return;
        }
        if (str.contains("Permission")) {
            this.f15031OooO00o.OooO0O0();
        } else {
            this.f15031OooO00o.OooO0oo();
        }
    }

    public void OooO00o(boolean z) {
        this.f15033OooO0Oo = z;
    }

    public Context OooO00o() {
        return this.f15024OooO00o;
    }

    public void OooO00o(String str) {
        o0ooOoO = str;
    }

    public void OooO00o(int i) {
        this.o00oO0O = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15125OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15123OooO00o() {
        if (this.f15024OooO00o == null) {
            return "";
        }
        return DiskFileUtil.OooO0o(this.f15024OooO00o, "jinhui").getAbsolutePath() + File.separator + o0ooOoO;
    }

    public void OooO00o(SurfaceView surfaceView, Context context) {
        this.f15024OooO00o = context;
        this.f15030OooO00o = surfaceView;
        surfaceView.getHolder().setType(3);
        surfaceView.setKeepScreenOn(true);
        this.f15029OooO00o = new OooO00o();
        surfaceView.getHolder().addCallback(this.f15029OooO00o);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(SurfaceHolder surfaceHolder) {
        try {
            if (this.f15026OooO00o != null) {
                Camera.Parameters parameters = this.f15026OooO00o.getParameters();
                Camera.Size OooO00o2 = OooO00o(true, this.f15030OooO00o.getWidth(), this.f15030OooO00o.getHeight(), parameters.getSupportedPreviewSizes());
                int i = OooO00o2.width;
                this.f15035o0ooOoO = i;
                int i2 = OooO00o2.height;
                this.o0OOO0o = i2;
                this.f15025OooO00o.set(0, 0, i2, i);
                parameters.setPreviewSize(OooO00o2.width, OooO00o2.height);
                this.f15026OooO00o.setParameters(parameters);
                this.f15026OooO00o.setPreviewDisplay(surfaceHolder);
                this.f15026OooO00o.stopPreview();
                if (this.OooO0OO) {
                    this.f15026OooO00o.setPreviewCallback(this);
                }
                this.f15026OooO00o.setDisplayOrientation(90);
                this.f15026OooO00o.startPreview();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Camera.Size OooO00o(boolean z, int i, int i2, List<Camera.Size> list) {
        if (z) {
            i2 = i;
            i = i2;
        }
        for (Camera.Size size : list) {
            if (size.width == i && size.height == i2) {
                return size;
            }
        }
        float f = ((float) i) / ((float) i2);
        float f2 = Float.MAX_VALUE;
        Camera.Size size2 = null;
        for (Camera.Size size3 : list) {
            float abs = Math.abs(f - (((float) size3.width) / ((float) size3.height)));
            if (abs < f2 && size3.width * size3.height > 307200) {
                size2 = size3;
                f2 = abs;
            }
        }
        return size2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15124OooO00o() {
        File file = new File(m15123OooO00o());
        if (file.exists()) {
            file.delete();
        }
        this.f15024OooO00o = null;
    }

    public void OooO00o(AbstractC5123OooO0Oo oooO0Oo) {
        this.f15031OooO00o = oooO0Oo;
    }

    public static Rect OooO00o(int i, int i2, int i3) {
        float f = (float) (i / 2);
        float f2 = f - (0.33f * f);
        float f3 = (float) (i2 / 2);
        float f4 = (float) (i3 / 2);
        float f5 = f4 - (0.1f * f4);
        if (f3 <= f2) {
            f2 = f3;
        }
        float f6 = (0.2f * f2) + f2;
        return new Rect((int) (f3 - f2), (int) (f5 - f6), (int) (f3 + f2), (int) (f5 + f6));
    }
}
