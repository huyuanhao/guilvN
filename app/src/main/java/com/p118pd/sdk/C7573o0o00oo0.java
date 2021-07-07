package com.p118pd.sdk;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0o00oo0  reason: case insensitive filesystem */
public final class C7573o0o00oo0 {
    public AbstractC7584o0o0O0OO OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public File f20413OooO00o = null;

    public C7573o0o00oo0(String str, AbstractC7584o0o0O0OO o0o0o0oo) {
        this.f20413OooO00o = new File(str);
        this.OooO00o = o0o0o0oo;
    }

    public static String OooO00o(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    public synchronized void OooO0O0() {
        if (this.f20413OooO00o != null) {
            if (this.f20413OooO00o.exists() && this.f20413OooO00o.isDirectory() && this.f20413OooO00o.list().length != 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f20413OooO00o.list()) {
                    arrayList.add(str);
                }
                Collections.sort(arrayList);
                String str2 = (String) arrayList.get(arrayList.size() - 1);
                int size = arrayList.size();
                if (str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                    if (arrayList.size() >= 2) {
                        str2 = (String) arrayList.get(arrayList.size() - 2);
                        size--;
                    } else {
                        return;
                    }
                }
                if (!this.OooO00o.mo27531a(OooO00o(C7561o0o00Oo0.OooO00o(this.f20413OooO00o.getAbsolutePath(), str2)))) {
                    size--;
                }
                for (int i = 0; i < size; i++) {
                    new File(this.f20413OooO00o, (String) arrayList.get(i)).delete();
                }
            }
        }
    }

    public final void OooO00o() {
        new Thread(new RunnableC7572o0o00oo(this)).start();
    }
}
