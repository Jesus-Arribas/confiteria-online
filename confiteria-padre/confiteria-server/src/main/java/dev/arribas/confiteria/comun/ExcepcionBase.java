package dev.arribas.confiteria.comun;

public class ExcepcionBase extends Exception {
    private final int codigo;
    private final String origen;

    public ExcepcionBase(int codigo, String mensaje) {
        super(mensaje);
        this.codigo = codigo;
        this.origen = null;
    }

    public ExcepcionBase(int codigo, String mensaje, String origen) {
        super(mensaje);
        this.codigo = codigo;
        this.origen = origen;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getOrigen() {
        return origen;
    }
}