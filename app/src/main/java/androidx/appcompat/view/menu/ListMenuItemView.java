package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.AbstractC5976OoooO00;
import com.p118pd.sdk.C5967Oooo0OO;
import com.p118pd.sdk.C6970o0000oO;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ListMenuItemView extends LinearLayout implements AbstractC5976OoooO00.OooO00o, AbsListView.SelectionBoundsAdjuster {
    public static final String o0ooOOo = "ListMenuItemView";
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Drawable f13688OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LayoutInflater f13689OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CheckBox f13690OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ImageView f13691OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LinearLayout f13692OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RadioButton f13693OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f13694OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5967Oooo0OO f13695OooO00o;
    public Drawable OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public ImageView f13696OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public TextView f13697OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f13698OooO0O0;
    public ImageView OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f13699OooO0OO;
    public boolean OooO0Oo;
    public int o00oO0O;
    public int o0ooOO0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.listMenuViewStyle);
    }

    private void OooO0O0() {
        ImageView imageView = (ImageView) getInflater().inflate(C0033R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f13691OooO00o = imageView;
        OooO00o(imageView, 0);
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    private void OooO0OO() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C0033R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f13693OooO00o = radioButton;
        OooO00o(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f13689OooO00o == null) {
            this.f13689OooO00o = LayoutInflater.from(getContext());
        }
        return this.f13689OooO00o;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f13696OooO0O0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void OooO00o(C5967Oooo0OO oooo0OO, int i) {
        this.f13695OooO00o = oooo0OO;
        this.o0ooOO0 = i;
        setVisibility(oooo0OO.isVisible() ? 0 : 8);
        setTitle(oooo0OO.OooO00o((AbstractC5976OoooO00.OooO00o) this));
        setCheckable(oooo0OO.isCheckable());
        OooO00o(oooo0OO.OooO0oo(), oooo0OO.OooO00o());
        setIcon(oooo0OO.getIcon());
        setEnabled(oooo0OO.isEnabled());
        setSubMenuArrowVisible(oooo0OO.hasSubMenu());
        setContentDescription(oooo0OO.getContentDescription());
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14412OooO00o() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.OooO0OO;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.OooO0OO.getLayoutParams();
            rect.top += this.OooO0OO.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public C5967Oooo0OO getItemData() {
        return this.f13695OooO00o;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.OooO00o(this, this.f13688OooO00o);
        TextView textView = (TextView) findViewById(C0033R.C0036id.title);
        this.f13694OooO00o = textView;
        int i = this.o00oO0O;
        if (i != -1) {
            textView.setTextAppearance(this.OooO00o, i);
        }
        this.f13697OooO0O0 = (TextView) findViewById(C0033R.C0036id.shortcut);
        ImageView imageView = (ImageView) findViewById(C0033R.C0036id.submenuarrow);
        this.f13696OooO0O0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.OooO0O0);
        }
        this.OooO0OO = (ImageView) findViewById(C0033R.C0036id.group_divider);
        this.f13692OooO00o = (LinearLayout) findViewById(C0033R.C0036id.content);
    }

    public void onMeasure(int i, int i2) {
        if (this.f13691OooO00o != null && this.f13698OooO0O0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f13691OooO00o.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f13693OooO00o != null || this.f13690OooO00o != null) {
            if (this.f13695OooO00o.OooO0Oo()) {
                if (this.f13693OooO00o == null) {
                    OooO0OO();
                }
                compoundButton2 = this.f13693OooO00o;
                compoundButton = this.f13690OooO00o;
            } else {
                if (this.f13690OooO00o == null) {
                    OooO00o();
                }
                compoundButton2 = this.f13690OooO00o;
                compoundButton = this.f13693OooO00o;
            }
            if (z) {
                compoundButton2.setChecked(this.f13695OooO00o.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f13690OooO00o;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f13693OooO00o;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f13695OooO00o.OooO0Oo()) {
            if (this.f13693OooO00o == null) {
                OooO0OO();
            }
            compoundButton = this.f13693OooO00o;
        } else {
            if (this.f13690OooO00o == null) {
                OooO00o();
            }
            compoundButton = this.f13690OooO00o;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.OooO0Oo = z;
        this.f13698OooO0O0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.OooO0OO;
        if (imageView != null) {
            imageView.setVisibility((this.f13699OooO0OO || !z) ? 8 : 0);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void setIcon(Drawable drawable) {
        boolean z = this.f13695OooO00o.OooO0oO() || this.OooO0Oo;
        if (!z && !this.f13698OooO0O0) {
            return;
        }
        if (this.f13691OooO00o != null || drawable != null || this.f13698OooO0O0) {
            if (this.f13691OooO00o == null) {
                OooO0O0();
            }
            if (drawable != null || this.f13698OooO0O0) {
                ImageView imageView = this.f13691OooO00o;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f13691OooO00o.getVisibility() != 0) {
                    this.f13691OooO00o.setVisibility(0);
                    return;
                }
                return;
            }
            this.f13691OooO00o.setVisibility(8);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f13694OooO00o.setText(charSequence);
            if (this.f13694OooO00o.getVisibility() != 0) {
                this.f13694OooO00o.setVisibility(0);
            }
        } else if (this.f13694OooO00o.getVisibility() != 8) {
            this.f13694OooO00o.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(getContext(), attributeSet, C0033R.styleable.OooOooo, i, 0);
        this.f13688OooO00o = OooO00o2.m18162OooO00o(C0033R.styleable.MenuView_android_itemBackground);
        this.o00oO0O = OooO00o2.OooO0oO(C0033R.styleable.MenuView_android_itemTextAppearance, -1);
        this.f13698OooO0O0 = OooO00o2.OooO00o(C0033R.styleable.MenuView_preserveIconSpacing, false);
        this.OooO00o = context;
        this.OooO0O0 = OooO00o2.m18162OooO00o(C0033R.styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0033R.attr.dropDownListViewStyle, 0);
        this.f13699OooO0OO = obtainStyledAttributes.hasValue(0);
        OooO00o2.m18167OooO00o();
        obtainStyledAttributes.recycle();
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m14413OooO0OO() {
        return this.OooO0Oo;
    }

    private void OooO00o(View view) {
        OooO00o(view, -1);
    }

    private void OooO00o(View view, int i) {
        LinearLayout linearLayout = this.f13692OooO00o;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    public void OooO00o(boolean z, char c) {
        int i = (!z || !this.f13695OooO00o.OooO0oo()) ? 8 : 0;
        if (i == 0) {
            this.f13697OooO0O0.setText(this.f13695OooO00o.m16794OooO00o());
        }
        if (this.f13697OooO0O0.getVisibility() != i) {
            this.f13697OooO0O0.setVisibility(i);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5976OoooO00.OooO00o
    private void OooO00o() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C0033R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f13690OooO00o = checkBox;
        OooO00o(checkBox);
    }
}
