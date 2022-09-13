package alisherDay9;

public class Test1 {
    public static void main(String[] args) {
        Student studik1 = new Student("Vovka", "7E");
        System.out.println(studik1.getStudyGroup());
        studik1.printInfo();

        Teacher teacher1 = new Teacher("Arestovich", "Biology");
        System.out.println(teacher1.getNameOfItem());
        teacher1.printInfo();
    }
}
class Human{
    private String name;
    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Этот человек с именем "+ name);
    }
}

class Student extends Human{
    public String getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }

    private String studyGroup = "6B";

    public Student(String name,String studyGroup) {
        super(name);
        this.studyGroup = studyGroup;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем "+ getName());

    }
}

class Teacher extends Human{
    public Teacher (String name, String nameOfItem){
        super(name);
        this.nameOfItem = nameOfItem;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    private String nameOfItem;
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем "+ getName());
    }
}
