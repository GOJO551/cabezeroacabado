package modelos;

public class Clientes {
    //defino las variables del producto
    private int idCliente;
    private String nombre;
    private String apellido;
    private double edad;
    private String telefono;
    private String genero;

    //Implementamos un constructor con todos los atributos
    public Clientes(int idCliente, String nombre, String apellido, double edad, String telefono, String genero) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.genero = genero;
    }

    public Clientes() {

    }

    public int getIdcliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}