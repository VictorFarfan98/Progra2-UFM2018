import java.util.Date; // (https://docs.oracle.com/javase/7/docs/api/)
import java.text.SimpleDateFormat; // (https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)

public class Task{
    
    /* Do not modify */
    private String msg_reminder, notes;
    private Date do_date;
    private int priority = 0;
    private boolean status = false;
    private String pattern = "yyyy-MM-dd";
    private SimpleDateFormat simpleDateFormat;

    /* Your code here */
    
    //Constructor que recibe solo un parámetro String, se le asigna la fecha de la creación en "do_date"
    public Task(String msg_reminder){
        this.msg_reminder = msg_reminder;
        //new Date() devuelve la fecha del sistema
        this.do_date = new Date();
    }

    //Constructor que pide tres parámetros para la instanciación de un Task
    public Task(String msg_reminder, int priority, Date do_date){
        this.msg_reminder = msg_reminder;
        this.priority = priority;
        this.do_date = do_date;
    }

    //Constructor que pide los mismos tres atributos para la instanciación, pero con notas adicionales
    public Task(String msg_reminder, int priority, Date do_date, String notes){
        this.msg_reminder = msg_reminder;
        this.priority = priority;
        this.do_date = do_date;
        this.notes = notes;
    }    

    public String getNotes(){
        return this.notes;
    }

    public int getPriority(){
        return this.priority;
    }

    public boolean getStatus(){
        return this.status;
    }

    public boolean markAsDone(){
        return this.status = true;
        
    }

    // método que devuelve la fecha con un formato especial, se utiliza SimpleDateFormat, el formato y la fecha (do_date)
    public String getTaskDate(){
        /* Your code here */
        String dateToReturn;
        simpleDateFormat = new SimpleDateFormat(pattern);
        dateToReturn = simpleDateFormat.format(this.do_date);
 
        return dateToReturn;
    }

    public String toString(){
        return "Task: " + this.msg_reminder + " Priority: " + this.priority + " Do Date: " + this.getTaskDate();
    }

}
