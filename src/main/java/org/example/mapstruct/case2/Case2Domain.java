package org.example.mapstruct.case2;

public class Case2Domain {
    private String user;
    private String sex;
    private Case2Status status;

    public Case2Domain() {
    }

    public Case2Domain(String user, String sex, Case2Status status) {
        this.user = user;
        this.sex = sex;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Case2Domain(" +
                "user=" + user +
                ", sex=" + sex +
                ", status=" + status +
                ')';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Case2Status getStatus() {
        return status;
    }

    public void setStatus(Case2Status status) {
        this.status = status;
    }
}
