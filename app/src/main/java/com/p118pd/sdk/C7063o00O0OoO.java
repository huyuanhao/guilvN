package com.p118pd.sdk;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: com.pd.sdk.o00O0OoO  reason: case insensitive filesystem */
public final class C7063o00O0OoO {

    /* renamed from: com.pd.sdk.o00O0OoO$OooO00o */
    public static class OooO00o<T> implements Parcelable.ClassLoaderCreator<T> {
        public final AbstractC7064o00O0Ooo<T> OooO00o;

        public OooO00o(AbstractC7064o00O0Ooo<T> o00o0ooo) {
            this.OooO00o = o00o0ooo;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.OooO00o.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.OooO00o.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.OooO00o.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> OooO00o(AbstractC7064o00O0Ooo<T> o00o0ooo) {
        return new OooO00o(o00o0ooo);
    }
}
