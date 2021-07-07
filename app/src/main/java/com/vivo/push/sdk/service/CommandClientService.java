package com.vivo.push.sdk.service;

public class CommandClientService extends CommandService {
    @Override // com.vivo.push.sdk.service.CommandService
    /* renamed from: a */
    public final boolean mo41159a(String str) {
        return "com.vivo.pushclient.action.RECEIVE".equals(str);
    }
}
