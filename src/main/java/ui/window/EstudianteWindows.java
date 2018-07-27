package ui.window;


import model.Asignacion;
import model.Estudiante;
import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.MainWindow;
import ui.vm.EstudianteViewModel;


public class EstudianteWindows extends MainWindow<EstudianteViewModel> {

	public EstudianteWindows()
	{
		super(new EstudianteViewModel());
	}
	
	@Override
	public void createContents(Panel mainPanel) {

		this.setTitle("Seleccion estudiante");
		mainPanel.setLayout(new ColumnLayout(2));
		new Label(mainPanel).setText("Estudiante");
		Selector<Estudiante> selectorEstudiante = new Selector<Estudiante>(mainPanel).allowNull(true);
		selectorEstudiante.setWidth(100);
		selectorEstudiante.bindItems(new ObservableProperty(this.getModelObject(),"estudiantes"));
		//selectorEstudiante.bindItemsToProperty("estudiantes");
		selectorEstudiante.bindValueToProperty("estudianteSeleccionado");
		new Label(mainPanel).setText("Asignacion");
		Selector<Asignacion> selectorAsignacion = new Selector<Asignacion>(mainPanel).allowNull(true);
		selectorAsignacion.setWidth(100);
		selectorAsignacion.bindItemsToProperty("estudianteSeleccionado.asignaciones");
		selectorAsignacion.bindValueToProperty("asignacionSeleccionado");

		new Button(mainPanel).setCaption("Editar estudiante").onClick(this:: editarEstudiante);
		new Button(mainPanel).setCaption("Mostrar Estudiante").onClick(this :: mostrarEstudiante);
		new Button(mainPanel).setCaption("Ver Asignacion").onClick(this :: mostrarAsignacion);
		new Button(mainPanel).setCaption("Cancelar").onClick(this:: cancel);

		//new Label(mainPanel).setText("Consulta aprobo");
		//new Label(mainPanel).setText(Boolean.toString(this.getModelObject().asignacionSeleccionado.aprobo()));

	}

	public void cancel()
	{
		this.close();
	}
	public void mostrarAsignacion()
	{
		try {
			MostrarAsignacionWindows mostrarAsignacionWindows = new MostrarAsignacionWindows(this, this.getModelObject().getAsignacionSeleccionado());
			mostrarAsignacionWindows.open();
		}
		catch (Exception exc)
		{
			System.out.println("Seleccione una asignacion");
		}
	}
	public void mostrarEstudiante()
	{
		try {
			MostrarEstudianteWindows mostrarEstu = new MostrarEstudianteWindows(this, this.getModelObject().getEstudianteSeleccionado());
			mostrarEstu.open();
		}
		catch (Exception exc)
		{
			System.out.println("Seleccione un estudiante");
		}
	}
	public void editarEstudiante()
	{
		try {
			EditarEstudianteWindows editarEstudiante = new EditarEstudianteWindows(this, this.getModelObject().getEstudianteSeleccionado());
			editarEstudiante.open();
		}
		catch (Exception exc)
		{
			System.out.println("Seleccione un estudiante");
		}
	}
	public static void main(String[] arg) {
		new EstudianteWindows().startApplication();
	}
}
