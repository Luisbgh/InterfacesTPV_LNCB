package Controlador;

import java.awt.Color;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import javax.swing.Icon;

import Vista.Interfaz;
import Modelo.Comanda;
import Modelo.Cuenta;
import Modelo.Empleado;
import Modelo.Mesa;
import Modelo.Producto;
import Modelo.Transaccion;

public class Funcionalidad implements ActionListener, MouseListener{

	Interfaz puntero=new Interfaz();
	//VARIABLES
	ArrayList<Empleado>empleados=new ArrayList<Empleado>();
	ArrayList<Mesa>mesas=new ArrayList<Mesa>();
	ArrayList<Producto>listaProductos=new ArrayList<Producto>();
	ArrayList<Comanda>comandas=new ArrayList<Comanda>();
	ArrayList<Cuenta>cuentas=new ArrayList<Cuenta>();
	ArrayList<Mesa>listaMesasExportar=new ArrayList<Mesa>();
	HashMap<String, Integer>items=new HashMap<String, Integer>();
	HashMap<String, Integer>listaProductosEstadisticas=new HashMap<String, Integer>();
	HashMap<String, Integer>listaMesasAtendidas=new HashMap<String, Integer>();
	HashMap<String, Integer>listaAux=new HashMap<String, Integer>();
	HashMap<String, Integer>estadisticasMesa=new HashMap<String, Integer>();
	DefaultListModel modeloComida=new DefaultListModel();
	DefaultListModel modeloBebida=new DefaultListModel();
	DefaultListModel modeloItems=new DefaultListModel();
	DefaultListModel modeloProductos=new DefaultListModel();
	DefaultListModel modeloEstadisticasMesas=new DefaultListModel();
	DefaultTableModel modeloTablaTransacciones=new DefaultTableModel();
	DefaultTableModel modeloTablaHistorial=new DefaultTableModel();
	DefaultTableModel modeloTablaMesas=new DefaultTableModel();
	DefaultTableModel modeloTablaProductos=new DefaultTableModel();
	DefaultTableModel modeloTablaComandasTotales=new DefaultTableModel();
	DefaultTableCellRenderer centrar=new DefaultTableCellRenderer();
	int hora, minutos, dineroTotal, horaMesa, minutoMesa, fechaMesa, mesa, mesaAux, cantidad=1,  cambioStock, numMesa=0, numComanda=0, contadorTransaccion=0;
	double precioTotal=0, precioProductos=0, precioPagar=0, dineroCaja=50;
	boolean cambios=false, pagar=false, edicion=false, deshabilitar=false;;
	ImageIcon imagenBoton;
	Icon icono;
	JLabel label1, label2;
	String texto="Bienvenidos a CoffeKie, en esta pagina os mostraremos informacion especifica sobre nosotros, tambien hemos incluido informacion de uso de la intefaz y informacion especifica de la politica de privacidad, esperamos que la intefaz se adapte a vuestras necesidades.";
	String empleado, minutoSet, fotoContraseña, tipoComida, producto, solicitud, item, productoInventario, tipoTransaccion;
	String[]divisionEntrada;
	Transaccion transaccion;
	//
	public Funcionalidad(Interfaz frame){
		puntero=frame;
		//ACTION LISTENER BOTONES
		puntero.btnRegistrarse.addActionListener(this);
		puntero.btnIniciar.addActionListener(this);
		puntero.comboBoxOpciones.addActionListener(this);
		puntero.btnGuardarInfo.addActionListener(this);
		puntero.btnEliminarUser.addActionListener(this);
		puntero.btnProductos.addActionListener(this);
		puntero.btnVisualizarDatosProducto.addActionListener(this);
		puntero.btnverBebida.addActionListener(this);
		puntero.btnverComida.addActionListener(this);
		//puntero.btnSetearStock.addActionListener(this);
		puntero.btnProducto1.addActionListener(this);
		puntero.btnProducto2.addActionListener(this);
		puntero.btnProducto3.addActionListener(this);
		puntero.btnProducto4.addActionListener(this);
		puntero.btnProducto5.addActionListener(this);
		puntero.btnProducto6.addActionListener(this);
		puntero.btnProducto7.addActionListener(this);
		puntero.btnProducto8.addActionListener(this);
		puntero.btnProducto9.addActionListener(this);
		puntero.btnrestarComida.addActionListener(this);
		puntero.btnguardarPago.addActionListener(this);
		puntero.btnDarCambio.addActionListener(this);
		puntero.btnContabilidad.addActionListener(this);
		puntero.menuInventario.addActionListener(this);
		puntero.menuBanco.addActionListener(this);
		puntero.menuHistorial.addActionListener(this);
		puntero.btnComprobarProductoInventario.addActionListener(this);
		puntero.btnEditar.addActionListener(this);
		puntero.btnGuardarEdicion.addActionListener(this);
		puntero.btnGastos.addActionListener(this);
		puntero.btnIngresar.addActionListener(this);
		puntero.btnGuardarCambios.addActionListener(this);
		puntero.btnLimpiar.addActionListener(this);
		puntero.btnEstadisticas.addActionListener(this);
		//MOUSE LISTENER
		puntero.lbcerrarSesion.addMouseListener(this);
		puntero.lbPaginaInformativa.addMouseListener(this);
		puntero.lbcerrarSesionDOC.addMouseListener(this);
		puntero.lbfotoSesion.addMouseListener(this);
		puntero.lbcerrarSesionConfiguracion.addMouseListener(this);
		puntero.lbVerContraseña.addMouseListener(this);
		puntero.lbcerrarSesionProductos.addMouseListener(this);
		puntero.lbcerrarSesionComanda.addMouseListener(this);
		puntero.mesa1.addMouseListener(this);
		puntero.mesa2.addMouseListener(this);
		puntero.mesa3.addMouseListener(this);
		puntero.mesa4.addMouseListener(this);
		puntero.mesa5.addMouseListener(this);
		puntero.mesa6.addMouseListener(this);
		puntero.lbPagar.addMouseListener(this);
		puntero.lbcerrarSesionPago.addMouseListener(this);
		puntero.lbcerrarSesionContabilidad.addMouseListener(this);
		puntero.lbRetroceder.addMouseListener(this);
		puntero.lbcerrarSesionEstadisticas.addMouseListener(this);
		//EMPLEADOS POR DEFECTO
		empleados.add(new Empleado("Tobias", "Tobi123", "8:00", " 16:00", 1250, "assets/perfil.png"));
		empleados.add(new Empleado("Margarita", "marge35", "16:00", " 24:00", 1450, "assets/perfil2.png"));
		empleados.add(new Empleado("Sebastian", "seBas54", "12:00", " 20:00", 1550, "assets/perfil.png"));
		//PRODUCTOS COMIDA
		listaProductos.add(new Producto("1", "Magdalena", "assets/magdalena.png", 1.50, "20", "Mercadona", "Comida"));
		listaProductos.add(new Producto("2", "Croisant", "assets/croisant.png", 1.25, "25", "Caseras" , "Comida"));
		listaProductos.add(new Producto("3", "Donut", "assets/donut.png", 1.00, "50", "Pasteleria Alton", "Comida" ));
		listaProductos.add(new Producto("5", "Galletas", "assets/galletas.png", 2.00, "60", "Caseras", "Comida" ));
		//PRODUCTOS BEBIDA
		listaProductos.add(new Producto("6", "Agua", "assets/agua.png", 0.80, "50", "Mercadona", "Bebida" ));
		listaProductos.add(new Producto("7", "Cafe con leche", "assets/cafeLeche.png", 1.25, "25", "Caseras", "Bebida" ));
		listaProductos.add(new Producto("8", "Cafe solo", "assets/cafeSolo.png", 1.00, "50", "Caseros", "Bebida" ));
		listaProductos.add(new Producto("9", "Capuccino", "assets/capuccino.png", 1.30, "15", "Caseros" , "Bebida"));
		listaProductos.add(new Producto("10", "Zumo Naranja", "assets/zumoNaranja.png", 1.75, "30", "Caseras", "Bebida" ));
		//CUENTAS
		cuentas.add(new Cuenta("General", "1234", 1200.65));
		cuentas.add(new Cuenta("Auxiliar", "4567", 127.50));
		//FECHA HORA
		establecerFechaHora();
		//TABLAS
		fabricarTablaTransacciones();
		fabricarTablaHistorial();
		fabricarTablaHistorialTotal();
		//MESAS
		mesas.add(new Mesa(1, String.valueOf(puntero.lbmostrarFecha.getText()), String.valueOf(puntero.lbmostrarHoraPrincipal.getText())));
		mesas.add(new Mesa(2, String.valueOf(puntero.lbmostrarFecha.getText()), String.valueOf(puntero.lbmostrarHoraPrincipal.getText())));
		mesas.add(new Mesa(3, String.valueOf(puntero.lbmostrarFecha.getText()), String.valueOf(puntero.lbmostrarHoraPrincipal.getText())));
		mesas.add(new Mesa(4, String.valueOf(puntero.lbmostrarFecha.getText()), String.valueOf(puntero.lbmostrarHoraPrincipal.getText())));
		mesas.add(new Mesa(5, String.valueOf(puntero.lbmostrarFecha.getText()), String.valueOf(puntero.lbmostrarHoraPrincipal.getText())));
		mesas.add(new Mesa(6, String.valueOf(puntero.lbmostrarFecha.getText()), String.valueOf(puntero.lbmostrarHoraPrincipal.getText())));
		//COMANDAS
		comandas.add(new Comanda(mesas));
		//ESTABLECER APERTURA
		cambiarHorario();
		//ESTABLECER DINEROCAJA
		double dineroCaja=50;
		//BOTON ICONO VISUALIZAR DATOS INVENTARIO
		escalarFotoBoton("assets/lupa.png", puntero.btnVisualizarDatosProducto);
		escalarFotoBoton("assets/bebidas.png", puntero.btnverBebida);
		escalarFotoBoton("assets/comidas.png", puntero.btnverComida);
		//escalarFotoBoton("assets/editarStock.png", puntero.btnSetearStock);
		escalarFotoBoton("assets/cambioCliente.png", puntero.btnDarCambio);
		escalarFotoBoton("assets/lupa.png", puntero.btnComprobarProductoInventario);
		escalarFotoBoton("assets/ingresarDinero.png", puntero.btnIngresar);
		escalarFotoBoton("assets/pasarDinero.png", puntero.btnGastos);
		//ESTABLECER CUENTAS
		opcionesComboBanco();
	}//Funcionalidad
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==puntero.btnIniciar) {
			iniciarSesion();
			dineroCaja=mostrarDineroCaja(dineroCaja);
		}//if
		if(e.getSource()==puntero.btnRegistrarse) {
			registrarEmpleado();
		}//if
		if(e.getSource()==puntero.comboBoxOpciones) {
			opcionCombo();
		}//if
		if(e.getSource()==puntero.btnGuardarInfo) {
			modificarUsuario();	
		}//if
		if(e.getSource()==puntero.btnEliminarUser) {
			eliminarUsuario();
		}//if
		if(e.getSource()==puntero.btnProductos) {
			gestionInventario();
		}//if
		if(e.getSource()==puntero.btnVisualizarDatosProducto) {
			visualizarDatosMenu();
		}//if
		if(e.getSource()==puntero.btnverBebida) {
			seteosLabelInventario();
			//puntero.textFieldEditarStock.setText("");
			fotoEscalarLabel(puntero.lbImagenInventario, "assets/productoDefecto.png");
			puntero.progressBarStock.setValue(0);
			modeloBebida.removeAllElements();
			tipoComida="Bebida";
			visualizarProducto(tipoComida, modeloBebida);
		}//if
		if(e.getSource()==puntero.btnverComida) {
			seteosLabelInventario();
			//puntero.textFieldEditarStock.setText("");
			fotoEscalarLabel(puntero.lbImagenInventario, "assets/productoDefecto.png");
			puntero.progressBarStock.setValue(0);
			modeloComida.removeAllElements();
			tipoComida="Comida";
			visualizarProducto(tipoComida, modeloComida);
		}//if
		
		if(e.getSource()==puntero.btnProducto1) {
			mesaAux=Integer.parseInt(puntero.textFieldNumMesa.getText());
			solicitud=listaProductos.get(0).getNombre();
			pedido(mesaAux, solicitud, precioTotal, puntero.lbNumeroMesa);
		}//if
		if(e.getSource()==puntero.btnProducto2) {
			mesaAux=Integer.parseInt(puntero.textFieldNumMesa.getText());
			solicitud=listaProductos.get(1).getNombre();
			pedido(mesaAux, solicitud, precioTotal, puntero.lbNumeroMesa);
		}
		if(e.getSource()==puntero.btnProducto3) {
			mesaAux=Integer.parseInt(puntero.textFieldNumMesa.getText());
			solicitud=listaProductos.get(2).getNombre();
			pedido(mesaAux, solicitud, precioTotal, puntero.lbNumeroMesa);
		}
		if(e.getSource()==puntero.btnProducto4) {
			mesaAux=Integer.parseInt(puntero.textFieldNumMesa.getText());
			solicitud=listaProductos.get(3).getNombre();
			pedido(mesaAux, solicitud, precioTotal, puntero.lbNumeroMesa);
		}
		if(e.getSource()==puntero.btnProducto5) {
			mesaAux=Integer.parseInt(puntero.textFieldNumMesa.getText());
			solicitud=listaProductos.get(4).getNombre();
			pedido(mesaAux, solicitud, precioTotal, puntero.lbNumeroMesa);
		}
		if(e.getSource()==puntero.btnProducto6) {
			mesaAux=Integer.parseInt(puntero.textFieldNumMesa.getText());
			solicitud=listaProductos.get(5).getNombre();
			pedido(mesaAux, solicitud, precioTotal, puntero.lbNumeroMesa);
		}
		if(e.getSource()==puntero.btnProducto7) {
			mesaAux=Integer.parseInt(puntero.textFieldNumMesa.getText());
			solicitud=listaProductos.get(6).getNombre();
			pedido(mesaAux, solicitud, precioTotal, puntero.lbNumeroMesa);
		}
		if(e.getSource()==puntero.btnProducto8) {
			mesaAux=Integer.parseInt(puntero.textFieldNumMesa.getText());
			solicitud=listaProductos.get(7).getNombre();
			pedido(mesaAux, solicitud, precioTotal, puntero.lbNumeroMesa);
		}
		if(e.getSource()==puntero.btnProducto9) {
			mesaAux=Integer.parseInt(puntero.textFieldNumMesa.getText());
			solicitud=listaProductos.get(8).getNombre();
			pedido(mesaAux, solicitud, precioTotal, puntero.lbNumeroMesa);
		}//if
		if(e.getSource()==puntero.btnrestarComida) {
			restarElementosMenu();
		}//if
		if(e.getSource()==puntero.btnguardarPago) {
			controlarPago(precioPagar);
		}//if
		if(e.getSource()==puntero.btnDarCambio) {
			generarCambio();
			puntero.textFieldAbonoCliente.setText("");
			puntero.textFieldAbonoCliente.setEditable(true);
			puntero.lbmensajeCambioCliente.setVisible(false);
			puntero.lbmensajeCambioCliente.setVisible(false);
			puntero.textFieldcambioTotal.setVisible(false);
			puntero.btnDarCambio.setVisible(false);
			
		}//if
		if(e.getSource()==puntero.btnContabilidad) {
			//CAMBIAMOS DE PANEL
			this.puntero.Principal.setVisible(false);
			this.puntero.Productos.setVisible(false);
			this.puntero.Configuracion.setVisible(false);
			this.puntero.Documentacion_1.setVisible(false);
			this.puntero.Comanda.setVisible(false);
			this.puntero.Pagos.setVisible(false);
			this.puntero.inicioSesion.setVisible(false);
			this.puntero.Contabilidad.setVisible(true);
		}//if
		if(e.getSource()==puntero.menuInventario) {
			this.puntero.lbtituloSeleccionado.setText("Inventario");
			this.puntero.panelAuxiliarBanco.setVisible(false);
			this.puntero.panelAuxiliarEstadisticas.setVisible(false);
			this.puntero.panelAuxiliarHistorial.setVisible(false);
			this.puntero.panelAuxiliarInventario.setVisible(true);
			this.puntero.separator_24.setVisible(true);
			//
			actualizarJlistArrayList(listaProductos);
			//
		}//if
		
		if(e.getSource()==puntero.btnComprobarProductoInventario) {
			mostrarProductosInventario();
		}//if
		if(e.getSource()==puntero.btnEditar) {
			puntero.textNombreProductoMostrado.setEditable(true);
			puntero.textInventarioProveedor.setEditable(true);
			puntero.textInventarioPrecio.setEditable(true);
			puntero.textInventarioTipo.setEditable(true);
			puntero.textInventarioStock.setEditable(true);
			puntero.btnEditar.setVisible(false);
			puntero.btnGuardarEdicion.setVisible(true);
			puntero.listInventario.setEnabled(false);
		}//if
		if(e.getSource()==puntero.btnGuardarEdicion) {
			
			seteoProductos();
			seteosDeEdicion();
			actualizarJlistArrayList(listaProductos);
				
		}//if
		if(e.getSource()==puntero.menuBanco) {
			this.puntero.lbtituloSeleccionado.setText("Banco");
			this.puntero.panelAuxiliarBanco.setVisible(true);
			this.puntero.panelAuxiliarHistorial.setVisible(false);
			this.puntero.panelAuxiliarInventario.setVisible(false);
			this.puntero.panelAuxiliarEstadisticas.setVisible(false);
			this.puntero.separator_24.setVisible(true);
			//
			puntero.comboBoxBanco.setEnabled(true);
			seteosCamposBanco();
			 
		}//if
		if(e.getSource()==puntero.btnIngresar) {
			tipoTransaccion="Ingreso";
			puntero.btnIngresar.setVisible(false);
			puntero.btnGastos.setVisible(false);
			//
			puntero.lbRetroceder.setVisible(true);
			puntero.rdbtnConcepto.setVisible(true);
			puntero.rdbtnConcepto.setText("Comandas");
			puntero.lbModificar.setText("Ingreso");
			//
		}//if
		if(e.getSource()==puntero.btnGastos) {
			tipoTransaccion="Gasto";
			puntero.btnIngresar.setVisible(false);
			puntero.btnGastos.setVisible(false);
			puntero.lbRetroceder.setVisible(true);
			//
			puntero.rdbtnConcepto.setVisible(true);
			puntero.rdbtnConcepto.setText("Inventario");
			puntero.rdbtnConcepto2.setVisible(true);
			puntero.rdbtnConcepto2.setText("Otros gastos");
			puntero.lbModificar.setText("Gasto");
		}//if
		if(e.getSource()==puntero.btnIngresar || e.getSource()==puntero.btnGastos) {
			puntero.lbcantidadImpuesta.setVisible(true);
			puntero.lbcontraseñaBanco.setVisible(true);
			puntero.lbconcepto.setVisible(true);
			puntero.btnGuardarCambios.setVisible(true);
			//
			puntero.lbMostrarContraseñaBanco.setVisible(true);
			puntero.textFieldCantidadBanco.setVisible(true);
			puntero.scrollPaneBanco.setVisible(true);
			puntero.tableTransacciones.setVisible(true);
			puntero.lbSaldo.setVisible(true);
			//
			DatosBanco();
			estadoSaldo();
			puntero.comboBoxBanco.setEnabled(false);
		}//if
		if(e.getSource()==puntero.btnGuardarCambios) {
			puntero.lbmensajeInformativo.setForeground(Color.RED);
			puntero.lbmensajeInformativo.setVisible(true);
			if(!puntero.textFieldCantidadBanco.getText().isBlank() && (puntero.rdbtnConcepto.isSelected() || puntero.rdbtnConcepto2.isSelected())) {
				if((Double.parseDouble(puntero.textFieldCantidadBanco.getText())) <= 0 || (Double.parseDouble(puntero.textFieldCantidadBanco.getText())) > 100000000){
					puntero.scrollPaneBanco.setVisible(false);
					puntero.tableTransacciones.setVisible(false);
					puntero.lbmensajeInformativo.setText("CANTIDAD NO PERMITIDA");
				}else {
					puntero.scrollPaneBanco.setVisible(true);
					puntero.tableTransacciones.setVisible(true);
					contadorTransaccion++;
					puntero.lbmensajeInformativo.setForeground(Color.WHITE);
					puntero.lbmensajeInformativo.setText("TRANSACCION COMPLETADA");
					transaccion=nuevaTransacciones(transaccion);
					insertarTransaccion(transaccion);
				}//else
			}else {
				puntero.scrollPaneBanco.setVisible(false);
				puntero.tableTransacciones.setVisible(false);
				puntero.lbmensajeInformativo.setText("TRANSACCION INCOMPLETA");
			}//else
		}//if
		if(e.getSource()==puntero.menuHistorial) {
			this.puntero.lbtituloSeleccionado.setText("Historial");
			this.puntero.panelAuxiliarBanco.setVisible(false);
			this.puntero.panelAuxiliarInventario.setVisible(false);
			this.puntero.panelAuxiliarHistorial.setVisible(true);
			this.puntero.panelAuxiliarEstadisticas.setVisible(false);
			this.puntero.separator_24.setVisible(true);
			this.puntero.btnEstadisticas.setVisible(true);
			this.puntero.btnLimpiar.setVisible(true);
			//
		}//if
		if(e.getSource()==puntero.btnLimpiar) {
			eliminarDatosTabla(modeloTablaHistorial, puntero.tableHistorial);
			puntero.tableHistorial.setModel(modeloTablaHistorial);
		}//if
		if(e.getSource()==puntero.btnEstadisticas) {
			this.puntero.panelAuxiliarEstadisticas.setVisible(true);
			this.puntero.panelAuxiliarBanco.setVisible(false);
			this.puntero.panelAuxiliarInventario.setVisible(false);
			this.puntero.panelAuxiliarHistorial.setVisible(true);
			this.puntero.lbcerrarSesionEstadisticas.setVisible(true);
			this.puntero.separator_34.setVisible(false);
			this.puntero.btnEstadisticas.setVisible(false);
			this.puntero.btnLimpiar.setVisible(false);
			this.puntero.separator_16.setVisible(true);
			//
			mostrarEstadisticasMesas();
		}//if

	}//actionPerformed
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource()==puntero.lbcerrarSesion) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Principal.setVisible(false);
				this.puntero.Productos.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.Pagos.setVisible(false);
				this.puntero.Contabilidad.setVisible(false);
				this.puntero.inicioSesion.setVisible(true);
				//SETEAMOS VALORES DE LA PANTALLA PRINCIPAL
				this.puntero.lbnombreEmpleado.setText("");
				this.puntero.labelFotoRegistro.setText("");
				this.puntero.lbcerrarSesion.setText("");
			}//if
		}//if
		if(e.getSource()==puntero.lbPaginaInformativa) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Principal.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.Productos.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.Pagos.setVisible(false);
				this.puntero.Contabilidad.setVisible(false);
				this.puntero.Documentacion_1.setVisible(true);
				//SETEAMOS VALORES DE LA PANTALLA PRINCIPAL
				this.puntero.lbnombreEmpleado.setText("");
				this.puntero.labelFotoRegistro.setText("");
				this.puntero.lbcerrarSesion.setText("");
				//AÑADIMOS INFORMACION AL LABEL Y LLAMAMOS AL METODO
				this.puntero.textAreaInformacionGeneral.setText(texto);
				this.puntero.textAreaInformacionGeneral.setLineWrap(true);
				this.puntero.textAreaInformacionGeneral.setWrapStyleWord(true);
				//OPCIONES COMBO BOX
				opcionCombo();
				//
			}//if	
		}//if
		if(e.getSource()==puntero.lbcerrarSesionDOC) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Principal.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Productos.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.Pagos.setVisible(false);
				this.puntero.Contabilidad.setVisible(false);
				this.puntero.inicioSesion.setVisible(true);
			}//if
		}//if
		if(e.getSource()==puntero.lbfotoSesion) {
			if(e.getClickCount()==1) {
				//MENSAJE INFORMATIVO INVISIBLE
				puntero.mensajeInformativoConfiguracion.setVisible(false);
				//DATOS USUARIO
				mostrarDatosUser();
				//CAMBIAMOS DE PANEL
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Principal.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.Productos.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.Pagos.setVisible(false);
				this.puntero.Contabilidad.setVisible(false);
				this.puntero.Configuracion.setVisible(true);
			}//if
		}//if
		if(e.getSource()==puntero.lbcerrarSesionConfiguracion) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				if(cambios) {
					this.puntero.Documentacion_1.setVisible(false);
					this.puntero.Configuracion.setVisible(false);
					this.puntero.Principal.setVisible(false);
					this.puntero.Productos.setVisible(false);
					this.puntero.Comanda.setVisible(false);
					this.puntero.Pagos.setVisible(false);
					this.puntero.Contabilidad.setVisible(false);
					this.puntero.inicioSesion.setVisible(true);
				}else {
					this.puntero.Documentacion_1.setVisible(false);
					this.puntero.Configuracion.setVisible(false);
					this.puntero.Productos.setVisible(false);
					this.puntero.Comanda.setVisible(false);
					this.puntero.inicioSesion.setVisible(false);
					this.puntero.Pagos.setVisible(false);
					this.puntero.Contabilidad.setVisible(false);
					this.puntero.Principal.setVisible(true);
				}//else
				//
				puntero.textPassConf.setText("");
				puntero.textJIConf.setText("");
				puntero.textJFConf.setText("");
				puntero.textSueldoConf.setText("");
			}//if
		}//if
		if(e.getSource()==puntero.lbVerContraseña) {
			if(e.getClickCount()==1) {
				fotoEscalarLabel(puntero.lbVerContraseña, "assets/ver.png");
				fotoContraseña="ver";
				puntero.textContraseña.setEchoChar('*');
			}//
		}//
		if(e.getSource()==puntero.lbVerContraseña) {
			if(e.getClickCount()==2) {
				fotoEscalarLabel(puntero.lbVerContraseña, "assets/no_ver.png");
				fotoContraseña="ver";
				caracteresContraseña(fotoContraseña);
			}//
		}//
		if(e.getSource()==puntero.lbcerrarSesionProductos) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Productos.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.Pagos.setVisible(false);
				this.puntero.Contabilidad.setVisible(false);
				this.puntero.Principal.setVisible(true);
				//
				puntero.lbtextoComida.setText("PRODUCTOS");
				puntero.lbFieldID.setText("");
				puntero.lbFieldNombre.setText("");
				puntero.lbFieldProveedor.setText("");
				puntero.lbFieldPrecio.setText("");
				fotoEscalarLabel(puntero.lbImagenInventario, "assets/productoDefecto.png");
				puntero.lbImagenInventario.setText("");
				
				//puntero.textFieldEditarStock.setText("");
				puntero.progressBarStock.setValue(0);
				modeloComida.removeAllElements();
				puntero.lbFieldNumStock.setText("");
				puntero.lbFieldTipo.setText("");
				puntero.lbmensajeStock.setVisible(false);
				//puntero.btnSetearStock.setEnabled(false);
				puntero.btnVisualizarDatosProducto.setEnabled(false);
				//
				modeloComida.clear();
				modeloBebida.clear();
			}//if
		}//if
		if(e.getSource()==puntero.lbcerrarSesionComanda) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Productos.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.Pagos.setVisible(false);
				this.puntero.Contabilidad.setVisible(false);
				this.puntero.Principal.setVisible(true);
				//
				precioTotal=Double.parseDouble(puntero.textFieldTotal.getText());
				mesaOcupada();
			}//if
		}//if
		if(e.getSource()==puntero.mesa1 || e.getSource()==puntero.mesa2 || e.getSource()==puntero.mesa3 || e.getSource()==puntero.mesa4 || e.getSource()==puntero.mesa5 || e.getSource()==puntero.mesa6) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Productos.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.Principal.setVisible(false);
				this.puntero.Pagos.setVisible(false);
				this.puntero.Contabilidad.setVisible(false);
				this.puntero.Comanda.setVisible(true);
				puntero.lbmensajePedido.setVisible(false);
				//
				if(pagar) {
					modeloItems.removeAllElements();
				}
			}//if
		}//if
		if(e.getSource()==puntero.mesa1) {
			if(e.getClickCount()==2) {
				mostrarObjetoMesa(puntero.lbNumeroMesa);
				establecerImagenesBotonMenu();
			}//if
		}//if
		if(e.getSource()==puntero.mesa2) {
			if(e.getClickCount()==2) {
				mostrarObjetoMesa(puntero.lbNumeroMesa_2);
				establecerImagenesBotonMenu();
			}//if
		}//if
		if(e.getSource()==puntero.mesa3) {
			if(e.getClickCount()==2) {
				mostrarObjetoMesa(puntero.lbNumeroMesa_3);
				establecerImagenesBotonMenu();
			}//if
		}//if
		if(e.getSource()==puntero.mesa4) {
			if(e.getClickCount()==2) {
				mostrarObjetoMesa(puntero.lbNumeroMesa_4);
				establecerImagenesBotonMenu();
			}//if
		}//if
		if(e.getSource()==puntero.mesa5) {
			if(e.getClickCount()==2) {
				mostrarObjetoMesa(puntero.lbNumeroMesa_5);
				establecerImagenesBotonMenu();
			}//if
		}//if
		if(e.getSource()==puntero.mesa6) {
			if(e.getClickCount()==2) {
				mostrarObjetoMesa(puntero.lbNumeroMesa_6);
				establecerImagenesBotonMenu();
			}//if
		}//if
		
		if(e.getSource()==puntero.lbPagar) {
			puntero.lbmensajePedido.setVisible(false);
			if(e.getClickCount()==2) {
				if(Double.parseDouble(puntero.textFieldTotal.getText())>0.0) {
					//
					numMesa=Integer.parseInt(puntero.textFieldNumMesa.getText());
					comandas.get(0).getMesas().get(numMesa - 1).setPagado(true);
					this.puntero.Productos.setVisible(false);
					this.puntero.Configuracion.setVisible(false);
					this.puntero.Documentacion_1.setVisible(false);
					this.puntero.Comanda.setVisible(false);
					this.puntero.inicioSesion.setVisible(false);
					this.puntero.Principal.setVisible(false);
					this.puntero.Contabilidad.setVisible(false);
					this.puntero.Pagos.setVisible(true);
					//
					precioPagar=controlarDatosPago(Double.parseDouble(puntero.textFieldTotal.getText()));
				}else {
					puntero.lbmensajePedido.setVisible(true);
					puntero.lbmensajePedido.setText("AÑADE ALGUN PRODUCTO");
				}//else
			}//if
		}//if
		if(e.getSource()==puntero.lbcerrarSesionPago) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				//
				this.puntero.Productos.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.Pagos.setVisible(false);
				this.puntero.Contabilidad.setVisible(false);
				this.puntero.Principal.setVisible(true);
				mesaOcupada();
				//
				puntero.lbmensajeDenegar.setVisible(false);
				puntero.lbmensajeCambioCliente.setVisible(false);
				puntero.textFieldcambioTotal.setVisible(false);
				puntero.btnDarCambio.setVisible(false);
				puntero.textFieldAbonoCliente.setText("");
				puntero.textFieldAbonoCliente.setEditable(true);
			}//if
		}//if
		if(e.getSource()==puntero.lbcerrarSesionContabilidad) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Productos.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.Pagos.setVisible(false);
				this.puntero.Contabilidad.setVisible(false);
				this.puntero.panelAuxiliarInventario.setVisible(false);
				this.puntero.panelAuxiliarBanco.setVisible(false);
				this.puntero.panelAuxiliarHistorial.setVisible(false);
				this.puntero.panelAuxiliarEstadisticas.setVisible(false);
				this.puntero.separator_16.setVisible(false);
				//
				this.puntero.lbtituloSeleccionado.setText("");
				this.puntero.separator_24.setVisible(false);
				this.puntero.Principal.setVisible(true);
				//
				 seteosDeEdicion();
				 puntero.lbmensajeInventario.setText("");
			}//if
		}//if
		if(e.getSource()==puntero.lbRetroceder) {
			if(e.getClickCount()==2) {
				seteosCamposBanco();
			}//if
		}//if
		if(e.getSource()==puntero.lbcerrarSesionEstadisticas) {
			if(e.getClickCount()==2) {
				this.puntero.panelAuxiliarEstadisticas.setVisible(false);
				this.puntero.panelAuxiliarBanco.setVisible(false);
				this.puntero.panelAuxiliarInventario.setVisible(false);
				this.puntero.panelAuxiliarHistorial.setVisible(true);
				this.puntero.lbcerrarSesionEstadisticas.setVisible(false);
				this.puntero.separator_34.setVisible(false);
				this.puntero.btnEstadisticas.setVisible(true);
				this.puntero.btnLimpiar.setVisible(true);
				this.puntero.separator_16.setVisible(false);
			}//if
		}//if
		
		
	}//mouseClicked

	@Override
	public void mousePressed(MouseEvent e) {
		
		
		
	}//mousePressed

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==puntero.lbfotoSesion){
			fotoEscalarLabel(puntero.lbfotoSesion, "assets/configuracion.png" );
		}//if
	}//mouseEntered

	@Override
	public void mouseExited(MouseEvent e) {
		
		if(e.getSource()==puntero.lbfotoSesion){
			String foto=cambioFoto();
			fotoEscalarLabel(puntero.lbfotoSesion, foto);
		}//if
		
	}
	
	public void caracteresContraseña(String foto) {
		puntero.textContraseña.setEchoChar((char)0);
	}//if
	
	private void fotoEscalarLabel(JLabel label, String url) {
		ImageIcon imagen=new ImageIcon(url);
    	Icon Icono=new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
    	label.setIcon(Icono);
	}//fotoEscalarLabel
	
	public void registrarEmpleado() {
		
		String nombre, contraseña;
		Empleado empleado;
		boolean encontrar=false;
		if(!puntero.textUsuario.getText().isEmpty() && !puntero.textContraseña.getText().isEmpty()) {
			nombre=puntero.textUsuario.getText();
			contraseña=puntero.textContraseña.getText();
			//CREACION EMPLEADO Y INSERCCION EN LA LISTA
			empleado=new Empleado(nombre, contraseña, "16:00", "22:00", 1200, "assets/perfil3.png");
			for(int i=0; i<empleados.size(); i++) {
				if(empleados.get(i).getNombre().equalsIgnoreCase(nombre) && empleados.get(i).getContraseña().equals(contraseña)) {
					encontrar=true;
				}//if
			}//for
			if(encontrar) {
				puntero.mensajeInformativo.setVisible(true);
				puntero.mensajeInformativo.setForeground(Color.RED);
				puntero.mensajeInformativo.setText("USUARIO YA EXISTENTE");
			}else {
				empleados.add(empleado);
				puntero.mensajeInformativo.setVisible(true);
				puntero.mensajeInformativo.setForeground(Color.WHITE);
				puntero.mensajeInformativo.setText("USUARIO CREADO CORRECTAMENTE");
			}//else
			//puntero.textUsuario.
		}else {
			puntero.mensajeInformativo.setVisible(true);
			if(puntero.textUsuario.getText().isEmpty()) {
				puntero.mensajeInformativo.setForeground(Color.RED);
				puntero.mensajeInformativo.setText("!CAMPO DE USUARIO OBLIGATORIO");
			}//if
			if(puntero.textContraseña.getText().isEmpty()) {
				puntero.mensajeInformativo.setForeground(Color.RED);
				puntero.mensajeInformativo.setText("!CAMPO DE CONTRASEÑA OBLIGATORIO");
			}//if
			if(puntero.textContraseña.getText().isEmpty() && puntero.textUsuario.getText().isEmpty()) {
				puntero.mensajeInformativo.setForeground(Color.RED);
				puntero.mensajeInformativo.setText("!CAMPO DE USUARIO Y CONTRASEÑA OBLIGATORIO");
			}//if
		}//else
		
	}//registrarEmpleado
	
	public void iniciarSesion() {
		
		String nombre, contraseña;
		//
		nombre=puntero.textUsuario.getText();
		contraseña=puntero.textContraseña.getText();
		//
		if(puntero.textUsuario.getText().isEmpty()) {
			puntero.mensajeInformativo.setVisible(true);
			puntero.mensajeInformativo.setForeground(Color.RED);
			puntero.mensajeInformativo.setText("!CAMPO DE USUARIO OBLIGATORIO");
		}else if(puntero.textContraseña.getText().isEmpty()) {
			puntero.mensajeInformativo.setVisible(true);
			puntero.mensajeInformativo.setForeground(Color.RED);
			puntero.mensajeInformativo.setText("!CAMPO DE CONTRASEÑA OBLIGATORIO");
		}else if(!puntero.textContraseña.getText().isEmpty()  && !puntero.textUsuario.getText().isEmpty()) {
			comprobarUsuario(nombre, contraseña);
		}//else if
		
	}//iniciarSesion
	
	public void comprobarUsuario(String nombre, String contraseña) {
		
		boolean encontrar=false;
		String foto=null;
		String causa;
		puntero.mensajeInformativo.setVisible(false);
		for(int i=0; i<empleados.size(); i++) {
			if(empleados.get(i).getNombre().equalsIgnoreCase(nombre) && empleados.get(i).getContraseña().equals(contraseña)) {
				encontrar=true;
			}else{
				if(empleados.get(i).getNombre().equalsIgnoreCase(nombre) && !empleados.get(i).getContraseña().equals(contraseña)) {
					puntero.mensajeInformativo.setVisible(true);
					puntero.mensajeInformativo.setForeground(Color.RED);
					puntero.mensajeInformativo.setText("!CONTRASEÑA INCORRECTO");
				}//if
				if(!empleados.get(i).getNombre().equalsIgnoreCase(nombre) && empleados.get(i).getContraseña().equals(contraseña)){
					puntero.mensajeInformativo.setVisible(true);
					puntero.mensajeInformativo.setForeground(Color.RED);
					puntero.mensajeInformativo.setText("!USUARIO INCORRECTO");
				}else if(!empleados.get(i).getNombre().equalsIgnoreCase(nombre) && !empleados.get(i).getContraseña().equals(contraseña)) {
					puntero.mensajeInformativo.setVisible(true);
					puntero.mensajeInformativo.setForeground(Color.RED);
					puntero.mensajeInformativo.setText("!USUARIO NO ENCONTRADO");
				}//else if
			}//else
		}//for
		if(encontrar) {
			puntero.mensajeInformativo.setVisible(true);
			puntero.mensajeInformativo.setForeground(Color.WHITE);
			puntero.mensajeInformativo.setText("INICIANDO SESION...");
			//CAMBIAMOS DE PANEL
			puntero.inicioSesion.setVisible(false);
			puntero.Documentacion_1.setVisible(false);
			puntero.Principal.setVisible(true);
			//SEATAMOS CAMPOS Y MENSAJES DEL INICIO DE SESION PARA AL VOLVER A INICAR QUE ESTEN VACIOS
			puntero.textContraseña.setText("");
			puntero.textUsuario.setText("");
			puntero.mensajeInformativo.setText("");
			puntero.mensajeInformativo.setVisible(false);
			//FOTO Y NOMBRE EMPLEADO
			puntero.lbnombreEmpleado.setText(nombre);
			//
			for(int i=0; i<empleados.size(); i++) {
				if(empleados.get(i).getNombre().equalsIgnoreCase(nombre) && empleados.get(i).getContraseña().equals(contraseña)) {
					foto=empleados.get(i).getFoto();
				}//if
			}//for
			fotoEscalarLabel(puntero.lbfotoSesion, foto);
			empleado=nombre;
		}//if
		
	}//comprobarUsuario
	
	public void establecerFechaHora() {
		//FECHA
			puntero.lbmostrarFecha.setText(String.valueOf(LocalDate.now()));
			puntero.lbmostrarFechaDOC.setText(String.valueOf(LocalDate.now()));
			puntero.lbfechaContabilidad.setText(String.valueOf(LocalDate.now()));
		//HORAS MINUTOS
			hora=LocalTime.now().getHour();
			minutos=LocalTime.now().getMinute();
			if(minutos<10) {
				minutoSet="0" + minutos;
				puntero.lbmostrarHora.setText(String.valueOf((hora)) + " : " + minutoSet);
				puntero.lbmostrarHoraPrincipal.setText(String.valueOf((hora)) + " : " + minutoSet);
				puntero.lbmostrarHoraDOC.setText(String.valueOf((hora)) + " : " + minutoSet);
				puntero.lbmostrarHoraConfiguracion.setText(String.valueOf((hora)) + " : " + minutoSet);
				puntero.lbmostrarHoraProductos.setText(String.valueOf((hora)) + " : " + minutoSet);
				puntero.lbmostrarHoraComanda.setText(String.valueOf((hora)) +  " : " + minutoSet);
				puntero.lbmostrarHoraPago.setText(String.valueOf((hora)) +  " : " + minutoSet);
				puntero.lbmostrarHoraContabilidad.setText(String.valueOf((hora)) +  " : " + minutoSet);
			}else {
				puntero.lbmostrarHora.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraPrincipal.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraDOC.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraConfiguracion.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraComanda.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraProductos.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraPago.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraContabilidad.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
			}//else
	}//establecerFechaHora

	public String cambioFoto() {
		String foto=null;
		for(int i=0; i<empleados.size(); i++) {
			if(empleados.get(i).getNombre().equalsIgnoreCase(empleado)) {
				foto=empleados.get(i).getFoto();
			}//if
		}//for
		return foto;
	}//void
	
	public void opcionCombo() {
		//SIEMPRE ACTIVO
		this.puntero.textAreaComboBox.setLineWrap(true);
		this.puntero.textAreaComboBox.setWrapStyleWord(true);
		this.puntero.textAreaComboBox.setVisible(true);
		this.puntero.textAreaComboBox.setVisible(true);
		this.puntero.scrollPaneDoc.setVisible(true);
		//
		if(this.puntero.comboBoxOpciones.getSelectedIndex()==0) {
			this.puntero.textAreaComboBox.setText("Coofekie es una cafeteria que ha llegado para quedarse, nuestros servicios se basan en desayunos y meriendas, nuestro lema es servir siempre con una sonrisa y nuestro precios son asequibles");
		}//
		if(this.puntero.comboBoxOpciones.getSelectedIndex()==1) {
			this.puntero.textAreaComboBox.setText("Nuestra empresa se basa en principios de 2024, empezamos siendo un pequeño negocio en la C/Cartel Nº 14, donde seguimos instalado actualmente, fuimos creciendo con el tiempo. Gracias a nuestro buen trabajo hemos conseguido estar donde llegamos y poder incluso pedir un TPV personalizado a un programador");
		}//
		if(this.puntero.comboBoxOpciones.getSelectedIndex()==2) {
			this.puntero.textAreaComboBox.setText("La confidencialidad y la seguridad son valores primordiales de Coofekie y, en consecuencia, asumimos el compromiso de garantizar la privacidad del Usuario en todo momento y de no recabar información innecesaria. A continuación, le proporcionamos toda la información necesaria sobre nuestra Política de Privacidad en relación con los datos personales que recabamos, el cumplimiento de todas las politicas mostradas es completamente obligatorio al aceptar los acuerdos por defecto de los acuerdos previos");
		}//
		
	}//opcionCombo
	
	public void modificarUsuario() {
		
		puntero.mensajeInformativoConfiguracion.setVisible(true);
		int contador=0;
		if(!puntero.textPassConf.getText().isEmpty() && !puntero.textSueldoConf.getText().isEmpty() && !puntero.textJIConf.getText().isEmpty() && !puntero.textJFConf.getText().isEmpty() && !puntero.textFieldDatoUser.getText().isEmpty()) {
			for(int i=0; i<empleados.size(); i++) {
				if(puntero.textPassConf.getText().equalsIgnoreCase(empleados.get(i).getContraseña())) {
					puntero.mensajeInformativoConfiguracion.setText("!Contraseña ya existente");
					contador++;
				}//if
			}//for
		if(contador==0) {
			for(int i=0; i<empleados.size(); i++) {
				if(!empleados.get(i).getContraseña().equalsIgnoreCase(puntero.textFieldDatoPass.getText())) {
					empleados.get(i).setContraseña(puntero.textPassConf.getText());
					empleados.get(i).setJornadaFinal(puntero.textJFConf.getText());
					empleados.get(i).setJornadaInicio(puntero.textJIConf.getText());
					empleados.get(i).setSueldo(Integer.parseInt(puntero.textSueldoConf.getText()));
					//
					puntero.textPassConf.setText(empleados.get(i).getContraseña());
					puntero.textJIConf.setText(empleados.get(i).getJornadaInicio());
					puntero.textJFConf.setText(empleados.get(i).getJornadaFinal());
					puntero.textSueldoConf.setText(String.valueOf(empleados.get(i).getSueldo()));
					//
					puntero.mensajeInformativoConfiguracion.setForeground(Color.WHITE);
					puntero.mensajeInformativoConfiguracion.setText("!USUARIO MODIFICADO");
					//
					puntero.textFieldDatoPass.setText(puntero.textPassConf.getText());
					puntero.textFieldDatoInicio.setText(puntero.textJIConf.getText());
					puntero.textFieldDatoFin.setText(puntero.textJFConf.getText());
					puntero.textFieldDatoSueldo.setText(String.valueOf(puntero.textSueldoConf));
					//
					empleado=puntero.textFieldDatoUser.getText();
					//	
				}//if
			}//for
		}//if
		puntero.textSueldoConf.setText("");
		puntero.textJFConf.setText("");
		puntero.textJIConf.setText("");
		puntero.textPassConf.setText("");
		}else {
			puntero.mensajeInformativoConfiguracion.setText("!Debe rellenar todos los campos");			
		}//else
		cambios=true;
	}//modificarUsuario
	
	public void eliminarUsuario() {
		
		for(int i=0; i<empleados.size(); i++) {
			if(empleados.get(i).getNombre().equalsIgnoreCase(empleado)) {
				empleados.remove(i);
				puntero.mensajeInformativoConfiguracion.setForeground(Color.WHITE);
				puntero.mensajeInformativoConfiguracion.setVisible(true);
				puntero.mensajeInformativoConfiguracion.setText("!USUARIO " + empleado + " ELIMINADO");
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Principal.setVisible(false);
				this.puntero.Productos.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.Contabilidad.setVisible(false);
				this.puntero.inicioSesion.setVisible(true);
			}//if
		}//for
		
	}//eliminarUsuario
	
	public void gestionInventario() {
		
		//CAMBIAMOS DE PANEL
		this.puntero.Principal.setVisible(false);
		this.puntero.inicioSesion.setVisible(false);
		this.puntero.Documentacion_1.setVisible(false);
		this.puntero.Configuracion.setVisible(false);
		this.puntero.Comanda.setVisible(false);
		this.puntero.Contabilidad.setVisible(false);
		this.puntero.Productos.setVisible(true);
		
	}//gestionInventario
	
	public void cambiarHorario() {
		
		if((hora>=16 && hora<=22) || (hora>=7 && hora<=14)) {
			puntero.lbHorario.setForeground(Color.WHITE);
			puntero.lbHorario.setText("OPEN");
		}else {
			puntero.lbHorario.setForeground(Color.RED);
			puntero.lbHorario.setText("CLOSED");
		}//else
		
	}//cambiarHorario
	
	public double mostrarDineroCaja(double dinero) {
		
		double dineroAux=dinero;
		
		if(dineroAux>=0) {
			puntero.lbDinero.setForeground(Color.WHITE);
		}else {
			puntero.lbDinero.setForeground(Color.RED);
		}//else
		puntero.lbDinero.setText(String.valueOf(dineroAux) + " €");
		return dinero;
	}//mostrarDineroCaja
	
	public void mostrarDatosUser() {
		
		for(int i=0; i<empleados.size(); i++) {
			if(empleados.get(i).getNombre().equalsIgnoreCase(empleado)) {
				puntero.textFieldDatoUser.setText(empleados.get(i).getNombre());
				puntero.textFieldDatoPass.setText(empleados.get(i).getContraseña());
				puntero.textFieldDatoSueldo.setText(String.valueOf(empleados.get(i).getSueldo()));
				puntero.textFieldDatoInicio.setText(empleados.get(i).getJornadaInicio());
				puntero.textFieldDatoFin.setText(empleados.get(i).getJornadaFinal());
			}//if
		}//for
		
	}//mostrarDatosUser
	
	public void visualizarProducto(String tipoComida, DefaultListModel modelo) {
		
			for(int i=0; i<listaProductos.size(); i++) {
				if(listaProductos.get(i).getTipo().equalsIgnoreCase(tipoComida)) {
					modelo.addElement(listaProductos.get(i).getNombre());
				}//if
			}//for
			//
			puntero.listProductos.setModel(modelo);
			puntero.btnVisualizarDatosProducto.setEnabled(true);
		
	}//visualizarDatosProducto
	
	public void visualizarDatosMenu() {
		
		producto=String.valueOf(puntero.listProductos.getSelectedValue());
		for(int i=0; i<listaProductos.size(); i++) {
			if(String.valueOf(producto)!=null && listaProductos.get(i).getNombre()==producto) {
				puntero.lbFieldID.setText(listaProductos.get(i).getId());
				puntero.lbFieldNombre.setText(listaProductos.get(i).getNombre());
				puntero.lbFieldProveedor.setText(listaProductos.get(i).getProveedor());
				puntero.lbFieldPrecio.setText(listaProductos.get(i).getPrecio() + " €");
				puntero.lbFieldTipo.setText(listaProductos.get(i).getTipo());
				fotoEscalarLabel(puntero.lbImagenInventario, listaProductos.get(i).getFoto());
				puntero.progressBarStock.setValue(Integer.parseInt(listaProductos.get(i).getStock()));
				puntero.lbFieldNumStock.setText(String.valueOf(puntero.progressBarStock.getValue()));
				puntero.lbmensajeStock.setVisible(true);
				puntero.lbmensajeStock.setText("PRODUCTO - " + listaProductos.get(i).getNombre());
			}//if
		}//for
		controlStock(puntero.progressBarStock);
	
	}//visualizarDatosMenu
	
	public void establecerImagenesBotonMenu() {
		
		for(int i=0; i<listaProductos.size(); i++) {
			if(i==0) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto1);
			}
			if(i==1) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto2);
			}
			if(i==2) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto3);
			}
			if(i==3) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto4);
			}
			if(i==4) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto5);
			}
			if(i==5) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto6);
			}
			if(i==6) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto7);
			}
			if(i==7) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto8);
			}
			if(i==8) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto9);
			}
		}//for
		
	}//visualizarDatosMenu
	
	public void escalarFotoBoton(String url, JButton boton) {
		imagenBoton=new ImageIcon(url);
		icono=new ImageIcon(imagenBoton.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
		boton.setIcon(icono);
	}//escalarFotoBoton
	
	public void controlStock(JProgressBar progressbarInventario) {
		
		if(puntero.progressBarInventario.getValue()<=25) {
			puntero.progressBarInventario.setForeground(Color.RED);
		}else {
			puntero.progressBarInventario.setForeground(Color.GREEN);
		}//else
		
	}//controlStock
	
	public void pedido(int mesaAux, String solicitud, double precioTotal, JLabel label) {

		HashMap<String, Integer>aux=new HashMap<String, Integer>();
		for(int i=0; i<comandas.size(); i++) {
			for(int j=0; j<comandas.get(i).getMesas().size(); j++) {
				if(mesaAux==comandas.get(i).getMesas().get(j).getId()) {
					aux=producirPedido(solicitud, comandas.get(i).getMesas().get(j).getItems());
					comandas.get(i).getMesas().get(j).getItems().putAll(aux);
					comandas.get(i).getMesas().get(j).setTotal(controlarTotalMesa(comandas.get(i).getMesas().get(j).getItems()));
					comandas.get(i).getMesas().get(j).setTotal(Math.round(comandas.get(i).getMesas().get(j).getTotal() *100.00)/100.00);
					puntero.textFieldTotal.setText(String.valueOf(comandas.get(i).getMesas().get(j).getTotal()));
					actualizarJlist(comandas.get(i).getMesas().get(j).getItems(), modeloItems);
					puntero.listPedido.setModel(modeloItems);
					System.out.println(label.getText());
					puntero.btnrestarComida.setVisible(true);
				}//if1
			}//for2
		}//for1
	}//pedido
	
	public HashMap<String, Integer> producirPedido(String solicitud, HashMap<String, Integer>lista) {
		
		puntero.lbmensajePedido.setVisible(true);
		puntero.lbmensajePedido.setForeground(Color.WHITE);
		puntero.lbmensajePedido.setText("");
		for(int i=0; i<listaProductos.size(); i++) {
			if(listaProductos.get(i).getNombre().equalsIgnoreCase(solicitud)) {
				if(lista.containsKey(solicitud)) {
					for(Entry<String, Integer> entrada: lista.entrySet()) {
						if(entrada.getKey().equalsIgnoreCase(solicitud)) {
							if(Integer.parseInt(listaProductos.get(i).getStock())<=0) {
								puntero.lbmensajePedido.setForeground(Color.RED);
								puntero.lbmensajePedido.setText(solicitud + " NO TIENE MAS STOCK");
							}else {
								entrada.setValue(entrada.getValue() + 1);
								puntero.lbmensajePedido.setText("AÑADISTE " + entrada.getValue() + " " +  solicitud );
								listaProductos.get(i).setStock(String.valueOf(Integer.parseInt(listaProductos.get(i).getStock()) - 1));
							}//else
						}//if
					}//for
				}else {
					lista.put(solicitud, 1);
					//
					puntero.lbmensajePedido.setText("AÑADISTE 1 " + solicitud );
					listaProductos.get(i).setStock(String.valueOf(Integer.parseInt(listaProductos.get(i).getStock()) - 1));
				}//else
			}//if
		}//for
		return lista;
	}//producirPedido

	public void mostrarObjetoMesa(JLabel lbNumeroMesa){
		
		for(int i=0; i<comandas.size(); i++) {
			for(int j=0; j<comandas.get(i).getMesas().size(); j++) {
				if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(lbNumeroMesa.getText())) {
					puntero.textFieldNumMesa.setText(String.valueOf(comandas.get(i).getMesas().get(j).getId()));
					if(comandas.get(i).getMesas().get(j).getComandaNum()==0) {
						comandas.get(i).getMesas().get(j).setComandaNum(1);
					}//if
					puntero.textFieldNumComanda.setText(String.valueOf(comandas.get(i).getMesas().get(j).getComandaNum()));
					puntero.textFieldFecha.setText(String.valueOf(comandas.get(i).getMesas().get(j).getFecha()));
					puntero.textFieldHora.setText(String.valueOf(comandas.get(i).getMesas().get(j).getHora()));
					puntero.textFieldTotal.setText(String.valueOf(comandas.get(i).getMesas().get(j).getTotal()));
					actualizarJlist(comandas.get(i).getMesas().get(j).getItems(), modeloItems);
					puntero.listPedido.setModel(modeloItems);
					pagar=false;
				}//if
			}//for2
		}//for
			
	}//mostrarObjetoMesa
	
	public void restarElementosMenu() {
		
		item=String.valueOf(puntero.listPedido.getSelectedValue());
		String producto="";
		divisionEntrada=item.split("\\W+");
		//
		producto=divisionEntrada[0];
		for(int i=1; i<=divisionEntrada.length-2; i++) {
			producto = producto + " " + divisionEntrada[i];
		}//for
		numMesa=Integer.parseInt(puntero.textFieldNumMesa.getText());
		numComanda=Integer.parseInt(puntero.textFieldNumComanda.getText());
		//
		reduccionElemento(producto, comandas.get(0).getMesas().get(numMesa - 1).getItems());
		
	}//restarElementosMenu
	
	public void actualizarJlist(HashMap<String, Integer>lista, DefaultListModel modelo) {
		modelo.removeAllElements();
		for(Entry<String, Integer> entrada: lista.entrySet()){
			modelo.addElement(entrada.getKey() + " | " + entrada.getValue());
		}//for
		
	}//actualizarJlist
	
	public void actualizarJlistArrayList(ArrayList<Producto>listaProductos) {
		modeloProductos.removeAllElements();
		for(int i=0; i<listaProductos.size(); i++) {
			modeloProductos.addElement(listaProductos.get(i).getNombre());
		}//for
		puntero.listInventario.setModel(modeloProductos);
	}//actualizarJlist
	
	public double controlarTotalMesa(HashMap<String, Integer>lista) {
		
		double totalPedido=0;
		for(int i=0; i<listaProductos.size(); i++) {
			for(Entry<String, Integer> entrada: lista.entrySet()){
				if(listaProductos.get(i).getNombre().equalsIgnoreCase(entrada.getKey())) {
					totalPedido=totalPedido + entrada.getValue()* listaProductos.get(i).getPrecio();
				}//if
			}//for
		}//for
		return totalPedido;
	}//controlarTotalMesa

	public void controlarReduccionPedido(String entrada) {
		
		for(int i=0; i<listaProductos.size(); i++) {
			if(entrada.equalsIgnoreCase(listaProductos.get(i).getNombre())) {
				listaProductos.get(i).setStock(String.valueOf(Integer.parseInt(listaProductos.get(i).getStock()) + 1));
			}//if
		}//for
		
	}//controlarReduccionPedido
	
	public double controlarDatosPago(double deber) {
		
		puntero.lbmensajeDeber.setText("El importe a abonar por el cliente es de: ");
		puntero.textFieldDineroDeber.setText(String.valueOf(deber) + " €");
		puntero.lbmensajeAbonarCliente.setText("El cliente abona la cantidad de: ");
		//
		return deber;
		
	}//controlarDatosPago
	
	public void controlarPago(double precioPagar) {
		
		puntero.lbmensajeDenegar.setVisible(false);
		if(!puntero.textFieldAbonoCliente.getText().isBlank()) {
			if(Double.parseDouble(puntero.textFieldAbonoCliente.getText())>=precioPagar) {
				puntero.textFieldAbonoCliente.setEditable(false);
				puntero.lbmensajeCambioCliente.setVisible(true);
				puntero.lbmensajeCambioCliente.setText("Cambio a devolver:");
				puntero.textFieldcambioTotal.setVisible(true);
				puntero.textFieldcambioTotal.setText(String.valueOf(Double.parseDouble(puntero.textFieldAbonoCliente.getText()) - precioPagar));
				puntero.textFieldcambioTotal.setText(String.valueOf(Math.round(Double.parseDouble(puntero.textFieldcambioTotal.getText())*100.0)/100.0));
				puntero.btnDarCambio.setVisible(true);
			}else if(Double.parseDouble(puntero.textFieldAbonoCliente.getText())==precioPagar) {
				puntero.btnDarCambio.setVisible(true);
			}else if(Double.parseDouble(puntero.textFieldAbonoCliente.getText())<=precioPagar) {
				puntero.lbmensajeDenegar.setVisible(true);
				puntero.lbmensajeDenegar.setForeground(Color.RED);
				puntero.lbmensajeDenegar.setText("CANTIDAD INSUFICIENTE");
			}//else if
		}else {
			puntero.lbmensajeDenegar.setVisible(true);
			puntero.lbmensajeDenegar.setForeground(Color.RED);
			puntero.lbmensajeDenegar.setText("CAMPO VACIO, RELLENELO");
		}//else
	}//controlarPago
	
	public void generarCambio() {
		
		double diferencia;
		añadirComandaHistorial();
		centrarDatosTablas(centrar);
		diferencia=Double.parseDouble(puntero.textFieldAbonoCliente.getText()) - Double.parseDouble(puntero.textFieldcambioTotal.getText());
		dineroCaja=dineroCaja + diferencia;
		//
		this.puntero.Productos.setVisible(false);
		this.puntero.Configuracion.setVisible(false);
		this.puntero.Documentacion_1.setVisible(false);
		this.puntero.Comanda.setVisible(false);
		this.puntero.inicioSesion.setVisible(false);
		this.puntero.Pagos.setVisible(false);
		this.puntero.Contabilidad.setVisible(false);
		this.puntero.Principal.setVisible(true);
		//
		pagar=true;
		if(pagar) {
			comandas.get(0).getMesas().get((Integer.parseInt(puntero.textFieldNumMesa.getText()) - 1)).setComandaNum(comandas.get(0).getMesas().get((Integer.parseInt(puntero.textFieldNumMesa.getText()) - 1)).getComandaNum() + 1);
			listaProductosEstadisticas.putAll(comandas.get(0).getMesas().get((Integer.parseInt(puntero.textFieldNumMesa.getText())-1)).getItems());
			comandas.get(0).getMesas().get((Integer.parseInt(puntero.textFieldNumMesa.getText())-1)).getItems().clear();
			comandas.get(0).getMesas().get((Integer.parseInt(puntero.textFieldNumMesa.getText())-1)).setTotal(0.0);
			actualizarJlist(comandas.get(0).getMesas().get((Integer.parseInt(puntero.textFieldNumMesa.getText())-1)).getItems(), modeloItems);
			modeloItems.clear();
			calcularEstadisticas();
		}//IF
		mesaOcupada();
		mostrarDineroCaja(dineroCaja);
		//
	}//generarCambio
	
