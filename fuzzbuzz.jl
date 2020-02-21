function fuzzbuzz(N) for i in 1:N if (i % 3 == 0) && (i % 5 == 0) println("FuzzBuzz ", i) elseif (i % 3 == 0) println("Fuzz ", i) elseif (i % 5 == 0) println("Buzz ", i) end end end

fuzzbuzz(53)