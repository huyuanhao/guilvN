package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C8318oOo0oooo;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.xiaomi.mipush.sdk.Constants;

public enum zzfs {
    PLUS('+', "", Constants.ACCEPT_TIME_SEPARATOR_SP, false, true),
    HASH('#', "#", Constants.ACCEPT_TIME_SEPARATOR_SP, false, true),
    DOT('.', C9058ooOoOoOO.OooOO0, C9058ooOoOoOO.OooOO0, false, false),
    FORWARD_SLASH('/', C8932ooOOO0o.OooO0OO, C8932ooOOO0o.OooO0OO, false, false),
    SEMI_COLON(';', C7522o0Ooo0o.OooO0O0, C7522o0Ooo0o.OooO0O0, true, false),
    QUERY('?', C8932ooOOO0o.f22176OooO00o, "&", true, false),
    AMP(Character.valueOf(C8318oOo0oooo.OooO0OO), "&", "&", true, false),
    SIMPLE(null, "", Constants.ACCEPT_TIME_SEPARATOR_SP, false, false);
    
    public final Character zzvr;
    public final String zzvs;
    public final String zzvt;
    public final boolean zzvu;
    public final boolean zzvv;

    /* access modifiers changed from: public */
    zzfs(Character ch, String str, String str2, boolean z, boolean z2) {
        this.zzvr = ch;
        this.zzvs = (String) zzks.checkNotNull(str);
        this.zzvt = (String) zzks.checkNotNull(str2);
        this.zzvu = z;
        this.zzvv = z2;
        if (ch != null) {
            zzfr.zzvi.put(ch, this);
        }
    }

    public final String zzak(String str) {
        if (this.zzvv) {
            return zzie.zzas(str);
        }
        return zzie.zzaq(str);
    }

    public final String zzfr() {
        return this.zzvs;
    }

    public final String zzfs() {
        return this.zzvt;
    }

    public final boolean zzft() {
        return this.zzvu;
    }

    public final int zzfu() {
        return this.zzvr == null ? 0 : 1;
    }

    public final boolean zzfv() {
        return this.zzvv;
    }
}
