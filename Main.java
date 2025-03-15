import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        char yn = 'y';
        while(yn != 'n'){
            System.out.println("Which equation do you want to solve?");
            System.out.println("enter 1 for Heisenberg Uncertainty Principle, 2 for De Broglie Wavelength, 3 for Energy level of infinite square well");
        
            int equ = scan.nextInt();
            if(equ == 1){
                System.out.println("Enter missing variable- x, p, h, (type h for hbar)");
                char vr = scan.next().charAt(0);
                if(vr == 'x'){
                    System.out.println("Enter p in Kg*m/s:");
                    double p = scan.nextDouble();
                    System.out.println("Enter hbar in j-s (ex. 1.00e-21)");
                    double h = scan.nextDouble();
                    
                    System.out.println("x = " + ((h/2)/p));
                    
                }
                else if(vr == 'p'){
                    System.out.println("Enter x in m");
                    double x = scan.nextDouble();
                    System.out.println("Enter hbar in j-s (ex. 1.00e-21)");
                    double h = scan.nextDouble();
                    
                    System.out.println("p = " + ((h/2)/x));
                }
                else if(vr == 'h'){
                    System.out.println("Enter x in m");
                    double x = scan.nextDouble();
                    System.out.println("Enter p in Kg*m/s:");
                    double p = scan.nextDouble();
                    
                    System.out.println("hbar = " + (x*p*2));
                }
                else{
                    System.out.println("Invalid Variable");
                }
            }
            else if(equ == 2){
                System.out.println("Enter missing variable- l (lambda), m, v, h");
                char vr = scan.next().charAt(0);
                
                if(vr == 'l'){
                    
                }
                else if(vr == 'm'){
                    
                }
                else if(vr == 'v'){
                    
                }
                else if(vr == 'h'){
                    
                }
                else{
                    System.out.println("Invalid Variable");
                }
            }
            else if(equ == 3){
                
            }
            else{
                System.out.println("Not a valid operation");
            }
            System.out.println("Try Again? y/n");
            yn = scan.next().charAt(0);
        }
    }
}
