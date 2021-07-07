package anet.channel.monitor;

import com.p118pd.sdk.AbstractC8352oOoOOoO0;

/* renamed from: anet.channel.monitor.e */
public class C0151e {

    /* renamed from: a */
    public long f204a = 0;

    /* renamed from: b */
    public double f205b;

    /* renamed from: c */
    public double f206c;

    /* renamed from: d */
    public double f207d;

    /* renamed from: e */
    public double f208e;

    /* renamed from: f */
    public double f209f;

    /* renamed from: g */
    public double f210g;

    /* renamed from: h */
    public double f211h;

    /* renamed from: i */
    public double f212i = AbstractC8352oOoOOoO0.OooO0O0;

    /* renamed from: j */
    public double f213j = AbstractC8352oOoOOoO0.OooO0O0;

    /* renamed from: k */
    public double f214k = AbstractC8352oOoOOoO0.OooO0O0;

    /* renamed from: a */
    public double mo3516a(double d, double d2) {
        double d3 = d / d2;
        if (d3 >= 8.0d) {
            long j = this.f204a;
            if (j == 0) {
                this.f212i = d3;
                this.f211h = d3;
                this.f207d = d3 * 0.1d;
                this.f206c = 0.02d * d3;
                this.f208e = 0.1d * d3 * d3;
            } else if (j == 1) {
                this.f213j = d3;
                this.f211h = d3;
            } else {
                double d4 = this.f213j;
                double d5 = d3 - d4;
                this.f212i = d4;
                this.f213j = d3;
                double d6 = d3 / 0.95d;
                this.f205b = d6;
                this.f210g = d6 - (this.f211h * 0.95d);
                char c = 0;
                double sqrt = Math.sqrt(this.f207d);
                double d7 = this.f210g;
                if (d7 >= 4.0d * sqrt) {
                    this.f210g = (d7 * 0.75d) + (sqrt * 2.0d);
                    c = 1;
                } else if (d7 <= -4.0d * sqrt) {
                    this.f210g = (sqrt * -1.0d) + (d7 * 0.75d);
                    c = 2;
                }
                double d8 = this.f210g;
                double min = Math.min(Math.max(Math.abs((this.f207d * 1.05d) - ((0.0025d * d8) * d8)), this.f207d * 0.8d), this.f207d * 1.25d);
                this.f207d = min;
                double d9 = this.f208e;
                double d10 = d9 / ((0.9025d * d9) + min);
                this.f209f = d10;
                double d11 = this.f211h + (1.0526315789473684d * d5) + (d10 * this.f210g);
                this.f211h = d11;
                if (c == 1) {
                    this.f211h = Math.min(d11, this.f205b);
                } else if (c == 2) {
                    this.f211h = Math.max(d11, this.f205b);
                }
                this.f208e = (1.0d - (0.95d * this.f209f)) * (this.f208e + this.f206c);
            }
            double d12 = this.f211h;
            if (d12 < AbstractC8352oOoOOoO0.OooO0O0) {
                double d13 = this.f213j * 0.7d;
                this.f214k = d13;
                this.f211h = d13;
            } else {
                this.f214k = d12;
            }
            return this.f214k;
        } else if (this.f204a != 0) {
            return this.f214k;
        } else {
            this.f214k = d3;
            return d3;
        }
    }

    /* renamed from: a */
    public void mo3517a() {
        this.f204a = 0;
        this.f214k = AbstractC8352oOoOOoO0.OooO0O0;
    }
}
