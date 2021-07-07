package com.p118pd.sdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

@RequiresApi(26)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000ooo  reason: case insensitive filesystem */
public class C7036o000ooo extends C7035o000ooOO {
    public static final String OooO = "freeze";
    public static final int OooO00o = -1;
    public static final String OooO0Oo = "TypefaceCompatApi26Impl";
    public static final String OooO0o = "addFontFromAssetManager";
    public static final String OooO0o0 = "android.graphics.FontFamily";
    public static final String OooO0oO = "addFontFromBuffer";
    public static final String OooO0oo = "createFromFamiliesWithDefault";
    public static final String OooOO0 = "abortCreation";
    public static final String OooOO0O = "sans-serif";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Class f19301OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Constructor f19302OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Method f19303OooO00o;
    public final Method OooO0O0;
    public final Method OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public final Method f19304OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public final Method f19305OooO0o0;

    public C7036o000ooo() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class OooO00o2 = m18301OooO00o();
            constructor = OooO00o(OooO00o2);
            method4 = OooO0O0(OooO00o2);
            method3 = OooO0OO(OooO00o2);
            method2 = OooO0o0(OooO00o2);
            method = m18302OooO00o(OooO00o2);
            method5 = OooO0Oo(OooO00o2);
            cls = OooO00o2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            String str = "Unable to collect necessary methods for class " + e.getClass().getName();
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f19301OooO00o = cls;
        this.f19302OooO00o = constructor;
        this.f19303OooO00o = method4;
        this.OooO0O0 = method3;
        this.OooO0OO = method2;
        this.f19304OooO0Oo = method;
        this.f19305OooO0o0 = method5;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m18298OooO00o() {
        Method method = this.f19303OooO00o;
        return this.f19303OooO00o != null;
    }

    public Method OooO0O0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(OooO0o, AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method OooO0OO(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(OooO0oO, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method OooO0Oo(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Method OooO0o0(Class cls) throws NoSuchMethodException {
        return cls.getMethod(OooO, new Class[0]);
    }

    private Object OooO00o() {
        try {
            return this.f19302OooO00o.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean OooO00o(Context context, Object obj, String str, int i, int i2, int i3, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f19303OooO00o.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean OooO00o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.OooO0O0.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Typeface m18300OooO00o(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f19301OooO00o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f19305OooO0o0.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m18299OooO00o(Object obj) {
        try {
            return ((Boolean) this.OooO0OO.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private void OooO00o(Object obj) {
        try {
            this.f19304OooO0Oo.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.p118pd.sdk.C7039o000oooo
    public Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0O0 oooO0O0, Resources resources, int i) {
        if (!m18298OooO00o()) {
            return super.OooO00o(context, oooO0O0, resources, i);
        }
        Object OooO00o2 = OooO00o();
        FontResourcesParserCompat.OooO0OO[] OooO00o3 = oooO0O0.OooO00o();
        for (FontResourcesParserCompat.OooO0OO oooO0OO : OooO00o3) {
            if (!OooO00o(context, OooO00o2, oooO0OO.m14546OooO00o(), oooO0OO.OooO0O0(), oooO0OO.OooO0OO(), oooO0OO.m14547OooO00o() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(oooO0OO.m14548OooO0O0()))) {
                OooO00o(OooO00o2);
                return null;
            }
        }
        if (!m18299OooO00o(OooO00o2)) {
            return null;
        }
        return m18300OooO00o(OooO00o2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r11 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r12.addSuppressed(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        throw r13;
     */
    @Override // com.p118pd.sdk.C7035o000ooOO, com.p118pd.sdk.C7039o000oooo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface OooO00o(android.content.Context r11, @androidx.annotation.Nullable android.os.CancellationSignal r12, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.C5039OooO0oo[] r13, int r14) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7036o000ooo.OooO00o(android.content.Context, android.os.CancellationSignal, androidx.core.provider.FontsContractCompat$OooO0oo[], int):android.graphics.Typeface");
    }

    @Override // com.p118pd.sdk.C7039o000oooo
    @Nullable
    public Typeface OooO00o(Context context, Resources resources, int i, String str, int i2) {
        if (!m18298OooO00o()) {
            return super.OooO00o(context, resources, i, str, i2);
        }
        Object OooO00o2 = OooO00o();
        if (!OooO00o(context, OooO00o2, str, 0, -1, -1, null)) {
            OooO00o(OooO00o2);
            return null;
        } else if (!m18299OooO00o(OooO00o2)) {
            return null;
        } else {
            return m18300OooO00o(OooO00o2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class m18301OooO00o() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor OooO00o(Class cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Method m18302OooO00o(Class cls) throws NoSuchMethodException {
        return cls.getMethod(OooOO0, new Class[0]);
    }
}
