#include <stdio.h>
#include <time.h>
float calculate_pi(int n);

int main(){
    int n;

    printf("Input n>0: ");
    scanf("%d", &n);
    clock_t begin = clock();
    printf("Pi = %f\n", calculate_pi(n));
    clock_t end = clock();
    double time_spent = (double)(end - begin)/CLOCKS_PER_SEC;
    printf("\n%f seconds\n", time_spent);

    return 0;
}

float calculate_pi(int n){
    float numerator = 4.0;
    float denominator = 1.0;
    float operation = 1.0;
    float pi = 0.0;

    for (int i = 1; i <= n; ++i){
        pi += operation * (numerator / denominator);
        denominator += 2.0;
        operation *= -1.0;
    }

    return pi;
}
