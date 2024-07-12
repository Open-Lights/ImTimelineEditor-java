package com.github.qpcrummer.data;

import java.util.ArrayList;
import java.util.List;

public class LightChannel implements Channel {
    private boolean hidden;
    private final List<EditorComponent> components = new ArrayList<>();

    @Override
    public void render() {

    }

    @Override
    public boolean muted() {
        return this.hidden;
    }

    @Override
    public void setMuted(boolean muted) {
        this.hidden = muted;
    }
}
