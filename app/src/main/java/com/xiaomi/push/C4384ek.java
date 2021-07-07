package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.p118pd.sdk.C7088o00OO0o0;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.service.C4605ah;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.ek */
public class C4384ek extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public Context f11656a;

    /* renamed from: a */
    public SharedPreferences f11657a;

    /* renamed from: a */
    public C4605ah f11658a;

    public C4384ek(Context context) {
        this.f11656a = context;
        this.f11657a = context.getSharedPreferences("mipush_extra", 0);
        this.f11658a = C4605ah.m13919a(context);
    }

    /* renamed from: a */
    private List<C4502hw> m12192a(File file) {
        FileInputStream fileInputStream;
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileLock lock;
        AbstractC4364dr a = C4365ds.mo41674a().m12121a();
        String a2 = a == null ? "" : a.mo41461a();
        FileLock fileLock = null;
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        synchronized (C4370dx.f11635a) {
            try {
                File file2 = new File(this.f11656a.getExternalFilesDir(null), "push_cdata.lock");
                C4693y.m14241a(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    lock = randomAccessFile.getChannel().lock();
                } catch (Exception unused) {
                    fileInputStream = null;
                    try {
                        fileLock.release();
                    } catch (IOException unused2) {
                    }
                    C4693y.m14236a(fileInputStream);
                    C4693y.m14236a(randomAccessFile);
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                    try {
                        fileLock.release();
                    } catch (IOException unused3) {
                    }
                    C4693y.m14236a(fileInputStream);
                    C4693y.m14236a(randomAccessFile);
                    throw th;
                }
                try {
                    fileInputStream = new FileInputStream(file);
                    while (true) {
                        try {
                            if (fileInputStream.read(bArr) != 4) {
                                break;
                            }
                            int a3 = C4245ac.m11630a(bArr);
                            byte[] bArr2 = new byte[a3];
                            if (fileInputStream.read(bArr2) != a3) {
                                break;
                            }
                            byte[] a4 = C4369dw.m12131a(a2, bArr2);
                            if (!(a4 == null || a4.length == 0)) {
                                C4502hw hwVar = new C4502hw();
                                C4531iy.m13589a(hwVar, a4);
                                arrayList.add(hwVar);
                            }
                        } catch (Exception unused4) {
                            fileLock = lock;
                            if (fileLock != null && fileLock.isValid()) {
                                fileLock.release();
                            }
                            C4693y.m14236a(fileInputStream);
                            C4693y.m14236a(randomAccessFile);
                            return arrayList;
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = lock;
                            if (fileLock != null && fileLock.isValid()) {
                                fileLock.release();
                            }
                            C4693y.m14236a(fileInputStream);
                            C4693y.m14236a(randomAccessFile);
                            throw th;
                        }
                    }
                    if (lock != null) {
                        if (lock.isValid()) {
                            try {
                                lock.release();
                            } catch (IOException unused5) {
                            }
                        }
                    }
                    C4693y.m14236a(fileInputStream);
                } catch (Exception unused6) {
                    fileInputStream = null;
                    fileLock = lock;
                    fileLock.release();
                    C4693y.m14236a(fileInputStream);
                    C4693y.m14236a(randomAccessFile);
                    return arrayList;
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream = null;
                    fileLock = lock;
                    fileLock.release();
                    C4693y.m14236a(fileInputStream);
                    C4693y.m14236a(randomAccessFile);
                    throw th;
                }
            } catch (Exception unused7) {
                randomAccessFile = null;
                fileInputStream = null;
                fileLock.release();
                C4693y.m14236a(fileInputStream);
                C4693y.m14236a(randomAccessFile);
                return arrayList;
            } catch (Throwable th5) {
                th = th5;
                randomAccessFile = null;
                fileInputStream = null;
                fileLock.release();
                C4693y.m14236a(fileInputStream);
                C4693y.m14236a(randomAccessFile);
                throw th;
            }
            C4693y.m14236a(randomAccessFile);
        }
        return arrayList;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    private void mo41384a() {
        SharedPreferences.Editor edit = this.f11657a.edit();
        edit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    private boolean m12194a() {
        if (C4274az.m11737d(this.f11656a)) {
            return false;
        }
        if (!C4274az.m11739f(this.f11656a) || m12196c()) {
            return (C4274az.m11740g(this.f11656a) && !m12195b()) || C4274az.m11741h(this.f11656a);
        }
        return true;
    }

    /* renamed from: b */
    private boolean m12195b() {
        if (!this.f11658a.mo42661a(EnumC4499ht.Upload3GSwitch.mo42043a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f11657a.getLong("last_upload_data_timestamp", -1)) > ((long) Math.max(C7088o00OO0o0.OooO0Oo, this.f11658a.mo42656a(EnumC4499ht.Upload3GFrequency.mo42043a(), 432000)));
    }

    /* renamed from: c */
    private boolean m12196c() {
        if (!this.f11658a.mo42661a(EnumC4499ht.Upload4GSwitch.mo42043a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f11657a.getLong("last_upload_data_timestamp", -1)) > ((long) Math.max(C7088o00OO0o0.OooO0Oo, this.f11658a.mo42656a(EnumC4499ht.Upload4GFrequency.mo42043a(), 259200)));
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int m12197a() {
        return 1;
    }

    public void run() {
        File file = new File(this.f11656a.getExternalFilesDir(null), "push_cdata.data");
        if (!C4274az.m11736c(this.f11656a)) {
            if (file.length() > 1863680) {
                file.delete();
            }
        } else if (!m12194a() && file.exists()) {
            List<C4502hw> a = m12192a(file);
            if (!C4246ad.m11632a(a)) {
                int size = a.size();
                if (size > 4000) {
                    a = a.subList(size - 4000, size);
                }
                C4514ih ihVar = new C4514ih();
                ihVar.mo42225a(a);
                byte[] a2 = C4693y.m14242a(C4531iy.m13590a(ihVar));
                C4520in inVar = new C4520in("-1", false);
                inVar.mo42317c(EnumC4504hy.DataCollection.f12451a);
                inVar.mo42311a(a2);
                AbstractC4364dr a3 = C4365ds.mo41674a().m12121a();
                if (a3 != null) {
                    a3.mo41462a(inVar, EnumC4494ho.Notification, null);
                }
                mo41384a();
            }
            file.delete();
            this.f11657a.edit().remove("ltapn").commit();
        }
    }
}
