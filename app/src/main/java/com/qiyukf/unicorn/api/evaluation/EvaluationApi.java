package com.qiyukf.unicorn.api.evaluation;

import android.content.Context;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.evaluation.entry.EvaluationOpenEntry;
import java.util.List;

public class EvaluationApi {
    public OnEvaluationEventListener onEvaluationEventListener;

    public static abstract class OnEvaluationEventListener {
        public void onEvaluationMessageClick(EvaluationOpenEntry evaluationOpenEntry, Context context) {
        }

        public void onEvaluationStateChange(int i) {
        }
    }

    public static class SingletonHolder {
        public static final EvaluationApi sInstance = new EvaluationApi();
    }

    public static EvaluationApi getInstance() {
        return SingletonHolder.sInstance;
    }

    public void evaluate(String str, long j, int i, String str2, List<String> list, String str3, int i2, RequestCallbackWrapper<String> requestCallbackWrapper) {
        C2452d.m5375g().mo36350c().mo36320a(str, j, i, str2, list, i2, requestCallbackWrapper);
    }

    public OnEvaluationEventListener getOnEvaluationEventListener() {
        return this.onEvaluationEventListener;
    }

    public void setOnEvaluationEventListener(OnEvaluationEventListener onEvaluationEventListener2) {
        this.onEvaluationEventListener = onEvaluationEventListener2;
    }
}
