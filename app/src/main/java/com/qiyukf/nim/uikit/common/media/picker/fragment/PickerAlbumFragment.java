package com.qiyukf.nim.uikit.common.media.picker.fragment;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.qiyukf.nim.uikit.common.fragment.TFragment;
import com.qiyukf.nim.uikit.common.media.picker.model.C1914a;
import com.qiyukf.nim.uikit.common.media.picker.p148a.C1893a;
import com.qiyukf.unicorn.C2364R;
import java.util.ArrayList;
import java.util.List;
import s.h.e.l.l.C;

public class PickerAlbumFragment extends TFragment implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public AbstractC1912b f3583a;

    /* renamed from: b */
    public LinearLayout f3584b;

    /* renamed from: c */
    public TextView f3585c;

    /* renamed from: d */
    public TextView f3586d;

    /* renamed from: e */
    public ListView f3587e;

    /* renamed from: f */
    public List<C1914a> f3588f = new ArrayList();

    /* renamed from: com.qiyukf.nim.uikit.common.media.picker.fragment.PickerAlbumFragment$a */
    public class AsyncTaskC1911a extends AsyncTask<Void, Object, Object> {
        public AsyncTaskC1911a() {
        }

        public /* synthetic */ AsyncTaskC1911a(PickerAlbumFragment pickerAlbumFragment, byte b) {
            this();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        @Override // android.os.AsyncTask
        public final /* synthetic */ Object doInBackground(Void[] voidArr) {
            PickerAlbumFragment.m3668a(PickerAlbumFragment.this);
            PickerAlbumFragment.m3669b(PickerAlbumFragment.this);
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            if (PickerAlbumFragment.this.getActivity() != null && PickerAlbumFragment.this.f3588f != null) {
                PickerAlbumFragment.this.f3587e.setAdapter((ListAdapter) new C1893a(PickerAlbumFragment.this.getActivity(), PickerAlbumFragment.this.f3588f));
                if (PickerAlbumFragment.this.f3588f.size() > 0) {
                    PickerAlbumFragment.this.f3584b.setVisibility(8);
                    return;
                }
                PickerAlbumFragment.this.f3584b.setVisibility(0);
                PickerAlbumFragment.this.f3585c.setVisibility(8);
                PickerAlbumFragment.this.f3586d.setVisibility(0);
            }
        }
    }

    /* renamed from: com.qiyukf.nim.uikit.common.media.picker.fragment.PickerAlbumFragment$b */
    public interface AbstractC1912b {
        void onAlbumItemClick(C1914a aVar);
    }

    static {
        C.i(16777268);
    }

    public PickerAlbumFragment() {
        setContainerId(C2364R.C2367id.picker_album_fragment);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0049 A[SYNTHETIC, Splitter:B:9:0x0049] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m3668a(com.qiyukf.nim.uikit.common.media.picker.fragment.PickerAlbumFragment r6) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.common.media.picker.fragment.PickerAlbumFragment.m3668a(com.qiyukf.nim.uikit.common.media.picker.fragment.PickerAlbumFragment):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x013d A[LOOP:0: B:10:0x002d->B:30:0x013d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0141 A[EDGE_INSN: B:53:0x0141->B:31:0x0141 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m3669b(com.qiyukf.nim.uikit.common.media.picker.fragment.PickerAlbumFragment r17) {
        /*
        // Method dump skipped, instructions count: 368
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.common.media.picker.fragment.PickerAlbumFragment.m3669b(com.qiyukf.nim.uikit.common.media.picker.fragment.PickerAlbumFragment):void");
    }

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public native void onActivityCreated(Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public native void onAttach(Activity activity);

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3583a.onAlbumItemClick(this.f3588f.get(i));
    }
}
