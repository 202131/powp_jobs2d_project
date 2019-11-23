package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x, y = 0;

    public SetPositionCommand(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void execute(Job2dDriver job2dDriver) {
        job2dDriver.setPosition(this.x, this.y);
    }
    public void operateTo(int x, int y) {
    }
}