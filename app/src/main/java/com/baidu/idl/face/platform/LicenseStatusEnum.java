package com.baidu.idl.face.platform;

public enum LicenseStatusEnum {
    StateSuccess,
    StateWarningValidityComing,
    StateErrorBegin,
    StateErrorNotFindLicense,
    StateErrorExpired,
    StateErrorAuthorized,
    StateErrorNetwork,
    StateNotInit,
    StateInitializing,
    StateUnknown;

    public static LicenseStatusEnum getLicenseStatus(int i) {
        return StateUnknown;
    }
}
