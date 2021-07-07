package com.p118pd.sdk;

import androidx.core.app.FrameMetricsAggregator;
import com.adobe.xmp.XMPException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.pd.sdk.o0OOoO  reason: case insensitive filesystem */
public class C7427o0OOoO implements AbstractC7412o0OOOoo0 {
    public TimeZone OooO00o = null;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public boolean OooO0Oo = false;
    public int o00oO0O = 0;
    public int o0OO00O;
    public int o0OOO0o = 0;
    public int o0Oo0oo = 0;
    public int o0ooOO0 = 0;
    public int o0ooOOo = 0;
    public int o0ooOoO = 0;

    public C7427o0OOoO() {
    }

    public C7427o0OOoO(String str) throws XMPException {
        C7423o0OOo0o.OooO00o(str, this);
    }

    public C7427o0OOoO(Calendar calendar) {
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.o00oO0O = gregorianCalendar.get(1);
        this.o0ooOO0 = gregorianCalendar.get(2) + 1;
        this.o0ooOOo = gregorianCalendar.get(5);
        this.o0ooOoO = gregorianCalendar.get(11);
        this.o0OOO0o = gregorianCalendar.get(12);
        this.o0Oo0oo = gregorianCalendar.get(13);
        this.o0OO00O = gregorianCalendar.get(14) * FrameMetricsAggregator.OooO00o.OooO0O0;
        this.OooO00o = gregorianCalendar.getTimeZone();
        this.OooO0Oo = true;
        this.OooO0OO = true;
        this.OooO0O0 = true;
    }

    public C7427o0OOoO(Date date, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTime(date);
        this.o00oO0O = gregorianCalendar.get(1);
        this.o0ooOO0 = gregorianCalendar.get(2) + 1;
        this.o0ooOOo = gregorianCalendar.get(5);
        this.o0ooOoO = gregorianCalendar.get(11);
        this.o0OOO0o = gregorianCalendar.get(12);
        this.o0Oo0oo = gregorianCalendar.get(13);
        this.o0OO00O = gregorianCalendar.get(14) * FrameMetricsAggregator.OooO00o.OooO0O0;
        this.OooO00o = timeZone;
        this.OooO0Oo = true;
        this.OooO0OO = true;
        this.OooO0O0 = true;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0, com.p118pd.sdk.AbstractC7412o0OOOoo0
    public Calendar OooO00o() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        if (this.OooO0Oo) {
            gregorianCalendar.setTimeZone(this.OooO00o);
        }
        gregorianCalendar.set(1, this.o00oO0O);
        gregorianCalendar.set(2, this.o0ooOO0 - 1);
        gregorianCalendar.set(5, this.o0ooOOo);
        gregorianCalendar.set(11, this.o0ooOoO);
        gregorianCalendar.set(12, this.o0OOO0o);
        gregorianCalendar.set(13, this.o0Oo0oo);
        gregorianCalendar.set(14, this.o0OO00O / FrameMetricsAggregator.OooO00o.OooO0O0);
        return gregorianCalendar;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public void OooO00o(int i) {
        this.o0OOO0o = Math.min(Math.abs(i), 59);
        this.OooO0OO = true;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0, com.p118pd.sdk.AbstractC7412o0OOOoo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18990OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0, com.p118pd.sdk.AbstractC7412o0OOOoo0
    public int OooO0O0() {
        return this.o0OO00O;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public void OooO0O0(int i) {
        this.o0Oo0oo = Math.min(Math.abs(i), 59);
        this.OooO0OO = true;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0, com.p118pd.sdk.AbstractC7412o0OOOoo0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18991OooO0O0() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public void OooO0OO(int i) {
        this.o0OO00O = i;
        this.OooO0OO = true;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public void OooO0Oo(int i) {
        if (i < 1) {
            this.o0ooOOo = 1;
        } else if (i > 31) {
            this.o0ooOOo = 31;
        } else {
            this.o0ooOOo = i;
        }
        this.OooO0O0 = true;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public boolean OooO0Oo() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public String OooO0o0() {
        return C7423o0OOo0o.OooO00o(this);
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public void OooO0o0(int i) {
        this.o0ooOoO = Math.min(Math.abs(i), 23);
        this.OooO0OO = true;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        AbstractC7412o0OOOoo0 o0ooooo0 = (AbstractC7412o0OOOoo0) obj;
        long timeInMillis = OooO00o().getTimeInMillis() - o0ooooo0.OooO00o().getTimeInMillis();
        if (timeInMillis == 0) {
            timeInMillis = (long) (this.o0OO00O - o0ooooo0.OooO0O0());
        }
        return (int) Math.signum((float) timeInMillis);
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public int getDay() {
        return this.o0ooOOo;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public int getHour() {
        return this.o0ooOoO;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public int getMinute() {
        return this.o0OOO0o;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public int getMonth() {
        return this.o0ooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public int getSecond() {
        return this.o0Oo0oo;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public TimeZone getTimeZone() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public int getYear() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public void setMonth(int i) {
        if (i < 1) {
            this.o0ooOO0 = 1;
        } else if (i > 12) {
            this.o0ooOO0 = 12;
        } else {
            this.o0ooOO0 = i;
        }
        this.OooO0O0 = true;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public void setTimeZone(TimeZone timeZone) {
        this.OooO00o = timeZone;
        this.OooO0OO = true;
        this.OooO0Oo = true;
    }

    @Override // com.p118pd.sdk.AbstractC7412o0OOOoo0
    public void setYear(int i) {
        this.o00oO0O = Math.min(Math.abs(i), 9999);
        this.OooO0O0 = true;
    }

    public String toString() {
        return OooO0o0();
    }
}
