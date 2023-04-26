package analisiss;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MarketplaceSearchView extends JFrame {

	private JTextField searchField;
	private JComboBox<String> categoryComboBox;
	private JCheckBox priceCheckBox;
	private JTable resultsTable;
	private JButton searchButton;

	public MarketplaceSearchView() {
		// Configurar la ventana principal
		setTitle("Búsqueda de Marketplace");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Crear los componentes de la interfaz
		JLabel searchLabel = new JLabel("Buscar:");
		searchField = new JTextField(20);
		JLabel categoryLabel = new JLabel("Categoría:");
		String[] categories = {"Todas", "Electrónica", "Hogar", "Jardín", "Ropa", "Deportes"};
		categoryComboBox = new JComboBox<>(categories);
		priceCheckBox = new JCheckBox("Mostrar solo productos en oferta");
		resultsTable = new JTable(10, 3);
		JScrollPane scrollPane = new JScrollPane(resultsTable);
		searchButton = new JButton("Buscar");

		// Crear el panel para los filtros de búsqueda
		JPanel filtersPanel = new JPanel(new GridLayout(0, 2));
		filtersPanel.add(searchLabel);
		filtersPanel.add(searchField);
		filtersPanel.add(categoryLabel);
		filtersPanel.add(categoryComboBox);
		filtersPanel.add(priceCheckBox);

		// Crear el panel para los resultados de búsqueda
		JPanel resultsPanel = new JPanel(new BorderLayout());
		resultsPanel.add(scrollPane, BorderLayout.CENTER);

		// Crear el panel para el botón de búsqueda
		JPanel searchButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		searchButtonPanel.add(searchButton);

		// Agregar los paneles a la ventana principal
		add(filtersPanel, BorderLayout.NORTH);
		add(resultsPanel, BorderLayout.CENTER);
		add(searchButtonPanel, BorderLayout.SOUTH);

		// Mostrar la ventana principal
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new MarketplaceSearchView());
	}
}