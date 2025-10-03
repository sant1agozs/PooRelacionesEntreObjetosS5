class MaquinaSoldar {
    private String marca;
    private String modelo;
    private int potencia;
    private String[] metalesSoportados;

    public MaquinaSoldar(String marca, String modelo, int potencia, String[] metalesSoportados) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metalesSoportados = metalesSoportados;
    }

    public void soldar(String metal) {
        boolean puede = false;
        for (String m : metalesSoportados) {
            if (m.equalsIgnoreCase(metal)) {
                puede = true;
                break;
            }
        }
        if (puede) {
            System.out.println("la máquina de soldar conocida como " + marca + " " + modelo + " que suelda el " + metal + ".");
        } else {
            System.out.println("la máquina de soldar conocida como " + marca + " " + modelo + " que no puede soldar el " + metal + ".");
        }
    }
}