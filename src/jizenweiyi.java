public class jizenweiyi {
    public static void main(String[] args) {
        int arr[][]={{1,2,3}
                ,{4,5,6}
                ,{7,8,9}};
        aprint(arr);
        mover(arr,-1);
        aprint(arr);
    }
    //woshitiancainishuoneng
    private static void mover(int arr[][],int m) {
        if (m<0){
            throw new RuntimeException("不能为负数woshi");
        }
        for (int i=0;i<3;i++){
            for (int j=2;j>=m;j--){
                arr[i][j]=arr[i][j-m];
            }
            System.out.println();
        }
        if (m==1){
            for (int i=0;i<3;i++){
                arr[i][0]=0;
            }
        }
        else if (m==2){
            for (int i=0;i<3;i++){
                arr[i][1]=0;
            }
        }
        else if (m==3){
            for (int i=0;i<3;i++){
                arr[i][1]=0;
                arr[i][2]=0;
            }
        }
        else if (m>=4){
            for (int i=0;i<3;i++){
                arr[i][0]=0;
                arr[i][1]=0;
                arr[i][2]=0;
            }
        }

    }
    private static void aprint(int arr[][]) {
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
