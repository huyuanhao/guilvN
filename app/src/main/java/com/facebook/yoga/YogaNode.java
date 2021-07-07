package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

@DoNotStrip
public class YogaNode implements Cloneable {
    public static final int BORDER = 4;
    public static final int MARGIN = 1;
    public static final int PADDING = 2;
    public YogaBaselineFunction mBaselineFunction;
    @DoNotStrip
    public float mBorderBottom = 0.0f;
    @DoNotStrip
    public float mBorderLeft = 0.0f;
    @DoNotStrip
    public float mBorderRight = 0.0f;
    @DoNotStrip
    public float mBorderTop = 0.0f;
    @Nullable
    public List<YogaNode> mChildren;
    public Object mData;
    @DoNotStrip
    public boolean mDoesLegacyStretchFlagAffectsLayout = false;
    @DoNotStrip
    public int mEdgeSetFlag = 0;
    @DoNotStrip
    public boolean mHasNewLayout = true;
    public boolean mHasSetPosition = false;
    @DoNotStrip
    public float mHeight = Float.NaN;
    @DoNotStrip
    public int mLayoutDirection = 0;
    @DoNotStrip
    public float mLeft = Float.NaN;
    @DoNotStrip
    public float mMarginBottom = 0.0f;
    @DoNotStrip
    public float mMarginLeft = 0.0f;
    @DoNotStrip
    public float mMarginRight = 0.0f;
    @DoNotStrip
    public float mMarginTop = 0.0f;
    public YogaMeasureFunction mMeasureFunction;
    public long mNativePointer;
    public YogaNode mOwner;
    @DoNotStrip
    public float mPaddingBottom = 0.0f;
    @DoNotStrip
    public float mPaddingLeft = 0.0f;
    @DoNotStrip
    public float mPaddingRight = 0.0f;
    @DoNotStrip
    public float mPaddingTop = 0.0f;
    @DoNotStrip
    public float mTop = Float.NaN;
    @DoNotStrip
    public float mWidth = Float.NaN;

