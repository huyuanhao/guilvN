package com.p118pd.sdk;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* renamed from: com.pd.sdk.o0o00Ooo  reason: case insensitive filesystem */
public final class C7563o0o00Ooo implements FileFilter {
    public final /* synthetic */ C7562o0o00OoO OooO00o;

    public C7563o0o00Ooo(C7562o0o00OoO o0o00ooo) {
        this.OooO00o = o0o00ooo;
    }

    public final boolean accept(File file) {
        return Pattern.matches(C7748o0oooOOo.OooO0O0, file.getName());
    }
}
