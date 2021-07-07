package com.p118pd.sdk;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: com.pd.sdk.ooOo0Oo0  reason: case insensitive filesystem */
public class C9013ooOo0Oo0 {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static SSLSocketFactory m20673OooO00o() {
        SSLContext sSLContext;
        NoSuchAlgorithmException e;
        KeyManagementException e2;
        Exception e3;
        try {
            sSLContext = SSLContext.getInstance("TLS");
            try {
                sSLContext.init(null, new TrustManager[]{new C9011ooOo0OOo()}, new SecureRandom());
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
            } catch (KeyManagementException e5) {
                e2 = e5;
                e2.printStackTrace();
                return sSLContext.getSocketFactory();
            } catch (Exception e6) {
                e3 = e6;
                e3.printStackTrace();
                return sSLContext.getSocketFactory();
            }
        } catch (NoSuchAlgorithmException e7) {
            sSLContext = null;
            e = e7;
            e.printStackTrace();
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException e8) {
            sSLContext = null;
            e2 = e8;
            e2.printStackTrace();
            return sSLContext.getSocketFactory();
        } catch (Exception e9) {
            sSLContext = null;
            e3 = e9;
            e3.printStackTrace();
            return sSLContext.getSocketFactory();
        }
        return sSLContext.getSocketFactory();
    }

    public static HostnameVerifier OooO00o() {
        return new C9014ooOo0OoO();
    }
}
