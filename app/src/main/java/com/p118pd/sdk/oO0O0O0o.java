package com.p118pd.sdk;

import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.oO0O0O0o */
public abstract class oO0O0O0o {
    public static final boolean OooO00o = false;

    @NonNull
    public static oO0O0O0o OooO00o() {
        return new OooO0OO();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m19529OooO00o();

    public abstract void OooO00o(boolean z);

    /* renamed from: com.pd.sdk.oO0O0O0o$OooO0O0 */
    public static class OooO0O0 extends oO0O0O0o {
        public volatile RuntimeException OooO00o;

        public OooO0O0() {
            super();
        }

        @Override // com.p118pd.sdk.oO0O0O0o
        public void OooO00o() {
            if (this.OooO00o != null) {
                throw new IllegalStateException("Already released", this.OooO00o);
            }
        }

        @Override // com.p118pd.sdk.oO0O0O0o
        public void OooO00o(boolean z) {
            if (z) {
                this.OooO00o = new RuntimeException("Released");
            } else {
                this.OooO00o = null;
            }
        }
    }

    /* renamed from: com.pd.sdk.oO0O0O0o$OooO0OO */
    public static class OooO0OO extends oO0O0O0o {
        public volatile boolean OooO0O0;

        public OooO0OO() {
            super();
        }

        @Override // com.p118pd.sdk.oO0O0O0o
        public void OooO00o() {
            if (this.OooO0O0) {
                throw new IllegalStateException("Already released");
            }
        }

        @Override // com.p118pd.sdk.oO0O0O0o
        public void OooO00o(boolean z) {
            this.OooO0O0 = z;
        }
    }

    public oO0O0O0o() {
    }
}
