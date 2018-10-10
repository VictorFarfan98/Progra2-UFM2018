import java.util.Date; // (https://docs.oracle.com/javase/7/docs/api/)
import java.text.SimpleDateFormat; // (https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)
class Pago{
    private float cantidad;
    private Date fecha;
    private String descripcion;
    private String pattern = "yyyy-MM-dd hh:mm:ss";
    private SimpleDateFormat simpleDateFormat;

    //Constructor sin fecha, sí resta del saldo
    public Pago(float cantidad, String descripcion){
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.fecha = new Date();
    }
    //Constructor con fecha para programar pago, no resta del saldo, lo pone en reserva
    public Pago(float cantidad, Date fecha, String descripcion){
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    
    // método que devuelve la fecha con un formato especial, se utiliza SimpleDateFormat, el formato y la fecha (fecha)
    public String getDate(){
        /* Your code here */
        String dateToReturn;
        simpleDateFormat = new SimpleDateFormat(pattern);
        dateToReturn = simpleDateFormat.format(this.fecha);
 
        return dateToReturn;
    }
    
    @Override
    public String toString(){
        return "Fecha: "+this.getDate()+" Cantidad: "+this.cantidad+" Descripcion: "+this.descripcion;
    }
}
