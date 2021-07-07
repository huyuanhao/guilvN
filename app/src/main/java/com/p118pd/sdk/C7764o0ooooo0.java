package com.p118pd.sdk;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.pd.sdk.o0ooooo0  reason: case insensitive filesystem */
public class C7764o0ooooo0 implements AbstractC7644o0oOoOO {
    public static final String OooO0Oo = "@#&=*+-_.,:!?()/~'%;$";
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9099ooo0Oo0 f20787OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final URL f20788OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile byte[] f20789OooO00o;
    @Nullable
    public final String OooO0O0;
    @Nullable

    /* renamed from: OooO0O0  reason: collision with other field name */
    public URL f20790OooO0O0;
    @Nullable
    public String OooO0OO;

    public C7764o0ooooo0(URL url) {
        this(url, AbstractC9099ooo0Oo0.OooO0O0);
    }

    private URL OooO0O0() throws MalformedURLException {
        if (this.f20790OooO0O0 == null) {
            this.f20790OooO0O0 = new URL(OooO0OO());
        }
        return this.f20790OooO0O0;
    }

    private String OooO0OO() {
        if (TextUtils.isEmpty(this.OooO0OO)) {
            String str = this.OooO0O0;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C7842oO0O0.OooO00o(this.f20788OooO00o)).toString();
            }
            this.OooO0OO = Uri.encode(str, OooO0Oo);
        }
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public URL m19409OooO00o() throws MalformedURLException {
        return OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (!(obj instanceof C7764o0ooooo0)) {
            return false;
        }
        C7764o0ooooo0 o0ooooo0 = (C7764o0ooooo0) obj;
        if (!m19408OooO00o().equals(o0ooooo0.m19408OooO00o()) || !this.f20787OooO00o.equals(o0ooooo0.f20787OooO00o)) {
            return false;
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        if (this.OooO00o == 0) {
            int hashCode = m19408OooO00o().hashCode();
            this.OooO00o = hashCode;
            this.OooO00o = (hashCode * 31) + this.f20787OooO00o.hashCode();
        }
        return this.OooO00o;
    }

    public String toString() {
        return m19408OooO00o();
    }

    public C7764o0ooooo0(String str) {
        this(str, AbstractC9099ooo0Oo0.OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, String> m19410OooO00o() {
        return this.f20787OooO00o.OooO00o();
    }

    public C7764o0ooooo0(URL url, AbstractC9099ooo0Oo0 ooo0oo0) {
        this.f20788OooO00o = (URL) C7842oO0O0.OooO00o(url);
        this.OooO0O0 = null;
        this.f20787OooO00o = (AbstractC9099ooo0Oo0) C7842oO0O0.OooO00o(ooo0oo0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19408OooO00o() {
        String str = this.OooO0O0;
        return str != null ? str : ((URL) C7842oO0O0.OooO00o(this.f20788OooO00o)).toString();
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(OooO00o());
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m19411OooO0O0() {
        return OooO0OO();
    }

    private byte[] OooO00o() {
        if (this.f20789OooO00o == null) {
            this.f20789OooO00o = m19408OooO00o().getBytes(AbstractC7644o0oOoOO.f20533OooO00o);
        }
        return this.f20789OooO00o;
    }

    public C7764o0ooooo0(String str, AbstractC9099ooo0Oo0 ooo0oo0) {
        this.f20788OooO00o = null;
        this.OooO0O0 = C7842oO0O0.OooO00o(str);
        this.f20787OooO00o = (AbstractC9099ooo0Oo0) C7842oO0O0.OooO00o(ooo0oo0);
    }
}
