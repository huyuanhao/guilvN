package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4693y;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

/* renamed from: com.xiaomi.mipush.sdk.s */
public class C4232s {

    /* renamed from: a */
    public static volatile C4232s f11319a;

    /* renamed from: a */
    public static final Object f11320a = new Object();

    /* renamed from: a */
    public Context f11321a;

    public C4232s(Context context) {
        this.f11321a = context;
    }

    /* renamed from: a */
    public static C4232s m11590a(Context context) {
        if (f11319a == null) {
            synchronized (C4232s.class) {
                if (f11319a == null) {
                    f11319a = new C4232s(context);
                }
            }
        }
        return f11319a;
    }

    /* renamed from: a */
    private File m11591a(String str) {
        File file = new File(this.f11321a.getFilesDir() + "/crash");
        if (!file.exists()) {
            file.mkdirs();
            return null;
        }
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isFile() && listFiles[i].getName().startsWith(str)) {
                return listFiles[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo41463a(File file) {
        if (file == null) {
            return "";
        }
        String[] split = file.getName().split(Constants.COLON_SEPARATOR);
        return split.length != 2 ? "" : split[0];
    }

    /* renamed from: a */
    public ArrayList<File> mo41464a() {
        ArrayList<File> arrayList = new ArrayList<>();
        File file = new File(this.f11321a.getFilesDir() + "/crash");
        if (!file.exists()) {
            file.mkdirs();
            return arrayList;
        }
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            String[] split = listFiles[i].getName().split(Constants.COLON_SEPARATOR);
            if (split.length >= 2 && Integer.parseInt(split[1]) >= 1 && listFiles[i].isFile()) {
                arrayList.add(listFiles[i]);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo41465a(String str, String str2) {
        Throwable th;
        Exception e;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            synchronized (f11320a) {
                File a = m11591a(str2);
                if (a != null) {
                    String[] split = a.getName().split(Constants.COLON_SEPARATOR);
                    if (split.length >= 2) {
                        a.renameTo(new File(this.f11321a.getFilesDir() + "/crash" + C8932ooOOO0o.OooO0OO + str2 + Constants.COLON_SEPARATOR + String.valueOf(Integer.parseInt(split[1]) + 1)));
                    }
                } else {
                    FileOutputStream fileOutputStream = null;
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.f11321a.getFilesDir() + "/crash" + C8932ooOOO0o.OooO0OO + str2 + Constants.COLON_SEPARATOR + "1"));
                        try {
                            fileOutputStream2.write(str.getBytes());
                            fileOutputStream2.flush();
                            C4693y.m14236a(fileOutputStream2);
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            try {
                                AbstractC4163b.m11303a(e);
                                C4693y.m14236a(fileOutputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                C4693y.m14236a(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream2;
                            C4693y.m14236a(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        AbstractC4163b.m11303a(e);
                        C4693y.m14236a(fileOutputStream);
                    }
                }
            }
        }
    }
}
