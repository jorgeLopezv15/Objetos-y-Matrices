public class Main {
    public static void main(String[] args) {
         
        // Datos de estudiantes
        String estudiantes[][] = {
            {"Halo", "20", "2001", "Inteligencia Artificial"},
            {"Zelda", "19", "2002", "Bioinformática"},
            {"Mario", "21", "2003", "Ciberseguridad"},
            {"Aloy", "22", "2004", "Blockchain"},
            {"Kratos", "18", "2005", "Realidad Virtual"},
            {"Samus", "23", "2006", "Nanotecnología"},
            {"Link", "17", "2007", "Data Science"},
            {"Cortana", "24", "2008", "Cloud Computing"},
            {"Pikachu", "16", "2009", "IoT"},
            {"Geralt", "25", "2010", "Machine Learning"}
        };
        
        for (int indice = 0; indice < estudiantes.length; indice++) {
            int edadEstudiante = Integer.parseInt(estudiantes[indice][1]);
            int codigoEstudiante = Integer.parseInt(estudiantes[indice][2]);

            Alumnos nuevoEstudiante = new Alumnos(
                estudiantes[indice][0], 
                edadEstudiante,
                codigoEstudiante,
                estudiantes[indice][3]
            );
            
            nuevoEstudiante.presentarse();
        }
    }
}  