public class PrintDesign {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int bar = 1; bar <= (-1 * line + 6); bar++) {
                System.out.print("-");
            }
            
            for (int num = 1; num <= (2 * line - 1); num++) {
                System.out.print(2 * line - 1);
            }
                                 
            for (int bar = 1; bar <= (-1 * line + 6); bar++) {
                System.out.print("-");
            }
            System.out.println("");
        }    
    }
}
