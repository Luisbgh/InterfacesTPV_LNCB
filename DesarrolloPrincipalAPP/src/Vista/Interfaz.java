package Vista;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.awt.Graphics;

import javax.swing.JTextField;

import Controlador.Funcionalidad;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import Controlador.Funcionalidad;
import java.awt.Label;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;

public class Interfaz extends JFrame {

	
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JPasswordField textContraseña;
	public JTextField textUsuario;
	public JButton btnRegistrarse;
	public JButton btnIniciar;
	public JLabel mensajeInformativo;
	public JPanel inicioSesion;
	public JPanel Principal;
	public JLabel lbmostrarHora;
	public JLabel lbmostrarFecha;
	public JLabel lbtitulo;
	public JLabel lbmostrarLogo;
	public JLabel lbusuario;
	public JLabel lbContrasea;
	public JLabel lbtituloPrincipal;
	public JLabel lbmostrarLogoP;
	public JLabel lbmostrarHoraPrincipal;
	public JLabel labelFotoRegistro;
	public JLabel lbfotoSesion;
	public JLabel lbcerrarSesion;
	public JLabel lbnombreEmpleado;
	public JSeparator separator;
	public JLabel lbPaginaInformativa;
	public JLabel lbfondoDocumentacion;
	public JPanel Documentacion_1;
	public JLabel lbtituloDOC;
	public JSeparator separator_1;
	public JLabel lbmostrarFechaDOC;
	public JLabel lbmostrarHoraDOC;
	public JComboBox comboBoxOpciones;
	public JLabel lbmostrarLogo_D;
	public JLabel lbcerrarSesionDOC;
	public JLabel lbfondoBack;
	public JPanel Configuracion;
	public JSeparator separator_2;
	public JLabel lbtituloConfiguracion;
	public JLabel lbmostrarHoraConfiguracion;
	public JLabel lbcerrarSesionConfiguracion;
	public JLabel lbFotoFormulario;
	public JLabel lbtextoEditContraseña;
	public JLabel lbtextoEditJornadaInicio;
	public JLabel lbtextoEditJornadaFin;
	public JTextField textPassConf;
	public JTextField textJIConf;
	public JTextField textJFConf;
	public JLabel lbtextoEditSueldo;
	public JTextField textSueldoConf;
	public JButton btnEliminarUser;
	public JButton btnGuardarInfo;
	public JTextArea textAreaInformacionGeneral;
	public JTextArea textAreainformacionOP1;
	public JLabel lbfotoLibro;
	public JTextArea textAreaPrivacidad;
	public JScrollPane scrollPane;
	public JLabel mensajeInformativoConfiguracion;
	public JButton btnProductos;
	public JButton btnContabilidad;
	public JSeparator separator_3;
	public JSeparator separator_4;
	public JLabel lbfotoInventario;
	public JLabel lbfotoContabilidad;
	public JLabel mesa1;
	public JLabel mesa2;
	public JLabel mesa3;
	public JLabel mesa4;
	public JLabel mesa5;
	public JLabel mesa6;
	public JLabel lbfotoLlevar;
	public JPanel Productos;
	public JLabel lbfondoInventario;
	public JSeparator separator_5;
	public JLabel lbtituloPInventario;
	public JLabel lbmostrarHoraInventario;
	public JLabel lbcerrarSesionInventario;
	public JLabel lbVerContraseña;
	public JLabel lbNumeroMesa;
	public JLabel lbNumeroMesa_2;
	public JLabel lbNumeroMesa_3;
	public JLabel lbNumeroMesa_4;
	public JLabel lbNumeroMesa_5;
	public JLabel lbNumeroMesa_6;
	public JLabel lbCartel;
	public JLabel lbHorario;
	public JLabel lbCajaRegistradora;
	public JLabel lbDinero;
	public JSeparator separator_6;
	public JLabel lbParaLlevar;
	public JSeparator separator_7;
	public JLabel lbtextoDatosPersonales;
	public JLabel lbtextoUsuario;
	public JLabel lbtextoContraseña;
	public JLabel lbtextoSueldo;
	public JLabel lbtextoJornadaI;
	public JLabel lbJornadaF;
	public JTextField textFieldDatoUser;
	public JTextField textFieldDatoPass;
	public JTextField textFieldDatoSueldo;
	public JTextField textFieldDatoInicio;
	public JTextField textFieldDatoFin;
	public JLabel lbtextoEdicion;
	public JList listProductos;
	public JLabel lbtextoComida;
	public JSeparator separator_8;
	public JLabel lbtextoID;
	public JLabel lbtextoNombre;
	public JLabel lbFieldID;
	public JLabel lbFieldNombre;
	public JSeparator separator_9;
	public JButton btnVisualizarDatosProducto;
	public JLabel lbtextoProveedor;
	public JLabel lbFieldProveedor;
	public JLabel lbtextoImagen;
	public JLabel lbtextoPrecio;
	public JLabel lbtextoStock;
	public JLabel lbFieldPrecio;
	public JLabel lbImagenInventario;
	public JPanel Comanda;
	public JLabel lbfondoComanda;
	public JSeparator separator_10;
	public JLabel lbtituloPComanda;
	public JLabel lbmostrarHoraComanda;
	public JLabel lbcerrarSesionComanda;
	public JLabel lbtextoMesaComanda;
	public JSeparator separator_11;
	public JLabel lblNumComanda;
	public JTextField textFieldNumMesa;
	public JTextField textFieldNumComanda;
	public JLabel lblPedido;
	public JList listPedido;
	public JSeparator separator_12;
	public JButton btnProducto1;
	public JButton btnProducto2;
	public JButton btnProducto3;
	public JButton btnProducto4;
	public JButton btnProducto6;
	public JButton btnProducto5;
	public JButton btnProducto7;
	public JButton btnProducto8;
	public JButton btnProducto9;
	public JSeparator separator_13;
	public JSeparator separator_14;
	public JLabel lblTotal;
	public JLabel lbFechaComanda;
	public JLabel lbHoraComanda;
	public JTextField textFieldTotal;
	public JTextField textFieldHora;
	public JTextField textFieldFecha;
	public JSeparator separator_15;
	public JPanel ComandaParaLlevar;
	public JLabel lbfondoComandaLlevar;
	public JLabel lbtituloComandaLlevar;
	public JLabel lbmostrarHoraComandaLlevar;
	public JLabel lbcerrarSesionComandaLlevar;
	public JSeparator separator_16;
	public JLabel lbdatosCliente;
	public JSeparator separator_17;
	public JSeparator separator_18;
	public JLabel lbReferencias;
	public JLabel lbclienteNombre;
	public JLabel lbclienteTelefono;
	public JLabel lbclienteDireccion;
	public JTextField textFieldclienteNombre;
	public JTextField textFieldclienteTelefono;
	public JTextField textFieldclienteDireccion;
	public JLabel lbcomandaLlevarId;
	public JLabel lbcomandaLlevarFecha;
	public JLabel lbcomandaLlevarHora;
	public JTextField textFieldIdPedido;
	public JTextField textFieldFechaPedidoLlevar;
	public JTextField textFieldHoraPedidoLlevar;
	public JSeparator separator_19;
	public JLabel lbProductoLlevar1;
	public JLabel lbProductoLlevar2;
	public JLabel lbProductoLlevar3;
	public JLabel lbProductoLlevar4;
	public JLabel lbProductoLlevar5;
	public JLabel lbProductoLlevar6;
	public JLabel lbProductoLlevar7;
	public JLabel lbProductoLlevar8;
	public JLabel lbProductoLlevar9;
	public JSpinner spinnerP1;
	public JSpinner spinnerP2;
	public JSpinner spinnerP3;
	public JSpinner spinnerP4;
	public JSpinner spinnerP5;
	public JSpinner spinnerP6;
	public JSpinner spinnerP7;
	public JSpinner spinnerP8;
	public JSpinner spinnerP9;
	public JSeparator separator_20;
	public JLabel lblPedidoProductos;
	public JList listProductosLlevar;
	public JSeparator separator_21;
	public JLabel lblPedidoLevarTotal;
	public JTextField textFieldTotalLlevar;
	public JButton btnreducirProductosLlevar;
	public JLabel lbtextoTipo;
	public JLabel lbFieldTipo;
	public JProgressBar progressBarStock;
	public JButton btnverComida;
	public JButton btnverBebida;
	public JLabel lbFieldNumStock;
	public JLabel lbmensajeStock;
	public JLabel lbmensajePedido;
	public JButton btnrestarComida;
	public JLabel lbPagar;
	public JPanel Pagos;
	public JLabel lbfondoPagos;
	public JSeparator separator_22;
	public JLabel lbtituloPago;
	public JLabel lbmostrarHoraPago;
	public JLabel lbcerrarSesionPago;
	public JLabel lbmensajeDeber;
	public JTextField textFieldDineroDeber;
	public JLabel lbmensajeAbonarCliente;
	public JTextField textFieldAbonoCliente;
	public JLabel lbmensajeCambioCliente;
	public JTextField textFieldcambioTotal;
	public JButton btnDarCambio;
	public JLabel lbmensajeDenegar;
	public JButton btnguardarPago;
	public JLabel lbPagarParaLlevar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					Funcionalidad vista=new Funcionalidad(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}//catch
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setForeground(new Color(64, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 541);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(64, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ComandaParaLlevar = new JPanel();
		ComandaParaLlevar.setBounds(0, 0, 548, 502);
		contentPane.add(ComandaParaLlevar);
		ComandaParaLlevar.setVisible(false);
		ComandaParaLlevar.setLayout(null);
		
		separator_21 = new JSeparator();
		separator_21.setForeground(Color.WHITE);
		separator_21.setBackground(Color.WHITE);
		separator_21.setBounds(277, 340, 236, 14);
		ComandaParaLlevar.add(separator_21);
		
		lbcomandaLlevarHora = new JLabel("HORA");
		lbcomandaLlevarHora.setForeground(Color.WHITE);
		lbcomandaLlevarHora.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbcomandaLlevarHora.setBounds(292, 182, 79, 14);
		ComandaParaLlevar.add(lbcomandaLlevarHora);
		
		btnreducirProductosLlevar = new JButton("- ");
		btnreducirProductosLlevar.setBackground(new Color(255, 0, 51));
		btnreducirProductosLlevar.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnreducirProductosLlevar.setBounds(127, 455, 55, 30);
		ComandaParaLlevar.add(btnreducirProductosLlevar);
		
		textFieldTotalLlevar = new JTextField();
		textFieldTotalLlevar.setBounds(381, 308, 86, 20);
		ComandaParaLlevar.add(textFieldTotalLlevar);
		textFieldTotalLlevar.setColumns(10);
		
		lblPedidoLevarTotal = new JLabel("TOTAL");
		lblPedidoLevarTotal.setForeground(Color.WHITE);
		lblPedidoLevarTotal.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblPedidoLevarTotal.setBounds(316, 310, 55, 14);
		ComandaParaLlevar.add(lblPedidoLevarTotal);
		
		listProductosLlevar = new JList();
		listProductosLlevar.setBounds(47, 321, 209, 123);
		ComandaParaLlevar.add(listProductosLlevar);
		
		lblPedidoProductos = new JLabel("PEDIDO");
		lblPedidoProductos.setForeground(Color.WHITE);
		lblPedidoProductos.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblPedidoProductos.setBounds(116, 301, 66, 14);
		ComandaParaLlevar.add(lblPedidoProductos);
		
		separator_20 = new JSeparator();
		separator_20.setOrientation(SwingConstants.VERTICAL);
		separator_20.setForeground(Color.WHITE);
		separator_20.setBackground(Color.WHITE);
		separator_20.setBounds(278, 291, 19, 158);
		ComandaParaLlevar.add(separator_20);
		
		spinnerP9 = new JSpinner();
		spinnerP9.setBounds(483, 260, 30, 20);
		ComandaParaLlevar.add(spinnerP9);
		
		spinnerP6 = new JSpinner();
		spinnerP6.setBounds(313, 260, 30, 20);
		ComandaParaLlevar.add(spinnerP6);
		
		spinnerP3 = new JSpinner();
		spinnerP3.setBounds(145, 260, 30, 20);
		ComandaParaLlevar.add(spinnerP3);
		
		spinnerP7 = new JSpinner();
		spinnerP7.setBounds(368, 260, 30, 20);
		ComandaParaLlevar.add(spinnerP7);
		
		spinnerP5 = new JSpinner();
		spinnerP5.setBounds(258, 260, 30, 20);
		ComandaParaLlevar.add(spinnerP5);
		
		spinnerP4 = new JSpinner();
		spinnerP4.setBounds(201, 260, 30, 20);
		ComandaParaLlevar.add(spinnerP4);
		
		spinnerP2 = new JSpinner();
		spinnerP2.setBounds(90, 260, 30, 20);
		ComandaParaLlevar.add(spinnerP2);
		
		spinnerP8 = new JSpinner();
		spinnerP8.setBounds(422, 260, 30, 20);
		ComandaParaLlevar.add(spinnerP8);
		
		spinnerP1 = new JSpinner();
		spinnerP1.setBounds(35, 260, 30, 20);
		ComandaParaLlevar.add(spinnerP1);
		
		separator_19 = new JSeparator();
		separator_19.setForeground(Color.WHITE);
		separator_19.setBackground(Color.WHITE);
		separator_19.setBounds(25, 291, 488, 14);
		ComandaParaLlevar.add(separator_19);
		
		textFieldHoraPedidoLlevar = new JTextField();
		textFieldHoraPedidoLlevar.setEditable(false);
		textFieldHoraPedidoLlevar.setColumns(10);
		textFieldHoraPedidoLlevar.setBounds(381, 179, 119, 20);
		ComandaParaLlevar.add(textFieldHoraPedidoLlevar);
		
		textFieldFechaPedidoLlevar = new JTextField();
		textFieldFechaPedidoLlevar.setEditable(false);
		textFieldFechaPedidoLlevar.setColumns(10);
		textFieldFechaPedidoLlevar.setBounds(381, 152, 119, 20);
		ComandaParaLlevar.add(textFieldFechaPedidoLlevar);
		
		textFieldIdPedido = new JTextField();
		textFieldIdPedido.setEditable(false);
		textFieldIdPedido.setColumns(10);
		textFieldIdPedido.setBounds(381, 126, 119, 20);
		ComandaParaLlevar.add(textFieldIdPedido);
		
		lbProductoLlevar9 = new JLabel("");
		lbProductoLlevar9.setBounds(467, 214, 55, 46);
		ComandaParaLlevar.add(lbProductoLlevar9);
		
		lbProductoLlevar8 = new JLabel("");
		lbProductoLlevar8.setBounds(358, 214, 55, 46);
		ComandaParaLlevar.add(lbProductoLlevar8);
		
		lbProductoLlevar7 = new JLabel("");
		lbProductoLlevar7.setBounds(412, 214, 55, 46);
		ComandaParaLlevar.add(lbProductoLlevar7);
		
		lbProductoLlevar6 = new JLabel("");
		lbProductoLlevar6.setBounds(303, 214, 55, 46);
		ComandaParaLlevar.add(lbProductoLlevar6);
		
		lbProductoLlevar4 = new JLabel("");
		lbProductoLlevar4.setBounds(191, 214, 55, 46);
		ComandaParaLlevar.add(lbProductoLlevar4);
		
		lbProductoLlevar3 = new JLabel("");
		lbProductoLlevar3.setBounds(135, 214, 55, 46);
		ComandaParaLlevar.add(lbProductoLlevar3);
		
		lbProductoLlevar2 = new JLabel("");
		lbProductoLlevar2.setBounds(80, 214, 55, 46);
		ComandaParaLlevar.add(lbProductoLlevar2);
		
		lbProductoLlevar5 = new JLabel("");
		lbProductoLlevar5.setBounds(248, 214, 55, 46);
		ComandaParaLlevar.add(lbProductoLlevar5);
		
		lbProductoLlevar1 = new JLabel("");
		lbProductoLlevar1.setBounds(25, 214, 55, 46);
		ComandaParaLlevar.add(lbProductoLlevar1);
		
		lbcomandaLlevarFecha = new JLabel("FECHA");
		lbcomandaLlevarFecha.setForeground(Color.WHITE);
		lbcomandaLlevarFecha.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbcomandaLlevarFecha.setBounds(292, 155, 79, 14);
		ComandaParaLlevar.add(lbcomandaLlevarFecha);
		
		lbcomandaLlevarId = new JLabel("ID PEDIDO");
		lbcomandaLlevarId.setForeground(Color.WHITE);
		lbcomandaLlevarId.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbcomandaLlevarId.setBounds(292, 126, 79, 14);
		ComandaParaLlevar.add(lbcomandaLlevarId);
		
		lbclienteDireccion = new JLabel("DIRECCION");
		lbclienteDireccion.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbclienteDireccion.setForeground(new Color(255, 255, 255));
		lbclienteDireccion.setBounds(39, 179, 79, 14);
		ComandaParaLlevar.add(lbclienteDireccion);
		
		lbclienteTelefono = new JLabel("TELEFONO");
		lbclienteTelefono.setForeground(new Color(255, 255, 255));
		lbclienteTelefono.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbclienteTelefono.setBounds(39, 152, 79, 14);
		ComandaParaLlevar.add(lbclienteTelefono);
		
		lbclienteNombre = new JLabel("NOMBRE");
		lbclienteNombre.setForeground(new Color(255, 255, 255));
		lbclienteNombre.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbclienteNombre.setBounds(39, 126, 66, 14);
		ComandaParaLlevar.add(lbclienteNombre);
		
		textFieldclienteDireccion = new JTextField();
		textFieldclienteDireccion.setEditable(false);
		textFieldclienteDireccion.setColumns(10);
		textFieldclienteDireccion.setBounds(137, 179, 119, 20);
		ComandaParaLlevar.add(textFieldclienteDireccion);
		
		textFieldclienteTelefono = new JTextField();
		textFieldclienteTelefono.setEditable(false);
		textFieldclienteTelefono.setColumns(10);
		textFieldclienteTelefono.setBounds(137, 152, 119, 20);
		ComandaParaLlevar.add(textFieldclienteTelefono);
		
		textFieldclienteNombre = new JTextField();
		textFieldclienteNombre.setEditable(false);
		textFieldclienteNombre.setBounds(137, 126, 119, 20);
		ComandaParaLlevar.add(textFieldclienteNombre);
		textFieldclienteNombre.setColumns(10);
		
		lbReferencias = new JLabel("REFERENCIAS");
		lbReferencias.setForeground(Color.WHITE);
		lbReferencias.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbReferencias.setBounds(360, 101, 119, 14);
		ComandaParaLlevar.add(lbReferencias);
		
		separator_18 = new JSeparator();
		separator_18.setOrientation(SwingConstants.VERTICAL);
		separator_18.setForeground(Color.WHITE);
		separator_18.setBackground(Color.WHITE);
		separator_18.setBounds(278, 90, 19, 116);
		ComandaParaLlevar.add(separator_18);
		
		separator_17 = new JSeparator();
		separator_17.setForeground(Color.WHITE);
		separator_17.setBackground(Color.WHITE);
		separator_17.setBounds(30, 204, 488, 14);
		ComandaParaLlevar.add(separator_17);
		
		lbdatosCliente = new JLabel("DATOS CLIENTE");
		lbdatosCliente.setForeground(new Color(255, 255, 255));
		lbdatosCliente.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbdatosCliente.setBounds(81, 101, 119, 14);
		ComandaParaLlevar.add(lbdatosCliente);
		
		separator_16 = new JSeparator();
		separator_16.setForeground(Color.WHITE);
		separator_16.setBackground(Color.WHITE);
		separator_16.setBounds(30, 90, 488, 14);
		ComandaParaLlevar.add(separator_16);
		
		lbcerrarSesionComandaLlevar = new JLabel("");
		lbcerrarSesionComandaLlevar.setForeground(Color.WHITE);
		lbcerrarSesionComandaLlevar.setBounds(435, 44, 31, 30);
		ComandaParaLlevar.add(lbcerrarSesionComandaLlevar);
		//
		fotoEscalarLabel(lbcerrarSesionComandaLlevar, "assets/finSesion.png");
		
		lbtituloComandaLlevar = new JLabel("Coffekie");
		lbtituloComandaLlevar.setForeground(Color.WHITE);
		lbtituloComandaLlevar.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lbtituloComandaLlevar.setBackground(Color.WHITE);
		lbtituloComandaLlevar.setBounds(222, 37, 119, 42);
		ComandaParaLlevar.add(lbtituloComandaLlevar);
		
		lbmostrarHoraComandaLlevar = new JLabel("16 : 42");
		lbmostrarHoraComandaLlevar.setForeground(Color.WHITE);
		lbmostrarHoraComandaLlevar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		lbmostrarHoraComandaLlevar.setBounds(67, 44, 79, 23);
		ComandaParaLlevar.add(lbmostrarHoraComandaLlevar);
		
		lbfondoComandaLlevar = new JLabel("");
		lbfondoComandaLlevar.setBounds(0, 0, 548, 502);
		ComandaParaLlevar.add(lbfondoComandaLlevar);
		//
		fotoEscalarLabel(lbfondoComandaLlevar, "assets/fondo2.jpg");
		
		lbPagarParaLlevar = new JLabel("");
		lbPagarParaLlevar.setBounds(363, 379, 89, 42);
		//
		fotoEscalarLabel(lbPagarParaLlevar, "assets/pagar.png");
		ComandaParaLlevar.add(lbPagarParaLlevar);
		
		Productos = new JPanel();
		Productos.setBounds(0, 0, 548, 502);
		contentPane.add(Productos);
		Productos.setVisible(false);
		Productos.setLayout(null);
		
		lbFieldNumStock = new JLabel();
		lbFieldNumStock.setForeground(new Color(30, 144, 255));
		lbFieldNumStock.setBackground(new Color(255, 255, 255));
		lbFieldNumStock.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldNumStock.setHorizontalAlignment(SwingConstants.CENTER);
		lbFieldNumStock.setBounds(104, 267, 60, 20);
		Productos.add(lbFieldNumStock);
		
		lbmensajeStock = new JLabel("");
		lbmensajeStock.setHorizontalAlignment(SwingConstants.CENTER);
		lbmensajeStock.setForeground(new Color(255, 255, 255));
		lbmensajeStock.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		lbmensajeStock.setBounds(40, 416, 202, 20);
		Productos.add(lbmensajeStock);
		lbmensajeStock.setVisible(false);
		
		btnverBebida = new JButton("");
		btnverBebida.setBounds(463, 106, 48, 42);
		Productos.add(btnverBebida);
		//
		
		btnverComida = new JButton("");
		btnverComida.setBounds(387, 107, 48, 42);
		Productos.add(btnverComida);
		//
		
		progressBarStock = new JProgressBar();
		progressBarStock.setBounds(30, 298, 134, 14);
		Productos.add(progressBarStock);
		
		lbFieldTipo = new JLabel();
		lbFieldTipo.setForeground(new Color(30, 144, 255));
		lbFieldTipo.setBackground(new Color(255, 255, 255));
		lbFieldTipo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lbFieldTipo.setBounds(30, 363, 72, 20);
		Productos.add(lbFieldTipo);
		
		lbtextoTipo = new JLabel("TIPO:");
		lbtextoTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoTipo.setForeground(Color.WHITE);
		lbtextoTipo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoTipo.setBounds(30, 329, 88, 23);
		Productos.add(lbtextoTipo);
		
		lbImagenInventario = new JLabel("");
		lbImagenInventario.setBounds(217, 233, 103, 109);
		Productos.add(lbImagenInventario);
		//
		fotoEscalarLabel(lbImagenInventario, "assets/productoDefecto.png");
		
		lbtextoStock = new JLabel("STOCK:");
		lbtextoStock.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoStock.setForeground(Color.WHITE);
		lbtextoStock.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoStock.setBounds(30, 264, 88, 23);
		Productos.add(lbtextoStock);
		
		lbFieldPrecio = new JLabel();
		lbFieldPrecio.setForeground(new Color(30, 144, 255));
		lbFieldPrecio.setBackground(new Color(255, 255, 255));
		lbFieldPrecio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lbFieldPrecio.setBounds(30, 233, 72, 20);
		Productos.add(lbFieldPrecio);
		
		lbtextoPrecio = new JLabel("PRECIO:");
		lbtextoPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoPrecio.setForeground(Color.WHITE);
		lbtextoPrecio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoPrecio.setBounds(30, 196, 88, 23);
		Productos.add(lbtextoPrecio);
		
		lbtextoImagen = new JLabel("IMAGEN:");
		lbtextoImagen.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoImagen.setForeground(Color.WHITE);
		lbtextoImagen.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoImagen.setBounds(232, 196, 88, 23);
		Productos.add(lbtextoImagen);
		
		lbFieldProveedor = new JLabel();
		lbFieldProveedor.setForeground(new Color(30, 144, 255));
		lbFieldProveedor.setBackground(new Color(255, 255, 255));
		lbFieldProveedor.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldProveedor.setHorizontalAlignment(SwingConstants.CENTER);
		lbFieldProveedor.setBounds(156, 165, 190, 20);
		Productos.add(lbFieldProveedor);
		
		lbtextoProveedor = new JLabel("PROVEEDOR:");
		lbtextoProveedor.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoProveedor.setForeground(Color.WHITE);
		lbtextoProveedor.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoProveedor.setBounds(30, 162, 134, 23);
		Productos.add(lbtextoProveedor);
		
		btnVisualizarDatosProducto = new JButton("");
		btnVisualizarDatosProducto.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		btnVisualizarDatosProducto.setBackground(new Color(153, 204, 255));
		btnVisualizarDatosProducto.setBounds(265, 401, 55, 49);
		btnVisualizarDatosProducto.setEnabled(false);
		Productos.add(btnVisualizarDatosProducto);
		
		separator_9 = new JSeparator();
		separator_9.setForeground(Color.WHITE);
		separator_9.setBackground(Color.WHITE);
		separator_9.setBounds(30, 386, 339, 25);
		Productos.add(separator_9);
		
		listProductos = new JList();
		listProductos.setBounds(391, 191, 120, 192);
		Productos.add(listProductos);
		
		lbtextoComida = new JLabel("PRODUCTOS");
		lbtextoComida.setForeground(new Color(255, 255, 255));
		lbtextoComida.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoComida.setHorizontalAlignment(SwingConstants.CENTER);
		lbtextoComida.setBounds(391, 159, 120, 23);
		Productos.add(lbtextoComida);
		
		separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setForeground(Color.WHITE);
		separator_8.setBackground(Color.WHITE);
		separator_8.setBounds(367, 90, 22, 401);
		Productos.add(separator_8);
		
		lbtextoID = new JLabel("ID:");
		lbtextoID.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoID.setForeground(Color.WHITE);
		lbtextoID.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoID.setBounds(30, 112, 31, 23);
		Productos.add(lbtextoID);
		
		lbtextoNombre = new JLabel("NOMBRE:");
		lbtextoNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoNombre.setForeground(Color.WHITE);
		lbtextoNombre.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoNombre.setBounds(138, 112, 94, 23);
		Productos.add(lbtextoNombre);
		
		lbFieldID = new JLabel();
		lbFieldID.setForeground(new Color(30, 144, 255));
		lbFieldID.setBackground(new Color(255, 255, 255));
		lbFieldID.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldID.setHorizontalAlignment(SwingConstants.CENTER);
		lbFieldID.setBounds(62, 115, 66, 20);
		Productos.add(lbFieldID);
		
		lbFieldNombre = new JLabel();
		lbFieldNombre.setForeground(new Color(30, 144, 255));
		lbFieldNombre.setBackground(new Color(255, 255, 255));
		lbFieldNombre.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lbFieldNombre.setBounds(232, 115, 114, 20);
		Productos.add(lbFieldNombre);
		
		lbcerrarSesionInventario = new JLabel("");
		lbcerrarSesionInventario.setForeground(Color.WHITE);
		lbcerrarSesionInventario.setBounds(437, 36, 31, 30);
		Productos.add(lbcerrarSesionInventario);
		//SETEO TEXTO A FOTO REGISTRO
				fotoEscalarLabel(lbcerrarSesionInventario, "assets/finSesion.png");
				
				lbmostrarHoraInventario = new JLabel("16 : 42");
				lbmostrarHoraInventario.setForeground(Color.WHITE);
				lbmostrarHoraInventario.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
				lbmostrarHoraInventario.setBounds(81, 44, 83, 23);
				Productos.add(lbmostrarHoraInventario);
				
				lbtituloPInventario = new JLabel("Coffekie");
				lbtituloPInventario.setForeground(Color.WHITE);
				lbtituloPInventario.setFont(new Font("Segoe Script", Font.BOLD, 24));
				lbtituloPInventario.setBackground(Color.WHITE);
				lbtituloPInventario.setBounds(239, 37, 114, 42);
				Productos.add(lbtituloPInventario);
				
				separator_5 = new JSeparator();
				separator_5.setBounds(30, 90, 488, 25);
				Productos.add(separator_5);
				separator_5.setForeground(Color.WHITE);
				separator_5.setBackground(Color.WHITE);
				
				lbfondoInventario = new JLabel("");
				lbfondoInventario.setBounds(0, 0, 548, 502);
				//
				fotoEscalarLabel(lbfondoInventario, "assets/fondo2.jpg");
				Productos.add(lbfondoInventario);
		//
		
		Principal = new JPanel();
		Principal.setBounds(0, 0, 548, 502);
		contentPane.add(Principal);
		Principal.setLayout(null);
		Principal.setVisible(false);
		
		lbParaLlevar = new JLabel("Para llevar");
		lbParaLlevar.setForeground(new Color(255, 255, 255));
		lbParaLlevar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 25));
		lbParaLlevar.setBounds(170, 447, 139, 27);
		Principal.add(lbParaLlevar);
		
		separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBackground(Color.WHITE);
		separator_6.setBounds(30, 429, 488, 25);
		Principal.add(separator_6);
		
		lbCajaRegistradora = new JLabel("");
		lbCajaRegistradora.setBounds(40, 161, 63, 47);
		Principal.add(lbCajaRegistradora);
		//
		fotoEscalarLabel(lbCajaRegistradora, "assets/cajaRegistradora.png");
		
		lbDinero = new JLabel("");
		lbDinero.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lbDinero.setBounds(126, 171, 88, 38);
		Principal.add(lbDinero);
		
		lbHorario = new JLabel("");
		lbHorario.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 24));
		lbHorario.setBounds(113, 110, 101, 38);
		Principal.add(lbHorario);
		
		lbCartel = new JLabel("");
		lbCartel.setBounds(40, 101, 63, 47);
		//
		fotoEscalarLabel(lbCartel, "assets/cartelCafeteria4.png");
		Principal.add(lbCartel);
		
		lbNumeroMesa_6 = new JLabel("6");
		lbNumeroMesa_6.setForeground(Color.WHITE);
		lbNumeroMesa_6.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 22));
		lbNumeroMesa_6.setBounds(397, 370, 20, 30);
		Principal.add(lbNumeroMesa_6);
		
		lbNumeroMesa_5 = new JLabel("5");
		lbNumeroMesa_5.setForeground(Color.WHITE);
		lbNumeroMesa_5.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 22));
		lbNumeroMesa_5.setBounds(224, 370, 20, 30);
		Principal.add(lbNumeroMesa_5);
		
		lbNumeroMesa_4 = new JLabel("4");
		lbNumeroMesa_4.setForeground(Color.WHITE);
		lbNumeroMesa_4.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 22));
		lbNumeroMesa_4.setBounds(40, 370, 20, 30);
		Principal.add(lbNumeroMesa_4);
		
		lbNumeroMesa_3 = new JLabel("3");
		lbNumeroMesa_3.setForeground(Color.WHITE);
		lbNumeroMesa_3.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 22));
		lbNumeroMesa_3.setBounds(397, 264, 20, 30);
		Principal.add(lbNumeroMesa_3);
		
		lbNumeroMesa_2 = new JLabel("2");
		lbNumeroMesa_2.setForeground(Color.WHITE);
		lbNumeroMesa_2.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 22));
		lbNumeroMesa_2.setBounds(224, 264, 20, 30);
		Principal.add(lbNumeroMesa_2);
		
		lbNumeroMesa = new JLabel("1");
		lbNumeroMesa.setForeground(new Color(255, 255, 255));
		lbNumeroMesa.setBounds(40, 264, 20, 30);
		Principal.add(lbNumeroMesa);
		lbNumeroMesa.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 22));
		
		lbfotoLlevar = new JLabel("");
		lbfotoLlevar.setBounds(320, 438, 46, 42);
		Principal.add(lbfotoLlevar);
		//
		fotoEscalarLabel(lbfotoLlevar, "assets/paraLlevar.png");
		
		mesa6 = new JLabel("");
		mesa6.setBounds(417, 342, 79, 71);
		Principal.add(mesa6);
		fotoEscalarLabel(mesa6, "assets/mesas.png");
		
		mesa5 = new JLabel("");
		mesa5.setBounds(243, 345, 79, 68);
		Principal.add(mesa5);
		fotoEscalarLabel(mesa5, "assets/mesas.png");
		
		mesa4 = new JLabel("");
		mesa4.setBounds(62, 345, 79, 71);
		Principal.add(mesa4);
		fotoEscalarLabel(mesa4, "assets/mesas.png");
		
		mesa3 = new JLabel("");
		mesa3.setBounds(417, 240, 79, 71);
		Principal.add(mesa3);
		fotoEscalarLabel(mesa3, "assets/mesas.png");
		
		mesa2 = new JLabel("");
		mesa2.setBounds(243, 240, 79, 71);
		Principal.add(mesa2);
		fotoEscalarLabel(mesa2, "assets/mesas.png");
		
		mesa1 = new JLabel("");
		mesa1.setBounds(62, 240, 79, 71);
		Principal.add(mesa1);
		//SETEAR FOTO DE TODAS LAS MESAS 1-6
		fotoEscalarLabel(mesa1, "assets/mesas.png");
		
		lbfotoContabilidad = new JLabel("");
		lbfotoContabilidad.setBounds(477, 161, 46, 40);
		Principal.add(lbfotoContabilidad);
		//
		fotoEscalarLabel(lbfotoContabilidad, "assets/contabilidad.png");
		
		lbfotoInventario = new JLabel("");
		lbfotoInventario.setBounds(472, 110, 46, 38);
		//
		//SETEO TEXTO A FOTO REGISTRO
		fotoEscalarLabel(lbfotoInventario, "assets/stock.png");
		//
		Principal.add(lbfotoInventario);
		
		separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.WHITE);
		separator_4.setBackground(Color.WHITE);
		separator_4.setBounds(335, 91, 31, 126);
		Principal.add(separator_4);
		
		separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBackground(Color.WHITE);
		separator_3.setBounds(30, 214, 488, 25);
		Principal.add(separator_3);
		
		btnContabilidad = new JButton("Contabilidad");
		btnContabilidad.setBackground(new Color(255, 255, 255));
		btnContabilidad.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		btnContabilidad.setBounds(348, 161, 114, 42);
		Principal.add(btnContabilidad);
		
		btnProductos = new JButton("Productos");
		btnProductos.setBackground(new Color(255, 255, 255));
		btnProductos.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		btnProductos.setBounds(348, 110, 114, 42);
		Principal.add(btnProductos);
		
		separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(30, 90, 488, 25);
		Principal.add(separator);
		
		lbfotoSesion = new JLabel("");
		lbfotoSesion.setBounds(410, 26, 53, 42);
		Principal.add(lbfotoSesion);
		
		lbnombreEmpleado = new JLabel("");
		lbnombreEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		lbnombreEmpleado.setBounds(393, 73, 88, 18);
		Principal.add(lbnombreEmpleado);
		lbnombreEmpleado.setForeground(Color.WHITE);
		lbnombreEmpleado.setFont(new Font("Yu Gothic Light", Font.BOLD, 13));
		
		lbcerrarSesion = new JLabel("");
		lbcerrarSesion.setForeground(Color.WHITE);
		lbcerrarSesion.setBounds(487, 49, 31, 30);
		Principal.add(lbcerrarSesion);
		//FOTO CERRAR SESION
		fotoEscalarLabel(lbcerrarSesion, "assets/finSesion.png");
		//
		
		lbmostrarHoraPrincipal = new JLabel("16 : 42");
		lbmostrarHoraPrincipal.setForeground(Color.WHITE);
		lbmostrarHoraPrincipal.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		lbmostrarHoraPrincipal.setBounds(80, 44, 79, 23);
		Principal.add(lbmostrarHoraPrincipal);
		
		lbtituloPrincipal = new JLabel("Coffekie");
		lbtituloPrincipal.setForeground(Color.WHITE);
		//lbtituloP.setFont(new Font(Font.UNDERLINE));
		lbtituloPrincipal.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lbtituloPrincipal.setBackground(Color.WHITE);
		lbtituloPrincipal.setBounds(221, 38, 119, 42);
		Principal.add(lbtituloPrincipal);
		
			JLabel lbPrincipalFondo = new JLabel("");
			lbPrincipalFondo.setBounds(0, 0, 548, 502);
			Principal.add(lbPrincipalFondo);
			//Fondo interfaz
			fotoEscalarLabel(lbPrincipalFondo, "assets/fondo2.jpg");
		//
		
		Comanda = new JPanel();
		Comanda.setBounds(0, 0, 548, 502);
		contentPane.add(Comanda);
		Comanda.setLayout(null);
		
		lbfondoComanda = new JLabel("");
		lbfondoComanda.setBounds(0, 0, 548, 502);
		Comanda.setVisible(false);
		
		btnrestarComida = new JButton("-");
		btnrestarComida.setForeground(Color.BLACK);
		btnrestarComida.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnrestarComida.setBackground(new Color(255, 0, 51));
		btnrestarComida.setBounds(100, 343, 47, 28);
		btnrestarComida.setVisible(false);
		
		lbPagar = new JLabel("");
		lbPagar.setBounds(347, 441, 89, 42);
		Comanda.add(lbPagar);
		//
		fotoEscalarLabel(lbPagar, "assets/pagar.png");
		Comanda.add(btnrestarComida);
		
		lbmensajePedido = new JLabel("");
		lbmensajePedido.setForeground(new Color(255, 255, 255));
		lbmensajePedido.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbmensajePedido.setBounds(100, 454, 211, 14);
		lbmensajePedido.setVisible(false);
		Comanda.add(lbmensajePedido);
		
		separator_15 = new JSeparator();
		separator_15.setOrientation(SwingConstants.VERTICAL);
		separator_15.setForeground(Color.WHITE);
		separator_15.setBackground(Color.WHITE);
		separator_15.setBounds(243, 373, 11, 58);
		Comanda.add(separator_15);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setEditable(false);
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(112, 399, 89, 20);
		Comanda.add(textFieldTotal);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFieldFecha.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFecha.setEditable(false);
		textFieldFecha.setColumns(10);
		textFieldFecha.setBounds(304, 396, 81, 20);
		Comanda.add(textFieldFecha);
		
		textFieldHora = new JTextField();
		textFieldHora.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldHora.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHora.setEditable(false);
		textFieldHora.setColumns(10);
		textFieldHora.setBounds(444, 396, 64, 20);
		Comanda.add(textFieldHora);
		
		
		lbHoraComanda = new JLabel("HORA");
		lbHoraComanda.setForeground(Color.WHITE);
		lbHoraComanda.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbHoraComanda.setBounds(395, 395, 52, 23);
		Comanda.add(lbHoraComanda);
		
		lbFechaComanda = new JLabel("FECHA");
		lbFechaComanda.setForeground(Color.WHITE);
		lbFechaComanda.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbFechaComanda.setBounds(253, 395, 58, 23);
		Comanda.add(lbFechaComanda);
		
		separator_14 = new JSeparator();
		separator_14.setForeground(Color.WHITE);
		separator_14.setBackground(Color.WHITE);
		separator_14.setBounds(30, 429, 488, 14);
		Comanda.add(separator_14);
		
		lblTotal = new JLabel("TOTAL");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblTotal.setBounds(58, 395, 52, 23);
		Comanda.add(lblTotal);
		
		separator_13 = new JSeparator();
		separator_13.setForeground(Color.WHITE);
		separator_13.setBackground(Color.WHITE);
		separator_13.setBounds(30, 376, 488, 25);
		Comanda.add(separator_13);
		
		separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setForeground(Color.WHITE);
		separator_12.setBackground(Color.WHITE);
		separator_12.setBounds(243, 120, 37, 256);
		Comanda.add(separator_12);
		
		btnProducto9 = new JButton("");
		btnProducto9.setBounds(449, 290, 69, 65);
		Comanda.add(btnProducto9);
		
		btnProducto8 = new JButton("");
		btnProducto8.setBounds(354, 290, 69, 65);
		Comanda.add(btnProducto8);
		
		btnProducto7 = new JButton("");
		btnProducto7.setBounds(258, 290, 69, 65);
		Comanda.add(btnProducto7);
		
		btnProducto5 = new JButton("");
		btnProducto5.setBounds(354, 212, 69, 65);
		Comanda.add(btnProducto5);
		
		btnProducto6 = new JButton("");
		btnProducto6.setBounds(449, 212, 69, 65);
		Comanda.add(btnProducto6);
		
		btnProducto4 = new JButton("");
		btnProducto4.setBounds(258, 212, 69, 65);
		Comanda.add(btnProducto4);
		
		btnProducto3 = new JButton("");
		btnProducto3.setBounds(449, 132, 69, 65);
		Comanda.add(btnProducto3);
		
		btnProducto2 = new JButton("");
		btnProducto2.setBounds(354, 132, 69, 65);
		Comanda.add(btnProducto2);
		
		btnProducto1 = new JButton("");
		btnProducto1.setBounds(258, 132, 69, 65);
		Comanda.add(btnProducto1);
		
		listPedido = new JList();
		listPedido.setBounds(30, 156, 196, 180);
		Comanda.add(listPedido);	
		
		lblPedido = new JLabel("PEDIDO");
		lblPedido.setForeground(Color.WHITE);
		lblPedido.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblPedido.setBounds(100, 134, 64, 23);
		Comanda.add(lblPedido);
		
		separator_11 = new JSeparator();
		separator_11.setForeground(Color.WHITE);
		separator_11.setBackground(Color.WHITE);
		separator_11.setBounds(30, 120, 488, 25);
		Comanda.add(separator_11);
		
		textFieldNumComanda = new JTextField();
		textFieldNumComanda.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNumComanda.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldNumComanda.setEditable(false);
		textFieldNumComanda.setColumns(10);
		textFieldNumComanda.setBounds(415, 96, 52, 20);
		Comanda.add(textFieldNumComanda);
		
		textFieldNumMesa = new JTextField();
		textFieldNumMesa.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldNumMesa.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNumMesa.setEditable(false);
		textFieldNumMesa.setBounds(164, 97, 52, 20);
		Comanda.add(textFieldNumMesa);
		textFieldNumMesa.setColumns(10);
		
		lblNumComanda = new JLabel("COMANDA");
		lblNumComanda.setForeground(new Color(255, 255, 255));
		lblNumComanda.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNumComanda.setBackground(new Color(255, 255, 255));
		lblNumComanda.setBounds(322, 100, 83, 14);
		Comanda.add(lblNumComanda);
		
		lbtextoMesaComanda = new JLabel("MESA");
		lbtextoMesaComanda.setForeground(new Color(255, 255, 255));
		lbtextoMesaComanda.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbtextoMesaComanda.setBounds(108, 95, 46, 23);
		Comanda.add(lbtextoMesaComanda);
		
		lbcerrarSesionComanda = new JLabel("");
		lbcerrarSesionComanda.setForeground(Color.WHITE);
		lbcerrarSesionComanda.setBounds(432, 37, 31, 30);
		Comanda.add(lbcerrarSesionComanda);
		//
		fotoEscalarLabel(lbcerrarSesionComanda, "assets/finSesion.png");
		
		lbmostrarHoraComanda = new JLabel("16 : 42");
		lbmostrarHoraComanda.setForeground(Color.WHITE);
		lbmostrarHoraComanda.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		lbmostrarHoraComanda.setBounds(81, 44, 83, 23);
		Comanda.add(lbmostrarHoraComanda);
		
		lbtituloPComanda = new JLabel("Coffekie");
		lbtituloPComanda.setForeground(Color.WHITE);
		lbtituloPComanda.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lbtituloPComanda.setBackground(Color.WHITE);
		lbtituloPComanda.setBounds(231, 37, 114, 42);
		Comanda.add(lbtituloPComanda);
		
		separator_10 = new JSeparator();
		separator_10.setForeground(Color.WHITE);
		separator_10.setBackground(Color.WHITE);
		separator_10.setBounds(30, 90, 488, 25);
		Comanda.add(separator_10);
		Comanda.add(lbfondoComanda);
		//
		fotoEscalarLabel(lbfondoComanda, "assets/fondo2.jpg");
		
		Pagos = new JPanel();
		Pagos.setBounds(0, 0, 548, 502);
		contentPane.add(Pagos);
		Pagos.setLayout(null);
		Pagos.setVisible(false);
		
		lbmensajeDenegar = new JLabel("");
		lbmensajeDenegar.setHorizontalAlignment(SwingConstants.CENTER);
		lbmensajeDenegar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbmensajeDenegar.setForeground(new Color(255, 0, 0));
		lbmensajeDenegar.setBounds(111, 339, 329, 27);
		lbmensajeDenegar.setVisible(false);
		
		btnguardarPago = new JButton("$");
		btnguardarPago.setBackground(new Color(128, 255, 128));
		btnguardarPago.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		btnguardarPago.setBounds(300, 288, 42, 30);
		Pagos.add(btnguardarPago);
		Pagos.add(lbmensajeDenegar);
		
		btnDarCambio = new JButton("");
		btnDarCambio.setBounds(247, 418, 53, 42);
		btnDarCambio.setVisible(false);
		Pagos.add(btnDarCambio);
		
		textFieldDineroDeber = new JTextField();
		textFieldDineroDeber.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDineroDeber.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		textFieldDineroDeber.setForeground(new Color(0, 0, 0));
		textFieldDineroDeber.setEditable(false);
		textFieldDineroDeber.setBounds(231, 192, 86, 30);
		Pagos.add(textFieldDineroDeber);
		textFieldDineroDeber.setColumns(10);
		
		lbmensajeAbonarCliente = new JLabel("");
		lbmensajeAbonarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lbmensajeAbonarCliente.setForeground(Color.WHITE);
		lbmensajeAbonarCliente.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbmensajeAbonarCliente.setBounds(34, 233, 478, 36);
		Pagos.add(lbmensajeAbonarCliente);
		
		textFieldAbonoCliente = new JTextField();
		textFieldAbonoCliente.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAbonoCliente.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		textFieldAbonoCliente.setColumns(10);
		textFieldAbonoCliente.setBounds(208, 289, 86, 30);
		Pagos.add(textFieldAbonoCliente);
		
		lbmensajeCambioCliente = new JLabel("");
		lbmensajeCambioCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lbmensajeCambioCliente.setForeground(Color.WHITE);
		lbmensajeCambioCliente.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbmensajeCambioCliente.setVisible(false);
		lbmensajeCambioCliente.setBounds(34, 330, 478, 36);
		Pagos.add(lbmensajeCambioCliente);
		
		textFieldcambioTotal = new JTextField();
		textFieldcambioTotal.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		textFieldcambioTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldcambioTotal.setEditable(false);
		textFieldcambioTotal.setColumns(10);
		textFieldcambioTotal.setVisible(false);
		textFieldcambioTotal.setBounds(231, 377, 86, 30);
		Pagos.add(textFieldcambioTotal);
		
		lbmensajeDeber = new JLabel("");
		lbmensajeDeber.setHorizontalAlignment(SwingConstants.CENTER);
		lbmensajeDeber.setForeground(new Color(255, 255, 255));
		lbmensajeDeber.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbmensajeDeber.setBounds(34, 137, 478, 36);
		Pagos.add(lbmensajeDeber);
		
		lbcerrarSesionPago = new JLabel("");
		lbcerrarSesionPago.setForeground(Color.WHITE);
		lbcerrarSesionPago.setBounds(426, 41, 31, 30);
		//
		fotoEscalarLabel(lbcerrarSesionPago, "assets/finSesion.png");
		Pagos.add(lbcerrarSesionPago);
		
		lbmostrarHoraPago = new JLabel("16 : 42");
		lbmostrarHoraPago.setForeground(Color.WHITE);
		lbmostrarHoraPago.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		lbmostrarHoraPago.setBounds(82, 48, 83, 23);
		Pagos.add(lbmostrarHoraPago);
		
		lbtituloPago = new JLabel("Coffekie");
		lbtituloPago.setForeground(Color.WHITE);
		lbtituloPago.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lbtituloPago.setBackground(Color.WHITE);
		lbtituloPago.setBounds(231, 37, 114, 42);
		Pagos.add(lbtituloPago);
		
		separator_22 = new JSeparator();
		separator_22.setForeground(Color.WHITE);
		separator_22.setBackground(Color.WHITE);
		separator_22.setBounds(30, 90, 488, 25);
		Pagos.add(separator_22);
		
		lbfondoPagos = new JLabel("");
		lbfondoPagos.setBounds(0, 0, 548, 502);
		//
		fotoEscalarLabel(lbfondoPagos, "assets/fondo2.jpg");
		Pagos.add(lbfondoPagos);
		//
		
		inicioSesion = new JPanel();
		inicioSesion.setBackground(new Color(255, 255, 255));
		inicioSesion.setBounds(0, 0, 548, 502);
		contentPane.add(inicioSesion);
		inicioSesion.setLayout(null);
		
		lbVerContraseña = new JLabel("");
		lbVerContraseña.setBackground(new Color(255, 255, 255));
		lbVerContraseña.setBounds(24, 299, 46, 37);
		inicioSesion.add(lbVerContraseña);
		//
		//Fondo interfaz
		fotoEscalarLabel(lbVerContraseña, "assets/no_ver.png");
		
		lbPaginaInformativa = new JLabel("");
		lbPaginaInformativa.setBounds(39, 53, 46, 45);
		inicioSesion.add(lbPaginaInformativa);
		//SETEO TEXTO A FOTO REGISTRO
		fotoEscalarLabel(lbPaginaInformativa, "assets/fotoInformativa.png");
		//
		//
		
		labelFotoRegistro = new JLabel("");
		labelFotoRegistro.setBounds(367, 361, 37, 31);
		inicioSesion.add(labelFotoRegistro);
		//SETEO TEXTO A FOTO REGISTRO
		fotoEscalarLabel(labelFotoRegistro, "assets/registro.png");
		//
		
		mensajeInformativo = new JLabel("");
		mensajeInformativo.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeInformativo.setForeground(new Color(255, 0, 0));
		mensajeInformativo.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		mensajeInformativo.setBounds(39, 444, 478, 14);
		mensajeInformativo.setVisible(false);
		inicioSesion.add(mensajeInformativo);
		
		btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setForeground(Color.BLACK);
		btnRegistrarse.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		btnRegistrarse.setBackground(new Color(192, 192, 192));
		btnRegistrarse.setBounds(207, 364, 146, 28);
		inicioSesion.add(btnRegistrarse);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		textUsuario.setColumns(10);
		textUsuario.setBounds(207, 250, 146, 28);
		inicioSesion.add(textUsuario);
		
		textContraseña = new JPasswordField();
		textContraseña.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		textContraseña.setColumns(10);
		textContraseña.setBounds(207, 305, 146, 28);
		textContraseña.setEchoChar('*');
		inicioSesion.add(textContraseña);
		
		btnIniciar = new JButton(">");
		btnIniciar.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		btnIniciar.setBackground(new Color(192, 192, 192));
		btnIniciar.setForeground(new Color(0, 0, 0));
		btnIniciar.setBounds(382, 274, 47, 28);
		inicioSesion.add(btnIniciar);
		
		lbContrasea = new JLabel("Contraseña");
		lbContrasea.setForeground(Color.WHITE);
		lbContrasea.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbContrasea.setBounds(80, 305, 117, 28);
		inicioSesion.add(lbContrasea);
		
		lbusuario = new JLabel("Usuario");
		lbusuario.setForeground(new Color(255, 255, 255));
		lbusuario.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbusuario.setBounds(110, 252, 87, 21);
		inicioSesion.add(lbusuario);
		
		lbmostrarLogo = new JLabel("");
		lbmostrarLogo.setBounds(229, 85, 103, 81);
		inicioSesion.add(lbmostrarLogo);
		//foto logo inicio sesion
		fotoEscalarLabel(lbmostrarLogo, "assets/logo3.png");
		//
		
		lbtitulo = new JLabel("Coffekie");
		lbtitulo.setForeground(Color.WHITE);
		lbtitulo.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lbtitulo.setBackground(Color.WHITE);
		lbtitulo.setBounds(229, 161, 167, 54);
		inicioSesion.add(lbtitulo);
		
		lbmostrarFecha = new JLabel("");
		lbmostrarFecha.setForeground(new Color(255, 255, 255));
		lbmostrarFecha.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lbmostrarFecha.setBounds(118, 22, 103, 23);
		inicioSesion.add(lbmostrarFecha);
		//MOSTRAR HORA
		
		lbmostrarHora = new JLabel("");
		lbmostrarHora.setForeground(new Color(255, 255, 255));
		lbmostrarHora.setFont(new Font("Yu Gothic Light", Font.BOLD, 18));
		lbmostrarHora.setBounds(355, 28, 78, 23);
		inicioSesion.add(lbmostrarHora);
		
		JLabel lbfondo = new JLabel("");
		lbfondo.setBounds(0, 0, 548, 502);
		inicioSesion.add(lbfondo);
		//Fondo interfaz
			fotoEscalarLabel(lbfondo, "assets/fondo2.jpg");
		
		Configuracion = new JPanel();
		Configuracion.setBounds(0, 0, 548, 502);
		contentPane.add(Configuracion);
		Configuracion.setLayout(null);
		Configuracion.setVisible(false);
		
		lbtextoEdicion = new JLabel("EDITAR DATOS");
		lbtextoEdicion.setForeground(Color.WHITE);
		lbtextoEdicion.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoEdicion.setBounds(217, 242, 154, 20);
		Configuracion.add(lbtextoEdicion);
		
		lbtextoContraseña = new JLabel("Contraseña");
		lbtextoContraseña.setForeground(Color.WHITE);
		lbtextoContraseña.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoContraseña.setBounds(53, 159, 109, 25);
		Configuracion.add(lbtextoContraseña);
		
		lbtextoJornadaI = new JLabel("Jornada Inicio");
		lbtextoJornadaI.setForeground(Color.WHITE);
		lbtextoJornadaI.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoJornadaI.setBounds(278, 143, 120, 25);
		Configuracion.add(lbtextoJornadaI);
		
		lbtextoSueldo = new JLabel("Sueldo");
		lbtextoSueldo.setForeground(Color.WHITE);
		lbtextoSueldo.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoSueldo.setBounds(53, 195, 80, 25);
		Configuracion.add(lbtextoSueldo);
		
		lbtextoUsuario = new JLabel("Usuario");
		lbtextoUsuario.setForeground(Color.WHITE);
		lbtextoUsuario.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoUsuario.setBounds(53, 123, 97, 25);
		Configuracion.add(lbtextoUsuario);
		
		lbJornadaF = new JLabel("Jornada Fin");
		lbJornadaF.setForeground(Color.WHITE);
		lbJornadaF.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbJornadaF.setBounds(278, 179, 120, 25);
		Configuracion.add(lbJornadaF);
		
		textFieldDatoFin = new JTextField();
		textFieldDatoFin.setEditable(false);
		textFieldDatoFin.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDatoFin.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		textFieldDatoFin.setColumns(10);
		textFieldDatoFin.setBounds(393, 184, 120, 20);
		Configuracion.add(textFieldDatoFin);
		
		textFieldDatoInicio = new JTextField();
		textFieldDatoInicio.setEditable(false);
		textFieldDatoInicio.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDatoInicio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		textFieldDatoInicio.setColumns(10);
		textFieldDatoInicio.setBounds(393, 148, 120, 20);
		Configuracion.add(textFieldDatoInicio);
		
		textFieldDatoSueldo = new JTextField();
		textFieldDatoSueldo.setEditable(false);
		textFieldDatoSueldo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDatoSueldo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		textFieldDatoSueldo.setColumns(10);
		textFieldDatoSueldo.setBounds(148, 196, 120, 20);
		Configuracion.add(textFieldDatoSueldo);
		
		textFieldDatoPass = new JTextField();
		textFieldDatoPass.setEditable(false);
		textFieldDatoPass.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDatoPass.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		textFieldDatoPass.setColumns(10);
		textFieldDatoPass.setBounds(148, 164, 120, 20);
		Configuracion.add(textFieldDatoPass);
		
		textFieldDatoUser = new JTextField();
		textFieldDatoUser.setEditable(false);
		textFieldDatoUser.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDatoUser.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		textFieldDatoUser.setColumns(10);
		textFieldDatoUser.setBounds(148, 128, 120, 20);
		Configuracion.add(textFieldDatoUser);
		
		separator_7 = new JSeparator();
		separator_7.setForeground(Color.WHITE);
		separator_7.setBackground(Color.WHITE);
		separator_7.setBounds(41, 227, 472, 25);
		Configuracion.add(separator_7);
		
		lbtextoDatosPersonales = new JLabel("DATOS PERSONALES");
		lbtextoDatosPersonales.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoDatosPersonales.setForeground(new Color(255, 255, 255));
		lbtextoDatosPersonales.setBounds(196, 89, 202, 20);
		Configuracion.add(lbtextoDatosPersonales);
		
		mensajeInformativoConfiguracion = new JLabel("");
		mensajeInformativoConfiguracion.setForeground(new Color(255, 0, 0));
		mensajeInformativoConfiguracion.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		mensajeInformativoConfiguracion.setBackground(new Color(255, 0, 0));
		mensajeInformativoConfiguracion.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeInformativoConfiguracion.setBounds(53, 435, 413, 14);
		Configuracion.add(mensajeInformativoConfiguracion);
		
		textJIConf = new JTextField();
		textJIConf.setColumns(10);
		textJIConf.setBounds(172, 388, 120, 20);
		Configuracion.add(textJIConf);
		
		textPassConf = new JTextField();
		textPassConf.setColumns(10);
		textPassConf.setBounds(172, 281, 120, 20);
		Configuracion.add(textPassConf);
		
		textJFConf = new JTextField();
		textJFConf.setColumns(10);
		textJFConf.setBounds(172, 348, 120, 20);
		Configuracion.add(textJFConf);
		
		textSueldoConf = new JTextField();
		textSueldoConf.setColumns(10);
		textSueldoConf.setBounds(172, 312, 120, 20);
		Configuracion.add(textSueldoConf);
		
		btnGuardarInfo = new JButton("Guardar");
		btnGuardarInfo.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnGuardarInfo.setBackground(new Color(255, 255, 255));
		btnGuardarInfo.setBounds(369, 281, 97, 43);
		Configuracion.add(btnGuardarInfo);
		
		btnEliminarUser = new JButton("Eliminar");
		btnEliminarUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarUser.setBackground(new Color(255, 128, 128));
		btnEliminarUser.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnEliminarUser.setBounds(369, 365, 97, 43);
		Configuracion.add(btnEliminarUser);
		
		lbtextoEditSueldo = new JLabel("Sueldo");
		lbtextoEditSueldo.setForeground(Color.WHITE);
		lbtextoEditSueldo.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoEditSueldo.setBounds(53, 309, 109, 25);
		Configuracion.add(lbtextoEditSueldo);
		
		lbtextoEditContraseña = new JLabel("Contraseña");
		lbtextoEditContraseña.setForeground(new Color(255, 255, 255));
		lbtextoEditContraseña.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoEditContraseña.setBounds(53, 275, 120, 25);
		Configuracion.add(lbtextoEditContraseña);
		
		lbtextoEditJornadaInicio = new JLabel("Jornada Inicio");
		lbtextoEditJornadaInicio.setForeground(new Color(255, 255, 255));
		lbtextoEditJornadaInicio.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoEditJornadaInicio.setBounds(53, 383, 120, 25);
		Configuracion.add(lbtextoEditJornadaInicio);
		
		lbtextoEditJornadaFin = new JLabel("Jornada Fin");
		lbtextoEditJornadaFin.setForeground(new Color(255, 255, 255));
		lbtextoEditJornadaFin.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoEditJornadaFin.setBounds(53, 345, 120, 25);
		Configuracion.add(lbtextoEditJornadaFin);
		
		lbcerrarSesionConfiguracion = new JLabel("");
		lbcerrarSesionConfiguracion.setForeground(Color.WHITE);
		lbcerrarSesionConfiguracion.setBounds(435, 31, 31, 30);
		Configuracion.add(lbcerrarSesionConfiguracion);
		//SETEO TEXTO A FOTO REGISTRO
		fotoEscalarLabel(lbcerrarSesionConfiguracion, "assets/finSesion.png");
		
		lbmostrarHoraConfiguracion = new JLabel("16 : 42");
		lbmostrarHoraConfiguracion.setForeground(Color.WHITE);
		lbmostrarHoraConfiguracion.setFont(new Font("DialogInput", Font.BOLD, 20));
		lbmostrarHoraConfiguracion.setBounds(76, 38, 97, 23);
		Configuracion.add(lbmostrarHoraConfiguracion);
		
		lbtituloConfiguracion = new JLabel("Coffekie");
		lbtituloConfiguracion.setForeground(Color.WHITE);
		lbtituloConfiguracion.setFont(new Font("Segoe Script", Font.BOLD, 20));
		lbtituloConfiguracion.setBackground(Color.WHITE);
		lbtituloConfiguracion.setBounds(236, 24, 97, 54);
		Configuracion.add(lbtituloConfiguracion);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBackground(Color.WHITE);
		separator_2.setBounds(41, 72, 472, 25);
		Configuracion.add(separator_2);
		
		lbfondoBack = new JLabel("");
		lbfondoBack.setBounds(0, 0, 548, 502);
		Configuracion.add(lbfondoBack);
		//
		//SETEO TEXTO A FOTO REGISTRO
		fotoEscalarLabel(lbfondoBack, "assets/fondo2.jpg");
		//
		
		Documentacion_1 = new JPanel();
		Documentacion_1.setBounds(0, 0, 548, 502);
		contentPane.add(Documentacion_1);
		Documentacion_1.setLayout(null);
		Documentacion_1.setVisible(false);
		
		textAreaInformacionGeneral = new JTextArea();
		textAreaInformacionGeneral.setBackground(new Color(0, 0, 0));
		textAreaInformacionGeneral.setForeground(new Color(255, 255, 255));
		textAreaInformacionGeneral.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textAreaInformacionGeneral.setBounds(52, 118, 440, 92);
		Documentacion_1.add(textAreaInformacionGeneral);
		
		textAreainformacionOP1 = new JTextArea();
		textAreainformacionOP1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textAreainformacionOP1.setBounds(52, 350, 440, 83);
		textAreainformacionOP1.setVisible(false);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 350, 440, 83);
		Documentacion_1.add(scrollPane);
		scrollPane.setVisible(false);
		
		textAreaPrivacidad = new JTextArea();
		scrollPane.setViewportView(textAreaPrivacidad);
		//
		textAreaPrivacidad.setVisible(false);
		
		Documentacion_1.add(textAreainformacionOP1);
		
		lbfotoLibro = new JLabel("");
		lbfotoLibro.setBounds(234, 368, 69, 54);
		lbfotoLibro.setVisible(false);
		//SETEO TEXTO A FOTO REGISTRO
		fotoEscalarLabel(lbfotoLibro, "assets/libro.png");
		
		Documentacion_1.add(lbfotoLibro);
		
		comboBoxOpciones = new JComboBox();
		comboBoxOpciones.setModel(new DefaultComboBoxModel(new String[] {"¿Que es Coffekie?", "Manual de usuario", "Politica de privavidad"}));
		comboBoxOpciones.setBounds(201, 239, 152, 22);
		Documentacion_1.add(comboBoxOpciones);
		
		lbcerrarSesionDOC= new JLabel("");
		lbcerrarSesionDOC.setForeground(Color.WHITE);
		lbcerrarSesionDOC.setBounds(261, 448, 31, 30);
		Documentacion_1.add(lbcerrarSesionDOC);
		//
		//SETEO TEXTO A FOTO REGISTRO
			fotoEscalarLabel(lbcerrarSesionDOC, "assets/finSesion.png");
			
			lbmostrarFechaDOC = new JLabel("2024-10-24");
			lbmostrarFechaDOC.setForeground(Color.WHITE);
			lbmostrarFechaDOC.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
			lbmostrarFechaDOC.setBounds(389, 50, 103, 23);
			Documentacion_1.add(lbmostrarFechaDOC);
			
			separator_1 = new JSeparator();
			separator_1.setForeground(Color.WHITE);
			separator_1.setBackground(Color.WHITE);
			separator_1.setBounds(30, 90, 488, 25);
			Documentacion_1.add(separator_1);
			
			lbmostrarHoraDOC = new JLabel("12 : 10");
			lbmostrarHoraDOC.setForeground(Color.WHITE);
			lbmostrarHoraDOC.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
			lbmostrarHoraDOC.setBounds(52, 49, 78, 23);
			Documentacion_1.add(lbmostrarHoraDOC);
			
			lbtituloDOC = new JLabel("Coffekie");
			lbtituloDOC.setForeground(Color.WHITE);
			lbtituloDOC.setFont(new Font("Segoe Script", Font.BOLD, 24));
			lbtituloDOC.setBackground(Color.WHITE);
			lbtituloDOC.setBounds(222, 42, 124, 42);
			Documentacion_1.add(lbtituloDOC);
			
			lbfondoDocumentacion = new JLabel("");
			lbfondoDocumentacion.setBounds(0, 0, 548, 502);
			Documentacion_1.add(lbfondoDocumentacion);
			//
			//SETEO TEXTO A FOTO REGISTRO
			fotoEscalarLabel(lbfondoDocumentacion, "assets/fondo2.jpg");
	}
	
	private void fotoEscalarLabel(JLabel label, String url) {
		ImageIcon imagen=new ImageIcon(url);
    	Icon Icono=new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
    	label.setIcon(Icono);
	}//fotoEscalarLabel
}
