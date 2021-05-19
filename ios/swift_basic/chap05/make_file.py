import os

# 파일 생성
for i in range(4, 5):
    for j in range(11, 28):
        f = open(str(i) + "-" + str(j) + "_.swift", "w")
        f.write("// 코드 ")
        f.write(str(i) + "-" + str(j))
        f.write("\n")
f.close()
