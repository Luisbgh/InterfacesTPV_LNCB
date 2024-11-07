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
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.DefaultListModel;
import javax.swing.Icon;

import Vista.Interfaz;
import Modelo.Empleado;
import Modelo.Producto;

public class Funcionalidad implements ActionListener, MouseListener{

	Interfaz puntero=new Interfaz();
	//VARIABLES
	ArrayList<Empleado>empleados=new ArrayList<Empleado>();
	ArrayList<Producto>listaProductos=new ArrayList<Producto>();
	DefaultListModel modeloComida=new DefaultListModel();
	DefaultListModel modeloBebida=new DefaultListModel();
	int hora, minutos, dineroCaja=50, dineroTotal;
	ImageIcon imagenBoton;
	Icon icono;
	JLabel label1, label2;
	String minutoSet;
	String texto="Bienvenidos a CoffeKie, en esta pagina os mostraremos informacion especifica sobre nosotros, tambien hemos incluido informacion de uso de la intefaz y informacion especifica de la politica de privacidad, esperamos que la intefaz se adapte a vuestras necesidades.";
	String empleado;
	String fotoContraseña;
	String tipoComida;
	String producto;
	//
	public Funcionalidad(Interfaz frame){
		puntero=frame;
		//ACTION LISTENER BOTONES
		puntero.btnRegistrarse.addActionListener(this);
		puntero.btnIniciar.addActionListener(this);
		puntero.comboBoxOpciones.addActionListener(this);
		puntero.btnGuardarInfo.addActionListener(this);
		puntero.btnEliminarUser.addActionListener(this);
		puntero.btnInventario.addActionListener(this);
		puntero.btnVisualizarDatosProducto.addActionListener(this);
		puntero.btnverBebida.addActionListener(this);
		puntero.btnverComida.addActionListener(this);
		puntero.btnSetearStock.addActionListener(this);
		//MOUSE LISTENER
		puntero.lbcerrarSesion.addMouseListener(this);
		puntero.lbPaginaInformativa.addMouseListener(this);
		puntero.lbcerrarSesionDOC.addMouseListener(this);
		puntero.lbfotoSesion.addMouseListener(this);
		puntero.lbcerrarSesionConfiguracion.addMouseListener(this);
		puntero.lbfotoLibro.addMouseListener(this);
		puntero.lbVerContraseña.addMouseListener(this);
		puntero.lbcerrarSesionInventario.addMouseListener(this);
		puntero.lbcerrarSesionComanda.addMouseListener(this);
		puntero.mesa1.addMouseListener(this);
		puntero.mesa2.addMouseListener(this);
		puntero.mesa3.addMouseListener(this);
		puntero.mesa4.addMouseListener(this);
		puntero.mesa5.addMouseListener(this);
		puntero.mesa6.addMouseListener(this);
		puntero.lbfotoLlevar.addMouseListener(this);
		puntero.lbcerrarSesionComandaLlevar.addMouseListener(this);
		//EMPLEADOS POR DEFECTO
		empleados.add(new Empleado("Tobias", "Tobi123", "8:00", " 16:00", 1250, "assets/perfil.png"));
		empleados.add(new Empleado("Margarita", "marge35", "16:00", " 24:00", 1450, "assets/perfil2.png"));
		empleados.add(new Empleado("Sebastian", "seBas54", "12:00", " 20:00", 1550, "assets/perfil.png"));
		//PRODUCTOS COMIDA
		listaProductos.add(new Producto("1", "Magdalena", "assets/magdalena.png", "1,50 €", "20", "Mercadona", "Comida"));
		listaProductos.add(new Producto("2", "Croisant", "assets/croisant.png", "1,25 €", "25", "Caseras" , "Comida"));
		listaProductos.add(new Producto("3", "Donut", "assets/donut.png", "1,00 €", "50", "Pasteleria Alton", "Comida" ));
		listaProductos.add(new Producto("5", "Galletas", "assets/galletas.png", "2,00 €", "60", "Caseras", "Comida" ));
		//PRODUCTOS BEBIDA
		listaProductos.add(new Producto("6", "Agua", "assets/agua.png", "0.80 €", "50", "Mercadona", "Bebida" ));
		listaProductos.add(new Producto("7", "Cafe con leche", "assets/cafeLeche.png", "1,25 €", "25", "Caseras", "Bebida" ));
		listaProductos.add(new Producto("8", "Cafe solo", "assets/cafeSolo.png", "1,00 €", "50", "Caseros", "Bebida" ));
		listaProductos.add(new Producto("9", "Capuccino", "assets/capuccino.png", "1,30 €", "15", "Caseros" , "Bebida"));
		listaProductos.add(new Producto("10", "Zumo Naranja", "assets/zumoNaranja.png", "1,75 €", "30", "Caseras", "Bebida" ));
		//FECHA HORA
		establecerFechaHora();
		//ESTABLECER APERTURA
		cambiarHorario();
		//ESTABLECER DINEROCAJA
		int dineroCaja=50;
		//BOTON ICONO VISUALIZAR DATOS INVENTARIO
		escalarFotoBoton("assets/lupa.png", puntero.btnVisualizarDatosProducto);
		escalarFotoBoton("assets/bebidas.png", puntero.btnverBebida);
		escalarFotoBoton("assets/comidas.png", puntero.btnverComida);
		escalarFotoBoton("assets/editarStock.png", puntero.btnSetearStock);
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
		if(e.getSource()==puntero.btnInventario) {
			gestionInventario();
		}//if
		if(e.getSource()==puntero.btnVisualizarDatosProducto) {
			visualizarDatosMenu();
		}//if
		if(e.getSource()==puntero.btnverBebida) {
			puntero.lbtextoComida.setText("BEBIDAS");
			puntero.textFieldID.setText("");
			puntero.textFieldNombre.setText("");
			puntero.textFieldProveedor.setText("");
			puntero.textFieldPrecio.setText("");
			puntero.textFieldTipo.setText("");
			puntero.textFieldEditarStock.setText("");
			fotoEscalarLabel(puntero.lbImagenInventario, "assets/productoDefecto.png");
			puntero.progressBarStock.setValue(0);
			modeloBebida.removeAllElements();
			tipoComida="Bebida";
			visualizarProducto(tipoComida, modeloBebida);
		}//if
		if(e.getSource()==puntero.btnverComida) {
			puntero.lbtextoComida.setText("COMIDAS");
			puntero.textFieldID.setText("");
			puntero.textFieldNombre.setText("");
			puntero.textFieldProveedor.setText("");
			puntero.textFieldPrecio.setText("");
			puntero.textFieldTipo.setText("");
			puntero.textFieldEditarStock.setText("");
			fotoEscalarLabel(puntero.lbImagenInventario, "assets/productoDefecto.png");
			puntero.progressBarStock.setValue(0);
			modeloComida.removeAllElements();
			tipoComida="Comida";
			visualizarProducto(tipoComida, modeloComida);
		}//if
		if(e.getSource()==puntero.btnSetearStock) {
			if(puntero.textFieldEditarStock!=null) {
				for(int i=0; i<listaProductos.size(); i++) {
					if(listaProductos.get(i).getNombre().equalsIgnoreCase(producto)) {
						listaProductos.get(i).setStock(puntero.textFieldEditarStock.getText());
					}//if
				}//for
				controlStock();
			}//if
		}//
		
	}//actionPerformed
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource()==puntero.lbcerrarSesion) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Principal.setVisible(false);
				this.puntero.Inventario.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.ComandaParaLlevar.setVisible(false);
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
				this.puntero.Inventario.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.ComandaParaLlevar.setVisible(false);
				this.puntero.Comanda.setVisible(false);
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
				this.puntero.Inventario.setVisible(false);
				this.puntero.ComandaParaLlevar.setVisible(false);
				this.puntero.Comanda.setVisible(false);
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
				this.puntero.Inventario.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.ComandaParaLlevar.setVisible(false);
				this.puntero.Configuracion.setVisible(true);
			}//if
		}//if
		if(e.getSource()==puntero.lbcerrarSesionConfiguracion) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Principal.setVisible(false);
				this.puntero.Inventario.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.ComandaParaLlevar.setVisible(false);
				this.puntero.inicioSesion.setVisible(true);
				//
				puntero.textPassConf.setText("");
				puntero.textJIConf.setText("");
				puntero.textJFConf.setText("");
				puntero.textSueldoConf.setText("");
			}//if
		}//if
		if(e.getSource()==puntero.lbfotoLibro) {
			if(e.getClickCount()==2) {
				
			}//
		}//
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
		if(e.getSource()==puntero.lbcerrarSesionInventario) {
			//CAMBIAMOS DE PANEL
			this.puntero.Documentacion_1.setVisible(false);
			this.puntero.Configuracion.setVisible(false);
			this.puntero.Inventario.setVisible(false);
			this.puntero.inicioSesion.setVisible(false);
			this.puntero.Comanda.setVisible(false);
			this.puntero.ComandaParaLlevar.setVisible(false);
			this.puntero.Principal.setVisible(true);
			//
		}//if
		if(e.getSource()==puntero.lbcerrarSesionComanda) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Inventario.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.ComandaParaLlevar.setVisible(false);
				this.puntero.Principal.setVisible(true);
			}//if
		}//if
		if(e.getSource()==puntero.mesa1 || e.getSource()==puntero.mesa2 || e.getSource()==puntero.mesa3 || e.getSource()==puntero.mesa4 || e.getSource()==puntero.mesa5 || e.getSource()==puntero.mesa6) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Inventario.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.Principal.setVisible(false);
				this.puntero.ComandaParaLlevar.setVisible(false);
				this.puntero.Comanda.setVisible(true);
				//PREPARACION MENU
				establecerImagenesBotonMenu();
				//AAAAAAAAAAAAAAAAAAAAAAEEEEEEEEEEEEEEEEEEEEEEEEEEEIIIIIIIIIIIIIIIIIIOOOOOOOOOOOOOOOOOOOOO
			}//if
		}//if
		if(e.getSource()==puntero.lbfotoLlevar) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Inventario.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.Principal.setVisible(false);
				this.puntero.ComandaParaLlevar.setVisible(true);
				//
				 establecerImagenesBotonMenu();
			}//if
		}//if
		if(e.getSource()==puntero.lbcerrarSesionComandaLlevar) {
			if(e.getClickCount()==2) {
				//CAMBIAMOS DE PANEL
				this.puntero.Inventario.setVisible(false);
				this.puntero.Configuracion.setVisible(false);
				this.puntero.Documentacion_1.setVisible(false);
				this.puntero.Comanda.setVisible(false);
				this.puntero.inicioSesion.setVisible(false);
				this.puntero.ComandaParaLlevar.setVisible(false);
				this.puntero.Principal.setVisible(true);
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
		//HORAS MINUTOS
			hora=LocalTime.now().getHour();
			minutos=LocalTime.now().getMinute();
			if(minutos<10) {
				minutoSet="0" + minutos;
				puntero.lbmostrarHora.setText(String.valueOf((hora)) + " : " + minutoSet);
				puntero.lbmostrarHoraPrincipal.setText(String.valueOf((hora)) + " : " + minutoSet);
				puntero.lbmostrarHoraDOC.setText(String.valueOf((hora)) + " : " + minutoSet);
				puntero.lbmostrarHoraConfiguracion.setText(String.valueOf((hora)) + " : " + minutoSet);
				puntero.lbmostrarHoraInventario.setText(String.valueOf((hora)) + " : " + minutoSet);
				puntero.lbmostrarHoraComanda.setText(String.valueOf((hora)) +  " : " + minutoSet);
				puntero.lbmostrarHoraComandaLlevar.setText(String.valueOf((hora)) +  " : " + minutoSet);
			}else {
				puntero.lbmostrarHora.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraPrincipal.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraDOC.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraConfiguracion.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraComanda.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraInventario.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
				puntero.lbmostrarHoraComandaLlevar.setText(String.valueOf((hora)) + " : " + String.valueOf((minutos)));
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
		
		if(this.puntero.comboBoxOpciones.getSelectedIndex()==0) {
			this.puntero.textAreaPrivacidad.setVisible(false);
			this.puntero.lbfotoLibro.setVisible(false);
			this.puntero.scrollPane.setVisible(false);
			//
			this.puntero.textAreainformacionOP1.setText("Coofekie es una cafeteria que ha llegado para quedarse, nuestros servicios se basan en desayunos y meriendas, nuestro lema es servir siempre con una sonrisa y nuestro precios son asequibles");
			this.puntero.textAreainformacionOP1.setLineWrap(true);
			this.puntero.textAreainformacionOP1.setWrapStyleWord(true);
			this.puntero.textAreainformacionOP1.setVisible(true);
		}//
		if(this.puntero.comboBoxOpciones.getSelectedIndex()==1) {
			this.puntero.textAreainformacionOP1.setVisible(false);
			this.puntero.textAreaPrivacidad.setVisible(false);
			this.puntero.scrollPane.setVisible(false);
			//
			this.puntero.lbfotoLibro.setVisible(true);
		}//
		if(this.puntero.comboBoxOpciones.getSelectedIndex()==2) {
			this.puntero.textAreainformacionOP1.setVisible(false);
			this.puntero.lbfotoLibro.setVisible(false);
			//
			this.puntero.textAreaPrivacidad.setText("La confidencialidad y la seguridad son valores primordiales de Coofekie y, en consecuencia, asumimos el compromiso de garantizar la privacidad del Usuario en todo momento y de no recabar información innecesaria. A continuación, le proporcionamos toda la información necesaria sobre nuestra Política de Privacidad en relación con los datos personales que recabamos, el cumplimiento de todas las politicas mostradas es completamente obligatorio al aceptar los acuerdos por defecto de los acuerdos previos");
			this.puntero.scrollPane.setVisible(true);
			this.puntero.textAreaPrivacidad.setLineWrap(true);
			this.puntero.textAreaPrivacidad.setWrapStyleWord(true);
			this.puntero.textAreaPrivacidad.setVisible(true);
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
				this.puntero.Inventario.setVisible(false);
				this.puntero.Comanda.setVisible(false);
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
		this.puntero.Inventario.setVisible(true);
		
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
	
	public int mostrarDineroCaja(int dinero) {
		
		int dineroAux=dinero;
		
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
		
	}//visualizarDatosProducto
	
	public void visualizarDatosMenu() {
		
		producto=String.valueOf(puntero.listProductos.getSelectedValue());
		for(int i=0; i<listaProductos.size(); i++) {
			if(String.valueOf(producto)!=null && listaProductos.get(i).getNombre()==producto) {
				puntero.textFieldID.setText(listaProductos.get(i).getId());
				puntero.textFieldNombre.setText(listaProductos.get(i).getNombre());
				puntero.textFieldProveedor.setText(listaProductos.get(i).getProveedor());
				puntero.textFieldPrecio.setText(listaProductos.get(i).getPrecio());
				puntero.textFieldTipo.setText(listaProductos.get(i).getTipo());
				fotoEscalarLabel(puntero.lbImagenInventario, listaProductos.get(i).getFoto());
				puntero.progressBarStock.setValue(Integer.parseInt(listaProductos.get(i).getStock()));
				puntero.textFieldNumStock.setText(String.valueOf(puntero.progressBarStock.getValue()));
			}//if
		}//for
		controlStock();
	
	}//visualizarDatosMenu
	
	public void establecerImagenesBotonMenu() {
		
		for(int i=0; i<listaProductos.size(); i++) {
			if(i==0) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto1);
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProductoLlevar1);
			}
			if(i==1) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto2);
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProductoLlevar2);
			}
			if(i==2) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto3);
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProductoLlevar3);
			}
			if(i==3) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto4);
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProductoLlevar4);
			}
			if(i==4) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto5);
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProductoLlevar5);
			}
			if(i==5) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto6);
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProductoLlevar6);
			}
			if(i==6) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto7);
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProductoLlevar7);
			}
			if(i==7) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto8);
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProductoLlevar8);
			}
			if(i==8) {
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProducto9);
				escalarFotoBoton(listaProductos.get(i).getFoto(), puntero.btnProductoLlevar9);
			}
		}//for
		
	}//visualizarDatosMenu
	
	public void escalarFotoBoton(String url, JButton boton) {
		imagenBoton=new ImageIcon(url);
		icono=new ImageIcon(imagenBoton.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
		boton.setIcon(icono);
	}//escalarFotoBoton
	
	public void controlStock() {
		
		if(puntero.progressBarStock.getValue()<=25) {
			puntero.progressBarStock.setForeground(Color.RED);
			puntero.btnSetearStock.setEnabled(true);
			puntero.textFieldEditarStock.setEditable(true);
			
		}else {
			puntero.progressBarStock.setForeground(Color.GREEN);
			puntero.btnSetearStock.setEnabled(false);
			puntero.textFieldEditarStock.setEditable(false);
		}//else
		
	}//controlStock
		
}//Funcionalidad
