public class TelefonoMovil {

    private String modeloMovil;

    private int precioMovil;

    private boolean tiene4g;

    public TelefonoMovil(String modelo, int precio, boolean con4g){
        modeloMovil = modelo;
    precioMovil = precio;
    boolean tiene4g= true;
    }
    /* El ejercicio pide que uno de los parámetros se inicialice
     * de forma fija, es decir, que el usuario no meta el dato.
     * Entre paréntesis indicas que se va a meter un boolean llamado con4g,
     * pero luego no se utiliza.
     * En tiene4g no hay que volver a especificar el tipo de dato
     * es en "boolean tiene4g= true", ya se hace arriba.
     * 
     */
    public int getPrecioMovil() {
        return precioMovil;
    }

    public String getModeloMovil() {
    return modeloMovil;
    }
    
    public boolean getTiene4g() {
    return tiene4g;
    }
    
    public void setPropietario(String propietario) {
    modeloMovil = propietario;
    }
    
    public void roturaPantalla(int variablePrecio) {
    int variarPrecio = variablePrecio;
    precioMovil = precioMovil + variablePrecio;
    }
    /* Creas un parámetro que mete el usuario (variablePrecio) y luego
     * una variable local (variarPrecio) que realmente no se utiliza, ya
     * que su valor ya lo ha indicado el usuario en variablePrecio.
     * Con el parámetro solo ya estaría.
     */
    public void alternaTiene4g() {
    if (tiene4g == true){
        tiene4g = false ;
    }
    else {
        tiene4g = true ;
    }
    }
    /* Esto funciona y está correcto, pero hay una forma más sencilla
     * usando ! que indica el valor opuesto (!tiene4g sería el valor
     * opuesto al que tiene tiene4g)
     */
    public String devolverDetalles(String devuelveDetalles) {
        devuelveDetalles = "Propietario: "+ modeloMovil +" Precio: "+ precioMovil +" Tiene 4G: "+ tiene4g;
        return devuelveDetalles;
    }
    /* El método funcionaría, pero te pide que metas antes un valor, lo cual no es necesario.
     * En este método el ejercicio pide que se devuelva un valor, que sería el string
     * "Propietario: "+ modeloMovil +" Precio: "+ precioMovil +" Tiene 4G: "+ tiene4g
     * No es necesario crear una variable para ello, con poner esa línea con return delante vale.
     * Además, no estás creando una variable, cuando metes un tipo de dato y un nombre entre paréntesis en
     * la cabecera, lo que indicas es un valor que va a meter el usuario (en este caso no es necesario).
     * 
     */
    public void imprimirDetalles() {
        System.out.println("Propietario: "+ modeloMovil +" Precio: "+ precioMovil +" Tiene 4G: "+ tiene4g);
    }
    //Varios métodos y el constructor tienen mal indentado su interior
}