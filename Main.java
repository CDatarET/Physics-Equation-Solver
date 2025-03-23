import java.util.Scanner;

class Physics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        char yn = 'y';
        while(yn != 'n'){
            System.out.println("Which equation do you want to solve?\nEnter-");
            System.out.println("1 for Heisenberg Uncertainty Principle");
            System.out.println("2 for De Broglie Wavelength");
            System.out.println("3 for Energy level of infinite square well");
            System.out.println("4 for Radius of Bohr orbit");
            
            int equ = scan.nextInt();
            if(equ == 1){
                System.out.println("Enter missing variable- x, p, h, (type h for hbar)");
                char vr = scan.next().charAt(0);
                if(vr == 'x'){
                    System.out.println("Enter p in Kg*m/s:");
                    double p = scan.nextDouble();
                    double h = 1.055e-34;
                    
                    System.out.println("x = " + ((h/2)/p)+"m");
                    
                }
                else if(vr == 'p'){
                    System.out.println("Enter x in m");
                    double x = scan.nextDouble();
                    double h = 1.055e-34;
                    
                    System.out.println("p = " + ((h/2)/x)+"Kg*m/s");
                }
                else if(vr == 'h'){
                    System.out.println("Enter x in m");
                    double x = scan.nextDouble();
                    System.out.println("Enter p in Kg*m/s:");
                    double p = scan.nextDouble();
                    
                    System.out.println("hbar = " + (x*p*2)+"Js");
                }
                else{
                    System.out.println("Invalid Variable");
                }
            }
            else if(equ == 2){
                System.out.println("Enter missing variable- l (lambda), m, v, h");
                char vr = scan.next().charAt(0);
                
                if(vr == 'l'){
                    double h = 6.626e-34;
                    System.out.println("Enter m in kg:");
                    double m = scan.nextDouble();
                    System.out.println("Enter v in m/s:");
                    double v = scan.nextDouble();

                    System.out.println("l = " + (h/(m*v))+"m");
                }
                else if(vr == 'm'){
                    double h = 6.626e-34;
                    System.out.println("Enter l in m: (ex. 1.00e-9)");
                    double l = scan.nextDouble();
                    System.out.println("Enter v in m/s:");
                    double v = scan.nextDouble();

                    System.out.println(("m = " + (h/v)*l)+"kg");
                }
                else if(vr == 'v'){
                    double h = 6.626e-34;
                    System.out.println("Enter m in kg:");
                    double m = scan.nextDouble();
                    System.out.println("Enter l in m: (ex. 1.00e-9)");
                    double l = scan.nextDouble();

                    System.out.println("v = " + (h/(m*l))+"m/s");
                    
                }
                else if(vr == 'h'){
                    System.out.println("Enter m in kg:");
                    double m = scan.nextDouble();
                    System.out.println("Enter l in m: (ex. 1.00e-9)");
                    double l = scan.nextDouble();
                    System.out.println("Enter v in m/s:");
                    double v = scan.nextDouble();

                    System.out.println("h = " + (m*v*l)+"Js");
                }
                else{
                    System.out.println("Invalid Variable");
                }
            }
            else if(equ == 3){
                double h = Math.pow(6.626e-34, 2);
                System.out.println("Enter n");
                int n = scan.nextInt();
                System.out.println("Enter m in kg");
                double m = scan.nextDouble();
                System.out.println("Enter L in m");
                double L = scan.nextDouble();
                L = Math.pow(L,2);

                for(int i = 1; i <= n; i++){
                    System.out.println("E"+ i + " = " + ((Math.pow(i,2)*h)/(8*m*L)) + "J");
                }
            }
            else if(equ == 4){
                System.out.println("Enter quantum number");
                int n = scan.nextInt();
                double b = 5.29e-11;
                System.out.println("Enter atomic number");
                int a = scan.nextInt();
                    
                System.out.println("radius is " + (b*(Math.pow(n,2)/a))+"m");
            }
            else{
                System.out.println("Not a valid operation");
            }
            System.out.println("Try Again? y/n");
            yn = scan.next().charAt(0);
        }
    }
}
