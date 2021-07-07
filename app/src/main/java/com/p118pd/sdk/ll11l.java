package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.media.CamcorderProfile;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.cameraview.CameraView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import java.io.File;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.reactnative.camera.CameraModule;

/* renamed from: com.pd.sdk.ll11l */
public class ll11l extends CameraView implements LifecycleEventListener, AbstractC9587iIL, AbstractC6289iillI, AbstractC9498LLiI, AbstractC9644iIi1, AbstractC9471LI {
    public volatile boolean OooO = false;
    public GestureDetector.SimpleOnGestureListener OooO00o = new OooO0o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public GestureDetector f18684OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ScaleGestureDetector.OnScaleGestureListener f18685OooO00o = new ScaleGestureDetector$OnScaleGestureListenerC6727OooO0oO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ScaleGestureDetector f18686OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Promise f18687OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ThemedReactContext f18688OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MultiFormatReader f18689OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1 f18690OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6321ilLLl f18691OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Boolean f18692OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<String> f18693OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<Promise, ReadableMap> f18694OooO00o = new ConcurrentHashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Queue<Promise> f18695OooO00o = new ConcurrentLinkedQueue();
    public Boolean OooO0O0 = false;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Map<Promise, File> f18696OooO0O0 = new ConcurrentHashMap();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f18697OooO0O0 = false;
    public boolean OooO0OO = true;
    public float OooO0Oo = 0.0f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f18698OooO0Oo = false;
    public float OooO0o = 0.0f;

    /* renamed from: OooO0o  reason: collision with other field name */
    public volatile boolean f18699OooO0o = false;
    public float OooO0o0 = 0.0f;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f18700OooO0o0 = false;
    public float OooO0oO = 0.0f;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public volatile boolean f18701OooO0oO = false;
    public volatile boolean OooO0oo = false;
    public boolean OooOO0 = false;
    public boolean OooOO0O = false;
    public boolean OooOO0o = false;
    public boolean OooOOO = false;
    public boolean OooOOO0 = false;
    public boolean OooOOOO = true;
    public boolean OooOOOo = false;
    public int o00oO0O = I1.OooO;
    public int o0O0O00 = 0;
    public int o0OO00O;
    public int o0OOO0o = C6321ilLLl.OooO0O0;
    public int o0Oo0oo;
    public int o0ooOO0 = I1.OooO0oO;
    public int o0ooOOo = I1.OooO0o0;
    public int o0ooOoO = C6321ilLLl.OooO0o0;
    public int oo0o0Oo = 0;

    /* renamed from: com.pd.sdk.ll11l$OooO00o */
    public class OooO00o extends CameraView.Callback {
        public OooO00o() {
        }

        @Override // com.google.android.cameraview.CameraView.Callback
        public void onCameraOpened(CameraView cameraView) {
            C6893lIil.OooO00o(cameraView);
        }

