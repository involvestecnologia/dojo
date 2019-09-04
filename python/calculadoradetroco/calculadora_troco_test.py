import unittest
from calculadora_troco import calcula_troco

class TesteTroco(unittest.TestCase):

    def setUp(self):
        pass

    def testa_0_1_para_2_reais(self):
        self.assertEquals(calcula_troco(valor_entregue=2, custo_produto=1.99), [0.01])

    def testa_50_para_100_reais(self):
        self.assertEquals(calcula_troco(valor_entregue=100, custo_produto=50), [50])

    def testa_25_reais_para_100_reais(self):
        self.assertEquals(calcula_troco(valor_entregue=100, custo_produto=75), [10, 10, 5])

    def testa_87_32_para_100_reais(self):
        self.assertEquals(calcula_troco(valor_entregue=100, custo_produto=12.68), [50, 10, 10, 10, 5, 1, 1, .10, .10, .10, .01, .01])

if __name__ == '__main__':
    unittest.main()
