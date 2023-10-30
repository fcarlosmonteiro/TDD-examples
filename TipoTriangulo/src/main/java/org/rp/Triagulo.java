package org.rp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Triagulo {

    private final Double ladoA;

    private final Double ladoB;

    private final Double ladoC;

    public TipoTriangulo getClassificacao(){

        if (this.ladoA + this.ladoB <= this.ladoC ||
                this.ladoA + this.ladoC <= this.ladoB ||
                this.ladoB + this.ladoC <= this.ladoA){
            throw new RuntimeException("Não é um triangulo");
        }

        if (this.ladoA.equals(this.ladoB) && this.ladoB.equals(this.ladoC)){
            return TipoTriangulo.EQUILATERO;
        }if (!this.ladoA.equals(this.ladoB) && !this.ladoA.equals(this.ladoC) && !this.ladoB.equals(this.ladoC)){
            return TipoTriangulo.ESCALENO;
        }

        return TipoTriangulo.ISOCELES;
    }

}
