package com.vivo.push.cache.impl;

import android.content.Context;
import com.vivo.push.PushClientConstants;
import com.vivo.push.cache.AbstractC4101c;
import com.vivo.push.cache.ISubscribeAppTagManager;
import com.vivo.push.model.SubscribeAppInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.vivo.push.cache.impl.b */
public final class C4106b extends AbstractC4105a implements ISubscribeAppTagManager {
    public C4106b(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ArrayList<String> getSubscribeTags() {
        ArrayList<String> arrayList;
        synchronized (AbstractC4101c.sAppLock) {
            arrayList = new ArrayList<>();
            for (T t : this.mAppDatas) {
                if (t != null && t.getTargetStatus() == 1) {
                    arrayList.add(t.getName());
                }
            }
        }
        return arrayList;
    }

    @Override // com.vivo.push.cache.ISubscribeAppTagManager
    public final boolean delTags(Set<String> set) {
        boolean z = false;
        if (set == null) {
            return false;
        }
        synchronized (AbstractC4101c.sAppLock) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Iterator<T> it2 = this.mAppDatas.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (next2.getName().equals(next)) {
                        if (next2.getTargetStatus() == 2) {
                            it.remove();
                            break;
                        }
                        next2.setTargetStatus(2);
                        next2.setActualStatus(1);
                        z = true;
                    }
                }
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                hashSet.add(new SubscribeAppInfo(str, 2, 1));
            }
            if (hashSet.size() > 0) {
                addDatas(hashSet);
                z = true;
            } else if (z) {
                updateDataToSP(this.mAppDatas);
            }
        }
        return z;
    }

    @Override // com.vivo.push.cache.ISubscribeAppTagManager
    public final void delTagsSuccess(Set<String> set) {
        synchronized (AbstractC4101c.sAppLock) {
            boolean z = false;
            for (String str : set) {
                Iterator<T> it = this.mAppDatas.iterator();
                while (it.hasNext()) {
                    T next = it.next();
                    if (str.equals(next.getName()) && next.getActualStatus() != 2) {
                        if (next.getTargetStatus() == 2) {
                            it.remove();
                        } else {
                            next.setActualStatus(2);
                        }
                        z = true;
                    }
                }
            }
            if (z) {
                updateDataToSP(this.mAppDatas);
            }
        }
    }

    @Override // com.vivo.push.cache.AbstractC4101c
    public final String generateStrByType() {
        return PushClientConstants.PUSH_APP_TAGS;
    }

    @Override // com.vivo.push.cache.ISubscribeAppTagManager
    public final ArrayList<String> getRetrySubscribeAppInfo() {
        ArrayList<String> arrayList;
        synchronized (AbstractC4101c.sAppLock) {
            arrayList = new ArrayList<>();
            for (T t : this.mAppDatas) {
                if (!(t == null || t.getTargetStatus() != 1 || t.getTargetStatus() == t.getActualStatus())) {
                    arrayList.add(t.getName());
                }
            }
        }
        return arrayList;
    }

    @Override // com.vivo.push.cache.ISubscribeAppTagManager
    public final ArrayList<String> getRetryUnsubscribeAppInfo() {
        ArrayList<String> arrayList;
        synchronized (AbstractC4101c.sAppLock) {
            arrayList = new ArrayList<>();
            for (T t : this.mAppDatas) {
                if (!(t == null || t.getTargetStatus() != 2 || t.getTargetStatus() == t.getActualStatus())) {
                    arrayList.add(t.getName());
                }
            }
        }
        return arrayList;
    }

    @Override // com.vivo.push.cache.ISubscribeAppTagManager
    public final boolean setTags(Set<String> set) {
        boolean z = false;
        if (set == null) {
            return false;
        }
        synchronized (AbstractC4101c.sAppLock) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Iterator<T> it2 = this.mAppDatas.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (next2.getName().equals(next)) {
                        if (next2.getTargetStatus() == 1) {
                            it.remove();
                            break;
                        }
                        next2.setTargetStatus(1);
                        next2.setActualStatus(2);
                        z = true;
                    }
                }
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                hashSet.add(new SubscribeAppInfo(str, 1, 2));
            }
            if (hashSet.size() > 0) {
                addDatas(hashSet);
                z = true;
            } else if (z) {
                updateDataToSP(this.mAppDatas);
            }
        }
        return z;
    }

    @Override // com.vivo.push.cache.ISubscribeAppTagManager
    public final void setTagsSuccess(Set<String> set) {
        synchronized (AbstractC4101c.sAppLock) {
            boolean z = false;
            for (String str : set) {
                for (T t : this.mAppDatas) {
                    if (str.equals(t.getName()) && t.getActualStatus() != 1) {
                        t.setActualStatus(1);
                        z = true;
                    }
                }
            }
            if (z) {
                updateDataToSP(this.mAppDatas);
            }
        }
    }
}
