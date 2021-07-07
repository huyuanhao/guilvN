package com.p118pd.sdk;

import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.Base64;
import anet.channel.entity.EventType;
import com.RNFetchBlob.C0242RNFetchBlob;
import com.facebook.common.util.UriUtil;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.jinhui365.util.fileUtil.DiskFileUtil;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.pd.sdk.o0OOOo00  reason: case insensitive filesystem */
public class C7405o0OOOo00 {
    public static HashMap<String, C7405o0OOOo00> OooO00o = new HashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReactApplicationContext f20225OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DeviceEventManagerModule.RCTDeviceEventEmitter f20226OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OutputStream f20227OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20228OooO00o = "base64";

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20229OooO00o = false;

    /* renamed from: com.pd.sdk.o0OOOo00$OooO00o */
    public static class OooO00o extends AsyncTask<String, Integer, Integer> {
        public final /* synthetic */ Callback OooO00o;

        public OooO00o(Callback callback) {
            this.OooO00o = callback;
        }

        /* renamed from: OooO00o */
        public Integer doInBackground(String... strArr) {
            WritableArray createArray = Arguments.createArray();
            if (strArr[0] == null) {
                this.OooO00o.invoke("the path specified for lstat is either `null` or `undefined`.");
                return 0;
            }
            File file = new File(strArr[0]);
            if (!file.exists()) {
                this.OooO00o.invoke("failed to lstat path `" + strArr[0] + "` because it does not exist or it is not a folder");
                return 0;
            }
            if (file.isDirectory()) {
                String[] list = file.list();
                for (String str : list) {
                    createArray.pushMap(C7405o0OOOo00.OooO00o(file.getPath() + C8932ooOOO0o.OooO0OO + str));
                }
            } else {
                createArray.pushMap(C7405o0OOOo00.OooO00o(file.getAbsolutePath()));
            }
            this.OooO00o.invoke(null, createArray);
            return 0;
        }
    }

    /* renamed from: com.pd.sdk.o0OOOo00$OooO0O0 */
    public class OooO0O0 implements MediaScannerConnection.OnScanCompletedListener {
        public final /* synthetic */ Callback OooO00o;

        public OooO0O0(Callback callback) {
            this.OooO00o = callback;
        }

        public void onScanCompleted(String str, Uri uri) {
            this.OooO00o.invoke(null, true);
        }
    }

    /* renamed from: com.pd.sdk.o0OOOo00$OooO0OO */
    public static class OooO0OO extends AsyncTask<ReadableArray, Integer, Integer> {
        public final /* synthetic */ Callback OooO00o;

        public OooO0OO(Callback callback) {
            this.OooO00o = callback;
        }

        /* renamed from: OooO00o */
        public Integer doInBackground(ReadableArray... readableArrayArr) {
            for (int i = 0; i < readableArrayArr[0].size(); i++) {
                try {
                    File file = new File(readableArrayArr[0].getString(i));
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Exception e) {
                    this.OooO00o.invoke(e.getLocalizedMessage());
                }
            }
            this.OooO00o.invoke(null, true);
            return Integer.valueOf(readableArrayArr[0].size());
        }
    }

