
x = int(input()[17:])

og_x = x

factors = []

i = 2
while i ** 2 <= x:
    while x % i == 0:
        if (len(factors) > 2) or (i in factors and i * factors[0] != x):
            print(f"Bartholomew, {og_x} is NOT a prime-once-removed")
            quit()
        factors.append(i)
        x //= i
    i += 1

print(f"Bartholomew, {og_x} is a prime-once-removed")