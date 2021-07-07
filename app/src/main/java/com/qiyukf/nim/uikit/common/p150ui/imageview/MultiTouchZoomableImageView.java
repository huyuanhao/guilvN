package com.qiyukf.nim.uikit.common.p150ui.imageview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.qiyukf.basesdk.p119a.C1709a;

/* renamed from: com.qiyukf.nim.uikit.common.ui.imageview.MultiTouchZoomableImageView */
public class MultiTouchZoomableImageView extends BaseZoomableImageView {

    /* renamed from: d */
    public boolean f3653d = false;

    /* renamed from: e */
    public GestureDetector f3654e;

    /* renamed from: f */
    public ScaleGestureDetector f3655f;

    /* renamed from: g */
    public boolean f3656g = false;

    /* renamed from: com.qiyukf.nim.uikit.common.ui.imageview.MultiTouchZoomableImageView$a */
    public class C1921a extends GestureDetector.SimpleOnGestureListener {
        public C1921a() {
        }

        public /* synthetic */ C1921a(MultiTouchZoomableImageView multiTouchZoomableImageView, byte b) {
            this();
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (MultiTouchZoomableImageView.this.mo34284d() != MultiTouchZoomableImageView.this.mo34286f()) {
                MultiTouchZoomableImageView multiTouchZoomableImageView = MultiTouchZoomableImageView.this;
                multiTouchZoomableImageView.mo34272a(multiTouchZoomableImageView.mo34286f());
                return true;
            }
            MultiTouchZoomableImageView multiTouchZoomableImageView2 = MultiTouchZoomableImageView.this;
            multiTouchZoomableImageView2.mo34281b(multiTouchZoomableImageView2.mo34286f() * 3.0f, motionEvent.getX(), motionEvent.getY());
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            StringBuilder sb;
            Throwable e;
            if ((motionEvent != null && motionEvent.getPointerCount() > 1) || ((motionEvent2 != null && motionEvent2.getPointerCount() > 1) || MultiTouchZoomableImageView.this.f3655f.isInProgress())) {
                return false;
            }
            if ((motionEvent.getX() - motionEvent2.getX() <= 100.0f || Math.abs(f) <= 200.0f) && ((motionEvent2.getX() - motionEvent.getX() <= 100.0f || Math.abs(f) <= 200.0f) && ((motionEvent.getY() - motionEvent2.getY() <= 100.0f || Math.abs(f2) <= 200.0f) && motionEvent2.getY() - motionEvent.getY() > 100.0f && Math.abs(f2) > 200.0f))) {
                MultiTouchZoomableImageView multiTouchZoomableImageView = MultiTouchZoomableImageView.this;
                if (!multiTouchZoomableImageView.f3653d && multiTouchZoomableImageView.mo34284d() <= MultiTouchZoomableImageView.this.mo34286f()) {
                    MultiTouchZoomableImageView.this.f3604b.mo34329c();
                    return true;
                }
            }
            try {
                float x = motionEvent2.getX() - motionEvent.getX();
                float y = motionEvent2.getY() - motionEvent.getY();
                if (Math.abs(f) > 800.0f || Math.abs(f2) > 800.0f) {
                    MultiTouchZoomableImageView.this.mo34280b(x / 2.0f, y / 2.0f);
                    MultiTouchZoomableImageView.this.invalidate();
                }
            } catch (NullPointerException e2) {
                e = e2;
                sb = new StringBuilder("diffX:");
                sb.append(e);
                C1709a.m3015b("MultiTouchZoomableImageView onFing error", sb.toString(), e);
                return super.onFling(motionEvent, motionEvent2, f, f2);
            } catch (IllegalArgumentException e3) {
                e = e3;
                sb = new StringBuilder("diffX:");
                sb.append(e);
                C1709a.m3015b("MultiTouchZoomableImageView onFing error", sb.toString(), e);
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            MultiTouchZoomableImageView multiTouchZoomableImageView = MultiTouchZoomableImageView.this;
            if (multiTouchZoomableImageView.f3604b != null && !multiTouchZoomableImageView.f3656g) {
                MultiTouchZoomableImageView.this.f3604b.mo34328b();
            }
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent != null) {
                try {
                    if (motionEvent.getPointerCount() <= 1) {
                    }
                    return false;
                } catch (IllegalArgumentException e) {
                    C1709a.m3015b("MultiTouchZoomableImageView onScroll error", "", e);
                }
            }
            if ((motionEvent2 == null || motionEvent2.getPointerCount() <= 1) && (MultiTouchZoomableImageView.this.f3655f == null || !MultiTouchZoomableImageView.this.f3655f.isInProgress())) {
                if (!MultiTouchZoomableImageView.this.f3653d) {
                    if (MultiTouchZoomableImageView.this.mo34284d() <= MultiTouchZoomableImageView.this.mo34286f()) {
                        if (MultiTouchZoomableImageView.this.f3605c != null) {
                            MultiTouchZoomableImageView.this.f3605c.requestDisallowInterceptTouchEvent(false);
                        }
                        return true;
                    }
                }
                MultiTouchZoomableImageView.this.mo34287g();
                MultiTouchZoomableImageView.this.mo34278a(-f, -f2);
                if (MultiTouchZoomableImageView.this.mo34282b(f)) {
                    if (MultiTouchZoomableImageView.this.f3605c != null) {
                        MultiTouchZoomableImageView.this.f3605c.requestDisallowInterceptTouchEvent(false);
                    }
                } else if (MultiTouchZoomableImageView.this.f3605c != null) {
                    MultiTouchZoomableImageView.this.f3605c.requestDisallowInterceptTouchEvent(true);
                }
                MultiTouchZoomableImageView.this.mo34283c();
                return true;
            }
            return false;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            AbstractC1923a aVar = MultiTouchZoomableImageView.this.f3604b;
            if (aVar == null) {
                return super.onSingleTapConfirmed(motionEvent);
            }
            aVar.mo34327a();
            return false;
        }
    }

