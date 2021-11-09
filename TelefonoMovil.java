public class TelefonoMovil {

    private String modeloMovil;

    private int precioMovil;

    private boolean tiene4g;

    public TelefonoMovil(String modelo, int precio, boolean con4g){
        modeloMovil = modelo;
    precioMovil = precio;
    boolean tiene4g= true;
    }
    /* El ejercicio pide que uno de los par�metros se inicialice
     * de forma fija, es decir, que el usuario no meta el dato.
     * Entre par�ntesis indicas que se va a meter un boolean llamado con4g,
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
    /* Creas un par�metro que mete el usuario (variablePrecio) y luego
     * una variable local (variarPrecio) que realmente no se utiliza, ya
     * que su valor ya lo ha indicado el usuario en variablePrecio.
     * Con el par�metro solo ya estar�a.
     */
    public void alternaTiene4g() {
    if (tiene4g == true){
        tiene4g = false ;
    }
    else {
        tiene4g = true ;
    }
    }
    /* Esto funciona y est� correcto, pero hay una forma m�s sencilla
     * usando ! que indica el valor opuesto (!tiene4g ser�a el valor
     * opuesto al que tiene tiene4g)
     */
    public String devolverDetalles(String devuelveDetalles) {
        devuelveDetalles = "Propietario: "+ modeloMovil +" Precio: "+ precioMovil +" Tiene 4G: "+ tiene4g;
        return devuelveDetalles;
    }
    /* El m�todo funcionar�a, pero te pide que metas antes un valor, lo cual no es necesario.
     * En este m�todo el ejercicio pide que se devuelva un valor, que ser�a el string
     * "Propietario: "+ modeloMovil +" Precio: "+ precioMovil +" Tiene 4G: "+ tiene4g
     * No es necesario crear una variable para ello, con poner esa l�nea con return delante vale.
     * Adem�s, no est�s creando una variable, cuando metes un tipo de dato y un nombre entre par�ntesis en
     * la cabecera, lo que indicas es un valor que va a meter el usuario (en este caso no es necesario).
     * 
     */
    public void imprimirDetalles() {
        System.out.println("Propietario: "+ modeloMovil +" Precio: "+ precioMovil +" Tiene 4G: "+ tiene4g);
    }
    //Varios m�todos y el constructor tienen mal indentado su interior
}