package com.qiyukf.unicorn.mediaselect.internal.p242ui.fragment;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.nim.uikit.common.fragment.TFragment;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import com.qiyukf.unicorn.mediaselect.p233a.AbstractC2726a;
import com.qiyukf.unicorn.mediaselect.p237c.AbstractC2737b;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.fragment.PreviewItemFragment */
public class PreviewItemFragment extends TFragment {

    /* renamed from: a */
    public AbstractC2737b f5779a;

    public static PreviewItemFragment newInstance(C2743d dVar) {
        PreviewItemFragment previewItemFragment = new PreviewItemFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_item", dVar);
        previewItemFragment.setArguments(bundle);
        return previewItemFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AbstractC2737b) {
            this.f5779a = (AbstractC2737b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2364R.layout.ysf_fragment_preview_item, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f5779a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        final C2743d dVar = (C2743d) getArguments().getParcelable("args_item");
        if (dVar != null) {
            View findViewById = view.findViewById(C2364R.C2367id.ysf_video_play_button);
            if (EnumC2731b.m6308b(dVar.f5670b)) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.mediaselect.internal.p242ui.fragment.PreviewItemFragment.View$OnClickListenerC27721 */

                    public final void onClick(View view) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(dVar.f5671c, C9058ooOoOoOO.OooO0oO);
                        try {
                            PreviewItemFragment.this.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(PreviewItemFragment.this.getContext(), C2364R.string.ysf_error_no_video_activity, 0).show();
                        }
                    }
                });
            } else {
                findViewById.setVisibility(8);
            }
            ImageView imageView = (ImageView) view.findViewById(C2364R.C2367id.ysf_image_view);
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.mediaselect.internal.p242ui.fragment.PreviewItemFragment.View$OnClickListenerC27732 */

                public final void onClick(View view) {
                    PreviewItemFragment.this.f5779a.onClick();
                }
            });
            Point a = C2756c.m6385a(dVar.f5671c, getActivity());
            if (EnumC2731b.m6310c(dVar.f5670b)) {
                AbstractC2726a aVar = C2745e.m6339a().f5689p;
                getContext();
                int i = a.x;
                int i2 = a.y;
                aVar.mo36482a(imageView, dVar.f5671c);
                return;
            }
            AbstractC2726a aVar2 = C2745e.m6339a().f5689p;
            getContext();
            aVar2.mo36480a(a.x, a.y, imageView, dVar.f5671c);
        }
    }

    public void resetView() {
        getView();
    }
}
