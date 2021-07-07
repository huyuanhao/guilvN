package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import com.p118pd.sdk.AbstractC7228o00ooO0o;
import com.p118pd.sdk.AbstractC7313o0O0Oo0;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f14417OooO00o = (AbstractC7228o00ooO0o) versionedParcel.OooO00o((AbstractC7313o0O0Oo0) audioAttributesCompat.f14417OooO00o, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.OooO00o(false, false);
        versionedParcel.m14935OooO00o((AbstractC7313o0O0Oo0) audioAttributesCompat.f14417OooO00o, 1);
    }
}
