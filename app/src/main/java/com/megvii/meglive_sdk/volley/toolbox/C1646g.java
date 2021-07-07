package com.megvii.meglive_sdk.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import com.megvii.meglive_sdk.volley.AbstractC1628m;
import com.megvii.meglive_sdk.volley.C1630n;
import com.megvii.meglive_sdk.volley.C1631o;
import com.megvii.meglive_sdk.volley.C1638t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.megvii.meglive_sdk.volley.toolbox.g */
public final class C1646g {

    /* renamed from: a */
    public final C1630n f2936a;

    /* renamed from: b */
    public final AbstractC1647b f2937b;

    /* renamed from: c */
    public final HashMap<String, C5146OooO0Oo> f2938c;

    /* renamed from: d */
    public final HashMap<String, C5146OooO0Oo> f2939d;

    /* renamed from: e */
    public Runnable f2940e;

    /* renamed from: f */
    public int f2941f;

    /* renamed from: g */
    public final Handler f2942g;

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.g$OooO00o */
    public class OooO00o implements C1631o.AbstractC1633b<Bitmap> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f15113OooO00o;

        public OooO00o(String str) {
            this.f15113OooO00o = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.megvii.meglive_sdk.volley.C1631o.AbstractC1633b
        /* renamed from: a */
        public final /* synthetic */ void mo16992a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            C1646g gVar = C1646g.this;
            String str = this.f15113OooO00o;
            C5146OooO0Oo remove = gVar.f2938c.remove(str);
            if (remove != null) {
                remove.OooO00o = bitmap2;
                gVar.mo17376a(str, remove);
            }
        }
    }

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.g$OooO0O0 */
    public class OooO0O0 implements C1631o.AbstractC1632a {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f15114OooO00o;

        public OooO0O0(String str) {
            this.f15114OooO00o = str;
        }

        @Override // com.megvii.meglive_sdk.volley.C1631o.AbstractC1632a
        /* renamed from: a */
        public final void mo16993a(C1638t tVar) {
            C1646g gVar = C1646g.this;
            String str = this.f15114OooO00o;
            C5146OooO0Oo remove = gVar.f2938c.remove(str);
            if (remove != null) {
                remove.f15116OooO00o = tVar;
                gVar.mo17376a(str, remove);
            }
        }
    }

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.g$OooO0OO */
    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public final void run() {
            for (C5146OooO0Oo oooO0Oo : C1646g.this.f2939d.values()) {
                Iterator<C1648c> it = oooO0Oo.f15118OooO00o.iterator();
                while (it.hasNext()) {
                    C1648c next = it.next();
                    AbstractC1649d dVar = next.f2944b;
                    if (dVar != null) {
                        C1638t tVar = oooO0Oo.f15116OooO00o;
                        if (tVar == null) {
                            next.f2943a = oooO0Oo.OooO00o;
                            dVar.mo17365a(next, false);
                        } else {
                            dVar.mo16993a(tVar);
                        }
                    }
                }
            }
            C1646g.this.f2939d.clear();
            C1646g.this.f2940e = null;
        }
    }

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.g$OooO0Oo  reason: case insensitive filesystem */
    public class C5146OooO0Oo {
        public Bitmap OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC1628m<?> f15115OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C1638t f15116OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LinkedList<C1648c> f15118OooO00o;

        public C5146OooO0Oo(AbstractC1628m<?> mVar, C1648c cVar) {
            LinkedList<C1648c> linkedList = new LinkedList<>();
            this.f15118OooO00o = linkedList;
            this.f15115OooO00o = mVar;
            linkedList.add(cVar);
        }

        public final boolean OooO00o(C1648c cVar) {
            this.f15118OooO00o.remove(cVar);
            if (this.f15118OooO00o.size() != 0) {
                return false;
            }
            this.f15115OooO00o.f2890k = true;
            return true;
        }
    }

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.g$b */
    public interface AbstractC1647b {
        /* renamed from: a */
        Bitmap mo17379a();
    }

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.g$c */
    public class C1648c {

        /* renamed from: a */
        public Bitmap f2943a;

        /* renamed from: b */
        public final AbstractC1649d f2944b;

        /* renamed from: c */
        public final String f2945c;

        /* renamed from: e */
        public final String f2947e;

        public C1648c(Bitmap bitmap, String str, String str2, AbstractC1649d dVar) {
            this.f2943a = bitmap;
            this.f2945c = str;
            this.f2947e = str2;
            this.f2944b = dVar;
        }

        /* renamed from: a */
        public final void mo17380a() {
            if (this.f2944b != null) {
                C5146OooO0Oo oooO0Oo = C1646g.this.f2938c.get(this.f2947e);
                if (oooO0Oo == null) {
                    C5146OooO0Oo oooO0Oo2 = C1646g.this.f2939d.get(this.f2947e);
                    if (oooO0Oo2 != null) {
                        oooO0Oo2.OooO00o(this);
                        if (oooO0Oo2.f15118OooO00o.size() == 0) {
                            C1646g.this.f2939d.remove(this.f2947e);
                        }
                    }
                } else if (oooO0Oo.OooO00o(this)) {
                    C1646g.this.f2938c.remove(this.f2947e);
                }
            }
        }
    }

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.g$d */
    public interface AbstractC1649d extends C1631o.AbstractC1632a {
        /* renamed from: a */
        void mo17365a(C1648c cVar, boolean z);
    }

    /* renamed from: a */
    public final void mo17376a(String str, C5146OooO0Oo oooO0Oo) {
        this.f2939d.put(str, oooO0Oo);
        if (this.f2940e == null) {
            OooO0OO oooO0OO = new OooO0OO();
            this.f2940e = oooO0OO;
            this.f2942g.postDelayed(oooO0OO, (long) this.f2941f);
        }
    }
}
