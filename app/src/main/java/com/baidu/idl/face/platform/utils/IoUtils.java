package com.baidu.idl.face.platform.utils;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.ServerSocket;
import java.util.zip.ZipFile;

public class IoUtils {
    public static final int BUFFER_SIZE = 1024;
    public static final int EOF = -1;

    public interface ProgressListener {
        void progress(long j, long j2);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static byte[] loadBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            copyStream(inputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            closeQuietly(byteArrayOutputStream);
            return byteArray;
        } catch (IOException e) {
            e.printStackTrace();
            closeQuietly(byteArrayOutputStream);
            return null;
        } catch (Throwable th) {
            closeQuietly(byteArrayOutputStream);
            throw th;
        }
    }

    public static String loadContent(InputStream inputStream) throws IOException {
        return loadContent(inputStream, null);
    }

    public static String loadContent(InputStream inputStream, String str) throws IOException {
        if (inputStream != null) {
            if (TextUtils.isEmpty(str)) {
                str = System.getProperty("file.encoding", "utf-8");
            }
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, str);
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[4096];
            for (int read = inputStreamReader.read(cArr); read > 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            return stringWriter.toString();
        }
        throw new IllegalArgumentException("stream may not be null.");
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copyStream(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th;
        try {
            fileOutputStream = FileUtils.openNewFileOutput(file);
            try {
                copyStream(inputStream, fileOutputStream);
                closeQuietly(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            closeQuietly(fileOutputStream);
            throw th;
        }
    }

    public static void closeQuietly(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copyStream(InputStream inputStream, File file, long j, ProgressListener progressListener) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th;
        try {
            fileOutputStream = FileUtils.openNewFileOutput(file);
            try {
                copyStream(inputStream, fileOutputStream, j, progressListener);
                closeQuietly(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            closeQuietly(fileOutputStream);
            throw th;
        }
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream, long j, ProgressListener progressListener) throws IOException {
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
                if (progressListener != null) {
                    progressListener.progress(j2, j);
                }
            } else {
                return;
            }
        }
    }
}
