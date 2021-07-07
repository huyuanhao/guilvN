package com.p118pd.sdk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import com.bumptech.glide.load.engine.GlideException;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.pd.sdk.o0O0OOoo  reason: case insensitive filesystem */
public class C7311o0O0OOoo extends VersionedParcel {
    public static final boolean OooO00o = false;
    public static final String OooO0OO = "VersionedParcelParcel";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Parcel f20034OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SparseIntArray f20035OooO00o;
    public final String OooO0O0;
    public final int OooOOO;
    public final int OooOOOO;
    public int OooOOOo;
    public int OooOOo0;

    public C7311o0O0OOoo(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    private int OooO00o(int i) {
        int readInt;
        do {
            int i2 = this.OooOOo0;
            if (i2 >= this.OooOOOO) {
                return -1;
            }
            this.f20034OooO00o.setDataPosition(i2);
            int readInt2 = this.f20034OooO00o.readInt();
            readInt = this.f20034OooO00o.readInt();
            this.OooOOo0 += readInt2;
        } while (readInt != i);
        return this.f20034OooO00o.dataPosition();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO0O0(int i) {
        this.f20034OooO00o.writeInt(i);
    }

    public C7311o0O0OOoo(Parcel parcel, int i, int i2, String str) {
        this.f20035OooO00o = new SparseIntArray();
        this.OooOOOo = -1;
        this.OooOOo0 = 0;
        this.f20034OooO00o = parcel;
        this.OooOOO = i;
        this.OooOOOO = i2;
        this.OooOOo0 = i;
        this.OooO0O0 = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    public boolean OooO0O0() {
        return this.f20034OooO00o.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18819OooO00o(int i) {
        int OooO00o2 = OooO00o(i);
        if (OooO00o2 == -1) {
            return false;
        }
        this.f20034OooO00o.setDataPosition(OooO00o2);
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18818OooO00o(int i) {
        m18817OooO00o();
        this.OooOOOo = i;
        this.f20035OooO00o.put(i, this.f20034OooO00o.dataPosition());
        OooO0O0(0);
        OooO0O0(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18817OooO00o() {
        int i = this.OooOOOo;
        if (i >= 0) {
            int i2 = this.f20035OooO00o.get(i);
            int dataPosition = this.f20034OooO00o.dataPosition();
            this.f20034OooO00o.setDataPosition(i2);
            this.f20034OooO00o.writeInt(dataPosition - i2);
            this.f20034OooO00o.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public VersionedParcel m18815OooO00o() {
        Parcel parcel = this.f20034OooO00o;
        int dataPosition = parcel.dataPosition();
        int i = this.OooOOo0;
        if (i == this.OooOOO) {
            i = this.OooOOOO;
        }
        return new C7311o0O0OOoo(parcel, dataPosition, i, this.OooO0O0 + GlideException.OooO00o.o0ooOoO);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(byte[] bArr) {
        if (bArr != null) {
            this.f20034OooO00o.writeInt(bArr.length);
            this.f20034OooO00o.writeByteArray(bArr);
            return;
        }
        this.f20034OooO00o.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.f20034OooO00o.writeInt(bArr.length);
            this.f20034OooO00o.writeByteArray(bArr, i, i2);
            return;
        }
        this.f20034OooO00o.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(long j) {
        this.f20034OooO00o.writeLong(j);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(float f) {
        this.f20034OooO00o.writeFloat(f);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(double d) {
        this.f20034OooO00o.writeDouble(d);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(String str) {
        this.f20034OooO00o.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(IBinder iBinder) {
        this.f20034OooO00o.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(Parcelable parcelable) {
        this.f20034OooO00o.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(boolean z) {
        this.f20034OooO00o.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(IInterface iInterface) {
        this.f20034OooO00o.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(Bundle bundle) {
        this.f20034OooO00o.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18810OooO00o() {
        return this.f20034OooO00o.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m18811OooO00o() {
        return this.f20034OooO00o.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m18809OooO00o() {
        return this.f20034OooO00o.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    public double OooO00o() {
        return this.f20034OooO00o.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18816OooO00o() {
        return this.f20034OooO00o.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public IBinder m18813OooO00o() {
        return this.f20034OooO00o.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m18820OooO00o() {
        int readInt = this.f20034OooO00o.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f20034OooO00o.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T extends Parcelable> T m18814OooO00o() {
        return (T) this.f20034OooO00o.readParcelable(C7311o0O0OOoo.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bundle m18812OooO00o() {
        return this.f20034OooO00o.readBundle(C7311o0O0OOoo.class.getClassLoader());
    }
}
