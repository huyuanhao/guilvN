package com.vivo.push;

import android.os.Handler;
import android.os.Message;
import com.vivo.push.util.C4146p;

/* renamed from: com.vivo.push.c */
public final class C4061c implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ ServiceConnectionC4030b f10950a;

    public C4061c(ServiceConnectionC4030b bVar) {
        this.f10950a = bVar;
    }

    public final boolean handleMessage(Message message) {
        if (message == null) {
            C4146p.m11204a("AidlManager", "handleMessage error : msg is null");
            return false;
        }
        int i = message.what;
        if (i == 1) {
            C4146p.m11204a("AidlManager", "In connect, bind core service time out");
            if (this.f10950a.f10902f.get() == 2) {
                this.f10950a.m10890a((ServiceConnectionC4030b) 1);
            }
        } else if (i != 2) {
            C4146p.m11211b("AidlManager", "unknow msg what [" + message.what + "]");
        } else {
            if (this.f10950a.f10902f.get() == 4) {
                this.f10950a.m10896e();
            }
            this.f10950a.m10890a((ServiceConnectionC4030b) 1);
        }
        return true;
    }
}
