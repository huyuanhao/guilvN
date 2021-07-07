package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.log.p033f.C1101a;
import com.huawei.hianalytics.p032h.AbstractC1099c;
import com.umeng.socialize.handler.UMSSOHandler;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo00oOoO  reason: case insensitive filesystem */
public class C8571oo00oOoO implements AbstractC8567oo00oOO0 {
    private String OooO00o(String str) {
        return "https://" + str;
    }

    @Override // com.p118pd.sdk.AbstractC8567oo00oOO0
    private String OooO00o(String str, String str2, String str3) {
        return C8551oo00OoO0.OooO00o(str, str2, str3);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20220OooO00o(String str) {
        String[] split = str.split(C8932ooOOO0o.OooO0OO);
        if ("logs".equals(split[split.length - 2])) {
            mo30789a(str.replace(split[split.length - 1], "logzips"), str);
        } else if (new File(str).delete()) {
            AbstractC8536oo00OO0O.OooO0OO("SendManagerImpl", "doUnzip() delete srcFilePath file");
        }
    }

    public static void OooO00o(ZipInputStream zipInputStream, File file) {
        Throwable th;
        String str;
        FileOutputStream fileOutputStream = null;
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                C8558oo00o00.OooO00o(0, (Closeable) null);
                return;
            }
            String OooO0O0 = OooO0O0(nextEntry.getName());
            if (TextUtils.isEmpty(OooO0O0)) {
                AbstractC8536oo00OO0O.OooO0OO("SendManagerImpl", "File name exception, stop unzip");
                C8558oo00o00.OooO00o(0, (Closeable) null);
                return;
            }
            File file2 = new File(file.getCanonicalPath() + File.separator + OooO0O0);
            if (nextEntry.isDirectory()) {
                if (!file2.mkdirs()) {
                    str = "fileUnZip() Unzip file creation failure";
                } else {
                    OooO00o(zipInputStream, file);
                    C8558oo00o00.OooO00o(0, fileOutputStream);
                }
            } else if (!file2.createNewFile()) {
                str = "fileUnZip() Failure to create new files";
            } else {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[2048];
                    int i = 0;
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        i += read;
                        if (!OooO00o(i, file2)) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                    OooO00o(zipInputStream, file);
                    fileOutputStream = fileOutputStream2;
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "fileUnZip() File creation failure or Stream Exception!");
                        C8558oo00o00.OooO00o(0, fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C8558oo00o00.OooO00o(0, fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    C8558oo00o00.OooO00o(0, fileOutputStream);
                    throw th;
                }
                C8558oo00o00.OooO00o(0, fileOutputStream);
            }
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", str);
            C8558oo00o00.OooO00o(0, fileOutputStream);
        } catch (IOException unused2) {
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "fileUnZip() File creation failure or Stream Exception!");
            C8558oo00o00.OooO00o(0, fileOutputStream);
        }
    }

    public static boolean OooO00o(int i, File file) {
        if (i <= 5242880) {
            return true;
        }
        AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "Single File being unzipped is too big.");
        if (!file.exists() || !file.delete()) {
            return false;
        }
        AbstractC8536oo00OO0O.OooO0O0("SendManagerImpl", "Delete large files successfully");
        return false;
    }

    public static String OooO0O0(String str) {
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            if (canonicalPath.startsWith(new File(C9058ooOoOoOO.OooOO0).getCanonicalPath())) {
                return canonicalPath;
            }
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "File is outside extraction target directory.");
            return "";
        } catch (IOException unused) {
        }
    }

    @Override // com.p118pd.sdk.AbstractC8567oo00oOO0
    public void OooO00o(String str, String str2, Key key) {
        Throwable th;
        FileOutputStream fileOutputStream;
        byte[] OooO00o = C8556oo00Oooo.m20211OooO00o();
        Cipher OooO00o2 = C8556oo00Oooo.OooO00o(1, key, OooO00o);
        if (OooO00o2 == null) {
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "get cipher is null!");
            m20220OooO00o(str);
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
                try {
                    fileOutputStream.write(OooO00o);
                    byte[] bArr = new byte[2048];
                    while (fileInputStream2.read(bArr) != -1) {
                        fileOutputStream.write(OooO00o2.doFinal(bArr));
                    }
                    C8558oo00o00.OooO00o(1, fileInputStream2);
                } catch (FileNotFoundException unused) {
                    fileInputStream = fileInputStream2;
                    AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", " encrypt(): There is no document!");
                    C8558oo00o00.OooO00o(1, fileInputStream);
                    C8558oo00o00.OooO00o(0, fileOutputStream);
                } catch (BadPaddingException unused2) {
                    fileInputStream = fileInputStream2;
                    AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", " encrypt(): diFinal - False filling parameters!");
                    m20220OooO00o(str);
                    C8558oo00o00.OooO00o(1, fileInputStream);
                    C8558oo00o00.OooO00o(0, fileOutputStream);
                } catch (IllegalBlockSizeException unused3) {
                    fileInputStream = fileInputStream2;
                    AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "encrypt(): doFinal - The provided block is not filled with !");
                    m20220OooO00o(str);
                    C8558oo00o00.OooO00o(1, fileInputStream);
                    C8558oo00o00.OooO00o(0, fileOutputStream);
                } catch (IOException unused4) {
                    fileInputStream = fileInputStream2;
                    AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "Exception by stream read or write in the encrypt()!");
                    m20220OooO00o(str);
                    C8558oo00o00.OooO00o(1, fileInputStream);
                    C8558oo00o00.OooO00o(0, fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    C8558oo00o00.OooO00o(1, fileInputStream);
                    C8558oo00o00.OooO00o(0, fileOutputStream);
                    throw th;
                }
            } catch (FileNotFoundException unused5) {
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", " encrypt(): There is no document!");
                C8558oo00o00.OooO00o(1, fileInputStream);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (BadPaddingException unused6) {
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", " encrypt(): diFinal - False filling parameters!");
                m20220OooO00o(str);
                C8558oo00o00.OooO00o(1, fileInputStream);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (IllegalBlockSizeException unused7) {
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "encrypt(): doFinal - The provided block is not filled with !");
                m20220OooO00o(str);
                C8558oo00o00.OooO00o(1, fileInputStream);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (IOException unused8) {
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "Exception by stream read or write in the encrypt()!");
                m20220OooO00o(str);
                C8558oo00o00.OooO00o(1, fileInputStream);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                C8558oo00o00.OooO00o(1, fileInputStream);
                C8558oo00o00.OooO00o(0, fileOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused9) {
            fileOutputStream = null;
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", " encrypt(): There is no document!");
            C8558oo00o00.OooO00o(1, fileInputStream);
            C8558oo00o00.OooO00o(0, fileOutputStream);
        } catch (BadPaddingException unused10) {
            fileOutputStream = null;
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", " encrypt(): diFinal - False filling parameters!");
            m20220OooO00o(str);
            C8558oo00o00.OooO00o(1, fileInputStream);
            C8558oo00o00.OooO00o(0, fileOutputStream);
        } catch (IllegalBlockSizeException unused11) {
            fileOutputStream = null;
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "encrypt(): doFinal - The provided block is not filled with !");
            m20220OooO00o(str);
            C8558oo00o00.OooO00o(1, fileInputStream);
            C8558oo00o00.OooO00o(0, fileOutputStream);
        } catch (IOException unused12) {
            fileOutputStream = null;
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "Exception by stream read or write in the encrypt()!");
            m20220OooO00o(str);
            C8558oo00o00.OooO00o(1, fileInputStream);
            C8558oo00o00.OooO00o(0, fileOutputStream);
        } catch (Throwable th4) {
            th = th4;
            C8558oo00o00.OooO00o(1, fileInputStream);
            C8558oo00o00.OooO00o(0, fileOutputStream);
            throw th;
        }
        C8558oo00o00.OooO00o(0, fileOutputStream);
    }

    @Override // com.p118pd.sdk.AbstractC8567oo00oOO0
    public boolean OooO00o(String str, String str2, Context context) {
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            str3 = "SendManagerImpl";
            z = false;
            str4 = "send log path or key is empty!";
        } else {
            String OooO0O0 = AbstractC8456oOooOoo0.m20108OooO0O0();
            String OooO00o = AbstractC8456oOooOoo0.m20104OooO00o();
            if (TextUtils.isEmpty(OooO00o) || TextUtils.isEmpty(OooO0O0)) {
                str3 = "SendManagerImpl";
                z = false;
                str4 = "logClintID or logClintKey is empty! Do not send file!";
            } else {
                C8568oo00oOOO oo00oooo = new C8568oo00oOOO();
                String concat = "{url}/v2/getServerDomain".replace("{url}", AbstractC8456oOooOoo0.OooO0o0()).concat("?appID=").concat(OooO00o);
                String OooO00o2 = C8561oo00o0o0.OooO00o(context);
                try {
                    JSONObject jSONObject = new JSONObject(AbstractC1099c.OooO00o(concat, OooO00o2, OooO00o(concat, OooO00o2, OooO0O0)).m20207OooO00o());
                    String string = jSONObject.getString("resCode");
                    StringBuilder sb = new StringBuilder();
                    try {
                        sb.append("logserver first request resCode :");
                        sb.append(string);
                        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", sb.toString());
                        if (!"0".equals(string)) {
                            return false;
                        }
                        String optString = jSONObject.optString("serverDomain", "");
                        String optString2 = jSONObject.optString(UMSSOHandler.ACCESSTOKEN, "");
                        String OooO00o3 = OooO00o(optString);
                        if (!C8591oo0O00O.OooO00o(OooO00o3, "(https://)[a-zA-Z0-9-_]+[\\.a-zA-Z0-9_-]*(\\.hicloud\\.com)(:(\\d){2,5})?(\\\\|\\/)?")) {
                            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "url non conformity");
                            return false;
                        }
                        String concat2 = "{url}/v2/getUploadInfo".replace("{url}", OooO00o3).concat("?appID=").concat(OooO00o);
                        String OooO00o4 = oo00oooo.OooO00o(OooO00o2, oo00oooo.OooO00o(str, str2));
                        JSONObject jSONObject2 = new JSONObject(AbstractC1099c.OooO00o(concat2, OooO00o4, C8551oo00OoO0.OooO00o(concat2, OooO00o4, optString2)).m20207OooO00o());
                        String string2 = jSONObject2.getString("resCode");
                        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "Request file to report URL interface serverResCode :" + string2);
                        if (!"0".equals(string2)) {
                            return false;
                        }
                        C8560oo00o00O.OooO00o(context, jSONObject2.getString("policy"));
                        String optString3 = jSONObject2.optString("fileUniqueFlag");
                        String optString4 = jSONObject2.optString("currentTime");
                        int OooO00o5 = C8570oo00oOo.OooO00o(oo00oooo.OooO00o(jSONObject2.getJSONArray("uploadInfoList"), str));
                        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "upLoadLogPut response code: " + OooO00o5);
                        if (200 == OooO00o5) {
                            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "upLoadLogPut success");
                            C8559oo00o000.m20213OooO00o(C8559oo00o000.OooO00o(context), "autocheck_starttime", (Object) Long.valueOf(System.currentTimeMillis()));
                            String concat3 = "{url}/v2/notifyUploadSucc".replace("{url}", OooO00o3).concat("?appID=").concat(OooO00o);
                            String concat4 = OooO00o2.concat("&fileUniqueFlag=").concat(optString3).concat("&uploadTime=").concat(optString4);
                            String string3 = new JSONObject(AbstractC1099c.OooO00o(concat3, concat4, C8551oo00OoO0.OooO00o(concat3, concat4, optString2)).m20207OooO00o()).getString("resCode");
                            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "upload_notify_succ: " + string3);
                            return true;
                        }
                        str5 = "SendManagerImpl";
                        try {
                            AbstractC8536oo00OO0O.OooO0OO(str5, "File upload failure");
                            return false;
                        } catch (IOException unused) {
                            str6 = "sendLog get logServerUrl Exception,The Exception is IO!";
                            AbstractC8536oo00OO0O.OooO0Oo(str5, str6);
                            return false;
                        } catch (JSONException unused2) {
                            str6 = "sendLog(reauest) get logServerUrl Exception,The Exception is json!";
                            AbstractC8536oo00OO0O.OooO0Oo(str5, str6);
                            return false;
                        }
                    } catch (IOException unused3) {
                        str5 = "SendManagerImpl";
                        str6 = "sendLog get logServerUrl Exception,The Exception is IO!";
                        AbstractC8536oo00OO0O.OooO0Oo(str5, str6);
                        return false;
                    } catch (JSONException unused4) {
                        str5 = "SendManagerImpl";
                        str6 = "sendLog(reauest) get logServerUrl Exception,The Exception is json!";
                        AbstractC8536oo00OO0O.OooO0Oo(str5, str6);
                        return false;
                    }
                } catch (IOException unused5) {
                    str5 = "SendManagerImpl";
                    str6 = "sendLog get logServerUrl Exception,The Exception is IO!";
                    AbstractC8536oo00OO0O.OooO0Oo(str5, str6);
                    return false;
                } catch (JSONException unused6) {
                    str5 = "SendManagerImpl";
                    str6 = "sendLog(reauest) get logServerUrl Exception,The Exception is json!";
                    AbstractC8536oo00OO0O.OooO0Oo(str5, str6);
                    return false;
                }
            }
        }
        AbstractC8536oo00OO0O.OooO0OO(str3, str4);
        return z;
    }

    @Override // com.p118pd.sdk.AbstractC8567oo00oOO0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20221OooO00o(String str, String str2, String str3) {
        File[] OooO00o = C1101a.OooO00o(str);
        if (OooO00o.length < 1) {
            AbstractC8536oo00OO0O.OooO0Oo("SendManagerImpl", "There is no log file when creating a compressed package");
            return false;
        }
        File file = new File(str3 + str2);
        for (int i = 0; i < 2; i++) {
            if (C8560oo00o00O.OooO00o(OooO00o, file)) {
                C8555oo00OooO.OooO00o(new File(str));
                return true;
            }
            if (i == 1) {
                AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "Packaging failure!");
                if (file.exists() && file.delete()) {
                    AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "Bad zip file delete ok");
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x008c A[SYNTHETIC, Splitter:B:52:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // com.p118pd.sdk.AbstractC8567oo00oOO0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30789a(java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8571oo00oOoO.mo30789a(java.lang.String, java.lang.String):void");
    }
}
