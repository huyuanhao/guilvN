package com.p118pd.sdk;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: com.pd.sdk.OooO0oo  reason: case insensitive filesystem */
public class C5936OooO0oo {
    public static Class OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f17026OooO00o = "ResourcesFlusher";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Field f17027OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f17028OooO00o;
    public static Field OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f17029OooO0O0;
    public static Field OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static boolean f17030OooO0OO;
    public static boolean OooO0Oo;

    public static void OooO00o(@NonNull Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                OooO0Oo(resources);
            } else if (i >= 23) {
                OooO0OO(resources);
            } else if (i >= 21) {
                OooO0O0(resources);
            }
        }
    }

    @RequiresApi(21)
    public static void OooO0O0(@NonNull Resources resources) {
        if (!f17028OooO00o) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f17027OooO00o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f17028OooO00o = true;
        }
        Field field = f17027OooO00o;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @RequiresApi(23)
    public static void OooO0OO(@NonNull Resources resources) {
        if (!f17028OooO00o) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f17027OooO00o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f17028OooO00o = true;
        }
        Object obj = null;
        Field field = f17027OooO00o;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
        }
        if (obj != null) {
            OooO00o(obj);
        }
    }

    @RequiresApi(24)
    public static void OooO0Oo(@NonNull Resources resources) {
        Object obj;
        if (!OooO0Oo) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                OooO0OO = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            OooO0Oo = true;
        }
        Field field = OooO0OO;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
                obj = null;
            }
            if (obj != null) {
                if (!f17028OooO00o) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f17027OooO00o = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f17028OooO00o = true;
                }
                Field field2 = f17027OooO00o;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException unused4) {
                    }
                }
                if (obj2 != null) {
                    OooO00o(obj2);
                }
            }
        }
    }

    @RequiresApi(16)
    public static void OooO00o(@NonNull Object obj) {
        if (!f17029OooO0O0) {
            try {
                OooO00o = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f17029OooO0O0 = true;
        }
        Class cls = OooO00o;
        if (cls != null) {
            if (!f17030OooO0OO) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    OooO0O0 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f17030OooO0OO = true;
            }
            Field field = OooO0O0;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
