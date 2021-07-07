package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.bugly.beta.download.DownloadTask;
import com.umeng.message.proguard.C3848l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.p */
public class C3360p {

    /* renamed from: a */
    public static C3360p f8238a = new C3360p();

    /* renamed from: a */
    public synchronized ContentValues mo38496a(String str) {
        ContentValues contentValues = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Cursor a = C3307ae.m8249a().mo38341a("dl_1002", null, "_dUrl=?", new String[]{str}, null, true);
        if (a != null && a.moveToFirst()) {
            contentValues = new ContentValues();
            contentValues.put("_dUrl", a.getString(a.getColumnIndex("_dUrl")));
            contentValues.put("_sFile", a.getString(a.getColumnIndex("_sFile")));
            contentValues.put("_sLen", Long.valueOf(a.getLong(a.getColumnIndex("_sLen"))));
            contentValues.put("_tLen", Long.valueOf(a.getLong(a.getColumnIndex("_tLen"))));
            contentValues.put("_MD5", a.getString(a.getColumnIndex("_MD5")));
            contentValues.put("_DLTIME", Long.valueOf(a.getLong(a.getColumnIndex("_DLTIME"))));
        }
        if (a != null) {
            a.close();
        }
        return contentValues;
    }

    /* renamed from: b */
    public synchronized int mo38502b(DownloadTask downloadTask) {
        return C3307ae.m8249a().mo38339a("dl_1002", "_dUrl = ?", new String[]{downloadTask.getDownloadUrl()}, (AbstractC3306ad) null, true);
    }

    /* renamed from: c */
    public synchronized boolean mo38505c(String str) {
        boolean z;
        z = false;
        if (C3307ae.m8249a().mo38339a("st_1002", "_id = ? and _tp = ? ", new String[]{"1002", str}, (AbstractC3306ad) null, true) > 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public synchronized int mo38503b(String str) {
        return C3307ae.m8249a().mo38339a("dl_1002", "_sFile = ?", new String[]{str}, (AbstractC3306ad) null, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054 A[DONT_GENERATE] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Map<java.lang.String, byte[]> mo38504c() {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3360p.mo38504c():java.util.Map");
    }

    /* renamed from: b */
    public synchronized int mo38501b() {
        return C3307ae.m8249a().mo38339a("ge_1002", (String) null, (String[]) null, (AbstractC3306ad) null, true);
    }

    /* renamed from: a */
    public synchronized boolean mo38499a(DownloadTask downloadTask) {
        boolean z;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_dUrl", downloadTask.getDownloadUrl());
        contentValues.put("_sFile", downloadTask.getSaveFile().getAbsolutePath());
        contentValues.put("_sLen", Long.valueOf(downloadTask.getSavedLength()));
        contentValues.put("_tLen", Long.valueOf(downloadTask.getTotalLength()));
        contentValues.put("_MD5", downloadTask.getMD5());
        contentValues.put("_DLTIME", Long.valueOf(downloadTask.getCostTime()));
        z = true;
        if (C3307ae.m8249a().mo38340a("dl_1002", contentValues, (AbstractC3306ad) null, true) < 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public synchronized List<C3370w> mo38497a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor a = C3307ae.m8249a().mo38341a("ge_1002", null, null, null, null, true);
        while (a != null && a.moveToNext()) {
            C3370w wVar = (C3370w) C3311ah.m8285a(a.getBlob(a.getColumnIndex("_datas")), C3370w.class);
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        if (a != null) {
            a.close();
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized boolean mo38500a(C3370w wVar) {
        boolean z = false;
        if (wVar == null) {
            return false;
        }
        byte[] a = C3311ah.m8286a((AbstractC3357m) wVar);
        if (a != null) {
            if (a.length > 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_time", Long.valueOf(wVar.f8276b));
                contentValues.put("_datas", a);
                if (C3307ae.m8249a().mo38340a("ge_1002", contentValues, (AbstractC3306ad) null, true) >= 0) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo38498a(int i, String str, byte[] bArr) {
        boolean z;
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3848l.f10389g, Integer.valueOf(i));
        contentValues.put("_tm", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("_tp", str);
        contentValues.put("_dt", bArr);
        z = true;
        if (C3307ae.m8249a().mo38340a("st_1002", contentValues, (AbstractC3306ad) null, true) < 0) {
            z = false;
        }
        return z;
    }
}
