package com.qiyukf.unicorn.mediaselect.internal.p238a;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import androidx.annotation.Nullable;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.a.d */
public final class C2743d implements Parcelable {
    public static final Parcelable.Creator<C2743d> CREATOR = new Parcelable.Creator<C2743d>() {
        /* class com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d.C27441 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        @Nullable
        public final /* synthetic */ C2743d createFromParcel(Parcel parcel) {
            return new C2743d(parcel, (byte) 0);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C2743d[] newArray(int i) {
            return new C2743d[i];
        }
    };

    /* renamed from: a */
    public final long f5669a;

    /* renamed from: b */
    public final String f5670b;

    /* renamed from: c */
    public final Uri f5671c;

    /* renamed from: d */
    public final long f5672d;

    /* renamed from: e */
    public final long f5673e;

    public C2743d(long j, String str, long j2, long j3) {
        this.f5669a = j;
        this.f5670b = str;
        this.f5671c = ContentUris.withAppendedId(EnumC2731b.m6306a(str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : EnumC2731b.m6308b(this.f5670b) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : Build.VERSION.SDK_INT >= 11 ? MediaStore.Files.getContentUri("external") : null, j);
        this.f5672d = j2;
        this.f5673e = j3;
    }

    public C2743d(Parcel parcel) {
        this.f5669a = parcel.readLong();
        this.f5670b = parcel.readString();
        this.f5671c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5672d = parcel.readLong();
        this.f5673e = parcel.readLong();
    }

    public /* synthetic */ C2743d(Parcel parcel, byte b) {
        this(parcel);
    }

    /* renamed from: a */
    public static C2743d m6337a() {
        return new C2743d(-1001, "EMPTY_TYPE_TAG", 0, 0);
    }

    /* renamed from: a */
    public static C2743d m6338a(Cursor cursor) {
        return new C2743d(cursor.getLong(cursor.getColumnIndex(C3848l.f10389g)), cursor.getString(cursor.getColumnIndex("mime_type")), cursor.getLong(cursor.getColumnIndex("_size")), cursor.getLong(cursor.getColumnIndex("duration")));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        Uri uri;
        if (!(obj instanceof C2743d)) {
            return false;
        }
        C2743d dVar = (C2743d) obj;
        return this.f5669a == dVar.f5669a && (((str = this.f5670b) != null && str.equals(dVar.f5670b)) || (this.f5670b == null && dVar.f5670b == null)) && ((((uri = this.f5671c) != null && uri.equals(dVar.f5671c)) || (this.f5671c == null && dVar.f5671c == null)) && this.f5672d == dVar.f5672d && this.f5673e == dVar.f5673e);
    }

    public final int hashCode() {
        int hashCode = Long.valueOf(this.f5669a).hashCode() + 31;
        String str = this.f5670b;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        return (((((hashCode * 31) + this.f5671c.hashCode()) * 31) + Long.valueOf(this.f5672d).hashCode()) * 31) + Long.valueOf(this.f5673e).hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5669a);
        parcel.writeString(this.f5670b);
        parcel.writeParcelable(this.f5671c, 0);
        parcel.writeLong(this.f5672d);
        parcel.writeLong(this.f5673e);
    }
}
