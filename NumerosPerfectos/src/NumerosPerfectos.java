import java.io.*;

public class NumerosPerfectos {
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int num;
        String listado = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese un numero");
        
        num = Integer.parseInt(br.readLine());
        //System.out.println(isPerfecto(num));
        for(int i=1; i < num; i++){
            if(isPerfecto(i)){
                listado += i+"-";
                //System.out.println(i);
            }
        }
        if(listado.length() > 0){
            System.out.println("listado de perfectos menores a "+num+ ": " + listado.substring(0, listado.length()-1));    
        }else{
            System.out.println("No hay numeros perfectos menores al numero ingresado");
        }
        
    }
    
    private static boolean isPerfecto(int numero){
        int suma = 0;
        for(int i = numero-1; i > 0; i--){
            if(numero % i == 0){
                //System.out.println(i);
                suma += i;
            }
        }
        if(suma == numero){
            return true;
        }else{
            return false;
        }
    }
}