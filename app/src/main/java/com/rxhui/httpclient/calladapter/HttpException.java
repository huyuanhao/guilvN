package com.rxhui.httpclient.calladapter;

import retrofit2.Response;

public final class HttpException extends retrofit2.HttpException {
    public HttpException(Response<?> response) {
        super(response);
    }
}
