package com.github.qpcrummer;

import com.github.qpcrummer.timeline.ImTimelineEditor;
import imgui.app.Application;
import imgui.app.Configuration;

public class Main extends Application {
    private final ImTimelineEditor editor = new ImTimelineEditor();
    public static void main(String[] args) {
        launch(new Main());
    }

    @Override
    public void process() {
        this.editor.render();
    }

    @Override
    protected void configure(Configuration config) {
        super.configure(config);
        config.setHeight(1080);
        config.setWidth(1920);
    }
}