package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.actions.SearchIntents;
import com.p118pd.sdk.AbstractC5950OooOo0;
import com.p118pd.sdk.AbstractC7150o00o00Oo;
import com.p118pd.sdk.C5986OoooOoo;
import com.p118pd.sdk.C6953o0000O0O;
import com.p118pd.sdk.C6954o0000OO;
import com.p118pd.sdk.C6970o0000oO;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.View$OnClickListenerC6947o00000o0;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements AbstractC5950OooOo0 {
    public static final OooOO0O OooO00o = new OooOO0O();
    public static final boolean OooOO0O = false;
    public static final String o0ooOOo = "SearchView";
    public static final String o0ooOoO = "nm";
    public boolean OooO;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SearchableInfo f13767OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Intent f13768OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Rect f13769OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bundle f13770OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextWatcher f13771OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View.OnClickListener f13772OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View.OnFocusChangeListener f13773OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View.OnKeyListener f13774OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View f13775OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AdapterView.OnItemClickListener f13776OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AdapterView.OnItemSelectedListener f13777OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ImageView f13778OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TextView.OnEditorActionListener f13779OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5018OooOO0o f13780OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooOOO0 f13781OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooOOO f13782OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooOOOO f13783OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SearchAutoComplete f13784OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7150o00o00Oo f13785OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CharSequence f13786OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f13787OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final WeakHashMap<String, Drawable.ConstantState> f13788OooO00o;
    public final Intent OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Rect f13789OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Drawable f13790OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final View.OnClickListener f13791OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final View f13792OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final ImageView f13793OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public CharSequence f13794OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Runnable f13795OooO0O0;
    public final View OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final ImageView f13796OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public CharSequence f13797OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int[] f13798OooO0OO;
    public final View OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public final ImageView f13799OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public CharSequence f13800OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f13801OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public int[] f13802OooO0Oo;
    public boolean OooO0o;
    public final ImageView OooO0o0;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f13803OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public boolean OooOO0;
    public int o0000;
    public final int o00000oO;
    public final int o00000oo;
    public int o0000O00;

    public class OooO implements AdapterView.OnItemClickListener {
        public OooO() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.OooO00o(i, 0, (String) null);
        }
    }

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.OooO0O0(charSequence);
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            SearchView.this.OooOO0();
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public void run() {
            AbstractC7150o00o00Oo o00o00oo = SearchView.this.f13785OooO00o;
            if (o00o00oo != null && (o00o00oo instanceof View$OnClickListenerC6947o00000o0)) {
                o00o00oo.m18525OooO00o((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$OooO0Oo  reason: case insensitive filesystem */
    public class View$OnFocusChangeListenerC5014OooO0Oo implements View.OnFocusChangeListener {
        public View$OnFocusChangeListenerC5014OooO0Oo() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f13773OooO00o;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class OooO0o implements View.OnClickListener {
        public OooO0o() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f13778OooO00o) {
                searchView.OooO0o();
            } else if (view == searchView.f13796OooO0OO) {
                searchView.OooO0o0();
            } else if (view == searchView.f13793OooO0O0) {
                searchView.m14443OooO0oO();
            } else if (view == searchView.f13799OooO0Oo) {
                searchView.OooO();
            } else if (view == searchView.f13784OooO00o) {
                searchView.OooO0Oo();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$OooO0o0  reason: case insensitive filesystem */
    public class View$OnLayoutChangeListenerC5015OooO0o0 implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC5015OooO0o0() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.OooO0OO();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$OooO0oO  reason: case insensitive filesystem */
    public class View$OnKeyListenerC5016OooO0oO implements View.OnKeyListener {
        public View$OnKeyListenerC5016OooO0oO() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f13767OooO00o == null) {
                return false;
            }
            if (searchView.f13784OooO00o.isPopupShowing() && SearchView.this.f13784OooO00o.getListSelection() != -1) {
                return SearchView.this.OooO00o(view, i, keyEvent);
            }
            if (SearchView.this.f13784OooO00o.m14445OooO00o() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.OooO00o(0, (String) null, searchView2.f13784OooO00o.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$OooO0oo  reason: case insensitive filesystem */
    public class C5017OooO0oo implements TextView.OnEditorActionListener {
        public C5017OooO0oo() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m14443OooO0oO();
            return true;
        }
    }

    public class OooOO0 implements AdapterView.OnItemSelectedListener {
        public OooOO0() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.OooO0O0(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$OooOO0o  reason: case insensitive filesystem */
    public interface AbstractC5018OooOO0o {
        boolean OooO00o();
    }

    public interface OooOOO {
        boolean OooO00o(int i);

        boolean OooO0O0(int i);
    }

    public interface OooOOO0 {
        boolean OooO00o(String str);

        boolean OooO0O0(String str);
    }

    public static class OooOOOO extends TouchDelegate {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Rect f13804OooO00o = new Rect();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final View f13805OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f13806OooO00o;
        public final Rect OooO0O0 = new Rect();
        public final Rect OooO0OO = new Rect();

        public OooOOOO(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.OooO00o = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            OooO00o(rect, rect2);
            this.f13805OooO00o = view;
        }

        public void OooO00o(Rect rect, Rect rect2) {
            this.f13804OooO00o.set(rect);
            this.OooO0OO.set(rect);
            Rect rect3 = this.OooO0OO;
            int i = this.OooO00o;
            rect3.inset(-i, -i);
            this.OooO0O0.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
            // Method dump skipped, instructions count: 115
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.OooOOOO.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public boolean OooO0O0;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: OooO00o */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.OooO0O0 + C7522o0Ooo0o.OooO0Oo;
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.OooO0O0));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.OooO0O0 = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SearchAutoComplete extends C5986OoooOoo {
        public SearchView OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Runnable f13807OooO00o;
        public boolean OooO0O0;
        public int o00oO0O;

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            public void run() {
                SearchAutoComplete.this.OooO00o();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14445OooO00o() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public boolean enoughToFilter() {
            return this.o00oO0O <= 0 || super.enoughToFilter();
        }

        @Override // com.p118pd.sdk.C5986OoooOoo
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.OooO0O0) {
                removeCallbacks(this.f13807OooO00o);
                post(this.f13807OooO00o);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.OooO00o.m14444OooO0oo();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.OooO00o.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.OooO00o.hasFocus() && getVisibility() == 0) {
                this.OooO0O0 = true;
                if (SearchView.OooO00o(getContext())) {
                    SearchView.OooO00o.OooO00o(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.OooO0O0 = false;
                removeCallbacks(this.f13807OooO00o);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.OooO0O0 = false;
                removeCallbacks(this.f13807OooO00o);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.OooO0O0 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.OooO00o = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.o00oO0O = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0033R.attr.autoCompleteTextViewStyle);
        }

        public void OooO00o() {
            if (this.OooO0O0) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.OooO0O0 = false;
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f13807OooO00o = new OooO00o();
            this.o00oO0O = getThreshold();
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private void OooO0O0(boolean z) {
        this.f13803OooO0o0 = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f13784OooO00o.getText());
        this.f13778OooO00o.setVisibility(i2);
        OooO00o(z2);
        this.f13775OooO00o.setVisibility(z ? 8 : 0);
        if (this.OooO0o0.getDrawable() == null || this.f13801OooO0Oo) {
            i = 8;
        }
        this.OooO0o0.setVisibility(i);
        OooOOO0();
        OooO0OO(!z2);
        OooOOOo();
    }

    private boolean OooO0oO() {
        SearchableInfo searchableInfo = this.f13767OooO00o;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f13767OooO00o.getVoiceSearchLaunchWebSearch()) {
            intent = this.f13768OooO00o;
        } else if (this.f13767OooO00o.getVoiceSearchLaunchRecognizer()) {
            intent = this.OooO0O0;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    private boolean OooO0oo() {
        return (this.OooO0o || this.OooO) && !m14440OooO0Oo();
    }

    private void OooOO0O() {
        this.f13784OooO00o.dismissDropDown();
    }

    private void OooOO0o() {
        post(this.f13787OooO00o);
    }

    private void OooOOO() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f13784OooO00o;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(OooO00o(queryHint));
    }

    private void OooOOO0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f13784OooO00o.getText());
        int i = 0;
        if (!z2 && (!this.f13801OooO0Oo || this.OooOO0)) {
            z = false;
        }
        ImageView imageView = this.f13796OooO0OO;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f13796OooO0OO.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void OooOOOO() {
        this.f13784OooO00o.setThreshold(this.f13767OooO00o.getSuggestThreshold());
        this.f13784OooO00o.setImeOptions(this.f13767OooO00o.getImeOptions());
        int inputType = this.f13767OooO00o.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f13767OooO00o.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f13784OooO00o.setInputType(inputType);
        AbstractC7150o00o00Oo o00o00oo = this.f13785OooO00o;
        if (o00o00oo != null) {
            o00o00oo.m18525OooO00o((Cursor) null);
        }
        if (this.f13767OooO00o.getSuggestAuthority() != null) {
            View$OnClickListenerC6947o00000o0 o00000o0 = new View$OnClickListenerC6947o00000o0(getContext(), this, this.f13767OooO00o, this.f13788OooO00o);
            this.f13785OooO00o = o00000o0;
            this.f13784OooO00o.setAdapter(o00000o0);
            View$OnClickListenerC6947o00000o0 o00000o02 = (View$OnClickListenerC6947o00000o0) this.f13785OooO00o;
            if (this.OooO0oO) {
                i = 2;
            }
            o00000o02.OooO0OO(i);
        }
    }

    private void OooOOOo() {
        this.OooO0OO.setVisibility((!OooO0oo() || !(this.f13793OooO0O0.getVisibility() == 0 || this.f13799OooO0Oo.getVisibility() == 0)) ? 8 : 0);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0033R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0033R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f13784OooO00o.setText(charSequence);
        this.f13784OooO00o.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void OooO() {
        SearchableInfo searchableInfo = this.f13767OooO00o;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(OooO0O0(this.f13768OooO00o, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(OooO00o(this.OooO0O0, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public void OooO00o(CharSequence charSequence, boolean z) {
        this.f13784OooO00o.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f13784OooO00o;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f13800OooO0Oo = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            m14443OooO0oO();
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m14439OooO0OO() {
        return this.f13801OooO0Oo;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m14440OooO0Oo() {
        return this.f13803OooO0o0;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m14441OooO0o() {
        return this.OooO0o;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m14442OooO0o0() {
        return this.OooO0oO;
    }

    public void OooOO0() {
        int[] iArr = this.f13784OooO00o.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f13792OooO0O0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.OooO0OO.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void clearFocus() {
        this.OooO0oo = true;
        super.clearFocus();
        this.f13784OooO00o.clearFocus();
        this.f13784OooO00o.setImeVisibility(false);
        this.OooO0oo = false;
    }

    public int getImeOptions() {
        return this.f13784OooO00o.getImeOptions();
    }

    public int getInputType() {
        return this.f13784OooO00o.getInputType();
    }

    public int getMaxWidth() {
        return this.o0000;
    }

    public CharSequence getQuery() {
        return this.f13784OooO00o.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f13794OooO0O0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f13767OooO00o;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f13786OooO00o;
        }
        return getContext().getText(this.f13767OooO00o.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.o00000oo;
    }

    public int getSuggestionRowLayout() {
        return this.o00000oO;
    }

    public AbstractC7150o00o00Oo getSuggestionsAdapter() {
        return this.f13785OooO00o;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f13787OooO00o);
        post(this.f13795OooO0O0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            OooO00o(this.f13784OooO00o, this.f13769OooO00o);
            Rect rect = this.f13789OooO0O0;
            Rect rect2 = this.f13769OooO00o;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            OooOOOO oooOOOO = this.f13783OooO00o;
            if (oooOOOO == null) {
                OooOOOO oooOOOO2 = new OooOOOO(this.f13789OooO0O0, this.f13769OooO00o, this.f13784OooO00o);
                this.f13783OooO00o = oooOOOO2;
                setTouchDelegate(oooOOOO2);
                return;
            }
            oooOOOO.OooO00o(this.f13789OooO0O0, this.f13769OooO00o);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i, int i2) {
        int i3;
        if (m14440OooO0Oo()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.o0000;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.o0000;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.o0000) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.OooO00o());
        OooO0O0(savedState.OooO0O0);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.OooO0O0 = m14440OooO0Oo();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        OooOO0o();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.OooO0oo || !isFocusable()) {
            return false;
        }
        if (m14440OooO0Oo()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f13784OooO00o.requestFocus(i, rect);
        if (requestFocus) {
            OooO0O0(false);
        }
        return requestFocus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setAppSearchData(Bundle bundle) {
        this.f13770OooO00o = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            OooO0o0();
        } else {
            OooO0o();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f13801OooO0Oo != z) {
            this.f13801OooO0Oo = z;
            OooO0O0(z);
            OooOOO();
        }
    }

    public void setImeOptions(int i) {
        this.f13784OooO00o.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f13784OooO00o.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.o0000 = i;
        requestLayout();
    }

    public void setOnCloseListener(AbstractC5018OooOO0o oooOO0o) {
        this.f13780OooO00o = oooOO0o;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f13773OooO00o = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OooOOO0 oooOOO0) {
        this.f13781OooO00o = oooOOO0;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f13772OooO00o = onClickListener;
    }

    public void setOnSuggestionListener(OooOOO oooOOO) {
        this.f13782OooO00o = oooOOO;
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.f13794OooO0O0 = charSequence;
        OooOOO();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.OooO0oO = z;
        AbstractC7150o00o00Oo o00o00oo = this.f13785OooO00o;
        if (o00o00oo instanceof View$OnClickListenerC6947o00000o0) {
            ((View$OnClickListenerC6947o00000o0) o00o00oo).OooO0OO(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f13767OooO00o = searchableInfo;
        if (searchableInfo != null) {
            OooOOOO();
            OooOOO();
        }
        boolean OooO0oO2 = OooO0oO();
        this.OooO = OooO0oO2;
        if (OooO0oO2) {
            this.f13784OooO00o.setPrivateImeOptions(o0ooOoO);
        }
        OooO0O0(m14440OooO0Oo());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.OooO0o = z;
        OooO0O0(m14440OooO0Oo());
    }

    public void setSuggestionsAdapter(AbstractC7150o00o00Oo o00o00oo) {
        this.f13785OooO00o = o00o00oo;
        this.f13784OooO00o.setAdapter(o00o00oo);
    }

    public static class OooOO0O {
        public Method OooO00o;
        public Method OooO0O0;
        public Method OooO0OO;
        public Method OooO0Oo;

        public OooOO0O() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.OooO0O0 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.OooO0OO = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public void OooO00o(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.OooO0O0;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void OooO0O0(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.OooO00o;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void OooO00o(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.OooO0OO;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.searchViewStyle);
    }

    private void OooO0OO(boolean z) {
        int i = 8;
        if (this.OooO && !m14440OooO0Oo() && z) {
            this.f13793OooO0O0.setVisibility(8);
            i = 0;
        }
        this.f13799OooO0Oo.setVisibility(i);
    }

    public void OooO0Oo() {
        OooO00o.OooO0O0(this.f13784OooO00o);
        OooO00o.OooO00o(this.f13784OooO00o);
    }

    public void OooO0o() {
        OooO0O0(false);
        this.f13784OooO00o.requestFocus();
        this.f13784OooO00o.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f13772OooO00o;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void OooO0o0() {
        if (!TextUtils.isEmpty(this.f13784OooO00o.getText())) {
            this.f13784OooO00o.setText("");
            this.f13784OooO00o.requestFocus();
            this.f13784OooO00o.setImeVisibility(true);
        } else if (this.f13801OooO0Oo) {
            AbstractC5018OooOO0o oooOO0o = this.f13780OooO00o;
            if (oooOO0o == null || !oooOO0o.OooO00o()) {
                clearFocus();
                OooO0O0(true);
            }
        }
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public void m14444OooO0oo() {
        OooO0O0(m14440OooO0Oo());
        OooOO0o();
        if (this.f13784OooO00o.hasFocus()) {
            OooO0Oo();
        }
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13769OooO00o = new Rect();
        this.f13789OooO0O0 = new Rect();
        this.f13798OooO0OO = new int[2];
        this.f13802OooO0Oo = new int[2];
        this.f13787OooO00o = new OooO0O0();
        this.f13795OooO0O0 = new OooO0OO();
        this.f13788OooO00o = new WeakHashMap<>();
        this.f13791OooO0O0 = new OooO0o();
        this.f13774OooO00o = new View$OnKeyListenerC5016OooO0oO();
        this.f13779OooO00o = new C5017OooO0oo();
        this.f13776OooO00o = new OooO();
        this.f13777OooO00o = new OooOO0();
        this.f13771OooO00o = new OooO00o();
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(context, attributeSet, C0033R.styleable.Oooo0, i, 0);
        LayoutInflater.from(context).inflate(OooO00o2.OooO0oO(C0033R.styleable.SearchView_layout, C0033R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0033R.C0036id.search_src_text);
        this.f13784OooO00o = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f13775OooO00o = findViewById(C0033R.C0036id.search_edit_frame);
        this.f13792OooO0O0 = findViewById(C0033R.C0036id.search_plate);
        this.OooO0OO = findViewById(C0033R.C0036id.submit_area);
        this.f13778OooO00o = (ImageView) findViewById(C0033R.C0036id.search_button);
        this.f13793OooO0O0 = (ImageView) findViewById(C0033R.C0036id.search_go_btn);
        this.f13796OooO0OO = (ImageView) findViewById(C0033R.C0036id.search_close_btn);
        this.f13799OooO0Oo = (ImageView) findViewById(C0033R.C0036id.search_voice_btn);
        this.OooO0o0 = (ImageView) findViewById(C0033R.C0036id.search_mag_icon);
        ViewCompat.OooO00o(this.f13792OooO0O0, OooO00o2.m18162OooO00o(C0033R.styleable.SearchView_queryBackground));
        ViewCompat.OooO00o(this.OooO0OO, OooO00o2.m18162OooO00o(C0033R.styleable.SearchView_submitBackground));
        this.f13778OooO00o.setImageDrawable(OooO00o2.m18162OooO00o(C0033R.styleable.SearchView_searchIcon));
        this.f13793OooO0O0.setImageDrawable(OooO00o2.m18162OooO00o(C0033R.styleable.SearchView_goIcon));
        this.f13796OooO0OO.setImageDrawable(OooO00o2.m18162OooO00o(C0033R.styleable.SearchView_closeIcon));
        this.f13799OooO0Oo.setImageDrawable(OooO00o2.m18162OooO00o(C0033R.styleable.SearchView_voiceIcon));
        this.OooO0o0.setImageDrawable(OooO00o2.m18162OooO00o(C0033R.styleable.SearchView_searchIcon));
        this.f13790OooO0O0 = OooO00o2.m18162OooO00o(C0033R.styleable.SearchView_searchHintIcon);
        C6953o0000O0O.OooO00o(this.f13778OooO00o, getResources().getString(C0033R.string.abc_searchview_description_search));
        this.o00000oO = OooO00o2.OooO0oO(C0033R.styleable.SearchView_suggestionRowLayout, C0033R.layout.abc_search_dropdown_item_icons_2line);
        this.o00000oo = OooO00o2.OooO0oO(C0033R.styleable.SearchView_commitIcon, 0);
        this.f13778OooO00o.setOnClickListener(this.f13791OooO0O0);
        this.f13796OooO0OO.setOnClickListener(this.f13791OooO0O0);
        this.f13793OooO0O0.setOnClickListener(this.f13791OooO0O0);
        this.f13799OooO0Oo.setOnClickListener(this.f13791OooO0O0);
        this.f13784OooO00o.setOnClickListener(this.f13791OooO0O0);
        this.f13784OooO00o.addTextChangedListener(this.f13771OooO00o);
        this.f13784OooO00o.setOnEditorActionListener(this.f13779OooO00o);
        this.f13784OooO00o.setOnItemClickListener(this.f13776OooO00o);
        this.f13784OooO00o.setOnItemSelectedListener(this.f13777OooO00o);
        this.f13784OooO00o.setOnKeyListener(this.f13774OooO00o);
        this.f13784OooO00o.setOnFocusChangeListener(new View$OnFocusChangeListenerC5014OooO0Oo());
        setIconifiedByDefault(OooO00o2.OooO00o(C0033R.styleable.SearchView_iconifiedByDefault, true));
        int OooO0OO2 = OooO00o2.OooO0OO(C0033R.styleable.SearchView_android_maxWidth, -1);
        if (OooO0OO2 != -1) {
            setMaxWidth(OooO0OO2);
        }
        this.f13786OooO00o = OooO00o2.m18164OooO00o(C0033R.styleable.SearchView_defaultQueryHint);
        this.f13794OooO0O0 = OooO00o2.m18164OooO00o(C0033R.styleable.SearchView_queryHint);
        int OooO0Oo2 = OooO00o2.OooO0Oo(C0033R.styleable.SearchView_android_imeOptions, -1);
        if (OooO0Oo2 != -1) {
            setImeOptions(OooO0Oo2);
        }
        int OooO0Oo3 = OooO00o2.OooO0Oo(C0033R.styleable.SearchView_android_inputType, -1);
        if (OooO0Oo3 != -1) {
            setInputType(OooO0Oo3);
        }
        setFocusable(OooO00o2.OooO00o(C0033R.styleable.SearchView_android_focusable, true));
        OooO00o2.m18167OooO00o();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f13768OooO00o = intent;
        intent.addFlags(CommonNetImpl.FLAG_AUTH);
        this.f13768OooO00o.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.OooO0O0 = intent2;
        intent2.addFlags(CommonNetImpl.FLAG_AUTH);
        View findViewById = findViewById(this.f13784OooO00o.getDropDownAnchor());
        this.OooO0Oo = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC5015OooO0o0());
        }
        OooO0O0(this.f13801OooO0Oo);
        OooOOO();
    }

    public void OooO0OO() {
        int i;
        if (this.OooO0Oo.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f13792OooO0O0.getPaddingLeft();
            Rect rect = new Rect();
            boolean OooO00o2 = C6954o0000OO.m18147OooO00o((View) this);
            int dimensionPixelSize = this.f13801OooO0Oo ? resources.getDimensionPixelSize(C0033R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0033R.dimen.abc_dropdownitem_text_padding_left) : 0;
            this.f13784OooO00o.getDropDownBackground().getPadding(rect);
            if (OooO00o2) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f13784OooO00o.setDropDownHorizontalOffset(i);
            this.f13784OooO00o.setDropDownWidth((((this.OooO0Oo.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    private void OooO00o(View view, Rect rect) {
        view.getLocationInWindow(this.f13798OooO0OO);
        getLocationInWindow(this.f13802OooO0Oo);
        int[] iArr = this.f13798OooO0OO;
        int i = iArr[1];
        int[] iArr2 = this.f13802OooO0Oo;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public void m14443OooO0oO() {
        Editable text = this.f13784OooO00o.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            OooOOO0 oooOOO0 = this.f13781OooO00o;
            if (oooOOO0 == null || !oooOOO0.OooO00o(text.toString())) {
                if (this.f13767OooO00o != null) {
                    OooO00o(0, (String) null, text.toString());
                }
                this.f13784OooO00o.setImeVisibility(false);
                OooOO0O();
            }
        }
    }

    private void OooO00o(boolean z) {
        this.f13793OooO0O0.setVisibility((!this.OooO0o || !OooO0oo() || !hasFocus() || (!z && this.OooO)) ? 8 : 0);
    }

    public void OooO0O0(CharSequence charSequence) {
        Editable text = this.f13784OooO00o.getText();
        this.f13800OooO0Oo = text;
        boolean z = !TextUtils.isEmpty(text);
        OooO00o(z);
        OooO0OO(!z);
        OooOOO0();
        OooOOOo();
        if (this.f13781OooO00o != null && !TextUtils.equals(charSequence, this.f13797OooO0OO)) {
            this.f13781OooO00o.OooO0O0(charSequence.toString());
        }
        this.f13797OooO0OO = charSequence.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14438OooO00o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public boolean OooO00o(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f13767OooO00o != null && this.f13785OooO00o != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return OooO00o(this.f13784OooO00o.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f13784OooO00o.length();
                }
                this.f13784OooO00o.setSelection(i2);
                this.f13784OooO00o.setListSelection(0);
                this.f13784OooO00o.clearListSelection();
                OooO00o.OooO00o(this.f13784OooO00o, true);
                return true;
            } else if (i != 19 || this.f13784OooO00o.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5950OooOo0, androidx.appcompat.widget.LinearLayoutCompat
    public void OooO0O0() {
        if (!this.OooOO0) {
            this.OooOO0 = true;
            int imeOptions = this.f13784OooO00o.getImeOptions();
            this.o0000O00 = imeOptions;
            this.f13784OooO00o.setImeOptions(imeOptions | CommonNetImpl.FLAG_SHARE_JUMP);
            this.f13784OooO00o.setText("");
            setIconified(false);
        }
    }

    private CharSequence OooO00o(CharSequence charSequence) {
        if (!this.f13801OooO0Oo || this.f13790OooO0O0 == null) {
            return charSequence;
        }
        double textSize = (double) this.f13784OooO00o.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f13790OooO0O0.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f13790OooO0O0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public boolean OooO0O0(int i) {
        OooOOO oooOOO = this.f13782OooO00o;
        if (oooOOO != null && oooOOO.OooO0O0(i)) {
            return false;
        }
        OooO00o(i);
        return true;
    }

    private boolean OooO0O0(int i, int i2, String str) {
        Cursor OooO00o2 = this.f13785OooO00o.OooO00o();
        if (OooO00o2 == null || !OooO00o2.moveToPosition(i)) {
            return false;
        }
        OooO00o(OooO00o(OooO00o2, i2, str));
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC5950OooOo0, androidx.appcompat.widget.LinearLayoutCompat, androidx.appcompat.widget.LinearLayoutCompat
    public void OooO00o() {
        OooO00o("", false);
        clearFocus();
        OooO0O0(true);
        this.f13784OooO00o.setImeOptions(this.o0000O00);
        this.OooOO0 = false;
    }

    private Intent OooO0O0(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    public boolean OooO00o(int i, int i2, String str) {
        OooOOO oooOOO = this.f13782OooO00o;
        if (oooOOO != null && oooOOO.OooO00o(i)) {
            return false;
        }
        OooO0O0(i, 0, null);
        this.f13784OooO00o.setImeVisibility(false);
        OooOO0O();
        return true;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, androidx.appcompat.widget.LinearLayoutCompat, androidx.appcompat.widget.LinearLayoutCompat
    private void OooO00o(int i) {
        Editable text = this.f13784OooO00o.getText();
        Cursor OooO00o2 = this.f13785OooO00o.OooO00o();
        if (OooO00o2 != null) {
            if (OooO00o2.moveToPosition(i)) {
                CharSequence OooO00o3 = this.f13785OooO00o.m18523OooO00o(OooO00o2);
                if (OooO00o3 != null) {
                    setQuery(OooO00o3);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private void OooO00o(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException unused) {
                String str = "Failed launch activity: " + intent;
            }
        }
    }

    public void OooO00o(int i, String str, String str2) {
        getContext().startActivity(OooO00o("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    private Intent OooO00o(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(CommonNetImpl.FLAG_AUTH);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f13800OooO0Oo);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f13770OooO00o;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f13767OooO00o.getSearchActivity());
        return intent;
    }

    private Intent OooO00o(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f13770OooO00o;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10 = r10.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r0 = "Search suggestions cursor at row " + r10 + " returned exception.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent OooO00o(android.database.Cursor r10, int r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.OooO00o(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    public static boolean OooO00o(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
