package com.p118pd.sdk;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.pd.sdk.o0o00ooO  reason: case insensitive filesystem */
public final class C7574o0o00ooO {
    public static String OooO00o = "";
    public static String OooO0O0 = "";
    public static String OooO0OO = "";

    public static synchronized void OooO00o(String str) {
        synchronized (C7574o0o00ooO.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            OooO00o(arrayList);
        }
    }

    public static synchronized void OooO00o(String str, String str2, String str3) {
        synchronized (C7574o0o00ooO.class) {
            OooO00o = str;
            OooO0O0 = str2;
            OooO0OO = str3;
        }
    }

    public static synchronized void OooO00o(Throwable th) {
        String str;
        synchronized (C7574o0o00ooO.class) {
            ArrayList arrayList = new ArrayList();
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                str = stringWriter.toString();
            } else {
                str = "";
            }
            arrayList.add(str);
            OooO00o(arrayList);
        }
    }

    public static synchronized void OooO00o(List<String> list) {
        synchronized (C7574o0o00ooO.class) {
            if (!C7559o0o00OOo.m19210OooO00o(OooO0O0)) {
                if (!C7559o0o00OOo.m19210OooO00o(OooO0OO)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(OooO0OO);
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        stringBuffer.append(", " + it.next());
                    }
                    stringBuffer.append("\n");
                    try {
                        File file = new File(OooO00o);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(OooO00o, OooO0O0);
                        if (!file2.exists()) {
                            file2.createNewFile();
                        }
                        FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                        fileWriter.write(stringBuffer.toString());
                        fileWriter.flush();
                        fileWriter.close();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
