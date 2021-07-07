package com.p118pd.sdk;

import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o000oooO  reason: case insensitive filesystem */
public class C7038o000oooO extends C7036o000ooo {
    public static final int OooO0O0 = -1;
    public static final String OooOO0o = "TypefaceCompatApi28Impl";
    public static final String OooOOO = "sans-serif";
    public static final String OooOOO0 = "createFromFamiliesWithDefault";

    @Override // com.p118pd.sdk.C7036o000ooo
    public Typeface OooO00o(Object obj) {
        try {
            Object newInstance = Array.newInstance(((C7036o000ooo) this).f19301OooO00o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f19305OooO0o0.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.p118pd.sdk.C7036o000ooo
    public Method OooO0Oo(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
