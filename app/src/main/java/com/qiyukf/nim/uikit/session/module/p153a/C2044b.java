package com.qiyukf.nim.uikit.session.module.p153a;

import android.content.Context;
import com.qiyukf.nim.uikit.common.p145a.AbstractC1882e;
import com.qiyukf.nim.uikit.common.p145a.C1881d;
import com.qiyukf.nim.uikit.session.helper.C2012d;
import com.qiyukf.nim.uikit.session.viewholder.C2090c;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2323f;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.customization.msg_list.UnicornMessageHandler;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2504c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.qiyukf.nim.uikit.session.module.a.b */
public final class C2044b extends C1881d<IMMessage> {

    /* renamed from: b */
    public AbstractC2047b f4058b;

    /* renamed from: c */
    public AbstractC2046a f4059c;

    /* renamed from: d */
    public Map<String, Float> f4060d = new HashMap();

    /* renamed from: e */
    public Set<String> f4061e = new HashSet();

    /* renamed from: f */
    public IMMessage f4062f;

    /* renamed from: com.qiyukf.nim.uikit.session.module.a.b$1 */
    public static /* synthetic */ class C20451 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4063a;

        static {
            int[] iArr = new int[MsgTypeEnum.values().length];
            f4063a = iArr;
            try {
                iArr[MsgTypeEnum.notification.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.qiyukf.nim.uikit.session.module.a.b$a */
    public interface AbstractC2046a {
        /* renamed from: a */
        void mo34519a();

        /* renamed from: b */
        void mo34520b();
    }

    /* renamed from: com.qiyukf.nim.uikit.session.module.a.b$b */
    public interface AbstractC2047b {
        /* renamed from: a */
        void mo34502a(C2012d.AbstractC2013a aVar);

        /* renamed from: a */
        void mo34503a(IMMessage iMMessage);

        /* renamed from: a */
        void mo34504a(C2504c cVar, IMMessage iMMessage, RequestCallback<String> requestCallback);

        /* renamed from: a */
        boolean mo34505a();

        /* renamed from: b */
        void mo34506b();

        /* renamed from: b */
        boolean mo34507b(IMMessage iMMessage);

        /* renamed from: c */
        void mo34508c();

        /* renamed from: c */
        void mo34509c(IMMessage iMMessage);
    }

    public C2044b(Context context, List<IMMessage> list, AbstractC1882e eVar) {
        super(context, list, eVar);
    }

    /* renamed from: a */
    private void m4091a(IMMessage iMMessage, boolean z) {
        if (z) {
            this.f4061e.add(iMMessage.getUuid());
        } else {
            this.f4061e.remove(iMMessage.getUuid());
        }
    }

    /* renamed from: d */
    public static boolean m4092d(IMMessage iMMessage) {
        return C20451.f4063a[iMMessage.getMsgType().ordinal()] == 1;
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.C1881d
    /* renamed from: a */
    public final void mo34142a(int i) {
        super.mo34142a(i);
        IMMessage iMMessage = (IMMessage) getItem(i);
        UnicornMessageHandler b = C2090c.m4248b(iMMessage);
        if (b != null) {
            boolean z = iMMessage.getStatus() == MsgStatusEnum.read;
            boolean onMessage = b.onMessage(this.f3460a, iMMessage, z);
            if (!z && onMessage) {
                iMMessage.setStatus(MsgStatusEnum.read);
                C2323f.m5033b((C2313a) iMMessage);
            }
        }
    }

    /* renamed from: a */
    public final void mo34510a(AbstractC2046a aVar) {
        this.f4059c = aVar;
    }

    /* renamed from: a */
    public final void mo34511a(AbstractC2047b bVar) {
        this.f4058b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        if (r1.isTheSame(r6) == false) goto L_0x008e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34512a(com.qiyukf.nimlib.sdk.msg.model.IMMessage r6) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.module.p153a.C2044b.mo34512a(com.qiyukf.nimlib.sdk.msg.model.IMMessage):void");
    }

    /* renamed from: a */
    public final void mo34513a(IMMessage iMMessage, float f) {
        this.f4060d.put(iMMessage.getUuid(), Float.valueOf(f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if ((r0.getTime() - r10.getTime()) < com.xiaomi.mipush.sdk.Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x000a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34514a(java.util.List<com.qiyukf.nimlib.sdk.msg.model.IMMessage> r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x0004
            r10 = 0
            goto L_0x0006
        L_0x0004:
            com.qiyukf.nimlib.sdk.msg.model.IMMessage r10 = r8.f4062f
        L_0x0006:
            java.util.Iterator r9 = r9.iterator()
        L_0x000a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r9.next()
            com.qiyukf.nimlib.sdk.msg.model.IMMessage r0 = (com.qiyukf.nimlib.sdk.msg.model.IMMessage) r0
            boolean r1 = m4092d(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0022
        L_0x001e:
            r8.m4091a(r0, r3)
            goto L_0x0035
        L_0x0022:
            if (r10 == 0) goto L_0x0037
            long r4 = r10.getTime()
            long r6 = r0.getTime()
            long r6 = r6 - r4
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0037
            goto L_0x001e
        L_0x0035:
            r2 = 0
            goto L_0x003a
        L_0x0037:
            r8.m4091a(r0, r2)
        L_0x003a:
            if (r2 == 0) goto L_0x000a
            r10 = r0
            goto L_0x000a
        L_0x003e:
            if (r11 == 0) goto L_0x0042
            r8.f4062f = r10
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nim.uikit.session.module.p153a.C2044b.mo34514a(java.util.List, boolean, boolean):void");
    }

    /* renamed from: b */
    public final float mo34515b(IMMessage iMMessage) {
        Float f = this.f4060d.get(iMMessage.getUuid());
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* renamed from: c */
    public final boolean mo34516c(IMMessage iMMessage) {
        return this.f4061e.contains(iMMessage.getUuid());
    }

    /* renamed from: d */
    public final AbstractC2046a mo34517d() {
        return this.f4059c;
    }

    /* renamed from: e */
    public final AbstractC2047b mo34518e() {
        return this.f4058b;
    }
}
