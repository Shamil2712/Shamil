public class Lesson1 {
        public static void main(String[] args) {
      PrintThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
       sravnenie(1,10);
        polojit();
        sravTrue(0);
        visokos(2024);
        printName();



        }





    public static void PrintThreeWords(){
    System.out.print("PrintThreeWords:");
       System.out.print("Apple.Banana,Orange");
       System.out.println();

        }
    public static void chekSumSign(){
        System.out.println("chekSumSign");
        int a=10, b=12;
        int c=a+b;
        if (c>=0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
        System.out.println();


    }
    public static void printColor(){
        System.out.println("printColor");
        int value=5;
        if (value<=0) System.out.println("Красный");
        else if( value>0 && value<=100) System.out.println("Желтый");
        if (value<100) System.out.println("Зеленый");
        System.out.println();

    }

    public static void compareNumbers(){
        System.out.println("comparNnumbers;");
        int a=6,b=7;
        if(a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
        System.out.println();
    }
    public static boolean sravnenie( int a,int b) {
        System.out.println("sravnenie");
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;}}

    public static boolean sravTrue(int a) {
        System.out.println("sravTrue");
        return (a>0);
        }






        public static void polojit() {
            System.out.println("positive:");
            int a=10;
            if(a>=0)
            System.out.println("Число положительное");
            else System.out.println("Число отрицательное");
            System.out.println();


        }


    public static void visokos(int year){
    System.out.println("visokos");
    if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
    else System.out.println(year + " г. високосный");
}

    public static void printName() {
        System.out.println("printName");
        String username="Dima";
       for(int a=1;a<=4;a++) {
           System.out.println(username);
        }
    }
}



