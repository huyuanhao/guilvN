package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.p118pd.sdk.AbstractC8215oOOoOO0o;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public class Entry extends AbstractC8215oOOoOO0o implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new OooO00o();
    public float OooO0o0 = 0.0f;

    public static class OooO00o implements Parcelable.Creator<Entry> {
        /* renamed from: OooO00o */
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        /* renamed from: OooO00o */
        public Entry[] newArray(int i) {
            return new Entry[i];
        }
    }

    public Entry() {
    }

    @Override // com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o, com.p118pd.sdk.AbstractC8215oOOoOO0o
    public Entry OooO00o() {
        return new Entry(this.OooO0o0, OooO00o(), m19899OooO00o());
    }

    public float OooO0O0() {
        return this.OooO0o0;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Entry, x: " + this.OooO0o0 + " y: " + OooO00o();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.OooO0o0);
        parcel.writeFloat(OooO00o());
        if (m19899OooO00o() == null) {
            parcel.writeInt(0);
        } else if (m19899OooO00o() instanceof Parcelable) {
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) m19899OooO00o(), i);
        } else {
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
    }

    public boolean OooO00o(Entry entry) {
        if (entry != null && entry.m19899OooO00o() == m19899OooO00o() && Math.abs(entry.OooO0o0 - this.OooO0o0) <= AbstractC8352oOoOOoO0.f21471OooO0O0 && Math.abs(entry.OooO00o() - OooO00o()) <= AbstractC8352oOoOOoO0.f21471OooO0O0) {
            return true;
        }
        return false;
    }

    public void OooO0O0(float f) {
        this.OooO0o0 = f;
    }

    public Entry(float f, float f2) {
        super(f2);
        this.OooO0o0 = f;
    }

    public Entry(float f, float f2, Object obj) {
        super(f2, obj);
        this.OooO0o0 = f;
    }

    public Entry(float f, float f2, Drawable drawable) {
        super(f2, drawable);
        this.OooO0o0 = f;
    }

    public Entry(float f, float f2, Drawable drawable, Object obj) {
        super(f2, drawable, obj);
        this.OooO0o0 = f;
    }

    public Entry(Parcel parcel) {
        this.OooO0o0 = parcel.readFloat();
        OooO00o(parcel.readFloat());
        if (parcel.readInt() == 1) {
            OooO00o(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
