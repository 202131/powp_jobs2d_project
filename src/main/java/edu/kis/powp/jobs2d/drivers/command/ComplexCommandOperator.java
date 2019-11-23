package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommandOperator {
    private ComplexCommandOperator() { }

    public static ComplexCommand drawTriangle(final int x0, final int y0, final int x1, final int y1, final int x2, final int y2) {
        final List<DriverCommand> plotterCommands = new ArrayList<>();

        plotterCommands.add(new SetPositionCommand(x0, y0));
        plotterCommands.add(new OperateToCommand(x1, y1));
        plotterCommands.add(new OperateToCommand(x2, y2));
        plotterCommands.add(new OperateToCommand(x0, y0));

        return new ComplexCommand(plotterCommands);
    }

    public static ComplexCommand drawRectangle(final int x, final int y, final int height, final int width) {
        final List<DriverCommand> plotterCommands = new ArrayList<>();

        plotterCommands.add(new SetPositionCommand(x, y));
        plotterCommands.add(new OperateToCommand(x, y + height));
        plotterCommands.add(new OperateToCommand(x + width, y + height));
        plotterCommands.add(new OperateToCommand(x + width, y));
        plotterCommands.add(new OperateToCommand(x, y));

        return new ComplexCommand(plotterCommands);
    }
}