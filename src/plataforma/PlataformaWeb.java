package plataforma;

public class PlataformaWeb implements Plataforma {
    @Override
    public void mostrarContenido(String contenido) {
        System.out.println("[WEB] -- " + contenido);
    }
}
