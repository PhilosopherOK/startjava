package alisherDay11;

public class TestWorkers {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();
        Picker pickerwork1 = new Picker();
        Picker pickerwork2 = new Picker();
        Courier courierwork1 = new Courier();
        for (int i = 0; i < 1505; i++) {
            pickerwork1.doWork(warehouse1);
        }
        System.out.println(warehouse1.toString());
        System.out.println(pickerwork1.getSalary());
        for (int i = 0; i < 1007; i++) {
            courierwork1.doWork(warehouse1);
        }
        System.out.println(warehouse1.toString());
        System.out.println(courierwork1.getSalary());


    }
}
