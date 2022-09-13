public class wolf {
    private String sex = "mele";
    private String name = " sobaka dika9i";
    private int weight = 78;
    private int age = 6;
    private String color = "night";
    private int legs;

    public String getColor() {
        return color;
    }

    private String walk() {
        System.out.println("top-top-top");
        return null;
    }
        public String getWalk() {
            return walk();
        }

    private String sit(){
        return null;
    }
    public String getSit() {
        return sit();
    }

    private String run(){
        int legs = 4;
            System.out.println("run bitch ruuuuun!!!");
        return null;
    }
    public String getRun() {
        return run();
    }
    public void setRun(int legs){
        if((legs < 4)&(legs>=0)){
            System.out.println("kalich");
            this.legs = legs;
        }else{
            System.out.println("norm pes");
        }
    }

    private int howl(int a, int b){
        if (a > b){
            System.out.println("wooooo!!!");
        } else {
            System.out.println("fuck u!");
        }
        return a+b;
    }
    public int getHowl(int a, int b){
        return getHowl(a,b);
    }
    private void hunting(){
        System.out.println("i am hungry !!!!");
    }

}
    /*Создайте класс Wolf
        ○ напишите в нем поля: пол, кличка, вес, возраст, окрас
        ○ напишите в нем методы: идти, сидеть, бежать, выть, охотиться
        ● Создайте класс WolfTest с методом main
        ○ создайте объект типа Wolf
        ○ присвойте в нем полям экземпляра класса Wolf какие-то значения
        ○ считайте эти значения из полей и отобразите в консоли
        ○ вызовите методы объекта*/
