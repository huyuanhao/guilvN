package com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2739a;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2742c;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.qiyukf.unicorn.mediaselect.internal.p240c.C2753c;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.MediaGrid;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.a.a */
public final class C2757a extends AbstractC2765c implements MediaGrid.AbstractC2775a {

    /* renamed from: a */
    public final C2753c f5723a;

    /* renamed from: b */
    public C2745e f5724b = C2745e.m6339a();

    /* renamed from: c */
    public AbstractC2760b f5725c;

    /* renamed from: d */
    public AbstractC2762d f5726d;

    /* renamed from: e */
    public GridView f5727e;

    /* renamed from: f */
    public int f5728f;

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.a.a$a */
    public class C2759a {

        /* renamed from: a */
        public TextView f5730a;

        /* renamed from: b */
        public View f5731b;

        public C2759a(View view) {
            this.f5731b = view;
            this.f5730a = (TextView) view.findViewById(C2364R.C2367id.ysf_hint);
        }
    }

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.a.a$b */
    public interface AbstractC2760b {
        void onUpdate();
    }

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.a.a$c */
    public class C2761c {

        /* renamed from: a */
        public MediaGrid f5733a;

        public C2761c(View view) {
            this.f5733a = (MediaGrid) view;
        }
    }

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.a.a$d */
    public interface AbstractC2762d {
        void onMediaClick(C2739a aVar, C2743d dVar);
    }

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.a.a$e */
    public interface AbstractC2763e {
        void capture();
    }

    public C2757a(C2753c cVar, GridView gridView) {
        this.f5723a = cVar;
        this.f5727e = gridView;
    }

    /* renamed from: a */
    private void m6390a() {
        notifyDataSetChanged();
        AbstractC2760b bVar = this.f5725c;
        if (bVar != null) {
            bVar.onUpdate();
        }
    }

    /* renamed from: a */
    private boolean m6391a(Context context, C2743d dVar) {
        C2742c d = this.f5723a.mo36546d(dVar);
        C2742c.m6336a(context, d);
        return d == null;
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.AbstractC2765c
    /* renamed from: a */
    public final int mo36555a(Cursor cursor) {
        return (C2743d.m6338a(cursor).f5669a > -1 ? 1 : (C2743d.m6338a(cursor).f5669a == -1 ? 0 : -1)) == 0 ? 1 : 2;
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.AbstractC2765c
    /* renamed from: a */
    public final View mo36556a(int i, View view, ViewGroup viewGroup, C2743d dVar) {
        C2761c cVar;
        C2759a aVar;
        int i2 = 3;
        if (getItemViewType(i) == 1) {
            if (view == null || !(view.getTag() instanceof C2759a)) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C2364R.layout.ysf_photo_capture_item, viewGroup, false);
                aVar = new C2759a(view);
                aVar.f5731b.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2757a.View$OnClickListenerC27581 */

                    public final void onClick(View view) {
                        if (view.getContext() instanceof AbstractC2763e) {
                            ((AbstractC2763e) view.getContext()).capture();
                        }
                    }
                });
                view.setTag(aVar);
            } else {
                aVar = (C2759a) view.getTag();
            }
            Drawable[] compoundDrawables = aVar.f5730a.getCompoundDrawables();
            aVar.f5730a.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        } else if (getItemViewType(i) == 2) {
            if (view == null || !(view.getTag() instanceof C2761c)) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C2364R.layout.ysf_media_grid_item, viewGroup, false);
                cVar = new C2761c(view);
                view.setTag(cVar);
            } else {
                cVar = (C2761c) view.getTag();
            }
            MediaGrid mediaGrid = cVar.f5733a;
            Context context = mediaGrid.getContext();
            if (this.f5728f == 0) {
                if (Build.VERSION.SDK_INT >= 11) {
                    i2 = this.f5727e.getNumColumns();
                }
                int dimensionPixelSize = (context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(C2364R.dimen.ysf_media_grid_spacing) * (i2 - 1))) / i2;
                this.f5728f = dimensionPixelSize;
                this.f5728f = (int) (((float) dimensionPixelSize) * this.f5724b.f5688o);
            }
            mediaGrid.mo36601a(new MediaGrid.C2776b(this.f5728f, this.f5724b.f5679f, cVar));
            cVar.f5733a.mo36599a(dVar);
            cVar.f5733a.mo36600a(this);
            MediaGrid mediaGrid2 = cVar.f5733a;
            if (this.f5724b.f5679f) {
                int e = this.f5723a.mo36548e(dVar);
                if (e > 0 || !this.f5723a.mo36549e()) {
                    mediaGrid2.mo36602a(true);
                } else {
                    mediaGrid2.mo36602a(false);
                    e = Integer.MIN_VALUE;
                }
                mediaGrid2.mo36598a(e);
            } else if (this.f5723a.mo36545c(dVar)) {
                mediaGrid2.mo36602a(true);
                mediaGrid2.mo36603b(true);
            } else {
                if (this.f5723a.mo36549e()) {
                    mediaGrid2.mo36602a(false);
                } else {
                    mediaGrid2.mo36602a(true);
                }
                mediaGrid2.mo36603b(false);
            }
        }
        return view;
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.MediaGrid.AbstractC2775a
    /* renamed from: a */
    public final void mo36557a(C2743d dVar) {
        AbstractC2762d dVar2 = this.f5726d;
        if (dVar2 != null) {
            dVar2.onMediaClick(null, dVar);
        }
    }

    /* renamed from: a */
    public final void mo36558a(AbstractC2760b bVar) {
        this.f5725c = bVar;
    }

    /* renamed from: a */
    public final void mo36559a(AbstractC2762d dVar) {
        this.f5726d = dVar;
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.AbstractC2765c
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo36560b(Cursor cursor) {
        super.mo36560b(cursor);
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.MediaGrid.AbstractC2775a
    /* renamed from: b */
    public final void mo36561b(C2743d dVar) {
        if (this.f5724b.f5679f) {
            if (this.f5723a.mo36548e(dVar) != Integer.MIN_VALUE) {
                this.f5723a.mo36543b(dVar);
                m6390a();
                return;
            } else if (m6391a(this.f5727e.getContext(), dVar)) {
                this.f5723a.mo36540a(dVar);
            } else {
                return;
            }
        } else if (this.f5723a.mo36545c(dVar)) {
            this.f5723a.mo36543b(dVar);
        } else if (m6391a(this.f5727e.getContext(), dVar)) {
            this.f5723a.mo36540a(dVar);
            m6390a();
            return;
        } else {
            return;
        }
        m6390a();
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.AbstractC2765c
    public final /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public final Object getItem(int i) {
        return null;
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.AbstractC2765c
    public final /* bridge */ /* synthetic */ long getItemId(int i) {
        return super.getItemId(i);
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.AbstractC2765c
    public final /* bridge */ /* synthetic */ int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.AbstractC2765c
    public final /* bridge */ /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
        return super.getView(i, view, viewGroup);
    }
}
