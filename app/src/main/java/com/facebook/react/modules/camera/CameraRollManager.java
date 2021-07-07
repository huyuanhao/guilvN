package com.facebook.react.modules.camera;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.umeng.message.proguard.C3848l;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.IOException;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.annotation.Nullable;

@ReactModule(name = CameraRollManager.NAME)
public class CameraRollManager extends ReactContextBaseJavaModule {
    public static final String ASSET_TYPE_ALL = "All";
    public static final String ASSET_TYPE_PHOTOS = "Photos";
    public static final String ASSET_TYPE_VIDEOS = "Videos";
    public static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    public static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    public static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    public static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final String NAME = "CameraRollManager";
    public static final String[] PROJECTION = {C3848l.f10389g, "mime_type", "bucket_display_name", "datetaken", "width", "height", "longitude", "latitude", "_data"};
    public static final String SELECTION_BUCKET = "bucket_display_name = ?";
    public static final String SELECTION_DATE_TAKEN = "datetaken < ?";

    public static class GetMediaTask extends GuardedAsyncTask<Void, Void> {
        @Nullable
        public final String mAfter;
        public final String mAssetType;
        public final Context mContext;
        public final int mFirst;
        @Nullable
        public final String mGroupName;
        @Nullable
        public final ReadableArray mMimeTypes;
        public final Promise mPromise;

        public GetMediaTask(ReactContext reactContext, int i, @Nullable String str, @Nullable String str2, @Nullable ReadableArray readableArray, String str3, Promise promise) {
            super(reactContext);
            this.mContext = reactContext;
            this.mFirst = i;
            this.mAfter = str;
            this.mGroupName = str2;
            this.mMimeTypes = readableArray;
            this.mPromise = promise;
            this.mAssetType = str3;
        }