public void mesaOcupada() {
		
		for(int i=0; i<comandas.size(); i++) {
			for(int j=0; j<comandas.get(i).getMesas().size(); j++) {
				if(!comandas.get(i).getMesas().get(j).getItems().isEmpty()) {
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa.getText())) {
						puntero.lbNumeroMesa.setForeground(Color.red);
					}//if
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa_2.getText())) {
						puntero.lbNumeroMesa_2.setForeground(Color.red);			
					}//if
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa_3.getText())) {
						puntero.lbNumeroMesa_3.setForeground(Color.red);
					}//if
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa_4.getText())) {
						puntero.lbNumeroMesa_4.setForeground(Color.red);
					}//if
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa_5.getText())) {
						puntero.lbNumeroMesa_5.setForeground(Color.red);
					}//if
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa_6.getText())) {
						puntero.lbNumeroMesa_6.setForeground(Color.red);
					}//if
				}else if(comandas.get(i).getMesas().get(j).getItems().isEmpty()) {
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa.getText())) {
						puntero.lbNumeroMesa.setForeground(Color.WHITE);
					}//if
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa_2.getText())) {
						puntero.lbNumeroMesa_2.setForeground(Color.WHITE);			
					}//if
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa_3.getText())) {
						puntero.lbNumeroMesa_3.setForeground(Color.WHITE);
					}//if
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa_4.getText())) {
						puntero.lbNumeroMesa_4.setForeground(Color.WHITE);
					}//if
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa_5.getText())) {
						puntero.lbNumeroMesa_5.setForeground(Color.WHITE);
					}//if
					if(comandas.get(i).getMesas().get(j).getId()==Integer.parseInt(puntero.lbNumeroMesa_6.getText())) {
						puntero.lbNumeroMesa_6.setForeground(Color.WHITE);
					}//if
				}//if
			}//for2
		}//for
	}//mesaOcupada
	
	public void reduccionElemento(String ejemplo, HashMap<String, Integer>lista) {

		puntero.lbmensajePedido.setText("");
		for(Entry<String, Integer> entrada: lista.entrySet()){
			if(ejemplo.equalsIgnoreCase(entrada.getKey())) {
				if(entrada.getValue()>0) {
					entrada.setValue(entrada.getValue() - 1);
					controlarReduccionPedido(entrada.getKey());
					puntero.lbmensajePedido.setForeground(Color.RED);
					puntero.lbmensajePedido.setText("ELIMINASTE 1 " + ejemplo );
				}//if
			}//if
			if(entrada.getValue()<1) {
				comandas.get(0).getMesas().get(numMesa - 1).getItems().remove(entrada.getKey());
			}//if				
			actualizarJlist(comandas.get(0).getMesas().get(numMesa -1).getItems(), modeloItems);
			comandas.get(0).getMesas().get(numMesa - 1).setTotal(controlarTotalMesa(comandas.get(0).getMesas().get(numMesa-1).getItems()));
			puntero.textFieldTotal.setText(String.valueOf(comandas.get(0).getMesas().get(numMesa - 1).getTotal()));		
			}//for1
		
	}//reduccionElemento
	
	public void opcionesComboBanco() {
		for(int i=0; i<cuentas.size(); i++) {
			puntero.comboBoxBanco.addItem(cuentas.get(i).getNombre());
		}//for
	}//opcionesComboBanco
	
	public void seteosLabelInventario() {
		puntero.lbtextoComida.setText("BEBIDAS");
		puntero.lbFieldID.setText("");
		puntero.lbFieldNombre.setText("");
		puntero.lbFieldProveedor.setText("");
		puntero.lbFieldPrecio.setText("");
		puntero.lbFieldTipo.setText("");
		puntero.lbFieldNumStock.setText("");
	}//seteosLabelInventario
	
	public void mostrarProductosInventario() {
		productoInventario=String.valueOf(puntero.listInventario.getSelectedValue());
		for(int i=0; i<listaProductos.size(); i++) {
			if(listaProductos.get(i).getNombre().equalsIgnoreCase(productoInventario)) {
				puntero.lbmaximo.setForeground(Color.BLACK);
				puntero.lbmensajeInventario.setText("");
				puntero.btnEditar.setVisible(true);
				puntero.lbIdProductoMostrado.setText(listaProductos.get(i).getId());
				puntero.textNombreProductoMostrado.setText(listaProductos.get(i).getNombre());
				puntero.textInventarioProveedor.setText(listaProductos.get(i).getProveedor());
				puntero.textInventarioPrecio.setText(String.valueOf(listaProductos.get(i).getPrecio()));
				puntero.textInventarioTipo.setText(listaProductos.get(i).getTipo());
				fotoEscalarLabel(puntero.lbmostrarImagenInventario, listaProductos.get(i).getFoto());
				puntero.progressBarInventario.setValue(Integer.parseInt(listaProductos.get(i).getStock()));
				puntero.textInventarioStock.setText(String.valueOf(puntero.progressBarInventario.getValue()));
				controlStock(puntero.progressBarInventario);
			}//if
		}//for
	}//mostrarProductosInventario
	
	public void seteosDeEdicion() {
		puntero.lbIdProductoMostrado.setText("");
		puntero.textNombreProductoMostrado.setEditable(false);
		puntero.textInventarioTipo.setEditable(false);
		puntero.textInventarioPrecio.setEditable(false);
		puntero.textInventarioProveedor.setEditable(false);
		puntero.textInventarioStock.setEditable(false);
		puntero.textNombreProductoMostrado.setText("");
		puntero.textInventarioTipo.setText("");
		puntero.textInventarioPrecio.setText("");
		puntero.textInventarioProveedor.setText("");
		puntero.textInventarioStock.setText("");
		puntero.lbmostrarImagenInventario.setText("");
		fotoEscalarLabel(puntero.lbmostrarImagenInventario, "assets/aposta.png");
		puntero.progressBarInventario.setValue(0);
		puntero.progressBarInventario.setForeground(Color.WHITE);
		puntero.listInventario.setEnabled(true);
		puntero.btnEditar.setVisible(false);
		puntero.btnGuardarEdicion.setVisible(false);
	}//seteosDeEdicion
	
	public void seteoProductos() {
		
		double precio=0;
		boolean edicion=true;
		for(int i=0; i<listaProductos.size(); i++) {
			if(listaProductos.get(i).getNombre().equalsIgnoreCase(productoInventario) && (!puntero.textNombreProductoMostrado.getText().equalsIgnoreCase(listaProductos.get(i).getNombre())
				|| !puntero.textInventarioTipo.getText().equalsIgnoreCase(listaProductos.get(i).getTipo())  || !puntero.textInventarioPrecio.getText().equalsIgnoreCase(String.valueOf(listaProductos.get(i).getPrecio())) ||
				!puntero.textInventarioProveedor.getText().equalsIgnoreCase(listaProductos.get(i).getProveedor()) || !puntero.textInventarioStock.getText().equalsIgnoreCase(listaProductos.get(i).getStock()))) {
				edicion=true;
				puntero.lbmensajeInventario.setText("");
				precio=listaProductos.get(i).getPrecio();
				listaProductos.get(i).setNombre(puntero.textNombreProductoMostrado.getText());
				listaProductos.get(i).setTipo(puntero.textInventarioTipo.getText());
				listaProductos.get(i).setPrecio(Double.parseDouble(puntero.textInventarioPrecio.getText()));
				listaProductos.get(i).setProveedor(puntero.textInventarioProveedor.getText());
				listaProductos.get(i).setStock(puntero.textInventarioStock.getText());
				if(Integer.parseInt(puntero.textInventarioStock.getText())>100) {
					puntero.lbmaximo.setForeground(Color.RED);
				}//if
				//
				redundanciaInformacionSeteo(precio, listaProductos.get(i).getNombre());
			}//if
		}//for
		if(edicion) {
			this.puntero.lbmensajeInventario.setText("Cambios guardados");
		}else {
			this.puntero.lbmensajeInventario.setText("Cambios inexistentes");
		}
	}//seteoProductos

	public void DatosBanco() {
		 for(int i=0; i<cuentas.size(); i++) {
			 if(i==puntero.comboBoxBanco.getSelectedIndex()) {
				 puntero.lbnombreCuenta.setText(cuentas.get(i).getNombre());
				 puntero.lbMostrarContraseñaBanco.setText(cuentas.get(i).getContraseña());
				 puntero.lbSaldo.setText(String.valueOf(cuentas.get(i).getSaldo()));
				 //CARGAR DATOS DE SU TABLA
				 cargarTransacciones(puntero.comboBoxBanco.getSelectedIndex());
			 }//if
		 }//for
	}//contraseñaBanco
	
	public void seteosCamposBanco() {
		puntero.lbcantidadImpuesta.setVisible(false);
		puntero.lbcontraseñaBanco.setVisible(false);
		puntero.lbconcepto.setVisible(false);
		puntero.btnIngresar.setVisible(true);
		puntero.btnGastos.setVisible(true);
		puntero.lbMostrarContraseñaBanco.setVisible(false);
		puntero.textFieldCantidadBanco.setVisible(false);
		puntero.rdbtnConcepto.setVisible(false);
		puntero.rdbtnConcepto2.setVisible(false);
		puntero.lbRetroceder.setVisible(false);
		puntero.lbModificar.setText("Modificar");
		puntero.btnGuardarCambios.setVisible(false);
		puntero.lbmensajeInformativo.setVisible(false);
		puntero.textFieldCantidadBanco.setText("");
		if(puntero.rdbtnConcepto.isSelected() || puntero.rdbtnConcepto2.isSelected()) {
			puntero.grupoBotones.clearSelection();
		}//if
		puntero.lbnombreCuenta.setText("");
		puntero.comboBoxBanco.setEnabled(true);
		puntero.scrollPaneBanco.setVisible(false);
		puntero.tableTransacciones.setVisible(false);
		puntero.lbSaldo.setText("");
	}//seteosCamposBanco
	
	public void fabricarTablaTransacciones() {
		String columnas [] = {"ID", "Concepto", "Cantidad", "Tipo"};
		modeloTablaTransacciones.setColumnIdentifiers(columnas);
		//
		puntero.tableTransacciones.setModel(modeloTablaTransacciones);
	}//fabricarTabla
	
	public Transaccion nuevaTransacciones(Transaccion transaccion) {
	
		eliminarDatosTabla(modeloTablaTransacciones, puntero.tableTransacciones);
		puntero.tableTransacciones.setModel(modeloTablaTransacciones);
		puntero.tableTransacciones.setVisible(true);
		//
		if(puntero.rdbtnConcepto.isSelected()) {
			transaccion=new Transaccion(contadorTransaccion, puntero.rdbtnConcepto.getText(), Double.parseDouble(puntero.textFieldCantidadBanco.getText()), tipoTransaccion);
		}else if(puntero.rdbtnConcepto2.isSelected()) {
			transaccion=new Transaccion(contadorTransaccion, puntero.rdbtnConcepto2.getText(), Double.parseDouble(puntero.textFieldCantidadBanco.getText()), tipoTransaccion);
		}//else
		return transaccion;
	}//insertarTransacciones

	public void insertarTransaccion(Transaccion transaccion) {
		String concepto, tipo=null;
		int id;
		double cantidad=0, nuevaCantidad;
		for(int i=0; i<cuentas.size(); i++) {
			if(cuentas.get(i).getNombre().equalsIgnoreCase(puntero.lbnombreCuenta.getText())) {
				cuentas.get(i).getTransacciones().add(transaccion);
				for(int j=0; j<cuentas.get(i).getTransacciones().size(); j++) {
					id=cuentas.get(i).getTransacciones().get(j).getId();
					concepto=cuentas.get(i).getTransacciones().get(j).getConcepto();
					cantidad=cuentas.get(i).getTransacciones().get(j).getCantidad();
					tipo=cuentas.get(i).getTransacciones().get(j).getTipo();
					modeloTablaTransacciones.addRow(new String[] {String.valueOf(id), concepto, String.valueOf(cantidad), tipo});
				}//for
				nuevaCantidad=modificarSaldo(cantidad, tipo);
				cuentas.get(i).setSaldo(nuevaCantidad);
			}//if
		}//for
	}//insertarTransacciones
	
	public void estadoSaldo() {
		if(Double.parseDouble(puntero.lbSaldo.getText()) > 0.0) {
			puntero.lbSaldo.setForeground(Color.DARK_GRAY);
		}else {
			puntero.lbSaldo.setForeground(Color.RED);
		}//else
	}//estadoSaldo
		
	public void eliminarDatosTabla(DefaultTableModel modeloTabla, JTable tabla) {
		while(tabla.getRowCount()>0) {
			modeloTabla.removeRow(0);
		}//
				
	}//eliminarDatosTabla
	
	public void cargarTransacciones(int combo) {
		eliminarDatosTabla(modeloTablaTransacciones, puntero.tableTransacciones);
		puntero.tableTransacciones.setModel(modeloTablaTransacciones);
		for(int i=0; i<cuentas.size(); i++) {
				for(int j=0; j<cuentas.get(i).getTransacciones().size(); j++) {
					if(cuentas.get(i).getTransacciones().size()>0 && i==combo) {
						int id=cuentas.get(i).getTransacciones().get(j).getId();
						String concepto=cuentas.get(i).getTransacciones().get(j).getConcepto();
						double cantidad=cuentas.get(i).getTransacciones().get(j).getCantidad();
						String tipo=cuentas.get(i).getTransacciones().get(j).getTipo();
						modeloTablaTransacciones.addRow(new String[] {String.valueOf(id), concepto, String.valueOf(cantidad), tipo});
					}//if
				}//for
		}//for
		centrarDatosTablas(centrar);
	}//cargarTransacciones
	
	public double modificarSaldo(Double cantidad, String tipo) {
		double nuevaCantidad;
		if(tipo.equalsIgnoreCase("Ingreso")) {
			puntero.lbSaldo.setText(String.valueOf(Double.parseDouble(puntero.lbSaldo.getText()) + cantidad));
		}else if(tipo.equalsIgnoreCase("Gasto")) {
			puntero.lbSaldo.setText(String.valueOf(Double.parseDouble(puntero.lbSaldo.getText()) - cantidad));
		}//else if
		return nuevaCantidad=Double.parseDouble(puntero.lbSaldo.getText());
		
	}//modificarSaldo
	
	public void fabricarTablaHistorial() {
		String columnas [] = {"MESA", "COMANDA", "FECHA", "HORA", "TOTAL"};
		modeloTablaHistorial.setColumnIdentifiers(columnas);
		//
		puntero.tableHistorial.setModel(modeloTablaHistorial);
	}//fabricarTabla
	
	public void fabricarTablaHistorialTotal() {
		String columnas [] = {"MESA", "COMANDA", "FECHA", "HORA", "TOTAL"};
		modeloTablaHistorial.setColumnIdentifiers(columnas);
		//
	}//fabricarTabla
	
	public void añadirComandaHistorial() {
		String id=puntero.textFieldNumMesa.getText();
		String fecha=puntero.textFieldFecha.getText();
		String hora=puntero.textFieldHora.getText();
		int nComanda=Integer.parseInt(puntero.textFieldNumComanda.getText());
		double total=Double.parseDouble(puntero.textFieldTotal.getText());
		//
		
		modeloTablaHistorial.addRow(new Object[] {id, nComanda, fecha, hora, total});
		
	}//añadirComandaHistorial
	
	public void calcularEstadisticas(){
		
		int superior=0;
		int contador=0;
		String nombre=null;
		
			for(Entry<String, Integer> entrada3: listaProductosEstadisticas.entrySet()){
				System.out.println(entrada3.getKey() + entrada3.getValue());
			}//for
			
				
	}//calcularEstadisticas
	
	public void redundanciaInformacionSeteo(Double precioAnterior, String productoSeteo) {
		
		int valor=0;
		double nuevoPrecio=0;
		double precioDescontar=0;
		String producto;
		//
		for(int i=0; i<listaProductos.size(); i++) {
			if(listaProductos.get(i).getNombre().equalsIgnoreCase(productoSeteo)) {
				nuevoPrecio=listaProductos.get(i).getPrecio();
			}//if
		}//for
		//
		System.out.println(productoInventario);
		for(int j=0; j<comandas.get(0).getMesas().size(); j++) {
			if(comandas.get(0).getMesas().get(j).getItems().containsKey(productoInventario)) {
				if(!comandas.get(0).getMesas().get(j).getItems().isEmpty()) {
					for(Entry<String, Integer> entrada: comandas.get(0).getMesas().get(j).getItems().entrySet()) {
						if(entrada.getKey().equalsIgnoreCase(productoInventario)) {
							valor=entrada.getValue();
							producto=productoInventario;
						}//if
					}//for Each
					comandas.get(0).getMesas().get(j).getItems().remove(productoInventario);
				}//if
				comandas.get(0).getMesas().get(j).getItems().put(puntero.textNombreProductoMostrado.getText(), valor);
				precioDescontar=(nuevoPrecio - precioAnterior) * valor;
				comandas.get(0).getMesas().get(j).setTotal(comandas.get(0).getMesas().get(j).getTotal() + precioDescontar);
			}//if
		}//for
		
	}//redundanciaInformacionSeteo
	
	public void centrarDatosTablas(DefaultTableCellRenderer centrar) {
		
		centrar.setHorizontalAlignment(SwingConstants.CENTER);
		puntero.tableHistorial.getColumnModel().getColumn(0).setCellRenderer(centrar);
		puntero.tableHistorial.getColumnModel().getColumn(1).setCellRenderer(centrar);
		puntero.tableHistorial.getColumnModel().getColumn(3).setCellRenderer(centrar);
		puntero.tableHistorial.getColumnModel().getColumn(4).setCellRenderer(centrar);
		//
		puntero.tableTransacciones.getColumnModel().getColumn(0).setCellRenderer(centrar);
		puntero.tableTransacciones.getColumnModel().getColumn(1).setCellRenderer(centrar);
		puntero.tableTransacciones.getColumnModel().getColumn(2).setCellRenderer(centrar);
		puntero.tableTransacciones.getColumnModel().getColumn(3).setCellRenderer(centrar);
		
	}//centrarDatosTabla
	
	public void mostrarEstadisticasMesas() {
		
		//RELLENAMOS PROGRESS BAR CON SU NUMERO DE COMANDAS PARTICULAR
		for(int i=0; i<comandas.get(0).getMesas().size(); i++) {
			switch(i) {
			case 0:
				puntero.progressBarEstadisticaMesa1.setValue(comandas.get(0).getMesas().get(i).getComandaNum());
				puntero.progressBarEstadisticaMesa1.setString(String.valueOf(comandas.get(0).getMesas().get(i).getComandaNum()));
				estadisticasMesa.put("Mesa 1", (comandas.get(0).getMesas().get(i).getComandaNum()));
				break;
			case 1:
				puntero.progressBarEstadisticaMesa2.setValue(comandas.get(0).getMesas().get(i).getComandaNum());
				puntero.progressBarEstadisticaMesa2.setString(String.valueOf(comandas.get(0).getMesas().get(i).getComandaNum()));
				estadisticasMesa.put("Mesa 2", (comandas.get(0).getMesas().get(i).getComandaNum()));
				break;
			case 2:
				puntero.progressBarEstadisticaMesa3.setValue(comandas.get(0).getMesas().get(i).getComandaNum());
				puntero.progressBarEstadisticaMesa3.setString(String.valueOf(comandas.get(0).getMesas().get(i).getComandaNum()));
				estadisticasMesa.put("Mesa 3", (comandas.get(0).getMesas().get(i).getComandaNum()));
				break;
			case 3:
				puntero.progressBarEstadisticaMesa4.setValue(comandas.get(0).getMesas().get(i).getComandaNum());
				puntero.progressBarEstadisticaMesa4.setString(String.valueOf(comandas.get(0).getMesas().get(i).getComandaNum()));
				estadisticasMesa.put("Mesa 4", (comandas.get(0).getMesas().get(i).getComandaNum()));
				break;
			case 4:
				puntero.progressBarEstadisticaMesa5.setValue(comandas.get(0).getMesas().get(i).getComandaNum());
				puntero.progressBarEstadisticaMesa5.setString(String.valueOf(comandas.get(0).getMesas().get(i).getComandaNum()));
				estadisticasMesa.put("Mesa 5", (comandas.get(0).getMesas().get(i).getComandaNum()));
				break;
			case 5:
				puntero.progressBarEstadisticaMesa6.setValue(comandas.get(0).getMesas().get(i).getComandaNum());
				puntero.progressBarEstadisticaMesa6.setString(String.valueOf(comandas.get(0).getMesas().get(i).getComandaNum()));
				estadisticasMesa.put("Mesa 6", (comandas.get(0).getMesas().get(i).getComandaNum()));
				break;
			}//switch
		}//for
		//
		listaEstadisticas();
		
	}//mostrarEstadisticasMesa
	
	public void listaEstadisticas() {
		
		int totalComandas=0;
		for(int i=0; i<comandas.get(0).getMesas().size(); i++) {
			totalComandas=totalComandas + comandas.get(0).getMesas().get(i).getComandaNum();
		}//for
		for(int i=0; i<comandas.get(0).getMesas().size(); i++) {
			if(comandas.get(0).getMesas().get(i).getComandaNum()>0) {
				modeloEstadisticasMesas.removeAllElements();
				for(Entry<String, Integer> entrada: estadisticasMesa.entrySet()) {
					modeloEstadisticasMesas.addElement(entrada.getKey() + "   -    " +  (entrada.getValue()*100)/totalComandas + " % ");
				}//for
				puntero.listEstadisticasMesa.setModel(modeloEstadisticasMesas);
			}//if
		}//for
		puntero.lbnumComandasTotales.setText(String.valueOf(totalComandas));
		
	}//listaEstadisticas
	
}//Funcionalidadad