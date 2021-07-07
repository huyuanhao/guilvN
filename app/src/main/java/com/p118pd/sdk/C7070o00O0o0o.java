package com.p118pd.sdk;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: com.pd.sdk.o00O0o0o  reason: case insensitive filesystem */
public final class C7070o00O0o0o {
    public static final char OooO00o = 8234;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C7070o00O0o0o f19353OooO00o = new C7070o00O0o0o(false, 2, f19357OooO0O0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19354OooO00o = Character.toString(OooO0Oo);
    public static final char OooO0O0 = 8235;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int f19355OooO0O0 = 2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final C7070o00O0o0o f19356OooO0O0 = new C7070o00O0o0o(true, 2, f19357OooO0O0);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final AbstractC7073o00O0oOo f19357OooO0O0 = C7075o00O0oo0.f19388OooO0OO;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f19358OooO0O0 = Character.toString(OooO0o0);
    public static final char OooO0OO = 8236;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int f19359OooO0OO = 2;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f19360OooO0OO = "";
    public static final char OooO0Oo = 8206;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final int f19361OooO0Oo = -1;
    public static final int OooO0o = 1;
    public static final char OooO0o0 = 8207;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final int f19362OooO0o0 = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f19363OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7073o00O0oOo f19364OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f19365OooO00o;

    public C7070o00O0o0o(boolean z, int i, AbstractC7073o00O0oOo o00o0ooo) {
        this.f19365OooO00o = z;
        this.f19363OooO00o = i;
        this.f19364OooO00o = o00o0ooo;
    }

    public static C7070o00O0o0o OooO00o() {
        return new OooO00o().OooO00o();
    }

    public boolean OooO0O0() {
        return this.f19365OooO00o;
    }

    /* renamed from: com.pd.sdk.o00O0o0o$OooO00o */
    public static final class OooO00o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7073o00O0oOo f19366OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19367OooO00o;

        public OooO00o() {
            m18355OooO00o(C7070o00O0o0o.m18349OooO00o(Locale.getDefault()));
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private void m18355OooO00o(boolean z) {
            this.f19367OooO00o = z;
            this.f19366OooO00o = C7070o00O0o0o.f19357OooO0O0;
            this.OooO00o = 2;
        }

        public OooO00o(boolean z) {
            m18355OooO00o(z);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO00o m18356OooO00o(boolean z) {
            if (z) {
                this.OooO00o |= 2;
            } else {
                this.OooO00o &= -3;
            }
            return this;
        }

        public OooO00o(Locale locale) {
            m18355OooO00o(C7070o00O0o0o.m18349OooO00o(locale));
        }

        public OooO00o OooO00o(AbstractC7073o00O0oOo o00o0ooo) {
            this.f19366OooO00o = o00o0ooo;
            return this;
        }

        public static C7070o00O0o0o OooO00o(boolean z) {
            return z ? C7070o00O0o0o.f19356OooO0O0 : C7070o00O0o0o.f19353OooO00o;
        }

        public C7070o00O0o0o OooO00o() {
            if (this.OooO00o == 2 && this.f19366OooO00o == C7070o00O0o0o.f19357OooO0O0) {
                return OooO00o(this.f19367OooO00o);
            }
            return new C7070o00O0o0o(this.f19367OooO00o, this.OooO00o, this.f19366OooO00o);
        }
    }

    public static C7070o00O0o0o OooO00o(boolean z) {
        return new OooO00o(z).OooO00o();
    }

    private String OooO0O0(CharSequence charSequence, AbstractC7073o00O0oOo o00o0ooo) {
        boolean OooO00o2 = o00o0ooo.OooO00o(charSequence, 0, charSequence.length());
        if (!this.f19365OooO00o && (OooO00o2 || OooO00o(charSequence) == 1)) {
            return f19354OooO00o;
        }
        if (this.f19365OooO00o) {
            return (!OooO00o2 || OooO00o(charSequence) == -1) ? f19358OooO0O0 : "";
        }
        return "";
    }

    /* renamed from: com.pd.sdk.o00O0o0o$OooO0O0 */
    public static class OooO0O0 {
        public static final byte[] OooO00o = new byte[1792];
        public static final int OooO0OO = 1792;

        /* renamed from: OooO00o  reason: collision with other field name */
        public char f19368OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final int f19369OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final CharSequence f19370OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f19371OooO00o;
        public int OooO0O0;

        static {
            for (int i = 0; i < 1792; i++) {
                OooO00o[i] = Character.getDirectionality(i);
            }
        }

        public OooO0O0(CharSequence charSequence, boolean z) {
            this.f19370OooO00o = charSequence;
            this.f19371OooO00o = z;
            this.f19369OooO00o = charSequence.length();
        }

        private byte OooO0OO() {
            char charAt;
            int i = this.OooO0O0;
            do {
                int i2 = this.OooO0O0;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f19370OooO00o;
                int i3 = i2 - 1;
                this.OooO0O0 = i3;
                charAt = charSequence.charAt(i3);
                this.f19368OooO00o = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.OooO0O0 = i;
            this.f19368OooO00o = ';';
            return 13;
        }

        private byte OooO0Oo() {
            char charAt;
            do {
                int i = this.OooO0O0;
                if (i >= this.f19369OooO00o) {
                    return 12;
                }
                CharSequence charSequence = this.f19370OooO00o;
                this.OooO0O0 = i + 1;
                charAt = charSequence.charAt(i);
                this.f19368OooO00o = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte OooO0o() {
            char charAt;
            int i = this.OooO0O0;
            while (true) {
                int i2 = this.OooO0O0;
                if (i2 < this.f19369OooO00o) {
                    CharSequence charSequence = this.f19370OooO00o;
                    this.OooO0O0 = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f19368OooO00o = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        char c = this.f19368OooO00o;
                        do {
                            int i3 = this.OooO0O0;
                            if (i3 >= this.f19369OooO00o) {
                                break;
                            }
                            CharSequence charSequence2 = this.f19370OooO00o;
                            this.OooO0O0 = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f19368OooO00o = charAt;
                        } while (charAt != c);
                    }
                } else {
                    this.OooO0O0 = i;
                    this.f19368OooO00o = C8318oOo0oooo.OooO0Oo;
                    return 13;
                }
            }
        }

        private byte OooO0o0() {
            char charAt;
            int i = this.OooO0O0;
            while (true) {
                int i2 = this.OooO0O0;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f19370OooO00o;
                int i3 = i2 - 1;
                this.OooO0O0 = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f19368OooO00o = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char c = this.f19368OooO00o;
                    do {
                        int i4 = this.OooO0O0;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f19370OooO00o;
                        int i5 = i4 - 1;
                        this.OooO0O0 = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f19368OooO00o = charAt;
                    } while (charAt != c);
                }
            }
            this.OooO0O0 = i;
            this.f19368OooO00o = C8318oOo0oooo.OooO0o0;
            return 13;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public int m18357OooO00o() {
            this.OooO0O0 = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.OooO0O0 < this.f19369OooO00o && i == 0) {
                byte OooO0O02 = OooO0O0();
                if (OooO0O02 != 0) {
                    if (OooO0O02 == 1 || OooO0O02 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (OooO0O02 != 9) {
                        switch (OooO0O02) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.OooO0O0 > 0) {
                switch (OooO00o()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public int m18358OooO0O0() {
            this.OooO0O0 = this.f19369OooO00o;
            int i = 0;
            int i2 = 0;
            while (this.OooO0O0 > 0) {
                byte OooO00o2 = OooO00o();
                if (OooO00o2 != 0) {
                    if (OooO00o2 == 1 || OooO00o2 == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 != 0) {
                        }
                    } else if (OooO00o2 != 9) {
                        switch (OooO00o2) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 != 0) {
                    }
                }
                i2 = i;
            }
            return 0;
        }

        public byte OooO0O0() {
            char charAt = this.f19370OooO00o.charAt(this.OooO0O0);
            this.f19368OooO00o = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f19370OooO00o, this.OooO0O0);
                this.OooO0O0 += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.OooO0O0++;
            byte OooO00o2 = OooO00o(this.f19368OooO00o);
            if (!this.f19371OooO00o) {
                return OooO00o2;
            }
            char c = this.f19368OooO00o;
            if (c == '<') {
                return OooO0o();
            }
            return c == '&' ? OooO0Oo() : OooO00o2;
        }

        public static byte OooO00o(char c) {
            return c < 1792 ? OooO00o[c] : Character.getDirectionality(c);
        }

        public byte OooO00o() {
            char charAt = this.f19370OooO00o.charAt(this.OooO0O0 - 1);
            this.f19368OooO00o = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f19370OooO00o, this.OooO0O0);
                this.OooO0O0 -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.OooO0O0--;
            byte OooO00o2 = OooO00o(this.f19368OooO00o);
            if (!this.f19371OooO00o) {
                return OooO00o2;
            }
            char c = this.f19368OooO00o;
            if (c == '>') {
                return OooO0o0();
            }
            return c == ';' ? OooO0OO() : OooO00o2;
        }
    }

    public static C7070o00O0o0o OooO00o(Locale locale) {
        return new OooO00o(locale).OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18352OooO00o() {
        return (this.f19363OooO00o & 2) != 0;
    }

    private String OooO00o(CharSequence charSequence, AbstractC7073o00O0oOo o00o0ooo) {
        boolean OooO00o2 = o00o0ooo.OooO00o(charSequence, 0, charSequence.length());
        if (!this.f19365OooO00o && (OooO00o2 || OooO0O0(charSequence) == 1)) {
            return f19354OooO00o;
        }
        if (this.f19365OooO00o) {
            return (!OooO00o2 || OooO0O0(charSequence) == -1) ? f19358OooO0O0 : "";
        }
        return "";
    }

    public static int OooO0O0(CharSequence charSequence) {
        return new OooO0O0(charSequence, false).m18358OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18354OooO00o(String str) {
        return m18353OooO00o((CharSequence) str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18353OooO00o(CharSequence charSequence) {
        return this.f19364OooO00o.OooO00o(charSequence, 0, charSequence.length());
    }

    public String OooO00o(String str, AbstractC7073o00O0oOo o00o0ooo, boolean z) {
        if (str == null) {
            return null;
        }
        return OooO00o((CharSequence) str, o00o0ooo, z).toString();
    }

    public CharSequence OooO00o(CharSequence charSequence, AbstractC7073o00O0oOo o00o0ooo, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean OooO00o2 = o00o0ooo.OooO00o(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m18352OooO00o() && z) {
            spannableStringBuilder.append((CharSequence) OooO0O0(charSequence, OooO00o2 ? C7075o00O0oo0.f19387OooO0O0 : C7075o00O0oo0.f19386OooO00o));
        }
        if (OooO00o2 != this.f19365OooO00o) {
            spannableStringBuilder.append(OooO00o2 ? OooO0O0 : OooO00o);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(OooO0OO);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) OooO00o(charSequence, OooO00o2 ? C7075o00O0oo0.f19387OooO0O0 : C7075o00O0oo0.f19386OooO00o));
        }
        return spannableStringBuilder;
    }

    public String OooO00o(String str, AbstractC7073o00O0oOo o00o0ooo) {
        return OooO00o(str, o00o0ooo, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18351OooO00o(CharSequence charSequence, AbstractC7073o00O0oOo o00o0ooo) {
        return OooO00o(charSequence, o00o0ooo, true);
    }

    public String OooO00o(String str, boolean z) {
        return OooO00o(str, this.f19364OooO00o, z);
    }

    public CharSequence OooO00o(CharSequence charSequence, boolean z) {
        return OooO00o(charSequence, this.f19364OooO00o, z);
    }

    public String OooO00o(String str) {
        return OooO00o(str, this.f19364OooO00o, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18350OooO00o(CharSequence charSequence) {
        return OooO00o(charSequence, this.f19364OooO00o, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18349OooO00o(Locale locale) {
        return C7074o00O0oo.OooO0O0(locale) == 1;
    }

    public static int OooO00o(CharSequence charSequence) {
        return new OooO0O0(charSequence, false).m18357OooO00o();
    }
}
