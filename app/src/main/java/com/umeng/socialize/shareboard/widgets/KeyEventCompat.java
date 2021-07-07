package com.umeng.socialize.shareboard.widgets;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.KeyEvent;

public class KeyEventCompat {
    public static final KeyEventVersionImpl IMPL;

    public static class BaseKeyEventVersionImpl implements KeyEventVersionImpl {
        public static final int META_ALL_MASK = 247;
        public static final int META_MODIFIER_MASK = 247;

        public BaseKeyEventVersionImpl() {
        }

        public static int metaStateFilterDirectionalModifiers(int i, int i2, int i3, int i4, int i5) {
            int i6;
            boolean z = true;
            boolean z2 = (i2 & i3) != 0;
            int i7 = i4 | i5;
            if ((i2 & i7) == 0) {
                z = false;
            }
            if (z2) {
                if (!z) {
                    i6 = i7 ^ -1;
                } else {
                    throw new IllegalArgumentException("bad arguments");
                }
            } else if (!z) {
                return i;
            } else {
                i6 = i3 ^ -1;
            }
            return i & i6;
        }

        private int normalizeMetaState(int i) {
            if ((i & 192) != 0) {
                i |= 1;
            }
            if ((i & 48) != 0) {
                i |= 2;
            }
            return i & 247;
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasModifiers(int i, int i2) {
            if (metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(normalizeMetaState(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2) {
                return true;
            }
            return false;
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasNoModifiers(int i) {
            return (normalizeMetaState(i) & 247) == 0;
        }
    }

    @TargetApi(11)
    public static class HoneycombKeyEventVersionImpl extends BaseKeyEventVersionImpl {
        public HoneycombKeyEventVersionImpl() {
            super();
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.BaseKeyEventVersionImpl, com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasModifiers(int i, int i2) {
            return KeyEvent.metaStateHasModifiers(i, i2);
        }

        @Override // com.umeng.socialize.shareboard.widgets.KeyEventCompat.BaseKeyEventVersionImpl, com.umeng.socialize.shareboard.widgets.KeyEventCompat.KeyEventVersionImpl
        public boolean metaStateHasNoModifiers(int i) {
            return KeyEvent.metaStateHasNoModifiers(i);
        }
    }

    public interface KeyEventVersionImpl {
        boolean metaStateHasModifiers(int i, int i2);

        boolean metaStateHasNoModifiers(int i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            IMPL = new HoneycombKeyEventVersionImpl();
        } else {
            IMPL = new BaseKeyEventVersionImpl();
        }
    }

    public static boolean hasModifiers(KeyEvent keyEvent, int i) {
        return IMPL.metaStateHasModifiers(keyEvent.getMetaState(), i);
    }

    public static boolean hasNoModifiers(KeyEvent keyEvent) {
        return IMPL.metaStateHasNoModifiers(keyEvent.getMetaState());
    }
}
