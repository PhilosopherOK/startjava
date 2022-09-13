public class ArrayStorage {
    public static void main(String[] args) {

    }
}
//    Реализуйте класс ArrayStorage , организовав хранение резюме на основе массива с методами save, get, delete,
//        size, clear, getAll
//        При этом храните все резюме в начале storage (без дырок в виде null ), чтобы не перебирать каждый раз все
//        10000 элементов
//        Схема хранения резюме в storage (от 0 до size - 1 элементов null нет):
//        r1, r2, r3,..., rn, null, null,..., null
//<----- size ----->
//<------- storage.length (10000) ------->