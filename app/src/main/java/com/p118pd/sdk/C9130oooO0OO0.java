package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p118pd.sdk.C9108oooO0;
import com.yongchun.library.C4695R;
import com.yongchun.library.model.LocalMediaFolder;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.pd.sdk.oooO0OO0  reason: case insensitive filesystem */
public class C9130oooO0OO0 extends PopupWindow {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f22607OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RecyclerView f22608OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9108oooO0 f22609OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22610OooO00o = false;

    /* renamed from: com.pd.sdk.oooO0OO0$OooO00o */
    public class OooO00o implements Animation.AnimationListener {
        public OooO00o() {
        }

        public void onAnimationEnd(Animation animation) {
            C9130oooO0OO0.this.f22610OooO00o = false;
            C9130oooO0OO0.super.dismiss();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.pd.sdk.oooO0OO0$OooO0O0 */
    public class OooO0O0 extends RecyclerView.AbstractC5067OooOO0o {
        public Drawable OooO00o;

        public OooO0O0() {
            this.OooO00o = C9130oooO0OO0.this.OooO00o.getResources().getDrawable(C4695R.C4697drawable.item_divider);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5067OooOO0o
        public void OooO00o(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, this.OooO00o.getIntrinsicWidth());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5067OooOO0o
        public void OooO0O0(Canvas canvas, RecyclerView recyclerView) {
            int OooO00o2 = C9122oooO0O.OooO00o(recyclerView.getContext(), 16.0f);
            int width = recyclerView.getWidth() - OooO00o2;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount - 1; i++) {
                View childAt = recyclerView.getChildAt(i);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.OooOOO) childAt.getLayoutParams())).bottomMargin;
                this.OooO00o.setBounds(OooO00o2, bottom, width, this.OooO00o.getIntrinsicHeight() + bottom);
                this.OooO00o.draw(canvas);
            }
        }
    }

    public C9130oooO0OO0(Context context) {
        this.OooO00o = context;
        View inflate = LayoutInflater.from(context).inflate(C4695R.layout.window_folder, (ViewGroup) null);
        this.f22607OooO00o = inflate;
        setContentView(inflate);
        setWidth(C9122oooO0O.OooO0O0(context));
        setHeight(C9122oooO0O.OooO00o(context) - C9122oooO0O.OooO00o(context, 96.0f));
        setAnimationStyle(C4695R.style.WindowStyle);
        setFocusable(true);
        setOutsideTouchable(true);
        update();
        setBackgroundDrawable(new ColorDrawable(Color.argb(153, 0, 0, 0)));
        OooO00o();
        OooO0O0();
        OooO00o((PopupWindow) this, false);
    }

    public void OooO0O0() {
    }

    public void dismiss() {
        if (!this.f22610OooO00o) {
            this.f22610OooO00o = true;
            Animation loadAnimation = AnimationUtils.loadAnimation(this.OooO00o, C4695R.anim.down_out);
            this.f22608OooO00o.startAnimation(loadAnimation);
            dismiss();
            loadAnimation.setAnimationListener(new OooO00o());
        }
    }

    public void showAsDropDown(View view) {
        super.showAsDropDown(view);
        this.f22608OooO00o.startAnimation(AnimationUtils.loadAnimation(this.OooO00o, C4695R.anim.up_in));
    }

    public void OooO00o() {
        this.f22609OooO00o = new C9108oooO0(this.OooO00o);
        RecyclerView recyclerView = (RecyclerView) this.f22607OooO00o.findViewById(C4695R.C4698id.folder_list);
        this.f22608OooO00o = recyclerView;
        recyclerView.OooO00o(new OooO0O0());
        this.f22608OooO00o.setLayoutManager(new LinearLayoutManager(this.OooO00o));
        this.f22608OooO00o.setAdapter(this.f22609OooO00o);
    }

    public void OooO00o(List<LocalMediaFolder> list) {
        this.f22609OooO00o.OooO00o(list);
    }

    public void OooO00o(C9108oooO0.OooO0O0 oooO0O0) {
        this.f22609OooO00o.OooO00o(oooO0O0);
    }

    public static void OooO00o(PopupWindow popupWindow, boolean z) {
        if (popupWindow != null) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(popupWindow, Boolean.valueOf(z));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
