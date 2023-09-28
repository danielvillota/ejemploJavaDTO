public class EmpleadoService {
    public EmpleadoDTO obtenerEmpleadoDTO(int empleadoId) {
        // obtenemos un empleado de la bd
        Empleado empleado = obtenerEmpleadoDesdeLaBaseDeDatos(empleadoId);
        // Convertimos el empleado en un EmpleadoDTO
        EmpleadoDTO empleadoDTO = new EmpleadoDTO(empleado.getId(), empleado.getNombre(), empleado.getCargo());

        return empleadoDTO;
    }

    private Empleado obtenerEmpleadoDesdeLaBaseDeDatos(int empleadoId) {
        // para obtener los datos del empleado.
        return new Empleado(empleadoId, "John Doe", "Desarrollador Senior", 75000.0);
    }
}
