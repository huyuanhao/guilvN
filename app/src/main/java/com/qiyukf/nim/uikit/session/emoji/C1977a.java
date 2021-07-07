package com.qiyukf.nim.uikit.session.emoji;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p212e.C2469e;

/* renamed from: com.qiyukf.nim.uikit.session.emoji.a */
public final class C1977a extends BaseAdapter {

    /* renamed from: a */
    public Context f3872a;

    /* renamed from: b */
    public int f3873b;

    /* renamed from: c */
    public C1994h f3874c = null;

    /* renamed from: d */
    public boolean f3875d = false;

    public C1977a(Context context, int i) {
        this.f3872a = context;
        this.f3873b = i;
    }

    public C1977a(Context context, int i, C1994h hVar) {
        this.f3872a = context;
        this.f3873b = i;
        this.f3874c = hVar;
        this.f3875d = true;
    }

    public final int getCount() {
        return Math.min(((!this.f3875d ? C1978b.m3911a() : this.f3874c.mo34433a().size()) - this.f3873b) + 1, 28);
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return (long) (this.f3873b + i);
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1994h hVar;
        C2469e.C2470a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f3872a).inflate(C2364R.layout.ysf_emoji_item, (ViewGroup) null);
        }
        ImageView imageView = (ImageView) view.findViewById(C2364R.C2367id.imgEmoji);
        if (!this.f3875d) {
            int a = C1978b.m3911a();
            int i2 = this.f3873b + i;
            if (!(i == 27 || i2 == a)) {
                if (i2 < a) {
                    imageView.setBackgroundDrawable(C1978b.m3912a(this.f3872a, i2));
                }
                return view;
            }
        } else {
            int i3 = this.f3873b + i;
            int size = this.f3874c.mo34433a().size();
            if (i3 > this.f3874c.mo34433a().size() || (hVar = this.f3874c) == null) {
                return view;
            }
            if (!(i == 27 || i3 == size)) {
                if (i3 >= size || (aVar = hVar.mo34433a().get(i3)) == null) {
                    return view;
                }
                C1870a.m3567a(aVar.mo35709b(), imageView);
                return view;
            }
        }
        imageView.setBackgroundResource(C2364R.C2366drawable.ysf_emoji_del);
        return view;
    }
}
