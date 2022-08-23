/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sapón Pérez
 */
public class Empleado extends Persona {
    
    private String codigo;
    String puesto;

    public Empleado() {}

    public Empleado(String codigo, String puesto, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
        this.puesto = puesto;
    }
    
    
    

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
   
    
    @Override
    public void agregar(){
        System.out.println("Codigo: "+ this.getCodigo());
        System.out.println("Nombres: "+ this.getNombres());
        System.out.println("Apellidos: "+ this.getApellidos());
        System.out.println("Direccion: "+ this.getDireccion());
        System.out.println("Telefono: "+ this.getTelefono());
        System.out.println("Fecha de nacimiento: "+ this.getFecha_nacimiento());
        System.out.println("Puesto: "+ this.getPuesto());
    }
    
    
    
}
