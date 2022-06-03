package gui;

import adiccionvideojuegos.Conexion;
import entidades.Diagnosticos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Diagnostico extends javax.swing.JFrame {

    Diagnosticos diag = new Diagnosticos();
    Conexion con = new Conexion();
    java.sql.Connection conet;
    Statement st;
    ResultSet rs;
    int puntaje;
    Quiz q = new Quiz();
    String diagnostico;

    public Diagnostico() {
        initComponents();
        evaluaPasiente();
        insertarDiagnostico();
        mostrarDatos();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPonderacion = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtIdPasiente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resultados");
        setBackground(new java.awt.Color(204, 204, 255));
        setFocusable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouses/controlWh.png"))); // NOI18N

        jLabel3.setText("ID:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellidos:");

        jLabel6.setText("Resultado:");

        jLabel7.setText("Ponderacion:");

        txtPonderacion.setEditable(false);
        txtPonderacion.setBackground(new java.awt.Color(255, 255, 255));

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(255, 255, 255));

        txtApellidos.setEditable(false);
        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));

        txtIdPasiente.setEditable(false);
        txtIdPasiente.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdPasiente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPonderacion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalir)))
                        .addGap(390, 390, 390))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdPasiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPonderacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnSalir)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaPasiente(int ponderacion) {

        if (ponderacion <= 70 && ponderacion >= 50) {
            diagnostico = "Severo";
        } else if (ponderacion <= 49 && ponderacion >= 40) {
            diagnostico = "Alto";
        } else if (ponderacion <= 39 && ponderacion >= 30) {
            diagnostico = "Moderado";
        } else if (ponderacion <= 29 && ponderacion >= 1) {
            diagnostico = "Saludable";
        } else {
            System.out.println("Error, no se registro un puntaje");
        }
    }

    private void evaluaPasiente() {
        int ponderacion = leerResultado();
        consultaPasiente(ponderacion);
    }

    private int leerResultado() {
        String sourcePath = "resultadoQuiz.txt";
        try {
            BufferedReader Reader = new BufferedReader(new FileReader(sourcePath));
            String Data;
            while ((Data = Reader.readLine()) != null) {
                puntaje = Integer.parseInt(Data);
            }
            Reader.close();
        } catch (Exception e) {
            System.err.println("Error in method leerResultado(): "+e);
        }
        return puntaje;
    }

    private void insertarDiagnostico() {

        diag.setIdPacinete(obtieneIdPaciente());
        diag.setDiagnostico(diagnostico);
        diag.setPuntos(puntaje);

        String sql = "INSERT INTO diagnosticos (idPaciente, diagnostico, puntos) VALUES (" + diag.getIdPacinete() + ",'" + diag.getDiagnostico() + "'," + diag.getPuntos() + ");";

        try {
            conet = con.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            System.out.println("Datos cargados en la tabla diagnosticos");
        } catch (SQLException e) {
            System.err.println("Datos no cargados en la tabla diagnosticos" + e);
        }
    }

    private int obtieneIdPaciente() {
        int idPaciente = 0;
        String sql = "SELECT MAX(idPaciente) FROM pacientes;";
        try {
            conet = con.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                idPaciente = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener el idPaciente: " + e);
        }
        return idPaciente;
    }

    private void mostrarDatos() {
        String sql = "SELECT p.idPaciente, p.nombre, p.apellidos, d.diagnostico, d.puntos FROM pacientes p, diagnosticos d WHERE p.idPaciente = " + diag.getIdPacinete() +";";
        try {
            conet = con.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] informacion = new Object[5];
            while (rs.next()) {
                informacion[0] = rs.getInt("p.idPaciente");
                informacion[1] = rs.getString("p.nombre");
                informacion[2] = rs.getString("p.apellidos");
                informacion[3] = rs.getString("d.diagnostico");
                informacion[4] = rs.getInt("d.puntos");
            }
            txtIdPasiente.setText(String.valueOf(informacion[0]));
            txtNombre.setText(String.valueOf(informacion[1]));
            txtApellidos.setText(String.valueOf(informacion[2]));
            txtResultado.setText(String.valueOf(informacion[3]));
            txtPonderacion.setText(String.valueOf(informacion[4]));

        } catch (Exception e) {
            System.err.println("Error al mostrar el Diagnostico: " + e);
        }
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtIdPasiente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPonderacion;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
