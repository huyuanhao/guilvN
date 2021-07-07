package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import com.p118pd.sdk.C6971o0000oO0;
import com.p118pd.sdk.C7533o0OoooO0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    public static final C6971o0000oO0<String, FastJsonResponse.Field<?, ?>> zzbe;
    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", mo10865id = 2)
    public List<String> zzbf;
    @SafeParcelable.Field(getter = "getInProgressAccountTypes", mo10865id = 3)
    public List<String> zzbg;
    @SafeParcelable.Field(getter = "getSuccessAccountTypes", mo10865id = 4)
    public List<String> zzbh;
    @SafeParcelable.Field(getter = "getFailedAccountTypes", mo10865id = 5)
    public List<String> zzbi;
    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", mo10865id = 6)
    public List<String> zzbj;
    @SafeParcelable.VersionField(mo10871id = 1)
    public final int zzv;

    static {
        C6971o0000oO0<String, FastJsonResponse.Field<?, ?>> o0000oo0 = new C6971o0000oO0<>();
        zzbe = o0000oo0;
        o0000oo0.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        zzbe.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        zzbe.put("success", FastJsonResponse.Field.forStrings("success", 4));
        zzbe.put(C7533o0OoooO0.OooO0O0, FastJsonResponse.Field.forStrings(C7533o0OoooO0.OooO0O0, 5));
        zzbe.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzo() {
        this.zzv = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return zzbe;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zzv);
            case 2:
                return this.zzbf;
            case 3:
                return this.zzbg;
            case 4:
                return this.zzbh;
            case 5:
                return this.zzbi;
            case 6:
                return this.zzbj;
            default:
                int safeParcelableFieldId = field.getSafeParcelableFieldId();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(safeParcelableFieldId);
                throw new IllegalStateException(sb.toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbf = arrayList;
        } else if (safeParcelableFieldId == 3) {
            this.zzbg = arrayList;
        } else if (safeParcelableFieldId == 4) {
            this.zzbh = arrayList;
        } else if (safeParcelableFieldId == 5) {
            this.zzbi = arrayList;
        } else if (safeParcelableFieldId == 6) {
            this.zzbj = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(safeParcelableFieldId)));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzbf, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzbg, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzbh, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzbi, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzbj, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(mo10868id = 1) int i, @Nullable @SafeParcelable.Param(mo10868id = 2) List<String> list, @Nullable @SafeParcelable.Param(mo10868id = 3) List<String> list2, @Nullable @SafeParcelable.Param(mo10868id = 4) List<String> list3, @Nullable @SafeParcelable.Param(mo10868id = 5) List<String> list4, @Nullable @SafeParcelable.Param(mo10868id = 6) List<String> list5) {
        this.zzv = i;
        this.zzbf = list;
        this.zzbg = list2;
        this.zzbh = list3;
        this.zzbi = list4;
        this.zzbj = list5;
    }
}
