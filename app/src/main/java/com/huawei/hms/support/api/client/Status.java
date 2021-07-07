package com.huawei.hms.support.api.client;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.p038a.AbstractC1143a;
import java.util.Arrays;

public final class Status implements Parcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C1162a();
    public static final Status CoreException = new Status(500);
    public static final Status FAILURE = new Status(1);
    public static final Status MessageNotFound = new Status(404);
    public static final Status SUCCESS = new Status(0);
    @AbstractC1143a

    /* renamed from: a */
    public final PendingIntent f1198a;
    @AbstractC1143a

    /* renamed from: b */
    public int f1199b;
    @AbstractC1143a

    /* renamed from: c */
    public String f1200c;

    public Status(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public static boolean m1150a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f1199b != status.f1199b || !m1150a(this.f1200c, status.f1200c) || !m1150a(this.f1198a, status.f1198a)) {
            return false;
        }
        return true;
    }

    public PendingIntent getResolution() {
        return this.f1198a;
    }

    public int getStatusCode() {
        return this.f1199b;
    }

    public String getStatusMessage() {
        return this.f1200c;
    }

    public boolean hasResolution() {
        return this.f1198a != null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1199b), this.f1200c, this.f1198a});
    }

    public boolean isSuccess() {
        return this.f1199b <= 0;
    }

    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.f1198a.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public String toString() {
        return "{statusCode: " + this.f1199b + ", statusMessage: " + this.f1200c + ", pendingIntent: " + this.f1198a + ", }";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1199b);
        parcel.writeString(this.f1200c);
        PendingIntent.writePendingIntentOrNullToParcel(this.f1198a, parcel);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this.f1199b = i;
        this.f1200c = str;
        this.f1198a = pendingIntent;
    }
}
