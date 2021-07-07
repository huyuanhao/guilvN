package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.logging.FLog;
import com.facebook.react.common.ReactConstants;
import com.p118pd.sdk.AbstractC8930ooOOO0OO;
import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.oOOO0000;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.ByteString;

public class RequestBodyUtil {
    public static final String CONTENT_ENCODING_GZIP = "gzip";
    public static final String NAME = "RequestBodyUtil";
    public static final String TEMP_FILE_SUFFIX = "temp";

    public static RequestBody create(final MediaType mediaType, final InputStream inputStream) {
        return new RequestBody() {
            /* class com.facebook.react.modules.network.RequestBodyUtil.C07821 */

            @Override // okhttp3.RequestBody
            public long contentLength() {
                try {
                    return (long) inputStream.available();
                } catch (IOException unused) {
                    return 0;
                }
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(oOOO0000 oooo0000) throws IOException {
                AbstractC8930ooOOO0OO ooooo0oo = null;
                try {
                    ooooo0oo = C9143oooO0oOo.OooO00o(inputStream);
                    oooo0000.OooO00o(ooooo0oo);
                } finally {
                    Util.closeQuietly(ooooo0oo);
                }
            }
        };
    }

    @Nullable
    public static RequestBody createGzip(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static ProgressRequestBody createProgressRequest(RequestBody requestBody, ProgressListener progressListener) {
        return new ProgressRequestBody(requestBody, progressListener);
    }

    /* JADX INFO: finally extract failed */
    public static InputStream getDownloadFileInputStream(Context context, Uri uri) throws IOException {
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        InputStream openStream = new URL(uri.toString()).openStream();
        try {
            ReadableByteChannel newChannel = Channels.newChannel(openStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.getChannel().transferFrom(newChannel, 0, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    fileOutputStream.close();
                    newChannel.close();
                    return fileInputStream;
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                newChannel.close();
                throw th2;
            }
        } finally {
            openStream.close();
        }
    }

    public static RequestBody getEmptyBody(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, ByteString.EMPTY);
        }
        return null;
    }

    @Nullable
    public static InputStream getFileInputStream(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().startsWith("http")) {
                return getDownloadFileInputStream(context, parse);
            }
            return context.getContentResolver().openInputStream(parse);
        } catch (Exception e) {
            FLog.m874e(ReactConstants.TAG, "Could not retrieve file for contentUri " + str, e);
            return null;
        }
    }

    public static boolean isGzipEncoding(@Nullable String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}
