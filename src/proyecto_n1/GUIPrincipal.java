package proyecto_n1;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class GUIPrincipal extends javax.swing.JFrame {
    
    private int mouseX;
    private int mouseY;
    
    public int id;
    public String nombre;
    public int canM, canC;
    public int idGenerado  = 0;
    public boolean cross;
    public char validarNumeros;
    
    RegistrarGS inscribirGimnasios = new RegistrarGS();
    private ArrayList<RegistrarGS> listaInscripciones = new ArrayList<>();

    public GUIPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Registro de Gimnasios");
        idTField.setText(generarId());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bordesRedondeados2 = new proyecto_n1.BordesRedondeados();
        cerrarGUIButton = new javax.swing.JButton();
        bordesRedondeados3 = new proyecto_n1.BordesRedondeados();
        bordesRedondeados4 = new proyecto_n1.BordesRedondeados();
        minimizarGUIButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelRegistrarGimnasio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bordesRedondeados12 = new proyecto_n1.BordesRedondeados();
        inscribirGButton = new javax.swing.JButton();
        bordesRedondeados15 = new proyecto_n1.BordesRedondeados();
        idTField = new javax.swing.JTextField();
        bordesRedondeados16 = new proyecto_n1.BordesRedondeados();
        nombreTField = new javax.swing.JTextField();
        bordesRedondeados17 = new proyecto_n1.BordesRedondeados();
        canMaquinasTField = new javax.swing.JTextField();
        bordesRedondeados18 = new proyecto_n1.BordesRedondeados();
        checkF = new javax.swing.JCheckBox();
        checkV = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bordesRedondeados19 = new proyecto_n1.BordesRedondeados();
        canClientesTField = new javax.swing.JTextField();
        jOPanel = new proyecto_n1.BordesRedondeados();
        bordesRedondeados22 = new proyecto_n1.BordesRedondeados();
        mensajeLabel = new javax.swing.JLabel();
        bordesRedondeados7 = new proyecto_n1.BordesRedondeados();
        bordesRedondeados23 = new proyecto_n1.BordesRedondeados();
        iconoOptionPane = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ordenarButton = new javax.swing.JButton();
        registrarButton = new javax.swing.JButton();
        verListaButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        compararButton = new javax.swing.JButton();
        bordesRedondeados5 = new proyecto_n1.BordesRedondeados();
        logoGymLabel = new javax.swing.JLabel();
        bordesRedondeados8 = new proyecto_n1.BordesRedondeados();
        bordesRedondeados10 = new proyecto_n1.BordesRedondeados();
        bordesRedondeados9 = new proyecto_n1.BordesRedondeados();
        bordeResalto1 = new proyecto_n1.BordesRedondeados();
        bordesRedondeados11 = new proyecto_n1.BordesRedondeados();
        jButton6 = new javax.swing.JButton();
        bordesRedondeados13 = new proyecto_n1.BordesRedondeados();
        bordeResalto2 = new proyecto_n1.BordesRedondeados();
        bordeResalto3 = new proyecto_n1.BordesRedondeados();
        bordeResalto4 = new proyecto_n1.BordesRedondeados();
        bordeResalto5 = new proyecto_n1.BordesRedondeados();
        bordesRedondeados6 = new proyecto_n1.BordesRedondeados();
        salirButton = new javax.swing.JButton();
        bordesRedondeados14 = new proyecto_n1.BordesRedondeados();
        bordesRedondeados20 = new proyecto_n1.BordesRedondeados();
        bordesRedondeados21 = new proyecto_n1.BordesRedondeados();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 239, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bordesRedondeados2.setBackground(new java.awt.Color(255, 102, 102));
        bordesRedondeados2.setRoundBottomLeft(50);
        bordesRedondeados2.setRoundBottomRight(50);
        bordesRedondeados2.setRoundTopLeft(50);
        bordesRedondeados2.setRoundTopRight(50);

        cerrarGUIButton.setBackground(new java.awt.Color(255, 51, 51));
        cerrarGUIButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cerrarGUIButton.setForeground(new java.awt.Color(23, 23, 23));
        cerrarGUIButton.setBorder(null);
        cerrarGUIButton.setContentAreaFilled(false);
        cerrarGUIButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarGUIButton.setFocusPainted(false);
        cerrarGUIButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cerrarGUIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarGUIButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bordesRedondeados2Layout = new javax.swing.GroupLayout(bordesRedondeados2);
        bordesRedondeados2.setLayout(bordesRedondeados2Layout);
        bordesRedondeados2Layout.setHorizontalGroup(
            bordesRedondeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarGUIButton, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );
        bordesRedondeados2Layout.setVerticalGroup(
            bordesRedondeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bordesRedondeados2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarGUIButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(bordesRedondeados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        bordesRedondeados3.setBackground(new java.awt.Color(153, 204, 0));
        bordesRedondeados3.setRoundBottomLeft(50);
        bordesRedondeados3.setRoundBottomRight(50);
        bordesRedondeados3.setRoundTopLeft(50);
        bordesRedondeados3.setRoundTopRight(50);

        javax.swing.GroupLayout bordesRedondeados3Layout = new javax.swing.GroupLayout(bordesRedondeados3);
        bordesRedondeados3.setLayout(bordesRedondeados3Layout);
        bordesRedondeados3Layout.setHorizontalGroup(
            bordesRedondeados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        bordesRedondeados3Layout.setVerticalGroup(
            bordesRedondeados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(bordesRedondeados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 20, 20));

        bordesRedondeados4.setBackground(new java.awt.Color(239, 199, 110));
        bordesRedondeados4.setRoundBottomLeft(50);
        bordesRedondeados4.setRoundBottomRight(50);
        bordesRedondeados4.setRoundTopLeft(50);
        bordesRedondeados4.setRoundTopRight(50);

        minimizarGUIButton.setBackground(new java.awt.Color(255, 51, 51));
        minimizarGUIButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        minimizarGUIButton.setForeground(new java.awt.Color(23, 23, 23));
        minimizarGUIButton.setBorder(null);
        minimizarGUIButton.setContentAreaFilled(false);
        minimizarGUIButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizarGUIButton.setFocusPainted(false);
        minimizarGUIButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        minimizarGUIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarGUIButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bordesRedondeados4Layout = new javax.swing.GroupLayout(bordesRedondeados4);
        bordesRedondeados4.setLayout(bordesRedondeados4Layout);
        bordesRedondeados4Layout.setHorizontalGroup(
            bordesRedondeados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizarGUIButton, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );
        bordesRedondeados4Layout.setVerticalGroup(
            bordesRedondeados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizarGUIButton, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel1.add(bordesRedondeados4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 20, 20));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 23, 23));
        jLabel1.setText("Asociación Nacional de Gimnasios y Centros de Salud");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        panelRegistrarGimnasio.setBackground(new java.awt.Color(248, 239, 229));
        panelRegistrarGimnasio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 23, 23));
        jLabel2.setText("Cantidad promedio de clientes mensuales");
        panelRegistrarGimnasio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 23, 23));
        jLabel3.setText("ID del gimnasio a registrar");
        panelRegistrarGimnasio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(23, 23, 23));
        jLabel4.setText("Nombre del gimnasio a registrar");
        panelRegistrarGimnasio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 23, 23));
        jLabel5.setText("Cantidad de máquinas");
        panelRegistrarGimnasio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(23, 23, 23));
        jLabel6.setText("Incluye Crossfit");
        panelRegistrarGimnasio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        bordesRedondeados12.setBackground(new java.awt.Color(239, 199, 110));
        bordesRedondeados12.setRoundBottomLeft(20);
        bordesRedondeados12.setRoundBottomRight(20);
        bordesRedondeados12.setRoundTopLeft(20);
        bordesRedondeados12.setRoundTopRight(20);
        bordesRedondeados12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inscribirGButton.setBackground(new java.awt.Color(23, 23, 23));
        inscribirGButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        inscribirGButton.setForeground(new java.awt.Color(23, 23, 23));
        inscribirGButton.setText("Gimnasios ordenados");
        inscribirGButton.setBorder(null);
        inscribirGButton.setContentAreaFilled(false);
        inscribirGButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inscribirGButton.setFocusPainted(false);
        inscribirGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirGButtonActionPerformed(evt);
            }
        });
        bordesRedondeados12.add(inscribirGButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 40));

        panelRegistrarGimnasio.add(bordesRedondeados12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 390, 40));

        bordesRedondeados15.setBackground(new java.awt.Color(255, 255, 255));
        bordesRedondeados15.setRoundBottomLeft(20);
        bordesRedondeados15.setRoundBottomRight(20);
        bordesRedondeados15.setRoundTopLeft(20);
        bordesRedondeados15.setRoundTopRight(20);
        bordesRedondeados15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idTField.setBackground(new java.awt.Color(255, 255, 255));
        idTField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        idTField.setForeground(new java.awt.Color(102, 102, 102));
        idTField.setBorder(null);
        bordesRedondeados15.add(idTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 470, 40));

        panelRegistrarGimnasio.add(bordesRedondeados15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 500, 40));

        bordesRedondeados16.setBackground(new java.awt.Color(255, 255, 255));
        bordesRedondeados16.setRoundBottomLeft(20);
        bordesRedondeados16.setRoundBottomRight(20);
        bordesRedondeados16.setRoundTopLeft(20);
        bordesRedondeados16.setRoundTopRight(20);
        bordesRedondeados16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreTField.setBackground(new java.awt.Color(255, 255, 255));
        nombreTField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        nombreTField.setForeground(new java.awt.Color(102, 102, 102));
        nombreTField.setBorder(null);
        bordesRedondeados16.add(nombreTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 470, 40));

        panelRegistrarGimnasio.add(bordesRedondeados16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 500, 40));

        bordesRedondeados17.setBackground(new java.awt.Color(255, 255, 255));
        bordesRedondeados17.setRoundBottomLeft(20);
        bordesRedondeados17.setRoundBottomRight(20);
        bordesRedondeados17.setRoundTopLeft(20);
        bordesRedondeados17.setRoundTopRight(20);
        bordesRedondeados17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        canMaquinasTField.setBackground(new java.awt.Color(255, 255, 255));
        canMaquinasTField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        canMaquinasTField.setForeground(new java.awt.Color(102, 102, 102));
        canMaquinasTField.setBorder(null);
        canMaquinasTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                canMaquinasTFieldKeyTyped(evt);
            }
        });
        bordesRedondeados17.add(canMaquinasTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 470, 40));

        panelRegistrarGimnasio.add(bordesRedondeados17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 500, 40));

        bordesRedondeados18.setBackground(new java.awt.Color(255, 255, 255));
        bordesRedondeados18.setRoundBottomLeft(20);
        bordesRedondeados18.setRoundBottomRight(20);
        bordesRedondeados18.setRoundTopLeft(20);
        bordesRedondeados18.setRoundTopRight(20);
        bordesRedondeados18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkF.setBackground(new java.awt.Color(255, 255, 255));
        checkF.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        checkF.setForeground(new java.awt.Color(102, 102, 102));
        checkF.setBorder(null);
        checkF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFActionPerformed(evt);
            }
        });
        bordesRedondeados18.add(checkF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        checkV.setBackground(new java.awt.Color(255, 255, 255));
        checkV.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        checkV.setForeground(new java.awt.Color(102, 102, 102));
        checkV.setBorder(null);
        checkV.setContentAreaFilled(false);
        checkV.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        checkV.setFocusPainted(false);
        checkV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVActionPerformed(evt);
            }
        });
        bordesRedondeados18.add(checkV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Falso");
        bordesRedondeados18.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Verdadero");
        bordesRedondeados18.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        panelRegistrarGimnasio.add(bordesRedondeados18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 500, 90));

        bordesRedondeados19.setBackground(new java.awt.Color(255, 255, 255));
        bordesRedondeados19.setRoundBottomLeft(20);
        bordesRedondeados19.setRoundBottomRight(20);
        bordesRedondeados19.setRoundTopLeft(20);
        bordesRedondeados19.setRoundTopRight(20);
        bordesRedondeados19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        canClientesTField.setBackground(new java.awt.Color(255, 255, 255));
        canClientesTField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        canClientesTField.setForeground(new java.awt.Color(102, 102, 102));
        canClientesTField.setBorder(null);
        canClientesTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                canClientesTFieldKeyTyped(evt);
            }
        });
        bordesRedondeados19.add(canClientesTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 380, 40));

        panelRegistrarGimnasio.add(bordesRedondeados19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 410, 40));

        jOPanel.setBackground(new java.awt.Color(255, 255, 255));
        jOPanel.setFocusable(false);
        jOPanel.setRoundBottomLeft(20);
        jOPanel.setRoundBottomRight(20);
        jOPanel.setRoundTopLeft(20);
        jOPanel.setRoundTopRight(20);
        jOPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bordesRedondeados22.setBackground(new java.awt.Color(255, 102, 102));
        bordesRedondeados22.setRoundBottomLeft(50);
        bordesRedondeados22.setRoundBottomRight(50);
        bordesRedondeados22.setRoundTopLeft(50);
        bordesRedondeados22.setRoundTopRight(50);

        javax.swing.GroupLayout bordesRedondeados22Layout = new javax.swing.GroupLayout(bordesRedondeados22);
        bordesRedondeados22.setLayout(bordesRedondeados22Layout);
        bordesRedondeados22Layout.setHorizontalGroup(
            bordesRedondeados22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        bordesRedondeados22Layout.setVerticalGroup(
            bordesRedondeados22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jOPanel.add(bordesRedondeados22, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 20, 20));

        mensajeLabel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel.setForeground(new java.awt.Color(23, 23, 23));
        mensajeLabel.setText("Mensajes de Dialogo");
        jOPanel.add(mensajeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 530, 40));

        bordesRedondeados7.setBackground(new java.awt.Color(239, 199, 110));
        bordesRedondeados7.setRoundBottomLeft(50);
        bordesRedondeados7.setRoundBottomRight(50);
        bordesRedondeados7.setRoundTopLeft(50);
        bordesRedondeados7.setRoundTopRight(50);

        javax.swing.GroupLayout bordesRedondeados7Layout = new javax.swing.GroupLayout(bordesRedondeados7);
        bordesRedondeados7.setLayout(bordesRedondeados7Layout);
        bordesRedondeados7Layout.setHorizontalGroup(
            bordesRedondeados7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        bordesRedondeados7Layout.setVerticalGroup(
            bordesRedondeados7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jOPanel.add(bordesRedondeados7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 20, 20));

        bordesRedondeados23.setBackground(new java.awt.Color(153, 204, 0));
        bordesRedondeados23.setRoundBottomLeft(50);
        bordesRedondeados23.setRoundBottomRight(50);
        bordesRedondeados23.setRoundTopLeft(50);
        bordesRedondeados23.setRoundTopRight(50);

        javax.swing.GroupLayout bordesRedondeados23Layout = new javax.swing.GroupLayout(bordesRedondeados23);
        bordesRedondeados23.setLayout(bordesRedondeados23Layout);
        bordesRedondeados23Layout.setHorizontalGroup(
            bordesRedondeados23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        bordesRedondeados23Layout.setVerticalGroup(
            bordesRedondeados23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jOPanel.add(bordesRedondeados23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 20, 20));

        iconoOptionPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warning.png"))); // NOI18N
        jOPanel.add(iconoOptionPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        panelRegistrarGimnasio.add(jOPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 780, 60));

        jPanel1.add(panelRegistrarGimnasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 750));

        jPanel2.setBackground(new java.awt.Color(246, 237, 172));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordenarButton.setBackground(new java.awt.Color(23, 23, 23));
        ordenarButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        ordenarButton.setForeground(new java.awt.Color(23, 23, 23));
        ordenarButton.setText("Gimnasios ordenados");
        ordenarButton.setBorder(null);
        ordenarButton.setContentAreaFilled(false);
        ordenarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordenarButton.setFocusPainted(false);
        ordenarButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(ordenarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 230, 40));

        registrarButton.setBackground(new java.awt.Color(255, 51, 51));
        registrarButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        registrarButton.setForeground(new java.awt.Color(23, 23, 23));
        registrarButton.setText("Registrar Gimnasios");
        registrarButton.setBorder(null);
        registrarButton.setContentAreaFilled(false);
        registrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarButton.setFocusPainted(false);
        registrarButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(registrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 230, 40));

        verListaButton.setBackground(new java.awt.Color(23, 23, 23));
        verListaButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        verListaButton.setForeground(new java.awt.Color(23, 23, 23));
        verListaButton.setText("Lista de gimnasios suscritos");
        verListaButton.setBorder(null);
        verListaButton.setContentAreaFilled(false);
        verListaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verListaButton.setFocusPainted(false);
        verListaButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(verListaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 230, 40));

        editarButton.setBackground(new java.awt.Color(23, 23, 23));
        editarButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        editarButton.setForeground(new java.awt.Color(23, 23, 23));
        editarButton.setText("Busqueda y edición");
        editarButton.setBorder(null);
        editarButton.setContentAreaFilled(false);
        editarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarButton.setFocusPainted(false);
        editarButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(editarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 230, 40));

        compararButton.setBackground(new java.awt.Color(23, 23, 23));
        compararButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        compararButton.setForeground(new java.awt.Color(23, 23, 23));
        compararButton.setText("Comparaión de valores");
        compararButton.setBorder(null);
        compararButton.setContentAreaFilled(false);
        compararButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compararButton.setFocusPainted(false);
        compararButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(compararButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 230, 40));

        bordesRedondeados5.setBackground(new java.awt.Color(239, 199, 110));
        bordesRedondeados5.setRoundBottomLeft(20);
        bordesRedondeados5.setRoundBottomRight(20);
        bordesRedondeados5.setRoundTopLeft(20);
        bordesRedondeados5.setRoundTopRight(20);
        bordesRedondeados5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoGymLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gymLogo.png"))); // NOI18N
        bordesRedondeados5.add(logoGymLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 10, 190, 180));

        jPanel2.add(bordesRedondeados5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 200));

        bordesRedondeados8.setBackground(new java.awt.Color(248, 239, 229));
        bordesRedondeados8.setRoundBottomLeft(20);
        bordesRedondeados8.setRoundBottomRight(20);
        bordesRedondeados8.setRoundTopLeft(20);
        bordesRedondeados8.setRoundTopRight(20);

        javax.swing.GroupLayout bordesRedondeados8Layout = new javax.swing.GroupLayout(bordesRedondeados8);
        bordesRedondeados8.setLayout(bordesRedondeados8Layout);
        bordesRedondeados8Layout.setHorizontalGroup(
            bordesRedondeados8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        bordesRedondeados8Layout.setVerticalGroup(
            bordesRedondeados8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(bordesRedondeados8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, 40));

        bordesRedondeados10.setBackground(new java.awt.Color(248, 239, 229));
        bordesRedondeados10.setRoundBottomLeft(20);
        bordesRedondeados10.setRoundBottomRight(20);
        bordesRedondeados10.setRoundTopLeft(20);
        bordesRedondeados10.setRoundTopRight(20);

        javax.swing.GroupLayout bordesRedondeados10Layout = new javax.swing.GroupLayout(bordesRedondeados10);
        bordesRedondeados10.setLayout(bordesRedondeados10Layout);
        bordesRedondeados10Layout.setHorizontalGroup(
            bordesRedondeados10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        bordesRedondeados10Layout.setVerticalGroup(
            bordesRedondeados10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(bordesRedondeados10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 260, 40));

        bordesRedondeados9.setBackground(new java.awt.Color(248, 239, 229));
        bordesRedondeados9.setRoundBottomLeft(20);
        bordesRedondeados9.setRoundBottomRight(20);
        bordesRedondeados9.setRoundTopLeft(20);
        bordesRedondeados9.setRoundTopRight(20);

        javax.swing.GroupLayout bordesRedondeados9Layout = new javax.swing.GroupLayout(bordesRedondeados9);
        bordesRedondeados9.setLayout(bordesRedondeados9Layout);
        bordesRedondeados9Layout.setHorizontalGroup(
            bordesRedondeados9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        bordesRedondeados9Layout.setVerticalGroup(
            bordesRedondeados9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(bordesRedondeados9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 260, 40));

        bordeResalto1.setBackground(new java.awt.Color(239, 199, 110));
        bordeResalto1.setRoundBottomLeft(20);
        bordeResalto1.setRoundBottomRight(20);
        bordeResalto1.setRoundTopLeft(20);
        bordeResalto1.setRoundTopRight(20);

        javax.swing.GroupLayout bordeResalto1Layout = new javax.swing.GroupLayout(bordeResalto1);
        bordeResalto1.setLayout(bordeResalto1Layout);
        bordeResalto1Layout.setHorizontalGroup(
            bordeResalto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        bordeResalto1Layout.setVerticalGroup(
            bordeResalto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jPanel2.add(bordeResalto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 288, 264, 44));

        bordesRedondeados11.setBackground(new java.awt.Color(248, 239, 229));
        bordesRedondeados11.setRoundBottomLeft(20);
        bordesRedondeados11.setRoundBottomRight(20);
        bordesRedondeados11.setRoundTopLeft(20);
        bordesRedondeados11.setRoundTopRight(20);

        javax.swing.GroupLayout bordesRedondeados11Layout = new javax.swing.GroupLayout(bordesRedondeados11);
        bordesRedondeados11.setLayout(bordesRedondeados11Layout);
        bordesRedondeados11Layout.setHorizontalGroup(
            bordesRedondeados11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        bordesRedondeados11Layout.setVerticalGroup(
            bordesRedondeados11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(bordesRedondeados11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 260, 40));

        jButton6.setBackground(new java.awt.Color(23, 23, 23));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(23, 23, 23));
        jButton6.setText("Busqueda y edición");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 170, 40));

        bordesRedondeados13.setBackground(new java.awt.Color(248, 239, 229));
        bordesRedondeados13.setRoundBottomLeft(20);
        bordesRedondeados13.setRoundBottomRight(20);
        bordesRedondeados13.setRoundTopLeft(20);
        bordesRedondeados13.setRoundTopRight(20);

        javax.swing.GroupLayout bordesRedondeados13Layout = new javax.swing.GroupLayout(bordesRedondeados13);
        bordesRedondeados13.setLayout(bordesRedondeados13Layout);
        bordesRedondeados13Layout.setHorizontalGroup(
            bordesRedondeados13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        bordesRedondeados13Layout.setVerticalGroup(
            bordesRedondeados13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(bordesRedondeados13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 260, 40));

        bordeResalto2.setBackground(new java.awt.Color(239, 199, 110));
        bordeResalto2.setRoundBottomLeft(20);
        bordeResalto2.setRoundBottomRight(20);
        bordeResalto2.setRoundTopLeft(20);
        bordeResalto2.setRoundTopRight(20);

        javax.swing.GroupLayout bordeResalto2Layout = new javax.swing.GroupLayout(bordeResalto2);
        bordeResalto2.setLayout(bordeResalto2Layout);
        bordeResalto2Layout.setHorizontalGroup(
            bordeResalto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        bordeResalto2Layout.setVerticalGroup(
            bordeResalto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jPanel2.add(bordeResalto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 348, 264, 44));

        bordeResalto3.setBackground(new java.awt.Color(239, 199, 110));
        bordeResalto3.setRoundBottomLeft(20);
        bordeResalto3.setRoundBottomRight(20);
        bordeResalto3.setRoundTopLeft(20);
        bordeResalto3.setRoundTopRight(20);

        javax.swing.GroupLayout bordeResalto3Layout = new javax.swing.GroupLayout(bordeResalto3);
        bordeResalto3.setLayout(bordeResalto3Layout);
        bordeResalto3Layout.setHorizontalGroup(
            bordeResalto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        bordeResalto3Layout.setVerticalGroup(
            bordeResalto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jPanel2.add(bordeResalto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 408, 264, 44));

        bordeResalto4.setBackground(new java.awt.Color(239, 199, 110));
        bordeResalto4.setRoundBottomLeft(20);
        bordeResalto4.setRoundBottomRight(20);
        bordeResalto4.setRoundTopLeft(20);
        bordeResalto4.setRoundTopRight(20);

        javax.swing.GroupLayout bordeResalto4Layout = new javax.swing.GroupLayout(bordeResalto4);
        bordeResalto4.setLayout(bordeResalto4Layout);
        bordeResalto4Layout.setHorizontalGroup(
            bordeResalto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        bordeResalto4Layout.setVerticalGroup(
            bordeResalto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jPanel2.add(bordeResalto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 468, 264, 44));

        bordeResalto5.setBackground(new java.awt.Color(239, 199, 110));
        bordeResalto5.setRoundBottomLeft(20);
        bordeResalto5.setRoundBottomRight(20);
        bordeResalto5.setRoundTopLeft(20);
        bordeResalto5.setRoundTopRight(20);

        javax.swing.GroupLayout bordeResalto5Layout = new javax.swing.GroupLayout(bordeResalto5);
        bordeResalto5.setLayout(bordeResalto5Layout);
        bordeResalto5Layout.setHorizontalGroup(
            bordeResalto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        bordeResalto5Layout.setVerticalGroup(
            bordeResalto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jPanel2.add(bordeResalto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 528, 264, 44));

        bordesRedondeados6.setBackground(new java.awt.Color(239, 199, 110));
        bordesRedondeados6.setRoundBottomLeft(20);
        bordesRedondeados6.setRoundBottomRight(20);
        bordesRedondeados6.setRoundTopLeft(20);
        bordesRedondeados6.setRoundTopRight(20);
        bordesRedondeados6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirButton.setBackground(new java.awt.Color(23, 23, 23));
        salirButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salirButton.setForeground(new java.awt.Color(23, 23, 23));
        salirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        salirButton.setBorder(null);
        salirButton.setContentAreaFilled(false);
        salirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirButton.setFocusPainted(false);
        salirButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        bordesRedondeados6.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        jPanel2.add(bordesRedondeados6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, 70, 40));

        bordesRedondeados14.setBackground(new java.awt.Color(239, 199, 110));
        bordesRedondeados14.setRoundTopLeft(50);
        bordesRedondeados14.setRoundTopRight(50);

        javax.swing.GroupLayout bordesRedondeados14Layout = new javax.swing.GroupLayout(bordesRedondeados14);
        bordesRedondeados14.setLayout(bordesRedondeados14Layout);
        bordesRedondeados14Layout.setHorizontalGroup(
            bordesRedondeados14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        bordesRedondeados14Layout.setVerticalGroup(
            bordesRedondeados14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(bordesRedondeados14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 720, 60, 30));

        bordesRedondeados20.setBackground(new java.awt.Color(239, 199, 110));
        bordesRedondeados20.setRoundTopLeft(50);
        bordesRedondeados20.setRoundTopRight(50);

        javax.swing.GroupLayout bordesRedondeados20Layout = new javax.swing.GroupLayout(bordesRedondeados20);
        bordesRedondeados20.setLayout(bordesRedondeados20Layout);
        bordesRedondeados20Layout.setHorizontalGroup(
            bordesRedondeados20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        bordesRedondeados20Layout.setVerticalGroup(
            bordesRedondeados20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(bordesRedondeados20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 60, 30));

        bordesRedondeados21.setBackground(new java.awt.Color(239, 199, 110));
        bordesRedondeados21.setRoundTopLeft(50);
        bordesRedondeados21.setRoundTopRight(50);

        javax.swing.GroupLayout bordesRedondeados21Layout = new javax.swing.GroupLayout(bordesRedondeados21);
        bordesRedondeados21.setLayout(bordesRedondeados21Layout);
        bordesRedondeados21Layout.setHorizontalGroup(
            bordesRedondeados21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        bordesRedondeados21Layout.setVerticalGroup(
            bordesRedondeados21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(bordesRedondeados21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 110, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setLocation(getLocation().x + evt.getX() - mouseX, getLocation().y + evt.getY() - mouseY);
    }//GEN-LAST:event_formMouseDragged

    private void cerrarGUIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarGUIButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cerrarGUIButtonActionPerformed

    private void minimizarGUIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarGUIButtonActionPerformed
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizarGUIButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        dispose();
    }//GEN-LAST:event_salirButtonActionPerformed

    private void canMaquinasTFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canMaquinasTFieldKeyTyped
        validarNumeros = evt.getKeyChar();
        if (Character.isLetter(validarNumeros)) {
            evt.consume();
            mensajeLabel.setText("Por favor ingrese solamente numeros. Gracias");
        }
    }//GEN-LAST:event_canMaquinasTFieldKeyTyped

    private void canClientesTFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canClientesTFieldKeyTyped
        validarNumeros = evt.getKeyChar();
        if (Character.isLetter(validarNumeros)) {
            evt.consume();
            mensajeLabel.setText("Por favor ingrese solamente numeros. Gracias");
        }
    }//GEN-LAST:event_canClientesTFieldKeyTyped

    private void inscribirGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirGButtonActionPerformed
        if (nombreTField.getText().isEmpty() || canMaquinasTField.getText().isEmpty() || canClientesTField.getText().isEmpty()) {
            mensajeLabel.setText("Por favor rellene todos los campos");
        } 
        else 
        if (!nombreTField.getText().isEmpty() || !canMaquinasTField.getText().isEmpty() || !canClientesTField.getText().isEmpty()) {
            if (checkV.isSelected() || checkV.isSelected()) {
                id = Integer.parseInt(idTField.getText());          
                nombre = nombreTField.getText();       
                canM = Integer.parseInt(canMaquinasTField.getText());

                if (checkV.isSelected()) {
                    cross = true;
                }
                else 
                if (checkF.isSelected()) {
                    cross = false;
                }

                canC = Integer.parseInt(canClientesTField.getText());

                inscribirGimnasios.RegistrarGS(id, nombre, canM, cross, canC);
                listaInscripciones.add(inscribirGimnasios);
                idTField.setText(generarId());
            }
        }
    }//GEN-LAST:event_inscribirGButtonActionPerformed

    private void checkVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVActionPerformed
        if (checkV.isSelected()) {
            checkF.setEnabled(false);
        } else {
            checkF.setEnabled(true);
        }
    }//GEN-LAST:event_checkVActionPerformed

    private void checkFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFActionPerformed
        if (checkF.isSelected()) {
            checkV.setEnabled(false);
        } else {
            checkV.setEnabled(true);
        }
    }//GEN-LAST:event_checkFActionPerformed

    public String generarId() {
        idGenerado += 1;
        return Integer.toString(idGenerado);
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private proyecto_n1.BordesRedondeados bordeResalto1;
    private proyecto_n1.BordesRedondeados bordeResalto2;
    private proyecto_n1.BordesRedondeados bordeResalto3;
    private proyecto_n1.BordesRedondeados bordeResalto4;
    private proyecto_n1.BordesRedondeados bordeResalto5;
    private proyecto_n1.BordesRedondeados bordesRedondeados10;
    private proyecto_n1.BordesRedondeados bordesRedondeados11;
    private proyecto_n1.BordesRedondeados bordesRedondeados12;
    private proyecto_n1.BordesRedondeados bordesRedondeados13;
    private proyecto_n1.BordesRedondeados bordesRedondeados14;
    private proyecto_n1.BordesRedondeados bordesRedondeados15;
    private proyecto_n1.BordesRedondeados bordesRedondeados16;
    private proyecto_n1.BordesRedondeados bordesRedondeados17;
    private proyecto_n1.BordesRedondeados bordesRedondeados18;
    private proyecto_n1.BordesRedondeados bordesRedondeados19;
    private proyecto_n1.BordesRedondeados bordesRedondeados2;
    private proyecto_n1.BordesRedondeados bordesRedondeados20;
    private proyecto_n1.BordesRedondeados bordesRedondeados21;
    private proyecto_n1.BordesRedondeados bordesRedondeados22;
    private proyecto_n1.BordesRedondeados bordesRedondeados23;
    private proyecto_n1.BordesRedondeados bordesRedondeados3;
    private proyecto_n1.BordesRedondeados bordesRedondeados4;
    private proyecto_n1.BordesRedondeados bordesRedondeados5;
    private proyecto_n1.BordesRedondeados bordesRedondeados6;
    private proyecto_n1.BordesRedondeados bordesRedondeados7;
    private proyecto_n1.BordesRedondeados bordesRedondeados8;
    private proyecto_n1.BordesRedondeados bordesRedondeados9;
    private javax.swing.JTextField canClientesTField;
    private javax.swing.JTextField canMaquinasTField;
    private javax.swing.JButton cerrarGUIButton;
    private javax.swing.JCheckBox checkF;
    private javax.swing.JCheckBox checkV;
    private javax.swing.JButton compararButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JLabel iconoOptionPane;
    private javax.swing.JTextField idTField;
    private javax.swing.JButton inscribirGButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private proyecto_n1.BordesRedondeados jOPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoGymLabel;
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JButton minimizarGUIButton;
    private javax.swing.JTextField nombreTField;
    private javax.swing.JButton ordenarButton;
    private javax.swing.JPanel panelRegistrarGimnasio;
    private javax.swing.JButton registrarButton;
    private javax.swing.JButton salirButton;
    private javax.swing.JButton verListaButton;
    // End of variables declaration//GEN-END:variables
}
