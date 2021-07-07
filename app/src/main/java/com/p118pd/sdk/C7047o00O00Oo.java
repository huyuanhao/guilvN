package com.p118pd.sdk;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: com.pd.sdk.o00O00Oo  reason: case insensitive filesystem */
public final class C7047o00O00Oo {
    public final Context OooO00o;

    /* renamed from: com.pd.sdk.o00O00Oo$OooO00o */
    public static class OooO00o extends FingerprintManager.AuthenticationCallback {
        public final /* synthetic */ OooO0O0 OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.OooO00o.OooO00o(i, charSequence);
        }

        public void onAuthenticationFailed() {
            this.OooO00o.OooO00o();
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.OooO00o.OooO0O0(i, charSequence);
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.OooO00o.OooO00o(new OooO0OO(C7047o00O00Oo.OooO00o(authenticationResult.getCryptoObject())));
        }
    }

    /* renamed from: com.pd.sdk.o00O00Oo$OooO0O0 */
    public static abstract class OooO0O0 {
        public void OooO00o() {
        }

        public void OooO00o(int i, CharSequence charSequence) {
        }

        public void OooO00o(OooO0OO oooO0OO) {
        }

        public void OooO0O0(int i, CharSequence charSequence) {
        }
    }

    /* renamed from: com.pd.sdk.o00O00Oo$OooO0OO */
    public static final class OooO0OO {
        public final C7048OooO0Oo OooO00o;

        public OooO0OO(C7048OooO0Oo oooO0Oo) {
            this.OooO00o = oooO0Oo;
        }

        public C7048OooO0Oo OooO00o() {
            return this.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.o00O00Oo$OooO0Oo  reason: case insensitive filesystem */
    public static class C7048OooO0Oo {
        public final Signature OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Cipher f19319OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Mac f19320OooO00o;

        public C7048OooO0Oo(@NonNull Signature signature) {
            this.OooO00o = signature;
            this.f19319OooO00o = null;
            this.f19320OooO00o = null;
        }

        @Nullable
        public Signature OooO00o() {
            return this.OooO00o;
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Cipher m18323OooO00o() {
            return this.f19319OooO00o;
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Mac m18324OooO00o() {
            return this.f19320OooO00o;
        }

        public C7048OooO0Oo(@NonNull Cipher cipher) {
            this.f19319OooO00o = cipher;
            this.OooO00o = null;
            this.f19320OooO00o = null;
        }

        public C7048OooO0Oo(@NonNull Mac mac) {
            this.f19320OooO00o = mac;
            this.f19319OooO00o = null;
            this.OooO00o = null;
        }
    }

    public C7047o00O00Oo(Context context) {
        this.OooO00o = context;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7047o00O00Oo m18322OooO00o(@NonNull Context context) {
        return new C7047o00O00Oo(context);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean OooO0O0() {
        FingerprintManager OooO00o2;
        if (Build.VERSION.SDK_INT < 23 || (OooO00o2 = OooO00o(this.OooO00o)) == null || !OooO00o2.isHardwareDetected()) {
            return false;
        }
        return true;
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean OooO00o() {
        FingerprintManager OooO00o2;
        if (Build.VERSION.SDK_INT < 23 || (OooO00o2 = OooO00o(this.OooO00o)) == null || !OooO00o2.hasEnrolledFingerprints()) {
            return false;
        }
        return true;
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public void OooO00o(@Nullable C7048OooO0Oo oooO0Oo, int i, @Nullable C7056o00O0O0o o00o0o0o, @NonNull OooO0O0 oooO0O0, @Nullable Handler handler) {
        FingerprintManager OooO00o2;
        if (Build.VERSION.SDK_INT >= 23 && (OooO00o2 = OooO00o(this.OooO00o)) != null) {
            OooO00o2.authenticate(OooO00o(oooO0Oo), o00o0o0o != null ? (CancellationSignal) o00o0o0o.OooO00o() : null, i, OooO00o(oooO0O0), handler);
        }
    }

    @Nullable
    @RequiresApi(23)
    public static FingerprintManager OooO00o(@NonNull Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    @RequiresApi(23)
    public static FingerprintManager.CryptoObject OooO00o(C7048OooO0Oo oooO0Oo) {
        if (oooO0Oo == null) {
            return null;
        }
        if (oooO0Oo.m18323OooO00o() != null) {
            return new FingerprintManager.CryptoObject(oooO0Oo.m18323OooO00o());
        }
        if (oooO0Oo.OooO00o() != null) {
            return new FingerprintManager.CryptoObject(oooO0Oo.OooO00o());
        }
        if (oooO0Oo.m18324OooO00o() != null) {
            return new FingerprintManager.CryptoObject(oooO0Oo.m18324OooO00o());
        }
        return null;
    }

    @RequiresApi(23)
    public static C7048OooO0Oo OooO00o(FingerprintManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new C7048OooO0Oo(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new C7048OooO0Oo(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new C7048OooO0Oo(cryptoObject.getMac());
        }
        return null;
    }

    @RequiresApi(23)
    public static FingerprintManager.AuthenticationCallback OooO00o(OooO0O0 oooO0O0) {
        return new OooO00o(oooO0O0);
    }
}
