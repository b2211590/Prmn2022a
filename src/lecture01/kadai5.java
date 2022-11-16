package lecture01;

public class kadai5 {
    public static void main(String[] args) {

        int[] score = {41,85,72,38,80};
        Sanjutu keisann = new Sanjutu();

        for (int i = 0; i < score.length; i++) {
            if(score[i] < 60){
                System.out.println(i + "番 " + score[i] + "点 " + "不可");
            }else if (score[i] < 70) {
                System.out.println(i + "番 " + score[i] + "点 " + "可");
            }else if (score[i] < 80) {
                System.out.println(i + "番 " + score[i] + "点 " + "良");
            }else if (score[i] < 90) {
                System.out.println(i + "番 " + score[i] + "点 " + "優");
            }else{
                System.out.println(i + "番 " + score[i] + "点 " + "秀");
            }
        }
        System.out.println("最高点:" + keisann.max(score) + "点");
        System.out.println("最低点:" + keisann.min(score) + "点");
        System.out.println("平均点:" + keisann.average(score) + "点");
    }
}


class Sanjutu {
    int min(int[] score){
        int m = score[0];
        for (int i = 0; i < score.length; i++) {
            if(m > score[i]){
                m = score[i];
            }
        }
        return m;
    }

    int max(int[] score){
        int M = score[0];
        for (int i = 0; i < score.length; i++) {
            if(M < score[i]){
                M = score[i];
            }
        }
        return M;
    }

    double average(int[] score) {
        int sum = 0;
        double ave;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        ave = (double) sum / score.length;
        return ave;
    }
}
