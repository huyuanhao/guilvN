package com.p118pd.sdk;

import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.pd.sdk.ooOOO0o  reason: case insensitive filesystem */
public class C8932ooOOO0o {
    public static final int OooO00o = 60000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22176OooO00o = "?";
    public static final int OooO0O0 = 60000;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f22177OooO0O0 = "&";
    public static final String OooO0OO = "/";
    public static final String OooO0Oo = "=";
    public static final String OooO0o = "gzip";
    public static final String OooO0o0 = "content-encoding";

    public C8932ooOOO0o() {
        throw new AssertionError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        if (r1 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        if (r1 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0084, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0087, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C8924ooOOO00 OooO00o(com.p118pd.sdk.C8922ooOO0ooo r6) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8932ooOOO0o.OooO00o(com.pd.sdk.ooOO0ooo):com.pd.sdk.ooOOO00");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static String m20595OooO0O0(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        String OooO0O02 = OooO0O0(map);
        if (!TextUtils.isEmpty(OooO0O02)) {
            sb.append(f22176OooO00o);
            sb.append(OooO0O02);
        }
        return sb.toString();
    }

    /* renamed from: com.pd.sdk.ooOOO0o$OooO00o */
    public static class OooO00o extends AsyncTask<C8922ooOO0ooo, Void, C8924ooOOO00> {
        public AbstractC8974ooOOoO OooO00o;

        public OooO00o(AbstractC8974ooOOoO oooooo) {
            this.OooO00o = oooooo;
        }

        /* renamed from: OooO00o */
        public C8924ooOOO00 doInBackground(C8922ooOO0ooo... oooo0oooArr) {
            if (oooo0oooArr == null || oooo0oooArr.length == 0) {
                return null;
            }
            return C8932ooOOO0o.OooO00o(oooo0oooArr[0]);
        }

        public void onPreExecute() {
            AbstractC8974ooOOoO oooooo = this.OooO00o;
            if (oooooo != null) {
                oooooo.onStart();
            }
        }

        /* renamed from: OooO00o */
        public void onPostExecute(C8924ooOOO00 ooooo00) {
            AbstractC8974ooOOoO oooooo = this.OooO00o;
            if (oooooo == null) {
                return;
            }
            if (ooooo00 == null) {
                oooooo.onFailure("no response");
            } else if (ooooo00.OooO00o() != 200) {
                AbstractC8974ooOOoO oooooo2 = this.OooO00o;
                oooooo2.onFailure("responseCode:" + ooooo00.OooO00o());
            } else if (TextUtils.isEmpty(ooooo00.m20575OooO00o())) {
                this.OooO00o.onFailure("no response data");
            } else {
                this.OooO00o.onSuccess(ooooo00.m20575OooO00o());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
        if (r2 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r1 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d3, code lost:
        if (r2 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d6, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
        r1 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00df, code lost:
        if (r2 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e1, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e4, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:3:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C8924ooOOO00 OooO0O0(com.p118pd.sdk.C8922ooOO0ooo r6) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8932ooOOO0o.OooO0O0(com.pd.sdk.ooOO0ooo):com.pd.sdk.ooOOO00");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C8924ooOOO00 m20592OooO00o(String str, Map<String, String> map) {
        return OooO00o(OooO00o(str, map));
    }

    public static void OooO00o(String str, Map<String, String> map, AbstractC8974ooOOoO oooooo) {
        new OooO00o(oooooo).execute(OooO00o(str, map));
    }

    public static void OooO00o(String str, String str2, String str3, AbstractC8974ooOOoO oooooo) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, str3);
        new OooO00o(oooooo).execute(OooO00o(str, (Map<String, String>) hashMap));
    }

    public static C8922ooOO0ooo OooO00o(String str, Map<String, String> map) {
        C8922ooOO0ooo oooo0ooo = new C8922ooOO0ooo(m20593OooO00o(str, map));
        oooo0ooo.OooO00o(60000);
        oooo0ooo.OooO0O0(60000);
        return oooo0ooo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20593OooO00o(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        String OooO00o2 = OooO00o(map);
        if (!TextUtils.isEmpty(OooO00o2)) {
            sb.append(f22176OooO00o);
            sb.append(OooO00o2);
        }
        return sb.toString();
    }

    public static String OooO00o(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            sb.append(next.getKey());
            sb.append(OooO0Oo);
            sb.append(next.getValue());
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static C8924ooOOO00 m20594OooO0O0(String str, Map<String, String> map) {
        return OooO0O0(OooO0O0(str, map));
    }

    public static C8922ooOO0ooo OooO0O0(String str, Map<String, String> map) {
        C8922ooOO0ooo oooo0ooo = new C8922ooOO0ooo(str, map);
        oooo0ooo.OooO00o("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        oooo0ooo.OooO00o(60000);
        oooo0ooo.OooO0O0(60000);
        return oooo0ooo;
    }

    public static void OooO00o(C8922ooOO0ooo oooo0ooo, HttpURLConnection httpURLConnection) {
        if (oooo0ooo != null && httpURLConnection != null) {
            OooO00o(oooo0ooo.m20574OooO0O0(), httpURLConnection);
            if (oooo0ooo.OooO00o() >= 0) {
                httpURLConnection.setConnectTimeout(oooo0ooo.OooO00o());
            }
            if (oooo0ooo.OooO0O0() >= 0) {
                httpURLConnection.setReadTimeout(oooo0ooo.OooO0O0());
            }
        }
    }

    public static String OooO0O0(Map<String, String> map) {
        StringBuilder sb = new StringBuilder("");
        if (map != null && map.size() > 0) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    Map.Entry<String, String> next = it.next();
                    sb.append(next.getKey());
                    sb.append(OooO0Oo);
                    sb.append(URLEncoder.encode(next.getValue(), "UTF-8"));
                    if (it.hasNext()) {
                        sb.append("&");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    public static void OooO00o(Map<String, String> map, HttpURLConnection httpURLConnection) {
        if (!(map == null || map.size() == 0 || httpURLConnection == null)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static void OooO00o(HttpURLConnection httpURLConnection, C8924ooOOO00 ooooo00) {
        if (ooooo00 != null && httpURLConnection != null) {
            try {
                ooooo00.OooO00o(httpURLConnection.getResponseCode());
            } catch (IOException unused) {
                ooooo00.OooO00o(-1);
            }
        }
    }
}
