#teste_crivo.py
#testar o programa crivo.py
import unittest
from crivo import *

class teste_crivo(unittest.TestCase):
    def test_calc(self):
        res = crivo.calc(10)
        self.assertEqual(res, [2,3,5,7])

if __name__ == '__main__':
    unittest.main()
