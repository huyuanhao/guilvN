package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new OooO00o();
    public int[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BackStackState[] f14374OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FragmentState[] f14375OooO00o;
    public int o00oO0O = -1;
    public int o0ooOO0;

    public static class OooO00o implements Parcelable.Creator<FragmentManagerState> {
        /* renamed from: OooO00o */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: OooO00o */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f14375OooO00o, i);
        parcel.writeIntArray(this.OooO00o);
        parcel.writeTypedArray(this.f14374OooO00o, i);
        parcel.writeInt(this.o00oO0O);
        parcel.writeInt(this.o0ooOO0);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f14375OooO00o = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.OooO00o = parcel.createIntArray();
        this.f14374OooO00o = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.o00oO0O = parcel.readInt();
        this.o0ooOO0 = parcel.readInt();
    }
}
