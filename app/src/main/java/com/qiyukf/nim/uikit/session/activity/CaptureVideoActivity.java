package com.qiyukf.nim.uikit.session.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p143d.C1864e;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.unicorn.C2364R;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import s.h.e.l.l.C;

public class CaptureVideoActivity extends BaseFragmentActivity implements SurfaceHolder.Callback, View.OnClickListener {

    /* renamed from: A */
    public LinkedList<Point> f3729A = new LinkedList<>();

    /* renamed from: B */
    public LinkedList<Point> f3730B = new LinkedList<>();

    /* renamed from: C */
    public Runnable f3731C = new Runnable() {
        /* class com.qiyukf.nim.uikit.session.activity.CaptureVideoActivity.RunnableC19391 */

        public final void run() {
            String str;
            int i;
            ImageView imageView;
            CaptureVideoActivity.this.f3754w = new Date().getTime();
            CaptureVideoActivity captureVideoActivity = CaptureVideoActivity.this;
            captureVideoActivity.f3755x = captureVideoActivity.f3754w - CaptureVideoActivity.this.f3753v;
            int i2 = (int) (CaptureVideoActivity.this.f3755x / 1000);
            CaptureVideoActivity.this.f3735d.setText(i2 + "秒");
            CaptureVideoActivity.this.f3734c.setProgress(i2);
            TextView textView = CaptureVideoActivity.this.f3746o;
            if (i2 <= 0) {
                str = "00:00";
            } else {
                int i3 = i2 / 60;
                if (i3 < 60) {
                    str = C1864e.m3552a(i3) + Constants.COLON_SEPARATOR + C1864e.m3552a(i2 % 60);
                } else {
                    int i4 = i3 / 60;
                    if (i4 > 99) {
                        str = "99:59:59";
                    } else {
                        int i5 = i3 % 60;
                        str = C1864e.m3552a(i4) + Constants.COLON_SEPARATOR + C1864e.m3552a(i5) + Constants.COLON_SEPARATOR + C1864e.m3552a((i2 - (i4 * 3600)) - (i5 * 60));
                    }
                }
            }
            textView.setText(str);
            if (i2 % 2 == 0) {
                imageView = CaptureVideoActivity.this.f3745n;
                i = C2364R.C2366drawable.ysf_record_start;
            } else {
                imageView = CaptureVideoActivity.this.f3745n;
                i = C2364R.C2366drawable.ysf_record_video;
            }
            imageView.setBackgroundResource(i);
            if (i2 >= 30) {
                CaptureVideoActivity.this.f3734c.setProgress(100);
                CaptureVideoActivity.this.f3735d.setText("30秒");
                CaptureVideoActivity.this.m3784g();
                return;
            }
            CaptureVideoActivity.this.f3733b.postDelayed(this, 1000);
        }
    };

    /* renamed from: D */
    public Point f3732D = null;

    /* renamed from: b */
    public Handler f3733b = new Handler();

    /* renamed from: c */
    public ProgressBar f3734c;

    /* renamed from: d */
    public TextView f3735d;

    /* renamed from: e */
    public ImageView f3736e;

    /* renamed from: f */
    public ImageView f3737f;

    /* renamed from: g */
    public ImageView f3738g;

    /* renamed from: h */
    public ImageView f3739h;

    /* renamed from: i */
    public MediaRecorder f3740i;

    /* renamed from: j */
    public Camera f3741j;

    /* renamed from: k */
    public SurfaceView f3742k;

    /* renamed from: l */
    public SurfaceHolder f3743l;

    /* renamed from: m */
    public ImageView f3744m;

    /* renamed from: n */
    public ImageView f3745n;

    /* renamed from: o */
    public TextView f3746o;

    /* renamed from: p */
    public ImageView f3747p;

    /* renamed from: q */
    public int f3748q = 0;

    /* renamed from: r */
    public String f3749r;

    /* renamed from: s */
    public boolean f3750s = false;

    /* renamed from: t */
    public boolean f3751t = false;

    /* renamed from: u */
    public boolean f3752u = false;

    /* renamed from: v */
    public long f3753v;

    /* renamed from: w */
    public long f3754w;

    /* renamed from: x */
    public long f3755x = 0;

    /* renamed from: y */
    public boolean f3756y = false;

    /* renamed from: z */
    public int f3757z = 0;

