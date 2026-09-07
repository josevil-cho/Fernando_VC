package pe.edu.upeu.sysventas.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class emisor {
    Long idEmisor;
    String ruc;
    String nombreComercial;
    String Ubigeo;
    String domicilioFiscal;
    String Urbanizacion;
    String departamento;
    String provincia;
    String distrito;
}

