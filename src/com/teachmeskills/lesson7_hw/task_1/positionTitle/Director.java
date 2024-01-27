package com.teachmeskills.lesson7_hw.task_1.positionTitle;

import com.teachmeskills.lesson7_hw.task_1.iPositionPrinter.IPositionPrinter;

/**
 * This class contains descriptions of the Director object
 */

public class Director implements IPositionPrinter {
    String positionAtWork = "Director";
    public int positionId = 1;

    @Override
    public void showJobTitle() {
        System.out.println("Position: " + this.positionAtWork);
    }
}
