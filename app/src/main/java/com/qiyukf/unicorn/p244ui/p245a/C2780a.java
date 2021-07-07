package com.qiyukf.unicorn.p244ui.p245a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p118pd.sdk.C7383o0OOO0O;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.mediaselect.C2725a;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.p212e.AbstractC2473h;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2550c;
import com.qiyukf.unicorn.p232k.C2709i;
import com.qiyukf.unicorn.p244ui.activity.WatchPictureActivity;
import com.qiyukf.unicorn.p244ui.p250e.DialogC2959b;
import java.util.ArrayList;

/* renamed from: com.qiyukf.unicorn.ui.a.a */
public final class C2780a extends BaseAdapter {

    /* renamed from: a */
    public ArrayList<C2743d> f5815a;

    /* renamed from: b */
    public Activity f5816b;

    /* renamed from: c */
    public AbstractC2473h f5817c;

    /* renamed from: d */
    public DialogC2959b.AbstractC2968a f5818d;

    /* renamed from: com.qiyukf.unicorn.ui.a.a$a */
    public class C2786a {

        /* renamed from: a */
        public FrameLayout f5827a;

        /* renamed from: b */
        public ImageView f5828b;

        /* renamed from: c */
        public ImageView f5829c;

        /* renamed from: d */
        public ImageView f5830d;

        public C2786a(View view) {
            this.f5827a = (FrameLayout) view.findViewById(C2364R.C2367id.ysf_fl_Photo);
            this.f5828b = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_Photo);
            this.f5829c = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_delete);
            this.f5830d = (ImageView) view.findViewById(C2364R.C2367id.ysf_iv_leave_msg_video_tag);
            view.setTag(this);
        }
    }

    public C2780a(Activity activity, ArrayList<C2743d> arrayList, AbstractC2473h hVar, DialogC2959b.AbstractC2968a aVar) {
        this.f5816b = activity;
        this.f5815a = arrayList;
        this.f5817c = hVar;
        this.f5818d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C2743d getItem(int i) {
        return this.f5815a.get(i);
    }

    public final int getCount() {
        return this.f5815a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(final int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f5816b).inflate(C2364R.layout.ysf_item_loading_unloading_confirm, (ViewGroup) null);
            new C2786a(view);
        }
        final C2786a aVar = (C2786a) view.getTag();
        if (this.f5815a.size() > i) {
            C2743d a = getItem(i);
            if ("EMPTY_TYPE_TAG".equals(a.f5670b)) {
                aVar.f5828b.setImageResource(C2364R.C2366drawable.ysf_leave_msg_select_photo_default_back);
                aVar.f5829c.setVisibility(8);
                aVar.f5830d.setVisibility(0);
                aVar.f5830d.setImageResource(C2364R.C2366drawable.ysf_leave_msg_add_back);
                aVar.f5827a.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.p244ui.p245a.C2780a.View$OnClickListenerC27811 */

                    public final void onClick(View view) {
                        C2709i.m6263a(C2780a.this.f5816b).mo36469a(AbstractC2550c.f5124b).mo36468a(new C2709i.AbstractC2710a() {
                            /* class com.qiyukf.unicorn.p244ui.p245a.C2780a.View$OnClickListenerC27811.C27821 */

                            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                            public final void onDenied() {
                                C1865f.m3555a(C2364R.string.ysf_no_permission_photo);
                            }

                            @Override // com.qiyukf.unicorn.p232k.C2709i.AbstractC2710a
                            public final void onGranted() {
                                if (C2780a.this.f5818d != null) {
                                    C2780a.this.f5818d.mo34477a(6 - C2780a.this.f5815a.size());
                                } else {
                                    C2725a.m6292a(C2780a.this.f5816b, EnumC2731b.m6304a(), 6 - C2780a.this.f5815a.size(), 17);
                                }
                            }
                        }).mo36470a();
                    }
                });
            } else {
                if (EnumC2731b.m6308b(a.f5670b)) {
                    aVar.f5830d.setVisibility(0);
                    aVar.f5830d.setImageResource(C2364R.C2366drawable.ysf_video_play_icon);
                } else {
                    aVar.f5830d.setVisibility(8);
                }
                C1870a.m3569a(a.f5671c.toString(), new ImageLoaderListener() {
                    /* class com.qiyukf.unicorn.p244ui.p245a.C2780a.C27854 */

                    @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                    public final void onLoadComplete(@NonNull Bitmap bitmap) {
                        if (aVar.f5829c.getVisibility() != 8) {
                            try {
                                aVar.f5828b.setImageBitmap(bitmap);
                            } catch (Exception e) {
                                C1709a.m3014b(C7383o0OOO0O.OooOOO0, "AddPhotoAdapter setBigPic is error:" + e.toString());
                            }
                        }
                    }

                    @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                    public final void onLoadFailed(Throwable th) {
                        if (th != null) {
                            C1709a.m3011a("ImageEngineImpl loadImage is error", th.getMessage());
                        }
                    }
                });
                aVar.f5829c.setVisibility(0);
                aVar.f5829c.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.p244ui.p245a.C2780a.View$OnClickListenerC27832 */

                    public final void onClick(View view) {
                        C2780a.this.f5817c.mo35718a(i);
                    }
                });
                aVar.f5827a.setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.p244ui.p245a.C2780a.View$OnClickListenerC27843 */

                    public final void onClick(View view) {
                        ArrayList<C2743d> arrayList = new ArrayList<>();
                        arrayList.addAll(C2780a.this.f5815a);
                        if ("EMPTY_TYPE_TAG".equals(arrayList.get(arrayList.size() - 1).f5670b)) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                        if (C2780a.this.f5818d != null) {
                            C2780a.this.f5818d.mo34479a(arrayList, i);
                        } else {
                            WatchPictureActivity.start(C2780a.this.f5816b, arrayList, i, 18);
                        }
                    }
                });
            }
        }
        return view;
    }
}
