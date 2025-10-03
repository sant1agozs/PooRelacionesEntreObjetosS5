class Persona {
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte;
    private Mascota mascota;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void sacarPasaporte(Pasaporte p) {
        this.pasaporte = p;
    }

    public void tomarVuelo(String destino) {
        if (pasaporte != null && pasaporte.isEstaVigente()) {
            System.out.println(nombre + " " + apellidos + " tomara un vuelo a " + destino + ".");
        } else {
            System.out.println(nombre + " " + apellidos + " no podra tomar el vuelo a " + destino + ", ya que su pasaporte no está vigente.");
        }
    }

    public void adoptarMascota(Mascota m) {
        this.mascota = m;
    }

    public void jugarConMascota() {
        if (mascota != null) {
            mascota.jugar(nombre);
        }
    }

    public void soldarConMaquina(MaquinaSoldar maquina, String metal) {
        System.out.print(nombre + " intentara soldar con ");
        maquina.soldar(metal);
    }
}
