package com.qiyukf.nim.uikit.session.emoji;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p212e.C2469e;

/* renamed from: com.qiyukf.nim.uikit.session.emoji.g */
public final class C1992g extends BaseAdapter {

    /* renamed from: a */
    public Context f3908a;

    /* renamed from: b */
    public C1994h f3909b;

    /* renamed from: c */
    public int f3910c;

    /* renamed from: com.qiyukf.nim.uikit.session.emoji.g$a */
    public class C1993a {

        /* renamed from: a */
        public ImageView f3911a;

        /* renamed from: b */
        public TextView f3912b;

        public C1993a() {
        }
    }

    public C1992g(Context context, C1994h hVar, int i) {
        this.f3908a = context;
        this.f3909b = hVar;
        this.f3910c = i;
    }

    public final int getCount() {
        return Math.min(this.f3909b.mo34433a().size() - this.f3910c, 8);
    }

    public final Object getItem(int i) {
        return this.f3909b.mo34433a().get(this.f3910c + i);
    }

    public final long getItemId(int i) {
        return (long) (this.f3910c + i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1993a aVar;
        C2469e.C2470a aVar2;
        if (view == null) {
            view = View.inflate(this.f3908a, C2364R.layout.ysf_sticker_picker_view, null);
            aVar = new C1993a();
            aVar.f3911a = (ImageView) view.findViewById(C2364R.C2367id.sticker_thumb_image);
            aVar.f3912b = (TextView) view.findViewById(C2364R.C2367id.sticker_desc_label);
            view.setTag(aVar);
        } else {
            aVar = (C1993a) view.getTag();
        }
        int i2 = this.f3910c + i;
        if (i2 >= this.f3909b.mo34433a().size() || (aVar2 = this.f3909b.mo34433a().get(i2)) == null) {
            return view;
        }
        C1870a.m3567a(aVar2.mo35709b(), aVar.f3911a);
        aVar.f3912b.setVisibility(8);
        return view;
    }
}
