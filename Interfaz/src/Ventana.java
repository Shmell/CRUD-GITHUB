
/*  NOTAS DE MEJORIA: 
        °ARRANCAR MONGODB AL EJECUTARSE LA INTERFAZ
        °MOSTRAR CONSULAS DENTRO DE CAMPOS DEFINIDOS
        °OPTIMIZAR FUNCION ACTUALIZAR CON SITEMA DE 2 BOTONES QUE MUESTRE LOS DATOS ACTUALES EN LOS CAMPOS
*/
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.sun.java.accessibility.util.AWTEventMonitor;
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;
import java.text.Normalizer.Form;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAM
 */
public class Ventana extends javax.swing.JFrame implements ActionListener{

   
    public Ventana() 
    {
        
        
        this.setTitle("Mexico SIN Hambre");
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setBounds(0, 0, 345, 51);
        setResizable(false);
        
         fields[0]=jLabel1;
         fields[1]=jLabel2;
         fields[2]=jLabel3;
         fields[3]=jLabel4;
         fields[4]=jLabel5;
         fields[5]=jLabel6;
         fields[6]=jLabel7;
         fields[7]=jLabel8;
         fields[8]=jLabel9;
         fields[9]=jLabel10;
         fields[10]=jLabel11;
         fields[11]=jLabel12;
                  
         texts[0]=jTextField1;
         texts[1]=jTextField2;
         texts[2]=jTextField3;
         texts[3]=jTextField4;
         texts[4]=jTextField5;
         texts[5]=jTextField6;
         texts[6]=jTextField7;
         texts[7]=jTextField8;
         texts[8]=jTextField9;
         texts[9]=jTextField10;
         texts[10]=jTextField11;
         texts[11]=jTextField12;
            
        
        
        
        add_to_ActionListenner();
        make_lab_and_text_invisible();
        
        
        try 
        {
            Mongo mongo=new Mongo("localhost",27017);
            
            db=mongo.getDB("Beneficiarios");
            
        } 
        catch (UnknownHostException ex) 
        {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
///////////////////////////////////////////////////////////////////////
    
    public void actionPerformed(ActionEvent e) 
    {
        Object source=e.getSource();
        
      
       
       choose_collection(source);
       
       choose_function(source);
       
      
       
       
    }
     
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        doit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem60 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem61 = new javax.swing.JMenuItem();
        jMenuItem62 = new javax.swing.JMenuItem();
        jMenuItem63 = new javax.swing.JMenuItem();
        jMenuItem64 = new javax.swing.JMenuItem();
        jMenuItem65 = new javax.swing.JMenuItem();
        jMenuItem66 = new javax.swing.JMenuItem();
        jMenuItem67 = new javax.swing.JMenuItem();
        jMenuItem68 = new javax.swing.JMenuItem();
        jMenuItem69 = new javax.swing.JMenuItem();
        jMenuItem70 = new javax.swing.JMenuItem();
        jMenuItem71 = new javax.swing.JMenuItem();
        jMenuItem72 = new javax.swing.JMenuItem();
        jMenuItem73 = new javax.swing.JMenuItem();
        jMenuItem74 = new javax.swing.JMenuItem();
        jMenuItem75 = new javax.swing.JMenuItem();
        jMenuItem76 = new javax.swing.JMenuItem();
        jMenuItem77 = new javax.swing.JMenuItem();
        jMenuItem78 = new javax.swing.JMenuItem();
        jMenuItem79 = new javax.swing.JMenuItem();
        jMenuItem80 = new javax.swing.JMenuItem();
        jMenuItem81 = new javax.swing.JMenuItem();
        jMenuItem82 = new javax.swing.JMenuItem();
        jMenuItem83 = new javax.swing.JMenuItem();
        jMenuItem84 = new javax.swing.JMenuItem();
        jMenuItem85 = new javax.swing.JMenuItem();
        jMenuItem86 = new javax.swing.JMenuItem();
        jMenuItem87 = new javax.swing.JMenuItem();
        jMenuItem88 = new javax.swing.JMenuItem();
        jMenuItem89 = new javax.swing.JMenuItem();
        jMenuItem90 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem91 = new javax.swing.JMenuItem();
        jMenuItem92 = new javax.swing.JMenuItem();
        jMenuItem93 = new javax.swing.JMenuItem();
        jMenuItem94 = new javax.swing.JMenuItem();
        jMenuItem95 = new javax.swing.JMenuItem();
        jMenuItem96 = new javax.swing.JMenuItem();
        jMenuItem97 = new javax.swing.JMenuItem();
        jMenuItem98 = new javax.swing.JMenuItem();
        jMenuItem99 = new javax.swing.JMenuItem();
        jMenuItem100 = new javax.swing.JMenuItem();
        jMenuItem101 = new javax.swing.JMenuItem();
        jMenuItem102 = new javax.swing.JMenuItem();
        jMenuItem103 = new javax.swing.JMenuItem();
        jMenuItem104 = new javax.swing.JMenuItem();
        jMenuItem105 = new javax.swing.JMenuItem();
        jMenuItem106 = new javax.swing.JMenuItem();
        jMenuItem107 = new javax.swing.JMenuItem();
        jMenuItem108 = new javax.swing.JMenuItem();
        jMenuItem109 = new javax.swing.JMenuItem();
        jMenuItem110 = new javax.swing.JMenuItem();
        jMenuItem111 = new javax.swing.JMenuItem();
        jMenuItem112 = new javax.swing.JMenuItem();
        jMenuItem113 = new javax.swing.JMenuItem();
        jMenuItem114 = new javax.swing.JMenuItem();
        jMenuItem115 = new javax.swing.JMenuItem();
        jMenuItem116 = new javax.swing.JMenuItem();
        jMenuItem117 = new javax.swing.JMenuItem();
        jMenuItem118 = new javax.swing.JMenuItem();
        jMenuItem119 = new javax.swing.JMenuItem();
        jMenuItem120 = new javax.swing.JMenuItem();

        jFrame1.setAutoRequestFocus(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Id");

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel11.setText("jLabel11");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        doit.setText("Do it!");
        doit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doitActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel12.setText("jLabel12");

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jLabel13");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("jLabel13");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 255));

        jMenu1.setText("Insertar");

        jMenuItem1.setText("Beneficiario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Beneficiario Academica");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Beneficiario Programa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Beneficiario Resposable");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Dia");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Escuela");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Estatus");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Grados");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Libro");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Libro Prestamo");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Parentesco");
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Patrocinador");
        jMenu1.add(jMenuItem12);

        jMenuItem13.setText("Patrocinador Deposito");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem14.setText("Patrocinador Programa");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem15.setText("Prestador");
        jMenu1.add(jMenuItem15);

        jMenuItem16.setText("Producto");
        jMenu1.add(jMenuItem16);

        jMenuItem17.setText("Producto Almacen");
        jMenu1.add(jMenuItem17);

        jMenuItem18.setText("Programa");
        jMenu1.add(jMenuItem18);

        jMenuItem19.setText("Responsable");
        jMenu1.add(jMenuItem19);

        jMenuItem20.setText("Taller");
        jMenu1.add(jMenuItem20);

        jMenuItem21.setText("Taller Beneficiario");
        jMenu1.add(jMenuItem21);

        jMenuItem22.setText("Taller Tipo");
        jMenu1.add(jMenuItem22);

        jMenuItem23.setText("Taller Dias");
        jMenu1.add(jMenuItem23);

        jMenuItem24.setText("Tipo Deposito");
        jMenu1.add(jMenuItem24);

        jMenuItem25.setText("Turno");
        jMenu1.add(jMenuItem25);

        jMenuItem26.setText("Usuario");
        jMenu1.add(jMenuItem26);

        jMenuItem27.setText("Usuario Permisos");
        jMenu1.add(jMenuItem27);

        jMenuItem28.setText("Ciclo Escolar");
        jMenu1.add(jMenuItem28);

        jMenuItem29.setText("Genero");
        jMenu1.add(jMenuItem29);

        jMenuItem30.setText("Grado Escolar");
        jMenu1.add(jMenuItem30);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Eliminar");

        jMenuItem31.setText("Beneficiario");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem31);

        jMenuItem32.setText("Beneficiario Academica");
        jMenu2.add(jMenuItem32);

        jMenuItem33.setText("Beneficiario Programa");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem33);

        jMenuItem34.setText("Beneficiario Resposable");
        jMenu2.add(jMenuItem34);

        jMenuItem35.setText("Dia");
        jMenu2.add(jMenuItem35);

        jMenuItem36.setText("Escuela");
        jMenu2.add(jMenuItem36);

        jMenuItem37.setText("Estatus");
        jMenu2.add(jMenuItem37);

        jMenuItem38.setText("Grados");
        jMenu2.add(jMenuItem38);

        jMenuItem39.setText("Libro");
        jMenu2.add(jMenuItem39);

        jMenuItem40.setText("Libro Prestamo");
        jMenu2.add(jMenuItem40);

        jMenuItem41.setText("Parentesco");
        jMenu2.add(jMenuItem41);

        jMenuItem42.setText("Patrocinador");
        jMenu2.add(jMenuItem42);

        jMenuItem43.setText("Patrocinador Deposito");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem43);

        jMenuItem44.setText("Patrocinador Programa");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem44);

        jMenuItem45.setText("Prestador");
        jMenu2.add(jMenuItem45);

        jMenuItem46.setText("Producto");
        jMenu2.add(jMenuItem46);

        jMenuItem47.setText("Producto Almacen");
        jMenu2.add(jMenuItem47);

        jMenuItem48.setText("Programa");
        jMenu2.add(jMenuItem48);

        jMenuItem49.setText("Responsable");
        jMenu2.add(jMenuItem49);

        jMenuItem50.setText("Taller");
        jMenu2.add(jMenuItem50);

        jMenuItem51.setText("Taller Beneficiario");
        jMenu2.add(jMenuItem51);

        jMenuItem52.setText("Taller Tipo");
        jMenu2.add(jMenuItem52);

        jMenuItem53.setText("Taller Dias");
        jMenu2.add(jMenuItem53);

        jMenuItem54.setText("Tipo Deposito");
        jMenu2.add(jMenuItem54);

        jMenuItem55.setText("Turno");
        jMenu2.add(jMenuItem55);

        jMenuItem56.setText("Usuario");
        jMenu2.add(jMenuItem56);

        jMenuItem57.setText("Usuario Permisos");
        jMenu2.add(jMenuItem57);

        jMenuItem58.setText("Ciclo Escolar");
        jMenu2.add(jMenuItem58);

        jMenuItem59.setText("Genero");
        jMenu2.add(jMenuItem59);

        jMenuItem60.setText("Grado Escolar");
        jMenu2.add(jMenuItem60);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Actualizar");

        jMenuItem61.setText("Beneficiario");
        jMenuItem61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem61ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem61);

        jMenuItem62.setText("Beneficiario Academica");
        jMenu3.add(jMenuItem62);

        jMenuItem63.setText("Beneficiario Programa");
        jMenuItem63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem63ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem63);

        jMenuItem64.setText("Beneficiario Resposable");
        jMenu3.add(jMenuItem64);

        jMenuItem65.setText("Dia");
        jMenu3.add(jMenuItem65);

        jMenuItem66.setText("Escuela");
        jMenu3.add(jMenuItem66);

        jMenuItem67.setText("Estatus");
        jMenu3.add(jMenuItem67);

        jMenuItem68.setText("Grados");
        jMenu3.add(jMenuItem68);

        jMenuItem69.setText("Libro");
        jMenu3.add(jMenuItem69);

        jMenuItem70.setText("Libro Prestamo");
        jMenu3.add(jMenuItem70);

        jMenuItem71.setText("Parentesco");
        jMenu3.add(jMenuItem71);

        jMenuItem72.setText("Patrocinador");
        jMenu3.add(jMenuItem72);

        jMenuItem73.setText("Patrocinador Deposito");
        jMenuItem73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem73ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem73);

        jMenuItem74.setText("Patrocinador Programa");
        jMenuItem74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem74ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem74);

        jMenuItem75.setText("Prestador");
        jMenu3.add(jMenuItem75);

        jMenuItem76.setText("Producto");
        jMenu3.add(jMenuItem76);

        jMenuItem77.setText("Producto Almacen");
        jMenu3.add(jMenuItem77);

        jMenuItem78.setText("Programa");
        jMenu3.add(jMenuItem78);

        jMenuItem79.setText("Responsable");
        jMenu3.add(jMenuItem79);

        jMenuItem80.setText("Taller");
        jMenu3.add(jMenuItem80);

        jMenuItem81.setText("Taller Beneficiario");
        jMenu3.add(jMenuItem81);

        jMenuItem82.setText("Taller Tipo");
        jMenu3.add(jMenuItem82);

        jMenuItem83.setText("Taller Dias");
        jMenu3.add(jMenuItem83);

        jMenuItem84.setText("Tipo Deposito");
        jMenu3.add(jMenuItem84);

        jMenuItem85.setText("Turno");
        jMenu3.add(jMenuItem85);

        jMenuItem86.setText("Usuario");
        jMenu3.add(jMenuItem86);

        jMenuItem87.setText("Usuario Permisos");
        jMenu3.add(jMenuItem87);

        jMenuItem88.setText("Ciclo Escolar");
        jMenu3.add(jMenuItem88);

        jMenuItem89.setText("Genero");
        jMenu3.add(jMenuItem89);

        jMenuItem90.setText("Grado Escolar");
        jMenu3.add(jMenuItem90);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultar");

        jMenuItem91.setText("Beneficiario");
        jMenuItem91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem91ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem91);

        jMenuItem92.setText("Beneficiario Academica");
        jMenu4.add(jMenuItem92);

        jMenuItem93.setText("Beneficiario Programa");
        jMenuItem93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem93ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem93);

        jMenuItem94.setText("Beneficiario Resposable");
        jMenu4.add(jMenuItem94);

        jMenuItem95.setText("Dia");
        jMenu4.add(jMenuItem95);

        jMenuItem96.setText("Escuela");
        jMenu4.add(jMenuItem96);

        jMenuItem97.setText("Estatus");
        jMenu4.add(jMenuItem97);

        jMenuItem98.setText("Grados");
        jMenu4.add(jMenuItem98);

        jMenuItem99.setText("Libro");
        jMenu4.add(jMenuItem99);

        jMenuItem100.setText("Libro Prestamo");
        jMenu4.add(jMenuItem100);

        jMenuItem101.setText("Parentesco");
        jMenu4.add(jMenuItem101);

        jMenuItem102.setText("Patrocinador");
        jMenu4.add(jMenuItem102);

        jMenuItem103.setText("Patrocinador Deposito");
        jMenuItem103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem103ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem103);

        jMenuItem104.setText("Patrocinador Programa");
        jMenuItem104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem104ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem104);

        jMenuItem105.setText("Prestador");
        jMenu4.add(jMenuItem105);

        jMenuItem106.setText("Producto");
        jMenu4.add(jMenuItem106);

        jMenuItem107.setText("Producto Almacen");
        jMenu4.add(jMenuItem107);

        jMenuItem108.setText("Programa");
        jMenu4.add(jMenuItem108);

        jMenuItem109.setText("Responsable");
        jMenu4.add(jMenuItem109);

        jMenuItem110.setText("Taller");
        jMenu4.add(jMenuItem110);

        jMenuItem111.setText("Taller Beneficiario");
        jMenu4.add(jMenuItem111);

        jMenuItem112.setText("Taller Tipo");
        jMenu4.add(jMenuItem112);

        jMenuItem113.setText("Taller Dias");
        jMenu4.add(jMenuItem113);

        jMenuItem114.setText("Tipo Deposito");
        jMenu4.add(jMenuItem114);

        jMenuItem115.setText("Turno");
        jMenu4.add(jMenuItem115);

        jMenuItem116.setText("Usuario");
        jMenu4.add(jMenuItem116);

        jMenuItem117.setText("Usuario Permisos");
        jMenu4.add(jMenuItem117);

        jMenuItem118.setText("Ciclo Escolar");
        jMenu4.add(jMenuItem118);

        jMenuItem119.setText("Genero");
        jMenu4.add(jMenuItem119);

        jMenuItem120.setText("Grado Escolar");
        jMenu4.add(jMenuItem120);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doit))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem61ActionPerformed

    private void jMenuItem63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem63ActionPerformed

    private void jMenuItem73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem73ActionPerformed

    private void jMenuItem74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem74ActionPerformed

    private void jMenuItem91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem91ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem91ActionPerformed

    private void jMenuItem93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem93ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem93ActionPerformed

    private void jMenuItem103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem103ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem103ActionPerformed

    private void jMenuItem104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem104ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem104ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void doitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doitActionPerformed
        
        String casilla_id=jTextField1.getText();
        
        switch(funcion)
        {
            case INSERTAR:   
                        if(casilla_id.isEmpty())
                            JOptionPane.showMessageDialog(null, "No hay datos en la casilla ID");
                        else
                            {
                             BasicDBObject document=new BasicDBObject();

                             for(int i=0;;i++)
                                {
                                 if(fields[i].isVisible()==true)   
                                    document.put(fields[i].getText(),texts[i].getText());
                                 else
                                     break;
                                }
                             
                             coleccion.insert(document);
                             
                             setSize(345,51);
                             JOptionPane.showMessageDialog(null, "Documento con ID: "+casilla_id+" ha sido INSERTADO");
                            }   
            ;break;
            
            case ELIMINAR:  
                                if(casilla_id.isEmpty())
                                    JOptionPane.showMessageDialog(null, "No hay datos en la casilla ID");
                                else
                                    {
                                     BasicDBObject document=new BasicDBObject();
                                     
                                     document.put(jLabel1.getText(),casilla_id);
                                     coleccion.remove(document);
                                     
                                     setSize(345,51);
                                     JOptionPane.showMessageDialog(null, "Documento(s) con ID: "+casilla_id+" ha sido ELIMINADO");
                                     setSize(345,51);
                                     consultar();
                                    }
                
                

                
                
                
                ;break;
                
            case ACTUALIZAR:   
                            if(casilla_id.isEmpty())
                                                JOptionPane.showMessageDialog(null, "No hay datos en la casilla ID");
                                            else
                                                {
                                                 BasicDBObject document_OLD=new BasicDBObject();
                                                 BasicDBObject document_NEW=new BasicDBObject();

                                                 document_OLD.put(jLabel1.getText(),casilla_id);
                                                 document_NEW.put(jLabel1.getText(),casilla_id);
                                                 
                                                 for(int i=1;;i++)
                                                    {
                                                     if(fields[i].isVisible()==true)   
                                                        document_NEW.put(fields[i].getText(),texts[i].getText());
                                                     else
                                                         break;
                                                    }
                                                 
                                                 
                                                 coleccion.update(document_OLD,document_NEW);

                                                 setSize(345,51);
                                                 JOptionPane.showMessageDialog(null, "Documento con ID: "+casilla_id+" ha sido ACTUALIZADO");
                                                setSize(345,51);
                                                consultar();
                                                }

                            
                
                
                
                
                
                
                
                ;break;
        
        
        
        
        
        
        }
        
        
        
        
        
        
             

             
        
    
    }//GEN-LAST:event_doitActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

   
    ////////////////////////////////////////////////////////////////
    public void choose_collection(Object source)
    {
     if(source==jMenuItem1 || source==jMenuItem31 || source==jMenuItem61 || source==jMenuItem91)
           coleccion=db.getCollection("Beneficiario");
       if(source==jMenuItem2 || source==jMenuItem32 || source==jMenuItem62 || source==jMenuItem92)
           coleccion=db.getCollection("Beneficiario_Academica");
       if(source==jMenuItem3 || source==jMenuItem33 || source==jMenuItem63 || source==jMenuItem93)
           coleccion=db.getCollection("Beneficiario_Programa");
       if(source==jMenuItem4 || source==jMenuItem34 || source==jMenuItem64 || source==jMenuItem94)
           coleccion=db.getCollection("Beneficiario_Responsable");
       if(source==jMenuItem5 || source==jMenuItem35 || source==jMenuItem65 || source==jMenuItem95)
           coleccion=db.getCollection("Dia");
       if(source==jMenuItem6 || source==jMenuItem36 || source==jMenuItem66 || source==jMenuItem96)
           coleccion=db.getCollection("Escuela");
       if(source==jMenuItem7 || source==jMenuItem37 || source==jMenuItem67 || source==jMenuItem97)
           coleccion=db.getCollection("Estatus");
       if(source==jMenuItem8 || source==jMenuItem38 || source==jMenuItem68 || source==jMenuItem98)
           coleccion=db.getCollection("Grados");
       if(source==jMenuItem9 || source==jMenuItem39 || source==jMenuItem69 || source==jMenuItem99)
           coleccion=db.getCollection("Libro");
       if(source==jMenuItem10 || source==jMenuItem40 || source==jMenuItem70 || source==jMenuItem100)
           coleccion=db.getCollection("Libro_Prestamo");
       if(source==jMenuItem11 || source==jMenuItem41 || source==jMenuItem71 || source==jMenuItem101)
           coleccion=db.getCollection("Parentesco");
       if(source==jMenuItem12 || source==jMenuItem42 || source==jMenuItem72 || source==jMenuItem102)
           coleccion=db.getCollection("Patrocinador");
       if(source==jMenuItem13 || source==jMenuItem43 || source==jMenuItem73 || source==jMenuItem103)
           coleccion=db.getCollection("Patrocinador_deposito");
       if(source==jMenuItem14 || source==jMenuItem44 || source==jMenuItem74 || source==jMenuItem104)
           coleccion=db.getCollection("Patrocinador_programa");
       if(source==jMenuItem15 || source==jMenuItem45 || source==jMenuItem75 || source==jMenuItem105)
           coleccion=db.getCollection("Prestador");
       if(source==jMenuItem16 || source==jMenuItem46 || source==jMenuItem76 || source==jMenuItem106)
           coleccion=db.getCollection("Producto");
       if(source==jMenuItem17 || source==jMenuItem47 || source==jMenuItem77 || source==jMenuItem107)
           coleccion=db.getCollection("Producto_Almacen");
       if(source==jMenuItem18 || source==jMenuItem48 || source==jMenuItem78 || source==jMenuItem108)
           coleccion=db.getCollection("Programa");
       if(source==jMenuItem19 || source==jMenuItem49 || source==jMenuItem79 || source==jMenuItem109)
           coleccion=db.getCollection("Responsable");
       if(source==jMenuItem20 || source==jMenuItem50 || source==jMenuItem80 || source==jMenuItem110)
           coleccion=db.getCollection("Taller");
       if(source==jMenuItem21 || source==jMenuItem51 || source==jMenuItem81 || source==jMenuItem111)
           coleccion=db.getCollection("Taller_Beneficiario");
       if(source==jMenuItem22 || source==jMenuItem52 || source==jMenuItem82 || source==jMenuItem112)
           coleccion=db.getCollection("Taller_TIPO");
       if(source==jMenuItem23 || source==jMenuItem53 || source==jMenuItem83 || source==jMenuItem113)
           coleccion=db.getCollection("Taller_dias");
       if(source==jMenuItem24 || source==jMenuItem54 || source==jMenuItem84 || source==jMenuItem114)
           coleccion=db.getCollection("TipoDeposito");
       if(source==jMenuItem25 || source==jMenuItem55 || source==jMenuItem85 || source==jMenuItem115)
           coleccion=db.getCollection("Turno");
       if(source==jMenuItem26 || source==jMenuItem56 || source==jMenuItem86 || source==jMenuItem116)
           coleccion=db.getCollection("Usuario");
       if(source==jMenuItem27 || source==jMenuItem57 || source==jMenuItem87 || source==jMenuItem117)
           coleccion=db.getCollection("Usuario_permisos");
       if(source==jMenuItem28 || source==jMenuItem58 || source==jMenuItem88 || source==jMenuItem118)
           coleccion=db.getCollection("cicloEscolar");
       if(source==jMenuItem29 || source==jMenuItem59 || source==jMenuItem89 || source==jMenuItem119)
           coleccion=db.getCollection("Genero");
       if(source==jMenuItem30 || source==jMenuItem60 || source==jMenuItem90 || source==jMenuItem120)
           coleccion=db.getCollection("Grados_escolares");
       
       jLabel14.setText(coleccion.getName());
    }
    
    
    ///////////////////////////////////////////////////////
    
    public void choose_function(Object source)
    {
       if(source==jMenuItem1 || source==jMenuItem2 || source==jMenuItem3 || source==jMenuItem4|| source==jMenuItem5 || source==jMenuItem6 || source==jMenuItem7|| source==jMenuItem8 || source==jMenuItem9 || source==jMenuItem10)
           insertar(source);
       else if(source==jMenuItem11 || source==jMenuItem12 || source==jMenuItem13 || source==jMenuItem14|| source==jMenuItem15 || source==jMenuItem16 || source==jMenuItem17|| source==jMenuItem18 || source==jMenuItem19 || source==jMenuItem20)
              insertar(source);
            else if(source==jMenuItem21 || source==jMenuItem22 || source==jMenuItem23 || source==jMenuItem24|| source==jMenuItem25 || source==jMenuItem26 || source==jMenuItem27|| source==jMenuItem28 || source==jMenuItem29 || source==jMenuItem30)
                    insertar(source);
                 else if(source==jMenuItem31 || source==jMenuItem32 || source==jMenuItem33 || source==jMenuItem34|| source==jMenuItem35 || source==jMenuItem36 || source==jMenuItem37|| source==jMenuItem38 || source==jMenuItem39 || source==jMenuItem40)
                        eliminar(source);
                      else if(source==jMenuItem41 || source==jMenuItem42 || source==jMenuItem43 || source==jMenuItem44|| source==jMenuItem45 || source==jMenuItem46 || source==jMenuItem47|| source==jMenuItem48 || source==jMenuItem49 || source==jMenuItem50)
                              eliminar(source);
                            else if(source==jMenuItem51 || source==jMenuItem52 || source==jMenuItem53 || source==jMenuItem54|| source==jMenuItem55 || source==jMenuItem56 || source==jMenuItem57|| source==jMenuItem58 || source==jMenuItem59 || source==jMenuItem60)
                                     eliminar(source);
                                 else if(source==jMenuItem61 || source==jMenuItem62 || source==jMenuItem63 || source==jMenuItem64|| source==jMenuItem65 || source==jMenuItem66 || source==jMenuItem67|| source==jMenuItem68 || source==jMenuItem69 || source==jMenuItem70)
                                         actualizar(source);
                                      else if(source==jMenuItem71 || source==jMenuItem72 || source==jMenuItem73 || source==jMenuItem74|| source==jMenuItem75 || source==jMenuItem76 || source==jMenuItem77|| source==jMenuItem78 || source==jMenuItem79 || source==jMenuItem80)
                                                actualizar(source);
                                           else if(source==jMenuItem81 || source==jMenuItem82 || source==jMenuItem83 || source==jMenuItem84|| source==jMenuItem85 || source==jMenuItem86 || source==jMenuItem87|| source==jMenuItem88 || source==jMenuItem89 || source==jMenuItem90)
                                                    actualizar(source);
                                                else if(source==jMenuItem91 || source==jMenuItem92 || source==jMenuItem93 || source==jMenuItem94|| source==jMenuItem95 || source==jMenuItem96 || source==jMenuItem97|| source==jMenuItem98 || source==jMenuItem99 || source==jMenuItem100)
                                                        consultar();
                                                     else if(source==jMenuItem101 || source==jMenuItem102 || source==jMenuItem103 || source==jMenuItem104|| source==jMenuItem105 || source==jMenuItem106 || source==jMenuItem107|| source==jMenuItem108 || source==jMenuItem109 || source==jMenuItem110)
                                                            consultar();
                                                          else if(source==jMenuItem111 || source==jMenuItem112 || source==jMenuItem113 || source==jMenuItem114|| source==jMenuItem115 || source==jMenuItem116 || source==jMenuItem117|| source==jMenuItem118 || source==jMenuItem119 || source==jMenuItem120)
                                                                consultar();
                            
    }
    
    ////////////////////////////////////////////////////
    
    public void insertar(Object source)
    {
     this.setSize(460, 650); 
     make_lab_and_text_invisible();
        setResizable(false);
     
    int op=this.INSERTAR;
     
     if(source==jMenuItem1 || source==jMenuItem31 || source==jMenuItem61 || source==jMenuItem91)
         recognize_fields(op,beneficiarios); 
       if(source==jMenuItem2 || source==jMenuItem32 || source==jMenuItem62 || source==jMenuItem92)
          recognize_fields(op,beneficiario_academica); 
       if(source==jMenuItem3 || source==jMenuItem33 || source==jMenuItem63 || source==jMenuItem93)
           recognize_fields(op,beneficiario_programa ); 
       if(source==jMenuItem4 || source==jMenuItem34 || source==jMenuItem64 || source==jMenuItem94)
           recognize_fields(op,beneficiario_responsable ); 
       if(source==jMenuItem5 || source==jMenuItem35 || source==jMenuItem65 || source==jMenuItem95)
           recognize_fields(op,dia ); 
       if(source==jMenuItem6 || source==jMenuItem36 || source==jMenuItem66 || source==jMenuItem96)
           recognize_fields(op,escuela ); 
       if(source==jMenuItem7 || source==jMenuItem37 || source==jMenuItem67 || source==jMenuItem97)
           recognize_fields(op,estatus ); 
       if(source==jMenuItem8 || source==jMenuItem38 || source==jMenuItem68 || source==jMenuItem98)
           recognize_fields(op,grados ); 
       if(source==jMenuItem9 || source==jMenuItem39 || source==jMenuItem69 || source==jMenuItem99)
           recognize_fields(op,libro ); 
       if(source==jMenuItem10 || source==jMenuItem40 || source==jMenuItem70 || source==jMenuItem100)
           recognize_fields(op,libro_prestamo ); 
       if(source==jMenuItem11 || source==jMenuItem41 || source==jMenuItem71 || source==jMenuItem101)
           recognize_fields(op,parentesco ); 
       if(source==jMenuItem12 || source==jMenuItem42 || source==jMenuItem72 || source==jMenuItem102)
           recognize_fields(op,patrocinador ); 
       if(source==jMenuItem13 || source==jMenuItem43 || source==jMenuItem73 || source==jMenuItem103)
           recognize_fields(op,patrocinador_deposito ); 
       if(source==jMenuItem14 || source==jMenuItem44 || source==jMenuItem74 || source==jMenuItem104)
           recognize_fields(op,patrocinador_programa ); 
       if(source==jMenuItem15 || source==jMenuItem45 || source==jMenuItem75 || source==jMenuItem105)
           recognize_fields(op,prestador ); 
       if(source==jMenuItem16 || source==jMenuItem46 || source==jMenuItem76 || source==jMenuItem106)
           recognize_fields(op,producto ); 
       if(source==jMenuItem17 || source==jMenuItem47 || source==jMenuItem77 || source==jMenuItem107)
           recognize_fields(op,producto_almacen ); 
       if(source==jMenuItem18 || source==jMenuItem48 || source==jMenuItem78 || source==jMenuItem108)
           recognize_fields(op,programa ); 
       if(source==jMenuItem19 || source==jMenuItem49 || source==jMenuItem79 || source==jMenuItem109)
           recognize_fields(op,responsable ); 
       if(source==jMenuItem20 || source==jMenuItem50 || source==jMenuItem80 || source==jMenuItem110)
           recognize_fields(op,taller ); 
       if(source==jMenuItem21 || source==jMenuItem51 || source==jMenuItem81 || source==jMenuItem111)
           recognize_fields(op,taller_beneficiario ); 
       if(source==jMenuItem22 || source==jMenuItem52 || source==jMenuItem82 || source==jMenuItem112)
           recognize_fields(op,taller_tipo ); 
       if(source==jMenuItem23 || source==jMenuItem53 || source==jMenuItem83 || source==jMenuItem113)
           recognize_fields(op,taller_dias ); 
       if(source==jMenuItem24 || source==jMenuItem54 || source==jMenuItem84 || source==jMenuItem114)
           recognize_fields(op,tipo_deposito ); 
       if(source==jMenuItem25 || source==jMenuItem55 || source==jMenuItem85 || source==jMenuItem115)
           recognize_fields(op,turno ); 
       if(source==jMenuItem26 || source==jMenuItem56 || source==jMenuItem86 || source==jMenuItem116)
           recognize_fields(op,usuario ); 
       if(source==jMenuItem27 || source==jMenuItem57 || source==jMenuItem87 || source==jMenuItem117)
           recognize_fields(op,usuario_permisos ); 
       if(source==jMenuItem28 || source==jMenuItem58 || source==jMenuItem88 || source==jMenuItem118)
           recognize_fields(op,ciclo_escolar ); 
       if(source==jMenuItem29 || source==jMenuItem59 || source==jMenuItem89 || source==jMenuItem119)
           recognize_fields(op,genero ); 
       if(source==jMenuItem30 || source==jMenuItem60 || source==jMenuItem90 || source==jMenuItem120)
           recognize_fields(op,grado_escolar ); 
       
       
       funcion=this.INSERTAR;
      jLabel13.setText("INSERTAR");
       
     
     
     
     
     
     
     
     
     
    }
    
    ////////////////////////////////////////////////////
    
    public void eliminar(Object source)
    {
     this.setSize( 460, 210); 
        make_lab_and_text_invisible();
     setResizable(false);
     
     int op=this.ELIMINAR;
     
     if(source==jMenuItem1 || source==jMenuItem31 || source==jMenuItem61 || source==jMenuItem91)
         recognize_fields(op,beneficiarios); 
       if(source==jMenuItem2 || source==jMenuItem32 || source==jMenuItem62 || source==jMenuItem92)
          recognize_fields(op,beneficiario_academica); 
       if(source==jMenuItem3 || source==jMenuItem33 || source==jMenuItem63 || source==jMenuItem93)
           recognize_fields(op,beneficiario_programa ); 
       if(source==jMenuItem4 || source==jMenuItem34 || source==jMenuItem64 || source==jMenuItem94)
           recognize_fields(op,beneficiario_responsable ); 
       if(source==jMenuItem5 || source==jMenuItem35 || source==jMenuItem65 || source==jMenuItem95)
           recognize_fields(op,dia ); 
       if(source==jMenuItem6 || source==jMenuItem36 || source==jMenuItem66 || source==jMenuItem96)
           recognize_fields(op,escuela ); 
       if(source==jMenuItem7 || source==jMenuItem37 || source==jMenuItem67 || source==jMenuItem97)
           recognize_fields(op,estatus ); 
       if(source==jMenuItem8 || source==jMenuItem38 || source==jMenuItem68 || source==jMenuItem98)
           recognize_fields(op,grados ); 
       if(source==jMenuItem9 || source==jMenuItem39 || source==jMenuItem69 || source==jMenuItem99)
           recognize_fields(op,libro ); 
       if(source==jMenuItem10 || source==jMenuItem40 || source==jMenuItem70 || source==jMenuItem100)
           recognize_fields(op,libro_prestamo ); 
       if(source==jMenuItem11 || source==jMenuItem41 || source==jMenuItem71 || source==jMenuItem101)
           recognize_fields(op,parentesco ); 
       if(source==jMenuItem12 || source==jMenuItem42 || source==jMenuItem72 || source==jMenuItem102)
           recognize_fields(op,patrocinador ); 
       if(source==jMenuItem13 || source==jMenuItem43 || source==jMenuItem73 || source==jMenuItem103)
           recognize_fields(op,patrocinador_deposito ); 
       if(source==jMenuItem14 || source==jMenuItem44 || source==jMenuItem74 || source==jMenuItem104)
           recognize_fields(op,patrocinador_programa ); 
       if(source==jMenuItem15 || source==jMenuItem45 || source==jMenuItem75 || source==jMenuItem105)
           recognize_fields(op,prestador ); 
       if(source==jMenuItem16 || source==jMenuItem46 || source==jMenuItem76 || source==jMenuItem106)
           recognize_fields(op,producto ); 
       if(source==jMenuItem17 || source==jMenuItem47 || source==jMenuItem77 || source==jMenuItem107)
           recognize_fields(op,producto_almacen ); 
       if(source==jMenuItem18 || source==jMenuItem48 || source==jMenuItem78 || source==jMenuItem108)
           recognize_fields(op,programa ); 
       if(source==jMenuItem19 || source==jMenuItem49 || source==jMenuItem79 || source==jMenuItem109)
           recognize_fields(op,responsable ); 
       if(source==jMenuItem20 || source==jMenuItem50 || source==jMenuItem80 || source==jMenuItem110)
           recognize_fields(op,taller ); 
       if(source==jMenuItem21 || source==jMenuItem51 || source==jMenuItem81 || source==jMenuItem111)
           recognize_fields(op,taller_beneficiario ); 
       if(source==jMenuItem22 || source==jMenuItem52 || source==jMenuItem82 || source==jMenuItem112)
           recognize_fields(op,taller_tipo ); 
       if(source==jMenuItem23 || source==jMenuItem53 || source==jMenuItem83 || source==jMenuItem113)
           recognize_fields(op,taller_dias ); 
       if(source==jMenuItem24 || source==jMenuItem54 || source==jMenuItem84 || source==jMenuItem114)
           recognize_fields(op,tipo_deposito ); 
       if(source==jMenuItem25 || source==jMenuItem55 || source==jMenuItem85 || source==jMenuItem115)
           recognize_fields(op,turno ); 
       if(source==jMenuItem26 || source==jMenuItem56 || source==jMenuItem86 || source==jMenuItem116)
           recognize_fields(op,usuario ); 
       if(source==jMenuItem27 || source==jMenuItem57 || source==jMenuItem87 || source==jMenuItem117)
           recognize_fields(op,usuario_permisos ); 
       if(source==jMenuItem28 || source==jMenuItem58 || source==jMenuItem88 || source==jMenuItem118)
           recognize_fields(op,ciclo_escolar ); 
       if(source==jMenuItem29 || source==jMenuItem59 || source==jMenuItem89 || source==jMenuItem119)
           recognize_fields(op,genero ); 
       if(source==jMenuItem30 || source==jMenuItem60 || source==jMenuItem90 || source==jMenuItem120)
           recognize_fields(op,grado_escolar );
     
     
     
     
     
     
     funcion=this.ELIMINAR;
     jLabel13.setText("ELIMINAR");
    }
    
    ////////////////////////////////////////////////////
    
    public void actualizar(Object source)
    {
     this.setSize( 460, 650); 
        make_lab_and_text_invisible();
     setResizable(false);
     
     int op=this.ACTUALIZAR;
     
     if(source==jMenuItem1 || source==jMenuItem31 || source==jMenuItem61 || source==jMenuItem91)
         recognize_fields(op,beneficiarios); 
       if(source==jMenuItem2 || source==jMenuItem32 || source==jMenuItem62 || source==jMenuItem92)
          recognize_fields(op,beneficiario_academica); 
       if(source==jMenuItem3 || source==jMenuItem33 || source==jMenuItem63 || source==jMenuItem93)
           recognize_fields(op,beneficiario_programa ); 
       if(source==jMenuItem4 || source==jMenuItem34 || source==jMenuItem64 || source==jMenuItem94)
           recognize_fields(op,beneficiario_responsable ); 
       if(source==jMenuItem5 || source==jMenuItem35 || source==jMenuItem65 || source==jMenuItem95)
           recognize_fields(op,dia ); 
       if(source==jMenuItem6 || source==jMenuItem36 || source==jMenuItem66 || source==jMenuItem96)
           recognize_fields(op,escuela ); 
       if(source==jMenuItem7 || source==jMenuItem37 || source==jMenuItem67 || source==jMenuItem97)
           recognize_fields(op,estatus ); 
       if(source==jMenuItem8 || source==jMenuItem38 || source==jMenuItem68 || source==jMenuItem98)
           recognize_fields(op,grados ); 
       if(source==jMenuItem9 || source==jMenuItem39 || source==jMenuItem69 || source==jMenuItem99)
           recognize_fields(op,libro ); 
       if(source==jMenuItem10 || source==jMenuItem40 || source==jMenuItem70 || source==jMenuItem100)
           recognize_fields(op,libro_prestamo ); 
       if(source==jMenuItem11 || source==jMenuItem41 || source==jMenuItem71 || source==jMenuItem101)
           recognize_fields(op,parentesco ); 
       if(source==jMenuItem12 || source==jMenuItem42 || source==jMenuItem72 || source==jMenuItem102)
           recognize_fields(op,patrocinador ); 
       if(source==jMenuItem13 || source==jMenuItem43 || source==jMenuItem73 || source==jMenuItem103)
           recognize_fields(op,patrocinador_deposito ); 
       if(source==jMenuItem14 || source==jMenuItem44 || source==jMenuItem74 || source==jMenuItem104)
           recognize_fields(op,patrocinador_programa ); 
       if(source==jMenuItem15 || source==jMenuItem45 || source==jMenuItem75 || source==jMenuItem105)
           recognize_fields(op,prestador ); 
       if(source==jMenuItem16 || source==jMenuItem46 || source==jMenuItem76 || source==jMenuItem106)
           recognize_fields(op,producto ); 
       if(source==jMenuItem17 || source==jMenuItem47 || source==jMenuItem77 || source==jMenuItem107)
           recognize_fields(op,producto_almacen ); 
       if(source==jMenuItem18 || source==jMenuItem48 || source==jMenuItem78 || source==jMenuItem108)
           recognize_fields(op,programa ); 
       if(source==jMenuItem19 || source==jMenuItem49 || source==jMenuItem79 || source==jMenuItem109)
           recognize_fields(op,responsable ); 
       if(source==jMenuItem20 || source==jMenuItem50 || source==jMenuItem80 || source==jMenuItem110)
           recognize_fields(op,taller ); 
       if(source==jMenuItem21 || source==jMenuItem51 || source==jMenuItem81 || source==jMenuItem111)
           recognize_fields(op,taller_beneficiario ); 
       if(source==jMenuItem22 || source==jMenuItem52 || source==jMenuItem82 || source==jMenuItem112)
           recognize_fields(op,taller_tipo ); 
       if(source==jMenuItem23 || source==jMenuItem53 || source==jMenuItem83 || source==jMenuItem113)
           recognize_fields(op,taller_dias ); 
       if(source==jMenuItem24 || source==jMenuItem54 || source==jMenuItem84 || source==jMenuItem114)
           recognize_fields(op,tipo_deposito ); 
       if(source==jMenuItem25 || source==jMenuItem55 || source==jMenuItem85 || source==jMenuItem115)
           recognize_fields(op,turno ); 
       if(source==jMenuItem26 || source==jMenuItem56 || source==jMenuItem86 || source==jMenuItem116)
           recognize_fields(op,usuario ); 
       if(source==jMenuItem27 || source==jMenuItem57 || source==jMenuItem87 || source==jMenuItem117)
           recognize_fields(op,usuario_permisos ); 
       if(source==jMenuItem28 || source==jMenuItem58 || source==jMenuItem88 || source==jMenuItem118)
           recognize_fields(op,ciclo_escolar ); 
       if(source==jMenuItem29 || source==jMenuItem59 || source==jMenuItem89 || source==jMenuItem119)
           recognize_fields(op,genero ); 
       if(source==jMenuItem30 || source==jMenuItem60 || source==jMenuItem90 || source==jMenuItem120)
           recognize_fields(op,grado_escolar );
     
     
     
     
     funcion=this.ACTUALIZAR;
     jLabel13.setText("ACTUALIZAR");
     
    
    }
    
    ////////////////////////////////////////////////////
    
    public void consultar()
    {
     DBCursor cursor=coleccion.find();
        
        jFrame1.setVisible(true);
        jFrame1.setBounds(463,0,850,650);
     
        jTextArea1.setText(" ");
        while(cursor.hasNext())
        {
          jTextArea1.setText(jTextArea1.getText()+cursor.next()+"\n");
        
        }
    
    }
    
  
    ///////////////////////////////////////////////////
    
    public void recognize_fields(int funcion,String[] cam)
    {
        
        switch(funcion)
        {
            case INSERTAR:
                        for(int i=0;i<cam.length;i++)
                            {
                             fields[i].setVisible(true);
                             fields[i].setText(cam[i]);

                             texts[i].setVisible(true);
                            }
            ;break;
            
            case ELIMINAR:
                        fields[0].setVisible(true);
                        fields[0].setText(cam[0]);

                        texts[0].setVisible(true);

            ;break;
            
            case ACTUALIZAR:
                        for(int i=0;i<cam.length;i++)
                            {
                             fields[i].setVisible(true);
                             fields[i].setText(cam[i]);

                             texts[i].setVisible(true);
                             
                             
                                 
                            }
            ;break;
        
        
        
        
        }
      
         
         
      
       
       
       
       
       
    }
            
    ///////////////////////////////////////////////////
    
    public void add_to_ActionListenner()
    {
        jMenuItem1.addActionListener(this);
        jMenuItem2.addActionListener(this);
        jMenuItem3.addActionListener(this);
        jMenuItem4.addActionListener(this);
        jMenuItem5.addActionListener(this);
        jMenuItem6.addActionListener(this);
        jMenuItem7.addActionListener(this);
        jMenuItem8.addActionListener(this);
        jMenuItem9.addActionListener(this);
        jMenuItem10.addActionListener(this);
        jMenuItem11.addActionListener(this);
        jMenuItem12.addActionListener(this);
        jMenuItem13.addActionListener(this);
        jMenuItem14.addActionListener(this);
        jMenuItem15.addActionListener(this);
        jMenuItem16.addActionListener(this);
        jMenuItem17.addActionListener(this);
        jMenuItem18.addActionListener(this);
        jMenuItem19.addActionListener(this);
        jMenuItem20.addActionListener(this);
        jMenuItem21.addActionListener(this);
        jMenuItem22.addActionListener(this);
        jMenuItem23.addActionListener(this);
        jMenuItem24.addActionListener(this);
        jMenuItem25.addActionListener(this);
        jMenuItem26.addActionListener(this);
        jMenuItem27.addActionListener(this);
        jMenuItem28.addActionListener(this);
        jMenuItem29.addActionListener(this);
        jMenuItem30.addActionListener(this);
        jMenuItem31.addActionListener(this);
        jMenuItem32.addActionListener(this);
        jMenuItem33.addActionListener(this);
        jMenuItem34.addActionListener(this);
        jMenuItem35.addActionListener(this);
        jMenuItem36.addActionListener(this);
        jMenuItem37.addActionListener(this);
        jMenuItem38.addActionListener(this);
        jMenuItem39.addActionListener(this);
        jMenuItem40.addActionListener(this);
        jMenuItem41.addActionListener(this);
        jMenuItem42.addActionListener(this);
        jMenuItem43.addActionListener(this);
        jMenuItem44.addActionListener(this);
        jMenuItem45.addActionListener(this);
        jMenuItem46.addActionListener(this);
        jMenuItem47.addActionListener(this);
        jMenuItem48.addActionListener(this);
        jMenuItem49.addActionListener(this);
        jMenuItem50.addActionListener(this);
        jMenuItem51.addActionListener(this);
        jMenuItem52.addActionListener(this);
        jMenuItem53.addActionListener(this);
        jMenuItem54.addActionListener(this);
        jMenuItem55.addActionListener(this);
        jMenuItem56.addActionListener(this);
        jMenuItem57.addActionListener(this);
        jMenuItem58.addActionListener(this);
        jMenuItem59.addActionListener(this);
        jMenuItem60.addActionListener(this);
        jMenuItem61.addActionListener(this);
        jMenuItem62.addActionListener(this);
        jMenuItem63.addActionListener(this);
        jMenuItem64.addActionListener(this);
        jMenuItem65.addActionListener(this);
        jMenuItem66.addActionListener(this);
        jMenuItem67.addActionListener(this);
        jMenuItem68.addActionListener(this);
        jMenuItem69.addActionListener(this);
        jMenuItem70.addActionListener(this);
        jMenuItem71.addActionListener(this);
        jMenuItem72.addActionListener(this);
        jMenuItem73.addActionListener(this);
        jMenuItem74.addActionListener(this);
        jMenuItem75.addActionListener(this);
        jMenuItem76.addActionListener(this);
        jMenuItem77.addActionListener(this);
        jMenuItem78.addActionListener(this);
        jMenuItem79.addActionListener(this);
        jMenuItem80.addActionListener(this);
        jMenuItem81.addActionListener(this);
        jMenuItem82.addActionListener(this);
        jMenuItem83.addActionListener(this);
        jMenuItem84.addActionListener(this);
        jMenuItem85.addActionListener(this);
        jMenuItem86.addActionListener(this);
        jMenuItem87.addActionListener(this);
        jMenuItem88.addActionListener(this);
        jMenuItem89.addActionListener(this);
        jMenuItem90.addActionListener(this);
        jMenuItem91.addActionListener(this);
        jMenuItem92.addActionListener(this);
        jMenuItem93.addActionListener(this);
        jMenuItem94.addActionListener(this);
        jMenuItem95.addActionListener(this);
        jMenuItem96.addActionListener(this);
        jMenuItem97.addActionListener(this);
        jMenuItem98.addActionListener(this);
        jMenuItem99.addActionListener(this);
        jMenuItem100.addActionListener(this);
        jMenuItem101.addActionListener(this);
        jMenuItem102.addActionListener(this);
        jMenuItem103.addActionListener(this);
        jMenuItem104.addActionListener(this);
        jMenuItem105.addActionListener(this);
        jMenuItem106.addActionListener(this);
        jMenuItem107.addActionListener(this);
        jMenuItem108.addActionListener(this);
        jMenuItem109.addActionListener(this);
        jMenuItem110.addActionListener(this);
        jMenuItem111.addActionListener(this);
        jMenuItem112.addActionListener(this);
        jMenuItem113.addActionListener(this);
        jMenuItem114.addActionListener(this);
        jMenuItem115.addActionListener(this);
        jMenuItem116.addActionListener(this);
        jMenuItem117.addActionListener(this);
        jMenuItem118.addActionListener(this);
        jMenuItem119.addActionListener(this);
        jMenuItem110.addActionListener(this);
        jMenuItem120.addActionListener(this);
        
       
       
    
    
    
    
    
    
    
    
    
    
    }
    
    /////////////////////////////////////////////////
    
    public void make_lab_and_text_invisible()
    {
     jLabel1.setVisible(true);
        
     for(int i=1;i<fields.length;i++)
         fields[i].setVisible(false);
     
      
      
      jTextField1.setVisible(true);
      jTextField1.setText("");
        
     for(int i=1;i<texts.length;i++)
        {
        texts[i].setVisible(false);
        texts[i].setText("");
        }

    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doit;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem100;
    private javax.swing.JMenuItem jMenuItem101;
    private javax.swing.JMenuItem jMenuItem102;
    private javax.swing.JMenuItem jMenuItem103;
    private javax.swing.JMenuItem jMenuItem104;
    private javax.swing.JMenuItem jMenuItem105;
    private javax.swing.JMenuItem jMenuItem106;
    private javax.swing.JMenuItem jMenuItem107;
    private javax.swing.JMenuItem jMenuItem108;
    private javax.swing.JMenuItem jMenuItem109;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem110;
    private javax.swing.JMenuItem jMenuItem111;
    private javax.swing.JMenuItem jMenuItem112;
    private javax.swing.JMenuItem jMenuItem113;
    private javax.swing.JMenuItem jMenuItem114;
    private javax.swing.JMenuItem jMenuItem115;
    private javax.swing.JMenuItem jMenuItem116;
    private javax.swing.JMenuItem jMenuItem117;
    private javax.swing.JMenuItem jMenuItem118;
    private javax.swing.JMenuItem jMenuItem119;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem120;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JMenuItem jMenuItem62;
    private javax.swing.JMenuItem jMenuItem63;
    private javax.swing.JMenuItem jMenuItem64;
    private javax.swing.JMenuItem jMenuItem65;
    private javax.swing.JMenuItem jMenuItem66;
    private javax.swing.JMenuItem jMenuItem67;
    private javax.swing.JMenuItem jMenuItem68;
    private javax.swing.JMenuItem jMenuItem69;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem70;
    private javax.swing.JMenuItem jMenuItem71;
    private javax.swing.JMenuItem jMenuItem72;
    private javax.swing.JMenuItem jMenuItem73;
    private javax.swing.JMenuItem jMenuItem74;
    private javax.swing.JMenuItem jMenuItem75;
    private javax.swing.JMenuItem jMenuItem76;
    private javax.swing.JMenuItem jMenuItem77;
    private javax.swing.JMenuItem jMenuItem78;
    private javax.swing.JMenuItem jMenuItem79;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem80;
    private javax.swing.JMenuItem jMenuItem81;
    private javax.swing.JMenuItem jMenuItem82;
    private javax.swing.JMenuItem jMenuItem83;
    private javax.swing.JMenuItem jMenuItem84;
    private javax.swing.JMenuItem jMenuItem85;
    private javax.swing.JMenuItem jMenuItem86;
    private javax.swing.JMenuItem jMenuItem87;
    private javax.swing.JMenuItem jMenuItem88;
    private javax.swing.JMenuItem jMenuItem89;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItem90;
    private javax.swing.JMenuItem jMenuItem91;
    private javax.swing.JMenuItem jMenuItem92;
    private javax.swing.JMenuItem jMenuItem93;
    private javax.swing.JMenuItem jMenuItem94;
    private javax.swing.JMenuItem jMenuItem95;
    private javax.swing.JMenuItem jMenuItem96;
    private javax.swing.JMenuItem jMenuItem97;
    private javax.swing.JMenuItem jMenuItem98;
    private javax.swing.JMenuItem jMenuItem99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    
    DB db;
   DBCollection coleccion;
    
    JLabel [] fields=new JLabel[12]; 
    JTextField [] texts=new JTextField[12]; 
    
    String [] beneficiarios ={"beneficiario_id", "nombres","apPaterno", "apMaterno", "fechaNac", "calle", "numExt", "numInt", "teléfono", "sexo", "turno_id", "usuario_id" };
    String [] beneficiario_academica ={"beneficiario_id", "ciclo_id", "escuela", "promedio", "grado_id"};
    String [] beneficiario_programa ={ "beneficiario_id", "programa_id", "fechaInicio", "fechaFin", "patrocinador_id"};
    String [] beneficiario_responsable ={ "beneficiario_id", "responsable_id", "parentesco_id"};
    String [] dia ={ "dia_id", "dia"};
    String [] escuela ={"escuela_id","escuela"};
    String [] estatus ={"estatus_id","estatus"};
    String [] grados ={"grado_id","grado"};
    String [] libro  ={"libro_id", "titulo", "escritor" , "editorial", "genero_id"};
    String [] libro_prestamo ={ "Beneficiario_id", "libro_id" , "fechaSalida" , "fechaDevo"};
    String [] parentesco ={"parentesco_id","parentesco"};
    String [] patrocinador ={"patrocinador", "nombres", "apPaterno", "sexo", "fechaNac", "teléfono", "email" , "ciudad", "estado" , "país" , "aportación_mensual"};
    String [] patrocinador_deposito ={ "patrocinador_id", "fecha", "cantidad", "tipo_deposito_id"};
    String [] patrocinador_programa ={"patrocinador_id", "fechaInicio" , "fechaFin"};
    String [] prestador ={ "prestador_id", "nombres", "apPaterno", "apMaterno", "fechaNac", "email", "teléfono"  , "carrera", "fechaInicio"  , "fechaFin" , "escuela_id"};
    String [] producto ={ "producto_id", "descripcion" , "minimo" };
    String [] producto_almacen ={"producto_id" , "cantidad" , "fecha"  , "usuario_id"};
    String [] programa ={ "programa_id" , "nombre" , "descripcion"};
    String [] responsable ={"responsable_id", "nombres" , "apPaterno" , "apMaterno"  , "sexo"  , "fechaNac" , "teléfono" , "email"  , "oficio" , "grado"};
    String [] taller ={"taller_id" , "nombre" , "tipoTaller_id"  , "hora"  , "prestador_id"  , "estatus_id"};
    String [] taller_beneficiario ={ "taller_id"  , "beneficiario_id" , "ciclo_id" , "nivel"  , "prestador_ir"};
    String [] taller_tipo ={ "Tipo_id" , "tipoTaller"};
    String [] taller_dias ={"taller_id" , "dia_id"};
    String [] tipo_deposito ={"Tipo_deposito_id" , "tipo_deposito" };
    String [] turno ={"Tipo_id" , "turno"};
    String [] usuario ={"usuario_id"  , "password" , "tipo_id"};
    String [] usuario_permisos ={"tipo_id" , "tipo" , "escribir" , "editar", "eliminar"};
    String [] ciclo_escolar ={ "ciclo_id" , "ciclo_escolar"};
    String [] genero ={"genero_id" , "Genero" };
    String [] grado_escolar ={"grado_id", "grado"};
         
   static final int INSERTAR=1,ELIMINAR=2,ACTUALIZAR=3;
   int funcion;
    
}
