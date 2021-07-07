package com.google.zxing.client.result;

public final class TelParsedResult extends ParsedResult {
    public final String number;
    public final String telURI;
    public final String title;

    public TelParsedResult(String str, String str2, String str3) {
        super(ParsedResultType.TEL);
        this.number = str;
        this.telURI = str2;
        this.title = str3;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(20);
        ParsedResult.maybeAppend(this.number, sb);
        ParsedResult.maybeAppend(this.title, sb);
        return sb.toString();
    }

    public String getNumber() {
        return this.number;
    }

    public String getTelURI() {
        return this.telURI;
    }

    public String getTitle() {
        return this.title;
    }
}
