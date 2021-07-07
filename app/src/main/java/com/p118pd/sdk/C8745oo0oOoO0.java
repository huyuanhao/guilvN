package com.p118pd.sdk;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.cameraview.Camera2;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import exocr.idcard.CameraManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0oOoO0  reason: case insensitive filesystem */
public class C8745oo0oOoO0 {
    public static final OooO0O0 OooO00o = new OooO0O0(853, CameraManager.OooO0O0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C8745oo0oOoO0 f21915OooO00o;
    public static final OooO0O0 OooO0O0 = new OooO0O0(1280, 720);
    public static final OooO0O0 OooO0OO = new OooO0O0(Camera2.MAX_PREVIEW_WIDTH, 1080);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21916OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final HashMap<Integer, OooO00o> f21917OooO00o = new HashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<String> f21918OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<Number, Camera> f21919OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21920OooO00o = false;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f21921OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final HashMap<Integer, Integer> f21922OooO0O0 = new HashMap<>();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f21923OooO0OO = 0;

    /* renamed from: com.pd.sdk.oo0oOoO0$OooO00o */
    public class OooO00o {
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Camera.CameraInfo f21924OooO00o;
        public int OooO0O0 = -1;
        public int OooO0OO = -1;
        public int OooO0Oo = -1;
        public int OooO0o0 = -1;

        public OooO00o(Camera.CameraInfo cameraInfo) {
            this.f21924OooO00o = cameraInfo;
        }
    }

    /* renamed from: com.pd.sdk.oo0oOoO0$OooO0O0 */
    public static class OooO0O0 {
        public int OooO00o;
        public int OooO0O0;

        public OooO0O0(int i, int i2) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
        }
    }

