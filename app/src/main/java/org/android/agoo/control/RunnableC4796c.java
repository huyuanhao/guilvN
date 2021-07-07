package org.android.agoo.control;

import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.Iterator;
import org.android.agoo.common.MsgDO;

/* renamed from: org.android.agoo.control.c */
public class RunnableC4796c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AgooFactory f13450a;

    public RunnableC4796c(AgooFactory agooFactory) {
        this.f13450a = agooFactory;
    }

    public void run() {
        ArrayList<MsgDO> b = this.f13450a.messageService.mo44543b();
        if (b != null && b.size() > 0) {
            ALog.m7599e(AgooFactory.TAG, "reportCacheMsg", FileAttachment.KEY_SIZE, Integer.valueOf(b.size()));
            Iterator<MsgDO> it = b.iterator();
            while (it.hasNext()) {
                MsgDO next = it.next();
                if (next != null) {
                    next.isFromCache = true;
                    this.f13450a.notifyManager.report(next, null);
                }
            }
        }
    }
}
