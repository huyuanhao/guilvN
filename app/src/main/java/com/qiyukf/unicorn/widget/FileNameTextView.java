package com.qiyukf.unicorn.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.qiyukf.unicorn.C2364R;

public class FileNameTextView extends View {

    /* renamed from: a */
    public TextPaint f6560a;

    /* renamed from: b */
    public StaticLayout f6561b;

    /* renamed from: c */
    public String f6562c;

    /* renamed from: d */
    public int f6563d;

    public FileNameTextView(Context context) {
        this(context, null);
    }

    public FileNameTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FileNameTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainAttributes = getResources().obtainAttributes(attributeSet, C2364R.styleable.FileNameTextView);
        this.f6562c = obtainAttributes.getString(C2364R.styleable.FileNameTextView_ysf_fntText);
        this.f6563d = obtainAttributes.getInt(C2364R.styleable.FileNameTextView_ysf_fntMaxLines, 1);
        int color = obtainAttributes.getColor(C2364R.styleable.FileNameTextView_ysf_fntTextColor, -7829368);
        float dimension = obtainAttributes.getDimension(C2364R.styleable.FileNameTextView_ysf_fntTextSize, (float) ((int) ((getResources().getDisplayMetrics().scaledDensity * 14.0f) + 0.5f)));
        obtainAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f6560a = textPaint;
        textPaint.setAntiAlias(true);
        this.f6560a.setColor(color);
        this.f6560a.setTextSize(dimension);
    }

    /* renamed from: a */
    private StaticLayout m7022a(int i, String str) {
        int lastIndexOf = str.lastIndexOf(46);
        String substring = str.substring(lastIndexOf + 1);
        if (substring.length() > 6) {
            substring = substring.substring(substring.length() - 6);
            lastIndexOf = str.length() - 6;
        }
        String substring2 = str.substring(0, lastIndexOf);
        int i2 = 0;
        while (i2 < substring2.length()) {
            int i3 = i2 + 1;
            String substring3 = substring2.substring(0, i3);
            if (m7023a(substring3 + "..." + substring, i).getLineCount() > this.f6563d) {
                String substring4 = substring2.substring(0, i2);
                return m7023a(substring4 + "..." + substring, i);
            }
            i2 = i3;
        }
        return null;
    }

    /* renamed from: a */
    private StaticLayout m7023a(String str, int i) {
        return new StaticLayout(str, this.f6560a, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    /* renamed from: a */
    public final void mo36845a(String str) {
        this.f6562c = str;
        requestLayout();
    }

    public void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        if (!TextUtils.isEmpty(this.f6562c) && (staticLayout = this.f6561b) != null) {
            staticLayout.draw(canvas);
        }
    }

    public void onMeasure(int i, int i2) {
        StaticLayout staticLayout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        String str = TextUtils.isEmpty(this.f6562c) ? "" : this.f6562c;
        this.f6562c = str;
        StaticLayout a = m7023a(str, size);
        if ((mode == 0 || mode == Integer.MIN_VALUE) && a.getLineCount() <= 1) {
            size = (int) Math.ceil((double) this.f6560a.measureText(this.f6562c));
        }
        if (mode2 == 0 || mode2 == Integer.MIN_VALUE) {
            int lineCount = a.getLineCount();
            if (lineCount <= 0) {
                lineCount = 1;
            } else {
                int i3 = this.f6563d;
                if (lineCount > i3) {
                    lineCount = i3;
                }
            }
            Paint.FontMetrics fontMetrics = this.f6560a.getFontMetrics();
            size2 = (int) Math.ceil((double) (((float) lineCount) * (fontMetrics.descent - fontMetrics.ascent)));
        }
        setMeasuredDimension(size, size2);
        StaticLayout a2 = m7023a(this.f6562c, size);
        if (a2.getLineCount() <= this.f6563d) {
            this.f6561b = a2;
            return;
        }
        int lastIndexOf = this.f6562c.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf >= this.f6562c.length() - 1) {
            String str2 = this.f6562c;
            int i4 = 0;
            while (true) {
                if (i4 >= str2.length()) {
                    staticLayout = null;
                    break;
                }
                StringBuilder sb = new StringBuilder();
                int i5 = i4 + 1;
                sb.append(str2.substring(0, i5));
                sb.append("...");
                if (m7023a(sb.toString(), size).getLineCount() > this.f6563d) {
                    staticLayout = m7023a(str2.substring(0, i4) + "...", size);
                    break;
                }
                i4 = i5;
            }
            this.f6561b = staticLayout;
            return;
        }
        this.f6561b = m7022a(size, this.f6562c);
    }
}
