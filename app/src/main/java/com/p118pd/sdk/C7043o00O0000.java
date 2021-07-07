package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.pd.sdk.o00O0000  reason: case insensitive filesystem */
public final class C7043o00O0000 {
    public static final String OooO00o = "DrawableCompat";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Method f19308OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f19309OooO00o;
    public static Method OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f19310OooO0O0;

    public static void OooO00o(@NonNull Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m18318OooO0O0(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m18319OooO0O0(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static void OooO00o(@NonNull Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static Drawable m18317OooO0O0(@NonNull Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        return i >= 21 ? !(drawable instanceof AbstractC7044o00O000o) ? new C8012oOO00O(drawable) : drawable : !(drawable instanceof AbstractC7044o00O000o) ? new C7045o00O00O(drawable) : drawable;
    }

    public static void OooO00o(@NonNull Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public static void OooO00o(@NonNull Drawable drawable, @ColorInt int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof AbstractC7044o00O000o) {
            ((AbstractC7044o00O000o) drawable).setTint(i);
        }
    }

    public static int OooO0O0(@NonNull Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!f19310OooO0O0) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    OooO0O0 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(OooO00o, "Failed to retrieve getLayoutDirection() method", e);
                }
                f19310OooO0O0 = true;
            }
            Method method = OooO0O0;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i(OooO00o, "Failed to invoke getLayoutDirection() via reflection", e2);
                    OooO0O0 = null;
                }
            }
        }
        return 0;
    }

    public static void OooO00o(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof AbstractC7044o00O000o) {
            ((AbstractC7044o00O000o) drawable).setTintList(colorStateList);
        }
    }

    public static void OooO00o(@NonNull Drawable drawable, @NonNull PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof AbstractC7044o00O000o) {
            ((AbstractC7044o00O000o) drawable).setTintMode(mode);
        }
    }

    public static int OooO00o(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static void OooO00o(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18315OooO00o(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ColorFilter m18312OooO00o(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18314OooO00o(@NonNull Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m18314OooO00o(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof AbstractC7041o00O00) {
                m18314OooO00o(((AbstractC7041o00O00) drawable).OooO00o());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        m18314OooO00o(child);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    public static void OooO00o(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static <T extends Drawable> T m18313OooO00o(@NonNull Drawable drawable) {
        return drawable instanceof AbstractC7041o00O00 ? (T) ((AbstractC7041o00O00) drawable).OooO00o() : drawable;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18316OooO00o(@NonNull Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            if (!f19309OooO00o) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    f19308OooO00o = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(OooO00o, "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f19309OooO00o = true;
            }
            Method method = f19308OooO00o;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                    return true;
                } catch (Exception e2) {
                    Log.i(OooO00o, "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f19308OooO00o = null;
                }
            }
        }
        return false;
    }
}
