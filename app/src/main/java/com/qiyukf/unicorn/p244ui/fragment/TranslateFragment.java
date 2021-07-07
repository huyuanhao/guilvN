package com.qiyukf.unicorn.p244ui.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p118pd.sdk.C7009o000OoOo;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.common.fragment.TFragment;
import com.qiyukf.nimlib.sdk.AbortableFuture;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.attachment.AudioAttachment;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.ui.fragment.TranslateFragment */
public class TranslateFragment extends TFragment {

    /* renamed from: a */
    public Button f6540a;

    /* renamed from: b */
    public TextView f6541b;

    /* renamed from: c */
    public ProgressBar f6542c;

    /* renamed from: d */
    public AudioAttachment f6543d;

    /* renamed from: e */
    public AbortableFuture<String> f6544e;

    /* renamed from: f */
    public RequestCallbackWrapper<String> f6545f = new RequestCallbackWrapper<String>() {
        /* class com.qiyukf.unicorn.p244ui.fragment.TranslateFragment.C30063 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
        @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
        public final /* synthetic */ void onResult(int i, String str, Throwable th) {
            String str2 = str;
            TranslateFragment.m7012b(TranslateFragment.this);
            if (i == 200) {
                TranslateFragment.this.f6541b.setTextSize(22.0f);
                TranslateFragment.this.f6541b.setText(str2);
                return;
            }
            TranslateFragment.m7014d(TranslateFragment.this);
        }
    };

    static {
        C.i(16777275);
    }

    /* renamed from: b */
    public static /* synthetic */ void m7012b(TranslateFragment translateFragment) {
        translateFragment.f6542c.setVisibility(8);
        translateFragment.f6540a.setVisibility(8);
    }

    /* renamed from: d */
    public static /* synthetic */ void m7014d(TranslateFragment translateFragment) {
        Drawable OooO00o = C7009o000OoOo.m18256OooO00o(translateFragment.getContext(), C2364R.C2366drawable.ysf_ic_failed);
        int a = C1862c.m3540a(24.0f);
        OooO00o.setBounds(0, 0, a, a);
        translateFragment.f6541b.setCompoundDrawables(OooO00o, null, null, null);
        translateFragment.f6541b.setCompoundDrawablePadding(C1862c.m3540a(6.0f));
        translateFragment.f6541b.setText(translateFragment.getString(C2364R.string.ysf_audio_translate_failed));
        translateFragment.f6541b.setTextSize(15.0f);
    }

    public static native TranslateFragment newInstance(IMMessage iMMessage);

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            this.f6540a.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.p244ui.fragment.TranslateFragment.View$OnClickListenerC30041 */

                public final void onClick(View view) {
                    TranslateFragment.this.getActivity().onBackPressed();
                }
            });
            if (getView() != null) {
                getView().setOnClickListener(new View.OnClickListener() {
                    /* class com.qiyukf.unicorn.p244ui.fragment.TranslateFragment.View$OnClickListenerC30052 */

                    public final void onClick(View view) {
                        if (TranslateFragment.this.f6540a.getVisibility() == 8) {
                            TranslateFragment.this.getActivity().onBackPressed();
                        }
                    }
                });
            }
        }
        AudioAttachment audioAttachment = this.f6543d;
        AbortableFuture<String> transVoiceToText = ((MsgService) NIMClient.getService(MsgService.class)).transVoiceToText(audioAttachment.getUrl(), audioAttachment.getPath(), audioAttachment.getDuration());
        this.f6544e = transVoiceToText;
        transVoiceToText.setCallback(this.f6545f);
    }

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public native void onDetach();
}
