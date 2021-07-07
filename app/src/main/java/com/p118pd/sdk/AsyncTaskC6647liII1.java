package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.vision.face.Face;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.File;
import java.io.IOException;

/* renamed from: com.pd.sdk.liII1丨  reason: invalid class name and case insensitive filesystem */
public class AsyncTaskC6647liII1 extends AsyncTask<Void, Void, SparseArray<Face>> {
    public static final String OooO0OO = "E_FACE_DETECTION_FAILED";
    public static final String OooO0Oo = "mode";
    public static final String OooO0o = "runClassifications";
    public static final String OooO0o0 = "detectLandmarks";
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f18601OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Promise f18602OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReadableMap f18603OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1 f18604OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f18605OooO00o;
    public int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f18606OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f18607OooO0OO = 0;

    public AsyncTaskC6647liII1(Context context, ReadableMap readableMap, Promise promise) {
        this.f18605OooO00o = readableMap.getString("uri");
        this.f18602OooO00o = promise;
        this.f18603OooO00o = readableMap;
        this.f18601OooO00o = context;
    }

    /* renamed from: OooO00o */
    public SparseArray<Face> doInBackground(Void... voidArr) {
        if (isCancelled()) {
            return null;
        }
        this.f18604OooO00o = OooO00o(this.f18603OooO00o, this.f18601OooO00o);
        Bitmap decodeFile = BitmapFactory.decodeFile(this.f18606OooO0O0);
        this.OooO00o = decodeFile.getWidth();
        this.OooO0O0 = decodeFile.getHeight();
        try {
            this.f18607OooO0OO = new ExifInterface(this.f18606OooO0O0).getAttributeInt(androidx.exifinterface.media.ExifInterface.f14146OooO0oo, 0);
        } catch (IOException unused) {
            String str = "Reading orientation from file `" + this.f18606OooO0O0 + "` failed.";
        }
        return this.f18604OooO00o.OooO00o(C5606L11l.OooO00o(decodeFile));
    }

    public void onPreExecute() {
        String str = this.f18605OooO00o;
        if (str == null) {
            this.f18602OooO00o.reject(OooO0OO, "You have to provide an URI of an image.");
            cancel(true);
            return;
        }
        String path = Uri.parse(str).getPath();
        this.f18606OooO0O0 = path;
        if (path == null) {
            Promise promise = this.f18602OooO00o;
            promise.reject(OooO0OO, "Invalid URI provided: `" + this.f18605OooO00o + "`.");
            cancel(true);
            return;
        }
        if (!(path.startsWith(this.f18601OooO00o.getCacheDir().getPath()) || this.f18606OooO0O0.startsWith(this.f18601OooO00o.getFilesDir().getPath()))) {
            this.f18602OooO00o.reject(OooO0OO, "The image has to be in the local app's directories.");
            cancel(true);
        } else if (!new File(this.f18606OooO0O0).exists()) {
            Promise promise2 = this.f18602OooO00o;
            promise2.reject(OooO0OO, "The file does not exist. Given path: `" + this.f18606OooO0O0 + "`.");
            cancel(true);
        }
    }

    /* renamed from: OooO00o */
    public void onPostExecute(SparseArray<Face> sparseArray) {
        super.onPostExecute(sparseArray);
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            WritableMap OooO00o2 = liIli11.OooO00o(sparseArray.valueAt(i));
            OooO00o2.putDouble("yawAngle", ((-OooO00o2.getDouble("yawAngle")) + 360.0d) % 360.0d);
            OooO00o2.putDouble("rollAngle", ((-OooO00o2.getDouble("rollAngle")) + 360.0d) % 360.0d);
            createArray.pushMap(OooO00o2);
        }
        createMap.putArray("faces", createArray);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("width", this.OooO00o);
        createMap2.putInt("height", this.OooO0O0);
        createMap2.putInt("orientation", this.f18607OooO0OO);
        createMap2.putString("uri", this.f18605OooO00o);
        createMap.putMap(SocializeProtocolConstants.IMAGE, createMap2);
        this.f18604OooO00o.OooO00o();
        this.f18602OooO00o.resolve(createMap);
    }

    public static I1 OooO00o(ReadableMap readableMap, Context context) {
        I1 r0 = new I1(context);
        r0.OooO00o(false);
        if (readableMap.hasKey("mode")) {
            r0.OooO0OO(readableMap.getInt("mode"));
        }
        if (readableMap.hasKey(OooO0o)) {
            r0.OooO00o(readableMap.getInt(OooO0o));
        }
        if (readableMap.hasKey(OooO0o0)) {
            r0.OooO0O0(readableMap.getInt(OooO0o0));
        }
        return r0;
    }
}
