package notificacion;

import plataforma.Plataforma;

public abstract class Notificacion {

    protected Plataforma plataforma;

    public Notificacion(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public abstract void enviarNotificacion();
}
