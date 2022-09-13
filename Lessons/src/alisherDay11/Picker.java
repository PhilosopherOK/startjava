package alisherDay11;

public class Picker implements Worker {
    Warehouse warehouse = new Warehouse();
    private int salary = 0;

    public int getSalary() {
        return salary;
    }

    int score1 = 0;

    public void doWork(Warehouse warehouse) {
        score1++;
        warehouse.setCountOrder(score1);
        salary += 80;
        if (score1 == 1500) {
            bonus();
        }
    }

    public void bonus() {
        salary *= 3;

    }
}