package com.google.zxing.client.result;

public final class WifiParsedResult extends ParsedResult {
    public final String anonymousIdentity;
    public final String eapMethod;
    public final boolean hidden;
    public final String identity;
    public final String networkEncryption;
    public final String password;
    public final String phase2Method;
    public final String ssid;

    public WifiParsedResult(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    public String getAnonymousIdentity() {
        return this.anonymousIdentity;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(80);
        ParsedResult.maybeAppend(this.ssid, sb);
        ParsedResult.maybeAppend(this.networkEncryption, sb);
        ParsedResult.maybeAppend(this.password, sb);
        ParsedResult.maybeAppend(Boolean.toString(this.hidden), sb);
        return sb.toString();
    }

    public String getEapMethod() {
        return this.eapMethod;
    }

    public String getIdentity() {
        return this.identity;
    }

    public String getNetworkEncryption() {
        return this.networkEncryption;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhase2Method() {
        return this.phase2Method;
    }

    public String getSsid() {
        return this.ssid;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public WifiParsedResult(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, null, null, null, null);
    }

    public WifiParsedResult(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7) {
        super(ParsedResultType.WIFI);
        this.ssid = str2;
        this.networkEncryption = str;
        this.password = str3;
        this.hidden = z;
        this.identity = str4;
        this.anonymousIdentity = str5;
        this.eapMethod = str6;
        this.phase2Method = str7;
    }
}
