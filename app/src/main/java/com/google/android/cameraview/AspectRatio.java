package com.google.android.cameraview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.p118pd.sdk.C7010o000Ooo;
import com.xiaomi.mipush.sdk.Constants;

public class AspectRatio implements Comparable<AspectRatio>, Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new Parcelable.Creator<AspectRatio>() {
        /* class com.google.android.cameraview.AspectRatio.C09171 */

        @Override // android.os.Parcelable.Creator
        public AspectRatio createFromParcel(Parcel parcel) {
            return AspectRatio.m957of(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public AspectRatio[] newArray(int i) {
            return new AspectRatio[i];
        }
    };
    public static final C7010o000Ooo<C7010o000Ooo<AspectRatio>> sCache = new C7010o000Ooo<>(16);

    /* renamed from: mX */
    public final int f993mX;

    /* renamed from: mY */
    public final int f994mY;

    public AspectRatio(int i, int i2) {
        this.f993mX = i;
        this.f994mY = i2;
    }

    public static int gcd(int i, int i2) {
        while (true) {
            i = i2;
            if (i == 0) {
                return i;
            }
            i2 = i % i;
        }
    }

    /* renamed from: of */
    public static AspectRatio m957of(int i, int i2) {
        int gcd = gcd(i, i2);
        int i3 = i / gcd;
        int i4 = i2 / gcd;
        C7010o000Ooo<AspectRatio> OooO00o = sCache.m18264OooO00o(i3);
        if (OooO00o == null) {
            AspectRatio aspectRatio = new AspectRatio(i3, i4);
            C7010o000Ooo<AspectRatio> o000ooo = new C7010o000Ooo<>();
            o000ooo.OooO0O0(i4, aspectRatio);
            sCache.OooO0O0(i3, o000ooo);
            return aspectRatio;
        }
        AspectRatio OooO00o2 = OooO00o.m18264OooO00o(i4);
        if (OooO00o2 != null) {
            return OooO00o2;
        }
        AspectRatio aspectRatio2 = new AspectRatio(i3, i4);
        OooO00o.OooO0O0(i4, aspectRatio2);
        return aspectRatio2;
    }

    public static AspectRatio parse(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            try {
                return m957of(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Malformed aspect ratio: " + str, e);
            }
        } else {
            throw new IllegalArgumentException("Malformed aspect ratio: " + str);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AspectRatio)) {
            return false;
        }
        AspectRatio aspectRatio = (AspectRatio) obj;
        if (this.f993mX == aspectRatio.f993mX && this.f994mY == aspectRatio.f994mY) {
            return true;
        }
        return false;
    }

    public int getX() {
        return this.f993mX;
    }

    public int getY() {
        return this.f994mY;
    }

    public int hashCode() {
        int i = this.f994mY;
        int i2 = this.f993mX;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public AspectRatio inverse() {
        return m957of(this.f994mY, this.f993mX);
    }

    public boolean matches(Size size) {
        int gcd = gcd(size.getWidth(), size.getHeight());
        return this.f993mX == size.getWidth() / gcd && this.f994mY == size.getHeight() / gcd;
    }

    public float toFloat() {
        return ((float) this.f993mX) / ((float) this.f994mY);
    }

    public String toString() {
        return this.f993mX + Constants.COLON_SEPARATOR + this.f994mY;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f993mX);
        parcel.writeInt(this.f994mY);
    }

    public int compareTo(@NonNull AspectRatio aspectRatio) {
        if (equals(aspectRatio)) {
            return 0;
        }
        return toFloat() - aspectRatio.toFloat() > 0.0f ? 1 : -1;
    }
}
