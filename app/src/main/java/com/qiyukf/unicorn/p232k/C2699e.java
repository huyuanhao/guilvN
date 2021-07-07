package com.qiyukf.unicorn.p232k;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.k.e */
public final class C2699e {
    /* renamed from: a */
    public static List<File> m6244a(String str, FileFilter fileFilter, boolean z, long j) {
        File[] listFiles = new File(str).listFiles(fileFilter);
        ArrayList arrayList = new ArrayList();
        if (listFiles == null) {
            arrayList = new ArrayList();
        } else {
            for (File file : listFiles) {
                arrayList.add(file);
            }
            Collections.sort(arrayList, new C2698d());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file2 = (File) it.next();
            if (file2.isFile()) {
                int i = ((!(file2 != null && file2.exists() && file2.isFile()) ? -1 : file2.length()) > j ? 1 : ((!(file2 != null && file2.exists() && file2.isFile()) ? -1 : file2.length()) == j ? 0 : -1));
                if (z) {
                    if (i >= 0) {
                    }
                } else if (i <= 0) {
                }
                it.remove();
            }
        }
        return arrayList;
    }
}