        @Override // com.google.android.cameraview.CameraView.Callback
        public void onFramePreview(CameraView cameraView, byte[] bArr, int i, int i2, int i3) {
            int OooO00o2 = C6893lIil.OooO00o(i3, ll11l.this.getFacing(), ll11l.this.getCameraOrientation());
            boolean z = ll11l.this.OooOO0o && !ll11l.this.f18699OooO0o && (cameraView instanceof AbstractC9587iIL);
            boolean z2 = ll11l.this.OooOO0 && !ll11l.this.f18701OooO0oO && (cameraView instanceof AbstractC6289iillI);
            boolean z3 = ll11l.this.OooOO0O && !ll11l.this.OooO0oo && (cameraView instanceof AbstractC9498LLiI);
            boolean z4 = ll11l.this.OooOOO0 && !ll11l.this.OooO && (cameraView instanceof AbstractC9644iIi1);
            if (z || z2 || z3 || z4) {
                double d = (double) i;
                Double.isNaN(d);
                double d2 = (double) i2;
                Double.isNaN(d2);
                if (((double) bArr.length) >= d * 1.5d * d2) {
                    if (z) {
                        ll11l.this.f18699OooO0o = true;
                        new IlIii1I((AbstractC9587iIL) cameraView, ll11l.this.f18689OooO00o, bArr, i, i2, ll11l.this.OooOOOo, ll11l.this.OooO0Oo, ll11l.this.OooO0o0, ll11l.this.OooO0o, ll11l.this.OooO0oO, ll11l.this.oo0o0Oo, ll11l.this.o0O0O00, ll11l.this.getAspectRatio().toFloat()).execute(new Void[0]);
                    }
                    if (z2) {
                        ll11l.this.f18701OooO0oO = true;
                        new AsyncTaskC6221ii1L((AbstractC6289iillI) cameraView, ll11l.this.f18690OooO00o, bArr, i, i2, OooO00o2, ll11l.this.getResources().getDisplayMetrics().density, ll11l.this.getFacing(), ll11l.this.getWidth(), ll11l.this.getHeight(), ll11l.this.o0Oo0oo, ll11l.this.o0OO00O).execute(new Void[0]);
                    }
                    if (z3) {
                        ll11l.this.OooO0oo = true;
                        if (ll11l.this.o0OOO0o == C6321ilLLl.OooO0O0) {
                            ll11l.this.f18698OooO0Oo = false;
                        } else if (ll11l.this.o0OOO0o == C6321ilLLl.OooO0OO) {
                            ll11l ll11l = ll11l.this;
                            ll11l.f18698OooO0Oo = !ll11l.f18698OooO0Oo;
                        } else if (ll11l.this.o0OOO0o == C6321ilLLl.OooO0Oo) {
                            ll11l.this.f18698OooO0Oo = true;
                        }
                        if (ll11l.this.f18698OooO0Oo) {
                            for (int i4 = 0; i4 < bArr.length; i4++) {
                                bArr[i4] = (byte) (bArr[i4] ^ -1);
                            }
                        }
                        new AsyncTaskC6125iIlil((AbstractC9498LLiI) cameraView, ll11l.this.f18691OooO00o, bArr, i, i2, OooO00o2, ll11l.this.getResources().getDisplayMetrics().density, ll11l.this.getFacing(), ll11l.this.getWidth(), ll11l.this.getHeight(), ll11l.this.o0Oo0oo, ll11l.this.o0OO00O).execute(new Void[0]);
                    }
                    if (z4) {
                        ll11l.this.OooO = true;
                        new AsyncTaskC9575i1ill((AbstractC9644iIi1) cameraView, ll11l.this.f18688OooO00o, bArr, i, i2, OooO00o2, ll11l.this.getResources().getDisplayMetrics().density, ll11l.this.getFacing(), ll11l.this.getWidth(), ll11l.this.getHeight(), ll11l.this.o0Oo0oo, ll11l.this.o0OO00O).execute(new Void[0]);
                    }
                }
            }
        }

        @Override // com.google.android.cameraview.CameraView.Callback
        public void onMountError(CameraView cameraView) {
            C6893lIil.OooO00o(cameraView, "Camera view threw an error - component could not be rendered.");
        }

        @Override // com.google.android.cameraview.CameraView.Callback
        public void onPictureTaken(CameraView cameraView, byte[] bArr, int i) {
            Promise promise = (Promise) ll11l.this.f18695OooO00o.poll();
            ReadableMap readableMap = (ReadableMap) ll11l.this.f18694OooO00o.remove(promise);
            if (readableMap.hasKey("fastMode") && readableMap.getBoolean("fastMode")) {
                promise.resolve(null);
            }
            File file = (File) ll11l.this.f18696OooO0O0.remove(promise);
            if (Build.VERSION.SDK_INT >= 11) {
                new AsyncTaskC9645iIi1L(bArr, promise, readableMap, file, i, ll11l.this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                new AsyncTaskC9645iIi1L(bArr, promise, readableMap, file, i, ll11l.this).execute(new Void[0]);
            }
            C6893lIil.OooO0O0(cameraView);
        }

        @Override // com.google.android.cameraview.CameraView.Callback
        public void onRecordingEnd(CameraView cameraView) {
            C6893lIil.OooO0OO(cameraView);
        }

        @Override // com.google.android.cameraview.CameraView.Callback
        public void onRecordingStart(CameraView cameraView, String str, int i, int i2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("videoOrientation", i);
            createMap.putInt("deviceOrientation", i2);
            createMap.putString("uri", C5188I1l1.OooO00o(new File(str)).toString());
            C6893lIil.OooO0O0(cameraView, createMap);
        }

        @Override // com.google.android.cameraview.CameraView.Callback
        public void onVideoRecorded(CameraView cameraView, String str, int i, int i2) {
            if (ll11l.this.f18687OooO00o != null) {
                if (str != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("isRecordingInterrupted", ll11l.this.OooO0O0.booleanValue());
                    createMap.putInt("videoOrientation", i);
                    createMap.putInt("deviceOrientation", i2);
                    createMap.putString("uri", C5188I1l1.OooO00o(new File(str)).toString());
                    ll11l.this.f18687OooO00o.resolve(createMap);
                } else {
                    ll11l.this.f18687OooO00o.reject("E_RECORDING", "Couldn't stop recording - there is none in progress");
                }
                ll11l.this.f18692OooO00o = false;
                ll11l.this.OooO0O0 = false;
                ll11l.this.f18687OooO00o = null;
            }
        }
    }

