package com.qiyukf.unicorn.mediaselect.internal.p238a;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.p118pd.sdk.C8412oOoo0OoO;
import com.qiyukf.unicorn.C2364R;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.a.a */
public final class C2739a implements Parcelable {
    public static final Parcelable.Creator<C2739a> CREATOR = new Parcelable.Creator<C2739a>() {
        /* class com.qiyukf.unicorn.mediaselect.internal.p238a.C2739a.C27401 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        @Nullable
        public final /* synthetic */ C2739a createFromParcel(Parcel parcel) {
            return new C2739a(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C2739a[] newArray(int i) {
            return new C2739a[i];
        }
    };

    /* renamed from: a */
    public static final String f5658a = "-1";

    /* renamed from: b */
    public final String f5659b;

    /* renamed from: c */
    public final String f5660c;

    /* renamed from: d */
    public final String f5661d;

    /* renamed from: e */
    public long f5662e;

    public C2739a(Parcel parcel) {
        this.f5659b = parcel.readString();
        this.f5660c = parcel.readString();
        this.f5661d = parcel.readString();
        this.f5662e = parcel.readLong();
    }

    public C2739a(String str, String str2, String str3, long j) {
        this.f5659b = str;
        this.f5660c = str2;
        this.f5661d = str3;
        this.f5662e = j;
    }

    /* renamed from: a */
    public static C2739a m6328a(Cursor cursor) {
        return new C2739a(cursor.getString(cursor.getColumnIndex("bucket_id")), cursor.getString(cursor.getColumnIndex("_data")), cursor.getString(cursor.getColumnIndex("bucket_display_name")), cursor.getLong(cursor.getColumnIndex(C8412oOoo0OoO.OooO0O0)));
    }

    /* renamed from: a */
    public final String mo36501a() {
        return this.f5659b;
    }

    /* renamed from: a */
    public final String mo36502a(Context context) {
        return mo36507e() ? context.getString(C2364R.string.ysf_album_name_all) : this.f5661d;
    }

    /* renamed from: b */
    public final String mo36503b() {
        return this.f5660c;
    }

    /* renamed from: c */
    public final long mo36504c() {
        return this.f5662e;
    }

    /* renamed from: d */
    public final void mo36505d() {
        this.f5662e++;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo36507e() {
        return f5658a.equals(this.f5659b);
    }

    /* renamed from: f */
    public final boolean mo36508f() {
        return this.f5662e == 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5659b);
        parcel.writeString(this.f5660c);
        parcel.writeString(this.f5661d);
        parcel.writeLong(this.f5662e);
    }
}