    /* renamed from: com.qiyukf.nim.uikit.common.ui.imageview.MultiTouchZoomableImageView$b */
    public class C1922b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C1922b() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (scaleGestureDetector == null || !scaleGestureDetector.isInProgress()) {
                return false;
            }
            try {
                MultiTouchZoomableImageView.this.mo34273a(Math.min(MultiTouchZoomableImageView.this.mo34285e(), Math.max(MultiTouchZoomableImageView.this.mo34284d() * scaleGestureDetector.getScaleFactor(), 1.0f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                MultiTouchZoomableImageView.this.invalidate();
                MultiTouchZoomableImageView.this.f3656g = true;
                return true;
            } catch (IllegalArgumentException e) {
                C1709a.m3015b("BaseZoomableImageView is onScale is error", "", e);
                return false;
            }
        }
    }

    public MultiTouchZoomableImageView(Context context) {
        super(context);
        m3732a(context);
    }

    public MultiTouchZoomableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3732a(context);
    }

    public MultiTouchZoomableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3732a(context);
    }

    /* renamed from: a */
    private void m3732a(Context context) {
        this.f3655f = new ScaleGestureDetector(context, new C1922b());
        this.f3654e = new GestureDetector(context, new C1921a(this, (byte) 0));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f3605c != null) {
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action == 2) {
                        this.f3605c.requestDisallowInterceptTouchEvent(true);
                    } else if (action != 3) {
                    }
                }
                this.f3605c.requestDisallowInterceptTouchEvent(false);
                this.f3656g = false;
            }
            if (this.f3603a != null) {
                this.f3655f.onTouchEvent(motionEvent);
                if (!this.f3655f.isInProgress()) {
                    this.f3654e.onTouchEvent(motionEvent);
                }
                return true;
            }
            this.f3604b.mo34327a();
            return false;
        } catch (Exception e) {
            C1709a.m3015b("MultiTouchZoomableImageView onTouchEvent error", "", e);
        }
    }
}
