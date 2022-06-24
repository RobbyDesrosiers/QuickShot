package com.quickshot.quickshot;

import javafx.scene.control.ButtonBar;
import javafx.scene.control.ToolBar;
import javafx.scene.shape.Rectangle;


public class ViewfinderWidgetBar extends ToolBar implements DisplayElement {
    private final ViewfinderBoundingBox boundingBox;

    public ViewfinderWidgetBar(ViewfinderBoundingBox boundingBox) {
        this.boundingBox = boundingBox;

    }

    private void calculateScreenPosition() {
        double Y_PADDING = 5;
        setWidth(100);
        setHeight(20);
        setTranslateX(boundingBox.getBottomRight().getX() - getWidth());
        setTranslateY(boundingBox.getBottomMiddle().getY() + Y_PADDING);
        setTranslateZ(-1);
    }

    @Override
    public void update() {
        calculateScreenPosition();
    }
}
