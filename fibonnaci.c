#include <stdio.h>

long int fibonnaci(int n);

int main(){
    int n;

    printf("Input n: "); // n_max = 49
    scanf("%d", &n);

    printf("Fibonnaci_n = %ld\n", fibonnaci(n));

    return 0;
}

long int fibonnaci(int n){
    int i, t1 = 0, t2 = 1, nextTerm = 0;

    for(i = 1; i <= n; ++i){
        if (i == 1){
            nextTerm = t1;
            continue;
        }
        if (i == 2){
            nextTerm = t2;
            continue;
        }
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
        //printf("%d\n", nextTerm);
    }

    return nextTerm;
}
