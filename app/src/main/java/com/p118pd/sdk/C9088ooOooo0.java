package com.p118pd.sdk;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.PointerEventsConfig;

/* renamed from: com.pd.sdk.ooOooo0  reason: case insensitive filesystem */
public class C9088ooOooo0 implements AbstractC9064ooOoo {

    /* renamed from: com.pd.sdk.ooOooo0$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.react.uimanager.PointerEvents[] r0 = com.facebook.react.uimanager.PointerEvents.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.C9088ooOooo0.OooO00o.OooO00o = r0
                com.facebook.react.uimanager.PointerEvents r1 = com.facebook.react.uimanager.PointerEvents.BOX_ONLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.C9088ooOooo0.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.uimanager.PointerEvents r1 = com.facebook.react.uimanager.PointerEvents.BOX_NONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.C9088ooOooo0.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.uimanager.PointerEvents r1 = com.facebook.react.uimanager.PointerEvents.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9088ooOooo0.OooO00o.<clinit>():void");
        }
    }

    @Override // com.p118pd.sdk.AbstractC9064ooOoo
    public PointerEventsConfig OooO00o(View view) {
        PointerEvents pointerEvents = view instanceof ReactPointerEventsView ? ((ReactPointerEventsView) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                return PointerEventsConfig.BOX_NONE;
            }
            if (pointerEvents == PointerEvents.BOX_ONLY) {
                return PointerEventsConfig.NONE;
            }
        }
        int i = OooO00o.OooO00o[pointerEvents.ordinal()];
        if (i == 1) {
            return PointerEventsConfig.BOX_ONLY;
        }
        if (i == 2) {
            return PointerEventsConfig.BOX_NONE;
        }
        if (i != 3) {
            return PointerEventsConfig.AUTO;
        }
        return PointerEventsConfig.NONE;
    }

    @Override // com.p118pd.sdk.AbstractC9064ooOoo
    public View OooO00o(ViewGroup viewGroup, int i) {
        if (viewGroup instanceof ReactViewGroup) {
            return viewGroup.getChildAt(((ReactViewGroup) viewGroup).getZIndexMappedChildIndex(i));
        }
        return viewGroup.getChildAt(i);
    }

    @Override // com.p118pd.sdk.AbstractC9064ooOoo
    public boolean OooO00o(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT < 18 || viewGroup.getClipChildren()) {
            return true;
        }
        if (viewGroup instanceof ReactViewGroup) {
            return ViewProps.HIDDEN.equals(((ReactViewGroup) viewGroup).getOverflow());
        }
        return false;
    }
}
