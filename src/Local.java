import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;//metodo para sibreiciribr datos de clientes
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class Local extends javax.swing.JFrame {
    //Andres Blanco
    
    DefaultTableModel ModeloTabla; //esto es la definicion para tablas  
    DefaultTableModel ModeloTabla2;
    ClienteA UnClient; //definicon de objeto 
    
    ClienteA[] ArregloCliente;
    String[] cabecera={"N°","nombre","DNI", "dirrecion", "Ntelefono","correo", "contact", "Mpago","producto"," cp","Adicional","cA "};
    String[][]data={};
    int NumClient;
    
    //Alquiler de local modelo// lo mismo que arriba 
    Alquilar UnEvento;
    Alquilar[] ArregloEvento;
    String[] cabezaEvento={"N°"," nombre",  "DNI",  "nTelefono",  "correo",  "contact", " mPago","Fecha","Hora","THora"};
    String[][]datosDelEvento={};
    int NumEvent;
    
    
    
    
    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    DefaultListModel<String> modeloLista2 = new DefaultListModel<>();
    
    
    private final ArrayList<Object> datos;
    
    public Local() {
        ExtraerArchivo2();
        ExtraerDeArchivo();
        this.datos = new ArrayList<>();
        initComponents();
        
        ArregloCliente=new ClienteA[100];
        ArregloEvento=new  Alquilar[100];
        ModeloTabla=new DefaultTableModel(data,cabecera);
        ModeloTabla2=new DefaultTableModel(datosDelEvento,cabezaEvento);
        jtblDatos.setModel(ModeloTabla);//esto es meter el modelo que escribibimos 
        jtblDatosA.setModel(ModeloTabla2);
  
        NumClient=0;
        NumEvent=0;
        setSize(1164, 700);
        ModeloTabla.fireTableDataChanged();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnsalir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelDelivery = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jtxtdirrecion = new javax.swing.JTextField();
        jtxtnombre = new javax.swing.JTextField();
        jtxtNtelefono = new javax.swing.JTextField();
        jtxtcorreo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListCH1 = new javax.swing.JTextArea();
        jtxtDNIbuscar = new javax.swing.JTextField();
        jcbxproductoA = new javax.swing.JComboBox<>();
        jcbxMpago = new javax.swing.JComboBox<>();
        jcbcontact = new javax.swing.JComboBox<>();
        jbtngrabar = new javax.swing.JButton();
        jtxtDNI = new javax.swing.JTextField();
        jcbxproductoB = new javax.swing.JComboBox<>();
        jSpinner2s = new javax.swing.JTextField();
        jSpinner1s = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jtxtPizzaMasC = new javax.swing.JTextField();
        jtxte = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        PanelLocal = new javax.swing.JPanel();
        PanelDelivery1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtblDatosA = new javax.swing.JTable();
        jbtngrabar2 = new javax.swing.JButton();
        jtxtnombre112 = new javax.swing.JTextField();
        jtxtNtelefono1 = new javax.swing.JTextField();
        jtxtcorreo1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jcbxMpago1 = new javax.swing.JComboBox<>();
        jcbcontact1 = new javax.swing.JComboBox<>();
        jtxtFecha = new javax.swing.JTextField();
        jtxtDNI2 = new javax.swing.JTextField();
        jtxtHora2 = new javax.swing.JComboBox<>();
        jtxtHora3 = new javax.swing.JComboBox<>();
        jSpinner2s1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PanelOto = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jbtnsalir.setBackground(new java.awt.Color(51, 0, 0));
        jbtnsalir.setFont(new java.awt.Font("Retro Gaming", 0, 14)); // NOI18N
        jbtnsalir.setForeground(new java.awt.Color(255, 0, 0));
        jbtnsalir.setText("SALIR");
        jbtnsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbtnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnsalir);
        jbtnsalir.setBounds(1020, 0, 100, 40);

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Retro Gaming", 0, 10)); // NOI18N

        PanelDelivery.setBackground(new java.awt.Color(51, 51, 51));
        PanelDelivery.setForeground(new java.awt.Color(255, 255, 255));
        PanelDelivery.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jtblDatos.setBackground(new java.awt.Color(51, 51, 51));
        jtblDatos.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jtblDatos.setForeground(new java.awt.Color(255, 255, 255));
        jtblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, "", null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Num", "Codigo", "Nombres", "Area", "Tipo Seg", "Horas Extras", "Sueldo", "Monto H.E", "Monto Seguro", "Monto Essalud", "Sueldo Neto"
            }
        ));
        jtblDatos.setToolTipText("");
        jtblDatos.setGridColor(new java.awt.Color(51, 51, 51));
        jtblDatos.setRowSelectionAllowed(false);
        jtblDatos.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jtblDatos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jtblDatos);

        PanelDelivery.add(jScrollPane1);
        jScrollPane1.setBounds(10, 250, 790, 180);

        jtxtdirrecion.setBackground(new java.awt.Color(51, 51, 51));
        jtxtdirrecion.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jtxtdirrecion.setForeground(new java.awt.Color(255, 255, 255));
        jtxtdirrecion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Dirreción de Vivienda ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jtxtdirrecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdirrecionActionPerformed(evt);
            }
        });
        PanelDelivery.add(jtxtdirrecion);
        jtxtdirrecion.setBounds(10, 100, 180, 50);

        jtxtnombre.setBackground(new java.awt.Color(51, 51, 51));
        jtxtnombre.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jtxtnombre.setForeground(new java.awt.Color(255, 255, 255));
        jtxtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Nombre:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jtxtnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtxtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnombreActionPerformed(evt);
            }
        });
        PanelDelivery.add(jtxtnombre);
        jtxtnombre.setBounds(10, 20, 180, 60);

        jtxtNtelefono.setBackground(new java.awt.Color(51, 51, 51));
        jtxtNtelefono.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jtxtNtelefono.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNtelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Numero de telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jtxtNtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNtelefonoActionPerformed(evt);
            }
        });
        PanelDelivery.add(jtxtNtelefono);
        jtxtNtelefono.setBounds(210, 20, 180, 60);

        jtxtcorreo.setBackground(new java.awt.Color(51, 51, 51));
        jtxtcorreo.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jtxtcorreo.setForeground(new java.awt.Color(255, 255, 255));
        jtxtcorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Correo Electronico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jtxtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcorreoActionPerformed(evt);
            }
        });
        PanelDelivery.add(jtxtcorreo);
        jtxtcorreo.setBounds(210, 100, 180, 50);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        jbtBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jbtBuscar.setFont(new java.awt.Font("Retro Gaming", 0, 10)); // NOI18N
        jbtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtBuscar.setText("Buscar");
        jbtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtBuscar);
        jbtBuscar.setBounds(180, 20, 80, 50);

        jListCH1.setBackground(new java.awt.Color(51, 51, 51));
        jListCH1.setColumns(20);
        jListCH1.setFont(new java.awt.Font("Retro Gaming", 0, 10)); // NOI18N
        jListCH1.setForeground(new java.awt.Color(255, 255, 255));
        jListCH1.setRows(5);
        jListCH1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial de pedidos del Cliente: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jScrollPane3.setViewportView(jListCH1);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 80, 260, 120);

        jtxtDNIbuscar.setBackground(new java.awt.Color(51, 51, 51));
        jtxtDNIbuscar.setFont(new java.awt.Font("Retro Gaming", 0, 10)); // NOI18N
        jtxtDNIbuscar.setForeground(new java.awt.Color(255, 255, 255));
        jtxtDNIbuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar por DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jtxtDNIbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDNIbuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtDNIbuscar);
        jtxtDNIbuscar.setBounds(10, 20, 150, 50);

        PanelDelivery.add(jPanel2);
        jPanel2.setBounds(820, 230, 280, 210);

        jcbxproductoA.setBackground(new java.awt.Color(51, 51, 51));
        jcbxproductoA.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jcbxproductoA.setForeground(new java.awt.Color(255, 255, 255));
        jcbxproductoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza Margarita", "Hawaiana Tropical", "Cuatro Quesos Delight", "Vegetariana Primavera", "Carnívora Salvaje", "Mediterranean Bliss", "Caprese Elegante", "Pesto Pasionata", "Mexicana Picante" }));
        jcbxproductoA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Tipo de Pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jcbxproductoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxproductoAActionPerformed(evt);
            }
        });
        PanelDelivery.add(jcbxproductoA);
        jcbxproductoA.setBounds(410, 100, 170, 50);

        jcbxMpago.setBackground(new java.awt.Color(51, 51, 51));
        jcbxMpago.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jcbxMpago.setForeground(new java.awt.Color(255, 255, 255));
        jcbxMpago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Yape", "tarjeta", "plin", "efectivo", " " }));
        jcbxMpago.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Metodo de pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jcbxMpago.setFocusTraversalPolicyProvider(true);
        jcbxMpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxMpagoActionPerformed(evt);
            }
        });
        PanelDelivery.add(jcbxMpago);
        jcbxMpago.setBounds(210, 170, 180, 60);

        jcbcontact.setBackground(new java.awt.Color(51, 51, 51));
        jcbcontact.setFont(new java.awt.Font("Retro Gaming", 0, 10)); // NOI18N
        jcbcontact.setForeground(new java.awt.Color(255, 255, 255));
        jcbcontact.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "SMS", "Llamada", "Correo", "otro.." }));
        jcbcontact.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Metodo de Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jcbcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbcontactActionPerformed(evt);
            }
        });
        PanelDelivery.add(jcbcontact);
        jcbcontact.setBounds(410, 20, 150, 60);

        jbtngrabar.setBackground(new java.awt.Color(29, 57, 18));
        jbtngrabar.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jbtngrabar.setForeground(new java.awt.Color(51, 255, 0));
        jbtngrabar.setText("GRABAR");
        jbtngrabar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbtngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtngrabarActionPerformed(evt);
            }
        });
        PanelDelivery.add(jbtngrabar);
        jbtngrabar.setBounds(800, 30, 80, 40);

        jtxtDNI.setBackground(new java.awt.Color(51, 51, 51));
        jtxtDNI.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jtxtDNI.setForeground(new java.awt.Color(255, 255, 255));
        jtxtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "DNI:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jtxtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDNIActionPerformed(evt);
            }
        });
        PanelDelivery.add(jtxtDNI);
        jtxtDNI.setBounds(10, 170, 180, 60);

        jcbxproductoB.setBackground(new java.awt.Color(51, 51, 51));
        jcbxproductoB.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jcbxproductoB.setForeground(new java.awt.Color(255, 255, 255));
        jcbxproductoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gaseosa 1L", "gaseaos 2L", "Agua", "jugos ", "cafes ", "pan al ajo ", " " }));
        jcbxproductoB.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Extra :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jcbxproductoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxproductoBActionPerformed(evt);
            }
        });
        PanelDelivery.add(jcbxproductoB);
        jcbxproductoB.setBounds(410, 180, 172, 50);

        jSpinner2s.setBackground(new java.awt.Color(51, 51, 51));
        jSpinner2s.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jSpinner2s.setForeground(new java.awt.Color(255, 255, 255));
        jSpinner2s.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Cantidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jSpinner2s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpinner2sActionPerformed(evt);
            }
        });
        PanelDelivery.add(jSpinner2s);
        jSpinner2s.setBounds(600, 180, 100, 60);

        jSpinner1s.setBackground(new java.awt.Color(51, 51, 51));
        jSpinner1s.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jSpinner1s.setForeground(new java.awt.Color(255, 255, 255));
        jSpinner1s.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Cantidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jSpinner1s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpinner1sActionPerformed(evt);
            }
        });
        PanelDelivery.add(jSpinner1s);
        jSpinner1s.setBounds(600, 100, 100, 50);

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequenio", "Mediano", "Grande" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Tamaño", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        PanelDelivery.add(jComboBox1);
        jComboBox1.setBounds(610, 20, 180, 50);

        jtxtPizzaMasC.setBackground(new java.awt.Color(51, 51, 51));
        jtxtPizzaMasC.setFont(new java.awt.Font("Retro Gaming", 0, 10)); // NOI18N
        jtxtPizzaMasC.setForeground(new java.awt.Color(255, 255, 255));
        jtxtPizzaMasC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Pizza mas Pedida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jtxtPizzaMasC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPizzaMasCActionPerformed(evt);
            }
        });
        PanelDelivery.add(jtxtPizzaMasC);
        jtxtPizzaMasC.setBounds(10, 450, 250, 66);

        jtxte.setBackground(new java.awt.Color(51, 51, 51));
        jtxte.setFont(new java.awt.Font("Retro Gaming", 0, 10)); // NOI18N
        jtxte.setForeground(new java.awt.Color(255, 255, 255));
        jtxte.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Ganancias por Pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jtxte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxteActionPerformed(evt);
            }
        });
        PanelDelivery.add(jtxte);
        jtxte.setBounds(290, 449, 350, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1ces7tR2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        PanelDelivery.add(jLabel1);
        jLabel1.setBounds(780, 0, 350, 250);

        jList1.setBackground(new java.awt.Color(51, 51, 51));
        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Pizzas Vendidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jList1.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jList1);

        PanelDelivery.add(jScrollPane2);
        jScrollPane2.setBounds(670, 450, 410, 120);

        jTabbedPane1.addTab("Funciones de Clientes", PanelDelivery);

        PanelLocal.setBackground(new java.awt.Color(51, 51, 51));
        PanelLocal.setLayout(null);

        PanelDelivery1.setBackground(new java.awt.Color(51, 51, 51));
        PanelDelivery1.setLayout(null);
        PanelLocal.add(PanelDelivery1);
        PanelDelivery1.setBounds(564, 5, 0, 0);

        jtblDatosA.setAutoCreateRowSorter(true);
        jtblDatosA.setBackground(new java.awt.Color(51, 51, 51));
        jtblDatosA.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jtblDatosA.setForeground(new java.awt.Color(153, 255, 153));
        jtblDatosA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, "", null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Num", "Codigo", "Nombres", "Area", "Tipo Seg", "Horas Extras", "Sueldo", "Monto H.E", "Monto Seguro", "Monto Essalud", "Sueldo Neto"
            }
        ));
        jScrollPane4.setViewportView(jtblDatosA);

        PanelLocal.add(jScrollPane4);
        jScrollPane4.setBounds(20, 200, 790, 270);

        jbtngrabar2.setBackground(new java.awt.Color(51, 51, 51));
        jbtngrabar2.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jbtngrabar2.setForeground(new java.awt.Color(153, 255, 153));
        jbtngrabar2.setText("GRABAR");
        jbtngrabar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtngrabar2ActionPerformed(evt);
            }
        });
        PanelLocal.add(jbtngrabar2);
        jbtngrabar2.setBounds(660, 20, 100, 40);

        jtxtnombre112.setBackground(new java.awt.Color(51, 51, 51));
        jtxtnombre112.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jtxtnombre112.setForeground(new java.awt.Color(153, 255, 153));
        jtxtnombre112.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(153, 255, 153))); // NOI18N
        jtxtnombre112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnombre112ActionPerformed(evt);
            }
        });
        PanelLocal.add(jtxtnombre112);
        jtxtnombre112.setBounds(10, 10, 180, 50);

        jtxtNtelefono1.setBackground(new java.awt.Color(51, 51, 51));
        jtxtNtelefono1.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jtxtNtelefono1.setForeground(new java.awt.Color(153, 255, 153));
        jtxtNtelefono1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero Telfonico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(153, 255, 153))); // NOI18N
        jtxtNtelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNtelefono1ActionPerformed(evt);
            }
        });
        PanelLocal.add(jtxtNtelefono1);
        jtxtNtelefono1.setBounds(220, 10, 170, 50);

        jtxtcorreo1.setBackground(new java.awt.Color(51, 51, 51));
        jtxtcorreo1.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jtxtcorreo1.setForeground(new java.awt.Color(153, 255, 153));
        jtxtcorreo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo Electronico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(153, 255, 153))); // NOI18N
        jtxtcorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcorreo1ActionPerformed(evt);
            }
        });
        PanelLocal.add(jtxtcorreo1);
        jtxtcorreo1.setBounds(10, 70, 180, 50);

        jList2.setBackground(new java.awt.Color(51, 51, 51));
        jList2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fechas ocupadas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(153, 255, 153))); // NOI18N
        jList2.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jList2.setForeground(new java.awt.Color(153, 255, 153));
        jScrollPane5.setViewportView(jList2);

        PanelLocal.add(jScrollPane5);
        jScrollPane5.setBounds(870, 200, 190, 280);

        jcbxMpago1.setBackground(new java.awt.Color(51, 51, 51));
        jcbxMpago1.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jcbxMpago1.setForeground(new java.awt.Color(255, 255, 255));
        jcbxMpago1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Yape", "targeta", "plin", "efectivo", " " }));
        jcbxMpago1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Metodo de Pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(153, 255, 153))); // NOI18N
        PanelLocal.add(jcbxMpago1);
        jcbxMpago1.setBounds(420, 70, 220, 50);

        jcbcontact1.setBackground(new java.awt.Color(51, 51, 51));
        jcbcontact1.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jcbcontact1.setForeground(new java.awt.Color(255, 255, 255));
        jcbcontact1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "SMS", "Llamada", "Correo", "otro.." }));
        jcbcontact1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma de contactarlo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(153, 255, 153))); // NOI18N
        jcbcontact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbcontact1ActionPerformed(evt);
            }
        });
        PanelLocal.add(jcbcontact1);
        jcbcontact1.setBounds(420, 10, 230, 50);

        jtxtFecha.setBackground(new java.awt.Color(51, 51, 51));
        jtxtFecha.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jtxtFecha.setForeground(new java.awt.Color(153, 255, 153));
        jtxtFecha.setText("--/--/--");
        jtxtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dia del evento ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(153, 255, 153))); // NOI18N
        jtxtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtFechaMouseClicked(evt);
            }
        });
        jtxtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFechaActionPerformed(evt);
            }
        });
        PanelLocal.add(jtxtFecha);
        jtxtFecha.setBounds(10, 130, 180, 50);

        jtxtDNI2.setBackground(new java.awt.Color(51, 51, 51));
        jtxtDNI2.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jtxtDNI2.setForeground(new java.awt.Color(153, 255, 153));
        jtxtDNI2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(153, 255, 153))); // NOI18N
        jtxtDNI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDNI2ActionPerformed(evt);
            }
        });
        PanelLocal.add(jtxtDNI2);
        jtxtDNI2.setBounds(220, 70, 170, 50);

        jtxtHora2.setBackground(new java.awt.Color(51, 51, 51));
        jtxtHora2.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jtxtHora2.setForeground(new java.awt.Color(153, 255, 153));
        jtxtHora2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00" }));
        PanelLocal.add(jtxtHora2);
        jtxtHora2.setBounds(220, 130, 130, 50);

        jtxtHora3.setBackground(new java.awt.Color(51, 51, 51));
        jtxtHora3.setFont(new java.awt.Font("pixelmix", 0, 12)); // NOI18N
        jtxtHora3.setForeground(new java.awt.Color(153, 255, 153));
        jtxtHora3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a.m", "p.m", " " }));
        PanelLocal.add(jtxtHora3);
        jtxtHora3.setBounds(360, 130, 80, 50);

        jSpinner2s1.setBackground(new java.awt.Color(51, 51, 51));
        jSpinner2s1.setFont(new java.awt.Font("pixelmix", 0, 10)); // NOI18N
        jSpinner2s1.setForeground(new java.awt.Color(255, 255, 255));
        jSpinner2s1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "N Personas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Retro Gaming", 0, 12), new java.awt.Color(255, 153, 102))); // NOI18N
        jSpinner2s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSpinner2s1ActionPerformed(evt);
            }
        });
        PanelLocal.add(jSpinner2s1);
        jSpinner2s1.setBounds(470, 130, 130, 50);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelLocal.add(jButton1);
        jButton1.setBounds(670, 80, 75, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Golden-Freddy.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        PanelLocal.add(jLabel2);
        jLabel2.setBounds(770, -10, 390, 370);
        PanelLocal.add(jSeparator1);
        jSeparator1.setBounds(30, 530, 1000, 20);

        jTabbedPane1.addTab("Funciones para el Local", PanelLocal);

        PanelOto.setBackground(new java.awt.Color(51, 51, 51));
        PanelOto.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/depositphotos_3737asdhoasdsadrizontal-striped.jpg"))); // NOI18N
        PanelOto.add(jLabel3);
        jLabel3.setBounds(30, 90, 280, 277);

        jLabel4.setFont(new java.awt.Font("pixelmix", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Dona al proyecto para continuarlo ");
        PanelOto.add(jLabel4);
        jLabel4.setBounds(350, 110, 640, 60);

        jLabel5.setFont(new java.awt.Font("Retro Gaming", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 255));
        jLabel5.setText("TwiterX : @Dany70604550");
        PanelOto.add(jLabel5);
        jLabel5.setBounds(350, 320, 570, 60);

        jLabel6.setFont(new java.awt.Font("Retro Gaming", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("Instagram : @dargi_.v");
        PanelOto.add(jLabel6);
        jLabel6.setBounds(350, 190, 570, 60);

        jLabel7.setFont(new java.awt.Font("Retro Gaming", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 255));
        jLabel7.setText("TikTok : dargi_v");
        PanelOto.add(jLabel7);
        jLabel7.setBounds(350, 250, 570, 60);

        jTabbedPane1.addTab("Otro...", PanelOto);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1120, 930);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnsalirActionPerformed

    private void jtxtDNI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDNI2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDNI2ActionPerformed

    private void jtxtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFechaActionPerformed

    private void jtxtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtFechaMouseClicked
        // TODO add your handling code here:
        jtxtFecha.setText("");
    }//GEN-LAST:event_jtxtFechaMouseClicked

    private void jcbcontact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbcontact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbcontact1ActionPerformed

    private void jtxtcorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcorreo1ActionPerformed

    private void jtxtNtelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNtelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNtelefono1ActionPerformed

    private void jtxtnombre112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnombre112ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombre112ActionPerformed

    private void jbtngrabar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtngrabar2ActionPerformed

        String nombre=jtxtnombre112.getText();
        String DNI=jtxtDNI2.getText();
        String Fecha=jtxtFecha.getText();

        String nTelefono=jtxtNtelefono1.getText();
        String correo=jtxtcorreo1.getText();
        int cA= Integer.parseInt(jSpinner2s1.getText());
        String contact=jcbcontact1.getSelectedItem().toString();
        String mPago=jcbxMpago1.getSelectedItem().toString();
        String Hora=jtxtHora2.getSelectedItem().toString();
        String THora=jtxtHora3.getSelectedItem().toString();

        UnEvento=new Alquilar( nombre,  DNI,  nTelefono,  correo,  contact,  mPago,Fecha,Hora,THora,cA);

       
        GrabarEnArchivo2(UnEvento);
        Insertarentabla2(UnEvento);
        
        NumEvent++;
        LimpiarEntradas();

    }//GEN-LAST:event_jbtngrabar2ActionPerformed

    private void jtxteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxteActionPerformed

    private void jtxtPizzaMasCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPizzaMasCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPizzaMasCActionPerformed

    private void jSpinner1sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpinner1sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1sActionPerformed

    private void jSpinner2sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpinner2sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner2sActionPerformed

    private void jcbxproductoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxproductoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxproductoBActionPerformed

    private void jtxtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDNIActionPerformed

    }//GEN-LAST:event_jtxtDNIActionPerformed

    private void jcbcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbcontactActionPerformed

    private void jcbxMpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxMpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxMpagoActionPerformed

    private void jcbxproductoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxproductoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxproductoAActionPerformed

    private void jtxtDNIbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDNIbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDNIbuscarActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed
        //
        jListCH1.setText(HistorialClin());
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jtxtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcorreoActionPerformed

    private void jtxtNtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNtelefonoActionPerformed

    private void jtxtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombreActionPerformed

    private void jtxtdirrecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdirrecionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdirrecionActionPerformed

    private void jbtngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtngrabarActionPerformed
        String nombre=jtxtnombre.getText();//texfield
        String DNI=jtxtDNI.getText();
        String direccion=jtxtdirrecion.getText();
        String nTelefono=jtxtNtelefono.getText();
        String correo=jtxtcorreo.getText();
        String contact=jcbcontact.getSelectedItem().toString();//combobox
        String Producto=jcbxproductoA.getSelectedItem().toString();
        String mPago=jcbxMpago.getSelectedItem().toString();
        String Adcional=jcbxproductoB.getSelectedItem().toString();
        int cP = Integer.parseInt(jSpinner1s.getText());
        int cA= Integer.parseInt(jSpinner2s.getText());

        UnClient=new ClienteA(nombre,DNI,direccion,  nTelefono, correo,  contact, mPago ,Producto,cP,Adcional,cA);
        ArregloCliente[NumClient]=UnClient;
        
        cprecioV();
        NumClient++;
        jtxtPizzaMasC.setText(contarFrecuenciaProductos());
        Insertarentabla(UnClient);//andres blanco
        GrabarEnArchivo(UnClient);
        LimpiarEntradas();

        //Limpiar casillas

    }//GEN-LAST:event_jbtngrabarActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jSpinner2s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSpinner2s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner2s1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jButton1ActionPerformed


   void cprecioV() {
    double gananciaTotal = 0.0;  // Debes declarar e inicializar gananciaTotal antes de usarla


double costoTotal = UnClient.cP * PrecioDPI(jcbxproductoA.getSelectedItem().toString());


// Iterar sobre los elementos de la lista
for (int i = 0; i < modeloLista.getSize(); i++) {
    String tipoPizza = modeloLista.getElementAt(i);

    // Obtener el precio por pizza usando el método PrecioDPI
    double precioPorPizza = PrecioDPI(tipoPizza);

    // Calcular el costo total y acumular la ganancia total
    gananciaTotal += precioPorPizza;
}

// Sumar el costo total al acumulado en gananciaTotal
gananciaTotal += costoTotal;

jtxte.setText("Ganancia Total: $" + gananciaTotal);
   }
    
    public Double PrecioDPI(String tipoPizza){
    
     // Asignar precios según el tipo de pizza
        switch (tipoPizza) {
        case "Pizza Margarita":
            return 8.99;
        case "Hawaiana Tropical":
            return 11.99;
        case "Cuatro Quesos Delight":
            return 10.49;
        case "Vegetariana Primavera":
            return 9.99;
        case "Carnívora Salvaje":
            return 12.99;
        case "Mediterranean Bliss":
            return 11.49;
        case "Caprese Elegante":
            return 10.99;
        case "Pesto Pasionata":
            return 11.79;
        case "Mexicana Picante":
            return 12.49;
        
        default:
            return 0.0; // Precio por defecto si el tipo de pizza no se encuentra
    }
    
}
    
    
public String HistorialClin(){//dani
     Map<String, Integer> productosComprados = new HashMap<>();

          // Iterar sobre los clientes para contar la frecuencia de productos del cliente con el DNI proporcionado
        for (int i = 0; i < NumClient; i++) {
            ClienteA cliente = ArregloCliente[i];

            // Verificar si el cliente tiene el DNI proporcionado
            if (cliente.DNI.equals( jtxtDNIbuscar.getText())) {
                // Obtener el producto del cliente actual
                String productoCliente = cliente.Producto;

                // Contar productos comprados
                productosComprados.put(productoCliente, productosComprados.getOrDefault(productoCliente, 0) + 1);
            }
        }

        // Construir una cadena con la información del historial del cliente
        StringBuilder historial = new StringBuilder("--------------------------------------------\n");
        for (Map.Entry<String, Integer> entry : productosComprados.entrySet()) {
            historial.append(entry.getKey()).append(": ").append(entry.getValue()).append(" veces pedidos\n");
        }

        // Devolver el historial como una cadena
        return historial.toString();
    }
    
    /*
{pizza h, 3 }hasmap
{pizarojan,4}
{pizza bkancas , 8 }
{pizzanegroooo , -4}
pizza h,6}

        }
    */
