package main.java.homework1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        /*menu[0] = "1. check task list";
        menu[1] = "2. add a task";
        menu[2] = "3. delete a task";
        menu[3] = "4. sort task by date/time";
        menu[4] = "5. sort task by duration";*/

        String[] taskArr = new String[5];

        taskArr[0] = "wake up";
        taskArr[1] = "bursh teeth";
        taskArr[2] = "take a shower";
        taskArr[3] = "eat";
        taskArr[4] = "go work";

        System.out.println(taskList.showTasks());
        taskList.deleteTaskById(1);
        System.out.println(taskList.showTasks());

        taskList.addTask(
                2,
                "bursh teeth",
                "something that follows task number 1",
                LocalDateTime.of(2022, Month.OCTOBER, 28, 23,1,1),
                20,
                Notification.OPENED,
                new Action(1, "random action number 2")
        );

        System.out.println(taskList.showTasks());

        taskList.addTask(
                3,
                "take a shower",
                "something that is added",
                LocalDateTime.of(2022, Month.OCTOBER, 28, 23,5,1),
                45,
                Notification.OPENED,
                new Action(1, "random action number 3")
        );

        System.out.println(taskList.showTasks());
        taskList.printCurrentTasks();

    }

    public int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        boolean isGoodInput;
        do {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                scanner.nextLine();
                isGoodInput = n >= 0;
            } else {
                scanner.nextLine();
                isGoodInput = false;
            }
        } while (!isGoodInput);
        return n;
    }
}
