function factorial(n)
	fact = 1
	for i in 1:n
		fact *= i
	end
	return fact 
end

println(@time factorial(49))