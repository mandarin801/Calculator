package serilizible;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mandarin80 on 11.04.17.
 */
public class Student implements Serializable {

    private final int id;
    private String name;
    private List<Integer> marks = new ArrayList<>();


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMarks() {
        String result = marks.get(0).toString() + " ";
        int count = marks.size() - 1;
        while(count > 0){
            result = result + marks.get(marks.size() - count) + " ";
            count--;
        }
        return String.valueOf(result);
    }

    public void setMark(Integer mark){
        if(mark < 6 && mark > 0){
            marks.add(mark);
        } else {
            System.out.println("Invalid mark!");
        }
    }

    public String toString(){
        return "id: " + this.getId() + ", name: "
                + this.getName() + "\n"
                + "marks: "
                + this.getMarks();
    }
}
