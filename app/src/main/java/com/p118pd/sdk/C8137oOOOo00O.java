package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oOOOo00O  reason: case insensitive filesystem */
public class C8137oOOOo00O extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 65535;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f21149OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7416o0OOo000 f21150OooO00o;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f21149OooO00o = hashMap;
        hashMap.put(65535, "XMP Value Count");
    }

    public C8137oOOOo00O() {
        OooO00o(new C8135oOOOo00(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19793OooO00o() {
        return "XMP";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m19794OooO00o() {
        return f21149OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, String> m19795OooO00o() {
        HashMap hashMap = new HashMap();
        AbstractC7416o0OOo000 o0ooo000 = this.f21150OooO00o;
        if (o0ooo000 != null) {
            try {
                AbstractC7414o0OOOooo OooO00o2 = o0ooo000.OooO00o();
                while (OooO00o2.hasNext()) {
                    AbstractC7454o0Oo0O o0oo0o = (AbstractC7454o0Oo0O) OooO00o2.next();
                    String OooO00o3 = o0oo0o.m19081OooO00o();
                    String value = o0oo0o.getValue();
                    if (!(OooO00o3 == null || value == null)) {
                        hashMap.put(OooO00o3, value);
                    }
                }
            } catch (XMPException unused) {
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public void OooO00o(@NotNull AbstractC7416o0OOo000 o0ooo000) {
        this.f21150OooO00o = o0ooo000;
        int i = 0;
        try {
            AbstractC7414o0OOOooo OooO00o2 = o0ooo000.OooO00o();
            while (OooO00o2.hasNext()) {
                if (((AbstractC7454o0Oo0O) OooO00o2.next()).m19081OooO00o() != null) {
                    i++;
                }
            }
            OooO00o(65535, i);
        } catch (XMPException unused) {
        }
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public AbstractC7416o0OOo000 OooO00o() {
        if (this.f21150OooO00o == null) {
            this.f21150OooO00o = new C7433o0OOoOOO();
        }
        return this.f21150OooO00o;
    }
}
