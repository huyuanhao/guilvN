package com.p118pd.sdk;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.pd.sdk.o00o0  reason: case insensitive filesystem */
public class C7143o00o0 {

    /* renamed from: com.pd.sdk.o00o0$OooO00o */
    public interface OooO00o<T> {
        void OooO00o(T t, Rect rect);
    }

    /* renamed from: com.pd.sdk.o00o0$OooO0O0 */
    public interface OooO0O0<T, V> {
        int OooO00o(T t);

        V OooO00o(T t, int i);
    }

    /* renamed from: com.pd.sdk.o00o0$OooO0OO */
    public static class OooO0OO<T> implements Comparator<T> {
        public final Rect OooO00o = new Rect();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO00o<T> f19512OooO00o;
        public final Rect OooO0O0 = new Rect();

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final boolean f19513OooO0O0;

        public OooO0OO(boolean z, OooO00o<T> oooO00o) {
            this.f19513OooO0O0 = z;
            this.f19512OooO00o = oooO00o;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.OooO00o;
            Rect rect2 = this.OooO0O0;
            this.f19512OooO00o.OooO00o(t, rect);
            this.f19512OooO00o.OooO00o(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (this.f19513OooO0O0) {
                    return 1;
                }
                return -1;
            } else if (i3 <= i4) {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (this.f19513OooO0O0) {
                        return 1;
                    }
                    return -1;
                } else if (i7 <= i8) {
                    return 0;
                } else {
                    if (this.f19513OooO0O0) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.f19513OooO0O0) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public static int OooO00o(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    public static <L, T> T OooO00o(@NonNull L l, @NonNull OooO0O0<L, T> oooO0O0, @NonNull OooO00o<T> oooO00o, @Nullable T t, int i, boolean z, boolean z2) {
        int OooO00o2 = oooO0O0.OooO00o(l);
        ArrayList arrayList = new ArrayList(OooO00o2);
        for (int i2 = 0; i2 < OooO00o2; i2++) {
            arrayList.add(oooO0O0.OooO00o(l, i2));
        }
        Collections.sort(arrayList, new OooO0OO(z, oooO00o));
        if (i == 1) {
            return (T) OooO0O0(t, arrayList, z2);
        }
        if (i == 2) {
            return (T) OooO00o(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    public static <T> T OooO0O0(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    public static int OooO0OO(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, OooO0Oo(i, rect, rect2));
    }

    public static int OooO0Oo(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    public static int OooO0o0(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    public static boolean OooO0O0(int i, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        if (!OooO00o(rect, rect2, i)) {
            return false;
        }
        if (!OooO00o(rect, rect3, i) || OooO00o(i, rect, rect2, rect3)) {
            return true;
        }
        if (!OooO00o(i, rect, rect3, rect2) && OooO00o(OooO00o(i, rect, rect2), OooO0o0(i, rect, rect2)) < OooO00o(OooO00o(i, rect, rect3), OooO0o0(i, rect, rect3))) {
            return true;
        }
        return false;
    }

    public static <T> T OooO00o(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public static <L, T> T OooO00o(@NonNull L l, @NonNull OooO0O0<L, T> oooO0O0, @NonNull OooO00o<T> oooO00o, @Nullable T t, @NonNull Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int OooO00o2 = oooO0O0.OooO00o(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < OooO00o2; i2++) {
            T OooO00o3 = oooO0O0.OooO00o(l, i2);
            if (OooO00o3 != t) {
                oooO00o.OooO00o(OooO00o3, rect3);
                if (OooO0O0(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = OooO00o3;
                }
            }
        }
        return t2;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m18514OooO0O0(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        return rect.bottom <= rect2.top;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    public static int OooO0O0(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    public static boolean OooO00o(int i, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean OooO00o2 = m18513OooO00o(i, rect, rect2);
        if (m18513OooO00o(i, rect, rect3) || !OooO00o2) {
            return false;
        }
        if (m18514OooO0O0(i, rect, rect3) && i != 17 && i != 66 && OooO00o(i, rect, rect2) >= OooO0OO(i, rect, rect3)) {
            return false;
        }
        return true;
    }

    public static boolean OooO00o(@NonNull Rect rect, @NonNull Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18513OooO00o(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static int OooO00o(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, OooO0O0(i, rect, rect2));
    }
}
