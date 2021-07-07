package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.beta.download.BetaReceiver;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.RunnableC3225d;
import com.tencent.bugly.beta.p267ui.C3239c;
import com.tencent.bugly.beta.utils.C3254e;
import java.io.File;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.tencent.bugly.proguard.t */
public class RunnableC3367t extends DownloadTask implements Runnable {

    /* renamed from: k */
    public long f8251k = 0;

    /* renamed from: l */
    public File f8252l;

    /* renamed from: m */
    public long f8253m = 0;

    public RunnableC3367t(String str, String str2, long j, long j2, String str3) {
        super(str, "", "", str3);
        File file = new File(str2);
        this.f8252l = file;
        this.f7333b = file.getParent();
        this.f7334c = this.f8252l.getName();
        this.f7336e = j;
        this.f7337f = j2;
        getStatus();
    }

    /* renamed from: a */
    private String m8611a(HttpURLConnection httpURLConnection) {
        try {
            if (!TextUtils.isEmpty(this.f7334c)) {
                return this.f7334c;
            }
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        List<String> list = headerFields.get(str);
                        if (list != null) {
                            for (String str2 : list) {
                                if (str2 != null) {
                                    if ("content-disposition".equals(str.toLowerCase())) {
                                        Matcher matcher = Pattern.compile(".*filename=(.*)").matcher(str2.toLowerCase());
                                        if (matcher.find()) {
                                            return matcher.group(1);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                }
            }
            String substring = getDownloadUrl().substring(getDownloadUrl().lastIndexOf(47) + 1);
            if (!TextUtils.isEmpty(substring)) {
                return substring;
            }
            return UUID.randomUUID() + ".apk";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo38513b() {
        this.f7340i = 1;
        mo38511a();
        C3365s.f8247a.f8248b.remove(getDownloadUrl());
        BetaReceiver.netListeners.remove(getDownloadUrl());
        C3254e.m7893a(new RunnableC3225d(8, this.f7335d, this));
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public void delete(boolean z) {
        stop();
        if (z) {
            if (getSaveFile() != null && getSaveFile().exists() && !getSaveFile().isDirectory()) {
                getSaveFile().delete();
            }
            C3360p.f8238a.mo38502b(this);
        }
        BetaReceiver.netListeners.remove(getDownloadUrl());
        this.f7334c = null;
        this.f7336e = 0;
        this.f7337f = 0;
        this.f7340i = 4;
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public void download() {
        if (getStatus() == 1) {
            mo38513b();
        } else if (getStatus() != 2) {
            if (getSaveFile() == null || !getSaveFile().exists()) {
                this.f7336e = 0;
                this.f7337f = 0;
                this.f8251k = 0;
            } else {
                this.f7336e = getSaveFile().length();
            }
            if (this.f7338g) {
                C3239c.f7439a.mo38019a(this);
            }
            this.f8253m = System.currentTimeMillis();
            this.f7340i = 2;
            C3365s.f8247a.f8248b.put(getDownloadUrl(), this);
            C3365s.f8247a.mo38509a(this);
        }
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public long getCostTime() {
        return this.f8251k;
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public File getSaveFile() {
        return this.f8252l;
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public int getStatus() {
        if (getSaveFile() != null && getSaveFile().exists() && getSaveFile().length() == this.f7337f && !C3365s.f8247a.f8248b.contains(this)) {
            this.f7336e = this.f7337f;
            this.f7340i = 1;
        }
        if (getSaveFile() != null && getSaveFile().exists() && getSaveFile().length() > 0 && getSaveFile().length() < this.f7337f && !C3365s.f8247a.f8248b.contains(this)) {
            this.f7336e = getSaveFile().length();
            this.f7340i = 3;
        }
        if ((getSaveFile() == null || !getSaveFile().exists()) && !C3365s.f8247a.f8248b.contains(this)) {
            this.f7340i = 0;
        }
        return this.f7340i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0158 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 436
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.RunnableC3367t.run():void");
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public void stop() {
        if (this.f7340i != 5) {
            this.f7340i = 3;
        }
    }

    public RunnableC3367t(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
        getStatus();
    }

    /* renamed from: a */
    public void mo38512a(int i, String str) {
        this.f7340i = 5;
        C3239c.f7439a.mo38018a();
        C3365s.f8247a.f8248b.remove(getDownloadUrl());
        C3254e.m7893a(new RunnableC3225d(10, this.f7335d, this, Integer.valueOf(i), str));
    }

    /* renamed from: a */
    public void mo38511a() {
        this.f8251k += System.currentTimeMillis() - this.f8253m;
        C3360p.f8238a.mo38499a(this);
        this.f8253m = System.currentTimeMillis();
        C3239c.f7439a.mo38018a();
        C3254e.m7893a(new RunnableC3225d(9, this.f7335d, this));
    }
}
