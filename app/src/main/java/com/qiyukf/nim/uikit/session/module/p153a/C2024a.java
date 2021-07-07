package com.qiyukf.nim.uikit.session.module.p153a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p139a.C1807b;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import com.qiyukf.basesdk.p138c.p143d.C1860a;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.common.fragment.TFragment;
import com.qiyukf.nim.uikit.common.p145a.AbstractC1882e;
import com.qiyukf.nim.uikit.common.p145a.AbstractC1883f;
import com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView;
import com.qiyukf.nim.uikit.common.p150ui.listview.C1933a;
import com.qiyukf.nim.uikit.common.p150ui.listview.MessageListView;
import com.qiyukf.nim.uikit.p144a.C1874a;
import com.qiyukf.nim.uikit.p144a.C1875b;
import com.qiyukf.nim.uikit.session.helper.C2005c;
import com.qiyukf.nim.uikit.session.helper.C2012d;
import com.qiyukf.nim.uikit.session.helper.C2020g;
import com.qiyukf.nim.uikit.session.module.C2023a;
import com.qiyukf.nim.uikit.session.module.p153a.C2044b;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.nim.uikit.session.viewholder.C2090c;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.AttachStatusEnum;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.AttachmentProgress;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.nimlib.sdk.msg.model.QueryDirectionEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2438c;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.AudioAttachment;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p212e.C2474i;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2552c;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2504c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2520k;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2559a;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2606b;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2623s;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p229h.C2670d;
import com.qiyukf.unicorn.p232k.C2706g;
import com.qiyukf.unicorn.p244ui.fragment.TranslateFragment;
import com.qiyukf.unicorn.p244ui.p248d.p249a.DialogInterface$OnDismissListenerC2876l;
import com.qiyukf.unicorn.widget.p251a.C3021g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.module.a.a */
public final class C2024a implements AbstractC1882e {

    /* renamed from: a */
    public volatile boolean f3996a;

    /* renamed from: b */
    public boolean f3997b;

    /* renamed from: c */
    public C2023a f3998c;

    /* renamed from: d */
    public View f3999d;

    /* renamed from: e */
    public MessageListView f4000e;

    /* renamed from: f */
    public List<IMMessage> f4001f;

    /* renamed from: g */
    public C2044b f4002g;

    /* renamed from: h */
    public ImageView f4003h;

    /* renamed from: i */
    public Handler f4004i;

    /* renamed from: j */
    public View f4005j;

    /* renamed from: k */
    public TextView f4006k;

    /* renamed from: l */
    public ImageView f4007l;

    /* renamed from: m */
    public ImageView f4008m;

    /* renamed from: n */
    public boolean f4009n;

    /* renamed from: o */
    public boolean f4010o;

    /* renamed from: p */
    public boolean f4011p;

    /* renamed from: q */
    public boolean f4012q;

    /* renamed from: r */
    public int f4013r;

    /* renamed from: s */
    public C2012d.AbstractC2013a f4014s;

    /* renamed from: t */
    public C2020g f4015t;

    /* renamed from: u */
    public Observer<CustomNotification> f4016u;

    /* renamed from: v */
    public C2005c.AbstractC2011a f4017v;

    /* renamed from: w */
    public Observer<IMMessage> f4018w;

    /* renamed from: x */
    public Observer<AttachmentProgress> f4019x;

    /* renamed from: y */
    public C1875b.AbstractC1876a f4020y;

    /* renamed from: z */
    public Runnable f4021z;

    /* renamed from: com.qiyukf.nim.uikit.session.module.a.a$a */
    public class C2037a implements AutoRefreshListView.AbstractC1928b {

        /* renamed from: b */
        public QueryDirectionEnum f4037b = null;

        /* renamed from: c */
        public IMMessage f4038c = null;

        /* renamed from: d */
        public boolean f4039d;

        /* renamed from: e */
        public boolean f4040e = true;

