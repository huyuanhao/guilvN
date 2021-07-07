package com.umeng.socialize.net.utils;

import android.text.TextUtils;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.umeng.socialize.Config;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

public class UClient {
    public static final String END = "\r\n";
    public static final String TAG = "UClient";

    public static class ResponseObj {
        public int httpResponseCode;
        public JSONObject jsonObject;
    }

    private void addBodyParams(URequest uRequest, OutputStream outputStream, String str) throws IOException {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Map<String, Object> bodyPair = uRequest.getBodyPair();
        for (String str2 : bodyPair.keySet()) {
            if (bodyPair.get(str2) != null) {
                addFormField(sb, str2, bodyPair.get(str2).toString(), str);
            }
        }
        if (sb.length() > 0) {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.write(sb.toString().getBytes());
            outputStream = dataOutputStream;
            z = true;
        } else {
            z = false;
        }
        Map<String, URequest.FilePair> filePair = uRequest.getFilePair();
        if (filePair != null && filePair.size() > 0) {
            for (String str3 : filePair.keySet()) {
                URequest.FilePair filePair2 = filePair.get(str3);
                byte[] bArr = filePair2.mBinaryData;
                if (bArr != null && bArr.length >= 1) {
                    addFilePart(filePair2.mFileName, bArr, str, outputStream);
                    z = true;
                }
            }
        }
        if (z) {
            finishWrite(outputStream, str);
        }
    }

    private void addFilePart(String str, byte[] bArr, String str2, OutputStream outputStream) throws IOException {
        outputStream.write(("--" + str2 + "\r\n" + "Content-Disposition: form-data; name=\"" + "pic" + "\"; filename=\"" + str + "\"" + "\r\n" + "Content-Type: " + "application/octet-stream" + "\r\n" + "Content-Transfer-Encoding: binary" + "\r\n" + "\r\n").getBytes());
        outputStream.write(bArr);
        outputStream.write("\r\n".getBytes());
    }

    private void addFormField(StringBuilder sb, String str, String str2, String str3) {
        sb.append("--");
        sb.append(str3);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append("UTF-8");
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append(str2);
        sb.append("\r\n");
    }

    private JSONObject decryptData(URequest uRequest, String str) {
        try {
            return new JSONObject(uRequest.getDecryptString(str));
        } catch (Throwable th) {
            SLog.error(UmengText.NET.CREATE, th);
            return null;
        }
    }

