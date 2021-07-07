package com.qiyukf.nimlib.p155a.p157b.p158a;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c;
import com.qiyukf.basesdk.p120b.p121a.p123b.C1735a;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2111a;
import com.qiyukf.nimlib.p155a.p162c.p163a.C2136d;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p175f.C2175a;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.qiyukf.nimlib.a.b.a.d */
public final class C2115d extends AbstractC2111a {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3 A[SYNTHETIC, Splitter:B:39:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9 A[SYNTHETIC, Splitter:B:44:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e2 A[SYNTHETIC, Splitter:B:52:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8 A[SYNTHETIC, Splitter:B:57:0x00f8] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m4286a() {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p155a.p157b.p158a.C2115d.m4286a():java.lang.String");
    }

    /* renamed from: a */
    public static void m4287a(String str, ZipOutputStream zipOutputStream) {
        if (zipOutputStream != null) {
            File file = new File(str);
            if (file.isFile()) {
                ZipEntry zipEntry = new ZipEntry(file.getName());
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                zipOutputStream.putNextEntry(zipEntry);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        zipOutputStream.write(bArr, 0, read);
                    } else {
                        zipOutputStream.closeEntry();
                        bufferedInputStream.close();
                        return;
                    }
                }
            } else {
                String[] list = file.list();
                if (list.length <= 0) {
                    zipOutputStream.putNextEntry(new ZipEntry(str + File.separator));
                    zipOutputStream.closeEntry();
                }
                for (int i = 0; i < list.length; i++) {
                    m4287a(str + File.separator + list[i], zipOutputStream);
                }
            }
        }
    }

    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2111a
    /* renamed from: a */
    public final void mo34639a(AbstractC2148a aVar) {
        String a = m4286a();
        if (a != null && new File(a).exists()) {
            try {
                final String a2 = C2349d.m5123a(C1853d.m3518b(), EnumC2347c.TYPE_LOG);
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(a2)));
                m4287a(a, zipOutputStream);
                zipOutputStream.finish();
                zipOutputStream.close();
                new File(a).delete();
                C1735a.m3113a().mo33910a(a2, null, a2, new AbstractC1743c() {
                    /* class com.qiyukf.nimlib.p155a.p157b.p158a.C2115d.C21161 */

                    @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
                    /* renamed from: a */
                    public final void mo33925a() {
                    }

                    @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
                    /* renamed from: a */
                    public final void mo33926a(int i) {
                    }

                    @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
                    /* renamed from: a */
                    public final void mo33927a(long j, long j2) {
                    }

                    @Override // com.qiyukf.basesdk.p120b.p121a.p123b.AbstractC1743c
                    /* renamed from: a */
                    public final void mo33928a(String str) {
                        C2130c.m4323a().mo34662a(new C2136d(str), C2175a.f4338d);
                        new File(a2).delete();
                    }
                });
            } catch (Exception e) {
                C1709a.m3015b("UploadLogNotifyHandler", "uploadLog is error", e);
            }
        }
    }
}
