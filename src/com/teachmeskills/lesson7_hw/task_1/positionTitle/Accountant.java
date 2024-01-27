package com.teachmeskills.lesson7_hw.task_1.positionTitle;

import com.teachmeskills.lesson7_hw.task_1.iPositionPrinter.IPositionPrinter;

/**
 * This class contains descriptions of the Accountant object
 */

public class Accountant implements IPositionPrinter {
    String positionAtWork = "Accountant";
    public int positionId = 2;

    @Override
    public void showJobTitle() {
        System.out.println("Position: " + this.positionAtWork);
    }
}
