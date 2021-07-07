package com.p118pd.sdk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yongchun.library.C4695R;
import com.yongchun.library.model.LocalMedia;
import com.yongchun.library.model.LocalMediaFolder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oooO0  reason: case insensitive filesystem */
public class C9108oooO0 extends RecyclerView.AbstractC5065OooO0oO<OooO0OO> {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f22464OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f22465OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<LocalMediaFolder> f22466OooO00o = new ArrayList();

    /* renamed from: com.pd.sdk.oooO0$OooO00o */
    public class OooO00o implements View.OnClickListener {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LocalMediaFolder f22467OooO00o;
        public final /* synthetic */ int o00oO0O;

        public OooO00o(int i, LocalMediaFolder localMediaFolder) {
            this.o00oO0O = i;
            this.f22467OooO00o = localMediaFolder;
        }

        public void onClick(View view) {
            if (C9108oooO0.this.f22465OooO00o != null) {
                C9108oooO0.this.OooO00o = this.o00oO0O;
                C9108oooO0.this.m14758OooO00o();
                C9108oooO0.this.f22465OooO00o.OooO00o(this.f22467OooO00o.getName(), this.f22467OooO00o.getImages());
            }
        }
    }

    /* renamed from: com.pd.sdk.oooO0$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(String str, List<LocalMedia> list);
    }

    /* renamed from: com.pd.sdk.oooO0$OooO0OO */
    public class OooO0OO extends RecyclerView.AbstractC5079OooOoo0 {
        public ImageView OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public TextView f22468OooO00o;
        public View OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public ImageView f22470OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public TextView f22471OooO0O0;

        public OooO0OO(View view) {
            super(view);
            this.OooO0O0 = view;
            this.OooO00o = (ImageView) view.findViewById(C4695R.C4698id.first_image);
            this.f22468OooO00o = (TextView) view.findViewById(C4695R.C4698id.folder_name);
            this.f22471OooO0O0 = (TextView) view.findViewById(C4695R.C4698id.image_num);
            this.f22470OooO0O0 = (ImageView) view.findViewById(C4695R.C4698id.is_selected);
        }
    }

    public C9108oooO0(Context context) {
        this.f22464OooO00o = context;
    }

    public void OooO00o(List<LocalMediaFolder> list) {
        this.f22466OooO00o = list;
        m14758OooO00o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO
    /* renamed from: OooO00o */
    public OooO0OO OooO0O0(ViewGroup viewGroup, int i) {
        return new OooO0OO(LayoutInflater.from(this.f22464OooO00o).inflate(C4695R.layout.item_folder, viewGroup, false));
    }

    /* renamed from: OooO00o */
    public void OooO0O0(OooO0OO oooO0OO, int i) {
        LocalMediaFolder localMediaFolder = this.f22466OooO00o.get(i);
        ComponentCallbacks2C7604o0o0Oo0o.m19230OooO00o(this.f22464OooO00o).load(new File(localMediaFolder.getFirstImagePath())).into(oooO0OO.OooO00o);
        oooO0OO.f22468OooO00o.setText(localMediaFolder.getName());
        int i2 = 0;
        oooO0OO.f22471OooO0O0.setText(this.f22464OooO00o.getString(C4695R.string.num_postfix, Integer.valueOf(localMediaFolder.getImageNum())));
        ImageView imageView = oooO0OO.f22470OooO0O0;
        if (this.OooO00o != i) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        oooO0OO.OooO0O0.setOnClickListener(new OooO00o(i, localMediaFolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO
    public int OooO00o() {
        return this.f22466OooO00o.size();
    }

    public void OooO00o(OooO0O0 oooO0O0) {
        this.f22465OooO00o = oooO0O0;
    }
}
