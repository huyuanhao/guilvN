package com.p118pd.sdk;

import android.text.TextUtils;
import com.huawei.hianalytics.p032h.AbstractC1099c;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.oo00oOo  reason: case insensitive filesystem */
public class C8570oo00oOo {
    public static int OooO00o(List<C8565oo00oO0o> list) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        if (list == null || list.size() == 0) {
            AbstractC8536oo00OO0O.OooO0Oo("LogHttpClient", "uploadParameterList is empty!");
            return -1;
        }
        for (C8565oo00oO0o oo00oo0o : list) {
            String OooO00o = oo00oo0o.OooO00o();
            if (TextUtils.isEmpty(OooO00o)) {
                return -1;
            }
            URL url = new URL(OooO00o);
            String OooO0O0 = oo00oo0o.OooO0O0();
            Map<String, String> OooO00o2 = oo00oo0o.m20217OooO00o();
            DataInputStream dataInputStream = null;
            try {
                File OooO00o3 = OooO00o(oo00oo0o.OooO0OO());
                if (OooO00o3 == null) {
                    AbstractC8536oo00OO0O.OooO0Oo("LogHttpClient", "not have file in bigzip! No access to the path,upload over");
                    C8558oo00o00.OooO00o(7, (Closeable) null);
                    C8558oo00o00.OooO00o(8, (Closeable) null);
                    return -1;
                }
                DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(OooO00o3));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream(1024);
                } catch (IOException unused) {
                    byteArrayOutputStream = null;
                    dataInputStream = dataInputStream2;
                    try {
                        AbstractC8536oo00OO0O.OooO0Oo("LogHttpClient", "upLoadLogPutRequest() file input Stream Exception!");
                        C8558oo00o00.OooO00o(7, dataInputStream);
                        C8558oo00o00.OooO00o(8, byteArrayOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C8558oo00o00.OooO00o(7, dataInputStream);
                        C8558oo00o00.OooO00o(8, byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    dataInputStream = dataInputStream2;
                    C8558oo00o00.OooO00o(7, dataInputStream);
                    C8558oo00o00.OooO00o(8, byteArrayOutputStream);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = dataInputStream2.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            int OooO00o4 = AbstractC1099c.OooO00o(url.toString(), byteArrayOutputStream.toByteArray(), OooO0O0, OooO00o2).OooO00o();
                            C8558oo00o00.OooO00o(7, dataInputStream2);
                            C8558oo00o00.OooO00o(8, byteArrayOutputStream);
                            return OooO00o4;
                        }
                    }
                } catch (IOException unused2) {
                    dataInputStream = dataInputStream2;
                    AbstractC8536oo00OO0O.OooO0Oo("LogHttpClient", "upLoadLogPutRequest() file input Stream Exception!");
                    C8558oo00o00.OooO00o(7, dataInputStream);
                    C8558oo00o00.OooO00o(8, byteArrayOutputStream);
                } catch (Throwable th4) {
                    th = th4;
                    dataInputStream = dataInputStream2;
                    C8558oo00o00.OooO00o(7, dataInputStream);
                    C8558oo00o00.OooO00o(8, byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException unused3) {
                byteArrayOutputStream = null;
                AbstractC8536oo00OO0O.OooO0Oo("LogHttpClient", "upLoadLogPutRequest() file input Stream Exception!");
                C8558oo00o00.OooO00o(7, dataInputStream);
                C8558oo00o00.OooO00o(8, byteArrayOutputStream);
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                C8558oo00o00.OooO00o(7, dataInputStream);
                C8558oo00o00.OooO00o(8, byteArrayOutputStream);
                throw th;
            }
        }
        return -1;
    }

    public static File OooO00o(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return null;
        }
        return listFiles[0];
    }
}
