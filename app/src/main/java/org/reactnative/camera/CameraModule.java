package org.reactnative.camera;

import android.content.pm.PackageInfo;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.cameraview.AspectRatio;
import com.google.android.cameraview.Size;
import com.google.zxing.BarcodeFormat;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.p118pd.sdk.C7546o0o000O0;
import com.p118pd.sdk.C9707liLi;
import com.p118pd.sdk.I1;
import com.p118pd.sdk.iL1ii;
import com.p118pd.sdk.ll11l;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import javax.annotation.Nullable;

public class CameraModule extends ReactContextBaseJavaModule {
    public static final int GOOGLE_VISION_BARCODE_MODE_ALTERNATE = 1;
    public static final int GOOGLE_VISION_BARCODE_MODE_INVERTED = 2;
    public static final int GOOGLE_VISION_BARCODE_MODE_NORMAL = 0;
    public static final String TAG = "CameraModule";
    public static final Map<String, Object> VALID_BARCODE_TYPES = Collections.unmodifiableMap(new HashMap<String, Object>() {
        /* class org.reactnative.camera.CameraModule.C48441 */

        {
            put("aztec", BarcodeFormat.AZTEC.toString());
            put("ean13", BarcodeFormat.EAN_13.toString());
            put("ean8", BarcodeFormat.EAN_8.toString());
            put("qr", BarcodeFormat.QR_CODE.toString());
            put("pdf417", BarcodeFormat.PDF_417.toString());
            put("upc_e", BarcodeFormat.UPC_E.toString());
            put("datamatrix", BarcodeFormat.DATA_MATRIX.toString());
            put("code39", BarcodeFormat.CODE_39.toString());
            put("code93", BarcodeFormat.CODE_93.toString());
            put("interleaved2of5", BarcodeFormat.ITF.toString());
            put("codabar", BarcodeFormat.CODABAR.toString());
            put("code128", BarcodeFormat.CODE_128.toString());
            put("maxicode", BarcodeFormat.MAXICODE.toString());
            put("rss14", BarcodeFormat.RSS_14.toString());
            put("rssexpanded", BarcodeFormat.RSS_EXPANDED.toString());
            put("upc_a", BarcodeFormat.UPC_A.toString());
            put("upc_ean", BarcodeFormat.UPC_EAN_EXTENSION.toString());
        }
    });
    public static final int VIDEO_1080P = 1;
    public static final int VIDEO_2160P = 0;
    public static final int VIDEO_480P = 3;
    public static final int VIDEO_4x3 = 4;
    public static final int VIDEO_720P = 2;
    public iL1ii mScopedContext;

    public class OooO implements UIBlock {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f23991OooO00o;

