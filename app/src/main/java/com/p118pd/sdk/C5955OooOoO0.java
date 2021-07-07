package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.OooOoO0  reason: case insensitive filesystem */
public class C5955OooOoO0 extends MenuInflater {
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f17139OooO00o = "SupportMenuInflater";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Class<?>[] f17140OooO00o;
    public static final String OooO0O0 = "menu";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Class<?>[] f17141OooO0O0;
    public static final String OooO0OO = "group";
    public static final String OooO0Oo = "item";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f17142OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f17143OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object[] f17144OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Object[] f17145OooO0O0;

    /* renamed from: com.pd.sdk.OooOoO0$OooO00o */
    public static class OooO00o implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] OooO00o = {MenuItem.class};

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f17146OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Method f17147OooO00o;

        public OooO00o(Object obj, String str) {
            this.f17146OooO00o = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f17147OooO00o = cls.getMethod(str, OooO00o);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f17147OooO00o.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f17147OooO00o.invoke(this.f17146OooO00o, menuItem)).booleanValue();
                }
                this.f17147OooO00o.invoke(this.f17146OooO00o, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f17140OooO00o = clsArr;
        f17141OooO0O0 = clsArr;
    }

    public C5955OooOoO0(Context context) {
        super(context);
        this.f17142OooO00o = context;
        Object[] objArr = {context};
        this.f17144OooO00o = objArr;
        this.f17145OooO0O0 = objArr;
    }

    private void OooO00o(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        OooO0O0 oooO0O0 = new OooO0O0(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(OooO0O0)) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            oooO0O0.OooO0O0();
                        } else if (name2.equals("item")) {
                            if (!oooO0O0.m16759OooO00o()) {
                                AbstractC7089o00OO0oO o00oo0oo = oooO0O0.f17154OooO00o;
                                if (o00oo0oo == null || !o00oo0oo.m18367OooO00o()) {
                                    oooO0O0.m16758OooO00o();
                                } else {
                                    oooO0O0.OooO00o();
                                }
                            }
                        } else if (name2.equals(OooO0O0)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        oooO0O0.OooO00o(attributeSet);
                    } else if (name3.equals("item")) {
                        oooO0O0.OooO0O0(attributeSet);
                    } else if (name3.equals(OooO0O0)) {
                        OooO00o(xmlPullParser, attributeSet, oooO0O0.OooO00o());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(@LayoutRes int i, Menu menu) {
        if (!(menu instanceof AbstractMenuC7049o00O00o)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f17142OooO00o.getResources().getLayout(i);
            OooO00o(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: com.pd.sdk.OooOoO0$OooO0O0 */
    public class OooO0O0 {
        public static final boolean OooO = true;
        public static final boolean OooO0oO = false;
        public static final boolean OooO0oo = true;
        public static final int OooOOO = 0;
        public static final int OooOOO0 = 0;
        public static final int OooOOOO = 0;
        public static final int OooOOOo = 0;
        public static final int OooOOo0 = 0;

        /* renamed from: OooO  reason: collision with other field name */
        public int f17148OooO;
        public char OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f17149OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ColorStateList f17150OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public PorterDuff.Mode f17151OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Menu f17152OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7089o00OO0oO f17154OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f17155OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f17156OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f17157OooO00o;
        public char OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int f17158OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public CharSequence f17159OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f17160OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f17161OooO0O0;
        public int OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public CharSequence f17162OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public String f17163OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f17164OooO0OO;
        public int OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public CharSequence f17165OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f17166OooO0Oo;
        public int OooO0o;

        /* renamed from: OooO0o  reason: collision with other field name */
        public boolean f17167OooO0o;
        public int OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f17168OooO0o0;

        /* renamed from: OooO0oO  reason: collision with other field name */
        public int f17169OooO0oO;

        /* renamed from: OooO0oo  reason: collision with other field name */
        public int f17170OooO0oo;
        public int OooOO0;
        public int OooOO0O;
        public int OooOO0o;

        public OooO0O0(Menu menu) {
            this.f17152OooO00o = menu;
            OooO0O0();
        }

        public void OooO00o(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C5955OooOoO0.this.f17142OooO00o.obtainStyledAttributes(attributeSet, C0033R.styleable.OooOoo);
            this.f17149OooO00o = obtainStyledAttributes.getResourceId(C0033R.styleable.MenuGroup_android_id, 0);
            this.f17158OooO0O0 = obtainStyledAttributes.getInt(C0033R.styleable.MenuGroup_android_menuCategory, 0);
            this.OooO0OO = obtainStyledAttributes.getInt(C0033R.styleable.MenuGroup_android_orderInCategory, 0);
            this.OooO0Oo = obtainStyledAttributes.getInt(C0033R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.f17157OooO00o = obtainStyledAttributes.getBoolean(C0033R.styleable.MenuGroup_android_visible, true);
            this.f17161OooO0O0 = obtainStyledAttributes.getBoolean(C0033R.styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void OooO0O0() {
            this.f17149OooO00o = 0;
            this.f17158OooO0O0 = 0;
            this.OooO0OO = 0;
            this.OooO0Oo = 0;
            this.f17157OooO00o = true;
            this.f17161OooO0O0 = true;
        }

        public void OooO0O0(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C5955OooOoO0.this.f17142OooO00o.obtainStyledAttributes(attributeSet, C0033R.styleable.OooOooO);
            this.OooO0o0 = obtainStyledAttributes.getResourceId(C0033R.styleable.MenuItem_android_id, 0);
            this.OooO0o = (obtainStyledAttributes.getInt(C0033R.styleable.MenuItem_android_menuCategory, this.f17158OooO0O0) & -65536) | (obtainStyledAttributes.getInt(C0033R.styleable.MenuItem_android_orderInCategory, this.OooO0OO) & 65535);
            this.f17155OooO00o = obtainStyledAttributes.getText(C0033R.styleable.MenuItem_android_title);
            this.f17159OooO0O0 = obtainStyledAttributes.getText(C0033R.styleable.MenuItem_android_titleCondensed);
            this.f17169OooO0oO = obtainStyledAttributes.getResourceId(C0033R.styleable.MenuItem_android_icon, 0);
            this.OooO00o = OooO00o(obtainStyledAttributes.getString(C0033R.styleable.MenuItem_android_alphabeticShortcut));
            this.f17170OooO0oo = obtainStyledAttributes.getInt(C0033R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.OooO0O0 = OooO00o(obtainStyledAttributes.getString(C0033R.styleable.MenuItem_android_numericShortcut));
            this.f17148OooO = obtainStyledAttributes.getInt(C0033R.styleable.MenuItem_numericModifiers, 4096);
            if (obtainStyledAttributes.hasValue(C0033R.styleable.MenuItem_android_checkable)) {
                this.OooOO0 = obtainStyledAttributes.getBoolean(C0033R.styleable.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.OooOO0 = this.OooO0Oo;
            }
            this.f17166OooO0Oo = obtainStyledAttributes.getBoolean(C0033R.styleable.MenuItem_android_checked, false);
            this.f17168OooO0o0 = obtainStyledAttributes.getBoolean(C0033R.styleable.MenuItem_android_visible, this.f17157OooO00o);
            this.f17167OooO0o = obtainStyledAttributes.getBoolean(C0033R.styleable.MenuItem_android_enabled, this.f17161OooO0O0);
            this.OooOO0O = obtainStyledAttributes.getInt(C0033R.styleable.MenuItem_showAsAction, -1);
            this.f17163OooO0OO = obtainStyledAttributes.getString(C0033R.styleable.MenuItem_android_onClick);
            this.OooOO0o = obtainStyledAttributes.getResourceId(C0033R.styleable.MenuItem_actionLayout, 0);
            this.f17156OooO00o = obtainStyledAttributes.getString(C0033R.styleable.MenuItem_actionViewClass);
            String string = obtainStyledAttributes.getString(C0033R.styleable.MenuItem_actionProviderClass);
            this.f17160OooO0O0 = string;
            if ((string != null) && this.OooOO0o == 0 && this.f17156OooO00o == null) {
                this.f17154OooO00o = (AbstractC7089o00OO0oO) OooO00o(this.f17160OooO0O0, C5955OooOoO0.f17141OooO0O0, C5955OooOoO0.this.f17145OooO0O0);
            } else {
                this.f17154OooO00o = null;
            }
            this.f17162OooO0OO = obtainStyledAttributes.getText(C0033R.styleable.MenuItem_contentDescription);
            this.f17165OooO0Oo = obtainStyledAttributes.getText(C0033R.styleable.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C0033R.styleable.MenuItem_iconTintMode)) {
                this.f17151OooO00o = o0OO00O.OooO00o(obtainStyledAttributes.getInt(C0033R.styleable.MenuItem_iconTintMode, -1), this.f17151OooO00o);
            } else {
                this.f17151OooO00o = null;
            }
            if (obtainStyledAttributes.hasValue(C0033R.styleable.MenuItem_iconTint)) {
                this.f17150OooO00o = obtainStyledAttributes.getColorStateList(C0033R.styleable.MenuItem_iconTint);
            } else {
                this.f17150OooO00o = null;
            }
            obtainStyledAttributes.recycle();
            this.f17164OooO0OO = false;
        }

        private char OooO00o(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private void OooO00o(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f17166OooO0Oo).setVisible(this.f17168OooO0o0).setEnabled(this.f17167OooO0o).setCheckable(this.OooOO0 >= 1).setTitleCondensed(this.f17159OooO0O0).setIcon(this.f17169OooO0oO);
            int i = this.OooOO0O;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f17163OooO0OO != null) {
                if (!C5955OooOoO0.this.f17142OooO00o.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new OooO00o(C5955OooOoO0.this.OooO00o(), this.f17163OooO0OO));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C5967Oooo0OO;
            if (z2) {
                C5967Oooo0OO oooo0OO = (C5967Oooo0OO) menuItem;
            }
            if (this.OooOO0 >= 2) {
                if (z2) {
                    ((C5967Oooo0OO) menuItem).OooO0OO(true);
                } else if (menuItem instanceof MenuItemC5970Oooo0o0) {
                    ((MenuItemC5970Oooo0o0) menuItem).OooO00o(true);
                }
            }
            String str = this.f17156OooO00o;
            if (str != null) {
                menuItem.setActionView((View) OooO00o(str, C5955OooOoO0.f17140OooO00o, C5955OooOoO0.this.f17144OooO00o));
                z = true;
            }
            int i2 = this.OooOO0o;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            AbstractC7089o00OO0oO o00oo0oo = this.f17154OooO00o;
            if (o00oo0oo != null) {
                C8469oOooo0o.OooO00o(menuItem, o00oo0oo);
            }
            C8469oOooo0o.OooO00o(menuItem, this.f17162OooO0OO);
            C8469oOooo0o.OooO0O0(menuItem, this.f17165OooO0Oo);
            C8469oOooo0o.OooO00o(menuItem, this.OooO00o, this.f17170OooO0oo);
            C8469oOooo0o.OooO0O0(menuItem, this.OooO0O0, this.f17148OooO);
            PorterDuff.Mode mode = this.f17151OooO00o;
            if (mode != null) {
                C8469oOooo0o.OooO00o(menuItem, mode);
            }
            ColorStateList colorStateList = this.f17150OooO00o;
            if (colorStateList != null) {
                C8469oOooo0o.OooO00o(menuItem, colorStateList);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m16758OooO00o() {
            this.f17164OooO0OO = true;
            OooO00o(this.f17152OooO00o.add(this.f17149OooO00o, this.OooO0o0, this.OooO0o, this.f17155OooO00o));
        }

        public SubMenu OooO00o() {
            this.f17164OooO0OO = true;
            SubMenu addSubMenu = this.f17152OooO00o.addSubMenu(this.f17149OooO00o, this.OooO0o0, this.OooO0o, this.f17155OooO00o);
            OooO00o(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16759OooO00o() {
            return this.f17164OooO0OO;
        }

        private <T> T OooO00o(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C5955OooOoO0.this.f17142OooO00o.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                String str2 = "Cannot instantiate class: " + str;
                return null;
            }
        }
    }

    public Object OooO00o() {
        if (this.f17143OooO00o == null) {
            this.f17143OooO00o = OooO00o(this.f17142OooO00o);
        }
        return this.f17143OooO00o;
    }

    private Object OooO00o(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? OooO00o(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
