package com.qiyukf.unicorn.mediaselect.internal.p242ui.fragment;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.qiyukf.nim.uikit.common.fragment.TFragment;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2739a;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.qiyukf.unicorn.mediaselect.internal.p240c.C2751b;
import com.qiyukf.unicorn.mediaselect.internal.p240c.C2753c;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2757a;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.fragment.MediaSelectionFragment */
public class MediaSelectionFragment extends TFragment implements C2751b.AbstractC2752a, C2757a.AbstractC2760b, C2757a.AbstractC2762d {

    /* renamed from: a */
    public final C2751b f5773a = new C2751b();

    /* renamed from: b */
    public GridView f5774b;

    /* renamed from: c */
    public C2757a f5775c;

    /* renamed from: d */
    public AbstractC2771a f5776d;

    /* renamed from: e */
    public C2757a.AbstractC2760b f5777e;

    /* renamed from: f */
    public C2757a.AbstractC2762d f5778f;

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.fragment.MediaSelectionFragment$a */
    public interface AbstractC2771a {
        C2753c provideSelectedItemCollection();
    }

    public static MediaSelectionFragment newInstance(C2739a aVar) {
        MediaSelectionFragment mediaSelectionFragment = new MediaSelectionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_album", aVar);
        mediaSelectionFragment.setArguments(bundle);
        return mediaSelectionFragment;
    }

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        C2739a aVar = (C2739a) getArguments().getParcelable("extra_album");
        getContext();
        C2757a aVar2 = new C2757a(this.f5776d.provideSelectedItemCollection(), this.f5774b);
        this.f5775c = aVar2;
        aVar2.mo36558a((C2757a.AbstractC2760b) this);
        this.f5775c.mo36559a((C2757a.AbstractC2762d) this);
        C2745e a = C2745e.m6339a();
        if (a.f5687n > 0) {
            i = Math.round(((float) getContext().getResources().getDisplayMetrics().widthPixels) / ((float) a.f5687n));
            if (i == 0) {
                i = 1;
            }
        } else {
            i = a.f5686m;
        }
        this.f5774b.setNumColumns(i);
        this.f5774b.setAdapter((ListAdapter) this.f5775c);
        this.f5773a.mo36532a(getActivity(), this);
        this.f5773a.mo36534a(aVar, a.f5684k);
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p240c.C2751b.AbstractC2752a
    public void onAlbumMediaLoad(Cursor cursor) {
        this.f5775c.mo36560b(cursor);
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p240c.C2751b.AbstractC2752a
    public void onAlbumMediaReset() {
        this.f5775c.mo36560b((Cursor) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AbstractC2771a) {
            this.f5776d = (AbstractC2771a) context;
            if (context instanceof C2757a.AbstractC2760b) {
                this.f5777e = (C2757a.AbstractC2760b) context;
            }
            if (context instanceof C2757a.AbstractC2762d) {
                this.f5778f = (C2757a.AbstractC2762d) context;
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must implement SelectionProvider.");
    }

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(C2364R.layout.ysf_fragment_media_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f5773a.mo36531a();
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2757a.AbstractC2762d
    public void onMediaClick(C2739a aVar, C2743d dVar) {
        C2757a.AbstractC2762d dVar2 = this.f5778f;
        if (dVar2 != null) {
            dVar2.onMediaClick((C2739a) getArguments().getParcelable("extra_album"), dVar);
        }
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2757a.AbstractC2760b
    public void onUpdate() {
        C2757a.AbstractC2760b bVar = this.f5777e;
        if (bVar != null) {
            bVar.onUpdate();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f5774b = (GridView) view.findViewById(C2364R.C2367id.ysf_iv_media_selection);
    }

    public void refreshMediaGrid() {
        this.f5775c.notifyDataSetChanged();
    }
}
