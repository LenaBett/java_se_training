package com.systechafrica.part1.stringandstringbuilder;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String regNo;
    private String address;
    private String nickname;

    public String getStudentDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName)
                .append("")
                .append(lastName)
                .append("")
                .append(email)
                .append("");
        return sb.toString();
    }

    public String getStudentDetails2() {
        return firstName + " " + lastName + " " + email;
    }

}
