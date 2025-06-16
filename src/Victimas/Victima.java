/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victimas;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Usuario
 */
public class Victima {
    private String cedula;
    private String nombre;
    private String fechaNacimiento;
    private String genero;
    private String correo;/*estos no se ven < */
    private String telefono;
    private String direccion;
    
    
    
    private String generarHash(String dato) {
    return "##" + dato.hashCode() + "##";
    }
       

    
    
    public Victima(String cedula, String nombreHash, String fechaNacimiento, String genero, String correo, String telefono, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        
        
        
        
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    /*calcular la edad*/
    
    public int calculaEdad(String fechaNacimiento){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    
    }

    @Override
    public String toString() {
        return "Victima{" + "cedula=" + cedula + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }
    

















}
