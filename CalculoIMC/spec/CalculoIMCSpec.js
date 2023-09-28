describe("Calculo de IMC", function () {

  it("IMC Obesidade II", function () {
    expect("Obesidade II").toEqual(new CalculoIMC(140, 178).calcularIMC());
  });

  it("IMC Obesidade I", function () {
    expect("Obesidade I").toEqual(new CalculoIMC(92, 172).calcularIMC());
  });

  it("IMC Acima do peso", function () {
    expect("Acima do peso").toEqual(new CalculoIMC(83, 170).calcularIMC());
  });

  it("IMC Peso normal", function () {
    expect("Peso normal").toEqual(new CalculoIMC(67, 171).calcularIMC());
  });

  it("IMC Abaixo do peso", function () {
    expect("Abaixo do peso").toEqual(new CalculoIMC(50, 169).calcularIMC());
  });

  it("IMC Muito abaixo do peso", function () {
    expect("Muito abaixo do peso").toEqual(new CalculoIMC(30, 169).calcularIMC());
  });

});