        /* renamed from: f */
        public RequestCallback<List<IMMessage>> f4041f = new RequestCallbackWrapper<List<IMMessage>>() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C2037a.C20381 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
            public final /* synthetic */ void onResult(int i, List<IMMessage> list, Throwable th) {
                List<IMMessage> list2 = list;
                if (list2 != null) {
                    C2037a aVar = C2037a.this;
                    C2438c h = C2452d.m5376h();
                    boolean z = false;
                    int a = h == null ? 0 : h.mo35653a(C2024a.this.f3998c.f3993c);
                    C2474i b = C2452d.m5375g().mo36345b(C2024a.this.f3998c.f3993c);
                    C2452d.m5375g();
                    if (C2670d.m6139j(C2024a.this.f3998c.f3993c) != null || C2452d.m5373e().isDefaultLoadMsg || a > 0 || C2024a.this.f3996a || ((b != null && b.f4888c) || ((C2452d.m5375g().mo36349c(C2024a.this.f3998c.f3993c) != 0 && C2437b.m5301r(C2024a.this.f3998c.f3993c) == C2452d.m5375g().mo36349c(C2024a.this.f3998c.f3993c)) || !C2024a.this.f3997b))) {
                        if (a > 0) {
                            C2437b.m5263c(C2024a.this.f3998c.f3993c, C2452d.m5375g().mo36349c(C2024a.this.f3998c.f3993c));
                        }
                        z = true;
                    }
                    C2037a aVar2 = C2037a.this;
                    if (z) {
                        if (!C2024a.this.f3996a && !C2024a.this.f3997b && !C2452d.m5373e().isDefaultLoadMsg && list2.size() != 0) {
                            C2606b bVar = new C2606b();
                            bVar.mo36154a("以上为历史消息");
                            IMMessage createCustomMessage = MessageBuilder.createCustomMessage(C2180b.m4477b(), SessionTypeEnum.Ysf, bVar);
                            createCustomMessage.setStatus(MsgStatusEnum.success);
                            list2.add(createCustomMessage);
                        }
                        C2024a.this.f3996a = true;
                        C2037a.m4071a(C2037a.this, list2);
                        return;
                    }
                    C2037a.m4071a(aVar2, new ArrayList());
                }
            }
        };

        public C2037a(boolean z) {
            this.f4039d = z;
            if (z) {
                m4073b();
            } else {
                m4072a(QueryDirectionEnum.QUERY_OLD, 0);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m4071a(C2037a aVar, List list) {
            int size = list.size();
            if (aVar.f4039d) {
                Collections.reverse(list);
            }
            if (aVar.f4040e && C2024a.this.f4001f.size() > 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    IMMessage iMMessage = (IMMessage) it.next();
                    Iterator it2 = C2024a.this.f4001f.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        IMMessage iMMessage2 = (IMMessage) it2.next();
                        if (iMMessage2.isTheSame(iMMessage)) {
                            C2024a.this.f4001f.remove(iMMessage2);
                            break;
                        }
                    }
                }
            }
            if (aVar.f4040e && aVar.f4038c != null) {
                C2024a.this.f4001f.add(aVar.f4038c);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            if (aVar.f4037b == QueryDirectionEnum.QUERY_NEW) {
                C2024a.this.f4001f.addAll(arrayList);
            } else {
                C2024a.this.f4001f.addAll(0, arrayList);
            }
            if (aVar.f4040e) {
                C1933a.m3769a(C2024a.this.f4000e);
            }
            C2024a.this.f4002g.mo34514a(C2024a.this.f4001f, true, aVar.f4040e);
            C2024a.this.mo34490d();
            C2024a.this.f4000e.mo34334c(size);
            aVar.f4040e = false;
        }

        /* renamed from: a */
        private void m4072a(QueryDirectionEnum queryDirectionEnum, int i) {
            C2024a.this.f3997b = i == 0;
            this.f4037b = queryDirectionEnum;
            C2024a.this.f4000e.mo34333b(queryDirectionEnum == QueryDirectionEnum.QUERY_NEW ? AutoRefreshListView.EnumC1927a.f3703b : AutoRefreshListView.EnumC1927a.f3702a);
            ((MsgService) NIMClient.getService(MsgService.class)).queryMessageListEx(m4074c(), queryDirectionEnum, 20, true).setCallback(this.f4041f);
        }

        /* renamed from: b */
        private void m4073b() {
            this.f4037b = QueryDirectionEnum.QUERY_OLD;
            ((MsgService) NIMClient.getService(MsgService.class)).pullMessageHistory(m4074c(), 20, true).setCallback(this.f4041f);
        }

        /* renamed from: c */
        private IMMessage m4074c() {
            if (C2024a.this.f4001f.size() == 0) {
                IMMessage iMMessage = this.f4038c;
                return iMMessage == null ? MessageBuilder.createEmptyMessage(C2024a.this.f3998c.f3993c, C2024a.this.f3998c.f3994d, 0) : iMMessage;
            }
            return (IMMessage) C2024a.this.f4001f.get(this.f4037b == QueryDirectionEnum.QUERY_NEW ? C2024a.this.f4001f.size() - 1 : 0);
        }

        @Override // com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.AbstractC1928b
        /* renamed from: a */
        public final void mo34341a() {
            if (!this.f4039d) {
                m4072a(QueryDirectionEnum.QUERY_NEW, 0);
            }
        }

        @Override // com.qiyukf.nim.uikit.common.p150ui.listview.AutoRefreshListView.AbstractC1928b
        /* renamed from: a */
        public final void mo34342a(int i) {
            if (this.f4039d) {
                m4073b();
            } else {
                m4072a(QueryDirectionEnum.QUERY_OLD, i);
            }
        }
    }