public String contarFrecuenciaProductos() {//Lenin

//interar =  (repetir un proccesor ) ejeplo:recorer una array
      // Crear un contenedor/(Array de map(es como crear un objeto )) para almacenar la catidad total de cada tipo de producto
        Map<String, Integer>/*nombre del Map*/CantidadTotalPro = new HashMap<>();

            // Recorer la lita de clintes y agregar la cantidad de cada tipo de prodcto al contenedor
            for (int i = 0; i < NumClient; i++) {
                String producto = ArregloCliente[i].Producto;
                int cantidad = ArregloCliente[i].cP; // Obtener la cantidad del producto

             // Verificar si el produto ya ests en el contenedor
                    if (CantidadTotalPro.containsKey(producto)) {
         // Incrementar la frecuencia total
                        int CantidadActual = CantidadTotalPro.get(producto);
                            CantidadTotalPro.put(producto, CantidadActual + cantidad);}
                    else{
          // Agregar el prodcto al contenedor com su cantdad
                             CantidadTotalPro.put(producto, cantidad);}
}

// Encontrar el tipo de producto con la cantidad más alta
        int maxCantidad = 0;
        String productoMasComun = null;
        for (Map.Entry<String, Integer> entry : CantidadTotalPro.entrySet()) {
            
            String producto = entry.getKey();
            int cantidadTotal = entry.getValue();
            
            if (cantidadTotal > maxCantidad) {
                maxCantidad = cantidadTotal;
                productoMasComun = producto;
    }
}
return productoMasComun;
}


