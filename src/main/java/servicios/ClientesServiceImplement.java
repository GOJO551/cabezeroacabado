package servicios;

import modelos.Clientes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientesServiceImplement implements ClientesServices {

    @Override
    public List<Clientes> listar() {
        return Arrays.asList(new Clientes(1,"ivan","cabrera",22,"511","masculino"),
                new Clientes(2,"juan","cabrera",22,"511","masculino"),
                new Clientes(12,"carlos","cabrera",22,"511","masculino")
               );
    }
}

