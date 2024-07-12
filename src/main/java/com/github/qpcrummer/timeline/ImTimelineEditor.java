package com.github.qpcrummer.timeline;

import com.github.qpcrummer.data.LightChannel;
import com.github.qpcrummer.data.MusicChannel;
import imgui.ImGui;

import java.util.ArrayList;
import java.util.List;

public class ImTimelineEditor {
    public float titleColumnWidth = 100;
    public float testRowHeight = 50;
    public final List<LightChannel> lightChannels = new ArrayList<>();
    public final List<MusicChannel> musicChannels = new ArrayList<>();

    public void render() {
        ImGui.setNextWindowPos(0, 0);
        ImGui.setNextWindowSize(1920, 1080);
        ImGui.begin("ImTimelineEditor");
        renderImTimelineEditor(1000, 600);
        ImGui.end();
    }

    private void renderImTimelineEditor(float width, float height) {
        // First column with set width
        ImGui.beginChild("EditingWindow", width, height, true);
        ImGui.text("Column 1 - Set Width");

        // Add content for the first column here
        // Add multiple rows with a set height
        for (LightChannel channel : this.lightChannels) {
            ImGui.beginChild("Row", width, testRowHeight, false);
            ImGui.text("Row Content");

            // TODO Add Sequencer rendering in here
            channel.render();

            ImGui.endChild();
            ImGui.separator(); // Add a divider between rows
        }

        ImGui.endChild();
    }
}
