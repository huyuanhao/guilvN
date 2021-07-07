package com.qiyukf.unicorn.api.evaluation.entry;

import java.io.Serializable;
import java.util.List;

public class EvaluationOpenEntry implements Serializable {
    public List<EvaluationOptionEntry> evaluationEntryList;
    public String exchange;
    public String lastRemark;
    public int lastSource = -1;
    public int resolvedEnabled;
    public int resolvedRequired;
    public long sessionId;
    public String title;
    public int type;

    public List<EvaluationOptionEntry> getEvaluationEntryList() {
        return this.evaluationEntryList;
    }

    public String getExchange() {
        return this.exchange;
    }

    public String getLastRemark() {
        return this.lastRemark;
    }

    public int getLastSource() {
        return this.lastSource;
    }

    public int getResolvedEnabled() {
        return this.resolvedEnabled;
    }

    public int getResolvedRequired() {
        return this.resolvedRequired;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setEvaluationEntryList(List<EvaluationOptionEntry> list) {
        this.evaluationEntryList = list;
    }

    public void setExchange(String str) {
        this.exchange = str;
    }

    public void setLastRemark(String str) {
        this.lastRemark = str;
    }

    public void setLastSource(int i) {
        this.lastSource = i;
    }

    public void setResolvedEnabled(int i) {
        this.resolvedEnabled = i;
    }

    public void setResolvedRequired(int i) {
        this.resolvedRequired = i;
    }

    public void setSessionId(long j) {
        this.sessionId = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
