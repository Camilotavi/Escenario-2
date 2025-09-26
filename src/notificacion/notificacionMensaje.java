package notificacion;

import plataforma.Plataforma;

public class notificacionMensaje extends Notificacion{

    public notificacionMensaje(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviarNotificacion() {
        plataforma.mostrarContenido("Atención");
    }
}
