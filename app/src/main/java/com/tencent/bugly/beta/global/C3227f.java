package com.tencent.bugly.beta.global;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.bugly.beta.download.AbstractC3220b;
import com.tencent.bugly.beta.download.C3219a;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3360p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.beta.global.f */
public class C3227f {

    /* renamed from: a */
    public static C3227f f7414a = new C3227f();

    /* renamed from: b */
    public final Map<String, DownloadTask> f7415b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    public Handler f7416c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public List<Runnable> f7417d = new ArrayList();

    /* renamed from: a */
    public synchronized void mo37918a(Runnable runnable, int i) {
        if (this.f7415b.size() == 0) {
            runnable.run();
        } else {
            RunnableC3225d dVar = new RunnableC3225d(6, false, runnable);
            this.f7416c.postDelayed(dVar, (long) i);
            mo37917a(dVar);
        }
    }

    /* renamed from: b */
    public void mo37919b() {
        synchronized (this) {
            for (Runnable runnable : this.f7417d) {
                runnable.run();
            }
            for (DownloadTask downloadTask : this.f7415b.values()) {
                downloadTask.delete(false);
            }
            this.f7417d.clear();
            this.f7415b.clear();
        }
    }

    /* renamed from: a */
    public synchronized void mo37917a(Runnable runnable) {
        if (this.f7415b.size() == 0) {
            runnable.run();
        } else {
            this.f7417d.add(runnable);
        }
    }

    /* renamed from: a */
    public void mo37916a(AbstractC3220b bVar, Map<String, String> map) {
        DownloadTask downloadTask;
        if (bVar != null) {
            if (map == null || map.isEmpty()) {
                this.f7415b.clear();
                ResBean resBean = new ResBean();
                ResBean.f7346a = resBean;
                C3222a.m7765a("rb.bch", (Parcelable) resBean);
                return;
            }
            for (DownloadTask downloadTask2 : this.f7415b.values()) {
                downloadTask2.delete(true);
            }
            this.f7415b.clear();
            C3219a aVar = new C3219a(1, this, this.f7415b);
            String[] strArr = ResBean.f7347b;
            for (String str : strArr) {
                if (!map.containsKey(str)) {
                    this.f7415b.clear();
                    ResBean resBean2 = new ResBean();
                    ResBean.f7346a = resBean2;
                    C3222a.m7765a("rb.bch", (Parcelable) resBean2);
                    return;
                }
                String str2 = map.get(str);
                if (!str.startsWith("IMG_") || TextUtils.isEmpty(str2)) {
                    ResBean.f7346a.mo37905a(str, str2);
                } else {
                    ResBean.f7346a.mo37905a(str, "");
                    Iterator<DownloadTask> it = this.f7415b.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            downloadTask = null;
                            break;
                        }
                        downloadTask = it.next();
                        if (downloadTask.getDownloadUrl().equals(str2)) {
                            break;
                        }
                    }
                    if (downloadTask == null) {
                        downloadTask = bVar.mo37901a(str2, C3226e.f7357E.f7405r.getAbsolutePath(), null, null);
                    }
                    if (downloadTask != null) {
                        downloadTask.addListener(aVar);
                        downloadTask.setNeededNotify(false);
                        this.f7415b.put(str, downloadTask);
                    }
                }
            }
            C3222a.m7765a("rb.bch", (Parcelable) ResBean.f7346a);
            if (!this.f7415b.isEmpty()) {
                for (DownloadTask downloadTask3 : this.f7415b.values()) {
                    downloadTask3.download();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo37915a() {
        ArrayList<String> arrayList = new ArrayList();
        String[] strArr = ResBean.f7347b;
        for (String str : strArr) {
            String a = ResBean.f7346a.mo37904a(str);
            if (str.startsWith("IMG_") && !TextUtils.isEmpty(a)) {
                arrayList.add(a);
            }
        }
        File[] listFiles = C3226e.f7357E.f7405r.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                boolean z = true;
                for (String str2 : arrayList) {
                    if (file.getAbsolutePath().equals(str2)) {
                        z = false;
                    }
                }
                if (z) {
                    C3360p.f8238a.mo38503b(file.getAbsolutePath());
                    if (!file.delete()) {
                        C3321an.m8357e("cannot deleteCache file:%s", file.getAbsolutePath());
                    }
                }
            }
        }
    }
}
