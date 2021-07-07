package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f14009OooO00o = versionedParcel.OooO00o(iconCompat.f14009OooO00o, 1);
        iconCompat.f14015OooO00o = versionedParcel.m14944OooO00o(iconCompat.f14015OooO00o, 2);
        iconCompat.f14012OooO00o = versionedParcel.OooO00o(iconCompat.f14012OooO00o, 3);
        iconCompat.f14016OooO0O0 = versionedParcel.OooO00o(iconCompat.f14016OooO0O0, 4);
        iconCompat.f14017OooO0OO = versionedParcel.OooO00o(iconCompat.f14017OooO0OO, 5);
        iconCompat.f14010OooO00o = (ColorStateList) versionedParcel.OooO00o((Parcelable) iconCompat.f14010OooO00o, 6);
        iconCompat.f14014OooO00o = versionedParcel.OooO00o(iconCompat.f14014OooO00o, 7);
        iconCompat.m14556OooO00o();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.OooO00o(true, true);
        iconCompat.OooO00o(versionedParcel.m14940OooO00o());
        versionedParcel.m14926OooO00o(iconCompat.f14009OooO00o, 1);
        versionedParcel.OooO00o(iconCompat.f14015OooO00o, 2);
        versionedParcel.m14930OooO00o(iconCompat.f14012OooO00o, 3);
        versionedParcel.m14926OooO00o(iconCompat.f14016OooO0O0, 4);
        versionedParcel.m14926OooO00o(iconCompat.f14017OooO0OO, 5);
        versionedParcel.m14930OooO00o((Parcelable) iconCompat.f14010OooO00o, 6);
        versionedParcel.m14937OooO00o(iconCompat.f14014OooO00o, 7);
    }
}
