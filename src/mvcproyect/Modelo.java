package mvcproyect;

public class Modelo {
    private int op1; // Operando 1
    private int op2; // Operando 2
    private int res; // Resultado

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int getTxtRes() {
        return res;
    }

    public void setTxtRes(int txtRes) {
        this.res = txtRes;
    }

    // Método funcional para ejecutar la operación multiplicar
    public int multiplicar(int num1, int num2) {
        this.res = num1 * num2; // Usar los parámetros num1 y num2
        return this.res;
    }
}
