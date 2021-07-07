package com.p118pd.sdk;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.C0033R;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.pd.sdk.o00000o0  reason: case insensitive filesystem */
public class View$OnClickListenerC6947o00000o0 extends AbstractC7151o00o00o implements View.OnClickListener {
    public static final boolean OooO0o0 = false;
    public static final int o00000 = 50;
    public static final int o00000O = 1;
    public static final int o00000O0 = 0;
    public static final int o00000OO = 2;
    public static final int o00000Oo = -1;
    public static final String o0ooOOo = "SuggestionsAdapter";
    public final SearchManager OooO00o = ((SearchManager) ((AbstractC7150o00o00Oo) this).OooO00o.getSystemService("search"));

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SearchableInfo f19114OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ColorStateList f19115OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SearchView f19116OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final WeakHashMap<String, Drawable.ConstantState> f19117OooO00o;
    public final Context OooO0O0;
    public boolean OooO0Oo = false;
    public int o000000 = -1;
    public int o000000O = -1;
    public int o000000o = -1;
    public int o000OOo = -1;
    public int o0O0O00 = -1;
    public int o0OO00O = 1;
    public final int o0Oo0oo;
    public int oo0o0Oo = -1;

    /* renamed from: com.pd.sdk.o00000o0$OooO00o */
    public static final class OooO00o {
        public final ImageView OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final TextView f19118OooO00o;
        public final ImageView OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final TextView f19119OooO0O0;
        public final ImageView OooO0OO;

        public OooO00o(View view) {
            this.f19118OooO00o = (TextView) view.findViewById(16908308);
            this.f19119OooO0O0 = (TextView) view.findViewById(16908309);
            this.OooO00o = (ImageView) view.findViewById(16908295);
            this.OooO0O0 = (ImageView) view.findViewById(16908296);
            this.OooO0OO = (ImageView) view.findViewById(C0033R.C0036id.edit_query);
        }
    }

    public View$OnClickListenerC6947o00000o0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f19116OooO00o = searchView;
        this.f19114OooO00o = searchableInfo;
        this.o0Oo0oo = searchView.getSuggestionCommitIconResId();
        this.OooO0O0 = context;
        this.f19117OooO00o = weakHashMap;
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o
    public int OooO00o() {
        return this.o0OO00O;
    }

    public void OooO0O0() {
        m18124OooO00o((Cursor) null);
        this.OooO0Oo = true;
    }

