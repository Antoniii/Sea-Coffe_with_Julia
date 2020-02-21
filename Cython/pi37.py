from time import time

def calculate_pi(n_terms: int) -> float:
	#numerator: float = 4.0
	denominator: float = 1.0
	operation: float = 1.0
	pi: float = 0.0
	for _ in range(n_terms):
		pi += operation * (1.0 / denominator)
		denominator += 2.0
		operation *= -1.0
	return pi*4.0

if __name__ == "__main__":
	start = time()
	print(calculate_pi(1000000000))
	print("Time {} s".format(float(round((time()-start)))))