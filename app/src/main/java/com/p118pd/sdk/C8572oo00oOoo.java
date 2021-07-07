package com.p118pd.sdk;

import android.os.Handler;
import com.huawei.hianalytics.log.p033f.C1101a;
import com.p118pd.sdk.C7265o0O000oo;
import com.p118pd.sdk.C8552oo00OoOo;
import java.io.File;
import java.util.Arrays;

/* renamed from: com.pd.sdk.oo00oOoo  reason: case insensitive filesystem */
public class C8572oo00oOoo implements AbstractC8576oo00oo0O {
    public Handler OooO00o;
    public String o0OOO0o;
    public String o0ooOOo;
    public String o0ooOoO;

    public C8572oo00oOoo(String str, Handler handler, String str2) {
        this.o0ooOOo = str;
        this.OooO00o = handler;
        this.o0ooOoO = str2 + C8552oo00OoOo.OooO00o.OooO0O0;
        this.o0OOO0o = str2 + C8552oo00OoOo.OooO00o.OooO0OO;
    }

    public void run() {
        if (!C8560oo00o00O.m20214OooO00o(this.o0OOO0o)) {
            AbstractC8536oo00OO0O.OooO0Oo("CreateFirstZip", "file create fail");
            return;
        }
        C8571oo00oOoO oo00oooo = new C8571oo00oOoO();
        C1101a.OooO00o(this.o0ooOoO, AbstractC8456oOooOoo0.OooO0O0() + 1);
        if (!oo00oooo.OooO00o(this.o0ooOoO, this.o0ooOOo, this.o0OOO0o)) {
            AbstractC8536oo00OO0O.OooO0Oo("CreateFirstZip", "log create zip fail");
        }
        File[] OooO00o2 = C1101a.OooO00o(this.o0OOO0o);
        int length = OooO00o2.length;
        if (length == 0) {
            AbstractC8536oo00OO0O.OooO0OO("CreateFirstZip", "There is no file in zips, do not carry out the report");
            return;
        }
        if (length > AbstractC8456oOooOoo0.OooO0OO() && C8560oo00o00O.OooO00o(OooO00o2) > AbstractC8456oOooOoo0.OooO0OO()) {
            File[] OooO00o3 = C1101a.OooO00o(this.o0OOO0o);
            Arrays.sort(OooO00o3, new C1101a.C1102a());
            C1101a.OooO00o(OooO00o3, AbstractC8456oOooOoo0.OooO0OO());
        }
        this.OooO00o.sendEmptyMessageDelayed(6, C7265o0O000oo.OooO0o.OooO00o);
    }
}
