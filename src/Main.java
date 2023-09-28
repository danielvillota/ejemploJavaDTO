// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Crear una instancia de EmpleadoService
        EmpleadoService empleadoService = new EmpleadoService();

        // Obtener un EmpleadoDTO de la base de datos usando el servicio
        EmpleadoDTO empleadoDTO = empleadoService.obtenerEmpleadoDTO(3);

        // Mostrar los datos del empleado
        System.out.println("ID: " + empleadoDTO.getId());
        System.out.println("Nombre: " + empleadoDTO.getNombre());
        System.out.println("Cargo: " + empleadoDTO.getCargo());
    }
}