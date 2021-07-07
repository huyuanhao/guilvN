package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import com.p118pd.sdk.C9053ooOoOo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* renamed from: com.umeng.commonsdk.internal.utils.e */
public class C3540e {

    /* renamed from: com.umeng.commonsdk.internal.utils.e$a */
    public enum EnumC3541a {
        check_su_binary(new String[]{"/system/xbin/which", C9053ooOoOo.OooO00o});
        

        /* renamed from: b */
        public String[] f9101b;

        /* access modifiers changed from: public */
        EnumC3541a(String[] strArr) {
            this.f9101b = strArr;
        }
    }

    /* renamed from: a */
    public ArrayList mo38859a(EnumC3541a aVar) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT > 28) {
            return arrayList;
        }
        try {
            Process exec = Runtime.getRuntime().exec(aVar.f9101b);
            new BufferedWriter(new OutputStreamWriter(exec.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    arrayList.add(readLine);
                } catch (Exception unused) {
                }
            }
            return arrayList;
        } catch (Exception unused2) {
            return null;
        }
    }
}
