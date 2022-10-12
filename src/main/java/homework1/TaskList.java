package main.java.homework1;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskList {

    private final List<Task> taskList = new ArrayList<>();

    public TaskList() {
        taskList.add(new Task(
                1,
                "wake up",
                "random task number 1",
                LocalDateTime.now(),
                30,
                Notification.OPENED,
                new Action(1, "random action number 1"))
        );

        taskList.add(new Task(
                2,
                "bursh teeth",
                "something that follows task number 1",
                LocalDateTime.of(2022, Month.OCTOBER, 28, 23,1,1),
                20,
                Notification.OPENED,
                new Action(1, "random action number 2"))
        );
    }

    public List<Task> showTasks() {
        return taskList;
    }

    public void printCurrentTasks() {
        Stream.of(taskList).forEach(System.out::println);
    }

    public Task addTask(int taskId, String title, String description, LocalDateTime taskDateTime,
                        long taskLength, Notification notification, Action action) {
        Task addedTask = new Task(taskId, title, description, taskDateTime, taskLength, notification, action);
        taskList.add(addedTask);
        return addedTask;
    }

    public void deleteTaskById(int id) {
        taskList.remove(id);
    }

    public List<Task> sortTasksByDate() {
        return taskList.stream()
                .sorted(Comparator.comparing(Task::getLocalDateTime))
                .collect(Collectors.toList());
    }

    public List<Task> sortTasksByLength() {
        return taskList.stream()
                .sorted(Comparator.comparing(Task::getLength))
                .collect(Collectors.toList());
    }
}
