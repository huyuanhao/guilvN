package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import com.p118pd.sdk.AbstractC7179o00o0oOo;
import com.p118pd.sdk.C7522o0Ooo0o;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FrameLayout f14379OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TabHost.OnTabChangeListener f14380OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f14381OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7175o00o0o0o f14382OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<OooO0O0> f14383OooO00o = new ArrayList<>();
    public boolean OooO0O0;
    public int o00oO0O;

    public static class OooO00o implements TabHost.TabContentFactory {
        public final Context OooO00o;

        public OooO00o(Context context) {
            this.OooO00o = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.OooO00o);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    public static final class OooO0O0 {
        @Nullable
        public final Bundle OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Fragment f14384OooO00o;
        @NonNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Class<?> f14385OooO00o;
        @NonNull

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f14386OooO00o;

        public OooO0O0(@NonNull String str, @NonNull Class<?> cls, @Nullable Bundle bundle) {
            this.f14386OooO00o = str;
            this.f14385OooO00o = cls;
            this.OooO00o = bundle;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public String o0ooOOo;

        public static class OooO00o implements Parcelable.Creator<SavedState> {
            /* renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
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
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.o0ooOOo + C7522o0Ooo0o.OooO0Oo;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.o0ooOOo);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.o0ooOOo = parcel.readString();
        }
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        OooO00o(context, (AttributeSet) null);
    }

    private void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.o00oO0O = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f14383OooO00o.size();
        AbstractC7179o00o0oOo o00o0ooo = null;
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = this.f14383OooO00o.get(i);
            Fragment OooO00o2 = this.f14382OooO00o.OooO00o(oooO0O0.f14386OooO00o);
            oooO0O0.f14384OooO00o = OooO00o2;
            if (OooO00o2 != null && !OooO00o2.isDetached()) {
                if (oooO0O0.f14386OooO00o.equals(currentTabTag)) {
                    this.f14381OooO00o = oooO0O0;
                } else {
                    if (o00o0ooo == null) {
                        o00o0ooo = this.f14382OooO00o.m18663OooO00o();
                    }
                    o00o0ooo.OooO0O0(oooO0O0.f14384OooO00o);
                }
            }
        }
        this.OooO0O0 = true;
        AbstractC7179o00o0oOo OooO00o3 = OooO00o(currentTabTag, o00o0ooo);
        if (OooO00o3 != null) {
            OooO00o3.OooO0OO();
            this.f14382OooO00o.m18666OooO00o();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.OooO0O0 = false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.o0ooOOo);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.o0ooOOo = getCurrentTabTag();
        return savedState;
    }

    public void onTabChanged(String str) {
        AbstractC7179o00o0oOo OooO00o2;
        if (this.OooO0O0 && (OooO00o2 = OooO00o(str, (AbstractC7179o00o0oOo) null)) != null) {
            OooO00o2.OooO0OO();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f14380OooO00o;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f14380OooO00o = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o(context, attributeSet);
    }

    private void OooO00o(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f14379OooO00o = frameLayout2;
            frameLayout2.setId(this.o00oO0O);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    public void OooO00o(Context context, AbstractC7175o00o0o0o o00o0o0o) {
        OooO00o(context);
        super.setup();
        this.OooO00o = context;
        this.f14382OooO00o = o00o0o0o;
        OooO00o();
    }

    public void OooO00o(Context context, AbstractC7175o00o0o0o o00o0o0o, int i) {
        OooO00o(context);
        super.setup();
        this.OooO00o = context;
        this.f14382OooO00o = o00o0o0o;
        this.o00oO0O = i;
        OooO00o();
        this.f14379OooO00o.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    private void OooO00o() {
        if (this.f14379OooO00o == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.o00oO0O);
            this.f14379OooO00o = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.o00oO0O);
            }
        }
    }

    public void OooO00o(@NonNull TabHost.TabSpec tabSpec, @NonNull Class<?> cls, @Nullable Bundle bundle) {
        tabSpec.setContent(new OooO00o(this.OooO00o));
        String tag = tabSpec.getTag();
        OooO0O0 oooO0O0 = new OooO0O0(tag, cls, bundle);
        if (this.OooO0O0) {
            Fragment OooO00o2 = this.f14382OooO00o.OooO00o(tag);
            oooO0O0.f14384OooO00o = OooO00o2;
            if (OooO00o2 != null && !OooO00o2.isDetached()) {
                AbstractC7179o00o0oOo OooO00o3 = this.f14382OooO00o.m18663OooO00o();
                OooO00o3.OooO0O0(oooO0O0.f14384OooO00o);
                OooO00o3.OooO0OO();
            }
        }
        this.f14383OooO00o.add(oooO0O0);
        addTab(tabSpec);
    }

    @Nullable
    private AbstractC7179o00o0oOo OooO00o(@Nullable String str, @Nullable AbstractC7179o00o0oOo o00o0ooo) {
        Fragment fragment;
        OooO0O0 OooO00o2 = OooO00o(str);
        if (this.f14381OooO00o != OooO00o2) {
            if (o00o0ooo == null) {
                o00o0ooo = this.f14382OooO00o.m18663OooO00o();
            }
            OooO0O0 oooO0O0 = this.f14381OooO00o;
            if (!(oooO0O0 == null || (fragment = oooO0O0.f14384OooO00o) == null)) {
                o00o0ooo.OooO0O0(fragment);
            }
            if (OooO00o2 != null) {
                Fragment fragment2 = OooO00o2.f14384OooO00o;
                if (fragment2 == null) {
                    Fragment instantiate = Fragment.instantiate(this.OooO00o, OooO00o2.f14385OooO00o.getName(), OooO00o2.OooO00o);
                    OooO00o2.f14384OooO00o = instantiate;
                    o00o0ooo.OooO00o(this.o00oO0O, instantiate, OooO00o2.f14386OooO00o);
                } else {
                    o00o0ooo.OooO00o(fragment2);
                }
            }
            this.f14381OooO00o = OooO00o2;
        }
        return o00o0ooo;
    }

    @Nullable
    private OooO0O0 OooO00o(String str) {
        int size = this.f14383OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = this.f14383OooO00o.get(i);
            if (oooO0O0.f14386OooO00o.equals(str)) {
                return oooO0O0;
            }
        }
        return null;
    }
}