void GrabarEnArchivo2(Alquilar e)
{
    try{
        FileWriter fw=new FileWriter("Local.txt",true);
        PrintWriter pw=new PrintWriter(fw);
        pw.println(e.nombre +","+e.DNI+","+e.nTelefono+","+e.correo+","+e.contact+","+e.mPago+","+e.Fecha+","+e.Hora+","+e.THora);
        pw.close();
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error en la grabación....."+ex);
    }
}

void Insertarentabla2(Alquilar UnEvento){
 
    // Añadir elementos al hisotiral general de producto-------------------
    modeloLista2.addElement(UnEvento.Fecha+" -- "+UnEvento.Hora+" "+UnEvento.THora);
    jList2.setModel(modeloLista2);
 
   ///metodo faltante de lisCH(****)
    
   ///nombre,  DNI,  nTelefono,  correo,  contact,  mPago,Fecha,Hora);
    Object[]fila={NumEvent + 1, UnEvento.nombre,UnEvento.DNI,UnEvento.nTelefono,UnEvento.correo,UnEvento.contact,UnEvento.mPago,UnEvento.Fecha,UnEvento.Hora,UnEvento.THora};
    ModeloTabla2.addRow(fila);
  
} 

void Insertarentabla(ClienteA UnClient){//andres blanco
 
    // Añadir elementos al hisotiral general de producto-------------------
    modeloLista.addElement(UnClient.Producto);
    jList1.setModel(modeloLista);
   
 
    
   ///
    Object[]fila={NumClient + 1, UnClient.nombre,UnClient.DNI, UnClient.direccion, UnClient.nTelefono,
            UnClient.correo, UnClient.contact, UnClient.mPago,UnClient.Producto,UnClient.cP,UnClient.Adicional,UnClient.cA};
    ModeloTabla.addRow(fila);
   
} 

