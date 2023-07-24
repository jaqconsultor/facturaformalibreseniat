package com.modelo.factura.imprimir;
import java.util.*;

import org.openxava.actions.*;

import net.sf.jasperreports.engine.*;
 
public class ImprimirFactura extends JasperReportBaseAction {  
 
    protected JRDataSource getDataSource() throws Exception {                  
        return null;
    }
 
    protected String getJRXML() {                                              
        return "factura/invoice.jrxml"; 
    }
 
	@Override
	protected Map getParameters() throws Exception {
		  /*Messages errores =
		            MapFacade.validate("FiltroPorSubfamilia", getView().getValues());
		        if (errores.contains()) throw new ValidationException(errores);        // 3
		        */
				//int valor = getView().getValueInt("facturas.id");
				int valor = 1;
		        Map parametros = new HashMap();
		        parametros.put("numerodefactura", valor);
		        return parametros;		
	}
 
}