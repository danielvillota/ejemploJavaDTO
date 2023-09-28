public class EmpleadoDTO {
    private int id;
    private String nombre;
    private String cargo;

    public EmpleadoDTO(int id, String nombre, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }
}
