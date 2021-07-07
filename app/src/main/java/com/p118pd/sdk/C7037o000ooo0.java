package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000ooo0  reason: case insensitive filesystem */
public class C7037o000ooo0 extends C7039o000oooo {
    public static final Class OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Constructor f19306OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Method f19307OooO00o;
    public static final Method OooO0O0;
    public static final String OooO0OO = "TypefaceCompatApi24Impl";
    public static final String OooO0Oo = "android.graphics.FontFamily";
    public static final String OooO0o = "createFromFamiliesWithDefault";
    public static final String OooO0o0 = "addFontWeightStyle";

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod(OooO0o0, ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            cls = null;
            method2 = null;
            method = null;
        }
        f19306OooO00o = constructor;
        OooO00o = cls;
        f19307OooO00o = method;
        OooO0O0 = method2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18303OooO00o() {
        Method method = f19307OooO00o;
        return f19307OooO00o != null;
    }

    public static Object OooO00o() {
        try {
            return f19306OooO00o.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean OooO00o(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f19307OooO00o.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static Typeface OooO00o(Object obj) {
        try {
            Object newInstance = Array.newInstance(OooO00o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) OooO0O0.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.p118pd.sdk.C7039o000oooo
    public Typeface OooO00o(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.C5039OooO0oo[] oooO0ooArr, int i) {
        Object OooO00o2 = OooO00o();
        C6987o000O0o o000o0o = new C6987o000O0o();
        for (FontsContractCompat.C5039OooO0oo oooO0oo : oooO0ooArr) {
            Uri OooO00o3 = oooO0oo.m14560OooO00o();
            ByteBuffer byteBuffer = (ByteBuffer) o000o0o.get(OooO00o3);
            if (byteBuffer == null) {
                byteBuffer = C6929o00.OooO00o(context, cancellationSignal, OooO00o3);
                o000o0o.put(OooO00o3, byteBuffer);
            }
            if (!OooO00o(OooO00o2, byteBuffer, oooO0oo.OooO0O0(), oooO0oo.OooO0OO(), oooO0oo.m14561OooO00o())) {
                return null;
            }
        }
        return Typeface.create(OooO00o(OooO00o2), i);
    }

    @Override // com.p118pd.sdk.C7039o000oooo
    public Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0O0 oooO0O0, Resources resources, int i) {
        Object OooO00o2 = OooO00o();
        FontResourcesParserCompat.OooO0OO[] OooO00o3 = oooO0O0.OooO00o();
        for (FontResourcesParserCompat.OooO0OO oooO0OO : OooO00o3) {
            ByteBuffer OooO00o4 = C6929o00.OooO00o(context, resources, oooO0OO.OooO00o());
            if (OooO00o4 == null || !OooO00o(OooO00o2, OooO00o4, oooO0OO.OooO0O0(), oooO0OO.OooO0OO(), oooO0OO.m14547OooO00o())) {
                return null;
            }
        }
        return OooO00o(OooO00o2);
    }
}
