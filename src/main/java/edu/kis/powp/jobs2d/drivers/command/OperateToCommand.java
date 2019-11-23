package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private int x, y = 0;

    public OperateToCommand(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void execute(Job2dDriver job2dDriver) {
        job2dDriver.operateTo(this.x, this.y);
    }
}