    public void OooO0OO(int i) {
        this.o0OO00O = i;
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View OooO00o2 = OooO00o(((AbstractC7150o00o00Oo) this).OooO00o, ((AbstractC7150o00o00Oo) this).f19518OooO00o, viewGroup);
            if (OooO00o2 != null) {
                ((OooO00o) OooO00o2.getTag()).f19118OooO00o.setText(e.toString());
            }
            return OooO00o2;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View OooO0O02 = OooO0O0(((AbstractC7150o00o00Oo) this).OooO00o, ((AbstractC7150o00o00Oo) this).f19518OooO00o, viewGroup);
            if (OooO0O02 != null) {
                ((OooO00o) OooO0O02.getTag()).f19118OooO00o.setText(e.toString());
            }
            return OooO0O02;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo
    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m18121OooO0O0(OooO00o());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m18121OooO0O0(OooO00o());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f19116OooO00o.m14438OooO00o((CharSequence) tag);
        }
    }

    private Drawable OooO0OO(Cursor cursor) {
        int i = this.o000000O;
        if (i == -1) {
            return null;
        }
        return OooO0O0(cursor.getString(i));
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Cursor m18122OooO00o(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f19116OooO00o.getVisibility() == 0 && this.f19116OooO00o.getWindowVisibility() == 0) {
            try {
                Cursor OooO00o2 = OooO00o(this.f19114OooO00o, charSequence2, 50);
                if (OooO00o2 != null) {
                    OooO00o2.getCount();
                    return OooO00o2;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private void m18121OooO0O0(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // com.p118pd.sdk.AbstractC7151o00o00o, com.p118pd.sdk.AbstractC7150o00o00Oo
    public View OooO0O0(Context context, Cursor cursor, ViewGroup viewGroup) {
        View OooO0O02 = super.OooO0O0(context, cursor, viewGroup);
        OooO0O02.setTag(new OooO00o(OooO0O02));
        ((ImageView) OooO0O02.findViewById(C0033R.C0036id.edit_query)).setImageResource(this.o0Oo0oo);
        return OooO0O02;
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o, com.p118pd.sdk.C7152o00o00o0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18124OooO00o(Cursor cursor) {
        if (!this.OooO0Oo) {
            try {
                super.m18525OooO00o(cursor);
                if (cursor != null) {
                    this.oo0o0Oo = cursor.getColumnIndex("suggest_text_1");
                    this.o0O0O00 = cursor.getColumnIndex("suggest_text_2");
                    this.o000OOo = cursor.getColumnIndex("suggest_text_2_url");
                    this.o000000 = cursor.getColumnIndex("suggest_icon_1");
                    this.o000000O = cursor.getColumnIndex("suggest_icon_2");
                    this.o000000o = cursor.getColumnIndex("suggest_flags");
                }
            } catch (Exception unused) {
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    private Drawable OooO0O0(Cursor cursor) {
        int i = this.o000000;
        if (i == -1) {
            return null;
        }
        Drawable OooO0O02 = OooO0O0(cursor.getString(i));
        if (OooO0O02 != null) {
            return OooO0O02;
        }
        return OooO00o(cursor);
    }

    private Drawable OooO0O0(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.OooO0O0.getPackageName() + C8932ooOOO0o.OooO0OO + parseInt;
            Drawable OooO00o2 = OooO00o(str2);
            if (OooO00o2 != null) {
                return OooO00o2;
            }
            Drawable OooO00o3 = C7009o000OoOo.m18256OooO00o(this.OooO0O0, parseInt);
            OooO00o(str2, OooO00o3);
            return OooO00o3;
        } catch (NumberFormatException unused) {
            Drawable OooO00o4 = OooO00o(str);
            if (OooO00o4 != null) {
                return OooO00o4;
            }
            Drawable OooO0O02 = OooO0O0(Uri.parse(str));
            OooO00o(str, OooO0O02);
            return OooO0O02;
        } catch (Resources.NotFoundException unused2) {
            String str3 = "Icon resource not found: " + str;
            return null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo
    public void OooO00o(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        OooO00o oooO00o = (OooO00o) view.getTag();
        int i = this.o000000o;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (oooO00o.f19118OooO00o != null) {
            OooO00o(oooO00o.f19118OooO00o, OooO00o(cursor, this.oo0o0Oo));
        }
        if (oooO00o.f19119OooO0O0 != null) {
            String OooO00o2 = OooO00o(cursor, this.o000OOo);
            if (OooO00o2 != null) {
                charSequence = OooO00o((CharSequence) OooO00o2);
            } else {
                charSequence = OooO00o(cursor, this.o0O0O00);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = oooO00o.f19118OooO00o;
                if (textView != null) {
                    textView.setSingleLine(false);
                    oooO00o.f19118OooO00o.setMaxLines(2);
                }
            } else {
                TextView textView2 = oooO00o.f19118OooO00o;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    oooO00o.f19118OooO00o.setMaxLines(1);
                }
            }
            OooO00o(oooO00o.f19119OooO0O0, charSequence);
        }
        ImageView imageView = oooO00o.OooO00o;
        if (imageView != null) {
            OooO00o(imageView, OooO0O0(cursor), 4);
        }
        ImageView imageView2 = oooO00o.OooO0O0;
        if (imageView2 != null) {
            OooO00o(imageView2, OooO0OO(cursor), 8);
        }
        int i3 = this.o0OO00O;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            oooO00o.OooO0OO.setVisibility(0);
            oooO00o.OooO0OO.setTag(oooO00o.f19118OooO00o.getText());
            oooO00o.OooO0OO.setOnClickListener(this);
            return;
        }
        oooO00o.OooO0OO.setVisibility(8);
    }

    private Drawable OooO0O0(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return OooO00o(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream openInputStream = this.OooO0O0.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        return Drawable.createFromStream(openInputStream, null);
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException unused2) {
                            String str = "Error closing icon stream for " + uri;
                        }
                    }
                } else {
                    throw new FileNotFoundException("Failed to open " + uri);
                }
            }
        } catch (FileNotFoundException e) {
            String str2 = "Icon not found: " + uri + ", " + e.getMessage();
            return null;
        }
    }

    private Drawable OooO0O0(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f19117OooO00o.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f19117OooO00o.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.OooO0O0.getResources());
        }
        Drawable OooO00o2 = OooO00o(componentName);
        if (OooO00o2 != null) {
            constantState = OooO00o2.getConstantState();
        }
        this.f19117OooO00o.put(flattenToShortString, constantState);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o
    private CharSequence OooO00o(CharSequence charSequence) {
        if (this.f19115OooO00o == null) {
            TypedValue typedValue = new TypedValue();
            ((AbstractC7150o00o00Oo) this).OooO00o.getTheme().resolveAttribute(C0033R.attr.textColorSearchUrl, typedValue, true);
            this.f19115OooO00o = ((AbstractC7150o00o00Oo) this).OooO00o.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f19115OooO00o, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private void OooO00o(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void OooO00o(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o, com.p118pd.sdk.C7152o00o00o0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18123OooO00o(Cursor cursor) {
        String OooO00o2;
        String OooO00o3;
        if (cursor == null) {
            return null;
        }
        String OooO00o4 = OooO00o(cursor, "suggest_intent_query");
        if (OooO00o4 != null) {
            return OooO00o4;
        }
        if (this.f19114OooO00o.shouldRewriteQueryFromData() && (OooO00o3 = OooO00o(cursor, "suggest_intent_data")) != null) {
            return OooO00o3;
        }
        if (!this.f19114OooO00o.shouldRewriteQueryFromText() || (OooO00o2 = OooO00o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return OooO00o2;
    }

    private Drawable OooO00o(String str) {
        Drawable.ConstantState constantState = this.f19117OooO00o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private void OooO00o(String str, Drawable drawable) {
        if (drawable != null) {
            this.f19117OooO00o.put(str, drawable.getConstantState());
        }
    }

    @Override // com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.AbstractC7150o00o00Oo, com.p118pd.sdk.C7152o00o00o0.OooO00o, com.p118pd.sdk.C7152o00o00o0.OooO00o
    private Drawable OooO00o(Cursor cursor) {
        Drawable OooO0O02 = OooO0O0(this.f19114OooO00o.getSearchActivity());
        if (OooO0O02 != null) {
            return OooO0O02;
        }
        return ((AbstractC7150o00o00Oo) this).OooO00o.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable OooO00o(ComponentName componentName) {
        PackageManager packageManager = ((AbstractC7150o00o00Oo) this).OooO00o.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            String str = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    public static String OooO00o(Cursor cursor, String str) {
        return OooO00o(cursor, cursor.getColumnIndex(str));
    }

    public static String OooO00o(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    public Drawable OooO00o(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = ((AbstractC7150o00o00Oo) this).OooO00o.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    public Cursor OooO00o(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return ((AbstractC7150o00o00Oo) this).OooO00o.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }
}
