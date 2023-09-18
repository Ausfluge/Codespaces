public class Figures {
    public static void main(String[] args) {
       egg();
       teaCup();
       top();
       stopSign();
       bottom();
       hat();
    }
 
    // egg
    public static void egg() {
       top();
       bottom();    
    }
 
    // tea cup      
    public static void teaCup() {
       System.out.println("\\        /");
       System.out.println(" \\______/");
       System.out.println("+--------+");
    }
 
    // top, stop sign, bottom
    public static void top() {
       System.out.println("  ______");
       System.out.println(" /      \\");
       System.out.println("/        \\");
    }      
       
    public static void stopSign() {
       System.out.println("|  STOP  |");
    }
    
    public static void bottom() {
       System.out.println("\\        /");
       System.out.println(" \\______/");
    }
    
    // stop
    public static void stop() {
    top();
    stopSign();
    bottom();
    }
       
    // hat
    public static void hat() {
       System.out.println("  ______");
       System.out.println(" /      \\");
       System.out.println("/        \\");
       System.out.println("+--------+");
       }
 }