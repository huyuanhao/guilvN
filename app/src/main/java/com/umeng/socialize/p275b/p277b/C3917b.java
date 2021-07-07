package com.umeng.socialize.p275b.p277b;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.DefaultClass;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import java.io.File;
import java.io.IOException;

/* renamed from: com.umeng.socialize.b.b.b */
public class C3917b {

    /* renamed from: b */
    public static C3917b f10693b = new C3917b();

    /* renamed from: a */
    public String f10694a = "";

    public C3917b() {
        try {
            this.f10694a = ContextUtil.getContext().getCacheDir().getCanonicalPath();
        } catch (IOException e) {
            SLog.error(e);
        }
    }

    /* renamed from: a */
    public static C3917b m10787a() {
        C3917b bVar = f10693b;
        return bVar == null ? new C3917b() : bVar;
    }

    /* renamed from: b */
    public File mo40265b() throws IOException {
        File file = new File(mo40266c(), mo40267d());
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        return file;
    }

    /* renamed from: c */
    public File mo40266c() throws IOException {
        String str;
        if (Build.VERSION.SDK_INT >= 29) {
            str = ContextUtil.getContext().getExternalFilesDir(null).getPath();
        } else if (Environment.getExternalStorageDirectory() != null && !TextUtils.isEmpty(Environment.getExternalStorageDirectory().getCanonicalPath())) {
            str = Environment.getExternalStorageDirectory().getCanonicalPath();
        } else if (!TextUtils.isEmpty(this.f10694a)) {
            str = this.f10694a;
            SLog.m10856E(UmengText.CACHE.SD_NOT_FOUNT);
        } else {
            str = DefaultClass.getString();
            SLog.m10856E(UmengText.CACHE.SD_NOT_FOUNT);
        }
        File file = new File(str + C3918c.f10700f);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: d */
    public String mo40267d() {
        String hexdigest = SocializeUtils.hexdigest(String.valueOf(System.currentTimeMillis()));
        return hexdigest + ".jpg";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043 A[SYNTHETIC, Splitter:B:25:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004b A[Catch:{ IOException -> 0x0047 }, DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo40264a(java.io.File r6) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.p275b.p277b.C3917b.mo40264a(java.io.File):byte[]");
    }
}
