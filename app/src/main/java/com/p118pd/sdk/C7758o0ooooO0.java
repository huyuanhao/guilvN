package com.p118pd.sdk;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0ooooO0  reason: case insensitive filesystem */
public final class C7758o0ooooO0<Model, Data> implements AbstractC7770oO00000o<Model, Data> {
    public static final String OooO00o = "data:image";
    public static final String OooO0O0 = ";base64";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO00o<Data> f20782OooO00o;

    /* renamed from: com.pd.sdk.o0ooooO0$OooO00o */
    public interface OooO00o<Data> {
        Class<Data> OooO00o();

        Data OooO00o(String str) throws IllegalArgumentException;

        void close(Data data) throws IOException;
    }

    /* renamed from: com.pd.sdk.o0ooooO0$OooO0OO */
    public static final class OooO0OO<Model> implements AbstractC7771oO0000O<Model, InputStream> {
        public final OooO00o<InputStream> OooO00o = new OooO00o();

        /* renamed from: com.pd.sdk.o0ooooO0$OooO0OO$OooO00o */
        public class OooO00o implements OooO00o<InputStream> {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.C7758o0ooooO0.OooO00o
            public InputStream OooO00o(String str) {
                if (str.startsWith(C7758o0ooooO0.OooO00o)) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(C7758o0ooooO0.OooO0O0)) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }

            /* renamed from: OooO00o */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.p118pd.sdk.C7758o0ooooO0.OooO00o
            public Class<InputStream> OooO00o() {
                return InputStream.class;
            }
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Model, InputStream> OooO00o(@NonNull C7772oO0000o oo0000o) {
            return new C7758o0ooooO0(this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public void OooO00o() {
        }
    }

    public C7758o0ooooO0(OooO00o<Data> oooO00o) {
        this.f20782OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7770oO00000o
    public AbstractC7770oO00000o.OooO00o<Data> OooO00o(@NonNull Model model, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return new AbstractC7770oO00000o.OooO00o<>(new C7885oO0Oo00O(model), new OooO0O0(model.toString(), this.f20782OooO00o));
    }

    /* renamed from: com.pd.sdk.o0ooooO0$OooO0O0 */
    public static final class OooO0O0<Data> implements AbstractC7662o0oOooo0<Data> {
        public final OooO00o<Data> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Data f20783OooO00o;
        public final String o0ooOOo;

        public OooO0O0(String str, OooO00o<Data> oooO00o) {
            this.o0ooOOo = str;
            this.OooO00o = oooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super Data> oooO00o) {
            try {
                Data OooO00o2 = this.OooO00o.OooO00o(this.o0ooOOo);
                this.f20783OooO00o = OooO00o2;
                oooO00o.OooO00o((Object) OooO00o2);
            } catch (IllegalArgumentException e) {
                oooO00o.OooO00o((Exception) e);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void cancel() {
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19405OooO00o() {
            try {
                this.OooO00o.close(this.f20783OooO00o);
            } catch (IOException unused) {
            }
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<Data> m19404OooO00o() {
            return this.OooO00o.OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        public DataSource OooO00o() {
            return DataSource.LOCAL;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7770oO00000o
    public boolean OooO00o(@NonNull Model model) {
        return model.toString().startsWith(OooO00o);
    }
}
