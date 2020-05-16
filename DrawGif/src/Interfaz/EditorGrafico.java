/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import AnalizadorColors.ContentColor;
import AnalizadorLienzos.lienzo;
import AnalizadorPnt.Codigo;
import AnalizadorTime.Tiempos;
import AnalizadorTime.Time;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JPanel;

/**
 *
 * @author jhonny
 */
public class EditorGrafico extends javax.swing.JPanel {

    /**
     * Creates new form EditorGrafico
     */
    
    int fila, columna;
    JPanel printPanel;

    public EditorGrafico() {
        initComponents();
        printPanel = new JPanel();
        
    }

    public  JButton getColorSelect() {
        return ColorSelect;
    }

    public void setItems() {
        fila=this.lz.getDim_y();
        columna=this.lz.getDim_x();
        this.tab.setBackground(this.lz.getColor());
        this.Ids.removeAllItems();
        for (int i = 0; i < tmp.getList().size(); i++) {
            String dato = tmp.getList().get(i).getId();
            this.Ids.addItem(dato);
            tmp.getList().get(i).inicializarTablero(fila, columna);
        }
        this.Inicio.setText(this.tmp.getInicio());
        this.Fin.setText(this.tmp.getFin());
        this.Inicio.setEnabled(false);
        this.Fin.setEnabled(false);
        iniciarColores();
        iniciarTablero();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Duracion1 = new javax.swing.JTextField();
        Inicio = new javax.swing.JTextField();
        Fin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Ids = new javax.swing.JComboBox<>();
        Duracion2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PanelColores = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ColorSelect = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        colores = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JPanel();

        setBackground(new java.awt.Color(208, 210, 213));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);

        jLabel1.setText("Duracion");

        jLabel2.setText("Inicio");

        jLabel3.setText("Fin");

        Duracion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Duracion1KeyTyped(evt);
            }
        });

        Inicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InicioKeyTyped(evt);
            }
        });

        Fin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FinKeyTyped(evt);
            }
        });

        jLabel4.setText("Imagen");

        Ids.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Ids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdsActionPerformed(evt);
            }
        });

        Duracion2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Duracion2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Duracion2KeyTyped(evt);
            }
        });

        jLabel5.setText("Duracion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Duracion1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(Inicio)
                    .addComponent(Fin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Duracion2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Ids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Duracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Ids, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(Duracion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 150));

        jLabel7.setText("Color Seleccionado");

        jLabel8.setText("Borrador");

        javax.swing.GroupLayout PanelColoresLayout = new javax.swing.GroupLayout(PanelColores);
        PanelColores.setLayout(PanelColoresLayout);
        PanelColoresLayout.setHorizontalGroup(
            PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addGroup(PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(ColorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        PanelColoresLayout.setVerticalGroup(
            PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColoresLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ColorSelect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jCheckBox1))
                .addGap(14, 14, 14))
        );

        add(PanelColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 300, 90));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("COLORES");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        javax.swing.GroupLayout coloresLayout = new javax.swing.GroupLayout(colores);
        colores.setLayout(coloresLayout);
        coloresLayout.setHorizontalGroup(
            coloresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        coloresLayout.setVerticalGroup(
            coloresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(colores);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 300, 280));

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(tab);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 810, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void Duracion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Duracion1KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_Duracion1KeyTyped

    private void InicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InicioKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_InicioKeyTyped

    private void FinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FinKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_FinKeyTyped

    private void Duracion2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Duracion2KeyTyped
         char c = evt.getKeyChar();
     
        if (Character.isLetter(c)) {
            evt.consume();
        }
      
    }//GEN-LAST:event_Duracion2KeyTyped
    int pos = 0;
    private void IdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdsActionPerformed
        try {
            String name = this.Ids.getSelectedItem().toString();
            pos = this.Ids.getSelectedIndex();
            tmp.getList().stream().filter((list) -> (list.getId().equals(name))).forEachOrdered((Time list) -> {
                this.Duracion2.setText(String.valueOf(list.getDuracion1()));
            });
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_IdsActionPerformed

    private void Duracion2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Duracion2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         this.tmp.getList().get(pos).setDuracion1(Float.parseFloat(this.Duracion2.getText()));
        }
    }//GEN-LAST:event_Duracion2KeyPressed
    lienzo lz;
    ContentColor clr;
    Tiempos tmp;
    Codigo pnt;

    public void setLz(lienzo lz) {
        this.lz = lz;
    }

    public void setClr(ContentColor clr) {
        this.clr = clr;
    }

    public void setTmp(Tiempos tmp) {
        this.tmp = tmp;
    }

    public void setPnt(Codigo pnt) {
        this.pnt = pnt;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ColorSelect;
    private javax.swing.JTextField Duracion1;
    private javax.swing.JTextField Duracion2;
    private javax.swing.JTextField Fin;
    private javax.swing.JComboBox<String> Ids;
    private javax.swing.JTextField Inicio;
    private javax.swing.JPanel PanelColores;
    private javax.swing.JPanel colores;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel tab;
    // End of variables declaration//GEN-END:variables
    
    
    private void iniciarColores() {
        GridLayout grid = new GridLayout(clr.getList().size(), 2);
        grid.setHgap(10);
        grid.setVgap(10);
        this.colores.setLayout(grid);
        JLabel lb[][] = new JLabel[clr.getList().size()][2];
        for (int i = 0; i < clr.getList().size(); i++) {
            lb[i][0] = new JLabel(clr.getList().get(i).getNombre());
            lb[i][0].setFont(new java.awt.Font("Ubuntu", 1, 18));
            this.colores.add(lb[i][0]);
            //--------------------->Agregando el color
            lb[i][1] = new JLabel("");
            lb[i][1].setOpaque(true);
            lb[i][1].setBackground(clr.getList().get(i).getColor());
            lb[i][1].addMouseListener(new mouseAdapter(clr.getList().get(i).getColor(),this));
            ColorSelect.setBackground(lb[i][1].getBackground());
            this.colores.add(lb[i][1]);
        }
    }

    private void iniciarTablero() {
        
    
    }

}
