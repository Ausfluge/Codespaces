public class Mirror {
    public static void main (String[] args) {
       line();
       topHalf();
       bottomHalf();
       line();
    }
       
    public static void line() {
        System.out.print("#");
            for (int i = 1; i <= 16; i++) {
                System.out.print("=");
            }
            System.out.println("#");
    }
       
    public static void topHalf() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            // spaces on the left
            for (int space = 1; space <= (-2 * line + 8); space++) {
            System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= (4 * line - 4); dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            // spaces on the right
            for (int i = 1; i <= (-2 * line + 8); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void bottomHalf() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            
        }
    }
    
 }