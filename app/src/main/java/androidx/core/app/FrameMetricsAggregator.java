package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class FrameMetricsAggregator {
    public static final int OooO = 8;
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f13842OooO00o = "FrameMetrics";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f13843OooO00o = false;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 5;
    public static final int OooO0o0 = 4;
    public static final int OooO0oO = 6;
    public static final int OooO0oo = 7;
    public static final int OooOO0 = 8;
    public static final int OooOO0O = 1;
    public static final int OooOO0o = 2;
    public static final int OooOOO = 8;
    public static final int OooOOO0 = 4;
    public static final int OooOOOO = 16;
    public static final int OooOOOo = 32;
    public static final int OooOOo = 128;
    public static final int OooOOo0 = 64;
    public static final int OooOOoo = 256;
    public static final int OooOo00 = 511;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f13844OooO00o;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MetricType {
    }

    public static class OooO0O0 {
        public void OooO00o(Activity activity) {
        }

        public SparseIntArray[] OooO00o() {
            return null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public SparseIntArray[] m14473OooO00o(Activity activity) {
            return null;
        }

        public SparseIntArray[] OooO0O0() {
            return null;
        }

        public SparseIntArray[] OooO0OO() {
            return null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void OooO00o(@NonNull Activity activity) {
        this.f13844OooO00o.OooO00o(activity);
    }

    @Nullable
    public SparseIntArray[] OooO0O0() {
        return this.f13844OooO00o.OooO0O0();
    }

    @Nullable
    public SparseIntArray[] OooO0OO() {
        return this.f13844OooO00o.OooO0OO();
    }

    public FrameMetricsAggregator(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f13844OooO00o = new OooO00o(i);
        } else {
            this.f13844OooO00o = new OooO0O0();
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public SparseIntArray[] m14471OooO00o(@NonNull Activity activity) {
        return this.f13844OooO00o.m14473OooO00o(activity);
    }

    @RequiresApi(24)
    public static class OooO00o extends OooO0O0 {
        public static Handler OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static HandlerThread f13845OooO00o = null;
        public static final int OooO0O0 = 1000000;
        public static final int OooO0OO = 500000;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f13846OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Window.OnFrameMetricsAvailableListener f13847OooO00o = new Window$OnFrameMetricsAvailableListenerC4883OooO00o();

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayList<WeakReference<Activity>> f13848OooO00o = new ArrayList<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public SparseIntArray[] f13849OooO00o = new SparseIntArray[9];

        /* renamed from: androidx.core.app.FrameMetricsAggregator$OooO00o$OooO00o  reason: collision with other inner class name */
        public class Window$OnFrameMetricsAvailableListenerC4883OooO00o implements Window.OnFrameMetricsAvailableListener {
            public Window$OnFrameMetricsAvailableListenerC4883OooO00o() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                OooO00o oooO00o = OooO00o.this;
                if ((oooO00o.f13846OooO00o & 1) != 0) {
                    oooO00o.OooO00o(oooO00o.f13849OooO00o[0], frameMetrics.getMetric(8));
                }
                OooO00o oooO00o2 = OooO00o.this;
                if ((oooO00o2.f13846OooO00o & 2) != 0) {
                    oooO00o2.OooO00o(oooO00o2.f13849OooO00o[1], frameMetrics.getMetric(1));
                }
                OooO00o oooO00o3 = OooO00o.this;
                if ((oooO00o3.f13846OooO00o & 4) != 0) {
                    oooO00o3.OooO00o(oooO00o3.f13849OooO00o[2], frameMetrics.getMetric(3));
                }
                OooO00o oooO00o4 = OooO00o.this;
                if ((oooO00o4.f13846OooO00o & 8) != 0) {
                    oooO00o4.OooO00o(oooO00o4.f13849OooO00o[3], frameMetrics.getMetric(4));
                }
                OooO00o oooO00o5 = OooO00o.this;
                if ((oooO00o5.f13846OooO00o & 16) != 0) {
                    oooO00o5.OooO00o(oooO00o5.f13849OooO00o[4], frameMetrics.getMetric(5));
                }
                OooO00o oooO00o6 = OooO00o.this;
                if ((oooO00o6.f13846OooO00o & 64) != 0) {
                    oooO00o6.OooO00o(oooO00o6.f13849OooO00o[6], frameMetrics.getMetric(7));
                }
                OooO00o oooO00o7 = OooO00o.this;
                if ((oooO00o7.f13846OooO00o & 32) != 0) {
                    oooO00o7.OooO00o(oooO00o7.f13849OooO00o[5], frameMetrics.getMetric(6));
                }
                OooO00o oooO00o8 = OooO00o.this;
                if ((oooO00o8.f13846OooO00o & 128) != 0) {
                    oooO00o8.OooO00o(oooO00o8.f13849OooO00o[7], frameMetrics.getMetric(0));
                }
                OooO00o oooO00o9 = OooO00o.this;
                if ((oooO00o9.f13846OooO00o & 256) != 0) {
                    oooO00o9.OooO00o(oooO00o9.f13849OooO00o[8], frameMetrics.getMetric(2));
                }
            }
        }

        public OooO00o(int i) {
            this.f13846OooO00o = i;
        }

        public void OooO00o(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        @Override // androidx.core.app.FrameMetricsAggregator.OooO0O0
        public SparseIntArray[] OooO0O0() {
            SparseIntArray[] sparseIntArrayArr = this.f13849OooO00o;
            this.f13849OooO00o = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.OooO0O0
        public SparseIntArray[] OooO0OO() {
            for (int size = this.f13848OooO00o.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f13848OooO00o.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f13847OooO00o);
                    this.f13848OooO00o.remove(size);
                }
            }
            return this.f13849OooO00o;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.OooO0O0, androidx.core.app.FrameMetricsAggregator.OooO0O0
        public void OooO00o(Activity activity) {
            if (f13845OooO00o == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f13845OooO00o = handlerThread;
                handlerThread.start();
                OooO00o = new Handler(f13845OooO00o.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f13849OooO00o;
                if (sparseIntArrayArr[i] == null && (this.f13846OooO00o & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f13847OooO00o, OooO00o);
            this.f13848OooO00o.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.OooO0O0, androidx.core.app.FrameMetricsAggregator.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public SparseIntArray[] m14472OooO00o(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f13848OooO00o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f13848OooO00o.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f13847OooO00o);
            return this.f13849OooO00o;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.OooO0O0
        public SparseIntArray[] OooO00o() {
            return this.f13849OooO00o;
        }
    }

    @Nullable
    public SparseIntArray[] OooO00o() {
        return this.f13844OooO00o.OooO00o();
    }
}
