package org.example.mapstruct.case2;

public class Case2VO {
    private String name;
    private String gender;
    private Integer status;

    public Case2VO(String name, String gender, Integer status) {
        this.name = name;
        this.gender = gender;
        this.status = status;
    }

    public Case2VO() {
    }

    @Override
    public String toString() {
        return "Case2VO{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}
