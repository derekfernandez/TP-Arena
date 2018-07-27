package ui.window;

import model.Estudiante;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;

public class EditarEstudianteWindows extends Dialog<Estudiante> {

    Estudiante seleccionado;

	public EditarEstudianteWindows(MainWindow owner,Estudiante estudiante)
	{
        super(owner, estudiante);
	    seleccionado = estudiante;
	}
	@Override
	public void createFormPanel(Panel arg0) {
		// TODO Auto-generated method stub
		Panel otroPanel = arg0;

		this.setTitle("Editar Estudiante");
		otroPanel.setLayout(new ColumnLayout(2));
		otroPanel.setWidth(1500);
		new Label(otroPanel).setText("");
		new Label(otroPanel).setText("Nuevo nombre");
		new TextBox(otroPanel).bindValueToProperty("nombre");

		new Label(otroPanel).setText("Nuevo apellido");
		new TextBox(otroPanel).bindValueToProperty("apellido");

		new Label(otroPanel).setText("Nuevo legajo");
		new TextBox(otroPanel).bindValueToProperty("legajo");

		new Label(otroPanel).setText("Nuevo usuario github");
		new TextBox(otroPanel).bindValueToProperty("usuarioGitHub");
	}


    @Override
    protected void addActions(Panel actions) {
	    actions.setLayout(new ColumnLayout(2));
        new Button(actions)
                .setCaption("Aceptar")
                .onClick(this::accept)
                .setAsDefault()
                .disableOnError();
    }


    //@Override
    /*public void executeTask()
    {
        this.getModelObject().update(seleccionado);
        //Repositorios.estudiantes.eliminar(this.getModelObject());
        //super.executeTask();
    }*/

}
