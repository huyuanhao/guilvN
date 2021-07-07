package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC7228o00ooO0o;
import com.p118pd.sdk.AbstractC7313o0O0Oo0;
import com.p118pd.sdk.C7224o00ooO;
import com.p118pd.sdk.C7230o00ooOO0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AudioAttributesCompat implements AbstractC7313o0O0Oo0 {
    public static final int OooO = 3;
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final SparseIntArray f14408OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f14409OooO00o = "AudioAttributesCompat";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f14410OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f14411OooO00o = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    public static final int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f14412OooO0O0 = "androidx.media.audio_attrs.FRAMEWORKS";
    public static final int OooO0OO = 2;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f14413OooO0OO = "androidx.media.audio_attrs.USAGE";
    public static final int OooO0Oo = 3;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f14414OooO0Oo = "androidx.media.audio_attrs.CONTENT_TYPE";
    public static final int OooO0o = 0;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f14415OooO0o = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";
    public static final int OooO0o0 = 4;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f14416OooO0o0 = "androidx.media.audio_attrs.FLAGS";
    public static final int OooO0oO = 1;
    public static final int OooO0oo = 2;
    public static final int OooOO0 = 4;
    public static final int OooOO0O = 5;
    public static final int OooOO0o = 6;
    public static final int OooOOO = 8;
    public static final int OooOOO0 = 7;
    public static final int OooOOOO = 9;
    public static final int OooOOOo = 10;
    public static final int OooOOo = 12;
    public static final int OooOOo0 = 11;
    public static final int OooOOoo = 13;
    public static final int OooOo = 2;
    public static final int OooOo0 = 15;
    public static final int OooOo00 = 14;
    public static final int OooOo0O = 16;
    public static final int OooOo0o = 1;
    public static final int OooOoO = 2;
    public static final int OooOoO0 = 1;
    public static final int OooOoOO = 4;
    public static final int OooOoo = 16;
    public static final int OooOoo0 = 8;
    public static final int OooOooO = 32;
    public static final int OooOooo = 64;
    public static final int Oooo0 = 1023;
    public static final int Oooo000 = 128;
    public static final int Oooo00O = 256;
    public static final int Oooo00o = 512;
    public static final int Oooo0O0 = 273;
    public static final int Oooo0OO = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7228o00ooO0o f14417OooO00o;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AttributeContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AttributeUsage {
    }

    public static abstract class OooO00o {
        public static final int OooO00o = 6;
        public static final int OooO0O0 = 7;
        public static final int OooO0OO = 9;
        public static final int OooO0Oo = 10;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f14408OooO00o = sparseIntArray;
        sparseIntArray.put(5, 1);
        f14408OooO00o.put(6, 2);
        f14408OooO00o.put(7, 2);
        f14408OooO00o.put(8, 1);
        f14408OooO00o.put(9, 1);
        f14408OooO00o.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public static int OooO00o(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    @Nullable
    public static AudioAttributesCompat OooO00o(@NonNull Object obj) {
        if (Build.VERSION.SDK_INT < 21 || f14410OooO00o) {
            return null;
        }
        C7224o00ooO o00ooo = new C7224o00ooO((AudioAttributes) obj);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f14417OooO00o = o00ooo;
        return audioAttributesCompat;
    }

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Object m14683OooO0O0() {
        return this.f14417OooO00o.m18719OooO00o();
    }

    public int OooO0OO() {
        return this.f14417OooO00o.OooO0OO();
    }

    public int OooO0Oo() {
        return this.f14417OooO00o.OooO0Oo();
    }

    public int OooO0o() {
        return this.f14417OooO00o.OooO0o();
    }

    public int OooO0o0() {
        return this.f14417OooO00o.OooO0o0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AbstractC7228o00ooO0o o00ooo0o = this.f14417OooO00o;
        if (o00ooo0o != null) {
            return o00ooo0o.equals(audioAttributesCompat.f14417OooO00o);
        }
        if (audioAttributesCompat.f14417OooO00o == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f14417OooO00o.hashCode();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Bundle toBundle() {
        return this.f14417OooO00o.toBundle();
    }

    public String toString() {
        return this.f14417OooO00o.toString();
    }

    public AudioAttributesCompat(AbstractC7228o00ooO0o o00ooo0o) {
        this.f14417OooO00o = o00ooo0o;
    }

    public int OooO0O0() {
        return this.f14417OooO00o.OooO0O0();
    }

    public static class OooO0O0 {
        public int OooO00o = 0;
        public int OooO0O0 = 0;
        public int OooO0OO = 0;
        public int OooO0Oo = -1;

        public OooO0O0() {
        }

        public AudioAttributesCompat OooO00o() {
            AbstractC7228o00ooO0o o00ooo0o;
            if (AudioAttributesCompat.f14410OooO00o || Build.VERSION.SDK_INT < 21) {
                o00ooo0o = new C7230o00ooOO0(this.OooO0O0, this.OooO0OO, this.OooO00o, this.OooO0Oo);
            } else {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.OooO0O0).setFlags(this.OooO0OO).setUsage(this.OooO00o);
                int i = this.OooO0Oo;
                if (i != -1) {
                    usage.setLegacyStreamType(i);
                }
                o00ooo0o = new C7224o00ooO(usage.build(), this.OooO0Oo);
            }
            return new AudioAttributesCompat(o00ooo0o);
        }

        public OooO0O0 OooO0O0(int i) {
            this.OooO0OO = (i & 1023) | this.OooO0OO;
            return this;
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        public OooO0O0 OooO0OO(int i) {
            switch (i) {
                case 0:
                    this.OooO0O0 = 1;
                    break;
                case 1:
                    this.OooO0O0 = 4;
                    break;
                case 2:
                    this.OooO0O0 = 4;
                    break;
                case 3:
                    this.OooO0O0 = 2;
                    break;
                case 4:
                    this.OooO0O0 = 4;
                    break;
                case 5:
                    this.OooO0O0 = 4;
                    break;
                case 6:
                    this.OooO0O0 = 1;
                    this.OooO0OO |= 4;
                    break;
                case 7:
                    this.OooO0OO = 1 | this.OooO0OO;
                    this.OooO0O0 = 4;
                    break;
                case 8:
                    this.OooO0O0 = 4;
                    break;
                case 9:
                    this.OooO0O0 = 4;
                    break;
                case 10:
                    this.OooO0O0 = 1;
                    break;
                default:
                    String str = "Invalid stream type " + i + " for AudioAttributesCompat";
                    break;
            }
            this.OooO00o = AudioAttributesCompat.OooO00o(i);
            return this;
        }

        public OooO0O0 OooO0Oo(int i) {
            if (i != 10) {
                this.OooO0Oo = i;
                return Build.VERSION.SDK_INT >= 21 ? OooO0OO(i) : this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        public OooO0O0 OooO0o0(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.OooO00o = i;
                    break;
                case 16:
                    if (!AudioAttributesCompat.f14410OooO00o && Build.VERSION.SDK_INT > 25) {
                        this.OooO00o = i;
                        break;
                    } else {
                        this.OooO00o = 12;
                        break;
                    }
                default:
                    this.OooO00o = 0;
                    break;
            }
            return this;
        }

        public OooO0O0(AudioAttributesCompat audioAttributesCompat) {
            this.OooO00o = audioAttributesCompat.OooO0o0();
            this.OooO0O0 = audioAttributesCompat.OooO0O0();
            this.OooO0OO = audioAttributesCompat.OooO00o();
            this.OooO0Oo = audioAttributesCompat.OooO0OO();
        }

        public OooO0O0 OooO00o(int i) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                this.OooO0O0 = i;
            } else {
                this.OooO00o = 0;
            }
            return this;
        }
    }

    public int OooO00o() {
        return this.f14417OooO00o.OooO00o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static AudioAttributesCompat OooO00o(Bundle bundle) {
        AbstractC7228o00ooO0o o00ooo0o;
        if (Build.VERSION.SDK_INT >= 21) {
            o00ooo0o = C7224o00ooO.OooO00o(bundle);
        } else {
            o00ooo0o = C7230o00ooOO0.OooO00o(bundle);
        }
        if (o00ooo0o == null) {
            return null;
        }
        return new AudioAttributesCompat(o00ooo0o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m14682OooO00o(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO00o(boolean z) {
        f14410OooO00o = z;
    }

    public static int OooO00o(boolean z, AudioAttributesCompat audioAttributesCompat) {
        return OooO00o(z, audioAttributesCompat.OooO00o(), audioAttributesCompat.OooO0o0());
    }

    public static int OooO00o(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
                return z ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
        }
    }
}
