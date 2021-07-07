package com.tencent.p269mm.opensdk.diffdev.p271a;

import com.tencent.p269mm.opensdk.utils.Log;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.e */
public final class C3382e {
    /* renamed from: a */
    public static byte[] m8643a(String str) {
        String str2;
        StringBuilder sb;
        String message;
        if (str == null || str.length() == 0) {
            str2 = "httpGet, url is null";
        } else {
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(str);
            try {
                HttpConnectionParams.setSoTimeout(defaultHttpClient.getParams(), 60000);
                HttpResponse execute = defaultHttpClient.execute(httpGet);
                if (execute.getStatusLine().getStatusCode() == 200) {
                    return EntityUtils.toByteArray(execute.getEntity());
                }
                Log.m8651e("MicroMsg.SDK.NetUtil", "httpGet fail, status code = " + execute.getStatusLine().getStatusCode());
                return null;
            } catch (Exception e) {
                sb = new StringBuilder("httpGet, Exception ex = ");
                message = e.getMessage();
                sb.append(message);
                str2 = sb.toString();
                Log.m8651e("MicroMsg.SDK.NetUtil", str2);
                return null;
            } catch (IncompatibleClassChangeError e2) {
                sb = new StringBuilder("httpGet, IncompatibleClassChangeError ex = ");
                message = e2.getMessage();
                sb.append(message);
                str2 = sb.toString();
                Log.m8651e("MicroMsg.SDK.NetUtil", str2);
                return null;
            } catch (Throwable th) {
                sb = new StringBuilder("httpGet, Throwable ex = ");
                message = th.getMessage();
                sb.append(message);
                str2 = sb.toString();
                Log.m8651e("MicroMsg.SDK.NetUtil", str2);
                return null;
            }
        }
        Log.m8651e("MicroMsg.SDK.NetUtil", str2);
        return null;
    }
}
