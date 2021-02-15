
/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;

public class Empleado
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    private int numeroEmpleado;
    private Date ingreso; 
    private double salario;
    
    /**
     * Constructor for objects of class Empleado
     */
    public Empleado(String nom, String ap, double sal, int dia, int mes, int año)
    {
        // initialise instance variables
        nombre = new String(nom);
        apellido = new String(ap);
        numeroEmpleado = 1;
        ingreso = new Date(año, mes, dia);
        salario = sal; 
    }
    
    public String getNombre() 
    {
        return new String(nombre);
    }
    
    public String getApellido()
    {
        return new String(apellido);
    }
    
    public int getNumeroEmpleado() 
    {
        return numeroEmpleado;
    }
    
    public Date getIngreso() 
    {
        return ingreso;
    }
    
    public void setSalario(double sal)
    {
        salario = (sal >= 0) ? sal : 0;
    }
    
    public double getSalario()
    {
        return salario;
    }

}



