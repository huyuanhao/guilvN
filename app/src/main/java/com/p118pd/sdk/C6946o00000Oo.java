package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.C0033R;
import androidx.appcompat.widget.ActivityChooserView;
import com.p118pd.sdk.C5982OoooOoO;

/* renamed from: com.pd.sdk.o00000Oo  reason: case insensitive filesystem */
public class C6946o00000Oo extends AbstractC7089o00OO0oO {
    public static final int OooO0O0 = 4;
    public static final String OooO0OO = "share_history.xml";
    public int OooO00o = 4;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5982OoooOoO.OooO0o f19109OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f19110OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f19111OooO00o = new OooO0OO();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Context f19112OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f19113OooO0O0 = OooO0OO;

    /* renamed from: com.pd.sdk.o00000Oo$OooO00o */
    public interface OooO00o {
        boolean OooO00o(C6946o00000Oo o00000oo, Intent intent);
    }

    /* renamed from: com.pd.sdk.o00000Oo$OooO0O0 */
    public class OooO0O0 implements C5982OoooOoO.OooO0o {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.C5982OoooOoO.OooO0o
        public boolean OooO00o(C5982OoooOoO ooooOoO, Intent intent) {
            C6946o00000Oo o00000oo = C6946o00000Oo.this;
            OooO00o oooO00o = o00000oo.f19110OooO00o;
            if (oooO00o == null) {
                return false;
            }
            oooO00o.OooO00o(o00000oo, intent);
            return false;
        }
    }

    /* renamed from: com.pd.sdk.o00000Oo$OooO0OO */
    public class OooO0OO implements MenuItem.OnMenuItemClickListener {
        public OooO0OO() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C6946o00000Oo o00000oo = C6946o00000Oo.this;
            Intent OooO00o2 = C5982OoooOoO.OooO00o(o00000oo.f19112OooO0O0, o00000oo.f19113OooO0O0).OooO00o(menuItem.getItemId());
            if (OooO00o2 == null) {
                return true;
            }
            String action = OooO00o2.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                C6946o00000Oo.this.OooO0O0(OooO00o2);
            }
            C6946o00000Oo.this.f19112OooO0O0.startActivity(OooO00o2);
            return true;
        }
    }

    public C6946o00000Oo(Context context) {
        super(context);
        this.f19112OooO0O0 = context;
    }

    @Override // com.p118pd.sdk.AbstractC7089o00OO0oO
    private void OooO0OO() {
        if (this.f19110OooO00o != null) {
            if (this.f19109OooO00o == null) {
                this.f19109OooO00o = new OooO0O0();
            }
            C5982OoooOoO.OooO00o(this.f19112OooO0O0, this.f19113OooO0O0).OooO00o(this.f19109OooO00o);
        }
    }

    public void OooO00o(OooO00o oooO00o) {
        this.f19110OooO00o = oooO00o;
        OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18120OooO00o() {
        return true;
    }

    public void OooO0O0(Intent intent) {
        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(134742016);
        } else {
            intent.addFlags(524288);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO, com.p118pd.sdk.AbstractC7089o00OO0oO
    public View OooO00o() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f19112OooO0O0);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(C5982OoooOoO.OooO00o(this.f19112OooO0O0, this.f19113OooO0O0));
        }
        TypedValue typedValue = new TypedValue();
        this.f19112OooO0O0.getTheme().resolveAttribute(C0033R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C5945OooOOO0.m16716OooO00o(this.f19112OooO0O0, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(C0033R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(C0033R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // com.p118pd.sdk.AbstractC7089o00OO0oO
    public void OooO00o(SubMenu subMenu) {
        subMenu.clear();
        C5982OoooOoO OooO00o2 = C5982OoooOoO.OooO00o(this.f19112OooO0O0, this.f19113OooO0O0);
        PackageManager packageManager = this.f19112OooO0O0.getPackageManager();
        int OooO00o3 = OooO00o2.m16817OooO00o();
        int min = Math.min(OooO00o3, this.OooO00o);
        for (int i = 0; i < min; i++) {
            ResolveInfo OooO00o4 = OooO00o2.m16820OooO00o(i);
            subMenu.add(0, i, i, OooO00o4.loadLabel(packageManager)).setIcon(OooO00o4.loadIcon(packageManager)).setOnMenuItemClickListener(this.f19111OooO00o);
        }
        if (min < OooO00o3) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f19112OooO0O0.getString(C0033R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < OooO00o3; i2++) {
                ResolveInfo OooO00o5 = OooO00o2.m16820OooO00o(i2);
                addSubMenu.add(0, i2, i2, OooO00o5.loadLabel(packageManager)).setIcon(OooO00o5.loadIcon(packageManager)).setOnMenuItemClickListener(this.f19111OooO00o);
            }
        }
    }

    public void OooO00o(String str) {
        this.f19113OooO0O0 = str;
        OooO0OO();
    }

    public void OooO00o(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                OooO0O0(intent);
            }
        }
        C5982OoooOoO.OooO00o(this.f19112OooO0O0, this.f19113OooO0O0).OooO00o(intent);
    }
}