    public C7405o0OOOo00(ReactApplicationContext reactApplicationContext) {
        this.f20225OooO00o = reactApplicationContext;
        this.f20226OooO00o = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    public static String OooO00o(ReactApplicationContext reactApplicationContext, String str, C7400o0OOOOo o0ooooo) {
        String str2 = o0ooooo.f20214OooO00o;
        if (str2 != null) {
            return str2;
        }
        if (!o0ooooo.f20213OooO00o.booleanValue() || o0ooooo.f20215OooO0O0 == null) {
            return OooO00o(reactApplicationContext, str);
        }
        return OooO00o(reactApplicationContext, str) + C9058ooOoOoOO.OooOO0 + o0ooooo.f20215OooO0O0;
    }

    public static void OooO0O0(String str, ReadableArray readableArray, Callback callback) {
        try {
            OutputStream outputStream = OooO00o.get(str).f20227OooO00o;
            byte[] bArr = new byte[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                bArr[i] = (byte) readableArray.getInt(i);
            }
            outputStream.write(bArr);
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    public static void OooO0OO(String str, String str2, Callback callback) {
        C7405o0OOOo00 o0oooo00 = OooO00o.get(str);
        try {
            o0oooo00.f20227OooO00o.write(OooO00o(str2, o0oooo00.f20228OooO00o));
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    public static void OooO0Oo(String str, Callback callback) {
        String OooO00o2 = m18946OooO00o(str);
        new OooO00o(callback).execute(OooO00o2);
    }

    public static void OooO0o(String str, Callback callback) {
        try {
            String OooO00o2 = m18946OooO00o(str);
            WritableMap OooO00o3 = OooO00o(OooO00o2);
            if (OooO00o3 == null) {
                callback.invoke("failed to stat path `" + OooO00o2 + "` because it does not exist or it is not a folder", null);
                return;
            }
            callback.invoke(null, OooO00o3);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    public static void OooO0o0(String str, Callback callback) {
        File file = new File(str);
        if (file.exists()) {
            callback.invoke("mkdir failed, folder already exists at " + str);
            return;
        }
        file.mkdirs();
        callback.invoke(new Object[0]);
    }

    public static void OooO0oO(String str, Callback callback) {
        try {
            OooO00o(new File(str));
            callback.invoke(null, true);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage(), false);
        }
    }

    public static void OooO00o(String str, String str2, String str3, boolean z, Promise promise) {
        int i;
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            if (str2.equalsIgnoreCase("uri")) {
                String OooO00o2 = m18946OooO00o(str3);
                File file2 = new File(OooO00o2);
                if (!file2.exists()) {
                    promise.reject("RNfetchBlob writeFile error", "source file : " + OooO00o2 + " does not exist");
                    fileOutputStream.close();
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                byte[] bArr = new byte[10240];
                i = 0;
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                    i += read;
                }
                fileInputStream.close();
            } else {
                byte[] OooO00o3 = OooO00o(str3, str2);
                fileOutputStream.write(OooO00o3);
                i = OooO00o3.length;
            }
            fileOutputStream.close();
            promise.resolve(Integer.valueOf(i));
        } catch (Exception e) {
            promise.reject("RNFetchBlob writeFile error", e.getLocalizedMessage());
        }
    }

    public static void OooO0OO(String str, Callback callback) {
        String OooO00o2 = m18946OooO00o(str);
        File file = new File(OooO00o2);
        if (!file.exists() || !file.isDirectory()) {
            callback.invoke("failed to list path `" + OooO00o2 + "` for it is not exist or it is not a folder");
            return;
        }
        String[] list = new File(OooO00o2).list();
        WritableArray createArray = Arguments.createArray();
        for (String str2 : list) {
            createArray.pushString(str2);
        }
        callback.invoke(null, createArray);
    }

    public static void OooO0O0(String str, String str2, Callback callback) {
        File file = new File(str);
        if (!file.exists()) {
            callback.invoke("source file at path `" + str + "` does not exist");
            return;
        }
        file.renameTo(new File(str2));
        callback.invoke(new Object[0]);
    }

    public static void OooO0O0(String str, Callback callback) {
        if (m18947OooO00o(str)) {
            try {
                C0242RNFetchBlob.RCTContext.getAssets().openFd(str.replace(C7402o0OOOOoo.OooO0o, ""));
                callback.invoke(true, false);
            } catch (IOException unused) {
                callback.invoke(false, false);
            }
        } else {
            String OooO00o2 = m18946OooO00o(str);
            callback.invoke(Boolean.valueOf(new File(OooO00o2).exists()), Boolean.valueOf(new File(OooO00o2).isDirectory()));
        }
    }

    private void OooO0O0(String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putString("detail", str3);
        this.f20226OooO00o.emit(str, createMap);
    }

    public static void OooO00o(String str, ReadableArray readableArray, boolean z, Promise promise) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            byte[] bArr = new byte[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                bArr[i] = (byte) readableArray.getInt(i);
            }
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            promise.resolve(Integer.valueOf(readableArray.size()));
        } catch (Exception e) {
            promise.reject("RNFetchBlob writeFile error", e.getLocalizedMessage());
        }
    }

    public static boolean OooO0O0(String str) {
        if (!str.startsWith(C7402o0OOOOoo.OooO0o)) {
            return new File(str).exists();
        }
        try {
            C0242RNFetchBlob.RCTContext.getAssets().open(str.replace(C7402o0OOOOoo.OooO0o, ""));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f A[Catch:{ Exception -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e A[Catch:{ Exception -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9 A[Catch:{ Exception -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2 A[Catch:{ Exception -> 0x00da }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(java.lang.String r6, java.lang.String r7, com.facebook.react.bridge.Promise r8) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7405o0OOOo00.OooO00o(java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    public static Map<String, Object> OooO00o(ReactApplicationContext reactApplicationContext) {
        HashMap hashMap = new HashMap();
        hashMap.put("DocumentDir", DiskFileUtil.OooO0O0(reactApplicationContext, "react-native-cp").getAbsolutePath());
        hashMap.put("CacheDir", DiskFileUtil.OooO00o(reactApplicationContext, "react-native-cp").getAbsolutePath());
        hashMap.put("DCIMDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        hashMap.put("PictureDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put("MusicDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        hashMap.put("DownloadDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        hashMap.put("MovieDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        hashMap.put("RingtoneDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        if (Environment.getExternalStorageState().equals("mounted")) {
            hashMap.put("SDCardDir", Environment.getExternalStorageDirectory().getAbsolutePath());
            hashMap.put("SDCardApplicationDir", reactApplicationContext.getExternalFilesDir(null).getParentFile().getAbsolutePath());
        }
        hashMap.put("MainBundleDir", reactApplicationContext.getApplicationInfo().dataDir);
        return hashMap;
    }

    public static String OooO00o(ReactApplicationContext reactApplicationContext, String str) {
        return C0242RNFetchBlob.RCTContext.getFilesDir() + "/RNFetchBlobTmp_" + str;
    }

    public void OooO00o(String str, String str2, int i, int i2, String str3) {
        InputStream inputStream;
        String OooO00o2 = m18946OooO00o(str);
        if (OooO00o2 != null) {
            str = OooO00o2;
        }
        try {
            int i3 = str2.equalsIgnoreCase("base64") ? EventType.ALL : 4096;
            if (i <= 0) {
                i = i3;
            }
            if (OooO00o2 != null && str.startsWith(C7402o0OOOOoo.OooO0o)) {
                inputStream = C0242RNFetchBlob.RCTContext.getAssets().open(str.replace(C7402o0OOOOoo.OooO0o, ""));
            } else if (OooO00o2 == null) {
                inputStream = C0242RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(str));
            } else {
                inputStream = new FileInputStream(new File(str));
            }
            byte[] bArr = new byte[i];
            boolean z = false;
            if (str2.equalsIgnoreCase(C7402o0OOOOoo.OooOO0)) {
                CharsetEncoder newEncoder = Charset.forName("UTF-8").newEncoder();
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    newEncoder.encode(ByteBuffer.wrap(bArr).asCharBuffer());
                    OooO0O0(str3, "data", new String(bArr, 0, read));
                    if (i2 > 0) {
                        SystemClock.sleep((long) i2);
                    }
                }
            } else if (str2.equalsIgnoreCase("ascii")) {
                while (true) {
                    int read2 = inputStream.read(bArr);
                    if (read2 == -1) {
                        break;
                    }
                    WritableArray createArray = Arguments.createArray();
                    for (int i4 = 0; i4 < read2; i4++) {
                        createArray.pushInt(bArr[i4]);
                    }
                    OooO00o(str3, "data", createArray);
                    if (i2 > 0) {
                        SystemClock.sleep((long) i2);
                    }
                }
            } else if (str2.equalsIgnoreCase("base64")) {
                while (true) {
                    int read3 = inputStream.read(bArr);
                    if (read3 == -1) {
                        break;
                    }
                    if (read3 < i) {
                        byte[] bArr2 = new byte[read3];
                        for (int i5 = 0; i5 < read3; i5++) {
                            bArr2[i5] = bArr[i5];
                        }
                        OooO0O0(str3, "data", Base64.encodeToString(bArr2, 2));
                    } else {
                        OooO0O0(str3, "data", Base64.encodeToString(bArr, 2));
                    }
                    if (i2 > 0) {
                        SystemClock.sleep((long) i2);
                    }
                }
            } else {
                OooO0O0(str3, "error", "unrecognized encoding `" + str2 + "`");
                z = true;
            }
            if (!z) {
                OooO0O0(str3, ViewProps.END, "");
            }
            inputStream.close();
        } catch (Exception e) {
            OooO0O0(str3, "warn", "Failed to convert data to " + str2 + " encoded string, this might due to the source data is not able to convert using this encoding.");
            e.printStackTrace();
        }
    }

    public void OooO00o(String str, String str2, boolean z, Callback callback) {
        File file = new File(str);
        if (!file.exists() || file.isDirectory()) {
            callback.invoke("target path `" + str + "` may not exist or it is a folder");
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str, z);
            this.f20228OooO00o = str2;
            this.f20229OooO00o = z;
            String uuid = UUID.randomUUID().toString();
            OooO00o.put(uuid, this);
            this.f20227OooO00o = fileOutputStream;
            callback.invoke(null, uuid);
        } catch (Exception e) {
            callback.invoke("failed to create write stream at path `" + str + "` " + e.getLocalizedMessage());
        }
    }

    public static void OooO00o(String str, Callback callback) {
        try {
            OutputStream outputStream = OooO00o.get(str).f20227OooO00o;
            OooO00o.remove(str);
            outputStream.close();
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    public static void OooO00o(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                OooO00o(file2);
            }
        }
        file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4 A[SYNTHETIC, Splitter:B:43:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9 A[Catch:{ Exception -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b0 A[SYNTHETIC, Splitter:B:50:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b8 A[Catch:{ Exception -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(java.lang.String r5, java.lang.String r6, com.facebook.react.bridge.Callback r7) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7405o0OOOo00.OooO00o(java.lang.String, java.lang.String, com.facebook.react.bridge.Callback):void");
    }

    public static void OooO00o(String str, String str2, int i, int i2, String str3, Promise promise) {
        try {
            String OooO00o2 = m18946OooO00o(str);
            File file = new File(OooO00o2);
            if (!file.exists()) {
                promise.reject("RNFetchBlob slice error", "source file : " + OooO00o2 + " does not exist");
                return;
            }
            long j = (long) i;
            long min = Math.min(file.length(), (long) i2) - j;
            FileInputStream fileInputStream = new FileInputStream(new File(OooO00o2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            fileInputStream.skip(j);
            int i3 = 10240;
            byte[] bArr = new byte[10240];
            long j2 = 0;
            while (true) {
                if (j2 >= min) {
                    break;
                }
                long read = (long) fileInputStream.read(bArr, 0, i3);
                long j3 = min - j2;
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, (int) Math.min(j3, read));
                j2 += read;
                bArr = bArr;
                i3 = 10240;
            }
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            promise.resolve(str2);
        } catch (Exception e) {
            e.printStackTrace();
            promise.reject("RNFetchBlob slice error", e.getLocalizedMessage());
        }
    }

    public static WritableMap OooO00o(String str) {
        try {
            String OooO00o2 = m18946OooO00o(str);
            WritableMap createMap = Arguments.createMap();
            if (m18947OooO00o(OooO00o2)) {
                String replace = OooO00o2.replace(C7402o0OOOOoo.OooO0o, "");
                AssetFileDescriptor openFd = C0242RNFetchBlob.RCTContext.getAssets().openFd(replace);
                createMap.putString("filename", replace);
                createMap.putString("path", OooO00o2);
                createMap.putString("type", UriUtil.LOCAL_ASSET_SCHEME);
                createMap.putString(FileAttachment.KEY_SIZE, String.valueOf(openFd.getLength()));
                createMap.putInt("lastModified", 0);
            } else {
                File file = new File(OooO00o2);
                if (!file.exists()) {
                    return null;
                }
                createMap.putString("filename", file.getName());
                createMap.putString("path", file.getPath());
                createMap.putString("type", file.isDirectory() ? "directory" : "file");
                createMap.putString(FileAttachment.KEY_SIZE, String.valueOf(file.length()));
                createMap.putString("lastModified", String.valueOf(file.lastModified()));
            }
            return createMap;
        } catch (Exception unused) {
            return null;
        }
    }

    public void OooO00o(String[] strArr, String[] strArr2, Callback callback) {
        try {
            MediaScannerConnection.scanFile(this.f20225OooO00o, strArr, strArr2, new OooO0O0(callback));
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage(), null);
        }
    }

    public static void OooO00o(String str, String str2, String str3, Callback callback) {
        try {
            File file = new File(str);
            boolean createNewFile = file.createNewFile();
            if (str3.equals("uri")) {
                File file2 = new File(str2.replace(C7402o0OOOOoo.OooO0o0, ""));
                if (!file2.exists()) {
                    callback.invoke("source file : " + str2 + " does not exist");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[10240];
                for (int read = fileInputStream.read(bArr); read > 0; read = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else if (!createNewFile) {
                callback.invoke("failed to create new file at path `" + str + "` because its parent path may not exist, or the file already exists. If you intended to overwrite the existing file use fs.writeFile instead.");
                return;
            } else {
                new FileOutputStream(file).write(OooO00o(str2, str3));
            }
            callback.invoke(null, str);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    public static void OooO00o(String str, ReadableArray readableArray, Callback callback) {
        try {
            File file = new File(str);
            if (file.exists()) {
                callback.invoke("failed to create new file at path `" + str + "`, file already exists.");
            } else if (!file.createNewFile()) {
                callback.invoke("failed to create new file at path `" + str + "` because its parent path may not exist");
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[readableArray.size()];
                for (int i = 0; i < readableArray.size(); i++) {
                    bArr[i] = (byte) readableArray.getInt(i);
                }
                fileOutputStream.write(bArr);
                callback.invoke(null, str);
            }
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    public static void OooO00o(Callback callback) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        WritableMap createMap = Arguments.createMap();
        if (Build.VERSION.SDK_INT >= 18) {
            createMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
            createMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
            createMap.putString("external_free", String.valueOf(statFs2.getFreeBytes()));
            createMap.putString("external_total", String.valueOf(statFs2.getTotalBytes()));
        }
        callback.invoke(null, createMap);
    }

    public static void OooO00o(ReadableArray readableArray, Callback callback) {
        new OooO0OO(callback).execute(readableArray);
    }

    public static byte[] OooO00o(String str, String str2) {
        if (str2.equalsIgnoreCase("ascii")) {
            return str.getBytes(Charset.forName("US-ASCII"));
        }
        if (str2.toLowerCase().contains("base64")) {
            return Base64.decode(str, 2);
        }
        if (str2.equalsIgnoreCase(C7402o0OOOOoo.OooOO0)) {
            return str.getBytes(Charset.forName("UTF-8"));
        }
        return str.getBytes(Charset.forName("US-ASCII"));
    }

    private void OooO00o(String str, String str2, WritableArray writableArray) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putArray("detail", writableArray);
        this.f20226OooO00o.emit(str, createMap);
    }

    public void OooO00o(String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putString("detail", str3);
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = this.f20226OooO00o;
        rCTDeviceEventEmitter.emit("RNFetchBlobStream" + str, createMap);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static InputStream m18945OooO00o(String str) throws IOException {
        if (str.startsWith(C7402o0OOOOoo.OooO0o)) {
            return C0242RNFetchBlob.RCTContext.getAssets().open(str.replace(C7402o0OOOOoo.OooO0o, ""));
        }
        return new FileInputStream(new File(str));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18947OooO00o(String str) {
        if (str != null) {
            return str.startsWith(C7402o0OOOOoo.OooO0o);
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m18946OooO00o(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("\\w+\\:.*")) {
            return str;
        }
        if (str.startsWith("file://")) {
            return str.replace("file://", "");
        }
        Uri parse = Uri.parse(str);
        if (str.startsWith(C7402o0OOOOoo.OooO0o)) {
            return str;
        }
        return C7409o0OOOoO0.OooO0OO(C0242RNFetchBlob.RCTContext, parse);
    }
}
