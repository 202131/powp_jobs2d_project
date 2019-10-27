package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x, y = 0;

    @Override

    public void execute(Job2dDriver job2dDriver) {
        /*implementation required*/
    }
    public void operateTo(int x, int y) {
    }
}