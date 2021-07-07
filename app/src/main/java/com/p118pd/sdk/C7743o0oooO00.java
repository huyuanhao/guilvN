package com.p118pd.sdk;

import android.content.Context;
import com.p118pd.sdk.C7736o0ooo0O;
import java.io.File;

/* renamed from: com.pd.sdk.o0oooO00  reason: case insensitive filesystem */
public final class C7743o0oooO00 extends C7736o0ooo0O {

    /* renamed from: com.pd.sdk.o0oooO00$OooO00o */
    public class OooO00o implements C7736o0ooo0O.OooO0OO {
        public final /* synthetic */ Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f20756OooO00o;

        public OooO00o(Context context, String str) {
            this.OooO00o = context;
            this.f20756OooO00o = str;
        }

        @Override // com.p118pd.sdk.C7736o0ooo0O.OooO0OO
        public File OooO00o() {
            File cacheDir = this.OooO00o.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f20756OooO00o != null ? new File(cacheDir, this.f20756OooO00o) : cacheDir;
        }
    }

    public C7743o0oooO00(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C7743o0oooO00(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public C7743o0oooO00(Context context, String str, long j) {
        super(new OooO00o(context, str), j);
    }
}
