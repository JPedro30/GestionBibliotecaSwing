package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class GestionBiblioteca extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal, panelOpciones;
	private JButton btnAñadir, btnPrestar, btnEliminar, btnGuardar, btnDeshacer;
	private JPanel panelInfo;
	private JPanel panelSelector;
	private JButton btnMaxAtras;
	private JButton btnAtras;
	private JButton btnAdelante;
	private JButton btnMaxAdelante;
	private JLabel lblIdLibro;
	private JLabel lblTitulo;
	private JLabel lblAutor;
	private JLabel lblEditorial;
	private JLabel lblIsbn;
	private JLabel lblFecha;
	private JLabel lblFormato;
	private JTextField textIdLibro;
	private JTextField textTitulo;
	private JTextField textAutor;
	private JTextField textEditor;
	private JTextField textIsbn;
	private JTextField textFecha;
	private JCheckBox chckbxPrestado;
	

	/**
	 * Create the frame.
	 */
	public GestionBiblioteca() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestionBiblioteca.class.getResource("/model/libreria.png")));
		setTitle("GESTION BIBLIOTECA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 480);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		
		definirVentana();
		
		definirEvento();
		
		
		this.setVisible(true);

	}


	private void definirVentana() {
		
		panelOpciones = new JPanel();
		panelOpciones.setBackground(new Color(255, 255, 255));
		panelOpciones.setBorder(new LineBorder(new Color(0, 0, 160), 3, true));
		panelOpciones.setBounds(26, 11, 374, 60);
		panelPrincipal.add(panelOpciones);
		panelOpciones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAñadir = new JButton("");
		btnAñadir.setBackground(new Color(255, 255, 255));
		panelOpciones.add(btnAñadir);
		btnAñadir.setIcon(setIcono("añadir.png", 32, 32));
		
		btnPrestar = new JButton("");
		btnPrestar.setBackground(new Color(255, 255, 255));
		panelOpciones.add(btnPrestar);
		btnPrestar.setIcon(setIcono("prestar.png", 32, 32));
		
		btnEliminar = new JButton("");
		btnEliminar.setBackground(new Color(255, 255, 255));
		panelOpciones.add(btnEliminar);
		btnEliminar.setIcon(setIcono("eliminar.png", 32, 32));
		
		btnGuardar = new JButton("");
		btnGuardar.setBackground(new Color(255, 255, 255));
		panelOpciones.add(btnGuardar);
		btnGuardar.setIcon(setIcono("guardar.png", 32, 32));
		
		btnDeshacer = new JButton("");
		btnDeshacer.setBackground(new Color(255, 255, 255));
		panelOpciones.add(btnDeshacer);
		btnDeshacer.setIcon(setIcono("deshacer.png", 32, 32));
		
		panelInfo = new JPanel();
		panelInfo.setBounds(26, 82, 374, 274);
		panelPrincipal.add(panelInfo);
		panelInfo.setBackground(new Color(255, 255, 255));
		panelInfo.setBorder(new LineBorder(new Color(0, 0, 160), 3, true));
		panelInfo.setLayout(null);
		
		lblIdLibro = new JLabel("IdLibro:");
		lblIdLibro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdLibro.setBounds(10, 30, 71, 21);
		panelInfo.add(lblIdLibro);
		
		lblTitulo = new JLabel("Titulo:");
		lblTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitulo.setBounds(10, 62, 71, 21);
		panelInfo.add(lblTitulo);
		
		lblAutor = new JLabel("Autor:");
		lblAutor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAutor.setBounds(10, 94, 71, 21);
		panelInfo.add(lblAutor);
		
		lblEditorial = new JLabel("Editorial:");
		lblEditorial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEditorial.setBounds(10, 126, 71, 21);
		panelInfo.add(lblEditorial);
		
		lblIsbn = new JLabel("Isbn:");
		lblIsbn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIsbn.setBounds(10, 158, 71, 21);
		panelInfo.add(lblIsbn);
		
		lblFecha = new JLabel("Fecha:");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setBounds(10, 190, 71, 21);
		panelInfo.add(lblFecha);
		
		chckbxPrestado = new JCheckBox("Prestado");
		chckbxPrestado.setEnabled(false);
		chckbxPrestado.setBackground(new Color(255, 255, 255));
		chckbxPrestado.setBounds(45, 229, 97, 23);
		panelInfo.add(chckbxPrestado);
		
		textIdLibro = new JTextField();
		textIdLibro.setBounds(91, 30, 236, 20);
		panelInfo.add(textIdLibro);
		textIdLibro.setColumns(10);
		
		textTitulo = new JTextField();
		textTitulo.setColumns(10);
		textTitulo.setBounds(91, 62, 236, 20);
		panelInfo.add(textTitulo);
		
		textAutor = new JTextField();
		textAutor.setColumns(10);
		textAutor.setBounds(91, 94, 236, 20);
		panelInfo.add(textAutor);
		
		textEditor = new JTextField();
		textEditor.setColumns(10);
		textEditor.setBounds(91, 126, 236, 20);
		panelInfo.add(textEditor);
		
		textIsbn = new JTextField();
		textIsbn.setColumns(10);
		textIsbn.setBounds(91, 158, 236, 20);
		panelInfo.add(textIsbn);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(91, 190, 145, 20);
		panelInfo.add(textFecha);
		
		lblFormato = new JLabel("AAAA-MM-DD");
		lblFormato.setBounds(246, 193, 81, 14);
		panelInfo.add(lblFormato);
		
		panelSelector = new JPanel();
		panelSelector.setBorder(new LineBorder(new Color(0, 0, 160), 3, true));
		panelSelector.setBackground(new Color(255, 255, 255));
		panelSelector.setBounds(26, 367, 374, 60);
		panelPrincipal.add(panelSelector);
		panelSelector.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnMaxAtras = new JButton("");
		btnMaxAtras.setBackground(Color.WHITE);
		panelSelector.add(btnMaxAtras);
		btnMaxAtras.setIcon(setIcono("MAXatras.png", 32, 32));
		
		btnAtras = new JButton("");
		btnAtras.setBackground(Color.WHITE);
		panelSelector.add(btnAtras);
		btnAtras.setIcon(setIcono("atras.png", 32, 32));
		
		btnAdelante = new JButton("");
		btnAdelante.setBackground(Color.WHITE);
		panelSelector.add(btnAdelante);
		btnAdelante.setIcon(setIcono("adelante.png", 32, 32));
		
		btnMaxAdelante = new JButton("");
		btnMaxAdelante.setBackground(Color.WHITE);
		panelSelector.add(btnMaxAdelante);
		btnMaxAdelante.setIcon(setIcono("MAXadelante.png", 32, 32));

	}


	private void definirEvento() {
		// TODO Auto-generated method stub
		
	}
	
	private Icon setIcono(String url, int ancho, int alto) {
		
		ImageIcon icon = new ImageIcon(getClass().getResource(url));
		
		ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
		
		return icono;
		
		
	}
}

