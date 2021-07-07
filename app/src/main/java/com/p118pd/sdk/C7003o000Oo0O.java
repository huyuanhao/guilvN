package com.p118pd.sdk;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.StringRes;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.o000Oo0O  reason: case insensitive filesystem */
public final class C7003o000Oo0O {
    public static final String OooO00o = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String OooO0O0 = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String OooO0OO = ".sharecompat_";

    /* renamed from: com.pd.sdk.o000Oo0O$OooO00o */
    public static class OooO00o {
        public Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Intent f19264OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CharSequence f19265OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayList<String> f19266OooO00o;
        public ArrayList<String> OooO0O0;
        public ArrayList<String> OooO0OO;
        public ArrayList<Uri> OooO0Oo;

        public OooO00o(Activity activity) {
            this.OooO00o = activity;
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f19264OooO00o = action;
            action.putExtra(C7003o000Oo0O.OooO00o, activity.getPackageName());
            this.f19264OooO00o.putExtra(C7003o000Oo0O.OooO0O0, activity.getComponentName());
            this.f19264OooO00o.addFlags(524288);
        }

        public static OooO00o OooO00o(Activity activity) {
            return new OooO00o(activity);
        }

        public Intent OooO0O0() {
            ArrayList<String> arrayList = this.f19266OooO00o;
            if (arrayList != null) {
                OooO00o("android.intent.extra.EMAIL", arrayList);
                this.f19266OooO00o = null;
            }
            ArrayList<String> arrayList2 = this.OooO0O0;
            if (arrayList2 != null) {
                OooO00o("android.intent.extra.CC", arrayList2);
                this.OooO0O0 = null;
            }
            ArrayList<String> arrayList3 = this.OooO0OO;
            if (arrayList3 != null) {
                OooO00o("android.intent.extra.BCC", arrayList3);
                this.OooO0OO = null;
            }
            ArrayList<Uri> arrayList4 = this.OooO0Oo;
            boolean z = true;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                z = false;
            }
            boolean equals = this.f19264OooO00o.getAction().equals("android.intent.action.SEND_MULTIPLE");
            if (!z && equals) {
                this.f19264OooO00o.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.OooO0Oo;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f19264OooO00o.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.f19264OooO00o.putExtra("android.intent.extra.STREAM", this.OooO0Oo.get(0));
                }
                this.OooO0Oo = null;
            }
            if (z && !equals) {
                this.f19264OooO00o.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<Uri> arrayList6 = this.OooO0Oo;
                if (arrayList6 == null || arrayList6.isEmpty()) {
                    this.f19264OooO00o.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.f19264OooO00o.putParcelableArrayListExtra("android.intent.extra.STREAM", this.OooO0Oo);
                }
            }
            return this.f19264OooO00o;
        }

        public OooO00o OooO0OO(String str) {
            if (this.f19266OooO00o == null) {
                this.f19266OooO00o = new ArrayList<>();
            }
            this.f19266OooO00o.add(str);
            return this;
        }

        public OooO00o OooO0Oo(String str) {
            this.f19264OooO00o.putExtra(C7011o000Ooo0.OooO00o, str);
            if (!this.f19264OooO00o.hasExtra("android.intent.extra.TEXT")) {
                OooO0O0(Html.fromHtml(str));
            }
            return this;
        }

        public OooO00o OooO0o(String str) {
            this.f19264OooO00o.setType(str);
            return this;
        }

        public OooO00o OooO0o0(String[] strArr) {
            this.f19264OooO00o.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        public Activity OooO00o() {
            return this.OooO00o;
        }

        public OooO00o OooO0o(String[] strArr) {
            if (this.f19266OooO00o != null) {
                this.f19266OooO00o = null;
            }
            this.f19264OooO00o.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public OooO00o OooO0o0(String str) {
            this.f19264OooO00o.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        private void OooO00o(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f19264OooO00o.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[(arrayList.size() + length)];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f19264OooO00o.putExtra(str, strArr);
        }

        public OooO00o OooO0OO(String[] strArr) {
            OooO00o("android.intent.extra.EMAIL", strArr);
            return this;
        }

        public OooO00o OooO0Oo(String[] strArr) {
            this.f19264OooO00o.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        private void OooO00o(String str, String[] strArr) {
            Intent OooO0O02 = OooO0O0();
            String[] stringArrayExtra = OooO0O02.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[(strArr.length + length)];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            OooO0O02.putExtra(str, strArr2);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Intent m18235OooO00o() {
            return Intent.createChooser(OooO0O0(), this.f19265OooO00o);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18236OooO00o() {
            this.OooO00o.startActivity(m18235OooO00o());
        }

        public OooO00o OooO00o(CharSequence charSequence) {
            this.f19265OooO00o = charSequence;
            return this;
        }

        public OooO00o OooO00o(@StringRes int i) {
            return OooO00o(this.OooO00o.getText(i));
        }

        public OooO00o OooO00o(Uri uri) {
            Uri uri2 = (Uri) this.f19264OooO00o.getParcelableExtra("android.intent.extra.STREAM");
            if (this.OooO0Oo == null && uri2 == null) {
                return OooO0O0(uri);
            }
            if (this.OooO0Oo == null) {
                this.OooO0Oo = new ArrayList<>();
            }
            if (uri2 != null) {
                this.f19264OooO00o.removeExtra("android.intent.extra.STREAM");
                this.OooO0Oo.add(uri2);
            }
            this.OooO0Oo.add(uri);
            return this;
        }

        public OooO00o OooO0O0(CharSequence charSequence) {
            this.f19264OooO00o.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        public OooO00o OooO0O0(Uri uri) {
            if (!this.f19264OooO00o.getAction().equals("android.intent.action.SEND")) {
                this.f19264OooO00o.setAction("android.intent.action.SEND");
            }
            this.OooO0Oo = null;
            this.f19264OooO00o.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }

        public OooO00o OooO0O0(String str) {
            if (this.OooO0O0 == null) {
                this.OooO0O0 = new ArrayList<>();
            }
            this.OooO0O0.add(str);
            return this;
        }

        public OooO00o OooO00o(String str) {
            if (this.OooO0OO == null) {
                this.OooO0OO = new ArrayList<>();
            }
            this.OooO0OO.add(str);
            return this;
        }

        public OooO00o OooO0O0(String[] strArr) {
            OooO00o("android.intent.extra.CC", strArr);
            return this;
        }

        public OooO00o OooO00o(String[] strArr) {
            OooO00o("android.intent.extra.BCC", strArr);
            return this;
        }
    }

    /* renamed from: com.pd.sdk.o000Oo0O$OooO0O0 */
    public static class OooO0O0 {
        public static final String OooO0O0 = "IntentReader";
        public Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ComponentName f19267OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Intent f19268OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f19269OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayList<Uri> f19270OooO00o;

        public OooO0O0(Activity activity) {
            this.OooO00o = activity;
            this.f19268OooO00o = activity.getIntent();
            this.f19269OooO00o = C7003o000Oo0O.m18234OooO00o(activity);
            this.f19267OooO00o = C7003o000Oo0O.OooO00o(activity);
        }

        public static OooO0O0 OooO00o(Activity activity) {
            return new OooO0O0(activity);
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m18246OooO0O0() {
            String action = this.f19268OooO00o.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m18248OooO0OO() {
            return "android.intent.action.SEND".equals(this.f19268OooO00o.getAction());
        }

        public String OooO0Oo() {
            return this.f19268OooO00o.getType();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18242OooO00o() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f19268OooO00o.getAction());
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public String[] m18249OooO0OO() {
            return this.f19268OooO00o.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        public static void OooO00o(StringBuilder sb, CharSequence charSequence, int i, int i2) {
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                if (charAt == '<') {
                    sb.append("&lt;");
                } else if (charAt == '>') {
                    sb.append("&gt;");
                } else if (charAt == '&') {
                    sb.append("&amp;");
                } else if (charAt > '~' || charAt < ' ') {
                    sb.append("&#" + ((int) charAt) + C7522o0Ooo0o.OooO0O0);
                } else if (charAt == ' ') {
                    while (true) {
                        int i3 = i + 1;
                        if (i3 >= i2 || charSequence.charAt(i3) != ' ') {
                            sb.append(' ');
                        } else {
                            sb.append("&nbsp;");
                            i = i3;
                        }
                    }
                    sb.append(' ');
                } else {
                    sb.append(charAt);
                }
                i++;
            }
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public CharSequence m18244OooO0O0() {
            return this.f19268OooO00o.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        public String OooO0OO() {
            return this.f19268OooO00o.getStringExtra("android.intent.extra.SUBJECT");
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public String m18245OooO0O0() {
            String stringExtra = this.f19268OooO00o.getStringExtra(C7011o000Ooo0.OooO00o);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence OooO0O02 = m18244OooO0O0();
            if (OooO0O02 instanceof Spanned) {
                return Html.toHtml((Spanned) OooO0O02);
            }
            if (OooO0O02 == null) {
                return stringExtra;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                return Html.escapeHtml(OooO0O02);
            }
            StringBuilder sb = new StringBuilder();
            OooO00o(sb, OooO0O02, 0, OooO0O02.length());
            return sb.toString();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Uri m18239OooO00o() {
            return (Uri) this.f19268OooO00o.getParcelableExtra("android.intent.extra.STREAM");
        }

        public Uri OooO00o(int i) {
            if (this.f19270OooO00o == null && m18242OooO00o()) {
                this.f19270OooO00o = this.f19268OooO00o.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f19270OooO00o;
            if (arrayList != null) {
                return arrayList.get(i);
            }
            if (i == 0) {
                return (Uri) this.f19268OooO00o.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + OooO00o() + " index requested: " + i);
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public String[] m18247OooO0O0() {
            return this.f19268OooO00o.getStringArrayExtra("android.intent.extra.CC");
        }

        public Drawable OooO0O0() {
            if (this.f19269OooO00o == null) {
                return null;
            }
            try {
                return this.OooO00o.getPackageManager().getApplicationIcon(this.f19269OooO00o);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public int OooO00o() {
            if (this.f19270OooO00o == null && m18242OooO00o()) {
                this.f19270OooO00o = this.f19268OooO00o.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f19270OooO00o;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.f19268OooO00o.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String[] m18243OooO00o() {
            return this.f19268OooO00o.getStringArrayExtra("android.intent.extra.BCC");
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m18241OooO00o() {
            return this.f19269OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public ComponentName m18237OooO00o() {
            return this.f19267OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Drawable m18238OooO00o() {
            if (this.f19267OooO00o == null) {
                return null;
            }
            try {
                return this.OooO00o.getPackageManager().getActivityIcon(this.f19267OooO00o);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public CharSequence m18240OooO00o() {
            if (this.f19269OooO00o == null) {
                return null;
            }
            PackageManager packageManager = this.OooO00o.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f19269OooO00o, 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m18234OooO00o(Activity activity) {
        String callingPackage = activity.getCallingPackage();
        return callingPackage == null ? activity.getIntent().getStringExtra(OooO00o) : callingPackage;
    }

    public static ComponentName OooO00o(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? (ComponentName) activity.getIntent().getParcelableExtra(OooO0O0) : callingActivity;
    }

    public static void OooO00o(MenuItem menuItem, OooO00o oooO00o) {
        ShareActionProvider shareActionProvider;
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof ShareActionProvider)) {
            shareActionProvider = new ShareActionProvider(oooO00o.OooO00o());
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        shareActionProvider.setShareHistoryFileName(OooO0OO + oooO00o.OooO00o().getClass().getName());
        shareActionProvider.setShareIntent(oooO00o.OooO0O0());
        menuItem.setActionProvider(shareActionProvider);
        if (Build.VERSION.SDK_INT < 16 && !menuItem.hasSubMenu()) {
            menuItem.setIntent(oooO00o.m18235OooO00o());
        }
    }

    public static void OooO00o(Menu menu, int i, OooO00o oooO00o) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            OooO00o(findItem, oooO00o);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i + " in the supplied menu");
    }
}
