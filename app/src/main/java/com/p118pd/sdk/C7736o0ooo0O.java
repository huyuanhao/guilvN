package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC7734o0ooo00O;
import java.io.File;

/* renamed from: com.pd.sdk.o0ooo0O  reason: case insensitive filesystem */
public class C7736o0ooo0O implements AbstractC7734o0ooo00O.OooO00o {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f20737OooO00o;

    /* renamed from: com.pd.sdk.o0ooo0O$OooO00o */
    public class OooO00o implements OooO0OO {
        public final /* synthetic */ String OooO00o;

        public OooO00o(String str) {
            this.OooO00o = str;
        }

        @Override // com.p118pd.sdk.C7736o0ooo0O.OooO0OO
        public File OooO00o() {
            return new File(this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0ooo0O$OooO0O0 */
    public class OooO0O0 implements OooO0OO {
        public final /* synthetic */ String OooO00o;
        public final /* synthetic */ String OooO0O0;

        public OooO0O0(String str, String str2) {
            this.OooO00o = str;
            this.OooO0O0 = str2;
        }

        @Override // com.p118pd.sdk.C7736o0ooo0O.OooO0OO
        public File OooO00o() {
            return new File(this.OooO00o, this.OooO0O0);
        }
    }

    /* renamed from: com.pd.sdk.o0ooo0O$OooO0OO */
    public interface OooO0OO {
        File OooO00o();
    }

    public C7736o0ooo0O(String str, long j) {
        this(new OooO00o(str), j);
    }

    @Override // com.p118pd.sdk.AbstractC7734o0ooo00O.OooO00o
    public AbstractC7734o0ooo00O OooO00o() {
        File OooO00o2 = this.f20737OooO00o.OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.mkdirs() || (OooO00o2.exists() && OooO00o2.isDirectory())) {
            return C7739o0ooo0o0.OooO00o(OooO00o2, this.OooO00o);
        }
        return null;
    }

    public C7736o0ooo0O(String str, String str2, long j) {
        this(new OooO0O0(str, str2), j);
    }

    public C7736o0ooo0O(OooO0OO oooO0OO, long j) {
        this.OooO00o = j;
        this.f20737OooO00o = oooO0OO;
    }
}
