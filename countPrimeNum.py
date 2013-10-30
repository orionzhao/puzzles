import sys

def isPrime(num):
    if num < 2:
        return False
    if num == 2:
        return True
    if num % 2 == 0:
        return False
    for x in range(3, int(num**0.5)+1,2):
        if num % x == 0:
            return False
    return True

def  getNumberOfPrimes(n):
    count = 0
    for a in range(1, n - 1): 
        if isPrime(a):
            count = count + 1
    print count
    return count

getNumberOfPrimes(long(sys.argv[1]))
