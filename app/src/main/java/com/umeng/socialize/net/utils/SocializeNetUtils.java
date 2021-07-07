package com.umeng.socialize.net.utils;

import android.os.Bundle;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;

public class SocializeNetUtils {
    public static final String TAG = "SocializeNetUtils";

    public static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "/n");
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        SLog.error(UmengText.NET.TOOL, e);
                    }
                }
            } catch (IOException e2) {
                SLog.error(UmengText.NET.TOOL, e2);
                inputStream.close();
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    SLog.error(UmengText.NET.TOOL, e3);
                }
                throw th;
            }
        }
        inputStream.close();
        return sb.toString();
    }

    public static Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split(C8932ooOOO0o.OooO0Oo);
                try {
                    bundle.putString(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    SLog.error(UmengText.NET.TOOL, e);
                }
            }
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad A[SYNTHETIC, Splitter:B:50:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dd A[SYNTHETIC, Splitter:B:73:0x00dd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getNetData(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.utils.SocializeNetUtils.getNetData(java.lang.String):byte[]");
    }

    public static boolean isConSpeCharacters(String str) {
        return str.replaceAll("[一-龥]*[a-z]*[A-Z]*\\d*-*_*\\s*", "").length() != 0;
    }

    public static boolean isSelfAppkey(String str) {
        return str.equals("5126ff896c738f2bfa000438") && !ContextUtil.getPackageName().equals("com.umeng.soexample");
    }

    public static Bundle parseUri(String str) {
        try {
            return decodeUrl(new URI(str).getQuery());
        } catch (Exception e) {
            SLog.error(UmengText.NET.TOOL, e);
            return new Bundle();
        }
    }

    public static Bundle parseUrl(String str) {
        try {
            URL url = new URL(str);
            Bundle decodeUrl = decodeUrl(url.getQuery());
            decodeUrl.putAll(decodeUrl(url.getRef()));
            return decodeUrl;
        } catch (MalformedURLException e) {
            SLog.error(UmengText.NET.TOOL, e);
            return new Bundle();
        }
    }

    public static String request(String str) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            if (openConnection == null) {
                return "";
            }
            openConnection.connect();
            InputStream inputStream = openConnection.getInputStream();
            if (inputStream == null) {
                return "";
            }
            return convertStreamToString(inputStream);
        } catch (Exception e) {
            SLog.error(UmengText.NET.TOOL, e);
            return "";
        }
    }

    public static boolean startWithHttp(String str) {
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