        public void doInBackgroundGuarded(Void... voidArr) {
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.mAfter)) {
                sb.append(" AND datetaken < ?");
                arrayList.add(this.mAfter);
            }
            if (!TextUtils.isEmpty(this.mGroupName)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.mGroupName);
            }
            if (this.mAssetType.equals(CameraRollManager.ASSET_TYPE_PHOTOS)) {
                sb.append(" AND media_type = 1");
            } else if (this.mAssetType.equals(CameraRollManager.ASSET_TYPE_VIDEOS)) {
                sb.append(" AND media_type = 3");
            } else if (this.mAssetType.equals(CameraRollManager.ASSET_TYPE_ALL)) {
                sb.append(" AND media_type IN (3,1)");
            } else {
                Promise promise = this.mPromise;
                promise.reject(CameraRollManager.ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + this.mAssetType + "'. Expected one of '" + CameraRollManager.ASSET_TYPE_PHOTOS + "', '" + CameraRollManager.ASSET_TYPE_VIDEOS + "' or '" + CameraRollManager.ASSET_TYPE_ALL + "'.");
                return;
            }
            ReadableArray readableArray = this.mMimeTypes;
            if (readableArray != null && readableArray.size() > 0) {
                sb.append(" AND mime_type IN (");
                for (int i = 0; i < this.mMimeTypes.size(); i++) {
                    sb.append("?,");
                    arrayList.add(this.mMimeTypes.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), C3848l.f10402t);
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.mContext.getContentResolver();
            try {
                Uri contentUri = MediaStore.Files.getContentUri("external");
                String[] strArr = CameraRollManager.PROJECTION;
                String sb2 = sb.toString();
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                Cursor query = contentResolver.query(contentUri, strArr, sb2, strArr2, "datetaken DESC, date_modified DESC LIMIT " + (this.mFirst + 1));
                if (query == null) {
                    this.mPromise.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD, "Could not get media");
                    return;
                }
                try {
                    CameraRollManager.putEdges(contentResolver, query, writableNativeMap, this.mFirst);
                    CameraRollManager.putPageInfo(query, writableNativeMap, this.mFirst);
                } finally {
                    query.close();
                    this.mPromise.resolve(writableNativeMap);
                }
            } catch (SecurityException e) {
                this.mPromise.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e);
            }
        }
    }

    public static class SaveToCameraRoll extends GuardedAsyncTask<Void, Void> {
        public final Context mContext;
        public final Promise mPromise;
        public final Uri mUri;

        public SaveToCameraRoll(ReactContext reactContext, Uri uri, Promise promise) {
            super(reactContext);
            this.mContext = reactContext;
            this.mUri = uri;
            this.mPromise = promise;
        }

        /* JADX WARNING: Removed duplicated region for block: B:54:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:80:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void doInBackgroundGuarded(java.lang.Void... r19) {
            /*
            // Method dump skipped, instructions count: 307
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.camera.CameraRollManager.SaveToCameraRoll.doInBackgroundGuarded(java.lang.Void[]):void");
        }
    }

    public CameraRollManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        double d = (double) cursor.getLong(i3);
        Double.isNaN(d);
        writableMap.putDouble("timestamp", d / 1000.0d);
    }

    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i) {
        int i2;
        WritableNativeArray writableNativeArray;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex(C3848l.f10389g);
        int columnIndex2 = cursor.getColumnIndex("mime_type");
        int columnIndex3 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor.getColumnIndex("datetaken");
        int columnIndex5 = cursor.getColumnIndex("width");
        int columnIndex6 = cursor.getColumnIndex("height");
        int columnIndex7 = cursor.getColumnIndex("longitude");
        int columnIndex8 = cursor.getColumnIndex("latitude");
        int columnIndex9 = cursor.getColumnIndex("_data");
        int i3 = i;
        int i4 = 0;
        while (i4 < i3 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, columnIndex, columnIndex5, columnIndex6, columnIndex9)) {
                putBasicNodeInfo(cursor, writableNativeMap2, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor, writableNativeMap2, columnIndex7, columnIndex8);
                writableNativeMap.putMap("node", writableNativeMap2);
                writableNativeArray = writableNativeArray2;
                writableNativeArray.pushMap(writableNativeMap);
                i2 = i4;
            } else {
                writableNativeArray = writableNativeArray2;
                i2 = i4 - 1;
            }
            cursor.moveToNext();
            i4 = i2 + 1;
            i3 = i;
            writableNativeArray2 = writableNativeArray;
            columnIndex8 = columnIndex8;
            columnIndex = columnIndex;
        }
        writableMap.putArray("edges", writableNativeArray2);
    }

    public static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri parse = Uri.parse("file://" + cursor.getString(i4));
        writableNativeMap.putString("uri", parse.toString());
        float f = (float) cursor.getInt(i2);
        float f2 = (float) cursor.getInt(i3);
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(parse.toString());
        if (guessContentTypeFromName != null && guessContentTypeFromName.startsWith("video")) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                if (f <= 0.0f || f2 <= 0.0f) {
                    try {
                        f = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        f2 = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    } catch (NumberFormatException e) {
                        FLog.m874e(ReactConstants.TAG, "Number format exception occurred while trying to fetch video metadata for " + parse.toString(), e);
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        return false;
                    } catch (Throwable th) {
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        throw th;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
            } catch (Exception e2) {
                FLog.m874e(ReactConstants.TAG, "Could not get video metadata for " + parse.toString(), e2);
                return false;
            }
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(parse, "r");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), null, options);
                f = (float) options.outWidth;
                f2 = (float) options.outHeight;
                openAssetFileDescriptor2.close();
            } catch (IOException e3) {
                FLog.m874e(ReactConstants.TAG, "Could not get width/height for " + parse.toString(), e3);
                return false;
            }
        }
        writableNativeMap.putDouble("width", (double) f);
        writableNativeMap.putDouble("height", (double) f2);
        writableMap.putMap(SocializeProtocolConstants.IMAGE, writableNativeMap);
        return true;
    }

    public static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        double d = cursor.getDouble(i);
        double d2 = cursor.getDouble(i2);
        if (d > AbstractC8352oOoOOoO0.OooO0O0 || d2 > AbstractC8352oOoOOoO0.OooO0O0) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("longitude", d);
            writableNativeMap.putDouble("latitude", d2);
            writableMap.putMap("location", writableNativeMap);
        }
    }

    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("has_next_page", i < cursor.getCount());
        if (i < cursor.getCount()) {
            cursor.moveToPosition(i - 1);
            writableNativeMap.putString("end_cursor", cursor.getString(cursor.getColumnIndex("datetaken")));
        }
        writableMap.putMap("page_info", writableNativeMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        int i = readableMap.getInt("first");
        String string = readableMap.hasKey("after") ? readableMap.getString("after") : null;
        String string2 = readableMap.hasKey("groupName") ? readableMap.getString("groupName") : null;
        String string3 = readableMap.hasKey("assetType") ? readableMap.getString("assetType") : ASSET_TYPE_PHOTOS;
        ReadableArray array = readableMap.hasKey("mimeTypes") ? readableMap.getArray("mimeTypes") : null;
        if (!readableMap.hasKey("groupTypes")) {
            new GetMediaTask(getReactApplicationContext(), i, string, string2, array, string3, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new JSApplicationIllegalArgumentException("groupTypes is not supported on Android");
    }

    @ReactMethod
    public void saveToCameraRoll(String str, String str2, Promise promise) {
        new SaveToCameraRoll(getReactApplicationContext(), Uri.parse(str), promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
