package com.umeng.socialize.shareboard.widgets;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowInsets;

public class WindowInsetsCompat {
    public static final WindowInsetsCompatImpl IMPL;
    public final Object mInsets;

    @TargetApi(20)
    public static class WindowInsetsCompatApi20Impl extends WindowInsetsCompatBaseImpl {
        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public WindowInsetsCompat consumeSystemWindowInsets(Object obj) {
            return new WindowInsetsCompat(((WindowInsets) obj).consumeSystemWindowInsets());
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public Object getSourceWindowInsets(Object obj) {
            return new WindowInsets((WindowInsets) obj);
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetBottom(Object obj) {
            return ((WindowInsets) obj).getSystemWindowInsetBottom();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetLeft(Object obj) {
            return ((WindowInsets) obj).getSystemWindowInsetLeft();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetRight(Object obj) {
            return ((WindowInsets) obj).getSystemWindowInsetRight();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetTop(Object obj) {
            return ((WindowInsets) obj).getSystemWindowInsetTop();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasInsets(Object obj) {
            return ((WindowInsets) obj).hasInsets();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasSystemWindowInsets(Object obj) {
            return ((WindowInsets) obj).hasSystemWindowInsets();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean isRound(Object obj) {
            return ((WindowInsets) obj).isRound();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public WindowInsetsCompat replaceSystemWindowInsets(Object obj, int i, int i2, int i3, int i4) {
            return new WindowInsetsCompat(((WindowInsets) obj).replaceSystemWindowInsets(i, i2, i3, i4));
        }
    }

    @TargetApi(21)
    public static class WindowInsetsCompatApi21Impl extends WindowInsetsCompatApi20Impl {
        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public WindowInsetsCompat consumeStableInsets(Object obj) {
            return new WindowInsetsCompat(((WindowInsets) obj).consumeStableInsets());
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetBottom(Object obj) {
            return ((WindowInsets) obj).getStableInsetBottom();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetLeft(Object obj) {
            return ((WindowInsets) obj).getStableInsetLeft();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetRight(Object obj) {
            return ((WindowInsets) obj).getStableInsetRight();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetTop(Object obj) {
            return ((WindowInsets) obj).getStableInsetTop();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasStableInsets(Object obj) {
            return ((WindowInsets) obj).hasStableInsets();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean isConsumed(Object obj) {
            return ((WindowInsets) obj).isConsumed();
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatBaseImpl, com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public WindowInsetsCompat replaceSystemWindowInsets(Object obj, Rect rect) {
            return new WindowInsetsCompat(((WindowInsets) obj).replaceSystemWindowInsets(rect));
        }
    }

    public static class WindowInsetsCompatBaseImpl implements WindowInsetsCompatImpl {
        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public WindowInsetsCompat consumeStableInsets(Object obj) {
            return null;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public WindowInsetsCompat consumeSystemWindowInsets(Object obj) {
            return null;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public Object getSourceWindowInsets(Object obj) {
            return null;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetBottom(Object obj) {
            return 0;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetLeft(Object obj) {
            return 0;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetRight(Object obj) {
            return 0;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getStableInsetTop(Object obj) {
            return 0;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetBottom(Object obj) {
            return 0;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetLeft(Object obj) {
            return 0;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetRight(Object obj) {
            return 0;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public int getSystemWindowInsetTop(Object obj) {
            return 0;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasInsets(Object obj) {
            return false;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasStableInsets(Object obj) {
            return false;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean hasSystemWindowInsets(Object obj) {
            return false;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean isConsumed(Object obj) {
            return false;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public boolean isRound(Object obj) {
            return false;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public WindowInsetsCompat replaceSystemWindowInsets(Object obj, int i, int i2, int i3, int i4) {
            return null;
        }

        @Override // com.umeng.socialize.shareboard.widgets.WindowInsetsCompat.WindowInsetsCompatImpl
        public WindowInsetsCompat replaceSystemWindowInsets(Object obj, Rect rect) {
            return null;
        }
    }

    public interface WindowInsetsCompatImpl {
        WindowInsetsCompat consumeStableInsets(Object obj);

        WindowInsetsCompat consumeSystemWindowInsets(Object obj);

        Object getSourceWindowInsets(Object obj);

        int getStableInsetBottom(Object obj);

        int getStableInsetLeft(Object obj);

        int getStableInsetRight(Object obj);

        int getStableInsetTop(Object obj);

        int getSystemWindowInsetBottom(Object obj);

        int getSystemWindowInsetLeft(Object obj);

        int getSystemWindowInsetRight(Object obj);

        int getSystemWindowInsetTop(Object obj);

        boolean hasInsets(Object obj);

        boolean hasStableInsets(Object obj);

        boolean hasSystemWindowInsets(Object obj);

        boolean isConsumed(Object obj);

        boolean isRound(Object obj);

        WindowInsetsCompat replaceSystemWindowInsets(Object obj, int i, int i2, int i3, int i4);

        WindowInsetsCompat replaceSystemWindowInsets(Object obj, Rect rect);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            IMPL = new WindowInsetsCompatApi21Impl();
        } else if (i >= 20) {
            IMPL = new WindowInsetsCompatApi20Impl();
        } else {
            IMPL = new WindowInsetsCompatBaseImpl();
        }
    }

    public WindowInsetsCompat(Object obj) {
        this.mInsets = obj;
    }

    public static Object unwrap(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat == null) {
            return null;
        }
        return windowInsetsCompat.mInsets;
    }

    public static WindowInsetsCompat wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        return new WindowInsetsCompat(obj);
    }

    public WindowInsetsCompat consumeStableInsets() {
        return IMPL.consumeStableInsets(this.mInsets);
    }

    public WindowInsetsCompat consumeSystemWindowInsets() {
        return IMPL.consumeSystemWindowInsets(this.mInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WindowInsetsCompat.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.mInsets;
        Object obj3 = ((WindowInsetsCompat) obj).mInsets;
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        if (obj3 == null) {
            return true;
        }
        return false;
    }

    public int getStableInsetBottom() {
        return IMPL.getStableInsetBottom(this.mInsets);
    }

    public int getStableInsetLeft() {
        return IMPL.getStableInsetLeft(this.mInsets);
    }

    public int getStableInsetRight() {
        return IMPL.getStableInsetRight(this.mInsets);
    }

    public int getStableInsetTop() {
        return IMPL.getStableInsetTop(this.mInsets);
    }

    public int getSystemWindowInsetBottom() {
        return IMPL.getSystemWindowInsetBottom(this.mInsets);
    }

    public int getSystemWindowInsetLeft() {
        return IMPL.getSystemWindowInsetLeft(this.mInsets);
    }

    public int getSystemWindowInsetRight() {
        return IMPL.getSystemWindowInsetRight(this.mInsets);
    }

    public int getSystemWindowInsetTop() {
        return IMPL.getSystemWindowInsetTop(this.mInsets);
    }

    public boolean hasInsets() {
        return IMPL.hasInsets(this.mInsets);
    }

    public boolean hasStableInsets() {
        return IMPL.hasStableInsets(this.mInsets);
    }

    public boolean hasSystemWindowInsets() {
        return IMPL.hasSystemWindowInsets(this.mInsets);
    }

    public int hashCode() {
        Object obj = this.mInsets;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean isConsumed() {
        return IMPL.isConsumed(this.mInsets);
    }

    public boolean isRound() {
        return IMPL.isRound(this.mInsets);
    }

    public WindowInsetsCompat replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        return IMPL.replaceSystemWindowInsets(this.mInsets, i, i2, i3, i4);
    }

    public WindowInsetsCompat replaceSystemWindowInsets(Rect rect) {
        return IMPL.replaceSystemWindowInsets(this.mInsets, rect);
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        Object obj;
        if (windowInsetsCompat == null) {
            obj = null;
        } else {
            obj = IMPL.getSourceWindowInsets(windowInsetsCompat.mInsets);
        }
        this.mInsets = obj;
    }
}
