public class RenderizadorOpenGL implements MotorGrafico {
    private boolean iniciado;
    public void inicializarContexto() { iniciado = true; System.out.println("OpenGL inicializado."); }
    public void dibujarMalla(String nombre) { if (iniciado) System.out.println("OpenGL dibuja " + nombre); else System.out.println("Inicialice el contexto primero."); }
    public void liberarRecursos() { iniciado = false; System.out.println("OpenGL liberó recursos."); }
}
