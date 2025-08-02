class Alumnos {
    int matricula;
    String carrera;
    String nombre;
    int años;

    public Alumnos(String nombre, int años, int matricula, String carrera) {
        this.nombre = nombre;
        this.años = años;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public void presentarse() {
        System.out.println("Bienvenido(a) " + nombre + ", carrera: " + carrera);
    }
}