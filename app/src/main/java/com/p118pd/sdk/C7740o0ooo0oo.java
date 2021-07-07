package com.p118pd.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.p118pd.sdk.C7736o0ooo0O;
import java.io.File;

/* renamed from: com.pd.sdk.o0ooo0oo  reason: case insensitive filesystem */
public final class C7740o0ooo0oo extends C7736o0ooo0O {

    /* renamed from: com.pd.sdk.o0ooo0oo$OooO00o */
    public class OooO00o implements C7736o0ooo0O.OooO0OO {
        public final /* synthetic */ Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f20746OooO00o;

        public OooO00o(Context context, String str) {
            this.OooO00o = context;
            this.f20746OooO00o = str;
        }

        @Nullable
        private File OooO0O0() {
            File cacheDir = this.OooO00o.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f20746OooO00o != null ? new File(cacheDir, this.f20746OooO00o) : cacheDir;
        }

        @Override // com.p118pd.sdk.C7736o0ooo0O.OooO0OO
        public File OooO00o() {
            File externalCacheDir;
            File OooO0O0 = OooO0O0();
            if ((OooO0O0 == null || !OooO0O0.exists()) && (externalCacheDir = this.OooO00o.getExternalCacheDir()) != null && externalCacheDir.canWrite()) {
                return this.f20746OooO00o != null ? new File(externalCacheDir, this.f20746OooO00o) : externalCacheDir;
            }
            return OooO0O0;
        }
    }

    public C7740o0ooo0oo(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C7740o0ooo0oo(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public C7740o0ooo0oo(Context context, String str, long j) {
        super(new OooO00o(context, str), j);
    }
}
