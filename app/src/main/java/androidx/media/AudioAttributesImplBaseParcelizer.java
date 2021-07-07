package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import com.p118pd.sdk.C7230o00ooOO0;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplBaseParcelizer {
    public static C7230o00ooOO0 read(VersionedParcel versionedParcel) {
        C7230o00ooOO0 o00oooo0 = new C7230o00ooOO0();
        o00oooo0.OooO00o = versionedParcel.OooO00o(o00oooo0.OooO00o, 1);
        o00oooo0.OooO0O0 = versionedParcel.OooO00o(o00oooo0.OooO0O0, 2);
        o00oooo0.OooO0OO = versionedParcel.OooO00o(o00oooo0.OooO0OO, 3);
        o00oooo0.OooO0Oo = versionedParcel.OooO00o(o00oooo0.OooO0Oo, 4);
        return o00oooo0;
    }

    public static void write(C7230o00ooOO0 o00oooo0, VersionedParcel versionedParcel) {
        versionedParcel.OooO00o(false, false);
        versionedParcel.m14926OooO00o(o00oooo0.OooO00o, 1);
        versionedParcel.m14926OooO00o(o00oooo0.OooO0O0, 2);
        versionedParcel.m14926OooO00o(o00oooo0.OooO0OO, 3);
        versionedParcel.m14926OooO00o(o00oooo0.OooO0Oo, 4);
    }
}