        public OooO(int i, Promise promise) {
            this.OooO00o = i;
            this.f23991OooO00o = promise;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            try {
                WritableArray createArray = Arguments.createArray();
                for (Properties properties : ((ll11l) nativeViewHierarchyManager.resolveView(this.OooO00o)).getCameraIds()) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("id", properties.getProperty("id"));
                    writableNativeMap.putInt("type", Integer.valueOf(properties.getProperty("type")).intValue());
                    createArray.pushMap(writableNativeMap);
                }
                this.f23991OooO00o.resolve(createArray);
            } catch (Exception e) {
                e.printStackTrace();
                this.f23991OooO00o.reject("E_CAMERA_FAILED", e.getMessage());
            }
        }
    }

    public class OooO00o implements UIBlock {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f23993OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f23994OooO00o;

        public OooO00o(int i, String str, Promise promise) {
            this.OooO00o = i;
            this.f23994OooO00o = str;
            this.f23993OooO00o = promise;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            try {
                ll11l ll11l = (ll11l) nativeViewHierarchyManager.resolveView(this.OooO00o);
                WritableArray createArray = Arguments.createArray();
                if (ll11l.isCameraOpened()) {
                    for (Size size : ll11l.getAvailablePictureSizes(AspectRatio.parse(this.f23994OooO00o))) {
                        createArray.pushString(size.toString());
                    }
                    this.f23993OooO00o.resolve(createArray);
                    return;
                }
                this.f23993OooO00o.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
            } catch (Exception unused) {
                this.f23993OooO00o.reject("E_CAMERA_BAD_VIEWTAG", "getAvailablePictureSizesAsync: Expected a Camera component");
            }
        }
    }

    public class OooO0O0 implements UIBlock {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f23996OooO00o;

        public OooO0O0(int i, Promise promise) {
            this.OooO00o = i;
            this.f23996OooO00o = promise;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            try {
                WritableArray createArray = Arguments.createArray();
                Iterator<int[]> it = ((ll11l) nativeViewHierarchyManager.resolveView(this.OooO00o)).getSupportedPreviewFpsRange().iterator();
                while (it.hasNext()) {
                    int[] next = it.next();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt("MAXIMUM_FPS", next[0]);
                    writableNativeMap.putInt("MINIMUM_FPS", next[1]);
                    createArray.pushMap(writableNativeMap);
                }
                this.f23996OooO00o.resolve(createArray);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class OooO0OO implements UIBlock {
        public final /* synthetic */ int OooO00o;

        public OooO0OO(int i) {
            this.OooO00o = i;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            try {
                ll11l ll11l = (ll11l) nativeViewHierarchyManager.resolveView(this.OooO00o);
                if (ll11l.isCameraOpened()) {
                    ll11l.pausePreview();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$OooO0Oo  reason: case insensitive filesystem */
    public class C9951OooO0Oo implements UIBlock {
        public final /* synthetic */ int OooO00o;

        public C9951OooO0Oo(int i) {
            this.OooO00o = i;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            try {
                ll11l ll11l = (ll11l) nativeViewHierarchyManager.resolveView(this.OooO00o);
                if (ll11l.isCameraOpened()) {
                    ll11l.resumePreview();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class OooO0o implements UIBlock {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f24000OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableMap f24001OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ File f24002OooO00o;

        public OooO0o(int i, ReadableMap readableMap, Promise promise, File file) {
            this.OooO00o = i;
            this.f24001OooO00o = readableMap;
            this.f24000OooO00o = promise;
            this.f24002OooO00o = file;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            try {
                ll11l ll11l = (ll11l) nativeViewHierarchyManager.resolveView(this.OooO00o);
                if (ll11l.isCameraOpened()) {
                    ll11l.OooO00o(this.f24001OooO00o, this.f24000OooO00o, this.f24002OooO00o);
                } else {
                    this.f24000OooO00o.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
                }
            } catch (Exception e) {
                this.f24000OooO00o.reject("E_CAPTURE_FAILED", e.getMessage());
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$OooO0o0  reason: case insensitive filesystem */
    public class C9952OooO0o0 implements UIBlock {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f24004OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableMap f24005OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ File f24006OooO00o;

        public C9952OooO0o0(int i, ReadableMap readableMap, Promise promise, File file) {
            this.OooO00o = i;
            this.f24005OooO00o = readableMap;
            this.f24004OooO00o = promise;
            this.f24006OooO00o = file;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            ll11l ll11l = (ll11l) nativeViewHierarchyManager.resolveView(this.OooO00o);
            try {
                if (ll11l.isCameraOpened()) {
                    ll11l.OooO0O0(this.f24005OooO00o, this.f24004OooO00o, this.f24006OooO00o);
                } else {
                    this.f24004OooO00o.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
                }
            } catch (Exception e) {
                this.f24004OooO00o.reject("E_TAKE_PICTURE_FAILED", e.getMessage());
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$OooO0oO  reason: case insensitive filesystem */
    public class C9953OooO0oO implements UIBlock {
        public final /* synthetic */ int OooO00o;

        public C9953OooO0oO(int i) {
            this.OooO00o = i;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            try {
                ll11l ll11l = (ll11l) nativeViewHierarchyManager.resolveView(this.OooO00o);
                if (ll11l.isCameraOpened()) {
                    ll11l.stopRecording();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: org.reactnative.camera.CameraModule$OooO0oo  reason: case insensitive filesystem */
    public class C9954OooO0oo implements UIBlock {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f24009OooO00o;

        public C9954OooO0oo(int i, Promise promise) {
            this.OooO00o = i;
            this.f24009OooO00o = promise;
        }

        @Override // com.facebook.react.uimanager.UIBlock
        public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            try {
                ll11l ll11l = (ll11l) nativeViewHierarchyManager.resolveView(this.OooO00o);
                WritableArray createArray = Arguments.createArray();
                if (ll11l.isCameraOpened()) {
                    for (AspectRatio aspectRatio : ll11l.getSupportedAspectRatios()) {
                        createArray.pushString(aspectRatio.toString());
                    }
                    this.f24009OooO00o.resolve(createArray);
                    return;
                }
                this.f24009OooO00o.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public CameraModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mScopedContext = new iL1ii(reactApplicationContext);
    }

    @ReactMethod
    public void checkIfRecordAudioPermissionsAreDefined(Promise promise) {
        try {
            PackageInfo packageInfo = getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null) {
                for (String str : packageInfo.requestedPermissions) {
                    if (str.equals("android.permission.RECORD_AUDIO")) {
                        promise.resolve(true);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        promise.resolve(false);
    }

    @ReactMethod
    public void getAvailablePictureSizes(String str, int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new OooO00o(i, str, promise));
    }

    @ReactMethod
    public void getCameraIds(int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new OooO(i, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new HashMap<String, Object>() {
            /* class org.reactnative.camera.CameraModule.C48452 */

            {
                put("Type", OooO0o());
                put("FlashMode", OooO0Oo());
                put("AutoFocus", OooO0O0());
                put(ExifInterface.o00000O0, OooO0oo());
                put("VideoQuality", OooO0oO());
                put("BarCodeType", OooO0OO());
                put("FaceDetection", Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.camera.CameraModule.C48452.C48461 */

                    {
                        put("Mode", OooO0Oo());
                        put("Landmarks", OooO0OO());
                        put("Classifications", OooO0O0());
                    }

                    private Map<String, Object> OooO0O0() {
                        return Collections.unmodifiableMap(new HashMap<String, Object>() {
                            /* class org.reactnative.camera.CameraModule.C48452.C48461.C48482 */

                            {
                                put("all", Integer.valueOf(I1.OooO0Oo));
                                put("none", Integer.valueOf(I1.OooO0o0));
                            }
                        });
                    }

                    private Map<String, Object> OooO0OO() {
                        return Collections.unmodifiableMap(new HashMap<String, Object>() {
                            /* class org.reactnative.camera.CameraModule.C48452.C48461.C48493 */

                            {
                                put("all", Integer.valueOf(I1.OooO0o));
                                put("none", Integer.valueOf(I1.OooO0oO));
                            }
                        });
                    }

                    private Map<String, Object> OooO0Oo() {
                        return Collections.unmodifiableMap(new HashMap<String, Object>() {
                            /* class org.reactnative.camera.CameraModule.C48452.C48461.C48471 */

                            {
                                put("fast", Integer.valueOf(I1.OooO));
                                put("accurate", Integer.valueOf(I1.OooO0oo));
                            }
                        });
                    }
                }));
                put("GoogleVisionBarcodeDetection", Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.camera.CameraModule.C48452.C48502 */

                    {
                        put("BarcodeType", C9707liLi.f23342OooO00o);
                        put("BarcodeMode", C48452.this.OooO0o0());
                    }
                }));
                put(ExifInterface.f14146OooO0oo, Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.camera.CameraModule.C48452.C48513 */

                    {
                        put("auto", 0);
                        put("portrait", 1);
                        put("portraitUpsideDown", 2);
                        put("landscapeLeft", 3);
                        put("landscapeRight", 4);
                    }
                }));
            }

            private Map<String, Object> OooO0O0() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.camera.CameraModule.C48452.C48546 */

                    {
                        put(ViewProps.f984ON, true);
                        put("off", false);
                    }
                });
            }

            private Map<String, Object> OooO0OO() {
                return CameraModule.VALID_BARCODE_TYPES;
            }

            private Map<String, Object> OooO0Oo() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.camera.CameraModule.C48452.C48535 */

                    {
                        put("off", 0);
                        put(ViewProps.f984ON, 1);
                        put("auto", 3);
                        put("torch", 2);
                    }
                });
            }

            private Map<String, Object> OooO0o() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.camera.CameraModule.C48452.C48524 */

                    {
                        put("front", 1);
                        put(C7546o0o000O0.o000000o, 0);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private Map<String, Object> OooO0o0() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.camera.CameraModule.C48452.C48579 */

                    {
                        put("NORMAL", 0);
                        put("ALTERNATE", 1);
                        put("INVERTED", 2);
                    }
                });
            }

            private Map<String, Object> OooO0oO() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.camera.CameraModule.C48452.C48568 */

                    {
                        put("2160p", 0);
                        put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P, 1);
                        put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P, 2);
                        put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P, 3);
                        put("4:3", 4);
                    }
                });
            }

            private Map<String, Object> OooO0oo() {
                return Collections.unmodifiableMap(new HashMap<String, Object>() {
                    /* class org.reactnative.camera.CameraModule.C48452.C48557 */

                    {
                        put("auto", 0);
                        put("cloudy", 1);
                        put("sunny", 2);
                        put("shadow", 3);
                        put("fluorescent", 4);
                        put("incandescent", 5);
                    }
                });
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCameraModule";
    }

    public iL1ii getScopedContext() {
        return this.mScopedContext;
    }

    @ReactMethod
    public void getSupportedPreviewFpsRange(int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new OooO0O0(i, promise));
    }

    @ReactMethod
    public void getSupportedRatios(int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C9954OooO0oo(i, promise));
    }

    @ReactMethod
    public void pausePreview(int i) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new OooO0OO(i));
    }

    @ReactMethod
    public void record(ReadableMap readableMap, int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new OooO0o(i, readableMap, promise, this.mScopedContext.OooO00o()));
    }

    @ReactMethod
    public void resumePreview(int i) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C9951OooO0Oo(i));
    }

    @ReactMethod
    public void stopRecording(int i) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C9953OooO0oO(i));
    }

    @ReactMethod
    public void takePicture(ReadableMap readableMap, int i, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new C9952OooO0o0(i, readableMap, promise, this.mScopedContext.OooO00o()));
    }
}
