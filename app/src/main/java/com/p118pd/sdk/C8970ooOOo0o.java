package com.p118pd.sdk;

import anet.channel.util.HttpConstant;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.ResponseBody;

/* renamed from: com.pd.sdk.ooOOo0o  reason: case insensitive filesystem */
public class C8970ooOOo0o {
    public static String OooO00o(String str) {
        String str2;
        int indexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
        if (indexOf != -1) {
            int i = indexOf + 3;
            str2 = str.substring(0, i);
            str = str.substring(i);
        } else {
            str2 = "";
        }
        int indexOf2 = str.indexOf(C8932ooOOO0o.OooO0OO);
        if (indexOf2 != -1) {
            str = str.substring(0, indexOf2 + 1);
        }
        return str2 + str;
    }

    public static boolean OooO00o(ResponseBody responseBody, OutputStream outputStream) {
        byte[] bArr = new byte[2048];
        InputStream inputStream = null;
        try {
            InputStream byteStream = responseBody.byteStream();
            responseBody.contentLength();
            while (true) {
                int read = byteStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            if (byteStream != null) {
                try {
                    byteStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                outputStream.close();
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return false;
                }
            }
            if (outputStream != null) {
                outputStream.close();
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                    throw th;
                }
            }
            if (outputStream != null) {
                outputStream.close();
            }
            throw th;
        }
    }
}
