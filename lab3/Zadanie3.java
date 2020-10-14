public class Zadanie3 {
public static int zadanie(int m,int n,int k){
    int[][] matA = new int[m][n];
    int[][] matB = new int[n][k];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++){
            matA[i][j]=1;
            System.out.print(matA[i][j]+ " ");

        }
        System.out.println('\n');
    }
    System.out.println('\n');
    System.out.println('\n');
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<k;j++){
            matB[i][j]=3;
            System.out.print(matB[i][j]+ " ");

        }
        System.out.println('\n');
    }
    System.out.println('\n');
    System.out.println('\n');
    int[][] matC = new int[m][k];
    for(int i = 0; i < m; i++) {
        for (int j = 0; j < k; j++) {
            for (int l = 0; l < n; l++) {
                matC[i][j] += matA[i][l] * matB[l][j];
            }
        }
    }
    System.out.println('\n');
    System.out.println('\n');

    for(int i=0;i<m;i++)
    {
        for(int j=0;j<k;j++){
            System.out.print(matC[i][j]+ " ");
        }
        System.out.println('\n');

    }
    System.out.println('\n');
    System.out.println('\n');
    return 0;
}
}
