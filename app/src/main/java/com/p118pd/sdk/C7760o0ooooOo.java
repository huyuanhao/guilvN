package com.p118pd.sdk;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7770oO00000o;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0ooooOo  reason: case insensitive filesystem */
public class C7760o0ooooOo<Data> implements AbstractC7770oO00000o<File, Data> {
    public static final String OooO00o = "FileLoader";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7761OooO0Oo<Data> f20784OooO00o;

    /* renamed from: com.pd.sdk.o0ooooOo$OooO00o */
    public static class OooO00o<Data> implements AbstractC7771oO0000O<File, Data> {
        public final AbstractC7761OooO0Oo<Data> OooO00o;

        public OooO00o(AbstractC7761OooO0Oo<Data> oooO0Oo) {
            this.OooO00o = oooO0Oo;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public final AbstractC7770oO00000o<File, Data> OooO00o(@NonNull C7772oO0000o oo0000o) {
            return new C7760o0ooooOo(this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        public final void OooO00o() {
        }
    }

    /* renamed from: com.pd.sdk.o0ooooOo$OooO0O0 */
    public static class OooO0O0 extends OooO00o<ParcelFileDescriptor> {

        /* renamed from: com.pd.sdk.o0ooooOo$OooO0O0$OooO00o */
        public class OooO00o implements AbstractC7761OooO0Oo<ParcelFileDescriptor> {
            @Override // com.p118pd.sdk.C7760o0ooooOo.AbstractC7761OooO0Oo
            public ParcelFileDescriptor OooO00o(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, CommonNetImpl.FLAG_AUTH);
            }

            /* renamed from: OooO00o */
            public void close(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.p118pd.sdk.C7760o0ooooOo.AbstractC7761OooO0Oo
            public Class<ParcelFileDescriptor> OooO00o() {
                return ParcelFileDescriptor.class;
            }
        }

        public OooO0O0() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.o0ooooOo$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC7761OooO0Oo<Data> {
        Class<Data> OooO00o();

        Data OooO00o(File file) throws FileNotFoundException;

        void close(Data data) throws IOException;
    }

    /* renamed from: com.pd.sdk.o0ooooOo$OooO0o0  reason: case insensitive filesystem */
    public static class C7762OooO0o0 extends OooO00o<InputStream> {

        /* renamed from: com.pd.sdk.o0ooooOo$OooO0o0$OooO00o */
        public class OooO00o implements AbstractC7761OooO0Oo<InputStream> {
            @Override // com.p118pd.sdk.C7760o0ooooOo.AbstractC7761OooO0Oo
            public InputStream OooO00o(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            /* renamed from: OooO00o */
            public void close(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.p118pd.sdk.C7760o0ooooOo.AbstractC7761OooO0Oo
            public Class<InputStream> OooO00o() {
                return InputStream.class;
            }
        }

        public C7762OooO0o0() {
            super(new OooO00o());
        }
    }

    public C7760o0ooooOo(AbstractC7761OooO0Oo<Data> oooO0Oo) {
        this.f20784OooO00o = oooO0Oo;
    }

    public boolean OooO00o(@NonNull File file) {
        return true;
    }

    public AbstractC7770oO00000o.OooO00o<Data> OooO00o(@NonNull File file, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return new AbstractC7770oO00000o.OooO00o<>(new C7885oO0Oo00O(file), new OooO0OO(file, this.f20784OooO00o));
    }

    /* renamed from: com.pd.sdk.o0ooooOo$OooO0OO */
    public static final class OooO0OO<Data> implements AbstractC7662o0oOooo0<Data> {
        public final AbstractC7761OooO0Oo<Data> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final File f20785OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Data f20786OooO00o;

        public OooO0OO(File file, AbstractC7761OooO0Oo<Data> oooO0Oo) {
            this.f20785OooO00o = file;
            this.OooO00o = oooO0Oo;
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super Data> oooO00o) {
            try {
                Data OooO00o2 = this.OooO00o.OooO00o(this.f20785OooO00o);
                this.f20786OooO00o = OooO00o2;
                oooO00o.OooO00o((Object) OooO00o2);
            } catch (FileNotFoundException e) {
                Log.isLoggable(C7760o0ooooOo.OooO00o, 3);
                oooO00o.OooO00o((Exception) e);
            }
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void cancel() {
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19407OooO00o() {
            Data data = this.f20786OooO00o;
            if (data != null) {
                try {
                    this.OooO00o.close(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<Data> m19406OooO00o() {
            return this.OooO00o.OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        public DataSource OooO00o() {
            return DataSource.LOCAL;
        }
    }
}
