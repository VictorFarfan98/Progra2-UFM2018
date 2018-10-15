import java.util.*;
class Main{
    public static void main(String[] args){
        System.out.println("Hola mundo");
        
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        
        System.out.print("Ingrese su opción:");    
        int opcion = scInt.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.print("Ingrese un número: ");
                System.out.println("La suma es: " + Suma(scInt.nextInt()));
                break;
            case 2: 
                System.out.print("Ingrese un número: ");
                System.out.println("El factorial es: " + Factorial(scInt.nextInt()));;
                break;  
            case 3: 
                System.out.print("Ingrese un string: ");
                System.out.println("El string invertido es: " + Revertir(scString.nextLine()));;
                break;
            case 4: 
                System.out.print("Ingrese la base: ");
                int a = scInt.nextInt();
                System.out.print("Ingrese el exponente: ");
                int b = scInt.nextInt();
                System.out.println("El resultado es: " + Pow(a,b));;
                break;
            case 5: 
                System.out.print("Ingrese un número: ");
                System.out.println("El número es par: "+EsPar(scInt.nextInt()));
                break;                                                       
            case 6: 
                System.out.print("Ingrese un número: ");
                int fib = scInt.nextInt();
                System.out.println("El número "+fib+" de la secuencia de Fibonacci es: "+Fibonacci(fib));
                break;
            case 7: 
                int[] elements = {7, 24, 41, 5, 6};
                System.out.println("El número menor es: "+Menor(elements, 0));
                break;
        }
        
    }
    
    public static int Suma(int n){
        if(n == 0){
            return 0;
        }else{
            return (n + Suma(n-1));
        }
    } 
      
    public static int Factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return (n * Factorial(n-1));
        }
    }  
    
    public static String Revertir(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return Revertir(str.substring(1)) + str.charAt(0);
    }
    
    public static int Pow(int a, int b){
        if(b==0){
            return 1;
        }else{
            return a * Pow(a, b-1);
        }   
    }
    
    public static boolean EsPar(int n){
        if(n==0){
            return true;
        }else if(n==1){
            return false;
        }else if(n<0){
            return EsPar(-n);
        }else{
            return EsPar(n-2);
        }
    }
    
    public static double Fibonacci(int n){
        if(n == 0)
          return 0;
        else if(n == 1)
          return 1;
        else
          return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    
    public static int Menor(int[] elements, int index) {
        if (index == elements.length - 1) {
            return elements[index];
        }

        int val = Menor(elements, index + 1);

        if (elements[index] < val)
            return elements[index];
        else
            return val;
   }
}
