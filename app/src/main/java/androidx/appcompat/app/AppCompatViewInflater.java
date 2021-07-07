package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.C5952OooOo0O;
import com.p118pd.sdk.C5986OoooOoo;
import com.p118pd.sdk.C5989Ooooo0o;
import com.p118pd.sdk.C5990OooooO0;
import com.p118pd.sdk.C5991OooooOO;
import com.p118pd.sdk.C5993Oooooo;
import com.p118pd.sdk.C5998Ooooooo;
import com.p118pd.sdk.C6971o0000oO0;
import com.p118pd.sdk.C7052o00O0O;
import com.p118pd.sdk.C7155o00o0O;
import com.p118pd.sdk.C7190o00oO0O;
import com.p118pd.sdk.C7237o00ooo;
import com.p118pd.sdk.C7724o0ooOOo;
import com.p118pd.sdk.C8510oo000o;
import com.p118pd.sdk.C8888ooOO;
import com.p118pd.sdk.o0000;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater {
    public static final String OooO00o = "AppCompatViewInflater";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, Constructor<? extends View>> f13648OooO00o = new C6971o0000oO0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f13649OooO00o = {16843375};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Class<?>[] f13650OooO00o = {Context.class, AttributeSet.class};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f13651OooO00o = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object[] f13652OooO00o = new Object[2];

    public static class OooO00o implements View.OnClickListener {
        public Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final View f13653OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Method f13654OooO00o;
        public final String o0ooOOo;

        public OooO00o(@NonNull View view, @NonNull String str) {
            this.f13653OooO00o = view;
            this.o0ooOOo = str;
        }

        @NonNull
        private void OooO00o(@Nullable Context context, @NonNull String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.o0ooOOo, View.class)) != null) {
                        this.f13654OooO00o = method;
                        this.OooO00o = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f13653OooO00o.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f13653OooO00o.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.o0ooOOo + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f13653OooO00o.getClass() + str2);
        }

        public void onClick(@NonNull View view) {
            if (this.f13654OooO00o == null) {
                OooO00o(this.f13653OooO00o.getContext(), this.o0ooOOo);
            }
            try {
                this.f13654OooO00o.invoke(this.OooO00o, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private View OooO0O0(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f13652OooO00o[0] = context;
            this.f13652OooO00o[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (int i = 0; i < f13651OooO00o.length; i++) {
                    View OooO00o2 = OooO00o(context, str, f13651OooO00o[i]);
                    if (OooO00o2 != null) {
                        return OooO00o2;
                    }
                }
                Object[] objArr = this.f13652OooO00o;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View OooO00o3 = OooO00o(context, str, (String) null);
            Object[] objArr2 = this.f13652OooO00o;
            objArr2[0] = null;
            objArr2[1] = null;
            return OooO00o3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.f13652OooO00o;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    @Nullable
    public View OooO00o(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View OooO00o(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = OooO00o(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = o0000.OooO00o(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = '\f';
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = m14396OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case 1:
                view2 = m14398OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case 2:
                view2 = m14387OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case 3:
                view2 = m14390OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case 4:
                view2 = m14394OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case 5:
                view2 = m14391OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case 6:
                view2 = m14388OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case 7:
                view2 = m14393OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case '\b':
                view2 = m14389OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case '\t':
                view2 = OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case '\n':
                view2 = m14392OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case 11:
                view2 = m14395OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            case '\f':
                view2 = m14397OooO00o(context2, attributeSet);
                OooO00o(view2, str);
                break;
            default:
                view2 = OooO00o(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = OooO0O0(context2, str, attributeSet);
        }
        if (view2 != null) {
            OooO00o(view2, attributeSet);
        }
        return view2;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7724o0ooOOo m14396OooO00o(Context context, AttributeSet attributeSet) {
        return new C7724o0ooOOo(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8888ooOO m14398OooO00o(Context context, AttributeSet attributeSet) {
        return new C8888ooOO(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5989Ooooo0o m14387OooO00o(Context context, AttributeSet attributeSet) {
        return new C5989Ooooo0o(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5993Oooooo m14390OooO00o(Context context, AttributeSet attributeSet) {
        return new C5993Oooooo(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7190o00oO0O m14394OooO00o(Context context, AttributeSet attributeSet) {
        return new C7190o00oO0O(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5998Ooooooo m14391OooO00o(Context context, AttributeSet attributeSet) {
        return new C5998Ooooooo(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5990OooooO0 m14388OooO00o(Context context, AttributeSet attributeSet) {
        return new C5990OooooO0(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7155o00o0O m14393OooO00o(Context context, AttributeSet attributeSet) {
        return new C7155o00o0O(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5991OooooOO m14389OooO00o(Context context, AttributeSet attributeSet) {
        return new C5991OooooOO(context, attributeSet);
    }

    @NonNull
    public C5986OoooOoo OooO00o(Context context, AttributeSet attributeSet) {
        return new C5986OoooOoo(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7052o00O0O m14392OooO00o(Context context, AttributeSet attributeSet) {
        return new C7052o00O0O(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7237o00ooo m14395OooO00o(Context context, AttributeSet attributeSet) {
        return new C7237o00ooo(context, attributeSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8510oo000o m14397OooO00o(Context context, AttributeSet attributeSet) {
        return new C8510oo000o(context, attributeSet);
    }

    private void OooO00o(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(AppCompatViewInflater.class.getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    private void OooO00o(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || ViewCompat.m14598OooO0o0(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13649OooO00o);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new OooO00o(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View OooO00o(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor<? extends View> constructor = f13648OooO00o.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f13650OooO00o);
                f13648OooO00o.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f13652OooO00o);
    }

    public static Context OooO00o(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0033R.styleable.Oooo, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0033R.styleable.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0033R.styleable.View_theme, 0)) != 0) {
            Log.i(OooO00o, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C5952OooOo0O) || ((C5952OooOo0O) context).m16750OooO00o() != resourceId) ? new C5952OooOo0O(context, resourceId) : context;
        }
        return context;
    }
}
