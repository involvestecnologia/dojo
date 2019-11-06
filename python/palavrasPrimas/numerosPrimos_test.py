import unittest
from numerosPrimos import eh_numero_primo

class TestNumerosPrimos(unittest.TestCase):

		def testa_numero_primo(self):
			self.assertTrue(eh_numero_primo(2))
			self.assertTrue(eh_numero_primo(3))
			self.assertTrue(eh_numero_primo(5))
			self.assertTrue(eh_numero_primo(431))

		def testa_se_numero_nao_eh_primo(self):
			self.assertFalse(eh_numero_primo(4))
			self.assertFalse(eh_numero_primo(9))
			self.assertFalse(eh_numero_primo(15))
			self.assertFalse(eh_numero_primo(20))

if __name__ == '__main__':
    unittest.main()
