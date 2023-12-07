from math import sqrt, ceil, floor, prod;import re;print(prod(ceil((t+(D:=sqrt(t**2-4*s)))/2-1)-floor((t-D)/2+1)+1 for t,s in zip(*[[int(i)for i in re.findall(r"\d+",line.replace(" ", ""))]for line in open("res/6.txt")])))
# no part 1 cause it's almost the same i'm lazy