    /* renamed from: com.pd.sdk.ll11l$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public final /* synthetic */ Promise OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableMap f18702OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ File f18704OooO00o;

        public OooO0O0(Promise promise, ReadableMap readableMap, File file) {
            this.OooO00o = promise;
            this.f18702OooO00o = readableMap;
            this.f18704OooO00o = file;
        }

        public void run() {
            ll11l.this.f18695OooO00o.add(this.OooO00o);
            ll11l.this.f18694OooO00o.put(this.OooO00o, this.f18702OooO00o);
            ll11l.this.f18696OooO0O0.put(this.OooO00o, this.f18704OooO00o);
            try {
                ll11l.super.takePicture(this.f18702OooO00o);
            } catch (Exception e) {
                ll11l.this.f18695OooO00o.remove(this.OooO00o);
                ll11l.this.f18694OooO00o.remove(this.OooO00o);
                ll11l.this.f18696OooO0O0.remove(this.OooO00o);
                this.OooO00o.reject("E_TAKE_PICTURE_FAILED", e.getMessage());
            }
        }
    }

    /* renamed from: com.pd.sdk.ll11l$OooO0OO */
    public class OooO0OO implements Runnable {
        public final /* synthetic */ Promise OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableMap f18705OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ File f18707OooO00o;

        public OooO0OO(ReadableMap readableMap, File file, Promise promise) {
            this.f18705OooO00o = readableMap;
            this.f18707OooO00o = file;
            this.OooO00o = promise;
        }

        public void run() {
            try {
                String string = this.f18705OooO00o.hasKey("path") ? this.f18705OooO00o.getString("path") : C5188I1l1.OooO00o(this.f18707OooO00o, ".mp4");
                int i = this.f18705OooO00o.hasKey("maxDuration") ? this.f18705OooO00o.getInt("maxDuration") : -1;
                int i2 = this.f18705OooO00o.hasKey("maxFileSize") ? this.f18705OooO00o.getInt("maxFileSize") : -1;
                int i3 = this.f18705OooO00o.hasKey("fps") ? this.f18705OooO00o.getInt("fps") : -1;
                CamcorderProfile OooO00o2 = this.f18705OooO00o.hasKey("quality") ? C6893lIil.m18061OooO00o(this.f18705OooO00o.getInt("quality")) : CamcorderProfile.get(1);
                if (this.f18705OooO00o.hasKey("videoBitrate")) {
                    OooO00o2.videoBitRate = this.f18705OooO00o.getInt("videoBitrate");
                }
                if (ll11l.super.record(string, i * 1000, i2, this.f18705OooO00o.hasKey("mute") ? !this.f18705OooO00o.getBoolean("mute") : true, OooO00o2, this.f18705OooO00o.hasKey("orientation") ? this.f18705OooO00o.getInt("orientation") : 0, i3)) {
                    ll11l.this.f18692OooO00o = true;
                    ll11l.this.f18687OooO00o = this.OooO00o;
                    return;
                }
                this.OooO00o.reject("E_RECORDING_FAILED", "Starting video recording failed. Another recording might be in progress.");
            } catch (IOException unused) {
                this.OooO00o.reject("E_RECORDING_FAILED", "Starting video recording failed - could not create video file.");
            }
        }
    }

