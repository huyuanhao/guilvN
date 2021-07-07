package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.p118pd.sdk.AbstractC7166o00o0Ooo;
import com.p118pd.sdk.AbstractC7174o00o0o0O;
import com.p118pd.sdk.C7177o00o0oO0;
import com.p118pd.sdk.C7219o00oo0OO;
import com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o;

public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new OooO00o();
    public final Bundle OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Fragment f14376OooO00o;
    public Bundle OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final boolean f14377OooO0O0;
    public final boolean OooO0OO;
    public final boolean OooO0Oo;
    public final boolean OooO0o0;
    public final int o00oO0O;
    public final int o0ooOO0;
    public final int o0ooOOo;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public final String f14378o0ooOOo;
    public final String o0ooOoO;

    public static class OooO00o implements Parcelable.Creator<FragmentState> {
        /* renamed from: OooO00o */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: OooO00o */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f14378o0ooOOo = fragment.getClass().getName();
        this.o00oO0O = fragment.mIndex;
        this.f14377OooO0O0 = fragment.mFromLayout;
        this.o0ooOO0 = fragment.mFragmentId;
        this.o0ooOOo = fragment.mContainerId;
        this.o0ooOoO = fragment.mTag;
        this.OooO0OO = fragment.mRetainInstance;
        this.OooO0Oo = fragment.mDetached;
        this.OooO00o = fragment.mArguments;
        this.OooO0o0 = fragment.mHidden;
    }

    public Fragment OooO00o(AbstractC7174o00o0o0O o00o0o0o, AbstractC7166o00o0Ooo o00o0ooo, Fragment fragment, C7177o00o0oO0 o00o0oo0, C7219o00oo0OO o00oo0oo) {
        if (this.f14376OooO00o == null) {
            Context OooO00o2 = o00o0o0o.m18653OooO00o();
            Bundle bundle = this.OooO00o;
            if (bundle != null) {
                bundle.setClassLoader(OooO00o2.getClassLoader());
            }
            if (o00o0ooo != null) {
                this.f14376OooO00o = o00o0ooo.OooO00o(OooO00o2, this.f14378o0ooOOo, this.OooO00o);
            } else {
                this.f14376OooO00o = Fragment.instantiate(OooO00o2, this.f14378o0ooOOo, this.OooO00o);
            }
            Bundle bundle2 = this.OooO0O0;
            if (bundle2 != null) {
                bundle2.setClassLoader(OooO00o2.getClassLoader());
                this.f14376OooO00o.mSavedFragmentState = this.OooO0O0;
            }
            this.f14376OooO00o.setIndex(this.o00oO0O, fragment);
            Fragment fragment2 = this.f14376OooO00o;
            fragment2.mFromLayout = this.f14377OooO0O0;
            fragment2.mRestored = true;
            fragment2.mFragmentId = this.o0ooOO0;
            fragment2.mContainerId = this.o0ooOOo;
            fragment2.mTag = this.o0ooOoO;
            fragment2.mRetainInstance = this.OooO0OO;
            fragment2.mDetached = this.OooO0Oo;
            fragment2.mHidden = this.OooO0o0;
            fragment2.mFragmentManager = o00o0o0o.f19617OooO00o;
            if (LayoutInflater$Factory2C7167o00o0o.OooO0oo) {
                String str = "Instantiated fragment " + this.f14376OooO00o;
            }
        }
        Fragment fragment3 = this.f14376OooO00o;
        fragment3.mChildNonConfig = o00o0oo0;
        fragment3.mViewModelStore = o00oo0oo;
        return fragment3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14378o0ooOOo);
        parcel.writeInt(this.o00oO0O);
        parcel.writeInt(this.f14377OooO0O0 ? 1 : 0);
        parcel.writeInt(this.o0ooOO0);
        parcel.writeInt(this.o0ooOOo);
        parcel.writeString(this.o0ooOoO);
        parcel.writeInt(this.OooO0OO ? 1 : 0);
        parcel.writeInt(this.OooO0Oo ? 1 : 0);
        parcel.writeBundle(this.OooO00o);
        parcel.writeInt(this.OooO0o0 ? 1 : 0);
        parcel.writeBundle(this.OooO0O0);
    }

    public FragmentState(Parcel parcel) {
        this.f14378o0ooOOo = parcel.readString();
        this.o00oO0O = parcel.readInt();
        boolean z = true;
        this.f14377OooO0O0 = parcel.readInt() != 0;
        this.o0ooOO0 = parcel.readInt();
        this.o0ooOOo = parcel.readInt();
        this.o0ooOoO = parcel.readString();
        this.OooO0OO = parcel.readInt() != 0;
        this.OooO0Oo = parcel.readInt() != 0;
        this.OooO00o = parcel.readBundle();
        this.OooO0o0 = parcel.readInt() == 0 ? false : z;
        this.OooO0O0 = parcel.readBundle();
    }
}
