package com.facebook.react.animated;

import com.facebook.infer.annotation.Assertions;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public abstract class AnimatedNode {
    public static final int DEFAULT_ANIMATED_NODE_CHILD_COUNT = 1;
    public static final int INITIAL_BFS_COLOR = 0;
    public int mActiveIncomingNodes = 0;
    public int mBFSColor = 0;
    @Nullable
    public List<AnimatedNode> mChildren;
    public int mTag = -1;

    public final void addChild(AnimatedNode animatedNode) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList(1);
        }
        ((List) Assertions.assertNotNull(this.mChildren)).add(animatedNode);
        animatedNode.onAttachedToNode(this);
    }

    public void onAttachedToNode(AnimatedNode animatedNode) {
    }

    public void onDetachedFromNode(AnimatedNode animatedNode) {
    }

    public final void removeChild(AnimatedNode animatedNode) {
        if (this.mChildren != null) {
            animatedNode.onDetachedFromNode(this);
            this.mChildren.remove(animatedNode);
        }
    }

    public void update() {
    }
}
