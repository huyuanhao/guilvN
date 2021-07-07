package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new OooO00o();
    public static final AbsSavedState OooO00o = new AbsSavedState() {
        /* class androidx.customview.view.AbsSavedState.C00531 */
    };

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Parcelable f14091OooO00o;

    @Nullable
    public final Parcelable OooO00o() {
        return this.f14091OooO00o;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f14091OooO00o, i);
    }

    public AbsSavedState() {
        this.f14091OooO00o = null;
    }

    public static class OooO00o implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        /* renamed from: OooO00o */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.OooO00o;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: OooO00o */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        /* renamed from: OooO00o */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    public AbsSavedState(@NonNull Parcelable parcelable) {
        if (parcelable != null) {
            this.f14091OooO00o = parcelable == OooO00o ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(@NonNull Parcel parcel) {
        this(parcel, null);
    }

    public AbsSavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f14091OooO00o = readParcelable == null ? OooO00o : readParcelable;
    }
}
