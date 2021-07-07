package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.log.p033f.C1101a;
import com.p118pd.sdk.C8552oo00OoOo;
import java.io.File;
import java.security.Key;

/* renamed from: com.pd.sdk.oo00oo0o  reason: case insensitive filesystem */
public class C8577oo00oo0o implements AbstractC8576oo00oo0O {
    public Context OooO00o;
    public String o0OOO0o;
    public String o0Oo0oo;
    public String o0ooOOo;
    public String o0ooOoO;

    public C8577oo00oo0o(Context context, String str, String str2) {
        this.OooO00o = context;
        this.o0Oo0oo = str;
        this.o0ooOOo = str2 + C8552oo00OoOo.OooO00o.OooO0OO;
        this.o0ooOoO = str2 + C8552oo00OoOo.OooO00o.OooO0Oo;
        this.o0OOO0o = str2 + C8552oo00OoOo.OooO00o.OooO00o;
    }

    private boolean OooO00o(String str) {
        File file = new File(str);
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            if (listFiles.length != 1 || ((double) listFiles[0].length()) >= 1887436.8d) {
                AbstractC8536oo00OO0O.OooO0OO("uploadTask", "BigZip file size anomaly, delete files");
                C8555oo00OooO.OooO00o(file);
            } else {
                AbstractC8536oo00OO0O.OooO0O0("uploadTask", "File size validation through,can be reported");
                return true;
            }
        }
        return false;
    }

    public void run() {
        StringBuilder sb;
        C8571oo00oOoO oo00oooo = new C8571oo00oOoO();
        C8555oo00OooO.m20210OooO00o(this.o0ooOOo);
        C1101a.OooO00o(this.o0ooOOo, AbstractC8456oOooOoo0.OooO0OO());
        if (!C8560oo00o00O.m20214OooO00o(this.o0ooOoO)) {
            AbstractC8536oo00OO0O.OooO0Oo("uploadTask", "create bigzip file fail");
            return;
        }
        boolean z = false;
        String OooO00o2 = C8558oo00o00.OooO00o(this.OooO00o);
        if (TextUtils.isEmpty(OooO00o2) || "2G".equals(OooO00o2)) {
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "The network is bad.");
        } else {
            C8555oo00OooO.OooO00o(new File(this.o0ooOoO));
            z = oo00oooo.OooO00o(this.o0ooOOo, this.o0Oo0oo, this.o0OOO0o);
        }
        if (z) {
            Key OooO00o3 = C8556oo00Oooo.OooO00o();
            C8571oo00oOoO oo00oooo2 = new C8571oo00oOoO();
            oo00oooo2.OooO00o(this.o0OOO0o + this.o0Oo0oo, this.o0ooOoO + this.o0Oo0oo, OooO00o3);
            if (OooO00o(this.o0ooOoO)) {
                boolean OooO00o4 = oo00oooo.OooO00o(this.o0ooOoO, C8556oo00Oooo.OooO00o(OooO00o3), this.OooO00o);
                C8555oo00OooO.OooO00o(new File(this.o0ooOoO));
                if (OooO00o4) {
                    sb = new StringBuilder();
                } else {
                    oo00oooo2.mo30789a(this.o0ooOOo, this.o0OOO0o + this.o0Oo0oo);
                    return;
                }
            } else {
                sb = new StringBuilder();
            }
            sb.append(this.o0OOO0o);
            sb.append(this.o0Oo0oo);
            C8560oo00o00O.OooO00o(sb.toString());
        }
    }
}
