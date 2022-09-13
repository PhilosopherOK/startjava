package alisherDay11;

public class Courier implements Worker {
    Warehouse warehouse = new Warehouse();

    public int getSalary() {
        return salary;
    }

    int score1000 = 0;

    public void doWork(Warehouse warehouse) {
        score1000 += 1000;
        warehouse.setBalance(score1000);
        salary += 100;
        if (score1000 == 1_000_000) {
            bonus();
        }

    }

    public void bonus() {
        salary *= 2;
    }

    private int salary = 0;
}
