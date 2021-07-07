package com.p118pd.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.core.util.Pools;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.pd.sdk.o0000o  reason: case insensitive filesystem */
public final class C6962o0000o {
    public static final String OooO00o = "AsyncLayoutInflater";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler.Callback f19159OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f19160OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LayoutInflater f19161OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6963OooO0Oo f19162OooO00o;

    /* renamed from: com.pd.sdk.o0000o$OooO00o */
    public class OooO00o implements Handler.Callback {
        public OooO00o() {
        }

        public boolean handleMessage(Message message) {
            OooO0OO oooO0OO = (OooO0OO) message.obj;
            if (oooO0OO.f19163OooO00o == null) {
                oooO0OO.f19163OooO00o = C6962o0000o.this.f19161OooO00o.inflate(oooO0OO.OooO00o, oooO0OO.f19164OooO00o, false);
            }
            oooO0OO.f19165OooO00o.OooO00o(oooO0OO.f19163OooO00o, oooO0OO.OooO00o, oooO0OO.f19164OooO00o);
            C6962o0000o.this.f19162OooO00o.OooO0O0(oooO0OO);
            return true;
        }
    }

    /* renamed from: com.pd.sdk.o0000o$OooO0O0 */
    public static class OooO0O0 extends LayoutInflater {
        public static final String[] OooO00o = {"android.widget.", "android.webkit.", "android.app."};

        public OooO0O0(Context context) {
            super(context);
        }

        public LayoutInflater cloneInContext(Context context) {
            return new OooO0O0(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            for (String str2 : OooO00o) {
                try {
                    View createView = createView(str, str2, attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: com.pd.sdk.o0000o$OooO0OO */
    public static class OooO0OO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public View f19163OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ViewGroup f19164OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC6964OooO0o0 f19165OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6962o0000o f19166OooO00o;
    }

    /* renamed from: com.pd.sdk.o0000o$OooO0Oo  reason: case insensitive filesystem */
    public static class C6963OooO0Oo extends Thread {
        public static final C6963OooO0Oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Pools.OooO0O0<OooO0OO> f19167OooO00o = new Pools.OooO0O0<>(10);

        /* renamed from: OooO00o  reason: collision with other field name */
        public ArrayBlockingQueue<OooO0OO> f19168OooO00o = new ArrayBlockingQueue<>(10);

        static {
            C6963OooO0Oo oooO0Oo = new C6963OooO0Oo();
            OooO00o = oooO0Oo;
            oooO0Oo.start();
        }

        public static C6963OooO0Oo OooO00o() {
            return OooO00o;
        }

        public void OooO0O0(OooO0OO oooO0OO) {
            oooO0OO.f19165OooO00o = null;
            oooO0OO.f19166OooO00o = null;
            oooO0OO.f19164OooO00o = null;
            oooO0OO.OooO00o = 0;
            oooO0OO.f19163OooO00o = null;
            this.f19167OooO00o.release(oooO0OO);
        }

        public void run() {
            while (true) {
                m18151OooO00o();
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18151OooO00o() {
            try {
                OooO0OO take = this.f19168OooO00o.take();
                try {
                    take.f19163OooO00o = take.f19166OooO00o.f19161OooO00o.inflate(take.OooO00o, take.f19164OooO00o, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(take.f19166OooO00o.f19160OooO00o, 0, take).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO0OO m18150OooO00o() {
            OooO0OO acquire = this.f19167OooO00o.acquire();
            return acquire == null ? new OooO0OO() : acquire;
        }

        public void OooO00o(OooO0OO oooO0OO) {
            try {
                this.f19168OooO00o.put(oooO0OO);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }
    }

    /* renamed from: com.pd.sdk.o0000o$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC6964OooO0o0 {
        void OooO00o(@NonNull View view, @LayoutRes int i, @Nullable ViewGroup viewGroup);
    }

    public C6962o0000o(@NonNull Context context) {
        this.f19161OooO00o = new OooO0O0(context);
        this.f19160OooO00o = new Handler(this.f19159OooO00o);
        this.f19162OooO00o = C6963OooO0Oo.OooO00o();
    }

    @UiThread
    public void OooO00o(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull AbstractC6964OooO0o0 oooO0o0) {
        if (oooO0o0 != null) {
            OooO0OO OooO00o2 = this.f19162OooO00o.m18150OooO00o();
            OooO00o2.f19166OooO00o = this;
            OooO00o2.OooO00o = i;
            OooO00o2.f19164OooO00o = viewGroup;
            OooO00o2.f19165OooO00o = oooO0o0;
            this.f19162OooO00o.OooO00o(OooO00o2);
            return;
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}
