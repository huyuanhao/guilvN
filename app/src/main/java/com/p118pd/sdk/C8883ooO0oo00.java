package com.p118pd.sdk;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.pd.sdk.ooO0oo00  reason: case insensitive filesystem */
public class C8883ooO0oo00 {
    public static void OooO00o(List<String> list, String str) throws Exception {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
        for (String str2 : list) {
            OooO00o(str2, zipOutputStream);
        }
        zipOutputStream.finish();
        zipOutputStream.close();
    }

    public static void OooO00o(String str, ZipOutputStream zipOutputStream) throws Exception {
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
                    OooO00o(str + File.separator + list[i], zipOutputStream);
                }
            }
        }
    }
}
