package com.p118pd.sdk;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.logging.FLog;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.network.ProgressListener;
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

/* renamed from: com.pd.sdk.oo0OoOoo  reason: case insensitive filesystem */
public class C8676oo0OoOoo {
    public static final String OooO00o = "gzip";
    public static final String OooO0O0 = "RequestBodyUtil";
    public static final String OooO0OO = "temp";

    /* renamed from: com.pd.sdk.oo0OoOoo$OooO00o */
    public static class OooO00o extends RequestBody {
        public final /* synthetic */ InputStream OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ MediaType f21829OooO00o;

        public OooO00o(MediaType mediaType, InputStream inputStream) {
            this.f21829OooO00o = mediaType;
            this.OooO00o = inputStream;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            try {
                return (long) this.OooO00o.available();
            } catch (IOException unused) {
                return 0;
            }
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.f21829OooO00o;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(oOOO0000 oooo0000) throws IOException {
            AbstractC8930ooOOO0OO ooooo0oo = null;
            try {
                ooooo0oo = C9143oooO0oOo.OooO00o(this.OooO00o);
                oooo0000.OooO00o(ooooo0oo);
            } finally {
                Util.closeQuietly(ooooo0oo);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20293OooO00o(@Nullable String str) {
        return "gzip".equalsIgnoreCase(str);
    }

    @Nullable
    public static InputStream OooO00o(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().startsWith("http")) {
                return OooO00o(context, parse);
            }
            return context.getContentResolver().openInputStream(parse);
        } catch (Exception e) {
            FLog.m874e(ReactConstants.TAG, "Could not retrieve file for contentUri " + str, e);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public static InputStream OooO00o(Context context, Uri uri) throws IOException {
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

    @Nullable
    public static RequestBody OooO00o(MediaType mediaType, String str) {
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

    public static RequestBody OooO00o(MediaType mediaType, InputStream inputStream) {
        return new OooO00o(mediaType, inputStream);
    }

    public static C8674oo0OoOo0 OooO00o(RequestBody requestBody, ProgressListener progressListener) {
        return new C8674oo0OoOo0(requestBody, progressListener);
    }

    public static RequestBody OooO00o(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, ByteString.EMPTY);
        }
        return null;
    }
}
