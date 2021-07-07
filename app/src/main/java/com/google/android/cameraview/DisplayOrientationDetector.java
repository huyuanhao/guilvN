package com.google.android.cameraview;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.OrientationEventListener;

public abstract class DisplayOrientationDetector {
    public static final SparseIntArray DISPLAY_ORIENTATIONS;
    public Display mDisplay;
    public int mLastKnownDeviceOrientation = 0;
    public int mLastKnownDisplayOrientation = 0;
    public final OrientationEventListener mOrientationEventListener;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        DISPLAY_ORIENTATIONS = sparseIntArray;
        sparseIntArray.put(0, 0);
        DISPLAY_ORIENTATIONS.put(1, 90);
        DISPLAY_ORIENTATIONS.put(2, 180);
        DISPLAY_ORIENTATIONS.put(3, 270);
    }

    public DisplayOrientationDetector(Context context) {
        this.mOrientationEventListener = new OrientationEventListener(context) {
            /* class com.google.android.cameraview.DisplayOrientationDetector.C09451 */
            public int mLastKnownRotation = -1;

            /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x004f  */
            /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onOrientationChanged(int r5) {
                /*
                    r4 = this;
                    r0 = -1
                    if (r5 == r0) goto L_0x005a
                    com.google.android.cameraview.DisplayOrientationDetector r0 = com.google.android.cameraview.DisplayOrientationDetector.this
                    android.view.Display r0 = r0.mDisplay
                    if (r0 != 0) goto L_0x000a
                    goto L_0x005a
                L_0x000a:
                    r0 = 315(0x13b, float:4.41E-43)
                    r1 = 0
                    if (r5 > r0) goto L_0x002d
                    r2 = 45
                    if (r5 >= r2) goto L_0x0014
                    goto L_0x002d
                L_0x0014:
                    r3 = 135(0x87, float:1.89E-43)
                    if (r5 <= r2) goto L_0x001d
                    if (r5 >= r3) goto L_0x001d
                    r5 = 90
                    goto L_0x002e
                L_0x001d:
                    r2 = 225(0xe1, float:3.15E-43)
                    if (r5 <= r3) goto L_0x0026
                    if (r5 >= r2) goto L_0x0026
                    r5 = 180(0xb4, float:2.52E-43)
                    goto L_0x002e
                L_0x0026:
                    if (r5 <= r2) goto L_0x002d
                    if (r5 >= r0) goto L_0x002d
                    r5 = 270(0x10e, float:3.78E-43)
                    goto L_0x002e
                L_0x002d:
                    r5 = 0
                L_0x002e:
                    com.google.android.cameraview.DisplayOrientationDetector r0 = com.google.android.cameraview.DisplayOrientationDetector.this
                    int r0 = com.google.android.cameraview.DisplayOrientationDetector.access$000(r0)
                    r2 = 1
                    if (r0 == r5) goto L_0x003d
                    com.google.android.cameraview.DisplayOrientationDetector r0 = com.google.android.cameraview.DisplayOrientationDetector.this
                    com.google.android.cameraview.DisplayOrientationDetector.access$002(r0, r5)
                    r1 = 1
                L_0x003d:
                    com.google.android.cameraview.DisplayOrientationDetector r5 = com.google.android.cameraview.DisplayOrientationDetector.this
                    android.view.Display r5 = r5.mDisplay
                    int r5 = r5.getRotation()
                    int r0 = r4.mLastKnownRotation
                    if (r0 == r5) goto L_0x004c
                    r4.mLastKnownRotation = r5
                    goto L_0x004d
                L_0x004c:
                    r2 = r1
                L_0x004d:
                    if (r2 == 0) goto L_0x005a
                    com.google.android.cameraview.DisplayOrientationDetector r0 = com.google.android.cameraview.DisplayOrientationDetector.this
                    android.util.SparseIntArray r1 = com.google.android.cameraview.DisplayOrientationDetector.DISPLAY_ORIENTATIONS
                    int r5 = r1.get(r5)
                    r0.dispatchOnDisplayOrientationChanged(r5)
                L_0x005a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.cameraview.DisplayOrientationDetector.C09451.onOrientationChanged(int):void");
            }
        };
    }

    public void disable() {
        this.mOrientationEventListener.disable();
        this.mDisplay = null;
    }

    public void dispatchOnDisplayOrientationChanged(int i) {
        this.mLastKnownDisplayOrientation = i;
        onDisplayOrientationChanged(i, this.mLastKnownDeviceOrientation);
    }

    public void enable(Display display) {
        this.mDisplay = display;
        this.mOrientationEventListener.enable();
        dispatchOnDisplayOrientationChanged(DISPLAY_ORIENTATIONS.get(display.getRotation()));
    }

    public int getLastKnownDisplayOrientation() {
        return this.mLastKnownDisplayOrientation;
    }

    public abstract void onDisplayOrientationChanged(int i, int i2);
}
