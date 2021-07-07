package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.AbstractC7313o0O0Oo0;
import com.p118pd.sdk.C6972o0000oOO;
import com.taobao.accs.ErrorCode;
import com.umeng.message.proguard.C3848l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class VersionedParcel {
    public static final int OooO = 1;
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f14703OooO00o = "VersionedParcel";
    public static final int OooO0O0 = -2;
    public static final int OooO0OO = -3;
    public static final int OooO0Oo = -4;
    public static final int OooO0o = -6;
    public static final int OooO0o0 = -5;
    public static final int OooO0oO = -7;
    public static final int OooO0oo = -9;
    public static final int OooOO0 = 2;
    public static final int OooOO0O = 3;
    public static final int OooOO0o = 4;
    public static final int OooOOO0 = 5;

    public class OooO00o extends ObjectInputStream {
        public OooO00o(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, OooO00o.class.getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    private void OooO0O0(AbstractC7313o0O0Oo0 o0o0oo0) {
        try {
            OooO00o(OooO00o((Class<? extends AbstractC7313o0O0Oo0>) o0o0oo0.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(o0o0oo0.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public abstract double OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract float m14912OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract int m14913OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract long m14914OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract Bundle m14915OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract IBinder m14916OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract <T extends Parcelable> T m14917OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract VersionedParcel m14918OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract String m14921OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m14922OooO00o();

    public abstract void OooO00o(double d);

    public abstract void OooO00o(float f);

    public abstract void OooO00o(int i);

    public abstract void OooO00o(long j);

    public abstract void OooO00o(Bundle bundle);

    public abstract void OooO00o(IBinder iBinder);

    public abstract void OooO00o(IInterface iInterface);

    public void OooO00o(IInterface iInterface, int i) {
        OooO00o(i);
        OooO00o(iInterface);
    }

    public abstract void OooO00o(Parcelable parcelable);

    public abstract void OooO00o(String str);

    public abstract void OooO00o(boolean z);

    public void OooO00o(boolean z, boolean z2) {
    }

    public abstract void OooO00o(byte[] bArr);

    public abstract void OooO00o(byte[] bArr, int i, int i2);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14940OooO00o() {
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m14941OooO00o(int i);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract byte[] m14943OooO00o();

    public abstract void OooO0O0(int i);

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract boolean m14959OooO0O0();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14928OooO00o(Bundle bundle, int i) {
        OooO00o(i);
        OooO00o(bundle);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m14958OooO0O0() {
        OooO0O0(0);
    }

    private int OooO0O0() {
        return m14913OooO00o();
    }

    public void OooO00o(boolean z, int i) {
        OooO00o(i);
        OooO00o(z);
    }

    private Exception OooO0O0(int i, String str) {
        return OooO00o(i, str);
    }

    public void OooO00o(byte[] bArr, int i) {
        OooO00o(i);
        OooO00o(bArr);
    }

    public void OooO00o(byte[] bArr, int i, int i2, int i3) {
        OooO00o(i3);
        OooO00o(bArr, i, i2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14926OooO00o(int i, int i2) {
        OooO00o(i2);
        OooO0O0(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14927OooO00o(long j, int i) {
        OooO00o(i);
        OooO00o(j);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14925OooO00o(float f, int i) {
        OooO00o(i);
        OooO00o(f);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14924OooO00o(double d, int i) {
        OooO00o(i);
        OooO00o(d);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14937OooO00o(String str, int i) {
        OooO00o(i);
        OooO00o(str);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14929OooO00o(IBinder iBinder, int i) {
        OooO00o(i);
        OooO00o(iBinder);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14930OooO00o(Parcelable parcelable, int i) {
        OooO00o(i);
        OooO00o(parcelable);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14942OooO00o(boolean z, int i) {
        if (!m14941OooO00o(i)) {
            return z;
        }
        return m14959OooO0O0();
    }

    public int OooO00o(int i, int i2) {
        if (!m14941OooO00o(i2)) {
            return i;
        }
        return m14913OooO00o();
    }

    public long OooO00o(long j, int i) {
        if (!m14941OooO00o(i)) {
            return j;
        }
        return m14914OooO00o();
    }

    public float OooO00o(float f, int i) {
        if (!m14941OooO00o(i)) {
            return f;
        }
        return m14912OooO00o();
    }

    public double OooO00o(double d, int i) {
        if (!m14941OooO00o(i)) {
            return d;
        }
        return OooO00o();
    }

    public String OooO00o(String str, int i) {
        if (!m14941OooO00o(i)) {
            return str;
        }
        return m14921OooO00o();
    }

    public IBinder OooO00o(IBinder iBinder, int i) {
        if (!m14941OooO00o(i)) {
            return iBinder;
        }
        return m14916OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m14944OooO00o(byte[] bArr, int i) {
        if (!m14941OooO00o(i)) {
            return bArr;
        }
        return m14943OooO00o();
    }

    public <T extends Parcelable> T OooO00o(T t, int i) {
        return !m14941OooO00o(i) ? t : (T) m14917OooO00o();
    }

    public Bundle OooO00o(Bundle bundle, int i) {
        if (!m14941OooO00o(i)) {
            return bundle;
        }
        return m14915OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14923OooO00o(byte b, int i) {
        OooO00o(i);
        OooO0O0(b);
    }

    @RequiresApi(api = 21)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14931OooO00o(Size size, int i) {
        OooO00o(i);
        OooO00o(size != null);
        if (size != null) {
            OooO0O0(size.getWidth());
            OooO0O0(size.getHeight());
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14932OooO00o(SizeF sizeF, int i) {
        OooO00o(i);
        OooO00o(sizeF != null);
        if (sizeF != null) {
            OooO00o(sizeF.getWidth());
            OooO00o(sizeF.getHeight());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14933OooO00o(SparseBooleanArray sparseBooleanArray, int i) {
        OooO00o(i);
        if (sparseBooleanArray == null) {
            OooO0O0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        OooO0O0(size);
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0(sparseBooleanArray.keyAt(i2));
            OooO00o(sparseBooleanArray.valueAt(i2));
        }
    }

    public void OooO00o(boolean[] zArr, int i) {
        OooO00o(i);
        OooO00o(zArr);
    }

    public void OooO00o(boolean[] zArr) {
        if (zArr != null) {
            int length = zArr.length;
            OooO0O0(length);
            for (boolean z : zArr) {
                OooO0O0(z ? 1 : 0);
            }
            return;
        }
        OooO0O0(-1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean[] m14957OooO00o(boolean[] zArr, int i) {
        if (!m14941OooO00o(i)) {
            return zArr;
        }
        return m14956OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean[] m14956OooO00o() {
        int OooO00o2 = m14913OooO00o();
        if (OooO00o2 < 0) {
            return null;
        }
        boolean[] zArr = new boolean[OooO00o2];
        for (int i = 0; i < OooO00o2; i++) {
            zArr[i] = m14913OooO00o() != 0;
        }
        return zArr;
    }

    public void OooO00o(char[] cArr, int i) {
        OooO00o(i);
        if (cArr != null) {
            int length = cArr.length;
            OooO0O0(length);
            for (char c : cArr) {
                OooO0O0(c);
            }
            return;
        }
        OooO0O0(-1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public char[] m14945OooO00o(char[] cArr, int i) {
        if (!m14941OooO00o(i)) {
            return cArr;
        }
        int OooO00o2 = m14913OooO00o();
        if (OooO00o2 < 0) {
            return null;
        }
        char[] cArr2 = new char[OooO00o2];
        for (int i2 = 0; i2 < OooO00o2; i2++) {
            cArr2[i2] = (char) m14913OooO00o();
        }
        return cArr2;
    }

    public void OooO00o(int[] iArr, int i) {
        OooO00o(i);
        OooO00o(iArr);
    }

    public void OooO00o(int[] iArr) {
        if (iArr != null) {
            int length = iArr.length;
            OooO0O0(length);
            for (int i : iArr) {
                OooO0O0(i);
            }
            return;
        }
        OooO0O0(-1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m14951OooO00o(int[] iArr, int i) {
        if (!m14941OooO00o(i)) {
            return iArr;
        }
        return m14950OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m14950OooO00o() {
        int OooO00o2 = m14913OooO00o();
        if (OooO00o2 < 0) {
            return null;
        }
        int[] iArr = new int[OooO00o2];
        for (int i = 0; i < OooO00o2; i++) {
            iArr[i] = m14913OooO00o();
        }
        return iArr;
    }

    public void OooO00o(long[] jArr, int i) {
        OooO00o(i);
        OooO00o(jArr);
    }

    public void OooO00o(long[] jArr) {
        if (jArr != null) {
            int length = jArr.length;
            OooO0O0(length);
            for (long j : jArr) {
                OooO00o(j);
            }
            return;
        }
        OooO0O0(-1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long[] m14953OooO00o(long[] jArr, int i) {
        if (!m14941OooO00o(i)) {
            return jArr;
        }
        return m14952OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long[] m14952OooO00o() {
        int OooO00o2 = m14913OooO00o();
        if (OooO00o2 < 0) {
            return null;
        }
        long[] jArr = new long[OooO00o2];
        for (int i = 0; i < OooO00o2; i++) {
            jArr[i] = m14914OooO00o();
        }
        return jArr;
    }

    public void OooO00o(float[] fArr, int i) {
        OooO00o(i);
        OooO00o(fArr);
    }

    public void OooO00o(float[] fArr) {
        if (fArr != null) {
            int length = fArr.length;
            OooO0O0(length);
            for (float f : fArr) {
                OooO00o(f);
            }
            return;
        }
        OooO0O0(-1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public float[] m14949OooO00o(float[] fArr, int i) {
        if (!m14941OooO00o(i)) {
            return fArr;
        }
        return m14948OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public float[] m14948OooO00o() {
        int OooO00o2 = m14913OooO00o();
        if (OooO00o2 < 0) {
            return null;
        }
        float[] fArr = new float[OooO00o2];
        for (int i = 0; i < OooO00o2; i++) {
            fArr[i] = m14912OooO00o();
        }
        return fArr;
    }

    public void OooO00o(double[] dArr, int i) {
        OooO00o(i);
        OooO00o(dArr);
    }

    public void OooO00o(double[] dArr) {
        if (dArr != null) {
            int length = dArr.length;
            OooO0O0(length);
            for (double d : dArr) {
                OooO00o(d);
            }
            return;
        }
        OooO0O0(-1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public double[] m14947OooO00o(double[] dArr, int i) {
        if (!m14941OooO00o(i)) {
            return dArr;
        }
        return m14946OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public double[] m14946OooO00o() {
        int OooO00o2 = m14913OooO00o();
        if (OooO00o2 < 0) {
            return null;
        }
        double[] dArr = new double[OooO00o2];
        for (int i = 0; i < OooO00o2; i++) {
            dArr[i] = OooO00o();
        }
        return dArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T> void m14939OooO00o(Set<T> set, int i) {
        OooO00o((Collection) set, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T> void m14938OooO00o(List<T> list, int i) {
        OooO00o((Collection) list, i);
    }

    private <T> void OooO00o(Collection<T> collection, int i) {
        OooO00o(i);
        if (collection == null) {
            OooO0O0(-1);
            return;
        }
        int size = collection.size();
        OooO0O0(size);
        if (size > 0) {
            int OooO00o2 = OooO00o((Object) collection.iterator().next());
            OooO0O0(OooO00o2);
            if (OooO00o2 == 1) {
                for (T t : collection) {
                    m14934OooO00o((AbstractC7313o0O0Oo0) t);
                }
            } else if (OooO00o2 == 2) {
                for (T t2 : collection) {
                    OooO00o((Parcelable) t2);
                }
            } else if (OooO00o2 == 3) {
                for (T t3 : collection) {
                    OooO00o((Serializable) t3);
                }
            } else if (OooO00o2 == 4) {
                for (T t4 : collection) {
                    OooO00o((String) t4);
                }
            } else if (OooO00o2 == 5) {
                for (T t5 : collection) {
                    OooO00o((IBinder) t5);
                }
            }
        }
    }

    public <T> void OooO00o(T[] tArr, int i) {
        OooO00o(i);
        OooO00o((Object[]) tArr);
    }

    public <T> void OooO00o(T[] tArr) {
        if (tArr == null) {
            OooO0O0(-1);
            return;
        }
        int length = tArr.length;
        OooO0O0(length);
        if (length > 0) {
            int i = 0;
            int OooO00o2 = OooO00o((Object) tArr[0]);
            OooO0O0(OooO00o2);
            if (OooO00o2 == 1) {
                while (i < length) {
                    m14934OooO00o((AbstractC7313o0O0Oo0) tArr[i]);
                    i++;
                }
            } else if (OooO00o2 == 2) {
                while (i < length) {
                    OooO00o((Parcelable) tArr[i]);
                    i++;
                }
            } else if (OooO00o2 == 3) {
                while (i < length) {
                    OooO00o((Serializable) tArr[i]);
                    i++;
                }
            } else if (OooO00o2 == 4) {
                while (i < length) {
                    OooO00o((String) tArr[i]);
                    i++;
                }
            } else if (OooO00o2 == 5) {
                while (i < length) {
                    OooO00o((IBinder) tArr[i]);
                    i++;
                }
            }
        }
    }

    private <T> int OooO00o(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof AbstractC7313o0O0Oo0) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14935OooO00o(AbstractC7313o0O0Oo0 o0o0oo0, int i) {
        OooO00o(i);
        m14934OooO00o(o0o0oo0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14934OooO00o(AbstractC7313o0O0Oo0 o0o0oo0) {
        if (o0o0oo0 == null) {
            OooO00o((String) null);
            return;
        }
        OooO0O0(o0o0oo0);
        VersionedParcel OooO00o2 = m14918OooO00o();
        OooO00o(o0o0oo0, OooO00o2);
        OooO00o2.m14922OooO00o();
    }

    public void OooO00o(Serializable serializable, int i) {
        OooO00o(i);
        OooO00o(serializable);
    }

    private void OooO00o(Serializable serializable) {
        if (serializable == null) {
            OooO00o((String) null);
            return;
        }
        String name = serializable.getClass().getName();
        OooO00o(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            OooO00o(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + C3848l.f10402t, e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14936OooO00o(Exception exc, int i) {
        OooO00o(i);
        if (exc == null) {
            m14958OooO0O0();
            return;
        }
        int i2 = 0;
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i2 = -9;
        } else if (exc instanceof SecurityException) {
            i2 = -1;
        } else if (exc instanceof BadParcelableException) {
            i2 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i2 = -3;
        } else if (exc instanceof NullPointerException) {
            i2 = -4;
        } else if (exc instanceof IllegalStateException) {
            i2 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i2 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i2 = -7;
        }
        OooO0O0(i2);
        if (i2 != 0) {
            OooO00o(exc.getMessage());
            if (i2 == -9) {
                OooO00o((Parcelable) exc);
            }
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }

    public Exception OooO00o(Exception exc, int i) {
        int OooO0O02;
        return (m14941OooO00o(i) && (OooO0O02 = OooO0O0()) != 0) ? OooO0O0(OooO0O02, m14921OooO00o()) : exc;
    }

    @NonNull
    public static Throwable OooO00o(@NonNull Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private Exception OooO00o(int i, String str) {
        switch (i) {
            case -9:
                return (Exception) m14917OooO00o();
            case ErrorCode.UNKNOWN_ERROR /*{ENCODED_INT: -8}*/:
            default:
                return new RuntimeException("Unknown exception code: " + i + " msg " + str);
            case -7:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    public byte OooO00o(byte b, int i) {
        if (!m14941OooO00o(i)) {
            return b;
        }
        return (byte) (m14913OooO00o() & 255);
    }

    @RequiresApi(api = 21)
    public Size OooO00o(Size size, int i) {
        if (!m14941OooO00o(i)) {
            return size;
        }
        if (m14959OooO0O0()) {
            return new Size(m14913OooO00o(), m14913OooO00o());
        }
        return null;
    }

    @RequiresApi(api = 21)
    public SizeF OooO00o(SizeF sizeF, int i) {
        if (!m14941OooO00o(i)) {
            return sizeF;
        }
        if (m14959OooO0O0()) {
            return new SizeF(m14912OooO00o(), m14912OooO00o());
        }
        return null;
    }

    public SparseBooleanArray OooO00o(SparseBooleanArray sparseBooleanArray, int i) {
        if (!m14941OooO00o(i)) {
            return sparseBooleanArray;
        }
        int OooO00o2 = m14913OooO00o();
        if (OooO00o2 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(OooO00o2);
        for (int i2 = 0; i2 < OooO00o2; i2++) {
            sparseBooleanArray2.put(m14913OooO00o(), m14959OooO0O0());
        }
        return sparseBooleanArray2;
    }

    public <T> Set<T> OooO00o(Set<T> set, int i) {
        if (!m14941OooO00o(i)) {
            return set;
        }
        return (Set) OooO00o(i, new C6972o0000oOO());
    }

    public <T> List<T> OooO00o(List<T> list, int i) {
        if (!m14941OooO00o(i)) {
            return list;
        }
        return (List) OooO00o(i, new ArrayList());
    }

    private <T, S extends Collection<T>> S OooO00o(int i, S s) {
        int OooO00o2 = m14913OooO00o();
        if (OooO00o2 < 0) {
            return null;
        }
        if (OooO00o2 != 0) {
            int OooO00o3 = m14913OooO00o();
            if (OooO00o2 < 0) {
                return null;
            }
            if (OooO00o3 == 1) {
                while (OooO00o2 > 0) {
                    s.add(m14919OooO00o());
                    OooO00o2--;
                }
            } else if (OooO00o3 == 2) {
                while (OooO00o2 > 0) {
                    s.add(m14917OooO00o());
                    OooO00o2--;
                }
            } else if (OooO00o3 == 3) {
                while (OooO00o2 > 0) {
                    s.add(m14920OooO00o());
                    OooO00o2--;
                }
            } else if (OooO00o3 == 4) {
                while (OooO00o2 > 0) {
                    s.add(m14921OooO00o());
                    OooO00o2--;
                }
            } else if (OooO00o3 == 5) {
                while (OooO00o2 > 0) {
                    s.add(m14916OooO00o());
                    OooO00o2--;
                }
            }
        }
        return s;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T> T[] m14955OooO00o(T[] tArr, int i) {
        return !m14941OooO00o(i) ? tArr : (T[]) m14954OooO00o((Object[]) tArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T> T[] m14954OooO00o(T[] tArr) {
        int OooO00o2 = m14913OooO00o();
        if (OooO00o2 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(OooO00o2);
        if (OooO00o2 != 0) {
            int OooO00o3 = m14913OooO00o();
            if (OooO00o2 < 0) {
                return null;
            }
            if (OooO00o3 == 1) {
                while (OooO00o2 > 0) {
                    arrayList.add(m14919OooO00o());
                    OooO00o2--;
                }
            } else if (OooO00o3 == 2) {
                while (OooO00o2 > 0) {
                    arrayList.add(m14917OooO00o());
                    OooO00o2--;
                }
            } else if (OooO00o3 == 3) {
                while (OooO00o2 > 0) {
                    arrayList.add(m14920OooO00o());
                    OooO00o2--;
                }
            } else if (OooO00o3 == 4) {
                while (OooO00o2 > 0) {
                    arrayList.add(m14921OooO00o());
                    OooO00o2--;
                }
            } else if (OooO00o3 == 5) {
                while (OooO00o2 > 0) {
                    arrayList.add(m14916OooO00o());
                    OooO00o2--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public <T extends AbstractC7313o0O0Oo0> T OooO00o(T t, int i) {
        return !m14941OooO00o(i) ? t : (T) m14919OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T extends AbstractC7313o0O0Oo0> T m14919OooO00o() {
        String OooO00o2 = m14921OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        return (T) OooO00o(OooO00o2, m14918OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Serializable m14920OooO00o() {
        String OooO00o2 = m14921OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        try {
            return (Serializable) new OooO00o(new ByteArrayInputStream(m14943OooO00o())).readObject();
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + OooO00o2 + C3848l.f10402t, e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + OooO00o2 + C3848l.f10402t, e2);
        }
    }

    public static <T extends AbstractC7313o0O0Oo0> T OooO00o(String str, VersionedParcel versionedParcel) {
        try {
            return (T) ((AbstractC7313o0O0Oo0) Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class).invoke(null, versionedParcel));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public static <T extends AbstractC7313o0O0Oo0> void OooO00o(T t, VersionedParcel versionedParcel) {
        try {
            OooO00o((AbstractC7313o0O0Oo0) t).getDeclaredMethod("write", t.getClass(), VersionedParcel.class).invoke(null, t, versionedParcel);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public static <T extends AbstractC7313o0O0Oo0> Class OooO00o(T t) throws ClassNotFoundException {
        return OooO00o((Class<? extends AbstractC7313o0O0Oo0>) t.getClass());
    }

    public static Class OooO00o(Class<? extends AbstractC7313o0O0Oo0> cls) throws ClassNotFoundException {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }
}
