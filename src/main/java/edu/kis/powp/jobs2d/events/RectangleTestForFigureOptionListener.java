package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommandOperator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleTestForFigureOptionListener implements ActionListener {
    private final DriverManager driverManager;

    public RectangleTestForFigureOptionListener(final DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        ComplexCommandOperator.drawRectangle(0, 20, 100, 200).execute(driverManager.getCurrentDriver());
    }
}
