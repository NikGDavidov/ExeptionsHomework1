package HW1;
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
//        Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
public class Main3 {

    public static void main(String[] args) {
        int[] a = new int[]{4, 6, 8};
        int b[] = new int[]{2, 4,0};
        arr(a,b);
    }


    static double[] arr(int a[], int b[]) {
        if (!(a.length == b.length)) {
            throw new RuntimeException("Длины массивов не совпадают");
        }
        double res[] = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            try {
                res[i] = a[i] / b[i];
            } catch (RuntimeException e) {
                throw new RuntimeException("Деление на ноль");
            }
        }
        return res;
    }
}
