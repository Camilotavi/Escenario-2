import notificacion.Notificacion;
import notificacion.notificacionAdvertencia;
import notificacion.notificacionAlerta;
import notificacion.notificacionConfirmacion;
import plataforma.Plataforma;
import plataforma.PlataformaEscritorio;
import plataforma.PlataformaMovil;
import plataforma.PlataformaWeb;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Creamos notificaciones con web");
        enviaNotiWeb(new PlataformaWeb());

        System.out.println("Creamos notificaciones con Movil");
        enviaNotiMovil(new PlataformaMovil());


    }

    public static void enviaNotiWeb(Plataforma plataforma) {

        //Notificacion alerta
        System.out.println("Enviando primera notificacion");
        //Tenemos la plataforma ahora hacemos el tipo
        Notificacion noti_alerta = new notificacionAlerta(plataforma);
        //Ahora si la enviamos
        noti_alerta.enviarNotificacion();

        //Notificacion Confirmacion
        System.out.println("Enviando segunda notificacion");
        //Tenemos la plataforma ahora hacemos el tipo
        Notificacion noti_confirmacion = new notificacionConfirmacion(plataforma);
        //Ahora si la enviamos
        noti_confirmacion.enviarNotificacion();
    }

    public static void enviaNotiMovil(Plataforma plataforma){

        //Notificacion alerta
        System.out.println("Enviando primera notificacion");
        //Tenemos la plataforma ahora hacemos el tipo
        Notificacion noti_alerta = new notificacionAlerta(plataforma);
        //Ahora si la enviamos
        noti_alerta.enviarNotificacion();

        //Notificacion Confirmacion
        System.out.println("Enviando segunda notificacion");
        //Tenemos la plataforma ahora hacemos el tipo
        Notificacion noti_confirmacion = new notificacionConfirmacion(plataforma);
        //Ahora si la enviamos
        noti_confirmacion.enviarNotificacion();
    }
}