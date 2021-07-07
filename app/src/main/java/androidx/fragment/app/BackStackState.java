package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.p118pd.sdk.C7163o00o0Oo;
import com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o;
import java.util.ArrayList;

public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new OooO00o();
    public final CharSequence OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<String> f14354OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f14355OooO00o;
    public final CharSequence OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final ArrayList<String> f14356OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final boolean f14357OooO0O0;
    public final int o00oO0O;
    public final int o0OOO0o;
    public final int o0ooOO0;
    public final int o0ooOOo;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public final String f14358o0ooOOo;
    public final int o0ooOoO;

    public static class OooO00o implements Parcelable.Creator<BackStackState> {
        /* renamed from: OooO00o */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: OooO00o */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(C7163o00o0Oo o00o0oo) {
        int size = o00o0oo.f19562OooO00o.size();
        this.f14355OooO00o = new int[(size * 6)];
        if (o00o0oo.f19563OooO00o) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C7163o00o0Oo.OooO00o oooO00o = o00o0oo.f19562OooO00o.get(i2);
                int[] iArr = this.f14355OooO00o;
                int i3 = i + 1;
                iArr[i] = oooO00o.OooO00o;
                int i4 = i3 + 1;
                Fragment fragment = oooO00o.f19569OooO00o;
                iArr[i3] = fragment != null ? fragment.mIndex : -1;
                int[] iArr2 = this.f14355OooO00o;
                int i5 = i4 + 1;
                iArr2[i4] = oooO00o.OooO0O0;
                int i6 = i5 + 1;
                iArr2[i5] = oooO00o.OooO0OO;
                int i7 = i6 + 1;
                iArr2[i6] = oooO00o.OooO0Oo;
                i = i7 + 1;
                iArr2[i7] = oooO00o.OooO0o0;
            }
            this.o00oO0O = o00o0oo.OooOO0o;
            this.o0ooOO0 = o00o0oo.OooOOO0;
            this.f14358o0ooOOo = o00o0oo.f19561OooO00o;
            this.o0ooOOo = o00o0oo.OooOOO;
            this.o0ooOoO = o00o0oo.OooOOOO;
            this.OooO00o = o00o0oo.f19560OooO00o;
            this.o0OOO0o = o00o0oo.OooOOOo;
            this.OooO0O0 = o00o0oo.f19564OooO0O0;
            this.f14354OooO00o = o00o0oo.f19565OooO0O0;
            this.f14356OooO0O0 = o00o0oo.OooO0OO;
            this.f14357OooO0O0 = o00o0oo.f19568OooO0Oo;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C7163o00o0Oo OooO00o(LayoutInflater$Factory2C7167o00o0o o00o0o) {
        C7163o00o0Oo o00o0oo = new C7163o00o0Oo(o00o0o);
        int i = 0;
        int i2 = 0;
        while (i < this.f14355OooO00o.length) {
            C7163o00o0Oo.OooO00o oooO00o = new C7163o00o0Oo.OooO00o();
            int i3 = i + 1;
            oooO00o.OooO00o = this.f14355OooO00o[i];
            if (LayoutInflater$Factory2C7167o00o0o.OooO0oo) {
                String str = "Instantiate " + o00o0oo + " op #" + i2 + " base fragment #" + this.f14355OooO00o[i3];
            }
            int i4 = i3 + 1;
            int i5 = this.f14355OooO00o[i3];
            if (i5 >= 0) {
                oooO00o.f19569OooO00o = o00o0o.f19577OooO00o.get(i5);
            } else {
                oooO00o.f19569OooO00o = null;
            }
            int[] iArr = this.f14355OooO00o;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            oooO00o.OooO0O0 = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            oooO00o.OooO0OO = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            oooO00o.OooO0Oo = i11;
            int i12 = iArr[i10];
            oooO00o.OooO0o0 = i12;
            o00o0oo.OooO0oo = i7;
            o00o0oo.OooO = i9;
            o00o0oo.OooOO0 = i11;
            o00o0oo.OooOO0O = i12;
            o00o0oo.m18604OooO00o(oooO00o);
            i2++;
            i = i10 + 1;
        }
        o00o0oo.OooOO0o = this.o00oO0O;
        o00o0oo.OooOOO0 = this.o0ooOO0;
        o00o0oo.f19561OooO00o = this.f14358o0ooOOo;
        o00o0oo.OooOOO = this.o0ooOOo;
        o00o0oo.f19563OooO00o = true;
        o00o0oo.OooOOOO = this.o0ooOoO;
        o00o0oo.f19560OooO00o = this.OooO00o;
        o00o0oo.OooOOOo = this.o0OOO0o;
        o00o0oo.f19564OooO0O0 = this.OooO0O0;
        o00o0oo.f19565OooO0O0 = this.f14354OooO00o;
        o00o0oo.OooO0OO = this.f14356OooO0O0;
        o00o0oo.f19568OooO0Oo = this.f14357OooO0O0;
        o00o0oo.m18603OooO00o(1);
        return o00o0oo;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f14355OooO00o);
        parcel.writeInt(this.o00oO0O);
        parcel.writeInt(this.o0ooOO0);
        parcel.writeString(this.f14358o0ooOOo);
        parcel.writeInt(this.o0ooOOo);
        parcel.writeInt(this.o0ooOoO);
        TextUtils.writeToParcel(this.OooO00o, parcel, 0);
        parcel.writeInt(this.o0OOO0o);
        TextUtils.writeToParcel(this.OooO0O0, parcel, 0);
        parcel.writeStringList(this.f14354OooO00o);
        parcel.writeStringList(this.f14356OooO0O0);
        parcel.writeInt(this.f14357OooO0O0 ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f14355OooO00o = parcel.createIntArray();
        this.o00oO0O = parcel.readInt();
        this.o0ooOO0 = parcel.readInt();
        this.f14358o0ooOOo = parcel.readString();
        this.o0ooOOo = parcel.readInt();
        this.o0ooOoO = parcel.readInt();
        this.OooO00o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.o0OOO0o = parcel.readInt();
        this.OooO0O0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14354OooO00o = parcel.createStringArrayList();
        this.f14356OooO0O0 = parcel.createStringArrayList();
        this.f14357OooO0O0 = parcel.readInt() != 0;
    }
}
