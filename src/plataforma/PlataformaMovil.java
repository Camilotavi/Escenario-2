package plataforma;

public class PlataformaMovil implements Plataforma{
    @Override
    public void mostrarContenido(String contenido) {
        System.out.println("[MOVÍL -- " + contenido);
    }
}
