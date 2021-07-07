package com.qiyukf.nimlib.p180e;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: com.qiyukf.nimlib.e.a */
public class C2226a {
    /* renamed from: a */
    public static Message m4632a(int i, Object obj) {
        Message obtain = Message.obtain((Handler) null, i);
        if (obj != null) {
            Bundle bundle = new Bundle();
            if (obj instanceof Parcelable) {
                bundle.putParcelable("IPC", (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable("IPC", (Serializable) obj);
            }
            obtain.setData(bundle);
        }
        return obtain;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m4633a(Message message) {
        message.getData().setClassLoader(C2226a.class.getClassLoader());
        return (T) message.getData().getParcelable("IPC");
    }

    /* renamed from: b */
    public static Serializable m4634b(Message message) {
        message.getData().setClassLoader(C2226a.class.getClassLoader());
        return message.getData().getSerializable("IPC");
    }
}
