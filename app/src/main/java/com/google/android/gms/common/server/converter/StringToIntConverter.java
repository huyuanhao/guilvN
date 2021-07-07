package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

@SafeParcelable.Class(creator = "StringToIntConverterCreator")
@KeepForSdk
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zac();
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zale;
    public final HashMap<String, Integer> zapl;
    public final SparseArray<String> zapm;
    @SafeParcelable.Field(getter = "getSerializedMap", mo10865id = 2)
    public final ArrayList<zaa> zapn;

    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) ArrayList<zaa> arrayList) {
        this.zale = i;
        this.zapl = new HashMap<>();
        this.zapm = new SparseArray<>();
        this.zapn = null;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaa zaa2 = arrayList.get(i2);
            i2++;
            zaa zaa3 = zaa2;
            add(zaa3.zapo, zaa3.zapp);
        }
    }

    @KeepForSdk
    public final StringToIntConverter add(String str, int i) {
        this.zapl.put(str, Integer.valueOf(i));
        this.zapm.put(i, str);
        return this;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* synthetic */ Integer convert(String str) {
        Integer num = this.zapl.get(str);
        return num == null ? this.zapl.get("gms_unknown") : num;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* synthetic */ String convertBack(Integer num) {
        String str = this.zapm.get(num.intValue());
        return (str != null || !this.zapl.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zale);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zapl.keySet()) {
            arrayList.add(new zaa(str, this.zapl.get(str).intValue()));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zacj() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zack() {
        return 0;
    }

    @SafeParcelable.Class(creator = "StringToIntConverterEntryCreator")
    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new zad();
        @SafeParcelable.VersionField(mo10871id = 1)
        public final int versionCode;
        @SafeParcelable.Field(mo10865id = 2)
        public final String zapo;
        @SafeParcelable.Field(mo10865id = 3)
        public final int zapp;

        @SafeParcelable.Constructor
        public zaa(@SafeParcelable.Param(mo10868id = 1) int i, @SafeParcelable.Param(mo10868id = 2) String str, @SafeParcelable.Param(mo10868id = 3) int i2) {
            this.versionCode = i;
            this.zapo = str;
            this.zapp = i2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
            SafeParcelWriter.writeString(parcel, 2, this.zapo, false);
            SafeParcelWriter.writeInt(parcel, 3, this.zapp);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public zaa(String str, int i) {
            this.versionCode = 1;
            this.zapo = str;
            this.zapp = i;
        }
    }

    @KeepForSdk
    public StringToIntConverter() {
        this.zale = 1;
        this.zapl = new HashMap<>();
        this.zapm = new SparseArray<>();
        this.zapn = null;
    }
}
