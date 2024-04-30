/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componente;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

/**
 *
 * @author 52951
 */
public class CrearCuentaComponente extends JPanel{
    
    public CrearCuentaComponente () {
        
        initComponents();
        optUsuario.setSelected(true);
        lblCodigo.setVisible(false);
        txtPFCodigo.setVisible(false);
        lblMostrarCodigo.setVisible(false);
        sprCodigo.setVisible(false);
    }
    int xMouse, yMouse;
    private void initComponents() {
        setBackground(new java.awt.Color(153, 0, 255));

        
        lblIdioma = new javax.swing.JLabel();
        cboIdioma = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtPFCodigo = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        lblMostrarCodigo = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        optUsuario = new javax.swing.JRadioButton();
        optPersonal = new javax.swing.JRadioButton();
        txtPFContrasenia = new javax.swing.JPasswordField();
        lblMostrarContra = new javax.swing.JLabel();
        pnlBarra = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblParteBaja = new javax.swing.JLabel();
        lblAceptar = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        sprCodigo = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblIcono = new javax.swing.JLabel();

        lblIdioma.setForeground(new java.awt.Color(255, 255, 255));
        lblIdioma.setText("IDIOMA");

        cboIdioma.setBackground(new java.awt.Color(153, 0, 255));
        cboIdioma.setForeground(new java.awt.Color(255, 255, 255));
        cboIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESPAÑOL", "FRANCES", "INGLES" }));
        cboIdioma.setBorder(null);
        cboIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIdiomaActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CREAR CUENTA");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblCorreo.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("CORREO");

        txtPFCodigo.setBackground(new java.awt.Color(153, 0, 255));
        txtPFCodigo.setForeground(new java.awt.Color(102, 102, 102));
        txtPFCodigo.setText("**************");
        txtPFCodigo.setBorder(null);
        txtPFCodigo.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPFCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPFCodigoMousePressed(evt);
            }
        });

        txtCorreo.setBackground(new java.awt.Color(153, 0, 255));
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setText("INGRESE SU CORREO");
        txtCorreo.setBorder(null);
        txtCorreo.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });

        lblMostrarCodigo.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblMostrarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblMostrarCodigo.setText("MOSTRAR CODIGO");
        lblMostrarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMostrarCodigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMostrarCodigoMouseExited(evt);
            }
        });

        lblContrasenia.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasenia.setText("CONTRASEÑA");

        optUsuario.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        optUsuario.setForeground(new java.awt.Color(255, 255, 255));
        optUsuario.setText("USUARIO");
        optUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optUsuarioActionPerformed(evt);
            }
        });

        optPersonal.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        optPersonal.setForeground(new java.awt.Color(255, 255, 255));
        optPersonal.setText("PERSONAL");
        optPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPersonalActionPerformed(evt);
            }
        });

        txtPFContrasenia.setBackground(new java.awt.Color(153, 0, 255));
        txtPFContrasenia.setForeground(new java.awt.Color(102, 102, 102));
        txtPFContrasenia.setText("**************");
        txtPFContrasenia.setToolTipText("");
        txtPFContrasenia.setBorder(null);
        txtPFContrasenia.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPFContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPFContraseniaMousePressed(evt);
            }
        });

        lblMostrarContra.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblMostrarContra.setForeground(new java.awt.Color(255, 255, 255));
        lblMostrarContra.setText("MOSTRAR CONTRASEÑA");
        lblMostrarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMostrarContraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMostrarContraMouseExited(evt);
            }
        });

        pnlBarra.setBackground(new java.awt.Color(102, 0, 153));
        pnlBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBarraMouseDragged(evt);
            }
        });
        pnlBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBarraMousePressed(evt);
            }
        });

        lblCerrar.setBackground(new java.awt.Color(102, 0, 153));
        lblCerrar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.setOpaque(true);
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBarraLayout = new javax.swing.GroupLayout(pnlBarra);
        pnlBarra.setLayout(pnlBarraLayout);
        pnlBarraLayout.setHorizontalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 780, Short.MAX_VALUE))
        );
        pnlBarraLayout.setVerticalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        lblParteBaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAceptar.setBackground(new java.awt.Color(153, 0, 204));
        lblAceptar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblAceptar.setForeground(new java.awt.Color(255, 255, 255));
        lblAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAceptar.setText("ACEPTAR");
        lblAceptar.setToolTipText("");
        lblAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAceptar.setFocusable(false);
        lblAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblAceptar.setOpaque(true);
        lblAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //lblAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAceptarMouseExited(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("CODIGO");

        sprCodigo.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        lblIcono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(300, 300, 300)
                                    .addComponent(lblIdioma))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(300, 300, 300)
                                    .addComponent(cboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(optUsuario)
                                    .addGap(12, 12, 12)
                                    .addComponent(optPersonal)))
                            .addGap(147, 147, 147)
                            .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addComponent(lblMostrarContra)
                            .addGap(43, 43, 43)
                            .addComponent(lblAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)
                            .addComponent(txtPFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(lblMostrarCodigo))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(sprCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblParteBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(lblIdioma)
                            .addGap(4, 4, 4)
                            .addComponent(cboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(optUsuario)
                                .addComponent(optPersonal)))
                        .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lblCorreo))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblContrasenia)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtPFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lblMostrarContra))
                        .addComponent(lblAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(1, 1, 1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCodigo)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMostrarCodigo))))
                    .addGap(4, 4, 4)
                    .addComponent(sprCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(lblParteBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        
        
        
    }
    
    private void lblMostrarContraMouseEntered(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        txtPFContrasenia.setEchoChar((char) 0);
    }                                             

    private void lblMostrarContraMouseExited(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
        txtPFContrasenia.setEchoChar('*');
    }                                            
    public void cambiarIdioma(int index) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();

        if (index == 2) {
            lblTitulo.setText("Create Account".toUpperCase());
            lblContrasenia.setText("Password".toUpperCase());
            lblCorreo.setText("Email".toUpperCase());
            lblMostrarContra.setText("Show password".toUpperCase());
            lblMostrarCodigo.setText("Show code".toUpperCase());
            optUsuario.setText("User".toUpperCase());
            optPersonal.setText("Staff".toUpperCase());
            lblIdioma.setText("Language".toUpperCase());

            lblCodigo.setText("Code".toUpperCase());
            txtCorreo.setText("Enter your email".toUpperCase());
            modelo.addElement("Spanish".toUpperCase());
            modelo.addElement("French".toUpperCase());
            modelo.addElement("English".toUpperCase());
            cboIdioma.setModel(modelo);
        }
        if (index == 0) {
            lblTitulo.setText("Crear Cuenta".toUpperCase());
            lblContrasenia.setText("Contraseña".toUpperCase());
            lblCorreo.setText("Correo".toUpperCase());
            lblMostrarContra.setText("Mostrar Contraseña".toUpperCase());
            lblMostrarCodigo.setText("Mostrar Codigo".toUpperCase());
            optUsuario.setText("Usuario".toUpperCase());
            optPersonal.setText("Personal".toUpperCase());
            lblIdioma.setText("Idioma".toUpperCase());
            txtCorreo.setText("Ingrese su correo".toUpperCase());
            lblCodigo.setText("Codigo".toUpperCase());
            modelo.addElement("Español".toUpperCase());
            modelo.addElement("Frances".toUpperCase());
            modelo.addElement("Ingles".toUpperCase());
            cboIdioma.setModel(modelo);
        }
        if (index == 1) {
            lblTitulo.setText("Créer un Compte".toUpperCase());
            lblContrasenia.setText("Mot de passe".toUpperCase());
            lblCorreo.setText("Courrier électronique".toUpperCase());
            lblMostrarContra.setText("Montrer le mot de passe".toUpperCase());
            lblMostrarCodigo.setText("Montrer le mot de code".toUpperCase());
            optUsuario.setText("Utilisateur".toUpperCase());
            optPersonal.setText("Personnel".toUpperCase());
            lblIdioma.setText("langage".toUpperCase());
            txtCorreo.setText("Entrer votre Email".toUpperCase());
            lblCodigo.setText("Code".toUpperCase());
            modelo.addElement("Espagnol".toUpperCase());
            modelo.addElement("Français".toUpperCase());
            modelo.addElement("Anglais".toUpperCase());
            cboIdioma.setModel(modelo);
        }
    }
    private void cboIdiomaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        cambiarIdioma(cboIdioma.getSelectedIndex());
    }                                         

    private void optUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        lblCodigo.setVisible(false);
        txtPFCodigo.setVisible(false);
        lblMostrarCodigo.setVisible(false);
        sprCodigo.setVisible(false);
    }                                          

    private void optPersonalActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        lblCodigo.setVisible(true);
        txtPFCodigo.setVisible(true);
        lblMostrarCodigo.setVisible(true);
        sprCodigo.setVisible(true);
    }                                           

    private void lblMostrarCodigoMouseEntered(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        txtPFCodigo.setEchoChar((char) 0);
    }                                             

    private void lblMostrarCodigoMouseExited(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
        txtPFCodigo.setEchoChar('*');
    }                                            

    /*private void lblAceptarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:

        String correo = txtCorreo.getText();
        String contrasenia = new String(txtPFContrasenia.getPassword());

        if (optPersonal.isSelected() && Arrays.equals(txtPFCodigo.getPassword(), codigo.toCharArray())) {

            if (Comprobaciones.contieneDominio(correo) && Comprobaciones.cumpleCriterios(contrasenia) && Comprobaciones.repeticion(Archivos.cuentas("personal"), correo)) {
                System.out.println("llego personal");
                Archivos.escribir(txtCorreo.getText(), new String(txtPFContrasenia.getPassword()), "personal");
                String disparo = (txtCorreo.getText() + " " + (new String(txtPFContrasenia.getPassword())));
                JOptionPane.showMessageDialog(rootPane, "se ha agregado con exito el usuario \n" + disparo);
            }
        }
        if (optUsuario.isSelected()) {

            if (Comprobaciones.contieneDominio(correo) && Comprobaciones.cumpleCriterios(contrasenia) && Comprobaciones.repeticion(Archivos.cuentas("personal"), correo)) {
                System.out.println("llego usuarios");
                Archivos.escribir(txtCorreo.getText(), new String(txtPFContrasenia.getPassword()), "usuarios");
                String disparo = (txtCorreo.getText() + " " + (new String(txtPFContrasenia.getPassword())));
                JOptionPane.showMessageDialog(rootPane, "se ha agregado con exito el usuario \n" + disparo);
            }
        }

    } */                                      

    private void lblAceptarMouseEntered(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        lblAceptar.setBackground(new Color(145, 0, 195));
    }                                       

    private void lblAceptarMouseExited(java.awt.event.MouseEvent evt) {                                       

        lblAceptar.setBackground(new Color(153, 0, 204));
    }                                      

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        System.exit(0);
    }                                      

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        lblCerrar.setBackground(Color.RED);

    }                                      

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        lblCerrar.setBackground(new Color(102, 0, 153));
    }                                     

    private void pnlBarraMouseDragged(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }                                     

    private void pnlBarraMousePressed(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:

        xMouse = evt.getX();
        yMouse = evt.getY();
    }                                     

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        if (txtCorreo.getText().equals("Ingrese su correo".toUpperCase()) || txtCorreo.getText().equals("Enter your email".toUpperCase()) || txtCorreo.getText().equals("Entrer votre Email".toUpperCase())) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.WHITE);
        }
        if (String.valueOf(txtPFContrasenia.getPassword()).isEmpty()) {
            txtPFContrasenia.setText("**************");
            txtPFContrasenia.setForeground(Color.GRAY);
        }
        if (String.valueOf(txtPFCodigo.getPassword()).isEmpty()) {
            txtPFCodigo.setText("**************");
            txtPFCodigo.setForeground(Color.GRAY);
        }
    }                                      

    private void txtPFContraseniaMousePressed(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        if (String.valueOf(txtPFContrasenia.getPassword()).equals("**************")) {
            txtPFContrasenia.setText("");
            txtPFContrasenia.setForeground(Color.WHITE);
        }
        if (txtCorreo.getText().isEmpty()) {
            if (lblCorreo.getText().equals("Correo".toUpperCase())) {
                txtCorreo.setText("Ingrese su correo".toUpperCase());
            }

            if (lblContrasenia.getText().equals("Password".toUpperCase())) {
                txtCorreo.setText("Enter your email".toUpperCase());
            }

            if (lblContrasenia.getText().equals("Mot de passe".toUpperCase())) {
                txtCorreo.setText("Entrer votre Email".toUpperCase());
            }
            txtCorreo.setForeground(Color.GRAY);
        }
        if (String.valueOf(txtPFCodigo.getPassword()).isEmpty()) {
            txtPFCodigo.setText("**************");
            txtPFCodigo.setForeground(Color.GRAY);
        }
    }                                             

    private void txtPFCodigoMousePressed(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        if (String.valueOf(txtPFCodigo.getPassword()).equals("**************")) {
            txtPFCodigo.setText("");
            txtPFCodigo.setForeground(Color.WHITE);
        }
        if (txtCorreo.getText().isEmpty()) {
            if (lblCorreo.getText().equals("Correo".toUpperCase())) {
                txtCorreo.setText("Ingrese su correo".toUpperCase());
            }

            if (lblContrasenia.getText().equals("Password".toUpperCase())) {
                txtCorreo.setText("Enter your email".toUpperCase());
            }

            if (lblContrasenia.getText().equals("Mot de passe".toUpperCase())) {
                txtCorreo.setText("Entrer votre Email".toUpperCase());
            }
            txtCorreo.setForeground(Color.GRAY);
        }
        if (String.valueOf(txtPFContrasenia.getPassword()).isEmpty()) {
            txtPFContrasenia.setText("**************");
            txtPFContrasenia.setForeground(Color.GRAY);
        }
    } 
    
    private javax.swing.JComboBox<String> cboIdioma;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAceptar;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblMostrarCodigo;
    private javax.swing.JLabel lblMostrarContra;
    private javax.swing.JLabel lblParteBaja;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton optPersonal;
    private javax.swing.JRadioButton optUsuario;
    private javax.swing.JPanel pnlBarra;
    private javax.swing.JSeparator sprCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPFCodigo;
    private javax.swing.JPasswordField txtPFContrasenia;
    
    public static void main(String args []){
        CrearCuentaComponente comp = new CrearCuentaComponente ();
        comp.setVisible(true);
    }
}
