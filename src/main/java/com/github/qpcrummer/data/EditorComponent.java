package com.github.qpcrummer.data;

public interface EditorComponent {
    int getStartMillisecondPos();
    void setStartMillisecondPos(int pos);
    int getEndMillisecondPos();
    void setEndMillisecondPos(int pos);
    short getChannel();
    void setChannel(short channels);
    boolean visible();
    void setVisible(boolean visible);
    ComponentType getType();
    void render();
    default boolean isNotCulled(int lowestMillisecond, int highestMillisecond) {
        int startMillisecond = getStartMillisecondPos();
        int endMillisecond = getEndMillisecondPos();

        // Case 1: The startPos is between the lowest and highest ms
        if (startMillisecond >= lowestMillisecond && startMillisecond <= highestMillisecond) {
            return true;
        }

        // Case 2: The endPos is between the lowest and highest ms
        if (endMillisecond >= lowestMillisecond && endMillisecond <= highestMillisecond) {
            return true;
        }

        // Case 3: The startPos is before the lowest ms, and the endPos is past the highest ms
        return startMillisecond < lowestMillisecond && endMillisecond > highestMillisecond;
    }
}
