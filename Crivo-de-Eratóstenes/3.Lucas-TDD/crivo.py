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
        return ""
