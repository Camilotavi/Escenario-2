package notificacion;

import plataforma.Plataforma;

public class notificacionConfirmacion extends Notificacion{

    public notificacionConfirmacion(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviarNotificacion() {
        plataforma.mostrarContenido("Seguro?");
    }
}
