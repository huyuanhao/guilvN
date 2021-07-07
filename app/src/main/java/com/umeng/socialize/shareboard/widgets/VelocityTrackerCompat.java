package com.umeng.socialize.shareboard.widgets;

import android.os.Build;
import android.view.VelocityTracker;

public class VelocityTrackerCompat {
    public static final VelocityTrackerVersionImpl IMPL;

    public static class BaseVelocityTrackerVersionImpl implements VelocityTrackerVersionImpl {
        public BaseVelocityTrackerVersionImpl() {
        }

        @Override // com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.VelocityTrackerVersionImpl
        public float getXVelocity(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getXVelocity();
        }
    }

    public static class HoneycombVelocityTrackerVersionImpl implements VelocityTrackerVersionImpl {
        public HoneycombVelocityTrackerVersionImpl() {
        }

        @Override // com.umeng.socialize.shareboard.widgets.VelocityTrackerCompat.VelocityTrackerVersionImpl
        public float getXVelocity(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getXVelocity(i);
        }
    }

    public interface VelocityTrackerVersionImpl {
        float getXVelocity(VelocityTracker velocityTracker, int i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            IMPL = new HoneycombVelocityTrackerVersionImpl();
        } else {
            IMPL = new BaseVelocityTrackerVersionImpl();
        }
    }

    public static float getXVelocity(VelocityTracker velocityTracker, int i) {
        return IMPL.getXVelocity(velocityTracker, i);
    }
}
