package com.qiyukf.nimlib.sdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;

public class LoginInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<LoginInfo> CREATOR = new Parcelable.Creator<LoginInfo>() {
        /* class com.qiyukf.nimlib.sdk.auth.LoginInfo.C23521 */

        @Override // android.os.Parcelable.Creator
        public final LoginInfo createFromParcel(Parcel parcel) {
            return new LoginInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LoginInfo[] newArray(int i) {
            return new LoginInfo[i];
        }
    };
    public String account;
    public String token;

    public LoginInfo(Parcel parcel) {
        this.account = parcel.readString();
        this.token = parcel.readString();
    }

    public LoginInfo(String str, String str2) {
        this.account = str == null ? null : str.toLowerCase();
        this.token = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String getAccount() {
        return this.account;
    }

    public String getToken() {
        return this.token;
    }

    public String toString() {
        return this.account + "#" + this.token;
    }

    public boolean valid() {
        return !TextUtils.isEmpty(this.account) && !TextUtils.isEmpty(this.token);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.account);
        parcel.writeString(this.token);
    }
}
