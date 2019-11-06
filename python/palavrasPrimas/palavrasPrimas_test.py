import unittest
from palavrasPrimas import eh_palavra_prima

class TestPalavrasPrimas(unittest.TestCase):

    def test_ba_eh_prima(self):
        self.assertTrue(eh_palavra_prima("ba"))
        self.assertTrue(eh_palavra_prima("Queijo"))
    
    def test_bb_nao_eh_primo(self):
        self.assertFalse(eh_palavra_prima("bb"))
        self.assertFalse(eh_palavra_prima("BA"))
        self.assertFalse(eh_palavra_prima("BB"))
        self.assertFalse(eh_palavra_prima("QueIjO"))

if __name__ == '__main__':
    unittest.main()
