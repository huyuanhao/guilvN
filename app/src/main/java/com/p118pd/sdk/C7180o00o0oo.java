package com.p118pd.sdk;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* renamed from: com.pd.sdk.o00o0oo  reason: case insensitive filesystem */
public class C7180o00o0oo extends AbstractC7185o00o0ooo {

    /* renamed from: com.pd.sdk.o00o0oo$OooO00o */
    public class OooO00o extends Transition.EpicenterCallback {
        public final /* synthetic */ Rect OooO00o;

        public OooO00o(Rect rect) {
            this.OooO00o = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.o00o0oo$OooO0O0 */
    public class OooO0O0 implements Transition.TransitionListener {
        public final /* synthetic */ View OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19625OooO00o;

        public OooO0O0(View view, ArrayList arrayList) {
            this.OooO00o = view;
            this.f19625OooO00o = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.OooO00o.setVisibility(8);
            int size = this.f19625OooO00o.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f19625OooO00o.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: com.pd.sdk.o00o0oo$OooO0OO */
    public class OooO0OO implements Transition.TransitionListener {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f19626OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19627OooO00o;
        public final /* synthetic */ Object OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19628OooO0O0;
        public final /* synthetic */ Object OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public final /* synthetic */ ArrayList f19629OooO0OO;

        public OooO0OO(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f19626OooO00o = obj;
            this.f19627OooO00o = arrayList;
            this.OooO0O0 = obj2;
            this.f19628OooO0O0 = arrayList2;
            this.OooO0OO = obj3;
            this.f19629OooO0OO = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f19626OooO00o;
            if (obj != null) {
                C7180o00o0oo.this.OooO00o(obj, this.f19627OooO00o, (ArrayList<View>) null);
            }
            Object obj2 = this.OooO0O0;
            if (obj2 != null) {
                C7180o00o0oo.this.OooO00o(obj2, this.f19628OooO0O0, (ArrayList<View>) null);
            }
            Object obj3 = this.OooO0OO;
            if (obj3 != null) {
                C7180o00o0oo.this.OooO00o(obj3, this.f19629OooO0OO, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: com.pd.sdk.o00o0oo$OooO0Oo  reason: case insensitive filesystem */
    public class C7181OooO0Oo extends Transition.EpicenterCallback {
        public final /* synthetic */ Rect OooO00o;

        public C7181OooO0Oo(Rect rect) {
            this.OooO00o = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.OooO00o;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.OooO00o;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo, com.p118pd.sdk.AbstractC7185o00o0ooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18675OooO00o(Object obj) {
        return obj instanceof Transition;
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public Object OooO0O0(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO0OO(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            OooO00o(view, rect);
            ((Transition) obj).setEpicenterCallback(new OooO00o(rect));
        }
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo, com.p118pd.sdk.AbstractC7185o00o0ooo
    public Object OooO00o(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO00o(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    OooO00o(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!OooO00o(transition) && AbstractC7185o00o0ooo.OooO00o((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO0O0(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC7185o00o0ooo.OooO00o(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        OooO00o(transitionSet, arrayList);
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public Object OooO0O0(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public static boolean OooO00o(Transition transition) {
        return !AbstractC7185o00o0ooo.OooO00o(transition.getTargetIds()) || !AbstractC7185o00o0ooo.OooO00o(transition.getTargetNames()) || !AbstractC7185o00o0ooo.OooO00o(transition.getTargetTypes());
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO0O0(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            OooO00o((Object) transitionSet, arrayList, arrayList2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO00o(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new OooO0O0(view, arrayList));
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public Object OooO00o(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO0O0(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO00o(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO00o(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new OooO0OO(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO00o(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                OooO00o((Object) transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!OooO00o(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO00o(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7185o00o0ooo
    public void OooO00o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C7181OooO0Oo(rect));
        }
    }
}