    private void finishWrite(OutputStream outputStream, String str) throws IOException {
        outputStream.write("\r\n".getBytes());
        outputStream.write(("--" + str + "--").getBytes());
        outputStream.write("\r\n".getBytes());
        outputStream.flush();
        outputStream.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.umeng.socialize.net.utils.UClient.ResponseObj httpGetRequest(com.umeng.socialize.net.utils.URequest r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.utils.UClient.httpGetRequest(com.umeng.socialize.net.utils.URequest):com.umeng.socialize.net.utils.UClient$ResponseObj");
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0173 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.umeng.socialize.net.utils.UClient.ResponseObj httpPostRequest(com.umeng.socialize.net.utils.URequest r10) {
        /*
        // Method dump skipped, instructions count: 390
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.utils.UClient.httpPostRequest(com.umeng.socialize.net.utils.URequest):com.umeng.socialize.net.utils.UClient$ResponseObj");
    }

    private HttpURLConnection openUrlConnection(URequest uRequest) throws IOException {
        String str;
        HttpURLConnection httpURLConnection;
        String trim = uRequest.getHttpMethod().trim();
        if (URequest.GET.equals(trim)) {
            str = uRequest.toGetUrl();
        } else {
            str = URequest.POST.equals(trim) ? uRequest.mBaseUrl : null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        URL url = new URL(str);
        if ("https".equals(url.getProtocol())) {
            httpURLConnection = (HttpsURLConnection) url.openConnection();
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(Config.connectionTimeOut);
        httpURLConnection.setReadTimeout(Config.readSocketTimeOut);
        httpURLConnection.setRequestMethod(trim);
        if (URequest.GET.equals(trim)) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            Map<String, String> map = uRequest.mHeaders;
            if (map != null && map.size() > 0) {
                for (String str2 : uRequest.mHeaders.keySet()) {
                    httpURLConnection.setRequestProperty(str2, uRequest.mHeaders.get(str2));
                }
            }
        } else if (URequest.POST.equals(trim)) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
        return httpURLConnection;
    }

    private void verifyMethod(String str) {
        if (TextUtils.isEmpty(str) || URequest.GET.equals(str.trim()) == URequest.POST.equals(str.trim())) {
            throw new RuntimeException(UmengText.netMethodError(str));
        }
    }

    public void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                SLog.error(UmengText.NET.CLOSE, th);
            }
        }
    }

    public String convertStreamToString(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader, 512);
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    closeQuietly(inputStreamReader);
                    closeQuietly(bufferedReader);
                    return sb.toString();
                }
            } catch (Throwable th) {
                closeQuietly(inputStreamReader);
                closeQuietly(bufferedReader);
                throw th;
            }
        }
    }

    public <T extends UResponse> T createResponse(ResponseObj responseObj, Class<T> cls) {
        if (responseObj == null) {
            return null;
        }
        try {
            return cls.getConstructor(Integer.class, JSONObject.class).newInstance(Integer.valueOf(responseObj.httpResponseCode), responseObj.jsonObject);
        } catch (Throwable th) {
            SLog.error(UmengText.NET.CREATE, th);
            return null;
        }
    }

    public <T extends UResponse> T execute(URequest uRequest, Class<T> cls) {
        ResponseObj responseObj;
        uRequest.onPrepareRequest();
        String trim = uRequest.getHttpMethod().trim();
        verifyMethod(trim);
        if (URequest.GET.equals(trim)) {
            responseObj = httpGetRequest(uRequest);
        } else {
            responseObj = URequest.POST.equals(trim) ? httpPostRequest(uRequest) : null;
        }
        return (T) createResponse(responseObj, cls);
    }

    public JSONObject parseResult(URequest uRequest, String str, String str2, InputStream inputStream) {
        InputStream inputStream2;
        Throwable th;
        try {
            inputStream2 = wrapStream(str2, inputStream);
            try {
                String convertStreamToString = convertStreamToString(inputStream2);
                if ("POST".equals(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(convertStreamToString);
                        closeQuietly(inputStream2);
                        return jSONObject;
                    } catch (Throwable th2) {
                        SLog.error(UmengText.NET.PARSEERROR, th2);
                        JSONObject decryptData = decryptData(uRequest, convertStreamToString);
                        closeQuietly(inputStream2);
                        return decryptData;
                    }
                } else {
                    if ("GET".equals(str)) {
                        if (TextUtils.isEmpty(convertStreamToString)) {
                            closeQuietly(inputStream2);
                            return null;
                        }
                        JSONObject decryptData2 = decryptData(uRequest, convertStreamToString);
                        closeQuietly(inputStream2);
                        return decryptData2;
                    }
                    closeQuietly(inputStream2);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    SLog.error(UmengText.NET.PARSEERROR, th);
                    closeQuietly(inputStream2);
                    return null;
                } catch (Throwable th4) {
                    closeQuietly(inputStream2);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream2 = null;
            SLog.error(UmengText.NET.PARSEERROR, th);
            closeQuietly(inputStream2);
            return null;
        }
    }

    public InputStream wrapStream(String str, InputStream inputStream) throws IOException {
        if (str == null || InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY.equalsIgnoreCase(str)) {
            return inputStream;
        }
        if ("gzip".equalsIgnoreCase(str)) {
            return new GZIPInputStream(inputStream);
        }
        if ("deflate".equalsIgnoreCase(str)) {
            return new InflaterInputStream(inputStream, new Inflater(false), 512);
        }
        throw new RuntimeException("unsupported content-encoding: " + str);
    }
}
