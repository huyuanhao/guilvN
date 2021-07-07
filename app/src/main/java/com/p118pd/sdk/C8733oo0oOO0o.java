package com.p118pd.sdk;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jinhui365.util.C1427R;

/* renamed from: com.pd.sdk.oo0oOO0o  reason: case insensitive filesystem */
public class C8733oo0oOO0o extends LinearLayout {
    public View OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f21907OooO00o;
    public boolean OooO0O0;
    public float OooO0Oo;
    public int o00oO0O;
    public int o0ooOO0;
    public String o0ooOOo;

    public C8733oo0oOO0o(Context context) {
        super(context);
        OooO00o(context);
    }

    private void OooO00o(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C1427R.layout.table_row_text, this);
        this.f21907OooO00o = (TextView) findViewById(C1427R.C1430id.tv_title);
        this.OooO00o = findViewById(C1427R.C1430id.tv_line);
    }

    public void setIsShowLine(boolean z) {
        this.OooO00o.setVisibility(z ? 0 : 8);
    }

    public void setTitleColor(int i) {
        this.f21907OooO00o.setTextColor(i);
    }

    public void setTitleGravity(int i) {
        this.f21907OooO00o.setGravity(i);
    }

    public void setTitleSize(float f) {
        this.f21907OooO00o.setTextSize(0, f);
    }

    public void setTitleText(String str) {
        this.f21907OooO00o.setText(str);
    }

    public C8733oo0oOO0o(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
    }

    public C8733oo0oOO0o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1427R.styleable.OooO00o);
        this.o0ooOOo = obtainStyledAttributes.getString(C1427R.styleable.text_table_row_titleText);
        this.OooO0O0 = obtainStyledAttributes.getBoolean(C1427R.styleable.text_table_row_isShowLine, true);
        this.o00oO0O = obtainStyledAttributes.getInteger(C1427R.styleable.text_table_row_title_gravity, 17);
        this.o0ooOO0 = obtainStyledAttributes.getColor(C1427R.styleable.text_table_row_titleColor, getResources().getColor(C1427R.C1428color.f1865C2));
        this.OooO0Oo = obtainStyledAttributes.getDimension(C1427R.styleable.text_table_row_titleSize, getResources().getDimension(C1427R.dimen.f1879F6));
        OooO00o(context);
        setTitleText(this.o0ooOOo);
        setIsShowLine(this.OooO0O0);
        setTitleColor(this.o0ooOO0);
        setTitleSize(this.OooO0Oo);
        setTitleGravity(this.o00oO0O);
    }
}
