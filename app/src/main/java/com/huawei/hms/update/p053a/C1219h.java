package com.huawei.hms.update.p053a;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.hms.p037c.AbstractC1140i;
import com.huawei.hms.p037c.C1131a;
import com.huawei.hms.p037c.C1134d;
import com.huawei.hms.p037c.C1135e;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.update.p053a.p054a.AbstractC1209a;
import com.huawei.hms.update.p053a.p054a.AbstractC1210b;
import com.huawei.hms.update.p053a.p054a.C1211c;
import com.huawei.hms.update.p055b.AbstractC1224d;
import com.huawei.hms.update.p055b.C1221a;
import com.huawei.hms.update.p055b.C1222b;
import com.huawei.hms.update.provider.UpdateProvider;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.huawei.hms.update.a.h */
public class C1219h implements AbstractC1209a {

    /* renamed from: a */
    public final Context f1346a;

    /* renamed from: b */
    public final AbstractC1224d f1347b = new C1222b();

    /* renamed from: c */
    public final C1208a f1348c = new C1208a();

    /* renamed from: d */
    public AbstractC1210b f1349d;

    /* renamed from: e */
    public File f1350e;

    public C1219h(Context context) {
        this.f1346a = context.getApplicationContext();
    }

    /* renamed from: b */
    public Context mo15741b() {
        return this.f1346a;
    }

    /* renamed from: a */
    public static boolean m1369a(String str, File file) {
        byte[] a = AbstractC1140i.m1087a(file);
        if (a == null || !C1134d.m1068b(a, true).equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private synchronized void m1367a(AbstractC1210b bVar) {
        this.f1349d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m1366a(int i, int i2, int i3) {
        if (this.f1349d != null) {
            this.f1349d.mo15730a(i, i2, i3, this.f1350e);
        }
    }

    @Override // com.huawei.hms.update.p053a.p054a.AbstractC1209a
    /* renamed from: a */
    public void mo15728a() {
        C1202a.m1318b("UpdateDownload", "Enter cancel.");
        m1367a((AbstractC1210b) null);
        this.f1347b.mo15744b();
    }

    @Override // com.huawei.hms.update.p053a.p054a.AbstractC1209a
    /* renamed from: a */
    public void mo15729a(AbstractC1210b bVar, C1211c cVar) {
        C1131a.m1062a(bVar, "callback must not be null.");
        C1202a.m1318b("UpdateDownload", "Enter downloadPackage.");
        m1367a(bVar);
        if (cVar == null || !cVar.mo15732a()) {
            C1202a.m1320d("UpdateDownload", "In downloadPackage, Invalid update info.");
            m1366a(2201, 0, 0);
        } else if (!"mounted".equals(Environment.getExternalStorageState())) {
            C1202a.m1320d("UpdateDownload", "In downloadPackage, Invalid external storage for downloading file.");
            m1366a(2204, 0, 0);
        } else {
            String str = cVar.f1327b;
            if (TextUtils.isEmpty(str)) {
                C1202a.m1320d("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
                m1366a(2201, 0, 0);
                return;
            }
            Context context = this.f1346a;
            File localFile = UpdateProvider.getLocalFile(context, str + ".apk");
            this.f1350e = localFile;
            if (localFile == null) {
                C1202a.m1320d("UpdateDownload", "In downloadPackage, Failed to get local file for downloading.");
                m1366a(2204, 0, 0);
                return;
            }
            File parentFile = localFile.getParentFile();
            if (parentFile == null || (!parentFile.mkdirs() && !parentFile.isDirectory())) {
                C1202a.m1320d("UpdateDownload", "In downloadPackage, Failed to create directory for downloading file.");
                m1366a(2201, 0, 0);
            } else if (parentFile.getUsableSpace() < ((long) (cVar.f1329d * 3))) {
                C1202a.m1320d("UpdateDownload", "In downloadPackage, No space for downloading file.");
                m1366a(2203, 0, 0);
            } else {
                try {
                    mo15740a(cVar);
                } catch (C1221a unused) {
                    C1202a.m1319c("UpdateDownload", "In downloadPackage, Canceled to download the update file.");
                    m1366a(2101, 0, 0);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo15740a(C1211c cVar) throws C1221a {
        C1202a.m1318b("UpdateDownload", "Enter downloadPackage.");
        C1213b bVar = null;
        try {
            String str = cVar.f1327b;
            if (TextUtils.isEmpty(str)) {
                C1202a.m1320d("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
                m1366a(2201, 0, 0);
            } else {
                this.f1348c.mo15724a(mo15741b(), str);
                if (!this.f1348c.mo15727b(cVar.f1328c, cVar.f1329d, cVar.f1330e)) {
                    this.f1348c.mo15725a(cVar.f1328c, cVar.f1329d, cVar.f1330e);
                    bVar = m1365a(this.f1350e, cVar.f1329d, str);
                } else if (this.f1348c.mo15726b() != this.f1348c.mo15722a()) {
                    bVar = m1365a(this.f1350e, cVar.f1329d, str);
                    bVar.mo15733a((long) this.f1348c.mo15726b());
                } else if (m1369a(cVar.f1330e, this.f1350e)) {
                    m1366a(2000, 0, 0);
                } else {
                    this.f1348c.mo15725a(cVar.f1328c, cVar.f1329d, cVar.f1330e);
                    bVar = m1365a(this.f1350e, cVar.f1329d, str);
                }
                int a = this.f1347b.mo15742a(cVar.f1328c, bVar, this.f1348c.mo15726b(), this.f1348c.mo15722a(), this.f1346a);
                if (a != 200 && a != 206) {
                    C1202a.m1320d("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package, HTTP code: " + a);
                    m1366a(2201, 0, 0);
                } else if (!m1369a(cVar.f1330e, this.f1350e)) {
                    m1366a(2202, 0, 0);
                } else {
                    m1366a(2000, 0, 0);
                    this.f1347b.mo15743a();
                    C1135e.m1071a((OutputStream) bVar);
                    return;
                }
            }
            this.f1347b.mo15743a();
            C1135e.m1071a((OutputStream) bVar);
        } catch (IOException e) {
            C1202a.m1320d("UpdateDownload", "In DownloadHelper.downloadPackage, Failed to download." + e.getMessage());
            m1366a(2201, 0, 0);
        } catch (Throwable th) {
            this.f1347b.mo15743a();
            C1135e.m1071a((OutputStream) null);
            throw th;
        }
    }

    /* renamed from: a */
    private C1213b m1365a(File file, int i, String str) throws IOException {
        return new C1220i(this, file, i, i, str);
    }
}
