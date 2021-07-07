package com.google.zxing.client.result;

import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public final class GeoParsedResult extends ParsedResult {
    public final double altitude;
    public final double latitude;
    public final double longitude;
    public final String query;

    public GeoParsedResult(double d, double d2, double d3, String str) {
        super(ParsedResultType.GEO);
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
        this.query = str;
    }

    public double getAltitude() {
        return this.altitude;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.latitude);
        sb.append(", ");
        sb.append(this.longitude);
        if (this.altitude > AbstractC8352oOoOOoO0.OooO0O0) {
            sb.append(", ");
            sb.append(this.altitude);
            sb.append('m');
        }
        if (this.query != null) {
            sb.append(" (");
            sb.append(this.query);
            sb.append(')');
        }
        return sb.toString();
    }

    public String getGeoURI() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.latitude);
        sb.append(AbstractC1299b.COMMA);
        sb.append(this.longitude);
        if (this.altitude > AbstractC8352oOoOOoO0.OooO0O0) {
            sb.append(AbstractC1299b.COMMA);
            sb.append(this.altitude);
        }
        if (this.query != null) {
            sb.append('?');
            sb.append(this.query);
        }
        return sb.toString();
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getQuery() {
        return this.query;
    }
}
