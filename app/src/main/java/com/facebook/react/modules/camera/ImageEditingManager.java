package com.facebook.react.modules.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.views.text.FontMetricsUtil;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = ImageEditingManager.NAME)
public class ImageEditingManager extends ReactContextBaseJavaModule {
    public static final int COMPRESS_QUALITY = 90;
    @SuppressLint({"InlinedApi"})
    public static final String[] EXIF_ATTRIBUTES = {ExifInterface.f14239OoooOOo, ExifInterface.f14191OooOoO, ExifInterface.f14233OoooO0O, ExifInterface.f14237OoooOOO, ExifInterface.f14327oo000o, ExifInterface.f14306o00oO0O, ExifInterface.o0000o0, ExifInterface.o0000OoO, ExifInterface.o000O0oO, ExifInterface.o0000OOo, ExifInterface.o0000OOO, ExifInterface.o0000Oo, ExifInterface.o0000Oo0, ExifInterface.o000O0O0, ExifInterface.o0000o0O, ExifInterface.f14130OooO0Oo, ExifInterface.f14123OooO0OO, ExifInterface.f14245OoooOoo, ExifInterface.f14199OooOoo0, ExifInterface.f14197OooOoo, ExifInterface.f14146OooO0oo, ExifInterface.f14227OoooO, ExifInterface.f14296o000oOoO, ExifInterface.f14235OoooOO0, ExifInterface.o00000O0};
    public static final List<String> LOCAL_URI_PREFIXES = Arrays.asList("file://", "content://");
    public static final String NAME = "ImageEditingManager";
    public static final String TEMP_FILE_PREFIX = "ReactNative_cropped_image_";

    public static class CleanTask extends GuardedAsyncTask<Void, Void> {
        public final Context mContext;

        private void cleanDirectory(File file) {
            File[] listFiles = file.listFiles(new FilenameFilter() {
                /* class com.facebook.react.modules.camera.ImageEditingManager.CleanTask.C07491 */

                public boolean accept(File file, String str) {
                    return str.startsWith(ImageEditingManager.TEMP_FILE_PREFIX);
                }
            });
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }

        public CleanTask(ReactContext reactContext) {
            super(reactContext);
            this.mContext = reactContext;
        }

        public void doInBackgroundGuarded(Void... voidArr) {
            cleanDirectory(this.mContext.getCacheDir());
            File externalCacheDir = this.mContext.getExternalCacheDir();
            if (externalCacheDir != null) {
                cleanDirectory(externalCacheDir);
            }
        }
    }

    public static class CropTask extends GuardedAsyncTask<Void, Void> {
        public final Context mContext;
        public final Callback mError;
        public final int mHeight;
        public final Callback mSuccess;
        public int mTargetHeight;
        public int mTargetWidth;
        public final String mUri;
        public final int mWidth;

        /* renamed from: mX */
        public final int f977mX;

        /* renamed from: mY */
        public final int f978mY;

        private Bitmap crop(BitmapFactory.Options options) throws IOException {
            InputStream openBitmapInputStream = openBitmapInputStream();
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(openBitmapInputStream, false);
            try {
                return newInstance.decodeRegion(new Rect(this.f977mX, this.f978mY, this.f977mX + this.mWidth, this.f978mY + this.mHeight), options);
            } finally {
                if (openBitmapInputStream != null) {
                    openBitmapInputStream.close();
                }
                newInstance.recycle();
            }
        }

        private Bitmap cropAndResize(int i, int i2, BitmapFactory.Options options) throws IOException {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            Assertions.assertNotNull(options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            InputStream openBitmapInputStream = openBitmapInputStream();
            try {
                BitmapFactory.decodeStream(openBitmapInputStream, null, options2);
                if (openBitmapInputStream != null) {
                    openBitmapInputStream.close();
                }
                int i3 = this.mWidth;
                int i4 = this.mHeight;
                float f6 = (float) i;
                float f7 = (float) i2;
                float f8 = f6 / f7;
                if (((float) i3) / ((float) i4) > f8) {
                    f4 = ((float) i4) * f8;
                    f3 = (float) i4;
                    f = ((float) this.f977mX) + ((((float) i3) - f4) / 2.0f);
                    f5 = (float) this.f978mY;
                    f2 = f7 / ((float) i4);
                } else {
                    f4 = (float) i3;
                    float f9 = ((float) i3) / f8;
                    f = (float) this.f977mX;
                    float f10 = (((float) i4) - f9) / 2.0f;
                    float f11 = f6 / ((float) i3);
                    f3 = f9;
                    f2 = f11;
                    f5 = f10 + ((float) this.f978mY);
                }
                options.inSampleSize = ImageEditingManager.getDecodeSampleSize(this.mWidth, this.mHeight, i, i2);
                options2.inJustDecodeBounds = false;
                openBitmapInputStream = openBitmapInputStream();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openBitmapInputStream, null, options);
                    if (decodeStream != null) {
                        float f12 = f2 * ((float) options.inSampleSize);
                        Matrix matrix = new Matrix();
                        matrix.setScale(f12, f12);
                        return Bitmap.createBitmap(decodeStream, (int) Math.floor((double) (f / ((float) options.inSampleSize))), (int) Math.floor((double) (f5 / ((float) options.inSampleSize))), (int) Math.floor((double) (f4 / ((float) options.inSampleSize))), (int) Math.floor((double) (f3 / ((float) options.inSampleSize))), matrix, true);
                    }
                    throw new IOException("Cannot decode bitmap: " + this.mUri);
                } finally {
                }
            } finally {
                if (openBitmapInputStream != null) {
                    openBitmapInputStream.close();
                }
            }
        }

