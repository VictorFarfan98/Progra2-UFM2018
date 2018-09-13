import java.io.*;
import java.util.Random;

public class ListaDeEjercicios {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //System.out.println(Programa8(4));
        Programa24();
        //System.out.println(Programa20(120, 7));
        //Programa18(85.3, 80.0, 4.0)
    }
    
    public static void Programa2() throws IOException{//Numero de la suerte 
        System.out.println("Ingrese un numero");
        if(Integer.parseInt(br.readLine()) == 7){
            System.out.println("Numero de la suerte");
        }
    }
    
    public static void Programa4() throws IOException{//Numero Mayor
        System.out.println("Ingrese un numero");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Ingrese otro numero");
        int num2 = Integer.parseInt(br.readLine());
        
        if(num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
    
    public static void Programa6() throws IOException{//Numero between 20-100
        System.out.println("Ingrese un numero");
        int num = Integer.parseInt(br.readLine());
        if(100 > num && num > 20){
            System.out.println("El numero esta entre 20 y 100");
        }else{
            System.out.println("El numero no esta entre 20 y 100");
        }
    }
 
    public static int Programa8(int num) throws IOException {//Factorial
        if(num == 1){
            return 1;
        }
        return num * Programa8(num-1);
    }
    
    public static void Programa10() throws IOException{//Tablas de multiplicar
        for(int i=1; i <= 10; i++){
            for(int j=1; j <= 10; j++){
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println("");
        }
    }
    
    public static void Programa12() throws IOException{//Numero primo
        int suma = 0;
        System.out.println("Ingrese un numero ");
        int numero = Integer.parseInt(br.readLine());
        for(int i = numero; i > 0; i--){
            if(numero % i == 0){
                //System.out.println(i);
                suma += i;
            }
        }
        if(suma == numero +1 ){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    
    public static void Programa14() throws IOException{
        System.out.println("Ingrese un numero");
        int n = Integer.parseInt(br.readLine());
        
        String cadena = "";
        for(int i=1; i<n*2; i += 2){
            cadena += i +",";
        }
        System.out.println(cadena.substring(0, cadena.length()-1));
    }
    
    public static void Programa16() throws IOException{
        System.out.println("Ingrese un numero");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Ingrese otro numero");
        int num2 = Integer.parseInt(br.readLine());
        
        if(num1 == num2){
            System.out.println("Los numeros son iguales");
        }else if(num1 > num2){
            System.out.println("El numero 1 es más grande");
        }else{
            System.out.println("El numero 2 es más grande");
        }
    }
    
    public static double Programa18(double x, double m, double s) throws IOException{
        double z;
        z = (x-m)/s;
        return z;
    }
    
    public static double Programa20(double num, double divisor) throws IOException{
        int entero = 0;
        double deci = 0;
        double pos = 10;
        
        while(num >= divisor){
            num -= divisor;
            entero += 1;
        }
        while(num != 0.0 && pos <= 10000000){//Decimales limitados
            num *= 10;            
            if(divisor < num){                
                while(num >= divisor){
                    num -= divisor;
                    deci += (1/pos);
                }
            }
            pos *= 10;
            
        }       
        return entero + deci;
    }
    
    public static void Programa22() throws IOException{
        int suma = 0;
        Random r = new Random();
        int n1, n2, n3;
        n1 = r.nextInt((6 - 1) + 1) + 1;
        n2 = r.nextInt((6 - 1) + 1) + 1;
        n3 = r.nextInt((6 - 1) + 1) + 1;
        suma = n1 + n2 + n3;
        System.out.println("Primer lanzamiento: "+n1);
        System.out.println("Segundo lanzamiento: "+n2);
        System.out.println("Tercer lanzamiento: "+n3);
        System.out.println("Total: " + suma);
    }
    
    public static void Programa24() throws IOException{
        System.out.println("Ingrese su nombre");
        String nombre = br.readLine();
        nombre += " ";
        int last = 0;
        for(int i=0; i < nombre.length(); i++){
            if(nombre.charAt(i) == ' '){
                System.out.println(nombre.substring(last, i) + " contiene: " + (i-last) + " letras");
                last = i+1;
            }
        }
    }
}
