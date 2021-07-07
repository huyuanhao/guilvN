package com.umeng.socialize.shareboard.widgets;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

public class ViewCompat {
    public static final long FAKE_FRAME_TIME = 10;
    public static final ViewCompatImpl IMPL;

    public static class Api24ViewCompatImpl extends MarshmallowViewCompatImpl {
        public Api24ViewCompatImpl() {
            super();
        }
    }

    public static class BaseViewCompatImpl implements ViewCompatImpl {
        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public boolean canScrollHorizontally(View view, int i) {
            return false;
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public long getFrameTime() {
            return 10;
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postInvalidateOnAnimation(View view) {
            view.invalidate();
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postOnAnimation(View view, Runnable runnable) {
            view.postDelayed(runnable, getFrameTime());
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        }
    }

    @TargetApi(11)
    public static class HCViewCompatImpl extends BaseViewCompatImpl {
        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl
        public long getFrameTime() {
            return ValueAnimator.getFrameDelay();
        }
    }

    public static class ICSMr1ViewCompatImpl extends ICSViewCompatImpl {
    }

    @TargetApi(14)
    public static class ICSViewCompatImpl extends HCViewCompatImpl {
        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public boolean canScrollHorizontally(View view, int i) {
            return view.canScrollHorizontally(i);
        }
    }

    @TargetApi(16)
    public static class JBViewCompatImpl extends ICSMr1ViewCompatImpl {
        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postInvalidateOnAnimation(View view) {
            view.postInvalidateOnAnimation();
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void postOnAnimation(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }
    }

    public static class JbMr1ViewCompatImpl extends JBViewCompatImpl {
        public JbMr1ViewCompatImpl() {
        }
    }

    public static class JbMr2ViewCompatImpl extends JbMr1ViewCompatImpl {
        public JbMr2ViewCompatImpl() {
            super();
        }
    }

    public static class KitKatViewCompatImpl extends JbMr2ViewCompatImpl {
        public KitKatViewCompatImpl() {
            super();
        }
    }

    @TargetApi(20)
    public static class LollipopViewCompatImpl extends KitKatViewCompatImpl {
        public LollipopViewCompatImpl() {
            super();
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return WindowInsetsCompat.wrap(dispatchApplyWindowInsets(view, WindowInsetsCompat.unwrap(windowInsetsCompat)));
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return WindowInsetsCompat.wrap(onApplyWindowInsets(view, WindowInsetsCompat.unwrap(windowInsetsCompat)));
        }

        @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.BaseViewCompatImpl, com.umeng.socialize.shareboard.widgets.ViewCompat.ViewCompatImpl
        public void setOnApplyWindowInsetsListener(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            final C40051 r0 = new OnApplyWindowInsetsListenerBridge() {
                /* class com.umeng.socialize.shareboard.widgets.ViewCompat.LollipopViewCompatImpl.C40051 */

                @Override // com.umeng.socialize.shareboard.widgets.ViewCompat.OnApplyWindowInsetsListenerBridge
                public Object onApplyWindowInsets(View view, Object obj) {
                    return WindowInsetsCompat.unwrap(onApplyWindowInsetsListener.onApplyWindowInsets(view, WindowInsetsCompat.wrap(obj)));
                }
            };
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                /* class com.umeng.socialize.shareboard.widgets.ViewCompat.LollipopViewCompatImpl.View$OnApplyWindowInsetsListenerC40062 */

                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) r0.onApplyWindowInsets(view, windowInsets);
                }
            });
        }

        public static Object dispatchApplyWindowInsets(View view, Object obj) {
            WindowInsets windowInsets = (WindowInsets) obj;
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
            return dispatchApplyWindowInsets != windowInsets ? new WindowInsets(dispatchApplyWindowInsets) : obj;
        }

        public static Object onApplyWindowInsets(View view, Object obj) {
            WindowInsets windowInsets = (WindowInsets) obj;
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            return onApplyWindowInsets != windowInsets ? new WindowInsets(onApplyWindowInsets) : obj;
        }
    }

    public static class MarshmallowViewCompatImpl extends LollipopViewCompatImpl {
        public MarshmallowViewCompatImpl() {
            super();
        }
    }

    public interface OnApplyWindowInsetsListener {
        WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat);
    }

    public interface OnApplyWindowInsetsListenerBridge {
        Object onApplyWindowInsets(View view, Object obj);
    }

    public interface ViewCompatImpl {
        boolean canScrollHorizontally(View view, int i);

        WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat);

        WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat);

        void postInvalidateOnAnimation(View view);

        void postOnAnimation(View view, Runnable runnable);

        void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            IMPL = new Api24ViewCompatImpl();
        } else if (i >= 23) {
            IMPL = new MarshmallowViewCompatImpl();
        } else if (i >= 21) {
            IMPL = new LollipopViewCompatImpl();
        } else if (i >= 19) {
            IMPL = new KitKatViewCompatImpl();
        } else if (i >= 18) {
            IMPL = new JbMr2ViewCompatImpl();
        } else if (i >= 17) {
            IMPL = new JbMr1ViewCompatImpl();
        } else if (i >= 16) {
            IMPL = new JBViewCompatImpl();
        } else if (i >= 15) {
            IMPL = new ICSMr1ViewCompatImpl();
        } else if (i >= 14) {
            IMPL = new ICSViewCompatImpl();
        } else if (i >= 11) {
            IMPL = new HCViewCompatImpl();
        } else {
            IMPL = new BaseViewCompatImpl();
        }
    }

    public static boolean canScrollHorizontally(View view, int i) {
        return IMPL.canScrollHorizontally(view, i);
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return IMPL.dispatchApplyWindowInsets(view, windowInsetsCompat);
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return IMPL.onApplyWindowInsets(view, windowInsetsCompat);
    }

    public static void postInvalidateOnAnimation(View view) {
        IMPL.postInvalidateOnAnimation(view);
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        IMPL.postOnAnimation(view, runnable);
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        IMPL.setOnApplyWindowInsetsListener(view, onApplyWindowInsetsListener);
    }
}