    static {
        C.i(50331747);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m3775a(boolean z) {
        int i = (Build.VERSION.SDK_INT < 9 || !z) ? 0 : 1;
        String str = "Back Camera";
        if (Build.VERSION.SDK_INT >= 11) {
            if (CamcorderProfile.hasProfile(i, 4)) {
                CamcorderProfile camcorderProfile = CamcorderProfile.get(i, 4);
                if (camcorderProfile != null) {
                    Point point = new Point();
                    point.x = camcorderProfile.videoFrameWidth;
                    point.y = camcorderProfile.videoFrameHeight;
                    (z ? this.f3730B : this.f3729A).addLast(point);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(z ? str : "Front Camera");
                sb.append(" no QUALITY_480P");
                C1709a.m3016c("CaptureVideoActivity", sb.toString());
            }
            if (CamcorderProfile.hasProfile(i, 3)) {
                CamcorderProfile camcorderProfile2 = CamcorderProfile.get(i, 3);
                if (camcorderProfile2 != null) {
                    Point point2 = new Point();
                    point2.x = camcorderProfile2.videoFrameWidth;
                    point2.y = camcorderProfile2.videoFrameHeight;
                    (z ? this.f3730B : this.f3729A).addLast(point2);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z ? str : "Front Camera");
                sb2.append(" no QUALITY_CIF");
                C1709a.m3016c("CaptureVideoActivity", sb2.toString());
            }
            if (Build.VERSION.SDK_INT >= 15) {
                if (CamcorderProfile.hasProfile(i, 7)) {
                    CamcorderProfile camcorderProfile3 = CamcorderProfile.get(i, 7);
                    if (camcorderProfile3 != null) {
                        Point point3 = new Point();
                        point3.x = camcorderProfile3.videoFrameWidth;
                        point3.y = camcorderProfile3.videoFrameHeight;
                        (z ? this.f3730B : this.f3729A).addLast(point3);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(z ? str : "Front Camera");
                    sb3.append(" no QUALITY_QVGA");
                    C1709a.m3016c("CaptureVideoActivity", sb3.toString());
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 9) {
            CamcorderProfile camcorderProfile4 = CamcorderProfile.get(i, 0);
            if (camcorderProfile4 == null) {
                Point point4 = new Point();
                point4.x = MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP;
                point4.y = 240;
                (z ? this.f3730B : this.f3729A).addLast(point4);
                StringBuilder sb4 = new StringBuilder();
                if (!z) {
                    str = "Front Camera";
                }
                sb4.append(str);
                sb4.append(" no QUALITY_LOW");
                C1709a.m3016c("CaptureVideoActivity", sb4.toString());
                return;
            }
            Point point5 = new Point();
            point5.x = camcorderProfile4.videoFrameWidth;
            point5.y = camcorderProfile4.videoFrameHeight;
            if (z) {
                this.f3730B.addLast(point5);
            } else {
                this.f3729A.addLast(point5);
            }
        } else if (!z) {
            CamcorderProfile camcorderProfile5 = CamcorderProfile.get(0);
            if (camcorderProfile5 == null) {
                Point point6 = new Point();
                point6.x = MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP;
                point6.y = 240;
                this.f3729A.addLast(point6);
                return;
            }
            Point point7 = new Point();
            point7.x = camcorderProfile5.videoFrameWidth;
            point7.y = camcorderProfile5.videoFrameHeight;
            this.f3729A.addLast(point7);
        }
    }

    /* renamed from: f */
    private void m3782f() {
        Point first = (this.f3748q == 0 ? this.f3729A : this.f3730B).getFirst();
        Point point = this.f3732D;
        if (point == null || !first.equals(point)) {
            this.f3732D = first;
            int width = getWindowManager().getDefaultDisplay().getWidth();
            int i = (first.x * width) / first.y;
            SurfaceView surfaceView = this.f3742k;
            if (surfaceView != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) surfaceView.getLayoutParams();
                layoutParams.width = width;
                layoutParams.height = i;
                layoutParams.addRule(13);
                this.f3742k.setLayoutParams(layoutParams);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private void m3784g() {
        MediaRecorder mediaRecorder = this.f3740i;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (Exception unused) {
                C1709a.m3020e("CaptureVideoActivity", getString(C2364R.string.ysf_stop_fail_maybe_stopped));
            }
            this.f3740i.release();
            this.f3740i = null;
        }
        Camera camera = this.f3741j;
        if (camera != null) {
            camera.release();
            this.f3741j = null;
        }
        this.f3733b.removeCallbacks(this.f3731C);
        this.f3745n.setBackgroundResource(C2364R.C2366drawable.ysf_record_start);
        this.f3752u = false;
        if (this.f3755x <= 1) {
            m3787i();
        } else {
            updateRecordUI(false);
        }
    }

    /* renamed from: h */
    private void m3785h() {
        String str;
        File file = new File(this.f3749r);
        if (file.exists()) {
            int length = ((int) file.length()) / 1024;
            float f = ((float) length) / 1024.0f;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            if (f > 1.0f) {
                str = getString(C2364R.string.ysf_capture_video_size_in_mb, new Object[]{Float.valueOf(f)});
            } else {
                str = getString(C2364R.string.ysf_capture_video_size_in_kb, new Object[]{Integer.valueOf(length)});
            }
            sb.append(str);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(getString(C2364R.string.ysf_is_send_video));
            if (f <= 1.0f && length < 10) {
                m3787i();
                return;
            }
        }
        Intent intent = new Intent();
        intent.putExtra("duration", this.f3755x);
        intent.putExtra("SELECT_VIDEO_TYPE_TAG", 0);
        intent.putExtra("EXTRA_DATA_FILE_NAME", this.f3749r);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: i */
    private void m3787i() {
        this.f3755x = 0;
        C1865f.m3559b(C2364R.string.ysf_video_record_short);
        m3788j();
    }

    /* renamed from: j */
    private void m3788j() {
        C1806a.m3412b(this.f3749r);
        this.f3746o.setText("00:00");
        this.f3735d.setText("30秒");
        this.f3734c.setProgress(0);
        updateRecordUI(true);
        m3790l();
        m3789k();
        m3791m();
        checkMultiCamera();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: k */
    private boolean m3789k() {
        try {
            this.f3741j = this.f3751t ? Camera.open(this.f3748q) : Camera.open();
            Camera camera = this.f3741j;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                if (Build.VERSION.SDK_INT >= 15 && parameters.isVideoStabilizationSupported()) {
                    parameters.setVideoStabilization(true);
                }
                if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                }
                if (parameters != null) {
                    this.f3757z = setCameraDisplayOrientation(this, this.f3748q, this.f3741j);
                }
                Point point = this.f3732D;
                parameters.setPreviewSize(point.x, point.y);
                try {
                    this.f3741j.setParameters(parameters);
                } catch (RuntimeException e) {
                    C1709a.m3015b("CaptureVideoActivity", "setParameters failed", e);
                }
            }
            return this.f3741j != null;
        } catch (RuntimeException e2) {
            C1709a.m3016c("CaptureVideoActivity", "init camera failed: " + e2);
            Toast.makeText(this, C2364R.string.ysf_connect_vedio_device_fail, 0).show();
            return false;
        }
    }

    /* renamed from: l */
    private void m3790l() {
        Camera camera = this.f3741j;
        if (camera != null) {
            if (this.f3750s) {
                camera.stopPreview();
            }
            this.f3741j.release();
            this.f3741j = null;
            this.f3750s = false;
        }
    }

    /* renamed from: m */
    private void m3791m() {
        try {
            this.f3741j.setPreviewDisplay(this.f3743l);
            this.f3741j.startPreview();
            this.f3750s = true;
        } catch (Exception e) {
            Toast.makeText(this, C2364R.string.ysf_connect_vedio_device_fail, 0).show();
            m3790l();
            e.printStackTrace();
        }
    }

    public static native void start(Activity activity, String str, int i);

    public static native void start(Fragment fragment, String str, int i);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity
    /* renamed from: a */
    public final boolean mo34171a() {
        return false;
    }

    @SuppressLint({"NewApi"})
    public void checkMultiCamera() {
        ImageView imageView;
        int i = 8;
        if (Build.VERSION.SDK_INT < 9 || Camera.getNumberOfCameras() <= 1) {
            imageView = this.f3747p;
        } else {
            this.f3751t = true;
            imageView = this.f3747p;
            i = 0;
        }
        imageView.setVisibility(i);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 35 && i2 == -1 && intent != null) {
            C1709a.m3011a("OnActivityResult ", String.valueOf(intent.getBooleanExtra("extra_result_original_enable", false)));
            C1709a.m3011a("obtainResult(data):", ((Uri) intent.getParcelableArrayListExtra("extra_result_selection").get(0)).toString());
            C1709a.m3011a("obtainPathResult(data):", intent.getStringArrayListExtra("extra_result_selection_path").get(0));
            Intent intent2 = new Intent();
            intent2.putExtra("duration", this.f3755x);
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("extra_result_selection_path");
            intent2.putExtra("SELECT_VIDEO_TYPE_TAG", 1);
            intent2.putStringArrayListExtra("EXTRA_DATA_VIDEO_PATH", stringArrayListExtra);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2 A[Catch:{ Exception -> 0x012a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.activity.CaptureVideoActivity.onClick(android.view.View):void");
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFormat(-3);
        getWindow().setFlags(1024, 1024);
        setContentView(C2364R.layout.ysf_capture_video_activity);
        this.f3749r = getIntent().getExtras().getString("EXTRA_DATA_FILE_NAME");
        this.f3746o = (TextView) findViewById(C2364R.C2367id.record_times);
        this.f3745n = (ImageView) findViewById(C2364R.C2367id.recording_id);
        this.f3744m = (ImageView) findViewById(C2364R.C2367id.record_btn);
        this.f3739h = (ImageView) findViewById(C2364R.C2367id.ysf_iv_video_select);
        this.f3747p = (ImageView) findViewById(C2364R.C2367id.switch_cameras);
        ProgressBar progressBar = (ProgressBar) findViewById(C2364R.C2367id.ysf_pb_video_progress_bar);
        this.f3734c = progressBar;
        progressBar.setVisibility(0);
        this.f3734c.setMax(30);
        TextView textView = (TextView) findViewById(C2364R.C2367id.ysf_tv_video_progress_second);
        this.f3735d = textView;
        textView.setVisibility(0);
        this.f3735d.setText("30秒");
        ImageView imageView = (ImageView) findViewById(C2364R.C2367id.ysf_iv_capture_send);
        this.f3737f = imageView;
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) findViewById(C2364R.C2367id.ysf_iv_capture_cancel);
        this.f3736e = imageView2;
        imageView2.setVisibility(8);
        this.f3738g = (ImageView) findViewById(C2364R.C2367id.ysf_iv_capture_video_finish);
        checkMultiCamera();
        this.f3744m.setOnClickListener(this);
        this.f3747p.setOnClickListener(this);
        this.f3736e.setOnClickListener(this);
        this.f3737f.setOnClickListener(this);
        this.f3739h.setOnClickListener(this);
        this.f3738g.setOnClickListener(this);
        updateRecordUI(true);
        this.f3729A.clear();
        this.f3730B.clear();
        m3775a(false);
        if (Build.VERSION.SDK_INT >= 9 && Camera.getNumberOfCameras() >= 2) {
            m3775a(true);
        }
        SurfaceView surfaceView = (SurfaceView) findViewById(C2364R.C2367id.videoView);
        this.f3742k = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(this);
        m3782f();
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onPause();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onResume();

    @SuppressLint({"NewApi"})
    public int setCameraDisplayOrientation(Context context, int i, Camera camera) {
        int i2;
        int i3 = 0;
        boolean z = i == 1;
        int i4 = 90;
        if (Build.VERSION.SDK_INT >= 9) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            i2 = cameraInfo.orientation;
            z = cameraInfo.facing == 1;
        } else {
            i2 = 90;
        }
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i3 = 90;
            } else if (rotation == 2) {
                i3 = 180;
            } else if (rotation == 3) {
                i3 = 270;
            }
        }
        if (z) {
            i4 = (360 - ((i2 + i3) % 360)) % 360;
        } else {
            int i5 = ((i2 - i3) + 360) % 360;
            if (!"Xiaomi_MI-ONE Plus".equalsIgnoreCase(Build.MANUFACTURER + "_" + Build.MODEL)) {
                i4 = i5;
            }
        }
        camera.setDisplayOrientation(i4);
        return i4;
    }

    public native void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3);

    public native void surfaceCreated(SurfaceHolder surfaceHolder);

    public native void surfaceDestroyed(SurfaceHolder surfaceHolder);

    public native void updateRecordUI(boolean z);
}
