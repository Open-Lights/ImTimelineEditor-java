package com.github.qpcrummer.data;

public interface Channel {
    void render();
    boolean muted(); // Also the same as hidden
    void setMuted(boolean muted);
}
