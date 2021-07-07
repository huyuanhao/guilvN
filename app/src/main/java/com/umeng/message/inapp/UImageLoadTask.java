package com.umeng.message.inapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.C3819h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UImageLoadTask extends AsyncTask<String, Void, Bitmap[]> {

    /* renamed from: a */
    public static final String f10195a = UImageLoadTask.class.getName();

    /* renamed from: b */
    public ImageLoaderCallback f10196b;

    /* renamed from: c */
    public String f10197c;

    /* renamed from: d */
    public BitmapFactory.Options f10198d;

    public interface ImageLoaderCallback {
        void onLoadImage(Bitmap[] bitmapArr);
    }

    public UImageLoadTask(Context context, UInAppMessage uInAppMessage) {
        this.f10197c = C3819h.m10564d(context, uInAppMessage.msg_id);
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            BitmapFactory.Options options = new BitmapFactory.Options();
            this.f10198d = options;
            options.inSampleSize = m10385a(uInAppMessage, i, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private Bitmap m10388b(String str) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeFile(this.f10197c + (str.hashCode() + ""));
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10195a, 2, "load from local");
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return bitmap;
        }
    }

    /* renamed from: c */
    private Bitmap m10389c(String str) throws IOException {
        Bitmap bitmap;
        UMLog uMLog = UMConfigure.umDebugLog;
        UMLog.mutlInfo(f10195a, 2, "Downloading image start");
        URLConnection openConnection = new URL(str).openConnection();
        openConnection.connect();
        InputStream inputStream = openConnection.getInputStream();
        if (this.f10198d == null) {
            bitmap = BitmapFactory.decodeStream(inputStream);
        } else {
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10195a, 2, "decode options");
            bitmap = BitmapFactory.decodeStream(inputStream, null, this.f10198d);
        }
        inputStream.close();
        UMLog uMLog3 = UMConfigure.umDebugLog;
        UMLog.mutlInfo(f10195a, 2, "Downloading image finish");
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap[] doInBackground(String... strArr) {
        Bitmap[] bitmapArr = new Bitmap[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                if (!m10387a(strArr[i])) {
                    bitmapArr[i] = m10388b(strArr[i]);
                    if (bitmapArr[i] == null) {
                        bitmapArr[i] = m10389c(strArr[i]);
                        m10386a(bitmapArr[i], strArr[i]);
                    }
                } else {
                    bitmapArr[i] = m10388b(strArr[i]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bitmapArr;
    }

    /* renamed from: a */
    public void onPostExecute(Bitmap[] bitmapArr) {
        super.onPostExecute(bitmapArr);
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap == null) {
                return;
            }
        }
        ImageLoaderCallback imageLoaderCallback = this.f10196b;
        if (imageLoaderCallback != null) {
            imageLoaderCallback.onLoadImage(bitmapArr);
        }
    }

    /* renamed from: a */
    private boolean m10387a(String str) {
        return new File(this.f10197c, str.hashCode() + "").exists();
    }

    /* renamed from: a */
    private void m10386a(Bitmap bitmap, String str) {
        boolean z;
        boolean z2;
        Exception e;
        if (bitmap != null) {
            try {
                File file = new File(this.f10197c);
                if (!file.exists()) {
                    file.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f10197c, str.hashCode() + ""));
                z = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                try {
                    fileOutputStream.close();
                } catch (Exception e2) {
                    z2 = z;
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                z2 = false;
                e.printStackTrace();
                z = z2;
                UMLog uMLog = UMConfigure.umDebugLog;
                String str2 = f10195a;
                UMLog.mutlInfo(str2, 2, "store bitmap" + z);
            }
            UMLog uMLog2 = UMConfigure.umDebugLog;
            String str22 = f10195a;
            UMLog.mutlInfo(str22, 2, "store bitmap" + z);
        }
    }

    /* renamed from: a */
    public static int m10385a(UInAppMessage uInAppMessage, int i, int i2) {
        int i3 = uInAppMessage.height;
        int i4 = uInAppMessage.width;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    public void mo39818a(ImageLoaderCallback imageLoaderCallback) {
        this.f10196b = imageLoaderCallback;
    }
}
