public class main {
    public static void main(String[] args) {
        MotorGrafico motor = new RenderizadorOpenGL();
        motor.inicializarContexto(); motor.dibujarMalla("Personaje"); motor.liberarRecursos();
        motor = new RenderizadorVulkan();
        motor.inicializarContexto(); motor.dibujarMalla("Escenario"); motor.liberarRecursos();
    }
}
