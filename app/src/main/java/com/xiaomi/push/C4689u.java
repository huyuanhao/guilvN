package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.xiaomi.push.u */
public final class C4689u {

    /* renamed from: a */
    public static final Set<String> f13404a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    public Context f13405a;

    /* renamed from: a */
    public RandomAccessFile f13406a;

    /* renamed from: a */
    public String f13407a;

    /* renamed from: a */
    public FileLock f13408a;

    public C4689u(Context context) {
        this.f13405a = context;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C4689u m14229a(Context context, File file) {
        AbstractC4163b.m11305c("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        if (f13404a.add(str)) {
            C4689u uVar = new C4689u(context);
            uVar.f13407a = str;
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                uVar.f13406a = randomAccessFile;
                uVar.f13408a = randomAccessFile.getChannel().lock();
                AbstractC4163b.m11305c("Locked: " + str + " :" + uVar.f13408a);
                if (uVar.f13408a == null) {
                    RandomAccessFile randomAccessFile2 = uVar.f13406a;
                    if (randomAccessFile2 != null) {
                        C4693y.m14236a(randomAccessFile2);
                    }
                    f13404a.remove(uVar.f13407a);
                }
                return uVar;
            } catch (Throwable th) {
                if (uVar.f13408a == null) {
                    RandomAccessFile randomAccessFile3 = uVar.f13406a;
                    if (randomAccessFile3 != null) {
                        C4693y.m14236a(randomAccessFile3);
                    }
                    f13404a.remove(uVar.f13407a);
                }
                throw th;
            }
        } else {
            throw new IOException("abtain lock failure");
        }
    }

    /* renamed from: a */
    public void mo42755a() {
        AbstractC4163b.m11305c("unLock: " + this.f13408a);
        FileLock fileLock = this.f13408a;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f13408a.release();
            } catch (IOException unused) {
            }
            this.f13408a = null;
        }
        RandomAccessFile randomAccessFile = this.f13406a;
        if (randomAccessFile != null) {
            C4693y.m14236a(randomAccessFile);
        }
        f13404a.remove(this.f13407a);
    }
}
