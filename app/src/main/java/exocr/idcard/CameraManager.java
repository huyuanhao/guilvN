package exocr.idcard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.view.SurfaceHolder;
import java.io.IOException;

public final class CameraManager {
    public static final int OooO00o = 800;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static CameraManager f23715OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f23716OooO00o = "CameraManager";
    public static final int OooO0O0 = 480;
    public static final int OooO0OO = 1280;
    public static final int OooO0Oo = 800;
    public static final int OooO0o0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f23717OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Camera f23718OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AutoFocusCallback f23719OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CameraConfigurationManager f23720OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final PictureCallback f23721OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final PreviewCallback f23722OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23723OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Rect f23724OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f23725OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final boolean f23726OooO0OO;

    static {
        int i;
        try {
            i = Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException unused) {
            i = 10000;
        }
        OooO0o0 = i;
    }

    public CameraManager(Context context) {
        this.f23720OooO00o = new CameraConfigurationManager(context);
        this.f23726OooO0OO = Integer.parseInt(Build.VERSION.SDK) > 3;
        this.f23722OooO00o = new PreviewCallback(this.f23720OooO00o, this.f23726OooO0OO);
        this.f23719OooO00o = new AutoFocusCallback();
        this.f23721OooO00o = new PictureCallback();
    }

    public void OooO00o(boolean z) {
        this.f23725OooO0O0 = z;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m22039OooO0O0() {
        Camera camera = this.f23718OooO00o;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode("off");
                this.f23718OooO00o.setParameters(parameters);
            } catch (RuntimeException e) {
                DebugLog.OooO0o0("Could not set flash mode: " + e);
            }
        }
    }

    public void OooO0OO() {
        Camera camera = this.f23718OooO00o;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode("torch");
                this.f23718OooO00o.setParameters(parameters);
            } catch (RuntimeException e) {
                DebugLog.OooO0o0("Could not set flash mode: " + e);
            }
        }
    }

    public void OooO0Oo() {
        Camera camera = this.f23718OooO00o;
        if (camera != null && !this.f23725OooO0O0) {
            try {
                camera.startPreview();
                this.f23725OooO0O0 = true;
            } catch (Exception unused) {
            }
        }
    }

    public void OooO0o0() {
        Camera camera = this.f23718OooO00o;
        if (camera != null && this.f23725OooO0O0) {
            if (!this.f23726OooO0OO) {
                camera.setPreviewCallback(null);
            }
            this.f23718OooO00o.stopPreview();
            this.f23722OooO00o.OooO00o(null, 0);
            this.f23719OooO00o.OooO00o(null, 0);
            this.f23725OooO0O0 = false;
        }
    }

    public static void OooO00o(Context context) {
        if (f23715OooO00o == null) {
            f23715OooO00o = new CameraManager(context);
        }
    }

    public static CameraManager OooO00o() {
        return f23715OooO00o;
    }

    public void OooO00o(SurfaceHolder surfaceHolder) throws IOException {
        if (this.f23718OooO00o == null) {
            try {
                Camera open = Camera.open();
                this.f23718OooO00o = open;
                open.setPreviewDisplay(surfaceHolder);
                Camera camera = this.f23718OooO00o;
                if (camera != null) {
                    if (!this.f23723OooO00o) {
                        this.f23720OooO00o.OooO00o(camera);
                        this.f23723OooO00o = true;
                    }
                    this.f23720OooO00o.OooO0O0(this.f23718OooO00o);
                    return;
                }
                throw new IOException();
            } catch (Exception unused) {
                throw new IOException();
            }
        }
    }

    public void OooO0O0(Handler handler, int i) {
        if (this.f23718OooO00o != null && this.f23725OooO0O0) {
            this.f23722OooO00o.OooO00o(handler, i);
            if (this.f23726OooO0OO) {
                this.f23718OooO00o.setOneShotPreviewCallback(this.f23722OooO00o);
            } else {
                this.f23718OooO00o.setPreviewCallback(this.f23722OooO00o);
            }
        }
    }

    public Rect OooO0O0() {
        if (this.f23724OooO0O0 == null) {
            Rect rect = new Rect(m22035OooO00o());
            Point OooO00o2 = this.f23720OooO00o.m22031OooO00o();
            Point OooO0O02 = this.f23720OooO00o.m22033OooO0O0();
            int i = rect.left;
            int i2 = OooO00o2.x;
            int i3 = OooO0O02.x;
            rect.left = (i * i2) / i3;
            rect.right = (rect.right * i2) / i3;
            int i4 = rect.top;
            int i5 = OooO00o2.y;
            int i6 = OooO0O02.y;
            rect.top = (i4 * i5) / i6;
            rect.bottom = (rect.bottom * i5) / i6;
            this.f23724OooO0O0 = rect;
        }
        return this.f23724OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m22038OooO00o() {
        Camera camera = this.f23718OooO00o;
        if (camera != null) {
            try {
                camera.release();
                this.f23718OooO00o = null;
            } catch (Exception unused) {
            }
        }
    }

    public void OooO00o(Activity activity, int i, Camera camera) {
        int i2;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i3 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i3 = 90;
            } else if (rotation == 2) {
                i3 = 180;
            } else if (rotation == 3) {
                i3 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            i2 = (360 - ((cameraInfo.orientation + i3) % 360)) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i3) + 360) % 360;
        }
        if (camera != null) {
            camera.setDisplayOrientation(i2);
        }
    }

    public void OooO00o(Handler handler, int i) {
        if (this.f23718OooO00o != null && this.f23725OooO0O0) {
            this.f23719OooO00o.OooO00o(handler, i);
            try {
                this.f23718OooO00o.autoFocus(this.f23719OooO00o);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Point m22034OooO00o() {
        return this.f23720OooO00o.m22033OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Rect m22035OooO00o() {
        Point OooO0O02 = this.f23720OooO00o.m22033OooO0O0();
        if (this.f23717OooO00o == null) {
            if (this.f23718OooO00o == null && OooO0O02 == null) {
                return null;
            }
            int i = OooO0O02.y;
            float f = (float) ((i * 4) / 5);
            float f2 = f / 0.63084f;
            float f3 = (((float) OooO0O02.x) - f2) / 2.0f;
            float f4 = (((float) i) - f) / 2.0f;
            DebugLog.OooO0OO(OooO0O02.x + "" + OooO0O02.y);
            this.f23717OooO00o = new Rect((int) f3, (int) f4, (int) (f3 + f2), (int) (f4 + f));
        }
        return this.f23717OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Camera m22036OooO00o() {
        Camera camera = this.f23718OooO00o;
        if (camera != null) {
            return camera;
        }
        return null;
    }

    public void OooO00o(CaptureActivity captureActivity) {
        this.f23725OooO0O0 = false;
        this.f23721OooO00o.OooO00o(captureActivity);
        this.f23718OooO00o.takePicture(captureActivity.m22041OooO00o(), null, this.f23721OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CameraConfigurationManager m22037OooO00o() {
        return this.f23720OooO00o;
    }
}
