import java.util.*;
import java.text.SimpleDateFormat; // (https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)
import java.text.ParseException;
public class ToDoList{

    public static TaskList taskList;

    public static void main(String args[]){
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        System.out.println("Para comenzar cree su To Do List");
        System.out.println("1. Crear lista vacía");
        System.out.println("2. Crear lista con una Task");
        
        String opcion = scString.nextLine();
        if(opcion.equals("1")){
            System.out.print("Ingrese el nombre de su lista: ");
            taskList = new TaskList(scString.nextLine());
        }else{
            System.out.println("Ingrese el nombre de su lista: ");
            String nombreLista = scString.nextLine();
            System.out.println("Cree su primer Task");
            Task nuevaTask = nuevaTask();
            taskList = new TaskList(nombreLista, nuevaTask);           
        }
        
        System.out.println("Ahora elija sus acciones posteriores");
        int menu = 0;
        while(menu!=3){
            System.out.println("1. Agregar una nueva task a la lista");
            System.out.println("2. Imprmir lista completa");
            System.out.println("3. Terminar programa")
            menu = scInt.nextInt();
            switch(menu){
                case 1:
                    Task crearTask = nuevaTask();
                    taskList.addTask(crearTask);
                    System.out.println("Task agregada correctamente!");
                    break;
                case 2:
                    taskList.printList();
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                break;
                default:
                    System.out.println("No se encontró esa acción");
                    break;
            }
            
        }
        
        
    }
    
    public static Task nuevaTask(){
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Task returnTask = null;
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("1. Task rápida");
        System.out.println("2. Task normal");
        System.out.println("3. Task con notas");
        System.out.print("Elija la opción que desee utilizar: ");
    
        int opcion = scInt.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese el nombre: ");
                String n1 = sc.nextLine();
                Task taskR = new Task(n1);
                returnTask = taskR; 
                break;
            case 2: 
                System.out.print("Ingrese el nombre: ");
                String nameN = sc.nextLine();
                System.out.print("Ingrese la prioridad: ");
                int prioridadN = scInt.nextInt();
                Date dateN = new Date();
                try{
                    System.out.print("Ingrese la fecha de entrega (yyyy-MM-dd): ");
                    String fecha = sc.nextLine();
                    dateN = myFormat.parse(fecha); 
                }catch (ParseException e) {
                    e.printStackTrace();
                }
                Task taskN = new Task(nameN, prioridadN,dateN);
                returnTask = taskN;
                break;
            case 3:
                System.out.print("Ingrese el nombre: ");
                String nameC = sc.nextLine();
                System.out.print("Ingrese la prioridad: ");
                int prioridadC = scInt.nextInt();
                Date dateC = new Date();
                try{
                    System.out.print("Ingrese la fecha de entrega (yyyy-MM-dd): ");
                    String fechaC = sc.nextLine();
                    dateC = myFormat.parse(fechaC);
                }catch (ParseException e){
                    e.printStackTrace();
                }
                System.out.print("Ingrese las notas: ");
                String notasC = sc.nextLine();
                Task taskC = new Task(nameC, prioridadC,dateC, notasC);
                returnTask = taskC;
                break;
        }
        
        return returnTask;
    }
}
