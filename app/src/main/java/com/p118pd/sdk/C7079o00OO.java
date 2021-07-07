package com.p118pd.sdk;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.pd.sdk.o00OO  reason: case insensitive filesystem */
public class C7079o00OO {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View.OnLongClickListener f19402OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View.OnTouchListener f19403OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View f19404OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f19405OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19406OooO00o;
    public int OooO0O0;

    /* renamed from: com.pd.sdk.o00OO$OooO00o */
    public class OooO00o implements View.OnLongClickListener {
        public OooO00o() {
        }

        public boolean onLongClick(View view) {
            return C7079o00OO.this.OooO00o(view);
        }
    }

    /* renamed from: com.pd.sdk.o00OO$OooO0O0 */
    public class OooO0O0 implements View.OnTouchListener {
        public OooO0O0() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return C7079o00OO.this.OooO00o(view, motionEvent);
        }
    }

    /* renamed from: com.pd.sdk.o00OO$OooO0OO */
    public interface OooO0OO {
        boolean OooO00o(View view, C7079o00OO o00oo);
    }

    public C7079o00OO(View view, OooO0OO oooO0OO) {
        this.f19404OooO00o = view;
        this.f19405OooO00o = oooO0OO;
    }

    public void OooO00o() {
        this.f19404OooO00o.setOnLongClickListener(this.f19402OooO00o);
        this.f19404OooO00o.setOnTouchListener(this.f19403OooO00o);
    }

    public void OooO0O0() {
        this.f19404OooO00o.setOnLongClickListener(null);
        this.f19404OooO00o.setOnTouchListener(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2 != 3) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO00o(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L_0x0049
            r4 = 1
            if (r2 == r4) goto L_0x0046
            r5 = 2
            if (r2 == r5) goto L_0x001b
            r7 = 3
            if (r2 == r7) goto L_0x0046
            goto L_0x004d
        L_0x001b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = com.p118pd.sdk.C7099o00OOOo0.m18374OooO00o(r8, r2)
            if (r2 == 0) goto L_0x004d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L_0x002b
            goto L_0x004d
        L_0x002b:
            boolean r8 = r6.f19406OooO00o
            if (r8 == 0) goto L_0x0030
            goto L_0x004d
        L_0x0030:
            int r8 = r6.OooO00o
            if (r8 != r0) goto L_0x0039
            int r8 = r6.OooO0O0
            if (r8 != r1) goto L_0x0039
            goto L_0x004d
        L_0x0039:
            r6.OooO00o = r0
            r6.OooO0O0 = r1
            com.pd.sdk.o00OO$OooO0OO r8 = r6.f19405OooO00o
            boolean r7 = r8.OooO00o(r7, r6)
            r6.f19406OooO00o = r7
            return r7
        L_0x0046:
            r6.f19406OooO00o = r3
            goto L_0x004d
        L_0x0049:
            r6.OooO00o = r0
            r6.OooO0O0 = r1
        L_0x004d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7079o00OO.OooO00o(android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean OooO00o(View view) {
        return this.f19405OooO00o.OooO00o(view, this);
    }

    public void OooO00o(Point point) {
        point.set(this.OooO00o, this.OooO0O0);
    }
}
