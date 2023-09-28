class crivo:
    def calc(n):
        primos = [True] * (n+1)
        primos[0] = primos[1] = False
        p = 2
    
        while (p * p <= n):
            if primos[p] == True:
                for i in range(p * p, n+1, p):
                    primos[i] = False
            p += 1
    
        primos_encontrados = []
        for i in range(2, n+1):
            if primos[i]:
                primos_encontrados.append(i)
    
        return primos_encontrados

    def coluna(vetor):
        resultado = ""
        for s in vetor:
            resultado += str(s) + "\n"
        return resultado
    
    def tabela(vetor, coluna):
        resultado = ""
        linha = ""
        c = 0
        for s in vetor:
            linha += str(s).rjust(6)
            c += 1
            if (c >= coluna):
                resultado += linha + "\n"
                linha = ""
                c = 0
        if (len(linha) > 0):
            resultado += linha + "\n"
        return resultado

    def inv(n):
        return ""
