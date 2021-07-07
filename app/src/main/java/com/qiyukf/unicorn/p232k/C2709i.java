package com.qiyukf.unicorn.p232k;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C7009o000OoOo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qiyukf.unicorn.k.i */
public final class C2709i {

    /* renamed from: a */
    public static AtomicInteger f5613a = new AtomicInteger(0);

    /* renamed from: b */
    public static SparseArray<AbstractC2710a> f5614b = new SparseArray<>();

    /* renamed from: c */
    public static Set<String> f5615c;

    /* renamed from: d */
    public Object f5616d;

    /* renamed from: e */
    public String[] f5617e;

    /* renamed from: f */
    public AbstractC2710a f5618f;

    /* renamed from: com.qiyukf.unicorn.k.i$a */
    public interface AbstractC2710a {
        void onDenied();

        void onGranted();
    }

    public C2709i(Object obj) {
        this.f5616d = obj;
    }

    /* renamed from: a */
    public static C2709i m6263a(@NonNull Activity activity) {
        return new C2709i(activity);
    }

    /* renamed from: a */
    public static C2709i m6264a(@NonNull Fragment fragment) {
        return new C2709i(fragment);
    }

    /* renamed from: a */
    public static List<String> m6265a(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (C7009o000OoOo.OooO00o(context, str) != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m6266a(int i, @NonNull int[] iArr) {
        AbstractC2710a aVar = f5614b.get(i);
        if (aVar != null) {
            f5614b.remove(i);
            for (int i2 : iArr) {
                if (i2 != 0) {
                    aVar.onDenied();
                    return;
                }
            }
            aVar.onGranted();
        }
    }

    /* renamed from: a */
    public static synchronized void m6267a(Context context) {
        synchronized (C2709i.class) {
            if (f5615c == null) {
                f5615c = new HashSet();
                try {
                    Collections.addAll(f5615c, context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final C2709i mo36468a(@Nullable AbstractC2710a aVar) {
        this.f5618f = aVar;
        return this;
    }

    /* renamed from: a */
    public final C2709i mo36469a(@NonNull String... strArr) {
        this.f5617e = strArr;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36470a() {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p232k.C2709i.mo36470a():void");
    }
}
