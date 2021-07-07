package org.reactnative.camera;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.FontMetricsUtil;
import com.google.android.cameraview.AspectRatio;
import com.google.android.cameraview.Size;
import com.p118pd.sdk.ll11l;
import java.util.ArrayList;
import java.util.Map;

public class CameraViewManager extends ViewGroupManager<ll11l> {
    public static final String REACT_CLASS = "RNCamera";

    public enum Events {
        EVENT_CAMERA_READY("onCameraReady"),
        EVENT_ON_MOUNT_ERROR("onMountError"),
        EVENT_ON_BAR_CODE_READ("onBarCodeRead"),
        EVENT_ON_FACES_DETECTED("onFacesDetected"),
        EVENT_ON_BARCODES_DETECTED("onGoogleVisionBarcodesDetected"),
        EVENT_ON_FACE_DETECTION_ERROR("onFaceDetectionError"),
        EVENT_ON_BARCODE_DETECTION_ERROR("onGoogleVisionBarcodeDetectionError"),
        EVENT_ON_TEXT_RECOGNIZED("onTextRecognized"),
        EVENT_ON_PICTURE_TAKEN("onPictureTaken"),
        EVENT_ON_PICTURE_SAVED("onPictureSaved"),
        EVENT_ON_RECORDING_START("onRecordingStart"),
        EVENT_ON_RECORDING_END("onRecordingEnd"),
        EVENT_ON_TOUCH("onTouch");
        
        public final String mName;

        /* access modifiers changed from: public */
        Events(String str) {
            this.mName = str;
        }

        public String toString() {
            return this.mName;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        Events[] values = Events.values();
        for (Events events : values) {
            builder.put(events.toString(), MapBuilder.m946of("registrationName", events.toString()));
        }
        return builder.build();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return "RNCamera";
    }

    @ReactProp(name = "autoFocus")
    public void setAutoFocus(ll11l ll11l, boolean z) {
        ll11l.setAutoFocus(z);
    }

    @ReactProp(name = "autoFocusPointOfInterest")
    public void setAutoFocusPointOfInterest(ll11l ll11l, ReadableMap readableMap) {
        if (readableMap != null) {
            ll11l.setAutoFocusPointOfInterest((float) readableMap.getDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT), (float) readableMap.getDouble("y"));
        }
    }

    @ReactProp(name = "barCodeScannerEnabled")
    public void setBarCodeScanning(ll11l ll11l, boolean z) {
        ll11l.setShouldScanBarCodes(z);
    }

    @ReactProp(name = "barCodeTypes")
    public void setBarCodeTypes(ll11l ll11l, ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList arrayList = new ArrayList(readableArray.size());
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(readableArray.getString(i));
            }
            ll11l.setBarCodeTypes(arrayList);
        }
    }

    @ReactProp(name = "cameraId")
    public void setCameraId(ll11l ll11l, String str) {
        ll11l.setCameraId(str);
    }

    @ReactProp(name = "cameraViewDimensions")
    public void setCameraViewDimensions(ll11l ll11l, ReadableMap readableMap) {
        if (readableMap != null) {
            ll11l.OooO00o((int) readableMap.getDouble("width"), (int) readableMap.getDouble("height"));
        }
    }

    @ReactProp(name = "exposure")
    public void setExposureCompensation(ll11l ll11l, float f) {
        ll11l.setExposureCompensation(f);
    }

    @ReactProp(name = "faceDetectorEnabled")
    public void setFaceDetecting(ll11l ll11l, boolean z) {
        ll11l.setShouldDetectFaces(z);
    }

    @ReactProp(name = "faceDetectionClassifications")
    public void setFaceDetectionClassifications(ll11l ll11l, int i) {
        ll11l.setFaceDetectionClassifications(i);
    }

    @ReactProp(name = "faceDetectionLandmarks")
    public void setFaceDetectionLandmarks(ll11l ll11l, int i) {
        ll11l.setFaceDetectionLandmarks(i);
    }

    @ReactProp(name = "faceDetectionMode")
    public void setFaceDetectionMode(ll11l ll11l, int i) {
        ll11l.setFaceDetectionMode(i);
    }

    @ReactProp(name = "flashMode")
    public void setFlashMode(ll11l ll11l, int i) {
        ll11l.setFlash(i);
    }

    @ReactProp(name = "focusDepth")
    public void setFocusDepth(ll11l ll11l, float f) {
        ll11l.setFocusDepth(f);
    }

    @ReactProp(name = "googleVisionBarcodeDetectorEnabled")
    public void setGoogleVisionBarcodeDetecting(ll11l ll11l, boolean z) {
        ll11l.setShouldGoogleDetectBarcodes(z);
    }

    @ReactProp(name = "googleVisionBarcodeMode")
    public void setGoogleVisionBarcodeMode(ll11l ll11l, int i) {
        ll11l.setGoogleVisionBarcodeMode(i);
    }

    @ReactProp(name = "googleVisionBarcodeType")
    public void setGoogleVisionBarcodeType(ll11l ll11l, int i) {
        ll11l.setGoogleVisionBarcodeType(i);
    }

    @ReactProp(name = "pictureSize")
    public void setPictureSize(ll11l ll11l, String str) {
        ll11l.setPictureSize(str.equals("None") ? null : Size.parse(str));
    }

    @ReactProp(name = "playSoundOnCapture")
    public void setPlaySoundOnCapture(ll11l ll11l, boolean z) {
        ll11l.setPlaySoundOnCapture(z);
    }

    @ReactProp(name = "ratio")
    public void setRatio(ll11l ll11l, String str) {
        ll11l.setAspectRatio(AspectRatio.parse(str));
    }

    @ReactProp(name = "rectOfInterest")
    public void setRectOfInterest(ll11l ll11l, ReadableMap readableMap) {
        if (readableMap != null) {
            ll11l.OooO00o((float) readableMap.getDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT), (float) readableMap.getDouble("y"), (float) readableMap.getDouble("width"), (float) readableMap.getDouble("height"));
        }
    }

    @ReactProp(name = "textRecognizerEnabled")
    public void setTextRecognizing(ll11l ll11l, boolean z) {
        ll11l.setShouldRecognizeText(z);
    }

    @ReactProp(name = "touchDetectorEnabled")
    public void setTouchDetectorEnabled(ll11l ll11l, boolean z) {
        ll11l.setShouldDetectTouches(z);
    }

    @ReactProp(name = "trackingEnabled")
    public void setTracking(ll11l ll11l, boolean z) {
        ll11l.setTracking(z);
    }

    @ReactProp(name = "type")
    public void setType(ll11l ll11l, int i) {
        ll11l.setFacing(i);
    }

    @ReactProp(name = "useCamera2Api")
    public void setUseCamera2Api(ll11l ll11l, boolean z) {
        ll11l.setUsingCamera2Api(z);
    }

    @ReactProp(name = "useNativeZoom")
    public void setUseNativeZoom(ll11l ll11l, boolean z) {
        ll11l.setUseNativeZoom(z);
    }

    @ReactProp(name = "whiteBalance")
    public void setWhiteBalance(ll11l ll11l, int i) {
        ll11l.setWhiteBalance(i);
    }

    @ReactProp(name = "zoom")
    public void setZoom(ll11l ll11l, float f) {
        ll11l.setZoom(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ll11l createViewInstance(ThemedReactContext themedReactContext) {
        return new ll11l(themedReactContext);
    }

    public void onDropViewInstance(ll11l ll11l) {
        ll11l.onHostDestroy();
        super.onDropViewInstance((View) ll11l);
    }
}
