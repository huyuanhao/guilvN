package com.p118pd.sdk;

import com.umeng.message.MsgConstant;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.pd.sdk.L丨iLL  reason: invalid class name and case insensitive filesystem */
public class C5869LiLL extends AbstractC5738Lil {
    public static final C5869LiLL OooO = new C5869LiLL(o00OoOo0.m16385OooO00o("8"));
    public static final C5869LiLL OooO00o = new C5869LiLL(C5237III.o00o00O0.m16385OooO00o("0"));
    public static final C5869LiLL OooO0O0 = new C5869LiLL(o00OoOo0.m16385OooO00o("1"));
    public static final C5869LiLL OooO0OO = new C5869LiLL(o00OoOo0.m16385OooO00o("2"));
    public static final C5869LiLL OooO0Oo = new C5869LiLL(o00OoOo0.m16385OooO00o("3"));
    public static final C5869LiLL OooO0o = new C5869LiLL(o00OoOo0.m16385OooO00o("5"));
    public static final C5869LiLL OooO0o0 = new C5869LiLL(o00OoOo0.m16385OooO00o("4"));
    public static final C5869LiLL OooO0oO = new C5869LiLL(o00OoOo0.m16385OooO00o("6"));
    public static final C5869LiLL OooO0oo = new C5869LiLL(o00OoOo0.m16385OooO00o(MsgConstant.MESSAGE_NOTIFY_ARRIVAL));
    public static final C5869LiLL OooOO0 = new C5869LiLL(o00OoOo0.m16385OooO00o("9"));
    public static final C5869LiLL OooOO0O = new C5869LiLL(o00OoOo0.m16385OooO00o(AgooConstants.ACK_REMOVE_PACKAGE));
    public static final C5869LiLL OooOO0o = new C5869LiLL(o00OoOo0.m16385OooO00o(AgooConstants.ACK_BODY_NULL));
    public static final C5869LiLL OooOOO = new C5869LiLL(o00OoOo0.m16385OooO00o("13"));
    public static final C5869LiLL OooOOO0 = new C5869LiLL(o00OoOo0.m16385OooO00o(AgooConstants.ACK_PACK_NULL));
    public static final C5869LiLL OooOOOO = new C5869LiLL(o00OoOo0.m16385OooO00o(AgooConstants.ACK_PACK_NOBIND));
    public static final C5869LiLL OooOOOo = new C5869LiLL(o00OoOo0.m16385OooO00o(AgooConstants.ACK_PACK_ERROR));
    public static final C5869LiLL OooOOo = new C5869LiLL(o00OoOo0.m16385OooO00o("17"));
    public static final C5869LiLL OooOOo0 = new C5869LiLL(o00OoOo0.m16385OooO00o("16"));
    public static final C5869LiLL OooOOoo = new C5869LiLL(o00OoOo0.m16385OooO00o("18"));
    public static final C5869LiLL OooOo = new C5869LiLL(new LlLI1("2.16.840.1.113730.4.1"));
    public static final C5869LiLL OooOo0 = new C5869LiLL(new LlLI1("1.3.6.1.4.1.311.20.2.2"));
    public static final C5869LiLL OooOo00 = new C5869LiLL(o00OoOo0.m16385OooO00o("19"));
    public static final C5869LiLL OooOo0O = new C5869LiLL(new LlLI1("1.3.6.1.1.1.1.22"));
    public static final C5869LiLL OooOo0o = new C5869LiLL(new LlLI1("1.3.6.1.4.1.311.10.3.3"));
    public static final LlLI1 o00OoOo0 = new LlLI1("1.3.6.1.5.5.7.3");
    public LlLI1 o00OoOOo;

    public C5869LiLL(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
    }

    public C5869LiLL(String str) {
        this(new LlLI1(str));
    }

    public static C5869LiLL OooO00o(Object obj) {
        if (obj instanceof C5869LiLL) {
            return (C5869LiLL) obj;
        }
        if (obj != null) {
            return new C5869LiLL(LlLI1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m16458OooO0O0() {
        return this.o00OoOOo.m16387OooO0O0();
    }

    public String toString() {
        return this.o00OoOOo.toString();
    }
}
