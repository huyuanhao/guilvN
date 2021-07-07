package com.p118pd.sdk;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.o00o0Oo  reason: case insensitive filesystem */
public final class C7163o00o0Oo extends AbstractC7179o00o0oOo implements AbstractC7175o00o0o0o.OooO00o, LayoutInflater$Factory2C7167o00o0o.AbstractC7172OooOO0o {
    public static final String OooO0O0 = "FragmentManager";
    public static final int OooOOo = 1;
    public static final int OooOOo0 = 0;
    public static final int OooOOoo = 2;
    public static final int OooOo = 7;
    public static final int OooOo0 = 4;
    public static final int OooOo00 = 3;
    public static final int OooOo0O = 5;
    public static final int OooOo0o = 6;
    public static final int OooOoO = 9;
    public static final int OooOoO0 = 8;
    public int OooO;
    public final LayoutInflater$Factory2C7167o00o0o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f19560OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f19561OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<OooO00o> f19562OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19563OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public CharSequence f19564OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public ArrayList<String> f19565OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19566OooO0O0 = true;
    public ArrayList<String> OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f19567OooO0OO;
    public ArrayList<Runnable> OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f19568OooO0Oo = false;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public int OooOOO = -1;
    public int OooOOO0;
    public int OooOOOO;
    public int OooOOOo;

    /* renamed from: com.pd.sdk.o00o0Oo$OooO00o */
    public static final class OooO00o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Fragment f19569OooO00o;
        public int OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;
        public int OooO0o0;

        public OooO00o() {
        }

