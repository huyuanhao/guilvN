package com.qiyukf.unicorn.p232k;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.qiyukf.unicorn.k.d */
public final class C2698d implements Comparator<File> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(File file, File file2) {
        File file3 = file;
        File file4 = file2;
        if (file3 == file4) {
            return 0;
        }
        if (file3.isDirectory() && file4.isFile()) {
            return -1;
        }
        if (!file3.isFile() || !file4.isDirectory()) {
            return file3.getName().compareToIgnoreCase(file4.getName());
        }
        return 1;
    }
}
