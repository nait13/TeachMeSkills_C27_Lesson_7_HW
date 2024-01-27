package com.teachmeskills.lesson7_hw.task_1.positionTitle;

import com.teachmeskills.lesson7_hw.task_1.iPositionPrinter.IPositionPrinter;

/**
 * This class contains descriptions of the Worker object
 */
public class Worker  implements IPositionPrinter {
    String positionAtWork = "Worker";
    public int positionId = 3;


    @Override
    public void showJobTitle() {
        System.out.println("Position: " + this.positionAtWork);
    }
}