        public OooO00o(int i, Fragment fragment) {
            this.OooO00o = i;
            this.f19569OooO00o = fragment;
        }
    }

    public C7163o00o0Oo(LayoutInflater$Factory2C7167o00o0o o00o0o) {
        this.OooO00o = o00o0o;
    }

    public void OooO00o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        OooO00o(str, printWriter, true);
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    public int OooO0O0() {
        return this.OooOOOo;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0OO(Fragment fragment) {
        m18604OooO00o(new OooO00o(4, fragment));
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0Oo(Fragment fragment) {
        m18604OooO00o(new OooO00o(3, fragment));
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0o(Fragment fragment) {
        m18604OooO00o(new OooO00o(5, fragment));
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0o0(@Nullable Fragment fragment) {
        m18604OooO00o(new OooO00o(8, fragment));
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    public int getId() {
        return this.OooOOO;
    }

    @Override // com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    @Nullable
    public String getName() {
        return this.f19561OooO00o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.OooOOO >= 0) {
            sb.append(" #");
            sb.append(this.OooOOO);
        }
        if (this.f19561OooO00o != null) {
            sb.append(" ");
            sb.append(this.f19561OooO00o);
        }
        sb.append(C7522o0Ooo0o.OooO0Oo);
        return sb.toString();
    }

    public void OooO00o(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f19561OooO00o);
            printWriter.print(" mIndex=");
            printWriter.print(this.OooOOO);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f19567OooO0OO);
            if (this.OooOO0o != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.OooOO0o));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.OooOOO0));
            }
            if (!(this.OooO0oo == 0 && this.OooO == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.OooO0oo));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.OooO));
            }
            if (!(this.OooOO0 == 0 && this.OooOO0O == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.OooOO0));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.OooOO0O));
            }
            if (!(this.OooOOOO == 0 && this.f19560OooO00o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.OooOOOO));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f19560OooO00o);
            }
            if (!(this.OooOOOo == 0 && this.f19564OooO0O0 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.OooOOOo));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f19564OooO0O0);
            }
        }
        if (!this.f19562OooO00o.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + C9878I1.f23489OooO00o;
            int size = this.f19562OooO00o.size();
            for (int i = 0; i < size; i++) {
                OooO00o oooO00o = this.f19562OooO00o.get(i);
                switch (oooO00o.OooO00o) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + oooO00o.OooO00o;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(oooO00o.f19569OooO00o);
                if (z) {
                    if (!(oooO00o.OooO0O0 == 0 && oooO00o.OooO0OO == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(oooO00o.OooO0O0));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(oooO00o.OooO0OO));
                    }
                    if (oooO00o.OooO0Oo != 0 || oooO00o.OooO0o0 != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(oooO00o.OooO0Oo));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(oooO00o.OooO0o0));
                    }
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public CharSequence m18608OooO0O0() {
        if (this.OooOOOO != 0) {
            return this.OooO00o.f19580OooO00o.m18653OooO00o().getText(this.OooOOOO);
        }
        return this.f19560OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0OO(int i) {
        this.OooOO0o = i;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0Oo(int i) {
        this.OooOOO0 = i;
        return this;
    }

    public int OooO0o() {
        return this.OooOOO0;
    }

    public int OooO0o0() {
        return this.OooOO0o;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public int OooO0OO() {
        return OooO00o(false);
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public void m18613OooO0Oo() {
        ArrayList<Runnable> arrayList = this.OooO0Oo;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.OooO0Oo.get(i).run();
            }
            this.OooO0Oo = null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m18611OooO0OO() {
        int size = this.f19562OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO00o oooO00o = this.f19562OooO00o.get(i);
            Fragment fragment = oooO00o.f19569OooO00o;
            if (fragment != null) {
                fragment.setNextTransition(this.OooOO0o, this.OooOOO0);
            }
            switch (oooO00o.OooO00o) {
                case 1:
                    fragment.setNextAnim(oooO00o.OooO0O0);
                    this.OooO00o.OooO00o(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + oooO00o.OooO00o);
                case 3:
                    fragment.setNextAnim(oooO00o.OooO0OO);
                    this.OooO00o.OooOO0O(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(oooO00o.OooO0OO);
                    this.OooO00o.OooO0o0(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(oooO00o.OooO0O0);
                    this.OooO00o.OooOOO(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(oooO00o.OooO0OO);
                    this.OooO00o.OooO0OO(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(oooO00o.OooO0O0);
                    this.OooO00o.m18629OooO00o(fragment);
                    break;
                case 8:
                    this.OooO00o.OooOOO0(fragment);
                    break;
                case 9:
                    this.OooO00o.OooOOO0(null);
                    break;
            }
            if (!(this.f19568OooO0Oo || oooO00o.OooO00o == 1 || fragment == null)) {
                this.OooO00o.OooO0oo(fragment);
            }
        }
        if (!this.f19568OooO0Oo) {
            LayoutInflater$Factory2C7167o00o0o o00o0o = this.OooO00o;
            o00o0o.m18628OooO00o(o00o0o.o0ooOOo, true);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0O0(int i, Fragment fragment) {
        return OooO0O0(i, fragment, null);
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0O0(int i, Fragment fragment, @Nullable String str) {
        if (i != 0) {
            OooO00o(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public int OooO0Oo() {
        return OooO00o(true);
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0O0(Fragment fragment) {
        m18604OooO00o(new OooO00o(6, fragment));
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0O0(int i) {
        this.OooOOOO = i;
        this.f19560OooO00o = null;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0O0(@Nullable CharSequence charSequence) {
        this.OooOOOO = 0;
        this.f19560OooO00o = charSequence;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18609OooO0O0() {
        m18599OooO00o();
        this.OooO00o.OooO0O0((LayoutInflater$Factory2C7167o00o0o.AbstractC7172OooOO0o) this, true);
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO0O0(boolean z) {
        this.f19568OooO0Oo = z;
        return this;
    }

    public Fragment OooO0O0(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.f19562OooO00o.size(); i++) {
            OooO00o oooO00o = this.f19562OooO00o.get(i);
            int i2 = oooO00o.OooO00o;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = oooO00o.f19569OooO00o;
                            break;
                    }
                }
                arrayList.add(oooO00o.f19569OooO00o);
            }
            arrayList.remove(oooO00o.f19569OooO00o);
        }
        return fragment;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18610OooO0O0() {
        return this.f19562OooO00o.isEmpty();
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18612OooO0OO() {
        for (int i = 0; i < this.f19562OooO00o.size(); i++) {
            if (OooO00o(this.f19562OooO00o.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    public int OooO00o() {
        return this.OooOOOO;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18601OooO00o() {
        if (this.OooOOOo != 0) {
            return this.OooO00o.f19580OooO00o.m18653OooO00o().getText(this.OooOOOo);
        }
        return this.f19564OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18604OooO00o(OooO00o oooO00o) {
        this.f19562OooO00o.add(oooO00o);
        oooO00o.OooO0O0 = this.OooO0oo;
        oooO00o.OooO0OO = this.OooO;
        oooO00o.OooO0Oo = this.OooOO0;
        oooO00o.OooO0o0 = this.OooOO0O;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(Fragment fragment, @Nullable String str) {
        OooO00o(0, fragment, str, 1);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(int i, Fragment fragment) {
        OooO00o(i, fragment, (String) null, 1);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(int i, Fragment fragment, @Nullable String str) {
        OooO00o(i, fragment, str, 1);
        return this;
    }

    private void OooO00o(int i, Fragment fragment, @Nullable String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        fragment.mFragmentManager = this.OooO00o;
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        m18604OooO00o(new OooO00o(i2, fragment));
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(Fragment fragment) {
        m18604OooO00o(new OooO00o(7, fragment));
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(int i, int i2) {
        return OooO00o(i, i2, 0, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(int i, int i2, int i3, int i4) {
        this.OooO0oo = i;
        this.OooO = i2;
        this.OooOO0 = i3;
        this.OooOO0O = i4;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(View view, String str) {
        if (C7182o00o0oo0.m18676OooO00o()) {
            String OooO00o2 = ViewCompat.m14574OooO00o(view);
            if (OooO00o2 != null) {
                if (this.f19565OooO0O0 == null) {
                    this.f19565OooO0O0 = new ArrayList<>();
                    this.OooO0OO = new ArrayList<>();
                } else if (this.OooO0OO.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (this.f19565OooO0O0.contains(OooO00o2)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + OooO00o2 + " has already been added to the transaction.");
                }
                this.f19565OooO0O0.add(OooO00o2);
                this.OooO0OO.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(@Nullable String str) {
        if (this.f19566OooO0O0) {
            this.f19563OooO00o = true;
            this.f19561OooO00o = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18606OooO00o() {
        return this.f19566OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7179o00o0oOo m18599OooO00o() {
        if (!this.f19563OooO00o) {
            this.f19566OooO0O0 = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(int i) {
        this.OooOOOo = i;
        this.f19564OooO0O0 = null;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(@Nullable CharSequence charSequence) {
        this.OooOOOo = 0;
        this.f19564OooO0O0 = charSequence;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18603OooO00o(int i) {
        if (this.f19563OooO00o) {
            if (LayoutInflater$Factory2C7167o00o0o.OooO0oo) {
                String str = "Bump nesting in " + this + " by " + i;
            }
            int size = this.f19562OooO00o.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO00o oooO00o = this.f19562OooO00o.get(i2);
                Fragment fragment = oooO00o.f19569OooO00o;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (LayoutInflater$Factory2C7167o00o0o.OooO0oo) {
                        String str2 = "Bump nesting of " + oooO00o.f19569OooO00o + " to " + oooO00o.f19569OooO00o.mBackStackNesting;
                    }
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public AbstractC7179o00o0oOo OooO00o(Runnable runnable) {
        if (runnable != null) {
            m18599OooO00o();
            if (this.OooO0Oo == null) {
                this.OooO0Oo = new ArrayList<>();
            }
            this.OooO0Oo.add(runnable);
            return this;
        }
        throw new IllegalArgumentException("runnable cannot be null");
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7179o00o0oOo, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o, com.p118pd.sdk.AbstractC7175o00o0o0o.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18602OooO00o() {
        m18599OooO00o();
        this.OooO00o.OooO0O0((LayoutInflater$Factory2C7167o00o0o.AbstractC7172OooOO0o) this, false);
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7179o00o0oOo m18600OooO00o(boolean z) {
        return OooO0O0(z);
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    public int OooO00o(boolean z) {
        if (!this.f19567OooO0OO) {
            if (LayoutInflater$Factory2C7167o00o0o.OooO0oo) {
                String str = "Commit: " + this;
                PrintWriter printWriter = new PrintWriter(new C7083o00OO00o("FragmentManager"));
                OooO00o(GlideException.OooO00o.o0ooOoO, (FileDescriptor) null, printWriter, (String[]) null);
                printWriter.close();
            }
            this.f19567OooO0OO = true;
            if (this.f19563OooO00o) {
                this.OooOOO = this.OooO00o.OooO00o(this);
            } else {
                this.OooOOO = -1;
            }
            this.OooO00o.OooO00o(this, z);
            return this.OooOOO;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o.AbstractC7172OooOO0o
    public boolean OooO00o(ArrayList<C7163o00o0Oo> arrayList, ArrayList<Boolean> arrayList2) {
        if (LayoutInflater$Factory2C7167o00o0o.OooO0oo) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f19563OooO00o) {
            return true;
        }
        this.OooO00o.m18630OooO00o(this);
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18607OooO00o(int i) {
        int size = this.f19562OooO00o.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f19562OooO00o.get(i2).f19569OooO00o;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean OooO00o(ArrayList<C7163o00o0Oo> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f19562OooO00o.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f19562OooO00o.get(i4).f19569OooO00o;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C7163o00o0Oo o00o0oo = arrayList.get(i6);
                    int size2 = o00o0oo.f19562OooO00o.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = o00o0oo.f19562OooO00o.get(i7).f19569OooO00o;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7179o00o0oOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18605OooO00o(boolean z) {
        for (int size = this.f19562OooO00o.size() - 1; size >= 0; size--) {
            OooO00o oooO00o = this.f19562OooO00o.get(size);
            Fragment fragment = oooO00o.f19569OooO00o;
            if (fragment != null) {
                fragment.setNextTransition(LayoutInflater$Factory2C7167o00o0o.OooO00o(this.OooOO0o), this.OooOOO0);
            }
            switch (oooO00o.OooO00o) {
                case 1:
                    fragment.setNextAnim(oooO00o.OooO0o0);
                    this.OooO00o.OooOO0O(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + oooO00o.OooO00o);
                case 3:
                    fragment.setNextAnim(oooO00o.OooO0Oo);
                    this.OooO00o.OooO00o(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(oooO00o.OooO0Oo);
                    this.OooO00o.OooOOO(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(oooO00o.OooO0o0);
                    this.OooO00o.OooO0o0(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(oooO00o.OooO0Oo);
                    this.OooO00o.m18629OooO00o(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(oooO00o.OooO0o0);
                    this.OooO00o.OooO0OO(fragment);
                    break;
                case 8:
                    this.OooO00o.OooOOO0(null);
                    break;
                case 9:
                    this.OooO00o.OooOOO0(fragment);
                    break;
            }
            if (!(this.f19568OooO0Oo || oooO00o.OooO00o == 3 || fragment == null)) {
                this.OooO00o.OooO0oo(fragment);
            }
        }
        if (!this.f19568OooO0Oo && z) {
            LayoutInflater$Factory2C7167o00o0o o00o0o = this.OooO00o;
            o00o0o.m18628OooO00o(o00o0o.o0ooOOo, true);
        }
    }

    public Fragment OooO00o(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f19562OooO00o.size()) {
            OooO00o oooO00o = this.f19562OooO00o.get(i);
            int i2 = oooO00o.OooO00o;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = oooO00o.f19569OooO00o;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f19562OooO00o.add(i, new OooO00o(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                OooO00o oooO00o2 = new OooO00o(3, fragment4);
                                oooO00o2.OooO0O0 = oooO00o.OooO0O0;
                                oooO00o2.OooO0Oo = oooO00o.OooO0Oo;
                                oooO00o2.OooO0OO = oooO00o.OooO0OO;
                                oooO00o2.OooO0o0 = oooO00o.OooO0o0;
                                this.f19562OooO00o.add(i, oooO00o2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f19562OooO00o.remove(i);
                        i--;
                    } else {
                        oooO00o.OooO00o = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(oooO00o.f19569OooO00o);
                    Fragment fragment5 = oooO00o.f19569OooO00o;
                    if (fragment5 == fragment2) {
                        this.f19562OooO00o.add(i, new OooO00o(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f19562OooO00o.add(i, new OooO00o(9, fragment2));
                        i++;
                        fragment2 = oooO00o.f19569OooO00o;
                    }
                }
                i++;
            }
            arrayList.add(oooO00o.f19569OooO00o);
            i++;
        }
        return fragment2;
    }

    public void OooO00o(Fragment.AbstractC5047OooO0o0 oooO0o0) {
        for (int i = 0; i < this.f19562OooO00o.size(); i++) {
            OooO00o oooO00o = this.f19562OooO00o.get(i);
            if (OooO00o(oooO00o)) {
                oooO00o.f19569OooO00o.setOnStartEnterTransitionListener(oooO0o0);
            }
        }
    }

    public static boolean OooO00o(OooO00o oooO00o) {
        Fragment fragment = oooO00o.f19569OooO00o;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }
}
