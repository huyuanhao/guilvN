package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.multidex.MultiDexExtractor;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C4635bb;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.dj */
public class C4353dj {

    /* renamed from: a */
    public static String f11586a = "/MiPushLog";

    /* renamed from: a */
    public int f11587a;
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: a */
    public final SimpleDateFormat f11588a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: a */
    public ArrayList<File> f11589a = new ArrayList<>();

    /* renamed from: a */
    public boolean f11590a;

    /* renamed from: b */
    public int f11591b = 2097152;

    /* renamed from: b */
    public String f11592b;

    /* renamed from: c */
    public String f11593c;

    /* renamed from: a */
    private void m12083a(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) {
        char[] cArr = new char[4096];
        int read = bufferedReader.read(cArr);
        boolean z = false;
        while (read != -1 && !z) {
            String str = new String(cArr, 0, read);
            Matcher matcher = pattern.matcher(str);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= read || !matcher.find(i)) {
                    break;
                }
                int start = matcher.start();
                String substring = str.substring(start, this.f11592b.length() + start);
                if (this.f11590a) {
                    if (substring.compareTo(this.f11593c) > 0) {
                        read = start;
                        z = true;
                        break;
                    }
                } else if (substring.compareTo(this.f11592b) >= 0) {
                    this.f11590a = true;
                    i2 = start;
                }
                int indexOf = str.indexOf(10, start);
                if (indexOf == -1) {
                    indexOf = this.f11592b.length();
                }
                i = start + indexOf;
            }
            if (this.f11590a) {
                int i3 = read - i2;
                this.f11587a += i3;
                bufferedWriter.write(cArr, i2, i3);
                if (z || this.f11587a > this.f11591b) {
                    return;
                }
            }
            read = bufferedReader.read(cArr);
        }
    }

    /* renamed from: a */
    private void mo41661a(File file) {
        Throwable th;
        BufferedReader bufferedReader;
        String str;
        FileNotFoundException e;
        IOException e2;
        Pattern compile = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        BufferedReader bufferedReader2 = null;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            try {
                bufferedWriter.write("model :" + Build.MODEL + "; os :" + Build.VERSION.INCREMENTAL + "; uid :" + C4635bb.m14028a() + "; lng :" + Locale.getDefault().toString() + "; sdk :" + 38 + "; andver :" + Build.VERSION.SDK_INT + "\n");
                this.f11587a = 0;
                Iterator<File> it = this.f11589a.iterator();
                while (it.hasNext()) {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(it.next())));
                    try {
                        m12083a(bufferedReader, bufferedWriter, compile);
                        bufferedReader.close();
                        bufferedReader2 = bufferedReader;
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        bufferedReader2 = bufferedWriter;
                        str = "LOG: filter error = " + e.getMessage();
                        AbstractC4163b.m11305c(str);
                        C4693y.m14236a(bufferedReader2);
                        C4693y.m14236a(bufferedReader);
                    } catch (IOException e4) {
                        e2 = e4;
                        bufferedReader2 = bufferedWriter;
                        str = "LOG: filter error = " + e2.getMessage();
                        AbstractC4163b.m11305c(str);
                        C4693y.m14236a(bufferedReader2);
                        C4693y.m14236a(bufferedReader);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedWriter;
                        C4693y.m14236a(bufferedReader2);
                        C4693y.m14236a(bufferedReader);
                        throw th;
                    }
                }
                bufferedWriter.write(C4342db.mo41642a().mo41647c());
                C4693y.m14236a(bufferedWriter);
                C4693y.m14236a(bufferedReader2);
            } catch (FileNotFoundException e5) {
                e = e5;
                bufferedReader = null;
                bufferedReader2 = bufferedWriter;
                str = "LOG: filter error = " + e.getMessage();
                AbstractC4163b.m11305c(str);
                C4693y.m14236a(bufferedReader2);
                C4693y.m14236a(bufferedReader);
            } catch (IOException e6) {
                e2 = e6;
                bufferedReader = null;
                bufferedReader2 = bufferedWriter;
                str = "LOG: filter error = " + e2.getMessage();
                AbstractC4163b.m11305c(str);
                C4693y.m14236a(bufferedReader2);
                C4693y.m14236a(bufferedReader);
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                bufferedReader2 = bufferedWriter;
                C4693y.m14236a(bufferedReader2);
                C4693y.m14236a(bufferedReader);
                throw th;
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            bufferedReader = null;
            str = "LOG: filter error = " + e.getMessage();
            AbstractC4163b.m11305c(str);
            C4693y.m14236a(bufferedReader2);
            C4693y.m14236a(bufferedReader);
        } catch (IOException e8) {
            e2 = e8;
            bufferedReader = null;
            str = "LOG: filter error = " + e2.getMessage();
            AbstractC4163b.m11305c(str);
            C4693y.m14236a(bufferedReader2);
            C4693y.m14236a(bufferedReader);
        } catch (Throwable th4) {
            th = th4;
            C4693y.m14236a(bufferedReader2);
            C4693y.m14236a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: a */
    public C4353dj m12085a(File file) {
        if (file.exists()) {
            this.f11589a.add(file);
        }
        return this;
    }

    /* renamed from: a */
    public C4353dj mo41662a(Date date, Date date2) {
        String str;
        if (date.after(date2)) {
            this.f11592b = this.f11588a.format(date2);
            str = this.f11588a.format(date);
        } else {
            this.f11592b = this.f11588a.format(date);
            str = this.f11588a.format(date2);
        }
        this.f11593c = str;
        return this;
    }

    /* renamed from: a */
    public File mo41663a(Context context, Date date, Date date2, File file) {
        File file2;
        if (MiPushRegistar.PACKAGE_XIAOMI.equalsIgnoreCase(context.getPackageName())) {
            file2 = context.getFilesDir();
            m12085a(new File(file2, "xmsf.log.1"));
            m12085a(new File(file2, "xmsf.log"));
        } else {
            File file3 = new File(context.getExternalFilesDir(null) + f11586a);
            m12085a(new File(file3, "log0.txt"));
            m12085a(new File(file3, "log1.txt"));
            file2 = file3;
        }
        if (!file2.isDirectory()) {
            return null;
        }
        File file4 = new File(file, date.getTime() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + date2.getTime() + MultiDexExtractor.o0OO00O);
        if (file4.exists()) {
            return null;
        }
        mo41662a(date, date2);
        long currentTimeMillis = System.currentTimeMillis();
        File file5 = new File(file, "log.txt");
        mo41661a(file5);
        AbstractC4163b.m11305c("LOG: filter cost = " + (System.currentTimeMillis() - currentTimeMillis));
        if (file5.exists()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            C4693y.m14238a(file4, file5);
            AbstractC4163b.m11305c("LOG: zip cost = " + (System.currentTimeMillis() - currentTimeMillis2));
            file5.delete();
            if (file4.exists()) {
                return file4;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo41664a(int i) {
        if (i != 0) {
            this.f11591b = i;
        }
    }
}
