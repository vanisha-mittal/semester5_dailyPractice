// Last updated: 8/2/2025, 4:05:44 PM
int reverse(int x){
    long long int sign;
    if (x<0)
    sign=-1; 
    else 1;
    x=x*sign;
    long long int res = 0;
    while (x){
        res = res * 10 + x % 10;
        x /= 10;
    }
    res*=sign;
    if (res > pow(2,31) - 1 || res < -1*pow(2, 31))
    return 0;

    return res;

}