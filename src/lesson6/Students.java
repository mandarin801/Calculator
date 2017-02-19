package lesson6;

/**
 * Created by mandarin80 on 13.02.17.
 */
public class Students {
    private final int id;
    private final String firstName;
    private String lastName;
    private Container marks = new Container(-5000);
    public Students (int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
    }

    public void addMark(int mark) {
        if (marks.getSize() == 1 && marks.get(0) == -5000) {
            this.marks.set(0, mark);
        } else {
            this.marks.add(mark);
        }
    }


    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getId(){
        return id;
    }

    public int getMark(int index){
        return marks.get(index);
    }

    public boolean containsMark(int elementForCheck){
        return marks.contains(elementForCheck);
    }

    public void setMark(int index, int value){
        marks.set(index, value);
    }

    public int numberOfMarks(){
        return marks.getSize();
    }


}
