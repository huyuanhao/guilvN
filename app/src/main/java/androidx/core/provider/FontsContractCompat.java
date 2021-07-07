package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.FontResourcesParserCompat;
import com.p118pd.sdk.C6929o00;
import com.p118pd.sdk.C6980o000O000;
import com.p118pd.sdk.C6987o000O0o;
import com.p118pd.sdk.C7023o000o0o0;
import com.p118pd.sdk.C7033o000ooO;
import com.p118pd.sdk.C7066o00O0o0;
import com.p118pd.sdk.C7068o00O0o0O;
import com.p118pd.sdk.C7086o00OO0OO;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class FontsContractCompat {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C6980o000O000<String, Typeface> f14018OooO00o = new C6980o000O000<>(16);
    @GuardedBy("sLock")

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C6987o000O0o<String, ArrayList<C7068o00O0o0O.AbstractC7069OooO0Oo<OooO>>> f14019OooO00o = new C6987o000O0o<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C7068o00O0o0O f14020OooO00o = new C7068o00O0o0O("fonts", 10, 10000);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f14021OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f14022OooO00o = "FontsContractCompat";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Comparator<byte[]> f14023OooO00o = new C5037OooO0o0();
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int OooO0O0 = -2;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f14024OooO0O0 = "font_results";
    public static final int OooO0OO = 10000;

    public static class FontRequestCallback {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final int OooO00o = 0;
        public static final int OooO0O0 = -1;
        public static final int OooO0OO = -2;
        public static final int OooO0Oo = -3;
        public static final int OooO0o = 1;
        public static final int OooO0o0 = -4;
        public static final int OooO0oO = 2;
        public static final int OooO0oo = 3;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface FontRequestFailReason {
        }

        public void OooO00o(int i) {
        }

        public void OooO00o(Typeface typeface) {
        }
    }

    public static final class OooO {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Typeface f14025OooO00o;

        public OooO(@Nullable Typeface typeface, int i) {
            this.f14025OooO00o = typeface;
            this.OooO00o = i;
        }
    }

    public static class OooO00o implements Callable<OooO> {
        public final /* synthetic */ Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7066o00O0o0 f14026OooO00o;
        public final /* synthetic */ int o00oO0O;
        public final /* synthetic */ String o0ooOOo;

        public OooO00o(Context context, C7066o00O0o0 o00o0o0, int i, String str) {
            this.OooO00o = context;
            this.f14026OooO00o = o00o0o0;
            this.o00oO0O = i;
            this.o0ooOOo = str;
        }

        /* renamed from: OooO00o */
        public OooO call() throws Exception {
            OooO OooO00o2 = FontsContractCompat.OooO00o(this.OooO00o, this.f14026OooO00o, this.o00oO0O);
            Typeface typeface = OooO00o2.f14025OooO00o;
            if (typeface != null) {
                FontsContractCompat.f14018OooO00o.put(this.o0ooOOo, typeface);
            }
            return OooO00o2;
        }
    }

    public static class OooO0O0 implements C7068o00O0o0O.AbstractC7069OooO0Oo<OooO> {
        public final /* synthetic */ Handler OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7023o000o0o0.OooO00o f14027OooO00o;

        public OooO0O0(C7023o000o0o0.OooO00o oooO00o, Handler handler) {
            this.f14027OooO00o = oooO00o;
            this.OooO00o = handler;
        }

        public void OooO00o(OooO oooO) {
            if (oooO == null) {
                this.f14027OooO00o.OooO00o(1, this.OooO00o);
                return;
            }
            int i = oooO.OooO00o;
            if (i == 0) {
                this.f14027OooO00o.OooO00o(oooO.f14025OooO00o, this.OooO00o);
            } else {
                this.f14027OooO00o.OooO00o(i, this.OooO00o);
            }
        }
    }

    public static class OooO0OO implements C7068o00O0o0O.AbstractC7069OooO0Oo<OooO> {
        public final /* synthetic */ String OooO00o;

        public OooO0OO(String str) {
            this.OooO00o = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1.get(r0).OooO00o(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(androidx.core.provider.FontsContractCompat.OooO r5) {
            /*
                r4 = this;
                java.lang.Object r0 = androidx.core.provider.FontsContractCompat.f14021OooO00o
                monitor-enter(r0)
                com.pd.sdk.o000O0o<java.lang.String, java.util.ArrayList<com.pd.sdk.o00O0o0O$OooO0Oo<androidx.core.provider.FontsContractCompat$OooO>>> r1 = androidx.core.provider.FontsContractCompat.f14019OooO00o     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.OooO00o     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                com.pd.sdk.o000O0o<java.lang.String, java.util.ArrayList<com.pd.sdk.o00O0o0O$OooO0Oo<androidx.core.provider.FontsContractCompat$OooO>>> r2 = androidx.core.provider.FontsContractCompat.f14019OooO00o     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.OooO00o     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                com.pd.sdk.o00O0o0O$OooO0Oo r2 = (com.p118pd.sdk.C7068o00O0o0O.AbstractC7069OooO0Oo) r2
                r2.OooO00o(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)
                goto L_0x0031
            L_0x0030:
                throw r5
            L_0x0031:
                goto L_0x0030
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontsContractCompat.OooO0OO.OooO00o(androidx.core.provider.FontsContractCompat$OooO):void");
        }
    }

    /* renamed from: androidx.core.provider.FontsContractCompat$OooO0Oo  reason: case insensitive filesystem */
    public static class RunnableC5033OooO0Oo implements Runnable {
        public final /* synthetic */ Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Handler f14028OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ FontRequestCallback f14029OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7066o00O0o0 f14030OooO00o;

        /* renamed from: androidx.core.provider.FontsContractCompat$OooO0Oo$OooO */
        public class OooO implements Runnable {
            public final /* synthetic */ Typeface OooO00o;

            public OooO(Typeface typeface) {
                this.OooO00o = typeface;
            }

            public void run() {
                RunnableC5033OooO0Oo.this.f14029OooO00o.OooO00o(this.OooO00o);
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$OooO0Oo$OooO00o */
        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            public void run() {
                RunnableC5033OooO0Oo.this.f14029OooO00o.OooO00o(-1);
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$OooO0Oo$OooO0O0 */
        public class OooO0O0 implements Runnable {
            public OooO0O0() {
            }

            public void run() {
                RunnableC5033OooO0Oo.this.f14029OooO00o.OooO00o(-2);
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$OooO0Oo$OooO0OO */
        public class OooO0OO implements Runnable {
            public OooO0OO() {
            }

            public void run() {
                RunnableC5033OooO0Oo.this.f14029OooO00o.OooO00o(-3);
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$OooO0Oo$OooO0Oo  reason: collision with other inner class name */
        public class RunnableC4885OooO0Oo implements Runnable {
            public RunnableC4885OooO0Oo() {
            }

            public void run() {
                RunnableC5033OooO0Oo.this.f14029OooO00o.OooO00o(-3);
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$OooO0Oo$OooO0o */
        public class OooO0o implements Runnable {
            public OooO0o() {
            }

            public void run() {
                RunnableC5033OooO0Oo.this.f14029OooO00o.OooO00o(-3);
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$OooO0Oo$OooO0o0  reason: case insensitive filesystem */
        public class RunnableC5034OooO0o0 implements Runnable {
            public RunnableC5034OooO0o0() {
            }

            public void run() {
                RunnableC5033OooO0Oo.this.f14029OooO00o.OooO00o(1);
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$OooO0Oo$OooO0oO  reason: case insensitive filesystem */
        public class RunnableC5035OooO0oO implements Runnable {
            public final /* synthetic */ int o00oO0O;

            public RunnableC5035OooO0oO(int i) {
                this.o00oO0O = i;
            }

            public void run() {
                RunnableC5033OooO0Oo.this.f14029OooO00o.OooO00o(this.o00oO0O);
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$OooO0Oo$OooO0oo  reason: case insensitive filesystem */
        public class RunnableC5036OooO0oo implements Runnable {
            public RunnableC5036OooO0oo() {
            }

            public void run() {
                RunnableC5033OooO0Oo.this.f14029OooO00o.OooO00o(-3);
            }
        }

        public RunnableC5033OooO0Oo(Context context, C7066o00O0o0 o00o0o0, Handler handler, FontRequestCallback fontRequestCallback) {
            this.OooO00o = context;
            this.f14030OooO00o = o00o0o0;
            this.f14028OooO00o = handler;
            this.f14029OooO00o = fontRequestCallback;
        }

        public void run() {
            try {
                C5038OooO0oO OooO00o2 = FontsContractCompat.OooO00o(this.OooO00o, (CancellationSignal) null, this.f14030OooO00o);
                if (OooO00o2.OooO00o() != 0) {
                    int OooO00o3 = OooO00o2.OooO00o();
                    if (OooO00o3 == 1) {
                        this.f14028OooO00o.post(new OooO0O0());
                    } else if (OooO00o3 != 2) {
                        this.f14028OooO00o.post(new RunnableC4885OooO0Oo());
                    } else {
                        this.f14028OooO00o.post(new OooO0OO());
                    }
                } else {
                    C5039OooO0oo[] OooO00o4 = OooO00o2.m14559OooO00o();
                    if (OooO00o4 == null || OooO00o4.length == 0) {
                        this.f14028OooO00o.post(new RunnableC5034OooO0o0());
                        return;
                    }
                    for (C5039OooO0oo oooO0oo : OooO00o4) {
                        if (oooO0oo.OooO00o() != 0) {
                            int OooO00o5 = oooO0oo.OooO00o();
                            if (OooO00o5 < 0) {
                                this.f14028OooO00o.post(new OooO0o());
                                return;
                            } else {
                                this.f14028OooO00o.post(new RunnableC5035OooO0oO(OooO00o5));
                                return;
                            }
                        }
                    }
                    Typeface OooO00o6 = FontsContractCompat.OooO00o(this.OooO00o, (CancellationSignal) null, OooO00o4);
                    if (OooO00o6 == null) {
                        this.f14028OooO00o.post(new RunnableC5036OooO0oo());
                    } else {
                        this.f14028OooO00o.post(new OooO(OooO00o6));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f14028OooO00o.post(new OooO00o());
            }
        }
    }

    public static final class OooO0o implements BaseColumns {
        public static final int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static final String f14032OooO00o = "file_id";
        public static final int OooO0O0 = 1;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public static final String f14033OooO0O0 = "font_ttc_index";
        public static final int OooO0OO = 2;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public static final String f14034OooO0OO = "font_variation_settings";
        public static final int OooO0Oo = 3;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public static final String f14035OooO0Oo = "font_weight";
        public static final String OooO0o = "result_code";
        public static final String OooO0o0 = "font_italic";
    }

    /* renamed from: androidx.core.provider.FontsContractCompat$OooO0o0  reason: case insensitive filesystem */
    public static class C5037OooO0o0 implements Comparator<byte[]> {
        /* renamed from: OooO00o */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    }
                }
                return 0;
            }
            return (i2 == 1 ? 1 : 0) - (i == 1 ? 1 : 0);
        }
    }

    /* renamed from: androidx.core.provider.FontsContractCompat$OooO0oO  reason: case insensitive filesystem */
    public static class C5038OooO0oO {
        public static final int OooO0O0 = 0;
        public static final int OooO0OO = 1;
        public static final int OooO0Oo = 2;
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C5039OooO0oo[] f14036OooO00o;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public C5038OooO0oO(int i, @Nullable C5039OooO0oo[] oooO0ooArr) {
            this.OooO00o = i;
            this.f14036OooO00o = oooO0ooArr;
        }

        public int OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C5039OooO0oo[] m14559OooO00o() {
            return this.f14036OooO00o;
        }
    }

    /* renamed from: androidx.core.provider.FontsContractCompat$OooO0oo  reason: case insensitive filesystem */
    public static class C5039OooO0oo {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Uri f14037OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f14038OooO00o;
        public final int OooO0O0;
        public final int OooO0OO;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public C5039OooO0oo(@NonNull Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, mo605to = 1000) int i2, boolean z, int i3) {
            this.f14037OooO00o = (Uri) C7086o00OO0OO.OooO00o(uri);
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.f14038OooO00o = z;
            this.OooO0OO = i3;
        }

        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Uri m14560OooO00o() {
            return this.f14037OooO00o;
        }

        @IntRange(from = 0)
        public int OooO0O0() {
            return this.OooO00o;
        }

        @IntRange(from = 1, mo605to = 1000)
        public int OooO0OO() {
            return this.OooO0O0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14561OooO00o() {
            return this.f14038OooO00o;
        }

        public int OooO00o() {
            return this.OooO0OO;
        }
    }

    @NonNull
    public static OooO OooO00o(Context context, C7066o00O0o0 o00o0o0, int i) {
        try {
            C5038OooO0oO OooO00o2 = OooO00o(context, (CancellationSignal) null, o00o0o0);
            int i2 = -3;
            if (OooO00o2.OooO00o() == 0) {
                Typeface OooO00o3 = C7033o000ooO.OooO00o(context, null, OooO00o2.m14559OooO00o(), i);
                if (OooO00o3 != null) {
                    i2 = 0;
                }
                return new OooO(OooO00o3, i2);
            }
            if (OooO00o2.OooO00o() == 1) {
                i2 = -2;
            }
            return new OooO(null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new OooO(null, -1);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO00o() {
        f14018OooO00o.evictAll();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Typeface OooO00o(Context context, C7066o00O0o0 o00o0o0, @Nullable C7023o000o0o0.OooO00o oooO00o, @Nullable Handler handler, boolean z, int i, int i2) {
        OooO0O0 oooO0O0;
        String str = o00o0o0.m18345OooO00o() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i2;
        Typeface typeface = f14018OooO00o.get(str);
        if (typeface != null) {
            if (oooO00o != null) {
                oooO00o.OooO00o(typeface);
            }
            return typeface;
        } else if (!z || i != -1) {
            OooO00o oooO00o2 = new OooO00o(context, o00o0o0, i2, str);
            if (z) {
                try {
                    return ((OooO) f14020OooO00o.OooO00o(oooO00o2, i)).f14025OooO00o;
                } catch (InterruptedException unused) {
                    return null;
                }
            } else {
                if (oooO00o == null) {
                    oooO0O0 = null;
                } else {
                    oooO0O0 = new OooO0O0(oooO00o, handler);
                }
                synchronized (f14021OooO00o) {
                    if (f14019OooO00o.containsKey(str)) {
                        if (oooO0O0 != null) {
                            f14019OooO00o.get(str).add(oooO0O0);
                        }
                        return null;
                    }
                    if (oooO0O0 != null) {
                        ArrayList<C7068o00O0o0O.AbstractC7069OooO0Oo<OooO>> arrayList = new ArrayList<>();
                        arrayList.add(oooO0O0);
                        f14019OooO00o.put(str, arrayList);
                    }
                    f14020OooO00o.OooO00o(oooO00o2, new OooO0OO(str));
                    return null;
                }
            }
        } else {
            OooO OooO00o2 = OooO00o(context, o00o0o0, i2);
            if (oooO00o != null) {
                int i3 = OooO00o2.OooO00o;
                if (i3 == 0) {
                    oooO00o.OooO00o(OooO00o2.f14025OooO00o, handler);
                } else {
                    oooO00o.OooO00o(i3, handler);
                }
            }
            return OooO00o2.f14025OooO00o;
        }
    }

    public static void OooO00o(@NonNull Context context, @NonNull C7066o00O0o0 o00o0o0, @NonNull FontRequestCallback fontRequestCallback, @NonNull Handler handler) {
        handler.post(new RunnableC5033OooO0Oo(context, o00o0o0, new Handler(), fontRequestCallback));
    }

    @Nullable
    public static Typeface OooO00o(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull C5039OooO0oo[] oooO0ooArr) {
        return C7033o000ooO.OooO00o(context, cancellationSignal, oooO0ooArr, 0);
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Map<Uri, ByteBuffer> OooO00o(Context context, C5039OooO0oo[] oooO0ooArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C5039OooO0oo oooO0oo : oooO0ooArr) {
            if (oooO0oo.OooO00o() == 0) {
                Uri OooO00o2 = oooO0oo.m14560OooO00o();
                if (!hashMap.containsKey(OooO00o2)) {
                    hashMap.put(OooO00o2, C6929o00.OooO00o(context, cancellationSignal, OooO00o2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @NonNull
    public static C5038OooO0oO OooO00o(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull C7066o00O0o0 o00o0o0) throws PackageManager.NameNotFoundException {
        ProviderInfo OooO00o2 = OooO00o(context.getPackageManager(), o00o0o0, context.getResources());
        if (OooO00o2 == null) {
            return new C5038OooO0oO(1, null);
        }
        return new C5038OooO0oO(0, OooO00o(context, o00o0o0, OooO00o2.authority, cancellationSignal));
    }

    @VisibleForTesting
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static ProviderInfo OooO00o(@NonNull PackageManager packageManager, @NonNull C7066o00O0o0 o00o0o0, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        String OooO0O02 = o00o0o0.OooO0O0();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(OooO0O02, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + OooO0O02);
        } else if (resolveContentProvider.packageName.equals(o00o0o0.OooO0OO())) {
            List<byte[]> OooO00o2 = OooO00o(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(OooO00o2, f14023OooO00o);
            List<List<byte[]>> OooO00o3 = OooO00o(o00o0o0, resources);
            for (int i = 0; i < OooO00o3.size(); i++) {
                ArrayList arrayList = new ArrayList(OooO00o3.get(i));
                Collections.sort(arrayList, f14023OooO00o);
                if (OooO00o(OooO00o2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + OooO0O02 + ", but package was not " + o00o0o0.OooO0OO());
        }
    }

    public static List<List<byte[]>> OooO00o(C7066o00O0o0 o00o0o0, Resources resources) {
        if (o00o0o0.m18346OooO00o() != null) {
            return o00o0o0.m18346OooO00o();
        }
        return FontResourcesParserCompat.OooO00o(resources, o00o0o0.OooO00o());
    }

    public static boolean OooO00o(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List<byte[]> OooO00o(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014b  */
    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.provider.FontsContractCompat.C5039OooO0oo[] OooO00o(android.content.Context r23, com.p118pd.sdk.C7066o00O0o0 r24, java.lang.String r25, android.os.CancellationSignal r26) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontsContractCompat.OooO00o(android.content.Context, com.pd.sdk.o00O0o0, java.lang.String, android.os.CancellationSignal):androidx.core.provider.FontsContractCompat$OooO0oo[]");
    }
}
