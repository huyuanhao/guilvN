package com.p118pd.sdk;

import com.rxhui.common.download.downloadinfo.DownState;

/* renamed from: com.pd.sdk.ooOOo000  reason: case insensitive filesystem */
public class C8964ooOOo000 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22224OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8944ooOOOOOO f22225OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8952ooOOOoO f22226OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8969ooOOo0Oo f22227OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22228OooO00o;
    public int OooO0O0 = 60;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f22229OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f22230OooO0O0;
    public long OooO0OO;

    public C8964ooOOo000(String str) {
        this.f22230OooO0O0 = str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8952ooOOOoO m20628OooO00o() {
        return this.f22226OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public long m20632OooO0O0() {
        return this.f22224OooO00o;
    }

    public long OooO0OO() {
        return this.OooO0OO;
    }

    public void OooO00o(AbstractC8952ooOOOoO ooooooo) {
        this.f22226OooO00o = ooooooo;
    }

    public void OooO0O0(long j) {
        this.f22224OooO00o = j;
    }

    public void OooO0OO(long j) {
        this.OooO0OO = j;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m20626OooO00o() {
        return this.f22229OooO0O0;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public C8964ooOOo000(String str, AbstractC8969ooOOo0Oo ooooo0oo) {
        this.f22230OooO0O0 = str;
        this.f22227OooO00o = ooooo0oo;
    }

    public void OooO00o(long j) {
        this.f22229OooO0O0 = j;
    }

    public void OooO0O0(int i) {
        this.OooO00o = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public DownState m20630OooO00o() {
        int OooO0O02 = OooO0O0();
        if (OooO0O02 == 0) {
            return DownState.START;
        }
        if (OooO0O02 == 1) {
            return DownState.DOWN;
        }
        if (OooO0O02 == 2) {
            return DownState.PAUSE;
        }
        if (OooO0O02 == 3) {
            return DownState.STOP;
        }
        if (OooO0O02 != 4) {
            return DownState.FINISH;
        }
        return DownState.ERROR;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m20633OooO0O0() {
        return this.f22230OooO0O0;
    }

    public void OooO0O0(String str) {
        this.f22230OooO0O0 = str;
    }

    public C8964ooOOo000(long j, long j2, long j3, int i, String str, int i2) {
        this.f22224OooO00o = j;
        this.f22229OooO0O0 = j2;
        this.OooO0OO = j3;
        this.OooO00o = i;
        this.f22230OooO0O0 = str;
        this.OooO0O0 = i2;
    }

    public void OooO00o(DownState downState) {
        OooO0O0(downState.getState());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8969ooOOo0Oo m20629OooO00o() {
        return this.f22227OooO00o;
    }

    public void OooO00o(AbstractC8969ooOOo0Oo ooooo0oo) {
        this.f22227OooO00o = ooooo0oo;
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    public C8964ooOOo000() {
    }

    public void OooO00o(int i) {
        this.OooO0O0 = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8944ooOOOOOO m20627OooO00o() {
        return this.f22225OooO00o;
    }

    public void OooO00o(C8944ooOOOOOO oooooooo) {
        this.f22225OooO00o = oooooooo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20631OooO00o() {
        return this.f22228OooO00o;
    }

    public void OooO00o(String str) {
        this.f22228OooO00o = str;
    }
}
