#teste_crivo.py
#testar o programa crivo.py
import unittest
from crivo import *

class teste_crivo(unittest.TestCase):
    def test_calc(self):
        res = crivo.calc(10)
        self.assertEqual(res, [2,3,5,7])
    def test_coluna(self):
        res = crivo.calc(10)
        col = crivo.coluna(res)
        self.assertEqual(col, "2\n3\n5\n7\n")
    def test_tabela(self):
        res = crivo.calc(10)
        tab = crivo.tabela(res, 3)
        self.assertEqual(tab, "     2     3     5\n     7\n")
    def test_inv(self):
        res = crivo.inv(10)
        self.assertEqual(res, [0,1,4,6,8,9,10])

if __name__ == '__main__':
    unittest.main()
