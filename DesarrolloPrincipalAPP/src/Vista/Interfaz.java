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
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;

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
	public JTextArea textAreaComboBox;
	public JScrollPane scrollPaneDoc;
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
	public JPanel Productos;
	public JLabel lbfondoProductos;
	public JSeparator separator_5;
	public JLabel lbtituloProductos;
	public JLabel lbmostrarHoraProductos;
	public JLabel lbcerrarSesionProductos;
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
	public JLabel lbensajeInformativoMenu;
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
	public JPanel Contabilidad;
	public JLabel lbfondoContabilidad;
	public JSeparator separator_23;
	public JLabel lbtituloContabilidad;
	public JLabel lbmostrarHoraContabilidad;
	public JLabel lbcerrarSesionContabilidad;
	public JMenuBar menuBar;
	public JMenu Menu;
	public JMenuItem menuHistorial;
	public JMenuItem menuBanco;
	public JMenuItem menuInventario;
	public JLabel lbContextoMenu;
	public JLabel lbtituloSeleccionado;
	public JSeparator separator_24;
	public JPanel panelAuxiliarInventario;
	public JList listInventario;
	public JButton btnGuardarEdicion;
	public JLabel lbmostrarProductos;
	public JSeparator separator_25;
	public JSeparator separator_26;
	public JTextField textNombreProductoMostrado;
	public JLabel lbIdProductoMostrado;
	public JButton btnEditar;
	public JLabel lbInventarioTipo;
	public JLabel lbInventarioPrecio;
	public JLabel lbInventarioProveedor;
	public JLabel lbInventarioStock;
	public JTextField textInventarioTipo;
	public JTextField textInventarioPrecio;
	public JTextField textInventarioProveedor;
	public JTextField textInventarioStock;
	public JProgressBar progressBarInventario;
	public JLabel lbInventarioImagen;
	public JLabel lbmostrarImagenInventario;
	public JButton btnComprobarProductoInventario;
	public JLabel lbmensajeInventario;
	public JPanel panelAuxiliarBanco;
	public JComboBox comboBoxBanco;
	public JLabel lbCuentas;
	public JLabel lblSaldos;
	public JLabel lbMostrarSaldo;
	public JLabel lbfechaContabilidad;
	public JSeparator separator_27;
	public JSeparator separator_28;
	public JSeparator separator_29;
	public JSeparator separator_30;
	public JButton btnIngresar;
	public JButton btnGastos;
	public JLabel lbModificar;
	public JSeparator separator_31;
	public JLabel lbcontraseñaBanco;
	public JLabel lbMostrarContraseñaBanco;
	public JLabel lbcantidadImpuesta;
	public JTextField textFieldCantidadBanco;
	public JRadioButton rdbtnConcepto;
	public JLabel lbconcepto;
	public JRadioButton rdbtnConcepto2;
	public JLabel lbRetroceder;
	public JButton btnGuardarCambios;
	public JLabel lbmensajeInformativo;
	public ButtonGroup grupoBotones=new ButtonGroup();
	public JLabel lbtextoMostrar;
	public JSeparator separator_32;
	public JSeparator separator_33;
	public JLabel lbnombreCuenta;
	public JTable tableTransacciones;
	public JScrollPane scrollPaneBanco;
	public JPanel panelAuxiliarHistorial;
	public JLabel lbtituloHistorial;
	public JButton btnLimpiar;
	public JButton btnEstadisticas;
	public JPanel panelAuxiliarEstadisticas;
	public JLabel lblNewLabel;
	public JLabel lbcerrarSesionEstadisticas;
	public JSeparator separator_34;
	public JTable tableHistorial;
	public JScrollPane scrollPaneHistorial;
	public JLabel lbproductos;
	public JSeparator separator_16;
	public JSeparator separator_18;
	public JSeparator separator_19;
	public JSeparator separator_20;
	public JSeparator separator_21;
	public JLabel lbSubtitulo;
	public JLabel lbmaximo;
	public JLabel lbestadisticaMesa1;
	public JLabel lbestadisticaMesa2;
	public JLabel lbestadisticaMesa3;
	public JLabel lbestadisticaMesa4;
	public JLabel lbestadisticaMesa5;
	public JLabel lbestadisticaMesa6;
	public JProgressBar progressBarEstadisticaMesa1;
	public JProgressBar progressBarEstadisticaMesa2;
	public JProgressBar progressBarEstadisticaMesa3;
	public JProgressBar progressBarEstadisticaMesa4;
	public JProgressBar progressBarEstadisticaMesa5;
	public JProgressBar progressBarEstadisticaMesa6;
	public JList listEstadisticasMesa;
	public JSeparator separator_17;
	public JLabel lbtotalComandas;
	public JLabel lbnumComandasTotales;
	

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
		
		Productos = new JPanel();
		Productos.setBounds(0, 0, 548, 502);
		contentPane.add(Productos);
		Productos.setVisible(false);
		Productos.setLayout(null);
		
		lbFieldNumStock = new JLabel();
		lbFieldNumStock.setForeground(new Color(255, 255, 255));
		lbFieldNumStock.setBackground(new Color(255, 255, 255));
		lbFieldNumStock.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldNumStock.setHorizontalAlignment(SwingConstants.CENTER);
		lbFieldNumStock.setBounds(104, 267, 48, 20);
		Productos.add(lbFieldNumStock);
		
		lbmensajeStock = new JLabel("");
		lbmensajeStock.setHorizontalAlignment(SwingConstants.CENTER);
		lbmensajeStock.setForeground(new Color(255, 255, 255));
		lbmensajeStock.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		lbmensajeStock.setBounds(30, 416, 218, 28);
		Productos.add(lbmensajeStock);
		lbmensajeStock.setVisible(false);
		
		btnverBebida = new JButton("");
		btnverBebida.setBounds(463, 106, 48, 42);
		Productos.add(btnverBebida);
		
		btnverComida = new JButton("");
		btnverComida.setBounds(387, 107, 48, 42);
		Productos.add(btnverComida);
		
		progressBarStock = new JProgressBar();
		progressBarStock.setBounds(30, 298, 134, 14);
		Productos.add(progressBarStock);
		
		lbFieldTipo = new JLabel();
		lbFieldTipo.setForeground(new Color(255, 255, 255));
		lbFieldTipo.setBackground(new Color(255, 255, 255));
		lbFieldTipo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldTipo.setBounds(30, 357, 72, 20);
		Productos.add(lbFieldTipo);
		
		lbtextoTipo = new JLabel("TIPO:");
		lbtextoTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoTipo.setForeground(new Color(192, 192, 192));
		lbtextoTipo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoTipo.setBounds(30, 329, 88, 23);
		Productos.add(lbtextoTipo);
		
		lbImagenInventario = new JLabel("");
		lbImagenInventario.setBounds(217, 233, 103, 109);
		Productos.add(lbImagenInventario);
		fotoEscalarLabel(lbImagenInventario, "assets/productoDefecto.png");
		
		lbtextoStock = new JLabel("STOCK:");
		lbtextoStock.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoStock.setForeground(new Color(192, 192, 192));
		lbtextoStock.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoStock.setBounds(30, 264, 88, 23);
		Productos.add(lbtextoStock);
		
		lbFieldPrecio = new JLabel();
		lbFieldPrecio.setForeground(new Color(255, 255, 255));
		lbFieldPrecio.setBackground(new Color(255, 255, 255));
		lbFieldPrecio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lbFieldPrecio.setBounds(30, 233, 72, 20);
		Productos.add(lbFieldPrecio);
		
		lbtextoPrecio = new JLabel("PRECIO:");
		lbtextoPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoPrecio.setForeground(new Color(192, 192, 192));
		lbtextoPrecio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoPrecio.setBounds(30, 196, 88, 23);
		Productos.add(lbtextoPrecio);
		
		lbtextoImagen = new JLabel("IMAGEN:");
		lbtextoImagen.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoImagen.setForeground(new Color(192, 192, 192));
		lbtextoImagen.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoImagen.setBounds(232, 196, 88, 23);
		Productos.add(lbtextoImagen);
		
		lbFieldProveedor = new JLabel();
		lbFieldProveedor.setForeground(new Color(255, 255, 255));
		lbFieldProveedor.setBackground(new Color(255, 255, 255));
		lbFieldProveedor.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldProveedor.setBounds(162, 165, 184, 20);
		Productos.add(lbFieldProveedor);
		
		lbtextoProveedor = new JLabel("PROVEEDOR:");
		lbtextoProveedor.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoProveedor.setForeground(new Color(192, 192, 192));
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
		lbtextoID.setForeground(new Color(192, 192, 192));
		lbtextoID.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoID.setBounds(30, 112, 31, 23);
		Productos.add(lbtextoID);
		
		lbtextoNombre = new JLabel("NOMBRE:");
		lbtextoNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lbtextoNombre.setForeground(new Color(192, 192, 192));
		lbtextoNombre.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoNombre.setBounds(138, 112, 94, 23);
		Productos.add(lbtextoNombre);
		
		lbFieldID = new JLabel();
		lbFieldID.setForeground(new Color(255, 255, 255));
		lbFieldID.setBackground(new Color(255, 255, 255));
		lbFieldID.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldID.setBounds(71, 115, 39, 20);
		Productos.add(lbFieldID);
		
		lbFieldNombre = new JLabel();
		lbFieldNombre.setForeground(new Color(255, 255, 255));
		lbFieldNombre.setBackground(new Color(255, 255, 255));
		lbFieldNombre.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbFieldNombre.setBounds(241, 110, 105, 29);
		Productos.add(lbFieldNombre);
		
		lbcerrarSesionProductos = new JLabel("");
		lbcerrarSesionProductos.setForeground(Color.WHITE);
		lbcerrarSesionProductos.setBounds(436, 44, 31, 30);
		Productos.add(lbcerrarSesionProductos);
		fotoEscalarLabel(lbcerrarSesionProductos, "assets/finSesion.png");
		
		lbmostrarHoraProductos = new JLabel("16 : 42");
		lbmostrarHoraProductos.setForeground(Color.WHITE);
		lbmostrarHoraProductos.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		lbmostrarHoraProductos.setBounds(80, 44, 79, 23);
		Productos.add(lbmostrarHoraProductos);
		
		lbtituloProductos = new JLabel("Coffekie");
		lbtituloProductos.setForeground(Color.WHITE);
		lbtituloProductos.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lbtituloProductos.setBackground(Color.WHITE);
		lbtituloProductos.setBounds(221, 38, 119, 42);
		Productos.add(lbtituloProductos);
		
		separator_5 = new JSeparator();
		separator_5.setBounds(30, 90, 488, 25);
		Productos.add(separator_5);
		separator_5.setForeground(Color.WHITE);
		separator_5.setBackground(Color.WHITE);
		
		lbfondoProductos = new JLabel("");
		lbfondoProductos.setForeground(SystemColor.controlShadow);
		lbfondoProductos.setBounds(0, 0, 548, 502);
		fotoEscalarLabel(lbfondoProductos, "assets/fondo2.jpg");
		Productos.add(lbfondoProductos);
		
		Configuracion = new JPanel();
		Configuracion.setBounds(0, 0, 548, 502);
		contentPane.add(Configuracion);
		Configuracion.setLayout(null);
		Configuracion.setVisible(false);
		
		lbtextoEdicion = new JLabel("EDITAR DATOS");
		lbtextoEdicion.setForeground(Color.WHITE);
		lbtextoEdicion.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoEdicion.setBounds(213, 241, 154, 20);
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
		separator_7.setBounds(41, 236, 472, 14);
		Configuracion.add(separator_7);
		
		lbtextoDatosPersonales = new JLabel("DATOS PERSONALES");
		lbtextoDatosPersonales.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtextoDatosPersonales.setForeground(new Color(255, 255, 255));
		lbtextoDatosPersonales.setBounds(196, 97, 202, 20);
		Configuracion.add(lbtextoDatosPersonales);
		
		mensajeInformativoConfiguracion = new JLabel("");
		mensajeInformativoConfiguracion.setForeground(new Color(255, 0, 0));
		mensajeInformativoConfiguracion.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		mensajeInformativoConfiguracion.setBackground(new Color(255, 0, 0));
		mensajeInformativoConfiguracion.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeInformativoConfiguracion.setBounds(64, 444, 413, 14);
		Configuracion.add(mensajeInformativoConfiguracion);
		
		textJIConf = new JTextField();
		textJIConf.setHorizontalAlignment(SwingConstants.CENTER);
		textJIConf.setColumns(10);
		textJIConf.setBounds(172, 398, 120, 20);
		Configuracion.add(textJIConf);
		
		textPassConf = new JTextField();
		textPassConf.setHorizontalAlignment(SwingConstants.CENTER);
		textPassConf.setColumns(10);
		textPassConf.setBounds(172, 283, 120, 20);
		Configuracion.add(textPassConf);
		
		textJFConf = new JTextField();
		textJFConf.setHorizontalAlignment(SwingConstants.CENTER);
		textJFConf.setColumns(10);
		textJFConf.setBounds(172, 359, 120, 20);
		Configuracion.add(textJFConf);
		
		textSueldoConf = new JTextField();
		textSueldoConf.setHorizontalAlignment(SwingConstants.CENTER);
		textSueldoConf.setColumns(10);
		textSueldoConf.setBounds(172, 322, 120, 20);
		Configuracion.add(textSueldoConf);
		
		btnGuardarInfo = new JButton("Guardar");
		btnGuardarInfo.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnGuardarInfo.setBackground(new Color(255, 255, 255));
		btnGuardarInfo.setBounds(369, 299, 97, 43);
		Configuracion.add(btnGuardarInfo);
		
		btnEliminarUser = new JButton("Eliminar");
		btnEliminarUser.setBackground(new Color(255, 128, 128));
		btnEliminarUser.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnEliminarUser.setBounds(369, 375, 97, 43);
		Configuracion.add(btnEliminarUser);
		
		lbtextoEditSueldo = new JLabel("Sueldo*");
		lbtextoEditSueldo.setForeground(Color.WHITE);
		lbtextoEditSueldo.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoEditSueldo.setBounds(53, 321, 109, 25);
		Configuracion.add(lbtextoEditSueldo);
		
		lbtextoEditContraseña = new JLabel("Contraseña*");
		lbtextoEditContraseña.setForeground(new Color(255, 255, 255));
		lbtextoEditContraseña.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoEditContraseña.setBounds(53, 281, 120, 25);
		Configuracion.add(lbtextoEditContraseña);
		
		lbtextoEditJornadaInicio = new JLabel("Jornada Inicio*");
		lbtextoEditJornadaInicio.setForeground(new Color(255, 255, 255));
		lbtextoEditJornadaInicio.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoEditJornadaInicio.setBounds(53, 397, 120, 25);
		Configuracion.add(lbtextoEditJornadaInicio);
		
		lbtextoEditJornadaFin = new JLabel("Jornada Fin*");
		lbtextoEditJornadaFin.setForeground(new Color(255, 255, 255));
		lbtextoEditJornadaFin.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lbtextoEditJornadaFin.setBounds(53, 358, 120, 25);
		Configuracion.add(lbtextoEditJornadaFin);
		
		lbcerrarSesionConfiguracion = new JLabel("");
		lbcerrarSesionConfiguracion.setForeground(Color.WHITE);
		lbcerrarSesionConfiguracion.setBounds(432, 44, 31, 30);
		Configuracion.add(lbcerrarSesionConfiguracion);
		fotoEscalarLabel(lbcerrarSesionConfiguracion, "assets/finSesion.png");
		
		lbmostrarHoraConfiguracion = new JLabel("16 : 42");
		lbmostrarHoraConfiguracion.setForeground(Color.WHITE);
		lbmostrarHoraConfiguracion.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		lbmostrarHoraConfiguracion.setBounds(80, 44, 86, 23);
		Configuracion.add(lbmostrarHoraConfiguracion);
		
		lbtituloConfiguracion = new JLabel("Coffekie");
		lbtituloConfiguracion.setForeground(Color.WHITE);
		lbtituloConfiguracion.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lbtituloConfiguracion.setBackground(Color.WHITE);
		lbtituloConfiguracion.setBounds(225, 38, 119, 42);
		Configuracion.add(lbtituloConfiguracion);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBackground(Color.WHITE);
		separator_2.setBounds(30, 90, 472, 14);
		Configuracion.add(separator_2);
		
		lbfondoBack = new JLabel("");
		lbfondoBack.setBounds(0, 0, 548, 502);
		Configuracion.add(lbfondoBack);
		fotoEscalarLabel(lbfondoBack, "assets/fondo2.jpg");
		
		Documentacion_1 = new JPanel();
		Documentacion_1.setBounds(0, 0, 548, 502);
		contentPane.add(Documentacion_1);
		Documentacion_1.setLayout(null);
		Documentacion_1.setVisible(false);
		
		lbSubtitulo = new JLabel("Elige una opcion que descubrir:");
		lbSubtitulo.setForeground(new Color(255, 255, 255));
		lbSubtitulo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbSubtitulo.setBounds(163, 224, 221, 14);
		Documentacion_1.add(lbSubtitulo);
		
		separator_21 = new JSeparator();
		separator_21.setOrientation(SwingConstants.VERTICAL);
		separator_21.setForeground(Color.WHITE);
		separator_21.setBounds(400, 221, 15, 118);
		Documentacion_1.add(separator_21);
		
		separator_20 = new JSeparator();
		separator_20.setOrientation(SwingConstants.VERTICAL);
		separator_20.setForeground(Color.WHITE);
		separator_20.setBounds(131, 221, 15, 118);
		Documentacion_1.add(separator_20);
		
		separator_19 = new JSeparator();
		separator_19.setForeground(Color.WHITE);
		separator_19.setBounds(131, 337, 273, 2);
		Documentacion_1.add(separator_19);
		
		separator_18 = new JSeparator();
		separator_18.setForeground(new Color(255, 255, 255));
		separator_18.setBounds(131, 221, 273, 2);
		Documentacion_1.add(separator_18);
		
		textAreaInformacionGeneral = new JTextArea();
		textAreaInformacionGeneral.setEditable(false);
		textAreaInformacionGeneral.setBackground(new Color(143, 143, 143));
		textAreaInformacionGeneral.setForeground(new Color(255, 255, 255));
		textAreaInformacionGeneral.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		textAreaInformacionGeneral.setBounds(52, 118, 440, 92);
		Documentacion_1.add(textAreaInformacionGeneral);
		
		scrollPaneDoc = new JScrollPane();
		scrollPaneDoc.setBounds(52, 350, 440, 83);
		Documentacion_1.add(scrollPaneDoc);
		scrollPaneDoc.setVisible(false);
		
		textAreaComboBox = new JTextArea();
		textAreaComboBox.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		textAreaComboBox.setForeground(new Color(255, 255, 255));
		textAreaComboBox.setBackground(new Color(143, 143, 143));
		scrollPaneDoc.setViewportView(textAreaComboBox);
		textAreaComboBox.setVisible(false);
		
		comboBoxOpciones = new JComboBox();
		comboBoxOpciones.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		comboBoxOpciones.setModel(new DefaultComboBoxModel(new String[] {"¿Que es Coffekie?", "Datos relevantes", "Politica de privavidad"}));
		comboBoxOpciones.setBounds(192, 249, 152, 22);
		Documentacion_1.add(comboBoxOpciones);
		
		lbcerrarSesionDOC= new JLabel("");
		lbcerrarSesionDOC.setForeground(Color.WHITE);
		lbcerrarSesionDOC.setBounds(261, 448, 31, 30);
		Documentacion_1.add(lbcerrarSesionDOC);
		fotoEscalarLabel(lbcerrarSesionDOC, "assets/finSesion.png");
		
		lbmostrarFechaDOC = new JLabel("2024-10-24");
		lbmostrarFechaDOC.setForeground(Color.WHITE);
		lbmostrarFechaDOC.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbmostrarFechaDOC.setBounds(395, 44, 103, 23);
		Documentacion_1.add(lbmostrarFechaDOC);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(30, 90, 488, 25);
		Documentacion_1.add(separator_1);
		
		lbmostrarHoraDOC = new JLabel("12 : 10");
		lbmostrarHoraDOC.setForeground(Color.WHITE);
		lbmostrarHoraDOC.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		lbmostrarHoraDOC.setBounds(88, 44, 86, 23);
		Documentacion_1.add(lbmostrarHoraDOC);
		
		lbtituloDOC = new JLabel("Coffekie");
		lbtituloDOC.setForeground(Color.WHITE);
		lbtituloDOC.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lbtituloDOC.setBackground(Color.WHITE);
		lbtituloDOC.setBounds(225, 38, 119, 42);
		Documentacion_1.add(lbtituloDOC);
		
		lbfondoDocumentacion = new JLabel("");
		lbfondoDocumentacion.setBounds(0, 0, 548, 502);
		Documentacion_1.add(lbfondoDocumentacion);
		fotoEscalarLabel(lbfondoDocumentacion, "assets/fondo2.jpg");
		
		Principal = new JPanel();
		Principal.setBounds(0, 0, 548, 502);
		contentPane.add(Principal);
		Principal.setLayout(null);
		Principal.setVisible(false);
		
		lbensajeInformativoMenu = new JLabel("Coofekie@2024LNCB");
		lbensajeInformativoMenu.setForeground(new Color(255, 255, 255));
		lbensajeInformativoMenu.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		lbensajeInformativoMenu.setBounds(173, 440, 204, 27);
		Principal.add(lbensajeInformativoMenu);
		
		separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBackground(Color.WHITE);
		separator_6.setBounds(30, 429, 488, 25);
		Principal.add(separator_6);
		
		lbCajaRegistradora = new JLabel("");
		lbCajaRegistradora.setBounds(40, 161, 63, 47);
		Principal.add(lbCajaRegistradora);
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
		fotoEscalarLabel(mesa1, "assets/mesas.png");
		
		lbfotoContabilidad = new JLabel("");
		lbfotoContabilidad.setBounds(477, 161, 46, 40);
		Principal.add(lbfotoContabilidad);
		fotoEscalarLabel(lbfotoContabilidad, "assets/contabilidad.png");
		
		lbfotoInventario = new JLabel("");
		lbfotoInventario.setBounds(472, 110, 46, 38);
		fotoEscalarLabel(lbfotoInventario, "assets/stock.png");
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
		lbnombreEmpleado.setBounds(393, 68, 88, 18);
		Principal.add(lbnombreEmpleado);
		lbnombreEmpleado.setForeground(Color.WHITE);
		lbnombreEmpleado.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		
		lbcerrarSesion = new JLabel("");
		lbcerrarSesion.setForeground(Color.WHITE);
		lbcerrarSesion.setBounds(487, 49, 31, 30);
		Principal.add(lbcerrarSesion);
		fotoEscalarLabel(lbcerrarSesion, "assets/finSesion.png");
		
		lbmostrarHoraPrincipal = new JLabel("16 : 42");
		lbmostrarHoraPrincipal.setForeground(Color.WHITE);
		lbmostrarHoraPrincipal.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		lbmostrarHoraPrincipal.setBounds(80, 44, 79, 23);
		Principal.add(lbmostrarHoraPrincipal);
		
		lbtituloPrincipal = new JLabel("Coffekie");
		lbtituloPrincipal.setForeground(Color.WHITE);
		lbtituloPrincipal.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lbtituloPrincipal.setBackground(Color.WHITE);
		lbtituloPrincipal.setBounds(221, 38, 119, 42);
		Principal.add(lbtituloPrincipal);
		
			JLabel lbPrincipalFondo = new JLabel("");
			lbPrincipalFondo.setBounds(0, 0, 548, 502);
			Principal.add(lbPrincipalFondo);
			fotoEscalarLabel(lbPrincipalFondo, "assets/fondo2.jpg");
		
		inicioSesion = new JPanel();
		inicioSesion.setBackground(new Color(255, 255, 255));
		inicioSesion.setBounds(0, 0, 548, 502);
		contentPane.add(inicioSesion);
		inicioSesion.setLayout(null);
		
		lbVerContraseña = new JLabel("");
		lbVerContraseña.setBackground(new Color(255, 255, 255));
		lbVerContraseña.setBounds(24, 299, 46, 37);
		inicioSesion.add(lbVerContraseña);
		fotoEscalarLabel(lbVerContraseña, "assets/no_ver.png");
		
		lbPaginaInformativa = new JLabel("");
		lbPaginaInformativa.setBounds(39, 53, 46, 45);
		inicioSesion.add(lbPaginaInformativa);
		fotoEscalarLabel(lbPaginaInformativa, "assets/fotoInformativa.png");
		
		labelFotoRegistro = new JLabel("");
		labelFotoRegistro.setBounds(367, 361, 37, 31);
		inicioSesion.add(labelFotoRegistro);
		fotoEscalarLabel(labelFotoRegistro, "assets/registro.png");
		
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
		textUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		textUsuario.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		textUsuario.setColumns(10);
		textUsuario.setBounds(207, 250, 146, 28);
		inicioSesion.add(textUsuario);
		
		textContraseña = new JPasswordField();
		textContraseña.setHorizontalAlignment(SwingConstants.CENTER);
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
		fotoEscalarLabel(lbmostrarLogo, "assets/logo3.png");
		
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
		
		lbmostrarHora = new JLabel("");
		lbmostrarHora.setForeground(new Color(255, 255, 255));
		lbmostrarHora.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lbmostrarHora.setBounds(367, 22, 78, 23);
		inicioSesion.add(lbmostrarHora);
		
		JLabel lbfondo = new JLabel("");
		lbfondo.setBounds(0, 0, 548, 502);
		inicioSesion.add(lbfondo);
		fotoEscalarLabel(lbfondo, "assets/fondo2.jpg");
		
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
		btnguardarPago.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
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
		fotoEscalarLabel(lbfondoPagos, "assets/fondo2.jpg");
		Pagos.add(lbfondoPagos);
		
		Contabilidad = new JPanel();
		Contabilidad.setBounds(0, 0, 548, 502);
		contentPane.add(Contabilidad);
		Contabilidad.setVisible(false);
		Contabilidad.setLayout(null);
		
		panelAuxiliarBanco = new JPanel();
		panelAuxiliarBanco.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		panelAuxiliarBanco.setBackground(new Color(192, 192, 192));
		panelAuxiliarBanco.setBounds(43, 185, 458, 271);
		panelAuxiliarBanco.setVisible(false);
		
		panelAuxiliarInventario = new JPanel();
		panelAuxiliarInventario.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		panelAuxiliarInventario.setBackground(new Color(192, 192, 192));
		panelAuxiliarInventario.setBounds(43, 185, 458, 271);
		panelAuxiliarInventario.setVisible(false);
		
		panelAuxiliarHistorial = new JPanel();
		panelAuxiliarHistorial.setLayout(null);
		panelAuxiliarHistorial.setVisible(false);
		panelAuxiliarHistorial.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panelAuxiliarHistorial.setBackground(Color.LIGHT_GRAY);
		panelAuxiliarHistorial.setBounds(43, 185, 458, 271);
		Contabilidad.add(panelAuxiliarHistorial);
		
		panelAuxiliarEstadisticas = new JPanel();
		panelAuxiliarEstadisticas.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		panelAuxiliarEstadisticas.setBackground(new Color(192, 192, 192));
		panelAuxiliarEstadisticas.setBounds(26, 55, 406, 213);
		panelAuxiliarHistorial.add(panelAuxiliarEstadisticas);
		panelAuxiliarEstadisticas.setVisible(false);
		panelAuxiliarEstadisticas.setLayout(null);
		
		lblNewLabel = new JLabel("Estadisticas");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblNewLabel.setBounds(156, 11, 109, 21);
		panelAuxiliarEstadisticas.add(lblNewLabel);
		
		lbcerrarSesionEstadisticas = new JLabel("");
		lbcerrarSesionEstadisticas.setForeground(Color.WHITE);
		lbcerrarSesionEstadisticas.setBounds(365, 6, 31, 30);
		fotoEscalarLabel(lbcerrarSesionEstadisticas, "assets/finSesion.png");
		panelAuxiliarEstadisticas.add(lbcerrarSesionEstadisticas);
		
		lbproductos = new JLabel("Mesas");
		lbproductos.setForeground(Color.WHITE);
		lbproductos.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbproductos.setBounds(301, 43, 65, 21);
		panelAuxiliarEstadisticas.add(lbproductos);
		
		separator_16 = new JSeparator();
		separator_16.setForeground(new Color(255, 255, 255));
		separator_16.setBounds(10, 40, 386, 2);
		separator_16.setVisible(false);
		panelAuxiliarEstadisticas.add(separator_16);
		
		lbestadisticaMesa1 = new JLabel("Mesa 1");
		lbestadisticaMesa1.setForeground(Color.WHITE);
		lbestadisticaMesa1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbestadisticaMesa1.setBounds(10, 68, 73, 21);
		panelAuxiliarEstadisticas.add(lbestadisticaMesa1);
		
		lbestadisticaMesa2 = new JLabel("Mesa 2");
		lbestadisticaMesa2.setForeground(Color.WHITE);
		lbestadisticaMesa2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbestadisticaMesa2.setBounds(10, 91, 73, 21);
		panelAuxiliarEstadisticas.add(lbestadisticaMesa2);
		
		lbestadisticaMesa3 = new JLabel("Mesa 3");
		lbestadisticaMesa3.setForeground(Color.WHITE);
		lbestadisticaMesa3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbestadisticaMesa3.setBounds(10, 113, 73, 21);
		panelAuxiliarEstadisticas.add(lbestadisticaMesa3);
		
		lbestadisticaMesa4 = new JLabel("Mesa 4");
		lbestadisticaMesa4.setForeground(Color.WHITE);
		lbestadisticaMesa4.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbestadisticaMesa4.setBounds(10, 135, 73, 21);
		panelAuxiliarEstadisticas.add(lbestadisticaMesa4);
		
		lbestadisticaMesa5 = new JLabel("Mesa 5");
		lbestadisticaMesa5.setForeground(Color.WHITE);
		lbestadisticaMesa5.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbestadisticaMesa5.setBounds(10, 158, 73, 21);
		panelAuxiliarEstadisticas.add(lbestadisticaMesa5);
		
		lbestadisticaMesa6 = new JLabel("Mesa 6");
		lbestadisticaMesa6.setForeground(Color.WHITE);
		lbestadisticaMesa6.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbestadisticaMesa6.setBounds(10, 180, 73, 21);
		panelAuxiliarEstadisticas.add(lbestadisticaMesa6);
		
		progressBarEstadisticaMesa1 = new JProgressBar();
		progressBarEstadisticaMesa1.setBounds(80, 73, 146, 14);
		progressBarEstadisticaMesa1.setStringPainted(true);
		panelAuxiliarEstadisticas.add(progressBarEstadisticaMesa1);
		progressBarEstadisticaMesa1.setForeground(Color.BLUE);
		progressBarEstadisticaMesa1.setMaximum(10);
		
		progressBarEstadisticaMesa2 = new JProgressBar();
		progressBarEstadisticaMesa2.setBounds(80, 96, 146, 14);
		progressBarEstadisticaMesa2.setForeground(Color.RED);
		progressBarEstadisticaMesa2.setStringPainted(true);
		panelAuxiliarEstadisticas.add(progressBarEstadisticaMesa2);
		progressBarEstadisticaMesa2.setMaximum(10);
		
		progressBarEstadisticaMesa3 = new JProgressBar();
		progressBarEstadisticaMesa3.setBounds(80, 118, 146, 14);
		progressBarEstadisticaMesa3.setForeground(Color.MAGENTA);
		progressBarEstadisticaMesa3.setStringPainted(true);
		panelAuxiliarEstadisticas.add(progressBarEstadisticaMesa3);
		progressBarEstadisticaMesa3.setMaximum(10);
		
		progressBarEstadisticaMesa4 = new JProgressBar();
		progressBarEstadisticaMesa4.setBounds(80, 140, 146, 14);
		progressBarEstadisticaMesa4.setForeground(Color.YELLOW);
		progressBarEstadisticaMesa4.setStringPainted(true);
		panelAuxiliarEstadisticas.add(progressBarEstadisticaMesa4);
		progressBarEstadisticaMesa4.setMaximum(10);
		
		progressBarEstadisticaMesa5 = new JProgressBar();
		progressBarEstadisticaMesa5.setBounds(80, 163, 146, 14);
		progressBarEstadisticaMesa5.setForeground(Color.GREEN);
		progressBarEstadisticaMesa5.setStringPainted(true);
		panelAuxiliarEstadisticas.add(progressBarEstadisticaMesa5);
		progressBarEstadisticaMesa5.setMaximum(10);
		
		progressBarEstadisticaMesa6 = new JProgressBar();
		progressBarEstadisticaMesa6.setBounds(80, 185, 146, 14);
		progressBarEstadisticaMesa6.setForeground(Color.ORANGE);
		progressBarEstadisticaMesa6.setStringPainted(true);
		panelAuxiliarEstadisticas.add(progressBarEstadisticaMesa6);
		progressBarEstadisticaMesa6.setMaximum(10);
		
		listEstadisticasMesa = new JList();
		listEstadisticasMesa.setBounds(276, 70, 109, 118);
		panelAuxiliarEstadisticas.add(listEstadisticasMesa);
		
		separator_17 = new JSeparator();
		separator_17.setForeground(new Color(255, 255, 255));
		separator_17.setOrientation(SwingConstants.VERTICAL);
		separator_17.setBounds(258, 43, 16, 170);
		panelAuxiliarEstadisticas.add(separator_17);
		
		lbtotalComandas = new JLabel("Total:");
		lbtotalComandas.setForeground(Color.WHITE);
		lbtotalComandas.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbtotalComandas.setBounds(10, 43, 47, 21);
		panelAuxiliarEstadisticas.add(lbtotalComandas);
		
		lbnumComandasTotales = new JLabel("");
		lbnumComandasTotales.setForeground(Color.WHITE);
		lbnumComandasTotales.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbnumComandasTotales.setBounds(58, 43, 47, 21);
		panelAuxiliarEstadisticas.add(lbnumComandasTotales);
		
		lbtituloHistorial = new JLabel("Historial Comandas");
		lbtituloHistorial.setForeground(Color.WHITE);
		lbtituloHistorial.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtituloHistorial.setBounds(149, 11, 175, 20);
		panelAuxiliarHistorial.add(lbtituloHistorial);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBackground(new Color(220, 20, 60));
		btnLimpiar.setForeground(new Color(255, 255, 255));
		btnLimpiar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		btnLimpiar.setBounds(270, 213, 117, 42);
		panelAuxiliarHistorial.add(btnLimpiar);
		
		btnEstadisticas = new JButton("Estadisticas");
		btnEstadisticas.setBackground(new Color(0, 0, 0));
		btnEstadisticas.setForeground(new Color(255, 255, 255));
		btnEstadisticas.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		btnEstadisticas.setBounds(65, 213, 117, 42);
		panelAuxiliarHistorial.add(btnEstadisticas);
		
		separator_34 = new JSeparator();
		separator_34.setForeground(new Color(255, 255, 255));
		separator_34.setBounds(10, 42, 438, 2);
		separator_34.setVisible(false);
		panelAuxiliarHistorial.add(separator_34);
		
		scrollPaneHistorial = new JScrollPane();
		scrollPaneHistorial.setBounds(38, 58, 384, 146);
		panelAuxiliarHistorial.add(scrollPaneHistorial);
		
		tableHistorial = new JTable();
		tableHistorial.getTableHeader().setBackground(Color.RED);
		tableHistorial.getTableHeader().setForeground(Color.WHITE);
		
		tableHistorial.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), null, null, null));
		scrollPaneHistorial.setViewportView(tableHistorial);
		Contabilidad.add(panelAuxiliarInventario);
		panelAuxiliarInventario.setLayout(null);
		
		lbmaximo = new JLabel("MAX:100");
		lbmaximo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		lbmaximo.setBounds(66, 200, 46, 20);
		panelAuxiliarInventario.add(lbmaximo);
		
		lbmensajeInventario = new JLabel("");
		lbmensajeInventario.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbmensajeInventario.setBounds(127, 177, 141, 20);
		panelAuxiliarInventario.add(lbmensajeInventario);
		
		listInventario = new JList();
		listInventario.setBounds(307, 44, 133, 183);
		panelAuxiliarInventario.add(listInventario);
		
		btnGuardarEdicion = new JButton("Guardar cambios");
		btnGuardarEdicion.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		btnGuardarEdicion.setBounds(307, 228, 133, 23);
		btnGuardarEdicion.setVisible(false);
		panelAuxiliarInventario.add(btnGuardarEdicion);
		
		lbmostrarProductos = new JLabel("Productos");
		lbmostrarProductos.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbmostrarProductos.setBounds(334, 11, 80, 23);
		panelAuxiliarInventario.add(lbmostrarProductos);
		
		separator_25 = new JSeparator();
		separator_25.setOrientation(SwingConstants.VERTICAL);
		separator_25.setBounds(288, 0, 18, 271);
		panelAuxiliarInventario.add(separator_25);
		
		separator_26 = new JSeparator();
		separator_26.setBounds(8, 28, 277, 23);
		panelAuxiliarInventario.add(separator_26);
		
		textNombreProductoMostrado = new JTextField("");
		textNombreProductoMostrado.setEditable(false);
		textNombreProductoMostrado.setHorizontalAlignment(SwingConstants.CENTER);
		textNombreProductoMostrado.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		textNombreProductoMostrado.setBounds(8, 5, 141, 22);
		panelAuxiliarInventario.add(textNombreProductoMostrado);
		
		lbIdProductoMostrado = new JLabel("");
		lbIdProductoMostrado.setHorizontalAlignment(SwingConstants.CENTER);
		lbIdProductoMostrado.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbIdProductoMostrado.setBounds(165, 6, 72, 22);
		panelAuxiliarInventario.add(lbIdProductoMostrado);
		
		btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		btnEditar.setBounds(0, 248, 288, 23);
		btnEditar.setVisible(false);
		panelAuxiliarInventario.add(btnEditar);
		
		lbInventarioTipo = new JLabel();
		lbInventarioTipo.setText("Tipo");
		lbInventarioTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lbInventarioTipo.setForeground(new Color(0, 0, 0));
		lbInventarioTipo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbInventarioTipo.setBackground(Color.WHITE);
		lbInventarioTipo.setBounds(18, 39, 72, 20);
		panelAuxiliarInventario.add(lbInventarioTipo);
		
		lbInventarioPrecio = new JLabel();
		lbInventarioPrecio.setText("Precio");
		lbInventarioPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		lbInventarioPrecio.setForeground(new Color(0, 0, 0));
		lbInventarioPrecio.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbInventarioPrecio.setBackground(Color.WHITE);
		lbInventarioPrecio.setBounds(18, 86, 72, 20);
		panelAuxiliarInventario.add(lbInventarioPrecio);
		
		lbInventarioProveedor = new JLabel();
		lbInventarioProveedor.setText("Proveedor");
		lbInventarioProveedor.setHorizontalAlignment(SwingConstants.LEFT);
		lbInventarioProveedor.setForeground(new Color(0, 0, 0));
		lbInventarioProveedor.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbInventarioProveedor.setBackground(Color.WHITE);
		lbInventarioProveedor.setBounds(18, 130, 94, 20);
		panelAuxiliarInventario.add(lbInventarioProveedor);
		
		lbInventarioStock = new JLabel();
		lbInventarioStock.setText("Stock");
		lbInventarioStock.setHorizontalAlignment(SwingConstants.LEFT);
		lbInventarioStock.setForeground(new Color(0, 0, 0));
		lbInventarioStock.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbInventarioStock.setBackground(Color.WHITE);
		lbInventarioStock.setBounds(18, 177, 72, 20);
		panelAuxiliarInventario.add(lbInventarioStock);
		
		textInventarioTipo = new JTextField();
		textInventarioTipo.setEditable(false);
		textInventarioTipo.setBounds(18, 62, 86, 20);
		panelAuxiliarInventario.add(textInventarioTipo);
		textInventarioTipo.setColumns(10);
		
		textInventarioPrecio = new JTextField();
		textInventarioPrecio.setEditable(false);
		textInventarioPrecio.setColumns(10);
		textInventarioPrecio.setBounds(18, 108, 86, 20);
		panelAuxiliarInventario.add(textInventarioPrecio);
		
		textInventarioProveedor = new JTextField();
		textInventarioProveedor.setEditable(false);
		textInventarioProveedor.setColumns(10);
		textInventarioProveedor.setBounds(18, 154, 86, 20);
		panelAuxiliarInventario.add(textInventarioProveedor);
		
		textInventarioStock = new JTextField();
		textInventarioStock.setEditable(false);
		textInventarioStock.setColumns(10);
		textInventarioStock.setBounds(18, 200, 40, 20);
		panelAuxiliarInventario.add(textInventarioStock);
		
		progressBarInventario = new JProgressBar();
		progressBarInventario.setBounds(18, 228, 146, 14);
		panelAuxiliarInventario.add(progressBarInventario);
		
		lbInventarioImagen = new JLabel();
		lbInventarioImagen.setText("Imagen");
		lbInventarioImagen.setHorizontalAlignment(SwingConstants.LEFT);
		lbInventarioImagen.setForeground(Color.BLACK);
		lbInventarioImagen.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 17));
		lbInventarioImagen.setBackground(Color.WHITE);
		lbInventarioImagen.setBounds(175, 39, 72, 20);
		panelAuxiliarInventario.add(lbInventarioImagen);
		
		lbmostrarImagenInventario = new JLabel("");
		lbmostrarImagenInventario.setBounds(153, 73, 103, 77);
		panelAuxiliarInventario.add(lbmostrarImagenInventario);
		
		btnComprobarProductoInventario = new JButton("");
		btnComprobarProductoInventario.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		btnComprobarProductoInventario.setBounds(250, 2, 40, 27);
		panelAuxiliarInventario.add(btnComprobarProductoInventario);
		Contabilidad.add(panelAuxiliarBanco);
		panelAuxiliarBanco.setLayout(null);
		
		scrollPaneBanco = new JScrollPane();
		scrollPaneBanco.setBounds(30, 194, 398, 66);
		panelAuxiliarBanco.add(scrollPaneBanco);
		
		tableTransacciones = new JTable();
		tableTransacciones.getTableHeader().setBackground(Color.BLACK);
		tableTransacciones.getTableHeader().setForeground(Color.WHITE);
		scrollPaneBanco.setViewportView(tableTransacciones);
		tableTransacciones.setVisible(false);
		
		lbnombreCuenta = new JLabel("");
		lbnombreCuenta.setForeground(new Color(0, 0, 0));
		lbnombreCuenta.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbnombreCuenta.setBounds(121, 155, 93, 14);
		
		panelAuxiliarBanco.add(lbnombreCuenta);
		
		comboBoxBanco = new JComboBox();
		comboBoxBanco.setBounds(10, 29, 96, 22);
		panelAuxiliarBanco.add(comboBoxBanco);
		
		lbCuentas = new JLabel("Cuentas");
		lbCuentas.setForeground(new Color(255, 255, 255));
		lbCuentas.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbCuentas.setBounds(33, 11, 60, 14);
		panelAuxiliarBanco.add(lbCuentas);
		
		lblSaldos = new JLabel("Saldo");
		lblSaldos.setForeground(new Color(255, 255, 255));
		lblSaldos.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblSaldos.setBounds(163, 11, 41, 14);
		panelAuxiliarBanco.add(lblSaldos);
		
		lbMostrarSaldo = new JLabel();
		lbMostrarSaldo.setHorizontalAlignment(SwingConstants.CENTER);
		lbMostrarSaldo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbMostrarSaldo.setBounds(203, 7, 100, 20);
		lbMostrarSaldo.setVisible(false);
		panelAuxiliarBanco.add(lbMostrarSaldo);
		
		lbfechaContabilidad = new JLabel("");
		lbfechaContabilidad.setForeground(Color.WHITE);
		lbfechaContabilidad.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbfechaContabilidad.setBounds(352, 5, 96, 14);
		panelAuxiliarBanco.add(lbfechaContabilidad);
		
		separator_27 = new JSeparator();
		separator_27.setForeground(new Color(255, 255, 255));
		separator_27.setBounds(10, 143, 438, 14);
		panelAuxiliarBanco.add(separator_27);
		
		separator_28 = new JSeparator();
		separator_28.setOrientation(SwingConstants.VERTICAL);
		separator_28.setForeground(Color.WHITE);
		separator_28.setBounds(111, 3, 13, 141);
		panelAuxiliarBanco.add(separator_28);
		
		separator_29 = new JSeparator();
		separator_29.setOrientation(SwingConstants.VERTICAL);
		separator_29.setForeground(Color.WHITE);
		separator_29.setBounds(337, 3, 13, 28);
		panelAuxiliarBanco.add(separator_29);
		
		separator_30 = new JSeparator();
		separator_30.setForeground(Color.WHITE);
		separator_30.setBounds(111, 29, 347, 22);
		panelAuxiliarBanco.add(separator_30);
		
		btnIngresar = new JButton("");
		btnIngresar.setBackground(new Color(255, 255, 255));
		btnIngresar.setBounds(151, 79, 97, 53);
		panelAuxiliarBanco.add(btnIngresar);
		
		btnGastos = new JButton("");
		btnGastos.setBackground(new Color(255, 255, 255));
		btnGastos.setBounds(313, 80, 96, 52);
		panelAuxiliarBanco.add(btnGastos);
		
		lbModificar = new JLabel("Modificar");
		lbModificar.setForeground(Color.WHITE);
		lbModificar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbModificar.setBounds(250, 37, 70, 14);
		panelAuxiliarBanco.add(lbModificar);
		
		separator_31 = new JSeparator();
		separator_31.setForeground(Color.WHITE);
		separator_31.setBounds(111, 58, 347, 22);
		panelAuxiliarBanco.add(separator_31);
		
		lbcontraseñaBanco = new JLabel("Contraseña*");
		lbcontraseñaBanco.setForeground(Color.WHITE);
		lbcontraseñaBanco.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbcontraseñaBanco.setVisible(false);
		lbcontraseñaBanco.setBounds(128, 87, 86, 14);
		panelAuxiliarBanco.add(lbcontraseñaBanco);
		
		lbMostrarContraseñaBanco = new JLabel();
		lbMostrarContraseñaBanco.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbMostrarContraseñaBanco.setHorizontalAlignment(SwingConstants.CENTER);
		lbMostrarContraseñaBanco.setBounds(217, 84, 86, 20);
		panelAuxiliarBanco.add(lbMostrarContraseñaBanco);
		
		lbcantidadImpuesta = new JLabel("Cantidad*");
		lbcantidadImpuesta.setForeground(Color.WHITE);
		lbcantidadImpuesta.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbcantidadImpuesta.setVisible(false);
		lbcantidadImpuesta.setBounds(128, 118, 76, 14);
		panelAuxiliarBanco.add(lbcantidadImpuesta);
		
		textFieldCantidadBanco = new JTextField();
		textFieldCantidadBanco.setColumns(10);
		textFieldCantidadBanco.setBounds(217, 114, 86, 20);
		textFieldCantidadBanco.setVisible(false);
		panelAuxiliarBanco.add(textFieldCantidadBanco);
		
		rdbtnConcepto = new JRadioButton("Comandas");
		rdbtnConcepto.setBounds(327, 80, 109, 23);
		rdbtnConcepto.setVisible(false);
		panelAuxiliarBanco.add(rdbtnConcepto);
		
		lbconcepto = new JLabel("Concepto*");
		lbconcepto.setForeground(Color.WHITE);
		lbconcepto.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbconcepto.setVisible(false);
		lbconcepto.setBounds(352, 62, 76, 14);
		panelAuxiliarBanco.add(lbconcepto);
		
		rdbtnConcepto2 = new JRadioButton("Otros Ingresos");
		rdbtnConcepto2.setBounds(327, 110, 109, 23);
		rdbtnConcepto2.setVisible(false);
		panelAuxiliarBanco.add(rdbtnConcepto2);
		//ASIGNAR LOS BOTONES AL BUTTON GRUOUP
		grupoBotones.add(rdbtnConcepto);
		grupoBotones.add(rdbtnConcepto2);
		
		lbRetroceder = new JLabel("");
		lbRetroceder.setForeground(Color.WHITE);
		lbRetroceder.setBounds(421, 34, 27, 22);
		panelAuxiliarBanco.add(lbRetroceder);
		fotoEscalarLabel(lbRetroceder, "assets/finSesion.png");
		
		btnGuardarCambios = new JButton("Guardar");
		btnGuardarCambios.setBounds(116, 33, 89, 23);
		btnGuardarCambios.setVisible(false);
		panelAuxiliarBanco.add(btnGuardarCambios);
		
		lbmensajeInformativo = new JLabel("");
		lbmensajeInformativo.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbmensajeInformativo.setForeground(new Color(255, 255, 255));
		lbmensajeInformativo.setBounds(227, 153, 221, 22);
		panelAuxiliarBanco.add(lbmensajeInformativo);
		
		lbtextoMostrar = new JLabel("Transacciones");
		lbtextoMostrar.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbtextoMostrar.setForeground(new Color(255, 255, 255));
		lbtextoMostrar.setBounds(10, 155, 104, 14);
		panelAuxiliarBanco.add(lbtextoMostrar);
		
		separator_32 = new JSeparator();
		separator_32.setForeground(Color.WHITE);
		separator_32.setBounds(10, 179, 438, 14);
		panelAuxiliarBanco.add(separator_32);
		
		separator_33 = new JSeparator();
		separator_33.setOrientation(SwingConstants.VERTICAL);
		separator_33.setForeground(Color.WHITE);
		separator_33.setBounds(180, 143, 13, 37);
		panelAuxiliarBanco.add(separator_33);
		lbRetroceder.setVisible(false);
		
		lbContextoMenu = new JLabel("Seleccione la opcion que desee gestionar de las posibles");
		lbContextoMenu.setForeground(new Color(255, 255, 255));
		lbContextoMenu.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
		lbContextoMenu.setBounds(164, 93, 359, 22);
		Contabilidad.add(lbContextoMenu);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(29, 93, 125, 22);
		Contabilidad.add(menuBar);
		
		Menu = new JMenu("Contabilidad");
		Menu.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		Menu.setForeground(new Color(0, 0, 0));
		menuBar.add(Menu);
		
		menuHistorial = new JMenuItem("Historial");
		menuHistorial.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		Menu.add(menuHistorial);
		
		menuInventario = new JMenuItem("Inventario");
		menuInventario.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		Menu.add(menuInventario);
		
		menuBanco = new JMenuItem("Banco");
		menuBanco.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		Menu.add(menuBanco);
		
		separator_23 = new JSeparator();
		separator_23.setForeground(Color.WHITE);
		separator_23.setBackground(Color.WHITE);
		separator_23.setBounds(30, 90, 488, 25);
		Contabilidad.add(separator_23);
		
		lbtituloContabilidad = new JLabel("Coffekie");
		lbtituloContabilidad.setForeground(Color.WHITE);
		lbtituloContabilidad.setFont(new Font("Segoe Script", Font.BOLD, 24));
		lbtituloContabilidad.setBackground(Color.WHITE);
		lbtituloContabilidad.setBounds(221, 38, 114, 42);
		Contabilidad.add(lbtituloContabilidad);
		
		lbmostrarHoraContabilidad = new JLabel("16 : 42");
		lbmostrarHoraContabilidad.setForeground(Color.WHITE);
		lbmostrarHoraContabilidad.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 24));
		lbmostrarHoraContabilidad.setBounds(80, 44, 83, 23);
		Contabilidad.add(lbmostrarHoraContabilidad);
		
		lbcerrarSesionContabilidad = new JLabel("");
		lbcerrarSesionContabilidad.setForeground(Color.WHITE);
		lbcerrarSesionContabilidad.setBounds(418, 49, 31, 30);
		fotoEscalarLabel(lbcerrarSesionContabilidad, "assets/finSesion.png");
		Contabilidad.add(lbcerrarSesionContabilidad);
		
		lbtituloSeleccionado = new JLabel("");
		lbtituloSeleccionado.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lbtituloSeleccionado.setForeground(new Color(255, 255, 255));
		lbtituloSeleccionado.setBounds(354, 126, 95, 22);
		Contabilidad.add(lbtituloSeleccionado);
		
		separator_24 = new JSeparator();
		separator_24.setForeground(Color.WHITE);
		separator_24.setBackground(Color.WHITE);
		separator_24.setVisible(false);
		separator_24.setBounds(270, 159, 231, 25);
		Contabilidad.add(separator_24);
		
		lbfondoContabilidad = new JLabel("");
		lbfondoContabilidad.setBounds(0, 0, 548, 502);
		fotoEscalarLabel(lbfondoContabilidad, "assets/fondo2.jpg");
		Contabilidad.add(lbfondoContabilidad);
		
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
		lbPagar.setBounds(342, 436, 89, 42);
		Comanda.add(lbPagar);
		fotoEscalarLabel(lbPagar, "assets/pagar.png");
		Comanda.add(btnrestarComida);
		
		lbmensajePedido = new JLabel("");
		lbmensajePedido.setHorizontalAlignment(SwingConstants.CENTER);
		lbmensajePedido.setForeground(new Color(255, 255, 255));
		lbmensajePedido.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lbmensajePedido.setBounds(58, 441, 253, 27);
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
		fotoEscalarLabel(lbfondoComanda, "assets/fondo2.jpg");
	}//Interfaz
	
	private void fotoEscalarLabel(JLabel label, String url) {
		ImageIcon imagen=new ImageIcon(url);
    	Icon Icono=new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
    	label.setIcon(Icono);
	}//fotoEscalarLabel
}//InterfazFrame
