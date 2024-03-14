package homework;

public class ForLoopEx {
    public static void main(String[] args) {

        //PRINT 1 TO 10 USING FOR

        System.out.println("Output is : ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //PRINT EVEN NUMBERS FROM 1 TO 10 USING FOR AND IF STATEMENT

        int n = 10;
        System.out.print("Even Numbers from 1 to 10 are: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }


}
