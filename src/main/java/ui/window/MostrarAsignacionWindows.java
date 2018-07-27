package ui.window;

import model.Asignacion;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.Dialog;


public class MostrarAsignacionWindows extends Dialog<Asignacion> {

    Asignacion selec;
    public MostrarAsignacionWindows(MainWindow owner, Asignacion seleccionada)
    {
        super(owner, seleccionada);
        selec = seleccionada;
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {

        this.setTitle("Mostrar asignacion");
        Panel otroPanel = mainPanel;
        otroPanel.setLayout(new ColumnLayout(2));
        new Label(otroPanel).setText("");

        new Label(otroPanel).setText("Nota actual");
        new Label(otroPanel).setText(String.valueOf(selec.notaActual()));

        new Label(otroPanel).setText("Consulta aprobo");
        new Label(otroPanel).setText(String.valueOf(selec.aprobo()));
    }
}
