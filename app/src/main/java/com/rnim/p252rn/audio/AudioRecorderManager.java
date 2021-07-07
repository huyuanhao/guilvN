package com.rnim.p252rn.audio;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C8904ooOO0OO0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.rnim.rn.audio.AudioRecorderManager */
public class AudioRecorderManager extends ReactContextBaseJavaModule {
    public static final String CachesDirectoryPath = "CachesDirectoryPath";
    public static final String DocumentDirectoryPath = "DocumentDirectoryPath";
    public static final String DownloadsDirectoryPath = "DownloadsDirectoryPath";
    public static final String LibraryDirectoryPath = "LibraryDirectoryPath";
    public static final String MainBundlePath = "MainBundlePath";
    public static final String MusicDirectoryPath = "MusicDirectoryPath";
    public static final String PicturesDirectoryPath = "PicturesDirectoryPath";
    public static final String TAG = "ReactNativeAudio";
    public Context context;
    public String currentOutputFile;
    public boolean includeBase64 = false;
    public boolean isPauseResumeCapable = false;
    public boolean isPaused = false;
    public boolean isRecording = false;
    public Method pauseMethod = null;
    public MediaRecorder recorder;
    public Method resumeMethod = null;
    public C8904ooOO0OO0 stopWatch;
    public Timer timer;

    /* renamed from: com.rnim.rn.audio.AudioRecorderManager$OooO00o */
    public class OooO00o extends TimerTask {
        public OooO00o() {
        }

