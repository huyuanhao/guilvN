package com.p118pd.sdk;

import android.content.Context;
import com.p118pd.sdk.AbstractC7734o0ooo00O;
import com.p118pd.sdk.C7736o0ooo0O;
import java.io.File;

@Deprecated
/* renamed from: com.pd.sdk.o0ooo0o  reason: case insensitive filesystem */
public final class C7738o0ooo0o extends C7736o0ooo0O {

    /* renamed from: com.pd.sdk.o0ooo0o$OooO00o */
    public class OooO00o implements C7736o0ooo0O.OooO0OO {
        public final /* synthetic */ Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f20738OooO00o;

        public OooO00o(Context context, String str) {
            this.OooO00o = context;
            this.f20738OooO00o = str;
        }

        @Override // com.p118pd.sdk.C7736o0ooo0O.OooO0OO
        public File OooO00o() {
            File externalCacheDir = this.OooO00o.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f20738OooO00o != null ? new File(externalCacheDir, this.f20738OooO00o) : externalCacheDir;
        }
    }

    public C7738o0ooo0o(Context context) {
        this(context, "image_manager_disk_cache", AbstractC7734o0ooo00O.OooO00o.OooO00o);
    }

    public C7738o0ooo0o(Context context, int i) {
        this(context, "image_manager_disk_cache", i);
    }

    public C7738o0ooo0o(Context context, String str, int i) {
        super(new OooO00o(context, str), (long) i);
    }
}
