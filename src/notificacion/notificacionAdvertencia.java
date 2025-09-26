package notificacion;

import plataforma.Plataforma;

public class notificacionAdvertencia extends Notificacion{

    public notificacionAdvertencia(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviarNotificacion() {
        plataforma.mostrarContenido("Advertencia !!");
    }
}