void ExtraerDeArchivo()//ana
{ String linea;
    try{
        FileReader fr=new FileReader("Clientes.txt");
        BufferedReader br=new BufferedReader(fr);
        while((linea=br.readLine())!=null){
        StringTokenizer st=new StringTokenizer(linea,",");
       
            String nombre=st.nextToken();
            String DNI=st.nextToken();
            String direccion=st.nextToken();
            String nTelefono=st.nextToken();
            String correo=st.nextToken();
            String contact=st.nextToken();
            String mPago=st.nextToken();
            String Producto=st.nextToken();
            int cP=Integer.parseInt(st.nextToken());
            String Adicional=st.nextToken();
            int cA=Integer.parseInt(st.nextToken());
            
            UnClient=new ClienteA(nombre,DNI,direccion,  nTelefono, correo,  contact, mPago ,Producto,cP,Adicional,cA);
            ArregloCliente[NumClient]=UnClient;
            NumClient++;
          

        }
        br.close();
    } catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error en la lectura"+ " del archivo....."+ex);
    }
    
}

void ExtraerArchivo2()
{String linea; 
     try{
        FileReader fr=new FileReader("Local.txt");
        BufferedReader br=new BufferedReader(fr);
        while((linea=br.readLine())!=null){
        StringTokenizer st=new StringTokenizer(linea,",");
        
            String nombre=st.nextToken();
            String DNI=st.nextToken();
            String nTelefono=st.nextToken();
            String correo=st.nextToken();
            String contact=st.nextToken();
            String mPago=st.nextToken();
            String Fecha=st.nextToken();
            String Hora=st.nextToken();
            String THora=st.nextToken();
           int cA=Integer.parseInt(st.nextToken());
                    
         UnEvento=new Alquilar( nombre,  DNI,  nTelefono,  correo,  contact,  mPago,Fecha,Hora,THora,cA);
         
         ArregloEvento[NumEvent]=UnEvento;
         NumEvent++;
        }
        br.close();
     }catch (Exception ex){
        JOptionPane.showMessageDialog(null, "Error en la lectura"+ " del archivo....."+ex);
     }
   

}
void GrabarEnArchivo(ClienteA e)
{
    try{
        FileWriter fw=new FileWriter("Clientes.txt",true);
        PrintWriter pw=new PrintWriter(fw);
        pw.println(e.nombre +","+e.DNI+","+ e.direccion +","+e.nTelefono+","+e.correo+","+e.contact+","+e.mPago+","+e.Producto);
        pw.close();
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error en la grabación....."+ex);
    }
    
    
    
    
}
 void LimpiarEntradas(){
    jtxtdirrecion.setText("");
    jtxtnombre.setText("");
    jcbxproductoA.setSelectedIndex(0);
    jtxtNtelefono.setText("");
    jtxtDNI.setText("");
    jcbcontact.setSelectedIndex(0);
    jtxtdirrecion.requestFocus();
    jtxtcorreo.setText("");
    jcbxMpago.setSelectedIndex(0); 
   //entrads 2 
  
    jtxtHora2.setSelectedIndex(0);
    jtxtHora3.setSelectedIndex(0);
    jtxtFecha.setText("");
    jtxtNtelefono1.setText("");
    jtxtDNI2.setText("");
    jcbcontact1.setSelectedIndex(0);
   
   
}

   public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Local().setVisible(true);
            }
        });
    }

   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDelivery;
    private javax.swing.JPanel PanelDelivery1;
    private javax.swing.JPanel PanelLocal;
    private javax.swing.JPanel PanelOto;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JTextArea jListCH1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jSpinner1s;
    private javax.swing.JTextField jSpinner2s;
    private javax.swing.JTextField jSpinner2s1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtngrabar;
    private javax.swing.JButton jbtngrabar2;
    private javax.swing.JButton jbtnsalir;
    private javax.swing.JComboBox<String> jcbcontact;
    private javax.swing.JComboBox<String> jcbcontact1;
    private javax.swing.JComboBox<String> jcbxMpago;
    private javax.swing.JComboBox<String> jcbxMpago1;
    private javax.swing.JComboBox<String> jcbxproductoA;
    private javax.swing.JComboBox<String> jcbxproductoB;
    private javax.swing.JTable jtblDatos;
    private javax.swing.JTable jtblDatosA;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtDNI2;
    private javax.swing.JTextField jtxtDNIbuscar;
    private javax.swing.JTextField jtxtFecha;
    private javax.swing.JComboBox<String> jtxtHora2;
    private javax.swing.JComboBox<String> jtxtHora3;
    private javax.swing.JTextField jtxtNtelefono;
    private javax.swing.JTextField jtxtNtelefono1;
    private javax.swing.JTextField jtxtPizzaMasC;
    private javax.swing.JTextField jtxtcorreo;
    private javax.swing.JTextField jtxtcorreo1;
    private javax.swing.JTextField jtxtdirrecion;
    private javax.swing.JTextField jtxte;
    private javax.swing.JTextField jtxtnombre;
    private javax.swing.JTextField jtxtnombre112;
    // End of variables declaration//GEN-END:variables

  
}

