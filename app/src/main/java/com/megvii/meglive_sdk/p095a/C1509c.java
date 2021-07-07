package com.megvii.meglive_sdk.p095a;

import anet.channel.util.HttpConstant;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.taobao.accs.common.Constants;
import com.umeng.message.util.HttpRequest;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.megvii.meglive_sdk.a.c */
public final class C1509c {

    /* renamed from: a */
    public String f2076a;

    /* renamed from: b */
    public String f2077b;

    /* renamed from: c */
    public String f2078c = "http://";

    /* renamed from: d */
    public String f2079d;

    /* renamed from: e */
    public String f2080e;

    /* renamed from: f */
    public String f2081f;

    public C1509c(String str, String str2, String str3, String str4) {
        if (str != "") {
            this.f2076a = str;
            if (str.startsWith("http://")) {
                this.f2076a = this.f2076a.substring(7);
            } else if (this.f2076a.startsWith("https://")) {
                this.f2076a = this.f2076a.substring(8);
                this.f2078c = "https://";
            }
            while (this.f2076a.endsWith(C8932ooOOO0o.OooO0OO)) {
                String str5 = this.f2076a;
                this.f2076a = str5.substring(0, str5.length() - 1);
            }
            if (str2 != "") {
                this.f2079d = str2;
                if (str3 != "") {
                    this.f2080e = str3;
                    if (str4 != "") {
                        this.f2077b = str4;
                        this.f2081f = "";
                        return;
                    }
                    throw new NullPointerException("projectName is null");
                }
                throw new NullPointerException("accessKeySecret is null");
            }
            throw new NullPointerException("accessKeyID is null");
        }
        throw new NullPointerException("endpoint is null");
    }

