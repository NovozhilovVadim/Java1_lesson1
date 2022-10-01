public class main {
    /*
    1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
2. Создать переменные всех пройденных типов данных и инициализировать их значения.
3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float.

4. Написать метод, принимающий на вход два целых числа и проверяющий,
 что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия.
Для задач со * не нужно искать решение в интернете, иначе нет смысла их выполнять.
     */

    public static void main(String[] args) {

        System.out.println("task 2");
        present();
        System.out.println();

        System.out.println("task 3");
        System.out.println("a*(b + (c/d)) = " + calculation());
        System.out.println();

        System.out.println("task 4");
        System.out.println("examination 10 < a+b < 20 " + examination(3,3));
        System.out.println();

        System.out.println("task 5");
        examination2(0);
        System.out.println();

        System.out.println("task 6");
        System.out.println("examination a > 0 or a < 0:    " + examination3(0));
        System.out.println();

        System.out.println("task 7");
        helloworld("Vadim");
        System.out.println();

        System.out.println("task 8");
        year(2300);

    }

    public static void present(){ //Типы данных

        byte by; // -128 +127  - умолчанию 0
        short sh; // -32768 + 32767  -  умолчанию 0
        int i; // -2147483648 +2147483647  -  умолчанию 0
        long l; // -2^63 +2^63-1  -  0L
        float fl; // -3.4E+38 +2.4E+38  -  0.0f
        double d; // -1.7E+308 +1.7E+308  -  0.0d
        char ch; // '\u0000' = int 0 -> '\uffff' = int 65535  -  '\u0000'
        boolean boo; // true or false  -  false

        by = 0;
        sh = 255;
        i = 199999;
        l = 655555555;
        fl = 254.45456f;
        d = -45.534;
        ch = 36;
        boo = true;

        System.out.println("byte "+by);
        System.out.println("short "+sh);
        System.out.println("int "+i);
        System.out.println("long "+l);
        System.out.println("float "+fl);
        System.out.println("double "+d);
        System.out.println("char "+ch);
        System.out.println("boolean "+boo);
    }

    public static float calculation (){ //вычисление
        float a,b,c,d;
        a = 11.0f;
        b = 2.4f;
        c = 3.14f;
        d = 0.35f;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        float result;
        result = a*(b + (c/d));
        return result;
    }

    public static boolean examination (int a, int b){ //проверка 10<a+b<20 логика
        System.out.println("a = " + a + " \n" + "b = " + b);
        if (a + b < 20 & a + b > 10) {
            return true;
        }else return false;
    }

    public static void examination2 (int a){ // проверка a>0
        System.out.println("a = " + a);
        if ( a >= 0){
            System.out.println("a > 0 or a = 0");
        }else System.out.println("a < 0");
    }

    public static boolean examination3 (int a){
        System.out.println("a = " + a);
        if (a == 0){
            return true;
        }if (a < 0){
            return false;
        }else return true;
    }

    public static void helloworld (String name){
        System.out.println("Hello, " + name);
    }

    public static void examinationYear (int year){
        
    }

    public static void year (int y){
        if (y != 0 && y % 4 == 0 && y%100 != 0 || y%400 == 0){
            System.out.println("Год " + y + " високосный");
        }else System.out.println("Год " + y + " не високосный");
    }




}
