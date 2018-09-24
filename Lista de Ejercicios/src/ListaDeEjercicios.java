import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ListaDeEjercicios {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //System.out.println(Programa8(4));
        Programa24();
        //System.out.println(Programa20(120, 7));
        //Programa18(85.3, 80.0, 4.0)
        int op = 1;
        while(op != 26){
            System.out.println("Ingrese el numero del ejercicio: (1-25)");
            System.out.println("Ingrese 26 para salir");
            op = Integer.parseInt(br.readLine());
            switch(op){
                case 1:
                    Programa1();
                    break;

                case 2: 
                    Programa2();
                    break;

                case 3:
                    Programa3();
                    break;

                case 4:
                    Programa4();
                    break;

                case 5:
                    Programa5();
                    break;

                case 6:
                    Programa6();
                    break;

                case 7:
                    Programa7();
                    break;

                case 8:
                    System.out.println("Ingrese un numero");
                    int num = Integer.parseInt(br.readLine());
                    Programa8(num);
                    break;

                case 9:
                    Programa9();
                    break;

                case 10:
                    Programa10();
                    break;

                case 11:
                    Programa11();
                    break;

                case 12:
                    Programa12();
                    break;

                case 13:
                    Programa13();
                    break;

                case 14:
                    Programa14();
                    break;

                case 15:
                    Programa15();
                    break;

                case 16:
                    Programa16();
                    break;

                case 17:
                    Programa17();
                    break;

                case 18:
                    Programa18();
                    break;

                case 19:
                    Programa19();
                    break;

                case 20:
                    Programa20();
                    break;

                case 21:
                    Programa21();
                    break;

                case 22:
                    Programa22();
                    break;

                case 23:
                    Programa23();
                    break;

                case 24:
                    Programa24();
                    break;

                case 25:
                    Programa25();
                    break;

                case 26:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
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
    
    public static double Programa18() throws IOException{
        System.out.println("Ingrese un valor para x");
        double x = Double.parseDouble(br.readLine());
        System.out.println("Ingrese un valor para m");
        double m = Double.parseDouble(br.readLine());
        System.out.println("Ingrese un valor para s");
        double s = Double.parseDouble(br.readLine());
        
        double z = (x-m)/s;
        return z;
    }
    
    public static double Programa20() throws IOException{
        System.out.println("Ingrese un numero");
        double num = Double.parseDouble(br.readLine());
        System.out.println("Ingrese un numerador");
        double divisor = Double.parseDouble(br.readLine());
        
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
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void Programa1(){
        System.out.print("Ingrese el número 1: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el número 2: ");
        int n2 = sc.nextInt();

        System.out.println("El resultado es: "+(n2+n1)); 
    }

    public static void Programa3(){
        System.out.print("Ingrese el número 1: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el número 2: ");
        int n2 = sc.nextInt();
        
        boolean b = n1==n2 ? true : false;
        System.out.println("Los números son iguales: "+b); 
    }
        
    public static void Programa5(){
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        boolean par = numero%2==0 ? true : false;
        System.out.println("El número es par: "+par); 
    }

    public static void Programa7(){
        System.out.print("Ingrese un año: ");
        int numero = sc.nextInt();
        boolean bisiesto = numero%4==0 ? true : false;
        System.out.println("El año es bisiesto: "+bisiesto); 
    }

    public static void Programa9(){
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        for(int i = 1; i <=10; i++){
            System.out.println(""+numero + "X"+""+i +"="+(numero*i));
        }    
    }

    public static void Programa11(){
        System.out.print("Ingrese el número 1: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el número 2: ");
        int n2 = sc.nextInt();
        
        System.out.print(n1 + " x " + n2 + " = ");
        for(int i = 1; i<n2; i++){
            System.out.print(n1+" + "); 
        }
        System.out.print(n1 + " = ");

        System.out.println(n1*n2);

    }

    public static void Programa13(){
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        int suma = 0;
        for(int i = 1; i <=numero; i++){
            suma += i;
        }    
        System.out.println("El resultado es: "+suma);
    }

    public static void Programa15(){
        int totalVeces = 0;
        int totalSuma = 0;
        int numero = 0;
        do{
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();
            if(numero!=0){
                totalVeces++;
                totalSuma+=numero;
            }
        }while(numero!=0);
        
        if(numero == 0){
           if(totalVeces != 0){
                System.out.println("Promedio: "+ (totalSuma/totalVeces));
           }else{
                System.out.println("Promedio: "+0);            
            }
        }
    }

    public static void Programa17(){
        System.out.print("Ingrese un precio: ");
        int numero = sc.nextInt();

        System.out.println("Precio original: "+numero);
        System.out.println("Precio en oferta: "+numero*0.75);

    }

    public static void Programa19(){
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();
        
        System.out.print("Impares positivos menores a él: ");
        for(int i=numero-1; i>=1; i--){
            if(i%2!=0){
                System.out.print(i+" ");            
            }
        }
        System.out.println("");
    }

    public static void Programa21(){
        
    String s = String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s"
             , "*****    *    ****   *****    "
             , "*       * *   *   *  *   *"
             , "*      *   *  *  *   *   *   "
             , "*****  *****  ***    ***      "
             , "*      *   *  *  *   *  *        "
             , "*      *   *  *   *  *   *       "
             , "*****  *   *  ****   *   *       "
    );   
        System.out.println(s);
    }


    public static void Programa23(){
        double totalDinero = 0;
        System.out.println("Ingrese la cantidad de monedas de 0.50: ");
        totalDinero+=sc.nextInt()*0.5;
        System.out.println("Ingrese la cantidad de monedas de 0.25: ");
        totalDinero+=sc.nextInt()*0.25;
        System.out.println("Ingrese la cantidad de monedas de 0.10: ");
        totalDinero+=sc.nextInt()*0.1;
        System.out.println("Ingrese la cantidad de monedas de 0.01: ");
        totalDinero+=sc.nextInt()*0.01;

        System.out.println("Total de dinero Q. "+totalDinero);
    
    }

    
    public static void Programa25(){
        String text = "Text.txt";
		BufferedReader br = null;
		FileReader fr = null;

		try {

			br = new BufferedReader(new FileReader(text));
            int totalVueltas = 0;
            int totalValue = 0;
            int numero = 0;
			String s;

			while ((s = br.readLine()) != null) {

				System.out.println(s);

                if(isNumeric(s)){
                    totalVueltas++;     
                    numero = Integer.parseInt(s);
                    totalValue+=numero;
                }
			}

            System.out.println("Promedio: "+totalValue/totalVueltas);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
    }

    public static boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c))return false;
        }
        return true;
    }
}


