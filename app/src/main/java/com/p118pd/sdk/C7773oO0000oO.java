package com.p118pd.sdk;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0000oO  reason: case insensitive filesystem */
public class C7773oO0000oO<Data> implements AbstractC7770oO00000o<Integer, Data> {
    public static final String OooO00o = "ResourceLoader";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Resources f20813OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7770oO00000o<Uri, Data> f20814OooO00o;

    /* renamed from: com.pd.sdk.oO0000oO$OooO00o */
    public static final class OooO00o implements AbstractC7771oO0000O<Integer, AssetFileDescriptor> {
        public final Resources OooO00o;

        public OooO00o(Resources resources) {
            this.OooO00o = resources;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public AbstractC7770oO00000o<Integer, AssetFileDescriptor> OooO00o(C7772oO0000o oo0000o) {
            return new C7773oO0000oO(this.OooO00o, oo0000o.OooO00o(Uri.class, (Class) AssetFileDescriptor.class));
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    /* renamed from: com.pd.sdk.oO0000oO$OooO0O0 */
    public static class OooO0O0 implements AbstractC7771oO0000O<Integer, ParcelFileDescriptor> {
        public final Resources OooO00o;

        public OooO0O0(Resources resources) {
            this.OooO00o = resources;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Integer, ParcelFileDescriptor> OooO00o(C7772oO0000o oo0000o) {
            return new C7773oO0000oO(this.OooO00o, oo0000o.OooO00o(Uri.class, (Class) ParcelFileDescriptor.class));
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    /* renamed from: com.pd.sdk.oO0000oO$OooO0OO */
    public static class OooO0OO implements AbstractC7771oO0000O<Integer, InputStream> {
        public final Resources OooO00o;

        public OooO0OO(Resources resources) {
            this.OooO00o = resources;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Integer, InputStream> OooO00o(C7772oO0000o oo0000o) {
            return new C7773oO0000oO(this.OooO00o, oo0000o.OooO00o(Uri.class, (Class) InputStream.class));
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    /* renamed from: com.pd.sdk.oO0000oO$OooO0Oo  reason: case insensitive filesystem */
    public static class C7774OooO0Oo implements AbstractC7771oO0000O<Integer, Uri> {
        public final Resources OooO00o;

        public C7774OooO0Oo(Resources resources) {
            this.OooO00o = resources;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Integer, Uri> OooO00o(C7772oO0000o oo0000o) {
            return new C7773oO0000oO(this.OooO00o, oO000O0.OooO00o());
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    public C7773oO0000oO(Resources resources, AbstractC7770oO00000o<Uri, Data> oo00000o) {
        this.f20813OooO00o = resources;
        this.f20814OooO00o = oo00000o;
    }

    public boolean OooO00o(@NonNull Integer num) {
        return true;
    }

    public AbstractC7770oO00000o.OooO00o<Data> OooO00o(@NonNull Integer num, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        Uri OooO00o2 = OooO00o(num);
        if (OooO00o2 == null) {
            return null;
        }
        return this.f20814OooO00o.OooO00o(OooO00o2, i, i2, o0ooooo);
    }

    @Nullable
    private Uri OooO00o(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f20813OooO00o.getResourcePackageName(num.intValue()) + '/' + this.f20813OooO00o.getResourceTypeName(num.intValue()) + '/' + this.f20813OooO00o.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable(OooO00o, 5)) {
                return null;
            }
            String str = "Received invalid resource id: " + num;
            return null;
        }
    }
}
