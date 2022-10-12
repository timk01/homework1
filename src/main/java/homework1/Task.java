package main.java.homework1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task{
    private int id;
    private String title;
    private String description;
    private LocalDateTime localDateTime;
    private long length;
    private final Notification notification;
    private final Action action;

    public Task(Notification notification, Action action) {
        this.notification = notification;
        this.action = action;
    }

    public Task(int id, String title, String description, LocalDateTime localDateTime,
                long length, Notification notification, Action action) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.localDateTime = localDateTime;
        this.length = length;
        this.notification = notification;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public Notification getNotification() {
        return notification;
    }

    public Action getAction() {
        return action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && length == task.length && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(localDateTime, task.localDateTime) && notification == task.notification && Objects.equals(action, task.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, localDateTime, length, notification, action);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", localDateTime=" + localDateTime +
                ", length=" + length +
                ", notification=" + notification +
                ", action=" + action +
                '}';
    }

}
