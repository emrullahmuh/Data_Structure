public class BigOsingleLoop {
    public static void main(String[] args) {
        int numberOfDataOperation = 0;
        long n = 100;
        long m=200;
        long startTime;
        long endTime;
        System.out.println("Input size n is =" + n);
        //Task 1 single loop
        startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            numberOfDataOperation += 1;

        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operation with for loop " + numberOfDataOperation + " in " + (endTime - startTime) + "mili second");

        //task 2 nested loop
        startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
           numberOfDataOperation+=1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operation with nested loop " + numberOfDataOperation + " in " + (endTime - startTime) + "mili second");




    //Task 3

        startTime = System.currentTimeMillis();
            for (int b = 0; b <n ; b++) {
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numberOfDataOperation+=1;
            }
        }}
        endTime = System.currentTimeMillis();
        System.out.println("number of operation with triple nested loop " + numberOfDataOperation + " in " + (endTime - startTime) + "mili second");
// Task 4  n and m nested loop (n*m)
        startTime = System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                numberOfDataOperation+=1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operation with  nested loop (n*m)" +  + numberOfDataOperation + " in " + (endTime - startTime) + "mili second");
// task 4.5 n and m consecutive loops (n+m)
        startTime = System.currentTimeMillis();

        for (int i = 0; i <n ; i++) {

        }
        for (int i=0;i<m;i++){
            numberOfDataOperation+=1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operation with  nested loop (n+m)" +  + numberOfDataOperation + " in " + (endTime - startTime) + "mili second");
//task 5 logaritmic complexity
        startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i*=2) {
            numberOfDataOperation += 1;

        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operations  " + numberOfDataOperation + " in " + (endTime - startTime) + "mili second");


    }
}
