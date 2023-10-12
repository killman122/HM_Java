package com.heima.extends继承学习;

public class Teachers extends Person{
    private String workId;

    public Teachers() {
    }

    public Teachers(String name, int age, String workId) {
        super(name, age);
        this.workId = workId;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public void teach() {
        System.out.println("讲课...");
    }
}
