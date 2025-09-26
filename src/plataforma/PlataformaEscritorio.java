package plataforma;

public class PlataformaEscritorio implements Plataforma{
    @Override
    public void mostrarContenido(String contenido) {
        System.out.println("[DESKTOP] -- " + contenido);
    }
}
