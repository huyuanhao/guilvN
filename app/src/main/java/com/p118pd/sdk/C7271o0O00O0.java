package com.p118pd.sdk;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.C0082R;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.pd.sdk.o0O00O0  reason: case insensitive filesystem */
public class C7271o0O00O0 implements AbstractC7252o0O00 {
    public static final AbstractC7252o0O00 OooO00o = new C7271o0O00O0();

    @Override // com.p118pd.sdk.AbstractC7252o0O00
    public void OooO00o(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(C0082R.C0085id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(ViewCompat.OooO0O0(view));
            ViewCompat.OooO0O0(view, OooO00o(recyclerView, view) + 1.0f);
            view.setTag(C0082R.C0085id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // com.p118pd.sdk.AbstractC7252o0O00
    public void OooO0O0(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    @Override // com.p118pd.sdk.AbstractC7252o0O00
    public void OooO0O0(View view) {
    }

    public static float OooO00o(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float OooO0O0 = ViewCompat.OooO0O0(childAt);
                if (OooO0O0 > f) {
                    f = OooO0O0;
                }
            }
        }
        return f;
    }

    @Override // com.p118pd.sdk.AbstractC7252o0O00
    public void OooO00o(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(C0082R.C0085id.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                ViewCompat.OooO0O0(view, ((Float) tag).floatValue());
            }
            view.setTag(C0082R.C0085id.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}