        private InputStream openBitmapInputStream() throws IOException {
            InputStream inputStream;
            if (ImageEditingManager.isLocalUri(this.mUri)) {
                inputStream = this.mContext.getContentResolver().openInputStream(Uri.parse(this.mUri));
            } else {
                inputStream = new URL(this.mUri).openConnection().getInputStream();
            }
            if (inputStream != null) {
                return inputStream;
            }
            throw new IOException("Cannot open bitmap: " + this.mUri);
        }

        public void setTargetSize(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.mTargetWidth = i;
            this.mTargetHeight = i2;
        }

        public CropTask(ReactContext reactContext, String str, int i, int i2, int i3, int i4, Callback callback, Callback callback2) {
            super(reactContext);
            this.mTargetWidth = 0;
            this.mTargetHeight = 0;
            if (i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            this.mContext = reactContext;
            this.mUri = str;
            this.f977mX = i;
            this.f978mY = i2;
            this.mWidth = i3;
            this.mHeight = i4;
            this.mSuccess = callback;
            this.mError = callback2;
        }

        public void doInBackgroundGuarded(Void... voidArr) {
            Bitmap bitmap;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.mTargetWidth > 0 && this.mTargetHeight > 0) {
                    bitmap = cropAndResize(this.mTargetWidth, this.mTargetHeight, options);
                } else {
                    bitmap = crop(options);
                }
                String str = options.outMimeType;
                if (str == null || str.isEmpty()) {
                    throw new IOException("Could not determine MIME type");
                }
                File createTempFile = ImageEditingManager.createTempFile(this.mContext, str);
                ImageEditingManager.writeCompressedBitmapToFile(bitmap, str, createTempFile);
                if (str.equals("image/jpeg")) {
                    ImageEditingManager.copyExif(this.mContext, Uri.parse(this.mUri), createTempFile);
                }
                this.mSuccess.invoke(Uri.fromFile(createTempFile).toString());
            } catch (Exception e) {
                this.mError.invoke(e.getMessage());
            }
        }
    }

    public ImageEditingManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        new CleanTask(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static void copyExif(Context context, Uri uri, File file) throws IOException {
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri == null) {
            FLog.m913w(ReactConstants.TAG, "Couldn't get real path for uri: " + uri);
            return;
        }
        android.media.ExifInterface exifInterface = new android.media.ExifInterface(fileFromUri.getAbsolutePath());
        android.media.ExifInterface exifInterface2 = new android.media.ExifInterface(file.getAbsolutePath());
        String[] strArr = EXIF_ATTRIBUTES;
        for (String str : strArr) {
            String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }

    public static File createTempFile(Context context, @Nullable String str) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        return File.createTempFile(TEMP_FILE_PREFIX, getFileExtensionForType(str), externalCacheDir);
    }

    public static Bitmap.CompressFormat getCompressFormatForType(String str) {
        if ("image/png".equals(str)) {
            return Bitmap.CompressFormat.PNG;
        }
        if ("image/webp".equals(str)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public static int getDecodeSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i3 || i > i4) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i7 / i5 >= i3 && i6 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static String getFileExtensionForType(@Nullable String str) {
        if ("image/png".equals(str)) {
            return ".png";
        }
        return "image/webp".equals(str) ? ".webp" : ".jpg";
    }

    @Nullable
    public static File getFileFromUri(Context context, Uri uri) {
        Cursor query;
        if (uri.getScheme().equals("file")) {
            return new File(uri.getPath());
        }
        if (!uri.getScheme().equals("content") || (query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public static boolean isLocalUri(String str) {
        for (String str2 : LOCAL_URI_PREFIXES) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void writeCompressedBitmapToFile(Bitmap bitmap, String str, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(getCompressFormatForType(str), 90, fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    @ReactMethod
    public void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2) {
        ReadableMap readableMap2 = null;
        ReadableMap map = readableMap.hasKey("offset") ? readableMap.getMap("offset") : null;
        if (readableMap.hasKey(FileAttachment.KEY_SIZE)) {
            readableMap2 = readableMap.getMap(FileAttachment.KEY_SIZE);
        }
        if (map == null || readableMap2 == null || !map.hasKey(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT) || !map.hasKey("y") || !readableMap2.hasKey("width") || !readableMap2.hasKey("height")) {
            throw new JSApplicationIllegalArgumentException("Please specify offset and size");
        } else if (str == null || str.isEmpty()) {
            throw new JSApplicationIllegalArgumentException("Please specify a URI");
        } else {
            CropTask cropTask = new CropTask(getReactApplicationContext(), str, (int) map.getDouble(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT), (int) map.getDouble("y"), (int) readableMap2.getDouble("width"), (int) readableMap2.getDouble("height"), callback, callback2);
            if (readableMap.hasKey("displaySize")) {
                ReadableMap map2 = readableMap.getMap("displaySize");
                cropTask.setTargetSize((int) map2.getDouble("width"), (int) map2.getDouble("height"));
            }
            cropTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        new CleanTask(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