    /* renamed from: com.qiyukf.nim.uikit.session.module.a.a$b */
    public class C2039b implements C2044b.AbstractC2047b {
        public C2039b() {
        }

        public /* synthetic */ C2039b(C2024a aVar, byte b) {
            this();
        }

        /* renamed from: d */
        private void m4078d(final IMMessage iMMessage) {
            C3021g.m7059a((Context) C2024a.this.f3998c.f3991a, C2024a.this.f3998c.f3991a.getString(C2364R.string.ysf_re_download_message), true, (C3021g.AbstractC3022a) new C3021g.AbstractC3022a() {
                /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C2039b.C20412 */

                @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                /* renamed from: a */
                public final void mo34369a(int i) {
                    if (i == 0 && iMMessage.getAttachment() != null && (iMMessage.getAttachment() instanceof FileAttachment)) {
                        ((MsgService) NIMClient.getService(MsgService.class)).downloadAttachment(iMMessage, true);
                    }
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: e */
        private void m4079e(IMMessage iMMessage) {
            C2313a aVar = (C2313a) iMMessage;
            aVar.setTime(System.currentTimeMillis());
            aVar.mo35013b(C2024a.this.f3998c.f3993c);
            aVar.setStatus(MsgStatusEnum.sending);
            aVar.mo35008a(C2024a.this.f3998c.f3994d);
            if (aVar.getMsgType() == MsgTypeEnum.audio) {
                AudioAttachment audioAttachment = (AudioAttachment) aVar.getAttachment();
                audioAttachment.setAutoTransform(C2024a.this.f4011p);
                aVar.setAttachment(audioAttachment);
            }
            C2024a.this.f4002g.mo34512a(iMMessage);
            C2024a.this.f3998c.f3995e.sendMessage(aVar, true);
            C2024a.this.mo34483a(iMMessage);
        }

        @Override // com.qiyukf.nim.uikit.session.module.p153a.C2044b.AbstractC2047b
        /* renamed from: a */
        public final void mo34502a(C2012d.AbstractC2013a aVar) {
            C2024a.this.f4014s = aVar;
            C2005c.m3992a((TFragment) C2024a.this.f3998c.f3992b, 8, false, C2349d.m5123a(C1853d.m3518b() + ".jpg", EnumC2347c.TYPE_TEMP), false);
        }

        @Override // com.qiyukf.nim.uikit.session.module.p153a.C2044b.AbstractC2047b
        /* renamed from: a */
        public final void mo34503a(IMMessage iMMessage) {
            if (iMMessage.getDirect() != MsgDirectionEnum.Out) {
                m4078d(iMMessage);
            } else if (iMMessage.getStatus() == MsgStatusEnum.fail) {
                m4079e(iMMessage);
            } else if (iMMessage.getAttachment() instanceof FileAttachment) {
                FileAttachment fileAttachment = (FileAttachment) iMMessage.getAttachment();
                if (TextUtils.isEmpty(fileAttachment.getPath()) && TextUtils.isEmpty(fileAttachment.getThumbPath())) {
                    m4078d(iMMessage);
                }
            } else {
                m4079e(iMMessage);
            }
        }

        @Override // com.qiyukf.nim.uikit.session.module.p153a.C2044b.AbstractC2047b
        /* renamed from: a */
        public final void mo34504a(C2504c cVar, IMMessage iMMessage, final RequestCallback<String> requestCallback) {
            C2024a aVar = C2024a.this;
            aVar.f4015t = new C2020g(aVar.f3998c.f3992b);
            C2024a.this.f4015t.mo34476a(cVar, iMMessage.getSessionId(), new RequestCallback<String>() {
                /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C2039b.C20401 */

                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final void onException(Throwable th) {
                }

                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final void onFailed(int i) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final /* synthetic */ void onSuccess(String str) {
                    requestCallback.onSuccess(str);
                    C2024a.this.f4015t = null;
                }
            });
        }

        @Override // com.qiyukf.nim.uikit.session.module.p153a.C2044b.AbstractC2047b
        /* renamed from: a */
        public final boolean mo34505a() {
            return C2024a.this.f3998c.f3995e.isAllowSendMessage(true);
        }

        @Override // com.qiyukf.nim.uikit.session.module.p153a.C2044b.AbstractC2047b
        /* renamed from: b */
        public final void mo34506b() {
            C2024a.this.f3998c.f3995e.shouldCollapseInputPanel();
        }

        @Override // com.qiyukf.nim.uikit.session.module.p153a.C2044b.AbstractC2047b
        /* renamed from: b */
        public final boolean mo34507b(final IMMessage iMMessage) {
            if (!C2024a.this.f3998c.f3995e.isLongClickEnabled()) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            final String string = C2024a.this.f3998c.f3991a.getString(C2364R.string.ysf_re_send_has_blank);
            if (iMMessage.getStatus() == MsgStatusEnum.fail) {
                arrayList.add(string);
            }
            final String string2 = C2024a.this.f3998c.f3991a.getString(C2364R.string.ysf_copy_has_blank);
            if (iMMessage.getMsgType() == MsgTypeEnum.text || (iMMessage.getAttachment() instanceof AbstractC2552c)) {
                arrayList.add(string2);
            }
            final String string3 = C2024a.this.f3998c.f3991a.getString(C2437b.m5285j() ? C2364R.string.ysf_audio_play_by_speaker : C2364R.string.ysf_audio_play_by_earphone);
            final String string4 = C2024a.this.f3998c.f3991a.getString(C2364R.string.ysf_audio_translate);
            if (iMMessage.getMsgType() == MsgTypeEnum.audio) {
                arrayList.add(string3);
                arrayList.add(string4);
            }
            final String string5 = C2024a.this.f3998c.f3991a.getString(C2364R.string.ysf_delete_has_blank);
            final CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
            C3021g.m7057a(C2024a.this.f3998c.f3991a, (CharSequence) null, charSequenceArr, new C3021g.AbstractC3022a() {
                /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C2039b.C20423 */

                @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                /* renamed from: a */
                public final void mo34369a(int i) {
                    if (TextUtils.equals(charSequenceArr[i], string)) {
                        C2039b bVar = C2039b.this;
                        IMMessage iMMessage = iMMessage;
                        if (C2024a.this.m4026a((C2024a) iMMessage.getUuid()) >= 0) {
                            C3021g.m7059a((Context) C2024a.this.f3998c.f3991a, C2024a.this.f3998c.f3991a.getString(C2364R.string.ysf_re_send_message), true, (C3021g.AbstractC3022a) new C3021g.AbstractC3022a(iMMessage) {
                                /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C2039b.C20434 */

                                /* renamed from: a */
                                public final /* synthetic */ IMMessage f4056a;

                                {
                                    this.f4056a = r2;
                                }

                                @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                                /* renamed from: a */
                                public final void mo34369a(int i) {
                                    if (i == 0) {
                                        C2039b.this.m4079e(this.f4056a);
                                    }
                                }
                            });
                        }
                    } else if (TextUtils.equals(charSequenceArr[i], string2)) {
                        C2039b bVar2 = C2039b.this;
                        IMMessage iMMessage2 = iMMessage;
                        if (iMMessage2.getMsgType() == MsgTypeEnum.text) {
                            C1860a.m3527a(C2024a.this.f3998c.f3991a, iMMessage2.getContent());
                        } else if (iMMessage2.getAttachment() instanceof AbstractC2552c) {
                            C1860a.m3527a(C2024a.this.f3998c.f3991a, ((AbstractC2552c) iMMessage2.getAttachment()).mo35923a(C2024a.this.f3998c.f3991a));
                        }
                    } else if (TextUtils.equals(charSequenceArr[i], string3)) {
                        C2437b.m5248a(!C2437b.m5285j());
                        C2024a.this.mo34487b(C2437b.m5285j() ? C2364R.string.ysf_audio_current_mode_is_earphone : C2364R.string.ysf_audio_current_mode_is_speaker);
                    } else if (TextUtils.equals(charSequenceArr[i], string4)) {
                        C2039b bVar3 = C2039b.this;
                        IMMessage iMMessage3 = iMMessage;
                        if (iMMessage3.getDirect() != MsgDirectionEnum.In || iMMessage3.getAttachStatus() == AttachStatusEnum.transferred) {
                            if (iMMessage3.getStatus() != MsgStatusEnum.read && iMMessage3.getDirect() == MsgDirectionEnum.In) {
                                iMMessage3.setStatus(MsgStatusEnum.read);
                                ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(iMMessage3, true);
                            }
                            C2706g.m6258a(C2024a.this.f3998c.f3991a);
                            C2024a.this.f3998c.f3992b.getActivity().getSupportFragmentManager().m18663OooO00o().OooO0O0(16908290, TranslateFragment.newInstance(iMMessage3)).OooO00o((String) null).OooO0Oo();
                            return;
                        }
                        C1865f.m3555a(C2364R.string.ysf_no_permission_audio_error);
                    } else if (TextUtils.equals(charSequenceArr[i], string5)) {
                        C2039b bVar4 = C2039b.this;
                        IMMessage iMMessage4 = iMMessage;
                        ((MsgService) NIMClient.getService(MsgService.class)).deleteChattingHistory(iMMessage4);
                        C2024a.this.f4002g.mo34512a(iMMessage4);
                    }
                }
            });
            return true;
        }

        @Override // com.qiyukf.nim.uikit.session.module.p153a.C2044b.AbstractC2047b
        /* renamed from: c */
        public final void mo34508c() {
            if (C2024a.this.mo34493g()) {
                C2024a.this.mo34494h();
            }
        }

        @Override // com.qiyukf.nim.uikit.session.module.p153a.C2044b.AbstractC2047b
        /* renamed from: c */
        public final void mo34509c(IMMessage iMMessage) {
            C2024a.this.f3998c.f3995e.sendMessage(iMMessage, false);
        }
    }

    public C2024a(C2023a aVar, View view) {
        this(aVar, view, (byte) 0);
    }

    public C2024a(C2023a aVar, View view, byte b) {
        int i;
        MessageListView messageListView;
        int i2;
        this.f3997b = true;
        this.f3996a = false;
        this.f4011p = false;
        this.f4012q = false;
        this.f4013r = 0;
        this.f4016u = new Observer<CustomNotification>() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C20358 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.nimlib.sdk.Observer
            public final /* synthetic */ void onEvent(CustomNotification customNotification) {
                CustomNotification customNotification2 = customNotification;
                if (TextUtils.equals(C2024a.this.f3998c.f3993c, customNotification2.getSessionId()) && customNotification2.getSessionType() == SessionTypeEnum.Ysf) {
                    C2024a.this.mo34482a(customNotification2);
                }
            }
        };
        this.f4017v = new C2005c.AbstractC2011a() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C20369 */

            @Override // com.qiyukf.nim.uikit.session.helper.C2005c.AbstractC2011a
            /* renamed from: a */
            public final void mo34465a(File file) {
                MediaPlayer a = C2024a.this.m4028a((C2024a) file);
                C2024a.this.f3998c.f3995e.sendMessage(MessageBuilder.createVideoMessage(C2024a.this.f3998c.f3993c, SessionTypeEnum.Ysf, file, a == null ? 0 : (long) a.getDuration(), a == null ? 0 : a.getVideoWidth(), a == null ? 0 : a.getVideoHeight(), file.getName()), false);
            }
        };
        this.f4018w = new Observer<IMMessage>() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C202610 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.nimlib.sdk.Observer
            public final /* synthetic */ void onEvent(IMMessage iMMessage) {
                IMMessage iMMessage2 = iMMessage;
                if (C2024a.this.m4041c((C2024a) iMMessage2)) {
                    C2024a.m4036b(C2024a.this, iMMessage2);
                }
            }
        };
        this.f4019x = new Observer<AttachmentProgress>() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C202711 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.nimlib.sdk.Observer
            public final /* synthetic */ void onEvent(AttachmentProgress attachmentProgress) {
                C2024a.m4032a(C2024a.this, attachmentProgress);
            }
        };
        this.f4021z = new Runnable() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.RunnableC20314 */

