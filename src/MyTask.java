public class MyTask {
    private String name;
    private String description;
    private MyTaskStatus status;

    public MyTask(String name, String description) {
        this.name = name;
        this.description = description;
        this.status = MyTaskStatus.ACTIVE;
    }

    public MyTask(String name) {
        this.name = name;
        this.description = "";
        this.status = MyTaskStatus.ACTIVE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MyTaskStatus getStatus() {
        return status;
    }

    public void setStatus(MyTaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
            String desc;
        if (description.length() > 18)
            desc = description.substring(0, 15) + "...";
        else
            desc = description;

        return name + "- " + desc;
    }
}
