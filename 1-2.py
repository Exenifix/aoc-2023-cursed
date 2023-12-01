s = 0

all_digits = "one two three four five six seven eight nine".split()
digits_map = dict(zip(all_digits, "123456789"))


with open("res/1-1.txt") as f:
    for row in f:
        for k, v in digits_map.items():
            row = row.replace(k, k + v + k)

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
