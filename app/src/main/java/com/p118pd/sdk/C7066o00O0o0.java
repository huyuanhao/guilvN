package com.p118pd.sdk;

import android.util.Base64;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

/* renamed from: com.pd.sdk.o00O0o0  reason: case insensitive filesystem */
public final class C7066o00O0o0 {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f19337OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<List<byte[]>> f19338OooO00o;
    public final String OooO0O0;
    public final String OooO0OO;
    public final String OooO0Oo;

    public C7066o00O0o0(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.f19337OooO00o = (String) C7086o00OO0OO.OooO00o((Object) str);
        this.OooO0O0 = (String) C7086o00OO0OO.OooO00o((Object) str2);
        this.OooO0OO = (String) C7086o00OO0OO.OooO00o((Object) str3);
        this.f19338OooO00o = (List) C7086o00OO0OO.OooO00o(list);
        this.OooO00o = 0;
        this.OooO0Oo = this.f19337OooO00o + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.OooO0O0 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.OooO0OO;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<List<byte[]>> m18346OooO00o() {
        return this.f19338OooO00o;
    }

    @NonNull
    public String OooO0O0() {
        return this.f19337OooO00o;
    }

    @NonNull
    public String OooO0OO() {
        return this.OooO0O0;
    }

    @NonNull
    public String OooO0Oo() {
        return this.OooO0OO;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f19337OooO00o + ", mProviderPackage: " + this.OooO0O0 + ", mQuery: " + this.OooO0OO + ", mCertificates:");
        for (int i = 0; i < this.f19338OooO00o.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f19338OooO00o.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append(C7522o0Ooo0o.OooO0Oo);
        sb.append("mCertificatesArray: " + this.OooO00o);
        return sb.toString();
    }

    @ArrayRes
    public int OooO00o() {
        return this.OooO00o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18345OooO00o() {
        return this.OooO0Oo;
    }

    public C7066o00O0o0(@NonNull String str, @NonNull String str2, @NonNull String str3, @ArrayRes int i) {
        this.f19337OooO00o = (String) C7086o00OO0OO.OooO00o((Object) str);
        this.OooO0O0 = (String) C7086o00OO0OO.OooO00o((Object) str2);
        this.OooO0OO = (String) C7086o00OO0OO.OooO00o((Object) str3);
        this.f19338OooO00o = null;
        C7086o00OO0OO.OooO00o(i != 0);
        this.OooO00o = i;
        this.OooO0Oo = this.f19337OooO00o + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.OooO0O0 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.OooO0OO;
    }
}
