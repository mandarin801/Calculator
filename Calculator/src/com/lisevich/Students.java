package com.lisevich;


/**
 * Created by mandarin80 on 05.02.17.
 */
public class Students {




    public static void main(String[] args) {
        String[][] group1 = newGroup("Vasya");
        System.out.println(group1.length);
        group1 = addStudent(group1, "Fedoriv");
        group1 = addStudent(group1, "Ivanov");

        System.out.println(containsStudent(group1, "Fedoriv"));
        System.out.println(indexOfStudent(group1, "Vasya"));

        String[][] group2 = newGroup("Fedoriv");
        group2 = addStudent(group2, "Ivanov");
        group2 = addStudent(group2, "Vasya");


        System.out.println(equals(group1, group2));
        group1 = addMark(group1, "Fedoriv", 5);
        printGroup(addMark(group1, "Vasya", 5), 1);

    }

    public static String[][] newGroup(String firstStudentName){
        String[][] result = new String[1][];
        result[0] = new String [1];
        result[0][0] = firstStudentName;
        return result;
    }

    public static String[][] addStudent(String[][] group, String student){
        String[][] result;
        result = new String [group.length + 1][1];
        for (int i = 0; i < group.length; i++){
            result[i] = group[i];
        }
        System.out.println(result.length);
        result[group.length][0] = student;
        return result;
    }

    public static String[][] addMark(String[][] group, String student, int mark){
        String[][] result;
        int indexOfStudentLocal = indexOfStudent(group, student);
        result = new String [group.length][group[indexOfStudentLocal].length + 1];
        for (int i = 0; i < group.length; i++){
            for (int j = 0; j < group[indexOfStudentLocal].length; j++) {
                result[i][j] = group[i][j];
            }
        }
        result[indexOfStudentLocal][group[indexOfStudentLocal].length] = String.valueOf(mark);
        return result;
    }

    public static boolean containsStudent(String[][] group, String student){
        for (int i = 0; i < group.length; i++){
            if(group[i][0] == student){
                return true;
            }
        }
        return false;
    }

    public static int indexOfStudent(String[][] group, String student){
        int index = 0;
        for (int i = 0; i < group.length; i++)
            if (group[i][0] == student){
            index = i;
            break;
            }
        return index;
    }

    public static String[][] deleteStudent(String[][] group, String student){
        if (!containsStudent(group, student)){
            return group;
        }
        String[][] result;
        result = group;
        result[0][0] = null;
        return result;
    }

    public static String[][] trim(String[][] group){
        String[][] result;
        int nullCounter = 0;
        int resultIndex = 0;
        int groupIndex = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i][0] == null){
                nullCounter++;
            }
        }
        result = new String[group.length - nullCounter][];
        for (int i = 0; i < group.length; i++) {
            if (group[groupIndex][0] != null){
                result[resultIndex] = group[groupIndex];
                resultIndex++;
                groupIndex++;
            } else {
                groupIndex++;
            }
        }
        return result;
    }

    public static String[][] concat(String[][] group1, String[][] group2){
        String[][] result;
        int commonLength = group1.length + group2.length;
        result = new String[commonLength][];
        for (int i = 0; i < commonLength; i++) {
            if (i < group1.length) {
                result[i] = group1[i];
            } else result[i] = group2[i - group1.length];
        }
        return result;
    }

    public  static String[][] sortGroup(String[][] group) {
        for (int i = 0; i < group.length; i++) {
            char min = group[i][0].charAt(0);
            int imin = i;
            for (int j = i + 1; j < group.length; j++) {
                if(group[j][0].charAt(0) < min) {
                    min = group[j][0].charAt(0);
                    imin = j;
                }
            }
            if (i != imin){
                String[] tmp;
                tmp = group[i];
                group[i] = group[imin];
                group[imin] = tmp;
            }
        }
        return group;
    }

    public static boolean containsAll(String[][] group1, String[][] group2){
        int counter = 0;
        for (int i = 0; i < group1.length; i++) {
            for (int j = 0; j < group2.length; j++) {
                if (group1[i][0] == group2[j][0]) {
                    counter++;
                }
            }
        }
        if (counter == group1.length){
            return true;
        } else return false;
    }

    public static boolean equals(String[][] group1, String[][] group2){
        if (group1.length == group2.length && containsAll(group1, group2)){
            return true;
        } else return false;
    }

    public static void printGroup(String[][] group, int number){
        System.out.println("                    GROUP OF STUDENTS # " + number);
        System.out.println("========================================================");
        System.out.println("  NAME  | MARKS");
        System.out.println("========================================================");
        for (int i = 0; i < group.length; i++) {
            System.out.print(group[i][0] + "\t| ");
            for (int j = 1; j < group[i].length; j++) {
                if (group[i][j] != null) System.out.print(group[i][j]);
            }
            System.out.print("\n ");
            System.out.println("========================================================");
        }
    }
}
