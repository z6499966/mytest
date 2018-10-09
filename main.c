#include <stdio.h>
#include <stdlib.h>

int main()
{

    float weight;
    float value;
    printf("输入你的体重！！\n");
    scanf("%f",&weight)
    value = 1700.0 * weight * 14.5833;
    printf("Your　weight　in　platinum　is　worth　$%.2f.\n",　value);
    printf("You　are　easily　worth　that!　If　platinum　prices　drop,\n");
    printf("eat　more　to　maintain　your　value.\n");
    return 0;
}
