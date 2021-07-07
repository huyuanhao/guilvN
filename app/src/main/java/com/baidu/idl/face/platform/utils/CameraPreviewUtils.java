package com.baidu.idl.face.platform.utils;

import android.graphics.Point;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class CameraPreviewUtils {
    public static final int MAX_PREVIEW_PIXELS = 921600;
    public static final int MIN_PREVIEW_PIXELS = 307200;
    public static final String TAG = "CameraPreviewUtils";

    public static Point getBestPreview(Camera.Parameters parameters, Point point) {
        double d;
        double d2;
        double d3;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            return new Point(previewSize.width, previewSize.height);
        }
        ArrayList arrayList = new ArrayList(supportedPreviewSizes);
        Collections.sort(arrayList, new Comparator<Camera.Size>() {
            /* class com.baidu.idl.face.platform.utils.CameraPreviewUtils.C04321 */

            public int compare(Camera.Size size, Camera.Size size2) {
                int i = size.height * size.width;
                int i2 = size2.height * size2.width;
                if (i2 < i) {
                    return -1;
                }
                return i2 > i ? 1 : 0;
            }
        });
        int i = point.x;
        int i2 = point.y;
        if (i > i2) {
            d2 = (double) i;
            d = (double) i2;
        } else {
            d2 = (double) i2;
            d = (double) i;
        }
        Double.isNaN(d2);
        Double.isNaN(d);
        double d4 = d2 / d;
        Camera.Size size = null;
        Iterator it = arrayList.iterator();
        double d5 = -1.0d;
        while (it.hasNext()) {
            Camera.Size size2 = (Camera.Size) it.next();
            int i3 = size2.width;
            int i4 = size2.height;
            int i5 = i3 * i4;
            if (i5 < 307200) {
                it.remove();
            } else if (i5 > 921600) {
                it.remove();
            } else {
                if (i3 > i4) {
                    double d6 = (double) i3;
                    double d7 = (double) i4;
                    Double.isNaN(d6);
                    Double.isNaN(d7);
                    d3 = d6 / d7;
                } else {
                    double d8 = (double) i4;
                    double d9 = (double) i3;
                    Double.isNaN(d8);
                    Double.isNaN(d9);
                    d3 = d8 / d9;
                }
                double abs = Math.abs(d3 - d4);
                boolean z = false;
                if ((d5 == -1.0d && abs <= 0.25d) || (d5 >= abs && abs <= 0.25d)) {
                    z = true;
                }
                if (z) {
                    size = size2;
                    d5 = abs;
                }
            }
        }
        if (size != null) {
            return new Point(size.width, size.height);
        }
        Camera.Size previewSize2 = parameters.getPreviewSize();
        return new Point(previewSize2.width, previewSize2.height);
    }
}
