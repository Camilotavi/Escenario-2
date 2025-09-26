package notificacion;

import plataforma.Plataforma;

public class notificacionAlerta extends Notificacion{

    public notificacionAlerta(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviarNotificacion() {
        plataforma.mostrarContenido("Alerta !!");
    }
}