    /* renamed from: com.facebook.yoga.YogaNode$1 */
    public static /* synthetic */ class C09041 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaEdge;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.yoga.YogaEdge[] r0 = com.facebook.yoga.YogaEdge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.yoga.YogaNode.C09041.$SwitchMap$com$facebook$yoga$YogaEdge = r0
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.yoga.YogaNode.C09041.$SwitchMap$com$facebook$yoga$YogaEdge     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.TOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.yoga.YogaNode.C09041.$SwitchMap$com$facebook$yoga$YogaEdge     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.facebook.yoga.YogaNode.C09041.$SwitchMap$com$facebook$yoga$YogaEdge     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.facebook.yoga.YogaNode.C09041.$SwitchMap$com$facebook$yoga$YogaEdge     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.facebook.yoga.YogaNode.C09041.$SwitchMap$com$facebook$yoga$YogaEdge     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNode.C09041.<clinit>():void");
        }
    }

    static {
        SoLoader.loadLibrary("yoga");
    }

    public YogaNode() {
        long jni_YGNodeNew = jni_YGNodeNew();
        this.mNativePointer = jni_YGNodeNew;
        if (jni_YGNodeNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    private void clearChildren() {
        this.mChildren = null;
        jni_YGNodeClearChildren(this.mNativePointer);
    }

    public static native void jni_YGNodeCalculateLayout(long j, float f, float f2);

    public static native void jni_YGNodeClearChildren(long j);

    private native long jni_YGNodeClone(long j, Object obj);

    public static native void jni_YGNodeCopyStyle(long j, long j2);

    public static native void jni_YGNodeFree(long j);

    public static native int jni_YGNodeGetInstanceCount();

    public static native void jni_YGNodeInsertChild(long j, long j2, int i);

    public static native boolean jni_YGNodeIsDirty(long j);

    public static native boolean jni_YGNodeIsReferenceBaseline(long j);

    public static native void jni_YGNodeMarkDirty(long j);

    public static native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long j);

    private native long jni_YGNodeNew();

    private native long jni_YGNodeNewWithConfig(long j);

    public static native void jni_YGNodePrint(long j);

    public static native void jni_YGNodeRemoveChild(long j, long j2);

    public static native void jni_YGNodeReset(long j);

    public static native void jni_YGNodeSetHasBaselineFunc(long j, boolean z);

    public static native void jni_YGNodeSetHasMeasureFunc(long j, boolean z);

    public static native void jni_YGNodeSetIsReferenceBaseline(long j, boolean z);

    public static native void jni_YGNodeSetOwner(long j, long j2);

    public static native int jni_YGNodeStyleGetAlignContent(long j);

    public static native int jni_YGNodeStyleGetAlignItems(long j);

    public static native int jni_YGNodeStyleGetAlignSelf(long j);

    public static native float jni_YGNodeStyleGetAspectRatio(long j);

    public static native float jni_YGNodeStyleGetBorder(long j, int i);

    public static native int jni_YGNodeStyleGetDirection(long j);

    public static native int jni_YGNodeStyleGetDisplay(long j);

    public static native Object jni_YGNodeStyleGetFlexBasis(long j);

    public static native int jni_YGNodeStyleGetFlexDirection(long j);

    public static native float jni_YGNodeStyleGetFlexGrow(long j);

    public static native float jni_YGNodeStyleGetFlexShrink(long j);

    public static native Object jni_YGNodeStyleGetHeight(long j);

    public static native int jni_YGNodeStyleGetJustifyContent(long j);

    public static native Object jni_YGNodeStyleGetMargin(long j, int i);

    public static native Object jni_YGNodeStyleGetMaxHeight(long j);

    public static native Object jni_YGNodeStyleGetMaxWidth(long j);

    public static native Object jni_YGNodeStyleGetMinHeight(long j);

    public static native Object jni_YGNodeStyleGetMinWidth(long j);

    public static native int jni_YGNodeStyleGetOverflow(long j);

    public static native Object jni_YGNodeStyleGetPadding(long j, int i);

    public static native Object jni_YGNodeStyleGetPosition(long j, int i);

    public static native int jni_YGNodeStyleGetPositionType(long j);

    public static native Object jni_YGNodeStyleGetWidth(long j);

    public static native void jni_YGNodeStyleSetAlignContent(long j, int i);

    public static native void jni_YGNodeStyleSetAlignItems(long j, int i);

    public static native void jni_YGNodeStyleSetAlignSelf(long j, int i);

    public static native void jni_YGNodeStyleSetAspectRatio(long j, float f);

    public static native void jni_YGNodeStyleSetBorder(long j, int i, float f);

    public static native void jni_YGNodeStyleSetDirection(long j, int i);

    public static native void jni_YGNodeStyleSetDisplay(long j, int i);

    public static native void jni_YGNodeStyleSetFlex(long j, float f);

    public static native void jni_YGNodeStyleSetFlexBasis(long j, float f);

    public static native void jni_YGNodeStyleSetFlexBasisAuto(long j);

    public static native void jni_YGNodeStyleSetFlexBasisPercent(long j, float f);

    public static native void jni_YGNodeStyleSetFlexDirection(long j, int i);

    public static native void jni_YGNodeStyleSetFlexGrow(long j, float f);

    public static native void jni_YGNodeStyleSetFlexShrink(long j, float f);

    public static native void jni_YGNodeStyleSetFlexWrap(long j, int i);

    public static native void jni_YGNodeStyleSetHeight(long j, float f);

    public static native void jni_YGNodeStyleSetHeightAuto(long j);

    public static native void jni_YGNodeStyleSetHeightPercent(long j, float f);

    public static native void jni_YGNodeStyleSetJustifyContent(long j, int i);

    public static native void jni_YGNodeStyleSetMargin(long j, int i, float f);

    public static native void jni_YGNodeStyleSetMarginAuto(long j, int i);

    public static native void jni_YGNodeStyleSetMarginPercent(long j, int i, float f);

    public static native void jni_YGNodeStyleSetMaxHeight(long j, float f);

    public static native void jni_YGNodeStyleSetMaxHeightPercent(long j, float f);

    public static native void jni_YGNodeStyleSetMaxWidth(long j, float f);

    public static native void jni_YGNodeStyleSetMaxWidthPercent(long j, float f);

    public static native void jni_YGNodeStyleSetMinHeight(long j, float f);

    public static native void jni_YGNodeStyleSetMinHeightPercent(long j, float f);

    public static native void jni_YGNodeStyleSetMinWidth(long j, float f);

    public static native void jni_YGNodeStyleSetMinWidthPercent(long j, float f);

    public static native void jni_YGNodeStyleSetOverflow(long j, int i);

    public static native void jni_YGNodeStyleSetPadding(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPaddingPercent(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPosition(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPositionPercent(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPositionType(long j, int i);

    public static native void jni_YGNodeStyleSetWidth(long j, float f);

    public static native void jni_YGNodeStyleSetWidthAuto(long j);

    public static native void jni_YGNodeStyleSetWidthPercent(long j, float f);

    @DoNotStrip
    private final long replaceChild(YogaNode yogaNode, int i) {
        List<YogaNode> list = this.mChildren;
        if (list != null) {
            list.remove(i);
            this.mChildren.add(i, yogaNode);
            yogaNode.mOwner = this;
            return yogaNode.mNativePointer;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    public void addChildAt(YogaNode yogaNode, int i) {
        if (yogaNode.mOwner == null) {
            if (this.mChildren == null) {
                this.mChildren = new ArrayList(4);
            }
            this.mChildren.add(i, yogaNode);
            yogaNode.mOwner = this;
            jni_YGNodeInsertChild(this.mNativePointer, yogaNode.mNativePointer, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    @DoNotStrip
    public final float baseline(float f, float f2) {
        return this.mBaselineFunction.baseline(this, f, f2);
    }

    public void calculateLayout(float f, float f2) {
        jni_YGNodeCalculateLayout(this.mNativePointer, f, f2);
    }

    public YogaNode cloneWithNewChildren() {
        try {
            YogaNode yogaNode = (YogaNode) super.clone();
            long jni_YGNodeClone = jni_YGNodeClone(this.mNativePointer, yogaNode);
            yogaNode.mOwner = null;
            yogaNode.mNativePointer = jni_YGNodeClone;
            yogaNode.clearChildren();
            return yogaNode;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void copyStyle(YogaNode yogaNode) {
        jni_YGNodeCopyStyle(this.mNativePointer, yogaNode.mNativePointer);
    }

    public void dirty() {
        jni_YGNodeMarkDirty(this.mNativePointer);
    }

    public void dirtyAllDescendants() {
        jni_YGNodeMarkDirtyAndPropogateToDescendants(this.mNativePointer);
    }

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        try {
            freeNatives();
        } finally {
            super.finalize();
        }
    }

    public void freeNatives() {
        long j = this.mNativePointer;
        if (j > 0) {
            this.mNativePointer = 0;
            jni_YGNodeFree(j);
        }
    }

    public YogaAlign getAlignContent() {
        return YogaAlign.fromInt(jni_YGNodeStyleGetAlignContent(this.mNativePointer));
    }

    public YogaAlign getAlignItems() {
        return YogaAlign.fromInt(jni_YGNodeStyleGetAlignItems(this.mNativePointer));
    }

    public YogaAlign getAlignSelf() {
        return YogaAlign.fromInt(jni_YGNodeStyleGetAlignSelf(this.mNativePointer));
    }

    public float getAspectRatio() {
        return jni_YGNodeStyleGetAspectRatio(this.mNativePointer);
    }

    public float getBorder(YogaEdge yogaEdge) {
        if ((this.mEdgeSetFlag & 4) != 4) {
            return Float.NaN;
        }
        return jni_YGNodeStyleGetBorder(this.mNativePointer, yogaEdge.intValue());
    }

    public YogaNode getChildAt(int i) {
        List<YogaNode> list = this.mChildren;
        if (list != null) {
            return list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    public int getChildCount() {
        List<YogaNode> list = this.mChildren;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object getData() {
        return this.mData;
    }

    public YogaDisplay getDisplay() {
        return YogaDisplay.fromInt(jni_YGNodeStyleGetDisplay(this.mNativePointer));
    }

    public boolean getDoesLegacyStretchFlagAffectsLayout() {
        return this.mDoesLegacyStretchFlagAffectsLayout;
    }

    public YogaValue getFlexBasis() {
        return (YogaValue) jni_YGNodeStyleGetFlexBasis(this.mNativePointer);
    }

    public YogaFlexDirection getFlexDirection() {
        return YogaFlexDirection.fromInt(jni_YGNodeStyleGetFlexDirection(this.mNativePointer));
    }

    public float getFlexGrow() {
        return jni_YGNodeStyleGetFlexGrow(this.mNativePointer);
    }

    public float getFlexShrink() {
        return jni_YGNodeStyleGetFlexShrink(this.mNativePointer);
    }

    public YogaValue getHeight() {
        return (YogaValue) jni_YGNodeStyleGetHeight(this.mNativePointer);
    }

    public YogaJustify getJustifyContent() {
        return YogaJustify.fromInt(jni_YGNodeStyleGetJustifyContent(this.mNativePointer));
    }

    public float getLayoutBorder(YogaEdge yogaEdge) {
        switch (C09041.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.mBorderLeft;
            case 2:
                return this.mBorderTop;
            case 3:
                return this.mBorderRight;
            case 4:
                return this.mBorderBottom;
            case 5:
                return getLayoutDirection() == YogaDirection.RTL ? this.mBorderRight : this.mBorderLeft;
            case 6:
                return getLayoutDirection() == YogaDirection.RTL ? this.mBorderLeft : this.mBorderRight;
            default:
                throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
        }
    }

    public YogaDirection getLayoutDirection() {
        return YogaDirection.fromInt(this.mLayoutDirection);
    }

    public float getLayoutHeight() {
        return this.mHeight;
    }

    public float getLayoutMargin(YogaEdge yogaEdge) {
        switch (C09041.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.mMarginLeft;
            case 2:
                return this.mMarginTop;
            case 3:
                return this.mMarginRight;
            case 4:
                return this.mMarginBottom;
            case 5:
                return getLayoutDirection() == YogaDirection.RTL ? this.mMarginRight : this.mMarginLeft;
            case 6:
                return getLayoutDirection() == YogaDirection.RTL ? this.mMarginLeft : this.mMarginRight;
            default:
                throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        }
    }

    public float getLayoutPadding(YogaEdge yogaEdge) {
        switch (C09041.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.mPaddingLeft;
            case 2:
                return this.mPaddingTop;
            case 3:
                return this.mPaddingRight;
            case 4:
                return this.mPaddingBottom;
            case 5:
                return getLayoutDirection() == YogaDirection.RTL ? this.mPaddingRight : this.mPaddingLeft;
            case 6:
                return getLayoutDirection() == YogaDirection.RTL ? this.mPaddingLeft : this.mPaddingRight;
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    public float getLayoutWidth() {
        return this.mWidth;
    }

    public float getLayoutX() {
        return this.mLeft;
    }

    public float getLayoutY() {
        return this.mTop;
    }

    public YogaValue getMargin(YogaEdge yogaEdge) {
        if ((this.mEdgeSetFlag & 1) != 1) {
            return YogaValue.UNDEFINED;
        }
        return (YogaValue) jni_YGNodeStyleGetMargin(this.mNativePointer, yogaEdge.intValue());
    }

    public YogaValue getMaxHeight() {
        return (YogaValue) jni_YGNodeStyleGetMaxHeight(this.mNativePointer);
    }

    public YogaValue getMaxWidth() {
        return (YogaValue) jni_YGNodeStyleGetMaxWidth(this.mNativePointer);
    }

    public YogaValue getMinHeight() {
        return (YogaValue) jni_YGNodeStyleGetMinHeight(this.mNativePointer);
    }

    public YogaValue getMinWidth() {
        return (YogaValue) jni_YGNodeStyleGetMinWidth(this.mNativePointer);
    }

    public YogaOverflow getOverflow() {
        return YogaOverflow.fromInt(jni_YGNodeStyleGetOverflow(this.mNativePointer));
    }

    @Nullable
    public YogaNode getOwner() {
        return this.mOwner;
    }

    public YogaValue getPadding(YogaEdge yogaEdge) {
        if ((this.mEdgeSetFlag & 2) != 2) {
            return YogaValue.UNDEFINED;
        }
        return (YogaValue) jni_YGNodeStyleGetPadding(this.mNativePointer, yogaEdge.intValue());
    }

    @Nullable
    @Deprecated
    public YogaNode getParent() {
        return getOwner();
    }

    public YogaValue getPosition(YogaEdge yogaEdge) {
        if (!this.mHasSetPosition) {
            return YogaValue.UNDEFINED;
        }
        return (YogaValue) jni_YGNodeStyleGetPosition(this.mNativePointer, yogaEdge.intValue());
    }

    public YogaPositionType getPositionType() {
        return YogaPositionType.fromInt(jni_YGNodeStyleGetPositionType(this.mNativePointer));
    }

    public YogaDirection getStyleDirection() {
        return YogaDirection.fromInt(jni_YGNodeStyleGetDirection(this.mNativePointer));
    }

    public YogaValue getWidth() {
        return (YogaValue) jni_YGNodeStyleGetWidth(this.mNativePointer);
    }

    public boolean hasNewLayout() {
        return this.mHasNewLayout;
    }

    public int indexOf(YogaNode yogaNode) {
        List<YogaNode> list = this.mChildren;
        if (list == null) {
            return -1;
        }
        return list.indexOf(yogaNode);
    }

    public boolean isDirty() {
        return jni_YGNodeIsDirty(this.mNativePointer);
    }

    public boolean isMeasureDefined() {
        return this.mMeasureFunction != null;
    }

    public boolean isReferenceBaseline() {
        return jni_YGNodeIsReferenceBaseline(this.mNativePointer);
    }

    public void markLayoutSeen() {
        this.mHasNewLayout = false;
    }

    @DoNotStrip
    public final long measure(float f, int i, float f2, int i2) {
        if (isMeasureDefined()) {
            return this.mMeasureFunction.measure(this, f, YogaMeasureMode.fromInt(i), f2, YogaMeasureMode.fromInt(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    public void print() {
        jni_YGNodePrint(this.mNativePointer);
    }

    public YogaNode removeChildAt(int i) {
        List<YogaNode> list = this.mChildren;
        if (list != null) {
            YogaNode remove = list.remove(i);
            remove.mOwner = null;
            jni_YGNodeRemoveChild(this.mNativePointer, remove.mNativePointer);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    public void reset() {
        this.mEdgeSetFlag = 0;
        this.mHasSetPosition = false;
        this.mHasNewLayout = true;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mMeasureFunction = null;
        this.mBaselineFunction = null;
        this.mData = null;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
        jni_YGNodeReset(this.mNativePointer);
    }

    public void setAlignContent(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignContent(this.mNativePointer, yogaAlign.intValue());
    }

    public void setAlignItems(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignItems(this.mNativePointer, yogaAlign.intValue());
    }

    public void setAlignSelf(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignSelf(this.mNativePointer, yogaAlign.intValue());
    }

    public void setAspectRatio(float f) {
        jni_YGNodeStyleSetAspectRatio(this.mNativePointer, f);
    }

    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.mBaselineFunction = yogaBaselineFunction;
        jni_YGNodeSetHasBaselineFunc(this.mNativePointer, yogaBaselineFunction != null);
    }

    public void setBorder(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 4;
        jni_YGNodeStyleSetBorder(this.mNativePointer, yogaEdge.intValue(), f);
    }

    public void setData(Object obj) {
        this.mData = obj;
    }

    public void setDirection(YogaDirection yogaDirection) {
        jni_YGNodeStyleSetDirection(this.mNativePointer, yogaDirection.intValue());
    }

    public void setDisplay(YogaDisplay yogaDisplay) {
        jni_YGNodeStyleSetDisplay(this.mNativePointer, yogaDisplay.intValue());
    }

    public void setFlex(float f) {
        jni_YGNodeStyleSetFlex(this.mNativePointer, f);
    }

    public void setFlexBasis(float f) {
        jni_YGNodeStyleSetFlexBasis(this.mNativePointer, f);
    }

    public void setFlexBasisAuto() {
        jni_YGNodeStyleSetFlexBasisAuto(this.mNativePointer);
    }

    public void setFlexBasisPercent(float f) {
        jni_YGNodeStyleSetFlexBasisPercent(this.mNativePointer, f);
    }

    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        jni_YGNodeStyleSetFlexDirection(this.mNativePointer, yogaFlexDirection.intValue());
    }

    public void setFlexGrow(float f) {
        jni_YGNodeStyleSetFlexGrow(this.mNativePointer, f);
    }

    public void setFlexShrink(float f) {
        jni_YGNodeStyleSetFlexShrink(this.mNativePointer, f);
    }

    public void setHeight(float f) {
        jni_YGNodeStyleSetHeight(this.mNativePointer, f);
    }

    public void setHeightAuto() {
        jni_YGNodeStyleSetHeightAuto(this.mNativePointer);
    }

    public void setHeightPercent(float f) {
        jni_YGNodeStyleSetHeightPercent(this.mNativePointer, f);
    }

    public void setIsReferenceBaseline(boolean z) {
        jni_YGNodeSetIsReferenceBaseline(this.mNativePointer, z);
    }

    public void setJustifyContent(YogaJustify yogaJustify) {
        jni_YGNodeStyleSetJustifyContent(this.mNativePointer, yogaJustify.intValue());
    }

    public void setMargin(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMargin(this.mNativePointer, yogaEdge.intValue(), f);
    }

    public void setMarginAuto(YogaEdge yogaEdge) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMarginAuto(this.mNativePointer, yogaEdge.intValue());
    }

    public void setMarginPercent(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMarginPercent(this.mNativePointer, yogaEdge.intValue(), f);
    }

    public void setMaxHeight(float f) {
        jni_YGNodeStyleSetMaxHeight(this.mNativePointer, f);
    }

    public void setMaxHeightPercent(float f) {
        jni_YGNodeStyleSetMaxHeightPercent(this.mNativePointer, f);
    }

    public void setMaxWidth(float f) {
        jni_YGNodeStyleSetMaxWidth(this.mNativePointer, f);
    }

    public void setMaxWidthPercent(float f) {
        jni_YGNodeStyleSetMaxWidthPercent(this.mNativePointer, f);
    }

    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        this.mMeasureFunction = yogaMeasureFunction;
        jni_YGNodeSetHasMeasureFunc(this.mNativePointer, yogaMeasureFunction != null);
    }

    public void setMinHeight(float f) {
        jni_YGNodeStyleSetMinHeight(this.mNativePointer, f);
    }

    public void setMinHeightPercent(float f) {
        jni_YGNodeStyleSetMinHeightPercent(this.mNativePointer, f);
    }

    public void setMinWidth(float f) {
        jni_YGNodeStyleSetMinWidth(this.mNativePointer, f);
    }

    public void setMinWidthPercent(float f) {
        jni_YGNodeStyleSetMinWidthPercent(this.mNativePointer, f);
    }

    public void setOverflow(YogaOverflow yogaOverflow) {
        jni_YGNodeStyleSetOverflow(this.mNativePointer, yogaOverflow.intValue());
    }

    public void setPadding(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPadding(this.mNativePointer, yogaEdge.intValue(), f);
    }

    public void setPaddingPercent(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPaddingPercent(this.mNativePointer, yogaEdge.intValue(), f);
    }

    public void setPosition(YogaEdge yogaEdge, float f) {
        this.mHasSetPosition = true;
        jni_YGNodeStyleSetPosition(this.mNativePointer, yogaEdge.intValue(), f);
    }

    public void setPositionPercent(YogaEdge yogaEdge, float f) {
        this.mHasSetPosition = true;
        jni_YGNodeStyleSetPositionPercent(this.mNativePointer, yogaEdge.intValue(), f);
    }

    public void setPositionType(YogaPositionType yogaPositionType) {
        jni_YGNodeStyleSetPositionType(this.mNativePointer, yogaPositionType.intValue());
    }

    public void setWidth(float f) {
        jni_YGNodeStyleSetWidth(this.mNativePointer, f);
    }

    public void setWidthAuto() {
        jni_YGNodeStyleSetWidthAuto(this.mNativePointer);
    }

    public void setWidthPercent(float f) {
        jni_YGNodeStyleSetWidthPercent(this.mNativePointer, f);
    }

    public void setWrap(YogaWrap yogaWrap) {
        jni_YGNodeStyleSetFlexWrap(this.mNativePointer, yogaWrap.intValue());
    }

    @Override // java.lang.Object
    public YogaNode clone() {
        try {
            YogaNode yogaNode = (YogaNode) super.clone();
            long jni_YGNodeClone = jni_YGNodeClone(this.mNativePointer, yogaNode);
            if (this.mChildren != null) {
                for (YogaNode yogaNode2 : this.mChildren) {
                    jni_YGNodeSetOwner(yogaNode2.mNativePointer, 0);
                    yogaNode2.mOwner = null;
                }
            }
            yogaNode.mNativePointer = jni_YGNodeClone;
            yogaNode.mOwner = null;
            List<YogaNode> list = this.mChildren != null ? (List) ((ArrayList) this.mChildren).clone() : null;
            yogaNode.mChildren = list;
            if (list != null) {
                for (YogaNode yogaNode3 : list) {
                    yogaNode3.mOwner = null;
                }
            }
            return yogaNode;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public YogaNode(YogaConfig yogaConfig) {
        long jni_YGNodeNewWithConfig = jni_YGNodeNewWithConfig(yogaConfig.mNativePointer);
        this.mNativePointer = jni_YGNodeNewWithConfig;
        if (jni_YGNodeNewWithConfig == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }
}
