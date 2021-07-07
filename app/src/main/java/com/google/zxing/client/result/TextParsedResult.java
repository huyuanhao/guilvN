package com.google.zxing.client.result;

public final class TextParsedResult extends ParsedResult {
    public final String language;
    public final String text;

    public TextParsedResult(String str, String str2) {
        super(ParsedResultType.TEXT);
        this.text = str;
        this.language = str2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.text;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getText() {
        return this.text;
    }
}
