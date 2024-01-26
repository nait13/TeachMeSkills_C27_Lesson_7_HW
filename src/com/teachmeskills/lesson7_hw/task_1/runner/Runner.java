package com.teachmeskills.lesson7_hw.task_1.runner;

import com.teachmeskills.lesson7_hw.task_1.positionTitle.*;

import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Director dr1 = new Director();
        Accountant acc1 = new Accountant();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ID должности");

        if (scan.hasNextInt()){
            int positionTitleId = scan.nextInt();
            if(positionTitleId == acc1.positionId) {
                acc1.showJobTitle();
            } else if (positionTitleId == worker1.positionId) {
                worker1.showJobTitle();
            } else if (positionTitleId == dr1.positionId) {
                dr1.showJobTitle();
            }else {
                System.out.println("Такого ID не существует");
            }
        }else {
            System.out.println("Введите число!!!");
        }
        scan.close();
    }
}
