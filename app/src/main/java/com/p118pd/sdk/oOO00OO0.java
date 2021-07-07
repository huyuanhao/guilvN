package com.p118pd.sdk;

import com.drew.imaging.FileType;
import com.drew.lang.annotations.NotNull;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOO00OO0 */
public class oOO00OO0 extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21048OooO00o;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21048OooO00o = hashMap;
        hashMap.put(1, "Detected File Type Name");
        f21048OooO00o.put(2, "Detected File Type Long Name");
        f21048OooO00o.put(3, "Detected MIME Type");
        f21048OooO00o.put(4, "Expected File Name Extension");
    }

    public oOO00OO0(FileType fileType) {
        OooO00o(new C8013oOO00O0o(this));
        m19648OooO00o(1, fileType.getName());
        m19648OooO00o(2, fileType.getLongName());
        if (fileType.getMimeType() != null) {
            m19648OooO00o(3, fileType.getMimeType());
        }
        if (fileType.getCommonExtension() != null) {
            m19648OooO00o(4, fileType.getCommonExtension());
        }
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "File Type";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19714OooO00o() {
        return f21048OooO00o;
    }
}
