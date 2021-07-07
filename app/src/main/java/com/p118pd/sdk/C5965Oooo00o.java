package com.p118pd.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.Oooo00o  reason: case insensitive filesystem */
public class C5965Oooo00o implements AbstractMenuC7049o00O00o {
    public static final String OooO00o = "MenuBuilder";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f17198OooO00o = {1, 4, 5, 3, 2, 0};
    public static final String OooO0O0 = "android:menu:presenters";
    public static final String OooO0OO = "android:menu:actionviewstates";
    public static final String OooO0Oo = "android:menu:expandedactionview";
    public boolean OooO = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Context f17199OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Resources f17200OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f17201OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SparseArray<Parcelable> f17202OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ContextMenu.ContextMenuInfo f17203OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f17204OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f17205OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5967Oooo0OO f17206OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f17207OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<C5967Oooo0OO> f17208OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CopyOnWriteArrayList<WeakReference<AbstractC5961Oooo>> f17209OooO00o = new CopyOnWriteArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17210OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public ArrayList<C5967Oooo0OO> f17211OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17212OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public ArrayList<C5967Oooo0OO> f17213OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f17214OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public ArrayList<C5967Oooo0OO> f17215OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f17216OooO0Oo;
    public boolean OooO0o = false;
    public ArrayList<C5967Oooo0OO> OooO0o0 = new ArrayList<>();

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f17217OooO0o0 = false;
    public boolean OooO0oO = false;
    public boolean OooO0oo = false;
    public boolean OooOO0 = false;
    public boolean OooOO0O;
    public int OooOO0o = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.pd.sdk.Oooo00o$OooO00o */
    public interface OooO00o {
        void OooO00o(C5965Oooo00o oooo00o);

        boolean OooO00o(C5965Oooo00o oooo00o, MenuItem menuItem);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.pd.sdk.Oooo00o$OooO0O0 */
    public interface OooO0O0 {
        boolean OooO00o(C5967Oooo0OO oooo0OO);
    }

    public C5965Oooo00o(Context context) {
        this.f17199OooO00o = context;
        this.f17200OooO00o = context.getResources();
        this.f17208OooO00o = new ArrayList<>();
        this.f17211OooO0O0 = new ArrayList<>();
        this.f17214OooO0OO = true;
        this.f17213OooO0OO = new ArrayList<>();
        this.f17215OooO0Oo = new ArrayList<>();
        this.f17216OooO0Oo = true;
        OooO0oO(true);
    }

    private void OooO0o(boolean z) {
        if (!this.f17209OooO00o.isEmpty()) {
            OooO0o0();
            Iterator<WeakReference<AbstractC5961Oooo>> it = this.f17209OooO00o.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC5961Oooo> next = it.next();
                AbstractC5961Oooo oooo = next.get();
                if (oooo == null) {
                    this.f17209OooO00o.remove(next);
                } else {
                    oooo.OooO00o(z);
                }
            }
            OooO0Oo();
        }
    }

