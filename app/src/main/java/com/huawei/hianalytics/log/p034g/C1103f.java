package com.huawei.hianalytics.log.p034g;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hianalytics.log.p033f.C1101a;
import com.p118pd.sdk.AbstractC8456oOooOoo0;
import com.p118pd.sdk.AbstractC8536oo00OO0O;
import com.p118pd.sdk.AbstractC8576oo00oo0O;
import com.p118pd.sdk.C8552oo00OoOo;
import com.p118pd.sdk.C8554oo00Ooo0;
import com.p118pd.sdk.C8555oo00OooO;
import com.p118pd.sdk.C8558oo00o00;
import com.p118pd.sdk.C8560oo00o00O;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: com.huawei.hianalytics.log.g.f */
public class C1103f implements AbstractC8576oo00oo0O {
    public C8554oo00Ooo0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Throwable f14960OooO00o;
    public String o0ooOOo;
    public String o0ooOoO;

    /* renamed from: com.huawei.hianalytics.log.g.f$a */
    public static class C1104a implements Serializable, Comparator<File> {
        public C1104a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return (int) (file.length() - file2.length());
        }
    }

    public C1103f(C8554oo00Ooo0 oo00ooo0, Throwable th, String str) {
        this.OooO00o = oo00ooo0;
        this.o0ooOoO = str + C8552oo00OoOo.OooO00o.OooO0O0;
        this.f14960OooO00o = th;
    }

    private void OooO00o() {
        FileOutputStream fileOutputStream;
        Throwable th;
        OutputStreamWriter outputStreamWriter;
        String str;
        BufferedWriter bufferedWriter;
        File file = new File(this.o0ooOoO, this.o0ooOOo);
        if (!C1101a.OooO00o(file)) {
            String OooO00o2 = C8560oo00o00O.OooO00o();
            AbstractC8456oOooOoo0.OooO0OO(OooO00o2);
            file = C1101a.OooO00o(this.o0ooOoO, OooO00o2, AbstractC8456oOooOoo0.OooO0O0());
        }
        if (file == null) {
            AbstractC8536oo00OO0O.OooO0Oo("LogWrite", "writerLog():Failed to create file!");
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            try {
                outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            } catch (FileNotFoundException unused) {
                outputStreamWriter = null;
                str = "writeLog() No files that need to be written!";
                AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (UnsupportedEncodingException unused2) {
                outputStreamWriter = null;
                str = "writeLog() OutputStreamWriter - Unsupported coding format";
                AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (IOException unused3) {
                outputStreamWriter = null;
                str = "writeLog append IO Exception !";
                AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = null;
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
                throw th;
            }
            try {
                bufferedWriter = new BufferedWriter(outputStreamWriter);
            } catch (FileNotFoundException unused4) {
                str = "writeLog() No files that need to be written!";
                AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (UnsupportedEncodingException unused5) {
                str = "writeLog() OutputStreamWriter - Unsupported coding format";
                AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (IOException unused6) {
                str = "writeLog append IO Exception !";
                AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            }
            try {
                bufferedWriter.append((CharSequence) String.format(Locale.getDefault(), "%s: %s/%s: %s", C8560oo00o00O.OooO0O0(), this.OooO00o.OooO00o(), this.OooO00o.OooO0O0(), this.OooO00o.OooO0OO() + "\n" + Log.getStackTraceString(this.f14960OooO00o)));
                bufferedWriter.flush();
                C8558oo00o00.OooO00o(9, bufferedWriter);
            } catch (FileNotFoundException unused7) {
                bufferedWriter2 = bufferedWriter;
                str = "writeLog() No files that need to be written!";
                AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (UnsupportedEncodingException unused8) {
                bufferedWriter2 = bufferedWriter;
                str = "writeLog() OutputStreamWriter - Unsupported coding format";
                AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (IOException unused9) {
                bufferedWriter2 = bufferedWriter;
                str = "writeLog append IO Exception !";
                AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                C8558oo00o00.OooO00o(9, bufferedWriter2);
                C8558oo00o00.OooO00o(10, outputStreamWriter);
                C8558oo00o00.OooO00o(0, fileOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused10) {
            outputStreamWriter = null;
            fileOutputStream = null;
            str = "writeLog() No files that need to be written!";
            AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
            C8558oo00o00.OooO00o(9, bufferedWriter2);
            C8558oo00o00.OooO00o(10, outputStreamWriter);
            C8558oo00o00.OooO00o(0, fileOutputStream);
        } catch (UnsupportedEncodingException unused11) {
            outputStreamWriter = null;
            fileOutputStream = null;
            str = "writeLog() OutputStreamWriter - Unsupported coding format";
            AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
            C8558oo00o00.OooO00o(9, bufferedWriter2);
            C8558oo00o00.OooO00o(10, outputStreamWriter);
            C8558oo00o00.OooO00o(0, fileOutputStream);
        } catch (IOException unused12) {
            outputStreamWriter = null;
            fileOutputStream = null;
            str = "writeLog append IO Exception !";
            AbstractC8536oo00OO0O.OooO0Oo("LogWrite", str);
            C8558oo00o00.OooO00o(9, bufferedWriter2);
            C8558oo00o00.OooO00o(10, outputStreamWriter);
            C8558oo00o00.OooO00o(0, fileOutputStream);
        } catch (Throwable th4) {
            th = th4;
            C8558oo00o00.OooO00o(9, bufferedWriter2);
            C8558oo00o00.OooO00o(10, outputStreamWriter);
            C8558oo00o00.OooO00o(0, fileOutputStream);
            throw th;
        }
        C8558oo00o00.OooO00o(10, outputStreamWriter);
        C8558oo00o00.OooO00o(0, fileOutputStream);
    }

    private void OooO00o(String str) {
        String str2;
        File file;
        String OooO0OO = AbstractC8456oOooOoo0.m20110OooO0OO();
        this.o0ooOOo = OooO0OO;
        if (TextUtils.isEmpty(OooO0OO)) {
            File[] listFiles = new File(str).listFiles();
            C8555oo00OooO.m20210OooO00o(str);
            if (listFiles == null || listFiles.length == 0) {
                str2 = C8560oo00o00O.OooO00o();
            } else {
                if (listFiles.length == 1) {
                    file = listFiles[0];
                } else {
                    File[] OooO00o2 = C1101a.OooO00o(listFiles);
                    Arrays.sort(OooO00o2, new C1104a());
                    file = OooO00o2[0];
                }
                str2 = file.getName();
            }
            this.o0ooOOo = str2;
        }
    }

    public void run() {
        File file = new File(this.o0ooOoO);
        if (file.exists()) {
            OooO00o(this.o0ooOoO);
        } else if (file.mkdirs()) {
            String OooO00o2 = C8560oo00o00O.OooO00o();
            this.o0ooOOo = OooO00o2;
            AbstractC8456oOooOoo0.OooO0OO(OooO00o2);
        } else {
            AbstractC8536oo00OO0O.OooO0Oo("LogWrite", "create logsfile fail!");
            return;
        }
        synchronized (C1103f.class) {
            OooO00o();
        }
    }
}
