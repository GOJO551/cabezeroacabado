package modelos;

public class Clientes {
    //defino las variables del producto
    private int idCliente;
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private String genero;

    //Implementamos un constructor con todos los atributos
    public Clientes(int idCliente, String nombre, String apellido, int edad, int telefono, String genero) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.genero = genero;
    }

    public Clientes() {
    }

        public int getIdcliente () {
            return idCliente;
        }

        public void setIdcliente ( int idCliente){
            this.idCliente = idCliente;
        }

        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public String getapellido () {
            return apellido;
        }

        public void setapellido (String apellido){
            this.apellido = apellido;
        }

        public int getEdad () {
            return edad;
        }

        public void setEdad ( int edad){
            this.edad = edad;
        }

        public int getTelefono () {
            return telefono;
        }

        public void setTelefono (int telefono){
            this.telefono = telefono;
        }

        public String getGenero () {
            return genero;
        }

        public void setGenero (String genero){
            this.genero = genero;
        }

    }
