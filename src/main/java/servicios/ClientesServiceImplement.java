package servicios;

import modelos.Clientes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientesServiceImplement implements ClientesServices {

    @Override
    public List<Clientes> listar() {
        return Arrays.asList(new Clientes(1,"Ivan","Cabrera",22,233215,"Masculino"),
                new Clientes(2,"Juan","Cabrera",22,25664,"Masculino"),
                new Clientes(12,"Carlos","Cabrera",22,22366,"Masculino")
               );
    }
}

