package com.qiyukf.unicorn.api.pop;

import androidx.annotation.DrawableRes;
import java.io.Serializable;

public class SessionListEntrance implements Serializable {
    @DrawableRes
    public int imageResId;
    public Position position;

    public static class Builder {
        public SessionListEntrance sessionListEntrance = new SessionListEntrance();

        public SessionListEntrance build() {
            return this.sessionListEntrance;
        }

        public Builder setImageResId(@DrawableRes int i) {
            this.sessionListEntrance.imageResId = i;
            return this;
        }

        public Builder setPosition(Position position) {
            this.sessionListEntrance.position = position;
            return this;
        }
    }

    public enum Position {
        TOP_LEFT,
        TOP_RIGHT
    }

    public SessionListEntrance() {
    }

    @DrawableRes
    public int getImageResId() {
        return this.imageResId;
    }

    public Position getPosition() {
        return this.position;
    }
}
