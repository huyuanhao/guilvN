package com.p118pd.sdk;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.internal.http2.Http2Codec;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo00oOOO  reason: case insensitive filesystem */
public class C8568oo00oOOO implements AbstractC8566oo00oOO {
    @Override // com.p118pd.sdk.AbstractC8566oo00oOO
    public C8564oo00oO0O OooO00o(String str, String str2) {
        String str3;
        C8564oo00oO0O oo00oo0o = new C8564oo00oO0O();
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null || listFiles.length < 1) {
            str3 = "not has send file";
        } else {
            File file = listFiles[0];
            if (file.length() > 5242880) {
                str3 = "send file ,file length full！";
            } else {
                String OooO00o = OooO00o(file, "MD5");
                String OooO00o2 = OooO00o(file, LL1i.OooO0Oo);
                String valueOf = String.valueOf(file.length());
                C8563oo00oO0 oo00oo0 = new C8563oo00oO0(OooO00o, valueOf, OooO00o2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(oo00oo0);
                oo00oo0o.OooO00o("0");
                oo00oo0o.OooO0O0(file.getName());
                oo00oo0o.OooO00o(arrayList);
                oo00oo0o.OooO0OO(valueOf);
                oo00oo0o.OooO0Oo(str2);
                oo00oo0o.OooO0o0(valueOf);
                oo00oo0o.OooO0o("1");
                oo00oo0o.OooO0oO("0");
                oo00oo0o.OooO0oo("others");
                return oo00oo0o;
            }
        }
        AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", str3);
        return null;
    }

    public String OooO00o(File file, String str) {
        Throwable th;
        String str2;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                MappedByteBuffer map = fileInputStream2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length());
                MessageDigest instance = MessageDigest.getInstance(str);
                instance.update(map);
                String bigInteger = new BigInteger(1, instance.digest()).toString(16);
                C8558oo00o00.OooO00o(1, fileInputStream2);
                return bigInteger;
            } catch (IOException unused) {
                fileInputStream = fileInputStream2;
                str2 = "getMd5ByFile : file input stream Exception!";
                try {
                    AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", str2);
                    C8558oo00o00.OooO00o(1, fileInputStream);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    C8558oo00o00.OooO00o(1, fileInputStream);
                    throw th;
                }
            } catch (NoSuchAlgorithmException unused2) {
                fileInputStream = fileInputStream2;
                str2 = "getMd5ByFile : No such algorithm!";
                AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", str2);
                C8558oo00o00.OooO00o(1, fileInputStream);
                return "";
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                C8558oo00o00.OooO00o(1, fileInputStream);
                throw th;
            }
        } catch (IOException unused3) {
            str2 = "getMd5ByFile : file input stream Exception!";
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", str2);
            C8558oo00o00.OooO00o(1, fileInputStream);
            return "";
        } catch (NoSuchAlgorithmException unused4) {
            str2 = "getMd5ByFile : No such algorithm!";
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", str2);
            C8558oo00o00.OooO00o(1, fileInputStream);
            return "";
        }
    }

    @Override // com.p118pd.sdk.AbstractC8566oo00oOO
    public String OooO00o(String str, C8564oo00oO0O oo00oo0o) {
        if (oo00oo0o == null || TextUtils.isEmpty(str)) {
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "commonbody is empty or fileinfo is null!");
            return "";
        }
        List<C8563oo00oO0> OooO00o = oo00oo0o.m20216OooO00o();
        JSONArray jSONArray = new JSONArray();
        for (C8563oo00oO0 oo00oo0 : OooO00o) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileMd5", oo00oo0.OooO0OO());
            jSONObject.put("fileSha256", oo00oo0.OooO0O0());
            jSONObject.put("fileSize", oo00oo0.OooO00o());
            jSONArray.put(jSONObject);
        }
        Locale locale = Locale.getDefault();
        return String.format(locale, "%s=%s&%s=%s&%s=%s&%s=%s&%s=%s&%s=%s&%s=%s&%s=%s&%s=%s", str + "&" + "logType", oo00oo0o.OooO00o(), "fileName", oo00oo0o.OooO0O0(), "fileHashList", jSONArray, "fileSize", oo00oo0o.OooO0OO(), "encryptKey", oo00oo0o.OooO0Oo(), "patchSize", oo00oo0o.OooO0o0(), "patchNum", oo00oo0o.OooO0o(), "patchVer", oo00oo0o.OooO0oO(), "others", oo00oo0o.OooO0oo());
    }

    @Override // com.p118pd.sdk.AbstractC8566oo00oOO
    public List<C8565oo00oO0o> OooO00o(JSONArray jSONArray, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString(AbstractC7726o0ooOOoo.OooOOo0);
            String optString2 = jSONObject.optString("uploadUrl");
            JSONObject optJSONObject = jSONObject.optJSONObject("headers");
            C8565oo00oO0o oo00oo0o = new C8565oo00oO0o(optString2, optString, str);
            oo00oo0o.OooO00o("Authorization", optJSONObject.optString("Authorization"));
            oo00oo0o.OooO00o("x-amz-content-sha256", optJSONObject.optString("x-amz-content-sha256"));
            oo00oo0o.OooO00o("x-amz-date", optJSONObject.optString("x-amz-date"));
            oo00oo0o.OooO00o(Http2Codec.CONNECTION, optJSONObject.optString(Http2Codec.CONNECTION));
            oo00oo0o.OooO00o(HttpConstant.HOST, optJSONObject.optString(HttpConstant.HOST));
            oo00oo0o.OooO00o("Content-MD5", optJSONObject.optString("Content-MD5"));
            oo00oo0o.OooO00o("Content-Type", optJSONObject.optString("Content-Type"));
            oo00oo0o.OooO00o("user-agent", optJSONObject.optString("user-agent"));
            arrayList.add(oo00oo0o);
        }
        return arrayList;
    }
}
