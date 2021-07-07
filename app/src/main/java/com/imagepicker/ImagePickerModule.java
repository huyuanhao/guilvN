package com.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Patterns;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.facebook.react.ReactActivity;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.p118pd.sdk.AbstractC8600oo0O0O0;
import com.p118pd.sdk.C6981o000O00O;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C8597oo0O00oO;
import com.p118pd.sdk.C8598oo0O00oo;
import com.p118pd.sdk.C8604oo0O0OO0;
import com.p118pd.sdk.C8605oo0O0OOO;
import com.p118pd.sdk.C8606oo0O0OOo;
import com.p118pd.sdk.C9058ooOoOoOO;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImagePickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final int REQUEST_LAUNCH_IMAGE_CAPTURE = 13001;
    public static final int REQUEST_LAUNCH_IMAGE_LIBRARY = 13002;
    public static final int REQUEST_LAUNCH_VIDEO_CAPTURE = 13004;
    public static final int REQUEST_LAUNCH_VIDEO_LIBRARY = 13003;
    public static final int REQUEST_PERMISSIONS_FOR_CAMERA = 14001;
    public static final int REQUEST_PERMISSIONS_FOR_LIBRARY = 14002;
    public Callback callback;
    public Uri cameraCaptureURI;
    public final int dialogThemeId;
    public C8598oo0O00oo imageConfig = new C8598oo0O00oo(null, null, 0, 0, 100, 0, false);
    public PermissionListener listener = new OooO00o();
    public Boolean noData = false;
    public ReadableMap options;
    public Boolean pickVideo = false;
    public final ReactApplicationContext reactContext;
    public C8597oo0O00oO responseHelper = new C8597oo0O00oO();
    @Deprecated
    public int videoDurationLimit = 0;
    @Deprecated
    public int videoQuality = 1;

    public class OooO00o implements PermissionListener {
        public OooO00o() {
        }

        @Override // com.facebook.react.modules.core.PermissionListener
        public boolean onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
            boolean z = true;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                z = z && (iArr[i2] == 0);
            }
            ImagePickerModule imagePickerModule = ImagePickerModule.this;
            if (imagePickerModule.callback == null || imagePickerModule.options == null) {
                return false;
            }
            if (!z) {
                ImagePickerModule.this.responseHelper.OooO0O0(ImagePickerModule.this.callback, "Permissions weren't granted");
                return false;
            }
            if (i == 14001) {
                ImagePickerModule imagePickerModule2 = ImagePickerModule.this;
                imagePickerModule2.launchCamera(imagePickerModule2.options, ImagePickerModule.this.callback);
            } else if (i == 14002) {
                ImagePickerModule imagePickerModule3 = ImagePickerModule.this;
                imagePickerModule3.launchImageLibrary(imagePickerModule3.options, ImagePickerModule.this.callback);
            }
            return true;
        }
    }

    public class OooO0O0 implements C8606oo0O0OOo.AbstractC8607OooO0Oo {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.C8606oo0O0OOo.AbstractC8607OooO0Oo
        public void OooO00o(@NonNull ImagePickerModule imagePickerModule) {
            if (imagePickerModule != null) {
                imagePickerModule.launchCamera();
            }
        }

        @Override // com.p118pd.sdk.C8606oo0O0OOo.AbstractC8607OooO0Oo
        public void OooO0O0(@NonNull ImagePickerModule imagePickerModule) {
            if (imagePickerModule != null) {
                imagePickerModule.launchImageLibrary();
            }
        }

        @Override // com.p118pd.sdk.C8606oo0O0OOo.AbstractC8607OooO0Oo
        public void OooO0OO(@NonNull ImagePickerModule imagePickerModule) {
            if (imagePickerModule != null) {
                imagePickerModule.doOnCancel();
            }
        }

        @Override // com.p118pd.sdk.C8606oo0O0OOo.AbstractC8607OooO0Oo
        public void OooO00o(@NonNull ImagePickerModule imagePickerModule, @NonNull String str) {
            if (imagePickerModule != null) {
                imagePickerModule.invokeCustomButton(str);
            }
        }
    }

    public ImagePickerModule(ReactApplicationContext reactApplicationContext, @StyleRes int i) {
        super(reactApplicationContext);
        this.dialogThemeId = i;
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private File createFileFromURI(Uri uri) throws Exception {
        File externalCacheDir = this.reactContext.getExternalCacheDir();
        File file = new File(externalCacheDir, "photo-" + uri.getLastPathSegment());
        InputStream openInputStream = this.reactContext.getContentResolver().openInputStream(uri);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    return file;
                }
            }
        } finally {
            fileOutputStream.close();
            openInputStream.close();
        }
    }

    private String getBase64StringFromFile(String str) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileInputStream = null;
        }
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    @NonNull
    private String getRealPathFromURI(@NonNull Uri uri) {
        return C8605oo0O0OOO.OooO0O0(this.reactContext, uri);
    }

    private boolean isCameraAvailable() {
        return this.reactContext.getPackageManager().hasSystemFeature("android.hardware.camera") || this.reactContext.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    private void parseOptions(ReadableMap readableMap) {
        this.noData = false;
        if (readableMap.hasKey("noData")) {
            this.noData = Boolean.valueOf(readableMap.getBoolean("noData"));
        }
        this.imageConfig = this.imageConfig.OooO00o(readableMap);
        this.pickVideo = false;
        if (readableMap.hasKey("mediaType") && readableMap.getString("mediaType").equals("video")) {
            this.pickVideo = true;
        }
        this.videoQuality = 1;
        if (readableMap.hasKey("videoQuality") && readableMap.getString("videoQuality").equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW)) {
            this.videoQuality = 0;
        }
        this.videoDurationLimit = 0;
        if (readableMap.hasKey("durationLimit")) {
            this.videoDurationLimit = readableMap.getInt("durationLimit");
        }
    }

    private boolean passResult(int i) {
        return this.callback == null || (this.cameraCaptureURI == null && i == 13001) || !(i == 13001 || i == 13002 || i == 13003 || i == 13004);
    }

    private boolean permissionsCheck(@NonNull Activity activity, @NonNull Callback callback2, @NonNull int i) {
        if (C7009o000OoOo.OooO00o(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && C7009o000OoOo.OooO00o(activity, "android.permission.CAMERA") == 0) {
            return true;
        }
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"};
        if (activity instanceof ReactActivity) {
            ((ReactActivity) activity).requestPermissions(strArr, i, this.listener);
        } else if (activity instanceof PermissionAwareActivity) {
            ((PermissionAwareActivity) activity).requestPermissions(strArr, i, this.listener);
        } else if (activity instanceof AbstractC8600oo0O0O0) {
            ((AbstractC8600oo0O0O0) activity).OooO00o(this.listener);
            C6981o000O00O.OooO00o(activity, strArr, i);
        } else {
            throw new UnsupportedOperationException(activity.getClass().getSimpleName() + " must implement " + AbstractC8600oo0O0O0.class.getSimpleName() + " or " + PermissionAwareActivity.class.getSimpleName());
        }
        return false;
    }

    private void putExtraFileInfo(@NonNull String str, @NonNull C8597oo0O00oO oo0o00oo) {
        try {
            File file = new File(str);
            oo0o00oo.OooO00o("fileSize", (double) file.length());
            oo0o00oo.OooO00o("fileName", file.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            oo0o00oo.OooO00o("type", MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl));
        }
    }

    private void updatedResultResponse(@Nullable Uri uri, @NonNull String str) {
        this.responseHelper.OooO00o("uri", uri.toString());
        this.responseHelper.OooO00o("path", str);
        if (!this.noData.booleanValue()) {
            this.responseHelper.OooO00o("data", getBase64StringFromFile(str));
        }
        putExtraFileInfo(str, this.responseHelper);
    }

    public void doOnCancel() {
        Callback callback2 = this.callback;
        if (callback2 != null) {
            this.responseHelper.OooO00o(callback2);
            this.callback = null;
        }
    }

    @NonNull
    public Activity getActivity() {
        return getCurrentActivity();
    }

    public Context getContext() {
        return getReactApplicationContext();
    }

    @StyleRes
    public int getDialogThemeId() {
        return this.dialogThemeId;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImagePickerManager";
    }

    public void invokeCustomButton(@NonNull String str) {
        this.responseHelper.OooO00o(this.callback, str);
    }

    public void launchCamera() {
        launchCamera(this.options, this.callback);
    }

    public void launchImageLibrary() {
        launchImageLibrary(this.options, this.callback);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Uri uri;
        if (!passResult(i)) {
            this.responseHelper.m20242OooO00o();
            if (i2 != -1) {
                C8604oo0O0OO0.OooO00o(i, this.imageConfig);
                this.responseHelper.OooO00o(this.callback);
                this.callback = null;
                return;
            }
            switch (i) {
                case REQUEST_LAUNCH_IMAGE_CAPTURE /*{ENCODED_INT: 13001}*/:
                    uri = this.cameraCaptureURI;
                    break;
                case REQUEST_LAUNCH_IMAGE_LIBRARY /*{ENCODED_INT: 13002}*/:
                    uri = intent.getData();
                    String realPathFromURI = getRealPathFromURI(uri);
                    boolean z = !TextUtils.isEmpty(realPathFromURI) && Patterns.WEB_URL.matcher(realPathFromURI).matches();
                    if (realPathFromURI == null || z) {
                        try {
                            File createFileFromURI = createFileFromURI(uri);
                            String absolutePath = createFileFromURI.getAbsolutePath();
                            uri = Uri.fromFile(createFileFromURI);
                            realPathFromURI = absolutePath;
                        } catch (Exception unused) {
                            this.responseHelper.OooO00o("error", "Could not read photo");
                            this.responseHelper.OooO00o("uri", uri.toString());
                            this.responseHelper.OooO0O0(this.callback);
                            this.callback = null;
                            return;
                        }
                    }
                    this.imageConfig = this.imageConfig.OooO00o(new File(realPathFromURI));
                    break;
                case REQUEST_LAUNCH_VIDEO_LIBRARY /*{ENCODED_INT: 13003}*/:
                    this.responseHelper.OooO00o("uri", intent.getData().toString());
                    this.responseHelper.OooO00o("path", getRealPathFromURI(intent.getData()));
                    this.responseHelper.OooO0O0(this.callback);
                    this.callback = null;
                    return;
                case 13004:
                    String realPathFromURI2 = getRealPathFromURI(intent.getData());
                    this.responseHelper.OooO00o("uri", intent.getData().toString());
                    this.responseHelper.OooO00o("path", realPathFromURI2);
                    C8604oo0O0OO0.OooO00o(this.reactContext, realPathFromURI2);
                    this.responseHelper.OooO0O0(this.callback);
                    this.callback = null;
                    return;
                default:
                    uri = null;
                    break;
            }
            C8604oo0O0OO0.OooO0O0 OooO00o2 = C8604oo0O0OO0.OooO00o(this.responseHelper, this.imageConfig);
            if (OooO00o2.f21717OooO00o != null) {
                C8604oo0O0OO0.OooO00o(i, this.imageConfig);
                this.responseHelper.OooO0O0(this.callback, OooO00o2.f21717OooO00o.getMessage());
                this.callback = null;
                return;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.imageConfig.f21711OooO00o.getAbsolutePath(), options2);
            int i3 = options2.outWidth;
            int i4 = options2.outHeight;
            updatedResultResponse(uri, this.imageConfig.f21711OooO00o.getAbsolutePath());
            if (this.imageConfig.OooO00o(i3, i4, OooO00o2.OooO00o)) {
                this.responseHelper.OooO00o("width", i3);
                this.responseHelper.OooO00o("height", i4);
                C8604oo0O0OO0.OooO00o(this.reactContext, this.imageConfig.f21711OooO00o.getAbsolutePath());
            } else {
                C8598oo0O00oo OooO00o3 = C8604oo0O0OO0.OooO00o(this.reactContext, this.options, this.imageConfig, i3, i4, i);
                this.imageConfig = OooO00o3;
                File file = OooO00o3.f21713OooO0O0;
                if (file == null) {
                    C8604oo0O0OO0.OooO00o(i, OooO00o3);
                    this.responseHelper.OooO00o("error", "Can't resize the image");
                } else {
                    Uri fromFile = Uri.fromFile(file);
                    BitmapFactory.decodeFile(this.imageConfig.f21713OooO0O0.getAbsolutePath(), options2);
                    this.responseHelper.OooO00o("width", options2.outWidth);
                    this.responseHelper.OooO00o("height", options2.outHeight);
                    updatedResultResponse(fromFile, this.imageConfig.f21713OooO0O0.getAbsolutePath());
                    C8604oo0O0OO0.OooO00o(this.reactContext, this.imageConfig.f21713OooO0O0.getAbsolutePath());
                }
            }
            C8598oo0O00oo oo0o00oo = this.imageConfig;
            if (oo0o00oo.f21712OooO00o && i == 13001) {
                C8604oo0O0OO0.OooO0OO OooO00o4 = C8604oo0O0OO0.OooO00o(oo0o00oo);
                if (OooO00o4.f21718OooO00o == null) {
                    C8598oo0O00oo oo0o00oo2 = OooO00o4.OooO00o;
                    this.imageConfig = oo0o00oo2;
                    updatedResultResponse(Uri.fromFile(oo0o00oo2.OooO00o()), this.imageConfig.OooO00o().getAbsolutePath());
                } else {
                    C8604oo0O0OO0.OooO00o(i, this.imageConfig);
                    this.responseHelper.OooO00o("error", "Error moving image to camera roll: " + OooO00o4.f21718OooO00o.getMessage());
                    return;
                }
            }
            this.responseHelper.OooO0O0(this.callback);
            this.callback = null;
            this.options = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void showImagePicker(ReadableMap readableMap, Callback callback2) {
        if (getCurrentActivity() == null) {
            this.responseHelper.OooO0O0(callback2, "can't find current Activity");
            return;
        }
        this.callback = callback2;
        this.options = readableMap;
        this.imageConfig = new C8598oo0O00oo(null, null, 0, 0, 100, 0, false);
        C8606oo0O0OOo.OooO00o(this, readableMap, new OooO0O0()).show();
    }

    @ReactMethod
    public void launchCamera(ReadableMap readableMap, Callback callback2) {
        int i;
        Intent intent;
        if (!isCameraAvailable()) {
            this.responseHelper.OooO0O0(callback2, "Camera not available");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            this.responseHelper.OooO0O0(callback2, "can't find current Activity");
            return;
        }
        this.callback = callback2;
        this.options = readableMap;
        if (permissionsCheck(currentActivity, callback2, REQUEST_PERMISSIONS_FOR_CAMERA)) {
            parseOptions(this.options);
            if (this.pickVideo.booleanValue()) {
                i = 13004;
                intent = new Intent("android.media.action.VIDEO_CAPTURE");
                intent.putExtra("android.intent.extra.videoQuality", this.videoQuality);
                int i2 = this.videoDurationLimit;
                if (i2 > 0) {
                    intent.putExtra("android.intent.extra.durationLimit", i2);
                }
            } else {
                i = REQUEST_LAUNCH_IMAGE_CAPTURE;
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                C8598oo0O00oo OooO00o2 = this.imageConfig.OooO00o(C8604oo0O0OO0.OooO00o(this.reactContext, this.options, false));
                this.imageConfig = OooO00o2;
                File file = OooO00o2.f21711OooO00o;
                if (file != null) {
                    Uri OooO00o3 = C8605oo0O0OOO.OooO00o(this.reactContext, file);
                    this.cameraCaptureURI = OooO00o3;
                    if (OooO00o3 == null) {
                        this.responseHelper.OooO0O0(callback2, "Couldn't get file path for photo");
                        return;
                    }
                    intent.putExtra("output", OooO00o3);
                } else {
                    this.responseHelper.OooO0O0(callback2, "Couldn't get file path for photo");
                    return;
                }
            }
            if (intent.resolveActivity(this.reactContext.getPackageManager()) == null) {
                this.responseHelper.OooO0O0(callback2, "Cannot launch camera");
                return;
            }
            if (Build.VERSION.SDK_INT <= 19) {
                for (ResolveInfo resolveInfo : this.reactContext.getPackageManager().queryIntentActivities(intent, 65536)) {
                    this.reactContext.grantUriPermission(resolveInfo.activityInfo.packageName, this.cameraCaptureURI, 3);
                }
            }
            try {
                currentActivity.startActivityForResult(intent, i);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                this.responseHelper.OooO0O0(callback2, "Cannot launch camera");
            }
        }
    }

    @ReactMethod
    public void launchImageLibrary(ReadableMap readableMap, Callback callback2) {
        int i;
        Intent intent;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            this.responseHelper.OooO0O0(callback2, "can't find current Activity");
            return;
        }
        this.callback = callback2;
        this.options = readableMap;
        if (permissionsCheck(currentActivity, callback2, REQUEST_PERMISSIONS_FOR_LIBRARY)) {
            parseOptions(this.options);
            if (this.pickVideo.booleanValue()) {
                i = REQUEST_LAUNCH_VIDEO_LIBRARY;
                intent = new Intent("android.intent.action.PICK");
                intent.setType(C9058ooOoOoOO.OooO0oO);
            } else {
                i = REQUEST_LAUNCH_IMAGE_LIBRARY;
                intent = new Intent("android.intent.action.PICK", (Uri) null);
                intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, C9058ooOoOoOO.OooO0o);
            }
            if (intent.resolveActivity(this.reactContext.getPackageManager()) == null) {
                this.responseHelper.OooO0O0(callback2, "Cannot launch photo library");
                return;
            }
            try {
                currentActivity.startActivityForResult(intent, i);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                this.responseHelper.OooO0O0(callback2, "Cannot launch photo library");
            }
        }
    }
}
