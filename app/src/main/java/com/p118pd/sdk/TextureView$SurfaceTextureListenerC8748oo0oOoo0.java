package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.view.MotionEvent;
import android.view.TextureView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.views.text.FontMetricsUtil;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.HybridBinarizer;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.pd.sdk.oo0oOoo0  reason: case insensitive filesystem */
public class TextureView$SurfaceTextureListenerC8748oo0oOoo0 extends TextureView implements TextureView.SurfaceTextureListener, Camera.PreviewCallback {
    public static volatile boolean OooO0o0;
    public SurfaceTexture OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Camera f21929OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final MultiFormatReader f21930OooO00o = new MultiFormatReader();
    public boolean OooO0O0;
    public boolean OooO0OO;
    public float OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f21931OooO0Oo = false;
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;
    public int o0ooOoO;

    /* renamed from: com.pd.sdk.oo0oOoo0$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ int o00oO0O;

        public OooO00o(int i) {
            this.o00oO0O = i;
        }

        public void run() {
            TextureView$SurfaceTextureListenerC8748oo0oOoo0.this.OooO0O0();
            TextureView$SurfaceTextureListenerC8748oo0oOoo0.this.o00oO0O = this.o00oO0O;
            TextureView$SurfaceTextureListenerC8748oo0oOoo0.this.m20392OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.oo0oOoo0$OooO0O0 */
    public class OooO0O0 implements Camera.AutoFocusCallback {
        public OooO0O0() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            if (z) {
                camera.cancelAutoFocus();
            }
        }
    }

    public TextureView$SurfaceTextureListenerC8748oo0oOoo0(Context context, int i) {
        super(context);
        setSurfaceTextureListener(this);
        this.o00oO0O = i;
        OooO00o(C8745oo0oOoO0.OooO00o().m20381OooO00o());
    }

    public void OooO0O0(int i) {
        C8745oo0oOoO0.OooO00o().OooO0O0(this.o00oO0O, i);
        this.o0ooOO0 = i;
    }

    public void OooO0OO(int i) {
        C8745oo0oOoO0.OooO00o().OooO0OO(this.o00oO0O, i);
    }

    public void OooO0Oo(int i) {
        C8745oo0oOoO0.OooO00o().OooO0Oo(this.o00oO0O, i);
    }

    public void OooO0o0(int i) {
        C8745oo0oOoO0.OooO00o().OooO0o0(this.o00oO0O, i);
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (C8745oo0oOoO0.OooO00o().m20385OooO00o() && !OooO0o0) {
            OooO0o0 = true;
            new OooO0OO(camera, bArr).execute(new Void[0]);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.OooO00o = surfaceTexture;
        this.o0ooOOo = i;
        this.o0ooOoO = i2;
        OooO0OO();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.OooO00o = null;
        this.o0ooOOo = 0;
        this.o0ooOoO = 0;
        OooO0Oo();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.o0ooOOo = i;
        this.o0ooOoO = i2;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Camera camera = this.f21929OooO00o;
        if (camera == null) {
            return false;
        }
        Camera.Parameters parameters = camera.getParameters();
        int action = motionEvent.getAction();
        if (motionEvent.getPointerCount() > 1) {
            if (action == 5) {
                this.OooO0Oo = OooO00o(motionEvent);
            } else if (action == 2 && parameters.isZoomSupported()) {
                this.f21929OooO00o.cancelAutoFocus();
                OooO0O0(motionEvent, parameters);
            }
        } else if (action == 1) {
            OooO00o(motionEvent, parameters);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r0.printStackTrace();
        OooO0Oo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ed, code lost:
        r6.OooO0O0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0 A[ExcHandler: Exception (r0v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:6:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void OooO0OO() {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.TextureView$SurfaceTextureListenerC8748oo0oOoo0.OooO0OO():void");
    }

    private synchronized void OooO0Oo() {
        if (!this.OooO0OO) {
            this.OooO0OO = true;
            try {
                if (this.f21929OooO00o != null) {
                    this.f21929OooO00o.stopPreview();
                    this.f21929OooO00o.setPreviewCallback(null);
                    C8745oo0oOoO0.OooO00o().m20386OooO0O0(this.o00oO0O);
                    this.f21929OooO00o = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.OooO0OO = false;
                throw th;
            }
            this.OooO0OO = false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20391OooO00o() {
        return this.o00oO0O;
    }

    public void OooO0O0() {
        if (this.f21929OooO00o != null) {
            OooO0Oo();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public double m20390OooO00o() {
        return (double) (((float) C8745oo0oOoO0.OooO00o().OooO0Oo(this.o00oO0O)) / ((float) C8745oo0oOoO0.OooO00o().OooO00o(this.o00oO0O)));
    }

    /* renamed from: com.pd.sdk.oo0oOoo0$OooO0OO */
    public class OooO0OO extends AsyncTask<Void, Void, Void> {
        public final Camera OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f21933OooO00o;

        public OooO0OO(Camera camera, byte[] bArr) {
            this.OooO00o = camera;
            this.f21933OooO00o = bArr;
        }

        private Result OooO00o(int i, int i2, boolean z) {
            BinaryBitmap binaryBitmap;
            try {
                PlanarYUVLuminanceSource planarYUVLuminanceSource = new PlanarYUVLuminanceSource(this.f21933OooO00o, i, i2, 0, 0, i, i2, false);
                if (z) {
                    binaryBitmap = new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource.invert()));
                } else {
                    binaryBitmap = new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource));
                }
                Result decodeWithState = TextureView$SurfaceTextureListenerC8748oo0oOoo0.this.f21930OooO00o.decodeWithState(binaryBitmap);
                TextureView$SurfaceTextureListenerC8748oo0oOoo0.this.f21930OooO00o.reset();
                return decodeWithState;
            } catch (Throwable unused) {
                TextureView$SurfaceTextureListenerC8748oo0oOoo0.this.f21930OooO00o.reset();
                return null;
            }
        }

        private Result OooO00o() {
            Camera.Size previewSize = this.OooO00o.getParameters().getPreviewSize();
            int i = previewSize.width;
            int i2 = previewSize.height;
            Result OooO00o2 = OooO00o(i, i2, false);
            if (OooO00o2 != null) {
                return OooO00o2;
            }
            Result OooO00o3 = OooO00o(i, i2, true);
            if (OooO00o3 != null) {
                return OooO00o3;
            }
            OooO00o(i, i2);
            int i3 = previewSize.height;
            int i4 = previewSize.width;
            Result OooO00o4 = OooO00o(i3, i4, false);
            if (OooO00o4 != null) {
                return OooO00o4;
            }
            return OooO00o(i3, i4, true);
        }

        private void OooO00o(int i, int i2) {
            byte[] bArr = new byte[this.f21933OooO00o.length];
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    int i6 = (((i4 * i) + i) - i3) - 1;
                    if (i5 >= 0) {
                        byte[] bArr2 = this.f21933OooO00o;
                        if (i5 < bArr2.length && i6 >= 0 && i6 < bArr2.length) {
                            bArr[i6] = bArr2[i5];
                        }
                    }
                }
            }
            this.f21933OooO00o = bArr;
        }

        /* renamed from: OooO00o */
        public Void doInBackground(Void... voidArr) {
            if (isCancelled()) {
                return null;
            }
            try {
                Result OooO00o2 = OooO00o();
                if (OooO00o2 != null) {
                    ReactApplicationContext reactContextSingleton = RCTCameraModule.getReactContextSingleton();
                    WritableMap createMap = Arguments.createMap();
                    WritableArray createArray = Arguments.createArray();
                    ResultPoint[] resultPoints = OooO00o2.getResultPoints();
                    if (resultPoints != null) {
                        for (ResultPoint resultPoint : resultPoints) {
                            WritableMap createMap2 = Arguments.createMap();
                            createMap2.putString(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, String.valueOf(resultPoint.getX()));
                            createMap2.putString("y", String.valueOf(resultPoint.getY()));
                            createArray.pushMap(createMap2);
                        }
                    }
                    createMap.putArray("bounds", createArray);
                    createMap.putString("data", OooO00o2.getText());
                    createMap.putString("type", OooO00o2.getBarcodeFormat().toString());
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextSingleton.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("CameraBarCodeReadAndroid", createMap);
                    TextureView$SurfaceTextureListenerC8748oo0oOoo0.this.f21930OooO00o.reset();
                    TextureView$SurfaceTextureListenerC8748oo0oOoo0.OooO0o0 = false;
                    return null;
                }
                throw new Exception();
            } catch (Throwable unused) {
            }
        }
    }

    private void OooO0O0(MotionEvent motionEvent, Camera.Parameters parameters) {
        int maxZoom = parameters.getMaxZoom();
        int zoom = parameters.getZoom();
        float OooO00o2 = OooO00o(motionEvent);
        float f = this.OooO0Oo;
        if (OooO00o2 > f) {
            if (zoom < maxZoom) {
                zoom++;
            }
        } else if (OooO00o2 < f && zoom > 0) {
            zoom--;
        }
        this.OooO0Oo = OooO00o2;
        parameters.setZoom(zoom);
        try {
            this.f21929OooO00o.setParameters(parameters);
        } catch (RuntimeException unused) {
        }
    }

    public void OooO00o(int i) {
        if (this.o00oO0O != i) {
            new Thread(new OooO00o(i)).start();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20393OooO00o(String str) {
        C8745oo0oOoO0.OooO00o().m20383OooO00o(this.o00oO0O, str);
    }

    public void OooO00o(boolean z) {
        this.f21931OooO0Oo = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20392OooO00o() {
        if (this.OooO00o != null) {
            OooO0OO();
        }
    }

    private Activity OooO00o() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private BarcodeFormat OooO00o(String str) {
        if ("aztec".equals(str)) {
            return BarcodeFormat.AZTEC;
        }
        if ("ean13".equals(str)) {
            return BarcodeFormat.EAN_13;
        }
        if ("ean8".equals(str)) {
            return BarcodeFormat.EAN_8;
        }
        if ("qr".equals(str)) {
            return BarcodeFormat.QR_CODE;
        }
        if ("pdf417".equals(str)) {
            return BarcodeFormat.PDF_417;
        }
        if ("upce".equals(str)) {
            return BarcodeFormat.UPC_E;
        }
        if ("datamatrix".equals(str)) {
            return BarcodeFormat.DATA_MATRIX;
        }
        if ("code39".equals(str)) {
            return BarcodeFormat.CODE_39;
        }
        if ("code93".equals(str)) {
            return BarcodeFormat.CODE_93;
        }
        if ("interleaved2of5".equals(str)) {
            return BarcodeFormat.ITF;
        }
        if ("codabar".equals(str)) {
            return BarcodeFormat.CODABAR;
        }
        if ("code128".equals(str)) {
            return BarcodeFormat.CODE_128;
        }
        if ("maxicode".equals(str)) {
            return BarcodeFormat.MAXICODE;
        }
        if ("rss14".equals(str)) {
            return BarcodeFormat.RSS_14;
        }
        if ("rssexpanded".equals(str)) {
            return BarcodeFormat.RSS_EXPANDED;
        }
        if ("upca".equals(str)) {
            return BarcodeFormat.UPC_A;
        }
        if ("upceanextension".equals(str)) {
            return BarcodeFormat.UPC_EAN_EXTENSION;
        }
        String str2 = "Unsupported code.. [" + str + "]";
        return null;
    }

    private void OooO00o(List<String> list) {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        EnumSet noneOf = EnumSet.noneOf(BarcodeFormat.class);
        if (list != null) {
            for (String str : list) {
                BarcodeFormat OooO00o2 = OooO00o(str);
                if (OooO00o2 != null) {
                    noneOf.add(OooO00o2);
                }
            }
        }
        enumMap.put((Enum) DecodeHintType.POSSIBLE_FORMATS, (Object) noneOf);
        this.f21930OooO00o.setHints(enumMap);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:7|8|9|10|(1:12)|13|14|15|16|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r4.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(android.view.MotionEvent r4, android.hardware.Camera.Parameters r5) {
        /*
            r3 = this;
            java.util.List r0 = r5.getSupportedFocusModes()
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = "auto"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0052
            int r0 = r5.getMaxNumFocusAreas()
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            android.hardware.Camera r0 = r3.f21929OooO00o
            r0.cancelAutoFocus()
            int r0 = r3.o0ooOOo     // Catch:{ RuntimeException -> 0x004e }
            int r2 = r3.o0ooOoO     // Catch:{ RuntimeException -> 0x004e }
            android.hardware.Camera$Area r4 = com.p118pd.sdk.C8746oo0oOoOO.OooO00o(r4, r0, r2)     // Catch:{ RuntimeException -> 0x004e }
            r5.setFocusMode(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r4)
            r5.setFocusAreas(r0)
            int r4 = r5.getMaxNumMeteringAreas()
            if (r4 <= 0) goto L_0x0039
            r5.setMeteringAreas(r0)
        L_0x0039:
            android.hardware.Camera r4 = r3.f21929OooO00o     // Catch:{ RuntimeException -> 0x003e }
            r4.setParameters(r5)     // Catch:{ RuntimeException -> 0x003e }
        L_0x003e:
            android.hardware.Camera r4 = r3.f21929OooO00o     // Catch:{ Exception -> 0x0049 }
            com.pd.sdk.oo0oOoo0$OooO0O0 r5 = new com.pd.sdk.oo0oOoo0$OooO0O0     // Catch:{ Exception -> 0x0049 }
            r5.<init>()     // Catch:{ Exception -> 0x0049 }
            r4.autoFocus(r5)     // Catch:{ Exception -> 0x0049 }
            goto L_0x0052
        L_0x0049:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x0052
        L_0x004e:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.TextureView$SurfaceTextureListenerC8748oo0oOoo0.OooO00o(android.view.MotionEvent, android.hardware.Camera$Parameters):void");
    }

    private float OooO00o(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }
}
