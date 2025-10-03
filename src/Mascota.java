class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void jugar(String nombrePersona) {
        System.out.println(nombre + ", que es un " + especie +
                " de " + edad + " años está jugando felizmente con " + nombrePersona);
    }
}