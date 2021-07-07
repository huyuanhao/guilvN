package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC7313o0O0Oo0;
import com.p118pd.sdk.C7311o0O0OOoo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new OooO00o();
    public final AbstractC7313o0O0Oo0 OooO00o;

    public static class OooO00o implements Parcelable.Creator<ParcelImpl> {
        /* renamed from: OooO00o */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: OooO00o */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(AbstractC7313o0O0Oo0 o0o0oo0) {
        this.OooO00o = o0o0oo0;
    }

    public <T extends AbstractC7313o0O0Oo0> T OooO00o() {
        return (T) this.OooO00o;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C7311o0O0OOoo(parcel).m14934OooO00o(this.OooO00o);
    }

    public ParcelImpl(Parcel parcel) {
        this.OooO00o = new C7311o0O0OOoo(parcel).m14919OooO00o();
    }
}
