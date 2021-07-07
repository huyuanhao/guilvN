package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* renamed from: com.pd.sdk.o0ooo00O  reason: case insensitive filesystem */
public interface AbstractC7734o0ooo00O {

    /* renamed from: com.pd.sdk.o0ooo00O$OooO00o */
    public interface OooO00o {
        public static final int OooO00o = 262144000;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String f20736OooO00o = "image_manager_disk_cache";

        @Nullable
        AbstractC7734o0ooo00O OooO00o();
    }

    /* renamed from: com.pd.sdk.o0ooo00O$OooO0O0 */
    public interface OooO0O0 {
        boolean OooO00o(@NonNull File file);
    }

    @Nullable
    File OooO00o(AbstractC7644o0oOoOO o0ooooo);

    /* renamed from: OooO00o  reason: collision with other method in class */
    void m19387OooO00o(AbstractC7644o0oOoOO o0ooooo);

    void OooO00o(AbstractC7644o0oOoOO o0ooooo, OooO0O0 oooO0O0);

    void clear();
}
