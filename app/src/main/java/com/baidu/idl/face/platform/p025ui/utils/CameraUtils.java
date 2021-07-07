package com.baidu.idl.face.platform.p025ui.utils;

import android.hardware.Camera;

/* renamed from: com.baidu.idl.face.platform.ui.utils.CameraUtils */
public class CameraUtils {
    public static final String TAG = "CameraUtils";

    public static void releaseCamera(Camera camera) {
        try {
            camera.release();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
