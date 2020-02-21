from pi37 import *

start = time()
print(calculate_pi(1000000000))
print("Time {} s".format(float(round((time()-start)))))