package cuentas;

/**
 * classe única d'aquest fitxer java. La classe conté tots els atributs i mètodes d'un compte corrent
 */
public class CCuenta {


    /**
     * a aquesta variable se registra el nom del titular del compte
     */
    private String nombre;
    /**
     * aquí s'hi registra el número de comptes
     */
    private String cuenta;
    /**
     * el saldo del compte , en format que accepta decimals
     */
    private double saldo;
    /**
     * variable que enregistra el tipus d'interès amb dos decimals
     */
    private double tipoInterés;

    /**
     * constructor de CCuenta sense paràmetres
     */
    public CCuenta()
    {
    }

    /**
     * constructor amb paràmetres dels objectes tipus CCuenta, amb els següents paràmetres:
     * @param nom    el nom que li volguem donar al titular del compte
     * @param cue     el número de compte corrent
     * @param sal    el saldo del compte en el moment de la creació de l'objecte
     * @param tipo    el tipus d'interès que té el compte corrent
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * mètode què ens dóna com a resultat l'estat del compte corrent
     * @return  ens dóna el saldo del compte corrent
     * */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * mètode per fer una operació d'ingrés al compte corrent
     * @param cantidad  és la quantia que ingressam al compte corrent
     * @throws Exception  llança excepció quan intentam introduir una quantita negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * mètode per treure doblers del compte corrent
     * @param cantidad  és la quantia que s'extreu del compte corrent
     * @throws Exception  llançarà excepció quan se vulgui treure quantitat negativa o quan no hi hhagi saldo al compte
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * getter de nombre
     * @return  el resultat del mètode és el nom del titular del compte
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter de nombre
     * @param nombre el paràmetre d'entrada és el nom del titular del compte
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter de la variable cuenta
     * @return el resultat del mètode és el número de compte corrent
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * setter de la variable cuenta
     * @param cuenta  li donam com a paràmetre d'entrada el número de compte corrent.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * getter de saldo
     * @return el paràmetre de sortida és el saldo disponible al  compte corrent
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * setter de saldo
     * @param saldo   el parèmtre d'entrada és el saldo del compte corrent
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * getter del tipus d'interès
     * @return  el resultat del mètode és el tipus d'interès amb decimals
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * setter del tipus d'interès
     * @param tipoInterés el paràmetre d'entrada és el tipus d'interés a modificar amb decimals
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
