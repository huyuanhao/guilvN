package com.p118pd.sdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.pd.sdk.o000Oo  reason: case insensitive filesystem */
public final class C7000o000Oo implements Iterable<Intent> {
    public static final String o0ooOOo = "TaskStackBuilder";
    public final Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<Intent> f19253OooO00o = new ArrayList<>();

    /* renamed from: com.pd.sdk.o000Oo$OooO00o */
    public interface OooO00o {
        @Nullable
        Intent getSupportParentActivityIntent();
    }

    public C7000o000Oo(Context context) {
        this.OooO00o = context;
    }

    @NonNull
    public static C7000o000Oo OooO00o(@NonNull Context context) {
        return new C7000o000Oo(context);
    }

    @Deprecated
    public static C7000o000Oo OooO0O0(Context context) {
        return OooO00o(context);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f19253OooO00o.iterator();
    }

    @NonNull
    public C7000o000Oo OooO00o(@NonNull Intent intent) {
        this.f19253OooO00o.add(intent);
        return this;
    }

    @NonNull
    public C7000o000Oo OooO0O0(@NonNull Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.OooO00o.getPackageManager());
        }
        if (component != null) {
            OooO00o(component);
        }
        OooO00o(intent);
        return this;
    }

    @NonNull
    public C7000o000Oo OooO00o(@NonNull Activity activity) {
        Intent supportParentActivityIntent = activity instanceof OooO00o ? ((OooO00o) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C6977o000O.OooO00o(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.OooO00o.getPackageManager());
            }
            OooO00o(component);
            OooO00o(supportParentActivityIntent);
        }
        return this;
    }

    @Deprecated
    public Intent OooO0O0(int i) {
        return OooO00o(i);
    }

    @NonNull
    public C7000o000Oo OooO00o(@NonNull Class<?> cls) {
        return OooO00o(new ComponentName(this.OooO00o, cls));
    }

    public C7000o000Oo OooO00o(ComponentName componentName) {
        int size = this.f19253OooO00o.size();
        try {
            Intent OooO00o2 = C6977o000O.OooO00o(this.OooO00o, componentName);
            while (OooO00o2 != null) {
                this.f19253OooO00o.add(size, OooO00o2);
                OooO00o2 = C6977o000O.OooO00o(this.OooO00o, OooO00o2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int OooO00o() {
        return this.f19253OooO00o.size();
    }

    @Nullable
    public Intent OooO00o(int i) {
        return this.f19253OooO00o.get(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18225OooO00o() {
        OooO00o((Bundle) null);
    }

    public void OooO00o(@Nullable Bundle bundle) {
        if (!this.f19253OooO00o.isEmpty()) {
            ArrayList<Intent> arrayList = this.f19253OooO00o;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C7009o000OoOo.OooO00o(this.OooO00o, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(CommonNetImpl.FLAG_AUTH);
                this.OooO00o.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Nullable
    public PendingIntent OooO00o(int i, int i2) {
        return OooO00o(i, i2, null);
    }

    @Nullable
    public PendingIntent OooO00o(int i, int i2, @Nullable Bundle bundle) {
        if (!this.f19253OooO00o.isEmpty()) {
            ArrayList<Intent> arrayList = this.f19253OooO00o;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (Build.VERSION.SDK_INT >= 16) {
                return PendingIntent.getActivities(this.OooO00o, i, intentArr, i2, bundle);
            }
            return PendingIntent.getActivities(this.OooO00o, i, intentArr, i2);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Intent[] m18226OooO00o() {
        int size = this.f19253OooO00o.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f19253OooO00o.get(0)).addFlags(268484608);
        for (int i = 1; i < size; i++) {
            intentArr[i] = new Intent(this.f19253OooO00o.get(i));
        }
        return intentArr;
    }
}
