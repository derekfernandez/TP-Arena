package ui.window;

import model.Estudiante;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.windows.MainWindow;

import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;

public class MostrarEstudianteWindows extends Dialog<Estudiante> {

    public MostrarEstudianteWindows(MainWindow owner, Estudiante seleccionado)
    {
        super(owner,seleccionado);
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {
        this.setTitle("Mostrar Estudiante Seleccionado");
        Panel otroPanel = mainPanel;
        otroPanel.setLayout(new ColumnLayout(2));
        new Label(otroPanel).setText("");


        new Label(otroPanel).setText("Nombre ");
        new Label(otroPanel).setText(this.getModelObject().getNombre());

        new Label(otroPanel).setText("Apellido ");
        new Label(otroPanel).setText(this.getModelObject().getApellido());

        new Label(otroPanel).setText("Legajo ");
        new Label(otroPanel).setText(this.getModelObject().getLegajo());

        new Label(otroPanel).setText("UsuarioGitHub ");
        new Label(otroPanel).setText(this.getModelObject().getUsuarioGitHub());
    }
    @Override
    protected void addActions(Panel actions) {
        new Button(actions)
                .setCaption("Aceptar")
                .onClick(this::accept)
                .setAsDefault()
                .disableOnError();
    }
}
