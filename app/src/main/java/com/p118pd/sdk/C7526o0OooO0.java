package com.p118pd.sdk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import com.umeng.message.proguard.C3817f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.pd.sdk.o0OooO0  reason: case insensitive filesystem */
public class C7526o0OooO0 extends VersionedParcel {
    public static final Charset OooO00o = Charset.forName(C3817f.f10341c);
    public static final int OooOOO = 0;
    public static final int OooOOOO = 1;
    public static final int OooOOOo = 2;
    public static final int OooOOo = 4;
    public static final int OooOOo0 = 3;
    public static final int OooOOoo = 5;
    public static final int OooOo = 10;
    public static final int OooOo0 = 7;
    public static final int OooOo00 = 6;
    public static final int OooOo0O = 8;
    public static final int OooOo0o = 9;
    public static final int OooOoO = 12;
    public static final int OooOoO0 = 11;
    public static final int OooOoOO = 13;
    public static final int OooOoo0 = 14;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SparseArray<OooO0O0> f20369OooO00o = new SparseArray<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f20370OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DataInputStream f20371OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DataOutputStream f20372OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20373OooO00o;
    public DataInputStream OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public DataOutputStream f20374OooO0O0;

    /* renamed from: com.pd.sdk.o0OooO0$OooO00o */
    public static class OooO00o {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ByteArrayOutputStream f20375OooO00o = new ByteArrayOutputStream();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final DataOutputStream f20376OooO00o = new DataOutputStream(this.f20375OooO00o);
        public final DataOutputStream OooO0O0;

        public OooO00o(int i, DataOutputStream dataOutputStream) {
            this.OooO00o = i;
            this.OooO0O0 = dataOutputStream;
        }

        public void OooO00o() throws IOException {
            this.f20376OooO00o.flush();
            int size = this.f20375OooO00o.size();
            this.OooO0O0.writeInt((this.OooO00o << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.OooO0O0.writeInt(size);
            }
            this.f20375OooO00o.writeTo(this.OooO0O0);
        }
    }

    /* renamed from: com.pd.sdk.o0OooO0$OooO0O0 */
    public static class OooO0O0 {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final DataInputStream f20377OooO00o;
        public final int OooO0O0;

        public OooO0O0(int i, int i2, DataInputStream dataInputStream) throws IOException {
            this.OooO00o = i2;
            this.OooO0O0 = i;
            byte[] bArr = new byte[i2];
            dataInputStream.readFully(bArr);
            this.f20377OooO00o = new DataInputStream(new ByteArrayInputStream(bArr));
        }
    }

