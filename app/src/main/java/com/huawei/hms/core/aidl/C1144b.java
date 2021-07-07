package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.huawei.hms.core.aidl.b */
public class C1144b implements Parcelable {
    public static final Parcelable.Creator<C1144b> CREATOR = new C1145c();

    /* renamed from: a */
    public String f1179a;

    /* renamed from: b */
    public Bundle f1180b;

    /* renamed from: c */
    public int f1181c;

    /* renamed from: d */
    public Bundle f1182d;

    public /* synthetic */ C1144b(Parcel parcel, C1145c cVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static ClassLoader m1107a(Class cls) {
        return cls.getClassLoader();
    }

    /* renamed from: b */
    public int mo15435b() {
        return this.f1182d == null ? 0 : 1;
    }

    /* renamed from: c */
    public int mo15436c() {
        return this.f1181c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1181c);
        parcel.writeString(this.f1179a);
        parcel.writeBundle(this.f1180b);
        parcel.writeBundle(this.f1182d);
    }

    public C1144b(Parcel parcel) {
        this.f1180b = null;
        this.f1181c = 1;
        this.f1182d = null;
        m1108a(parcel);
    }

    /* renamed from: a */
    public C1144b mo15434a(Bundle bundle) {
        this.f1182d = bundle;
        return this;
    }

    /* renamed from: a */
    public Bundle mo15433a() {
        return this.f1182d;
    }

    /* renamed from: a */
    private void m1108a(Parcel parcel) {
        this.f1181c = parcel.readInt();
        this.f1179a = parcel.readString();
        this.f1180b = parcel.readBundle(m1107a(Bundle.class));
        this.f1182d = parcel.readBundle(m1107a(Bundle.class));
    }

    public C1144b() {
        this.f1180b = null;
        this.f1181c = 1;
        this.f1182d = null;
    }

    public C1144b(String str, int i) {
        this.f1180b = null;
        this.f1181c = 1;
        this.f1182d = null;
        this.f1179a = str;
        this.f1181c = i;
    }
}
