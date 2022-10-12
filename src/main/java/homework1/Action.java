package main.java.homework1;

public class Action {
    private int id;
    private String actionDescriptor;

    public Action(int id, String actionDescriptor) {
        this.id = id;
        this.actionDescriptor = actionDescriptor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActionDescriptor() {
        return actionDescriptor;
    }

    public void setActionDescriptor(String actionDescriptor) {
        this.actionDescriptor = actionDescriptor;
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", actionDescriptor='" + actionDescriptor + '\'' +
                '}';
    }
}
