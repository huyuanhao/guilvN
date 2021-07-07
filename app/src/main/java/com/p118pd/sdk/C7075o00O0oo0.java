package com.p118pd.sdk;

import java.nio.CharBuffer;
import java.util.Locale;

/* renamed from: com.pd.sdk.o00O0oo0  reason: case insensitive filesystem */
public final class C7075o00O0oo0 {
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AbstractC7073o00O0oOo f19386OooO00o = new C7077OooO0o0(null, false);
    public static final int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final AbstractC7073o00O0oOo f19387OooO0O0 = new C7077OooO0o0(null, true);
    public static final int OooO0OO = 2;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final AbstractC7073o00O0oOo f19388OooO0OO = new C7077OooO0o0(OooO0O0.OooO00o, false);
    public static final AbstractC7073o00O0oOo OooO0Oo = new C7077OooO0o0(OooO0O0.OooO00o, true);
    public static final AbstractC7073o00O0oOo OooO0o = OooO0o.OooO00o;
    public static final AbstractC7073o00O0oOo OooO0o0 = new C7077OooO0o0(OooO00o.OooO00o, false);

    /* renamed from: com.pd.sdk.o00O0oo0$OooO00o */
    public static class OooO00o implements OooO0OO {
        public static final OooO00o OooO00o = new OooO00o(true);
        public static final OooO00o OooO0O0 = new OooO00o(false);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f19389OooO00o;

        public OooO00o(boolean z) {
            this.f19389OooO00o = z;
        }

        @Override // com.p118pd.sdk.C7075o00O0oo0.OooO0OO
        public int OooO00o(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int OooO00o2 = C7075o00O0oo0.OooO00o(Character.getDirectionality(charSequence.charAt(i)));
                if (OooO00o2 != 0) {
                    if (OooO00o2 != 1) {
                        continue;
                        i++;
                    } else if (!this.f19389OooO00o) {
                        return 1;
                    }
                } else if (this.f19389OooO00o) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f19389OooO00o ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: com.pd.sdk.o00O0oo0$OooO0O0 */
    public static class OooO0O0 implements OooO0OO {
        public static final OooO0O0 OooO00o = new OooO0O0();

        @Override // com.p118pd.sdk.C7075o00O0oo0.OooO0OO
        public int OooO00o(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C7075o00O0oo0.OooO0O0(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: com.pd.sdk.o00O0oo0$OooO0OO */
    public interface OooO0OO {
        int OooO00o(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: com.pd.sdk.o00O0oo0$OooO0Oo  reason: case insensitive filesystem */
    public static abstract class AbstractC7076OooO0Oo implements AbstractC7073o00O0oOo {
        public final OooO0OO OooO00o;

        public AbstractC7076OooO0Oo(OooO0OO oooO0OO) {
            this.OooO00o = oooO0OO;
        }

        private boolean OooO0O0(CharSequence charSequence, int i, int i2) {
            int OooO00o2 = this.OooO00o.OooO00o(charSequence, i, i2);
            if (OooO00o2 == 0) {
                return true;
            }
            if (OooO00o2 != 1) {
                return OooO00o();
            }
            return false;
        }

        public abstract boolean OooO00o();

        @Override // com.p118pd.sdk.AbstractC7073o00O0oOo
        public boolean OooO00o(char[] cArr, int i, int i2) {
            return OooO00o(CharBuffer.wrap(cArr), i, i2);
        }

        @Override // com.p118pd.sdk.AbstractC7073o00O0oOo
        public boolean OooO00o(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.OooO00o == null) {
                return OooO00o();
            } else {
                return OooO0O0(charSequence, i, i2);
            }
        }
    }

    /* renamed from: com.pd.sdk.o00O0oo0$OooO0o */
    public static class OooO0o extends AbstractC7076OooO0Oo {
        public static final OooO0o OooO00o = new OooO0o();

        public OooO0o() {
            super(null);
        }

        @Override // com.p118pd.sdk.C7075o00O0oo0.AbstractC7076OooO0Oo
        public boolean OooO00o() {
            return C7074o00O0oo.OooO0O0(Locale.getDefault()) == 1;
        }
    }

    /* renamed from: com.pd.sdk.o00O0oo0$OooO0o0  reason: case insensitive filesystem */
    public static class C7077OooO0o0 extends AbstractC7076OooO0Oo {
        public final boolean OooO00o;

        public C7077OooO0o0(OooO0OO oooO0OO, boolean z) {
            super(oooO0OO);
            this.OooO00o = z;
        }

        @Override // com.p118pd.sdk.C7075o00O0oo0.AbstractC7076OooO0Oo
        public boolean OooO00o() {
            return this.OooO00o;
        }
    }

    public static int OooO00o(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int OooO0O0(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
