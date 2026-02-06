import os
filename = "data.txt"
dubble = []
celso = []
with open(filename) as f:
  skibididata = f.read().split() ##hell yeah numbers and crap
  for i in skibididata:
    dubble.append(float(i))
    celso.append((int(100 * ((5 * (dubble[i] - 32)) / 9.0))) / 100) ## cough cough why

os.remove("main.py") ## happy now?
  
