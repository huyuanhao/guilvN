package com.p118pd.sdk;

import java.io.File;
import java.util.List;

/* renamed from: com.pd.sdk.ooO0o0oo  reason: case insensitive filesystem */
public class C8868ooO0o0oo {

    /* renamed from: com.pd.sdk.ooO0o0oo$OooO00o */
    public static class OooO00o extends OooO0OO {
        public OooO00o() {
            super(null);
        }

        @Override // com.p118pd.sdk.C8868ooO0o0oo.OooO0OO
        public void OooO00o(File file) {
            this.OooO00o += file.length();
        }
    }

    /* renamed from: com.pd.sdk.ooO0o0oo$OooO0O0 */
    public static class OooO0O0 extends OooO0OO {
        public OooO0O0() {
            super(null);
        }

        @Override // com.p118pd.sdk.C8868ooO0o0oo.OooO0OO
        public void OooO00o(File file) {
            file.delete();
        }
    }

    /* renamed from: com.pd.sdk.ooO0o0oo$OooO0OO */
    public static abstract class OooO0OO {
        public long OooO00o;

        public OooO0OO() {
        }

        public long OooO00o() {
            return this.OooO00o;
        }

        public abstract void OooO00o(File file);

        public /* synthetic */ OooO0OO(OooO00o oooO00o) {
            this();
        }

        public void OooO00o(List<String> list) {
            OooO00o(list, 0, 0);
        }

        public void OooO00o(List<String> list, long j, long j2) {
            if (list != null && C8882ooO0oo0.OooO00o().m20532OooO00o()) {
                for (String str : list) {
                    File[] listFiles = new File(str).listFiles();
                    for (File file : listFiles) {
                        long lastModified = file.lastModified();
                        if ((j == 0 || lastModified >= j) && (j2 == 0 || lastModified <= j2)) {
                            OooO00o(file);
                        }
                    }
                }
            }
        }
    }

    public static long OooO00o(List<String> list, long j, long j2) {
        OooO00o oooO00o = new OooO00o();
        oooO00o.OooO00o(list, j, j2);
        return oooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20506OooO00o(List<String> list, long j, long j2) {
        new OooO0O0().OooO00o(list, j, j2);
    }
}
