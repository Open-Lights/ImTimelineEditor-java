package com.github.qpcrummer.data;

public class BasicBeatComponent implements EditorComponent {
    private int startPos;
    private int endPos;
    private short channel;
    private boolean visible = true;
    private final ComponentType type;

    public BasicBeatComponent(ComponentType type) {
        this.type = type;
    }

    @Override
    public int getStartMillisecondPos() {
        return this.startPos;
    }

    @Override
    public void setStartMillisecondPos(int pos) {
        this.startPos = pos;
    }

    @Override
    public int getEndMillisecondPos() {
        return this.endPos;
    }

    @Override
    public void setEndMillisecondPos(int pos) {
        this.endPos = pos;
    }

    @Override
    public short getChannel() {
        return channel;
    }

    @Override
    public void setChannel(short channels) {
        this.channel = channels;
    }

    @Override
    public boolean visible() {
        return this.visible;
    }

    @Override
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public ComponentType getType() {
        return this.type;
    }

    @Override
    public void render() {

    }
}
