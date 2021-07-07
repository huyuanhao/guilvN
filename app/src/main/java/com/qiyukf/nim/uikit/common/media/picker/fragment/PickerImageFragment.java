package com.qiyukf.nim.uikit.common.media.picker.fragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.qiyukf.nim.uikit.common.fragment.TFragment;
import com.qiyukf.nim.uikit.common.media.picker.model.PhotoInfo;
import com.qiyukf.nim.uikit.common.media.picker.p148a.C1897b;
import com.qiyukf.nim.uikit.common.media.picker.p149b.C1909b;
import com.qiyukf.unicorn.C2364R;
import java.util.ArrayList;
import java.util.List;

public class PickerImageFragment extends TFragment implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public GridView f3590a;

    /* renamed from: b */
    public AbstractC1913a f3591b;

    /* renamed from: c */
    public List<PhotoInfo> f3592c;

    /* renamed from: d */
    public C1897b f3593d;

    /* renamed from: e */
    public boolean f3594e;

    /* renamed from: f */
    public int f3595f;

    /* renamed from: g */
    public int f3596g = 1;

    /* renamed from: com.qiyukf.nim.uikit.common.media.picker.fragment.PickerImageFragment$a */
    public interface AbstractC1913a {
        void onPhotoSelectClick(PhotoInfo photoInfo);

        void onPhotoSingleClick(List<PhotoInfo> list, int i);
    }

    public PickerImageFragment() {
        setContainerId(C2364R.C2367id.picker_photos_fragment);
    }

    /* renamed from: a */
    private void m3675a() {
        GridView gridView = this.f3590a;
        if (gridView != null) {
            gridView.setNumColumns(this.f3596g == 2 ? 6 : 4);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        ArrayList arrayList = new ArrayList();
        this.f3592c = arrayList;
        arrayList.addAll(C1909b.m3663a(getContext()));
        this.f3594e = arguments.getBoolean("multi_select_mode");
        this.f3595f = arguments.getInt("multi_select_size_limit", 9);
        this.f3596g = arguments.getInt("extra_screen_orientation");
        if (getView() != null) {
            this.f3590a = (GridView) getView().findViewById(C2364R.C2367id.picker_images_gridview);
            m3675a();
            C1897b bVar = new C1897b(getActivity(), this.f3592c, this.f3590a, this.f3594e, 0, this.f3595f, this.f3596g);
            this.f3593d = bVar;
            this.f3590a.setAdapter((ListAdapter) bVar);
            this.f3590a.setOnItemClickListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.f3591b == null) {
            this.f3591b = (AbstractC1913a) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3596g = configuration.orientation;
        m3675a();
        this.f3593d.mo34218a(configuration);
        C1897b bVar = this.f3593d;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2364R.layout.ysf_picker_images_fragment, viewGroup, false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3591b.onPhotoSingleClick(this.f3592c, i);
    }

    public void resetFragment(List<PhotoInfo> list, int i) {
        if (this.f3590a == null) {
            if (getView() != null) {
                this.f3590a = (GridView) getView().findViewById(C2364R.C2367id.picker_images_gridview);
            } else {
                return;
            }
        }
        this.f3590a.setAdapter((ListAdapter) null);
        List<PhotoInfo> list2 = this.f3592c;
        if (list2 == null) {
            this.f3592c = new ArrayList();
        } else {
            list2.clear();
        }
        if (list != null) {
            this.f3592c.addAll(list);
        }
        m3675a();
        C1897b bVar = new C1897b(getActivity(), this.f3592c, this.f3590a, this.f3594e, i, this.f3595f, this.f3596g);
        this.f3593d = bVar;
        this.f3590a.setAdapter((ListAdapter) bVar);
    }

    public void updateSelectPhotos(List<PhotoInfo> list) {
        if (list != null) {
            for (PhotoInfo photoInfo : this.f3592c) {
                photoInfo.setChoose(list.contains(photoInfo));
            }
            C1897b bVar = this.f3593d;
            if (bVar != null) {
                bVar.notifyDataSetChanged();
            }
        }
    }

    public void updateSelectedForAdapter(int i) {
        C1897b bVar = this.f3593d;
        if (bVar != null) {
            bVar.mo34217a(i);
        }
    }
}
