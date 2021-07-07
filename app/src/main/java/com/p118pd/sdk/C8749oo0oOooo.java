package com.p118pd.sdk;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.umeng.commonsdk.proguard.C3617o;

/* renamed from: com.pd.sdk.oo0oOooo  reason: case insensitive filesystem */
public class C8749oo0oOooo {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SensorEventListener f21934OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SensorManager f21935OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8753oo0oo000 f21936OooO00o = null;

    /* renamed from: com.pd.sdk.oo0oOooo$OooO0O0 */
    public class OooO0O0 implements SensorEventListener {
        public OooO0O0() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            if (f < 5.0f && f > -5.0f && f2 > 5.0f) {
                C8749oo0oOooo.this.OooO00o = 0;
            } else if (f < -5.0f && f2 < 5.0f && f2 > -5.0f) {
                C8749oo0oOooo.this.OooO00o = 3;
            } else if (f < 5.0f && f > -5.0f && f2 < -5.0f) {
                C8749oo0oOooo.this.OooO00o = 2;
            } else if (f > 5.0f && f2 < 5.0f && f2 > -5.0f) {
                C8749oo0oOooo.this.OooO00o = 1;
            }
            if (C8749oo0oOooo.this.f21936OooO00o != null) {
                C8749oo0oOooo.this.f21936OooO00o.OooO00o();
            }
        }
    }

    public C8749oo0oOooo(ReactApplicationContext reactApplicationContext) {
        this.f21935OooO00o = (SensorManager) reactApplicationContext.getSystemService(C3617o.f9339Z);
    }

    public void OooO0O0() {
        SensorManager sensorManager = this.f21935OooO00o;
        sensorManager.registerListener(this.f21934OooO00o, sensorManager.getDefaultSensor(1), 3);
    }

    public void OooO0OO() {
        this.f21936OooO00o = null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20394OooO00o() {
        this.f21935OooO00o.unregisterListener(this.f21934OooO00o);
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(AbstractC8753oo0oo000 oo0oo000) {
        this.f21936OooO00o = oo0oo000;
    }
}
