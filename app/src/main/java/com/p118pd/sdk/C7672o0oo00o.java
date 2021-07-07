package com.p118pd.sdk;

import java.io.File;

/* renamed from: com.pd.sdk.o0oo00o  reason: case insensitive filesystem */
public class C7672o0oo00o {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19304OooO00o(File file) {
        return file.exists();
    }

    public long OooO00o(File file) {
        return file.length();
    }

    public File OooO00o(String str) {
        return new File(str);
    }
}
