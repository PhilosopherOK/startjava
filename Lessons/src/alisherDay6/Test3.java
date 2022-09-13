package alisherDay6;
import java.util.Random;
//3. Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать
//        класс Student (Студент) с полем “Имя”.
//        Каждый класс имеет конструктор (с параметрами), set и get методы по
//        необходимости, а также у преподавателя есть метод evaluate (оценить студента),
//        принимающий в качестве аргумента студента, и работающий следующим образом:
//        внутри метода случайным образом генерируется число от 2 до 5, выводится строка:
//        "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
//        по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
//        Все слова, написанные большими буквами, должны быть заменены
//        соответствующими значениями. ОЦЕНКА должна принимать значения "отлично”,
//        "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от
//        значения случайного числа.
//        Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки
//        студента, передав студента в качестве аргумента метода.
public class Test3 {

    public static void main(String[] args) {
        Teacher teach1 = new Teacher();
        Student studik2 = new Student();
        teach1.evaluate(studik2);

    }
}
class Teacher{
    Student studik1 = new Student();
    Random random = new Random();
    private String name = "Man of future";
    private String item = "very important matter";
    public void evaluate(Student studik1){
        int check = (int)(Math.random()*4+2);
        String score;
        switch (check){
            case 2:
                score = "неудовлетворительно";
            case 3:
                score = "удовлетворительно";
            case 4:
                score = "хорошо";
            case 5:
                score = "отлично";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + check);
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " +
                studik1.getName() + " по предмету " + item +" на оценку " + score);
    }
}
class Student{
    private String name = "Tony Stark";
    public String getName(){
        return name;
    }
}

