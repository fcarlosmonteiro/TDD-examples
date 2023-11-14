const express = require('express')
const cors = require('cors')

const app = express()

app.use(express.json())
app.use(cors())


const validatePassword = require('./validatePassword')

app.post('/users', (req, res) => {
  const { username, password } = req.body

  // Validar input Usuário
  // Validar input Senha
  // Salvar usuário em base de dados

  const validPassword = validatePassword(password)

  if (validPassword) {
    res.send({message: "Usuário Válido"})
  } else {
    res.send({error: "Senha inválida!"})
  }
})


app.listen(8080, () => console.log("listening on port 8080"))