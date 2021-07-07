package com.xiaomi.push;

import android.content.Context;
import com.umeng.commonsdk.proguard.C3617o;
import com.xiaomi.miui.pushads.sdk.f;
import com.xiaomi.miui.pushads.sdk.k;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.xiaomi.push.cs */
public class C4332cs {
    /* renamed from: a */
    public static int m11974a(String str, String str2, C4328co coVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new BasicNameValuePair("logValue", coVar.f11519a));
        linkedList.add(new BasicNameValuePair("appId", str));
        linkedList.add(new BasicNameValuePair("showType", coVar.f11518a + ""));
        linkedList.add(new BasicNameValuePair(C3617o.f9366at, C4333ct.m11977a(linkedList, str2)));
        try {
            HttpPost httpPost = new HttpPost("http://new.api.ad.xiaomi.com/logNotificationAdActions");
            httpPost.setEntity(new UrlEncodedFormEntity(linkedList, "UTF-8"));
            return 200 == new DefaultHttpClient().execute(httpPost).getStatusLine().getStatusCode() ? 0 : 1;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return 1;
        } catch (ClientProtocolException e2) {
            e2.printStackTrace();
            return 1;
        } catch (IOException e3) {
            e3.printStackTrace();
            return 1;
        }
    }

    /* renamed from: a */
    public static boolean m11975a(Context context) {
        return k.a.a != f.a(context);
    }
}
