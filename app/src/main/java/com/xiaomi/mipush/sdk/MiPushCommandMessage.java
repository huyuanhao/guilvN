package com.xiaomi.mipush.sdk;

import android.os.Bundle;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import java.util.ArrayList;
import java.util.List;

public class MiPushCommandMessage implements PushMessageHandler.AbstractC4180a {
    public static final String KEY_CATEGORY = "category";
    public static final String KEY_COMMAND = "command";
    public static final String KEY_COMMAND_ARGUMENTS = "commandArguments";
    public static final String KEY_REASON = "reason";
    public static final String KEY_RESULT_CODE = "resultCode";
    public static final long serialVersionUID = 1;
    public String category;
    public String command;
    public List<String> commandArguments;
    public String reason;
    public long resultCode;

    public static MiPushCommandMessage fromBundle(Bundle bundle) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.command = bundle.getString("command");
        miPushCommandMessage.resultCode = bundle.getLong("resultCode");
        miPushCommandMessage.reason = bundle.getString(KEY_REASON);
        miPushCommandMessage.commandArguments = bundle.getStringArrayList(KEY_COMMAND_ARGUMENTS);
        miPushCommandMessage.category = bundle.getString("category");
        return miPushCommandMessage;
    }

    public String getCategory() {
        return this.category;
    }

    public String getCommand() {
        return this.command;
    }

    public List<String> getCommandArguments() {
        return this.commandArguments;
    }

    public String getReason() {
        return this.reason;
    }

    public long getResultCode() {
        return this.resultCode;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public void setCommandArguments(List<String> list) {
        this.commandArguments = list;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setResultCode(long j) {
        this.resultCode = j;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("command", this.command);
        bundle.putLong("resultCode", this.resultCode);
        bundle.putString(KEY_REASON, this.reason);
        List<String> list = this.commandArguments;
        if (list != null) {
            bundle.putStringArrayList(KEY_COMMAND_ARGUMENTS, (ArrayList) list);
        }
        bundle.putString("category", this.category);
        return bundle;
    }

    public String toString() {
        return "command={" + this.command + "}, resultCode={" + this.resultCode + "}, reason={" + this.reason + "}, category={" + this.category + "}, commandArguments={" + this.commandArguments + C7522o0Ooo0o.OooO0Oo;
    }
}
