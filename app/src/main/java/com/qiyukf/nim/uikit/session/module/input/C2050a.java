package com.qiyukf.nim.uikit.session.module.input;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.api.customization.action.BaseAction;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.module.input.a */
public final class C2050a extends BaseAdapter {

    /* renamed from: a */
    public Context f4076a;

    /* renamed from: b */
    public List<BaseAction> f4077b;

    public C2050a(Context context, List<BaseAction> list) {
        this.f4076a = context;
        this.f4077b = list;
    }

    public final int getCount() {
        return this.f4077b.size();
    }

    public final Object getItem(int i) {
        return this.f4077b.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, final View view, ViewGroup viewGroup) {
        TextView textView;
        String str;
        if (view == null) {
            view = LayoutInflater.from(this.f4076a).inflate(C2364R.layout.ysf_actions_item_layout, (ViewGroup) null);
        }
        BaseAction baseAction = this.f4077b.get(i);
        if (baseAction.getIconResId() == 0) {
            C1870a.m3569a(baseAction.getImageUrl(), new ImageLoaderListener() {
                /* class com.qiyukf.nim.uikit.session.module.input.C2050a.C20511 */

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadComplete(@NonNull Bitmap bitmap) {
                    ((ImageView) view.findViewById(C2364R.C2367id.imageView)).setImageBitmap(bitmap);
                }

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadFailed(Throwable th) {
                }
            });
        } else {
            ((ImageView) view.findViewById(C2364R.C2367id.imageView)).setBackgroundResource(baseAction.getIconResId());
        }
        if (baseAction.getTitleId() == 0) {
            textView = (TextView) view.findViewById(C2364R.C2367id.textView);
            str = baseAction.getTitle();
        } else {
            textView = (TextView) view.findViewById(C2364R.C2367id.textView);
            str = this.f4076a.getString(baseAction.getTitleId());
        }
        textView.setText(str);
        ((TextView) view.findViewById(C2364R.C2367id.textView)).setTextColor(baseAction.getActionFontColor());
        return view;
    }
}
