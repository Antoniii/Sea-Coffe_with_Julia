function fibonnaci(n)
	t1 = 0
	t2 = 1
	nextTerm = 0
	for i in 1:n
		if i == 1
			nextTerm = t1
		elseif i == 2
			nextTerm = t2
		end
		nextTerm = t1 + t2
		t1 = t2
		t2 = nextTerm
	#println(nextTerm)
	end
	println(nextTerm)
end

fibonnaci(1500)
