/**
 * JDialogDiccionario.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * JDialogDiccionario.java
 *
 * Created on 14 de junio de 2004, 12:28
 */

package com.geopista.app.administrador.dominios;

import java.awt.Dimension;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ResourceBundle;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.geopista.app.administrador.estructuras.Estructuras;
import com.geopista.app.utilidades.TextPane;
import com.geopista.app.utilidades.estructuras.ComboBoxEstructuras;
import com.geopista.protocol.ListaEstructuras;


/**
 *
 * @author  angeles
 */
public class JDialogDiccionario extends javax.swing.JDialog {

    private boolean bAceptar=false;
    private ResourceBundle messages;
    private ListaEstructuras idiomas;
    private Vector vCombos=new Vector();
    private Vector vTextArea = new Vector();
    /** Creates new form JDialogDiccionario */
    public JDialogDiccionario(java.awt.Frame parent, boolean modal,
                              Hashtable hDic, boolean bEnabled, ResourceBundle messages)
    {

        super(parent, modal);
        this.messages=messages;
        initComponents(hDic);
        changeScreenLang(messages);
        enabled(bEnabled);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents(Hashtable hDic)
    {
        jPanelTerminos = new javax.swing.JPanel();
        idiomas=Estructuras.getListaLanguage();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelBotonera = new javax.swing.JPanel();


        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        if (idiomas!=null && idiomas.size()>0)
        {
            jPanelTerminos.setLayout(new java.awt.GridLayout(idiomas.size(),1));
            int i=0;
            for (Enumeration e=idiomas.getLista().elements();e.hasMoreElements();)
            {
                e.nextElement();
                ComboBoxEstructuras jComboBoxEstructura = new ComboBoxEstructuras(idiomas,new java.awt.event.ActionListener() {
                     public void actionPerformed(java.awt.event.ActionEvent evt) {
                            comprobarOtrosCombos(evt);
                        }
                }, com.geopista.app.administrador.init.Constantes.Locale);
                jComboBoxEstructura.setName(new Integer(i).toString());
                i++;
                TextPane auxTextArea= new TextPane(256);
                auxTextArea.setLineWrap(true);
                auxTextArea.setMinimumSize(new Dimension(380,60));
                auxTextArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
                vTextArea.add(auxTextArea);
                vCombos.add(jComboBoxEstructura);
                JPanel auxPanel= new JPanel();
                auxPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                auxPanel.add(jComboBoxEstructura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, -1));
                JScrollPane auxScroll= new JScrollPane(auxTextArea);
                auxPanel.add(auxScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 380, 60));
                jPanelTerminos.add(auxPanel);


            }
        }
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptar();
            }
        });

        jPanelBotonera.add(jButtonAceptar);

        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar();
            }
        });

        jPanelBotonera.add(jButtonCancelar);


        JScrollPane  scroll= new JScrollPane(jPanelTerminos);
        getContentPane().add(scroll, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanelBotonera,  java.awt.BorderLayout.SOUTH);

        int i=0;
        for (Enumeration e=hDic.keys();e.hasMoreElements();)
        {
              String sLocale= (String)e.nextElement();
              if ((idiomas.getDomainNode(sLocale)!=null)&& i<vCombos.size())
              {
                  ComboBoxEstructuras auxCombo=(ComboBoxEstructuras)vCombos.elementAt(i);
                  auxCombo.setSelectedPatron(sLocale);
                  TextPane auxTextArea =(TextPane)vTextArea.elementAt(i);
                  auxTextArea.setText((String)hDic.get(sLocale));
                  i++;
              }
        }
    }//GEN-END:initComponents
    private void enabled(boolean bEnabled)
    {
        for (int i=0; i<vCombos.size();i++)
        {
            ((JComponent)vCombos.elementAt(i)).setEnabled(bEnabled);
            ((TextPane)vTextArea.elementAt(i)).setEnabled(bEnabled);
        }
    }

    private void jButtonCancelar() {
         bAceptar=false;
         dispose();
    }

    public Hashtable getDiccionario() {
        if (bAceptar)
        {
           Hashtable auxDict= new Hashtable();
           for (int i=0; i<vCombos.size();i++)
           {
               String sPatron=((ComboBoxEstructuras)vCombos.elementAt(i)).getSelectedPatron();
               String sTexto=((TextPane)vTextArea.elementAt(i)).getText();
               if (sPatron!=null&&sPatron.length()>0&&sTexto!=null&&sTexto.length()>0)
               {
                  auxDict.put(sPatron,sTexto);
               }
           }
           return auxDict;
        }
         else
            return null;
       }//GEN-LAST:event_jButtonCancelarActionPerformed

    private  boolean comprobarDatos()
    {
        for (int i=0; i<vCombos.size();i++)
        {
               String sPatron=((ComboBoxEstructuras)vCombos.elementAt(i)).getSelectedPatron();
               String sTexto=((TextPane)vTextArea.elementAt(i)).getText();
               if (sTexto!=null&&sTexto.length()>0)
               {
                   if (sPatron==null || sPatron.length()<=0)
                       return false;
               }
        }
        return true;
    }

    private void jButtonAceptar() {

        if (!comprobarDatos())
             {
                    int n = JOptionPane.showOptionDialog(this,
                                                     messages.getString("JDialogDiccionario.mensaje.nocompleto"),
                                                     "",
                                                     JOptionPane.YES_NO_OPTION,
                                                     JOptionPane.QUESTION_MESSAGE,null,null,null);
                    if (n==JOptionPane.NO_OPTION) return;
        }
        bAceptar=true;
        dispose();
    }

    private void comprobarOtrosCombos(java.awt.event.ActionEvent evt)
    {
        if (!(evt.getSource() instanceof ComboBoxEstructuras)) return;
        ComboBoxEstructuras selectedCombo=(ComboBoxEstructuras) evt.getSource();
        String patronSelect=selectedCombo.getSelectedPatron();
        if (patronSelect==null) return;
        for (Enumeration e= vCombos.elements();e.hasMoreElements();)
        {
              ComboBoxEstructuras otro=(ComboBoxEstructuras)e.nextElement();
              if (otro.getName()!=null&&
                  !(otro.getName().equals(selectedCombo.getName())) &&
                  patronSelect.equalsIgnoreCase(otro.getSelectedPatron()))
              {
                  selectedCombo.setSelectedIndex(0);
                  return;
              }
        }

    }

    public void changeScreenLang(ResourceBundle messages) {
        this.messages=messages;
        setTitle( messages.getString("JDialogDiccionario.title"));
        jButtonAceptar.setText(messages.getString("JDialogDiccionario.jButonAceptar"));
        jButtonCancelar.setText(messages.getString("JDialogDiccionario.jButonCancelar"));
        jButtonAceptar.setToolTipText(messages.getString("JDialogDiccionario.jButonAceptar"));
        jButtonCancelar.setToolTipText(messages.getString("JDialogDiccionario.jButonCancelar"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JPanel jPanelTerminos;
    private javax.swing.JPanel jPanelBotonera;
   // End of variables declaration//GEN-END:variables

}
