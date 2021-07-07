package com.qiyukf.unicorn.fileselect.p225b;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.qiyukf.unicorn.fileselect.b.a */
public final class C2637a implements FileFilter {

    /* renamed from: a */
    public String[] f5428a;

    public C2637a(String[] strArr) {
        this.f5428a = strArr;
    }

    public final boolean accept(File file) {
        String[] strArr;
        if (file.isDirectory() || (strArr = this.f5428a) == null || strArr.length <= 0) {
            return true;
        }
        for (int i = 0; i < this.f5428a.length; i++) {
            if (file.getName().endsWith(this.f5428a[i].toLowerCase()) || file.getName().endsWith(this.f5428a[i].toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}