    public C8745oo0oOoO0(int i) {
        this.f21921OooO0O0 = i;
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == 1 && this.f21917OooO00o.get(1) == null) {
                this.f21917OooO00o.put(1, new OooO00o(cameraInfo));
                this.f21922OooO0O0.put(1, Integer.valueOf(i2));
                m20380OooO00o(1);
                m20386OooO0O0(1);
            } else if (cameraInfo.facing == 0 && this.f21917OooO00o.get(2) == null) {
                this.f21917OooO00o.put(2, new OooO00o(cameraInfo));
                this.f21922OooO0O0.put(2, Integer.valueOf(i2));
                m20380OooO00o(2);
                m20386OooO0O0(2);
            }
        }
    }

    public static C8745oo0oOoO0 OooO00o() {
        return f21915OooO00o;
    }

    public static void OooO0o(int i) {
        f21915OooO00o = new C8745oo0oOoO0(i);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20386OooO0O0(int i) {
        Camera camera = this.f21919OooO00o.get(Integer.valueOf(i));
        if (camera != null) {
            this.f21919OooO00o.remove(Integer.valueOf(i));
            camera.release();
        }
    }

    public int OooO0OO(int i) {
        OooO00o oooO00o = this.f21917OooO00o.get(Integer.valueOf(i));
        if (oooO00o == null) {
            return 0;
        }
        return oooO00o.OooO0Oo;
    }

    public int OooO0Oo(int i) {
        OooO00o oooO00o = this.f21917OooO00o.get(Integer.valueOf(i));
        if (oooO00o == null) {
            return 0;
        }
        return oooO00o.OooO0O0;
    }

    public void OooO0o0(int i) {
        if (this.f21916OooO00o != i) {
            this.f21916OooO00o = i;
            m20382OooO00o(1);
            m20382OooO00o(2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized Camera m20380OooO00o(int i) {
        if (this.f21919OooO00o.get(Integer.valueOf(i)) == null && this.f21922OooO0O0.get(Integer.valueOf(i)) != null) {
            try {
                this.f21919OooO00o.put(Integer.valueOf(i), Camera.open(this.f21922OooO0O0.get(Integer.valueOf(i)).intValue()));
                m20382OooO00o(i);
            } catch (Exception unused) {
            }
        }
        return this.f21919OooO00o.get(Integer.valueOf(i));
    }

    public int OooO0OO() {
        return this.f21916OooO00o;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public void m20388OooO0Oo(int i) {
        this.f21923OooO0OO = i;
    }

    public int OooO0O0(int i) {
        OooO00o oooO00o = this.f21917OooO00o.get(Integer.valueOf(i));
        if (oooO00o == null) {
            return 0;
        }
        return oooO00o.OooO0o0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m20387OooO0OO(int i) {
        this.f21921OooO0O0 = i;
        m20382OooO00o(1);
        m20382OooO00o(2);
    }

    public void OooO0Oo(int i, int i2) {
        Camera OooO00o2 = m20380OooO00o(i);
        if (OooO00o2 != null) {
            Camera.Parameters parameters = OooO00o2.getParameters();
            String flashMode = parameters.getFlashMode();
            if (i2 == 0) {
                flashMode = "off";
            } else if (i2 == 1) {
                flashMode = "torch";
            }
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains(flashMode)) {
                parameters.setFlashMode(flashMode);
                try {
                    OooO00o2.setParameters(parameters);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public void OooO0o0(int i, int i2) {
        Camera OooO00o2 = m20380OooO00o(i);
        if (OooO00o2 != null) {
            Camera.Parameters parameters = OooO00o2.getParameters();
            int maxZoom = parameters.getMaxZoom();
            if (parameters.isZoomSupported() && i2 >= 0 && i2 < maxZoom) {
                parameters.setZoom(i2);
                try {
                    OooO00o2.setParameters(parameters);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private Camera.Size OooO0O0(List<Camera.Size> list, int i, int i2) {
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            if (size != null) {
                if (Math.sqrt(Math.pow((double) (size2.width - i), 2.0d) + Math.pow((double) (size2.height - i2), 2.0d)) >= Math.sqrt(Math.pow((double) (size.width - i), 2.0d) + Math.pow((double) (size.height - i2), 2.0d))) {
                }
            }
            size = size2;
        }
        return size;
    }

    public int OooO00o(int i) {
        OooO00o oooO00o = this.f21917OooO00o.get(Integer.valueOf(i));
        if (oooO00o == null) {
            return 0;
        }
        return oooO00o.OooO0OO;
    }

    public void OooO0OO(int i, int i2) {
        Camera OooO00o2 = m20380OooO00o(i);
        if (OooO00o2 != null) {
            Camera.Parameters parameters = OooO00o2.getParameters();
            String flashMode = parameters.getFlashMode();
            if (i2 == 0) {
                flashMode = "off";
            } else if (i2 == 1) {
                flashMode = ViewProps.f984ON;
            } else if (i2 == 2) {
                flashMode = "auto";
            }
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains(flashMode)) {
                parameters.setFlashMode(flashMode);
                try {
                    OooO00o2.setParameters(parameters);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public Camera.Size OooO00o(List<Camera.Size> list, int i, int i2) {
        int i3;
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            int i4 = size2.width;
            if (i4 <= i && (i3 = size2.height) <= i2) {
                if (size == null || i4 * i3 > size.width * size.height) {
                    size = size2;
                }
            }
        }
        return size;
    }

    public int OooO0O0() {
        return this.f21923OooO0OO;
    }

    public void OooO0O0(int i, int i2) {
        Camera camera = this.f21919OooO00o.get(Integer.valueOf(i));
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            boolean z = true;
            if (i2 != 1) {
                z = false;
            }
            parameters.setRecordingHint(z);
            try {
                camera.setParameters(parameters);
            } catch (RuntimeException unused) {
            }
        }
    }

    private Camera.Size OooO00o(List<Camera.Size> list) {
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            if (size == null || size2.width * size2.height < size.width * size.height) {
                size = size2;
            }
        }
        return size;
    }

    public List<Camera.Size> OooO00o(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            return supportedVideoSizes;
        }
        return parameters.getSupportedPreviewSizes();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20385OooO00o() {
        return this.f21920OooO00o;
    }

    public void OooO00o(boolean z) {
        this.f21920OooO00o = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<String> m20381OooO00o() {
        return this.f21918OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20384OooO00o(List<String> list) {
        this.f21918OooO00o = list;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20379OooO00o() {
        return this.f21921OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20383OooO00o(int i, String str) {
        Camera OooO00o2 = m20380OooO00o(i);
        if (OooO00o2 != null) {
            Camera.Parameters parameters = OooO00o2.getParameters();
            Camera.Size size = null;
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            char c = 65535;
            switch (str.hashCode()) {
                case -1078030475:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM)) {
                        c = 1;
                        break;
                    }
                    break;
                case -318184504:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                        c = 3;
                        break;
                    }
                    break;
                case 107348:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW)) {
                        c = 0;
                        break;
                    }
                    break;
                case 1604548:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P)) {
                        c = 4;
                        break;
                    }
                    break;
                case 1688155:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P)) {
                        c = 5;
                        break;
                    }
                    break;
                case 3202466:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH)) {
                        c = 2;
                        break;
                    }
                    break;
                case 46737913:
                    if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P)) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    size = OooO00o(supportedPictureSizes);
                    break;
                case 1:
                    size = supportedPictureSizes.get(supportedPictureSizes.size() / 2);
                    break;
                case 2:
                    size = OooO00o(parameters.getSupportedPictureSizes(), Integer.MAX_VALUE, Integer.MAX_VALUE);
                    break;
                case 3:
                    Camera.Size OooO00o3 = OooO00o(parameters.getSupportedPreviewSizes(), Integer.MAX_VALUE, Integer.MAX_VALUE);
                    size = OooO0O0(parameters.getSupportedPictureSizes(), OooO00o3.width, OooO00o3.height);
                    break;
                case 4:
                    OooO0O0 oooO0O0 = OooO00o;
                    size = OooO00o(supportedPictureSizes, oooO0O0.OooO00o, oooO0O0.OooO0O0);
                    break;
                case 5:
                    OooO0O0 oooO0O02 = OooO0O0;
                    size = OooO00o(supportedPictureSizes, oooO0O02.OooO00o, oooO0O02.OooO0O0);
                    break;
                case 6:
                    OooO0O0 oooO0O03 = OooO0OO;
                    size = OooO00o(supportedPictureSizes, oooO0O03.OooO00o, oooO0O03.OooO0O0);
                    break;
            }
            if (size != null) {
                parameters.setPictureSize(size.width, size.height);
                try {
                    OooO00o2.setParameters(parameters);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public CamcorderProfile OooO00o(int i, String str) {
        Camera.Size size;
        CamcorderProfile camcorderProfile;
        Camera OooO00o2 = m20380OooO00o(i);
        if (OooO00o2 == null) {
            return null;
        }
        List<Camera.Size> OooO00o3 = OooO00o(OooO00o2);
        char c = 65535;
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM)) {
                    c = 1;
                    break;
                }
                break;
            case 107348:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW)) {
                    c = 0;
                    break;
                }
                break;
            case 1604548:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P)) {
                    c = 3;
                    break;
                }
                break;
            case 1688155:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P)) {
                    c = 4;
                    break;
                }
                break;
            case 3202466:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH)) {
                    c = 2;
                    break;
                }
                break;
            case 46737913:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P)) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0) {
            size = OooO00o(OooO00o3);
            camcorderProfile = CamcorderProfile.get(this.f21922OooO0O0.get(Integer.valueOf(i)).intValue(), 4);
        } else if (c == 1) {
            size = OooO00o3.get(OooO00o3.size() / 2);
            camcorderProfile = CamcorderProfile.get(this.f21922OooO0O0.get(Integer.valueOf(i)).intValue(), 5);
        } else if (c == 2) {
            size = OooO00o(OooO00o3, Integer.MAX_VALUE, Integer.MAX_VALUE);
            camcorderProfile = CamcorderProfile.get(this.f21922OooO0O0.get(Integer.valueOf(i)).intValue(), 1);
        } else if (c == 3) {
            OooO0O0 oooO0O0 = OooO00o;
            size = OooO00o(OooO00o3, oooO0O0.OooO00o, oooO0O0.OooO0O0);
            camcorderProfile = CamcorderProfile.get(this.f21922OooO0O0.get(Integer.valueOf(i)).intValue(), 4);
        } else if (c == 4) {
            OooO0O0 oooO0O02 = OooO0O0;
            size = OooO00o(OooO00o3, oooO0O02.OooO00o, oooO0O02.OooO0O0);
            camcorderProfile = CamcorderProfile.get(this.f21922OooO0O0.get(Integer.valueOf(i)).intValue(), 5);
        } else if (c != 5) {
            camcorderProfile = null;
            size = null;
        } else {
            OooO0O0 oooO0O03 = OooO0OO;
            size = OooO00o(OooO00o3, oooO0O03.OooO00o, oooO0O03.OooO0O0);
            camcorderProfile = CamcorderProfile.get(this.f21922OooO0O0.get(Integer.valueOf(i)).intValue(), 6);
        }
        if (camcorderProfile == null) {
            return null;
        }
        if (size != null) {
            camcorderProfile.videoFrameHeight = size.height;
            camcorderProfile.videoFrameWidth = size.width;
        }
        return camcorderProfile;
    }

    public void OooO00o(int i, int i2) {
        int i3;
        Camera camera = this.f21919OooO00o.get(Integer.valueOf(i));
        if (camera != null) {
            OooO00o oooO00o = this.f21917OooO00o.get(Integer.valueOf(i));
            Camera.CameraInfo cameraInfo = oooO00o.f21924OooO00o;
            int i4 = cameraInfo.orientation;
            if (cameraInfo.facing == 1) {
                i3 = (i4 + (i2 * 90)) % 360;
            } else {
                i3 = ((i4 - (i2 * 90)) + 360) % 360;
            }
            oooO00o.OooO00o = i3;
            Camera.Parameters parameters = camera.getParameters();
            parameters.setRotation(oooO00o.OooO00o);
            try {
                camera.setParameters(parameters);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20382OooO00o(int i) {
        int i2;
        int i3;
        Camera camera = this.f21919OooO00o.get(Integer.valueOf(i));
        if (camera != null) {
            OooO00o oooO00o = this.f21917OooO00o.get(Integer.valueOf(i));
            Camera.CameraInfo cameraInfo = oooO00o.f21924OooO00o;
            int i4 = cameraInfo.orientation;
            if (cameraInfo.facing == 1) {
                int i5 = this.f21921OooO0O0;
                i2 = ((i5 * 90) + i4) % 360;
                i3 = ((720 - i4) - (i5 * 90)) % 360;
            } else {
                i2 = ((i4 - (this.f21921OooO0O0 * 90)) + 360) % 360;
                i3 = i2;
            }
            oooO00o.OooO00o = i2;
            m20388OooO0Oo(i2);
            camera.setDisplayOrientation(i3);
            Camera.Parameters parameters = camera.getParameters();
            parameters.setRotation(oooO00o.OooO00o);
            Camera.Size OooO00o2 = OooO00o(parameters.getSupportedPreviewSizes(), Integer.MAX_VALUE, Integer.MAX_VALUE);
            int i6 = OooO00o2.width;
            int i7 = OooO00o2.height;
            parameters.setPreviewSize(i6, i7);
            try {
                camera.setParameters(parameters);
            } catch (Exception e) {
                e.printStackTrace();
            }
            int i8 = oooO00o.OooO00o;
            if (i8 == 0 || i8 == 180) {
                oooO00o.OooO0O0 = i6;
                oooO00o.OooO0OO = i7;
                return;
            }
            oooO00o.OooO0O0 = i7;
            oooO00o.OooO0OO = i6;
        }
    }

    public void OooO00o(int i, int i2, int i3) {
        OooO00o oooO00o = this.f21917OooO00o.get(Integer.valueOf(i));
        if (oooO00o != null) {
            oooO00o.OooO0Oo = i2;
            oooO00o.OooO0o0 = i3;
        }
    }
}
