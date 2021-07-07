package com.qiyukf.nimlib.p198j.p201c;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import com.qiyukf.basesdk.p119a.C1709a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.qiyukf.nimlib.j.c.b */
public final class C2346b {
    /* renamed from: a */
    public static Uri m5115a(Context context, File file, boolean z) {
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", file.getName());
        contentValues.put("mime_type", z ? "image/jpeg" : "video/mp4");
        if (z) {
            str = Environment.DIRECTORY_PICTURES;
        } else {
            str = Environment.DIRECTORY_MOVIES + File.separator + "qiyu";
        }
        contentValues.put("relative_path", str);
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("datetaken", Long.valueOf(file.lastModified()));
        }
        try {
            return context.getContentResolver().insert(z ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m5116a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m5117a(Context context, File file) {
        if (file == null || context == null) {
            return false;
        }
        return m5118a(context, file, m5115a(context, file, true));
    }

    /* renamed from: a */
    public static boolean m5118a(Context context, File file, Uri uri) {
        String str;
        String str2;
        if (uri == null) {
            str = "NimExternalStorageQ ";
            str2 = " url is null";
        } else {
            C1709a.m3011a("NimExternalStorageQ SaveFile: ", file.getName());
            ParcelFileDescriptor parcelFileDescriptor = null;
            try {
                parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "w");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            str = "NimExternalStorageQ";
            if (parcelFileDescriptor == null) {
                str2 = "parcelFileDescriptor is null";
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        m5116a(fileInputStream, fileOutputStream);
                        try {
                            fileOutputStream.close();
                            fileInputStream.close();
                            parcelFileDescriptor.close();
                            return true;
                        } catch (IOException e2) {
                            C1709a.m3016c(str, e2.toString());
                            return true;
                        }
                    } catch (IOException e3) {
                        C1709a.m3016c(str, e3.toString());
                        try {
                            fileOutputStream.close();
                            fileInputStream.close();
                            parcelFileDescriptor.close();
                        } catch (IOException e4) {
                            C1709a.m3016c(str, e4.toString());
                        }
                        return false;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                            fileInputStream.close();
                            parcelFileDescriptor.close();
                        } catch (IOException e5) {
                            C1709a.m3016c(str, e5.toString());
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e6) {
                    C1709a.m3016c(str, e6.toString());
                    try {
                        fileOutputStream.close();
                    } catch (IOException e7) {
                        C1709a.m3016c(str, e7.toString());
                    }
                    return false;
                }
            }
        }
        C1709a.m3016c(str, str2);
        return false;
    }

    /* renamed from: b */
    public static boolean m5119b(Context context, File file) {
        if (context == null) {
            return false;
        }
        return m5118a(context, file, m5115a(context, file, false));
    }
}