    private void OooO0o0(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(OooO0O0);
        if (sparseParcelableArray != null && !this.f17209OooO00o.isEmpty()) {
            Iterator<WeakReference<AbstractC5961Oooo>> it = this.f17209OooO00o.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC5961Oooo> next = it.next();
                AbstractC5961Oooo oooo = next.get();
                if (oooo == null) {
                    this.f17209OooO00o.remove(next);
                } else {
                    int id = oooo.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        oooo.OooO00o(parcelable);
                    }
                }
            }
        }
    }

    private void OooO0oO(boolean z) {
        boolean z2 = true;
        if (!z || this.f17200OooO00o.getConfiguration().keyboard == 1 || !C7113o00Oo0o0.m18383OooO00o(ViewConfiguration.get(this.f17199OooO00o), this.f17199OooO00o)) {
            z2 = false;
        }
        this.f17212OooO0O0 = z2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5965Oooo00o m16773OooO00o() {
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5965Oooo00o m16774OooO00o(int i) {
        this.OooOO0o = i;
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16777OooO00o() {
        return OooO0OO;
    }

    public void OooO0O0(AbstractC5961Oooo oooo) {
        Iterator<WeakReference<AbstractC5961Oooo>> it = this.f17209OooO00o.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC5961Oooo> next = it.next();
            AbstractC5961Oooo oooo2 = next.get();
            if (oooo2 == null || oooo2 == oooo) {
                this.f17209OooO00o.remove(next);
            }
        }
    }

    public void OooO0OO(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(OooO0Oo, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC7026o000oOoO) item.getSubMenu()).OooO0OO(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(m16777OooO00o(), sparseArray);
        }
    }

    public void OooO0Oo(Bundle bundle) {
        OooO0o(bundle);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return OooO00o(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f17199OooO00o.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void clear() {
        C5967Oooo0OO oooo0OO = this.f17206OooO00o;
        if (oooo0OO != null) {
            m16782OooO00o(oooo0OO);
        }
        this.f17208OooO00o.clear();
        OooO0O0(true);
    }

    public void clearHeader() {
        this.f17201OooO00o = null;
        this.f17207OooO00o = null;
        this.f17204OooO00o = null;
        OooO0O0(false);
    }

    public void close() {
        OooO00o(true);
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C5967Oooo0OO oooo0OO = this.f17208OooO00o.get(i2);
            if (oooo0OO.getItemId() == i) {
                return oooo0OO;
            }
            if (oooo0OO.hasSubMenu() && (findItem = oooo0OO.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return this.f17208OooO00o.get(i);
    }

    public boolean hasVisibleItems() {
        if (this.OooOO0O) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f17208OooO00o.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return OooO00o(i, keyEvent) != null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return OooO00o(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C5967Oooo0OO OooO00o2 = OooO00o(i, keyEvent);
        boolean OooO00o3 = OooO00o2 != null ? OooO00o(OooO00o2, i2) : false;
        if ((i2 & 2) != 0) {
            OooO00o(true);
        }
        return OooO00o3;
    }

    public void removeGroup(int i) {
        int OooO00o2 = OooO00o(i);
        if (OooO00o2 >= 0) {
            int size = this.f17208OooO00o.size() - OooO00o2;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f17208OooO00o.get(OooO00o2).getGroupId() != i) {
                    OooO0O0(true);
                } else {
                    OooO00o(OooO00o2, false);
                    i2 = i3;
                }
            }
            OooO0O0(true);
        }
    }

    public void removeItem(int i) {
        OooO00o(OooO0O0(i), true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f17208OooO00o.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5967Oooo0OO oooo0OO = this.f17208OooO00o.get(i2);
            if (oooo0OO.getGroupId() == i) {
                oooo0OO.OooO0OO(z2);
                oooo0OO.setCheckable(z);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractMenuC7049o00O00o
    public void setGroupDividerEnabled(boolean z) {
        this.OooOO0 = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f17208OooO00o.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5967Oooo0OO oooo0OO = this.f17208OooO00o.get(i2);
            if (oooo0OO.getGroupId() == i) {
                oooo0OO.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f17208OooO00o.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C5967Oooo0OO oooo0OO = this.f17208OooO00o.get(i2);
            if (oooo0OO.getGroupId() == i && oooo0OO.m16797OooO00o(z)) {
                z2 = true;
            }
        }
        if (z2) {
            OooO0O0(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f17210OooO00o = z;
        OooO0O0(false);
    }

    public int size() {
        return this.f17208OooO00o.size();
    }

    public void OooO00o(AbstractC5961Oooo oooo) {
        OooO00o(oooo, this.f17199OooO00o);
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m16790OooO0Oo() {
        return this.f17212OooO0O0;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return OooO00o(0, 0, 0, this.f17200OooO00o.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f17200OooO00o.getString(i));
    }

    public void OooO00o(AbstractC5961Oooo oooo, Context context) {
        this.f17209OooO00o.add(new WeakReference<>(oooo));
        oooo.OooO00o(context, this);
        this.f17216OooO0Oo = true;
    }

    public void OooO0Oo() {
        this.f17217OooO0o0 = false;
        if (this.OooO0o) {
            this.OooO0o = false;
            OooO0O0(this.OooO0oO);
        }
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO00o(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C5967Oooo0OO oooo0OO = (C5967Oooo0OO) OooO00o(i, i2, i3, charSequence);
        SubMenuC7026o000oOoO o000oooo = new SubMenuC7026o000oOoO(this.f17199OooO00o, this, oooo0OO);
        oooo0OO.OooO00o(o000oooo);
        return o000oooo;
    }

    public void OooO0O0(Bundle bundle) {
        OooO0o0(bundle);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return OooO00o(i, i2, i3, this.f17200OooO00o.getString(i4));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16785OooO0O0() {
        return this.OooOO0;
    }

    private boolean OooO00o(SubMenuC7026o000oOoO o000oooo, AbstractC5961Oooo oooo) {
        boolean z = false;
        if (this.f17209OooO00o.isEmpty()) {
            return false;
        }
        if (oooo != null) {
            z = oooo.OooO00o(o000oooo);
        }
        Iterator<WeakReference<AbstractC5961Oooo>> it = this.f17209OooO00o.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC5961Oooo> next = it.next();
            AbstractC5961Oooo oooo2 = next.get();
            if (oooo2 == null) {
                this.f17209OooO00o.remove(next);
            } else if (!z) {
                z = oooo2.OooO00o(o000oooo);
            }
        }
        return z;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m16784OooO0O0() {
        this.f17217OooO0o0 = true;
        clear();
        clearHeader();
        this.f17209OooO00o.clear();
        this.f17217OooO0o0 = false;
        this.OooO0o = false;
        this.OooO0oO = false;
        OooO0O0(true);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f17200OooO00o.getString(i4));
    }

    public void OooO0Oo(boolean z) {
        this.OooOO0O = z;
    }

    private void OooO0o(Bundle bundle) {
        Parcelable OooO00o2;
        if (!this.f17209OooO00o.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<AbstractC5961Oooo>> it = this.f17209OooO00o.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC5961Oooo> next = it.next();
                AbstractC5961Oooo oooo = next.get();
                if (oooo == null) {
                    this.f17209OooO00o.remove(next);
                } else {
                    int id = oooo.getId();
                    if (id > 0 && (OooO00o2 = oooo.OooO00o()) != null) {
                        sparseArray.put(id, OooO00o2);
                    }
                }
            }
            bundle.putSparseParcelableArray(OooO0O0, sparseArray);
        }
    }

    public void OooO0o0(boolean z) {
        if (this.f17212OooO0O0 != z) {
            OooO0oO(z);
            OooO0O0(false);
        }
    }

    public void OooO00o(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(m16777OooO00o());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuC7026o000oOoO) item.getSubMenu()).OooO00o(bundle);
                }
            }
            int i2 = bundle.getInt(OooO0Oo);
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void OooO0o0() {
        if (!this.f17217OooO0o0) {
            this.f17217OooO0o0 = true;
            this.OooO0o = false;
            this.OooO0oO = false;
        }
    }

    public static int OooO0OO(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f17198OooO00o;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public int OooO0O0(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f17208OooO00o.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m16789OooO0OO() {
        return this.f17210OooO00o;
    }

    public void OooO0O0(boolean z) {
        if (!this.f17217OooO0o0) {
            if (z) {
                this.f17214OooO0OO = true;
                this.f17216OooO0Oo = true;
            }
            OooO0o(z);
            return;
        }
        this.OooO0o = true;
        if (z) {
            this.OooO0oO = true;
        }
    }

    @NonNull
    public ArrayList<C5967Oooo0OO> OooO0OO() {
        if (!this.f17214OooO0OO) {
            return this.f17211OooO0O0;
        }
        this.f17211OooO0O0.clear();
        int size = this.f17208OooO00o.size();
        for (int i = 0; i < size; i++) {
            C5967Oooo0OO oooo0OO = this.f17208OooO00o.get(i);
            if (oooo0OO.isVisible()) {
                this.f17211OooO0O0.add(oooo0OO);
            }
        }
        this.f17214OooO0OO = false;
        this.f17216OooO0Oo = true;
        return this.f17211OooO0O0;
    }

    public void OooO0O0(C5967Oooo0OO oooo0OO) {
        this.f17214OooO0OO = true;
        OooO0O0(true);
    }

    public void OooO00o(OooO00o oooO00o) {
        this.f17205OooO00o = oooO00o;
    }

    public ArrayList<C5967Oooo0OO> OooO0O0() {
        m16788OooO0OO();
        return this.f17215OooO0Oo;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m16788OooO0OO() {
        ArrayList<C5967Oooo0OO> OooO0OO2 = OooO0OO();
        if (this.f17216OooO0Oo) {
            Iterator<WeakReference<AbstractC5961Oooo>> it = this.f17209OooO00o.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<AbstractC5961Oooo> next = it.next();
                AbstractC5961Oooo oooo = next.get();
                if (oooo == null) {
                    this.f17209OooO00o.remove(next);
                } else {
                    z |= oooo.m16764OooO00o();
                }
            }
            if (z) {
                this.f17213OooO0OO.clear();
                this.f17215OooO0Oo.clear();
                int size = OooO0OO2.size();
                for (int i = 0; i < size; i++) {
                    C5967Oooo0OO oooo0OO = OooO0OO2.get(i);
                    if (oooo0OO.OooO0OO()) {
                        this.f17213OooO0OO.add(oooo0OO);
                    } else {
                        this.f17215OooO0Oo.add(oooo0OO);
                    }
                }
            } else {
                this.f17213OooO0OO.clear();
                this.f17215OooO0Oo.clear();
                this.f17215OooO0Oo.addAll(OooO0OO());
            }
            this.f17216OooO0Oo = false;
        }
    }

    public MenuItem OooO00o(int i, int i2, int i3, CharSequence charSequence) {
        int OooO0OO2 = OooO0OO(i3);
        C5967Oooo0OO OooO00o2 = OooO00o(i, i2, i3, OooO0OO2, charSequence, this.OooOO0o);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f17203OooO00o;
        if (contextMenuInfo != null) {
            OooO00o2.OooO00o(contextMenuInfo);
        }
        ArrayList<C5967Oooo0OO> arrayList = this.f17208OooO00o;
        arrayList.add(OooO00o(arrayList, OooO0OO2), OooO00o2);
        OooO0O0(true);
        return OooO00o2;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5965Oooo00o m16783OooO0O0(int i) {
        OooO00o(0, null, i, null, null);
        return this;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m16786OooO0O0(C5967Oooo0OO oooo0OO) {
        boolean z = false;
        if (this.f17209OooO00o.isEmpty()) {
            return false;
        }
        OooO0o0();
        Iterator<WeakReference<AbstractC5961Oooo>> it = this.f17209OooO00o.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC5961Oooo> next = it.next();
            AbstractC5961Oooo oooo = next.get();
            if (oooo == null) {
                this.f17209OooO00o.remove(next);
            } else {
                z = oooo.OooO00o(this, oooo0OO);
                if (z) {
                    break;
                }
            }
        }
        OooO0Oo();
        if (z) {
            this.f17206OooO00o = oooo0OO;
        }
        return z;
    }

    private C5967Oooo0OO OooO00o(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C5967Oooo0OO(this, i, i2, i3, i4, charSequence, i5);
    }

    private void OooO00o(int i, boolean z) {
        if (i >= 0 && i < this.f17208OooO00o.size()) {
            this.f17208OooO00o.remove(i);
            if (z) {
                OooO0O0(true);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16780OooO00o(int i) {
        OooO00o(i, true);
    }

    public void OooO00o(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f17208OooO00o.size();
        OooO0o0();
        for (int i = 0; i < size; i++) {
            C5967Oooo0OO oooo0OO = this.f17208OooO00o.get(i);
            if (oooo0OO.getGroupId() == groupId && oooo0OO.OooO0Oo() && oooo0OO.isCheckable()) {
                oooo0OO.OooO0O0(oooo0OO == menuItem);
            }
        }
        OooO0Oo();
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public C5965Oooo00o m16787OooO0OO(int i) {
        OooO00o(i, null, 0, null, null);
        return this;
    }

    public void OooO0OO(boolean z) {
        this.OooO0oo = z;
    }

    public int OooO00o(int i) {
        return OooO00o(i, 0);
    }

    public int OooO00o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f17208OooO00o.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Resources m16770OooO00o() {
        return this.f17200OooO00o;
    }

    public Context OooO00o() {
        return this.f17199OooO00o;
    }

    public boolean OooO00o(C5965Oooo00o oooo00o, MenuItem menuItem) {
        OooO00o oooO00o = this.f17205OooO00o;
        return oooO00o != null && oooO00o.OooO00o(oooo00o, menuItem);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16779OooO00o() {
        OooO00o oooO00o = this.f17205OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o(this);
        }
    }

    public static int OooO00o(ArrayList<C5967Oooo0OO> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m16791OooO00o() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public void OooO00o(List<C5967Oooo0OO> list, int i, KeyEvent keyEvent) {
        boolean OooO0OO2 = m16789OooO0OO();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f17208OooO00o.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5967Oooo0OO oooo0OO = this.f17208OooO00o.get(i2);
                if (oooo0OO.hasSubMenu()) {
                    ((C5965Oooo00o) oooo0OO.getSubMenu()).OooO00o(list, i, keyEvent);
                }
                char alphabeticShortcut = OooO0OO2 ? oooo0OO.getAlphabeticShortcut() : oooo0OO.getNumericShortcut();
                if (((modifiers & AbstractMenuC7049o00O00o.OooO0o0) == ((OooO0OO2 ? oooo0OO.getAlphabeticModifiers() : oooo0OO.getNumericModifiers()) & AbstractMenuC7049o00O00o.OooO0o0)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (OooO0OO2 && alphabeticShortcut == '\b' && i == 67)) && oooo0OO.isEnabled()) {
                        list.add(oooo0OO);
                    }
                }
            }
        }
    }

    public C5967Oooo0OO OooO00o(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C5967Oooo0OO> arrayList = this.OooO0o0;
        arrayList.clear();
        OooO00o(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean OooO0OO2 = m16789OooO0OO();
        for (int i2 = 0; i2 < size; i2++) {
            C5967Oooo0OO oooo0OO = arrayList.get(i2);
            if (OooO0OO2) {
                c = oooo0OO.getAlphabeticShortcut();
            } else {
                c = oooo0OO.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (OooO0OO2 && c == '\b' && i == 67))) {
                return oooo0OO;
            }
        }
        return null;
    }

    public boolean OooO00o(MenuItem menuItem, int i) {
        return OooO00o(menuItem, (AbstractC5961Oooo) null, i);
    }

    public boolean OooO00o(MenuItem menuItem, AbstractC5961Oooo oooo, int i) {
        C5967Oooo0OO oooo0OO = (C5967Oooo0OO) menuItem;
        if (oooo0OO == null || !oooo0OO.isEnabled()) {
            return false;
        }
        boolean OooO0O02 = oooo0OO.OooO0O0();
        AbstractC7089o00OO0oO OooO00o2 = oooo0OO.m16792OooO00o();
        boolean z = OooO00o2 != null && OooO00o2.m18367OooO00o();
        if (oooo0OO.m16796OooO00o()) {
            OooO0O02 |= oooo0OO.expandActionView();
            if (OooO0O02) {
                OooO00o(true);
            }
        } else if (oooo0OO.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                OooO00o(false);
            }
            if (!oooo0OO.hasSubMenu()) {
                oooo0OO.OooO00o(new SubMenuC7026o000oOoO(OooO00o(), this, oooo0OO));
            }
            SubMenuC7026o000oOoO o000oooo = (SubMenuC7026o000oOoO) oooo0OO.getSubMenu();
            if (z) {
                OooO00o2.OooO00o(o000oooo);
            }
            OooO0O02 |= OooO00o(o000oooo, oooo);
            if (!OooO0O02) {
                OooO00o(true);
            }
        } else if ((i & 1) == 0) {
            OooO00o(true);
        }
        return OooO0O02;
    }

    public final void OooO00o(boolean z) {
        if (!this.OooO) {
            this.OooO = true;
            Iterator<WeakReference<AbstractC5961Oooo>> it = this.f17209OooO00o.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC5961Oooo> next = it.next();
                AbstractC5961Oooo oooo = next.get();
                if (oooo == null) {
                    this.f17209OooO00o.remove(next);
                } else {
                    oooo.OooO00o(this, z);
                }
            }
            this.OooO = false;
        }
    }

    public void OooO00o(C5967Oooo0OO oooo0OO) {
        this.f17216OooO0Oo = true;
        OooO0O0(true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ArrayList<C5967Oooo0OO> m16778OooO00o() {
        m16788OooO0OO();
        return this.f17213OooO0OO;
    }

    private void OooO00o(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources OooO00o2 = m16770OooO00o();
        if (view != null) {
            this.f17204OooO00o = view;
            this.f17207OooO00o = null;
            this.f17201OooO00o = null;
        } else {
            if (i > 0) {
                this.f17207OooO00o = OooO00o2.getText(i);
            } else if (charSequence != null) {
                this.f17207OooO00o = charSequence;
            }
            if (i2 > 0) {
                this.f17201OooO00o = C7009o000OoOo.m18256OooO00o(OooO00o(), i2);
            } else if (drawable != null) {
                this.f17201OooO00o = drawable;
            }
            this.f17204OooO00o = null;
        }
        OooO0O0(false);
    }

    public C5965Oooo00o OooO00o(CharSequence charSequence) {
        OooO00o(0, charSequence, 0, null, null);
        return this;
    }

    public C5965Oooo00o OooO00o(Drawable drawable) {
        OooO00o(0, null, 0, drawable, null);
        return this;
    }

    public C5965Oooo00o OooO00o(View view) {
        OooO00o(0, null, 0, null, view);
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m16776OooO00o() {
        return this.f17207OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Drawable m16771OooO00o() {
        return this.f17201OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public View m16772OooO00o() {
        return this.f17204OooO00o;
    }

    public void OooO00o(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f17203OooO00o = contextMenuInfo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16781OooO00o() {
        return this.OooO0oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16782OooO00o(C5967Oooo0OO oooo0OO) {
        boolean z = false;
        if (!this.f17209OooO00o.isEmpty() && this.f17206OooO00o == oooo0OO) {
            OooO0o0();
            Iterator<WeakReference<AbstractC5961Oooo>> it = this.f17209OooO00o.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC5961Oooo> next = it.next();
                AbstractC5961Oooo oooo = next.get();
                if (oooo == null) {
                    this.f17209OooO00o.remove(next);
                } else {
                    z = oooo.OooO0O0(this, oooo0OO);
                    if (z) {
                        break;
                    }
                }
            }
            OooO0Oo();
            if (z) {
                this.f17206OooO00o = null;
            }
        }
        return z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5967Oooo0OO m16775OooO00o() {
        return this.f17206OooO00o;
    }
}
