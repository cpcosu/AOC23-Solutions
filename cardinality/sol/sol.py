def card(s):
    depth = 0
    index = 1
    num = 0
    while not (s[index] == '}' and depth == 0):
        if s[index] == '{':
            depth += 1
        elif s[index] == '}':
            depth -= 1
            if depth == 0:
                num += 1
        index += 1
    return num

if __name__ == "__main__":
    print(card(input()))