    /* renamed from: com.pd.sdk.ll11l$OooO0Oo  reason: case insensitive filesystem */
    public class RunnableC6725OooO0Oo implements Runnable {
        public RunnableC6725OooO0Oo() {
        }

        public void run() {
            if ((ll11l.this.f18697OooO0O0 && !ll11l.this.isCameraOpened()) || ll11l.this.OooO0OO) {
                ll11l.this.f18697OooO0O0 = false;
                ll11l.this.OooO0OO = false;
                ll11l.this.start();
            }
        }
    }

    /* renamed from: com.pd.sdk.ll11l$OooO0o */
    public class OooO0o extends GestureDetector.SimpleOnGestureListener {
        public OooO0o() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ll11l ll11l = ll11l.this;
            C6893lIil.OooO00o((ViewGroup) ll11l, true, ll11l.OooO00o((ll11l) motionEvent.getX()), ll11l.this.OooO00o((ll11l) motionEvent.getY()));
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ll11l ll11l = ll11l.this;
            C6893lIil.OooO00o((ViewGroup) ll11l, false, ll11l.OooO00o((ll11l) motionEvent.getX()), ll11l.this.OooO00o((ll11l) motionEvent.getY()));
            return true;
        }
    }

    /* renamed from: com.pd.sdk.ll11l$OooO0o0  reason: case insensitive filesystem */
    public class RunnableC6726OooO0o0 implements Runnable {
        public RunnableC6726OooO0o0() {
        }

        public void run() {
            ll11l.this.stop();
            ll11l.this.cleanup();
        }
    }

    /* renamed from: com.pd.sdk.ll11l$OooO0oO  reason: case insensitive filesystem */
    public class ScaleGestureDetector$OnScaleGestureListenerC6727OooO0oO implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetector$OnScaleGestureListenerC6727OooO0oO() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            Log.i("testlog", "onScale");
            ll11l.this.m17825OooO00o((ll11l) scaleGestureDetector.getScaleFactor());
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            Log.i("testlog", "onScaleBegin");
            ll11l.this.m17825OooO00o((ll11l) scaleGestureDetector.getScaleFactor());
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public ll11l(ThemedReactContext themedReactContext) {
        super(themedReactContext, true);
        this.f18688OooO00o = themedReactContext;
        themedReactContext.addLifecycleEventListener(this);
        addCallback(new OooO00o());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        I1 r0 = this.f18690OooO00o;
        if (r0 != null) {
            r0.OooO00o();
        }
        C6321ilLLl r02 = this.f18691OooO00o;
        if (r02 != null) {
            r02.OooO00o();
        }
        this.f18689OooO00o = null;
        this.f18688OooO00o.removeLifecycleEventListener(this);
        this.mBgHandler.post(new RunnableC6726OooO0o0());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        if (this.f18692OooO00o.booleanValue()) {
            this.OooO0O0 = true;
        }
        if (!this.f18697OooO0O0 && isCameraOpened()) {
            this.f18697OooO0O0 = true;
            stop();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (OooO00o()) {
            this.mBgHandler.post(new RunnableC6725OooO0Oo());
        } else {
            C6893lIil.OooO00o(this, "Camera permissions not granted - component could not be rendered.");
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        View view = getView();
        if (view != null) {
            float f = (float) (i3 - i);
            float f2 = (float) (i4 - i2);
            float f3 = getAspectRatio().toFloat();
            int i7 = getResources().getConfiguration().orientation;
            setBackgroundColor(-16777216);
            if (i7 == 2) {
                float f4 = f3 * f2;
                if (f4 < f) {
                    i6 = (int) (f / f3);
                } else {
                    i5 = (int) f4;
                    i6 = (int) f2;
                    int i8 = (int) ((f - ((float) i5)) / 2.0f);
                    int i9 = (int) ((f2 - ((float) i6)) / 2.0f);
                    this.o0Oo0oo = i8;
                    this.o0OO00O = i9;
                    view.layout(i8, i9, i5 + i8, i6 + i9);
                }
            } else {
                float f5 = f3 * f;
                if (f5 > f2) {
                    i6 = (int) f5;
                } else {
                    i5 = (int) (f2 / f3);
                    i6 = (int) f2;
                    int i82 = (int) ((f - ((float) i5)) / 2.0f);
                    int i92 = (int) ((f2 - ((float) i6)) / 2.0f);
                    this.o0Oo0oo = i82;
                    this.o0OO00O = i92;
                    view.layout(i82, i92, i5 + i82, i6 + i92);
                }
            }
            i5 = (int) f;
            int i822 = (int) ((f - ((float) i5)) / 2.0f);
            int i922 = (int) ((f2 - ((float) i6)) / 2.0f);
            this.o0Oo0oo = i822;
            this.o0OO00O = i922;
            view.layout(i822, i922, i5 + i822, i6 + i922);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f18700OooO0o0) {
            this.f18686OooO00o.onTouchEvent(motionEvent);
        }
        if (!this.OooOOO) {
            return true;
        }
        this.f18684OooO00o.onTouchEvent(motionEvent);
        return true;
    }

    @SuppressLint({"all"})
    public void requestLayout() {
    }

    public void setBarCodeTypes(List<String> list) {
        this.f18693OooO00o = list;
        OooO0o0();
    }

    public void setFaceDetectionClassifications(int i) {
        this.o0ooOOo = i;
        I1 r0 = this.f18690OooO00o;
        if (r0 != null) {
            r0.OooO00o(i);
        }
    }

    public void setFaceDetectionLandmarks(int i) {
        this.o0ooOO0 = i;
        I1 r0 = this.f18690OooO00o;
        if (r0 != null) {
            r0.OooO0O0(i);
        }
    }

    public void setFaceDetectionMode(int i) {
        this.o00oO0O = i;
        I1 r0 = this.f18690OooO00o;
        if (r0 != null) {
            r0.OooO0OO(i);
        }
    }

    public void setGoogleVisionBarcodeMode(int i) {
        this.o0OOO0o = i;
    }

    public void setGoogleVisionBarcodeType(int i) {
        this.o0ooOoO = i;
        C6321ilLLl r0 = this.f18691OooO00o;
        if (r0 != null) {
            r0.OooO00o(i);
        }
    }

    public void setShouldDetectFaces(boolean z) {
        if (z && this.f18690OooO00o == null) {
            OooO0oO();
        }
        this.OooOO0 = z;
        setScanning(z || this.OooOO0O || this.OooOO0o || this.OooOOO0);
    }

    public void setShouldDetectTouches(boolean z) {
        if (this.OooOOO || !z) {
            this.f18684OooO00o = null;
        } else {
            this.f18684OooO00o = new GestureDetector(this.f18688OooO00o, this.OooO00o);
        }
        this.OooOOO = z;
    }

    public void setShouldGoogleDetectBarcodes(boolean z) {
        if (z && this.f18691OooO00o == null) {
            OooO0o();
        }
        this.OooOO0O = z;
        setScanning(this.OooOO0 || z || this.OooOO0o || this.OooOOO0);
    }

    public void setShouldRecognizeText(boolean z) {
        this.OooOOO0 = z;
        setScanning(this.OooOO0 || this.OooOO0O || this.OooOO0o || z);
    }

    public void setShouldScanBarCodes(boolean z) {
        if (z && this.f18689OooO00o == null) {
            OooO0o0();
        }
        this.OooOO0o = z;
        setScanning(this.OooOO0 || this.OooOO0O || z || this.OooOOO0);
    }

    public void setTracking(boolean z) {
        this.OooOOOO = z;
        I1 r0 = this.f18690OooO00o;
        if (r0 != null) {
            r0.OooO00o(z);
        }
    }

    public void setUseNativeZoom(boolean z) {
        if (this.f18700OooO0o0 || !z) {
            this.f18686OooO00o = null;
        } else {
            this.f18686OooO00o = new ScaleGestureDetector(this.f18688OooO00o, this.f18685OooO00o);
        }
        this.f18700OooO0o0 = z;
    }

    private void OooO0o() {
        C6321ilLLl r0 = new C6321ilLLl(this.f18688OooO00o);
        this.f18691OooO00o = r0;
        r0.OooO00o(this.o0ooOoO);
    }

    private void OooO0oO() {
        I1 r0 = new I1(this.f18688OooO00o);
        this.f18690OooO00o = r0;
        r0.OooO0OO(this.o00oO0O);
        this.f18690OooO00o.OooO0O0(this.o0ooOO0);
        this.f18690OooO00o.OooO00o(this.o0ooOOo);
        this.f18690OooO00o.OooO00o(this.OooOOOO);
    }

    private void OooO0o0() {
        this.f18689OooO00o = new MultiFormatReader();
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        EnumSet noneOf = EnumSet.noneOf(BarcodeFormat.class);
        List<String> list = this.f18693OooO00o;
        if (list != null) {
            for (String str : list) {
                String str2 = (String) CameraModule.VALID_BARCODE_TYPES.get(str);
                if (str2 != null) {
                    noneOf.add(BarcodeFormat.valueOf(str2));
                }
            }
        }
        enumMap.put((Enum) DecodeHintType.POSSIBLE_FORMATS, (Object) noneOf);
        this.f18689OooO00o.setHints(enumMap);
    }

    @Override // com.p118pd.sdk.AbstractC6289iillI
    public void OooO0Oo() {
        this.f18701OooO0oO = false;
    }

    @Override // com.p118pd.sdk.AbstractC9498LLiI
    public void OooO0OO() {
        this.OooO0oo = false;
    }

    @Override // com.p118pd.sdk.AbstractC9644iIi1
    public void OooO0OO(WritableArray writableArray) {
        if (this.OooOOO0) {
            C6893lIil.OooO0OO(this, writableArray);
        }
    }

    public void OooO0O0(ReadableMap readableMap, Promise promise, File file) {
        this.mBgHandler.post(new OooO0O0(promise, readableMap, file));
    }

    @Override // com.p118pd.sdk.AbstractC6289iillI
    public void OooO0O0(WritableArray writableArray) {
        if (this.OooOO0) {
            C6893lIil.OooO0O0(this, writableArray);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9644iIi1
    public void OooO0O0() {
        this.OooO = false;
    }

    @Override // com.p118pd.sdk.AbstractC9471LI
    public void OooO00o(WritableMap writableMap) {
        C6893lIil.OooO00o(this, writableMap);
    }

    public void OooO00o(ReadableMap readableMap, Promise promise, File file) {
        this.mBgHandler.post(new OooO0OO(readableMap, file, promise));
    }

    @Override // com.p118pd.sdk.AbstractC9587iIL
    public void OooO00o(Result result, int i, int i2) {
        String str = result.getBarcodeFormat().toString();
        if (this.OooOO0o && this.f18693OooO00o.contains(str)) {
            C6893lIil.OooO00o(this, result, i, i2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9587iIL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17826OooO00o() {
        this.f18699OooO0o = false;
        MultiFormatReader multiFormatReader = this.f18689OooO00o;
        if (multiFormatReader != null) {
            multiFormatReader.reset();
        }
    }

    public void OooO00o(float f, float f2, float f3, float f4) {
        this.OooOOOo = true;
        this.OooO0Oo = f;
        this.OooO0o0 = f2;
        this.OooO0o = f3;
        this.OooO0oO = f4;
    }

    public void OooO00o(int i, int i2) {
        this.oo0o0Oo = i;
        this.o0O0O00 = i2;
    }

    @Override // com.p118pd.sdk.AbstractC6289iillI
    public void OooO00o(I1 r2) {
        if (this.OooOO0) {
            C6893lIil.OooO00o(this, r2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9498LLiI
    public void OooO00o(WritableArray writableArray) {
        if (this.OooOO0O) {
            C6893lIil.OooO00o(this, writableArray);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9498LLiI
    public void OooO00o(C6321ilLLl r2) {
        if (this.OooOO0O) {
            C6893lIil.OooO00o(this, r2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m17825OooO00o(float f) {
        float zoom = getZoom();
        float f2 = (f - 1.0f) + zoom;
        if (f2 > zoom) {
            setZoom(Math.min(f2, 1.0f));
        } else {
            setZoom(Math.max(f2, 0.0f));
        }
    }

    @Override // com.p118pd.sdk.AbstractC9587iIL
    private boolean OooO00o() {
        if (Build.VERSION.SDK_INT < 23 || C7009o000OoOo.OooO00o(getContext(), "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int OooO00o(float f) {
        Resources resources = getResources();
        resources.getConfiguration();
        return (int) (f / resources.getDisplayMetrics().density);
    }
}
