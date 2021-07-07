package com.megvii.meglive_sdk.p106f;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import com.p118pd.sdk.C7383o0OOO0O;
import com.p118pd.sdk.C7997oO0ooOO0;
import exocr.idcard.CameraManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.megvii.meglive_sdk.f.l */
public final class C1570l {

    /* renamed from: a */
    public Camera f2602a;

    /* renamed from: b */
    public int f2603b;

    /* renamed from: c */
    public int f2604c;

    /* renamed from: d */
    public int f2605d = 1;

    /* renamed from: e */
    public int f2606e;

    /* renamed from: com.megvii.meglive_sdk.f.l$OooO00o */
    public class OooO00o implements Comparator<Camera.Size> {
        public final /* synthetic */ int o00oO0O = C7997oO0ooOO0.OooOoO;
        public final /* synthetic */ int o0ooOO0 = CameraManager.OooO0O0;

        public OooO00o() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
            Camera.Size size3 = size;
            Camera.Size size4 = size2;
            return Math.abs((size3.width * size3.height) - (this.o00oO0O * this.o0ooOO0)) - Math.abs((size4.width * size4.height) - (this.o00oO0O * this.o0ooOO0));
        }
    }

    /* renamed from: c */
    public static boolean m2648c() {
        if (Build.VERSION.SDK_INT < 9) {
            return false;
        }
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (1 == cameraInfo.facing) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Camera mo17184a(Activity activity, int i) {
        int i2;
        try {
            this.f2605d = i;
            this.f2602a = Camera.open(i);
            Camera.getCameraInfo(i, new Camera.CameraInfo());
            Camera.Parameters parameters = this.f2602a.getParameters();
            Camera.Size a = m2647a(this.f2602a.getParameters());
            int i3 = a.width;
            this.f2603b = i3;
            int i4 = a.height;
            this.f2604c = i4;
            parameters.setPreviewSize(i3, i4);
            if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                parameters.setFocusMode("continuous-video");
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(this.f2605d, cameraInfo);
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            int i5 = 0;
            if (rotation != 0) {
                if (rotation == 1) {
                    i5 = 90;
                } else if (rotation == 2) {
                    i5 = 180;
                } else if (rotation == 3) {
                    i5 = 270;
                }
            }
            if (cameraInfo.facing == 1) {
                i2 = (360 - ((cameraInfo.orientation + i5) % 360)) % 360;
            } else {
                i2 = ((cameraInfo.orientation - i5) + 360) % 360;
            }
            this.f2606e = i2;
            this.f2602a.setDisplayOrientation(i2);
            this.f2602a.setParameters(parameters);
            return this.f2602a;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final void mo17188b() {
        Camera camera = this.f2602a;
        if (camera != null) {
            try {
                camera.stopPreview();
                this.f2602a.setPreviewCallback(null);
                this.f2602a.release();
                this.f2602a = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo17187a(Camera.PreviewCallback previewCallback) {
        try {
            if (this.f2602a != null) {
                C1571m.m2655a(C7383o0OOO0O.OooOOO0, "Camera.setPreviewCallback");
                this.f2602a.setPreviewCallback(previewCallback);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo17186a(SurfaceTexture surfaceTexture) {
        Camera camera = this.f2602a;
        if (camera != null) {
            try {
                camera.setPreviewTexture(surfaceTexture);
                this.f2602a.startPreview();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo17185a() {
        Camera camera = this.f2602a;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private Camera.Size m2647a(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            if (size.width > size.height) {
                arrayList.add(size);
            }
        }
        Collections.sort(arrayList, new OooO00o());
        return (Camera.Size) arrayList.get(0);
    }
}
