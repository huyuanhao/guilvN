package com.p118pd.sdk;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o00Ooooo  reason: case insensitive filesystem */
public class C7141o00Ooooo extends AbstractView$OnTouchListenerC7135o00Ooo0o {
    public final ListView OooO00o;

    public C7141o00Ooooo(@NonNull ListView listView) {
        super(listView);
        this.OooO00o = listView;
    }

    @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC7135o00Ooo0o
    public void OooO00o(int i, int i2) {
        C7146o00o0000.OooO00o(this.OooO00o, i2);
    }

    @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC7135o00Ooo0o, com.p118pd.sdk.AbstractView$OnTouchListenerC7135o00Ooo0o
    public boolean OooO00o(int i) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[RETURN] */
    @Override // com.p118pd.sdk.AbstractView$OnTouchListenerC7135o00Ooo0o, com.p118pd.sdk.AbstractView$OnTouchListenerC7135o00Ooo0o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO0O0(int r8) {
        /*
            r7 = this;
            android.widget.ListView r0 = r7.OooO00o
            int r1 = r0.getCount()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r3 = r0.getChildCount()
            int r4 = r0.getFirstVisiblePosition()
            int r5 = r4 + r3
            r6 = 1
            if (r8 <= 0) goto L_0x0029
            if (r5 < r1) goto L_0x0038
            int r3 = r3 - r6
            android.view.View r8 = r0.getChildAt(r3)
            int r8 = r8.getBottom()
            int r0 = r0.getHeight()
            if (r8 > r0) goto L_0x0038
            return r2
        L_0x0029:
            if (r8 >= 0) goto L_0x0039
            if (r4 > 0) goto L_0x0038
            android.view.View r8 = r0.getChildAt(r2)
            int r8 = r8.getTop()
            if (r8 < 0) goto L_0x0038
            return r2
        L_0x0038:
            return r6
        L_0x0039:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7141o00Ooooo.OooO0O0(int):boolean");
    }
}
