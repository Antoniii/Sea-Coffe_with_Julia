function pi(n)
	numerator = 4.0
	denominator = 1.0
	operation = 1.0
	pi = 0.0
	for i in 1:n
		pi += operation * (numerator / denominator)
		denominator += 2.0
		operation *= -1.0
	end
	return pi
end

println(@time pi(1000000000))