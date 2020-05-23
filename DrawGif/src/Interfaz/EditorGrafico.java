/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import AnalizadorColors.ContentColor;
import AnalizadorLienzos.lienzo;
import AnalizadorPnt.Codigo;
import AnalizadorPnt.cuadroApintar;
import AnalizadorTime.Tiempos;
import AnalizadorTime.Time;
import drawgif.Cuadro;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jhonny
 */
public class EditorGrafico extends javax.swing.JPanel {

    /**
     * Creates new form EditorGrafico
     */
    int fila, columna;

    JLabel tablero[][];

    public EditorGrafico() {
        initComponents();
    }

    public JButton getColorSelect() {
        return ColorSelect;
    }

    public void setItems() {
        fila = this.lz.getDim_y();
        this.contadorGlobal = 20;
        columna = this.lz.getDim_x();
        this.Ids.removeAllItems();
        mouseAdapter mouse = new mouseAdapter(Color.red, this, false);
        GridLayout grid = new GridLayout(fila, columna);
        this.tab.setLayout(grid);
        this.tablero = new JLabel[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero[i][j] = new JLabel();
                tablero[i][j].setOpaque(true);
                tablero[i][j].setBackground(lz.getColor());
                tablero[i][j].addMouseListener(mouse);
                tablero[i][j].setMinimumSize(new Dimension(50, 50));
                tablero[i][j].setPreferredSize(new Dimension(80, 80));
                tablero[i][j].setMaximumSize(new Dimension(100, 100));

                this.tab.add(tablero[i][j]);
            }
        }
        vectorOrden = new String[tmp.getList().size()];
        for (int i = 0; i < tmp.getList().size(); i++) {
            String dato = tmp.getList().get(i).getId();
            vectorOrden[i] = dato;
            this.Ids.addItem(dato);

            for (int j = 0; j < tmp.getList().get(i).getListadoCodigo().size(); j++) {
                cuadroApintar cc = tmp.getList().get(i).getListadoCodigo().get(j);
                tablero[cc.getX()][cc.getY()].setBackground(cc.getClr());
                System.out.println(cc.getClr().toString());
            }
            tmp.getList().get(i).setPaint(saveColors());
        }
        this.Inicio.setText(this.tmp.getInicio());
        this.Fin.setText(this.tmp.getFin());
        this.Inicio.setEnabled(false);
        this.Fin.setEnabled(false);

        iniciarColores();

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
        jButton1 = new javax.swing.JButton();
        PanelColores = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ColorSelect = new javax.swing.JButton();
        borrador = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        colores = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

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

        Duracion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Duracion2ActionPerformed(evt);
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

        jButton1.setText("Ordenar orden de imagenes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
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
                                    .addComponent(jLabel4))))
                        .addGap(61, 61, 61))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 190));

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
                    .addComponent(borrador)
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
                    .addComponent(borrador))
                .addGap(14, 14, 14))
        );

        add(PanelColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 300, 90));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("COLORES");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 300, 250));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 810, 530));

        jButton2.setText("Exportar Este lienzo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 220, -1));
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
    int contadorGlobal;
    
    private void IdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdsActionPerformed
        
            try {
                String name = this.Ids.getSelectedItem().toString();
                tmp.getList().get(pos).setPaint(saveColors());
                pos = this.Ids.getSelectedIndex();
                tmp.getList().stream().filter((list) -> (list.getId().equals(name))).forEachOrdered((Time list) -> {
                    this.Duracion2.setText(String.valueOf(list.getDuracion1()));
                    this.listadoPaint = list.getPaint();
                    iniciarTablero();
                });
            } catch (NullPointerException e) {
            }
      

    }//GEN-LAST:event_IdsActionPerformed
    ArrayList<Cuadro> listadoPaint;

    private void Duracion2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Duracion2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.tmp.getList().get(pos).setDuracion1(Float.parseFloat(this.Duracion2.getText()));
        }
    }//GEN-LAST:event_Duracion2KeyPressed

    private void Duracion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Duracion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Duracion2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDialog dialogo = new JDialog(new EditorDeTexto(), "Ordenando...");
        Ordenar orden = new Ordenar();
        orden.inicializar(this);
        dialogo.add(orden);
        dialogo.setSize(new Dimension(700, 500));
        dialogo.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        boolean isGif = this.lz.getTipo().equals("gif");
        this.tmp.getList().get(this.pos).setPaint(this.saveColors());
        generarImage images = new generarImage(this, isGif);
        images.crearPNG();

    }//GEN-LAST:event_jButton2ActionPerformed
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
    private javax.swing.JCheckBox borrador;
    private javax.swing.JPanel colores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
            lb[i][1].setMinimumSize(new Dimension(15, 15));
            lb[i][1].setPreferredSize(new Dimension(20, 20));
            lb[i][1].setMaximumSize(new Dimension(20, 20));
            lb[i][1].addMouseListener(new mouseAdapter(clr.getList().get(i).getColor(), this, true));
            ColorSelect.setBackground(lb[i][1].getBackground());
            this.colores.add(lb[i][1]);
        }
    }

    private void iniciarTablero() {

        try {
            listadoPaint.forEach((listadoPaint1) -> {
                Color clr = listadoPaint1.getColor();
                int i = listadoPaint1.getPosY();
                int j = listadoPaint1.getPosX();
                this.tablero[i][j].setBackground(clr);
            });
        } catch (NullPointerException e) {

        }

    }

    public ArrayList<Cuadro> saveColors() {
        ArrayList<Cuadro> list = new ArrayList<>();
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                list.add(new Cuadro(i, j, tablero[i][j].getBackground()));
            }
        }
        return list;
    }

    public JLabel[][] getTablero() {
        return tablero;

    }

    public JCheckBox getBorrador() {
        return borrador;
    }

    public Tiempos getTmp() {
        return tmp;
    }
    String vectorOrden[];

    public void setVectorOrden(String[] vectorOrden) {
        this.vectorOrden = vectorOrden;
    }

    public String[] getVectorOrden() {
        return vectorOrden;
    }

    public JTextField getFin() {
        return Fin;
    }

    public JTextField getInicio() {
        return Inicio;
    }

}
