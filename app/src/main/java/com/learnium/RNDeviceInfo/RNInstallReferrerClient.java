package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.p118pd.sdk.AbstractC7587o0o0O0oO;
import com.p118pd.sdk.C7588o0o0O0oo;
import java.io.PrintStream;

public class RNInstallReferrerClient {
    public AbstractC7587o0o0O0oO installReferrerStateListener = new AbstractC7587o0o0O0oO() {
        /* class com.learnium.RNDeviceInfo.RNInstallReferrerClient.C14411 */

        @Override // com.p118pd.sdk.AbstractC7587o0o0O0oO
        public void onInstallReferrerServiceDisconnected() {
            RNInstallReferrerClient.this.mReferrerClient.OooO00o(RNInstallReferrerClient.this.installReferrerStateListener);
        }

        @Override // com.p118pd.sdk.AbstractC7587o0o0O0oO
        public void onInstallReferrerSetupFinished(int i) {
            if (i == 0) {
                try {
                    C7588o0o0O0oo OooO00o = RNInstallReferrerClient.this.mReferrerClient.OooO00o();
                    OooO00o.m19225OooO00o();
                    OooO00o.OooO0O0();
                    OooO00o.OooO00o();
                    SharedPreferences.Editor edit = RNInstallReferrerClient.this.sharedPreferences.edit();
                    edit.putString("installReferrer", RNInstallReferrerClient.this.getInstallReferrer());
                    edit.apply();
                    RNInstallReferrerClient.this.mReferrerClient.m14977OooO00o();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    public InstallReferrerClient mReferrerClient;
    public SharedPreferences sharedPreferences;

    public RNInstallReferrerClient(Context context) {
        this.sharedPreferences = context.getSharedPreferences("react-native-device-info", 0);
        InstallReferrerClient OooO00o = InstallReferrerClient.OooO00o(context).OooO00o();
        this.mReferrerClient = OooO00o;
        try {
            OooO00o.OooO00o(this.installReferrerStateListener);
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("InstallReferrer exception. getInstallReferrer will be unavailable: " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String getInstallReferrer() {
        try {
            return this.mReferrerClient.OooO00o().m19225OooO00o();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }
}
