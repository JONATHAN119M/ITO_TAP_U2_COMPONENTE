/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componente;

/**
 *
 * @author 52951
 */
import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
//import javax.swing.JDialog;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.Timer;


/**
 *
 * @author 52951
 */
public class Log extends JPanel{  
    //ArrayList<String> contrasP, correosP, contrasU, correosU;
    //int intentos = 0;
    //crearCuenta creacionCuenta;
    int xMouse, yMouse;
    
    private javax.swing.JComboBox<String> cboIdioma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAceptar;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMostrarContra;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton optPersonal;
    private javax.swing.JRadioButton optUsuario;
    private javax.swing.JPanel pnlBarra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPFContrasenia;
    
    
    
    public Log() {
        
        initComponents();
        optUsuario.setSelected(true);
        //contrasP = (ArrayList) Archivos.contrasenias("personal");
        //correosP = (ArrayList) Archivos.cuentas("personal");
        //contrasU = (ArrayList) Archivos.contrasenias("usuarios");
        //correosU = (ArrayList) Archivos.cuentas("usuarios");
        //contrasU.add("pepito123");
        //correosU.add("cuentapepito211-itoaxaca.edu.mx");
        //contrasP.add("pablo123");
        //correosP.add("cuentapablo211-itoaxaca.edu.mx");
       // creacionCuenta = new crearCuenta(null, true);
       //System.out.println(correosU.get(0)+" "+contrasU.get(0));
    }
    /*private boolean comprobarLog(String correo, char[] contra) {
        String password = new String(contra);
        
        if (optUsuario.isSelected()) {
            for (int i = 0; i < correosU.size(); i++) {
                if (correosU.get(i).equals(correo) && password.equals(contrasU.get(i))) {
                    return true;

                }
            }
        } else {
            for (int i = 0; i < correosP.size(); i++) {
                if (correosP.get(i).equals(correo) && password.equals(contrasP.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }
*/
    private void lblMostrarContraMouseEntered(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        txtPFContrasenia.setEchoChar((char) 0);
    }                                             

    private void lblMostrarContraMouseExited(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
        txtPFContrasenia.setEchoChar('*');
    }                                            
    public void cambiarIdioma(int index){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        if(index == 2){
        lblTitulo.setText("Login".toUpperCase());
        lblContrasenia.setText("Password".toUpperCase());
        lblCorreo.setText("Email".toUpperCase());
        lblMostrarContra.setText("Show password".toUpperCase());
        optUsuario.setText("User".toUpperCase());
        optPersonal.setText("Staff".toUpperCase());
        lblIdioma.setText("Language".toUpperCase());
        lblAceptar.setText("Accept".toUpperCase());
        lblCuenta.setText("You do not have an account?".toUpperCase());
        modelo.addElement("Spanish".toUpperCase());
        modelo.addElement("French".toUpperCase());
        modelo.addElement("English".toUpperCase());
        txtCorreo.setText("Enter your email".toUpperCase());
        cboIdioma.setModel(modelo);
        }
        if(index == 0){
        lblTitulo.setText("Inicio".toUpperCase());
        lblContrasenia.setText("Contraseña".toUpperCase());
        lblCorreo.setText("Correo".toUpperCase());
        lblMostrarContra.setText("Mostrar Contraseña".toUpperCase());
        optUsuario.setText("Usuario".toUpperCase());
        optPersonal.setText("Personal".toUpperCase());
        lblIdioma.setText("Idioma".toUpperCase());
        lblAceptar.setText("Aceptar".toUpperCase());
        lblCuenta.setText("No tienes cuenta?".toUpperCase());
        modelo.addElement("Español".toUpperCase());
        modelo.addElement("Frances".toUpperCase());
        modelo.addElement("Ingles".toUpperCase());
        txtCorreo.setText("Ingrese su correo".toUpperCase());
        cboIdioma.setModel(modelo);
        }
        if(index == 1){
        lblTitulo.setText("Login".toUpperCase());
        lblContrasenia.setText("Mot de passe".toUpperCase());
        lblCorreo.setText("Courrier électronique".toUpperCase());
        lblMostrarContra.setText("Montrer le mot de passe".toUpperCase());
        optUsuario.setText("Utilisateur".toUpperCase());
        optPersonal.setText("Personnel".toUpperCase());
        lblIdioma.setText("langage".toUpperCase());
        lblAceptar.setText("Accepter".toUpperCase());
        lblCuenta.setText("Vous n'avez pas de compte?".toUpperCase());
        modelo.addElement("Espagnol".toUpperCase());
        modelo.addElement("Français".toUpperCase());
        modelo.addElement("Anglais".toUpperCase());
        txtCorreo.setText("Entrer votre Email".toUpperCase());
        cboIdioma.setModel(modelo);
        }
    }
            
