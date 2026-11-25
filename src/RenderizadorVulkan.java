public class RenderizadorVulkan implements MotorGrafico {
    private boolean iniciado;
    public void inicializarContexto() { iniciado = true; System.out.println("Vulkan inicializado."); }
    public void dibujarMalla(String nombre) { if (iniciado) System.out.println("Vulkan dibuja " + nombre); else System.out.println("Inicialice el contexto primero."); }
    public void liberarRecursos() { iniciado = false; System.out.println("Vulkan liberó recursos."); }
}
