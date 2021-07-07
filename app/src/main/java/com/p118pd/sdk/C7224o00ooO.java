package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.media.AudioAttributesCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
/* renamed from: com.pd.sdk.o00ooO  reason: case insensitive filesystem */
public class C7224o00ooO implements AbstractC7228o00ooO0o {
    public static final String OooO00o = "AudioAttributesCompat21";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Method f19731OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19732OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AudioAttributes f19733OooO00o;

    public C7224o00ooO() {
        this.f19732OooO00o = -1;
    }

    public static Method OooO00o() {
        try {
            if (f19731OooO00o == null) {
                f19731OooO00o = AudioAttributes.class.getMethod("toLegacyStreamType", AudioAttributes.class);
            }
            return f19731OooO00o;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO0O0() {
        return this.f19733OooO00o.getContentType();
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO0OO() {
        return this.f19732OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO0Oo() {
        int i = this.f19732OooO00o;
        if (i != -1) {
            return i;
        }
        Method OooO00o2 = OooO00o();
        if (OooO00o2 == null) {
            String str = "No AudioAttributes#toLegacyStreamType() on API: " + Build.VERSION.SDK_INT;
            return -1;
        }
        try {
            return ((Integer) OooO00o2.invoke(null, this.f19733OooO00o)).intValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            String str2 = "getLegacyStreamType() failed on API: " + Build.VERSION.SDK_INT;
            return -1;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO0o() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f19733OooO00o.getVolumeControlStream();
        }
        return AudioAttributesCompat.OooO00o(true, m18716OooO00o(), OooO0o0());
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    public int OooO0o0() {
        return this.f19733OooO00o.getUsage();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7224o00ooO)) {
            return false;
        }
        return this.f19733OooO00o.equals(((C7224o00ooO) obj).f19733OooO00o);
    }

    public int hashCode() {
        return this.f19733OooO00o.hashCode();
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o
    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AudioAttributesCompat.f14412OooO0O0, this.f19733OooO00o);
        int i = this.f19732OooO00o;
        if (i != -1) {
            bundle.putInt(AudioAttributesCompat.f14415OooO0o, i);
        }
        return bundle;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f19733OooO00o;
    }

    public C7224o00ooO(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public C7224o00ooO(AudioAttributes audioAttributes, int i) {
        this.f19732OooO00o = -1;
        this.f19733OooO00o = audioAttributes;
        this.f19732OooO00o = i;
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o, com.p118pd.sdk.AbstractC7228o00ooO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m18717OooO00o() {
        return this.f19733OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7228o00ooO0o, com.p118pd.sdk.AbstractC7228o00ooO0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18716OooO00o() {
        return this.f19733OooO00o.getFlags();
    }

    public static AbstractC7228o00ooO0o OooO00o(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable(AudioAttributesCompat.f14412OooO0O0)) == null) {
            return null;
        }
        return new C7224o00ooO(audioAttributes, bundle.getInt(AudioAttributesCompat.f14415OooO0o, -1));
    }
}
