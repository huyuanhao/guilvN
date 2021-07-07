package com.megvii.apo;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1500j;
import com.megvii.apo.util.C1501k;
import com.umeng.commonsdk.proguard.C3617o;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;

/* renamed from: com.megvii.apo.p */
public final class C1489p extends AbstractC1486m {

    /* renamed from: A */
    public OooO00o f1985A;

    /* renamed from: c */
    public String f1986c;

    /* renamed from: d */
    public String f1987d;

    /* renamed from: e */
    public String f1988e;

    /* renamed from: f */
    public String f1989f;

    /* renamed from: g */
    public String f1990g;

    /* renamed from: h */
    public String f1991h;

    /* renamed from: i */
    public String f1992i;

    /* renamed from: j */
    public String f1993j;

    /* renamed from: k */
    public String f1994k;

    /* renamed from: l */
    public String f1995l;

    /* renamed from: m */
    public String f1996m;

    /* renamed from: n */
    public SensorManager f1997n;

    /* renamed from: o */
    public Sensor f1998o;

    /* renamed from: p */
    public Sensor f1999p;

    /* renamed from: q */
    public Sensor f2000q;

    /* renamed from: r */
    public Sensor f2001r;

    /* renamed from: s */
    public Sensor f2002s;

    /* renamed from: t */
    public Sensor f2003t;

    /* renamed from: u */
    public Sensor f2004u;

    /* renamed from: v */
    public Sensor f2005v;

    /* renamed from: w */
    public Sensor f2006w;

    /* renamed from: x */
    public Sensor f2007x;

    /* renamed from: y */
    public Sensor f2008y;

    /* renamed from: z */
    public int f2009z;

