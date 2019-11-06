import unittest
from mapa import mapa

class TestMapa(unittest.TestCase):

		def test_a_eh_igual_a_1(self):
			self.assertEqual(mapa['a'], 1)
			self.assertEqual(mapa['b'], 2)
			self.assertEqual(mapa['c'], 3)
			self.assertEqual(mapa['d'], 4)
			self.assertEqual(mapa['z'], 26)
			self.assertEqual(mapa['A'], 27)
			self.assertEqual(mapa['B'], 28)
			self.assertEqual(mapa['C'], 29)
			self.assertEqual(mapa['D'], 30)
			self.assertEqual(mapa['Z'], 52)
		
if __name__ == '__main__':
    unittest.main()
