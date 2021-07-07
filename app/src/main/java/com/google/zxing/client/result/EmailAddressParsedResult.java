package com.google.zxing.client.result;

public final class EmailAddressParsedResult extends ParsedResult {
    public final String[] bccs;
    public final String body;
    public final String[] ccs;
    public final String subject;
    public final String[] tos;

    public EmailAddressParsedResult(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    public String[] getBCCs() {
        return this.bccs;
    }

    public String getBody() {
        return this.body;
    }

    public String[] getCCs() {
        return this.ccs;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(30);
        ParsedResult.maybeAppend(this.tos, sb);
        ParsedResult.maybeAppend(this.ccs, sb);
        ParsedResult.maybeAppend(this.bccs, sb);
        ParsedResult.maybeAppend(this.subject, sb);
        ParsedResult.maybeAppend(this.body, sb);
        return sb.toString();
    }

    @Deprecated
    public String getEmailAddress() {
        String[] strArr = this.tos;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    @Deprecated
    public String getMailtoURI() {
        return "mailto:";
    }

    public String getSubject() {
        return this.subject;
    }

    public String[] getTos() {
        return this.tos;
    }

    public EmailAddressParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(ParsedResultType.EMAIL_ADDRESS);
        this.tos = strArr;
        this.ccs = strArr2;
        this.bccs = strArr3;
        this.subject = str;
        this.body = str2;
    }
}
