package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C7043o00O0000;
import com.p118pd.sdk.C7086o00OO0OO;
import com.p118pd.sdk.C7295o0O0O0o0;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.message.proguard.C3817f;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    public static final float OooO00o = 0.25f;
    public static final float OooO0O0 = 0.6666667f;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final PorterDuff.Mode f14001OooO0O0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f14002OooO0O0 = "IconCompat";
    public static final float OooO0OO = 0.9166667f;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f14003OooO0OO = "type";
    public static final float OooO0Oo = 0.010416667f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final int f14004OooO0Oo = -1;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f14005OooO0Oo = "obj";
    public static final int OooO0o = 30;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f14006OooO0o = "int2";
    public static final float OooO0o0 = 0.020833334f;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final int f14007OooO0o0 = 61;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f14008OooO0o0 = "int1";
    public static final String OooO0oO = "tint_list";
    public static final String OooO0oo = "tint_mode";
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f14009OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: OooO00o  reason: collision with other field name */
    public ColorStateList f14010OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PorterDuff.Mode f14011OooO00o = f14001OooO0O0;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: OooO00o  reason: collision with other field name */
    public Parcelable f14012OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f14013OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f14014OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f14015OooO00o;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f14016OooO0O0;
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f14017OooO0OO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IconType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
    }

    public static IconCompat OooO00o(Context context, @DrawableRes int i) {
        if (context != null) {
            return OooO00o(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static String OooO00o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    public static IconCompat OooO0O0(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f14013OooO00o = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    @IdRes
    public int OooO0oO() {
        if (this.f14009OooO00o == -1 && Build.VERSION.SDK_INT >= 23) {
            return OooO00o((Icon) this.f14013OooO00o);
        }
        if (this.f14009OooO00o == 2) {
            return this.f14016OooO0O0;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public int OooO0oo() {
        if (this.f14009OooO00o != -1 || Build.VERSION.SDK_INT < 23) {
            return this.f14009OooO00o;
        }
        return OooO0O0((Icon) this.f14013OooO00o);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.f14009OooO00o;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        bundle.putByteArray(f14005OooO0Oo, (byte[]) this.f14013OooO00o);
                    } else if (i != 4) {
                        if (i != 5) {
                            throw new IllegalArgumentException("Invalid icon");
                        }
                    }
                }
                bundle.putString(f14005OooO0Oo, (String) this.f14013OooO00o);
            }
            bundle.putParcelable(f14005OooO0Oo, (Bitmap) this.f14013OooO00o);
        } else {
            bundle.putParcelable(f14005OooO0Oo, (Parcelable) this.f14013OooO00o);
        }
        bundle.putInt("type", this.f14009OooO00o);
        bundle.putInt(f14008OooO0o0, this.f14016OooO0O0);
        bundle.putInt(f14006OooO0o, this.f14017OooO0OO);
        ColorStateList colorStateList = this.f14010OooO00o;
        if (colorStateList != null) {
            bundle.putParcelable(OooO0oO, colorStateList);
        }
        PorterDuff.Mode mode = this.f14011OooO00o;
        if (mode != f14001OooO0O0) {
            bundle.putString(OooO0oo, mode.name());
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static IconCompat OooO00o(Resources resources, String str, @DrawableRes int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f14016OooO0O0 = i;
            if (resources != null) {
                try {
                    iconCompat.f14013OooO00o = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f14013OooO00o = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    public IconCompat(int i) {
        this.f14009OooO00o = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable OooO0O0(android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.OooO0O0(android.content.Context):android.graphics.drawable.Drawable");
    }

    public static IconCompat OooO00o(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.f14013OooO00o = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat OooO00o(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            IconCompat iconCompat = new IconCompat(3);
            iconCompat.f14013OooO00o = bArr;
            iconCompat.f14016OooO0O0 = i;
            iconCompat.f14017OooO0OO = i2;
            return iconCompat;
        }
        throw new IllegalArgumentException("Data must not be null.");
    }

    public static IconCompat OooO00o(String str) {
        if (str != null) {
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f14013OooO00o = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat OooO00o(Uri uri) {
        if (uri != null) {
            return OooO00o(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m14555OooO00o() {
        if (this.f14009OooO00o == -1 && Build.VERSION.SDK_INT >= 23) {
            return m14552OooO00o((Icon) this.f14013OooO00o);
        }
        if (this.f14009OooO00o == 2) {
            return ((String) this.f14013OooO00o).split(Constants.COLON_SEPARATOR, -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    @RequiresApi(23)
    public static int OooO0O0(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            String str = "Unable to get icon type " + icon;
            return -1;
        } catch (InvocationTargetException unused2) {
            String str2 = "Unable to get icon type " + icon;
            return -1;
        } catch (NoSuchMethodException unused3) {
            String str3 = "Unable to get icon type " + icon;
            return -1;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Uri m14553OooO00o() {
        if (this.f14009OooO00o != -1 || Build.VERSION.SDK_INT < 23) {
            return Uri.parse((String) this.f14013OooO00o);
        }
        return m14550OooO00o((Icon) this.f14013OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public IconCompat m14554OooO00o(@ColorInt int i) {
        return OooO00o(ColorStateList.valueOf(i));
    }

    public IconCompat OooO00o(ColorStateList colorStateList) {
        this.f14010OooO00o = colorStateList;
        return this;
    }

    public IconCompat OooO00o(PorterDuff.Mode mode) {
        this.f14011OooO00o = mode;
        return this;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    @RequiresApi(23)
    public Icon OooO00o() {
        Icon icon;
        int i = this.f14009OooO00o;
        if (i == -1) {
            return (Icon) this.f14013OooO00o;
        }
        if (i == 1) {
            icon = Icon.createWithBitmap((Bitmap) this.f14013OooO00o);
        } else if (i == 2) {
            icon = Icon.createWithResource(m14555OooO00o(), this.f14016OooO0O0);
        } else if (i == 3) {
            icon = Icon.createWithData((byte[]) this.f14013OooO00o, this.f14016OooO0O0, this.f14017OooO0OO);
        } else if (i == 4) {
            icon = Icon.createWithContentUri((String) this.f14013OooO00o);
        } else if (i != 5) {
            throw new IllegalArgumentException("Unknown type");
        } else if (Build.VERSION.SDK_INT >= 26) {
            icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f14013OooO00o);
        } else {
            icon = Icon.createWithBitmap(OooO00o((Bitmap) this.f14013OooO00o, false));
        }
        ColorStateList colorStateList = this.f14010OooO00o;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f14011OooO00o;
        if (mode != f14001OooO0O0) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14557OooO00o(Context context) {
        if (this.f14009OooO00o == 2) {
            String str = (String) this.f14013OooO00o;
            if (str.contains(Constants.COLON_SEPARATOR)) {
                String str2 = str.split(Constants.COLON_SEPARATOR, -1)[1];
                String str3 = str2.split(C8932ooOOO0o.OooO0OO, -1)[0];
                String str4 = str2.split(C8932ooOOO0o.OooO0OO, -1)[1];
                String str5 = str.split(Constants.COLON_SEPARATOR, -1)[0];
                int identifier = OooO00o(context, str5).getIdentifier(str4, str3, str5);
                if (this.f14016OooO0O0 != identifier) {
                    Log.i(f14002OooO0O0, "Id has changed for " + str5 + C8932ooOOO0o.OooO0OO + str4);
                    this.f14016OooO0O0 = identifier;
                }
            }
        }
    }

    public Drawable OooO00o(Context context) {
        m14557OooO00o(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return OooO00o().loadDrawable(context);
        }
        Drawable OooO0O02 = OooO0O0(context);
        if (!(OooO0O02 == null || (this.f14010OooO00o == null && this.f14011OooO00o == f14001OooO0O0))) {
            OooO0O02.mutate();
            C7043o00O0000.OooO00o(OooO0O02, this.f14010OooO00o);
            C7043o00O0000.OooO00o(OooO0O02, this.f14011OooO00o);
        }
        return OooO0O02;
    }

    public static Resources OooO00o(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", str);
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(@NonNull Intent intent, @Nullable Drawable drawable, @NonNull Context context) {
        Bitmap bitmap;
        m14557OooO00o(context);
        int i = this.f14009OooO00o;
        if (i == 1) {
            bitmap = (Bitmap) this.f14013OooO00o;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context createPackageContext = context.createPackageContext(m14555OooO00o(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.f14016OooO0O0));
                    return;
                }
                Drawable OooO00o2 = C7009o000OoOo.m18256OooO00o(createPackageContext, this.f14016OooO0O0);
                if (OooO00o2.getIntrinsicWidth() > 0) {
                    if (OooO00o2.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(OooO00o2.getIntrinsicWidth(), OooO00o2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        OooO00o2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        OooO00o2.draw(new Canvas(bitmap));
                    }
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService(C5982OoooOoO.OooO0o0)).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                OooO00o2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                OooO00o2.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.f14013OooO00o, e);
            }
        } else if (i == 5) {
            bitmap = OooO00o((Bitmap) this.f14013OooO00o, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void OooO00o(boolean z) {
        this.f14014OooO00o = this.f14011OooO00o.name();
        int i = this.f14009OooO00o;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    this.f14015OooO00o = ((String) this.f14013OooO00o).getBytes(Charset.forName(C3817f.f10341c));
                    return;
                } else if (i == 3) {
                    this.f14015OooO00o = (byte[]) this.f14013OooO00o;
                    return;
                } else if (i == 4) {
                    this.f14015OooO00o = this.f14013OooO00o.toString().getBytes(Charset.forName(C3817f.f10341c));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) this.f14013OooO00o).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f14015OooO00o = byteArrayOutputStream.toByteArray();
                return;
            }
            this.f14012OooO00o = (Parcelable) this.f14013OooO00o;
        } else if (!z) {
            this.f14012OooO00o = (Parcelable) this.f14013OooO00o;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14556OooO00o() {
        this.f14011OooO00o = PorterDuff.Mode.valueOf(this.f14014OooO00o);
        int i = this.f14009OooO00o;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f14013OooO00o = this.f14015OooO00o;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f14013OooO00o = new String(this.f14015OooO00o, Charset.forName(C3817f.f10341c));
                return;
            }
            Parcelable parcelable = this.f14012OooO00o;
            if (parcelable != null) {
                this.f14013OooO00o = parcelable;
                return;
            }
            byte[] bArr = this.f14015OooO00o;
            this.f14013OooO00o = bArr;
            this.f14009OooO00o = 3;
            this.f14016OooO0O0 = 0;
            this.f14017OooO0OO = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.f14012OooO00o;
        if (parcelable2 != null) {
            this.f14013OooO00o = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    @Nullable
    public static IconCompat OooO00o(@NonNull Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f14016OooO0O0 = bundle.getInt(f14008OooO0o0);
        iconCompat.f14017OooO0OO = bundle.getInt(f14006OooO0o);
        if (bundle.containsKey(OooO0oO)) {
            iconCompat.f14010OooO00o = (ColorStateList) bundle.getParcelable(OooO0oO);
        }
        if (bundle.containsKey(OooO0oo)) {
            iconCompat.f14011OooO00o = PorterDuff.Mode.valueOf(bundle.getString(OooO0oo));
        }
        if (!(i == -1 || i == 1)) {
            if (i != 2) {
                if (i == 3) {
                    iconCompat.f14013OooO00o = bundle.getByteArray(f14005OooO0Oo);
                    return iconCompat;
                } else if (i != 4) {
                    if (i != 5) {
                        String str = "Unknown type " + i;
                        return null;
                    }
                }
            }
            iconCompat.f14013OooO00o = bundle.getString(f14005OooO0Oo);
            return iconCompat;
        }
        iconCompat.f14013OooO00o = bundle.getParcelable(f14005OooO0Oo);
        return iconCompat;
    }

    @Nullable
    @RequiresApi(23)
    public static IconCompat OooO00o(@NonNull Context context, @NonNull Icon icon) {
        C7086o00OO0OO.OooO00o(icon);
        int OooO0O02 = OooO0O0(icon);
        if (OooO0O02 == 2) {
            String OooO00o2 = m14552OooO00o(icon);
            try {
                return OooO00o(OooO00o(context, OooO00o2), OooO00o2, OooO00o(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else if (OooO0O02 == 4) {
            return OooO00o(m14550OooO00o(icon));
        } else {
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f14013OooO00o = icon;
            return iconCompat;
        }
    }

    @Nullable
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static IconCompat m14551OooO00o(@NonNull Icon icon) {
        C7086o00OO0OO.OooO00o(icon);
        int OooO0O02 = OooO0O0(icon);
        if (OooO0O02 == 2) {
            return OooO00o((Resources) null, m14552OooO00o(icon), OooO00o(icon));
        }
        if (OooO0O02 == 4) {
            return OooO00o(m14550OooO00o(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f14013OooO00o = icon;
        return iconCompat;
    }

    @Nullable
    @RequiresApi(23)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m14552OooO00o(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @DrawableRes
    @IdRes
    @RequiresApi(23)
    public static int OooO00o(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    @Nullable
    @RequiresApi(23)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Uri m14550OooO00o(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @VisibleForTesting
    public static Bitmap OooO00o(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, C7295o0O0O0o0.o0ooOOo);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, C7295o0O0O0o0.o0ooOO0);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
