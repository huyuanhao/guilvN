package com.google.zxing.client.result;

public final class ProductParsedResult extends ParsedResult {
    public final String normalizedProductID;
    public final String productID;

    public ProductParsedResult(String str) {
        this(str, str);
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.productID;
    }

    public String getNormalizedProductID() {
        return this.normalizedProductID;
    }

    public String getProductID() {
        return this.productID;
    }

    public ProductParsedResult(String str, String str2) {
        super(ParsedResultType.PRODUCT);
        this.productID = str;
        this.normalizedProductID = str2;
    }
}
