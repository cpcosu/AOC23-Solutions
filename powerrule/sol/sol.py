def deriveMonomial(monomial):
    index = 0
    coefficientString = ""
    while index < len(monomial) and "0" <= monomial[index] <= "9":
        coefficientString += monomial[index]
        index += 1
    
    coefficient = 1 if coefficientString == "" else int(coefficientString)

    if index >= len(monomial): # no x
        return str(0)

    if index + 1 >= len(monomial): # x to the first power
        return str(coefficient)

    # otherwise, we know we have a power >= 2, so get it.
    power = int(monomial[-1])

    newCoefficient = coefficient * power
    newPower = power - 1

    newCoefficientString = "" if newCoefficient == 1 else str(newCoefficient)

    if newPower == 1:
        return f"{newCoefficientString}x"
    else:
        return f"{newCoefficientString}x^{newPower}"

def derive(polyString):
    derivedTerms = list(map(deriveMonomial, polyString.split(" + ")))
    if len(derivedTerms) == 1:
        return derivedTerms[0]
    else:
        return " + ".join(filter(lambda x: x != "0", derivedTerms))

res = input()
for _ in range(int(input())):
    res = derive(res)

print(res)