package com.qiyukf.nim.uikit.common.p145a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.qiyukf.nim.uikit.common.a.f */
public abstract class AbstractC1883f<T> implements AbstractC1878a {
    public C1881d adapter;
    public Context context;
    public int position;
    public View view;

    public void destroy() {
    }

    public <T extends View> T findView(int i) {
        return (T) this.view.findViewById(i);
    }

    public C1881d getAdapter() {
        return this.adapter;
    }

    public abstract int getResId();

    public View getView(LayoutInflater layoutInflater) {
        this.view = layoutInflater.inflate(getResId(), (ViewGroup) null);
        inflate();
        return this.view;
    }

    public abstract void inflate();

    public boolean isFirstItem() {
        return this.position == 0;
    }

    public boolean isLastItem() {
        return this.position == this.adapter.getCount() - 1;
    }

    public boolean mutable() {
        return this.adapter.mo34144b();
    }

    public void onImmutable() {
    }

    public void reclaim() {
    }

    public abstract void refresh(T t);

    public void setAdapter(C1881d dVar) {
        this.adapter = dVar;
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void setPosition(int i) {
        this.position = i;
    }
}
