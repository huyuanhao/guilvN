package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zan();
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zale;
    public final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> zaqu;
    @SafeParcelable.Field(getter = "getSerializedDictionary", mo10865id = 2)
    public final ArrayList<zal> zaqv;
    @SafeParcelable.Field(getter = "getRootClassName", mo10865id = 3)
    public final String zaqw;

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) ArrayList<zal> arrayList, @SafeParcelable.Param(mo10868id = 3) String str) {
        this.zale = i;
        this.zaqv = null;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = arrayList.get(i2);
            String str2 = zal.className;
            HashMap hashMap2 = new HashMap();
            int size2 = zal.zaqx.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = zal.zaqx.get(i3);
                hashMap2.put(zam.zaqy, zam.zaqz);
            }
            hashMap.put(str2, hashMap2);
        }
        this.zaqu = hashMap;
        this.zaqw = (String) Preconditions.checkNotNull(str);
        zacr();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.zaqu.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.zaqu.get(str);
            for (String str2 : map.keySet()) {
                sb.append(GlideException.OooO00o.o0ooOoO);
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zale);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zaqu.keySet()) {
            arrayList.add(new zal(str, this.zaqu.get(str)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.zaqw, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zaa(Class<? extends FastJsonResponse> cls, Map<String, FastJsonResponse.Field<?, ?>> map) {
        this.zaqu.put(cls.getCanonicalName(), map);
    }

    public final void zacr() {
        for (String str : this.zaqu.keySet()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.zaqu.get(str);
            for (String str2 : map.keySet()) {
                map.get(str2).zaa(this);
            }
        }
    }

    public final void zacs() {
        for (String str : this.zaqu.keySet()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.zaqu.get(str);
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                hashMap.put(str2, map.get(str2).zacl());
            }
            this.zaqu.put(str, hashMap);
        }
    }

    public final String zact() {
        return this.zaqw;
    }

    public final Map<String, FastJsonResponse.Field<?, ?>> zai(String str) {
        return this.zaqu.get(str);
    }

    public final boolean zaa(Class<? extends FastJsonResponse> cls) {
        return this.zaqu.containsKey(cls.getCanonicalName());
    }

    public zak(Class<? extends FastJsonResponse> cls) {
        this.zale = 1;
        this.zaqv = null;
        this.zaqu = new HashMap<>();
        this.zaqw = cls.getCanonicalName();
    }
}
