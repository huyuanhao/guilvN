package com.p118pd.sdk;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.o00OoOOO  reason: case insensitive filesystem */
public class C7125o00OoOOO {
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f19472OooO00o;

    @RequiresApi(16)
    /* renamed from: com.pd.sdk.o00OoOOO$OooO00o */
    public static class OooO00o extends AccessibilityNodeProvider {
        public final C7125o00OoOOO OooO00o;

        public OooO00o(C7125o00OoOOO o00ooooo) {
            this.OooO00o = o00ooooo;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C7120o00OoOO OooO00o2 = this.OooO00o.OooO00o(i);
            if (OooO00o2 == null) {
                return null;
            }
            return OooO00o2.m18404OooO00o();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C7120o00OoOO> OooO00o2 = this.OooO00o.OooO00o(str, i);
            if (OooO00o2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = OooO00o2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(OooO00o2.get(i2).m18404OooO00o());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.OooO00o.OooO00o(i, i2, bundle);
        }
    }

    @RequiresApi(19)
    /* renamed from: com.pd.sdk.o00OoOOO$OooO0O0 */
    public static class OooO0O0 extends OooO00o {
        public OooO0O0(C7125o00OoOOO o00ooooo) {
            super(o00ooooo);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C7120o00OoOO OooO0O0 = this.OooO00o.OooO0O0(i);
            if (OooO0O0 == null) {
                return null;
            }
            return OooO0O0.m18404OooO00o();
        }
    }

    public C7125o00OoOOO() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            this.f19472OooO00o = new OooO0O0(this);
        } else if (i >= 16) {
            this.f19472OooO00o = new OooO00o(this);
        } else {
            this.f19472OooO00o = null;
        }
    }

    @Nullable
    public C7120o00OoOO OooO00o(int i) {
        return null;
    }

    public Object OooO00o() {
        return this.f19472OooO00o;
    }

    @Nullable
    public List<C7120o00OoOO> OooO00o(String str, int i) {
        return null;
    }

    public boolean OooO00o(int i, int i2, Bundle bundle) {
        return false;
    }

    @Nullable
    public C7120o00OoOO OooO0O0(int i) {
        return null;
    }

    public C7125o00OoOOO(Object obj) {
        this.f19472OooO00o = obj;
    }
}