    /* renamed from: a */
    public static void m2281a(String str, Map<String, String> map, byte[] bArr) {
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            String headerField = httpURLConnection.getHeaderField("x-log-requestid");
                            if (headerField == null) {
                                headerField = "";
                            }
                            if (responseCode != 200) {
                                InputStream errorStream = httpURLConnection.getErrorStream();
                                if (errorStream != null) {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                    StringBuffer stringBuffer = new StringBuffer();
                                    while (true) {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        stringBuffer.append(readLine);
                                    }
                                    bufferedReader.close();
                                    try {
                                        JSONObject jSONObject = new JSONObject(stringBuffer.toString());
                                        if (jSONObject.has(Constants.KEY_ERROR_CODE) && jSONObject.has("errorMessage")) {
                                            throw new C1510d(jSONObject.getString(Constants.KEY_ERROR_CODE), jSONObject.getString("errorMessage"), headerField);
                                        }
                                    } catch (JSONException unused) {
                                    }
                                    throw new C1510d("LogServerError", "Response code:" + String.valueOf(responseCode) + "\nMessage:" + stringBuffer.toString(), headerField);
                                }
                                throw new C1510d("LogServerError", "Response code:" + String.valueOf(responseCode) + "\nMessage: fail to connect to the server", headerField);
                            }
                        } catch (IOException unused2) {
                            throw new C1510d("LogServerError", "Failed to parse response data", "");
                        }
                    } catch (IOException e) {
                        C1571m.m2655a("LogException：", e.toString());
                        throw new C1510d("LogClientError", "fail to post data to URL:".concat(String.valueOf(str)), e, "");
                    }
                } catch (ProtocolException e2) {
                    C1571m.m2655a("LogException：", e2.toString());
                    throw new C1510d("LogClientError", "fail to set http request method to  POST", e2, "");
                }
            } catch (IOException e3) {
                C1571m.m2655a("LogException：", e3.toString());
                throw new C1510d("LogClientError", "fail to create HttpURLConnection", e3, "");
            }
        } catch (MalformedURLException e4) {
            C1571m.m2655a("LogException：", e4.toString());
            throw new C1510d("LogClientError", "illegal post url", e4, "");
        }
    }

    /* renamed from: b */
    public static String m2283b(byte[] bArr) {
        try {
            String upperCase = new BigInteger(1, MessageDigest.getInstance("MD5").digest(bArr)).toString(16).toUpperCase();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; upperCase.length() + i < 32; i++) {
                sb.append("0");
            }
            return sb.toString() + upperCase;
        } catch (NoSuchAlgorithmException e) {
            throw new C1510d("LogClientError", "Not Supported signature method MD5", e, "");
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo16967a(String str, byte[] bArr, byte[] bArr2) {
        HashMap hashMap = new HashMap();
        hashMap.put("x-log-apiversion", "0.6.0");
        hashMap.put("x-log-signaturemethod", "hmac-sha1");
        hashMap.put("Content-Type", HttpRequest.CONTENT_TYPE_JSON);
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        hashMap.put(HttpRequest.HEADER_DATE, simpleDateFormat.format(instance.getTime()));
        hashMap.put("Content-MD5", m2283b(bArr2));
        hashMap.put("Content-Length", String.valueOf(bArr2.length));
        hashMap.put("x-log-bodyrawsize", String.valueOf(bArr.length));
        hashMap.put("x-log-compresstype", "deflate");
        hashMap.put(HttpConstant.HOST, this.f2077b + C9058ooOoOoOO.OooOO0 + this.f2076a);
        StringBuilder sb = new StringBuilder("POST\n");
        sb.append(((String) hashMap.get("Content-MD5")) + "\n");
        sb.append(((String) hashMap.get("Content-Type")) + "\n");
        sb.append(((String) hashMap.get(HttpRequest.HEADER_DATE)) + "\n");
        String str2 = this.f2081f;
        if (!(str2 == null || str2 == "")) {
            hashMap.put("x-acs-security-token", str2);
            sb.append("x-acs-security-token:" + ((String) hashMap.get("x-acs-security-token")) + "\n");
        }
        sb.append("x-log-apiversion:0.6.0\n");
        sb.append("x-log-bodyrawsize:" + ((String) hashMap.get("x-log-bodyrawsize")) + "\n");
        sb.append("x-log-compresstype:deflate\nx-log-signaturemethod:hmac-sha1\n");
        sb.append("/logstores/" + str + "/shards/lb");
        String sb2 = sb.toString();
        try {
            byte[] bytes = this.f2080e.getBytes("UTF-8");
            byte[] bytes2 = sb2.getBytes("UTF-8");
            Mac instance2 = Mac.getInstance("HmacSHA1");
            instance2.init(new SecretKeySpec(bytes, "HmacSHA1"));
            String str3 = new String(C1508b.m2280a(instance2.doFinal(bytes2)));
            hashMap.put("Authorization", "LOG " + this.f2079d + com.xiaomi.mipush.sdk.Constants.COLON_SEPARATOR + str3);
            return hashMap;
        } catch (Exception e) {
            throw new C1510d("LogClientError", "fail to get encode signature", e, "");
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003d */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052 A[Catch:{ IOException -> 0x0055 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m2282a(byte[] r5) {
        /*
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r0.<init>()
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x003d }
            int r3 = r5.length     // Catch:{ Exception -> 0x003d }
            r2.<init>(r3)     // Catch:{ Exception -> 0x003d }
            r0.setInput(r5)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            r0.finish()     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            r5 = 10240(0x2800, float:1.4349E-41)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
        L_0x0016:
            boolean r1 = r0.finished()     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            if (r1 != 0) goto L_0x0025
            int r1 = r0.deflate(r5)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            r3 = 0
            r2.write(r5, r3, r1)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            goto L_0x0016
        L_0x0025:
            byte[] r5 = r2.toByteArray()     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            r0.end()
            int r0 = r2.size()     // Catch:{ IOException -> 0x0035 }
            if (r0 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            return r5
        L_0x0036:
            r5 = move-exception
            r1 = r2
            goto L_0x0049
        L_0x0039:
            r1 = r2
            goto L_0x003d
        L_0x003b:
            r5 = move-exception
            goto L_0x0049
        L_0x003d:
            com.megvii.meglive_sdk.a.d r5 = new com.megvii.meglive_sdk.a.d     // Catch:{ all -> 0x003b }
            java.lang.String r2 = "LogClientError"
            java.lang.String r3 = "fail to zip data"
            java.lang.String r4 = ""
            r5.<init>(r2, r3, r4)     // Catch:{ all -> 0x003b }
            throw r5     // Catch:{ all -> 0x003b }
        L_0x0049:
            r0.end()
            int r0 = r1.size()     // Catch:{ IOException -> 0x0055 }
            if (r0 == 0) goto L_0x0055
            r1.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            goto L_0x0057
        L_0x0056:
            throw r5
        L_0x0057:
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.p095a.C1509c.m2282a(byte[]):byte[]");
    }
}
