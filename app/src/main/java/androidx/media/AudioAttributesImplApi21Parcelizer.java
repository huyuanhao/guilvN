package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import com.p118pd.sdk.C7224o00ooO;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplApi21Parcelizer {
    public static C7224o00ooO read(VersionedParcel versionedParcel) {
        C7224o00ooO o00ooo = new C7224o00ooO();
        o00ooo.f19733OooO00o = (AudioAttributes) versionedParcel.OooO00o((Parcelable) o00ooo.f19733OooO00o, 1);
        o00ooo.f19732OooO00o = versionedParcel.OooO00o(o00ooo.f19732OooO00o, 2);
        return o00ooo;
    }

    public static void write(C7224o00ooO o00ooo, VersionedParcel versionedParcel) {
        versionedParcel.OooO00o(false, false);
        versionedParcel.m14930OooO00o((Parcelable) o00ooo.f19733OooO00o, 1);
        versionedParcel.m14926OooO00o(o00ooo.f19732OooO00o, 2);
    }
}
