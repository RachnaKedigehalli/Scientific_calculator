import math

def sqroot(x):
    if x>= 0:
        return math.sqrt(x)
    

def factorial(x):
    fact = 1
    while(x):
        fact *= x
        x -= 1
    return fact

def logarithm(x):
    return math.log(x)

def power(x, b):
    return math.pow(x, b)