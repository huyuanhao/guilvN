package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@ReactModule(name = "RNCWebView")
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String MODULE_NAME = "RNCWebView";
    public static final int PICKER = 1;
    public static final int PICKER_LEGACY = 3;
    public final String DEFAULT_MIME_TYPES = "*/*";
    public DownloadManager.Request downloadRequest;
    public ValueCallback<Uri[]> filePathCallback;
    public ValueCallback<Uri> filePathCallbackLegacy;
    public Uri outputFileUri;
    public PermissionListener webviewFileDownloaderPermissionListener = new PermissionListener() {
        /* class com.reactnativecommunity.webview.RNCWebViewModule.C30411 */

        @Override // com.facebook.react.modules.core.PermissionListener
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(RNCWebViewModule.this.getCurrentActivity().getApplicationContext(), "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.", 1).show();
            } else if (RNCWebViewModule.this.downloadRequest != null) {
                RNCWebViewModule.this.downloadFile();
            }
            return true;
        }
    };

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(C9058ooOoOoOO.OooOO0, ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(SocializeProtocolConstants.IMAGE));
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(C9058ooOoOoOO.OooOO0, ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("video"));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                strArr2[i] = getMimeTypeFromExtension(str.replace(C9058ooOoOoOO.OooOO0, ""));
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File getCapturedFile(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
            boolean r0 = r7.equals(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = android.os.Environment.DIRECTORY_PICTURES
            java.lang.String r7 = "image-"
            java.lang.String r0 = ".jpg"
        L_0x0010:
            r5 = r1
            r1 = r7
            r7 = r5
            goto L_0x0025
        L_0x0014:
            java.lang.String r0 = "android.media.action.VIDEO_CAPTURE"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0023
            java.lang.String r1 = android.os.Environment.DIRECTORY_MOVIES
            java.lang.String r7 = "video-"
            java.lang.String r0 = ".mp4"
            goto L_0x0010
        L_0x0023:
            r7 = r1
            r0 = r7
        L_0x0025:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 >= r3) goto L_0x004f
            java.io.File r7 = android.os.Environment.getExternalStoragePublicDirectory(r7)
            java.io.File r0 = new java.io.File
            r0.<init>(r7, r1)
            return r0
        L_0x004f:
            com.facebook.react.bridge.ReactApplicationContext r7 = r6.getReactApplicationContext()
            r2 = 0
            java.io.File r7 = r7.getExternalFilesDir(r2)
            java.io.File r7 = java.io.File.createTempFile(r1, r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewModule.getCapturedFile(java.lang.String):java.io.File");
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(C9058ooOoOoOO.OooOO0, ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) {
        File file;
        try {
            file = getCapturedFile(str);
        } catch (IOException e) {
            e.printStackTrace();
            file = null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        String packageName = getReactApplicationContext().getPackageName();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return FileProvider.getUriForFile(reactApplicationContext, packageName + ".RNCWebViewFileProvider", file);
    }

    private PermissionAwareActivity getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    private Intent getPhotoIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
        this.outputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        Uri[] uriArr = null;
        if (intent == null) {
            return null;
        }
        if (intent.getData() == null) {
            if (intent.getClipData() != null) {
                int itemCount = intent.getClipData().getItemCount();
                uriArr = new Uri[itemCount];
                for (int i2 = 0; i2 < itemCount; i2++) {
                    uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
                }
            }
            return uriArr;
        } else if (i != -1 || Build.VERSION.SDK_INT < 21) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
    }

    private Intent getVideoIntent() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
        this.outputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z = false;
        if (strArr.length == 0 || (strArr.length == 1 && strArr[0].length() == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void downloadFile() {
        ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
        Toast.makeText(getCurrentActivity().getApplicationContext(), "Downloading", 1).show();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    public boolean grantFileDownloaderPermissions() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        boolean z = C7009o000OoOo.OooO00o(getCurrentActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z) {
            getPermissionAwareActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, this.webviewFileDownloaderPermissionListener);
        }
        return z;
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        boolean z = false;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i >= 21) {
            z = true;
        }
        if (i < 16 || i > 18) {
            z2 = z;
        }
        promise.resolve(z2);
    }

    public boolean needsCameraPermission() {
        try {
            if (!Arrays.asList(getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") || C7009o000OoOo.OooO00o((Context) getCurrentActivity(), "android.permission.CAMERA") == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Uri uri;
        if (this.filePathCallback != null || this.filePathCallbackLegacy != null) {
            if (i != 1) {
                if (i == 3) {
                    if (i2 != -1) {
                        uri = null;
                    } else {
                        uri = intent == null ? this.outputFileUri : intent.getData();
                    }
                    this.filePathCallbackLegacy.onReceiveValue(uri);
                }
            } else if (i2 != -1) {
                ValueCallback<Uri[]> valueCallback = this.filePathCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else {
                Uri[] selectedFiles = getSelectedFiles(intent, i2);
                if (selectedFiles != null) {
                    this.filePathCallback.onReceiveValue(selectedFiles);
                } else {
                    this.filePathCallback.onReceiveValue(new Uri[]{this.outputFileUri});
                }
            }
            this.filePathCallback = null;
            this.filePathCallbackLegacy = null;
            this.outputFileUri = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.downloadRequest = request;
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        this.filePathCallbackLegacy = valueCallback;
        Intent createChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue()) {
            arrayList.add(getPhotoIntent());
        }
        if (acceptsVideo(str).booleanValue()) {
            arrayList.add(getVideoIntent());
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(createChooser, 3);
        }
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(isArrayEmpty(acceptedMimeType).booleanValue() || arrayContainsString(acceptedMimeType, SocializeProtocolConstants.IMAGE).booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(isArrayEmpty(acceptedMimeType).booleanValue() || arrayContainsString(acceptedMimeType, "video").booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    @RequiresApi(api = 21)
    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, Intent intent, String[] strArr, boolean z) {
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue()) {
                arrayList.add(getPhotoIntent());
            }
            if (acceptsVideo(strArr).booleanValue()) {
                arrayList.add(getVideoIntent());
            }
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        intent2.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent2.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent2, 1);
        }
        return true;
    }
}
