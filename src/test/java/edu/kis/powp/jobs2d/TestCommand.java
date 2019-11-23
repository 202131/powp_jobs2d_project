package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.util.Arrays;
import java.util.List;

public class TestCommand {
    public static void main(final String[] args) {
        final DrawPanelController controller = new DrawPanelController();
        DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
        ILine line = LineFactory.getBasicLine();
        LineDrawerAdapter lineDrawerAdapter = new LineDrawerAdapter(controller, line);
        SetPositionCommand setPositionCommand = new SetPositionCommand(-200, 200);
        OperateToCommand operateToCommand = new OperateToCommand(10, 10);
        List<DriverCommand> commands = Arrays.asList(setPositionCommand, operateToCommand);
        ComplexCommand complexCommand = new ComplexCommand(commands);
        complexCommand.execute(lineDrawerAdapter);
        controller.drawLine(line);
    }
}