class CalculoIMC{
    constructor(kilos, altura){
        this._kilos = kilos;
        this._altura = altura;
    }

    calcularIMC() {
        this._altura = this._altura / 100;
        return this.verificarIMC(this._kilos / (this._altura * this._altura));
    }
    
    verificarIMC(imc) {
        if(imc < 10)
        {
            return "Cálculo incorreto de IMC";
        }

        if (imc >= 10 && imc < 17) {
            return "Muito abaixo do peso";
        } else if (imc >= 17 && imc <= 18.49) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.99) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.99) {
            return "Acima do peso";
        } else if (imc >= 30 && imc <= 34.99) {
            return "Obesidade I";
        } else {
            return "Obesidade II";
        }
    }
}