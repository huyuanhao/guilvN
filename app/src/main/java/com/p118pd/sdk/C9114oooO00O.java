package com.p118pd.sdk;

import java.util.ArrayList;

/* renamed from: com.pd.sdk.oooO00O  reason: case insensitive filesystem */
public class C9114oooO00O {
    public String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public StringBuffer f22522OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<String> f22523OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22524OooO00o = true;
    public ArrayList<String> OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f22525OooO0O0 = true;
    public ArrayList<String> OooO0OO = null;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f22526OooO0OO = false;
    public ArrayList<Integer> OooO0Oo = null;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f22527OooO0Oo = false;
    public boolean OooO0o = false;
    public boolean OooO0o0 = false;

    public C9114oooO00O(StringBuffer stringBuffer, String str) {
        this.f22522OooO00o = stringBuffer;
        this.OooO00o = str;
    }

    public C9114oooO00O(C9114oooO00O oooo00o) {
        this.f22522OooO00o = oooo00o.f22522OooO00o;
        this.OooO00o = oooo00o.OooO00o;
        this.f22524OooO00o = oooo00o.f22524OooO00o;
        this.f22525OooO0O0 = oooo00o.f22525OooO0O0;
        this.f22526OooO0OO = oooo00o.f22526OooO0OO;
        this.f22527OooO0Oo = oooo00o.f22527OooO0Oo;
        this.OooO0o0 = oooo00o.OooO0o0;
        this.OooO0o = oooo00o.OooO0o;
        if (oooo00o.f22523OooO00o != null) {
            this.f22523OooO00o = new ArrayList<>(oooo00o.f22523OooO00o);
        }
        if (oooo00o.OooO0O0 != null) {
            this.OooO0O0 = new ArrayList<>(oooo00o.OooO0O0);
        }
        if (oooo00o.OooO0OO != null) {
            this.OooO0OO = new ArrayList<>(oooo00o.OooO0OO);
        }
        if (oooo00o.OooO0Oo != null) {
            this.OooO0Oo = new ArrayList<>(oooo00o.OooO0Oo);
        }
    }
}
