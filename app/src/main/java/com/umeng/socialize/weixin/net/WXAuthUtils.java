package com.umeng.socialize.weixin.net;

import com.umeng.socialize.utils.SLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WXAuthUtils {
    public static String convertStream(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                str = str + readLine;
            } else {
                inputStream.close();
                return str;
            }
        }
    }

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
                        SLog.error(e);
                    }
                }
            } catch (IOException e2) {
                SLog.error(e2);
                inputStream.close();
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    SLog.error(e3);
                }
                throw th;
            }
        }
        inputStream.close();
        return sb.toString();
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
            SLog.error(e);
            return "";
        }
    }
}
