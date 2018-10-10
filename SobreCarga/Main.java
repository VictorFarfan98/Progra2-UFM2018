import java.io.*;
import java.util.*;
import java.lang.Math;
import java.text.SimpleDateFormat; // (https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)
import java.text.ParseException;


class Main{
    public static float saldoCliente = 0;
    
    public static ArrayList<Pago> misPagos = new ArrayList<Pago>();

    public static void main(String args[]){
        System.out.println("Control de pagos");
        
        //Se pide monto inicial y se actualiza el saldo
        System.out.print("Ingrese su monto inicial: ");    
            
        Scanner scannerNumero = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        
        saldoCliente = scannerNumero.nextFloat();
        
        int opcion = 0;
        
        
        //Switch para pedir qué quiere hacer el usuario
        do{
            System.out.println("1. Realizar un pago");
            System.out.println("2. Programar un pago futuro");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Revisar mis transacciones");
            System.out.println("5. Ver estado de cuenta");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = Math.round(scannerNumero.nextFloat());
            
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese la cantidad: ");
                    float cantidadSF = scannerNumero.nextFloat();
                    if(cantidadSF<=saldoCliente && cantidadSF>0){
                        System.out.println("Ingrese la descripcion: ");
                        String descripcionSF = scannerString.nextLine();
                        saldoCliente-=cantidadSF;
                        Pago pagoSF = new Pago(cantidadSF, descripcionSF);                    
                        misPagos.add(pagoSF);
                        System.out.println("Pago realizado exitosamente!"); 
                    }else{
                        System.out.println("No pudo realizarse el pago.");
                    }
                    break;
                case 2: 
                    SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
                    System.out.println("Ingrese la cantidad: ");
                    float cantidadCF = scannerNumero.nextFloat();
                    
                    if(cantidadCF<=saldoCliente && cantidadCF>){
                        System.out.println("Ingrese la descripcion: ");
                        String descripcionCF = scannerString.nextLine();
                        System.out.println("Ingrese la fecha: ");
                        Date dateCF = new Date();
                        try{
                            System.out.print("Ingrese la fecha de entrega (yyyy-MM-dd): ");
                            String fecha = scannerString.nextLine();
                            dateCF = myFormat.parse(fecha); 
                        }catch (ParseException e) {
                            e.printStackTrace();
                        } 
                        
                        saldoCliente-=cantidadCF;
                        Pago pagoCF = new Pago(cantidadCF, dateCF, descripcionCF);
                        misPagos.add(pagoCF);
                        System.out.println("Pago realizado exitosamente!");                    
                    }else{
                        System.out.println("No pudo realizarse el pago.");
                    }
                    break;
               case 3:
                    System.out.print("Ingrese la cantidad que desea depositar: ");
                    saldoCliente+=scannerNumero.nextFloat();
                    System.out.println("Saldo actualizado correctamente!");
                    break;
               
               case 4:
                    for(Pago pago:misPagos){
                        System.out.println(pago.toString());
                    }
                    break;
               
               case 5:
                    System.out.println("Su estado de cuenta es: "+saldoCliente);
                    break;   
               
               case 6:
                    System.out.println("Hasta luego!");
                    break;
            
            }
            
        }while(opcion != 6);        
        //Switch con opciones: 
        /*
            1. Realizar pago
            2. Programar pago
            3. Revisar transacciones
            4. Ver estado de cuenta
            5. Salir
        
        */
    }
}
