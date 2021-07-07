package com.huawei.hms.support.api.push;

import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.entity.push.AgreementResp;

public class AgreementResult extends Result {
    public AgreementResp resp;

    public AgreementResp getAgreementRes() {
        return this.resp;
    }

    public boolean isAgree() {
        AgreementResp agreementResp = this.resp;
        if (agreementResp != null) {
            return agreementResp.isAgree();
        }
        return false;
    }

    public void setAgreementRes(AgreementResp agreementResp) {
        this.resp = agreementResp;
    }
}