    private void cboIdiomaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        cambiarIdioma(cboIdioma.getSelectedIndex());
    }                                         

    private void txtPFContraseniaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void pnlBarraMousePressed(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        
        xMouse = evt.getX();
        yMouse = evt.getY();
    }                                     

    private void pnlBarraMouseDragged(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y- yMouse);
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
        lblCerrar.setBackground(Color.WHITE);
    }                                     

    /*private void lblAceptarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        if (intentos != 5) {
            
            if (!comprobarLog(txtCorreo.getText(), txtPFContrasenia.getPassword())) {
                if (lblCorreo.getText().equals("Correo".toUpperCase())) 
                    
                    JOptionPane.showMessageDialog(null, "El correo o la contraseña son incorrectos".toUpperCase());
                
                if (lblContrasenia.getText().equals("Password".toUpperCase())) 
                    JOptionPane.showMessageDialog(null, "Email or password is incorrect".toUpperCase());
                
                if (lblContrasenia.getText().equals("Mot de passe".toUpperCase()) )
                    JOptionPane.showMessageDialog(null, "E-mail ou mot de passe incorrect".toUpperCase());
                intentos++;
            } else {
                if (lblCorreo.getText().equals("Correo".toUpperCase())) 
                    JOptionPane.showMessageDialog(null, "Confirmacion Valida".toUpperCase());
                
                if (lblContrasenia.getText().equals("Password".toUpperCase()) ) 
                    JOptionPane.showMessageDialog(null, "Valid Confirmation".toUpperCase());
                
                if (lblContrasenia.getText().equals("Mot de passe".toUpperCase()) )
                    JOptionPane.showMessageDialog(null, "Confirmation valide".toUpperCase());
            }
        } else {
            if (lblCorreo.getText().equals("Correo".toUpperCase())) 
                    JOptionPane.showMessageDialog(null, "Haz realizado demasiados intentos, espera 15 segundos".toUpperCase());
                
                if (lblContrasenia.getText().equals("Password".toUpperCase())) 
                    JOptionPane.showMessageDialog(null, "You have tried too many times, wait 15 seconds".toUpperCase());
                
                if (lblContrasenia.getText().equals("Mot de passe".toUpperCase()) )
                    JOptionPane.showMessageDialog(null, "Vous avez essayé trop de fois, attendez 15 secondes".toUpperCase());

            Timer timer = new Timer(15000, (ActionEvent e) -> {
                intentos = 0;
            });
            timer.setRepeats(false);
            timer.start();
        }
    }                                       
*/
    private void lblCuentaMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        
        //creacionCuenta.setVisible(true);
        //setContrasP();
        //setCorreosP();
        //setContrasU();
        //setCorreosU();
    }                                      

    private void lblAceptarMouseEntered(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        lblAceptar.setBackground(new Color(0,153,223));
    }                                       

    private void lblAceptarMouseExited(java.awt.event.MouseEvent evt) {                                       
        
        lblAceptar.setBackground(new Color(0,134,190));
    }                                      

    private void lblCuentaMouseEntered(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        lblCuenta.setBackground(new Color(0,153,223));
    }                                      

    private void lblCuentaMouseExited(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        lblAceptar.setBackground(new Color(0,134,190));
    }                                     

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        if (txtCorreo.getText().equals("Ingrese su correo".toUpperCase()) || txtCorreo.getText().equals("Enter your email".toUpperCase()) || txtCorreo.getText().equals("Entrer votre Email".toUpperCase())) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.BLACK);
        }
        if (String.valueOf(txtPFContrasenia.getPassword()).isEmpty()) {
            txtPFContrasenia.setText("**************");
            txtPFContrasenia.setForeground(Color.GRAY);
        }
    }                                      

    private void txtPFContraseniaMousePressed(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        if (String.valueOf(txtPFContrasenia.getPassword()).equals("**************")) {
            txtPFContrasenia.setText("");
            txtPFContrasenia.setForeground(Color.BLACK);
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
    }
    
    
    private void initComponents(){
       jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        cboIdioma = new javax.swing.JComboBox<>();
        lblMostrarContra = new javax.swing.JLabel();
        txtPFContrasenia = new javax.swing.JPasswordField();
        optPersonal = new javax.swing.JRadioButton();
        optUsuario = new javax.swing.JRadioButton();
        lblContrasenia = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblAceptar = new javax.swing.JLabel();
        pnlBarra = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblCuenta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOMBRE INSTITUCION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 190, 40));

        lblLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogo.setVerifyInputWhenFocusTarget(false);
        add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 150, 170));

        lblIcono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 66, 64));

        lblIdioma.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblIdioma.setText("IDIOMA");
        add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 388, -1, -1));

        cboIdioma.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cboIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESPAÑOL", "FRANCES", "INGLES" }));
        cboIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIdiomaActionPerformed(evt);
            }
        });
        add(cboIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 421, -1, -1));

        lblMostrarContra.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        lblMostrarContra.setText("MOSTRAR CONTRASEÑA");
        lblMostrarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMostrarContraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMostrarContraMouseExited(evt);
            }
        });
        add(lblMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 275, -1, -1));

        txtPFContrasenia.setForeground(new java.awt.Color(204, 204, 204));
        txtPFContrasenia.setText("**************");
        txtPFContrasenia.setToolTipText("");
        txtPFContrasenia.setBorder(null);
        txtPFContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPFContraseniaMousePressed(evt);
            }
        });
        txtPFContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPFContraseniaActionPerformed(evt);
            }
        });
        add(txtPFContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 262, 248, 25));

        optPersonal.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        optPersonal.setText("PERSONAL");
        add(optPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 176, -1, -1));

        optUsuario.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        optUsuario.setText("USUARIO");
        add(optUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 150, -1, -1));

        lblContrasenia.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblContrasenia.setText("CONTRASEÑA");
        add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 267, 99, -1));

        lblCorreo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblCorreo.setText("CORREO");
        add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 152, 120, -1));

        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("INGRESE SU CORREO");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 152, 248, -1));

        lblTitulo.setFont(new java.awt.Font("Roboto Medium", 2, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("INICIO");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblTitulo.setInheritsPopupMenu(false);
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 47, 311, 55));

        lblFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 244, 485));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 176, 248, 10));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 293, 248, 10));

        jPanel2.setBackground(new java.awt.Color(0, 134, 190));
        jPanel2.setToolTipText("");

        lblAceptar.setBackground(new java.awt.Color(0, 134, 190));
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
               // lblAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAceptarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 364, -1, -1));

        pnlBarra.setBackground(new java.awt.Color(255, 255, 255));
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

        lblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        lblCerrar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
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
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 805, Short.MAX_VALUE))
        );
        pnlBarraLayout.setVerticalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(pnlBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        jPanel3.setBackground(new java.awt.Color(0, 134, 190));

        lblCuenta.setBackground(new java.awt.Color(0, 134, 190));
        lblCuenta.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuenta.setText("NO TIENES CUENTA?");
        lblCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCuenta.setOpaque(true);
        lblCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCuentaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 364, -1, -1));
    }
    
    public static void main(String args[]){
        Log loggsito = new Log();
        loggsito.setVisible(true);
    }
    }

