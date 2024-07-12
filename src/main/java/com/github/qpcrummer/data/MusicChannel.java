package com.github.qpcrummer.data;

public class MusicChannel implements Channel {
    private boolean muted;
    @Override
    public void render() {

    }

    @Override
    public boolean muted() {
        return this.muted;
    }

    @Override
    public void setMuted(boolean muted) {
        this.muted = muted;
    }
}