    public C7526o0OooO0(InputStream inputStream, OutputStream outputStream) {
        DataOutputStream dataOutputStream = null;
        this.f20371OooO00o = inputStream != null ? new DataInputStream(inputStream) : null;
        dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : dataOutputStream;
        this.f20372OooO00o = dataOutputStream;
        this.OooO0O0 = this.f20371OooO00o;
        this.f20374OooO0O0 = dataOutputStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public IBinder m19181OooO00o() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T extends Parcelable> T m19182OooO00o() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(boolean z, boolean z2) {
        if (z) {
            this.f20373OooO00o = z2;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19186OooO00o() {
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO0O0(int i) {
        try {
            this.f20374OooO0O0.writeInt(i);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19185OooO00o() {
        OooO00o oooO00o = this.f20370OooO00o;
        if (oooO00o != null) {
            try {
                if (oooO00o.f20375OooO00o.size() != 0) {
                    this.f20370OooO00o.OooO00o();
                }
                this.f20370OooO00o = null;
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    public boolean OooO0O0() {
        try {
            return this.OooO0O0.readBoolean();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public VersionedParcel m19183OooO00o() {
        return new C7526o0OooO0(this.OooO0O0, this.f20374OooO0O0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19187OooO00o(int i) {
        OooO0O0 oooO0O0 = this.f20369OooO00o.get(i);
        if (oooO0O0 != null) {
            this.f20369OooO00o.remove(i);
            this.OooO0O0 = oooO0O0.f20377OooO00o;
            return true;
        }
        while (true) {
            try {
                int readInt = this.f20371OooO00o.readInt();
                int i2 = readInt & 65535;
                if (i2 == 65535) {
                    i2 = this.f20371OooO00o.readInt();
                }
                OooO0O0 oooO0O02 = new OooO0O0((readInt >> 16) & 65535, i2, this.f20371OooO00o);
                if (oooO0O02.OooO0O0 == i) {
                    this.OooO0O0 = oooO0O02.f20377OooO00o;
                    return true;
                }
                this.f20369OooO00o.put(oooO0O02.OooO0O0, oooO0O02);
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    public void OooO00o(int i) {
        m19185OooO00o();
        OooO00o oooO00o = new OooO00o(i, this.f20372OooO00o);
        this.f20370OooO00o = oooO00o;
        this.f20374OooO0O0 = oooO00o.f20376OooO00o;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(byte[] bArr) {
        if (bArr != null) {
            try {
                this.f20374OooO0O0.writeInt(bArr.length);
                this.f20374OooO0O0.write(bArr);
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        } else {
            this.f20374OooO0O0.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            try {
                this.f20374OooO0O0.writeInt(i2);
                this.f20374OooO0O0.write(bArr, i, i2);
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        } else {
            this.f20374OooO0O0.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(long j) {
        try {
            this.f20374OooO0O0.writeLong(j);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(float f) {
        try {
            this.f20374OooO0O0.writeFloat(f);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(double d) {
        try {
            this.f20374OooO0O0.writeDouble(d);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(String str) {
        if (str != null) {
            try {
                byte[] bytes = str.getBytes(OooO00o);
                this.f20374OooO0O0.writeInt(bytes.length);
                this.f20374OooO0O0.write(bytes);
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        } else {
            this.f20374OooO0O0.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(boolean z) {
        try {
            this.f20374OooO0O0.writeBoolean(z);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(IBinder iBinder) {
        if (!this.f20373OooO00o) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(Parcelable parcelable) {
        if (!this.f20373OooO00o) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(IInterface iInterface) {
        if (!this.f20373OooO00o) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19178OooO00o() {
        try {
            return this.OooO0O0.readInt();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m19179OooO00o() {
        try {
            return this.OooO0O0.readLong();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m19177OooO00o() {
        try {
            return this.OooO0O0.readFloat();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    public double OooO00o() {
        try {
            return this.OooO0O0.readDouble();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19184OooO00o() {
        try {
            int readInt = this.OooO0O0.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.OooO0O0.readFully(bArr);
            return new String(bArr, OooO00o);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19188OooO00o() {
        try {
            int readInt = this.OooO0O0.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.OooO0O0.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void OooO00o(Bundle bundle) {
        if (bundle != null) {
            try {
                Set<String> keySet = bundle.keySet();
                this.f20374OooO0O0.writeInt(keySet.size());
                for (String str : keySet) {
                    OooO00o(str);
                    OooO00o(bundle.get(str));
                }
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        } else {
            this.f20374OooO0O0.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel, androidx.versionedparcelable.VersionedParcel
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bundle m19180OooO00o() {
        int OooO00o2 = m19178OooO00o();
        if (OooO00o2 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < OooO00o2; i++) {
            OooO00o(m19178OooO00o(), m19184OooO00o(), bundle);
        }
        return bundle;
    }

    private void OooO00o(Object obj) {
        if (obj == null) {
            OooO0O0(0);
        } else if (obj instanceof Bundle) {
            OooO0O0(1);
            OooO00o((Bundle) obj);
        } else if (obj instanceof String) {
            OooO0O0(3);
            OooO00o((String) obj);
        } else if (obj instanceof String[]) {
            OooO0O0(4);
            OooO00o((Object[]) ((String[]) obj));
        } else if (obj instanceof Boolean) {
            OooO0O0(5);
            OooO00o(((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            OooO0O0(6);
            OooO00o((boolean[]) obj);
        } else if (obj instanceof Double) {
            OooO0O0(7);
            OooO00o(((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            OooO0O0(8);
            OooO00o((double[]) obj);
        } else if (obj instanceof Integer) {
            OooO0O0(9);
            OooO0O0(((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            OooO0O0(10);
            OooO00o((int[]) obj);
        } else if (obj instanceof Long) {
            OooO0O0(11);
            OooO00o(((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            OooO0O0(12);
            OooO00o((long[]) obj);
        } else if (obj instanceof Float) {
            OooO0O0(13);
            OooO00o(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            OooO0O0(14);
            OooO00o((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    private void OooO00o(int i, String str, Bundle bundle) {
        switch (i) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, m19180OooO00o());
                return;
            case 2:
                bundle.putBundle(str, m19180OooO00o());
                return;
            case 3:
                bundle.putString(str, m19184OooO00o());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) m14954OooO00o((Object[]) new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, OooO0O0());
                return;
            case 6:
                bundle.putBooleanArray(str, m14956OooO00o());
                return;
            case 7:
                bundle.putDouble(str, OooO00o());
                return;
            case 8:
                bundle.putDoubleArray(str, m14946OooO00o());
                return;
            case 9:
                bundle.putInt(str, m19178OooO00o());
                return;
            case 10:
                bundle.putIntArray(str, m14950OooO00o());
                return;
            case 11:
                bundle.putLong(str, m19179OooO00o());
                return;
            case 12:
                bundle.putLongArray(str, m14952OooO00o());
                return;
            case 13:
                bundle.putFloat(str, m19177OooO00o());
                return;
            case 14:
                bundle.putFloatArray(str, m14948OooO00o());
                return;
            default:
                throw new RuntimeException("Unknown type " + i);
        }
    }
}
