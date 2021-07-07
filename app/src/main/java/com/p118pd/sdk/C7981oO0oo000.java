package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0oo000  reason: case insensitive filesystem */
public class C7981oO0oo000 extends C7929oO0o0OoO<C7982oO0oo00O> {
    public C7981oO0oo000(@NotNull C7982oO0oo00O oo0oo00o) {
        super(oo0oo00o);
    }

    @Nullable
    private String OooO00o() {
        return OooO(C7982oO0oo00O.OooO0oo);
    }

    @Nullable
    private String OooO0O0() {
        return OooO0O0(800, "%d C");
    }

    @Nullable
    private String OooO0Oo() {
        return OooO(C7982oO0oo00O.OooO0oO);
    }

    @Nullable
    private String OooO0o() {
        return OooO00o(768, 1, "User Profile 1", "User Profile 2", "User Profile 3", "User Profile 0 (Dynamic)");
    }

    @Nullable
    private String OooO0o0() {
        return OooO00o(768, 1, "Fine", "Basic");
    }

    @Nullable
    private String OooO0oO() {
        return OooO00o(772, "Auto or Manual", "Daylight", "Fluorescent", "Tungsten", ExifInterface.f14327oo000o, "Cloudy", "Shadow");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 768) {
            return OooO0o0();
        }
        if (i == 770) {
            return OooO0o();
        }
        if (i == 772) {
            return OooO0oO();
        }
        if (i == 800) {
            return OooO0O0();
        }
        switch (i) {
            case 785:
                return OooO0OO();
            case C7982oO0oo00O.OooO0oO /*{ENCODED_INT: 786}*/:
                return OooO0Oo();
            case C7982oO0oo00O.OooO0oo /*{ENCODED_INT: 787}*/:
                return OooO00o();
            default:
                switch (i) {
                    case C7982oO0oo00O.OooOO0O /*{ENCODED_INT: 802}*/:
                    case C7982oO0oo00O.OooOO0o /*{ENCODED_INT: 803}*/:
                    case C7982oO0oo00O.OooOOO0 /*{ENCODED_INT: 804}*/:
                        return OooO(i);
                    default:
                        return super.OooO0OO(i);
                }
        }
    }

    @Nullable
    private String OooO0OO() {
        return OooO(785);
    }
}
