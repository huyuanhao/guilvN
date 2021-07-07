package com.p118pd.sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* renamed from: com.pd.sdk.o00o  reason: case insensitive filesystem */
public class C7142o00o extends Fragment {
    public static final int o00oO0O = 16711681;
    public static final int o0ooOO0 = 16711682;
    public static final int o0ooOOo = 16711683;
    public final Handler OooO00o = new Handler();

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f19504OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AdapterView.OnItemClickListener f19505OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ListAdapter f19506OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ListView f19507OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f19508OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CharSequence f19509OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f19510OooO00o = new OooO00o();
    public View OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19511OooO0O0;
    public View OooO0OO;

    /* renamed from: com.pd.sdk.o00o$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            ListView listView = C7142o00o.this.f19507OooO00o;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: com.pd.sdk.o00o$OooO0O0 */
    public class OooO0O0 implements AdapterView.OnItemClickListener {
        public OooO0O0() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C7142o00o.this.OooO00o((ListView) adapterView, view, i, j);
        }
    }

    public void OooO00o(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f19506OooO00o != null;
        this.f19506OooO00o = listAdapter;
        ListView listView = this.f19507OooO00o;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f19511OooO0O0 && !z2) {
                if (getView().getWindowToken() != null) {
                    z = true;
                }
                OooO00o(true, z);
            }
        }
    }

    public void OooO00o(ListView listView, View view, int i, long j) {
    }

    public void OooO0O0(boolean z) {
        OooO00o(z, false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(o0ooOO0);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(context, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(o0ooOOo);
        TextView textView = new TextView(context);
        textView.setId(o00oO0O);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(context);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.OooO00o.removeCallbacks(this.f19510OooO00o);
        this.f19507OooO00o = null;
        this.f19511OooO0O0 = false;
        this.OooO0OO = null;
        this.OooO0O0 = null;
        this.f19504OooO00o = null;
        this.f19508OooO00o = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        OooO00o();
    }

    public void OooO00o(int i) {
        OooO00o();
        this.f19507OooO00o.setSelection(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18509OooO00o() {
        OooO00o();
        return this.f19507OooO00o.getSelectedItemPosition();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m18510OooO00o() {
        OooO00o();
        return this.f19507OooO00o.getSelectedItemId();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ListView m18512OooO00o() {
        OooO00o();
        return this.f19507OooO00o;
    }

    public void OooO00o(CharSequence charSequence) {
        OooO00o();
        TextView textView = this.f19508OooO00o;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.f19509OooO00o == null) {
                this.f19507OooO00o.setEmptyView(this.f19508OooO00o);
            }
            this.f19509OooO00o = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    public void OooO00o(boolean z) {
        OooO00o(z, true);
    }

    private void OooO00o(boolean z, boolean z2) {
        OooO00o();
        View view = this.OooO0O0;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f19511OooO0O0 != z) {
            this.f19511OooO0O0 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.OooO0OO.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.OooO0OO.clearAnimation();
                }
                this.OooO0O0.setVisibility(8);
                this.OooO0OO.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.OooO0OO.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.OooO0OO.clearAnimation();
            }
            this.OooO0O0.setVisibility(0);
            this.OooO0OO.setVisibility(8);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ListAdapter m18511OooO00o() {
        return this.f19506OooO00o;
    }

    private void OooO00o() {
        if (this.f19507OooO00o == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f19507OooO00o = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(o00oO0O);
                    this.f19508OooO00o = textView;
                    if (textView == null) {
                        this.f19504OooO00o = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.OooO0O0 = view.findViewById(o0ooOO0);
                    this.OooO0OO = view.findViewById(o0ooOOo);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f19507OooO00o = listView;
                        View view2 = this.f19504OooO00o;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        } else {
                            CharSequence charSequence = this.f19509OooO00o;
                            if (charSequence != null) {
                                this.f19508OooO00o.setText(charSequence);
                                this.f19507OooO00o.setEmptyView(this.f19508OooO00o);
                            }
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f19511OooO0O0 = true;
                this.f19507OooO00o.setOnItemClickListener(this.f19505OooO00o);
                ListAdapter listAdapter = this.f19506OooO00o;
                if (listAdapter != null) {
                    this.f19506OooO00o = null;
                    OooO00o(listAdapter);
                } else if (this.OooO0O0 != null) {
                    OooO00o(false, false);
                }
                this.OooO00o.post(this.f19510OooO00o);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }
}
