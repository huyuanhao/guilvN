package com.qiyukf.unicorn.api.evaluation.entry;

import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import java.util.List;

public class EvaluationOptionEntry implements AbstractC2498a {
    @AbstractC2548a(mo35940a = "commentRequired")
    public int commentRequired;
    @AbstractC2548a(mo35940a = "name")
    public String name;
    @AbstractC2548a(mo35940a = "tagList")
    public List<String> tagList;
    @AbstractC2548a(mo35940a = "tagRequired")
    public int tagRequired;
    @AbstractC2548a(mo35940a = "value")
    public int value;

    public int getCommentRequired() {
        return this.commentRequired;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getTagList() {
        return this.tagList;
    }

    public int getTagRequired() {
        return this.tagRequired;
    }

    public int getValue() {
        return this.value;
    }

    public void setTagList(List<String> list) {
        this.tagList = list;
    }
}
