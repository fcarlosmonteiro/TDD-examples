const validatePassword = require('./validatePassword')

test("retorna falso para input de senha vazio", () => {
  expect(validatePassword("")).toBe(false)
})
test("retorna falso para senha sem número", () => {
  expect(validatePassword("aksjgkaasdf")).toBe(false)
})
test("retorna falso para senha sem letra", () => {
  expect(validatePassword("1251234563246")).toBe(false)
})
test("retorna TRUE para senha com número, letra, e com 8 ou mais caracteres", () => {
  expect(validatePassword("12512ajskdhgk")).toBe(true)
})
test("retorna FALSE para senha com número, letra, e menos de 8 caracteres", () => {
  expect(validatePassword("a1")).toBe(false)
})
test("retorna TRUE para senha com número, letras maiúsculas, e com 8 ou mais caracteres", () => {
  expect(validatePassword("12512ASDFA")).toBe(true)
})
test("retorna TRUE para senha com número, com letra maiúscula e minúscula, e com 8 ou mais caracteres", () => {
  expect(validatePassword("12512ASDasdfasd")).toBe(true)
})