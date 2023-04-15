package entidadFinanciera;

/**
 * Clase principal del programa de la Entidad Financiera
 * @author Jose Manuel Calles
 * @version 1.3 Versión final en la que se añade JavaDoc
 * @since 1.2 Se añade comprobación de cantidad esperada en los métodos probarRetirar y probarIngresar
 * @since 1.1 Se revisan los métodos probarRetirar y probarIngresar
 * @since 1.0 se prueba funcionamiento de Git
 */

public class Main {
/**
 * Constructor predeterminado del método main
 * @param args Sin parámetros
 */
    public static void main(String[] args) {

        //Declaramos un nuevo objeto de la clase CCuenta
        CCuenta objetoCuenta;
        
        //Declaramos una variable tipo Double con para el saldo de cuenta
        double saldoActual;
        
         //Instanciamos el objeto de la clase CCuenta que declaramos antes pasándole unos valores de ejemplo
        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        //Llamamos al método probarIngresar y le pasamos unos valores de ejemplo
        try{
            probarIngresar(objetoCuenta, 200,2700);
        }catch (Exception e){}
        
        //Llamamos al método probarRetirar y le pasamos unos valores de ejemplo
        try{
            probarRetirar(objetoCuenta, 300,2400);
        }catch (Exception r){}
        
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }
    
    /**
     * Método que prueba el método ingresar de la clase CCuenta y comprueba que la cantidad ingresada es correcta.
     * 
     * @param c Objeto de la clase CCuenta
     * @param cantidad Cantidad a ingresar en la cuenta
     * @param cantidadEsperada Cantidad esperada después del ingreso
     * @throws Exception si la cantidad después del ingreso no coincide con la cantidad esperada lanza excepción que será recogida desde main
     */
    public static void probarIngresar(CCuenta c, int cantidad, double cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        if (c.estado()!=cantidadEsperada){
            throw new Exception ("Ha habido un problema al realizar el ingreso, las cantidades no coinciden");
        }else{System.out.println("Ingreso de "+cantidad+" realizado correctamente");}
    }
    
    /**
     * Método que prueba el método retirar de la clase CCuenta y comprueba que la cantidad retirada es correcta.
     * 
     * @param c Objeto de la clase CCuenta
     * @param cantidad Cantidad a retirar en la cuenta
     * @param cantidadEsperada Cantidad esperada después de la retirada
     * @throws Exception Si varía la cantidad después de la retirada con respecto a la cantidad esperada, lanza excepción que será recogida desde main
     */
    public static void probarRetirar(CCuenta c, int cantidad, double cantidadEsperada) throws Exception{
        c.retirar(cantidad);
        if (c.estado()!=cantidadEsperada){
            throw new Exception ("Ha habido un problema al realizar la retirada, las cantidades no coinciden");
            }else{System.out.println("Retirada de "+cantidad+" realizado correctamente");}
    }
}
