package com.qiyukf.nimlib.p180e.p181a;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p183g.p191c.C2289a;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2295b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qiyukf.nimlib.e.a.a */
public final class C2227a implements Parcelable {
    public static final Parcelable.Creator<C2227a> CREATOR = new Parcelable.Creator<C2227a>() {
        /* class com.qiyukf.nimlib.p180e.p181a.C2227a.C22281 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C2227a createFromParcel(Parcel parcel) {
            C2227a a = C2230b.m4647a(parcel);
            if (a != null) {
                a.f4438d.flip();
            }
            return a;
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C2227a[] newArray(int i) {
            return new C2227a[i];
        }
    };

    /* renamed from: a */
    public int f4435a;

    /* renamed from: b */
    public int f4436b;

    /* renamed from: c */
    public ByteBuffer f4437c;

    /* renamed from: d */
    public ByteBuffer f4438d;

    /* renamed from: com.qiyukf.nimlib.e.a.a$a */
    public static final class C2229a {

        /* renamed from: a */
        public static AtomicInteger f4439a = new AtomicInteger(0);

        /* renamed from: a */
        public static int m4646a() {
            return f4439a.incrementAndGet();
        }
    }

    /* renamed from: com.qiyukf.nimlib.e.a.a$b */
    public static class C2230b {

        /* renamed from: a */
        public static SparseArray<C2227a> f4440a = new SparseArray<>();

        /* JADX WARNING: Removed duplicated region for block: B:16:0x006e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.qiyukf.nimlib.p180e.p181a.C2227a m4647a(android.os.Parcel r4) {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p180e.p181a.C2227a.C2230b.m4647a(android.os.Parcel):com.qiyukf.nimlib.e.a.a");
        }

        /* renamed from: a */
        public static List<C2227a> m4648a(C2227a aVar) {
            aVar.f4436b = C2227a.m4639b(aVar);
            int i = ((aVar.f4436b - 1) / 131072) + 1;
            ArrayList arrayList = new ArrayList(i);
            arrayList.add(aVar);
            for (int i2 = 1; i2 < i; i2++) {
                C2227a aVar2 = new C2227a((byte) 0);
                aVar2.f4435a = aVar.f4435a;
                aVar2.f4438d = aVar.f4438d.duplicate();
                aVar2.f4438d.position(aVar.f4438d.position() + (i2 * 131072));
                arrayList.add(aVar2);
            }
            return arrayList;
        }

        /* renamed from: a */
        public static void m4649a(Parcel parcel, C2227a aVar) {
            parcel.writeInt(aVar.f4435a);
            if (aVar.f4437c == null || aVar.f4437c.remaining() <= 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(aVar.f4437c.limit());
                parcel.writeByteArray(aVar.f4437c.array(), 0, aVar.f4437c.limit());
            }
            parcel.writeInt(aVar.f4436b);
            if (aVar.f4438d.remaining() > 0) {
                int min = Math.min(aVar.f4438d.remaining(), 131072);
                parcel.writeInt(min);
                C2227a.m4638a(parcel, aVar.f4438d.array(), aVar.f4438d.position(), min);
                return;
            }
            parcel.writeInt(0);
        }

        /* renamed from: b */
        public static boolean m4650b(C2227a aVar) {
            if (aVar.f4438d.capacity() != 0) {
                return aVar.f4436b > 0 && aVar.f4438d.position() == aVar.f4436b;
            }
            return true;
        }
    }

    public C2227a() {
    }

    public /* synthetic */ C2227a(byte b) {
        this();
    }

    public C2227a(AbstractC2131a aVar) {
        this.f4435a = C2229a.m4646a();
        C2295b bVar = new C2295b();
        aVar.mo34667a().mo34937a(bVar);
        this.f4437c = bVar.mo34972b();
        C2295b b = aVar.mo34669b();
        this.f4438d = b != null ? b.mo34972b() : ByteBuffer.allocate(0);
    }

    public C2227a(AbstractC2148a.C2149a aVar) {
        this.f4435a = C2229a.m4646a();
        C2295b bVar = new C2295b();
        aVar.f4312a.mo34937a(bVar);
        this.f4437c = bVar.mo34972b();
        C2299f fVar = aVar.f4313b;
        this.f4438d = fVar != null ? fVar.mo34977b() : ByteBuffer.allocate(0);
    }

    /* renamed from: a */
    public static /* synthetic */ void m4638a(Parcel parcel, byte[] bArr, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 11) {
            parcel.writeByteArray(bArr, i, i2);
            return;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        parcel.writeByteArray(bArr2);
    }

    /* renamed from: b */
    public static /* synthetic */ int m4639b(C2227a aVar) {
        return aVar.f4438d.remaining();
    }

    /* renamed from: a */
    public final List<C2227a> mo34846a() {
        return C2230b.m4648a(this);
    }

    /* renamed from: b */
    public final C2289a mo34847b() {
        if (this.f4437c == null) {
            return null;
        }
        C2289a aVar = new C2289a();
        aVar.mo34938a(new C2299f(this.f4437c));
        return aVar;
    }

    /* renamed from: c */
    public final ByteBuffer mo34848c() {
        return this.f4438d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C2230b.m4649a(parcel, this);
    }
}
