package com.qiyukf.unicorn.api.customization.msg_list.baseviewholder;

import android.content.Context;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2433b;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.evaluation.EvaluationApi;
import com.qiyukf.unicorn.api.evaluation.entry.EvaluationOpenEntry;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2608d;

public abstract class EvaluationViewHolderBase extends UnicornMessageViewHolder {
    private EvaluationOpenEntry generateEntry(C2608d dVar) {
        EvaluationOpenEntry evaluationOpenEntry = new EvaluationOpenEntry();
        evaluationOpenEntry.setEvaluationEntryList(dVar.mo36173g().mo35962e());
        evaluationOpenEntry.setExchange(this.message.getSessionId());
        evaluationOpenEntry.setLastRemark(dVar.mo36171e());
        evaluationOpenEntry.setLastSource(dVar.mo36168c());
        evaluationOpenEntry.setSessionId(dVar.mo36170d());
        evaluationOpenEntry.setTitle(dVar.mo36173g().mo35960c());
        evaluationOpenEntry.setType(dVar.mo36173g().mo35961d());
        evaluationOpenEntry.setResolvedEnabled(dVar.mo36173g().mo35968k());
        evaluationOpenEntry.setResolvedRequired(dVar.mo36173g().mo35969l());
        return evaluationOpenEntry;
    }

    @Override // com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.UnicornMessageViewHolder
    public final void bindContentView(IMMessage iMMessage, Context context) {
        C2608d dVar = (C2608d) iMMessage.getAttachment();
        bindEvaluationMsgView(context, dVar.mo36167b(), dVar.mo36158a(context));
    }

    public abstract void bindEvaluationMsgView(Context context, boolean z, CharSequence charSequence);

    public final void evaluationBtnClinck() {
        if (C2433b.m5229a().mo35650b() != null) {
            C2433b.m5229a();
        } else {
            C2452d.m5375g().mo36350c().mo36315a(this.context, this.message);
        }
        if (EvaluationApi.getInstance().getOnEvaluationEventListener() != null) {
            EvaluationApi.getInstance().getOnEvaluationEventListener().onEvaluationMessageClick(generateEntry((C2608d) this.message.getAttachment()), this.context);
        } else {
            C2452d.m5375g().mo36350c().mo36315a(this.context, this.message);
        }
    }
}
