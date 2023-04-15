package entidadFinanciera;

    /**
     * Clase que permite su uso como cuenta de un banco
     * @author Jose Manuel Calles
     * @version 1.1 Se añade JavaDoc
     */
public class CCuenta {
    
    /**
     *  Nombre del titular de la cuenta, en tipo String
     */
    private String nombre;
    
    /**
     *  Número de cuenta, en tipo String
     */
    private String cuenta;
    
    /**
     *  Saldo de la cuenta, en tipo Double
     */
    private double saldo;
    
    /**
     *  Porcentaje de interés aplicado en la cuenta, en tipo Double
     */
    private double tipoInterés;
    
    /**
     *  Mensaje de error para ingresos negativos, en tipo String
     */
    private final String ERRORCANTIDADNEGATIVA="No se puede ingresar una cantidad negativa";
    
    /**
     *  Constructor por defecto
     */
    public CCuenta(){}

    /**
     *  Constructor con todos los atributos necesarios para operar con una cuenta
     * @param nom : Nombre de la persona de la cuenta
     * @param cue : Número de cuenta
     * @param sal : Saldo de la cuenta
     * @param tipo : Porcentaje de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    /**
     *  Getter de saldo
     * @return Saldo de la cuenta
     */
    public double estado(){
        return this.saldo;
    }

    /**
     *  Getter de nombre
     * @return Nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *  Getter del número de cuenta
     * @return Número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     *  Getter del tipo de interés
     * @return Porcentaje de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *  Getter del error de ingreso negativo
     * @return String con el error de ingreso negativo
     */
    public String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }

    /**
     *  Setter de nombre del titular de la cuenta
     * @param nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *  Setter del número de cuenta
     * @param cuenta Setter del número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *  Setter de saldo
     * @param saldo Setter de saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *  Setter del porcentaje de interés de la cuenta
     * @param tipoInterés Setter del porcentaje de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     *  Método para ingresar dinero en la cuenta bancaria. Devuelve una excepción si se hace un ingreso negativo
     * @param cantidad a ingresar
     * @throws Exception Devuelve una excepción si se hace un ingreso negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        saldo = saldo + cantidad;
    }

    /**
     *  Método para retirar dinero de la cuenta bancaria. Devuelve una excepción si se hace un ingreso negativo o no hay suficiente saldo en la cuenta
     * @param cantidad a ingresar
     * @throws Exception Devuelve una excepción si se hace un ingreso negativo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception (ERRORCANTIDADNEGATIVA);
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}


    
   