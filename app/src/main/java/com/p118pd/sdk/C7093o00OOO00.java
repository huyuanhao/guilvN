package com.p118pd.sdk;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: com.pd.sdk.o00OOO00  reason: case insensitive filesystem */
public final class C7093o00OOO00 {
    public final OooO00o OooO00o;

    /* renamed from: com.pd.sdk.o00OOO00$OooO00o */
    public interface OooO00o {
        void OooO00o(boolean z);

        boolean OooO00o();

        boolean onTouchEvent(MotionEvent motionEvent);

        void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener);
    }

    /* renamed from: com.pd.sdk.o00OOO00$OooO0O0 */
    public static class OooO0O0 implements OooO00o {
        public static final int OooO = 2;
        public static final int OooO0o = ViewConfiguration.getTapTimeout();
        public static final int OooO0o0 = ViewConfiguration.getLongPressTimeout();
        public static final int OooO0oO = ViewConfiguration.getDoubleTapTimeout();
        public static final int OooO0oo = 1;
        public static final int OooOO0 = 3;
        public float OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f19421OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Handler f19422OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public GestureDetector.OnDoubleTapListener f19423OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final GestureDetector.OnGestureListener f19424OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public MotionEvent f19425OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public VelocityTracker f19426OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f19427OooO00o;
        public float OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int f19428OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public MotionEvent f19429OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f19430OooO0O0;
        public float OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public int f19431OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f19432OooO0OO;
        public float OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public int f19433OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f19434OooO0Oo;

        /* renamed from: OooO0o  reason: collision with other field name */
        public boolean f19435OooO0o;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f19436OooO0o0;

        /* renamed from: OooO0oO  reason: collision with other field name */
        public boolean f19437OooO0oO;

        public OooO0O0(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f19422OooO00o = new OooO00o(handler);
            } else {
                this.f19422OooO00o = new OooO00o();
            }
            this.f19424OooO00o = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                setOnDoubleTapListener((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            OooO00o(context);
        }

        private void OooO00o(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f19424OooO00o != null) {
                this.f19437OooO0oO = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f19431OooO0OO = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f19433OooO0Oo = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f19421OooO00o = scaledTouchSlop * scaledTouchSlop;
                this.f19428OooO0O0 = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        private void OooO0O0() {
            this.f19422OooO00o.removeMessages(1);
            this.f19422OooO00o.removeMessages(2);
            this.f19422OooO00o.removeMessages(3);
            this.f19426OooO00o.recycle();
            this.f19426OooO00o = null;
            this.f19435OooO0o = false;
            this.f19427OooO00o = false;
            this.f19434OooO0Oo = false;
            this.f19436OooO0o0 = false;
            this.f19430OooO0O0 = false;
            if (this.f19432OooO0OO) {
                this.f19432OooO0OO = false;
            }
        }

        private void OooO0OO() {
            this.f19422OooO00o.removeMessages(1);
            this.f19422OooO00o.removeMessages(2);
            this.f19422OooO00o.removeMessages(3);
            this.f19435OooO0o = false;
            this.f19434OooO0Oo = false;
            this.f19436OooO0o0 = false;
            this.f19430OooO0O0 = false;
            if (this.f19432OooO0OO) {
                this.f19432OooO0OO = false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        @Override // com.p118pd.sdk.C7093o00OOO00.OooO00o
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            /*
            // Method dump skipped, instructions count: 591
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7093o00OOO00.OooO0O0.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override // com.p118pd.sdk.C7093o00OOO00.OooO00o
        public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f19423OooO00o = onDoubleTapListener;
        }

        /* renamed from: com.pd.sdk.o00OOO00$OooO0O0$OooO00o */
        public class OooO00o extends Handler {
            public OooO00o() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    OooO0O0 oooO0O0 = OooO0O0.this;
                    oooO0O0.f19424OooO00o.onShowPress(oooO0O0.f19425OooO00o);
                } else if (i == 2) {
                    OooO0O0.this.OooO00o();
                } else if (i == 3) {
                    OooO0O0 oooO0O02 = OooO0O0.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = oooO0O02.f19423OooO00o;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!oooO0O02.f19427OooO00o) {
                        onDoubleTapListener.onSingleTapConfirmed(oooO0O02.f19425OooO00o);
                    } else {
                        oooO0O02.f19430OooO0O0 = true;
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }

            public OooO00o(Handler handler) {
                super(handler.getLooper());
            }
        }

        @Override // com.p118pd.sdk.C7093o00OOO00.OooO00o
        public void OooO00o(boolean z) {
            this.f19437OooO0oO = z;
        }

        @Override // com.p118pd.sdk.C7093o00OOO00.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18370OooO00o() {
            return this.f19437OooO0oO;
        }

        private boolean OooO00o(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f19436OooO0o0 || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) OooO0oO)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f19428OooO0O0) {
                return true;
            }
            return false;
        }

        @Override // com.p118pd.sdk.C7093o00OOO00.OooO00o
        public void OooO00o() {
            this.f19422OooO00o.removeMessages(3);
            this.f19430OooO0O0 = false;
            this.f19432OooO0OO = true;
            this.f19424OooO00o.onLongPress(this.f19425OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o00OOO00$OooO0OO */
    public static class OooO0OO implements OooO00o {
        public final GestureDetector OooO00o;

        public OooO0OO(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.OooO00o = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // com.p118pd.sdk.C7093o00OOO00.OooO00o
        public boolean OooO00o() {
            return this.OooO00o.isLongpressEnabled();
        }

        @Override // com.p118pd.sdk.C7093o00OOO00.OooO00o
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.OooO00o.onTouchEvent(motionEvent);
        }

        @Override // com.p118pd.sdk.C7093o00OOO00.OooO00o
        public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.OooO00o.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // com.p118pd.sdk.C7093o00OOO00.OooO00o
        public void OooO00o(boolean z) {
            this.OooO00o.setIsLongpressEnabled(z);
        }
    }

    public C7093o00OOO00(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean OooO00o() {
        return this.OooO00o.OooO00o();
    }

    public C7093o00OOO00(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.OooO00o = new OooO0OO(context, onGestureListener, handler);
        } else {
            this.OooO00o = new OooO0O0(context, onGestureListener, handler);
        }
    }

    public boolean OooO00o(MotionEvent motionEvent) {
        return this.OooO00o.onTouchEvent(motionEvent);
    }

    public void OooO00o(boolean z) {
        this.OooO00o.OooO00o(z);
    }

    public void OooO00o(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.OooO00o.setOnDoubleTapListener(onDoubleTapListener);
    }
}
