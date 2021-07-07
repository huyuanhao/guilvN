package com.qiyukf.unicorn.fileselect.p226ui.p227a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.qiyukf.nimlib.p198j.p199a.C2340c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p232k.C2699e;
import java.io.File;
import java.io.FileFilter;
import java.text.DecimalFormat;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.fileselect.ui.a.a */
public final class C2638a extends BaseAdapter {

    /* renamed from: a */
    public List<File> f5429a;

    /* renamed from: b */
    public Context f5430b;

    /* renamed from: c */
    public AbstractC2642a f5431c;

    /* renamed from: d */
    public FileFilter f5432d;

    /* renamed from: e */
    public boolean[] f5433e;

    /* renamed from: f */
    public boolean f5434f;

    /* renamed from: g */
    public boolean f5435g;

    /* renamed from: h */
    public long f5436h;

    /* renamed from: com.qiyukf.unicorn.fileselect.ui.a.a$a */
    public interface AbstractC2642a {
        /* renamed from: a */
        void mo36283a(int i);
    }

    /* renamed from: com.qiyukf.unicorn.fileselect.ui.a.a$b */
    public class C2643b {

        /* renamed from: b */
        public RelativeLayout f5446b;

        /* renamed from: c */
        public CheckBox f5447c;

        /* renamed from: d */
        public TextView f5448d;

        /* renamed from: e */
        public TextView f5449e;

        /* renamed from: f */
        public ImageView f5450f;

        public C2643b(View view) {
            this.f5450f = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_type);
            this.f5446b = (RelativeLayout) view.findViewById(C2364R.C2367id.ysf_layout_item_root);
            this.f5447c = (CheckBox) view.findViewById(C2364R.C2367id.ysf_cb_choose);
            this.f5448d = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_name);
            this.f5449e = (TextView) view.findViewById(C2364R.C2367id.ysf_tv_detail);
        }
    }

    public C2638a(List<File> list, Context context, FileFilter fileFilter, boolean z, boolean z2, long j) {
        this.f5429a = list;
        this.f5430b = context;
        this.f5432d = fileFilter;
        this.f5434f = z;
        this.f5435g = z2;
        this.f5436h = j;
        this.f5433e = new boolean[list.size()];
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public File getItem(int i) {
        return this.f5429a.get(i);
    }

    /* renamed from: a */
    public final void mo36273a() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.f5433e;
            if (i < zArr.length) {
                zArr[i] = false;
                i++;
            } else {
                notifyDataSetChanged();
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo36274a(AbstractC2642a aVar) {
        this.f5431c = aVar;
    }

    /* renamed from: a */
    public final void mo36275a(List<File> list) {
        this.f5429a = list;
        this.f5433e = new boolean[list.size()];
    }

    public final int getCount() {
        return this.f5429a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(final int i, View view, ViewGroup viewGroup) {
        View view2;
        View view3;
        int i2;
        C2638a aVar;
        String str;
        if (view == null) {
            view2 = View.inflate(this.f5430b, C2364R.layout.ysf_file_list_item, null);
            view2.setTag(new C2643b(view2));
        } else {
            view2 = view;
        }
        final C2643b bVar = (C2643b) view2.getTag();
        final File a = getItem(i);
        if (a.isFile()) {
            bVar.f5448d.setText(a.getName());
            bVar.f5450f.setImageResource(C2340c.m5083a(a.getName(), false));
            TextView textView = bVar.f5449e;
            Context context = this.f5430b;
            int i3 = C2364R.string.ysf_file_FileSize;
            Object[] objArr = new Object[1];
            long length = a.length();
            if (length <= 0) {
                str = "0";
                view3 = view2;
            } else {
                double d = (double) length;
                view3 = view2;
                int log10 = (int) (Math.log10(d) / Math.log10(1024.0d));
                StringBuilder sb = new StringBuilder();
                DecimalFormat decimalFormat = new DecimalFormat("#");
                double pow = Math.pow(1024.0d, (double) log10);
                Double.isNaN(d);
                sb.append(decimalFormat.format(d / pow));
                sb.append(" ");
                sb.append(new String[]{"B", "KB", "MB", "GB", "TB"}[log10]);
                str = sb.toString();
            }
            objArr[0] = str;
            textView.setText(context.getString(i3, objArr));
            bVar.f5447c.setVisibility(0);
            i2 = 8;
            aVar = this;
        } else {
            view3 = view2;
            bVar.f5450f.setImageResource(C2364R.C2366drawable.ysf_file_folder_style_new);
            bVar.f5448d.setText(a.getName());
            aVar = this;
            List<File> a2 = C2699e.m6244a(a.getAbsolutePath(), aVar.f5432d, aVar.f5435g, aVar.f5436h);
            bVar.f5449e.setText(aVar.f5430b.getString(C2364R.string.ysf_file_LItem, String.valueOf(a2.size())));
            i2 = 8;
            bVar.f5447c.setVisibility(8);
        }
        if (!aVar.f5434f) {
            bVar.f5447c.setVisibility(i2);
        }
        bVar.f5446b.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.fileselect.p226ui.p227a.C2638a.View$OnClickListenerC26391 */

            public final void onClick(View view) {
                if (a.isFile()) {
                    bVar.f5447c.setChecked(!bVar.f5447c.isChecked());
                }
                C2638a.this.f5431c.mo36283a(i);
            }
        });
        bVar.f5447c.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.fileselect.p226ui.p227a.C2638a.View$OnClickListenerC26402 */

            public final void onClick(View view) {
                C2638a.this.f5431c.mo36283a(i);
            }
        });
        bVar.f5447c.setOnCheckedChangeListener(null);
        bVar.f5447c.setChecked(aVar.f5433e[i]);
        bVar.f5447c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.qiyukf.unicorn.fileselect.p226ui.p227a.C2638a.C26413 */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C2638a.this.f5433e[i] = z;
            }
        });
        return view3;
    }
}
