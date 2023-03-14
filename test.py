import unittest
from functions import *

class TestSqRoot(unittest.TestCase):
    def test(self):
        self.assertEqual(sqroot(0), 0)
        self.assertEqual(sqroot(1), 1)
        self.assertEqual(sqroot(16), 4)

if __name__ == '__main__':
    unittest.main()