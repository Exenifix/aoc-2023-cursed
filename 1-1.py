s = 0

with open("res/1-1.txt") as f:
    for row in f:
        for c in row:
            if c.isnumeric():
                d = c
                break

        for c in reversed(row):
            if c.isnumeric():
                d += c
                break

        s += int(d)


print(s)