        public void run() {
            if (!AudioRecorderManager.this.isPaused) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble("currentTime", (double) AudioRecorderManager.this.stopWatch.OooO00o());
                AudioRecorderManager.this.sendEvent("recordingProgress", createMap);
            }
        }
    }

    public AudioRecorderManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = reactApplicationContext;
        this.stopWatch = new C8904ooOO0OO0();
        boolean z = Build.VERSION.SDK_INT > 23;
        this.isPauseResumeCapable = z;
        if (z) {
            try {
                this.pauseMethod = MediaRecorder.class.getMethod("pause", new Class[0]);
                this.resumeMethod = MediaRecorder.class.getMethod("resume", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private int getAudioEncoderFromString(String str) {
        char c;
        switch (str.hashCode()) {
            case -1413784883:
                if (str.equals("amr_nb")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1413784604:
                if (str.equals("amr_wb")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1235069279:
                if (str.equals("aac_eld")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1221333503:
                if (str.equals("he_aac")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -810722925:
                if (str.equals("vorbis")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 96323:
                if (str.equals("aac")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 3;
        }
        if (c == 1) {
            return 5;
        }
        if (c == 2) {
            return 1;
        }
        if (c == 3) {
            return 2;
        }
        if (c == 4) {
            return 4;
        }
        if (c == 5) {
            return 6;
        }
        String str2 = "USING MediaRecorder.AudioEncoder.DEFAULT instead of " + str + ": " + 0;
        return 0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private int getOutputFormatFromString(String str) {
        char c;
        switch (str.hashCode()) {
            case -1558681978:
                if (str.equals("three_gpp")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1413784883:
                if (str.equals("amr_nb")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1413784604:
                if (str.equals("amr_wb")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1067844614:
                if (str.equals("mpeg_4")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3645337:
                if (str.equals("webm")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 367431774:
                if (str.equals("aac_adts")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 2;
        }
        if (c == 1) {
            return 6;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 4;
        }
        if (c != 4) {
            return c != 5 ? 0 : 9;
        }
        return 1;
    }

    private void logAndRejectPromise(Promise promise, String str, String str2) {
        promise.reject(str, str2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void sendEvent(String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }

    private void startTimer() {
        Timer timer2 = new Timer();
        this.timer = timer2;
        timer2.scheduleAtFixedRate(new OooO00o(), 0, 1000);
    }

    private void stopTimer() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
            this.timer.purge();
            this.timer = null;
        }
    }

    @ReactMethod
    public void checkAuthorizationStatus(Promise promise) {
        promise.resolve(Boolean.valueOf(C7009o000OoOo.OooO00o(getCurrentActivity(), "android.permission.RECORD_AUDIO") == 0));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(DocumentDirectoryPath, getReactApplicationContext().getFilesDir().getAbsolutePath());
        hashMap.put(PicturesDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(MainBundlePath, "");
        hashMap.put(CachesDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(LibraryDirectoryPath, "");
        hashMap.put(MusicDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        hashMap.put(DownloadsDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AudioRecorderManager";
    }

    @ReactMethod
    public void pauseRecording(Promise promise) {
        Method method;
        if (!this.isPauseResumeCapable || (method = this.pauseMethod) == null) {
            logAndRejectPromise(promise, "RUNTIME_EXCEPTION", "Method not available on this version of Android.");
            return;
        }
        if (!this.isPaused) {
            try {
                method.invoke(this.recorder, new Object[0]);
                this.stopWatch.OooO0O0();
            } catch (IllegalAccessException | RuntimeException | InvocationTargetException e) {
                e.printStackTrace();
                logAndRejectPromise(promise, "RUNTIME_EXCEPTION", "Method not available on this version of Android.");
                return;
            }
        }
        this.isPaused = true;
        promise.resolve(null);
    }

    @ReactMethod
    public void prepareRecordingAtPath(String str, ReadableMap readableMap, Promise promise) {
        if (this.isRecording) {
            logAndRejectPromise(promise, "INVALID_STATE", "Please call stopRecording before starting recording");
        }
        File file = new File(str);
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.recorder = mediaRecorder;
        try {
            mediaRecorder.setAudioSource(readableMap.getInt("AudioSource"));
            this.recorder.setOutputFormat(getOutputFormatFromString(readableMap.getString("OutputFormat")));
            this.recorder.setAudioEncoder(getAudioEncoderFromString(readableMap.getString("AudioEncoding")));
            this.recorder.setAudioSamplingRate(readableMap.getInt("SampleRate"));
            this.recorder.setAudioChannels(readableMap.getInt("Channels"));
            this.recorder.setAudioEncodingBitRate(readableMap.getInt("AudioEncodingBitRate"));
            this.recorder.setOutputFile(file.getPath());
            this.includeBase64 = readableMap.getBoolean("IncludeBase64");
            this.currentOutputFile = str;
            try {
                this.recorder.prepare();
                promise.resolve(this.currentOutputFile);
            } catch (Exception e) {
                logAndRejectPromise(promise, "COULDNT_PREPARE_RECORDING_AT_PATH " + str, e.getMessage());
            }
        } catch (Exception e2) {
            logAndRejectPromise(promise, "COULDNT_CONFIGURE_MEDIA_RECORDER", "Make sure you've added RECORD_AUDIO permission to your AndroidManifest.xml file " + e2.getMessage());
        }
    }

    @ReactMethod
    public void resumeRecording(Promise promise) {
        Method method;
        if (!this.isPauseResumeCapable || (method = this.resumeMethod) == null) {
            logAndRejectPromise(promise, "RUNTIME_EXCEPTION", "Method not available on this version of Android.");
            return;
        }
        if (this.isPaused) {
            try {
                method.invoke(this.recorder, new Object[0]);
                this.stopWatch.m20541OooO0O0();
            } catch (IllegalAccessException | RuntimeException | InvocationTargetException e) {
                e.printStackTrace();
                logAndRejectPromise(promise, "RUNTIME_EXCEPTION", "Method not available on this version of Android.");
                return;
            }
        }
        this.isPaused = false;
        promise.resolve(null);
    }

    @ReactMethod
    public void startRecording(Promise promise) {
        MediaRecorder mediaRecorder = this.recorder;
        if (mediaRecorder == null) {
            logAndRejectPromise(promise, "RECORDING_NOT_PREPARED", "Please call prepareRecordingAtPath before starting recording");
        } else if (this.isRecording) {
            logAndRejectPromise(promise, "INVALID_STATE", "Please call stopRecording before starting recording");
        } else {
            mediaRecorder.start();
            this.stopWatch.m20540OooO00o();
            this.stopWatch.m20541OooO0O0();
            this.isRecording = true;
            this.isPaused = false;
            startTimer();
            promise.resolve(this.currentOutputFile);
        }
    }

    @ReactMethod
    public void stopRecording(Promise promise) {
        String str;
        if (!this.isRecording) {
            logAndRejectPromise(promise, "INVALID_STATE", "Please call startRecording before stopping recording");
            return;
        }
        stopTimer();
        this.isRecording = false;
        this.isPaused = false;
        try {
            this.recorder.stop();
            this.recorder.release();
            this.stopWatch.OooO0O0();
            this.recorder = null;
            promise.resolve(this.currentOutputFile);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("status", "OK");
            createMap.putString("audioFileURL", "file://" + this.currentOutputFile);
            if (this.includeBase64) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.currentOutputFile);
                    byte[] bArr = new byte[8192];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (IOException unused) {
                        }
                    }
                    str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (FileNotFoundException unused2) {
                }
                createMap.putString("base64", str);
                sendEvent("recordingFinished", createMap);
            }
            str = "";
            createMap.putString("base64", str);
            sendEvent("recordingFinished", createMap);
        } catch (RuntimeException unused3) {
            logAndRejectPromise(promise, "RUNTIME_EXCEPTION", "No valid audio data received. You may be using a device that can't record audio.");
            this.recorder = null;
        } catch (Throwable th) {
            this.recorder = null;
            throw th;
        }
    }
}
