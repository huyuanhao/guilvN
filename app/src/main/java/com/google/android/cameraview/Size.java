package com.google.android.cameraview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.facebook.react.views.text.FontMetricsUtil;

public class Size implements Comparable<Size>, Parcelable {
    public static final Parcelable.Creator<Size> CREATOR = new Parcelable.Creator<Size>() {
        /* class com.google.android.cameraview.Size.C09461 */

        @Override // android.os.Parcelable.Creator
        public Size createFromParcel(Parcel parcel) {
            return new Size(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public Size[] newArray(int i) {
            return new Size[i];
        }
    };
    public final int mHeight;
    public final int mWidth;

    public Size(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    public static Size parse(String str) {
        int indexOf = str.indexOf(120);
        if (indexOf != -1) {
            try {
                return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Malformed size: " + str, e);
            }
        } else {
            throw new IllegalArgumentException("Malformed size: " + str);
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
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.mWidth == size.mWidth && this.mHeight == size.mHeight) {
            return true;
        }
        return false;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        int i = this.mHeight;
        int i2 = this.mWidth;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.mWidth + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + this.mHeight;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mHeight);
    }

    public int compareTo(@NonNull Size size) {
        return (this.mWidth * this.mHeight) - (size.mWidth * size.mHeight);
    }
}
