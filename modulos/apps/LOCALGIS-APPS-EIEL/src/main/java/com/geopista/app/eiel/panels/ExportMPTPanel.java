/**
 * ExportMPTPanel.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.eiel.panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import com.geopista.app.AppContext;
import com.geopista.app.editor.GeopistaFiltroFicheroFilter;
import com.geopista.app.eiel.ConstantesLocalGISEIEL;
import com.geopista.app.eiel.utils.EdicionUtils;
import com.geopista.plugin.Constantes;
import com.geopista.util.config.UserPreferenceStore;
import com.vividsolutions.jump.I18N;
import com.vividsolutions.jump.workbench.ui.GUIUtil;

public class ExportMPTPanel extends JPanel{

	private JFileChooser fileChooser;   
	private JLabel jLabelFase = null;
	private JTextField jNumberFieldFase = null;
	private static AppContext aplicacion = (AppContext) AppContext.getApplicationContext();


	public ExportMPTPanel(GridBagLayout layout){
		 super(layout);
	        initialize();
	}

	 private void initialize(){      
	        Locale loc=I18N.getLocaleAsObject();         
	        ResourceBundle bundle = ResourceBundle.getBundle("com.geopista.app.eiel.language.LocalGISEIELi18n",loc,this.getClass().getClassLoader());
	        I18N.plugInsResourceBundle.put("LocalGISEIEL",bundle);
	        
	        this.setName(I18N.get("LocalGISEIEL","localgiseiel.mpt.panel.title"));
	        
	        this.setLayout(new GridBagLayout());
//	        this.setSize(ExportMPTDialog.DIM_X,ExportMPTDialog.DIM_Y);
	        jLabelFase = new JLabel("");
	        jLabelFase.setText(I18N.get("LocalGISEIEL", "localgiseiel.panels.label.anioencuesta"));       
	        
	        this.add(jLabelFase,  
	        		new GridBagConstraints(0, 0, 1, 1, 0.1, 0.1,
	                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
	                new Insets(5, 20, 5, 20), 0, 0));
	    	this.add(getJNumberFieldFase(),  
	    	        		new GridBagConstraints(0, 1, 1, 1, 1.0, 0.1,
	    	                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
	    	                new Insets(5, 20, 5, 20), 0, 0));
	        
//	        this.add(getFileChooser(), 
//	        		new GridBagConstraints(1, 0, 1, 3, 0.1, 0.1,
//	                GridBagConstraints.ABOVE_BASELINE, GridBagConstraints.BOTH,
//	                new Insets(0, 5, 0, 5), 0, 0));
//	              
	        
	 }
	 
	 private JFileChooser getFileChooser() {
	        if (fileChooser == null) {
	        	 fileChooser = new GUIUtil.FileChooserWithOverwritePrompting();
	             fileChooser.setDialogTitle(I18N.get("LocalGISEIEL", "localgiseiel.dialog.titulo.expMPT.save"));
	            GeopistaFiltroFicheroFilter filter = new GeopistaFiltroFicheroFilter();
	            filter.addExtension("zip");
	            filter.setDescription("Zip");
	    		fileChooser.setFileHidingEnabled(false);
	    		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	            fileChooser.setFileFilter(filter);	 
	         // Se abre el fichero donde se har� la copia
	            Calendar calendar = new GregorianCalendar();

            	// Se abre el fichero donde se har� la copia
				String currentdate = calendar.get(Calendar.DATE)+"-"+
				(calendar.get(Calendar.MONTH)+1)+"-"+
				calendar.get(Calendar.YEAR);
				
				fileChooser.setSelectedFile(new File(File.separator+ConstantesLocalGISEIEL.FILENAME_EXPORT_MPT_ZIP+"_"+currentdate+".zip"));
	        }
	        File currentDirectory = (File) aplicacion.getBlackboard().get(Constantes.LAST_IMPORT_DIRECTORY);
            fileChooser.setCurrentDirectory(currentDirectory);
	        return (JFileChooser) fileChooser;
	    }
	    
	 private JTextField getJNumberFieldFase()
		{
		 if (jNumberFieldFase  == null)
			{
			 jNumberFieldFase  = new JTextField();
			 jNumberFieldFase.setText(UserPreferenceStore.getUserPreference("FASE","", true));
			 jNumberFieldFase.addCaretListener(new CaretListener()
				{
					public void caretUpdate(CaretEvent evt)
					{
						EdicionUtils.chequeaLongYNumCampoEdit(jNumberFieldFase, 4, aplicacion.getMainFrame());
					}
				});
			}
			return jNumberFieldFase;
		}
	 
	 public String getAnioEncuesta() {
		String anio=getJNumberFieldFase().getText();
		UserPreferenceStore.setUserPreference("FASE",anio);
		return anio;
	}
	 public String getDirectorySelected() {
		 File file=getFileChooser().getSelectedFile();
		 String	 directory=file.getAbsolutePath();
		aplicacion.getBlackboard().put(Constantes.LAST_IMPORT_DIRECTORY,file);
			 		 	 
		return directory;
	}
	 
	 public int abrirJFileChooser(){
		 return getFileChooser().showSaveDialog(this);
	 }
	 
	
}
