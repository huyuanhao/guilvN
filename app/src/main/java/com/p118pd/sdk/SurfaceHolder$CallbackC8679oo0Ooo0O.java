package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.jinhui365.util.util.gson.GsonUtil;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.pd.sdk.oo0Ooo0O  reason: case insensitive filesystem */
public class SurfaceHolder$CallbackC8679oo0Ooo0O extends SurfaceView implements SurfaceHolder.Callback {
    public static final String o0ooOOo = "CameraSurfacePreview";
    public Activity OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Camera.Parameters f21832OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Camera f21833OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SurfaceHolder f21834OooO00o;
    public boolean OooO0O0 = false;
    public int o00oO0O;
    public int o0ooOO0;

    public SurfaceHolder$CallbackC8679oo0Ooo0O(Activity activity) {
        super(activity);
        this.OooO00o = activity;
        SurfaceHolder holder = getHolder();
        this.f21834OooO00o = holder;
        holder.addCallback(this);
    }

    private void OooO0o() {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "configCamera");
        HashMap hashMap2 = new HashMap();
        getParameters();
        try {
            this.f21833OooO00o.setParameters(this.f21832OooO00o);
            this.f21833OooO00o.cancelAutoFocus();
            try {
                this.f21833OooO00o.setPreviewDisplay(this.f21834OooO00o);
            } catch (IOException e) {
                e = e;
            } catch (Exception e2) {
                e = e2;
                hashMap2.put("Exception2", e.getLocalizedMessage());
                this.f21833OooO00o.startPreview();
                hashMap.put("api_env", GsonUtil.toJson(hashMap2));
                LogCollectorManager.sharedInstance().recordWarn(o0ooOOo, hashMap);
            }
        } catch (Exception e3) {
            OooO0oO();
            hashMap2.put("Exception1", e3.getLocalizedMessage());
            this.f21833OooO00o.cancelAutoFocus();
            try {
                this.f21833OooO00o.setPreviewDisplay(this.f21834OooO00o);
            } catch (IOException e4) {
                e = e4;
            } catch (Exception e5) {
                e = e5;
                hashMap2.put("Exception2", e.getLocalizedMessage());
                this.f21833OooO00o.startPreview();
                hashMap.put("api_env", GsonUtil.toJson(hashMap2));
                LogCollectorManager.sharedInstance().recordWarn(o0ooOOo, hashMap);
            }
        } catch (Throwable th) {
            this.f21833OooO00o.cancelAutoFocus();
            try {
                this.f21833OooO00o.setPreviewDisplay(this.f21834OooO00o);
            } catch (IOException e6) {
                hashMap2.put("IOException", e6.getLocalizedMessage());
            } catch (Exception e7) {
                hashMap2.put("Exception2", e7.getLocalizedMessage());
            }
            this.f21833OooO00o.startPreview();
            throw th;
        }
        this.f21833OooO00o.startPreview();
        hashMap.put("api_env", GsonUtil.toJson(hashMap2));
        LogCollectorManager.sharedInstance().recordWarn(o0ooOOo, hashMap);
        hashMap2.put("IOException", e.getLocalizedMessage());
        this.f21833OooO00o.startPreview();
        hashMap.put("api_env", GsonUtil.toJson(hashMap2));
        LogCollectorManager.sharedInstance().recordWarn(o0ooOOo, hashMap);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @android.annotation.TargetApi(9)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0oO() {
        /*
            r2 = this;
            r2.OooO00o()
            boolean r0 = r2.OooO0O0
            if (r0 < 0) goto L_0x000d
            android.hardware.Camera r0 = android.hardware.Camera.open(r0)
            r2.f21833OooO00o = r0
        L_0x000d:
            android.hardware.Camera r0 = r2.f21833OooO00o
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            r2.f21832OooO00o = r0
            boolean r1 = r2.OooO0O0
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = "auto"
            r0.setFlashMode(r1)
            android.hardware.Camera$Parameters r0 = r2.f21832OooO00o
            r1 = 256(0x100, float:3.59E-43)
            r0.setPictureFormat(r1)
            android.hardware.Camera$Parameters r0 = r2.f21832OooO00o
            java.lang.String r1 = "continuous-video"
            r0.setFocusMode(r1)
        L_0x002c:
            android.hardware.Camera r0 = r2.f21833OooO00o
            android.hardware.Camera$Parameters r1 = r2.f21832OooO00o
            r0.setParameters(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.SurfaceHolder$CallbackC8679oo0Ooo0O.OooO0oO():void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @android.annotation.TargetApi(9)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0oo() {
        /*
            r3 = this;
            r3.OooO00o()
            boolean r0 = r3.OooO0O0
            if (r0 < 0) goto L_0x0020
            android.hardware.Camera r0 = android.hardware.Camera.open(r0)     // Catch:{ Exception -> 0x000e }
            r3.f21833OooO00o = r0     // Catch:{ Exception -> 0x000e }
            goto L_0x0020
        L_0x000e:
            android.app.Activity r0 = r3.OooO00o
            r1 = 0
            java.lang.String r2 = "相机启动失败"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
            android.app.Activity r0 = r3.OooO00o
            r0.finish()
            return
        L_0x0020:
            r3.OooO0o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.SurfaceHolder$CallbackC8679oo0Ooo0O.OooO0oo():void");
    }

    private void getParameters() {
        Camera.Parameters parameters = this.f21833OooO00o.getParameters();
        this.f21832OooO00o = parameters;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = this.f21832OooO00o.getSupportedPictureSizes();
        Camera.Size OooO00o2 = OooO00o(supportedPreviewSizes, this.o00oO0O, this.o0ooOO0);
        Camera.Size OooO00o3 = OooO00o(supportedPictureSizes, this.o00oO0O, this.o0ooOO0);
        if (!this.OooO0O0) {
            this.f21832OooO00o.setFlashMode("auto");
            this.f21832OooO00o.setPictureFormat(256);
            this.f21832OooO00o.setFocusMode("continuous-video");
            this.f21832OooO00o.setPreviewSize(OooO00o2.width, OooO00o2.height);
            this.f21832OooO00o.setPictureSize(OooO00o3.width, OooO00o3.height);
            return;
        }
        this.f21832OooO00o.setPreviewSize(OooO00o2.width, OooO00o2.height);
        this.f21832OooO00o.setPictureSize(OooO00o3.width, OooO00o3.height);
    }

    public void OooO00o(int i, int i2) {
        this.o0ooOO0 = i2;
        this.o00oO0O = i;
        OooO0oo();
    }

    public void OooO0O0() {
        this.OooO0O0 = !this.OooO0O0;
        OooO0oo();
    }

    public void OooO0OO() {
        if (m20294OooO00o()) {
            this.OooO0O0 = true;
            OooO0oo();
            return;
        }
        OooO0Oo();
    }

    public void OooO0Oo() {
        Camera camera = this.f21833OooO00o;
        if (camera != null) {
            camera.startPreview();
        }
    }

    public void OooO0o0() {
        Camera camera = this.f21833OooO00o;
        if (camera != null) {
            camera.stopPreview();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        OooO00o();
        getHolder().removeCallback(this);
    }

    public void OooO00o(Camera.PictureCallback pictureCallback) {
        try {
            this.f21833OooO00o.takePicture(null, null, pictureCallback);
        } catch (RuntimeException e) {
            e.getMessage();
        }
    }

    private Camera.Size OooO00o(List<Camera.Size> list, int i, int i2) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        double d4 = Double.MAX_VALUE;
        double d5 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            double d6 = (double) size2.width;
            double d7 = (double) size2.height;
            Double.isNaN(d6);
            Double.isNaN(d7);
            if (Math.abs((d6 / d7) - d3) <= 0.05d && ((double) Math.abs(size2.height - i2)) < d5) {
                d5 = (double) Math.abs(size2.height - i2);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : list) {
                if (((double) Math.abs(size3.height - i2)) < d4) {
                    size = size3;
                    d4 = (double) Math.abs(size3.height - i2);
                }
            }
        }
        return size;
    }

    public void OooO00o() {
        if (this.f21833OooO00o != null) {
            this.f21834OooO00o.removeCallback(this);
            this.f21833OooO00o.stopPreview();
            this.f21833OooO00o.setPreviewCallback(null);
            this.f21833OooO00o.release();
            this.f21833OooO00o = null;
        }
    }

    @TargetApi(9)
    private int OooO00o(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20294OooO00o() {
        return OooO00o(true) >= 0;
    }
}
