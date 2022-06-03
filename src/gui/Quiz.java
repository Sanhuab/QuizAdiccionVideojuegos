package gui;

import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Quiz extends javax.swing.JFrame {

    int resultado = 0;
    public int resGlobal;

    public Quiz() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public int getResGlobal() {
        return resGlobal;
    }

    public Quiz(int resGlobal) {
        this.resGlobal = resGlobal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rbtn1_1 = new javax.swing.JRadioButton();
        rbtn1_2 = new javax.swing.JRadioButton();
        rbtn1_3 = new javax.swing.JRadioButton();
        rbtn1_4 = new javax.swing.JRadioButton();
        rbtn1_5 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        rbtn2_1 = new javax.swing.JRadioButton();
        rbtn2_2 = new javax.swing.JRadioButton();
        rbtn3_2 = new javax.swing.JRadioButton();
        rbtn3_1 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        rbtn4_2 = new javax.swing.JRadioButton();
        rbtn4_1 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        rbtn5_2 = new javax.swing.JRadioButton();
        rbtn5_1 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        rbtn6_2 = new javax.swing.JRadioButton();
        rbtn6_1 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        rbtn7_2 = new javax.swing.JRadioButton();
        rbtn7_1 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        rbtn8_2 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        rbtn8_1 = new javax.swing.JRadioButton();
        rbtn9_2 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        rbtn9_1 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        rbtn10_1 = new javax.swing.JRadioButton();
        rbtn11_2 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        rbtn11_1 = new javax.swing.JRadioButton();
        rbtn12_2 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        rbtn12_1 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        rbtn13_1 = new javax.swing.JRadioButton();
        rbtn13_2 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        rbtn14_1 = new javax.swing.JRadioButton();
        rbtn14_2 = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        rbtn10_2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouses/controlBL.png"))); // NOI18N

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("1.- ¿Esta semana he jugado a mi juego habitual?");

        rbtn1_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbtn1_1);
        rbtn1_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn1_1.setText("De 1 a 3 Partidas");

        rbtn1_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbtn1_2);
        rbtn1_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn1_2.setText("De 4 a 5 Partidas");

        rbtn1_3.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbtn1_3);
        rbtn1_3.setForeground(new java.awt.Color(0, 0, 0));
        rbtn1_3.setText("De 6 a 10 Partidas");

        rbtn1_4.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbtn1_4);
        rbtn1_4.setForeground(new java.awt.Color(0, 0, 0));
        rbtn1_4.setText("De 11 a 15 Partidas");

        rbtn1_5.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rbtn1_5);
        rbtn1_5.setForeground(new java.awt.Color(0, 0, 0));
        rbtn1_5.setText("De 16 a 20  Partidas");

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("2.- ¿Empleo más de 1 hora por día en jugar?");

        rbtn2_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(rbtn2_1);
        rbtn2_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn2_1.setText("Si");

        rbtn2_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(rbtn2_2);
        rbtn2_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn2_2.setText("No");

        rbtn3_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup3.add(rbtn3_2);
        rbtn3_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn3_2.setText("Mal conmigo mismo");

        rbtn3_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup3.add(rbtn3_1);
        rbtn3_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn3_1.setText("Bien conmigo mismo");

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("3.- Si no consigo mis objetivos en el videojuego me siento:");

        rbtn4_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup4.add(rbtn4_2);
        rbtn4_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn4_2.setText("No");

        rbtn4_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup4.add(rbtn4_1);
        rbtn4_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn4_1.setText("Si");

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("4.- Me enfado si estoy jugando y alguien me interrumpe:");

        rbtn5_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup5.add(rbtn5_2);
        rbtn5_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn5_2.setText("No");

        rbtn5_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup5.add(rbtn5_1);
        rbtn5_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn5_1.setText("Si");

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("5.- Priorizo los momentos de estudios, el trabajo y la familia: el juego está después de todo eso:");

        rbtn6_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup6.add(rbtn6_2);
        rbtn6_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn6_2.setText("No");

        rbtn6_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup6.add(rbtn6_1);
        rbtn6_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn6_1.setText("Si");

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("6.- Si me quedo sin conexión a internet, me molesto y me altero:");

        rbtn7_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup7.add(rbtn7_2);
        rbtn7_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn7_2.setText("No");

        rbtn7_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup7.add(rbtn7_1);
        rbtn7_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn7_1.setText("Si");

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("7.- ¿Hago mis comidas del dia con tranquilidad, aunque tenga la posibilidad de jugar?");

        rbtn8_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup8.add(rbtn8_2);
        rbtn8_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn8_2.setText("No");

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("8.- ¿Suelo tener la sensación de que estoy perdiendo el tiempo en mi vida?");

        rbtn8_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup8.add(rbtn8_1);
        rbtn8_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn8_1.setText("Si");

        rbtn9_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup9.add(rbtn9_2);
        rbtn9_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn9_2.setText("No");

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("9.- ¿Me aislo de la familia o las amistades para poder jugar con mas tranquilidad?");

        rbtn9_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup9.add(rbtn9_1);
        rbtn9_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn9_1.setText("Si");

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("10.-  A veces me siento inferior a las demás personas o siento que están por encima de mí.");

        rbtn10_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup10.add(rbtn10_1);
        rbtn10_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn10_1.setText("Si");

        rbtn11_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup11.add(rbtn11_2);
        rbtn11_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn11_2.setText("No");

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("11.- A veces me siento superior a las demás personas por superarlos en el videojuego. ");

        rbtn11_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup11.add(rbtn11_1);
        rbtn11_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn11_1.setText("Si");

        rbtn12_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup12.add(rbtn12_2);
        rbtn12_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn12_2.setText("No");

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("12.- Si un día no puedo jugar, siento como si me faltara algo, siento ansiedad. ");

        rbtn12_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup12.add(rbtn12_1);
        rbtn12_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn12_1.setText("Si");

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("13.- Lo importante es divertirme en mi videojuego. ");

        rbtn13_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup13.add(rbtn13_1);
        rbtn13_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn13_1.setText("Si");

        rbtn13_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup13.add(rbtn13_2);
        rbtn13_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn13_2.setText("No");

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("14.- Cuando estoy acostado pienso en estrategias para mejorar. ");

        rbtn14_1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup14.add(rbtn14_1);
        rbtn14_1.setForeground(new java.awt.Color(0, 0, 0));
        rbtn14_1.setText("Si");

        rbtn14_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup14.add(rbtn14_2);
        rbtn14_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn14_2.setText("No");

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnTerminar.setText("TERMINAR");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        rbtn10_2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup10.add(rbtn10_2);
        rbtn10_2.setForeground(new java.awt.Color(0, 0, 0));
        rbtn10_2.setText("No");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn2_1)
                    .addComponent(rbtn2_2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtn1_1)
                            .addComponent(rbtn1_4)
                            .addComponent(rbtn1_2)
                            .addComponent(rbtn1_5)
                            .addComponent(rbtn1_3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbtn3_1)
                                            .addComponent(rbtn3_2)
                                            .addComponent(rbtn4_1)
                                            .addComponent(rbtn4_2)
                                            .addComponent(rbtn5_1)
                                            .addComponent(rbtn5_2)
                                            .addComponent(rbtn6_1)
                                            .addComponent(rbtn6_2)
                                            .addComponent(rbtn7_1)
                                            .addComponent(rbtn7_2)
                                            .addComponent(rbtn8_1)
                                            .addComponent(rbtn8_2)
                                            .addComponent(rbtn9_1)
                                            .addComponent(rbtn9_2)
                                            .addComponent(rbtn10_1)
                                            .addComponent(rbtn11_1)
                                            .addComponent(rbtn11_2)
                                            .addComponent(rbtn12_1)
                                            .addComponent(rbtn12_2)
                                            .addComponent(rbtn13_1)
                                            .addComponent(rbtn13_2)
                                            .addComponent(rbtn14_1)
                                            .addComponent(rbtn14_2)
                                            .addComponent(rbtn10_2))))
                                .addGap(0, 217, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTerminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addComponent(rbtn1_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn1_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn1_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn1_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn1_5)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(rbtn2_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn2_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(rbtn3_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn3_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(rbtn4_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn4_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(rbtn5_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn5_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(rbtn6_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn6_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(rbtn7_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn7_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(rbtn8_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn8_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(rbtn9_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn9_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(rbtn10_1)
                .addGap(3, 3, 3)
                .addComponent(rbtn10_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(rbtn11_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn11_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(rbtn12_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn12_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(rbtn13_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn13_2)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(rbtn14_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn14_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTerminar)
                    .addComponent(btnSalir))
                .addGap(26, 26, 26))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        resGlobal = obtieneResultado();
        new Diagnostico().setVisible(true);
        hide();
    }//GEN-LAST:event_btnTerminarActionPerformed
    public int obtieneResultado() {
        //Pregunta1_____________________
        if (rbtn1_1.isSelected()) {
            resultado = resultado + 1;
        } else if (rbtn1_2.isSelected()) {
            resultado = resultado + 2;
        } else if (rbtn1_3.isSelected()) {
            resultado = resultado + 3;
        } else if (rbtn1_4.isSelected()) {
            resultado = resultado + 4;
        } else if (rbtn1_5.isSelected()) {
            resultado = resultado + 5;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 1");
        }
        //Pregunta2_____________________
        if (rbtn2_1.isSelected()) {
            resultado = resultado + 5;
        } else if (rbtn2_2.isSelected()) {
            resultado = resultado + 0;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 2");
        }
        //Pregunta3_____________________
        if (rbtn3_1.isSelected()) {
            resultado = resultado + 0;
        } else if (rbtn3_2.isSelected()) {
            resultado = resultado + 5;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 3");
        }
        //Pregunta4_____________________
        if (rbtn4_1.isSelected()) {
            resultado = resultado + 5;
        } else if (rbtn4_2.isSelected()) {
            resultado = resultado + 0;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 4");
        }
        //Pregunta5_____________________
        if (rbtn5_1.isSelected()) {
            resultado = resultado + 0;
        } else if (rbtn5_2.isSelected()) {
            resultado = resultado + 5;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 5");
        }
        //Pregunta6_____________________
        if (rbtn6_1.isSelected()) {
            resultado = resultado + 5;
        } else if (rbtn6_2.isSelected()) {
            resultado = resultado + 0;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 6");
        }
        //Pregunta7_____________________
        if (rbtn7_1.isSelected()) {
            resultado = resultado + 0;
        } else if (rbtn7_2.isSelected()) {
            resultado = resultado + 5;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 7");
        }
        //Pregunta8_____________________
        if (rbtn8_1.isSelected()) {
            resultado = resultado + 5;
        } else if (rbtn8_2.isSelected()) {
            resultado = resultado + 0;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 8");
        }
        //Pregunta9_____________________
        if (rbtn9_1.isSelected()) {
            resultado = resultado + 5;
        } else if (rbtn9_2.isSelected()) {
            resultado = resultado + 0;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 9");
        }
        //Pregunta10_____________________
        if (rbtn10_1.isSelected()) {
            resultado = resultado + 5;
        } else if (rbtn10_2.isSelected()) {
            resultado = resultado + 0;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 10");
        }
        //Pregunta11_____________________
        if (rbtn11_1.isSelected()) {
            resultado = resultado + 5;
        } else if (rbtn11_2.isSelected()) {
            resultado = resultado + 0;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 11");
        }
        //Pregunta12_____________________
        if (rbtn12_1.isSelected()) {
            resultado = resultado + 5;
        } else if (rbtn12_2.isSelected()) {
            resultado = resultado + 0;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 12");
        }
        //Pregunta13_____________________
        if (rbtn13_1.isSelected()) {
            resultado = resultado + 0;
        } else if (rbtn13_2.isSelected()) {
            resultado = resultado + 5;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 13");
        }
        //Pregunta14_____________________
        if (rbtn14_1.isSelected()) {
            resultado = resultado + 5;
        } else if (rbtn14_2.isSelected()) {
            resultado = resultado + 0;
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una respuesta de la pregunta 14");
        }
        escriveResultado(resultado);
        return resultado;
    }

    private void escriveResultado(int resultado) {
        String fileName = "resultadoQuiz.txt";
        String encoding = "UTF-8";
        try {
            PrintWriter writer = new PrintWriter(fileName, encoding);
            writer.println(resultado);
            writer.close();
        } catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTerminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtn10_1;
    private javax.swing.JRadioButton rbtn10_2;
    private javax.swing.JRadioButton rbtn11_1;
    private javax.swing.JRadioButton rbtn11_2;
    private javax.swing.JRadioButton rbtn12_1;
    private javax.swing.JRadioButton rbtn12_2;
    private javax.swing.JRadioButton rbtn13_1;
    private javax.swing.JRadioButton rbtn13_2;
    private javax.swing.JRadioButton rbtn14_1;
    private javax.swing.JRadioButton rbtn14_2;
    private javax.swing.JRadioButton rbtn1_1;
    private javax.swing.JRadioButton rbtn1_2;
    private javax.swing.JRadioButton rbtn1_3;
    private javax.swing.JRadioButton rbtn1_4;
    private javax.swing.JRadioButton rbtn1_5;
    private javax.swing.JRadioButton rbtn2_1;
    private javax.swing.JRadioButton rbtn2_2;
    private javax.swing.JRadioButton rbtn3_1;
    private javax.swing.JRadioButton rbtn3_2;
    private javax.swing.JRadioButton rbtn4_1;
    private javax.swing.JRadioButton rbtn4_2;
    private javax.swing.JRadioButton rbtn5_1;
    private javax.swing.JRadioButton rbtn5_2;
    private javax.swing.JRadioButton rbtn6_1;
    private javax.swing.JRadioButton rbtn6_2;
    private javax.swing.JRadioButton rbtn7_1;
    private javax.swing.JRadioButton rbtn7_2;
    private javax.swing.JRadioButton rbtn8_1;
    private javax.swing.JRadioButton rbtn8_2;
    private javax.swing.JRadioButton rbtn9_1;
    private javax.swing.JRadioButton rbtn9_2;
    // End of variables declaration//GEN-END:variables
}
