package com.qiyukf.unicorn.mediaselect.internal.p242ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2757a;
import com.qiyukf.unicorn.mediaselect.p233a.AbstractC2726a;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.widget.MediaGrid */
public class MediaGrid extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    public ImageView f5798a;

    /* renamed from: b */
    public CheckView f5799b;

    /* renamed from: c */
    public ImageView f5800c;

    /* renamed from: d */
    public TextView f5801d;

    /* renamed from: e */
    public C2743d f5802e;

    /* renamed from: f */
    public C2776b f5803f;

    /* renamed from: g */
    public AbstractC2775a f5804g;

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.widget.MediaGrid$a */
    public interface AbstractC2775a {
        /* renamed from: a */
        void mo36557a(C2743d dVar);

        /* renamed from: b */
        void mo36561b(C2743d dVar);
    }

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.widget.MediaGrid$b */
    public static class C2776b {

        /* renamed from: a */
        public int f5805a;

        /* renamed from: b */
        public Drawable f5806b = null;

        /* renamed from: c */
        public boolean f5807c;

        /* renamed from: d */
        public C2757a.C2761c f5808d;

        public C2776b(int i, boolean z, C2757a.C2761c cVar) {
            this.f5805a = i;
            this.f5807c = z;
            this.f5808d = cVar;
        }
    }

    public MediaGrid(Context context) {
        super(context);
        m6428a(context);
    }

    public MediaGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6428a(context);
    }

    /* renamed from: a */
    private void m6428a(Context context) {
        LayoutInflater.from(context).inflate(C2364R.layout.ysf_media_grid_content, (ViewGroup) this, true);
        this.f5798a = (ImageView) findViewById(C2364R.C2367id.ysf_media_thumbnail);
        this.f5799b = (CheckView) findViewById(C2364R.C2367id.ysf_check_view);
        this.f5800c = (ImageView) findViewById(C2364R.C2367id.ysf_gif);
        this.f5801d = (TextView) findViewById(C2364R.C2367id.ysf_video_duration);
        this.f5798a.setOnClickListener(this);
        this.f5799b.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo36598a(int i) {
        this.f5799b.mo36591a(i);
    }

    /* renamed from: a */
    public final void mo36599a(C2743d dVar) {
        this.f5802e = dVar;
        this.f5800c.setVisibility(EnumC2731b.m6310c(dVar.f5670b) ? 0 : 8);
        this.f5799b.mo36593b(this.f5803f.f5807c);
        if (EnumC2731b.m6310c(this.f5802e.f5670b)) {
            AbstractC2726a aVar = C2745e.m6339a().f5689p;
            getContext();
            aVar.mo36483b(this.f5803f.f5805a, this.f5798a, this.f5802e.f5671c);
        } else {
            AbstractC2726a aVar2 = C2745e.m6339a().f5689p;
            getContext();
            aVar2.mo36481a(this.f5803f.f5805a, this.f5798a, this.f5802e.f5671c);
        }
        if (EnumC2731b.m6308b(this.f5802e.f5670b)) {
            this.f5801d.setVisibility(0);
            this.f5801d.setText(DateUtils.formatElapsedTime(this.f5802e.f5673e / 1000));
            return;
        }
        this.f5801d.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo36600a(AbstractC2775a aVar) {
        this.f5804g = aVar;
    }

    /* renamed from: a */
    public final void mo36601a(C2776b bVar) {
        this.f5803f = bVar;
    }

    /* renamed from: a */
    public final void mo36602a(boolean z) {
        this.f5799b.setEnabled(z);
    }

    /* renamed from: b */
    public final void mo36603b(boolean z) {
        this.f5799b.mo36592a(z);
    }

    public void onClick(View view) {
        AbstractC2775a aVar = this.f5804g;
        if (aVar == null) {
            return;
        }
        if (view == this.f5798a) {
            aVar.mo36557a(this.f5802e);
        } else if (view == this.f5799b) {
            aVar.mo36561b(this.f5802e);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }
}
