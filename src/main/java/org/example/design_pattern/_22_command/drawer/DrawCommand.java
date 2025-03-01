package org.example.design_pattern._22_command.drawer;

import org.example.design_pattern._22_command.command.Command;

import java.awt.*;

public class DrawCommand implements Command {
    protected Drawable drawable;

    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
