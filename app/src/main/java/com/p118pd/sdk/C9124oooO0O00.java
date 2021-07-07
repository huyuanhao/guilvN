package com.p118pd.sdk;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.yongchun.library.C4695R;
import com.yongchun.library.model.LocalMedia;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.pd.sdk.oooO0O00  reason: case insensitive filesystem */
public class C9124oooO0O00 extends RecyclerView.AbstractC5065OooO0oO<RecyclerView.AbstractC5079OooOoo0> {
    public static final int OooO0OO = 1;
    public static final int OooO0Oo = 2;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f22591OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9126OooO0o0 f22592OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<LocalMedia> f22593OooO00o = new ArrayList();
    public int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List<LocalMedia> f22594OooO0O0 = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f22595OooO0O0 = true;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f22596OooO0OO = true;

    /* renamed from: com.pd.sdk.oooO0O00$OooO00o */
    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        public void onClick(View view) {
            if (C9124oooO0O00.this.f22592OooO00o != null) {
                C9124oooO0O00.this.f22592OooO00o.OooO00o();
            }
        }
    }

    /* renamed from: com.pd.sdk.oooO0O00$OooO0O0 */
    public class OooO0O0 implements View.OnClickListener {
        public final /* synthetic */ OooO0o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LocalMedia f22598OooO00o;

        public OooO0O0(OooO0o oooO0o, LocalMedia localMedia) {
            this.OooO00o = oooO0o;
            this.f22598OooO00o = localMedia;
        }

        public void onClick(View view) {
            C9124oooO0O00.this.OooO00o((C9124oooO0O00) this.OooO00o, (OooO0o) this.f22598OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.oooO0O00$OooO0OO */
    public class OooO0OO implements View.OnClickListener {
        public final /* synthetic */ OooO0o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LocalMedia f22600OooO00o;
        public final /* synthetic */ int o00oO0O;

        public OooO0OO(LocalMedia localMedia, int i, OooO0o oooO0o) {
            this.f22600OooO00o = localMedia;
            this.o00oO0O = i;
            this.OooO00o = oooO0o;
        }

        public void onClick(View view) {
            if ((C9124oooO0O00.this.OooO0O0 == 2 || C9124oooO0O00.this.f22596OooO0OO) && C9124oooO0O00.this.f22592OooO00o != null) {
                C9124oooO0O00.this.f22592OooO00o.OooO00o(this.f22600OooO00o, C9124oooO0O00.this.f22595OooO0O0 ? this.o00oO0O - 1 : this.o00oO0O);
            } else {
                C9124oooO0O00.this.OooO00o((C9124oooO0O00) this.OooO00o, (OooO0o) this.f22600OooO00o);
            }
        }
    }

    /* renamed from: com.pd.sdk.oooO0O00$OooO0Oo  reason: case insensitive filesystem */
    public static class C9125OooO0Oo extends RecyclerView.AbstractC5079OooOoo0 {
        public View OooO0O0;

        public C9125OooO0Oo(View view) {
            super(view);
            this.OooO0O0 = view;
        }
    }

    /* renamed from: com.pd.sdk.oooO0O00$OooO0o */
    public static class OooO0o extends RecyclerView.AbstractC5079OooOoo0 {
        public ImageView OooO00o;
        public View OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public ImageView f22601OooO0O0;

        public OooO0o(View view) {
            super(view);
            this.OooO0O0 = view;
            this.OooO00o = (ImageView) view.findViewById(C4695R.C4698id.picture);
            this.f22601OooO0O0 = (ImageView) view.findViewById(C4695R.C4698id.check);
        }
    }

    /* renamed from: com.pd.sdk.oooO0O00$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC9126OooO0o0 {
        void OooO00o();

        void OooO00o(LocalMedia localMedia, int i);

        void OooO00o(List<LocalMedia> list);
    }

    public C9124oooO0O00(Context context, int i, int i2, boolean z, boolean z2) {
        this.f22591OooO00o = context;
        this.OooO0O0 = i2;
        this.OooO00o = i;
        this.f22595OooO0O0 = z;
        this.f22596OooO0OO = z2;
    }

    public void OooO0O0(List<LocalMedia> list) {
        this.f22594OooO0O0 = list;
        m14758OooO00o();
        AbstractC9126OooO0o0 oooO0o0 = this.f22592OooO00o;
        if (oooO0o0 != null) {
            oooO0o0.OooO00o(this.f22594OooO0O0);
        }
    }

    public void OooO00o(List<LocalMedia> list) {
        this.f22593OooO00o = list;
        m14758OooO00o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO
    public RecyclerView.AbstractC5079OooOoo0 OooO0O0(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C9125OooO0Oo(LayoutInflater.from(viewGroup.getContext()).inflate(C4695R.layout.item_camera, viewGroup, false));
        }
        return new OooO0o(LayoutInflater.from(viewGroup.getContext()).inflate(C4695R.layout.item_picture, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO
    public int OooO00o(int i) {
        return (!this.f22595OooO0O0 || i != 0) ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO
    public int OooO00o() {
        return this.f22595OooO0O0 ? this.f22593OooO00o.size() + 1 : this.f22593OooO00o.size();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(OooO0o oooO0o, LocalMedia localMedia) {
        boolean isSelected = oooO0o.f22601OooO0O0.isSelected();
        int size = this.f22594OooO0O0.size();
        int i = this.OooO00o;
        if (size < i || isSelected) {
            if (isSelected) {
                Iterator<LocalMedia> it = this.f22594OooO0O0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    LocalMedia next = it.next();
                    if (next.getPath().equals(localMedia.getPath())) {
                        this.f22594OooO0O0.remove(next);
                        break;
                    }
                }
            } else {
                this.f22594OooO0O0.add(localMedia);
            }
            OooO00o(oooO0o, !isSelected);
            AbstractC9126OooO0o0 oooO0o0 = this.f22592OooO00o;
            if (oooO0o0 != null) {
                oooO0o0.OooO00o(this.f22594OooO0O0);
                return;
            }
            return;
        }
        Context context = this.f22591OooO00o;
        Toast.makeText(context, context.getString(C4695R.string.message_max_num, Integer.valueOf(i)), 1).show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO
    public void OooO0O0(RecyclerView.AbstractC5079OooOoo0 oooOoo0, int i) {
        if (OooO00o(i) == 1) {
            ((C9125OooO0Oo) oooOoo0).OooO0O0.setOnClickListener(new OooO00o());
            return;
        }
        OooO0o oooO0o = (OooO0o) oooOoo0;
        LocalMedia localMedia = this.f22593OooO00o.get(this.f22595OooO0O0 ? i - 1 : i);
        ComponentCallbacks2C7604o0o0Oo0o.m19230OooO00o(this.f22591OooO00o).load(new File(localMedia.getPath())).thumbnail(0.5f).into(oooO0o.OooO00o);
        if (this.OooO0O0 == 2) {
            oooO0o.f22601OooO0O0.setVisibility(8);
        }
        OooO00o(oooO0o, OooO00o(localMedia));
        if (this.f22596OooO0OO) {
            oooO0o.f22601OooO0O0.setOnClickListener(new OooO0O0(oooO0o, localMedia));
        }
        oooO0o.OooO0O0.setOnClickListener(new OooO0OO(localMedia, i, oooO0o));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<LocalMedia> m20877OooO00o() {
        return this.f22593OooO00o;
    }

    public boolean OooO00o(LocalMedia localMedia) {
        for (LocalMedia localMedia2 : this.f22594OooO0O0) {
            if (localMedia2.getPath().equals(localMedia.getPath())) {
                return true;
            }
        }
        return false;
    }

    public void OooO00o(OooO0o oooO0o, boolean z) {
        oooO0o.f22601OooO0O0.setSelected(z);
        if (z) {
            oooO0o.OooO00o.setColorFilter(this.f22591OooO00o.getResources().getColor(C4695R.C4696color.image_overlay2), PorterDuff.Mode.SRC_ATOP);
        } else {
            oooO0o.OooO00o.setColorFilter(this.f22591OooO00o.getResources().getColor(C4695R.C4696color.image_overlay), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public void OooO00o(AbstractC9126OooO0o0 oooO0o0) {
        this.f22592OooO00o = oooO0o0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO
    public List<LocalMedia> OooO0O0() {
        return this.f22594OooO0O0;
    }
}
