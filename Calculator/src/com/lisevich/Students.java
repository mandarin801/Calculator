package com.lisevich;

/**
 * Created by mandarin80 on 05.02.17.
 */
public class Students {
    public static String[] newGroup(String firstStudentName){
        String[] result = {firstStudentName};
        return result;
    }

    public static String[] add(String[] group, String student){
        String[] result;
        result = new String[group.length + 1];
        //result = group;
        System.out.println(result.length);
        result[result.length] = student;
        return result;
    }

    public static void main(String[] args) {
        String[] group1 = newGroup("Vasya");
        add(group1, "Fedoriv");

        System.out.println(group1[0]);
        System.out.println(group1[1]);
    }
}
