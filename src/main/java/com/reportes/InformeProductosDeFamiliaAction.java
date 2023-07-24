package com.reportes;
import java.util.*;

import org.openxava.actions.*;

import net.sf.jasperreports.engine.*;
 
public class InformeProductosDeFamiliaAction extends JasperReportBaseAction {  
 
    protected JRDataSource getDataSource() throws Exception {                  
        return null;
    }
 
    protected String getJRXML() {                                              
        return "productos/Blank_A4.jrxml"; 
    }
 
	@Override
	protected Map getParameters() throws Exception {
		return null;
	}
 
}