package com.p118pd.sdk;

import androidx.annotation.Nullable;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.oO000O0o  reason: case insensitive filesystem */
public abstract class AbstractC7778oO000O0o<Model> implements AbstractC7770oO00000o<Model, InputStream> {
    @Nullable
    public final C7769oO00000<Model, C7764o0ooooo0> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7770oO00000o<C7764o0ooooo0, InputStream> f20818OooO00o;

    public AbstractC7778oO000O0o(AbstractC7770oO00000o<C7764o0ooooo0, InputStream> oo00000o) {
        this(oo00000o, null);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.pd.sdk.ooo0Oo0] */
    /* JADX WARNING: Unknown variable types count: 3 */
    @Override // com.p118pd.sdk.AbstractC7770oO00000o
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p118pd.sdk.AbstractC7770oO00000o.OooO00o<java.io.InputStream> OooO00o(@androidx.annotation.NonNull Model r4, int r5, int r6, @androidx.annotation.NonNull com.p118pd.sdk.C7648o0oOoOo r7) {
        /*
            r3 = this;
            com.pd.sdk.oO00000<Model, com.pd.sdk.o0ooooo0> r0 = r3.OooO00o
            r1 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.OooO00o(r4, r5, r6)
            com.pd.sdk.o0ooooo0 r0 = (com.p118pd.sdk.C7764o0ooooo0) r0
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = r3.m19431OooO00o(r4, r5, r6, r7)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x001a
            return r1
        L_0x001a:
            com.pd.sdk.o0ooooo0 r1 = new com.pd.sdk.o0ooooo0
            com.pd.sdk.ooo0Oo0 r2 = r3.m19430OooO00o(r4, r5, r6, r7)
            r1.<init>(r0, r2)
            com.pd.sdk.oO00000<Model, com.pd.sdk.o0ooooo0> r0 = r3.OooO00o
            if (r0 == 0) goto L_0x002a
            r0.OooO00o(r4, r5, r6, r1)
        L_0x002a:
            r0 = r1
        L_0x002b:
            java.util.List r4 = r3.m19432OooO00o(r4, r5, r6, r7)
            com.pd.sdk.oO00000o<com.pd.sdk.o0ooooo0, java.io.InputStream> r1 = r3.f20818OooO00o
            com.pd.sdk.oO00000o$OooO00o r5 = r1.OooO00o(r0, r5, r6, r7)
            if (r5 == 0) goto L_0x004c
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x003e
            goto L_0x004c
        L_0x003e:
            com.pd.sdk.oO00000o$OooO00o r6 = new com.pd.sdk.oO00000o$OooO00o
            com.pd.sdk.o0oOoOO r7 = r5.OooO00o
            java.util.List r4 = OooO00o(r4)
            com.pd.sdk.o0oOooo0<Data> r5 = r5.f20801OooO00o
            r6.<init>(r7, r4, r5)
            return r6
        L_0x004c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractC7778oO000O0o.OooO00o(java.lang.Object, int, int, com.pd.sdk.o0oOoOo):com.pd.sdk.oO00000o$OooO00o");
    }

    /* Return type fixed from 'java.lang.String' to match base method */
    @Override // com.p118pd.sdk.AbstractC7770oO00000o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC7770oO00000o.OooO00o<InputStream> m19431OooO00o(Model model, int i, int i2, C7648o0oOoOo o0ooooo);

    public AbstractC7778oO000O0o(AbstractC7770oO00000o<C7764o0ooooo0, InputStream> oo00000o, @Nullable C7769oO00000<Model, C7764o0ooooo0> oo00000) {
        this.f20818OooO00o = oo00000o;
        this.OooO00o = oo00000;
    }

    public static List<AbstractC7644o0oOoOO> OooO00o(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            arrayList.add(new C7764o0ooooo0(str));
        }
        return arrayList;
    }

    /* Return type fixed from 'java.util.List<java.lang.String>' to match base method */
    @Override // com.p118pd.sdk.AbstractC7770oO00000o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7770oO00000o.OooO00o<InputStream> m19432OooO00o(Model model, int i, int i2, C7648o0oOoOo o0ooooo) {
        return Collections.emptyList();
    }

    /* Return type fixed from 'com.pd.sdk.ooo0Oo0' to match base method */
    @Override // com.p118pd.sdk.AbstractC7770oO00000o
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7770oO00000o.OooO00o<InputStream> m19430OooO00o(Model model, int i, int i2, C7648o0oOoOo o0ooooo) {
        return AbstractC9099ooo0Oo0.OooO0O0;
    }
}
