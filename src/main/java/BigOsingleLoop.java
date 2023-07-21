public class BigOsingleLoop {
    public static void main(String[] args) {
        int numberOfDataOperation = 0;
        int n = 100;
        long startTime;
        long endTime;
        System.out.println("Input size n is =" + n);
        //Task 1 single loop
        startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {


            numberOfDataOperation += 1;

        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operation " + numberOfDataOperation + " in " + (endTime - startTime) + "mili second");

        //task 2 nested loop
        startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
           numberOfDataOperation+=1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("number of operation " + numberOfDataOperation + " in " + (endTime - startTime) + "mili second");


    }
}
