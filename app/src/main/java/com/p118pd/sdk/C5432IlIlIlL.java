package com.p118pd.sdk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* renamed from: com.pd.sdk.IlIlIl丨L  reason: invalid class name and case insensitive filesystem */
public class C5432IlIlIlL extends AbstractC5738Lil implements AbstractC5462Ilil {
    public AbstractC6122iIlLiL OooO00o;

    public C5432IlIlIlL(AbstractC6122iIlLiL iillil) {
        if ((iillil instanceof LL1IL) || (iillil instanceof C9623il)) {
            this.OooO00o = iillil;
            return;
        }
        throw new IllegalArgumentException("unknown object passed to Time");
    }

    public C5432IlIlIlL(Date date) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int parseInt = Integer.parseInt(str.substring(0, 4));
        this.OooO00o = (parseInt < 1950 || parseInt > 2049) ? new C6139iILilI(str) : new C1iIl(str.substring(2));
    }

    public C5432IlIlIlL(Date date, Locale locale) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int parseInt = Integer.parseInt(str.substring(0, 4));
        this.OooO00o = (parseInt < 1950 || parseInt > 2049) ? new C6139iILilI(str) : new C1iIl(str.substring(2));
    }

    public static C5432IlIlIlL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(r0.OooO0o());
    }

    public static C5432IlIlIlL OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5432IlIlIlL)) {
            return (C5432IlIlIlL) obj;
        }
        if (obj instanceof LL1IL) {
            return new C5432IlIlIlL((LL1IL) obj);
        }
        if (obj instanceof C9623il) {
            return new C5432IlIlIlL((C9623il) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public Date OooO00o() {
        try {
            return this.OooO00o instanceof LL1IL ? ((LL1IL) this.OooO00o).OooO00o() : ((C9623il) this.OooO00o).OooO00o();
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: " + e.getMessage());
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m15665OooO0O0() {
        AbstractC6122iIlLiL iillil = this.OooO00o;
        return iillil instanceof LL1IL ? ((LL1IL) iillil).m16169OooO0O0() : ((C9623il) iillil).m21686OooO0O0();
    }

    public String toString() {
        return m15665OooO0O0();
    }
}
