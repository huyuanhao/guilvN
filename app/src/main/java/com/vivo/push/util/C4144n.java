package com.vivo.push.util;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.p118pd.sdk.C7383o0OOO0O;
import com.umeng.message.proguard.C3848l;
import com.vivo.push.p280a.C4027a;
import com.vivo.push.p281b.C4050p;

/* renamed from: com.vivo.push.util.n */
public final class C4144n implements AbstractC4145o {

    /* renamed from: a */
    public static final String f11122a = (C3848l.f10401s + Process.myPid() + C3848l.f10402t);

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: a */
    public final int mo41193a(String str, String str2) {
        return Log.e("VivoPush." + str, f11122a + str2);
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: b */
    public final int mo41198b(String str, String str2) {
        return Log.w("VivoPush." + str, f11122a + str2);
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: c */
    public final int mo41201c(String str, String str2) {
        return Log.d("VivoPush." + str, f11122a + str2);
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: d */
    public final int mo41203d(String str, String str2) {
        if (!C4146p.m11210a()) {
            return -1;
        }
        return Log.i("VivoPush." + str, f11122a + str2);
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: e */
    public final int mo41204e(String str, String str2) {
        if (!C4146p.m11210a()) {
            return -1;
        }
        return Log.v("VivoPush." + str, f11122a + str2);
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: a */
    public final int mo41195a(String str, Throwable th) {
        return Log.e("VivoPush." + str, Log.getStackTraceString(th));
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: b */
    public final int mo41199b(String str, String str2, Throwable th) {
        if (!C4146p.m11210a()) {
            return -1;
        }
        return Log.i("VivoPush." + str, f11122a + str2, th);
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: c */
    public final void mo41202c(Context context, String str) {
        if (C4146p.m11210a()) {
            m11179a(context, str, 2);
        }
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: b */
    public final void mo41200b(Context context, String str) {
        if (C4146p.m11210a()) {
            m11179a(context, str, 1);
        }
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: a */
    public final int mo41194a(String str, String str2, Throwable th) {
        return Log.e("VivoPush." + str, f11122a + str2, th);
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: a */
    public final String mo41196a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    @Override // com.vivo.push.util.AbstractC4145o
    /* renamed from: a */
    public final void mo41197a(Context context, String str) {
        if (C4146p.m11210a()) {
            m11179a(context, str, 0);
        }
    }

    /* renamed from: a */
    private void m11179a(Context context, String str, int i) {
        C4050p pVar = new C4050p();
        pVar.mo40920b(str);
        pVar.mo40918a(i);
        if (i > 0) {
            mo41203d("LogController", str);
        }
        if (C4156z.m11262a(context)) {
            pVar.mo40919a(true);
            for (String str2 : C4149s.m11228c(context)) {
                m11178a(context, pVar, str2);
            }
            return;
        }
        pVar.mo40919a(false);
        m11178a(context, pVar, context.getPackageName());
    }

    /* renamed from: a */
    public static void m11178a(Context context, C4050p pVar, String str) {
        if (str.contains(C7383o0OOO0O.OooOOO0) || str.equals(C4149s.m11226b(context))) {
            C4027a.m10882a(context, pVar, str);
        }
    }
}