            public final void run() {
                C2024a.this.f4005j.setVisibility(8);
            }
        };
        this.f3998c = aVar;
        this.f3999d = view;
        this.f4009n = false;
        this.f4010o = false;
        this.f4001f = new ArrayList();
        C2044b bVar = new C2044b(this.f3998c.f3991a, this.f4001f, this);
        this.f4002g = bVar;
        bVar.mo34511a((C2044b.AbstractC2047b) new C2039b(this, (byte) 0));
        this.f4003h = (ImageView) this.f3999d.findViewById(C2364R.C2367id.message_activity_background);
        MessageListView messageListView2 = (MessageListView) this.f3999d.findViewById(C2364R.C2367id.messageListView);
        this.f4000e = messageListView2;
        messageListView2.requestDisallowInterceptTouchEvent(true);
        if (!this.f4009n || this.f4010o) {
            messageListView = this.f4000e;
            i = AutoRefreshListView.EnumC1927a.f3702a;
        } else {
            messageListView = this.f4000e;
            i = AutoRefreshListView.EnumC1927a.f3704c;
        }
        messageListView.mo34331a(i);
        this.f4000e.setOverScrollMode(2);
        this.f4000e.mo34343a(this.f4002g);
        this.f4000e.mo34344a(new MessageListView.AbstractC1932b() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C20325 */

            @Override // com.qiyukf.nim.uikit.common.p150ui.listview.MessageListView.AbstractC1932b
            /* renamed from: a */
            public final void mo34349a() {
                C2024a.this.f3998c.f3995e.shouldCollapseInputPanel();
            }

            @Override // com.qiyukf.nim.uikit.common.p150ui.listview.MessageListView.AbstractC1932b
            /* renamed from: a */
            public final void mo34350a(int i, int i2) {
                if (i2 - i > C1862c.m3544d() + C1862c.m3545e() || C2024a.this.mo34493g()) {
                    C1933a.m3769a(C2024a.this.f4000e);
                }
            }

            @Override // com.qiyukf.nim.uikit.common.p150ui.listview.MessageListView.AbstractC1932b
            /* renamed from: b */
            public final void mo34351b() {
                C2706g.m6260a(C2024a.this.f3998c.f3992b);
            }
        });
        this.f4000e.mo34332a(new C2037a(this.f4010o));
        this.f4004i = new Handler();
        m4040c(true);
        this.f4005j = this.f3999d.findViewById(C2364R.C2367id.play_audio_mode_tips_bar);
        this.f4006k = (TextView) this.f3999d.findViewById(C2364R.C2367id.play_audio_mode_tips_label);
        this.f4007l = (ImageView) this.f3999d.findViewById(C2364R.C2367id.ysf_play_audio_mode_tip_close);
        this.f4008m = (ImageView) this.f3999d.findViewById(C2364R.C2367id.play_audio_mode_tips_indicator);
        this.f4007l.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.View$OnClickListenerC20251 */

            public final void onClick(View view) {
                if (C2024a.this.f4005j != null) {
                    C2024a.this.f4005j.setVisibility(8);
                }
            }
        });
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        if (uICustomization != null && (i2 = uICustomization.msgListViewDividerHeight) > 0) {
            this.f4000e.setDividerHeight(i2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private int m4026a(String str) {
        for (int i = 0; i < this.f4001f.size(); i++) {
            if (TextUtils.equals(this.f4001f.get(i).getUuid(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private MediaPlayer m4028a(File file) {
        try {
            return MediaPlayer.create(this.f3998c.f3991a, Uri.fromFile(file));
        } catch (Exception e) {
            C1709a.m3015b("getVideoMediaPlayer is error", "file:" + file, e);
            return null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4032a(C2024a aVar, AttachmentProgress attachmentProgress) {
        int a = aVar.m4026a(attachmentProgress.getUuid());
        if (a >= 0 && a < aVar.f4001f.size()) {
            float transferred = ((float) attachmentProgress.getTransferred()) / ((float) attachmentProgress.getTotal());
            aVar.f4002g.mo34513a(aVar.f4001f.get(a), transferred);
            aVar.m4039c(a);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m4036b(C2024a aVar, IMMessage iMMessage) {
        int a = aVar.m4026a(iMMessage.getUuid());
        if (a >= 0 && a < aVar.f4001f.size()) {
            IMMessage iMMessage2 = aVar.f4001f.get(a);
            iMMessage2.setStatus(iMMessage.getStatus());
            iMMessage2.setAttachStatus(iMMessage.getAttachStatus());
            iMMessage2.setAttachment(iMMessage.getAttachment());
            iMMessage2.setExt(iMMessage.getExt());
            aVar.m4039c(a);
            aVar.f4002g.notifyDataSetChanged();
            if (aVar.mo34493g() || aVar.f4013r != 0) {
                aVar.f4013r = 0;
                aVar.m4037b(false);
            }
        }
    }

    /* renamed from: b */
    private void m4037b(final boolean z) {
        this.f4004i.postDelayed(new Runnable() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.RunnableC20347 */

            public final void run() {
                if (z) {
                    MessageListView messageListView = C2024a.this.f4000e;
                    int count = C2024a.this.f4002g.getCount();
                    if (Build.VERSION.SDK_INT >= 11) {
                        messageListView.smoothScrollToPositionFromTop(count, 0, 100);
                    } else {
                        messageListView.setSelection(count);
                    }
                } else {
                    C1933a.m3769a(C2024a.this.f4000e);
                }
            }
        }, 10);
    }

    /* renamed from: c */
    private void m4039c(final int i) {
        this.f3998c.f3991a.runOnUiThread(new Runnable() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.RunnableC202812 */

            public final void run() {
                if (i >= 0) {
                    MessageListView messageListView = C2024a.this.f4000e;
                    int i = i;
                    int firstVisiblePosition = messageListView.getFirstVisiblePosition() - messageListView.getHeaderViewsCount();
                    Object tag = (i < firstVisiblePosition || i > messageListView.getLastVisiblePosition() - messageListView.getHeaderViewsCount()) ? null : messageListView.getChildAt(i - firstVisiblePosition).getTag();
                    if (tag instanceof AbstractC2083b) {
                        ((AbstractC2083b) tag).refreshCurrentItem();
                    }
                }
            }
        });
    }

    /* renamed from: c */
    private void m4040c(boolean z) {
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeCustomNotification(this.f4016u, z);
        MsgServiceObserve msgServiceObserve = (MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class);
        msgServiceObserve.observeMsgStatus(this.f4018w, z);
        msgServiceObserve.observeAttachmentProgress(this.f4019x, z);
        if (z) {
            if (this.f4020y == null) {
                this.f4020y = new C1875b.AbstractC1876a() {
                    /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C20303 */
                };
            }
            C1874a.m3574a(this.f4020y);
            return;
        }
        C1875b.AbstractC1876a aVar = this.f4020y;
        if (aVar != null) {
            C1874a.m3575b(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private boolean m4041c(IMMessage iMMessage) {
        return iMMessage.getSessionType() == this.f3998c.f3994d && iMMessage.getSessionId() != null && iMMessage.getSessionId().equals(this.f3998c.f3993c);
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1882e
    /* renamed from: a */
    public final int mo34138a() {
        return C2090c.m4242a();
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1882e
    /* renamed from: a */
    public final Class<? extends AbstractC1883f> mo34139a(int i) {
        return C2090c.m4243a(this.f4001f.get(i));
    }

    /* renamed from: a */
    public final void mo34480a(int i, int i2, Intent intent) {
        ArrayList<String> stringArrayListExtra;
        C2020g gVar;
        if (i2 == -1) {
            if (i == 1) {
                C2005c.m3990a(intent, this.f4017v);
            } else if (i == 2) {
                C2005c.AbstractC2011a aVar = this.f4017v;
                if (intent != null && (stringArrayListExtra = intent.getStringArrayListExtra("extra_result_selection_path")) != null && stringArrayListExtra.size() != 0 && !TextUtils.isEmpty(stringArrayListExtra.get(0))) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
                        if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() != 0 && parcelableArrayListExtra.get(0) != null) {
                            String a = C1852c.m3510a(C2180b.m4471a(), (Uri) parcelableArrayListExtra.get(0));
                            String a2 = C2349d.m5123a(a + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(stringArrayListExtra.get(0)), EnumC2347c.TYPE_VIDEO);
                            if (!C1806a.m3410a(C2180b.m4471a(), (Uri) parcelableArrayListExtra.get(0), a2)) {
                                C1865f.m3555a(C2364R.string.ysf_video_exception);
                            } else if (aVar != null) {
                                aVar.mo34465a(new File(a2));
                            }
                        }
                    } else {
                        String b = C1852c.m3513b(stringArrayListExtra.get(0));
                        String a3 = C2349d.m5123a(b + C9058ooOoOoOO.OooOO0 + C1807b.m3416a(stringArrayListExtra.get(0)), EnumC2347c.TYPE_VIDEO);
                        if (C1806a.m3408a(stringArrayListExtra.get(0), a3) == -1) {
                            C1865f.m3555a(C2364R.string.ysf_video_exception);
                        } else if (aVar != null) {
                            aVar.mo34465a(new File(a3));
                        }
                    }
                }
            } else if (i == 8) {
                C2012d.m3998a(this.f3998c.f3992b, intent, 9, this.f4014s);
            } else if (i == 9) {
                C2012d.m3997a(this.f3998c.f3992b, intent, i, 8, this.f4014s);
            } else if (i == 17) {
                C2020g gVar2 = this.f4015t;
                if (gVar2 != null) {
                    gVar2.mo34474a(17, intent);
                }
            } else if (i == 18 && (gVar = this.f4015t) != null) {
                gVar.mo34474a(18, intent);
            }
        }
    }

    /* renamed from: a */
    public final void mo34481a(C2023a aVar) {
        this.f3998c = aVar;
        this.f4001f.clear();
        this.f4000e.mo34332a(new C2037a(this.f4010o));
    }

    /* renamed from: a */
    public final void mo34482a(CustomNotification customNotification) {
        List<IMMessage> list;
        AbstractC2597e attachment = customNotification.getAttachment();
        if (attachment != null && attachment.getCmdId() == 2) {
            C2559a aVar = (C2559a) attachment;
            if (aVar.mo35986b() == 200 && (this.f3996a || C2437b.m5301r(this.f3998c.f3993c) != aVar.mo35995f())) {
                C2437b.m5263c(this.f3998c.f3993c, aVar.mo35995f());
            } else if (!this.f3996a && (list = this.f4001f) != null && list.size() == 0) {
                AutoRefreshListView.AbstractC1928b a = this.f4000e.mo34330a();
                this.f3996a = true;
                a.mo34342a(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo34483a(IMMessage iMMessage) {
        this.f4001f.add(iMMessage);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(iMMessage);
        this.f4002g.mo34514a(arrayList, false, true);
        this.f4002g.notifyDataSetChanged();
        if (this.f4012q) {
            this.f4013r++;
        }
        C1933a.m3769a(this.f4000e);
    }

    /* renamed from: a */
    public final void mo34484a(String str, int i) {
        if (C1870a.m3572b(str)) {
            C1870a.m3566a(str, C1862c.m3539a(), C1862c.m3542b(), new ImageLoaderListener() {
                /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.C20292 */

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadComplete(@NonNull Bitmap bitmap) {
                    C2024a.this.f4003h.setImageBitmap(bitmap);
                }

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadFailed(Throwable th) {
                }
            });
        } else if (i != 0) {
            this.f4003h.setBackgroundColor(i);
        }
    }

    /* renamed from: a */
    public final void mo34485a(List<IMMessage> list) {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        int i = 0;
        for (IMMessage iMMessage : list) {
            if (m4041c(iMMessage)) {
                this.f4001f.add(iMMessage);
                arrayList.add(iMMessage);
                i++;
                z = true;
            }
            if (iMMessage.getAttachment() instanceof C2520k) {
                DialogInterface$OnDismissListenerC2876l.m6706b(iMMessage.getUuid());
            }
        }
        if (z) {
            this.f4002g.notifyDataSetChanged();
        }
        this.f4002g.mo34514a(arrayList, false, true);
        if (i > 0) {
            m4037b(true);
        }
        if (!(C2452d.m5375g().mo36364n(this.f3998c.f3993c) == null || C2452d.m5375g().mo36355f(this.f3998c.f3993c) != 0 || this.f4012q)) {
            C2623s sVar = new C2623s();
            sVar.mo36221a(String.valueOf(C2452d.m5375g().mo36349c(this.f3998c.f3993c)));
            C2667c.m6115a((AbstractC2597e) sVar, list.get(0) != null ? list.get(0).getSessionId() : this.f3998c.f3993c, true);
        }
    }

    /* renamed from: a */
    public final void mo34486a(boolean z) {
        this.f4011p = z;
    }

    /* renamed from: b */
    public final void mo34487b(int i) {
        int i2 = C2437b.m5285j() ? C2364R.C2366drawable.ysf_play_audio_mode_earphone1 : C2364R.C2366drawable.ysf_play_audio_mode_speaker1;
        this.f4006k.setText(i);
        this.f4008m.setBackgroundResource(i2);
        this.f4005j.setVisibility(0);
        this.f4004i.removeCallbacks(this.f4021z);
        this.f4004i.postDelayed(this.f4021z, 3000);
    }

    /* renamed from: b */
    public final void mo34488b(IMMessage iMMessage) {
        this.f4002g.mo34512a(iMMessage);
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1882e
    /* renamed from: b */
    public final boolean mo34140b() {
        return false;
    }

    /* renamed from: c */
    public final void mo34489c() {
        this.f4004i.removeCallbacks(null);
        m4040c(false);
    }

    /* renamed from: d */
    public final void mo34490d() {
        this.f3998c.f3991a.runOnUiThread(new Runnable() {
            /* class com.qiyukf.nim.uikit.session.module.p153a.C2024a.RunnableC20336 */

            public final void run() {
                C2024a.this.f4002g.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: e */
    public final void mo34491e() {
        this.f4012q = true;
    }

    /* renamed from: f */
    public final void mo34492f() {
        this.f4012q = false;
    }

    /* renamed from: g */
    public final boolean mo34493g() {
        View childAt;
        MessageListView messageListView = this.f4000e;
        return (messageListView == null || messageListView.getAdapter() == null || messageListView.getLastVisiblePosition() < (messageListView.getAdapter().getCount() - 1) - messageListView.getFooterViewsCount() || (childAt = messageListView.getChildAt(messageListView.getChildCount() - 1)) == null || childAt.getBottom() - messageListView.getBottom() >= C1862c.m3540a(30.0f)) ? false : true;
    }

    /* renamed from: h */
    public final void mo34494h() {
        m4037b(false);
    }

    /* renamed from: i */
    public final C2044b mo34495i() {
        return this.f4002g;
    }
}
