package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.umeng.commonsdk.proguard.C3617o;

/* renamed from: com.megvii.meglive_sdk.f.y */
public final class C1584y implements SensorEventListener {

    /* renamed from: a */
    public float f2648a;

    /* renamed from: b */
    public SensorManager f2649b;

    /* renamed from: c */
    public Sensor f2650c;

    public C1584y(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService(C3617o.f9339Z);
        this.f2649b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f2650c = defaultSensor;
        if (defaultSensor != null) {
            this.f2649b.registerListener(this, defaultSensor, 3);
        }
    }

    /* renamed from: a */
    public final void mo17204a() {
        SensorManager sensorManager;
        if (this.f2650c != null && (sensorManager = this.f2649b) != null) {
            sensorManager.unregisterListener(this);
        }
    }

    /* renamed from: b */
    public final boolean mo17205b() {
        return this.f2648a >= 8.0f;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent == null || (fArr = sensorEvent.values) == null || fArr.length <= 1) {
            this.f2648a = 0.0f;
        } else {
            this.f2648a = fArr[1];
        }
    }
}
