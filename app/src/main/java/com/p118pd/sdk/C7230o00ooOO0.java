package com.p118pd.sdk;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.media.AudioAttributesCompat;
import java.util.Arrays;

/* renamed from: com.pd.sdk.o00ooOO0  reason: case insensitive filesystem */
public class C7230o00ooOO0 implements AbstractC7228o00ooO0o {
    public int OooO00o = 0;
    public int OooO0O0 = 0;
    public int OooO0OO = 0;
    public int OooO0Oo = -1;

    public C7230o00ooOO0() {
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o, com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO00o() {
        int i = this.OooO0OO;
        int OooO0Oo2 = OooO0Oo();
        if (OooO0Oo2 == 6) {
            i |= 4;
        } else if (OooO0Oo2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o, com.p118pd.sdk.AbstractC7228o00ooO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m18720OooO00o() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO0OO() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO0Oo() {
        int i = this.OooO0Oo;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.OooO00o(false, this.OooO0OO, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO0o() {
        return AudioAttributesCompat.OooO00o(true, this.OooO0OO, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO0o0() {
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7230o00ooOO0)) {
            return false;
        }
        C7230o00ooOO0 o00oooo0 = (C7230o00ooOO0) obj;
        if (this.OooO0O0 == o00oooo0.OooO0O0() && this.OooO0OO == o00oooo0.OooO00o() && this.OooO00o == o00oooo0.OooO0o0() && this.OooO0Oo == o00oooo0.OooO0Oo) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.OooO0O0), Integer.valueOf(this.OooO0OO), Integer.valueOf(this.OooO00o), Integer.valueOf(this.OooO0Oo)});
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AudioAttributesCompat.f14413OooO0OO, this.OooO00o);
        bundle.putInt(AudioAttributesCompat.f14414OooO0Oo, this.OooO0O0);
        bundle.putInt(AudioAttributesCompat.f14416OooO0o0, this.OooO0OO);
        int i = this.OooO0Oo;
        if (i != -1) {
            bundle.putInt(AudioAttributesCompat.f14415OooO0o, i);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.OooO0Oo != -1) {
            sb.append(" stream=");
            sb.append(this.OooO0Oo);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m14682OooO00o(this.OooO00o));
        sb.append(" content=");
        sb.append(this.OooO0O0);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.OooO0OO).toUpperCase());
        return sb.toString();
    }

    public static AbstractC7228o00ooO0o OooO00o(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new C7230o00ooOO0(bundle.getInt(AudioAttributesCompat.f14414OooO0Oo, 0), bundle.getInt(AudioAttributesCompat.f14416OooO0o0, 0), bundle.getInt(AudioAttributesCompat.f14413OooO0OO, 0), bundle.getInt(AudioAttributesCompat.f14415OooO0o, -1));
    }

    public C7230o00ooOO0(int i, int i2, int i3, int i4) {
        this.OooO0O0 = i;
        this.OooO0OO = i2;
        this.OooO00o = i3;
        this.OooO0Oo = i4;
    }
}
