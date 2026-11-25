public class RenderizadorDirectX implements MotorGrafico {
    private boolean iniciado;
    public void inicializarContexto() { iniciado = true; System.out.println("DirectX inicializado."); }
    public void dibujarMalla(String nombre) { if (iniciado) System.out.println("DirectX dibuja " + nombre); else System.out.println("Inicialice el contexto primero."); }
    public void liberarRecursos() { iniciado = false; System.out.println("DirectX liberó recursos."); }
}
