package com.qiyukf.unicorn.p213f.p214a.p215a.p216a;

import com.facebook.react.uimanager.ViewProps;
import com.p118pd.sdk.C8412oOoo0OoO;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.AbstractC2370a;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import java.util.List;
import org.android.agoo.common.AgooConstants;

@AbstractC2551d(mo35943a = "card_layout")
/* renamed from: com.qiyukf.unicorn.f.a.a.a.i */
public class C2515i extends AbstractC2370a {
    @AbstractC2548a(mo35940a = "label")

    /* renamed from: a */
    public String f5017a;
    @AbstractC2548a(mo35940a = C8412oOoo0OoO.OooO0OO)

    /* renamed from: b */
    public List<C2518c> f5018b;
    @AbstractC2548a(mo35940a = "action")

    /* renamed from: c */
    public C2516a f5019c;

    /* renamed from: com.qiyukf.unicorn.f.a.a.a.i$a */
    public static class C2516a implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "target")

        /* renamed from: a */
        public String f5020a;
        @AbstractC2548a(mo35940a = "params")

        /* renamed from: b */
        public String f5021b;
        @AbstractC2548a(mo35940a = "type")

        /* renamed from: c */
        public String f5022c;
        @AbstractC2548a(mo35940a = "label")

        /* renamed from: d */
        public String f5023d;
        @AbstractC2548a(mo35940a = "title")

        /* renamed from: e */
        public String f5024e;

        /* renamed from: a */
        public final String mo35818a() {
            return this.f5020a;
        }

        /* renamed from: b */
        public final String mo35819b() {
            return this.f5021b;
        }

        /* renamed from: c */
        public final String mo35820c() {
            return this.f5022c;
        }

        /* renamed from: d */
        public final String mo35821d() {
            return this.f5023d;
        }

        /* renamed from: e */
        public final String mo35822e() {
            return this.f5024e;
        }
    }

    /* renamed from: com.qiyukf.unicorn.f.a.a.a.i$b */
    public static class C2517b implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "type")

        /* renamed from: a */
        public String f5025a;
        @AbstractC2548a(mo35940a = "value")

        /* renamed from: b */
        public String f5026b;
        @AbstractC2548a(mo35940a = ViewProps.COLOR)

        /* renamed from: c */
        public String f5027c;
        @AbstractC2548a(mo35940a = "align")

        /* renamed from: d */
        public String f5028d;
        @AbstractC2548a(mo35940a = AgooConstants.MESSAGE_FLAG)

        /* renamed from: e */
        public int f5029e;

        /* renamed from: a */
        public final String mo35823a() {
            return this.f5025a;
        }

        /* renamed from: a */
        public final boolean mo35824a(int i) {
            return (i & this.f5029e) != 0;
        }

        /* renamed from: b */
        public final String mo35825b() {
            return this.f5026b;
        }

        /* renamed from: c */
        public final String mo35826c() {
            return this.f5027c;
        }

        /* renamed from: d */
        public final String mo35827d() {
            return this.f5028d;
        }
    }

    /* renamed from: com.qiyukf.unicorn.f.a.a.a.i$c */
    public static class C2518c implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "action")

        /* renamed from: a */
        public C2516a f5030a;
        @AbstractC2548a(mo35940a = C8412oOoo0OoO.OooO0OO)

        /* renamed from: b */
        public List<List<C2517b>> f5031b;

        /* renamed from: a */
        public final C2516a mo35828a() {
            return this.f5030a;
        }

        /* renamed from: b */
        public final List<List<C2517b>> mo35829b() {
            return this.f5031b;
        }
    }

    /* renamed from: c */
    public final String mo35815c() {
        return this.f5017a;
    }

    /* renamed from: d */
    public final List<C2518c> mo35816d() {
        return this.f5018b;
    }

    /* renamed from: e */
    public final C2516a mo35817e() {
        return this.f5019c;
    }
}