    /* renamed from: com.megvii.apo.p$OooO00o */
    public class OooO00o implements SensorEventListener {
        public OooO00o() {
        }

        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            try {
                int type = sensorEvent.sensor.getType();
                if (type == 1) {
                    C1489p pVar = C1489p.this;
                    pVar.f1995l = String.valueOf(sensorEvent.values[0]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[1]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[2]);
                } else if (type == 2) {
                    C1489p pVar2 = C1489p.this;
                    pVar2.f1988e = String.valueOf(sensorEvent.values[0]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[1]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[2]);
                } else if (type == 3) {
                    C1489p pVar3 = C1489p.this;
                    pVar3.f1989f = String.valueOf(sensorEvent.values[0]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[1]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[2]);
                } else if (type == 4) {
                    C1489p pVar4 = C1489p.this;
                    pVar4.f1990g = String.valueOf(sensorEvent.values[0]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[1]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[2]);
                } else if (type == 5) {
                    C1489p.this.f1986c = String.valueOf(sensorEvent.values[0]);
                } else if (type == 13) {
                    C1489p pVar5 = C1489p.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(sensorEvent.values[0]));
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(String.valueOf(sensorEvent.values[1] + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[2])));
                    pVar5.f1996m = sb.toString();
                } else if (type != 20) {
                    switch (type) {
                        case 8:
                            C1489p.this.f1987d = String.valueOf(sensorEvent.values[0]);
                            return;
                        case 9:
                            C1489p pVar6 = C1489p.this;
                            pVar6.f1991h = String.valueOf(sensorEvent.values[0]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[1]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[2]);
                            return;
                        case 10:
                            C1489p pVar7 = C1489p.this;
                            pVar7.f1992i = String.valueOf(sensorEvent.values[0]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[1]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[2]);
                            return;
                        case 11:
                            C1489p pVar8 = C1489p.this;
                            pVar8.f1993j = String.valueOf(sensorEvent.values[0]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[1]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[2]);
                            return;
                        default:
                            return;
                    }
                } else {
                    C1489p pVar9 = C1489p.this;
                    pVar9.f1994k = String.valueOf(sensorEvent.values[0]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[1]) + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(sensorEvent.values[2]);
                }
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    public C1489p(Context context) {
        super(context);
        try {
            this.f1997n = (SensorManager) this.f1983a.getSystemService(C3617o.f9339Z);
            this.f1985A = new OooO00o();
            this.f1998o = this.f1997n.getDefaultSensor(5);
            if (m2243b("_lt")) {
                m2241a("_lt", false);
                this.f1997n.registerListener(this.f1985A, this.f1998o, 3);
            }
            this.f1999p = this.f1997n.getDefaultSensor(8);
            if (m2243b("_px")) {
                m2241a("_px", false);
                this.f1997n.registerListener(this.f1985A, this.f1999p, 3);
            }
            this.f2000q = this.f1997n.getDefaultSensor(2);
            if (m2243b("_mgt")) {
                m2241a("_mgt", false);
                this.f1997n.registerListener(this.f1985A, this.f2000q, 3);
            }
            this.f2001r = this.f1997n.getDefaultSensor(3);
            if (m2243b("_ori")) {
                m2241a("_ori", false);
            }
            this.f1997n.registerListener(this.f1985A, this.f2001r, 3);
            this.f2002s = this.f1997n.getDefaultSensor(4);
            if (m2243b("_gyro")) {
                m2241a("_gyro", false);
                this.f1997n.registerListener(this.f1985A, this.f2002s, 3);
            }
            this.f2003t = this.f1997n.getDefaultSensor(9);
            if (m2243b("_gty")) {
                m2241a("_gty", false);
                this.f1997n.registerListener(this.f1985A, this.f2003t, 3);
            }
            this.f2004u = this.f1997n.getDefaultSensor(10);
            if (m2243b("_lacc")) {
                m2241a("_lacc", false);
                this.f1997n.registerListener(this.f1985A, this.f2004u, 3);
            }
            this.f2005v = this.f1997n.getDefaultSensor(11);
            if (m2243b("_rota")) {
                m2241a("_rota", false);
                this.f1997n.registerListener(this.f1985A, this.f2005v, 3);
            }
            this.f2006w = this.f1997n.getDefaultSensor(20);
            if (m2243b("_geo")) {
                m2241a("_geo", false);
                this.f1997n.registerListener(this.f1985A, this.f2006w, 3);
            }
            this.f2007x = this.f1997n.getDefaultSensor(1);
            if (m2243b("_acc")) {
                m2241a("_acc", false);
                this.f1997n.registerListener(this.f1985A, this.f2007x, 3);
            }
            this.f2008y = this.f1997n.getDefaultSensor(13);
            if (m2243b("_tem")) {
                m2241a("_tem", false);
                this.f1997n.registerListener(this.f1985A, this.f2008y, 3);
            }
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }

    /* renamed from: a */
    private void m2241a(String str, boolean z) {
        C1501k.m2274a(this.f1983a, str, Boolean.valueOf(z));
    }

    /* renamed from: b */
    private boolean m2243b(String str) {
        return ((Boolean) C1501k.m2275b(this.f1983a, str, Boolean.TRUE)).booleanValue();
    }

    /* renamed from: b */
    private double m2242b() {
        try {
            this.f2009z = this.f1983a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("temperature", 0) / 10;
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        return (double) this.f2009z;
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (C1500j.f2040K == 1) {
            try {
                String str11 = "";
                if (this.f1998o == null) {
                    str = str11;
                } else {
                    m2241a("_lt", true);
                    str = this.f1998o.getVendor() + "+" + this.f1986c;
                }
                map.put("101090001", str);
                if (this.f1999p == null) {
                    str2 = str11;
                } else {
                    m2241a("_px", true);
                    str2 = this.f1999p.getVendor() + "+" + this.f1987d;
                }
                map.put("101090002", str2);
                if (this.f2000q == null) {
                    str3 = str11;
                } else {
                    m2241a("_mgt", true);
                    str3 = this.f2000q.getVendor() + "+" + this.f1988e;
                }
                map.put("101090003", str3);
                if (this.f2001r == null) {
                    str4 = str11;
                } else {
                    m2241a("_ori", true);
                    str4 = this.f2001r.getVendor() + "+" + this.f1989f;
                }
                map.put("101090004", str4);
                if (this.f2002s == null) {
                    str5 = str11;
                } else {
                    m2241a("_gyro", true);
                    str5 = this.f2002s.getVendor() + "+" + this.f1990g;
                }
                map.put("101090005", str5);
                if (this.f2003t == null) {
                    str6 = str11;
                } else {
                    m2241a("_gty", true);
                    str6 = this.f2003t.getVendor() + "+" + this.f1991h;
                }
                map.put("101090006", str6);
                if (this.f2004u == null) {
                    str7 = str11;
                } else {
                    m2241a("_lacc", true);
                    str7 = this.f2004u.getVendor() + "+" + this.f1992i;
                }
                map.put("101090007", str7);
                if (this.f2005v == null) {
                    str8 = str11;
                } else {
                    m2241a("_rota", true);
                    str8 = this.f2005v.getVendor() + "+" + this.f1993j;
                }
                map.put("101090008", str8);
                if (this.f2006w == null) {
                    str9 = str11;
                } else {
                    m2241a("_geo", true);
                    str9 = this.f2006w.getVendor() + "+" + this.f1994k;
                }
                map.put("101090009", str9);
                if (this.f2007x == null) {
                    str10 = str11;
                } else {
                    m2241a("_acc", true);
                    str10 = this.f2007x.getVendor() + "+" + this.f1995l;
                }
                map.put("101090011", str10);
                if (this.f2008y != null) {
                    m2241a("_tem", true);
                    str11 = this.f2008y.getVendor() + "+" + this.f1996m;
                }
                map.put("101090013", str11);
                map.put("101090014", Double.valueOf(m2242b()));
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }
}
