public class ViewerStatistics extends Viewer {
    public void averageAge(String[] nickName, int[] age) {

        if (age == null) {
            System.out.println("(averageAge error) age == null");
            return;
        }
        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                System.out.println("(averageAge error) age element " + i + "=" + age[i]);
                return;
            }
        }


        int sum = 0;
        for (int a : age) {
            sum += a;
        }
        double averageAges = sum / nickName.length;
    }
}
